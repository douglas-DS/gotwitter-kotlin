package br.com.ds.gotwitterkotlin.endpoint.controller

import br.com.ds.gotwitterkotlin.model.Tweet
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("tweet")
class TweetController {

    @GetMapping
    fun greeting(): Tweet {
        return Tweet("1", "Douglas Souza", "Hello Kotlin", 10)
    }

}