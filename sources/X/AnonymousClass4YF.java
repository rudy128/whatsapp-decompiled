package X;

/* renamed from: X.4YF  reason: invalid class name */
public final class AnonymousClass4YF {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YF) {
                AnonymousClass4YF r5 = (AnonymousClass4YF) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public AnonymousClass4YF(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WDSIconDimension(size=");
        A10.append(this.A01);
        A10.append(", iconSize=");
        return AnonymousClass001.A1L(A10, this.A00);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4YF() {
        /*
            r2 = this;
            X.4Df r0 = X.C83064Df.A04
            int r1 = r0.size
            int r0 = r0.iconSize
            r2.<init>(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YF.<init>():void");
    }
}
