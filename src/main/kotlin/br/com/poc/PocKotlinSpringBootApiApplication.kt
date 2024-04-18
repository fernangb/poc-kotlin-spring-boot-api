package br.com.poc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PocKotlinSpringBootApiApplication

fun main(args: Array<String>) {
	runApplication<PocKotlinSpringBootApiApplication>(*args)
}
