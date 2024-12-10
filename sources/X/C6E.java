package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.smartcapture.camera.CameraFragment;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public abstract class C6E {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        X.C26379Cyf.A07(r8, r1.A0g.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d8, code lost:
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017f, code lost:
        X.C26175Cts.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0182, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.lang.Exception r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C22900BUl
            if (r0 == 0) goto L_0x0022
            r5 = r7
            X.BUl r5 = (X.C22900BUl) r5
            X.C6E r0 = r5.A01
            r0.A00(r8)
            X.CXb r0 = r5.A02
            X.CnB r4 = r0.A0A
            android.hardware.camera2.CaptureRequest$Builder r3 = r5.A00
            X.DEU r1 = r5.A03
            boolean r0 = r5.A04
            X.DVf r2 = new X.DVf
            r2.<init>(r3, r5, r1, r0)
            java.lang.String r1 = "restart_preview_video_recording_failed"
            r0 = 0
            r4.A00(r0, r1, r2)
        L_0x0021:
            return
        L_0x0022:
            boolean r0 = r7 instanceof X.C22896BUh
            if (r0 != 0) goto L_0x0021
            boolean r0 = r7 instanceof X.C22901BUm
            if (r0 == 0) goto L_0x007e
            r1 = r7
            X.BUm r1 = (X.C22901BUm) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x01ee;
                case 1: goto L_0x01e6;
                case 2: goto L_0x0032;
                case 3: goto L_0x0064;
                case 4: goto L_0x0064;
                case 5: goto L_0x01de;
                case 6: goto L_0x0032;
                case 7: goto L_0x0050;
                case 8: goto L_0x0047;
                case 9: goto L_0x01bb;
                case 10: goto L_0x01b3;
                case 11: goto L_0x01a4;
                case 12: goto L_0x017f;
                case 13: goto L_0x0197;
                case 14: goto L_0x003f;
                case 15: goto L_0x018b;
                case 16: goto L_0x0033;
                case 17: goto L_0x0183;
                case 18: goto L_0x017b;
                default: goto L_0x0032;
            }
        L_0x0032:
            return
        L_0x0033:
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            java.lang.Object r0 = r1.A01
            X.BHG r0 = (X.BHG) r0
            X.E7g r0 = r0.A08
            goto L_0x0175
        L_0x003f:
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            java.lang.Object r0 = r1.A01
            goto L_0x016b
        L_0x0047:
            java.lang.Object r1 = r1.A01
            X.BPw r1 = (X.C22808BPw) r1
            boolean r0 = r1.A0b
            if (r0 == 0) goto L_0x005c
            return
        L_0x0050:
            java.lang.Object r1 = r1.A01
            X.BPw r1 = (X.C22808BPw) r1
            boolean r0 = r1.A0b
            if (r0 != 0) goto L_0x0021
            boolean r0 = r1.A0a
            if (r0 == 0) goto L_0x0021
        L_0x005c:
            X.CZh r0 = r1.A0g
            java.util.List r0 = r0.A00
            X.C26379Cyf.A07(r8, r0)
            return
        L_0x0064:
            java.lang.Object r3 = r1.A01
            X.DAU r3 = (X.DAU) r3
            boolean r0 = r3.A0H
            if (r0 != 0) goto L_0x0021
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()
            X.CZh r0 = r3.A0P
            java.util.List r0 = r0.A00
            X.AnonymousClass001.A1Q(r0, r8, r2)
            r1 = 3
            android.os.Handler r0 = r3.A0I
            X.C108955ca.A1F(r0, r2, r1)
            return
        L_0x007e:
            boolean r0 = r7 instanceof X.C22899BUk
            if (r0 == 0) goto L_0x00a0
            r5 = r7
            X.BUk r5 = (X.C22899BUk) r5
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x00db;
                case 1: goto L_0x0216;
                default: goto L_0x008a;
            }
        L_0x008a:
            boolean r0 = r8 instanceof X.C27258Dak
            if (r0 == 0) goto L_0x0098
            java.lang.Object r1 = r5.A01
            X.DEq r1 = (X.C26808DEq) r1
            java.lang.Object r0 = r5.A03
            X.Chu r0 = (X.C25556Chu) r0
            r1.A00 = r0
        L_0x0098:
            java.lang.Object r0 = r5.A02
        L_0x009a:
            X.C6E r0 = (X.C6E) r0
            r0.A00(r8)
            return
        L_0x00a0:
            boolean r0 = r7 instanceof X.C22898BUj
            if (r0 == 0) goto L_0x00b3
            r5 = r7
            X.BUj r5 = (X.C22898BUj) r5
            int r0 = r5.A00
            if (r0 == 0) goto L_0x0132
            java.lang.Object r3 = r5.A01
            X.BQ0 r3 = (X.BQ0) r3
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            goto L_0x0116
        L_0x00b3:
            r3 = r7
            X.BUi r3 = (X.C22897BUi) r3
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x00d1;
                case 1: goto L_0x0226;
                case 2: goto L_0x00d8;
                case 3: goto L_0x023a;
                case 4: goto L_0x0165;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            java.lang.Object r1 = r3.A02
            X.BHG r1 = (X.BHG) r1
            r0 = 0
            r1.A06 = r0
            java.lang.Object r0 = r3.A01
            android.graphics.SurfaceTexture r0 = (android.graphics.SurfaceTexture) r0
            r0.release()
            X.EAW r0 = r1.A07
            if (r0 == 0) goto L_0x0021
            r0.C4V()
            return
        L_0x00d1:
            java.lang.Object r1 = r3.A01
            X.DEs r1 = (X.C26810DEs) r1
            r0 = 0
            r1.A0e = r0
        L_0x00d8:
            java.lang.Object r0 = r3.A02
            goto L_0x009a
        L_0x00db:
            r1 = 22
            r0 = 0
            X.C26175Cts.A01(r8, r1, r0)
            java.lang.Object r6 = r5.A01
            X.DEs r6 = (X.C26810DEs) r6
            X.CnB r4 = r6.A0S
            X.Cqv r0 = r6.A0R
            java.util.UUID r3 = r0.A03
            java.lang.Object r2 = r5.A03
            r1 = 13
            X.DTa r0 = new X.DTa
            r0.<init>(r2, r8, r1)
            r4.A05(r0, r3)
            java.util.HashSet r0 = X.C25449Cg0.A00
            boolean r0 = X.C25870Cne.A02(r0)
            if (r0 == 0) goto L_0x0107
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A0T
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0021
        L_0x0107:
            java.lang.Object r2 = r5.A02
            r0 = 8
            X.DVY r1 = new X.DVY
            r1.<init>(r5, r2, r0)
            java.lang.String r0 = "take_photo_exception_restart_preview"
            r4.A07(r0, r1)
            return
        L_0x0116:
            java.lang.Integer r1 = r3.A05     // Catch:{ all -> 0x021f }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x021f }
            if (r1 == r0) goto L_0x011f
            monitor-exit(r2)     // Catch:{ all -> 0x021f }
            goto L_0x021e
        L_0x011f:
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x021f }
            r3.A05 = r0     // Catch:{ all -> 0x021f }
            X.BQ0.A00(r3)     // Catch:{ all -> 0x021f }
            X.CY3 r1 = r3.A04     // Catch:{ all -> 0x021f }
            r0 = 0
            r3.A04 = r0     // Catch:{ all -> 0x021f }
            if (r1 == 0) goto L_0x0130
            X.C26379Cyf.A06(r1, r8)     // Catch:{ all -> 0x021f }
        L_0x0130:
            monitor-exit(r2)     // Catch:{ all -> 0x021f }
            goto L_0x0159
        L_0x0132:
            java.lang.Object r4 = r5.A01
            X.DAU r4 = (X.DAU) r4
            java.lang.Object r3 = r4.A0S
            monitor-enter(r3)
            boolean r0 = r4.A0b     // Catch:{ all -> 0x0223 }
            if (r0 != 0) goto L_0x0140
            monitor-exit(r3)     // Catch:{ all -> 0x0223 }
            goto L_0x0222
        L_0x0140:
            r0 = 0
            r4.A0b = r0     // Catch:{ all -> 0x0223 }
            X.CY3 r1 = r4.A0a     // Catch:{ all -> 0x0223 }
            r0 = 0
            r4.A0a = r0     // Catch:{ all -> 0x0223 }
            if (r1 == 0) goto L_0x0158
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()     // Catch:{ all -> 0x0223 }
            X.AnonymousClass8BS.A1B(r1, r8, r2)     // Catch:{ all -> 0x0223 }
            r1 = 10
            android.os.Handler r0 = r4.A0I     // Catch:{ all -> 0x0223 }
            X.C108955ca.A1F(r0, r2, r1)     // Catch:{ all -> 0x0223 }
        L_0x0158:
            monitor-exit(r3)     // Catch:{ all -> 0x0223 }
        L_0x0159:
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r5.A02
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            return
        L_0x0165:
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            java.lang.Object r0 = r3.A02
        L_0x016b:
            com.facebook.smartcapture.camera.CameraFragment r0 = (com.facebook.smartcapture.camera.CameraFragment) r0
            X.E8K r0 = r0.A09
            java.lang.Object r0 = r0.BbC()
            X.E7g r0 = (X.C28555E7g) r0
        L_0x0175:
            if (r0 == 0) goto L_0x0021
            r0.BtV(r8)
            return
        L_0x017b:
            r0 = 0
            X.C18070vi.A0d(r8, r0)
        L_0x017f:
            X.C26175Cts.A00(r8)
            return
        L_0x0183:
            java.lang.Object r1 = r1.A01
            X.BHG r1 = (X.BHG) r1
            r0 = 0
            r1.A06 = r0
            return
        L_0x018b:
            java.lang.Object r0 = r1.A01
            X.BHG r0 = (X.BHG) r0
            java.lang.String r1 = r0.A0R
            java.lang.String r0 = "Failed to set metering"
            android.util.Log.e(r1, r0)
            return
        L_0x0197:
            java.lang.Object r0 = r1.A01
            X.DEr r0 = (X.C26809DEr) r0
            X.Cc8 r2 = r0.A0T
            java.lang.Integer r1 = X.AnonymousClass00R.A0j
            r0 = 0
            r2.A04(r1, r0)
            return
        L_0x01a4:
            java.lang.Object r0 = r1.A01
            X.DEs r0 = (X.C26810DEs) r0
            X.CkL r3 = r0.A0J
            java.lang.Integer r2 = X.AnonymousClass00R.A0j
            r1 = 0
            X.E4g r0 = r3.A02
            X.C25690CkL.A00(r1, r0, r3, r2)
            return
        L_0x01b3:
            java.lang.Object r1 = r1.A01
            X.BUG r1 = (X.BUG) r1
            r0 = 1
            r1.A02 = r0
            return
        L_0x01bb:
            java.lang.Object r3 = r1.A01
            X.BQ0 r3 = (X.BQ0) r3
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            java.lang.Integer r1 = r3.A05     // Catch:{ all -> 0x01db }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x01db }
            if (r1 != r0) goto L_0x01d9
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x01db }
            r3.A05 = r0     // Catch:{ all -> 0x01db }
            X.BQ0.A00(r3)     // Catch:{ all -> 0x01db }
            X.CY3 r1 = r3.A04     // Catch:{ all -> 0x01db }
            r0 = 0
            r3.A04 = r0     // Catch:{ all -> 0x01db }
            if (r1 == 0) goto L_0x01d9
            X.C26379Cyf.A06(r1, r8)     // Catch:{ all -> 0x01db }
        L_0x01d9:
            monitor-exit(r2)     // Catch:{ all -> 0x01db }
            return
        L_0x01db:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01db }
            throw r0
        L_0x01de:
            java.lang.Object r1 = r1.A01
            X.BPw r1 = (X.C22808BPw) r1
            r0 = 0
            r1.A0S = r0
            return
        L_0x01e6:
            java.lang.Object r1 = r1.A01
            X.DAU r1 = (X.DAU) r1
            r0 = 0
            r1.A0D = r0
            return
        L_0x01ee:
            java.lang.Object r4 = r1.A01
            X.DAU r4 = (X.DAU) r4
            java.lang.Object r3 = r4.A0S
            monitor-enter(r3)
            boolean r0 = r4.A0b     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x0211
            r0 = 0
            r4.A0b = r0     // Catch:{ all -> 0x0213 }
            X.CY3 r1 = r4.A0a     // Catch:{ all -> 0x0213 }
            r0 = 0
            r4.A0a = r0     // Catch:{ all -> 0x0213 }
            if (r1 == 0) goto L_0x0211
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()     // Catch:{ all -> 0x0213 }
            X.AnonymousClass8BS.A1B(r1, r8, r2)     // Catch:{ all -> 0x0213 }
            r1 = 10
            android.os.Handler r0 = r4.A0I     // Catch:{ all -> 0x0213 }
            X.C108955ca.A1F(r0, r2, r1)     // Catch:{ all -> 0x0213 }
        L_0x0211:
            monitor-exit(r3)     // Catch:{ all -> 0x0213 }
            return
        L_0x0213:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0213 }
            throw r0
        L_0x0216:
            java.lang.Object r0 = r5.A02
            X.E9C r0 = (X.E9C) r0
            r0.Bsw(r8)
            return
        L_0x021e:
            return
        L_0x021f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x021f }
            throw r0
        L_0x0222:
            return
        L_0x0223:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0223 }
            throw r0
        L_0x0226:
            java.lang.Object r2 = r3.A01
            X.CmT r2 = (X.C25816CmT) r2
            r1 = 0
            r2.A0F = r1
            r0 = 22
            X.C26175Cts.A01(r8, r0, r1)
            java.lang.Object r0 = r3.A02
            X.E9C r0 = (X.E9C) r0
            r2.A02(r0, r8)
            return
        L_0x023a:
            java.lang.Object r0 = r3.A02
            X.C6E r0 = (X.C6E) r0
            r0.A00(r8)
            java.lang.Object r4 = r3.A01
            X.DEq r4 = (X.C26808DEq) r4
            X.EAf r1 = r4.A01
            int r0 = X.C26175Cts.A00
            if (r1 == 0) goto L_0x0250
            X.CZh r0 = X.C26175Cts.A01
            r0.A02(r1)
        L_0x0250:
            X.Cqv r3 = r4.A06
            X.86M r2 = r4.A05
            X.CnB r1 = r3.A02
            monitor-enter(r1)
            X.86M r0 = r3.A00     // Catch:{ all -> 0x0265 }
            if (r0 != r2) goto L_0x025e
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x0265 }
        L_0x025e:
            monitor-exit(r1)     // Catch:{ all -> 0x0265 }
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            return
        L_0x0265:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0265 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6E.A00(java.lang.Exception):void");
    }

    public void A01(Object obj) {
        Object obj2;
        C25556Chu chu;
        C6E c6e;
        Object obj3;
        if (this instanceof C22900BUl) {
            C22900BUl bUl = (C22900BUl) this;
            bUl.A02.A00 = SystemClock.elapsedRealtime();
            c6e = bUl.A01;
            obj3 = obj;
        } else if (!(this instanceof C22896BUh)) {
            if (this instanceof C22899BUk) {
                C22899BUk bUk = (C22899BUk) this;
                switch (bUk.A00) {
                    case 0:
                        return;
                    case 1:
                        ((C26809DEr) bUk.A01).A0A((E9C) bUk.A02, (C25729Ckz) bUk.A03);
                        return;
                    default:
                        C25556Chu chu2 = (C25556Chu) obj;
                        ((C26808DEq) bUk.A01).A00 = chu2;
                        obj2 = bUk.A02;
                        chu = chu2;
                        break;
                }
            } else if (this instanceof C22898BUj) {
                C22898BUj bUj = (C22898BUj) this;
                if (bUj.A00 != 0) {
                    C25815CmS cmS = (C25815CmS) obj;
                    BQ0 bq0 = (BQ0) bUj.A01;
                    synchronized (bq0.A03) {
                        if (bq0.A05 == AnonymousClass00R.A01) {
                            bq0.A05 = AnonymousClass00R.A00;
                            List list = bq0.A02.A00;
                            if (0 < list.size()) {
                                list.get(0);
                                throw AnonymousClass000.A0s("onVideoCaptureEnded");
                            }
                            CY3 cy3 = bq0.A04;
                            bq0.A04 = null;
                            if (cy3 != null) {
                                CZ9 A02 = C25866CnZ.A02(cmS);
                                if (C26379Cyf.A0A()) {
                                    cy3.A00();
                                } else {
                                    Handler A00 = C26379Cyf.A00();
                                    Object[] A1b = AnonymousClass3MW.A1b();
                                    AnonymousClass001.A1Q(cy3, A02, A1b);
                                    C108955ca.A1F(A00, A1b, 10);
                                }
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    DAU dau = (DAU) bUj.A01;
                    synchronized (dau.A0S) {
                        if (dau.A0b) {
                            dau.A0b = false;
                            CY3 cy32 = dau.A0a;
                            dau.A0a = null;
                            if (cy32 != null) {
                                Object[] A1b2 = AnonymousClass3MW.A1b();
                                AnonymousClass8BS.A1B(cy32, obj, A1b2);
                                C108955ca.A1F(dau.A0I, A1b2, 9);
                            }
                        } else {
                            return;
                        }
                    }
                }
                if (bUj.A03) {
                    ((CountDownLatch) bUj.A02).countDown();
                    return;
                }
                return;
            } else {
                C22897BUi bUi = (C22897BUi) this;
                C25556Chu chu3 = obj;
                switch (bUi.A00) {
                    case 0:
                        break;
                    case 1:
                        ((C25816CmT) bUi.A01).A0F = false;
                        return;
                    case 2:
                        C25556Chu chu4 = (C25556Chu) obj;
                        ((C26808DEq) bUi.A01).A00 = chu4;
                        chu3 = chu4;
                        break;
                    case 3:
                        ((C6E) bUi.A02).A01((Object) null);
                        C26808DEq dEq = (C26808DEq) bUi.A01;
                        C28611EAf eAf = dEq.A01;
                        int i = C26175Cts.A00;
                        if (eAf != null) {
                            C26175Cts.A01.A02(eAf);
                        }
                        C26035Cqv cqv = dEq.A06;
                        AnonymousClass86M r2 = dEq.A05;
                        synchronized (cqv.A02) {
                            if (cqv.A00 == r2) {
                                cqv.A00 = null;
                            }
                        }
                        dEq.A01 = null;
                        dEq.A02 = null;
                        return;
                    case 4:
                        BHG bhg = ((CameraFragment) bUi.A02).A01;
                        if (bhg != null) {
                            bhg.A03((E9C) bUi.A01);
                            return;
                        }
                        return;
                    default:
                        BHG bhg2 = (BHG) bUi.A02;
                        bhg2.A06 = null;
                        ((SurfaceTexture) bUi.A01).release();
                        EAW eaw = bhg2.A07;
                        if (eaw != null) {
                            eaw.C4V();
                            return;
                        }
                        return;
                }
                obj2 = bUi.A02;
                chu = chu3;
            }
            c6e = (C6E) obj2;
            obj3 = chu;
        } else {
            return;
        }
        c6e.A01(obj3);
    }
}
