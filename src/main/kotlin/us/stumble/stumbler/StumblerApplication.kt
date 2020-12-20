package us.stumble.stumbler

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StumblerApplication

fun main(args: Array<String>) {
	runApplication<StumblerApplication>(*args)
}
