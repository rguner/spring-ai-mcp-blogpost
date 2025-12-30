package org.springframework.ai.mcp.sample.server.tools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springaicommunity.mcp.annotation.McpTool;
import org.springframework.stereotype.Component;

@Component
public class VegaTools {

    private static  final Logger log = LoggerFactory.getLogger(VegaTools.class);

    @McpTool(name="vega-latest-videos", description ="I will return Dan Vega's last 3 videos")
    public String getLatestVideos(){

        var videos = """
                - ** Build AI's Future: Model Context Protocol (MCP) with Spring AI in Minutes
                
                    https://www.youtube.com/watch?v=MarSC2dFA9g
                
                - ** Learn how to build an MCP Server in Java
                
                    https://www.youtube.com/watch?v=Y_Rk6QgWUbE
                
                - ** How to Secure your MCP Servers with Spring Security\s
                
                    https://www.youtube.com/watch?v=Xiw4bMD3SOg
               
                """;

        return videos;

    }


}