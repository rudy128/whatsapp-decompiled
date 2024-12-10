package X;

import java.util.ArrayList;

/* renamed from: X.Cme  reason: case insensitive filesystem */
public final class C25827Cme {
    public static final C25827Cme A01 = new C25827Cme(2);
    public static final C25827Cme A02 = new C25827Cme(0);
    public static final C25827Cme A03 = new C25827Cme(1);
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C25827Cme) && this.A00 == ((C25827Cme) obj).A00);
    }

    public final int A00() {
        return this.A00;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        int i = this.A00;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList A13 = AnonymousClass000.A13();
        if ((i & 1) != 0) {
            A13.add("Underline");
        }
        if ((i & 2) != 0) {
            A13.add("LineThrough");
        }
        int size = A13.size();
        StringBuilder A10 = AnonymousClass000.A10();
        if (size == 1) {
            A10.append("TextDecoration.");
            A10.append((String) AnonymousClass8BS.A0Y(A13));
        } else {
            A10.append("TextDecoration[");
            A10.append(C25294Ccw.A00(", ", A13));
            A10.append(']');
        }
        return A10.toString();
    }

    public C25827Cme(int i) {
        this.A00 = i;
    }
}
