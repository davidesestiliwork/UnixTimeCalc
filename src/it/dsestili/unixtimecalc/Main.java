/*
UnixTimeCalc a Unix time calculator
Copyright (C) 2018 Davide Sestili

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package it.dsestili.unixtimecalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) 
	{
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Type the unix time: ");
			String unixTime = br.readLine();
			
			Calendar c = new GregorianCalendar();
			c.setTimeInMillis(Long.parseLong(unixTime) * 1000);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
			System.out.println(sdf.format(c.getTime()));
		} 
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
	}

}
