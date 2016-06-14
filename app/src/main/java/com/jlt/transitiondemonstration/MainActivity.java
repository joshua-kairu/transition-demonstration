package com.jlt.transitiondemonstration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Transition Demonstration
 *
 * Simple tutorial to show transitions in Android
 *
 * Copyright (C) 2016 Kairu Joshua Wambugu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */

// begin activity MainActivity
public class MainActivity extends AppCompatActivity {

    /** CONSTANTS */

    /** VARIABLES */

    /* Image Views */

    @InjectView( R.id.am_iv )
    ImageView imageView; // the image view

    /** METHODS */

    /** Getters and Setters */

    /**
     * Overrides
     */

    @Override
    // begin onCreate
    protected void onCreate( Bundle savedInstanceState ) {

        // 0. super things
        // 1. use the main activity layout
        // 2. inject views

        // 0. super things

        super.onCreate( savedInstanceState );

        // 1. use the main activity layout

        setContentView( R.layout.activity_main );

        // 2. inject views

        ButterKnife.inject( this );

    } // end onCreate

    /**
     * Other Methods
     */

    // begin method initializeUI
    private int initializeUI() {

        // 0. initialize the image view

        // 0. initialize the image view

//        imageView = ( ImageView ) findViewById( R. )

        return -1;

    } // end method initializeUI

    // begin method click
    // method to respond to clicking of the button
    // declared in activity_main
    public void click( View view ) {

        // 0. initialize the slide that will be used to transition
        // 1. slide should start from top
        // 2. get the content view group
        // 3. begin the transition
        // 4. finally make the image view invisible

        // 0. initialize the slide that will be used to transition

        Slide slide = new Slide();

        // 1. slide should start from top

        // set the edge from which the slid items should appear and disappear
        slide.setSlideEdge( Gravity.TOP );

        // 2. get the content view group

        ViewGroup root = ( ViewGroup ) findViewById( android.R.id.content );

        // 3. begin the transition

        TransitionManager.beginDelayedTransition( root, slide );

        // 4. finally make the image view invisible

        imageView.setVisibility( View.INVISIBLE );

    } // end method click

} // end activity MainActivity