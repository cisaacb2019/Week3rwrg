package com.cb.newsapp
//class for source data
data class Source (val id: String? = null, val name: String?,val category: Category, val language: Language, val country: Country)
enum class Category {
    BUSINESS, ENTERTAINMENT, GENERAL, HEALTH, SCIENCE, SPORTS, TECHNOLOGY,
}
enum class Language {
    AR,DE,EN,ES,FR,HE,IT,NL,NO,PR,RU,SV,UD,ZH,
}
enum class Country {
    AE,AR,AT,AU,BE,BG,BR,CA,CH,CN,CO,CU,CZ,DE,EG,FR,GB,GR,HK,HU,ID,IE,IL,IN,IT,JP,KR,LT,LV,MA,MX,MY,
    NG,NL,NO,NZ,PH,PL,PT,RO,RS,RU,SA,SE,SG,SI,SK,TH,TR,TW,UA,US,VE,ZA,
}