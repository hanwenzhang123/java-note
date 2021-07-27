//continue
The continue keyword can be placed inside of a loop if we want to skip an iteration. 
If continue is executed, the current loop iteration will immediately end, and the next iteration will begin. 

//We can use the continue keyword to skip any even valued iteration:
int[] numbers = {1, 2, 3, 4, 5};
 
for (int i = 0; i < numbers.length; i++) {
  if (numbers[i] % 2 == 0) {
    continue;
  }
  System.out.println(numbers[i]);
}

This program would output the following:
1
3
5

In this case, if a number is even, we hit a continue statement,
which skips the rest of that iteration, so the print statement is skipped. 
As a result, we only see odd numbers print.

//break
The break keyword is used to exit, or break, a loop. 
Once break is executed, the loop will stop iterating.

for (int i = 0; i < 10; i++) {
  System.out.println(i);
  if (i == 4) {
    break;
  }
}

Even though the loop was set to iterate until the condition i < 10 is false, the above code will output the following because we used break:
0
1
2
3
4
