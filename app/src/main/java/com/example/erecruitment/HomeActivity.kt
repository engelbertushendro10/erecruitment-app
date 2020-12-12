package com.example.erecruitment
import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.erecruitment.fragments.HomeFragment
import com.example.erecruitment.fragments.ProfileFragment
import com.example.erecruitment.fragments.SearchFragment
import com.example.erecruitment.model.LanguageItem
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity(){

    private val homeFragment = HomeFragment()
    private val searchFragment = SearchFragment()
    private val profileFragment = ProfileFragment()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        //replaceFragment(homeFragment)

       val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.ic_home ->home()
                R.id.ic_search ->search()
                R.id.ic_profile ->profile()
            }
            true
        }

    }

    fun profile(){
        val a = Intent(this, ProfileActivity::class.java)
        startActivity(a)
    }
    fun home (){
        val a = Intent(this, HomeActivity::class.java)
        startActivity(a)
    }
    fun search (){
        val a = Intent(this, SearchActivity::class.java)
        startActivity(a)
    }
//    private fun replaceFragment(fragment: Fragment){
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.fragment_container, fragment)
//            .addToBackStack(null)
//        transaction.commit()
//    }

//    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//        val items: LanguageItem = arrayList!![position]
//        Toast.makeText(applicationContext,items.profile, Toast.LENGTH_LONG).show()
//    }
}
















