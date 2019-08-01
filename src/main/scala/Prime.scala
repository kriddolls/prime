import scala.math
import scala.language.postfixOps

object Prime {
  def prime(num: Int) = num > 1 && (2 to (math.sqrt(num) toInt)).forall ( num % _ != 0)    
  def findNextPrime(n: Int) : Int = {
		def iterate(m: Int) : Int ={
					if(prime(m)) m
					else iterate(m +1)
		}
		iterate(n)
  }	
  def nth(n: Int): Int = {
		var i = 1
		var x = 1
		while( i <= n){ x = findNextPrime(x+1);
						  i = i + 1}
		x
  }
}
