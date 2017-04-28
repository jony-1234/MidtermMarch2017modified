package reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */



			//public void ReadeProgram(){



		        String filePath = "c:\\Users\\Md.Golam Robbani\\Desktop\\Homework 4\\Iphone5.txt";

				FileReader fr = null;
				BufferedReader br = null;
				try{
					fr = new FileReader(filePath);
					br = new BufferedReader(fr);
					String text = "";
					while((text = br.readLine())!=null){
						System.out.println(text);
					}
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
				finally{
					if(br!=null){
						try{
							br.close();
						}catch(IOException e){
							e.printStackTrace();

						}
						if(fr!=null){
							try{
								fr.close();
							}catch(IOException ex){
								ex.printStackTrace();
							}
						}
					}
				}

			}









		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

	
	}


