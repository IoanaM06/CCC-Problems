package CCC_2018;
/*
Problem Description
Here at the Concerned Citizens of Commerce (CCC), we have noted that telemarketers like to use
seven-digit phone numbers where the last four digits have three properties. Looking just at the last
four digits, these properties are:

• the first of these four digits is an 8 or 9;
• the last digit is an 8 or 9;
• the second and third digits are the same.

For example, if the last four digits of the telephone number are 8229, 8338, or 9008, these are
telemarketer numbers. Write a program to decide if a telephone number is a telemarketer number or not, based on the
last four digits. If the number is not a telemarketer number, we should answer the phone, and
otherwise, we should ignore it.

Input Specification
The input will be 4 lines where each line contains exactly one digit in the range from 0 to 9.

Output Specification
Output either ignore if the number matches the pattern for a telemarketer number; otherwise,
output answer.

Sample Input 1
9
6
6
8
Output for Sample Input 1
ignore

Explanation of Output for Sample Input 1
The first digit is 9, the last digit is 8, and the second and third digit are both 6, so this is a telemarketer number.

Sample Input 2
5
6
6
8
Output for Sample Input 2
answer

Explanation of Output for Sample Input 2
The first digit is 5, and so this is not a telemarketer number.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J1 {
    int digit1, digit2, digit3, digit4;

    public J1() throws FileNotFoundException {
        var file = new File("Data/CCC_2018/J1");
        var scanner = new Scanner(file);

        digit1 = scanner.nextInt();
        digit2 = scanner.nextInt();
        digit3 = scanner.nextInt();
        digit4 = scanner.nextInt();
    }

    public String answerOrIgnore() {
        if ((digit1 == 8 || digit1 == 9) && (digit4 == 8 || digit4 == 9)) {
            if (digit2 == digit3) return "ignore";
        }
        return "answer";
    }
}
