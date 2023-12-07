package Adarsh;

import java.util.Scanner;

public class ClockAngle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the hour (0-12): ");
		int h = sc.nextInt();

		System.out.print("Enter the minute (0-60): ");
		int m = sc.nextInt();
		calculateClockAngle(h, m);

	}

	public static void calculateClockAngle(int h, int m) {
		if (h < 0 || h > 12 || m < 0 || m > 60) {
			System.out.println("Invalid input. Hour should be between 0 and 12,"
					+ " and minute should be between 0 and 59.");

		}
		double hourAngle = (30 * h + 0.5 * m);
		double minuteAngle = m * 6;
		// double hourAngle = (h % 12 + m / 60) * 30;
		// double minuteAngle = m * 6;
		double angle = Math.abs(hourAngle - minuteAngle);

		if (angle > 180) {
			angle = 360 - angle;
		}
		System.out.println("The angle between the hour and minute hands is: " + angle + " degrees");
	}

}
