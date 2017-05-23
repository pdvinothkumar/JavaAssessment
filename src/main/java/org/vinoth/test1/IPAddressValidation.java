package org.vinoth.test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidation {

	private Pattern pattern;

	private Matcher matcher;

	private static final String IPADDRESS_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

	public IPAddressValidation() {
		pattern = Pattern.compile(IPADDRESS_PATTERN);
	}

	/**
	 * Validate ip address with regular expression
	 * @return true valid ip address, false invalid ip address
	 */
	public boolean validate(final String ip) {
		matcher = pattern.matcher(ip);
		return matcher.matches();
	}

	public static void main(String[] args) throws IOException {

		ArrayList<String> invalidIPs = new ArrayList<>();

		// Create a BufferedReader from a FileReader.
		BufferedReader reader = new BufferedReader(new FileReader("./src/main/resources/ipAddress.txt"));

		// Loop over lines in the files and print them
		while (true) {
			String line = reader.readLine();
			if (line == null) {
				break;
			}

			if (!new IPAddressValidation().validate(line)) {
				invalidIPs.add(line);
			}

		}
		// Close the BufferedReader.
		reader.close();

		// Print Invalid IP address
		for (String ip : invalidIPs) {
			System.out.println("[" + ip + "]");
		}

	}
}
