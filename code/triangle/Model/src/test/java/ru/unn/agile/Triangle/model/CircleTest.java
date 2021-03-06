package ru.unn.agile.Triangle.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CircleTest {
    private static final double DELTA = 0.001;

    @Test
    public void canCreateCircleWithInitialValues() {
        Point2D point = new Point2D(0, 0);
        Circle circle = new Circle(point, 0);

        assertNotNull(circle);
    }

    @Test
    public void canSetInitialValueOfCircleFilds() {
        double x = 0.3;
        double y = 7.1;
        double expectRadius = 5.5;
        Point2D expectPoint = new Point2D(x, y);
        Circle circle = new Circle(expectPoint, expectRadius);

        assertEquals(expectRadius, circle.getRadius(), DELTA);
        assertEquals(expectPoint, circle.getCenter());
    }
}
