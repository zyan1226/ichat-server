package cn.zyan1226.ichat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IchatServerApplication

fun main(args: Array<String>) {
    runApplication<IchatServerApplication>(*args)
}
