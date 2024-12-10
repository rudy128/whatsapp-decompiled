package X;

import android.content.Context;

/* renamed from: X.4ki  reason: invalid class name and case insensitive filesystem */
public final class C94494ki implements AnonymousClass5ZD {
    public final Context A00;
    public final AnonymousClass5ZN A01;
    public final AnonymousClass5ZT A02;
    public final C28471E2m A03;
    public final AnonymousClass1E7 A04;
    public final AnonymousClass1EC A05;
    public final C436420i A06;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: X.4C3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: X.BwV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: X.BwV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: X.4C3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: X.4C3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: X.4C3} */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r0.length() == 0) goto L_0x0028;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List getCTAViews() {
        /*
            r28 = this;
            r2 = r28
            X.5ZN r1 = r2.A01
            android.content.Context r11 = r2.A00
            X.20i r0 = r2.A06
            X.1EC r9 = r2.A05
            r8 = 0
            r15 = 3
            r13 = 0
            r10 = r1
            r12 = r9
            r14 = r0
            r16 = r8
            X.4C5 r7 = r10.BGo(r11, r12, r13, r14, r15, r16)
            X.1E7 r0 = r2.A04
            if (r0 == 0) goto L_0x010d
            java.lang.String r0 = r0.A0K()
        L_0x001e:
            r6 = 1
            if (r0 == 0) goto L_0x0028
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            r0 = 2
            android.view.View[] r5 = new android.view.View[r0]
            if (r1 == 0) goto L_0x0106
            X.E2m r0 = r2.A03
            X.4lE r0 = (X.C94814lE) r0
            int r1 = r0.A00
            java.lang.Object r0 = r0.A01
            if (r1 == 0) goto L_0x00a1
            X.10H r0 = (X.AnonymousClass10H) r0
            X.10E r3 = r0.A00
            X.10G r4 = r3.A00
            X.1KB r12 = X.AnonymousClass10E.A12(r3)
            X.10I r27 = X.AnonymousClass10E.AL1(r3)
            X.1Mn r26 = X.AnonymousClass3MZ.A0y(r3)
            X.18O r13 = X.AnonymousClass3MZ.A0S(r3)
            X.1M9 r15 = X.AnonymousClass10E.A4z(r3)
            X.1Me r16 = X.AnonymousClass3MZ.A0g(r3)
            X.126 r22 = X.AnonymousClass3MY.A0X(r3)
            X.12M r24 = X.AnonymousClass3Ma.A0h(r3)
            X.1NN r19 = X.AnonymousClass3Ma.A0e(r3)
            X.00S r0 = r4.A2U
            java.lang.Object r2 = r0.get()
            X.4QE r2 = (X.AnonymousClass4QE) r2
            X.1MZ r20 = X.AnonymousClass3MY.A0V(r3)
            X.11E r14 = X.AnonymousClass3MZ.A0d(r3)
            X.00S r0 = r4.AAa
            java.lang.Object r1 = r0.get()
            X.E6c r1 = (X.C28528E6c) r1
            X.00S r0 = r4.AAb
            java.lang.Object r0 = r0.get()
            X.5Zt r0 = (X.C107455Zt) r0
            X.0vb r18 = X.AnonymousClass10E.A6Q(r3)
            X.BwV r10 = new X.BwV
            r21 = r0
            r23 = r2
            r25 = r9
            r17 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r4.AXG(r10)
        L_0x009c:
            java.util.List r0 = X.C18070vi.A0N(r10, r7, r5, r8, r6)
            return r0
        L_0x00a1:
            X.1K2 r0 = (X.AnonymousClass1K2) r0
            X.1K1 r3 = r0.A00
            X.10E r4 = r0.A01
            X.1KB r12 = X.AnonymousClass10E.A12(r4)
            X.10I r27 = X.AnonymousClass10E.AL1(r4)
            X.1Mn r26 = X.AnonymousClass3MZ.A0y(r4)
            X.18O r13 = X.AnonymousClass3MZ.A0S(r4)
            X.1M9 r15 = X.AnonymousClass10E.A4z(r4)
            X.1Me r16 = X.AnonymousClass3MZ.A0g(r4)
            X.126 r22 = X.AnonymousClass3MY.A0X(r4)
            X.12M r24 = X.AnonymousClass3Ma.A0h(r4)
            X.1NN r19 = X.AnonymousClass3Ma.A0e(r4)
            X.10G r0 = r4.A00
            X.00S r0 = r0.A2U
            java.lang.Object r2 = r0.get()
            X.4QE r2 = (X.AnonymousClass4QE) r2
            X.1MZ r20 = X.AnonymousClass3MY.A0V(r4)
            X.11E r14 = X.AnonymousClass3MZ.A0d(r4)
            X.00S r0 = r3.A7A
            java.lang.Object r1 = r0.get()
            X.E6c r1 = (X.C28528E6c) r1
            X.00S r0 = r3.A2B
            java.lang.Object r0 = r0.get()
            X.5Zt r0 = (X.C107455Zt) r0
            X.0vb r18 = X.AnonymousClass10E.A6Q(r4)
            X.BwV r10 = new X.BwV
            r21 = r0
            r23 = r2
            r25 = r9
            r17 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3.A8w(r10)
            goto L_0x009c
        L_0x0106:
            X.5ZT r0 = r2.A02
            X.4C3 r10 = r0.BGS(r11, r9)
            goto L_0x009c
        L_0x010d:
            r0 = 0
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94494ki.getCTAViews():java.util.List");
    }

    public C94494ki(Context context, AnonymousClass5ZN r2, AnonymousClass5ZT r3, C28471E2m e2m, AnonymousClass1E7 r5, AnonymousClass1EC r6, C436420i r7) {
        C18070vi.A0o(r3, r2, e2m);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = e2m;
        this.A00 = context;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = r5;
    }
}
