package X;

/* renamed from: X.AjF  reason: case insensitive filesystem */
public final /* synthetic */ class C21386AjF implements Runnable {
    public final /* synthetic */ C195839tz A00;
    public final /* synthetic */ A2M A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        if (r3 == 1) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f5, code lost:
        if (r1 == 1) goto L_0x00f7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r0 = r22
            X.A2M r9 = r0.A01
            X.9tz r14 = r0.A00
            java.lang.String r8 = r0.A03
            java.lang.Boolean r7 = r0.A02
            java.lang.String r15 = r0.A04
            java.lang.String r13 = r0.A05
            boolean r11 = r0.A06
            X.0z4 r3 = r9.A06
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r3)
            java.lang.String r1 = "flows_analytics_id"
            java.lang.String r2 = X.C17880vN.A0r(r0, r1)
            if (r2 != 0) goto L_0x0029
            java.lang.String r2 = X.C17890vO.A0Q()
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r3)
            X.C17880vN.A1E(r0, r1, r2)
        L_0x0029:
            X.C18070vi.A0X(r2)
            r6 = 0
            if (r14 == 0) goto L_0x0058
            java.lang.String r0 = r14.A0C
            X.A67 r1 = X.A67.A00
            byte[] r0 = X.C108975cc.A1O(r0)
            long r18 = r1.A02(r0)
            r0 = 52
            long r0 = r18 >>> r0
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r3 = 0
        L_0x0044:
            r16 = 1
            long r16 = r16 & r18
            r4 = 0
            r1 = 1
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x005b
            r0 = 52
            if (r3 >= r0) goto L_0x005b
            int r3 = r3 + 1
            long r18 = r18 >>> r1
            goto L_0x0044
        L_0x0058:
            r5 = r6
            r10 = r6
            goto L_0x0065
        L_0x005b:
            r0 = 23
            int r0 = java.lang.Math.min(r3, r0)
            java.lang.Long r5 = X.C17880vN.A0n(r0)
        L_0x0065:
            X.A67 r1 = X.A67.A00
            byte[] r0 = X.C108975cc.A1O(r2)
            long r20 = r1.A02(r0)
            r0 = 52
            long r18 = r20 >>> r0
            r2 = 0
        L_0x0074:
            r16 = 1
            long r16 = r16 & r20
            r3 = 0
            r1 = 1
            int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0088
            r0 = 52
            if (r2 >= r0) goto L_0x0088
            int r2 = r2 + 1
            long r20 = r20 >>> r1
            goto L_0x0074
        L_0x0088:
            r0 = 23
            int r0 = java.lang.Math.min(r2, r0)
            long r0 = (long) r0
            X.8rd r4 = new X.8rd
            r4.<init>()
            r4.A06 = r15
            r4.A08 = r13
            if (r14 == 0) goto L_0x012b
            java.lang.String r2 = r14.A07
        L_0x009c:
            r4.A07 = r2
            if (r14 == 0) goto L_0x0129
            X.9rh r2 = r14.A03
            if (r2 == 0) goto L_0x0129
            int r3 = r2.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            if (r2 == 0) goto L_0x0129
            r2 = 1
            if (r3 != r2) goto L_0x0129
        L_0x00af:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.A01 = r2
            if (r11 == 0) goto L_0x0127
            java.lang.Boolean r2 = r9.A03
        L_0x00b9:
            r4.A00 = r2
            r4.A04 = r10
            r4.A05 = r5
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            r4.A02 = r3
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            r4.A03 = r12
            X.0ve r2 = r9.A07
            r1 = 9969(0x26f1, float:1.397E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0110
            X.8re r2 = new X.8re
            r2.<init>()
            r2.A06 = r15
            r2.A08 = r13
            if (r14 == 0) goto L_0x0125
            java.lang.String r0 = r14.A07
        L_0x00e4:
            r2.A07 = r0
            if (r14 == 0) goto L_0x0123
            X.9rh r0 = r14.A03
            if (r0 == 0) goto L_0x0123
            int r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0123
            r0 = 1
            if (r1 != r0) goto L_0x0123
        L_0x00f7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
            if (r11 == 0) goto L_0x0121
            java.lang.Boolean r0 = r9.A03
        L_0x0101:
            r2.A00 = r0
            r2.A04 = r10
            r2.A05 = r5
            r2.A02 = r3
            r2.A03 = r12
            X.18K r0 = r9.A08
            r0.CC4(r2)
        L_0x0110:
            if (r8 == 0) goto L_0x011c
            r9.A05 = r8
            r9.A03 = r7
        L_0x0116:
            X.18K r0 = r9.A08
            r0.CC4(r4)
            return
        L_0x011c:
            r9.A05 = r6
            r9.A03 = r6
            goto L_0x0116
        L_0x0121:
            r0 = r7
            goto L_0x0101
        L_0x0123:
            r0 = 2
            goto L_0x00f7
        L_0x0125:
            r0 = r6
            goto L_0x00e4
        L_0x0127:
            r2 = r7
            goto L_0x00b9
        L_0x0129:
            r2 = 2
            goto L_0x00af
        L_0x012b:
            r2 = r6
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21386AjF.run():void");
    }

    public /* synthetic */ C21386AjF(C195839tz r1, A2M a2m, Boolean bool, String str, String str2, String str3, boolean z) {
        this.A01 = a2m;
        this.A00 = r1;
        this.A03 = str;
        this.A02 = bool;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = z;
    }
}
