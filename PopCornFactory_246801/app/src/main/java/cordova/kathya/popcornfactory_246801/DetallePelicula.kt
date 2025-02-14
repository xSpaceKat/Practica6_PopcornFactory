package cordova.kathya.popcornfactory_246801

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalle_pelicula)

        val ivImagenPelicula = findViewById<ImageView>(R.id.iv_imagenPelicula)
        val tvNombrePelicula = findViewById<TextView>(R.id.tv_nombrePelicula)
        val tvDescripcionPelicula = findViewById<TextView>(R.id.tv_descripcionPelicula)

        val bundle = intent.extras

        if (bundle != null) {
            ivImagenPelicula.setImageResource(bundle.getInt("header"))
            tvNombrePelicula.text = bundle.getString("nombre")
            tvDescripcionPelicula.text = bundle.getString("sinopsis")
        }

    }
}