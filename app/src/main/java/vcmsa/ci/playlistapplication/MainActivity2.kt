package vcmsa.ci.playlistapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val songsList = findViewById<TextView>(R.id.songsList)
        val btnView = findViewById<Button>(R.id.btnView)
        val btnAverage = findViewById<Button>(R.id.btnAverage)
        val btnBack = findViewById<Button>(R.id.btnBack)

        //all songs shown with a loop
        btnView.setOnClickListener {
            if
        }
        (MainActivity.songs.is.empty())
        songsList.text = "No songs are added."
            val builder  =
                buildString()
        for ( i in MainActivity.songs.indicates)
            builder.append("song title: $ {MainActivity.songs[i]}\n")
        builder.append("Artists:$ {MainActivity.artists[i]}\n")
        builder.append("Rating: $ {MainActivity.ratings[i]}\n")
        builder.append("Comments: $ {MainActivity.comments[i]}\n")
        builder.append("--------------\n")

        //calcuttions to calculate the average
        songsList.text =builder.toString()

        btnAverage.setOnClickListener {
            val totalRatings = MainActivity.ratings.sum()
            val count =
                MainActivity.ratings.size
            val average = if (count > 0) total ratings.toDouble() / count
            else 0,0
             songsList.text = "Average Rating: %,2f". format(average)

            btnBack.setOnClickListener {
                finish()
            }
        }







        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnAverage)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}