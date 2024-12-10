package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.3CV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Uri A03;
    public final /* synthetic */ AnonymousClass72S A04;
    public final /* synthetic */ C134146q7 A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARNING: type inference failed for: r1v3, types: [X.1BI] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r31 = this;
            r1 = r31
            X.6q7 r6 = r1.A05
            android.net.Uri r0 = r1.A03
            r30 = r0
            X.72S r0 = r1.A04
            boolean r10 = r1.A07
            boolean r12 = r1.A08
            java.util.List r13 = r1.A06
            int r4 = r1.A00
            int r3 = r1.A01
            int r9 = r1.A02
            X.1T6 r5 = r6.A08
            java.lang.Integer r0 = r0.A0D()
            if (r0 == 0) goto L_0x0236
            int r8 = r0.intValue()
            r11 = 0
            java.util.Iterator r2 = r13.iterator()
        L_0x0027:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1BI r0 = (X.AnonymousClass1BI) r0
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x0027
        L_0x003a:
            X.1BI r1 = (X.AnonymousClass1BI) r1
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0043
            r11 = r1
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
        L_0x0043:
            X.0ve r7 = r6.A06
            r1 = 0
            int r2 = r13.size()
            r0 = 1
            if (r2 != r0) goto L_0x0064
            java.lang.Object r0 = r13.get(r1)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            boolean r0 = X.C22971Dz.A0Y(r0)
            if (r0 == 0) goto L_0x0064
            X.0vf r2 = X.C18040vf.A01
            r0 = 1539(0x603, float:2.157E-42)
            boolean r0 = X.C18020vd.A05(r2, r7, r0)
            if (r0 == 0) goto L_0x0064
            r1 = 1
        L_0x0064:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2 = 1
            r7 = 0
            X.2qf r14 = new X.2qf
            r15 = r11
            r16 = r7
            r17 = r2
            r18 = r10
            r19 = r12
            r14.<init>(r15, r16, r17, r18, r19)
            X.00H r0 = r5.A0E
            java.lang.Object r0 = r0.get()
            X.6ub r0 = (X.C136906ub) r0
            X.6nF r13 = r0.A00(r4, r8, r10)
            r22 = 0
            X.1So r15 = X.C63972u0.A01(r7, r8, r9)
            r8 = 0
            r17 = r7
            r21 = r2
            r11 = r30
            r12 = r7
            r18 = r9
            r19 = r10
            r20 = r2
            X.2ta r7 = X.C63722ta.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.1Sb r12 = r5.A04
            X.1SS r11 = r12.A0I
            java.lang.String r0 = X.C17890vO.A0Q()
            X.2h4 r15 = r11.A02(r0, r8)
            X.11P r9 = r12.A06
            X.10I r0 = r12.A0Q
            X.73e r10 = new X.73e
            r13 = r10
            r14 = r9
            r16 = r11
            r17 = r0
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            monitor-enter(r10)
            goto L_0x00be
        L_0x00bb:
            r1 = r11
            goto L_0x003a
        L_0x00be:
            r10.A0D = r2     // Catch:{ all -> 0x0233 }
            monitor-exit(r10)
            X.0ve r11 = r12.A0A
            r0 = 4
            X.C18070vi.A0d(r11, r0)
            X.2h8 r0 = r7.A01
            X.BAf r13 = X.AnonymousClass1T6.A00(r0)
            X.34B r9 = new X.34B
            r12 = r9
            r14 = r11
            r16 = r10
            r17 = r7
            r12.<init>(r13, r14, r15, r16, r17)
            X.2h4 r0 = r9.A0N
            java.lang.String r12 = r0.A0D
            X.C18070vi.A0d(r12, r8)
            X.1TJ r0 = r9.A0C
            r0.A04(r12)
            java.lang.String r0 = "optimistic"
            r9.A0Z = r0
            r9.A01 = r3
            if (r1 == 0) goto L_0x010e
            X.1RO r1 = r5.A07
            X.2kI r0 = r7.A02
            X.1So r0 = r0.A06
            boolean r0 = r1.A05(r0, r2)
            if (r0 != 0) goto L_0x010e
            X.0ve r2 = r5.A02
            r1 = 3926(0xf56, float:5.501E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = "express-optimistic"
            r9.A0Z = r0
            X.73e r1 = r9.A0O
            r0 = 4
            r1.A0A(r0)
        L_0x010e:
            X.1T5 r11 = r5.A09
            X.2kI r1 = r9.A02()
            X.18K r7 = r11.A02
            X.0ve r3 = r11.A01
            X.2ta r0 = r9.A0P
            int r2 = r0.A00
            int r0 = r9.A00()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.70S r10 = new X.70S
            r10.<init>(r3, r7, r0, r2)
            X.64V r7 = r10.A01
            java.util.UUID r0 = java.util.UUID.fromString(r12)
            long r12 = r0.getMostSignificantBits()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r12 = r12 & r2
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r7.A0N = r0
            X.2gh r7 = new X.2gh
            r7.<init>(r10)
            X.1So r2 = r1.A06
            X.1So r13 = X.C26551So.A0E
            if (r2 == r13) goto L_0x01f4
            X.1So r0 = X.C26551So.A0t
            if (r2 == r0) goto L_0x01f4
            X.1So r0 = X.C26551So.A0K
            if (r2 == r0) goto L_0x01f4
            X.1So r0 = X.C26551So.A0h
            if (r2 == r0) goto L_0x01f4
            X.1So r0 = X.C26551So.A09
            if (r2 == r0) goto L_0x01f4
            X.1So r0 = X.C26551So.A0A
            if (r2 == r0) goto L_0x01f4
            X.1So r0 = X.C26551So.A0V
            if (r2 == r0) goto L_0x01f4
            X.1So r0 = X.C26551So.A0H
            if (r2 == r0) goto L_0x01f4
            X.1So r0 = X.C26551So.A0I
            if (r2 == r0) goto L_0x01f4
            boolean r0 = X.C63972u0.A07(r2)
            if (r0 == 0) goto L_0x01f0
            java.io.File r0 = r1.A08
            r18 = r0
            java.lang.String r0 = r1.A0C
            r17 = r0
            java.lang.String r0 = r1.A0A
            r16 = r0
            X.73B r13 = r1.A07
            java.lang.String r12 = r1.A0B
            X.E8E r8 = r7.A07
            X.2ah r3 = r7.A06
            X.E6h r2 = r7.A08
            java.io.File r14 = r1.A00()
            boolean r0 = r1.A0I
            if (r0 == 0) goto L_0x01f1
            java.lang.String r15 = ".was"
        L_0x0190:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.C17890vO.A0Q()
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r15, r1)
            java.io.File r22 = X.AnonymousClass1T5.A00(r11, r14, r0)
            X.68U r14 = new X.68U
            r20 = r13
            r21 = r18
            r23 = r17
            r24 = r16
            r25 = r12
            r15 = r10
            r16 = r9
            r17 = r3
            r18 = r8
            r19 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.1Sn r1 = r11.A04
            X.1So r0 = X.C26551So.A0j
            r1.A00(r14, r0)
        L_0x01bf:
            X.73e r1 = r9.A0O
            X.70S r0 = r7.A00
            r1.A0C(r0)
            X.AnonymousClass1T6.A04(r5, r9, r7)
            r0 = 7
            X.7Ne r1 = new X.7Ne
            r1.<init>(r9, r5, r0)
            java.util.concurrent.Executor r0 = r5.A0G
            r9.A07(r1, r0)
            android.net.Uri r1 = X.C26521Sl.A0U(r30)
            X.C18070vi.A0X(r1)
            X.00H r0 = r6.A0A
            java.lang.Object r0 = r0.get()
            X.2iz r0 = (X.C57382iz) r0
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = r0.get(r4)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x01f0
            r0.put(r1, r9)
        L_0x01f0:
            return
        L_0x01f1:
            java.lang.String r15 = ".webp"
            goto L_0x0190
        L_0x01f4:
            java.lang.String r15 = r1.A0C
            X.C17960vV.A07(r15)
            X.E8E r12 = r7.A07
            X.E6h r3 = r7.A08
            java.io.File r14 = r1.A00()
            java.lang.StringBuilder r2 = X.C17900vP.A0G()
            java.lang.String r0 = ".jpg"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
            java.io.File r26 = X.AnonymousClass1T5.A00(r11, r14, r0)
            X.6nF r2 = r1.A05
            X.C17960vV.A07(r2)
            boolean r1 = r1.A0G
            X.68T r0 = new X.68T
            r19 = r0
            r20 = r10
            r21 = r9
            r23 = r12
            r24 = r3
            r25 = r2
            r27 = r15
            r28 = r8
            r29 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.1Sn r1 = r11.A04
            r1.A00(r0, r13)
            goto L_0x01bf
        L_0x0233:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x0236:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CV.run():void");
    }

    public /* synthetic */ AnonymousClass3CV(Uri uri, AnonymousClass72S r2, C134146q7 r3, List list, int i, int i2, int i3, boolean z, boolean z2) {
        this.A05 = r3;
        this.A03 = uri;
        this.A04 = r2;
        this.A07 = z;
        this.A08 = z2;
        this.A06 = list;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
