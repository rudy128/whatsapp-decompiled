package X;

/* renamed from: X.0Qa  reason: invalid class name */
public abstract class AnonymousClass0Qa {
    public static final Integer A02(C015408x r2, int i) {
        Integer num;
        if (!r2.A01) {
            r2.A01 = true;
            try {
                C04310Mr r1 = (C04310Mr) r2.A0N().A00().invoke(new AnonymousClass0N9(i));
                if (r1 != C04310Mr.A02) {
                    if (r1 == C04310Mr.A01) {
                        num = AnonymousClass00R.A01;
                    } else if (r1.A00()) {
                        num = AnonymousClass00R.A0C;
                    } else {
                        num = AnonymousClass00R.A0N;
                    }
                    return num;
                }
                r2.A01 = false;
            } finally {
                r2.A01 = false;
            }
        }
        return AnonymousClass00R.A00;
    }

    public static final Integer A03(C015408x r2, int i) {
        Integer num;
        if (!r2.A02) {
            r2.A02 = true;
            try {
                C04310Mr r1 = (C04310Mr) r2.A0N().A01().invoke(new AnonymousClass0N9(i));
                if (r1 != C04310Mr.A02) {
                    if (r1 == C04310Mr.A01) {
                        num = AnonymousClass00R.A01;
                    } else if (r1.A00()) {
                        num = AnonymousClass00R.A0C;
                    } else {
                        num = AnonymousClass00R.A0N;
                    }
                    return num;
                }
                r2.A02 = false;
            } finally {
                r2.A02 = false;
            }
        }
        return AnonymousClass00R.A00;
    }

    public static final boolean A06(C015408x r3) {
        AnonymousClass0F7.A00(r3, new C08180eg(r3));
        int A00 = C015408x.A00(r3);
        if (A00 != 1 && A00 != 3) {
            return true;
        }
        r3.A0R(AnonymousClass0CW.Active);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x005c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0115 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A07(X.C015408x r12, X.C015408x r13) {
        /*
            r5 = 1024(0x400, float:1.435E-42)
            X.0XW r1 = r13.A03
            boolean r0 = r1.A07
            java.lang.String r11 = "visitAncestors called on an unattached node"
            if (r0 == 0) goto L_0x016c
            X.0XW r10 = r1.A04
            X.0XV r9 = X.AnonymousClass0QV.A03(r13)
        L_0x0010:
            r3 = 1
            r6 = 0
            r4 = 0
            if (r9 == 0) goto L_0x006e
            int r0 = X.AnonymousClass0QR.A01(r9, r5)
            if (r0 == 0) goto L_0x005f
        L_0x001b:
            if (r10 == 0) goto L_0x005f
            int r0 = r10.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x005c
            r8 = r10
            r7 = r4
        L_0x0024:
            boolean r0 = r8 instanceof X.C015408x
            if (r0 != 0) goto L_0x006f
            int r0 = r8.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0052
            boolean r0 = r8 instanceof X.C014308l
            if (r0 == 0) goto L_0x0052
            r0 = r8
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x0037:
            if (r2 == 0) goto L_0x0057
            int r0 = r2.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0043
            int r1 = r1 + 1
            if (r1 != r3) goto L_0x0046
            r8 = r2
        L_0x0043:
            X.0XW r2 = r2.A02
            goto L_0x0037
        L_0x0046:
            X.0a9 r7 = X.AnonymousClass001.A10(r7)
            X.0XW r8 = X.AnonymousClass000.A0d(r7, r8)
            r7.A0F(r2)
            goto L_0x0043
        L_0x0052:
            X.0XW r8 = X.AnonymousClass0QV.A00(r7)
            goto L_0x0059
        L_0x0057:
            if (r1 != r3) goto L_0x0052
        L_0x0059:
            if (r8 == 0) goto L_0x005c
            goto L_0x0024
        L_0x005c:
            X.0XW r10 = r10.A04
            goto L_0x001b
        L_0x005f:
            X.0XV r9 = r9.A0I()
            if (r9 == 0) goto L_0x006c
            X.0QR r0 = r9.A0S
            if (r0 == 0) goto L_0x006c
            X.0XW r10 = r0.A05
            goto L_0x0010
        L_0x006c:
            r10 = r4
            goto L_0x0010
        L_0x006e:
            r8 = r4
        L_0x006f:
            boolean r0 = X.C18070vi.A18(r8, r12)
            if (r0 == 0) goto L_0x0165
            int r1 = X.C015408x.A00(r12)
            if (r1 == r6) goto L_0x015b
            r0 = 2
            if (r1 == r0) goto L_0x0159
            if (r1 == r3) goto L_0x0142
            r0 = 3
            if (r1 != r0) goto L_0x013c
            X.0XW r1 = r12.A03
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0137
            X.0XW r9 = r1.A04
            X.0XV r8 = X.AnonymousClass0QV.A03(r12)
            if (r8 == 0) goto L_0x00a5
        L_0x0091:
            int r0 = X.AnonymousClass0QR.A01(r8, r5)
            if (r0 == 0) goto L_0x0118
        L_0x0097:
            if (r9 == 0) goto L_0x0118
            int r0 = r9.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0115
            r7 = r9
            r6 = r4
        L_0x00a0:
            boolean r0 = r7 instanceof X.C015408x
            if (r0 == 0) goto L_0x00e1
            r4 = r7
        L_0x00a5:
            X.08x r4 = (X.C015408x) r4
            if (r4 != 0) goto L_0x00c9
            X.0Ad r0 = r12.A0A()
            if (r0 == 0) goto L_0x0129
            X.0XV r0 = r0.A0t()
            if (r0 == 0) goto L_0x0129
            X.0to r0 = r0.A08
            if (r0 == 0) goto L_0x0129
            boolean r0 = r0.requestFocus()
            if (r0 == 0) goto L_0x0159
            X.0CW r0 = X.AnonymousClass0CW.Active
            r12.A0R(r0)
            boolean r3 = A07(r12, r13)
        L_0x00c8:
            return r3
        L_0x00c9:
            boolean r0 = A07(r4, r12)
            if (r0 == 0) goto L_0x0159
            boolean r3 = A07(r12, r13)
            X.0CW r1 = r12.A0O()
            X.0CW r0 = X.AnonymousClass0CW.ActiveParent
            if (r1 != r0) goto L_0x0130
            if (r3 == 0) goto L_0x00c8
            X.C04500Nq.A02(r4)
            return r3
        L_0x00e1:
            int r0 = r7.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x010b
            boolean r0 = r7 instanceof X.C014308l
            if (r0 == 0) goto L_0x010b
            r0 = r7
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x00f0:
            if (r2 == 0) goto L_0x0110
            int r0 = r2.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x00fc
            int r1 = r1 + 1
            if (r1 != r3) goto L_0x00ff
            r7 = r2
        L_0x00fc:
            X.0XW r2 = r2.A02
            goto L_0x00f0
        L_0x00ff:
            X.0a9 r6 = X.AnonymousClass001.A10(r6)
            X.0XW r7 = X.AnonymousClass000.A0d(r6, r7)
            r6.A0F(r2)
            goto L_0x00fc
        L_0x010b:
            X.0XW r7 = X.AnonymousClass0QV.A00(r6)
            goto L_0x0112
        L_0x0110:
            if (r1 != r3) goto L_0x010b
        L_0x0112:
            if (r7 == 0) goto L_0x0115
            goto L_0x00a0
        L_0x0115:
            X.0XW r9 = r9.A04
            goto L_0x0097
        L_0x0118:
            X.0XV r8 = r8.A0I()
            if (r8 == 0) goto L_0x00a5
            X.0QR r0 = r8.A0S
            if (r0 == 0) goto L_0x0126
            X.0XW r9 = r0.A05
            goto L_0x0091
        L_0x0126:
            r9 = r4
            goto L_0x0091
        L_0x0129:
            java.lang.String r0 = "Owner not initialized."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0130:
            java.lang.String r0 = "Deactivated node is focused"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0137:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r11)
            throw r0
        L_0x013c:
            X.3EW r0 = new X.3EW
            r0.<init>()
            throw r0
        L_0x0142:
            X.08x r0 = X.C04800Ox.A01(r12)
            if (r0 == 0) goto L_0x0152
            boolean r0 = A09(r12, r6, r3)
            if (r0 == 0) goto L_0x0159
            A06(r13)
            return r3
        L_0x0152:
            java.lang.String r0 = "ActiveParent with no focused child"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0159:
            r3 = 0
            return r3
        L_0x015b:
            boolean r3 = A06(r13)
            X.0CW r0 = X.AnonymousClass0CW.ActiveParent
            r12.A0R(r0)
            return r3
        L_0x0165:
            java.lang.String r0 = "Non child node cannot request focus."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x016c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Qa.A07(X.08x, X.08x):boolean");
    }

    public static final Integer A00(C015408x r2, int i) {
        int A00 = C015408x.A00(r2);
        if (A00 != 0) {
            if (A00 == 2) {
                return AnonymousClass00R.A01;
            }
            if (A00 == 1) {
                C015408x A01 = C04800Ox.A01(r2);
                if (A01 != null) {
                    Integer A002 = A00(A01, i);
                    if (A002 == AnonymousClass00R.A00) {
                        return A03(r2, i);
                    }
                    return A002;
                }
                throw AnonymousClass000.A0k("ActiveParent with no focused child");
            } else if (A00 != 3) {
                throw new AnonymousClass3EW();
            }
        }
        return AnonymousClass00R.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x0068 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A01(X.C015408x r12, int r13) {
        /*
            int r0 = X.C015408x.A00(r12)
            r8 = 1
            r7 = 0
            if (r0 == r7) goto L_0x00c7
            r6 = 2
            if (r0 == r6) goto L_0x00c7
            if (r0 == r8) goto L_0x00b5
            r5 = 3
            if (r0 != r5) goto L_0x00af
            r9 = 1024(0x400, float:1.435E-42)
            X.0XW r1 = r12.A03
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x00a8
            X.0XW r10 = r1.A04
            X.0XV r4 = X.AnonymousClass0QV.A03(r12)
        L_0x001e:
            r12 = 0
            if (r4 == 0) goto L_0x007a
            int r0 = X.AnonymousClass0QR.A01(r4, r9)
            if (r0 == 0) goto L_0x006b
        L_0x0027:
            if (r10 == 0) goto L_0x006b
            int r0 = r10.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0068
            r3 = r10
            r11 = r12
        L_0x0030:
            boolean r0 = r3 instanceof X.C015408x
            if (r0 != 0) goto L_0x007b
            int r0 = r3.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x005e
            boolean r0 = r3 instanceof X.C014308l
            if (r0 == 0) goto L_0x005e
            r0 = r3
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x0043:
            if (r2 == 0) goto L_0x0063
            int r0 = r2.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x004f
            int r1 = r1 + 1
            if (r1 != r8) goto L_0x0052
            r3 = r2
        L_0x004f:
            X.0XW r2 = r2.A02
            goto L_0x0043
        L_0x0052:
            X.0a9 r11 = X.AnonymousClass001.A0z(r11)
            X.0XW r3 = X.AnonymousClass000.A0d(r11, r3)
            r11.A0F(r2)
            goto L_0x004f
        L_0x005e:
            X.0XW r3 = X.AnonymousClass0QV.A00(r11)
            goto L_0x0065
        L_0x0063:
            if (r1 != r8) goto L_0x005e
        L_0x0065:
            if (r3 == 0) goto L_0x0068
            goto L_0x0030
        L_0x0068:
            X.0XW r10 = r10.A04
            goto L_0x0027
        L_0x006b:
            X.0XV r4 = r4.A0I()
            if (r4 == 0) goto L_0x0078
            X.0QR r0 = r4.A0S
            if (r0 == 0) goto L_0x0078
            X.0XW r10 = r0.A05
            goto L_0x001e
        L_0x0078:
            r10 = r12
            goto L_0x001e
        L_0x007a:
            r3 = r12
        L_0x007b:
            X.08x r3 = (X.C015408x) r3
            if (r3 == 0) goto L_0x00c7
            int r0 = X.C015408x.A00(r3)
            if (r0 == r7) goto L_0x0095
            if (r0 == r6) goto L_0x00a5
            if (r0 == r8) goto L_0x00a0
            if (r0 != r5) goto L_0x009a
            java.lang.Integer r1 = A01(r3, r13)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x0095
            if (r1 != 0) goto L_0x0099
        L_0x0095:
            java.lang.Integer r1 = A02(r3, r13)
        L_0x0099:
            return r1
        L_0x009a:
            X.3EW r0 = new X.3EW
            r0.<init>()
            throw r0
        L_0x00a0:
            java.lang.Integer r1 = A01(r3, r13)
            return r1
        L_0x00a5:
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            return r1
        L_0x00a8:
            java.lang.String r0 = "visitAncestors called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00af:
            X.3EW r0 = new X.3EW
            r0.<init>()
            throw r0
        L_0x00b5:
            X.08x r0 = X.C04800Ox.A01(r12)
            if (r0 == 0) goto L_0x00c0
            java.lang.Integer r0 = A00(r0, r13)
            return r0
        L_0x00c0:
            java.lang.String r0 = "ActiveParent with no focused child"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x00c7:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Qa.A01(X.08x, int):java.lang.Integer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x0084 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A04(X.C015408x r10) {
        /*
            int r2 = X.C015408x.A00(r10)
            r3 = 1
            r1 = 0
            if (r2 == r1) goto L_0x004c
            r0 = 2
            if (r2 == r0) goto L_0x004c
            r6 = 0
            if (r2 == r3) goto L_0x0096
            r0 = 3
            if (r2 != r0) goto L_0x00bc
            r8 = 1024(0x400, float:1.435E-42)
            X.0XW r1 = r10.A03
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x00b5
            X.0XW r9 = r1.A04
            X.0XV r7 = X.AnonymousClass0QV.A03(r10)
            if (r7 == 0) goto L_0x0035
        L_0x0021:
            int r0 = X.AnonymousClass0QR.A01(r7, r8)
            if (r0 == 0) goto L_0x0087
        L_0x0027:
            if (r9 == 0) goto L_0x0087
            int r0 = r9.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0084
            r5 = r6
            r4 = r9
        L_0x0030:
            boolean r0 = r4 instanceof X.C015408x
            if (r0 == 0) goto L_0x0050
            r6 = r4
        L_0x0035:
            X.08x r6 = (X.C015408x) r6
            if (r6 == 0) goto L_0x009b
            X.0CW r1 = r6.A0O()
            boolean r3 = A07(r6, r10)
            if (r3 == 0) goto L_0x004f
            X.0CW r0 = r6.A0O()
            if (r1 == r0) goto L_0x004c
            X.C04500Nq.A02(r6)
        L_0x004c:
            X.C04500Nq.A02(r10)
        L_0x004f:
            return r3
        L_0x0050:
            int r0 = r4.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x007a
            boolean r0 = r4 instanceof X.C014308l
            if (r0 == 0) goto L_0x007a
            r0 = r4
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x005f:
            if (r2 == 0) goto L_0x007f
            int r0 = r2.A01
            r0 = r0 & r8
            if (r0 == 0) goto L_0x006b
            int r1 = r1 + 1
            if (r1 != r3) goto L_0x006e
            r4 = r2
        L_0x006b:
            X.0XW r2 = r2.A02
            goto L_0x005f
        L_0x006e:
            X.0a9 r5 = X.AnonymousClass001.A0z(r5)
            X.0XW r4 = X.AnonymousClass000.A0d(r5, r4)
            r5.A0F(r2)
            goto L_0x006b
        L_0x007a:
            X.0XW r4 = X.AnonymousClass0QV.A00(r5)
            goto L_0x0081
        L_0x007f:
            if (r1 != r3) goto L_0x007a
        L_0x0081:
            if (r4 == 0) goto L_0x0084
            goto L_0x0030
        L_0x0084:
            X.0XW r9 = r9.A04
            goto L_0x0027
        L_0x0087:
            X.0XV r7 = r7.A0I()
            if (r7 == 0) goto L_0x0035
            X.0QR r0 = r7.A0S
            if (r0 == 0) goto L_0x0094
            X.0XW r9 = r0.A05
            goto L_0x0021
        L_0x0094:
            r9 = r6
            goto L_0x0021
        L_0x0096:
            boolean r0 = A09(r10, r1, r3)
            goto L_0x00af
        L_0x009b:
            X.0Ad r0 = r10.A0A()
            if (r0 == 0) goto L_0x00c4
            X.0XV r0 = r0.A0t()
            if (r0 == 0) goto L_0x00c4
            X.0to r0 = r0.A08
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r0.requestFocus()
        L_0x00af:
            if (r0 == 0) goto L_0x00c2
            A06(r10)
            goto L_0x004c
        L_0x00b5:
            java.lang.String r0 = "visitAncestors called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00bc:
            X.3EW r0 = new X.3EW
            r0.<init>()
            throw r0
        L_0x00c2:
            r3 = 0
            return r3
        L_0x00c4:
            java.lang.String r0 = "Owner not initialized."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Qa.A04(X.08x):boolean");
    }

    public static final boolean A05(C015408x r5) {
        AnonymousClass0OF r4 = AnonymousClass0QV.A01(r5).A05;
        try {
            if (r4.A00) {
                AnonymousClass0OF.A00(r4);
            }
            r4.A00 = true;
            int intValue = A01(r5, 7).intValue();
            boolean z = true;
            if (intValue == 0) {
                z = A04(r5);
            } else if (intValue != 2) {
                if (intValue == 1 || intValue == 3) {
                    z = false;
                } else {
                    throw new AnonymousClass3EW();
                }
            }
            return z;
        } finally {
            AnonymousClass0OF.A01(r4);
        }
    }

    public static final boolean A08(C015408x r2, boolean z, boolean z2) {
        int A00 = C015408x.A00(r2);
        if (A00 != 0) {
            if (A00 != 2) {
                if (A00 != 1) {
                    if (A00 != 3) {
                        throw new AnonymousClass3EW();
                    }
                    return true;
                } else if (!A09(r2, z, z2)) {
                    return false;
                }
            } else if (!z) {
                return z;
            } else {
                r2.A0R(AnonymousClass0CW.Inactive);
                if (!z2) {
                    return z;
                }
                C04500Nq.A02(r2);
                return z;
            }
        }
        r2.A0R(AnonymousClass0CW.Inactive);
        if (z2) {
            C04500Nq.A02(r2);
        }
        return true;
    }

    public static final boolean A09(C015408x r0, boolean z, boolean z2) {
        C015408x A01 = C04800Ox.A01(r0);
        if (A01 != null) {
            return A08(A01, z, z2);
        }
        return true;
    }
}
