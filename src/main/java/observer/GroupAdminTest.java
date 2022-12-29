//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package observer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GroupAdminTest {
    GroupAdminTest() {
    }

    @Test
    void register() {
        GroupAdmin GroupAdmin1 = new GroupAdmin();
        ConcreteMember ConcreteMember1 = new ConcreteMember();
        GroupAdmin1.register(ConcreteMember1);
        GroupAdmin1.append("Alice");
        Assertions.assertEquals("Alice", ConcreteMember1.toString());
    }

    @Test
    void unregister() {
        GroupAdmin GroupAdmin1 = new GroupAdmin();
        ConcreteMember ConcreteMember1 = new ConcreteMember();
        ConcreteMember ConcreteMember2 = new ConcreteMember();
        GroupAdmin1.register(ConcreteMember1);
        GroupAdmin1.register(ConcreteMember2);
        GroupAdmin1.unregister(ConcreteMember1);
    }

    @Test
    void insert() {
        GroupAdmin GroupAdmin1 = new GroupAdmin();
        ConcreteMember ConcreteMember1 = new ConcreteMember();
        GroupAdmin1.register(ConcreteMember1);
        GroupAdmin1.append("Alice");
        GroupAdmin1.insert(5, " and Bob");
        Assertions.assertEquals("Alice and Bob", ConcreteMember1.toString());
    }

    @Test
    void append() {
        GroupAdmin GroupAdmin1 = new GroupAdmin();
        ConcreteMember ConcreteMember1 = new ConcreteMember();
        GroupAdmin1.register(ConcreteMember1);
        GroupAdmin1.append("Alice");
        Assertions.assertEquals("Alice", ConcreteMember1.toString());
    }

    @Test
    void delete() {
        GroupAdmin GroupAdmin1 = new GroupAdmin();
        ConcreteMember ConcreteMember1 = new ConcreteMember();
        GroupAdmin1.register(ConcreteMember1);
        GroupAdmin1.append("Alice");
        Assertions.assertEquals("Alice", ConcreteMember1.toString());
        GroupAdmin1.delete(0, 4);
        Assertions.assertEquals("e", ConcreteMember1.toString());
    }

    @Test
    void undo() {
        GroupAdmin GroupAdmin1 = new GroupAdmin();
        ConcreteMember ConcreteMember1 = new ConcreteMember();
        GroupAdmin1.register(ConcreteMember1);
        GroupAdmin1.append("Alice");
        GroupAdmin1.append("Bob");
        GroupAdmin1.undo();
        Assertions.assertEquals("Alice", ConcreteMember1.toString());
    }
}
