package X;

/* renamed from: X.B3s  reason: case insensitive filesystem */
public final class C22341B3s extends C21352Aih implements C25401Ob {
    public /* bridge */ /* synthetic */ Comparable BRH() {
        return Long.valueOf(this.A01);
    }

    public /* bridge */ /* synthetic */ Comparable BZX() {
        return Long.valueOf(this.A00);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22341B3s)) {
            return false;
        }
        long j = this.A00;
        long j2 = this.A01;
        if (j > j2) {
            C21352Aih aih = (C21352Aih) obj;
            if (aih.A00 > aih.A01) {
                return true;
            }
        }
        C21352Aih aih2 = (C21352Aih) obj;
        if (j == aih2.A00 && j2 == aih2.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        if (j > j2) {
            return -1;
        }
        return (int) ((31 * (j ^ (j >>> 32))) + (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A00);
        A10.append("..");
        return C17880vN.A0u(A10, this.A01);
    }
}
