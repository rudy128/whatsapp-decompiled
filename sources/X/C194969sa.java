package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.9sa  reason: invalid class name and case insensitive filesystem */
public final class C194969sa {
    public final long A00;
    public final long A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194969sa) {
                C194969sa r5 = (C194969sa) obj;
                if (!(this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A02 * 31) + this.A03;
    }

    public C194969sa(int i, int i2) {
        this.A02 = i;
        this.A03 = i2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        this.A00 = timeUnit.toMillis((long) i);
        this.A01 = timeUnit.toMillis((long) i2);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EligibilityWindow(delayDays=");
        A10.append(this.A02);
        A10.append(", lengthDays=");
        return AnonymousClass001.A1L(A10, this.A03);
    }
}
