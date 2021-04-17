public class Calculate {
	
	public double calcCGPA (int arr[]) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		double cgpa = (float)sum / 25;
		cgpa = Math.round(cgpa*100);
		return cgpa/100;
		
	}
	
	public double TEcalcCGPA (int arr[]) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		double TEcgpa = (float)sum / 23;
		TEcgpa = Math.round(TEcgpa*100);
		return TEcgpa/100;
		
	}
	
	public double BEcalcCGPA (int arr[]) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		double BEcgpa = (float)sum / 22;
		BEcgpa = Math.round(BEcgpa*100);
		return BEcgpa/100;
		
	}
	
	public double FEcalcSGPA (int arr[], int arr1[]) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i] + arr1[i];
		}
		
		double FEsgpa = (float)sum / 50;
		FEsgpa = Math.round(FEsgpa*100);
		return FEsgpa/100;
		
	}

	public double SEcalcSGPA (int arr[], int arr1[]) {
	
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			sum = sum + arr1[i];
		}
		
		double SEsgpa = (float)sum / 50;
		SEsgpa = Math.round(SEsgpa*100);
		return SEsgpa/100;
	
	}

	public double TEcalcSGPA (int arr[], int arr1[]) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			sum = sum + arr1[i];
		}
		
		double TEsgpa = (float)sum / 46;
		TEsgpa = Math.round(TEsgpa*100);
		return TEsgpa/100;
		
	}

	public double BEcalcSGPA (int arr[], int arr1[]) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			sum = sum + arr1[i];
		}
		
		double BEsgpa = (float)sum / 44;
		BEsgpa = Math.round(BEsgpa*100);
		return BEsgpa/100;
		
	}

}
