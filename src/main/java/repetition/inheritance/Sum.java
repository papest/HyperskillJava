package repetition.inheritance;

class Sum {
    public static int sumOfAreas(Shape[] array) {
        int sum = 0;

        for (Shape shape : array) {
            if (shape instanceof Square square) {
                sum += square.getSide() * square.getSide();
            } else if (shape instanceof Rectangle rectangle) {
                sum += rectangle.getHeight() * rectangle.getWidth();
            }

        }
        return sum;
    }
}

class Shape {
}

class Square extends Shape {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
