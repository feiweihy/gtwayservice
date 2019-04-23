package com.hqk.gtwayservice.resolver;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.InetAddress;

@Component
public class IpResolver  implements KeyResolver{


    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {

        String ip=exchange.getRequest().getRemoteAddress().getAddress().getHostAddress();

        // exchange.getRequest().getURI().toString()  //获取请求地址
        //可以对 ip 地址 等进行过滤

        System.out.println("ip:"+ip);

        return Mono.just(ip);
    }


}
