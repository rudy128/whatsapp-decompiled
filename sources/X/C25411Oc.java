package X;

/* renamed from: X.1Oc  reason: invalid class name and case insensitive filesystem */
public final class C25411Oc extends C25391Oa implements C25401Ob {
    public static final C25411Oc A00 = new C25411Oc(1, 0);

    public C25411Oc(int i, int i2) {
        super(i, i2, 1);
    }

    public /* bridge */ /* synthetic */ Comparable BRH() {
        return Integer.valueOf(this.A01);
    }

    public /* bridge */ /* synthetic */ Comparable BZX() {
        return Integer.valueOf(this.A00);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C25411Oc)) {
            return false;
        }
        if (A04() && ((C25391Oa) obj).A04()) {
            return true;
        }
        C25391Oa r3 = (C25391Oa) obj;
        if (this.A00 == r3.A00 && this.A01 == r3.A01) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append("..");
        sb.append(this.A01);
        return sb.toString();
    }

    public int hashCode() {
        if (A04()) {
            return -1;
        }
        return (this.A00 * 31) + this.A01;
    }
}
