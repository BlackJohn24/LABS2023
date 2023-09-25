package com.zetcode

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun main() {
    var zapros = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
            "\t<soap:Body>\n" +
            "\t\t<m:GetWeight xmlns:m=\"urn:Controller_SRVIntf-IController_SRV\"\n" +
            "\t\t\t\txmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\"\n" +
            "\t\t\t\txmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"\n" +
            "\t\t\t\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
            "\t\t\t\tsoap:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n" +
            "\t\t\t<AdrTerm xsi:type=\"xsd:unsignedByte\">1</AdrTerm>\n" +
            "\t\t\t<ChannelN xsi:type=\"xsd:unsignedByte\">5</ChannelN>\n" +
            "\t\t</m:GetWeight>\n" +
            "\t</soap:Body>\n" +
            "</soap:Envelope>"
    val client = HttpClient.newBuilder().build();
    val request = HttpRequest.newBuilder()
        .uri(URI.create("http://192.168.0.106:8080/soap/IController_SRV"))
        .build()

    val response = client.send(request, HttpResponse.BodyHandlers.ofString())
    println(response.body())
}
