/**
 * Created by sudhakar.vasiraju on 4/17/14.
 */

//Ranges

def numRange = 2..<10
numRange.each {println it}
println "is 8 there ${numRange.contains(8)}"
println "3rd element is ${numRange[3]}"

println "char range"

('k'..'x').each {i->print i}

println()

