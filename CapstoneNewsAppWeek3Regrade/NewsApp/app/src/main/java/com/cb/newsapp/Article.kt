package com.cb.newsapp
//data class for article values nulled types that could be empty based off of api documentation
data class Article (val source: Source,val author: String? = null, val title:String
                    ,val description:String? = null, val url:String
                    ,val imageUrl:String?=null, val publishedAt:String
                    ,val content:String )
