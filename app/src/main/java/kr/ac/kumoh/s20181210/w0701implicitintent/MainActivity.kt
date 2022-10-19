package kr.ac.kumoh.s20181210.w0701implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20181210.w0701implicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnHompage.setOnClickListener{
            val uri = Uri.parse("https://github.com/choijungwo?tab=repositories")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.btnMap.setOnClickListener{
            val uri = Uri.parse("geo:0,0?z=17&q= 경상북도 구미시 거양길 14-6")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.btnTel.setOnClickListener{
            val uri = Uri.parse("sms:01046632761")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            if(intent.resolveActivity(packageManager) != null)
                startActivity(intent)
        }
    }
}