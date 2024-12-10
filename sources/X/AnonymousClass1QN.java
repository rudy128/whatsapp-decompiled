package X;

/* renamed from: X.1QN  reason: invalid class name */
public class AnonymousClass1QN {
    public final AnonymousClass18O A00;
    public final AnonymousClass11P A01;
    public final C18030ve A02;
    public final AnonymousClass1QD A03;
    public final AnonymousClass1QJ A04;
    public final AnonymousClass1QH A05;

    public boolean A01() {
        if (A04(2)) {
            if (!C18020vd.A05(C18040vf.A02, this.A02, 1159)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A03() {
        if (A04(0) || A01()) {
            return true;
        }
        this.A04.A02();
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(int r9) {
        /*
            r8 = this;
            r7 = 1
            if (r9 == 0) goto L_0x005b
            if (r9 != r7) goto L_0x003b
            X.18O r1 = r8.A00
            X.18R r0 = X.AnonymousClass18O.A0Q
        L_0x0009:
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x003b
            X.1QD r6 = r8.A03
            java.lang.String r5 = "payments_enabled_till"
            android.content.SharedPreferences r2 = r6.A03()
            r0 = -1
            long r3 = r2.getLong(r5, r0)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0032
            android.content.SharedPreferences r0 = r6.A03()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r5)
            r0.apply()
        L_0x0032:
            X.1QJ r0 = r8.A04
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0060
            return r7
        L_0x003b:
            X.11P r0 = r8.A01
            long r4 = X.AnonymousClass11P.A01(r0)
            X.1QD r0 = r8.A03
            if (r9 == 0) goto L_0x0058
            if (r9 == r7) goto L_0x0058
            java.lang.String r3 = "merchant_payments_enabled_till"
        L_0x0049:
            android.content.SharedPreferences r2 = r0.A03()
            r0 = -1
            long r1 = r2.getLong(r3, r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0060
            goto L_0x0032
        L_0x0058:
            java.lang.String r3 = "payments_enabled_till"
            goto L_0x0049
        L_0x005b:
            X.18O r1 = r8.A00
            X.18R r0 = X.AnonymousClass18O.A0R
            goto L_0x0009
        L_0x0060:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QN.A04(int):boolean");
    }

    public boolean A02() {
        if (this.A00.A09(AnonymousClass18O.A0Q)) {
            return true;
        }
        return false;
    }

    public AnonymousClass1QN(AnonymousClass18O r1, AnonymousClass11P r2, C18030ve r3, AnonymousClass1QD r4, AnonymousClass1QJ r5, AnonymousClass1QH r6) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }
}
