package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.1d1  reason: invalid class name and case insensitive filesystem */
public final class C29881d1 extends Handler implements C29871d0 {
    public final /* synthetic */ C219017v A00;

    public void Bp5() {
        sendEmptyMessage(6);
    }

    public void Bpk() {
        sendEmptyMessage(1);
    }

    public void Bpr(C36281nd r2) {
        obtainMessage(0, r2).sendToTarget();
    }

    public void Bro(boolean z, int i) {
        obtainMessage(4, z ? 1 : 0, i).sendToTarget();
    }

    public void BxQ(C31711g0 r2) {
        obtainMessage(2, r2).sendToTarget();
    }

    public void C5y() {
        sendEmptyMessage(7);
    }

    public void CAf(Message message) {
        message.what = 5;
        sendMessage(message);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29881d1(Looper looper, C219017v r2) {
        super(looper);
        this.A00 = r2;
    }

    public void Bpj(Integer num, int i, boolean z, boolean z2) {
        obtainMessage(3, new C55372ff(this, num, i, z, z2)).sendToTarget();
    }

    public void BwA(String str) {
        obtainMessage(8, str).sendToTarget();
    }

    public void C2R() {
        sendEmptyMessage(9);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r20) {
        /*
            r19 = this;
            r5 = r20
            int r1 = r5.what
            r2 = 0
            r0 = r19
            switch(r1) {
                case 0: goto L_0x000b;
                case 1: goto L_0x006c;
                case 2: goto L_0x0267;
                case 3: goto L_0x0609;
                case 4: goto L_0x0625;
                case 5: goto L_0x008b;
                case 6: goto L_0x01a5;
                case 7: goto L_0x0633;
                case 8: goto L_0x022e;
                case 9: goto L_0x0247;
                default: goto L_0x000a;
            }
        L_0x000a:
            return
        L_0x000b:
            X.17v r4 = r0.A00
            java.lang.Object r3 = r5.obj
            X.1nd r3 = (X.C36281nd) r3
            boolean r0 = r4.A19
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "MessageHandler/handleSendingChannelReady/not started"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x001b:
            r4.A07 = r3
            X.1cu r0 = r4.A0e
            r0.A01 = r4
            X.00H r0 = r4.A0g
            java.lang.Object r1 = r0.get()
            X.1OZ r1 = (X.AnonymousClass1OZ) r1
            X.2ak r0 = new X.2ak
            r0.<init>(r4)
            r1.A0I = r3
            r1.A00 = r0
            java.lang.String r0 = "MessageHandler/handleConnectionThreadReady connectionready"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1dH r3 = r4.A0a
            long r0 = r3.BPz()
            r4.A00 = r0
            java.lang.String r1 = "MessageHandler Connectivity Handler"
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r0.<init>(r1)
            r4.A04 = r0
            r0.start()
            android.os.HandlerThread r0 = r4.A04
            android.os.Looper r1 = r0.getLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r3.CNt(r0)
            r0 = 1
            X.C219017v.A06(r4, r0, r2, r2)
            X.1Hc r1 = r4.A0I
            r1.A07 = r0
            r0 = -1
            r1.A04 = r0
            X.2si r0 = r4.A08
            if (r0 == 0) goto L_0x000a
            r0.A03()
            return
        L_0x006c:
            X.17v r1 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C219017v.A1B
            X.2si r0 = r1.A08
            if (r0 == 0) goto L_0x000a
            X.00H r0 = r0.A0w
            java.lang.Object r3 = r0.get()
            X.1Hc r3 = (X.C23651Hc) r3
            r0 = 1
            r3.A05 = r0
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            X.11A r2 = r3.A03
            r1 = 13
            goto L_0x025e
        L_0x008b:
            X.17v r1 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C219017v.A1B
            X.2si r0 = r1.A08
            X.00H r0 = r0.A0i
            java.lang.Object r7 = r0.get()
            X.2qF r7 = (X.C61782qF) r7
            int r6 = r5.arg1
            r0 = 5
            java.lang.String r4 = "pushName"
            java.lang.String r1 = "jid"
            if (r6 == r0) goto L_0x0149
            r0 = 12
            if (r6 == r0) goto L_0x0726
            r0 = 64
            if (r6 == r0) goto L_0x06bb
            r0 = 88
            if (r6 == r0) goto L_0x010f
            r0 = 158(0x9e, float:2.21E-43)
            if (r6 == r0) goto L_0x018a
            r0 = 237(0xed, float:3.32E-43)
            if (r6 == r0) goto L_0x06b1
            r0 = 20
            java.lang.String r3 = "author_pn"
            java.lang.String r4 = "author"
            if (r6 == r0) goto L_0x0658
            r0 = 21
            if (r6 == r0) goto L_0x0686
            r0 = 271(0x10f, float:3.8E-43)
            if (r6 == r0) goto L_0x00ed
            r0 = 272(0x110, float:3.81E-43)
            if (r6 != r0) goto L_0x000a
            java.lang.Object r3 = r5.obj
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/xmpp/recv/handle_group_unavailable "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1KB r5 = r7.A01
            r0 = 40
        L_0x00e4:
            X.3By r4 = new X.3By
            r4.<init>(r7, r3, r0)
        L_0x00e9:
            r5.CGP(r4)
            return
        L_0x00ed:
            java.lang.Object r3 = r5.obj
            int r2 = r5.arg2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/xmpp/recv/handle_group_available "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1KB r5 = r7.A01
            r0 = 19
            X.3Cu r4 = new X.3Cu
            r4.<init>(r7, r2, r0, r3)
            goto L_0x00e9
        L_0x010f:
            java.lang.Object r2 = r5.obj
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r1 = r2.getString(r1)
            X.1Dt r0 = com.whatsapp.jid.Jid.Companion
            com.whatsapp.jid.Jid r3 = r0.A02(r1)
            X.1BI r3 = (X.AnonymousClass1BI) r3
            java.lang.String r2 = r2.getString(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/xmpp/recv/handle_unsubscribe"
            r1.append(r0)
            r1.append(r3)
            r0 = 32
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Nf r0 = r7.A05
            r0.A01(r3)
            X.1KB r5 = r7.A01
            r0 = 41
            goto L_0x00e4
        L_0x0149:
            java.lang.Object r2 = r5.obj
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r1 = r2.getString(r1)
            X.1Dt r0 = com.whatsapp.jid.Jid.Companion
            com.whatsapp.jid.Jid r3 = r0.A02(r1)
            X.1BI r3 = (X.AnonymousClass1BI) r3
            java.lang.String r2 = r2.getString(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/xmpp/recv/handle_available "
            r1.append(r0)
            r1.append(r3)
            r0 = 32
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Nf r0 = r7.A05
            X.1E7 r1 = r0.A01(r3)
            X.1KB r5 = r7.A01
            r0 = 38
            X.7R0 r4 = new X.7R0
            r4.<init>(r7, r3, r1, r0)
            goto L_0x00e9
        L_0x018a:
            android.os.Bundle r1 = r5.getData()
            java.lang.String r0 = "errorCode"
            int r3 = r1.getInt(r0)
            X.17v r1 = r7.A08
            r0 = 500(0x1f4, float:7.0E-43)
            if (r3 < r0) goto L_0x000a
            r0 = 600(0x258, float:8.41E-43)
            if (r3 >= r0) goto L_0x000a
            r0 = 1
            r1.A0C = r0
            X.C219017v.A05(r1, r2)
            return
        L_0x01a5:
            X.17v r1 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C219017v.A1B
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0l
            r0.set(r2)
            X.2si r5 = r1.A08
            java.lang.String r0 = "message-handler-callback/handlerconnected/handleclockwrong"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r5.A0L
            java.lang.Object r1 = r0.get()
            X.6ze r1 = (X.C139916ze) r1
            X.118 r0 = r5.A05
            android.content.Context r6 = r0.A00
            java.lang.Class<com.whatsapp.service.GcmFGService> r0 = com.whatsapp.service.GcmFGService.class
            r1.A03(r6, r0)
            X.1KB r0 = r5.A03
            X.1FR r3 = r0.A00
            if (r3 == 0) goto L_0x01e2
            X.00H r0 = r5.A0T
            java.lang.Object r1 = r0.get()
            X.17v r1 = (X.C219017v) r1
            X.00H r0 = r5.A0V
            java.lang.Object r0 = r0.get()
            X.1gx r0 = (X.C32291gx) r0
            boolean r0 = X.C88364Zk.A02(r3, r1, r0)
            if (r0 != 0) goto L_0x000a
        L_0x01e2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "message-handler-callback/handlerconnected/displayclockwrong/notification "
            r3.append(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r3.append(r0)
            java.lang.String r0 = " "
            r3.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.00H r0 = r5.A0K
            java.lang.Object r4 = r0.get()
            X.1Vq r4 = (X.C27321Vq) r4
            r0 = 2131889995(0x7f120f4b, float:1.941467E38)
            java.lang.String r3 = r6.getString(r0)
            r0 = 2131888329(0x7f1208c9, float:1.941129E38)
            java.lang.String r1 = r6.getString(r0)
            r0 = 8
            r4.A01(r3, r1, r0, r2)
            X.00H r0 = r5.A0V
            java.lang.Object r1 = r0.get()
            X.1gx r1 = (X.C32291gx) r1
            r0 = 1
            r1.A01 = r0
            return
        L_0x022e:
            X.17v r1 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C219017v.A1B
            X.1O3 r1 = r1.A0X
            java.lang.Object r0 = r5.obj
            java.util.Map r2 = r1.A04
            monitor-enter(r2)
            java.lang.Object r1 = r2.remove(r0)     // Catch:{ all -> 0x0738 }
            X.1Uf r1 = (X.C26971Uf) r1     // Catch:{ all -> 0x0738 }
            monitor-exit(r2)     // Catch:{ all -> 0x0738 }
            if (r1 == 0) goto L_0x000a
            r0 = 0
            r1.BrF(r0)
            return
        L_0x0247:
            X.17v r1 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C219017v.A1B
            X.2si r0 = r1.A08
            if (r0 == 0) goto L_0x000a
            X.00H r0 = r0.A0w
            java.lang.Object r3 = r0.get()
            X.1Hc r3 = (X.C23651Hc) r3
            r0 = 4
            r3.A05 = r0
            X.11A r2 = r3.A03
            r1 = 10
        L_0x025e:
            X.3Bu r0 = new X.3Bu
            r0.<init>(r3, r1)
            r2.CGP(r0)
            return
        L_0x0267:
            X.17v r7 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C219017v.A1B
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0l
            r0.set(r2)
            java.lang.Object r6 = r5.obj
            X.1g0 r6 = (X.C31711g0) r6
            java.lang.Object r8 = r7.A0k
            monitor-enter(r8)
            int r9 = r6.type     // Catch:{ all -> 0x0606 }
            r0 = 4
            r5 = 0
            r3 = 6
            r4 = 1
            if (r9 == r0) goto L_0x05e6
            if (r9 == r3) goto L_0x05e6
            r0 = 8
            if (r9 == r0) goto L_0x05e6
            X.2si r3 = r7.A08     // Catch:{ all -> 0x0606 }
            X.118 r0 = r3.A05     // Catch:{ all -> 0x0606 }
            android.content.Context r13 = r0.A00     // Catch:{ all -> 0x0606 }
            X.0zA r1 = r3.A00     // Catch:{ all -> 0x0606 }
            boolean r0 = r1.A07()     // Catch:{ all -> 0x0606 }
            if (r0 == 0) goto L_0x02af
            java.lang.Object r9 = r1.A03()     // Catch:{ all -> 0x0606 }
            X.1pD r9 = (X.C37251pD) r9     // Catch:{ all -> 0x0606 }
            X.1TM r0 = r9.A01     // Catch:{ all -> 0x0606 }
            X.18O r1 = r0.A00     // Catch:{ all -> 0x0606 }
            X.18R r0 = X.AnonymousClass18O.A0G     // Catch:{ all -> 0x0606 }
            boolean r0 = r1.A09(r0)     // Catch:{ all -> 0x0606 }
            if (r0 == 0) goto L_0x02af
            X.1pB r1 = r9.A02     // Catch:{ all -> 0x0606 }
            X.33w r0 = new X.33w     // Catch:{ all -> 0x0606 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0606 }
            X.C37231pB.A00(r0, r1)     // Catch:{ all -> 0x0606 }
        L_0x02af:
            int r9 = r6.type     // Catch:{ all -> 0x0606 }
            r1 = 9
            r10 = 1
            if (r9 == 0) goto L_0x0521
            r0 = 5
            if (r9 == r0) goto L_0x04c4
            r0 = 7
            if (r9 == r0) goto L_0x0430
            if (r9 == r1) goto L_0x0505
            r0 = 2
            if (r9 == r0) goto L_0x03c3
            r0 = 3
            if (r9 == r0) goto L_0x039a
            switch(r9) {
                case 11: goto L_0x02c9;
                case 12: goto L_0x0521;
                case 13: goto L_0x036c;
                default: goto L_0x02c7;
            }     // Catch:{ all -> 0x0606 }
        L_0x02c7:
            goto L_0x05a2
        L_0x02c9:
            java.lang.String r0 = "MessageHandlerCallback/onMessageHandlerLoginFailed/wf-underage-account"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0606 }
            X.00H r0 = r3.A0B     // Catch:{ all -> 0x0606 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0606 }
            X.1Cw r0 = (X.C22701Cw) r0     // Catch:{ all -> 0x0606 }
            r0.A0G()     // Catch:{ all -> 0x0606 }
            X.00H r0 = r3.A0r     // Catch:{ all -> 0x0606 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0606 }
            X.1DA r0 = (X.AnonymousClass1DA) r0     // Catch:{ all -> 0x0606 }
            r0.A01()     // Catch:{ all -> 0x0606 }
            X.10I r9 = r3.A09     // Catch:{ all -> 0x0606 }
            r1 = 2
            X.3Bs r0 = new X.3Bs     // Catch:{ all -> 0x0606 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0606 }
            r9.CGF(r0)     // Catch:{ all -> 0x0606 }
            X.C63222si.A01(r3, r6)     // Catch:{ all -> 0x0606 }
            X.00H r0 = r3.A0R     // Catch:{ all -> 0x0606 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0606 }
            X.11S r0 = (X.AnonymousClass11S) r0     // Catch:{ all -> 0x0606 }
            boolean r0 = r0.A0N()     // Catch:{ all -> 0x0606 }
            if (r0 != 0) goto L_0x0588
            X.00H r0 = r3.A0u     // Catch:{ all -> 0x0606 }
            java.lang.Object r14 = r0.get()     // Catch:{ all -> 0x0606 }
            X.C17960vV.A07(r14)     // Catch:{ all -> 0x0606 }
            X.6yf r14 = (X.C139336yf) r14     // Catch:{ all -> 0x0606 }
            int r9 = r6.violationType     // Catch:{ all -> 0x0606 }
            java.lang.String r3 = r6.violationReason     // Catch:{ all -> 0x0606 }
            int r1 = r6.violationSourceAcct     // Catch:{ all -> 0x0606 }
            java.lang.String r15 = r6.banAppealToken     // Catch:{ all -> 0x0606 }
            r10 = 3
            X.C18070vi.A0d(r13, r2)     // Catch:{ all -> 0x0606 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0606 }
            r2.<init>()     // Catch:{ all -> 0x0606 }
            java.lang.String r0 = "WfacManager/startWfacFlow violationType: "
            r2.append(r0)     // Catch:{ all -> 0x0606 }
            r2.append(r9)     // Catch:{ all -> 0x0606 }
            java.lang.String r0 = " violationReason: "
            r2.append(r0)     // Catch:{ all -> 0x0606 }
            r2.append(r3)     // Catch:{ all -> 0x0606 }
            java.lang.String r0 = " violationSourceAccount: "
            r2.append(r0)     // Catch:{ all -> 0x0606 }
            r2.append(r1)     // Catch:{ all -> 0x0606 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0606 }
            X.C18070vi.A0d(r0, r5)     // Catch:{ all -> 0x0606 }
            r14.A01(r10, r1)     // Catch:{ all -> 0x0606 }
            r0 = 59
            if (r9 != r0) goto L_0x0363
            java.lang.String r0 = "u13_checkpoint"
            boolean r0 = X.C18070vi.A18(r3, r0)     // Catch:{ all -> 0x0606 }
            if (r0 == 0) goto L_0x0363
            X.00H r0 = r14.A07     // Catch:{ all -> 0x0606 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0606 }
            X.1cN r0 = (X.C29491cN) r0     // Catch:{ all -> 0x0606 }
            r0.A0A()     // Catch:{ all -> 0x0606 }
            X.1KB r0 = r14.A00     // Catch:{ all -> 0x0606 }
            X.7Q3 r12 = new X.7Q3     // Catch:{ all -> 0x0606 }
            r16 = r3
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0606 }
            goto L_0x04b3
        L_0x0363:
            java.lang.String r0 = "WfacManager/startWfacFlow/notify-or-show-login-failure-overlay-alert"
            X.C31081ez.A02(r0)     // Catch:{ all -> 0x0606 }
            X.1jT r0 = r14.A05     // Catch:{ all -> 0x0606 }
            goto L_0x04bf
        L_0x036c:
            java.lang.String r11 = r6.banAppealToken     // Catch:{ all -> 0x0606 }
            int r0 = r6.expire_time_out     // Catch:{ all -> 0x0606 }
            long r0 = (long) r0     // Catch:{ all -> 0x0606 }
            X.C18070vi.A0d(r13, r2)     // Catch:{ all -> 0x0606 }
            java.lang.String r10 = "appealToken"
            X.C18070vi.A0d(r11, r4)     // Catch:{ all -> 0x0606 }
            android.content.Intent r9 = new android.content.Intent     // Catch:{ all -> 0x0606 }
            r9.<init>()     // Catch:{ all -> 0x0606 }
            java.lang.String r3 = r13.getPackageName()     // Catch:{ all -> 0x0606 }
            java.lang.String r2 = "com.whatsapp.pancake.dosa.DosaActivity"
            r9.setClassName(r3, r2)     // Catch:{ all -> 0x0606 }
            r9.putExtra(r10, r11)     // Catch:{ all -> 0x0606 }
            java.lang.String r2 = "expireTimeout"
            r9.putExtra(r2, r0)     // Catch:{ all -> 0x0606 }
            r0 = 805306368(0x30000000, float:4.656613E-10)
            android.content.Intent r0 = r9.setFlags(r0)     // Catch:{ all -> 0x0606 }
            r13.startActivity(r0)     // Catch:{ all -> 0x0606 }
            goto L_0x05c0
        L_0x039a:
            long r0 = r6.expiration_time     // Catch:{ all -> 0x0606 }
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x03a8
            X.11P r0 = r3.A04     // Catch:{ all -> 0x0606 }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0606 }
        L_0x03a8:
            X.00H r2 = r3.A0s     // Catch:{ all -> 0x0606 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0606 }
            X.0z4 r2 = (X.C19830z4) r2     // Catch:{ all -> 0x0606 }
            android.content.SharedPreferences$Editor r9 = X.C19830z4.A00(r2)     // Catch:{ all -> 0x0606 }
            java.lang.String r2 = "software_forced_expiration"
            android.content.SharedPreferences$Editor r0 = r9.putLong(r2, r0)     // Catch:{ all -> 0x0606 }
            r0.apply()     // Catch:{ all -> 0x0606 }
            X.C63222si.A00(r3)     // Catch:{ all -> 0x0606 }
            goto L_0x05c0
        L_0x03c3:
            int r12 = r6.code     // Catch:{ all -> 0x0606 }
            int r11 = r6.expire_time_out     // Catch:{ all -> 0x0606 }
            java.lang.String r2 = r6.banMessage     // Catch:{ all -> 0x0606 }
            java.lang.String r1 = r6.faqUrl     // Catch:{ all -> 0x0606 }
            android.content.Intent r9 = new android.content.Intent     // Catch:{ all -> 0x0606 }
            r9.<init>()     // Catch:{ all -> 0x0606 }
            java.lang.String r10 = r13.getPackageName()     // Catch:{ all -> 0x0606 }
            java.lang.String r0 = "com.whatsapp.spamwarning.SpamWarningActivity"
            r9.setClassName(r10, r0)     // Catch:{ all -> 0x0606 }
            r0 = 100
            if (r12 < r0) goto L_0x03e3
            java.lang.String r0 = "spam_warning_reason_key"
            r9.putExtra(r0, r12)     // Catch:{ all -> 0x0606 }
        L_0x03e3:
            java.lang.String r0 = "expiry_in_seconds"
            r9.putExtra(r0, r11)     // Catch:{ all -> 0x0606 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0606 }
            if (r0 != 0) goto L_0x03f4
            java.lang.String r0 = "spam_warning_message_key"
            r9.putExtra(r0, r2)     // Catch:{ all -> 0x0606 }
        L_0x03f4:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0606 }
            if (r0 != 0) goto L_0x03ff
            java.lang.String r0 = "faq_url_key"
            r9.putExtra(r0, r1)     // Catch:{ all -> 0x0606 }
        L_0x03ff:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r9.setFlags(r0)     // Catch:{ all -> 0x0606 }
            X.00H r0 = r3.A0s     // Catch:{ all -> 0x0606 }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x0606 }
            X.0z4 r10 = (X.C19830z4) r10     // Catch:{ all -> 0x0606 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0606 }
            int r0 = r6.expire_time_out     // Catch:{ all -> 0x0606 }
            long r0 = (long) r0     // Catch:{ all -> 0x0606 }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            long r2 = r2 + r0
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r10)     // Catch:{ all -> 0x0606 }
            java.lang.String r0 = "spam_banned"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r4)     // Catch:{ all -> 0x0606 }
            r0.apply()     // Catch:{ all -> 0x0606 }
            java.lang.String r0 = "spam_banned_expiry_timestamp"
            r10.A1q(r0, r2)     // Catch:{ all -> 0x0606 }
            r13.startActivity(r9)     // Catch:{ all -> 0x0606 }
            goto L_0x05c0
        L_0x0430:
            java.lang.String r0 = "MessageHandlerCallback/onMessageHandlerLoginFailed/perm-banned"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0606 }
            X.00H r0 = r3.A0B     // Catch:{ all -> 0x0606 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0606 }
            X.1Cw r0 = (X.C22701Cw) r0     // Catch:{ all -> 0x0606 }
            r0.A0G()     // Catch:{ all -> 0x0606 }
            X.00H r0 = r3.A0r     // Catch:{ all -> 0x0606 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0606 }
            X.1DA r0 = (X.AnonymousClass1DA) r0     // Catch:{ all -> 0x0606 }
            r0.A01()     // Catch:{ all -> 0x0606 }
            X.10I r9 = r3.A09     // Catch:{ all -> 0x0606 }
            r1 = 49
            X.3Br r0 = new X.3Br     // Catch:{ all -> 0x0606 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0606 }
            r9.CGF(r0)     // Catch:{ all -> 0x0606 }
            X.C63222si.A01(r3, r6)     // Catch:{ all -> 0x0606 }
            X.00H r0 = r3.A0R     // Catch:{ all -> 0x0606 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0606 }
            X.11S r0 = (X.AnonymousClass11S) r0     // Catch:{ all -> 0x0606 }
            boolean r0 = r0.A0N()     // Catch:{ all -> 0x0606 }
            if (r0 != 0) goto L_0x0588
            X.00H r0 = r3.A0D     // Catch:{ all -> 0x0606 }
            java.lang.Object r14 = r0.get()     // Catch:{ all -> 0x0606 }
            X.6u2 r14 = (X.C136576u2) r14     // Catch:{ all -> 0x0606 }
            boolean r3 = r6.isEu     // Catch:{ all -> 0x0606 }
            int r2 = r6.violationType     // Catch:{ all -> 0x0606 }
            java.lang.String r15 = r6.violationReason     // Catch:{ all -> 0x0606 }
            java.lang.String r1 = r6.banAppealToken     // Catch:{ all -> 0x0606 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0606 }
            r9.<init>()     // Catch:{ all -> 0x0606 }
            java.lang.String r0 = "banmanager/startPermanentBanFlow vt: "
            r9.append(r0)     // Catch:{ all -> 0x0606 }
            r9.append(r2)     // Catch:{ all -> 0x0606 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x0606 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0606 }
            if (r2 <= 0) goto L_0x04b8
            X.1CM r0 = r14.A06     // Catch:{ all -> 0x0606 }
            boolean r0 = r0.A04()     // Catch:{ all -> 0x0606 }
            if (r0 == 0) goto L_0x04b8
            java.lang.String r0 = "banmanager/preparing ban appeal flow"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0606 }
            X.00H r0 = r14.A08     // Catch:{ all -> 0x0606 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0606 }
            X.1cN r0 = (X.C29491cN) r0     // Catch:{ all -> 0x0606 }
            r0.A0A()     // Catch:{ all -> 0x0606 }
            X.1KB r0 = r14.A00     // Catch:{ all -> 0x0606 }
            X.7QB r12 = new X.7QB     // Catch:{ all -> 0x0606 }
            r16 = r1
            r17 = r2
            r18 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0606 }
        L_0x04b3:
            r0.CGP(r12)     // Catch:{ all -> 0x0606 }
            goto L_0x05c0
        L_0x04b8:
            java.lang.String r0 = "banmanager/startPermanentBanFlow/notify-or-show-login-failure-overlay-alert"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0606 }
            X.1jT r0 = r14.A05     // Catch:{ all -> 0x0606 }
        L_0x04bf:
            r0.A07()     // Catch:{ all -> 0x0606 }
            goto L_0x05c0
        L_0x04c4:
            java.lang.String r0 = "MessageHandlerCallback/onMessageHandlerLoginFailed/underage-account"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0606 }
            X.00H r0 = r3.A0s     // Catch:{ all -> 0x0606 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0606 }
            X.0z4 r0 = (X.C19830z4) r0     // Catch:{ all -> 0x0606 }
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x0606 }
            java.lang.String r0 = "underage_account_banned"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r4)     // Catch:{ all -> 0x0606 }
            r0.apply()     // Catch:{ all -> 0x0606 }
            X.10I r9 = r3.A09     // Catch:{ all -> 0x0606 }
            X.3Bs r0 = new X.3Bs     // Catch:{ all -> 0x0606 }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x0606 }
            r9.CGF(r0)     // Catch:{ all -> 0x0606 }
            X.00H r0 = r3.A0R     // Catch:{ all -> 0x0606 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0606 }
            X.11S r0 = (X.AnonymousClass11S) r0     // Catch:{ all -> 0x0606 }
            boolean r0 = r0.A0N()     // Catch:{ all -> 0x0606 }
            if (r0 != 0) goto L_0x0588
            X.1KB r2 = r3.A03     // Catch:{ all -> 0x0606 }
            r1 = 35
            X.3By r0 = new X.3By     // Catch:{ all -> 0x0606 }
            r0.<init>(r3, r13, r1)     // Catch:{ all -> 0x0606 }
            r2.CGP(r0)     // Catch:{ all -> 0x0606 }
            goto L_0x05c0
        L_0x0505:
            java.lang.String r0 = "MessageHandlerCallback/onMessageHandlerLoginFailed/not authorized"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0606 }
            X.10I r9 = r3.A09     // Catch:{ all -> 0x0606 }
            X.00H r0 = r3.A0n     // Catch:{ all -> 0x0606 }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x0606 }
            X.1P3 r2 = (X.AnonymousClass1P3) r2     // Catch:{ all -> 0x0606 }
            r2.getClass()     // Catch:{ all -> 0x0606 }
            r1 = 47
            X.3Br r0 = new X.3Br     // Catch:{ all -> 0x0606 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0606 }
            r9.CGF(r0)     // Catch:{ all -> 0x0606 }
        L_0x0521:
            int r0 = r6.type     // Catch:{ all -> 0x0606 }
            r2 = 12
            if (r0 == r2) goto L_0x0528
            r10 = 0
        L_0x0528:
            java.lang.String r0 = "MessageHandlerCallback/onMessageHandlerLoginFailed/exception-password"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0606 }
            X.10I r9 = r3.A09     // Catch:{ all -> 0x0606 }
            r1 = 20
            X.7RM r0 = new X.7RM     // Catch:{ all -> 0x0606 }
            r0.<init>((java.lang.Object) r3, (int) r10, (int) r1)     // Catch:{ all -> 0x0606 }
            r9.CGF(r0)     // Catch:{ all -> 0x0606 }
            X.C63222si.A01(r3, r6)     // Catch:{ all -> 0x0606 }
            X.00H r0 = r3.A0R     // Catch:{ all -> 0x0606 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0606 }
            X.11S r0 = (X.AnonymousClass11S) r0     // Catch:{ all -> 0x0606 }
            boolean r0 = r0.A0N()     // Catch:{ all -> 0x0606 }
            if (r0 != 0) goto L_0x0588
            X.00H r0 = r3.A0E     // Catch:{ all -> 0x0606 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0606 }
            X.11Q r0 = (X.AnonymousClass11Q) r0     // Catch:{ all -> 0x0606 }
            android.content.SharedPreferences r0 = X.AnonymousClass11Q.A01(r0)     // Catch:{ all -> 0x0606 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0606 }
            java.lang.String r0 = "previously_logged_out_from_primary"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r4)     // Catch:{ all -> 0x0606 }
            r0.apply()     // Catch:{ all -> 0x0606 }
            X.00H r0 = r3.A0j     // Catch:{ all -> 0x0606 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0606 }
            X.1jT r0 = (X.C33841jT) r0     // Catch:{ all -> 0x0606 }
            r0.A07()     // Catch:{ all -> 0x0606 }
            r1 = 48
            X.3Br r0 = new X.3Br     // Catch:{ all -> 0x0606 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0606 }
            r9.CGF(r0)     // Catch:{ all -> 0x0606 }
            int r0 = r6.type     // Catch:{ all -> 0x0606 }
            if (r0 != r2) goto L_0x05c0
            X.00H r0 = r3.A0d     // Catch:{ all -> 0x0606 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0606 }
            X.4SB r0 = (X.AnonymousClass4SB) r0     // Catch:{ all -> 0x0606 }
            r0.A01()     // Catch:{ all -> 0x0606 }
            goto L_0x05c0
        L_0x0588:
            java.lang.String r0 = "MessageHandlerCallback/handleLoginFailedOnCompanion/companion logged out"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0606 }
            r1 = 44
            X.3Br r0 = new X.3Br     // Catch:{ all -> 0x0606 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0606 }
            r9.CGN(r0)     // Catch:{ all -> 0x0606 }
            X.1KB r1 = r3.A03     // Catch:{ all -> 0x0606 }
            X.3Bs r0 = new X.3Bs     // Catch:{ all -> 0x0606 }
            r0.<init>(r3, r4)     // Catch:{ all -> 0x0606 }
            r1.A0J(r0)     // Catch:{ all -> 0x0606 }
            goto L_0x05c0
        L_0x05a2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0606 }
            r1.<init>()     // Catch:{ all -> 0x0606 }
            java.lang.String r0 = "message-handler-callback/login-failed LoginFailureException type: "
            r1.append(r0)     // Catch:{ all -> 0x0606 }
            r1.append(r9)     // Catch:{ all -> 0x0606 }
            java.lang.String r0 = " server error code: "
            r1.append(r0)     // Catch:{ all -> 0x0606 }
            int r0 = r6.serverErrorCode     // Catch:{ all -> 0x0606 }
            r1.append(r0)     // Catch:{ all -> 0x0606 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0606 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0606 }
        L_0x05c0:
            X.1cz r0 = r7.A0W     // Catch:{ all -> 0x0606 }
            r0.A00(r4)     // Catch:{ all -> 0x0606 }
            X.1O3 r0 = r7.A0X     // Catch:{ all -> 0x0606 }
            r0.A01(r6)     // Catch:{ all -> 0x0606 }
            X.1O4 r1 = r7.A0b     // Catch:{ all -> 0x0606 }
            X.1nd r0 = r7.A07     // Catch:{ all -> 0x0606 }
            if (r0 == 0) goto L_0x05d7
            boolean r0 = r0.Bcm()     // Catch:{ all -> 0x0606 }
            if (r0 == 0) goto L_0x05d7
            r5 = 1
        L_0x05d7:
            r1.A06(r5)     // Catch:{ all -> 0x0606 }
            X.00H r0 = r7.A0g     // Catch:{ all -> 0x0606 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0606 }
            X.1OZ r0 = (X.AnonymousClass1OZ) r0     // Catch:{ all -> 0x0606 }
            r0.A0D()     // Catch:{ all -> 0x0606 }
            goto L_0x0604
        L_0x05e6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0606 }
            r1.<init>()     // Catch:{ all -> 0x0606 }
            java.lang.String r0 = "MessageHandler/login failed with reason: "
            r1.append(r0)     // Catch:{ all -> 0x0606 }
            r1.append(r9)     // Catch:{ all -> 0x0606 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0606 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0606 }
            r7.A0C = r4     // Catch:{ all -> 0x0606 }
            int r0 = r6.type     // Catch:{ all -> 0x0606 }
            if (r0 != r3) goto L_0x0601
            r5 = 1
        L_0x0601:
            X.C219017v.A05(r7, r5)     // Catch:{ all -> 0x0606 }
        L_0x0604:
            monitor-exit(r8)     // Catch:{ all -> 0x0606 }
            return
        L_0x0606:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0606 }
            throw r0
        L_0x0609:
            X.17v r4 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C219017v.A1B
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0l
            r0.set(r2)
            java.lang.Object r0 = r5.obj
            X.C17960vV.A07(r0)
            X.2ff r0 = (X.C55372ff) r0
            int r3 = r0.A00
            boolean r2 = r0.A02
            java.lang.Integer r1 = r0.A01
            boolean r0 = r0.A03
            X.C219017v.A04(r4, r1, r3, r2, r0)
            return
        L_0x0625:
            X.17v r3 = r0.A00
            int r1 = r5.arg1
            r0 = 1
            if (r1 != r0) goto L_0x062d
            r2 = 1
        L_0x062d:
            int r0 = r5.arg2
            X.C219017v.A03(r3, r0, r2)
            return
        L_0x0633:
            X.17v r1 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C219017v.A1B
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0l
            r0.set(r2)
            X.2si r3 = r1.A08
            java.lang.String r0 = "message-handler-callback/handlerconnected/handlesoftwareexpired"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r3.A0L
            java.lang.Object r2 = r0.get()
            X.6ze r2 = (X.C139916ze) r2
            X.118 r0 = r3.A05
            android.content.Context r1 = r0.A00
            java.lang.Class<com.whatsapp.service.GcmFGService> r0 = com.whatsapp.service.GcmFGService.class
            r2.A03(r1, r0)
            X.C63222si.A00(r3)
            return
        L_0x0658:
            java.lang.Object r2 = r5.obj
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = r2.getString(r1)
            X.1Dt r1 = com.whatsapp.jid.Jid.Companion
            com.whatsapp.jid.Jid r10 = r1.A02(r0)
            java.lang.String r0 = r2.getString(r4)
            com.whatsapp.jid.Jid r8 = r1.A02(r0)
            java.lang.String r0 = r2.getString(r3)
            com.whatsapp.jid.Jid r9 = r1.A02(r0)
            java.lang.String r0 = "media"
            int r11 = r2.getInt(r0)
            X.10s r0 = r7.A0A
            r12 = 17
            X.7Q7 r6 = new X.7Q7
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x06ad
        L_0x0686:
            java.lang.Object r2 = r5.obj
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = r2.getString(r1)
            X.1Dt r1 = com.whatsapp.jid.Jid.Companion
            com.whatsapp.jid.Jid r10 = r1.A02(r0)
            java.lang.String r0 = r2.getString(r4)
            com.whatsapp.jid.Jid r8 = r1.A02(r0)
            java.lang.String r0 = r2.getString(r3)
            com.whatsapp.jid.Jid r9 = r1.A02(r0)
            X.10s r0 = r7.A0A
            r11 = 49
            X.3Cr r6 = new X.3Cr
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (int) r11)
        L_0x06ad:
            r0.execute(r6)
            return
        L_0x06b1:
            java.lang.String r3 = "[WA Debug] Server sent smax-invalid (code:479)"
            X.190 r1 = r7.A00
            java.lang.String r0 = "SmaxInvalidError"
            r1.A0G(r0, r3, r2)
            return
        L_0x06bb:
            java.lang.Object r2 = r5.obj
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r1 = r2.getString(r1)
            X.1Dt r0 = com.whatsapp.jid.Jid.Companion
            com.whatsapp.jid.Jid r8 = r0.A02(r1)
            X.1BI r8 = (X.AnonymousClass1BI) r8
            java.lang.String r3 = r2.getString(r4)
            java.lang.String r0 = "lastSeen"
            long r11 = r2.getLong(r0)
            java.lang.String r0 = "presence"
            java.lang.String r2 = r2.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/xmpp/recv/handle_unavailable "
            r1.append(r0)
            r1.append(r8)
            r0 = 32
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " last:"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " presence: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Nf r0 = r7.A05
            r0.A01(r8)
            if (r2 != 0) goto L_0x071b
            r9 = 1
        L_0x070f:
            X.1KB r0 = r7.A01
            r10 = 1
            X.DTZ r6 = new X.DTZ
            r6.<init>(r7, r8, r9, r10, r11)
            r0.CGP(r6)
            return
        L_0x071b:
            java.lang.String r0 = "deny"
            boolean r0 = r2.equals(r0)
            r9 = 2
            if (r0 == 0) goto L_0x070f
            r9 = 0
            goto L_0x070f
        L_0x0726:
            X.1KB r3 = r7.A01
            X.2Ko r2 = r7.A03
            r2.getClass()
            r1 = 16
            X.3Bs r0 = new X.3Bs
            r0.<init>(r2, r1)
            r3.CGP(r0)
            return
        L_0x0738:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0738 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29881d1.handleMessage(android.os.Message):void");
    }
}
