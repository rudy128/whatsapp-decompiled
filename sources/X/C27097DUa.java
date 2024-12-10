package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.DUa  reason: case insensitive filesystem */
public final class C27097DUa implements Comparator, Serializable {
    public final float average;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        float f = ((C23676Bnj) obj2).A00;
        float f2 = this.average;
        return Float.compare(C108945cZ.A00(f, f2), C108945cZ.A00(((C23676Bnj) obj).A00, f2));
    }

    public C27097DUa(float f) {
        this.average = f;
    }
}
