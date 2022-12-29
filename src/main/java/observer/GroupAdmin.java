//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package observer;

import java.util.ArrayList;
import java.util.Iterator;

public class GroupAdmin implements Sender {
    private ArrayList<Member> observers = new ArrayList();  //here the ConcreteMember will keep.
    private UndoableStringBuilder UndoableStringBuilder = new UndoableStringBuilder();  //the type of data, that the observer will get updates on him.

    /**
     * this class will implement the interface Sender. GroupAdmin holds an Arraylist and UndoStringBuilder.
     */
    public GroupAdmin() {
    }

    /**
     * this function will add new Member to the ArrayList that GropAdmin hold. this list will get future updates.
     * @param newobserver- the new observer(as ConcreteMember) we will register to the GroupAdmin list.
     */
    public void register(Member newobserver) {
        this.observers.add(newobserver);
        this.notify(this.observers);
    }

    /**
     * this function will remove the specific Member from the ArrayList that the GropAdmin hold. he will not  get future updates.
     * @param deleteobserver-the old observer(as ConcreteMember) we will unregister to the GroupAdmin list.
     */
    public void unregister(Member deleteobserver) {
        this.observers.remove(deleteobserver);
        this.notify(this.observers);
    }

    /**
     * Inserts the string into this character sequence.and will notify the the register Member on the updates
     * @param offset-the index that represent the point on the sequence that the new string is added
     * @param obj-the string that get addedץ
     */
    public void insert(int offset, String obj) {
        this.UndoableStringBuilder.insert(offset, obj);
        this.notify(this.observers);
    }

    /**
     * Appends the specified string to this character sequence.and will notify  the register Member on the updates
     * @param obj-the string that append to the sequence.
     */
    public void append(String obj) {
        this.UndoableStringBuilder.append(obj);
        this.notify(this.observers);
    }

    /**
     * the function deleting the sequence from index start->end.and will notify the register Member on the updates.
     * @param start-the beginning index for deleting
     * @param end-the last index for deleting.
     */
    public void delete(int start, int end) {
        this.UndoableStringBuilder.delete(start, end);
        this.notify(this.observers);
    }

    /**
     * function that do undo.put the UndoStringBuilder one position back. and will notify the register Member on the updates.
     */
    public void undo() {
        this.UndoableStringBuilder.undo();
        this.notify(this.observers);
    }

    /**
     * the function will notify every Member that kept in the ArrayList that the GroupAdmin holds, and will notify them on the updates that implement on the UndoStringBuilder.
     * @param ob-ArrayList that holds all the Member(observer) that should get the updates.
     */
    private void notify(ArrayList<Member> ob) {
        Iterator var2 = ob.iterator();

        while(var2.hasNext()) {
            Member mem = (Member)var2.next();
            mem.update(this.UndoableStringBuilder);
        }

    }

    /**
     * will print the UndoableStringBuilder as String.
     * @return-the string that UndoableStringBuilder is.
     */
    public String toString() {
        return this.UndoableStringBuilder.toString();
    }
}
