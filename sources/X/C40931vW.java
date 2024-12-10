package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.1vW  reason: invalid class name and case insensitive filesystem */
public class C40931vW implements C40681v6 {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public E7G CPB(C39801tf r2, C38631rd r3, C26642D7p d7p) {
        return new C26636D7j(r2, r3, this, d7p);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShapeGroup{name='");
        sb.append(this.A00);
        sb.append("' Shapes: ");
        sb.append(Arrays.toString(this.A01.toArray()));
        sb.append('}');
        return sb.toString();
    }

    public C40931vW(String str, List list, boolean z) {
        this.A00 = str;
        this.A01 = list;
        this.A02 = z;
    }
}
