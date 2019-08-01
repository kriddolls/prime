import Prime.nth
object Test{

def main(args: Array[String]){
	var a = 50
	println("The 50th Prime number is:" + nth(a))
	println("Successful = " + (nth(a)==229))
	}
}
