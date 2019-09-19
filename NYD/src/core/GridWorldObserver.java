package core;
/**
 * 
 * Copyright 2006 Paul A. Crook
 *
 *
 * This file is part of the Reinforcement Learning - Java Test Platform 
 * (RL-JTP).
 *
 * RL-JTP is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * RL-JTP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with RL-JTP; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA
 *
 **/


import java.util.*; // for observer and observable

/**
 *
 * GridWorldObserver
 * -----------------
 *
 * Abstract super class for all the grid world observes.
 *
 * Note: implemented using Model-View-Control design pattern.
 *
 * Paul A. Crook, 20th March 2003
 *
 **/

public abstract class GridWorldObserver implements Observer {

  //common register method - pass in model to register with
  public void register(Observable model) {
    model.addObserver(this);
  }
  
}




