package X;

import java.util.concurrent.Callable;

/* renamed from: X.DVt  reason: case insensitive filesystem */
public class C27132DVt implements Callable {
    public final int A00;
    public final Object A01;

    public C27132DVt(C26809DEr dEr, int i) {
        this.A00 = i;
        switch (i) {
            case 8:
            case 9:
                this.A01 = dEr;
                return;
            default:
                this.A01 = dEr;
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call() {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x018d;
                case 1: goto L_0x01c1;
                case 2: goto L_0x00fa;
                case 3: goto L_0x01ca;
                case 4: goto L_0x01f6;
                case 5: goto L_0x0012;
                case 6: goto L_0x0258;
                case 7: goto L_0x025d;
                case 8: goto L_0x0268;
                case 9: goto L_0x029d;
                case 10: goto L_0x02d0;
                case 11: goto L_0x02dd;
                case 12: goto L_0x0355;
                case 13: goto L_0x0374;
                case 14: goto L_0x037d;
                case 15: goto L_0x002f;
                case 16: goto L_0x0154;
                case 17: goto L_0x0168;
                case 18: goto L_0x043d;
                case 19: goto L_0x039f;
                case 20: goto L_0x03a8;
                case 21: goto L_0x005a;
                case 22: goto L_0x03ab;
                case 23: goto L_0x0005;
                case 24: goto L_0x0062;
                case 25: goto L_0x007f;
                case 26: goto L_0x0005;
                case 27: goto L_0x009a;
                case 28: goto L_0x00af;
                case 29: goto L_0x00d4;
                case 30: goto L_0x03b8;
                case 31: goto L_0x00dd;
                case 32: goto L_0x03bf;
                case 33: goto L_0x00e6;
                case 34: goto L_0x03c8;
                case 35: goto L_0x00f0;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            X.DRB r0 = (X.DRB) r0
            X.DRB.A06(r0)
        L_0x000c:
            r1 = 0
        L_0x000d:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
        L_0x0011:
            return r6
        L_0x0012:
            java.lang.Object r1 = r7.A01
            X.DEs r1 = (X.C26810DEs) r1
            boolean r0 = r1.isConnected()
            r6 = 0
            if (r0 == 0) goto L_0x0011
            X.CWY r4 = r1.A0K
            X.CYE r5 = r4.A00
            int r0 = r5.A00
            r2 = 4
            r0 = r0 & 4
            if (r0 == r2) goto L_0x0011
            java.util.concurrent.locks.ReentrantLock r3 = r5.A01
            r3.lock()
            goto L_0x03d1
        L_0x002f:
            java.lang.Object r4 = r7.A01
            X.CvG r4 = (X.C26225CvG) r4
            boolean r0 = r4.A0R
            r6 = 0
            if (r0 == 0) goto L_0x0011
            java.util.List r1 = r4.A0P
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0011
            r0 = 0
            java.lang.Object r0 = r1.remove(r0)
            X.C5E r0 = (X.C5E) r0
            if (r0 == 0) goto L_0x0011
            boolean r3 = r0.A00
            boolean r0 = r0.A01
            X.CnB r2 = r4.A0O
            X.DVU r1 = new X.DVU
            r1.<init>(r4, r3, r0)
            java.lang.String r0 = "restart_preview_on_background_thread"
            r2.A07(r0, r1)
            return r6
        L_0x005a:
            java.lang.Object r0 = r7.A01
            X.DRB r0 = (X.DRB) r0
            r1 = 0
            r0.A0N = r1
            goto L_0x000d
        L_0x0062:
            java.lang.Object r3 = r7.A01
            X.DRB r3 = (X.DRB) r3
            android.os.HandlerThread r0 = r3.A0B
            X.C17960vV.A04(r0)
            r2 = 0
            int[] r1 = X.C25244Cbg.A00     // Catch:{ Exception -> 0x0076 }
            X.E04 r0 = new X.E04     // Catch:{ Exception -> 0x0076 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0076 }
            r3.A06 = r0     // Catch:{ Exception -> 0x0076 }
            goto L_0x000c
        L_0x0076:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.DRB.A05(r3)
            r1 = -5
            goto L_0x000d
        L_0x007f:
            java.lang.Object r1 = r7.A01
            X.DRB r1 = (X.DRB) r1
            X.CZE r6 = r1.A04     // Catch:{ RuntimeException -> 0x0438 }
            if (r6 != 0) goto L_0x0011
            X.CZE r6 = new X.CZE     // Catch:{ RuntimeException -> 0x0438 }
            r6.<init>()     // Catch:{ RuntimeException -> 0x0438 }
            int r0 = r6.A00     // Catch:{ RuntimeException -> 0x0438 }
            if (r0 != 0) goto L_0x0435
            java.lang.String r0 = "voip/video/SurfaceTextureHolder/createSurfaceTexture, failed to generate gl texture"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x0438 }
            r6.A00()     // Catch:{ RuntimeException -> 0x0438 }
            goto L_0x0434
        L_0x009a:
            java.lang.Object r1 = r7.A01
            X.DRB r1 = (X.DRB) r1
            boolean r0 = X.DRB.A08(r1)
            if (r0 != 0) goto L_0x00a7
            r1 = -6
            goto L_0x000d
        L_0x00a7:
            float[] r0 = X.DRB.A0O
            int r1 = X.DRB.A03(r1, r0)
            goto L_0x000d
        L_0x00af:
            java.lang.Object r2 = r7.A01
            X.DRB r2 = (X.DRB) r2
            X.CZE r0 = r2.A04
            if (r0 == 0) goto L_0x000c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/CoreVideoPort/ releasing surface texture holder for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r2.A0D
            X.C17900vP.A0b(r0, r1)
            X.CZE r0 = r2.A04
            r0.A00()
            android.os.HandlerThread r0 = r2.A0B
            X.C17960vV.A04(r0)
            r0 = 0
            r2.A04 = r0
            goto L_0x000c
        L_0x00d4:
            java.lang.Object r0 = r7.A01
            X.DRB r0 = (X.DRB) r0
            X.DRB.A05(r0)
            goto L_0x000c
        L_0x00dd:
            java.lang.Object r0 = r7.A01
            X.BwM r0 = (X.C24156BwM) r0
            X.C24156BwM.A04(r0)
            goto L_0x000c
        L_0x00e6:
            java.lang.Object r0 = r7.A01
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r0 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r0
            int r1 = r0.startOnCameraThread()
            goto L_0x000d
        L_0x00f0:
            java.lang.Object r0 = r7.A01
            org.pjsip.PjCamera r0 = (org.pjsip.PjCamera) r0
            int r1 = r0.updatePreviewOrientationOnCameraThread()
            goto L_0x000d
        L_0x00fa:
            java.lang.Object r1 = r7.A01
            X.DEs r1 = (X.C26810DEs) r1
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L_0x0444
            boolean r0 = r1.A0e
            if (r0 != 0) goto L_0x0444
            X.CkL r3 = r1.A0J
            X.CnB r1 = r3.A06
            java.lang.String r0 = "Focus reset must happen on the Optic thread."
            r1.A06(r0)
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0444
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0444
            r0 = 0
            r3.A07 = r0
            r3.A08 = r0
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            r1 = 0
            X.E4g r0 = r3.A02
            X.C25690CkL.A00(r1, r0, r3, r2)
            android.hardware.Camera r0 = r3.A01
            X.C28111Yx.A02(r0)
            r0.cancelAutoFocus()
            X.Cav r1 = r3.A05
            int r0 = r3.A00
            X.BUu r3 = r1.A00(r0)
            X.CKJ r2 = X.C25971Cpe.A0C
            java.util.List r1 = java.util.Collections.emptyList()
            X.Csq r0 = r3.A00
            r0.A04(r2, r1)
            X.CKJ r2 = X.C25971Cpe.A0f
            java.util.List r1 = java.util.Collections.emptyList()
            X.Csq r0 = r3.A00
            r0.A04(r2, r1)
            r3.A03()
            r3.A02()
            goto L_0x0444
        L_0x0154:
            java.lang.Object r1 = r7.A01     // Catch:{ Exception -> 0x017f }
            X.CvG r1 = (X.C26225CvG) r1     // Catch:{ Exception -> 0x017f }
            X.E9T r0 = r1.A08     // Catch:{ Exception -> 0x017f }
            if (r0 == 0) goto L_0x0160
            r0.BAM()     // Catch:{ Exception -> 0x017f }
            goto L_0x018a
        L_0x0160:
            X.DEy r0 = r1.A0L     // Catch:{ Exception -> 0x017f }
            X.Caw r0 = r0.A01     // Catch:{ Exception -> 0x017f }
            r0.A01()     // Catch:{ Exception -> 0x017f }
            goto L_0x018a
        L_0x0168:
            java.lang.Object r1 = r7.A01     // Catch:{ Exception -> 0x017f }
            X.CvG r1 = (X.C26225CvG) r1     // Catch:{ Exception -> 0x017f }
            X.E9T r0 = r1.A08     // Catch:{ Exception -> 0x017f }
            if (r0 == 0) goto L_0x0177
            r0.close()     // Catch:{ Exception -> 0x017f }
            r0 = 0
            r1.A08 = r0     // Catch:{ Exception -> 0x017f }
            goto L_0x018a
        L_0x0177:
            X.DEy r0 = r1.A0L     // Catch:{ Exception -> 0x017f }
            X.Caw r0 = r0.A01     // Catch:{ Exception -> 0x017f }
            r0.A01()     // Catch:{ Exception -> 0x017f }
            goto L_0x018a
        L_0x017f:
            java.lang.Object r1 = r7.A01
            X.CvG r1 = (X.C26225CvG) r1
            X.DEy r0 = r1.A0L
            X.Caw r0 = r0.A01
            r0.A01()
        L_0x018a:
            X.DEy r6 = r1.A0L
            return r6
        L_0x018d:
            java.lang.Object r3 = r7.A01
            X.DTd r3 = (X.C27078DTd) r3
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A03
            r2 = 1
            r0.set(r2)
            r0 = 10
            r6 = 0
            android.os.Process.setThreadPriority(r0)     // Catch:{ all -> 0x01b5 }
            X.BLf r0 = r3.A06     // Catch:{ 1QC -> 0x01a4 }
            java.lang.Object r6 = r0.A06()     // Catch:{ 1QC -> 0x01a4 }
            goto L_0x01ae
        L_0x01a4:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A02     // Catch:{ all -> 0x01b5 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x01b5 }
            if (r0 != 0) goto L_0x01ae
            throw r1     // Catch:{ all -> 0x01b5 }
        L_0x01ae:
            android.os.Binder.flushPendingCommands()     // Catch:{ all -> 0x01b5 }
            r3.A00(r6)
            return r6
        L_0x01b5:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A02     // Catch:{ all -> 0x01bc }
            r0.set(r2)     // Catch:{ all -> 0x01bc }
            throw r1     // Catch:{ all -> 0x01bc }
        L_0x01bc:
            r1 = move-exception
            r3.A00(r6)
            throw r1
        L_0x01c1:
            java.lang.Object r0 = r7.A01
            X.DGT r0 = (X.DGT) r0
            X.E94 r6 = X.DGT.A01(r0)
            return r6
        L_0x01ca:
            java.lang.Object r1 = r7.A01
            X.DEs r1 = (X.C26810DEs) r1
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L_0x0444
            X.CbQ r2 = r1.A0L
            monitor-enter(r2)
            X.CZh r0 = r2.A03     // Catch:{ all -> 0x01f3 }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x01f3 }
            boolean r0 = X.AnonymousClass000.A1a(r0)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0444
            android.hardware.Camera r0 = r1.A0a
            X.C28111Yx.A02(r0)
            r2.A01(r0)
            monitor-enter(r2)
            java.util.ArrayList r0 = r2.A04     // Catch:{ all -> 0x01f3 }
            r0.clear()     // Catch:{ all -> 0x01f3 }
            monitor-exit(r2)
            goto L_0x0444
        L_0x01f3:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x01f6:
            java.lang.Object r4 = r7.A01
            X.DEs r4 = (X.C26810DEs) r4
            r5 = 0
            int r1 = r4.A00
            r0 = 15
            X.C26175Cts.A01(r5, r0, r1)
            java.lang.String r0 = "Cannot switch cameras."
            r4.A0C(r0)     // Catch:{ Exception -> 0x024f }
            int r0 = r4.A00     // Catch:{ Exception -> 0x024f }
            r2 = 1
            boolean r3 = X.AnonymousClass000.A1P(r0)
            X.CuP r0 = r4.A0I     // Catch:{ Exception -> 0x024f }
            boolean r0 = r0.A06(r3)     // Catch:{ Exception -> 0x024f }
            if (r0 != 0) goto L_0x0236
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x024f }
            java.lang.String r0 = "Cannot switch to "
            r1.append(r0)     // Catch:{ Exception -> 0x024f }
            if (r3 != r2) goto L_0x0222
            goto L_0x0225
        L_0x0222:
            java.lang.String r0 = "BACK"
            goto L_0x0227
        L_0x0225:
            java.lang.String r0 = "FRONT"
        L_0x0227:
            r1.append(r0)     // Catch:{ Exception -> 0x024f }
            java.lang.String r0 = ", camera is not present"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x024f }
            X.Dak r0 = new X.Dak     // Catch:{ Exception -> 0x024f }
            r0.<init>(r1)     // Catch:{ Exception -> 0x024f }
            throw r0     // Catch:{ Exception -> 0x024f }
        L_0x0236:
            X.C26810DEs.A07(r4, r3)     // Catch:{ Exception -> 0x024f }
            X.EBS r2 = r4.A06     // Catch:{ Exception -> 0x024f }
            X.C28111Yx.A02(r2)     // Catch:{ Exception -> 0x024f }
            X.CYs r1 = r4.A07     // Catch:{ Exception -> 0x024f }
            X.C28111Yx.A02(r1)     // Catch:{ Exception -> 0x024f }
            int r0 = r4.A01     // Catch:{ Exception -> 0x024f }
            X.Chu r6 = X.C26810DEs.A02(r4, r2, r1, r0)     // Catch:{ Exception -> 0x024f }
            r0 = 17
            X.C26175Cts.A01(r5, r0, r3)     // Catch:{ Exception -> 0x024f }
            return r6
        L_0x024f:
            r2 = move-exception
            int r1 = r4.A00
            r0 = 16
            X.C26175Cts.A01(r2, r0, r1)
            throw r2
        L_0x0258:
            X.C26194CuP.A02()
            goto L_0x0444
        L_0x025d:
            java.lang.Object r1 = r7.A01
            X.Cy7 r1 = (X.Cy7) r1
            int r0 = r1.A02
            r1.A00(r0)
            goto L_0x0444
        L_0x0268:
            java.lang.Object r4 = r7.A01
            X.DEr r4 = (X.C26809DEr) r4
            boolean r0 = r4.isConnected()
            if (r0 == 0) goto L_0x0295
            r4.A09()
            X.EAW r0 = r4.A0o
            if (r0 == 0) goto L_0x0290
            X.EAW r3 = r4.A0o
            int r2 = r4.A02
            r0 = 1
            r1 = 90
            if (r2 == r0) goto L_0x028d
            r0 = 2
            r1 = 180(0xb4, float:2.52E-43)
            if (r2 == r0) goto L_0x028d
            r0 = 3
            r1 = 270(0x10e, float:3.78E-43)
            if (r2 == r0) goto L_0x028d
            r1 = 0
        L_0x028d:
            r3.Bnd(r1)
        L_0x0290:
            X.Chu r6 = X.C25556Chu.A00(r4)
            return r6
        L_0x0295:
            java.lang.String r0 = "Can not update preview display rotation"
            X.DZg r1 = new X.DZg
            r1.<init>(r0)
            throw r1
        L_0x029d:
            java.lang.Object r0 = r7.A01
            X.DEr r0 = (X.C26809DEr) r0
            X.CvG r2 = r0.A0V
            X.Ca9 r1 = r2.A0I
            java.lang.String r0 = "Can only check if is retrieving preview frames from the Optic thread"
            r1.A01(r0)
            java.lang.String r0 = "Can only check if the prepared on the Optic thread"
            r1.A01(r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x02b9
            boolean r0 = r2.A0S
            if (r0 == 0) goto L_0x02b9
        L_0x02b7:
            r6 = 0
            return r6
        L_0x02b9:
            r1 = 1
            r0 = 0
            r2.A0A(r1, r0)     // Catch:{ CameraAccessException | IllegalArgumentException -> 0x02b7, Exception -> 0x02bf }
            goto L_0x02b7
        L_0x02bf:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Could not start preview: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)
            X.Da2 r1 = new X.Da2
            r1.<init>(r0)
            throw r1
        L_0x02d0:
            java.lang.Object r0 = r7.A01
            X.CKA r0 = (X.CKA) r0
            X.DEr r0 = r0.A00
            X.CXb r0 = r0.A0W
            r0.A00()
            goto L_0x0444
        L_0x02dd:
            java.lang.Object r3 = r7.A01
            X.DEr r3 = (X.C26809DEr) r3
            int r2 = r3.A00
            r1 = 15
            r0 = 0
            X.C26175Cts.A01(r0, r1, r2)
            android.hardware.camera2.CameraDevice r0 = r3.A0l     // Catch:{ Exception -> 0x0347 }
            if (r0 == 0) goto L_0x032e
            int r0 = r3.A00     // Catch:{ Exception -> 0x0347 }
            r4 = 1
            boolean r2 = X.AnonymousClass000.A1P(r0)
            X.CvA r1 = r3.A0S     // Catch:{ Exception -> 0x0347 }
            r0 = 1
            if (r2 != r4) goto L_0x02fa
            r0 = 0
        L_0x02fa:
            boolean r0 = r1.A08(r0)     // Catch:{ Exception -> 0x0347 }
            if (r0 != 0) goto L_0x030e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0347 }
            java.lang.String r0 = "Cannot switch to "
            r1.append(r0)     // Catch:{ Exception -> 0x0347 }
            if (r2 != r4) goto L_0x0336
            java.lang.String r0 = "FRONT"
            goto L_0x0338
        L_0x030e:
            r3.A0s = r4     // Catch:{ Exception -> 0x0347 }
            java.lang.String r0 = r1.A07(r2)     // Catch:{ Exception -> 0x0347 }
            X.C26809DEr.A04(r3, r0)     // Catch:{ Exception -> 0x0347 }
            r3.A0B(r0)     // Catch:{ Exception -> 0x0347 }
            X.C26809DEr.A02(r3)     // Catch:{ Exception -> 0x0347 }
            r1 = 0
            X.C26809DEr.A03(r3, r1, r0)     // Catch:{ Exception -> 0x0347 }
            X.Chu r6 = X.C25556Chu.A00(r3)     // Catch:{ Exception -> 0x0347 }
            r0 = 17
            X.C26175Cts.A01(r1, r0, r2)     // Catch:{ Exception -> 0x0347 }
            r0 = 0
            r3.A0s = r0
            return r6
        L_0x032e:
            java.lang.String r0 = "Cannot switch camera, no cameras open."
            X.Da2 r1 = new X.Da2     // Catch:{ Exception -> 0x0347 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0347 }
            goto L_0x0346
        L_0x0336:
            java.lang.String r0 = "BACK"
        L_0x0338:
            r1.append(r0)     // Catch:{ Exception -> 0x0347 }
            java.lang.String r0 = ", camera is not present"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x0347 }
            X.Dak r1 = new X.Dak     // Catch:{ Exception -> 0x0347 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0347 }
        L_0x0346:
            throw r1     // Catch:{ Exception -> 0x0347 }
        L_0x0347:
            r2 = move-exception
            int r1 = r3.A00     // Catch:{ all -> 0x0350 }
            r0 = 16
            X.C26175Cts.A01(r2, r0, r1)     // Catch:{ all -> 0x0350 }
            throw r2     // Catch:{ all -> 0x0350 }
        L_0x0350:
            r1 = move-exception
            r0 = 0
            r3.A0s = r0
            throw r1
        L_0x0355:
            java.lang.Object r1 = r7.A01
            X.DEr r1 = (X.C26809DEr) r1
            boolean r0 = X.C26809DEr.A07(r1)
            if (r0 != 0) goto L_0x0444
            X.CvG r3 = r1.A0V
            boolean r0 = r3.A0R
            if (r0 == 0) goto L_0x0444
            r0 = 0
            X.CnB r2 = r3.A0O
            X.DVU r1 = new X.DVU
            r1.<init>(r3, r0, r0)
            java.lang.String r0 = "restart_preview_on_background_thread"
            r2.A07(r0, r1)
            goto L_0x0444
        L_0x0374:
            java.lang.Object r0 = r7.A01
            X.CvA r0 = (X.C26221CvA) r0
            X.C26221CvA.A03(r0)
            goto L_0x0444
        L_0x037d:
            java.lang.Object r0 = r7.A01
            X.CKF r0 = (X.CKF) r0
            X.CvG r4 = r0.A00
            X.Ca9 r1 = r4.A0I
            java.lang.String r0 = "Method onCameraSessionActive must be called on Optic Thread."
            r1.A01(r0)
            X.DEx r3 = new X.DEx
            r3.<init>()
            X.CnB r2 = r4.A0O
            r0 = 13
            X.DVY r1 = new X.DVY
            r1.<init>(r4, r3, r0)
            java.lang.String r0 = "camera_session_active_on_camera_handler_thread"
            r2.A04(r0, r1)
            goto L_0x0444
        L_0x039f:
            java.lang.Object r0 = r7.A01
            X.0wX r0 = (X.C18500wX) r0
            java.lang.String r6 = r0.A00()
            return r6
        L_0x03a8:
            java.lang.Object r6 = r7.A01
            return r6
        L_0x03ab:
            java.lang.Object r0 = r7.A01
            X.DRB r0 = (X.DRB) r0
            boolean r0 = X.DRB.A08(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x03b8:
            java.lang.Object r6 = r7.A01
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            return r6
        L_0x03bf:
            java.lang.Object r0 = r7.A01
            com.whatsapp.voipcalling.camera.VoipLiteCamera r0 = (com.whatsapp.voipcalling.camera.VoipLiteCamera) r0
            java.lang.Integer r6 = com.whatsapp.voipcalling.camera.VoipLiteCamera.updatePreviewOrientation$lambda$8(r0)
            return r6
        L_0x03c8:
            java.lang.Object r0 = r7.A01
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r0 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r0
            java.lang.Integer r6 = r0.m78lambda$stop$4$comwhatsappvoipcallingcameraVoipPhysicalCamera()
            return r6
        L_0x03d1:
            boolean r1 = r5.A00()     // Catch:{ all -> 0x042f }
            r3.lock()     // Catch:{ all -> 0x042f }
            boolean r0 = r5.A01()     // Catch:{ all -> 0x042a }
            if (r0 != 0) goto L_0x03fc
            r3.lock()     // Catch:{ all -> 0x042a }
            int r0 = r5.A00     // Catch:{ all -> 0x03f7 }
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1T(r0, r2)
            r3.unlock()     // Catch:{ all -> 0x042a }
            if (r0 != 0) goto L_0x03fc
            int r0 = r5.A00     // Catch:{ all -> 0x042a }
            r0 = r0 | 4
            r0 = r0 & -2
            r5.A00 = r0     // Catch:{ all -> 0x042a }
            goto L_0x03fc
        L_0x03f7:
            r0 = move-exception
            r3.unlock()     // Catch:{ all -> 0x042a }
            throw r0     // Catch:{ all -> 0x042a }
        L_0x03fc:
            r3.unlock()     // Catch:{ all -> 0x042f }
            if (r1 == 0) goto L_0x0426
            r1 = 0
            r0 = 18
            X.C26175Cts.A01(r6, r0, r1)     // Catch:{ all -> 0x042f }
            X.CXw r0 = r4.A03     // Catch:{ all -> 0x042f }
            if (r0 == 0) goto L_0x0410
            X.CXw r0 = r4.A03     // Catch:{ all -> 0x042f }
            r0.A00()     // Catch:{ all -> 0x042f }
        L_0x0410:
            X.CZh r1 = r4.A01     // Catch:{ all -> 0x042f }
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x042f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x042f }
            if (r0 != 0) goto L_0x0426
            java.util.List r2 = r1.A00     // Catch:{ all -> 0x042f }
            r1 = 14
            X.DTa r0 = new X.DTa     // Catch:{ all -> 0x042f }
            r0.<init>(r4, r2, r1)     // Catch:{ all -> 0x042f }
            X.C26078Crs.A00(r0)     // Catch:{ all -> 0x042f }
        L_0x0426:
            r3.unlock()
            return r6
        L_0x042a:
            r0 = move-exception
            r3.unlock()     // Catch:{ all -> 0x042f }
            throw r0     // Catch:{ all -> 0x042f }
        L_0x042f:
            r1 = move-exception
            r3.unlock()
            throw r1
        L_0x0434:
            r6 = 0
        L_0x0435:
            r1.A04 = r6     // Catch:{ RuntimeException -> 0x0438 }
            return r6
        L_0x0438:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x0444
        L_0x043d:
            java.lang.Object r0 = r7.A01
            X.DEe r0 = (X.C26796DEe) r0
            X.C26796DEe.A00(r0)
        L_0x0444:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27132DVt.call():java.lang.Object");
    }

    public C27132DVt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
