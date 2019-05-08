package br.com.ds.gotwitterkotlin.model

//import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

//@Document("Tweet")
data class Tweet (val id: String,
                  val author: String,
                  val content: String,
                  var like: Int = 0,
                  val createdAt: Date = Date())