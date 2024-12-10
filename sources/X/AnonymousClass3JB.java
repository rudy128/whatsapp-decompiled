package X;

/* renamed from: X.3JB  reason: invalid class name */
public final class AnonymousClass3JB extends C70543Bm implements C25401Ob {
    public /* bridge */ /* synthetic */ Comparable BRH() {
        return new C42731ye(this.A01);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass3JB)) {
            return false;
        }
        long j = this.A01;
        if ((AnonymousClass04C.A00(65536, j) <= 0 || AnonymousClass04C.A00(65536, ((C70543Bm) obj).A01) <= 0) && j != ((C70543Bm) obj).A01) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ Comparable BZX() {
        return new C42731ye(65536);
    }

    public int hashCode() {
        long j = this.A01;
        if (AnonymousClass04C.A00(65536, j) > 0) {
            return -1;
        }
        return ((int) (j ^ (j >>> 32))) + (((int) (65536 ^ (65536 >>> 32))) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(C60652oO.A01(65536));
        A10.append("..");
        return C17890vO.A0V(C60652oO.A01(this.A01), A10);
    }
}
