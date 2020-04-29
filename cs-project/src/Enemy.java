import processing.core.PApplet;

public class Enemy extends PApplet
{
    // Initialize variables
    float x;
    float y;
    float xSpeed;
    float ySpeed;
    float enemySize;

    // Constructor
    Enemy(float xPos, float yPos, float eSize) {
        x = xPos;
        y = yPos;
        enemySize = eSize;

        xSpeed = random(-10, 10);
        ySpeed = random(-10, 10);
    }

    // Keep enemies moving
    public void update()
    {
        x += xSpeed;
        y += ySpeed;
    }

    // Enemies bounce off windows
    public void checkCollisions(int width, int height)
    {
        float r = enemySize / 2;

        if ( (x < r) || (x > width - r))
        {
            xSpeed = -xSpeed;
        }

        if( (y < r) || (y > height - r))
        {
            ySpeed = -ySpeed;
        }
    }

    // Check if enemy collides with user and return boolean value
    public boolean hit(float xPos, float yPos, float enemySize, float playerX, float playerY, float playerWidth, float playerHeight) {
        // Find location of enemy and set radius
        float testX = xPos;
        float testY = yPos;
        float testR = enemySize / 2;

        // Check for closest edge
        if (xPos < playerX)
            testX = playerX;
        else if (xPos > playerX + playerWidth)
            testX = playerX + playerWidth;
        if (yPos < playerY)
            testY = playerY;
        else if (yPos > playerY + playerHeight)
            testY = playerY + playerHeight;

        // Get distance from closest edge
        float distX = xPos - testX;
        float distY = yPos - testY;
        float distance = sqrt( (distX * distX) + (distY * distY) );

        // If distance is less than radius, collision occurs
        if (distance <= testR) {
            return true;
        }
        return false;
    }
}