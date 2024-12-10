package X;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

public final class DBT implements C72423Lx {
    public final BFG A00;
    public final Executor A01;
    public final long A02;
    public final C36001nB A03;

    public DBT(BFG bfg, Executor executor, C36001nB r4, long j) {
        C18070vi.A0d(r4, 3);
        this.A02 = j;
        this.A00 = bfg;
        this.A03 = r4;
        this.A01 = executor;
    }

    public void Bnn() {
    }

    public void C25(C26048CrF crF) {
        C3F c3f;
        C22829BRh bRh;
        float f;
        C18070vi.A0d(crF, 0);
        C25809CmM cmM = this.A00.A03;
        if (cmM != null) {
            c3f = cmM.A03;
        } else {
            c3f = null;
        }
        if ((c3f instanceof C22829BRh) && (bRh = (C22829BRh) c3f) != null) {
            Drawable drawable = bRh.A02;
            if (!crF.A07()) {
                synchronized (crF) {
                    f = crF.A00;
                }
                C98.A00(drawable, f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a5, code lost:
        X.CDX.A00(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a8, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Btk(X.C26048CrF r11) {
        /*
            r10 = this;
            long r1 = r10.A02
            X.BFG r5 = r10.A00
            long r3 = r5.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00a9
            X.DBr r0 = r5.A02
            if (r0 == 0) goto L_0x00a9
            X.CmM r9 = r5.A0C
            android.content.res.Resources r6 = r0.A00
            X.BRd r7 = r0.A01
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            android.graphics.drawable.Drawable r4 = r7.A0A
            int r3 = r7.A00
            java.lang.Integer r0 = r7.A0O
            X.C3F r6 = X.C25310CdF.A00(r6, r4, r0, r3)
            if (r6 != 0) goto L_0x0040
            r0 = 1
            r9.A02(r0)
        L_0x0028:
            boolean r0 = r11.A07()
            if (r0 == 0) goto L_0x0036
            X.CmM r3 = r5.A03
            if (r3 == 0) goto L_0x0036
            r0 = 1
            r3.A02(r0)
        L_0x0036:
            boolean r0 = r11.A07()
            if (r0 != 0) goto L_0x0065
            X.CPS r0 = r5.A0A
            monitor-enter(r11)
            goto L_0x0055
        L_0x0040:
            X.EBA r3 = r7.A0F
            if (r3 == 0) goto L_0x0053
            android.graphics.PointF r0 = r7.A08
            X.CNE r4 = new X.CNE
            r4.<init>(r0, r3)
        L_0x004b:
            android.graphics.Rect r3 = r9.A02
            android.graphics.ColorFilter r0 = r9.A01
            r9.A01(r0, r3, r4, r6)
            goto L_0x0028
        L_0x0053:
            r4 = 0
            goto L_0x004b
        L_0x0055:
            java.lang.Throwable r3 = r11.A03     // Catch:{ all -> 0x0062 }
            monitor-exit(r11)
            X.E9v r0 = r0.A01
            if (r0 == 0) goto L_0x005f
            r0.Bw4(r1, r3)
        L_0x005f:
            java.util.concurrent.atomic.AtomicLong r0 = X.CEZ.A00
            goto L_0x0092
        L_0x0062:
            r1 = move-exception
            monitor-exit(r11)
            throw r1
        L_0x0065:
            java.lang.Object r7 = r11.A03()
            java.io.Closeable r7 = (java.io.Closeable) r7
            r8 = r7
            X.DRN r8 = (X.DRN) r8     // Catch:{ all -> 0x00a2 }
            X.CPS r6 = r5.A0A     // Catch:{ all -> 0x00a2 }
            X.C3F r3 = r9.A03     // Catch:{ all -> 0x00a2 }
            boolean r0 = r3 instanceof X.C22829BRh     // Catch:{ all -> 0x00a2 }
            r4 = 0
            if (r0 == 0) goto L_0x007d
            X.BRh r3 = (X.C22829BRh) r3     // Catch:{ all -> 0x00a2 }
            if (r3 == 0) goto L_0x007d
            android.graphics.drawable.Drawable r4 = r3.A02     // Catch:{ all -> 0x00a2 }
        L_0x007d:
            monitor-enter(r11)     // Catch:{ all -> 0x00a2 }
            java.lang.Throwable r3 = r11.A03     // Catch:{ all -> 0x009f }
            monitor-exit(r11)     // Catch:{ all -> 0x00a2 }
            X.C25434Cfh.A00(r8, r11, r5)     // Catch:{ all -> 0x00a2 }
            X.E9v r0 = r6.A01     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x008b
            r0.Btt(r4, r3, r1)     // Catch:{ all -> 0x00a2 }
        L_0x008b:
            java.util.concurrent.atomic.AtomicLong r0 = X.CEZ.A00     // Catch:{ all -> 0x00a2 }
            if (r7 == 0) goto L_0x0092
            r7.close()
        L_0x0092:
            java.util.concurrent.Executor r2 = r10.A01
            r1 = 13
            X.DTh r0 = new X.DTh
            r0.<init>((X.BFG) r5, (int) r1)
            r2.execute(r0)
            return
        L_0x009f:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00a2 }
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r1 = move-exception
            X.CDX.A00(r7, r0)
            throw r1
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DBT.Btk(X.CrF):void");
    }

    public void Bz5(C26048CrF crF) {
        C26738DBr dBr;
        C25112CYh cYh;
        C25809CmM cmM;
        long j = this.A02;
        BFG bfg = this.A00;
        if (j == bfg.A00 && (dBr = bfg.A02) != null) {
            DRN drn = (DRN) crF.A03();
            if (drn == null || !drn.A06()) {
                Btk(crF);
                if (drn != null) {
                    drn.close();
                    return;
                }
                return;
            }
            bfg.A09.CLJ(drn, BFG.A0K[1]);
            Object A05 = drn.A05();
            C18070vi.A0X(A05);
            C28672EDo eDo = (C28672EDo) A05;
            C25809CmM cmM2 = bfg.A0C;
            Resources resources = dBr.A00;
            C22825BRd bRd = dBr.A01;
            C36001nB r0 = this.A03;
            AnonymousClass3Ma.A1O(cmM2, 0, eDo);
            EBA eba = bRd.A0E;
            PointF pointF = bRd.A07;
            C18070vi.A0d(eba, 0);
            CNE cne = new CNE(pointF, eba);
            cmM2.A01(bRd.A06, cmM2.A02, cne, (C3F) r0.invoke(resources, eDo, bRd));
            Executor executor = this.A01;
            C27076DTa.A01(dBr, this, executor, 6);
            if (crF.A07() && (cmM = bfg.A03) != null) {
                cmM.A02(true);
            }
            C26766DCv dCv = (C26766DCv) eDo;
            ECu eCu = dCv.A00;
            if (eCu == null) {
                dCv.Bbq();
                dCv.BSS();
                dCv.getSizeInBytes();
                if (dCv instanceof BSF) {
                    cYh = ((BSF) dCv).A01;
                } else {
                    cYh = C25112CYh.A03;
                }
                eCu = new C26767DCw(cYh, dCv.A01);
                dCv.A00 = eCu;
            }
            boolean A07 = crF.A07();
            CPS cps = bfg.A0A;
            if (!A07) {
                C28604E9v e9v = cps.A01;
                if (e9v != null) {
                    e9v.Bw5(eCu, j);
                }
            } else {
                C25434Cfh.A00(drn, crF, bfg);
                Drawable BMW = bfg.BMW();
                C28604E9v e9v2 = cps.A01;
                if (e9v2 != null) {
                    e9v2.Bua(BMW, eCu, j);
                }
            }
            AtomicLong atomicLong = CEZ.A00;
            executor.execute(new C27082DTh(bfg, 13));
        }
    }
}
