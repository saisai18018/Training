//1 String reverse


public static void main(String[] args) {
        String s = "sai";
        String s1 = "";
        for(int i = s.length() - 1; i >= 0; i--){
            s1 += s.charAt(i);
        }
        System.out.println(s1);
        
    }

//2 Factorial

class Main {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        for(int i = n; i >= 1; i--){
            fact = fact * i;
        }
        System.out.println(fact);
        
    }
}

//3 Palindrome

class Main {
    public static void main(String[] args) {
        String s = "mam";
        String s1 = new StringBuilder(s).reverse().toString();
        
        if(s.equals(s1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not");
        }
    }
}

//4 Fibonacci series

class Main {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1, c;
        for(int i = 2; i < n; i++){
            c = a+b;
            System.out.println(a);
            a = b;
            b = c;
        }
    }
}

//5 Prime

class Main {
    public static void main(String[] args) {
        int n = 7;
        int flag = 0;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                flag = 1;
                break;
            }
        }
        
        if(flag==0){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}

//6 Inheritance

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}

//7 Removing the duplicates

class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 5, 1};
        int n = arr.length;

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

//8 Sorting

import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[] = {5, 2, 8, 1, 3};

        Arrays.sort(arr);  

        System.out.print("Sorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}