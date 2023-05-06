package com.exercises.AlgorithmicChallenges;

import java.util.Arrays;

public class RearrangeArrayAtEvenOrOddPosition {
	
	public Integer[] rearrangeArray(Integer[] myArray) {
		Integer[] arr = myArray;
		int n = arr.length;
		
		
		for (int i = 1; i < n; i++)  {
			// The odds(impar) debe ser actualizado si el actual es mayour que el anterior
            if (i % 2 == 0)             {
                if (arr[i] > arr[i - 1])                 {
                    int temp=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                }
            }
            
         // The even (par) debe ser actualizado si el actual es menor que el anterior
            else             {
                if (arr[i] < arr[i - 1]) {
                    int temp=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                }
            }
        }
		// 1  2  3  4  5  6  7
		//{1, 2, 3, 4, 5, 6, 7};
		// 1  2  3  4  5  6  7
		// 1  3  2  4  5  6  7
		// 1  3  2  4  5  6  7
		// 1  3  2  5  4  6  7
		// 1  3  2  5  4  7  6
		System.out.println("Array: " + Arrays.toString(arr));
		return arr;		
	}

}

// En la posicion impar, si el anterior es mayor o igual, se intercambian
//Arr[i] > Arr[i-1], if position ‘i’ is odd.

// En la posicion par, si el anterior es mayor o igual, se intercambian
//Arr[i] < Arr[i-1], if position ‘i’ is even.

