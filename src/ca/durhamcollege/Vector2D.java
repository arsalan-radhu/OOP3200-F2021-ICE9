package ca.durhamcollege;

import java.util.Vector;

public class Vector2D
{


    //PRVIATE INSTANCE VARIABLES
    private float x, y;

    //MUTATORS AND ACCESSORS
    //X Getter
    public float getX()
    {
        return x;
    }
    //X Setter
    public void setX(float x)
    {
        this.x = x;
    }
    //Y Getter
    public float getY()
    {
        return y;
    }
    //Y Setter
    public void setY(float y)
    {
        this.y = y;
    }
    //Object Setter
    public void set(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public void set(Vector2D vector)
    {
        this.x = vector.x;
        this.y = vector.y;
    }

    //CONSTRUCTOR
    //Default Constructor
    Vector2D()
    {
        this.x = 0;
        this.y = 0;
    }
    //Object Constructor
    Vector2D(Vector2D vector)
    {
        set(vector.getX(), vector.getY());
    }
    //Full Constructor
    Vector2D(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    //PRIVATE METHODS


    //PUBLIC METHODS
    public void add(Vector2D rhs)
    {
        this.setX(this.getX() + rhs.getX());
        this.setY(this.getY() + rhs.getY());
    }

    public void subtract(Vector2D rhs)
    {
        this.setX(this.getX() - rhs.getX());
        this.setY(this.getY() - rhs.getY());
    }

    public void multiply(Vector2D rhs)
    {
        this.setX(this.getX() * rhs.getX());
        this.setY(this.getY() * rhs.getY());
    }

    public void divide(Vector2D rhs)
    {
        this.setX(this.getX() / rhs.getX());
        this.setY(this.getY() / rhs.getY());
    }

    public boolean equals(Vector2D rhs)
    {
        return ((getX() == rhs.getX()) && (getY() == rhs.getY()));
    }

    @Override
    public String toString()
    {
        String output = "Vector{  " + "(" + x + ", " + y + ")  }";
        return output;
    }

    //STATIC METHODS
    public static Vector2D zero()
    {
        return new Vector2D(0.0f, 0.0f);
    }

    public static Vector2D one()
    {
        return new Vector2D(1.0f, 1.0f);
    }

    public static Vector2D left()
    {
        return new Vector2D(-1.0f, 0.0f);
    }

    public static Vector2D right()
    {
        return new Vector2D(1.0f, 0.0f);
    }

    public static Vector2D up()
    {
        return new Vector2D(0.0f, 1.0f);
    }

    public static Vector2D down()
    {
        return new Vector2D(0.0f, -1.0f);
    }

    public static Vector2D lerp(final Vector2D a, final Vector2D b, float t)
    {
        if((double)(t) < 0.0)
        {
            t = 0.0f;
        }
        if((double)(t) > 1.0)
        {
            t = 1.0f;
        }

        return new Vector2D(a.getX() + (b.getX() - a.getX()) * t, a.getY() + (b.getY() - a.getY()) * t);
    }

    public static float dot(final Vector2D lhs, final Vector2D rhs)
    {
        return (float)((double)(lhs.getX() * (double)(rhs.getX())) + ((double)(lhs.getY() * (double)(rhs.getY()))));
    }

    public static float distance(final Vector2D a, final Vector2D b)
    {
        final var deltaX = (double)(b.getX()) - (double)(a.getX());
        final var deltaY = (double)(b.getY()) - (double)(a.getY());

        return (float)Math.sqrt((float)(deltaX * deltaX) + (float)(deltaY * deltaY));
    }

    //UTILITY METHODS
    public float getMagnitude()
    {
        return (float)Math.sqrt((this.getX() * this.getX()) + (this.getY() * this.getY()));
    }

    public float sqrMagnitude()
    {
        float v = (this.getX() * this.getX()) + (this.getY() * this.getY());
        return v;
    }

    public void setScale(Vector2D scale)
    {
        this.set((this.getX() * scale.getX()), (this.getY() * scale.getY()));
    }

    public void normalize()
    {
        var magnitude = this.getMagnitude();
        if ((double)magnitude > 9.99999974737875E-06)
        {
            set(getX() / magnitude, getY() / magnitude);
        }
        else
        {
            set(Vector2D.zero());
        }
    }

    public Vector2D getNormalized()
    {
        Vector2D vector = new Vector2D(getX(), getY());
        vector.normalize();
        return vector;
    }
}
