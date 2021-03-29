package tw.tcnr16.m1501

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import tw.tcnr16.m1501.SecondFragment.Companion.newInstance

class M1501 : AppCompatActivity() {
    private var sf: Fragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m1501)
        val ff = FirstFragment()
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
    }

    // Button元件的事件處理
    fun button_Click(v: View?) {
        // 取代成第2個片段
        sf = newInstance("改成第二個Fragment片段")
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, sf as SecondFragment)
            .commit()
    }

    fun button2_Click(v: View?) {
        // 刪除第2個片段
//       if (getSupportFragmentManager() !=null) {
        supportFragmentManager
            .beginTransaction()
            .remove(sf!!)
            .commit()
        //       }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.mainx,menu);
        return true;

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_settings->finish()
        }
        return super.onOptionsItemSelected(item)
    }

}