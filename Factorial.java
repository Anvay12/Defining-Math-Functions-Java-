//Factorial
	static int Factorial(int x) {
		int ans = 1;
		if(x==1||x==0) {
			ans=1;
		}
		else {
			for(int i=1;i<=x;i++) {
				ans=ans*i;
			}
		}
		return ans;
	}
