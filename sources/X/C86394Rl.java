package X;

import java.util.Arrays;

/* renamed from: X.4Rl  reason: invalid class name and case insensitive filesystem */
public class C86394Rl {
    public final int A00;
    public final AnonymousClass4PG A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C86394Rl r5 = (C86394Rl) obj;
            if (this.A00 != r5.A00 || !C24604CBi.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C86394Rl(AnonymousClass4PG r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A01;
        AnonymousClass000.A1M(A1b, this.A00);
        return Arrays.hashCode(A1b);
    }
}
