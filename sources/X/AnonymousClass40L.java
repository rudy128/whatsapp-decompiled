package X;

import java.util.List;

/* renamed from: X.40L  reason: invalid class name */
public final class AnonymousClass40L extends AnonymousClass4EW {
    public final int A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass40L) {
                AnonymousClass40L r5 = (AnonymousClass40L) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + this.A00;
    }

    public AnonymousClass40L(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BucketsUpdateResult(buckets=");
        A10.append(this.A01);
        A10.append(", bucketsReported=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
