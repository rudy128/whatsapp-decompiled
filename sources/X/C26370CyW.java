package X;

import android.os.Handler;

/* renamed from: X.CyW  reason: case insensitive filesystem */
public class C26370CyW implements Handler.Callback {
    public final int A00;
    public final Object A01;

    public C26370CyW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0149, code lost:
        if (r4 != null) goto L_0x014b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r23) {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.A00
            r6 = r23
            switch(r1) {
                case 0: goto L_0x00c2;
                case 1: goto L_0x0066;
                case 2: goto L_0x0165;
                case 3: goto L_0x0550;
                case 4: goto L_0x00a5;
                case 5: goto L_0x011a;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r5 = r0.A01
            X.BwF r5 = (X.C24149BwF) r5
            boolean r0 = r5.A0R
            if (r0 == 0) goto L_0x0064
            boolean r0 = r5.A0K
            if (r0 != 0) goto L_0x005c
            X.70X r0 = r5.A0H
            if (r0 == 0) goto L_0x005c
            boolean r0 = r0.A0a()
            if (r0 == 0) goto L_0x005c
            X.70X r0 = r5.A0H
            int r0 = r0.A06()
            if (r0 == 0) goto L_0x005c
            X.70X r0 = r5.A0H
            int r0 = r0.A05()
            long r2 = X.C17890vO.A03(r0)
            X.70X r0 = r5.A0H
            int r0 = r0.A06()
            long r0 = (long) r0
            long r2 = r2 / r0
            android.widget.ProgressBar r0 = r5.A0l
            int r1 = (int) r2
            r0.setProgress(r1)
            boolean r0 = r5.A0S
            if (r0 != 0) goto L_0x005c
            android.widget.SeekBar r0 = r5.A0m
            r0.setProgress(r1)
            android.widget.TextView r4 = r5.A0n
            java.lang.StringBuilder r3 = r5.A0u
            java.util.Formatter r2 = r5.A0v
            X.70X r0 = r5.A0H
            int r0 = r0.A05()
            long r0 = (long) r0
            java.lang.String r0 = X.CDS.A00(r3, r2, r0)
            r4.setText(r0)
        L_0x005c:
            android.os.Handler r3 = r5.A0V
            r2 = 0
            r0 = 50
            r3.sendEmptyMessageDelayed(r2, r0)
        L_0x0064:
            r0 = 1
            return r0
        L_0x0066:
            java.lang.Object r5 = r0.A01
            X.CvD r5 = (X.C26223CvD) r5
            int r0 = r6.what
            r4 = 1
            if (r0 != r4) goto L_0x055a
            java.util.List r3 = r5.A0A
            java.util.List r2 = r5.A09
            int r1 = r6.arg1
            r5.A06()
            if (r3 == 0) goto L_0x0064
            if (r2 == 0) goto L_0x0064
            int r0 = r3.size()
            if (r1 >= r0) goto L_0x0064
            X.CZh r1 = r5.A0F
            int r0 = X.AnonymousClass3MX.A02(r2, r4)
            r2.get(r0)
            int r0 = X.AnonymousClass3MX.A02(r3, r4)
            r3.get(r0)
            java.util.List r2 = r1.A00
            int r1 = r2.size()
            r0 = 0
            if (r0 >= r1) goto L_0x0064
            r2.get(r0)
            java.lang.String r0 = "onZoomChange"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00a5:
            int r1 = r6.what
            if (r1 != 0) goto L_0x055a
            java.lang.Object r3 = r0.A01
            X.Cv5 r3 = (X.C26218Cv5) r3
            java.lang.Object r2 = r6.obj
            X.CQC r2 = (X.CQC) r2
            java.lang.Object r1 = r3.A03
            monitor-enter(r1)
            X.CQC r0 = r3.A00     // Catch:{ all -> 0x054d }
            if (r0 == r2) goto L_0x00bc
            X.CQC r0 = r3.A01     // Catch:{ all -> 0x054d }
            if (r0 != r2) goto L_0x00c0
        L_0x00bc:
            r0 = 2
            X.C26218Cv5.A04(r2, r3, r0)     // Catch:{ all -> 0x054d }
        L_0x00c0:
            monitor-exit(r1)     // Catch:{ all -> 0x054d }
            goto L_0x0064
        L_0x00c2:
            int r1 = r6.what
            r3 = 0
            r5 = 1
            if (r1 != r5) goto L_0x00fd
            java.lang.Object r4 = r0.A01
            X.Cy7 r4 = (X.Cy7) r4
            boolean r1 = r4.A0B
            if (r1 == 0) goto L_0x00fd
            java.util.List r2 = r4.A0A
            int r1 = r6.arg1
            if (r2 == 0) goto L_0x0064
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0064
            r2.get(r1)
            r2.get(r3)
            int r0 = X.AnonymousClass3MX.A02(r2, r5)
            r2.get(r0)
            X.CZh r0 = r4.A06
            java.util.List r1 = r0.A00
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x0064
            r1.get(r3)
            java.lang.String r0 = "onZoomChange"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00fd:
            int r2 = r6.what
            r1 = 2
            if (r2 != r1) goto L_0x055a
            java.lang.Object r0 = r0.A01
            X.Cy7 r0 = (X.Cy7) r0
            X.CZh r0 = r0.A06
            java.util.List r1 = r0.A00
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x0064
            r1.get(r3)
            java.lang.String r0 = "onZoomError"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x011a:
            java.lang.Object r1 = r0.A01
            X.1ry r1 = (X.C38831ry) r1
            boolean r7 = X.C18070vi.A15(r1, r6)
            X.C17960vV.A02()
            java.lang.Object r5 = r6.obj
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.inflater.WaAsyncInflateRequest"
            X.C18070vi.A0z(r5, r0)
            X.1s1 r5 = (X.C38861s1) r5
            android.view.View r4 = r5.A01
            if (r4 != 0) goto L_0x014b
            java.lang.String r0 = "Couldn't async inflate the view, will proceed with the inflation on the main thread"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0vl r0 = r1.A01
            java.lang.Object r2 = X.AnonymousClass3MX.A14(r0)
            android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2
            int r1 = r5.A00
            android.view.ViewGroup r0 = r5.A02
            android.view.View r4 = r2.inflate(r1, r0, r7)
            r5.A01 = r4
            if (r4 == 0) goto L_0x0158
        L_0x014b:
            X.1bG r3 = r5.A03
            if (r3 == 0) goto L_0x0158
            int r2 = r5.A00
            java.lang.String r1 = r5.A05
            android.view.ViewGroup r0 = r5.A02
            r3.Bvv(r4, r0, r1, r2)
        L_0x0158:
            r0 = 0
            r5.A03 = r0
            r5.A04 = r0
            r5.A02 = r0
            r5.A00 = r7
            r5.A01 = r0
            goto L_0x0064
        L_0x0165:
            java.lang.Object r15 = r0.A01     // Catch:{ all -> 0x0544 }
            X.CvW r15 = (X.C26236CvW) r15     // Catch:{ all -> 0x0544 }
            int r1 = r6.what     // Catch:{ all -> 0x0544 }
            switch(r1) {
                case 1: goto L_0x0524;
                case 2: goto L_0x03cf;
                case 3: goto L_0x02eb;
                case 4: goto L_0x0211;
                case 5: goto L_0x020c;
                case 6: goto L_0x02d5;
                case 7: goto L_0x0200;
                case 8: goto L_0x01e5;
                case 9: goto L_0x0170;
                default: goto L_0x016e;
            }     // Catch:{ all -> 0x0544 }
        L_0x016e:
            goto L_0x055a
        L_0x0170:
            java.lang.Object r3 = r6.obj     // Catch:{ all -> 0x0544 }
            X.C26159CtX.A01(r3)     // Catch:{ all -> 0x0544 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0544 }
            int r2 = r15.A00     // Catch:{ all -> 0x0544 }
            r1 = 2
            if (r2 == r1) goto L_0x055a
            r15.A00 = r1     // Catch:{ all -> 0x0544 }
            java.lang.Object r4 = r3.first     // Catch:{ all -> 0x0544 }
            java.util.HashSet r4 = (java.util.HashSet) r4     // Catch:{ all -> 0x0544 }
            r15.A09 = r4     // Catch:{ all -> 0x0544 }
            java.lang.Object r1 = r3.second     // Catch:{ all -> 0x0544 }
            int r1 = X.BE6.A0F(r1)     // Catch:{ all -> 0x0544 }
            long r5 = (long) r1     // Catch:{ all -> 0x0544 }
            r2 = 0
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x01d2
            int r1 = r4.size()     // Catch:{ all -> 0x0544 }
            java.lang.Integer[] r1 = new java.lang.Integer[r1]     // Catch:{ all -> 0x0544 }
            java.lang.Object[] r2 = r4.toArray(r1)     // Catch:{ all -> 0x0544 }
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2     // Catch:{ all -> 0x0544 }
            r1 = 0
            r1 = r2[r1]     // Catch:{ all -> 0x0544 }
            X.CrM r3 = r15.A05     // Catch:{ all -> 0x0544 }
            X.C26159CtX.A01(r3)     // Catch:{ all -> 0x0544 }
            X.BzJ r2 = X.C24322BzJ.AUDIO     // Catch:{ all -> 0x0544 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0544 }
            X.Cmm r1 = r3.A03(r2, r1)     // Catch:{ all -> 0x0544 }
            if (r1 == 0) goto L_0x01d2
            java.util.List r1 = r1.A04     // Catch:{ all -> 0x0544 }
            X.CcJ r3 = X.BE9.A0Q(r1)     // Catch:{ all -> 0x0544 }
            X.E7q r2 = r15.A0G     // Catch:{ IOException -> 0x01d0 }
            X.CUT r1 = r15.A08     // Catch:{ IOException -> 0x01d0 }
            X.CZT r1 = r1.A08     // Catch:{ IOException -> 0x01d0 }
            boolean r1 = r1.A02()     // Catch:{ IOException -> 0x01d0 }
            long r3 = X.C26162Ctb.A02(r2, r3, r1)     // Catch:{ IOException -> 0x01d0 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ IOException -> 0x01d0 }
            long r1 = r1.toMicros(r5)     // Catch:{ IOException -> 0x01d0 }
            long r5 = java.lang.Math.min(r3, r1)     // Catch:{ IOException -> 0x01d0 }
            goto L_0x01d2
        L_0x01d0:
            r5 = 0
        L_0x01d2:
            r3 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0544 }
            X.A5W r1 = new X.A5W     // Catch:{ all -> 0x0544 }
            r1.<init>(r2, r3, r5)     // Catch:{ all -> 0x0544 }
            r15.A04 = r1     // Catch:{ all -> 0x0544 }
            boolean r1 = X.C26236CvW.A04(r15)     // Catch:{ all -> 0x0544 }
            if (r1 == 0) goto L_0x055a
            goto L_0x0533
        L_0x01e5:
            java.lang.Object r3 = r6.obj     // Catch:{ all -> 0x0544 }
            X.CrM r3 = (X.C26052CrM) r3     // Catch:{ all -> 0x0544 }
            X.CUT r1 = r15.A08     // Catch:{ all -> 0x0544 }
            X.CpX r2 = new X.CpX     // Catch:{ all -> 0x0544 }
            r2.<init>(r1)     // Catch:{ all -> 0x0544 }
            r2.A06 = r3     // Catch:{ all -> 0x0544 }
            X.CUT r1 = new X.CUT     // Catch:{ all -> 0x0544 }
            r1.<init>(r2)     // Catch:{ all -> 0x0544 }
            r15.A08 = r1     // Catch:{ all -> 0x0544 }
            r15.A05 = r3     // Catch:{ all -> 0x0544 }
            X.C26236CvW.A02(r15)     // Catch:{ all -> 0x0544 }
            goto L_0x055a
        L_0x0200:
            java.lang.Object r1 = r6.obj     // Catch:{ all -> 0x0544 }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0544 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x0544 }
            X.C26236CvW.A03(r15, r1)     // Catch:{ all -> 0x0544 }
            goto L_0x055a
        L_0x020c:
            X.C26236CvW.A01(r15)     // Catch:{ all -> 0x0544 }
            goto L_0x055a
        L_0x0211:
            java.lang.Object r1 = r6.obj     // Catch:{ all -> 0x0544 }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0544 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0544 }
            long r4 = r1.longValue()     // Catch:{ all -> 0x0544 }
            long r11 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0544 }
            r15.A02 = r4     // Catch:{ all -> 0x02ad }
            X.Cml r1 = r15.A07     // Catch:{ all -> 0x02ad }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x02ad }
            r1.A01(r4)     // Catch:{ all -> 0x02ad }
            X.Cml r1 = r15.A06     // Catch:{ all -> 0x02ad }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x02ad }
            r1.A01(r4)     // Catch:{ all -> 0x02ad }
            java.util.Map r1 = r15.A0K     // Catch:{ all -> 0x02ad }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x02ad }
            java.util.HashSet r1 = X.AnonymousClass8BR.A12(r1)     // Catch:{ all -> 0x02ad }
            java.util.Iterator r10 = r1.iterator()     // Catch:{ all -> 0x02ad }
        L_0x0240:
            boolean r1 = r10.hasNext()     // Catch:{ all -> 0x02ad }
            if (r1 == 0) goto L_0x0276
            java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x02ad }
            int r6 = X.BE6.A0F(r1)     // Catch:{ all -> 0x02ad }
            X.EAT r3 = X.C26236CvW.A00(r15, r6)     // Catch:{ all -> 0x02ad }
            if (r3 == 0) goto L_0x0240
            X.CrM r2 = r15.A05     // Catch:{ all -> 0x02ad }
            X.C26159CtX.A01(r2)     // Catch:{ all -> 0x02ad }
            X.BzJ r1 = X.C24322BzJ.AUDIO     // Catch:{ all -> 0x02ad }
            X.Cmm r1 = r2.A03(r1, r6)     // Catch:{ all -> 0x02ad }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x02ad }
            long r8 = r1.A00     // Catch:{ all -> 0x02ad }
            r6 = 0
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x026c
            r8 = 0
        L_0x026c:
            long r1 = r4 - r8
            long r1 = java.lang.Math.max(r1, r6)     // Catch:{ all -> 0x02ad }
            r3.CHA(r1)     // Catch:{ all -> 0x02ad }
            goto L_0x0240
        L_0x0276:
            r1 = 0
            r15.A0A = r1     // Catch:{ all -> 0x02ad }
            X.CSu r2 = r15.A0F     // Catch:{ all -> 0x02ad }
            X.E9k r1 = r2.A02     // Catch:{ all -> 0x02ad }
            r1.flush()     // Catch:{ all -> 0x02ad }
            java.nio.ByteBuffer r1 = r2.A00     // Catch:{ all -> 0x02ad }
            r1.clear()     // Catch:{ all -> 0x02ad }
            X.Coy r7 = r15.A0E     // Catch:{ all -> 0x0544 }
            if (r7 == 0) goto L_0x055a
            long r2 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0544 }
            long r2 = r2 - r11
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0544 }
            long r5 = r1.toMillis(r4)     // Catch:{ all -> 0x0544 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0544 }
            long r3 = r1.toMillis(r2)     // Catch:{ all -> 0x0544 }
            java.util.HashMap r2 = X.C17880vN.A11()     // Catch:{ all -> 0x0544 }
            java.lang.String r1 = "target_position_ms"
            X.BE7.A1I(r1, r2, r5)     // Catch:{ all -> 0x0544 }
            java.lang.String r1 = "latency_ms"
            X.BE7.A1I(r1, r2, r3)     // Catch:{ all -> 0x0544 }
            X.C25933Coy.A00(r7, r2)     // Catch:{ all -> 0x0544 }
            goto L_0x055a
        L_0x02ad:
            r8 = move-exception
            X.Coy r7 = r15.A0E     // Catch:{ all -> 0x0544 }
            if (r7 == 0) goto L_0x02d4
            long r2 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0544 }
            long r2 = r2 - r11
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0544 }
            long r5 = r1.toMillis(r4)     // Catch:{ all -> 0x0544 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0544 }
            long r3 = r1.toMillis(r2)     // Catch:{ all -> 0x0544 }
            java.util.HashMap r2 = X.C17880vN.A11()     // Catch:{ all -> 0x0544 }
            java.lang.String r1 = "target_position_ms"
            X.BE7.A1I(r1, r2, r5)     // Catch:{ all -> 0x0544 }
            java.lang.String r1 = "latency_ms"
            X.BE7.A1I(r1, r2, r3)     // Catch:{ all -> 0x0544 }
            X.C25933Coy.A00(r7, r2)     // Catch:{ all -> 0x0544 }
        L_0x02d4:
            throw r8     // Catch:{ all -> 0x0544 }
        L_0x02d5:
            int r2 = r15.A00     // Catch:{ all -> 0x0544 }
            r1 = 1
            if (r2 != r1) goto L_0x055a
            r1 = 0
            r15.A00 = r1     // Catch:{ all -> 0x0544 }
            X.CSu r2 = r15.A0F     // Catch:{ all -> 0x0544 }
            X.E9k r1 = r2.A02     // Catch:{ all -> 0x0544 }
            r1.flush()     // Catch:{ all -> 0x0544 }
            java.nio.ByteBuffer r1 = r2.A00     // Catch:{ all -> 0x0544 }
            r1.clear()     // Catch:{ all -> 0x0544 }
            goto L_0x055a
        L_0x02eb:
            long r10 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0544 }
            X.CrM r7 = r15.A05     // Catch:{ all -> 0x03b2 }
            X.C26159CtX.A01(r7)     // Catch:{ all -> 0x03b2 }
            X.CrM r8 = r15.A05     // Catch:{ all -> 0x03b2 }
            X.C26159CtX.A01(r8)     // Catch:{ all -> 0x03b2 }
            X.BzJ r6 = X.C24322BzJ.AUDIO     // Catch:{ all -> 0x03b2 }
            X.E7q r5 = r15.A0G     // Catch:{ all -> 0x03b2 }
            X.CUT r1 = r15.A08     // Catch:{ all -> 0x03b2 }
            X.CZT r1 = r1.A08     // Catch:{ all -> 0x03b2 }
            boolean r1 = r1.A02()     // Catch:{ all -> 0x03b2 }
            long r3 = X.C26162Ctb.A00(r5, r6, r8, r1)     // Catch:{ all -> 0x03b2 }
            X.BzJ r2 = X.C24322BzJ.VIDEO     // Catch:{ all -> 0x03b2 }
            X.CUT r1 = r15.A08     // Catch:{ all -> 0x03b2 }
            X.CZT r1 = r1.A08     // Catch:{ all -> 0x03b2 }
            boolean r1 = r1.A02()     // Catch:{ all -> 0x03b2 }
            long r1 = X.C26162Ctb.A00(r5, r2, r8, r1)     // Catch:{ all -> 0x03b2 }
            long r1 = java.lang.Math.max(r3, r1)     // Catch:{ all -> 0x03b2 }
            r15.A03 = r1     // Catch:{ all -> 0x03b2 }
            java.util.HashMap r1 = r7.A06(r6)     // Catch:{ all -> 0x03b2 }
            if (r1 == 0) goto L_0x03ab
            int r1 = r1.size()     // Catch:{ all -> 0x03b2 }
            r15.A01 = r1     // Catch:{ all -> 0x03b2 }
            X.A5W[] r1 = new X.A5W[r1]     // Catch:{ all -> 0x03b2 }
            r15.A0B = r1     // Catch:{ all -> 0x03b2 }
            r4 = 0
        L_0x032e:
            int r1 = r15.A01     // Catch:{ all -> 0x03b2 }
            if (r4 >= r1) goto L_0x0359
            X.Cmm r2 = r7.A03(r6, r4)     // Catch:{ all -> 0x03b2 }
            X.C26159CtX.A01(r2)     // Catch:{ all -> 0x03b2 }
            X.CUT r1 = r15.A08     // Catch:{ all -> 0x03b2 }
            X.CZT r1 = r1.A08     // Catch:{ all -> 0x03b2 }
            boolean r1 = r1.A02()     // Catch:{ all -> 0x03b2 }
            long r8 = X.C26162Ctb.A01(r5, r2, r1)     // Catch:{ all -> 0x03b2 }
            X.A5W[] r3 = r15.A0B     // Catch:{ all -> 0x03b2 }
            long r1 = r2.A00     // Catch:{ all -> 0x03b2 }
            long r20 = r1 + r8
            java.util.concurrent.TimeUnit r17 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x03b2 }
            X.A5W r16 = new X.A5W     // Catch:{ all -> 0x03b2 }
            r18 = r1
            r16.<init>(r17, r18, r20)     // Catch:{ all -> 0x03b2 }
            r3[r4] = r16     // Catch:{ all -> 0x03b2 }
            int r4 = r4 + 1
            goto L_0x032e
        L_0x0359:
            java.util.HashMap r5 = X.C17880vN.A11()     // Catch:{ all -> 0x03b2 }
            X.A5W[] r4 = r15.A0B     // Catch:{ all -> 0x03b2 }
            X.C26159CtX.A01(r4)     // Catch:{ all -> 0x03b2 }
            r3 = 0
        L_0x0363:
            int r1 = r4.length     // Catch:{ all -> 0x03b2 }
            if (r3 >= r1) goto L_0x0372
            java.lang.String r2 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x03b2 }
            r1 = r4[r3]     // Catch:{ all -> 0x03b2 }
            r5.put(r2, r1)     // Catch:{ all -> 0x03b2 }
            int r3 = r3 + 1
            goto L_0x0363
        L_0x0372:
            boolean r1 = r15 instanceof X.C22928BVv     // Catch:{ all -> 0x03b2 }
            if (r1 == 0) goto L_0x038b
            long r18 = X.C26236CvW.A0P     // Catch:{ all -> 0x03b2 }
        L_0x0378:
            X.CUT r1 = r15.A08     // Catch:{ all -> 0x03b2 }
            X.CZT r1 = r1.A08     // Catch:{ all -> 0x03b2 }
            X.BW7 r14 = new X.BW7     // Catch:{ all -> 0x03b2 }
            r16 = r1
            r17 = r5
            r14.<init>(r15, r16, r17, r18)     // Catch:{ all -> 0x03b2 }
            r15.A07 = r14     // Catch:{ all -> 0x03b2 }
            X.C26236CvW.A02(r15)     // Catch:{ all -> 0x03b2 }
            goto L_0x038e
        L_0x038b:
            r18 = 0
            goto L_0x0378
        L_0x038e:
            X.Coy r5 = r15.A0E     // Catch:{ all -> 0x0544 }
            if (r5 == 0) goto L_0x055a
            long r2 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0544 }
            long r2 = r2 - r10
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0544 }
            long r3 = r1.toMillis(r2)     // Catch:{ all -> 0x0544 }
            java.util.HashMap r2 = X.C17880vN.A11()     // Catch:{ all -> 0x0544 }
            java.lang.String r1 = "latency_ms"
            X.BE7.A1I(r1, r2, r3)     // Catch:{ all -> 0x0544 }
            X.C25933Coy.A00(r5, r2)     // Catch:{ all -> 0x0544 }
            goto L_0x055a
        L_0x03ab:
            java.lang.String r1 = "No audio tracks"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r1)     // Catch:{ all -> 0x03b2 }
            throw r1     // Catch:{ all -> 0x03b2 }
        L_0x03b2:
            r6 = move-exception
            X.Coy r5 = r15.A0E     // Catch:{ all -> 0x0544 }
            if (r5 == 0) goto L_0x03ce
            long r2 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0544 }
            long r2 = r2 - r10
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0544 }
            long r3 = r1.toMillis(r2)     // Catch:{ all -> 0x0544 }
            java.util.HashMap r2 = X.C17880vN.A11()     // Catch:{ all -> 0x0544 }
            java.lang.String r1 = "latency_ms"
            X.BE7.A1I(r1, r2, r3)     // Catch:{ all -> 0x0544 }
            X.C25933Coy.A00(r5, r2)     // Catch:{ all -> 0x0544 }
        L_0x03ce:
            throw r6     // Catch:{ all -> 0x0544 }
        L_0x03cf:
            int r2 = r15.A00     // Catch:{ all -> 0x0544 }
            r1 = 1
            r8 = 2
            if (r2 == r8) goto L_0x03d7
            if (r2 != r1) goto L_0x055a
        L_0x03d7:
            int r1 = r15.A01     // Catch:{ all -> 0x0544 }
            if (r1 == 0) goto L_0x055a
            boolean r1 = r15.A0A     // Catch:{ all -> 0x0544 }
            if (r1 != 0) goto L_0x04e9
            java.util.Map r4 = r15.A0K     // Catch:{ all -> 0x0544 }
            java.util.Set r1 = r4.keySet()     // Catch:{ all -> 0x0544 }
            java.util.HashSet r1 = X.AnonymousClass8BR.A12(r1)     // Catch:{ all -> 0x0544 }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ all -> 0x0544 }
        L_0x03ed:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x0544 }
            if (r1 == 0) goto L_0x0430
            java.lang.Object r7 = r9.next()     // Catch:{ all -> 0x0544 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0544 }
            int r5 = r7.intValue()     // Catch:{ all -> 0x0544 }
            X.A5W[] r1 = r15.A0B     // Catch:{ all -> 0x0544 }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0544 }
            r6 = r1[r5]     // Catch:{ all -> 0x0544 }
            long r1 = r15.A02     // Catch:{ all -> 0x0544 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0544 }
            boolean r1 = r6.A05(r1, r3)     // Catch:{ all -> 0x0544 }
            if (r1 == 0) goto L_0x03ed
            int r1 = r15.A00     // Catch:{ all -> 0x0544 }
            if (r1 != r8) goto L_0x041b
            java.util.HashSet r1 = r15.A09     // Catch:{ all -> 0x0544 }
            boolean r1 = r1.contains(r7)     // Catch:{ all -> 0x0544 }
            if (r1 != 0) goto L_0x041b
            goto L_0x03ed
        L_0x041b:
            X.CSu r1 = r15.A0F     // Catch:{ all -> 0x0544 }
            X.CpL r1 = r1.A01     // Catch:{ all -> 0x0544 }
            boolean[] r2 = r1.A03     // Catch:{ all -> 0x0544 }
            r1 = 1
            r2[r5] = r1     // Catch:{ all -> 0x0544 }
            X.EAT r3 = X.C26236CvW.A00(r15, r5)     // Catch:{ all -> 0x0544 }
            if (r3 == 0) goto L_0x03ed
            long r1 = r15.A02     // Catch:{ all -> 0x0544 }
            r3.BI7(r1)     // Catch:{ all -> 0x0544 }
            goto L_0x03ed
        L_0x0430:
            r3 = 0
        L_0x0431:
            int r1 = r15.A01     // Catch:{ all -> 0x0544 }
            if (r3 >= r1) goto L_0x0447
            boolean r1 = X.C108965cb.A1a(r4, r3)     // Catch:{ all -> 0x0544 }
            if (r1 != 0) goto L_0x0444
            X.CSu r1 = r15.A0F     // Catch:{ all -> 0x0544 }
            X.CpL r1 = r1.A01     // Catch:{ all -> 0x0544 }
            boolean[] r2 = r1.A03     // Catch:{ all -> 0x0544 }
            r1 = 0
            r2[r3] = r1     // Catch:{ all -> 0x0544 }
        L_0x0444:
            int r3 = r3 + 1
            goto L_0x0431
        L_0x0447:
            int r1 = r15.A00     // Catch:{ all -> 0x0544 }
            X.CSu r10 = r15.A0F     // Catch:{ all -> 0x0544 }
            long r2 = r15.A02     // Catch:{ all -> 0x0544 }
            if (r1 == r8) goto L_0x04d2
            X.CpL r11 = r10.A01     // Catch:{ all -> 0x0544 }
            java.nio.ByteBuffer[] r6 = r10.A04     // Catch:{ all -> 0x0544 }
            java.nio.ByteBuffer r1 = r11.A01     // Catch:{ all -> 0x0544 }
            if (r1 != 0) goto L_0x045f
            int r1 = r11.A00     // Catch:{ all -> 0x0544 }
            java.nio.ByteBuffer r1 = X.BEA.A0u(r1)     // Catch:{ all -> 0x0544 }
            r11.A01 = r1     // Catch:{ all -> 0x0544 }
        L_0x045f:
            r1.clear()     // Catch:{ all -> 0x0544 }
            int r12 = r6.length     // Catch:{ all -> 0x0544 }
            java.nio.ByteBuffer[] r9 = new java.nio.ByteBuffer[r12]     // Catch:{ all -> 0x0544 }
            r5 = 0
        L_0x0466:
            if (r5 >= r12) goto L_0x0483
            boolean[] r1 = r11.A03     // Catch:{ all -> 0x0544 }
            boolean r1 = r1[r5]     // Catch:{ all -> 0x0544 }
            r4 = r6[r5]     // Catch:{ all -> 0x0544 }
            if (r1 == 0) goto L_0x047e
            java.util.List[] r1 = r11.A02     // Catch:{ all -> 0x0544 }
            r1 = r1[r5]     // Catch:{ all -> 0x0544 }
            java.nio.ByteBuffer r4 = X.C25953CpL.A00(r4, r1)     // Catch:{ all -> 0x0544 }
            java.util.List r1 = r11.A04     // Catch:{ all -> 0x0544 }
            java.nio.ByteBuffer r4 = X.C25953CpL.A00(r4, r1)     // Catch:{ all -> 0x0544 }
        L_0x047e:
            r9[r5] = r4     // Catch:{ all -> 0x0544 }
            int r5 = r5 + 1
            goto L_0x0466
        L_0x0483:
            r7 = 0
        L_0x0484:
            int r1 = r11.A00     // Catch:{ all -> 0x0544 }
            if (r7 >= r1) goto L_0x04c2
            r13 = 0
            r6 = 0
        L_0x048a:
            if (r13 >= r12) goto L_0x04ba
            boolean[] r1 = r11.A03     // Catch:{ all -> 0x0544 }
            boolean r1 = r1[r13]     // Catch:{ all -> 0x0544 }
            if (r1 == 0) goto L_0x04b7
            r1 = r9[r13]     // Catch:{ all -> 0x0544 }
            short r14 = r1.getShort(r7)     // Catch:{ all -> 0x0544 }
            int r5 = X.C25953CpL.A05     // Catch:{ all -> 0x0544 }
            int r6 = r6 + r5
            int r14 = r14 + r5
            if (r6 >= r5) goto L_0x04a1
            if (r14 >= r5) goto L_0x04a1
            goto L_0x04ad
        L_0x04a1:
            int r1 = r6 + r14
            int r4 = r1 * 2
            int r6 = r6 * r14
            int r6 = r6 / r5
            int r4 = r4 - r6
            int r1 = X.C25953CpL.A06     // Catch:{ all -> 0x0544 }
            int r6 = r4 - r1
            goto L_0x04af
        L_0x04ad:
            int r6 = r6 * r14
            int r6 = r6 / r5
        L_0x04af:
            int r1 = X.C25953CpL.A06     // Catch:{ all -> 0x0544 }
            if (r6 != r1) goto L_0x04b5
            int r6 = r1 + -1
        L_0x04b5:
            int r6 = r6 - r5
            short r6 = (short) r6     // Catch:{ all -> 0x0544 }
        L_0x04b7:
            int r13 = r13 + 1
            goto L_0x048a
        L_0x04ba:
            java.nio.ByteBuffer r1 = r11.A01     // Catch:{ all -> 0x0544 }
            r1.putShort(r6)     // Catch:{ all -> 0x0544 }
            int r7 = r7 + 2
            goto L_0x0484
        L_0x04c2:
            java.nio.ByteBuffer r1 = r11.A01     // Catch:{ all -> 0x0544 }
            r1.flip()     // Catch:{ all -> 0x0544 }
            java.nio.ByteBuffer r1 = r11.A01     // Catch:{ all -> 0x0544 }
            r10.A00 = r1     // Catch:{ all -> 0x0544 }
            X.CqW r1 = r10.A03     // Catch:{ all -> 0x0544 }
            if (r1 == 0) goto L_0x04d2
            r1.A02(r2)     // Catch:{ all -> 0x0544 }
        L_0x04d2:
            long r2 = r15.A02     // Catch:{ all -> 0x0544 }
            long r4 = r15.A0C     // Catch:{ all -> 0x0544 }
            long r2 = r2 + r4
            r15.A02 = r2     // Catch:{ all -> 0x0544 }
            X.Cml r1 = r15.A07     // Catch:{ all -> 0x0544 }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0544 }
            r1.A01(r2)     // Catch:{ all -> 0x0544 }
            X.Cml r1 = r15.A06     // Catch:{ all -> 0x0544 }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0544 }
            r1.A01(r2)     // Catch:{ all -> 0x0544 }
        L_0x04e9:
            X.CSu r3 = r15.A0F     // Catch:{ all -> 0x0544 }
            X.E9k r2 = r3.A02     // Catch:{ all -> 0x0544 }
            java.nio.ByteBuffer r1 = r3.A00     // Catch:{ all -> 0x0544 }
            r2.CCf(r1)     // Catch:{ all -> 0x0544 }
            java.nio.ByteBuffer r1 = r3.A00     // Catch:{ all -> 0x0544 }
            boolean r1 = r1.hasRemaining()     // Catch:{ all -> 0x0544 }
            r1 = r1 ^ 1
            r1 = r1 ^ 1
            r15.A0A = r1     // Catch:{ all -> 0x0544 }
            boolean r1 = X.C26236CvW.A04(r15)     // Catch:{ all -> 0x0544 }
            if (r1 != 0) goto L_0x0517
            X.CqW r1 = r3.A03     // Catch:{ all -> 0x0544 }
            if (r1 == 0) goto L_0x050b
            r1.A01()     // Catch:{ all -> 0x0544 }
        L_0x050b:
            boolean r1 = r2.CNN()     // Catch:{ all -> 0x0544 }
            if (r1 == 0) goto L_0x0517
            android.os.Handler r1 = r15.A0D     // Catch:{ all -> 0x0544 }
            r1.removeMessages(r8)     // Catch:{ all -> 0x0544 }
            goto L_0x055a
        L_0x0517:
            android.os.Handler r2 = r15.A0D     // Catch:{ all -> 0x0544 }
            boolean r1 = r2.hasMessages(r8)     // Catch:{ all -> 0x0544 }
            if (r1 != 0) goto L_0x055a
            android.os.Message r1 = r2.obtainMessage(r8)     // Catch:{ all -> 0x0544 }
            goto L_0x0540
        L_0x0524:
            X.Coy r3 = r15.A0E     // Catch:{ all -> 0x0544 }
            r2 = 1
            if (r3 == 0) goto L_0x0531
            int r1 = r15.A00     // Catch:{ all -> 0x0544 }
            if (r1 == r2) goto L_0x0531
            r1 = 0
            X.C25933Coy.A00(r3, r1)     // Catch:{ all -> 0x0544 }
        L_0x0531:
            r15.A00 = r2     // Catch:{ all -> 0x0544 }
        L_0x0533:
            android.os.Handler r3 = r15.A0D     // Catch:{ all -> 0x0544 }
            r2 = 2
            boolean r1 = r3.hasMessages(r2)     // Catch:{ all -> 0x0544 }
            if (r1 != 0) goto L_0x055a
            android.os.Message r1 = r3.obtainMessage(r2)     // Catch:{ all -> 0x0544 }
        L_0x0540:
            r1.sendToTarget()     // Catch:{ all -> 0x0544 }
            goto L_0x055a
        L_0x0544:
            r1 = move-exception
            java.lang.Object r0 = r0.A01
            X.CvW r0 = (X.C26236CvW) r0
            X.C26236CvW.A03(r0, r1)
            goto L_0x055a
        L_0x054d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x054d }
            throw r0
        L_0x0550:
            int r1 = r6.what
            r0 = 1
            if (r1 != r0) goto L_0x055a
            java.lang.Object r0 = r6.obj
            X.C199610h.A04(r0)
        L_0x055a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26370CyW.handleMessage(android.os.Message):boolean");
    }
}
