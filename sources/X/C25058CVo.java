package X;

/* renamed from: X.CVo  reason: case insensitive filesystem */
public final class C25058CVo {
    public final String A00;
    public final boolean A01;

    public C25058CVo(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public String toString() {
        String str = this.A00;
        boolean z = this.A01;
        StringBuilder A0t = BE6.A0t(BE8.A0C(str) + 7);
        A0t.append("{");
        A0t.append(str);
        return C17900vP.A0D("}", A0t, z);
    }
}
