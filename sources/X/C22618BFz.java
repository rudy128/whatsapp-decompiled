package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.BFz  reason: case insensitive filesystem */
public class C22618BFz extends Handler {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22618BFz(Looper looper, Object obj, int i) {
        super(looper);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x011b A[LOOP:6: B:67:0x0115->B:69:0x011b, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r18) {
        /*
            r17 = this;
            r2 = r17
            int r0 = r2.A00
            r4 = r18
            switch(r0) {
                case 0: goto L_0x02b5;
                case 1: goto L_0x0048;
                case 2: goto L_0x0251;
                case 3: goto L_0x020f;
                case 4: goto L_0x001c;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r1 = r4.what
            r7 = 1
            if (r1 == r7) goto L_0x01cc
            r0 = 2
            if (r1 == r0) goto L_0x01c4
            r0 = 3
            if (r1 != r0) goto L_0x001b
            java.lang.Object r0 = r2.A01
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r0 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r0
            r0.resendLastFrame()
        L_0x001b:
            return
        L_0x001c:
            int r0 = r4.what
            r3 = 1
            if (r0 != r3) goto L_0x001b
            java.lang.Object r2 = r2.A01
            X.Ck7 r2 = (X.C25676Ck7) r2
            android.os.Handler r0 = r2.A00
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.A02
            monitor-enter(r1)
            android.os.Handler r0 = r2.A00     // Catch:{ all -> 0x02cb }
            r0.removeMessages(r3)     // Catch:{ all -> 0x02cb }
            java.util.LinkedList r0 = X.AnonymousClass8BR.A14()     // Catch:{ all -> 0x02cb }
            monitor-exit(r1)     // Catch:{ all -> 0x02cb }
            java.util.Iterator r1 = r0.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r1.next()
            X.C108945cZ.A1P(r0)
            goto L_0x003a
        L_0x0048:
            java.lang.Object r6 = r2.A01
            X.Cue r6 = (X.C26206Cue) r6
            int r1 = r4.what
            r10 = 1
            if (r1 == 0) goto L_0x0161
            if (r1 == r10) goto L_0x012d
            r0 = 2
            if (r1 == r0) goto L_0x00e5
            r0 = 3
            if (r1 == r0) goto L_0x00b8
            r0 = 4
            if (r1 == r0) goto L_0x00a8
            r0 = 5
            if (r1 != r0) goto L_0x02ce
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0M
            java.util.Iterator r6 = r0.iterator()
        L_0x0065:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r6.next()
            X.CZC r0 = (X.CZC) r0
            java.lang.Object r5 = r4.obj
            java.lang.String r5 = (java.lang.String) r5
            X.Cuc r3 = r0.A05
            X.EAG r2 = r3.A02
            boolean r0 = r2 instanceof X.C26657D8g
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = "LoadControl debug info: "
            java.lang.StringBuilder r1 = X.BE6.A0u(r0)
            X.D8g r2 = (X.C26657D8g) r2
            X.CWv r0 = r2.A09
            r1.append(r0)
            java.lang.String r0 = ". Player debug info: "
            java.lang.String r5 = X.AnonymousClass001.A1H(r0, r5, r1)
        L_0x0090:
            java.util.List r0 = r3.A0P
            java.util.Iterator r2 = r0.iterator()
        L_0x0096:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r1 = r2.next()
            X.E9x r1 = (X.C28606E9x) r1
            X.C0Q r0 = X.C0Q.A0H
            r1.CAS(r0, r5)
            goto L_0x0096
        L_0x00a8:
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0M
            java.util.Iterator r1 = r0.iterator()
        L_0x00ae:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001b
            r1.next()
            goto L_0x00ae
        L_0x00b8:
            int r0 = r6.A03
            int r0 = r0 - r10
            r6.A03 = r0
            if (r0 != 0) goto L_0x001b
            java.lang.Object r0 = r4.obj
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            r6.A0F = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0M
            java.util.Iterator r3 = r0.iterator()
        L_0x00cd:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r2 = r3.next()
            X.CZC r2 = (X.CZC) r2
            boolean r1 = r6.A0F
            if (r1 == 0) goto L_0x00cd
            X.CqU r0 = r6.A07
            int r0 = r0.A00
            r2.A01(r1, r0)
            goto L_0x00cd
        L_0x00e5:
            java.lang.Object r5 = r4.obj
            X.BOK r5 = (X.BOK) r5
            r6.A06 = r5
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0M
            java.util.Iterator r4 = r0.iterator()
        L_0x00f1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r4.next()
            X.CZC r0 = (X.CZC) r0
            X.Cuc r3 = r0.A05
            if (r5 == 0) goto L_0x012b
            int r1 = r5.type
            if (r1 == 0) goto L_0x0128
            if (r1 == r10) goto L_0x0125
            r0 = 2
            if (r1 != r0) goto L_0x012b
            X.C0Q r2 = X.C0Q.A0G
        L_0x010c:
            r5.getCause()
            java.util.List r0 = r3.A0P
            java.util.Iterator r1 = r0.iterator()
        L_0x0115:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r0 = r1.next()
            X.E9x r0 = (X.C28606E9x) r0
            r0.C0p(r5, r2)
            goto L_0x0115
        L_0x0125:
            X.C0Q r2 = X.C0Q.A0E
            goto L_0x010c
        L_0x0128:
            X.C0Q r2 = X.C0Q.A0F
            goto L_0x010c
        L_0x012b:
            r2 = 0
            goto L_0x010c
        L_0x012d:
            java.lang.Object r4 = r4.obj
            X.Cl2 r4 = (X.C25732Cl2) r4
            X.Cl2 r0 = r6.A08
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x001b
            r6.A08 = r4
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0M
            java.util.Iterator r3 = r0.iterator()
        L_0x0141:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r3.next()
            X.CZC r0 = (X.CZC) r0
            X.Cuc r2 = r0.A05
            float r0 = r2.A00
            float r1 = r4.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0141
            r2.A00 = r1
            X.Cyh r0 = r2.A0M
            X.DGM r0 = r0.A0o
            r0.C0m(r1)
            goto L_0x0141
        L_0x0161:
            java.lang.Object r7 = r4.obj
            X.CqU r7 = (X.C26013CqU) r7
            int r1 = r4.arg1
            int r8 = r4.arg2
            r0 = -1
            if (r8 != r0) goto L_0x016d
            r10 = 0
        L_0x016d:
            int r0 = r6.A02
            int r0 = r0 - r1
            r6.A02 = r0
            if (r0 != 0) goto L_0x001b
            long r1 = r7.A02
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x018b
            X.Caq r12 = r7.A04
            r13 = 0
            long r0 = r7.A01
            r11 = r7
            r15 = r0
            X.CqU r7 = r11.A01(r12, r13, r15)
        L_0x018b:
            X.CqU r0 = r6.A07
            com.facebook.android.exoplayer2.Timeline r0 = r0.A03
            int r0 = r0.A01()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r2 = 0
            if (r0 == 0) goto L_0x019e
            boolean r0 = r6.A0C
            if (r0 == 0) goto L_0x01b4
        L_0x019e:
            com.facebook.android.exoplayer2.Timeline r0 = r7.A03
            int r0 = r0.A01()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x01b4
            r6.A00 = r2
            r6.A01 = r2
            r0 = 0
            r6.A05 = r0
            r6.A04 = r0
        L_0x01b4:
            boolean r0 = r6.A0C
            r9 = 2
            if (r0 == 0) goto L_0x01ba
            r9 = 0
        L_0x01ba:
            boolean r11 = r6.A0D
            r6.A0C = r2
            r6.A0D = r2
            X.C26206Cue.A02(r6, r7, r8, r9, r10, r11)
            return
        L_0x01c4:
            java.lang.Object r0 = r2.A01
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r0 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r0
            r0.onFrameAvailableOnCameraThread()
            return
        L_0x01cc:
            java.lang.Object r5 = r2.A01
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r5 = (com.whatsapp.voipcalling.camera.VoipPhysicalCamera) r5
            long r3 = r5.lastCameraCallbackTs
            r1 = 0
            r6 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1R(r0)
            java.lang.String r0 = "last camera callback ts should not be 0"
            X.C17960vV.A0F(r1, r0)
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r5.lastCameraCallbackTs
            long r3 = r3 - r0
            r1 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x020b
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.AnonymousClass3MX.A1S(r1, r6, r3)
            java.lang.String r0 = "%dms since last callback, will try restarting camera."
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r5.stopOnCameraThread()
            int r0 = r5.startOnCameraThread()
            if (r0 == 0) goto L_0x020b
            r5.stopOnCameraThread()
        L_0x020b:
            r5.startPeriodicCameraCallbackCheck()
            return
        L_0x020f:
            java.lang.Object r5 = r2.A01
            com.facebook.profilo.provider.systemcounters.SystemCounterThread r5 = (com.facebook.profilo.provider.systemcounters.SystemCounterThread) r5
            int r2 = r4.what
            int r4 = r4.arg1
            monitor-enter(r5)
            boolean r0 = r5.mEnabled     // Catch:{ all -> 0x0245 }
            if (r0 == 0) goto L_0x0243
            r0 = 1
            if (r2 == r0) goto L_0x022a
            r0 = 2
            if (r2 == r0) goto L_0x0226
            r0 = 3
            if (r2 != r0) goto L_0x0247
            goto L_0x0233
        L_0x0226:
            r5.logHighFrequencyThreadCounters()     // Catch:{ all -> 0x024e }
            goto L_0x0236
        L_0x022a:
            X.Cq7 r0 = r5.mSystemCounterLogger     // Catch:{ all -> 0x024e }
            r0.A02()     // Catch:{ all -> 0x024e }
            r5.logCounters()     // Catch:{ all -> 0x024e }
            goto L_0x0236
        L_0x0233:
            r5.logExpensiveCounters()     // Catch:{ all -> 0x024e }
        L_0x0236:
            android.os.Handler r1 = r5.mHandler     // Catch:{ all -> 0x024e }
            r0 = 0
            android.os.Message r3 = r1.obtainMessage(r2, r4, r0)     // Catch:{ all -> 0x024e }
            android.os.Handler r2 = r5.mHandler     // Catch:{ all -> 0x024e }
            long r0 = (long) r4     // Catch:{ all -> 0x024e }
            r2.sendMessageDelayed(r3, r0)     // Catch:{ all -> 0x024e }
        L_0x0243:
            monitor-exit(r5)
            return
        L_0x0245:
            r0 = move-exception
            goto L_0x024d
        L_0x0247:
            java.lang.String r0 = "Unknown message type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x024e }
        L_0x024d:
            throw r0     // Catch:{ all -> 0x024e }
        L_0x024e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0251:
            java.lang.Object r1 = r2.A01
            X.Csm r1 = (X.C26124Csm) r1
            java.util.ArrayDeque r0 = X.C26124Csm.A07
            int r3 = r4.what
            if (r3 == 0) goto L_0x0290
            r0 = 1
            if (r3 == r0) goto L_0x0276
            r0 = 2
            r2 = 0
            if (r3 == r0) goto L_0x0270
            java.util.concurrent.atomic.AtomicReference r1 = r1.A05
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            X.AnonymousClass00N.A00(r2, r0, r1)
            return
        L_0x0270:
            X.Ckn r0 = r1.A04
            r0.A01()
            return
        L_0x0276:
            java.lang.Object r0 = r4.obj
            X.CSI r0 = (X.CSI) r0
            int r5 = r0.A01
            android.media.MediaCodec$CryptoInfo r7 = r0.A04
            long r8 = r0.A03
            int r10 = r0.A00
            r6 = 0
            java.lang.Object r3 = X.C26124Csm.A06     // Catch:{ RuntimeException -> 0x02a3 }
            monitor-enter(r3)     // Catch:{ RuntimeException -> 0x02a3 }
            android.media.MediaCodec r4 = r1.A02     // Catch:{ all -> 0x028d }
            r4.queueSecureInputBuffer(r5, r6, r7, r8, r10)     // Catch:{ all -> 0x028d }
            monitor-exit(r3)     // Catch:{ all -> 0x028d }
            goto L_0x02aa
        L_0x028d:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x028d }
            throw r2     // Catch:{ RuntimeException -> 0x02a3 }
        L_0x0290:
            java.lang.Object r0 = r4.obj
            X.CSI r0 = (X.CSI) r0
            int r3 = r0.A01
            int r5 = r0.A02
            long r6 = r0.A03
            int r8 = r0.A00
            r4 = 0
            android.media.MediaCodec r2 = r1.A02     // Catch:{ RuntimeException -> 0x02a3 }
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch:{ RuntimeException -> 0x02a3 }
            goto L_0x02aa
        L_0x02a3:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicReference r2 = r1.A05
            r1 = 0
            X.AnonymousClass00N.A00(r1, r3, r2)
        L_0x02aa:
            java.util.ArrayDeque r1 = X.C26124Csm.A07
            monitor-enter(r1)
            r1.add(r0)     // Catch:{ all -> 0x02b2 }
            monitor-exit(r1)     // Catch:{ all -> 0x02b2 }
            return
        L_0x02b2:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02b2 }
            throw r0
        L_0x02b5:
            java.lang.Object r4 = r4.obj
            X.E8A r4 = (X.E8A) r4
            java.lang.Object r0 = r2.A01
            X.BVF r0 = (X.BVF) r0
            X.DFL r3 = r0.A00
            X.A4p r2 = new X.A4p
            r2.<init>()
            X.DOZ r1 = r0.A02
            r0 = 0
            X.C26209Cul.A04(r1, r3, r2, r4, r0)
            return
        L_0x02cb:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02cb }
            throw r0
        L_0x02ce:
            java.lang.IllegalStateException r0 = X.BE6.A0k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22618BFz.handleMessage(android.os.Message):void");
    }
}
