package X;

/* renamed from: X.7Sj  reason: invalid class name and case insensitive filesystem */
public class C147247Sj implements AnonymousClass1G2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C147247Sj(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.6UU] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (X.C18070vi.A18(r12, r11.A03) != false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object BJt(java.lang.Object r12, X.C30391dr r13) {
        /*
            r11 = this;
            int r0 = r11.A00
            if (r0 == 0) goto L_0x0056
            boolean r0 = r13 instanceof X.C147597Tt
            if (r0 == 0) goto L_0x0026
            r5 = r13
            X.7Tt r5 = (X.C147597Tt) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0026
            int r2 = r2 - r1
            r5.label = r2
        L_0x0016:
            java.lang.Object r1 = r5.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 == r4) goto L_0x0119
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0026:
            X.7Tt r5 = new X.7Tt
            r5.<init>(r11, r13)
            goto L_0x0016
        L_0x002c:
            X.C30691eM.A01(r1)
            java.lang.Object r2 = r11.A02
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            java.lang.Object r0 = r11.A01
            X.6Tg r0 = (X.C123136Tg) r0
            X.6EK r0 = (X.AnonymousClass6EK) r0
            java.lang.String r0 = r0.A00
            boolean r0 = X.C18070vi.A18(r0, r12)
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = r11.A03
            boolean r1 = X.C18070vi.A18(r12, r0)
            r0 = 0
            if (r1 == 0) goto L_0x004b
        L_0x004a:
            r0 = 1
        L_0x004b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.label = r4
            java.lang.Object r0 = r2.BJt(r0, r5)
            goto L_0x009c
        L_0x0056:
            boolean r0 = r13 instanceof X.C147567Tq
            if (r0 == 0) goto L_0x0078
            r7 = r13
            X.7Tq r7 = (X.C147567Tq) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0078
            int r2 = r2 - r1
            r7.label = r2
        L_0x0068:
            java.lang.Object r1 = r7.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r8 = 1
            if (r0 == 0) goto L_0x007e
            if (r0 == r8) goto L_0x0119
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0078:
            X.7Tq r7 = new X.7Tq
            r7.<init>(r11, r13)
            goto L_0x0068
        L_0x007e:
            X.C30691eM.A01(r1)
            java.lang.Object r6 = r11.A01
            X.1G2 r6 = (X.AnonymousClass1G2) r6
            X.6cM r12 = (X.C126206cM) r12
            boolean r0 = r12 instanceof X.C120476Dv
            if (r0 == 0) goto L_0x009f
            X.6Dv r12 = (X.C120476Dv) r12
            java.lang.Throwable r1 = r12.A01
            java.lang.String r0 = "Avatar sticker search error"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0094:
            X.0wS r9 = X.C18460wS.A00
        L_0x0096:
            r7.label = r8
            java.lang.Object r0 = r6.BJt(r9, r7)
        L_0x009c:
            if (r0 != r3) goto L_0x011c
            return r3
        L_0x009f:
            boolean r0 = r12 instanceof X.C120466Du
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "Avatar sticker search not available"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0094
        L_0x00a9:
            boolean r0 = r12 instanceof X.C120486Dw
            if (r0 == 0) goto L_0x0124
            X.6Dw r12 = (X.C120486Dw) r12
            java.util.List r1 = r12.A01
            java.lang.String r0 = r11.A03
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0094
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x0094
            X.60w r5 = new X.60w
            r5.<init>()
            java.util.ArrayList r9 = X.C29351c6.A0D(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x00cc:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r2 = r10.next()
            X.6Td r2 = (X.C123106Td) r2
            boolean r0 = r2 instanceof X.C120496Dx
            java.lang.String r1 = "sticker-"
            if (r0 == 0) goto L_0x00f3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            X.6Dx r2 = (X.C120496Dx) r2
            java.lang.String r0 = r2.A00
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.60r r4 = new X.60r
            r4.<init>(r5, r0)
        L_0x00ef:
            r9.add(r4)
            goto L_0x00cc
        L_0x00f3:
            boolean r0 = r2 instanceof X.C120506Dy
            if (r0 == 0) goto L_0x010c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            X.6Dy r2 = (X.C120506Dy) r2
            X.77d r2 = r2.A00
        L_0x00ff:
            java.lang.String r0 = r2.A07
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            r0 = 0
            X.60s r4 = new X.60s
            r4.<init>(r5, r2, r1, r0)
            goto L_0x00ef
        L_0x010c:
            boolean r0 = r2 instanceof X.C120516Dz
            if (r0 == 0) goto L_0x011f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            X.6Dz r2 = (X.C120516Dz) r2
            X.77d r2 = r2.A00
            goto L_0x00ff
        L_0x0119:
            X.C30691eM.A01(r1)
        L_0x011c:
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x011f:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0124:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147247Sj.BJt(java.lang.Object, X.1dr):java.lang.Object");
    }
}
