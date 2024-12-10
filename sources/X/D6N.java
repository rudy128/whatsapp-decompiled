package X;

import java.lang.ref.Reference;

public class D6N implements B6T {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public D6N(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final Object get() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            DFL dfl = (DFL) obj;
            DOZ doz = (DOZ) this.A02;
            if (dfl != null) {
                return Integer.valueOf(C25340Cdz.A00(doz, dfl));
            }
            return null;
        }
        DOZ doz2 = (DOZ) ((Reference) obj).get();
        DFL dfl2 = (DFL) ((Reference) this.A02).get();
        if (doz2 == null || dfl2 == null) {
            return null;
        }
        return new COM(doz2, dfl2);
    }
}
