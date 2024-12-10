package X;

/* renamed from: X.7Ph  reason: invalid class name and case insensitive filesystem */
public class C146487Ph implements Runnable {
    public final int A00;
    public final long A01;
    public final Object A02;

    public C146487Ph(Object obj, long j, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x022d, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0231, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0276, code lost:
        r4.A0J(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0279, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02a4, code lost:
        r3.A19(r0);
        r3.A1q("business_activity_report_timestamp", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        if (r7 <= r2) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04e9, code lost:
        r4.notifyAllObservers(new X.AnonymousClass7KR(r2, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04f1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r5 < r0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0139, code lost:
        r1.A0E(java.lang.Long.valueOf(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0140, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r7 = r18
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x030b;
                case 1: goto L_0x00d3;
                case 2: goto L_0x033c;
                case 3: goto L_0x0370;
                case 4: goto L_0x041a;
                case 5: goto L_0x0028;
                case 6: goto L_0x00ef;
                case 7: goto L_0x0108;
                case 8: goto L_0x0121;
                case 9: goto L_0x0141;
                case 10: goto L_0x0183;
                case 11: goto L_0x01b4;
                case 12: goto L_0x0424;
                case 13: goto L_0x01cd;
                case 14: goto L_0x043d;
                case 15: goto L_0x0447;
                case 16: goto L_0x01f4;
                case 17: goto L_0x0221;
                case 18: goto L_0x045c;
                case 19: goto L_0x0466;
                case 20: goto L_0x027a;
                case 21: goto L_0x028a;
                case 22: goto L_0x047b;
                case 23: goto L_0x04ce;
                case 24: goto L_0x04dc;
                case 25: goto L_0x04f2;
                case 26: goto L_0x02ad;
                case 27: goto L_0x02c1;
                case 28: goto L_0x0500;
                case 29: goto L_0x02ec;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r7.A02
            X.6gk r4 = (X.C128826gk) r4
            long r1 = r7.A01
            X.1W6 r0 = r4.A00
            X.1W2 r0 = r0.A01
            X.206 r3 = r0.A03(r1)
            X.22l r3 = (X.C441822l) r3
            if (r3 == 0) goto L_0x0027
            X.00H r0 = r4.A02
            java.lang.Object r2 = r0.get()
            X.6q0 r2 = (X.C134096q0) r2
            X.83w r1 = X.C1592683w.A00
            r0 = 1
            r2.A01(r3, r1, r0)
        L_0x0027:
            return
        L_0x0028:
            java.lang.Object r13 = r7.A02
            X.7DY r13 = (X.AnonymousClass7DY) r13
            long r7 = r7.A01
            X.6zv r12 = r13.A0T
            if (r12 != 0) goto L_0x0036
            java.lang.String r0 = "recordingController"
            goto L_0x022d
        L_0x0036:
            X.6u4 r0 = r13.A15
            int r0 = r0.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = r12.A00
            long r5 = r5 - r0
            com.whatsapp.camera.recording.RecordingView r11 = r12.A06
            java.lang.String r1 = X.C140086zv.A00(r12, r5)
            android.widget.TextView r0 = r11.A00
            r0.setText(r1)
            r1 = -1
            r10 = 1
            r9 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0085
            int r4 = r3.intValue()
            r0 = 3
            if (r4 != r0) goto L_0x00d0
            long r0 = r12.A01
        L_0x0061:
            long r2 = r12.A03
            r16 = 0
            int r14 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x006e
            int r14 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r15 = 1
            if (r14 > 0) goto L_0x006f
        L_0x006e:
            r15 = 0
        L_0x006f:
            int r14 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x0078
            int r14 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 1
            if (r14 >= 0) goto L_0x0079
        L_0x0078:
            r1 = 0
        L_0x0079:
            if (r15 == 0) goto L_0x0098
            r0 = 3
            if (r4 == r0) goto L_0x0098
            X.6bZ r0 = r12.A05
            X.7DY r0 = r0.A00
            X.AnonymousClass7DY.A0b(r0, r10, r9, r9)
        L_0x0085:
            r3 = 0
        L_0x0086:
            r12.A02(r10, r10, r9)
            android.os.Handler r2 = r12.A04
            r0 = 50
            r2.sendEmptyMessageDelayed(r9, r0)
            X.741 r0 = r13.A0M
            if (r0 != 0) goto L_0x0305
            java.lang.String r0 = "cameraActionsController"
            goto L_0x022d
        L_0x0098:
            if (r1 == 0) goto L_0x00a6
            X.6bZ r0 = r12.A05
            X.7DY r1 = r0.A00
            X.6tV r0 = r1.A1J
            r0.A05 = r10
            X.AnonymousClass7DY.A0b(r1, r10, r9, r9)
            goto L_0x0085
        L_0x00a6:
            r0 = 3
            if (r4 != r0) goto L_0x00cd
            long r0 = r12.A01
        L_0x00ab:
            r14 = 0
            int r15 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r15 > 0) goto L_0x00c9
            r15 = 0
        L_0x00b1:
            r0 = 3
            r1 = 1120403456(0x42c80000, float:100.0)
            if (r4 == r0) goto L_0x00c1
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bd
            float r14 = (float) r7
            float r0 = (float) r2
            float r14 = r14 / r0
        L_0x00bd:
            float r15 = java.lang.Math.max(r14, r15)
        L_0x00c1:
            float r15 = r15 * r1
            int r3 = (int) r15
            com.whatsapp.CircularProgressBar r0 = r11.A01
            r0.setProgress(r3)
            goto L_0x0086
        L_0x00c9:
            float r15 = (float) r5
            float r5 = (float) r0
            float r15 = r15 / r5
            goto L_0x00b1
        L_0x00cd:
            long r0 = r12.A02
            goto L_0x00ab
        L_0x00d0:
            long r0 = r12.A02
            goto L_0x0061
        L_0x00d3:
            java.lang.Object r0 = r7.A02
            X.DGH r0 = (X.DGH) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x00dd:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r2 = r3.next()
            X.EAh r2 = (X.C28613EAh) r2
            long r0 = r7.A01
            r2.C4s(r0)
            goto L_0x00dd
        L_0x00ef:
            java.lang.Object r1 = r7.A02
            X.49f r1 = (X.C826549f) r1
            long r2 = r7.A01
            boolean r0 = X.C108945cZ.A1T(r1)
            if (r0 != 0) goto L_0x0027
            java.lang.ref.WeakReference r0 = r1.A0C
            java.lang.Object r0 = r0.get()
            X.3Ua r0 = (X.AnonymousClass3Ua) r0
            if (r0 == 0) goto L_0x0027
            X.1DT r1 = r0.A0E
            goto L_0x0139
        L_0x0108:
            java.lang.Object r1 = r7.A02
            X.49f r1 = (X.C826549f) r1
            long r2 = r7.A01
            boolean r0 = X.C108945cZ.A1T(r1)
            if (r0 != 0) goto L_0x0027
            java.lang.ref.WeakReference r0 = r1.A0C
            java.lang.Object r0 = r0.get()
            X.3Ua r0 = (X.AnonymousClass3Ua) r0
            if (r0 == 0) goto L_0x0027
            X.1DT r1 = r0.A0A
            goto L_0x0139
        L_0x0121:
            java.lang.Object r1 = r7.A02
            X.49f r1 = (X.C826549f) r1
            long r2 = r7.A01
            boolean r0 = X.C108945cZ.A1T(r1)
            if (r0 != 0) goto L_0x0027
            java.lang.ref.WeakReference r0 = r1.A0C
            java.lang.Object r0 = r0.get()
            X.3Ua r0 = (X.AnonymousClass3Ua) r0
            if (r0 == 0) goto L_0x0027
            X.1DT r1 = r0.A0D
        L_0x0139:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A0E(r0)
            return
        L_0x0141:
            java.lang.Object r1 = r7.A02
            X.37B r1 = (X.AnonymousClass37B) r1
            long r10 = r7.A01
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0027
            X.2i0 r6 = r1.A05
            X.2RD r7 = r1.A01
            X.6ii r8 = r1.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CompanionDeviceQrHandler/onRetry retryTs="
            X.C17900vP.A0m(r0, r1, r10)
            X.2sp r5 = r6.A00
            X.C63292sp.A00(r5)
            X.1U3 r0 = r5.A03
            X.11P r0 = r0.A00
            long r0 = r0.A07()
            long r0 = X.C17880vN.A04(r0)
            r3 = 86400(0x15180, double:4.26873E-319)
            long r3 = r3 + r0
            int r2 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0520
            r0 = 1
            r5.A04(r0)
            X.10I r0 = r5.A0E
            r9 = 2
            X.3C8 r5 = new X.3C8
            r5.<init>(r6, r7, r8, r9, r10)
            r0.CGF(r5)
            return
        L_0x0183:
            java.lang.Object r4 = r7.A02
            X.8ny r4 = (X.C170018ny) r4
            long r1 = r7.A01
            X.00H r0 = r4.A04
            X.206 r3 = X.AnonymousClass1W2.A02(r0, r1)
            if (r3 == 0) goto L_0x01b2
            com.whatsapp.jid.UserJid r1 = r3.A0I()
        L_0x0195:
            X.00H r0 = r4.A0M
            java.lang.Object r0 = r0.get()
            X.4S5 r0 = (X.AnonymousClass4S5) r0
            if (r1 == 0) goto L_0x0027
            com.whatsapp.jid.UserJid r2 = r0.A00(r1)
            if (r3 == 0) goto L_0x0027
            X.00H r0 = r4.A01
            java.lang.Object r1 = r0.get()
            X.A5M r1 = (X.A5M) r1
            r0 = 6
            r1.A02(r2, r3, r0)
            return
        L_0x01b2:
            r1 = 0
            goto L_0x0195
        L_0x01b4:
            java.lang.Object r3 = r7.A02
            X.4aY r3 = (X.AnonymousClass4aY) r3
            long r1 = r7.A01
            X.00H r0 = r3.A5R
            X.206 r1 = X.AnonymousClass1W2.A02(r0, r1)
            if (r1 == 0) goto L_0x0027
            X.1KB r4 = r3.A1L
            r0 = 33
            X.4ra r2 = new X.4ra
            r2.<init>(r3, r1, r0)
            goto L_0x0276
        L_0x01cd:
            java.lang.Object r8 = r7.A02
            X.3VQ r8 = (X.AnonymousClass3VQ) r8
            long r3 = r7.A01
            X.206 r6 = r8.A0T()
            X.1wy r5 = r8.A19
            boolean r0 = X.C72463Mc.A1O(r5)
            if (r0 == 0) goto L_0x0027
            X.205 r0 = r6.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0027
            X.11P r0 = r8.A0i
            long r1 = X.AnonymousClass3MZ.A05(r0, r6)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0545
            r0 = 0
            X.AnonymousClass3MY.A1L(r5, r0)
            return
        L_0x01f4:
            java.lang.Object r5 = r7.A02
            X.1Hb r5 = (X.C23641Hb) r5
            long r3 = r7.A01
            long r1 = r5.A0G
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0027
            X.0z4 r2 = r5.A06
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r2)
            java.lang.String r0 = "voip_call_id"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "session_id_for_voip_call_id"
            X.C17880vN.A1B(r1, r0)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r2)
            java.lang.String r0 = "voip_call_ab_test_bucket"
            X.C17880vN.A1B(r1, r0)
            X.188 r1 = r5.A08
            r0 = 0
            X.C24311Jr.A01(r1, r0)
            return
        L_0x0221:
            java.lang.Object r5 = r7.A02
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView r5 = (com.whatsapp.inappsupportbloks.components.BloksSupportVideoView) r5
            long r2 = r7.A01
            java.lang.String r1 = r5.A0D
            if (r1 != 0) goto L_0x0232
            java.lang.String r0 = "videoUrl"
        L_0x022d:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0232:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = r0.toMicros(r2)
            java.lang.String r0 = "ThumbnailUtils/createVideoThumbnail"
            X.5dc r2 = new X.5dc     // Catch:{ RuntimeException -> 0x0557, IOException -> 0x0553, Exception -> 0x055b }
            r2.<init>(r0)     // Catch:{ RuntimeException -> 0x0557, IOException -> 0x0553, Exception -> 0x055b }
            java.lang.Boolean r0 = X.C17960vV.A01     // Catch:{ all -> 0x0549 }
            java.util.HashMap r0 = X.C17880vN.A11()     // Catch:{ all -> 0x0549 }
            r2.setDataSource(r1, r0)     // Catch:{ all -> 0x0549 }
            r0 = 3
            android.graphics.Bitmap r1 = r2.getFrameAtTime(r3, r0)     // Catch:{ all -> 0x0549 }
            if (r1 != 0) goto L_0x0266
            android.graphics.Bitmap r1 = r2.getFrameAtTime()     // Catch:{ all -> 0x0549 }
            if (r1 != 0) goto L_0x0266
            byte[] r0 = r2.getEmbeddedPicture()     // Catch:{ all -> 0x0549 }
            if (r0 == 0) goto L_0x0261
            android.graphics.Bitmap r1 = X.C72473Md.A0E(r0)     // Catch:{ all -> 0x0549 }
            if (r1 != 0) goto L_0x0266
        L_0x0261:
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/no bitmap created"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0549 }
        L_0x0266:
            r2.close()     // Catch:{ RuntimeException -> 0x0557, IOException -> 0x0553, Exception -> 0x055b }
            if (r1 == 0) goto L_0x0027
            X.1KB r4 = r5.getGlobalUI()
            r0 = 21
            X.7Pj r2 = new X.7Pj
            r2.<init>(r5, r1, r0)
        L_0x0276:
            r4.A0J(r2)
            return
        L_0x027a:
            java.lang.Object r0 = r7.A02
            X.7LR r0 = (X.AnonymousClass7LR) r0
            long r1 = r7.A01
            X.6cV r0 = r0.A00
            if (r0 == 0) goto L_0x0027
            com.whatsapp.report.BusinessActivityReportViewModel r0 = r0.A00
            X.0z4 r3 = r0.A04
            r0 = 1
            goto L_0x02a4
        L_0x028a:
            java.lang.Object r0 = r7.A02
            X.7LS r0 = (X.AnonymousClass7LS) r0
            long r1 = r7.A01
            X.6cU r0 = r0.A00
            if (r0 == 0) goto L_0x0027
            com.whatsapp.report.BusinessActivityReportViewModel r4 = r0.A00
            X.1DT r3 = r4.A01
            r0 = 0
            X.AnonymousClass3MX.A1J(r3, r0)
            X.1DT r3 = r4.A02
            r0 = 1
            X.AnonymousClass3MX.A1J(r3, r0)
            X.0z4 r3 = r4.A04
        L_0x02a4:
            r3.A19(r0)
            java.lang.String r0 = "business_activity_report_timestamp"
            r3.A1q(r0, r1)
            return
        L_0x02ad:
            java.lang.Object r0 = r7.A02
            X.5dl r0 = (X.C109635dl) r0
            long r1 = r7.A01
            java.lang.ref.WeakReference r0 = r0.A09
            java.lang.Object r0 = r0.get()
            X.7Mt r0 = (X.C145827Mt) r0
            if (r0 == 0) goto L_0x0027
            r0.A05(r1)
            return
        L_0x02c1:
            java.lang.Object r6 = r7.A02
            X.74M r6 = (X.AnonymousClass74M) r6
            long r4 = r7.A01
            X.8AX r0 = r6.A1B
            r0.C6Q()
            X.4Wn r1 = r6.A0z
            r0 = 3
            X.C87684Wn.A00(r1, r0)
            X.70F r0 = r6.A0w
            r0.A01()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0027
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r4
            X.6mI r0 = r6.A17
            X.1ni r1 = r0.A01
            r0 = 19
            r1.A00(r0, r2)
            return
        L_0x02ec:
            java.lang.Object r5 = r7.A02
            X.74M r5 = (X.AnonymousClass74M) r5
            long r3 = r7.A01
            boolean r0 = r5.A0c()
            if (r0 == 0) goto L_0x0027
            X.1KB r2 = r5.A0g
            r1 = 27
            X.7Ph r0 = new X.7Ph
            r0.<init>(r5, r3, r1)
            r2.CGP(r0)
            return
        L_0x0305:
            com.whatsapp.CircularProgressBar r0 = r0.A05
            r0.setProgress(r3)
            return
        L_0x030b:
            java.lang.Object r6 = r7.A02
            X.Cjv r6 = (X.C25665Cjv) r6
            java.io.File r0 = X.C25665Cjv.A03
            java.lang.Object r5 = r6.A01
            monitor-enter(r5)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0339 }
            r0 = 23
            if (r1 < r0) goto L_0x0320
            r0 = 100
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x032d }
            goto L_0x0334
        L_0x0320:
            java.io.File r0 = X.C25665Cjv.A03     // Catch:{ all -> 0x0339 }
            long r3 = r0.lastModified()     // Catch:{ all -> 0x0339 }
            long r1 = r7.A01     // Catch:{ all -> 0x0339 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0334
            goto L_0x0320
        L_0x032d:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0339 }
            r0.interrupt()     // Catch:{ all -> 0x0339 }
        L_0x0334:
            r6.A00()     // Catch:{ all -> 0x0339 }
            monitor-exit(r5)     // Catch:{ all -> 0x0339 }
            return
        L_0x0339:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0339 }
            throw r0
        L_0x033c:
            java.lang.Object r8 = r7.A02
            X.8RI r8 = (X.AnonymousClass8RI) r8
            long r0 = r7.A01
            java.lang.String r6 = X.C196429v2.A00(r0)
            com.google.android.material.textfield.TextInputLayout r5 = r8.A02
            java.lang.String r4 = r8.A04
            java.lang.Object[] r3 = X.AnonymousClass3MW.A1a()
            r2 = 0
            r1 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = r6.replace(r1, r0)
            r3[r2] = r0
            java.lang.String r0 = java.lang.String.format(r4, r3)
            r5.setError(r0)
            X.AJN r1 = r8.A07
            com.google.android.material.textfield.TextInputLayout r0 = r8.A08
            java.lang.CharSequence r0 = r0.getError()
            r1.A00 = r0
            X.9Nt r0 = r8.A06
            r0.A00()
            return
        L_0x0370:
            java.lang.Object r5 = r7.A02
            com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner r5 = (com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner) r5
            long r1 = r7.A01
            boolean r0 = r5.isAttachedToWindow()
            if (r0 != 0) goto L_0x0382
            java.lang.String r0 = "VoipInCallNotifBanner/animateIn view is not attached yet"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0382:
            r7 = 0
            r5.setVisibility(r7)
            int r0 = r5.A01
            if (r0 == 0) goto L_0x038e
            int r0 = r5.A00
            if (r0 != 0) goto L_0x03b9
        L_0x038e:
            android.view.ViewParent r0 = r5.getParent()
            android.view.View r0 = (android.view.View) r0
            int r4 = r0.getWidth()
            android.content.res.Resources r3 = r5.getResources()
            r0 = 2131167007(0x7f07071f, float:1.7948275E38)
            int r0 = X.AnonymousClass3MW.A01(r3, r0)
            int r0 = r0 * 2
            int r4 = r4 - r0
            r0 = 1073741824(0x40000000, float:2.0)
            X.C108985cd.A10(r5, r4, r0)
            int r0 = r5.getMeasuredWidth()
            int r0 = r0 / 2
            r5.A00 = r0
            int r0 = r5.getMeasuredHeight()
            r5.A01 = r0
        L_0x03b9:
            android.animation.AnimatorSet r4 = X.C108945cZ.A0B()
            r8 = 600(0x258, double:2.964E-321)
            r4.setDuration(r8)
            X.5co r0 = new X.5co
            r0.<init>(r5, r1)
            r4.addListener(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r1)
            r4.setInterpolator(r0)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            int r9 = r5.A00
            int r8 = r5.A01
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165691(0x7f0701fb, float:1.7945606E38)
            float r6 = r1.getDimension(r0)
            int r0 = r5.A00
            float r2 = (float) r0
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165690(0x7f0701fa, float:1.7945604E38)
            float r0 = r1.getDimension(r0)
            float r2 = r2 + r0
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r5, r9, r8, r6, r2)
            r3.add(r0)
            float[] r2 = X.C108945cZ.A1V()
            int r0 = r5.A0F
            float r0 = (float) r0
            r2[r7] = r0
            r1 = 1
            r0 = 0
            r2[r1] = r0
            java.lang.String r0 = "translationY"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r5, r0, r2)
            r3.add(r0)
            r4.playTogether(r3)
            r4.start()
            return
        L_0x041a:
            java.lang.Object r2 = r7.A02
            X.9oa r2 = (X.C192549oa) r2
            long r0 = r7.A01
            r2.A01(r0)
            return
        L_0x0424:
            java.lang.Object r0 = r7.A02
            X.3VQ r0 = (X.AnonymousClass3VQ) r0
            long r3 = r7.A01
            X.AW1 r1 = r0.A0w
            X.1BI r2 = r0.A0u
            X.1ch r2 = (X.C29681ch) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r5 = 9223372036854675806(0x7ffffffffffe795e, double:NaN)
            r1.A05(r2, r3, r5)
            return
        L_0x043d:
            java.lang.Object r2 = r7.A02
            X.1Qt r2 = (X.C26081Qt) r2
            long r0 = r7.A01
            r2.A07(r0)
            return
        L_0x0447:
            java.lang.Object r0 = r7.A02
            X.1WW r0 = (X.AnonymousClass1WW) r0
            long r2 = r7.A01
            X.00z r1 = r0.A00
            monitor-enter(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0459 }
            r1.A05(r0)     // Catch:{ all -> 0x0459 }
            monitor-exit(r1)     // Catch:{ all -> 0x0459 }
            return
        L_0x0459:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0459 }
            throw r0
        L_0x045c:
            java.lang.Object r2 = r7.A02
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView r2 = (com.whatsapp.inappsupportbloks.components.BloksSupportVideoView) r2
            long r0 = r7.A01
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView.A01(r2, r0)
            return
        L_0x0466:
            java.lang.Object r5 = r7.A02
            com.whatsapp.migration.export.ui.ExportMigrationActivity r5 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r5
            long r3 = r7.A01
            X.9pX r2 = X.C108965cb.A0S(r5)
            java.lang.String r1 = r5.A0L
            r0 = 9
            r2.A00(r1, r0)
            com.whatsapp.migration.export.ui.ExportMigrationActivity.A0Q(r5, r3)
            return
        L_0x047b:
            java.lang.Object r5 = r7.A02
            com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver r5 = (com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver) r5
            long r0 = r7.A01
            X.1Uq r2 = r5.A07
            X.1Cd r2 = r2.A03
            X.1au r7 = r2.A05()
            r6 = 1
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x04c4 }
            r9.<init>(r6)     // Catch:{ all -> 0x04c4 }
            java.lang.String r4 = "is_upcoming"
            r3 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x04c4 }
            r9.put(r4, r2)     // Catch:{ all -> 0x04c4 }
            r2 = r7
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x04c4 }
            X.1Ev r8 = r2.A02     // Catch:{ all -> 0x04c4 }
            java.lang.String r10 = "scheduled_calls"
            java.lang.String r11 = "creation_message_row_id = ?"
            java.lang.String[] r13 = new java.lang.String[r6]     // Catch:{ all -> 0x04c4 }
            X.C17880vN.A1V(r13, r3, r0)     // Catch:{ all -> 0x04c4 }
            java.lang.String r12 = "ScheduledCallsStore/UPDATE_IS_UPCOMING_SCHEDULED_CALL_BY_ROW_ID"
            int r2 = r8.A02(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x04c4 }
            if (r2 != 0) goto L_0x04b4
            java.lang.String r2 = "ScheduledCallsStore/updateScheduledCallIsUpcomingToFalse (by row ID) failed to update"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x04c4 }
        L_0x04b4:
            r7.close()
            X.1KB r4 = r5.A01
            r3 = 23
            X.7Ph r2 = new X.7Ph
            r2.<init>(r5, r0, r3)
            r4.A0J(r2)
            return
        L_0x04c4:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x04c9 }
            throw r1
        L_0x04c9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x04ce:
            java.lang.Object r0 = r7.A02
            com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver r0 = (com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver) r0
            long r2 = r7.A01
            X.00H r0 = r0.A0A
            X.10T r4 = X.C17880vN.A0V(r0)
            r1 = 1
            goto L_0x04e9
        L_0x04dc:
            java.lang.Object r0 = r7.A02
            X.1m1 r0 = (X.C35311m1) r0
            long r2 = r7.A01
            X.00H r0 = r0.A0A
            X.10T r4 = X.C17880vN.A0V(r0)
            r1 = 2
        L_0x04e9:
            X.7KR r0 = new X.7KR
            r0.<init>(r2, r1)
            r4.notifyAllObservers(r0)
            return
        L_0x04f2:
            java.lang.Object r2 = r7.A02
            X.6gc r2 = (X.C128746gc) r2
            long r0 = r7.A01
            monitor-enter(r2)
            r2.A00 = r0     // Catch:{ all -> 0x04fd }
            monitor-exit(r2)
            return
        L_0x04fd:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0500:
            java.lang.Object r1 = r7.A02
            X.74M r1 = (X.AnonymousClass74M) r1
            long r3 = r7.A01
            X.6tp r2 = r1.A1A
            X.70T r0 = r1.A0I
            if (r0 == 0) goto L_0x051d
            int r0 = r0.A03()
            long r5 = (long) r0
        L_0x0511:
            X.70F r0 = r1.A0w
            boolean r9 = r0.A0B
            long r7 = java.lang.System.currentTimeMillis()
            r2.A01(r3, r5, r7, r9)
            return
        L_0x051d:
            r5 = -1
            goto L_0x0511
        L_0x0520:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "CompanionDeviceAdvUtil/isRetryTimestampValid retryTs="
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = "; ntpTs="
            X.C17900vP.A0l(r2, r3, r0)
            java.lang.String r0 = "CompanionDeviceQrHandler/onRetry invalid local ts"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.6xH r3 = r5.A05
            X.BCS r2 = r3.A04
            r1 = -7
            r0 = 1
            r2.BiF(r0, r1)
            X.5bt r0 = r3.A05
            r0.Bw6()
            return
        L_0x0545:
            X.AnonymousClass3VQ.A0B(r8, r6)
            return
        L_0x0549:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x054e }
            goto L_0x0552
        L_0x054e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ RuntimeException -> 0x0557, IOException -> 0x0553, Exception -> 0x055b }
        L_0x0552:
            throw r1     // Catch:{ RuntimeException -> 0x0557, IOException -> 0x0553, Exception -> 0x055b }
        L_0x0553:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/unable to load video"
            goto L_0x055e
        L_0x0557:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/corrupt video file"
            goto L_0x055e
        L_0x055b:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/unknown exception"
        L_0x055e:
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146487Ph.run():void");
    }
}
