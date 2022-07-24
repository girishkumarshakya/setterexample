package core.example.kotlin

class Movie  {
    lateinit var name:String
    lateinit var director:String
    lateinit var stuntMaster:String
    lateinit var numberOfArtists:String
    lateinit var releaseDate:String

    override fun toString(): String {
        return "Movie(name='$name', director='$director', stuntMaster='$stuntMaster', numberOfArtists='$numberOfArtists', releaseDate='$releaseDate')"
    }
}
