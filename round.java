//Round off
	public int Round(double x) {
	int ans;
	int n=(int)(x);
	double dpart=x-n;
	if(dpart>=0.5) {
		ans=n+1;
	}
	else ans=n;
	return ans;
    }
