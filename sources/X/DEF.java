package X;

public abstract class DEF implements E9j {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;

    public final void BIn() {
        E9S e9s;
        if (!this.A00) {
            throw AnonymousClass000.A0n("Observer not initialized.");
        } else if (this.A02) {
            if (this.A01) {
                if (this instanceof C22890BUb) {
                    for (E9j BIn : ((C22890BUb) this).A00) {
                        BIn.BIn();
                    }
                } else {
                    if (this instanceof BUN) {
                        BUN bun = (BUN) this;
                        BUN.A03(bun, (C25742ClC) null);
                        C22892BUd bUd = EDD.A00;
                        if (bun.A00.BeL(bUd)) {
                            EDD edd = (EDD) bun.A04(bUd);
                            E99 e99 = bun.A08;
                            if (e99 == null) {
                                e99 = new DE8(bun, 5);
                                bun.A08 = e99;
                            }
                            edd.CEw(e99);
                        }
                        e9s = bun.A0Q;
                    } else if (this instanceof BUO) {
                        BUO buo = (BUO) this;
                        BUO.A02(buo, (C25742ClC) null);
                        C22892BUd bUd2 = EDD.A00;
                        if (buo.A00.BeL(bUd2)) {
                            EDD edd2 = (EDD) buo.A04(bUd2);
                            E99 e992 = buo.A0A;
                            if (e992 == null) {
                                e992 = new DE8(buo, 4);
                                buo.A0A = e992;
                            }
                            edd2.CEw(e992);
                        }
                        e9s = buo.A0R;
                    } else if (this instanceof BUG) {
                        BUG bug = (BUG) this;
                        bug.A04 = false;
                        bug.A03 = false;
                        bug.A02 = false;
                    } else if (this instanceof BUK) {
                        C25742ClC clC = ((BUK) this).A08;
                        if (clC != null) {
                            clC.A07 = false;
                        }
                    } else if (this instanceof BUF) {
                        BUF buf = (BUF) this;
                        BUF.A00(buf, new C27489DgI(buf));
                    }
                    if (e9s != null) {
                        e9s.stop();
                    }
                }
                this.A01 = false;
            }
            this.A02 = false;
        }
    }

    public final void Bd6() {
        EDH edh;
        if (!this.A00) {
            this.A00 = true;
            this.A03 = true;
            this.A01 = false;
            if (this instanceof C22890BUb) {
                for (E9j Bd6 : ((C22890BUb) this).A00) {
                    Bd6.Bd6();
                }
            } else if (this instanceof BUN) {
                BUN bun = (BUN) this;
                bun.A06 = (EDC) bun.A04(EDC.A01);
                bun.A0Q = ((EDB) bun.A04(EDB.A00)).BY3();
            } else if (this instanceof BUO) {
                BUO buo = (BUO) this;
                C9Z c9z = EDH.A00;
                C28592E9h e9h = buo.A00;
                if (e9h.BeM(c9z)) {
                    edh = (EDH) e9h.BP8(c9z);
                } else {
                    edh = null;
                }
                buo.A0C = edh;
                buo.A0D = (EDI) e9h.BP8(EDI.A00);
                buo.A08 = (EDC) buo.A04(EDC.A01);
                buo.A0R = ((EDB) buo.A04(EDB.A00)).BY3();
            } else if (this instanceof BUF) {
                BUF buf = (BUF) this;
                EDK A04 = buf.A04(EDD.A00);
                C18070vi.A0X(A04);
                ((EDD) A04).BBf((E99) buf.A05.getValue());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BdF() {
        /*
            r13 = this;
            boolean r1 = r13.A00
            java.lang.String r0 = "Observer not initialized."
            if (r1 == 0) goto L_0x00fe
            r3 = r13
            boolean r0 = r13 instanceof X.C22890BUb
            if (r0 == 0) goto L_0x0023
            X.BUb r3 = (X.C22890BUb) r3
            java.util.List r0 = r3.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x0013:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r0 = r1.next()
            X.E9j r0 = (X.E9j) r0
            r0.BdF()
            goto L_0x0013
        L_0x0023:
            boolean r0 = r13 instanceof X.BUG
            if (r0 == 0) goto L_0x00ef
            X.BUG r3 = (X.BUG) r3
            X.BUd r1 = X.EDA.A00
            X.E9h r2 = r3.A00
            boolean r0 = r2.BeL(r1)
            if (r0 == 0) goto L_0x0099
            X.EDK r1 = r3.A04(r1)
            X.EDA r1 = (X.EDA) r1
            X.BPw r1 = (X.C22808BPw) r1
            X.EAk r0 = r1.A0i
            r3.A0D = r0
            X.By6 r1 = r1.A0f
            X.By6 r0 = X.C24248By6.CAMERA2
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            r3.A05 = r0
            X.EAk r0 = r3.A0D
            if (r0 == 0) goto L_0x0054
            X.EAk r1 = r3.A0D
            X.BCw r0 = r3.A06
            r1.BBF(r0)
        L_0x0054:
            X.BUd r4 = X.ED4.A01
            X.EDK r0 = r3.A04(r4)
            X.ED4 r0 = (X.ED4) r0
            r3.A0C = r0
            android.content.Context r12 = r2.getContext()
            boolean r9 = r3.A09
            r11 = 0
            java.lang.String r7 = "ar-ServiceLocatorFactory"
            X.EB1 r10 = X.EB1.A01
            java.lang.String r0 = "com.facebook.cameracore.camerasdk.optic.arcore.PreviewSetupDelegateImpl"
            java.lang.Class r8 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x00a6 }
            r2 = 3
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00a6 }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r1[r11] = r0     // Catch:{ Exception -> 0x00a6 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x00a6 }
            r6 = 1
            r1[r6] = r0     // Catch:{ Exception -> 0x00a6 }
            r5 = 2
            java.lang.reflect.Constructor r1 = X.BE6.A0w(r8, r0, r1, r5)     // Catch:{ Exception -> 0x00a6 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00a6 }
            r0[r11] = r12     // Catch:{ Exception -> 0x00a6 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x00a6 }
            r0[r6] = r2     // Catch:{ Exception -> 0x00a6 }
            X.AnonymousClass8BR.A1L(r0, r5, r9)     // Catch:{ Exception -> 0x00a6 }
            java.lang.Object r1 = r1.newInstance(r0)     // Catch:{ Exception -> 0x00a6 }
            X.EB1 r1 = (X.EB1) r1     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r0 = "Able to get the arcore impel for the service locator. should enable arcore passed %s"
            X.C26294Cx6.A02(r2, r7, r0)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00ac
        L_0x0099:
            X.BUd r0 = X.ED2.A00
            r3.A04(r0)
            java.lang.String r0 = "getCameraViewController"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00a5:
            r10 = r1
        L_0x00a6:
            java.lang.String r0 = "Unable to resolve the service locator for ar core, defaulting to no-arcore."
            X.C26294Cx6.A04(r7, r0)
            r1 = r10
        L_0x00ac:
            r3.A00 = r1
            X.BUd r0 = X.EDE.A00
            X.EDK r2 = r3.A04(r0)
            X.EDE r2 = (X.EDE) r2
            X.C9c r1 = X.EB1.A00
            X.EB1 r0 = r3.A00
            r2.CJj(r1, r0)
            X.EDK r0 = r3.A04(r4)
            X.ED4 r0 = (X.ED4) r0
            X.BPt r0 = (X.C22805BPt) r0
            X.C22805BPt.A00(r0)
            X.ClH r0 = r0.A02
            X.DDv r0 = r0.A02
            if (r0 == 0) goto L_0x00f7
            X.DGn r2 = r0.A0J
            X.E7n r1 = r3.A07
            X.C0O r0 = X.C0O.A06
            r2.A00(r1, r0)
            X.EDK r0 = r3.A04(r4)
            X.ED4 r0 = (X.ED4) r0
            X.BPt r0 = (X.C22805BPt) r0
            X.C22805BPt.A00(r0)
            X.ClH r0 = r0.A02
            X.DDv r0 = r0.A02
            if (r0 == 0) goto L_0x00f0
            X.DGn r1 = r0.A0J
            X.E53 r0 = r3.A08
            r1.A02(r0)
        L_0x00ef:
            return
        L_0x00f0:
            java.lang.String r0 = "AREngineHelper glProcessorGraph is not initialized"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00f7:
            java.lang.String r0 = "AREngineHelper glProcessorGraph is not initialized"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00fe:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DEF.BdF():void");
    }

    public void CCA() {
        if (this.A00) {
            if (this instanceof C22890BUb) {
                for (E9j CCA : ((C22890BUb) this).A00) {
                    CCA.CCA();
                }
                return;
            }
            return;
        }
        throw AnonymousClass000.A0n("Observer not initialized.");
    }

    public final void connect() {
        E9S e9s;
        C28498E4d e4d;
        if (!this.A00) {
            throw AnonymousClass000.A0n("Observer not initialized.");
        } else if (!this.A02) {
            this.A02 = true;
            if (this.A03) {
                if (this instanceof C22890BUb) {
                    for (E9j connect : ((C22890BUb) this).A00) {
                        connect.connect();
                    }
                } else {
                    if (this instanceof BUN) {
                        BUN bun = (BUN) this;
                        C22892BUd bUd = EDD.A00;
                        if (bun.A00.BeL(bUd)) {
                            EDD edd = (EDD) bun.A04(bUd);
                            E99 e99 = bun.A08;
                            if (e99 == null) {
                                e99 = new DE8(bun, 5);
                                bun.A08 = e99;
                            }
                            edd.BBf(e99);
                        }
                        e9s = bun.A0Q;
                        if (e9s != null) {
                            e4d = bun.A09;
                            if (e4d == null) {
                                e4d = new DE9(bun, 3);
                                bun.A09 = e4d;
                            }
                        }
                    } else if (this instanceof BUO) {
                        BUO buo = (BUO) this;
                        C22892BUd bUd2 = EDD.A00;
                        if (buo.A00.BeL(bUd2)) {
                            EDD edd2 = (EDD) buo.A04(bUd2);
                            E99 e992 = buo.A0A;
                            if (e992 == null) {
                                e992 = new DE8(buo, 4);
                                buo.A0A = e992;
                            }
                            edd2.BBf(e992);
                        }
                        e9s = buo.A0R;
                        if (e9s != null) {
                            e4d = buo.A0B;
                            if (e4d == null) {
                                e4d = new DE9(buo, 2);
                                buo.A0B = e4d;
                            }
                        }
                    } else if (this instanceof BUK) {
                        C25742ClC clC = ((BUK) this).A08;
                        if (clC != null) {
                            clC.A07 = true;
                        }
                    } else if (this instanceof BUF) {
                        BUF buf = (BUF) this;
                        BUF.A00(buf, new C27488DgH(buf));
                    }
                    e9s.CNc(e4d);
                }
                this.A01 = true;
            }
        }
    }

    public final void release() {
        if (this.A00) {
            if (this instanceof C22890BUb) {
                for (E9j release : ((C22890BUb) this).A00) {
                    release.release();
                }
            } else if (this instanceof BUN) {
                BUN bun = (BUN) this;
                bun.A0L.A00();
                bun.A0Q = null;
            } else if (this instanceof BUO) {
                BUO buo = (BUO) this;
                buo.A0N.A00();
                buo.A0R = null;
            } else if (this instanceof BUG) {
                BUG bug = (BUG) this;
                if (bug.A0D != null) {
                    bug.A0D.CEl(bug.A06);
                }
                bug.A0D = null;
                bug.A0C = null;
            } else if (this instanceof BUK) {
                BUK.A00((BUK) this);
            } else if (this instanceof BUF) {
                BUF buf = (BUF) this;
                EDK A04 = buf.A04(EDD.A00);
                C18070vi.A0X(A04);
                ((EDD) A04).CEw((E99) buf.A05.getValue());
            }
            this.A03 = false;
            this.A00 = false;
            this.A01 = false;
        }
    }
}
