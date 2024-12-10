package X;

import android.content.Context;
import android.os.Handler;
import android.view.TextureView;
import android.view.View;
import java.util.Map;

public abstract class DDR implements EDK {
    public C28592E9h A00;

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bf, code lost:
        r4 = (X.C22805BPt) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BIn() {
        /*
            r8 = this;
            r4 = r8
            boolean r0 = r8 instanceof X.BQ1
            if (r0 == 0) goto L_0x000f
            X.BQ1 r4 = (X.BQ1) r4
            r1 = 0
            X.ClC r0 = r4.A06
            if (r0 == 0) goto L_0x000e
            r0.A07 = r1
        L_0x000e:
            return
        L_0x000f:
            boolean r0 = r8 instanceof X.C22810BPy
            if (r0 == 0) goto L_0x001a
            X.BPy r4 = (X.C22810BPy) r4
            java.lang.Object r6 = r4.A07
            monitor-enter(r6)
            goto L_0x00e8
        L_0x001a:
            boolean r0 = r8 instanceof X.BQ0
            if (r0 == 0) goto L_0x0026
            X.BQ0 r4 = (X.BQ0) r4
            java.lang.Object r3 = r4.A03
            monitor-enter(r3)
            r2 = 0
            goto L_0x0126
        L_0x0026:
            boolean r0 = r8 instanceof X.C22808BPw
            if (r0 == 0) goto L_0x0076
            X.BPw r4 = (X.C22808BPw) r4
            boolean r0 = r4.A0b
            if (r0 != 0) goto L_0x000e
            X.BUd r0 = X.EDD.A00
            X.EDK r2 = A07(r4, r0)
            X.EDD r2 = (X.EDD) r2
            X.E99 r1 = r4.A0J
            if (r1 != 0) goto L_0x0044
            r0 = 1
            X.DE8 r1 = new X.DE8
            r1.<init>(r4, r0)
            r4.A0J = r1
        L_0x0044:
            r2.CEw(r1)
            r0 = 0
            r4.A0A = r0
            r4.A09 = r0
            X.C22808BPw.A02(r4)
            r0 = 1
            r4.A0b = r0
            X.CZh r0 = r4.A0h
            java.util.List r7 = r0.A00
            int r6 = r7.size()
            r5 = 0
        L_0x005b:
            if (r5 >= r6) goto L_0x014e
            java.lang.Object r0 = r7.get(r5)
            X.CJS r0 = (X.CJS) r0
            X.BQ0 r3 = r0.A00
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            java.lang.Integer r1 = r3.A05     // Catch:{ all -> 0x014b }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x014b }
            if (r1 != r0) goto L_0x0072
            r0 = 0
            X.BQ0.A01(r3, r0)     // Catch:{ all -> 0x014b }
        L_0x0072:
            monitor-exit(r2)     // Catch:{ all -> 0x014b }
            int r5 = r5 + 1
            goto L_0x005b
        L_0x0076:
            boolean r0 = r8 instanceof X.C22807BPv
            if (r0 == 0) goto L_0x00aa
            X.BPv r4 = (X.C22807BPv) r4
            X.Cyc r3 = r4.A06
            X.Cr9 r2 = r3.A04
            X.CyY r1 = r2.A07
            X.C18070vi.A0X(r1)
            r0 = 1
            r1.A05 = r0
            android.os.Handler r1 = r1.A01
            if (r1 == 0) goto L_0x0090
            r0 = 3
            r1.sendEmptyMessage(r0)
        L_0x0090:
            X.Ck6 r0 = r4.A05
            if (r0 == 0) goto L_0x000e
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x00a6
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x009f
            r0 = 1
            r2.A0F = r0
        L_0x009f:
            android.os.Handler r1 = r3.A01
        L_0x00a1:
            r0 = 2
            r1.sendEmptyMessage(r0)
            return
        L_0x00a6:
            r2.A02()
            goto L_0x009f
        L_0x00aa:
            boolean r0 = r8 instanceof X.C22806BPu
            if (r0 == 0) goto L_0x00bb
            X.BPu r4 = (X.C22806BPu) r4
            android.view.View r1 = r4.A03
            if (r1 == 0) goto L_0x000e
            r0 = 0
            r1.setOnTouchListener(r0)
            r4.A03 = r0
            return
        L_0x00bb:
            boolean r0 = r8 instanceof X.C22805BPt
            if (r0 == 0) goto L_0x000e
            X.BPt r4 = (X.C22805BPt) r4
            r1 = 0
            X.Cyc r2 = r4.A01
            if (r2 == 0) goto L_0x000e
            X.DDv r0 = r4.A00
            if (r0 == 0) goto L_0x00d4
            r0.A0b = r1
            android.os.Handler r1 = r0.A02
            if (r1 == 0) goto L_0x00d4
            r0 = 3
            r1.removeMessages(r0)
        L_0x00d4:
            boolean r0 = r2.A06
            X.Cr9 r1 = r2.A04
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x00e1
            r0 = 1
            r1.A0F = r0
        L_0x00e1:
            android.os.Handler r1 = r2.A01
            goto L_0x00a1
        L_0x00e4:
            r1.A02()
            goto L_0x00e1
        L_0x00e8:
            X.CMv r0 = r4.A08     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x011e
            X.CMv r0 = r4.A08     // Catch:{ all -> 0x0123 }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x0123 }
            X.E7R r5 = r0.A01     // Catch:{ all -> 0x0123 }
            if (r5 == 0) goto L_0x0119
            java.lang.String r0 = "Photo capture already in progress: cancel request"
            java.lang.RuntimeException r3 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x0123 }
            boolean r0 = X.C26379Cyf.A0A()     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x0108
            r5.Bnt()     // Catch:{ all -> 0x0123 }
        L_0x0104:
            X.C22810BPy.A00(r4)     // Catch:{ all -> 0x0123 }
            goto L_0x011e
        L_0x0108:
            android.os.Handler r2 = X.C26379Cyf.A00()     // Catch:{ all -> 0x0123 }
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()     // Catch:{ all -> 0x0123 }
            X.AnonymousClass001.A1Q(r5, r3, r1)     // Catch:{ all -> 0x0123 }
            r0 = 8
            X.C108955ca.A1F(r2, r1, r0)     // Catch:{ all -> 0x0123 }
            goto L_0x0104
        L_0x0119:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x0123 }
            throw r0     // Catch:{ all -> 0x0123 }
        L_0x011e:
            monitor-exit(r6)
            r0 = 1
            r4.A09 = r0
            return
        L_0x0123:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0126:
            java.lang.Integer r1 = r4.A05     // Catch:{ all -> 0x0148 }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0148 }
            if (r1 != r0) goto L_0x0146
            X.BQ0.A01(r4, r2)     // Catch:{ all -> 0x0148 }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0148 }
            r4.A05 = r0     // Catch:{ all -> 0x0148 }
            X.BQ0.A00(r4)     // Catch:{ all -> 0x0148 }
            X.CY3 r1 = r4.A04     // Catch:{ all -> 0x0148 }
            r0 = 0
            r4.A04 = r0     // Catch:{ all -> 0x0148 }
            if (r1 == 0) goto L_0x0146
            java.lang.String r0 = "Camera is backgrounded during recording"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x0148 }
            X.C26379Cyf.A06(r1, r0)     // Catch:{ all -> 0x0148 }
        L_0x0146:
            monitor-exit(r3)     // Catch:{ all -> 0x0148 }
            return
        L_0x0148:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0148 }
            throw r0
        L_0x014b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x014b }
            throw r0
        L_0x014e:
            X.C22808BPw.A01(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DDR.BIn():void");
    }

    public final void Bd6() {
        C28661ECy eCy;
        E4B e4b;
        if (this instanceof C22811BPz) {
            C22811BPz bPz = (C22811BPz) this;
            EDE ede = (EDE) A07(bPz, EDE.A00);
            bPz.A00 = ede;
            ede.BBk(bPz.A03);
            DF0 df0 = new DF0(new CJV(bPz));
            bPz.A02 = df0;
            bPz.A00.CLN(df0);
        } else if (this instanceof C22810BPy) {
            C22810BPy bPy = (C22810BPy) this;
            bPy.A01 = (EDA) A07(bPy, EDA.A00);
            bPy.A02 = (EDD) A07(bPy, EDD.A00);
            C22892BUd bUd = EDE.A00;
            if (A0C(bPy, bUd)) {
                EDE ede2 = (EDE) A07(bPy, bUd);
                bPy.A03 = ede2;
                C18070vi.A0b(ede2);
                ede2.BBk(bPy.A05);
            }
            if (A0B(bPy, EB9.A03, false)) {
                bPy.A09 = false;
            }
        } else {
            if (this instanceof C22809BPx) {
                C22809BPx bPx = (C22809BPx) this;
                EDK A07 = A07(bPx, EDD.A00);
                C18070vi.A0X(A07);
                EDD edd = (EDD) A07;
                E99 e99 = bPx.A02;
                if (e99 == null) {
                    e99 = new DE8(bPx, 3);
                    bPx.A02 = e99;
                }
                edd.BBf(e99);
                if (A0B(bPx, ED5.A00, AnonymousClass000.A0h())) {
                    C22892BUd bUd2 = C28661ECy.A00;
                    if (A0C(bPx, bUd2)) {
                        EDK A072 = A07(bPx, bUd2);
                        C18070vi.A0X(A072);
                        eCy = (C28661ECy) A072;
                        e4b = bPx.A01;
                        if (e4b == null) {
                            e4b = new C26710DAk(bPx, 1);
                            bPx.A01 = e4b;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (this instanceof BQ0) {
                BQ0 bq0 = (BQ0) this;
                C22808BPw bPw = (C22808BPw) ((EDA) A07(bq0, EDA.A00));
                bq0.A00 = bPw.A0i;
                bPw.A0h.A01(bq0.A01);
                return;
            } else if (this instanceof C22808BPw) {
                C22808BPw bPw2 = (C22808BPw) this;
                C22892BUd bUd3 = ED9.A04;
                if (A0C(bPw2, bUd3)) {
                    ED9 ed9 = (ED9) A07(bPw2, bUd3);
                    CJR cjr = bPw2.A0G;
                    if (cjr == null) {
                        cjr = new CJR(bPw2);
                        bPw2.A0G = cjr;
                    }
                    C22806BPu bPu = (C22806BPu) ed9;
                    bPu.A06 = cjr;
                    CJQ cjq = bPw2.A0F;
                    if (cjq == null) {
                        cjq = new CJQ(bPw2);
                        bPw2.A0F = cjq;
                    }
                    bPu.A05 = cjq;
                    CSK csk = bPw2.A0D;
                    if (csk == null) {
                        csk = new CSK(bPw2.A0i);
                        bPw2.A0D = csk;
                    }
                    bPu.A04 = csk;
                }
                C22892BUd bUd4 = C28661ECy.A00;
                if (A0C(bPw2, bUd4)) {
                    eCy = (C28661ECy) A07(bPw2, bUd4);
                    e4b = bPw2.A0I;
                    if (e4b == null) {
                        e4b = new C26710DAk(bPw2, 0);
                        bPw2.A0I = e4b;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
            BUF buf = (BUF) eCy;
            buf.A04.A01(e4b);
            e4b.Bzk(buf.A01, buf.A00);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.D50, java.lang.Object] */
    public final void BdF() {
        if (this instanceof C22807BPv) {
            C22807BPv bPv = (C22807BPv) this;
            C22892BUd bUd = ED8.A01;
            if (A0C(bPv, bUd)) {
                DDv dDv = ((BUJ) ((ED8) A07(bPv, bUd))).A00;
                C18070vi.A0X(dDv);
                new C26713DAn(bPv, 2).CCr(dDv);
            }
            if (A0C(bPv, bUd)) {
                DDv dDv2 = ((BUJ) ((ED8) A07(bPv, bUd))).A00;
                C18070vi.A0X(dDv2);
                bPv.A06.A01(dDv2);
            }
        } else if (this instanceof C22804BPs) {
            C22804BPs bPs = (C22804BPs) this;
            if (bPs.A00 == null) {
                C22892BUd bUd2 = ED8.A01;
                if (A0C(bPs, bUd2)) {
                    DDv dDv3 = ((BUJ) ((ED8) A07(bPs, bUd2))).A00;
                    C18070vi.A0X(dDv3);
                    new C26713DAn(bPs, 1).CCr(dDv3);
                }
            }
        } else if (this instanceof C22805BPt) {
            C22805BPt bPt = (C22805BPt) this;
            C22805BPt.A00(bPt);
            C25747ClH clH = bPt.A02;
            C28592E9h e9h = bPt.A00;
            C26159CtX.A01(e9h);
            C18070vi.A0X(e9h);
            clH.A00 = new Object();
            C22892BUd bUd3 = EDD.A00;
            if (e9h.BeL(bUd3)) {
                EDD edd = (EDD) e9h.BP7(bUd3);
                clH.A04 = edd;
                if (edd != null) {
                    edd.BBf(clH.A07);
                } else {
                    throw AnonymousClass000.A0n("Required value was null.");
                }
            }
            C22892BUd bUd4 = ED9.A04;
            if (e9h.BeL(bUd4)) {
                ED9 ed9 = (ED9) e9h.BP7(bUd4);
                clH.A01 = ed9;
                if (ed9 != null) {
                    ((C22806BPu) ed9).A02 = clH.A00;
                    clH.A00();
                } else {
                    throw AnonymousClass000.A0n("Required value was null.");
                }
            }
            C22892BUd bUd5 = C28660ECx.A00;
            if (e9h.BeL(bUd5)) {
                C18070vi.A0X(e9h.BP7(bUd5));
                throw AnonymousClass000.A0s("getRenderers");
            }
        }
    }

    public final void release() {
        C26376Cyc cyc;
        if (this instanceof C22811BPz) {
            C22811BPz bPz = (C22811BPz) this;
            bPz.A00.CF4(bPz.A03);
        } else if (this instanceof BQ1) {
            BQ1 bq1 = (BQ1) this;
            synchronized (bq1) {
                TextureView textureView = bq1.A05;
                bq1.A05 = null;
                for (E99 C1l : bq1.A00.A00) {
                    C1l.C1l(bq1.A05);
                }
                if (textureView != null) {
                    textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
                }
                C25742ClC clC = bq1.A06;
                bq1.A06 = null;
                if (clC != null) {
                    clC.A01();
                }
            }
        } else if (this instanceof C22809BPx) {
            C22809BPx bPx = (C22809BPx) this;
            EDK A07 = A07(bPx, EDD.A00);
            C18070vi.A0X(A07);
            EDD edd = (EDD) A07;
            E99 e99 = bPx.A02;
            if (e99 == null) {
                e99 = new DE8(bPx, 3);
                bPx.A02 = e99;
            }
            edd.CEw(e99);
        } else if (this instanceof C22808BPw) {
            C22808BPw bPw = (C22808BPw) this;
            C22808BPw.A02(bPw);
            C22892BUd bUd = ED9.A04;
            if (A0C(bPw, bUd)) {
                C22806BPu bPu = (C22806BPu) ((ED9) A07(bPw, bUd));
                bPu.A06 = null;
                bPu.A05 = null;
                bPu.A04 = null;
            }
            C22892BUd bUd2 = C28661ECy.A00;
            if (A0C(bPw, bUd2)) {
                C28661ECy eCy = (C28661ECy) A07(bPw, bUd2);
                E4B e4b = bPw.A0I;
                if (e4b == null) {
                    e4b = new C26710DAk(bPw, 0);
                    bPw.A0I = e4b;
                }
                ((BUF) eCy).A04.A02(e4b);
            }
        } else if (this instanceof C22807BPv) {
            C22807BPv bPv = (C22807BPv) this;
            C25675Ck6 ck6 = bPv.A05;
            if (ck6 != null) {
                bPv.A0A = BE7.A0u();
                bPv.A06.A01.sendEmptyMessage(3);
                C26140Ct3 ct3 = ck6.A00;
                if (ct3 != null) {
                    ct3.A03();
                    ck6.A00 = null;
                }
                C25517ChF chF = ck6.A01;
                C9S c9s = C25517ChF.A05;
                Boolean A0h = AnonymousClass000.A0h();
                Map map = chF.A00;
                boolean A1Y = AnonymousClass000.A1Y(BE8.A0e(c9s, A0h, map));
                C26140Ct3 ct32 = (C26140Ct3) map.remove(C25517ChF.A0B);
                if (A1Y && ct32 != null) {
                    ct32.A03();
                }
            }
        } else if ((this instanceof C22805BPt) && (cyc = ((C22805BPt) this).A01) != null) {
            cyc.A01.sendEmptyMessage(3);
        }
    }

    public static Context A06(DDR ddr) {
        C28592E9h e9h = ddr.A00;
        C26159CtX.A01(e9h);
        return e9h.getContext();
    }

    public static EDK A07(DDR ddr, C22892BUd bUd) {
        C28592E9h e9h = ddr.A00;
        C26159CtX.A01(e9h);
        return e9h.BP7(bUd);
    }

    public static C25841Cmv A08(Object obj) {
        C25841Cmv cmv = ((C22807BPv) obj).A07.A00;
        C18070vi.A0X(cmv);
        return cmv;
    }

    public static E4f A09(DDR ddr, C9Z c9z) {
        C28592E9h e9h = ddr.A00;
        C26159CtX.A01(e9h);
        return e9h.BP8(c9z);
    }

    public static Object A0A(DDR ddr, C25313CdJ cdJ) {
        C28592E9h e9h = ddr.A00;
        C26159CtX.A01(e9h);
        return e9h.BPA(cdJ);
    }

    public static boolean A0C(DDR ddr, C22892BUd bUd) {
        C28592E9h e9h = ddr.A00;
        C26159CtX.A01(e9h);
        return e9h.BeL(bUd);
    }

    public void A0E() {
        C26376Cyc cyc;
        Handler handler;
        if (this instanceof BQ1) {
            C25742ClC clC = ((BQ1) this).A06;
            if (clC != null) {
                clC.A07 = true;
            }
        } else if (this instanceof C22810BPy) {
            ((C22810BPy) this).A09 = false;
        } else if (this instanceof BQ0) {
            synchronized (((BQ0) this).A03) {
            }
        } else {
            if (this instanceof C22807BPv) {
                C22807BPv bPv = (C22807BPv) this;
                C26376Cyc cyc2 = bPv.A06;
                C26372CyY cyY = cyc2.A04.A07;
                C18070vi.A0X(cyY);
                cyY.A05 = false;
                if (bPv.A05 != null) {
                    handler = cyc2.A01;
                } else {
                    return;
                }
            } else if (this instanceof C22806BPu) {
                C22806BPu bPu = (C22806BPu) this;
                C22892BUd bUd = EDD.A00;
                EDD edd = (EDD) A07(bPu, bUd);
                if (((EDD) A07(bPu, bUd)).Bcn()) {
                    View BXX = edd.BXX();
                    bPu.A03 = BXX;
                    BXX.setOnTouchListener(bPu.A08);
                    return;
                }
                return;
            } else if ((this instanceof C22805BPt) && (cyc = ((C22805BPt) this).A01) != null) {
                handler = cyc.A01;
            } else {
                return;
            }
            handler.sendEmptyMessage(1);
        }
    }

    public void CCA() {
    }

    public static boolean A0B(DDR ddr, C25313CdJ cdJ, Object obj) {
        return ((Boolean) ddr.A0D(cdJ, obj)).booleanValue();
    }

    public final Object A0D(C25313CdJ cdJ, Object obj) {
        Object A0A = A0A(this, cdJ);
        if (A0A != null) {
            return A0A;
        }
        return obj;
    }

    public final void connect() {
        A0E();
    }
}
