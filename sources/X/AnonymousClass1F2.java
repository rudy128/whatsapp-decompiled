package X;

import java.util.Arrays;

/* renamed from: X.1F2  reason: invalid class name */
public class AnonymousClass1F2 implements AnonymousClass1F1 {
    public final boolean A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass1F2 r5 = (AnonymousClass1F2) obj;
            if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A00), Boolean.valueOf(this.A01), false});
    }

    public AnonymousClass1F2(AnonymousClass1F0 r2) {
        this.A00 = r2.A00;
        this.A01 = r2.A01;
    }
}
