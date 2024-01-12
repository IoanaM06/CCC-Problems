package CCC_2023;
/*
In the game, Deliv-e-droid, a robot droid has to deliver packages while avoiding obstacles.
At the end of the game, the final score is calculated based on the following point system:

• Gain 50 points for every package delivered.
• Lose 10 points for every collision with an obstacle.
• Earn a bonus 500 points if the number of packages delivered is greater than the number of collisions with obstacles.

Your job is to determine the final score at the end of a game.

Input Specification
The input will consist of two lines. The first line will contain a non-negative integer P, representing the number of
packages delivered. The second line will contain a non-negative integer C, representing the number of collisions with
obstacles.

Output Specification
The output will consist of a single integer F, representing the final score.

Sample Input 1
5
2

Output for Sample Input 1
730

Explanation of Output for Sample Input 1
There are 5 packages delivered, so 5 × 50 = 250 points are gained. There are 2 collisions, so
2 × 10 = 20 points are lost. Since 5 > 2, a bonus 500 points are earned. Therefore, the final
score is 250 − 20 + 500 = 730.

Sample Input 2
0
10

Output for Sample Input 2
-100

Explanation of Output for Sample Input 2
There are 0 packages delivered, so 0 × 50 = 0 points are gained. There are 10 collisions, so
10 × 10 = 100 points are lost. Since 0 ≤ 10, no bonus points are earned. Therefore, the final
score is 0 − 100 + 0 = −100.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J1 {
    int numPackagesDelivered, numCollisions, totalPoints;

    public J1() throws FileNotFoundException {
        var file = new File("Data/CCC_2023/J1");
        var scanner = new Scanner(file);

        numPackagesDelivered = scanner.nextInt();
        numCollisions = scanner.nextInt();

        totalPoints = numPackagesDelivered * 50;
        totalPoints -= numCollisions * 10;

        System.out.println(totalPoints);
    }
}
