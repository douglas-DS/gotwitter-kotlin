package br.com.ds.gotwitterkotlin.repository

import br.com.ds.gotwitterkotlin.model.Tweet
import org.springframework.data.repository.CrudRepository

interface TweetRepository: CrudRepository<Tweet, String>
