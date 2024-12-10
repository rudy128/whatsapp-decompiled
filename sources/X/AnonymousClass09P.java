package X;

/* renamed from: X.09P  reason: invalid class name */
public final class AnonymousClass09P extends AnonymousClass0XW implements C17690v4, C17700v5, C17560ur {
    public C16990tY A00;
    public boolean A01;

    public void A0M() {
        this.A01 = false;
        A01();
    }

    public void Bnm() {
    }

    private final AnonymousClass09P A00() {
        C98494rF r1 = new C98494rF();
        A03(this, new C09960hZ(r1));
        return (AnonymousClass09P) r1.element;
    }

    private final void A01() {
        C16990tY r1;
        C98494rF r12 = new C98494rF();
        A03(this, new C10840iz(r12));
        AnonymousClass09P r2 = (AnonymousClass09P) r12.element;
        if (r2 != null) {
            AnonymousClass09P A002 = r2.A00();
            if (A002 == null || (r1 = A002.A00) == null) {
                r1 = r2.A00;
            }
            C16390sB r0 = (C16390sB) C02690Ez.A00(AnonymousClass0OD.A07, r2);
            if (r0 != null) {
                r0.CJ8(r1);
                return;
            }
            return;
        }
        C16390sB r13 = (C16390sB) C02690Ez.A00(AnonymousClass0OD.A07, this);
        if (r13 != null) {
            r13.CJ8((C16990tY) null);
        }
    }

    private final void A02() {
        C16990tY r1;
        C22811Dh r12 = new C22811Dh();
        r12.element = true;
        A04(this, new C10850j0(r12));
        if (r12.element) {
            AnonymousClass09P A002 = A00();
            if (A002 == null || (r1 = A002.A00) == null) {
                r1 = this.A00;
            }
            C16390sB r0 = (C16390sB) C02690Ez.A00(AnonymousClass0OD.A07, this);
            if (r0 != null) {
                r0.CJ8(r1);
            }
        }
    }

    public static final void A03(C17700v5 r10, C22821Di r11) {
        AnonymousClass0XW r1 = ((AnonymousClass0XW) r10).A03;
        if (r1.A07) {
            AnonymousClass0XW r7 = r1.A04;
            AnonymousClass0XV A03 = AnonymousClass0QV.A03(r10);
            if (A03 != null) {
                while (true) {
                    if (AnonymousClass0QR.A01(A03, 262144) != 0) {
                        while (r7 != null) {
                            if ((r7.A01 & 262144) != 0) {
                                AnonymousClass0XW r8 = r7;
                                C06970a9 r4 = null;
                                do {
                                    if (r8 instanceof C17700v5) {
                                        C17700v5 r82 = (C17700v5) r8;
                                        if (C18070vi.A18(r10.Ban(), r82.Ban()) && r10.getClass() == r82.getClass() && !AnonymousClass000.A1Y(r11.invoke(r82))) {
                                            return;
                                        }
                                    } else if ((r8.A01 & 262144) != 0 && (r8 instanceof C014308l)) {
                                        int i = 0;
                                        for (AnonymousClass0XW r3 = ((C014308l) r8).A00; r3 != null; r3 = r3.A02) {
                                            if ((r3.A01 & 262144) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    r8 = r3;
                                                } else {
                                                    r4 = AnonymousClass001.A0z(r4);
                                                    r8 = AnonymousClass000.A0d(r4, r8);
                                                    r4.A0F(r3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                            continue;
                                        }
                                    }
                                    r8 = AnonymousClass0QV.A00(r4);
                                    continue;
                                } while (r8 != null);
                            }
                            r7 = r7.A04;
                        }
                    }
                    A03 = A03.A0I();
                    if (A03 != null) {
                        AnonymousClass0QR r0 = A03.A0S;
                        if (r0 != null) {
                            r7 = r0.A05;
                        } else {
                            r7 = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw AnonymousClass000.A0n("visitAncestors called on an unattached node");
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0096 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008d A[EDGE_INSN: B:52:0x008d->B:41:0x008d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    public static final void A04(X.C17700v5 r10, X.C22821Di r11) {
        /*
            r9 = 262144(0x40000, float:3.67342E-40)
            r0 = r10
            X.0XW r0 = (X.AnonymousClass0XW) r0
            X.0XW r7 = r0.A03
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x0097
            X.0a9 r6 = X.C06970a9.A01()
            X.0XW r0 = r7.A02
            if (r0 == 0) goto L_0x0092
            r6.A0F(r0)
        L_0x0016:
            int r0 = r6.A00
            if (r0 == 0) goto L_0x0096
            r5 = 1
            X.0XW r7 = X.C06970a9.A03(r6, r0)
            int r0 = r7.A00
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0092
            r4 = r7
        L_0x0025:
            int r0 = r4.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x008d
            r3 = 0
            r8 = r4
        L_0x002c:
            boolean r0 = r8 instanceof X.C17700v5
            if (r0 == 0) goto L_0x0060
            X.0v5 r8 = (X.C17700v5) r8
            java.lang.Object r1 = r10.Ban()
            java.lang.Object r0 = r8.Ban()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x005d
            java.lang.Class r1 = r10.getClass()
            java.lang.Class r0 = r8.getClass()
            if (r1 != r0) goto L_0x005d
            java.lang.Object r1 = r11.invoke(r8)
        L_0x004e:
            X.0CR r0 = X.AnonymousClass0CR.A01
            if (r1 == r0) goto L_0x0096
            X.0CR r0 = X.AnonymousClass0CR.A03
            if (r1 == r0) goto L_0x0016
        L_0x0056:
            X.0XW r8 = X.AnonymousClass0QV.A00(r3)
        L_0x005a:
            if (r8 == 0) goto L_0x008d
            goto L_0x002c
        L_0x005d:
            X.0CR r1 = X.AnonymousClass0CR.A02
            goto L_0x004e
        L_0x0060:
            int r0 = r8.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0056
            boolean r0 = r8 instanceof X.C014308l
            if (r0 == 0) goto L_0x0056
            r0 = r8
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x006f:
            if (r2 == 0) goto L_0x008a
            int r0 = r2.A01
            r0 = r0 & r9
            if (r0 == 0) goto L_0x007b
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x007e
            r8 = r2
        L_0x007b:
            X.0XW r2 = r2.A02
            goto L_0x006f
        L_0x007e:
            X.0a9 r3 = X.AnonymousClass001.A10(r3)
            X.0XW r8 = X.AnonymousClass000.A0d(r3, r8)
            r3.A0F(r2)
            goto L_0x007b
        L_0x008a:
            if (r1 != r5) goto L_0x0056
            goto L_0x005a
        L_0x008d:
            X.0XW r4 = r4.A02
            if (r4 == 0) goto L_0x0092
            goto L_0x0025
        L_0x0092:
            X.AnonymousClass0QV.A06(r6, r7)
            goto L_0x0016
        L_0x0096:
            return
        L_0x0097:
            java.lang.String r0 = "visitSubtreeIf called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09P.A04(X.0v5, X.1Di):void");
    }

    public final void A0N(C16990tY r2) {
        if (!C18070vi.A18(this.A00, r2)) {
            this.A00 = r2;
            if (this.A01) {
                A02();
            }
        }
    }

    public void C0v(AnonymousClass0Hm r3, AnonymousClass0CQ r4, long j) {
        if (r4 == AnonymousClass0CQ.Main) {
            int i = r3.A00;
            if (i == 4) {
                this.A01 = true;
                A02();
            } else if (i == 5) {
                this.A01 = false;
                A01();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object Ban() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    public /* synthetic */ boolean Bdj() {
        return false;
    }

    public /* synthetic */ void BrG() {
    }

    public /* synthetic */ void CA7() {
    }

    public /* synthetic */ boolean CLc() {
        return false;
    }
}
