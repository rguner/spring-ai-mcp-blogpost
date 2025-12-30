package org.springframework.ai.mcp.sample.server.tools;

import org.springaicommunity.mcp.annotation.McpResource;
import org.springaicommunity.mcp.annotation.McpTool;
import org.springaicommunity.mcp.annotation.McpToolParam;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class CalculatorTools {

    private final Environment environment;

    public CalculatorTools(Environment environment) {
        this.environment = environment;
    }

    @McpTool(name = "add", description = "Add two numbers together")
    public int add(
            @McpToolParam(description = "First number", required = true) int a,
            @McpToolParam(description = "Second number", required = true) int b) {
        return a + b;
    }

    @McpResource(uri = "config://{key}", name = "Configuration")
    public String getConfig(String key) {
        return environment.getProperty(key);
    }
}