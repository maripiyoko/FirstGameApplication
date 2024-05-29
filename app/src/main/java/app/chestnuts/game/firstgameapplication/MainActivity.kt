package app.chestnuts.game.firstgameapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.chestnuts.mobile.hello.mobile.EbitenView
import go.Seq

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Seq.setContext(applicationContext)
    }

    private fun getEbitenView(): EbitenView {
        return this.findViewById(R.id.ebitenview)
    }

    override fun onPause() {
        super.onPause()
        this.getEbitenView().suspendGame()
    }

    override fun onResume() {
        super.onResume()
        this.getEbitenView().resumeGame()
    }
}
