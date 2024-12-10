package X;

/* renamed from: X.9mu  reason: invalid class name and case insensitive filesystem */
public final class C191629mu {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(new C21998Aw0(this));
    public final C18100vl A04 = AnonymousClass1DF.A01(new C21999Aw1(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new C22000Aw2(this));
    public final AnonymousClass00H A06;

    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object, X.4rF] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass9ZI A00(X.C179549Ik r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, int r25) {
        /*
            r19 = this;
            r4 = 0
            r7 = r19
            X.0vl r9 = r7.A04
            java.lang.Object r6 = r9.getValue()
            X.11P r6 = (X.AnonymousClass11P) r6
            X.C18070vi.A0X(r6)
            X.00H r5 = r7.A06
            java.lang.String r2 = java.lang.Integer.toString(r24)
            X.C18070vi.A0X(r2)
            X.0vl r0 = r7.A03
            java.lang.Object r1 = r0.getValue()
            X.0vc r1 = (X.C18010vc) r1
            java.lang.String r0 = "com.whatsapp.psa.qp_surface"
            android.content.SharedPreferences r0 = X.C108955ca.A0C(r1, r0)
            X.A6F r3 = new X.A6F
            r3.<init>(r0, r6, r5, r2)
            X.9Ik r5 = X.C179549Ik.IMPRESSION
            r8 = r20
            r11 = r21
            r0 = r25
            if (r8 != r5) goto L_0x0046
            r9.getValue()
            long r9 = java.lang.System.currentTimeMillis()
            long r1 = r3.A04(r5, r11)
            long r9 = r9 - r1
            long r1 = (long) r0
            int r6 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r6 > 0) goto L_0x0046
            return r4
        L_0x0046:
            X.0vl r1 = r7.A05
            java.lang.Object r9 = r1.getValue()
            X.CTd r9 = (X.C25003CTd) r9
            X.0vl r1 = r9.A05
            r1.getValue()
            java.util.LinkedHashMap r6 = X.C17880vN.A13()
            java.lang.String r2 = "nux_id"
            java.lang.String r1 = java.lang.String.valueOf(r24)
            r6.put(r2, r1)
            r2 = r22
            if (r22 == 0) goto L_0x0069
            java.lang.String r1 = "instance_log_data"
            r6.put(r1, r2)
        L_0x0069:
            java.lang.String r12 = X.AnonymousClass8BW.A0m(r6)
            int r2 = r8.ordinal()
            r1 = 0
            if (r2 == r1) goto L_0x008a
            r1 = 1
            if (r2 == r1) goto L_0x008d
            r1 = 2
            if (r2 == r1) goto L_0x0087
            r1 = 3
            java.lang.String r13 = "dismiss"
            if (r2 == r1) goto L_0x008f
            r1 = 4
            if (r2 == r1) goto L_0x008f
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0087:
            java.lang.String r13 = "secondary_click"
            goto L_0x008f
        L_0x008a:
            java.lang.String r13 = "impression"
            goto L_0x008f
        L_0x008d:
            java.lang.String r13 = "primary_click"
        L_0x008f:
            X.0vl r1 = r9.A06
            r1.getValue()
            long r6 = java.lang.System.currentTimeMillis()
            long r14 = X.C17880vN.A04(r6)
            X.0vl r7 = r9.A04
            java.lang.Object r1 = r7.getValue()
            X.1OZ r1 = (X.AnonymousClass1OZ) r1
            java.lang.String r10 = r1.A0B()
            X.9F5 r9 = new X.9F5
            r9.<init>(r10, r11, r12, r13, r14)
            X.4rF r1 = new X.4rF
            r1.<init>()
            X.9ZI r6 = new X.9ZI
            r6.<init>()
            r1.element = r6
            java.lang.Object r12 = r7.getValue()
            X.1OZ r12 = (X.AnonymousClass1OZ) r12
            X.1ca r14 = r9.BVP()
            r6 = 8
            X.Ach r13 = new X.Ach
            r13.<init>(r1, r6)
            r6 = 0
            r16 = 376(0x178, float:5.27E-43)
            r15 = r10
            r17 = r6
            r12.A0N(r13, r14, r15, r16, r17)
            java.lang.Object r9 = r1.element
            X.9ZI r9 = (X.AnonymousClass9ZI) r9
            int r1 = r9.A00
            if (r1 != 0) goto L_0x00dd
            r9 = 0
        L_0x00dd:
            long r0 = (long) r0
            r12 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r12
            if (r8 != r5) goto L_0x0162
            java.lang.String r8 = "lastImpressionTime"
            java.lang.String r4 = "lastImpressionForSurface"
        L_0x00e7:
            java.lang.String r5 = "impressionCount"
            X.A6F.A02(r3, r11, r5, r8, r4)
            java.lang.String r4 = "lastQPForImpressionForSurface"
            java.lang.String r5 = X.A6F.A00(r3, r4)
            android.content.SharedPreferences r10 = r3.A00
            android.content.SharedPreferences$Editor r4 = r10.edit()
            X.C17880vN.A1E(r4, r5, r11)
            java.lang.String r4 = "eligibilityDurationAfterFirstImpression"
            java.lang.String r8 = X.A6F.A01(r11, r4)
            long r4 = java.lang.System.currentTimeMillis()
            X.AnonymousClass8BW.A12(r10, r8, r4)
        L_0x0108:
            r5 = r23
            if (r23 == 0) goto L_0x0161
            r4 = 0
            if (r2 != r4) goto L_0x0161
            X.00H r2 = r3.A01
            java.lang.Object r8 = r2.get()
            X.9e2 r8 = (X.C186339e2) r8
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "QpProductSharedPrefs/impression/product="
            X.C17900vP.A0f(r2, r5, r3)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r5)
            java.lang.String r2 = "/product_cooldowns"
            java.lang.String r10 = X.AnonymousClass000.A0y(r2, r3)
            X.0vl r11 = r8.A02
            android.content.SharedPreferences r2 = X.C17880vN.A0C(r11)
            long r4 = r2.getLong(r10, r6)
            X.11P r2 = r8.A00
            long r6 = X.AnonymousClass11P.A01(r2)
            long r6 = r6 / r12
            long r2 = r6 + r0
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()
            java.lang.String r8 = "QpProductSharedPrefs/impression/prior-ts="
            r12.append(r8)
            r12.append(r4)
            java.lang.String r8 = ", current-ts="
            r12.append(r8)
            r12.append(r6)
            java.lang.String r6 = ", impression-duration="
            X.C17900vP.A0m(r6, r12, r0)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0161
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r11)
            X.AnonymousClass8BW.A12(r0, r10, r2)
        L_0x0161:
            return r9
        L_0x0162:
            r5 = 0
            if (r2 == r5) goto L_0x0182
            r5 = 1
            if (r2 == r5) goto L_0x0175
            r5 = 2
            if (r2 == r5) goto L_0x017a
            java.lang.String r8 = "dismissActionTime"
            java.lang.String r5 = "lastDismissForSurface"
            java.lang.String r4 = "dismissActionCount"
            X.A6F.A02(r3, r11, r4, r8, r5)
            goto L_0x0108
        L_0x0175:
            java.lang.String r8 = "primaryActionCount"
            java.lang.String r5 = "primaryActionTime"
            goto L_0x017e
        L_0x017a:
            java.lang.String r8 = "secondaryActionCount"
            java.lang.String r5 = "secondaryActionTime"
        L_0x017e:
            X.A6F.A02(r3, r11, r8, r5, r4)
            goto L_0x0108
        L_0x0182:
            java.lang.String r8 = "lastImpressionTime"
            goto L_0x00e7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191629mu.A00(X.9Ik, java.lang.String, java.lang.String, java.lang.String, int, int):X.9ZI");
    }

    public C191629mu(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0s(r2, r3, r4, r5);
        this.A01 = r2;
        this.A06 = r3;
        this.A00 = r4;
        this.A02 = r5;
    }
}
