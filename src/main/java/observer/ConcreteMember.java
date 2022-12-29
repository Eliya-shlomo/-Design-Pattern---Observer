//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package observer;

public class ConcreteMember implements Member {
    private UndoableStringBuilder usb = null; //initialization of UndoableStringBuilder, he will get the updates.

    /**
     * this class will implement the Member interface. representing the object observer. every observer that will create and will be attributed to GroupAdmin(observable) will get the updates on the UndoableStringBuilder changing.
     */
    public ConcreteMember() {
    }

    /**
     * represnt a shallow copying. the UndoableStringBuilder that ConcreteMember holds get updated(compared to the one that the GroupAdmin holds).
     * @param usb-represnt a shallow copying. the UndoableStringBuilder that ConcreteMember holds get updated(compared to the one that the GroupAdmin holds).
     */
    public void update(UndoableStringBuilder usb) {
        this.usb = usb;
    }

    /**
     * will print the UndoableStringBuilder as String.
     * @return-string that UndoableStringBuilder is.
     */
    public String toString() {
        return this.usb.toString();
    }
}
