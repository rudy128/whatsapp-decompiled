package X;

/* renamed from: X.09Z  reason: invalid class name */
public final class AnonymousClass09Z extends AnonymousClass0HD {
    public final int A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass09Z) {
                long j = this.A01;
                AnonymousClass09Z r8 = (AnonymousClass09Z) obj;
                long j2 = r8.A01;
                C02540Ek r0 = C05100Qk.A06;
                if (!(j == j2 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass09Z(long r4, int r6) {
        /*
            r3 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0012
            android.graphics.BlendModeColorFilter r2 = X.C02520Ei.A00(r6, r4)
        L_0x000a:
            r3.<init>(r2)
            r3.A01 = r4
            r3.A00 = r6
            return
        L_0x0012:
            int r1 = X.AnonymousClass0Oy.A00(r4)
            android.graphics.PorterDuff$Mode r0 = X.AnonymousClass0LI.A01(r6)
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r2.<init>(r1, r0)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Z.<init>(long, int):void");
    }

    public int hashCode() {
        return AnonymousClass001.A0I(this.A01) + this.A00;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BlendModeColorFilter(color=");
        AnonymousClass000.A1F(A10, this.A01);
        A10.append(", blendMode=");
        int i = this.A00;
        if (i == 0) {
            str = "Clear";
        } else if (i == 1) {
            str = "Src";
        } else if (i == 2) {
            str = "Dst";
        } else if (i == 3) {
            str = "SrcOver";
        } else if (i == 4) {
            str = "DstOver";
        } else if (i == 5) {
            str = "SrcIn";
        } else if (i == 6) {
            str = "DstIn";
        } else if (i == 7) {
            str = "SrcOut";
        } else if (i == 8) {
            str = "DstOut";
        } else if (i == 9) {
            str = "SrcAtop";
        } else if (i == 10) {
            str = "DstAtop";
        } else if (i == 11) {
            str = "Xor";
        } else if (i == 12) {
            str = "Plus";
        } else if (i == 13) {
            str = "Modulate";
        } else {
            str = "Screen";
        }
        return AnonymousClass001.A1F(str, A10);
    }
}
