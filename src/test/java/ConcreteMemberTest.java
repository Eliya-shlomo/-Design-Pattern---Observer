//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import observer.ConcreteMember;
import observer.GroupAdmin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConcreteMemberTest {
    ConcreteMemberTest() {
    }

    @Test
    void update() {
        GroupAdmin GroupAdmin1 = new GroupAdmin();
        ConcreteMember ConcreteMember1 = new ConcreteMember();
        ConcreteMember ConcreteMember2 = new ConcreteMember();
        GroupAdmin1.register(ConcreteMember1);
        GroupAdmin1.register(ConcreteMember2);
        GroupAdmin1.append("Alice");
        Assertions.assertEquals(ConcreteMember1.toString(), ConcreteMember2.toString());
    }
}
