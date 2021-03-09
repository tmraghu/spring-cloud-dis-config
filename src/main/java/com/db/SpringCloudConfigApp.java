package com.db;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
