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

// example2

def stimer(){
    def initTime = new java.util.Date()

    return { println "${initTime} - ${new java.util.Date()}: Elapased Time ${System.currentTimeMillis() - initTime.time}" }
}

def timer = stimer()
sleep(3000)

timer()
sleep 3000
timer()

println()


timer = stimer()
timer()
sleep 3000
timer()

//example3

def list = []
