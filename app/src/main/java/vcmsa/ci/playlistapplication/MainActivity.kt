package vcmsa.ci.playlistapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val songs = ArrayList<String>()
    val artist = ArrayList<String>()
    val rating = ArrayList<Int>()
    val comments = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnExit = findViewById<Button>(R.id.btnExit)
        val btnNext = findViewById<Button>(R.id.btnNext)
        val songInput = findViewById<TextView>(R.id.songInput)
        val artistName = findViewById<TextView>(R.id.artistName)
        val ratingInput = findViewById<TextView>(R.id.ratingInput)
        val userComment = findViewById<TextView>(R.id.userComment)

        btnAdd.setOnClickListener {
            val song = songInput.text.toString()
            val artists = artistName.text.toString()
            val rating = ratingInput.text.toString()
            val comments = userComment.text.toString()

            if (song.isEmpty())
                artists.isEmpty()
            rating.isEmpty()
            Toast.makeText(this, "Please fill in the missing information", Toast.LENGTH_SHORT)
                .show()
            return@setOnClickListener

            val rating = ratingInput.text.toString().toIntOrNull()
            if (rating in 1..5)
                Toast.makeText(this, "Rating must be between 1 and 5", Toast.LENGTH_SHORT).show()
            return@setOnClickListener
        }


            songs.add(songInput.text.toString())

            artist.add(artistName.text.toString())

        comments.add(userComment.text.toString())

            Toast.makeText(this,"song added",Toast.LENGTH_SHORT).show()
         listOf(songInput,artistName,ratingInput,userComment).forEach {
             it.setText("")

             btnNext.setOnClickListener {
                 startActivity(Intent(this,MainActivity2::class.java))
             }

             btnExit.setOnClickListener {
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