package X;

/* renamed from: X.9x5  reason: invalid class name and case insensitive filesystem */
public final class C197679x5 {
    public final C182799Vt A00;

    public C197679x5(C182799Vt r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: X.9zB} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C184829ba A00(X.C197679x5 r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.util.Map r22, java.util.Map r23) {
        /*
            java.lang.String r1 = "type"
            r0 = r22
            java.lang.Object r8 = r0.get(r1)
            java.lang.String r1 = "resource"
            boolean r3 = X.C18070vi.A18(r8, r1)
            java.lang.String r5 = "result_selector"
            java.lang.String r1 = "next"
            java.lang.String r4 = "result_path"
            java.lang.String r6 = "parameters"
            java.lang.String r7 = "input_selector"
            java.lang.String r2 = "catch"
            r11 = 0
            r10 = r19
            if (r3 == 0) goto L_0x0091
            java.lang.String r3 = "id"
            java.lang.String r17 = X.AnonymousClass8BU.A0p(r3, r0)
            java.util.Map r21 = X.AnonymousClass8BW.A0v(r7, r0)
            java.lang.Object r6 = r0.get(r6)
            boolean r3 = r6 instanceof java.util.Map
            if (r3 == 0) goto L_0x008e
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L_0x008e
            X.9Ip r3 = X.C179599Ip.ADDITIONAL_PARAMS
            java.lang.String r3 = r3.key
            r7 = r23
            X.1D6 r3 = X.AnonymousClass1D6.A01(r3, r7)
            java.util.Map r22 = X.AnonymousClass1D7.A0G(r6, r3)
        L_0x0043:
            java.util.Map r23 = X.AnonymousClass8BW.A0v(r5, r0)
            java.lang.Object r4 = r0.get(r4)
            boolean r3 = r4 instanceof java.lang.String
            if (r3 == 0) goto L_0x008b
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x008b
            java.lang.String r18 = X.AnonymousClass8BW.A0h(r4)
        L_0x0057:
            java.lang.String r19 = X.AnonymousClass8BW.A0f(r1, r0)
            java.lang.String r1 = "merge"
            java.lang.Object r3 = r0.get(r1)
            if (r3 != 0) goto L_0x0065
            java.lang.String r3 = "replace"
        L_0x0065:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = "merge_param"
            java.lang.Object r14 = r0.get(r1)
            java.lang.Object r1 = r0.get(r2)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x007e
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x007e
            X.9zB r11 = new X.9zB
            r11.<init>(r1)
        L_0x007e:
            X.90N r12 = new X.90N
            r15 = r20
            r13 = r11
            r16 = r10
            r20 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r12
        L_0x008b:
            java.lang.String r18 = "$"
            goto L_0x0057
        L_0x008e:
            r22 = r11
            goto L_0x0043
        L_0x0091:
            java.lang.String r3 = "choice"
            boolean r3 = X.C18070vi.A18(r8, r3)
            if (r3 == 0) goto L_0x00dd
            java.lang.String r1 = "default"
            java.lang.String r5 = X.AnonymousClass8BU.A0p(r1, r0)
            java.lang.String r1 = "choices"
            java.lang.Object r3 = r0.get(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>"
            X.C18070vi.A0z(r3, r1)
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r3.iterator()
        L_0x00b4:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00c8
            java.lang.Object r1 = r3.next()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r1 = X.AnonymousClass8BW.A0m(r1)
            r4.add(r1)
            goto L_0x00b4
        L_0x00c8:
            java.lang.Object r1 = r0.get(r2)
            if (r1 == 0) goto L_0x00d7
            java.lang.String r0 = X.AnonymousClass8BU.A0p(r2, r0)
            X.9zB r11 = new X.9zB
            r11.<init>(r0)
        L_0x00d7:
            X.90L r6 = new X.90L
            r6.<init>(r11, r10, r5, r4)
            return r6
        L_0x00dd:
            java.lang.String r3 = "succeed"
            boolean r3 = X.C18070vi.A18(r8, r3)
            if (r3 == 0) goto L_0x00ef
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            X.90K r6 = new X.90K
            r6.<init>(r10, r11)
            return r6
        L_0x00ef:
            java.lang.String r3 = "pass"
            boolean r3 = X.C18070vi.A18(r8, r3)
            if (r3 == 0) goto L_0x011e
            java.util.Map r5 = X.AnonymousClass8BW.A0v(r7, r0)
            java.util.Map r6 = X.AnonymousClass8BW.A0v(r6, r0)
            java.lang.Object r3 = r0.get(r4)
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L_0x011b
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x011b
            java.lang.String r3 = X.AnonymousClass8BW.A0h(r3)
        L_0x010f:
            java.lang.String r4 = X.AnonymousClass8BW.A0f(r1, r0)
            X.90M r11 = new X.90M
            r1 = r11
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r11
        L_0x011b:
            java.lang.String r3 = "$"
            goto L_0x010f
        L_0x011e:
            java.lang.String r3 = "subflow"
            boolean r3 = X.C18070vi.A18(r8, r3)
            if (r3 == 0) goto L_0x018d
            r3 = r18
            X.9Vt r3 = r3.A00
            java.util.Map r16 = X.AnonymousClass8BW.A0v(r7, r0)
            java.util.Map r17 = X.AnonymousClass8BW.A0v(r6, r0)
            java.util.Map r18 = X.AnonymousClass8BW.A0v(r5, r0)
            java.lang.Object r5 = r0.get(r4)
            boolean r4 = r5 instanceof java.lang.String
            if (r4 == 0) goto L_0x018a
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x018a
            java.lang.String r12 = X.AnonymousClass8BW.A0h(r5)
        L_0x0146:
            java.lang.Object r4 = r0.get(r2)
            boolean r2 = r4 instanceof java.lang.String
            if (r2 == 0) goto L_0x0188
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0188
            X.9zB r8 = new X.9zB
            r8.<init>(r4)
        L_0x0157:
            java.lang.Object r2 = r0.get(r1)
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L_0x0162
            java.lang.String r2 = (java.lang.String) r2
            r11 = r2
        L_0x0162:
            java.lang.String r1 = "launch_mode"
            java.lang.String r13 = X.AnonymousClass8BU.A0p(r1, r0)
            java.lang.String r1 = "config"
            java.lang.String r14 = X.AnonymousClass8BU.A0p(r1, r0)
            X.10F r0 = r3.A00
            X.10E r0 = r0.A00
            X.9jQ r9 = X.AnonymousClass8BV.A0H(r0)
            X.00S r0 = r0.AS6
            java.lang.Object r7 = r0.get()
            X.2hh r7 = (X.C56582hh) r7
            X.90O r6 = new X.90O
            r15 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r6
        L_0x0188:
            r8 = r11
            goto L_0x0157
        L_0x018a:
            java.lang.String r12 = "$"
            goto L_0x0146
        L_0x018d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197679x5.A00(X.9x5, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map):X.9ba");
    }
}
