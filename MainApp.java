package basic.dev;

import java.util.Scanner;

public class MainApp {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Nhập số lượng phần tử của mảng: ");
				int n = sc.nextInt();

				int[] array = new int[n];
				for (int i = 0; i < n; i++) {
					System.out.print("Nhập giá trị cho phần tử thứ " + (i + 1) + ": ");
					array[i] = sc.nextInt();
				}

				int[] count = new int[n];
				for (int i = 0; i < n; i++) {
					count[array[i]]++;
				}

				int max = 0;
				int index = 0;
				for (int i = 0; i < n; i++) {
					if (count[i] > max) {
						if (count[i] > max) {
							max = count[i];
							index = i;

						}
					}

					System.out.println(
							"Phần tử xuất hiện nhiều nhất trong mảng là " + array[index] + " với số lần xuất hiện là " + max);
				}

			}

		}
