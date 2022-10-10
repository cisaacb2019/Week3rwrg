package com.cb.newsapp

import com.cb.newsapp.databinding.ArticleViewBinding
 class NewsService ()
 {
     //here are some dummy values for an array pass do map of values soon//
     val dummyvalues = arrayListOf(
         Source(
             "cnn",
             "CNN",
             Category.BUSINESS,
             Language.EN,
             Country.US

         ),
         Source(
             "the_new_york_times",
             "TheNewYorkTimes",
             Category.BUSINESS,
             Language.EN,
             Country.US
         ),
         Source(
             "",
             "",
             Category.BUSINESS,
             Language.EN,
             Country.US
         ),
         Source(
             "market_watch",
             "Market Watch",
             Category.BUSINESS,
             Language.EN,
             Country.US
         ),
         Source(
             "Morning_Coffee",
             "Morning Coffee",
             Category.BUSINESS,
             Language.EN,
             Country.US
         ),

         )
     fun returnArticles(): ArrayList<Article> {
         return arrayListOf(
             Article(
                 dummyvalues[0],
                 "", "Breaking News...",
                 "descriptiondisplay", "url",
                 "imageurl", "publishedate",
                 "content"
             ),
             Article(
                 dummyvalues[1],
                 "", "Car_Crash",
                 "descriptiondisplay2", "url2",
                 "imageurl2", "publishedate2",
                 "content2"
             ),
             Article(
                 dummyvalues[2],
                 "Bill Smith", "Stocks To Buy",
                 "descriptiondisplay3", "url3",
                 "imageurl3", "publishedate3",
                 "content3"

                 ),
             Article(
                 dummyvalues[3],
                 "dave jones  ", "Politics",
                 "", "url4",
                 "imageurl4", "publishedate4",
                 "content4"
             ),
             Article(
                 dummyvalues[4],
                 "some one ", "art stolen",
                 "descriptiondisplay3", "url5",
                 "", "publishedate5",
                 "content5"
             ),
             Article(
                 dummyvalues[4],
                 "SCROLL TEST ", "HOPE IT WORKS",
                 "descriptiondisplay4", "url5",
                 "", "publishedate5",
                 "content5"
             ),
             Article(
                 dummyvalues[4],
                 "SCROLL TEST ", "HOPE IT WORKS",
                 "descriptiondisplay5", "url5",
                 "", "publishedate5",
                 "content5"
             ),
             Article(
                 dummyvalues[4],
                 "SCROLL TEST ", "HOPE IT WORKS",
                 "descriptiondisplay6", "url5",
                 "", "publishedate5",
                 "content5"
             ),
             Article(
                 dummyvalues[4],
                 "SCROLL TEST ", "HOPE IT WORKS",
                 "descriptiondisplay7", "url5",
                 "", "publishedate5",
                 "content5"

                 ),
             Article(
                 dummyvalues[4],
                 "SCROLL TEST ", "HOPE IT WORKS",
                 "descriptiondisplay8", "url5",
                 "", "publishedate5",
                 "content5"
             ),
             )
     }



 }
