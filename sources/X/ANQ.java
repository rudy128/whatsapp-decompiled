package X;

import java.util.Set;

public class ANQ implements B7F {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ANQ(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void Bli(C20467AMe aMe) {
        B7F b7f;
        Set set;
        int i = this.A00;
        Object obj = this.A01;
        if (2 - i != 0) {
            b7f = (B7F) this.A02;
            set = ((C20005A2v) obj).A02;
        } else {
            b7f = (B7F) this.A02;
            set = ((C196089uR) obj).A03;
        }
        set.add(aMe);
        if (b7f != null) {
            b7f.Bli(aMe);
        }
    }
}
