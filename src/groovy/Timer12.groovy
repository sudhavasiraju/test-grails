package com.test.groovy;
/**
 * Created by sudhakar.vasiraju on 4/17/14.
 */

class Timer {

    String name
    String ct

}

def temp = [ new Timer( name:"sudhakar", ct:"ATL" ),
             new Timer( name:"Mark", ct:"SFO" )]

temp.each { println "${it.name}  ${it.ct}" }
