package X;

/* renamed from: X.0Mr  reason: invalid class name and case insensitive filesystem */
public final class C04310Mr {
    public static final C04310Mr A01 = new C04310Mr();
    public static final C04310Mr A02 = new C04310Mr();
    public final C06970a9 A00 = C06970a9.A02(new C17550uq[16]);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0063 A[EDGE_INSN: B:64:0x0063->B:30:0x0063 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00() {
        /*
            r12 = this;
            X.0Mr r0 = A02
            java.lang.String r1 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r12 == r0) goto L_0x00ba
            X.0Mr r0 = A01
            if (r12 == r0) goto L_0x00b5
            X.0a9 r0 = r12.A00
            int r8 = r0.A00
            if (r8 == 0) goto L_0x00ae
            r11 = 0
            if (r8 <= 0) goto L_0x0067
            java.lang.Object[] r7 = r0.A01
            r6 = 0
        L_0x0016:
            r1 = r7[r6]
            X.0uq r1 = (X.C17550uq) r1
            r10 = 1024(0x400, float:1.435E-42)
            r0 = r1
            X.0XW r0 = (X.AnonymousClass0XW) r0
            X.0XW r0 = r0.A03
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x00a7
            X.0a9 r5 = X.C06970a9.A01()
            X.0XW r1 = (X.AnonymousClass0XW) r1
            X.0XW r9 = r1.A03
            X.0XW r0 = r9.A02
            if (r0 == 0) goto L_0x0042
            r5.A0F(r0)
        L_0x0034:
            int r0 = r5.A00
            if (r0 == 0) goto L_0x0063
            r4 = 1
            X.0XW r9 = X.C06970a9.A03(r5, r0)
            int r0 = r9.A00
            r0 = r0 & r10
            if (r0 != 0) goto L_0x0048
        L_0x0042:
            X.AnonymousClass0QV.A06(r5, r9)
            goto L_0x0034
        L_0x0046:
            if (r9 == 0) goto L_0x0034
        L_0x0048:
            int r0 = r9.A01
            r0 = r0 & r10
            if (r0 == 0) goto L_0x00a4
            r3 = 0
        L_0x004e:
            boolean r0 = r9 instanceof X.C015408x
            if (r0 == 0) goto L_0x0070
            X.08x r9 = (X.C015408x) r9
            X.0WL r0 = r9.A0N()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0068
            boolean r0 = X.AnonymousClass0Qa.A05(r9)
        L_0x0060:
            if (r0 == 0) goto L_0x009d
            r11 = 1
        L_0x0063:
            int r6 = r6 + 1
            if (r6 < r8) goto L_0x0016
        L_0x0067:
            return r11
        L_0x0068:
            r1 = 7
            X.0lD r0 = X.C12100lD.A00
            boolean r0 = X.C05080Qi.A07(r9, r0, r1)
            goto L_0x0060
        L_0x0070:
            int r0 = r9.A01
            r0 = r0 & r10
            if (r0 == 0) goto L_0x009d
            boolean r0 = r9 instanceof X.C014308l
            if (r0 == 0) goto L_0x009d
            r0 = r9
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x007f:
            if (r2 == 0) goto L_0x009a
            int r0 = r2.A01
            r0 = r0 & r10
            if (r0 == 0) goto L_0x008b
            int r1 = r1 + 1
            if (r1 != r4) goto L_0x008e
            r9 = r2
        L_0x008b:
            X.0XW r2 = r2.A02
            goto L_0x007f
        L_0x008e:
            X.0a9 r3 = X.AnonymousClass001.A10(r3)
            X.0XW r9 = X.AnonymousClass000.A0d(r3, r9)
            r3.A0F(r2)
            goto L_0x008b
        L_0x009a:
            if (r1 != r4) goto L_0x009d
            goto L_0x00a1
        L_0x009d:
            X.0XW r9 = X.AnonymousClass0QV.A00(r3)
        L_0x00a1:
            if (r9 == 0) goto L_0x0034
            goto L_0x004e
        L_0x00a4:
            X.0XW r9 = r9.A02
            goto L_0x0046
        L_0x00a7:
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00ae:
            java.lang.String r0 = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r1)
            throw r0
        L_0x00ba:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04310Mr.A00():boolean");
    }
}
