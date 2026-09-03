import java.io.*;
import java.util.Arrays;

/**
 * Represents inclusive integer range.
 */
class Range implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * @serial
     */
    transient private int from;
    /**
     * @serial
     */
    transient private int to;

    @Serial
    private void writeObject(ObjectOutputStream oos) throws Exception {
        oos.writeInt(from);
        oos.writeInt(to);
    }

    @Serial
    private void readObject(ObjectInputStream ois) throws Exception {
        int from = ois.readInt();
        int to = ois.readInt();
        if (from > to) {
            throw new IllegalArgumentException("Start is greater than end");
        }
        this.from = from;
        this.to = to;
    }


    /**
     * Creates Range.
     *
     * @param from start
     * @param to   end
     * @throws IllegalArgumentException if start is greater than end.
     */
    public Range(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("Start is greater than end");
        }
        this.from = from;
        this.to = to;
    }

    public static void main(String[] args) {
        Range range1 = new Range(1, 2);
        Range range2;
        ObjectOutputStream oos;
        ObjectInputStream ois;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {

            oos = new ObjectOutputStream(baos);
            oos.writeObject(range1);
            oos.flush();
            byte[] array = baos.toByteArray();
            System.out.println(Arrays.toString(array));

            ois = new ObjectInputStream(new ByteArrayInputStream(array));
            range2 = (Range) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(range2);


    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Range{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }


}

