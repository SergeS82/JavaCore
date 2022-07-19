package nio2.addEx;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;

public class FileLine implements Comparable {
    private int lineNum;
    private String name;
    private int amount;

    public static final Comparator comparator = (o1, o2) -> ((FileLine)o1).getName().compareTo(((FileLine)o2).getName());

    public FileLine(String line, Function<String[], String> lineNum, Function<String[], String> name, Function<String[], String> amount){
        try {
            String tmp;
            String[] split = line.split(",");
            this.lineNum = Integer.valueOf(lineNum.apply(split).trim());
            this.name = name.apply(split).trim();
            tmp = amount.apply(split).trim();
            if (tmp.length() > 0) this.amount = Integer.valueOf(tmp);
            else this.amount = 0;
        }catch (ArrayIndexOutOfBoundsException e){

        }
    }
    @Override
    public String toString() {
        return "FileLine{" +
                "lineNum=" + lineNum +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileLine fileLine = (FileLine) o;
        return lineNum == fileLine.lineNum && name.equals(fileLine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineNum, name);
    }

    public int getLineNum() {
        return lineNum;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public int compareTo(Object o) {
        return name.compareTo(((FileLine)o).getName());
    }
}
