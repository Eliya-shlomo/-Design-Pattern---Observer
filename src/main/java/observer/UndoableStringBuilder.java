//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package observer;

import java.util.Stack;

public class UndoableStringBuilder {
    private Stack<String> stack = new Stack();
    private StringBuilder Stringbuilder = new StringBuilder();

    public UndoableStringBuilder() {
    }

    /**
     *
     * @return-the sequence as a String
     */
    public String toString() {
        return this.Stringbuilder.toString();
    }

    /**
     *Causes this character sequence to be replaced by the reverse of the sequence.
     * @return-the sentence reversed
     */
    public UndoableStringBuilder undo() {
        try {
            this.Stringbuilder = new StringBuilder((String)this.stack.pop());
            return this;
        } catch (Exception var2) {
            return this;
        }
    }

    /**
     *Appends the specified string to this character sequence.
     * @param str-the string that append to the sequence.
     * @return-new sequence of the UndoableStringBuilder after appending new String.
     */
    public UndoableStringBuilder append(String str) {
        this.stack.push(this.Stringbuilder.toString());
        this.Stringbuilder.append(str);
        return this;
    }

    /**
     * the function deleting the sequence from index start->end
     * @param start- the beginning index for deleting
     * @param end- the last index for deleting
     * @return . the sequence after the pointed sub-string is been deleted.
     */
    public UndoableStringBuilder delete(int start, int end) {
        this.stack.push(this.Stringbuilder.toString());

        try {
            this.Stringbuilder.delete(start, end);
            return this;
        } catch (StringIndexOutOfBoundsException var7) {
            if (start < 0) {
                System.err.println("Start < 0");
                var7.printStackTrace();
            } else if (start > end) {
                System.err.println("Start > End");
                var7.printStackTrace();
            } else if (start > this.Stringbuilder.length()) {
                System.err.println("Start out of range");
                var7.printStackTrace();
            }

            this.undo();
            return this;
        } finally {
            ;
        }
    }
    /**
     * Inserts the string into this character sequence.
     * @param offset- the index that represent the point on the sequence that the new string is added
     * @param str- the string that get added
     * @return the sequence after the new sub-string is get inserted.
     */
    public UndoableStringBuilder insert(int offset, String str) {
        this.stack.push(this.Stringbuilder.toString());

        try {
            this.Stringbuilder.insert(offset, str);
            return this;
        } catch (StringIndexOutOfBoundsException var7) {
            var7.printStackTrace();
            System.err.println(var7);
            return this;
        } finally {
            ;
        }
    }
    /**
     * Replaces the characters in a string. The substring begins at the specified start and
     extends to the character at index end - 1 or to the end of the sequence if
     no such character exists. First the characters in the substring are removed
     and then the specified String is inserted at start.
     * @param start- the beginning index that represent the point on the new sub-sequence that the new string is replace the old sub-string.
     * @param end-the ending index that represent the point on the new sub-sequence that the new string is replace the old sub-string.
     * @param str- the new sub-string that get added.
     * @return the sequence after the new sub-string is get replaced.
     */
    public UndoableStringBuilder replace(int start, int end, String str) {
        this.stack.push(this.Stringbuilder.toString());
        if (str == null) {
            throw new NullPointerException("str = null");
        } else {
            if (start < 0) {
                System.err.println("start is negative");
            } else if (start > this.Stringbuilder.length()) {
                System.err.println("start out the range");
            } else if (start > end) {
                System.err.println("start grater than end");
            } else {
                this.Stringbuilder.replace(start, end, str);
            }

            return this;
        }
    }
    /**
     * Causes this character sequence to be replaced by the reverse of the sequence.
     * @return  the sentence reversed
     */
    public UndoableStringBuilder reverse() {
        this.stack.push(this.Stringbuilder.toString());

        try {
            this.Stringbuilder.reverse();
            return this;
        } catch (Exception var6) {
            return this;
        } finally {
            ;
        }
    }
}
