package X;

import java.util.List;

/* renamed from: X.CVa  reason: case insensitive filesystem */
public class C25046CVa {
    public int A00 = 0;
    public List A01 = null;

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        for (Object append : this.A01) {
            A10.append(append);
            A10.append(' ');
        }
        A10.append('[');
        A10.append(this.A00);
        return C17890vO.A0c(A10, ']');
    }
}
