package com.amazon.ata.statics;

public class Box {

    // Box dimensions
    private double height;
    private double width;
    private double length;

    // Maximum allowed dimension (72 inches)
    private static final double MAX_DIMENSION = 72.0;

    /**
     * Constructs a Box object if the dimensions are valid
     * 
     * @param length - length of box
     * @param width - width of box
     * @param height - height of box
     * @throws DimensionValueException if the provided dimensions exceed the max Box size
     */
    public Box(double length, double width, double height) throws DimensionValueException {
        if (!validateBoxDimensions(length, width, height)) {
            throw new DimensionValueException("Box dimensions exceed the maximum allowed size of 72 inches.");
        }
        
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * Get the height of the box
     * 
     * @return height of the box
     */
    public double getHeight() {
        return height;
    }

    /**
     * Get the width of the box
     * 
     * @return width of the box
     */
    public double getWidth() {
        return width;
    }

    /**
     * Get the length of the box
     * 
     * @return length of the box
     */
    public double getLength() {
        return length;
    }

    /**
     * Validates if the box dimensions are within the allowed limits
     * 
     * @param length - length of box
     * @param width - width of box
     * @param height - height of box
     * @return true if all dimensions are <= 72 inches, false otherwise
     */
    public static boolean validateBoxDimensions(double length, double width, double height) {
        return length <= MAX_DIMENSION && width <= MAX_DIMENSION && height <= MAX_DIMENSION;
    }
}
