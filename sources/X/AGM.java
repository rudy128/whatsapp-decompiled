package X;

import java.util.ArrayList;
import java.util.List;

public class AGM implements C15950rT {
    public final int A00;

    public AGM(int i) {
        this.A00 = i;
    }

    public final Object apply(Object obj) {
        if (this.A00 != 0) {
            return obj;
        }
        List<C196099uS> list = (List) obj;
        if (list == null) {
            return null;
        }
        ArrayList A0D = C29351c6.A0D(list);
        for (C196099uS A002 : list) {
            A0D.add(A002.A00());
        }
        return A0D;
    }
}
