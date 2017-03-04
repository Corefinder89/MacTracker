import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

class get_Mac_Device_name
{
	public static void get_MacAddress_DeviceName(String line)
	{
		String get_param = "";
		String Device_MacAddress = "";
		String DeviceName = "";
		if(line.startsWith("MAC Address:"))
			get_param = line;
		System.out.println(get_param);
//		String[] get_param_array = get_param.split("\\(");
//		for(String itr:get_param_array)
//		{
//			if(itr.contains("MAC Address:"))
//				Device_MacAddress = itr;
//			if(itr.contains("\b") && !itr.contains("MAC Address"))
//				DeviceName = itr;
//		}
//		System.out.println(Device_MacAddress);
//		System.out.println("Device Name: "+DeviceName);
	}

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = null;
		try
		{
			String sCurrentLine;
			FileInputStream fin_s = new FileInputStream("../tracker_config/nmap.txt");
			br = new BufferedReader(new InputStreamReader(fin_s));
			while((sCurrentLine = br.readLine()) != null)
			{
				get_MacAddress_DeviceName(sCurrentLine);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(br != null)
				br.close();
		}
	}
}
