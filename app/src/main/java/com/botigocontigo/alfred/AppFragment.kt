package com.botigocontigo.alfred

import android.support.v4.app.Fragment

class AppFragments : Fragment() {
    object FRAGMENTS {
        operator fun get(position: Int): Fragment {
            return when(position) {
                //TODO replace each with its Fragment class
                0 -> InterviewFragment()
                1 -> TODO_FRAGMENT_SUGGESTIONS
                2 -> TODO_FRAGMENT_TASKS
                3 -> TODO_FRAGMENT_LEARN
                4 -> TODO_FRAGMENT_AREAS
                5 -> TODO_FRAGMENT_FODA
                6 -> TODO_FRAGMENT_RISKS
                else -> TODO_FRAGMENT_TASKS
            }
        }

    }

}