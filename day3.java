package com.masai;

public class Check {
	
	void Call(String a ) {
		if(a=="a"||a=="e"||a=="i"||a=="o"||a=="u"||a=="A"||a=="E"||a=="I"||a=="O"||a=="U") {
			System.out.println("character is vowel ");
		}else if(a!="a"||a!="e"||a!="i"||a!="o"||a!="u"||a!="A"||a!="E"||a!="I"||a!="O"||a!="U"){
			System.out.println("character is consonant ");
			
		}else if(a=="@"||a=="!"||a=="~"||a=="#"||a=="%"||a=="*"||a=="&"||a=="^"||a=="`"||a=="6") {
			System.out.println("error ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Check ch=new Check();
		ch.Call("c");
		ch.Call("A");
		ch.Call("@");
	}

}
