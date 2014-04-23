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
sleep(300)

timer()
sleep 300
timer()

println()


timer = stimer()
timer()
sleep 300
timer()

//example3


def list = []
def printList = { list.each { println it} println()}


list.add "One"
list << "Two"
printList()


list[0] = "Uno"
printList()

list.add(2, "Three")
printList()

list -= "Two"
printList()

list.add(1, "Two")
printList()

println(list[-3])
println()