package X;

public abstract class DSA implements Comparable {
    public int A01() {
        if (this instanceof C23367Bft) {
            return 3;
        }
        if (this instanceof C23369Bfv) {
            return 5;
        }
        if (this instanceof C23366Bfs) {
            int i = 32;
            if (((C23366Bfs) this).A00 >= 0) {
                i = 0;
            }
            return (i >> 5) & 7;
        } else if (this instanceof C23365Bfr) {
            return 2;
        } else {
            if (this instanceof C23364Bfq) {
                return 7;
            }
            return 4;
        }
    }

    public int A02() {
        if (this instanceof C23369Bfv) {
            return ((C23369Bfv) this).A00;
        }
        if (this instanceof C23368Bfu) {
            return ((C23368Bfu) this).A00;
        }
        return 0;
    }

    public static final DSA A00(DSA dsa, Class cls) {
        if (cls.isInstance(dsa)) {
            return (DSA) cls.cast(dsa);
        }
        String name = cls.getName();
        String A0U = C17890vO.A0U(dsa);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Expected a ");
        A10.append(name);
        throw new C24384C1e(AnonymousClass001.A1H(" value, but got ", A0U, A10));
    }
}
