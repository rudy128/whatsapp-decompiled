package com.whatsapp.messaging.xmpp;

import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass190;
import X.AnonymousClass195;
import X.C000100c;
import X.C17890vO;
import X.C18030ve;
import X.C18070vi;
import X.C18600wl;
import X.C29771cq;
import X.C29911d4;
import X.C29971dB;
import X.C31251fG;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

public final class XmppLifecycleWorker extends CoroutineWorker {
    public final AnonymousClass195 A00;
    public final AnonymousClass190 A01;
    public final C18030ve A02;
    public final C29771cq A03;
    public final C31251fG A04;
    public final XmppConnectionMetricsWorkManager A05;
    public final C29971dB A06;
    public final C18600wl A07 = C29911d4.A00();
    public final AnonymousClass11P A08;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.messaging.xmpp.XmppLifecycleWorker r6, X.C30391dr r7) {
        /*
            boolean r0 = r7 instanceof X.C21649Ane
            if (r0 == 0) goto L_0x0067
            r5 = r7
            X.Ane r5 = (X.C21649Ane) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0067
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x003d
            if (r0 != r3) goto L_0x006d
            java.lang.Object r6 = r5.L$0
            com.whatsapp.messaging.xmpp.XmppLifecycleWorker r6 = (com.whatsapp.messaging.xmpp.XmppLifecycleWorker) r6
            X.C30691eM.A01(r1)
        L_0x0024:
            X.1fG r0 = r6.A04
            int r0 = r0.A01()
            if (r1 != 0) goto L_0x003a
            if (r0 == 0) goto L_0x003a
            X.190 r3 = r6.A01
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r1 = 0
            java.lang.String r0 = "xmpp-lifecycle-worker-preack-timeout"
            r3.A0G(r0, r2, r1)
        L_0x003a:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x003d:
            X.C30691eM.A01(r1)
            X.0ve r2 = r6.A02
            r1 = 7107(0x1bc3, float:9.959E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0072
            X.1fG r0 = r6.A04
            X.2mG r0 = r0.A02()
            if (r0 == 0) goto L_0x0072
            com.whatsapp.messaging.xmpp.XmppLifecycleWorker$trySendPreacks$pingOrTimeout$1 r2 = new com.whatsapp.messaging.xmpp.XmppLifecycleWorker$trySendPreacks$pingOrTimeout$1
            r2.<init>(r0, r6, r1)
            r5.L$0 = r6
            r5.label = r3
            r0 = 6500(0x1964, double:3.2114E-320)
            java.lang.Object r1 = X.AnonymousClass4Z5.A01(r5, r2, r0)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x0067:
            X.Ane r5 = new X.Ane
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x006d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.xmpp.XmppLifecycleWorker.A00(com.whatsapp.messaging.xmpp.XmppLifecycleWorker, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.whatsapp.messaging.xmpp.XmppLifecycleWorker r16, X.C30391dr r17) {
        /*
            r3 = r17
            r11 = r16
            boolean r0 = r3 instanceof X.C21711Aoe
            if (r0 == 0) goto L_0x016f
            r10 = r3
            X.Aoe r10 = (X.C21711Aoe) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x016f
            int r2 = r2 - r1
            r10.label = r2
        L_0x0016:
            java.lang.Object r1 = r10.result
            X.1g4 r12 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r10.label
            r9 = 1
            if (r0 == 0) goto L_0x00bd
            if (r0 != r9) goto L_0x0176
            int r8 = r10.I$0
            long r5 = r10.J$1
            long r3 = r10.J$0
            boolean r7 = r10.Z$0
            java.lang.Object r11 = r10.L$0
            com.whatsapp.messaging.xmpp.XmppLifecycleWorker r11 = (com.whatsapp.messaging.xmpp.XmppLifecycleWorker) r11
            X.C30691eM.A01(r1)
        L_0x0030:
            r14 = r3
            X.1dB r2 = r11.A06
            boolean r0 = r2.A0B()
            r13 = 0
            if (r0 == 0) goto L_0x00a1
            if (r7 != 0) goto L_0x0048
            if (r8 != r9) goto L_0x0048
            X.9Io r0 = X.C179589Io.SECONDS
            long r0 = X.C196999vz.A00(r0, r9)
            long r14 = X.C21348Aid.A04(r3, r0)
        L_0x0048:
            long r16 = X.C21348Aid.A03(r14)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0H
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00a1
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0I
            int r0 = r0.get()
            if (r0 <= 0) goto L_0x008d
            long r14 = android.os.SystemClock.uptimeMillis()
            long r0 = r2.A01
            long r14 = r14 - r0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x008d
        L_0x0067:
            X.0ve r14 = r11.A02
            r1 = 5409(0x1521, float:7.58E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r14, r1)
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = "XmppLifecycleWorker/doWork seems like stanzas stuck"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.190 r3 = r11.A01
            java.lang.String r1 = r2.A04()
            java.lang.String r0 = "xmpp-lifecycle-worker-stuck-stanza"
            r3.A0G(r0, r1, r13)
            r0 = 3
            r2.A07(r0)
        L_0x0087:
            X.8Jj r0 = new X.8Jj
            r0.<init>()
            return r0
        L_0x008d:
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0J
            int r0 = r0.get()
            if (r0 <= 0) goto L_0x00a1
            long r14 = android.os.SystemClock.uptimeMillis()
            long r0 = r2.A02
            long r14 = r14 - r0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x00a1
            goto L_0x0067
        L_0x00a1:
            boolean r0 = r2.A0B()
            if (r0 != 0) goto L_0x00fe
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "XmppLifecycleWorker/work is done; is processing: "
            r1.append(r0)
            boolean r0 = r2.A0B()
            X.C17900vP.A0r(r1, r0)
            X.8Jk r0 = new X.8Jk
            r0.<init>()
            return r0
        L_0x00bd:
            X.C30691eM.A01(r1)
            X.1dB r3 = r11.A06
            boolean r7 = r3.A0B()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "XmppLifecycleWorker/work started; is processing: "
            X.C17900vP.A0n(r0, r1, r7)
            com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager r4 = r11.A05
            X.0ve r1 = r4.A00
            r0 = 7777(0x1e61, float:1.0898E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x014d
            X.0vl r0 = r4.A05
            java.lang.Object r0 = r0.getValue()
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeMessages(r9)
        L_0x00e8:
            r0 = 0
            r3.A05 = r0
            X.0ve r1 = r11.A02
            r0 = 3320(0xcf8, float:4.652E-42)
            int r1 = X.C18020vd.A00(r2, r1, r0)
            X.9Io r0 = X.C179589Io.SECONDS
            long r3 = X.C196999vz.A00(r0, r1)
            long r5 = android.os.SystemClock.elapsedRealtime()
            r8 = 0
        L_0x00fe:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "XmppLifecycleWorker/cycle: "
            r2.append(r0)
            int r1 = r8 + 1
            r2.append(r8)
            java.lang.String r0 = " started: "
            r2.append(r0)
            X.1dB r8 = r11.A06
            java.lang.String r0 = r8.A04()
            X.C17890vO.A1A(r2, r0)
            long r15 = android.os.SystemClock.elapsedRealtime()
            long r15 = r15 - r5
            r13 = 300000(0x493e0, double:1.482197E-318)
            r2 = 0
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0159
            X.195 r0 = r11.A00
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0138
            X.190 r3 = r11.A01
            java.lang.String r1 = r8.A04()
            java.lang.String r0 = "xmpp-tracking-work"
            r3.A0G(r0, r1, r2)
        L_0x0138:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "XmppLifecycleWorker/300000 milliseconds time out reached; stop the job; is processing: "
            r1.append(r0)
            boolean r0 = r8.A0B()
            X.C17900vP.A0r(r1, r0)
            r8.A07(r2)
            goto L_0x0087
        L_0x014d:
            X.19K r0 = r4.A01
            X.A7W r1 = X.AnonymousClass8BR.A0D(r0)
            java.lang.String r0 = "xmpp-logout-worker"
            r1.A0A(r0)
            goto L_0x00e8
        L_0x0159:
            r10.L$0 = r11
            r10.Z$0 = r7
            r10.J$0 = r3
            r10.J$1 = r5
            r10.I$0 = r1
            r10.label = r9
            java.lang.Object r0 = X.C62882s9.A01(r10, r3)
            if (r0 != r12) goto L_0x016c
            return r12
        L_0x016c:
            r8 = r1
            goto L_0x0030
        L_0x016f:
            X.Aoe r10 = new X.Aoe
            r10.<init>(r11, r3)
            goto L_0x0016
        L_0x0176:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.xmpp.XmppLifecycleWorker.A01(com.whatsapp.messaging.xmpp.XmppLifecycleWorker, X.1dr):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmppLifecycleWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        C000100c A0H = C17890vO.A0H(context);
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A06 = (C29971dB) r1.ACA.get();
        this.A00 = (AnonymousClass195) r1.A0L.get();
        this.A01 = A0H.BG6();
        this.A08 = A0H.CP7();
        this.A02 = A0H.BAL();
        this.A05 = (XmppConnectionMetricsWorkManager) r1.ACB.get();
        this.A04 = (C31251fG) r1.A8Z.get();
        this.A03 = (C29771cq) r1.A2J.get();
    }
}
