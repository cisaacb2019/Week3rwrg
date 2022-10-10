package com.cb.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cb.newsapp.databinding.ActivityMainBinding
import com.cb.newsapp.databinding.ArticleViewBinding

class MainActivity : AppCompatActivity() {
    //Private var for view binding
    private lateinit var binding: ActivityMainBinding
    //you could move the sourcedummyvalues to a class for cleaner code//

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)


        val newsService = NewsService()
        val articles = newsService.returnArticles()


        articles.forEach {
            ArticleViewBinding.inflate(layoutInflater, binding.articleContainer, true).apply {

                articleName.text = it.title
                articleAuthor.text = it.author
                articleDescription.text = it.description
            }
        }
        


    }
}