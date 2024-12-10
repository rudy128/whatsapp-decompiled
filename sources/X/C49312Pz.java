package X;

/* renamed from: X.2Pz  reason: invalid class name and case insensitive filesystem */
public final class C49312Pz extends C201010v {
    public final AnonymousClass190 A00;
    public final AnonymousClass3KS A01;
    public final C63342su A02;

    public C49312Pz(AnonymousClass190 r2, AnonymousClass3KS r3, C63342su r4) {
        super("ReaderThread");
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (X.C29621ca.A07(r4, "notification") != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            java.lang.String r17 = "ReaderThread/error"
            r8 = 1
            android.os.Process.setThreadPriority(r8)
        L_0x0006:
            r7 = 0
            r6 = r18
            X.2su r5 = r6.A02     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            X.1eo r13 = r5.A0H     // Catch:{ 1UI | IOException -> 0x018a, RuntimeException -> 0x01b9 }
            X.1ca r4 = r13.A06()     // Catch:{ 1UI | IOException -> 0x018a, RuntimeException -> 0x01b9 }
            if (r4 != 0) goto L_0x0015
            goto L_0x017c
        L_0x0015:
            boolean r0 = r5.A0C     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            if (r0 != 0) goto L_0x00c2
            java.lang.String r10 = "message"
            boolean r16 = X.C29621ca.A07(r4, r10)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            if (r16 != 0) goto L_0x0032
            java.lang.String r0 = "receipt"
            boolean r0 = X.C29621ca.A07(r4, r0)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "notification"
            boolean r1 = X.C29621ca.A07(r4, r0)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            r0 = 0
            if (r1 == 0) goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            java.lang.String r12 = "notification"
            java.lang.String r11 = "receipt"
            java.lang.String r9 = "offline"
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = X.C29621ca.A02(r4, r9)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x0081
            java.lang.String r2 = "t"
            r0 = -1
            long r2 = r4.A0D(r2, r0)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x0059
            long r0 = r5.A08     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r14
            long r0 = java.lang.Math.min(r0, r2)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            r5.A08 = r0     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
        L_0x0059:
            r2 = 1
            if (r16 == 0) goto L_0x005e
            goto L_0x0076
        L_0x005e:
            boolean r0 = X.C29621ca.A07(r4, r11)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x006a
            long r0 = r5.A06     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            long r0 = r0 + r2
            r5.A06 = r0     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            goto L_0x007b
        L_0x006a:
            boolean r0 = X.C29621ca.A07(r4, r12)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x007b
            long r0 = r5.A05     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            long r0 = r0 + r2
            r5.A05 = r0     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            goto L_0x007b
        L_0x0076:
            long r0 = r5.A04     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            long r0 = r0 + r2
            r5.A04 = r0     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
        L_0x007b:
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            r5.A03 = r0     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
        L_0x0081:
            java.lang.String r0 = "ib"
            boolean r0 = X.C29621ca.A07(r4, r0)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x00c2
            X.1ca r2 = r4.A0J(r7)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            java.lang.String r0 = "offline_preview"
            boolean r0 = X.C29621ca.A07(r2, r0)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x00d3
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            r5.A07 = r0     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            int r0 = r2.A0A(r10, r7)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            long r0 = (long) r0     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            r5.A00 = r0     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            int r0 = r2.A0A(r11, r7)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            long r0 = (long) r0     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            r5.A02 = r0     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            int r0 = r2.A0A(r12, r7)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            long r0 = (long) r0     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            r5.A01 = r0     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            X.1dB r1 = r5.A0I     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0H     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            boolean r0 = r0.getAndSet(r8)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            if (r0 != 0) goto L_0x00bd
            X.C29971dB.A01(r1)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
        L_0x00bd:
            java.lang.String r0 = "XmppConnectionMetrics/onOfflineResumeStarted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
        L_0x00c2:
            java.util.Map r1 = r5.A0A     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            java.lang.String r0 = r4.A00     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            X.2mg r0 = (X.C59662mg) r0     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x00dc
            r0.A01(r4)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            goto L_0x0006
        L_0x00d3:
            boolean r0 = X.C29621ca.A07(r2, r9)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x00c2
            r5.A0B = r8     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            goto L_0x00c2
        L_0x00dc:
            r0 = 488(0x1e8, float:6.84E-43)
            r5.A05(r4, r0)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            java.lang.String r0 = "ConnectionReader/read tag found in map, but canHandleStanzaType returned false"
            X.C17960vV.A0F(r7, r0)     // Catch:{ 1UI -> 0x010d, Exception -> 0x00e8 }
            goto L_0x0006
        L_0x00e8:
            r9 = move-exception
            java.lang.String r0 = "ConnectionReader/read/next-tree"
            com.whatsapp.util.Log.e(r0, r9)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            r13.A07()     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            boolean r0 = r9 instanceof X.AnonymousClass3EU     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            if (r0 != 0) goto L_0x0189
            java.lang.String r1 = "message"
            java.lang.String r0 = r4.A00     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            if (r0 == 0) goto L_0x010a
            X.11S r3 = r5.A0E     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            X.1CJ r2 = r5.A0F     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            X.18K r1 = r5.A0G     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            r0 = 10
            X.C63342su.A01(r3, r2, r1, r4, r0)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
        L_0x010a:
            r0 = 500(0x1f4, float:7.0E-43)
            goto L_0x0177
        L_0x010d:
            r9 = move-exception
            java.lang.String r3 = r4.A00     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            java.lang.String r11 = X.C63342su.A00(r3)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            if (r11 == 0) goto L_0x0189
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            java.lang.String r0 = "ConnectionReader/maybeSendCorruptStreamExceptionResolutionAck STANZA_PARSING_ERROR id="
            r2.append(r0)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            java.lang.String r0 = "id"
            r1 = 0
            java.lang.String r0 = r4.A0Q(r0, r1)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            X.C17890vO.A13(r0, r2, r9)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            java.lang.String r0 = "cls:"
            r10.append(r0)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            r10.append(r11)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            java.lang.String r2 = " "
            r10.append(r2)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            java.lang.String r0 = "type"
            java.lang.String r1 = r4.A0Q(r0, r1)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            if (r1 == 0) goto L_0x0149
            java.lang.String r0 = "type:"
            X.C17890vO.A10(r0, r1, r2, r10)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
        L_0x0149:
            X.190 r2 = r5.A0D     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            java.lang.String r0 = "source=ConnectionReader debug="
            r1.append(r0)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            r1.append(r10)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            java.lang.String r0 = " message="
            java.lang.String r1 = X.C17900vP.A0C(r0, r1, r9)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            java.lang.String r0 = "CorruptStreamException"
            r2.A0G(r0, r1, r7)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            if (r0 == 0) goto L_0x0175
            X.11S r3 = r5.A0E     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            X.1CJ r2 = r5.A0F     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            X.18K r1 = r5.A0G     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            r0 = 4
            X.C63342su.A01(r3, r2, r1, r4, r0)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
        L_0x0175:
            r0 = 487(0x1e7, float:6.82E-43)
        L_0x0177:
            r5.A05(r4, r0)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            goto L_0x0006
        L_0x017c:
            java.lang.String r0 = "ReaderThread/logout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3KS r0 = r6.A01
            android.os.Handler r0 = (android.os.Handler) r0
            r0.sendEmptyMessage(r8)
            return
        L_0x0189:
            throw r9     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
        L_0x018a:
            r4 = move-exception
            java.lang.String r0 = "ConnectionReader/read/next-tree"
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            java.util.Map r3 = r5.A09     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            java.util.Iterator r2 = X.AnonymousClass000.A15(r3)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
        L_0x0196:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r1 = X.C17890vO.A0P(r2)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            X.2S7 r1 = (X.AnonymousClass2S7) r1     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            boolean r0 = r1 instanceof X.AnonymousClass2M6     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            if (r0 == 0) goto L_0x0196
            X.2M6 r1 = (X.AnonymousClass2M6) r1     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            X.2b6 r0 = r1.A01     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            com.whatsapp.profile.SetAboutInfo r0 = r0.A00     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            android.os.Handler r0 = r0.A08     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            r0.removeMessages(r7)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            r0.sendEmptyMessage(r7)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            goto L_0x0196
        L_0x01b5:
            r3.clear()     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            goto L_0x01c4
        L_0x01b9:
            r4 = move-exception
            X.1eo r1 = r5.A0H     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            java.lang.String r0 = "ConnectionReader/read/next-tree"
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
            r1.A07()     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
        L_0x01c4:
            throw r4     // Catch:{ IOException -> 0x01f2, 1UI -> 0x01c5 }
        L_0x01c5:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "ReaderThread/corrupt-stream-error/stanza "
            r1.append(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = r4.stanza     // Catch:{ all -> 0x020a }
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "ReaderThread/corrupt-stream-error"
            com.whatsapp.util.Log.i(r0, r4)     // Catch:{ all -> 0x020a }
            X.190 r3 = r6.A00     // Catch:{ all -> 0x020a }
            java.lang.String r2 = "CorruptStreamException"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "source=ReaderThread message="
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r4)     // Catch:{ all -> 0x020a }
            r3.A0G(r2, r0, r7)     // Catch:{ all -> 0x020a }
            com.whatsapp.util.Log.i((java.lang.String) r17)
            X.3KS r1 = r6.A01
            r8 = 2
            goto L_0x01fd
        L_0x01f2:
            r1 = move-exception
            java.lang.String r0 = "ReaderThread/io-error"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x020a }
            com.whatsapp.util.Log.i((java.lang.String) r17)
            X.3KS r1 = r6.A01
        L_0x01fd:
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 2
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.arg1 = r8
            r0.sendToTarget()
            return
        L_0x020a:
            r2 = move-exception
            com.whatsapp.util.Log.i((java.lang.String) r17)
            X.3KS r1 = r6.A01
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 2
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.arg1 = r7
            r0.sendToTarget()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49312Pz.run():void");
    }
}
