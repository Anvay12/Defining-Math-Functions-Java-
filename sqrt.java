	//Square root
	static int Sqrt(int n){
		int ans=0;
		for(int i=0;i<=n;i++) {
			if(i*i==n) {
				ans=i;
			}
		}
		return ans;
	}
  
