package X;

/* renamed from: X.20e  reason: invalid class name and case insensitive filesystem */
public abstract class C436020e {
    public boolean A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.2I3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.2I3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.2I4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.2I0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.2I0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.2I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.20f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: X.20x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.2I3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.2I3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.2I3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: X.2I4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: X.2I0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: X.2I0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: X.2I0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: X.2I0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.2I3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.2I3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: X.2I3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: X.2I4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C436120f
            if (r0 == 0) goto L_0x0093
            r2 = r3
            X.20f r2 = (X.C436120f) r2
            java.lang.Integer r0 = r2.A05
            if (r0 == 0) goto L_0x0120
            X.20E r0 = r2.A06
            if (r0 == 0) goto L_0x008f
            java.lang.Integer r0 = r2.A04
            if (r0 == 0) goto L_0x0113
            X.20j r0 = r2.A03
            if (r0 != 0) goto L_0x0039
            X.00H r0 = r2.A07
            java.lang.Object r0 = r0.get()
            X.20b r0 = (X.C435720b) r0
            X.0vp r0 = r0.A05
            java.lang.Object r1 = r0.get()
            X.C18070vi.A0X(r1)
            X.20j r1 = (X.C436520j) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r2.A03 = r1
            r1.A01()
            r1.A00()
            r0 = 1
            r1.A00 = r0
        L_0x0039:
            X.20u r0 = r2.A02
            if (r0 != 0) goto L_0x0064
            X.00H r0 = r2.A07
            java.lang.Object r0 = r0.get()
            X.20b r0 = (X.C435720b) r0
            X.0vp r0 = r0.A04
            java.lang.Object r1 = r0.get()
            X.C18070vi.A0X(r1)
            X.20u r1 = (X.C437520u) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r2.A02 = r1
            X.20v r0 = X.C437620v.A00
            r1.A01()
            r0.invoke(r1)
            r1.A00()
            r0 = 1
            r1.A00 = r0
        L_0x0064:
            X.20x r0 = r2.A01
            if (r0 != 0) goto L_0x00f6
            X.00H r0 = r2.A07
            java.lang.Object r0 = r0.get()
            X.20b r0 = (X.C435720b) r0
            X.0vp r0 = r0.A06
            java.lang.Object r1 = r0.get()
            X.C18070vi.A0X(r1)
            X.20x r1 = (X.C437820x) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r2.A01 = r1
            X.20y r0 = X.C437920y.A00
            r1.A01()
            r0.invoke(r1)
            r1.A00()     // Catch:{ all -> 0x008d }
            goto L_0x00f3
        L_0x008d:
            r0 = move-exception
            throw r0
        L_0x008f:
            java.lang.String r0 = "messageClass was not specified."
            goto L_0x0122
        L_0x0093:
            boolean r0 = r3 instanceof X.AnonymousClass2I2
            if (r0 == 0) goto L_0x00a8
            r1 = r3
            X.2I2 r1 = (X.AnonymousClass2I2) r1
            X.20E r0 = r1.A01
            if (r0 == 0) goto L_0x00ba
            X.0vp r0 = r1.A00
        L_0x00a0:
            if (r0 != 0) goto L_0x00f6
            java.lang.String r0 = "defaultImplementation was not specified."
        L_0x00a4:
            r1.A02(r0)
            goto L_0x0125
        L_0x00a8:
            boolean r0 = r3 instanceof X.AnonymousClass2I1
            if (r0 != 0) goto L_0x011a
            boolean r0 = r3 instanceof X.AnonymousClass2I0
            if (r0 == 0) goto L_0x00bd
            r1 = r3
            X.2I0 r1 = (X.AnonymousClass2I0) r1
            X.20E r0 = r1.A01
            if (r0 == 0) goto L_0x00ba
            X.0vp r0 = r1.A00
            goto L_0x00a0
        L_0x00ba:
            java.lang.String r0 = "integrationInterface was not specified."
            goto L_0x00a4
        L_0x00bd:
            boolean r0 = r3 instanceof X.AnonymousClass2I3
            if (r0 == 0) goto L_0x00f7
            r2 = r3
            X.2I3 r2 = (X.AnonymousClass2I3) r2
            X.20E r0 = r2.A04
            if (r0 == 0) goto L_0x0116
            java.lang.Integer r0 = r2.A03
            if (r0 == 0) goto L_0x0113
            X.2I0 r0 = r2.A02
            if (r0 == 0) goto L_0x0110
            X.2I4 r0 = r2.A01
            if (r0 != 0) goto L_0x00f6
            X.00H r0 = r2.A05
            java.lang.Object r0 = r0.get()
            X.20b r0 = (X.C435720b) r0
            X.0vp r0 = r0.A08
            java.lang.Object r1 = r0.get()
            X.C18070vi.A0X(r1)
            X.2I4 r1 = (X.AnonymousClass2I4) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r2.A01 = r1
            r1.A01()
            r1.A00()
        L_0x00f3:
            r0 = 1
            r1.A00 = r0
        L_0x00f6:
            return
        L_0x00f7:
            boolean r0 = r3 instanceof X.C47332Hz
            if (r0 != 0) goto L_0x011a
            boolean r0 = r3 instanceof X.C47322Hy
            if (r0 == 0) goto L_0x0102
            java.lang.String r0 = "link was not specified."
            goto L_0x011c
        L_0x0102:
            boolean r0 = r3 instanceof X.C47312Hx
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = "className was not specified."
            goto L_0x011c
        L_0x0109:
            boolean r0 = r3 instanceof X.C47302Hw
            if (r0 == 0) goto L_0x00f6
            java.lang.String r0 = "implementationClass was not specified."
            goto L_0x011c
        L_0x0110:
            java.lang.String r0 = "integrationPoint was not configured."
            goto L_0x0122
        L_0x0113:
            java.lang.String r0 = "integrationState was not specified."
            goto L_0x0122
        L_0x0116:
            java.lang.String r0 = "subsystem was not specified."
            goto L_0x0122
        L_0x011a:
            java.lang.String r0 = "messageClass was not specified."
        L_0x011c:
            r3.A02(r0)
            goto L_0x0125
        L_0x0120:
            java.lang.String r0 = "messageType was not specified."
        L_0x0122:
            r2.A02(r0)
        L_0x0125:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C436020e.A00():void");
    }

    public final void A01() {
        if (this.A00) {
            A02("Builder already configured. Cannot reuse.");
            throw null;
        }
    }

    public final void A02(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C60662oP.A01(new AnonymousClass20F(getClass()).A00));
        sb.append(": ");
        sb.append(str);
        throw new AnonymousClass3Ee(sb.toString());
    }
}
