/*
This program is a short mini-game where the player (a square) must eliminate all the enemies (small circles) by colliding with them.
 */

import processing.core.PApplet;

public class animation extends PApplet
{
    // Main method
    public static void main(String[] args)
    {
        PApplet.main("animation");
    }

    // Instance variables; creates 100 enemies
    Enemy[] enemiesArray = new Enemy[100];
    int[] rectPos;
    boolean up, down, left, right;

    // Default constructor
    public animation() {}

    // PPApplet instance method to setup environment
    public void setup()
    {
        rectPos = new int[] { width / 2, height / 2 };

        for (int i=0; i < enemiesArray.length; i++)
        {
            enemiesArray[i] = new Enemy(200,200,10);
        }
    }

    // PPApplet instance method to determine window size
    public void settings()
    {
        size(800, 800);
    }

    // PPApplet instance method that continually draws and checks for collisions
    public void draw()
    {
        rectMode(CENTER);
        background(0);
        fill(255);

        if (up)
            rectPos[1] -= 10;

        if (down)
            rectPos[1] += 10;

        if (left)
            rectPos[0] -= 10;

        if (right)
            rectPos[0] += 10;

        for (Enemy enemy : enemiesArray) {
            enemy.update();
            enemy.checkCollisions(width, height);
            ellipse(enemy.x, enemy.y, enemy.enemySize, enemy.enemySize);

            // Ff enemy collides with user, enemy disappears
            if (enemy.hit(enemy.x, enemy.y, enemy.enemySize, rectPos[0], rectPos[1], 50, 50))
            {
                enemy.enemySize = 0;
            }
        }

        rect(rectPos[0], rectPos[1], 50, 50);
    }

    // PPApplet instance method checking when user releases key to start square movement
    public void keyPressed()
    {
        if (key == CODED)
        {
            if (keyCode == UP) {
                up = true;
            }
            if (keyCode == DOWN) {
                down = true;
            }
            if (keyCode == LEFT) {
                left = true;
            }
            if (keyCode == RIGHT) {
                right = true;
            }
        }
    }

    // PPApplet instance method checking when user releases key to stop square movement
    public void keyReleased()
    {
        if (key == CODED)
        {
            if (keyCode == UP) {
                up = false;
            }
            if (keyCode == DOWN) {
                down = false;
            }
            if (keyCode == LEFT) {
                left = false;
            }
            if (keyCode == RIGHT) {
                right = false;
            }
        }
    }

}
