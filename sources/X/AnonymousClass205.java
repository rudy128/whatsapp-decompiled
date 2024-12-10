package X;

/* renamed from: X.205  reason: invalid class name */
public class AnonymousClass205 {
    public final AnonymousClass1BI A00;
    public final String A01;
    public final boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r0 != null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0038
            r2 = 0
            if (r5 == 0) goto L_0x0020
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x0020
            X.205 r5 = (X.AnonymousClass205) r5
            boolean r1 = r4.A02
            boolean r0 = r5.A02
            if (r1 != r0) goto L_0x0020
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 != 0) goto L_0x0021
            if (r0 == 0) goto L_0x0028
        L_0x0020:
            return r2
        L_0x0021:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0028
            return r2
        L_0x0028:
            X.1BI r1 = r4.A00
            X.1BI r0 = r5.A00
            if (r1 != 0) goto L_0x0031
            if (r0 == 0) goto L_0x0038
            return r2
        L_0x0031:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0038
            return r2
        L_0x0038:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass205.equals(java.lang.Object):boolean");
    }

    public static AnonymousClass1BI A00(AnonymousClass206 r0) {
        AnonymousClass1BI r02 = r0.A0v.A00;
        C17960vV.A07(r02);
        return r02;
    }

    public static AnonymousClass205 A01(AnonymousClass1BI r1, String str, boolean z) {
        return new AnonymousClass205(r1, str, z);
    }

    public int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = (31 + i) * 31;
        String str = this.A01;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        AnonymousClass1BI r0 = this.A00;
        if (r0 != null) {
            i3 = r0.hashCode();
        }
        return i4 + i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Key(id=");
        sb.append(this.A01);
        sb.append(", isFromMe=");
        sb.append(this.A02);
        sb.append(", chatJid=");
        sb.append(this.A00);
        sb.append(")");
        return sb.toString();
    }

    public AnonymousClass205(AnonymousClass205 r2) {
        this.A02 = r2.A02;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
    }

    public AnonymousClass205(AnonymousClass1BI r1, String str, boolean z) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = r1;
    }
}
