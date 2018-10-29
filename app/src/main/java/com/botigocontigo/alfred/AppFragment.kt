package com.botigocontigo.alfred

import android.support.v4.app.Fragment
import com.botigocontigo.alfred.foda.FodaFragment
import com.botigocontigo.alfred.areas.AreasFragment
import com.botigocontigo.alfred.tasks.TasksFragment

class AppFragments : Fragment(){
    object FRAGMENTS {
        operator fun get(position: Int): Fragment {
            return when(position) {
                //TODO replace each with its Fragment class
                0 -> InterviewFragment()
//                1 -> TODO_FRAGMENT_SUGGESTIONS
                2 -> TasksFragment()
//                3 -> TODO_FRAGMENT_LEARN
                4 -> AreasFragment()
                5 -> FodaFragment()
//                6 -> TODO_FRAGMENT_RISKS
                else -> InterviewFragment()
            }
        }

    }

}
