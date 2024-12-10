package X;

import java.io.Serializable;
import java.util.Comparator;

public final class DUZ implements Comparator, Serializable {
    public final float average;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C23676Bnj bnj = (C23676Bnj) obj;
        C23676Bnj bnj2 = (C23676Bnj) obj2;
        int A00 = AnonymousClass1XO.A00(bnj2.A01, bnj.A01);
        if (A00 != 0) {
            return A00;
        }
        float f = bnj.A00;
        float f2 = this.average;
        return Float.compare(C108945cZ.A00(f, f2), C108945cZ.A00(bnj2.A00, f2));
    }

    public DUZ(float f) {
        this.average = f;
    }
}
