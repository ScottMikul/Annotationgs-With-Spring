package com.teamtreehouse.math;

import com.teamtreehouse.docgen.Doc;

import java.awt.geom.Point2D;
import java.lang.annotation.Target;
public class MathUtils {

    private static final Double EPSILON = 0.0001;

    @Doc(desc = "Gets area of a triangle", params = {"Point A, Point B, Point C"},returnVal = "Double")
    public static Double triangleArea(Point2D.Double a, Point2D.Double b, Point2D.Double c) {
        return 0.0;
    }

    @Doc(desc = "find distance between 2 points", params = {"point a, point b"}, returnVal = "Double")
    public static Double distance(Point2D.Double a, Point2D.Double b) {
        return 0.0;
    }

    @Doc(desc = "find the quadratic roots", params = {"integer a, integer b, integer c"},returnVal = "Double[]")
    public static Double[] quadraticRoots(int a, int b, int c) {
        return new Double[]{};
    }

    @Doc(desc="epsilon", returnVal = "")
    public static void epsilon() {

    }
    private static boolean arePointsClose(Point2D.Double a, Point2D.Double b) {
        return false;
    }
}