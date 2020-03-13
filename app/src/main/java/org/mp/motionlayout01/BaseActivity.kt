package org.mp.motionlayout01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_base.*
import org.mp.motionlayout01.motion_fragments.motionfrag2
import org.mp.motionlayout01.motion_fragments.motionfrag3
import org.mp.motionlayout01.motion_fragments.motionfrag4
import org.mp.motionlayout01.motion_fragments.motionfrag1 as motionfrag1

class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

        motion01_btn.setOnClickListener {
            switchToFrag(motionfrag1())
        }

        motion02_btn.setOnClickListener {
            switchToFrag(motionfrag2())
        }

        motion03_btn.setOnClickListener {
            switchToFrag(motionfrag3())
        }

        motion03_btn.setOnClickListener {
            switchToFrag(motionfrag3())
        }

        motion04_btn.setOnClickListener {
            switchToFrag(motionfrag4())
        }


    }

    fun switchToFrag(x : Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.base_act, x).addToBackStack(null).commit()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        supportFragmentManager.popBackStack()
    }
}
