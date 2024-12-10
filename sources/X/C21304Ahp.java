package X;

/* renamed from: X.Ahp  reason: case insensitive filesystem */
public final class C21304Ahp implements C22528BBl {
    /* JADX WARNING: type inference failed for: r11v1, types: [X.Ahu] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        if ((r3 - r6) <= ((long) r5)) goto L_0x0081;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C188299hC BCN(X.C188729ht r18, X.AnonymousClass5YR r19) {
        /*
            r17 = this;
            r0 = 0
            r6 = r18
            r2 = r19
            X.AnonymousClass3Ma.A1N(r2, r0, r6)
            java.lang.Integer r1 = r6.A0A
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            boolean r1 = X.AnonymousClass000.A1Z(r1, r0)
            r11 = 0
            r5 = r2
            X.Ai4 r5 = (X.C21319Ai4) r5
            boolean r0 = r5.A0N
            if (r0 != 0) goto L_0x0086
            boolean r0 = r5.A0K
            if (r0 != 0) goto L_0x0086
            if (r1 == 0) goto L_0x0028
            X.9ZK r0 = new X.9ZK
            r0.<init>(r6)
            X.Ahw r11 = new X.Ahw
            r11.<init>(r0)
        L_0x0028:
            X.A6F r9 = r6.A08
            java.lang.String r8 = r5.A0F
            long r3 = r6.A00
            long r6 = r6.A01
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0081
            android.content.SharedPreferences r2 = r9.A00
            java.lang.String r10 = "lastImpressionForSurface"
            java.lang.String r10 = X.A6F.A00(r9, r10)
            long r0 = r2.getLong(r10, r0)
            long r6 = r6 + r0
            if (r11 == 0) goto L_0x0051
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.A00 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r11.A01 = r0
        L_0x0051:
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0081
            java.lang.String r0 = "lastQPForImpressionForSurface"
            java.lang.String r1 = X.A6F.A00(r9, r0)
            java.lang.String r0 = ""
            java.lang.String r0 = r2.getString(r1, r0)
            boolean r0 = X.C18070vi.A18(r0, r8)
            if (r0 == 0) goto L_0x008e
            java.lang.String r0 = "eligibilityDurationAfterFirstImpression"
            java.lang.String r0 = X.A6F.A01(r8, r0)
            long r6 = X.C17890vO.A05(r2, r0)
            int r5 = r5.A00
            if (r5 <= 0) goto L_0x008e
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x008e
            long r3 = r3 - r6
            long r1 = (long) r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x008e
        L_0x0081:
            X.9hC r8 = X.C196959vv.A01(r11)
            return r8
        L_0x0086:
            if (r1 == 0) goto L_0x0081
            X.Ahu r11 = new X.Ahu
            r11.<init>(r2)
            goto L_0x0081
        L_0x008e:
            r9 = 0
            r14 = 0
            X.9hC r8 = new X.9hC
            r12 = r9
            r13 = r9
            r16 = r14
            r10 = r9
            r15 = r14
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21304Ahp.BCN(X.9ht, X.5YR):X.9hC");
    }

    public String CS6() {
        return "client_surface_delay";
    }
}
