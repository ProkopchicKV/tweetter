
public class sentiments {
	String[] word = new String[22158];
	double[] mood = new double[22158];
	String filename="F:\\универ\\2курс4сем\\java\\trends\\trends\\data\\sentiments.txt";
	public sentiments()
	{
		File.read(filename, word);	
	}
	public void Out(int k)
	{
		System.out.println(word[k]);
	}
	public double sentiment()
	{
		double k=0;
		return k;
	}
	
}
