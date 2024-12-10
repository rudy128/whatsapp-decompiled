package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.voipcalling.CallOfferInfo;

/* renamed from: X.Aet  reason: case insensitive filesystem */
public final /* synthetic */ class C21125Aet implements AnonymousClass1TI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C19994A2h A02;
    public final /* synthetic */ DeviceJid A03;
    public final /* synthetic */ AnonymousClass97K A04;
    public final /* synthetic */ CallOfferInfo A05;
    public final /* synthetic */ String A06;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        if (r1.participants.length <= 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        if (r0.isEmpty() != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r36) {
        /*
            r35 = this;
            r2 = r36
            r1 = r35
            X.A2h r5 = r1.A02
            java.lang.String r14 = r1.A06
            X.97K r6 = r1.A04
            int r8 = r1.A00
            com.whatsapp.voipcalling.CallOfferInfo r0 = r1.A05
            com.whatsapp.jid.DeviceJid r9 = r1.A03
            int r7 = r1.A01
            X.9Bw r2 = (X.C178119Bw) r2
            long r3 = r6.A00
            java.lang.String r13 = r6.A08
            java.lang.String r12 = r6.A06
            boolean r11 = r0.uploadFieldStat
            com.whatsapp.voipcalling.CallGroupInfo r1 = r0.callGroupInfo
            com.whatsapp.jid.DeviceJid r6 = r6.A03
            if (r6 != 0) goto L_0x0023
            r6 = r9
        L_0x0023:
            boolean r10 = r0.isVideoCall
            boolean r31 = r0.isJoinableGroupCall()
            java.lang.String r0 = r0.groupPhash
            if (r0 == 0) goto L_0x0035
            boolean r0 = r0.isEmpty()
            r33 = 1
            if (r0 == 0) goto L_0x0037
        L_0x0035:
            r33 = 0
        L_0x0037:
            r0 = 0
            java.lang.Boolean r15 = X.C17960vV.A01
            X.A99 r15 = r5.A03
            X.1P3 r5 = r15.A2h
            int r22 = r5.A06()
            java.lang.String r20 = "enc"
            if (r1 == 0) goto L_0x004d
            com.whatsapp.voipcalling.CallParticipant[] r5 = r1.participants
            int r5 = r5.length
            r17 = 1
            if (r5 > 0) goto L_0x004f
        L_0x004d:
            r17 = 0
        L_0x004f:
            r16 = r14
            r18 = r9
            r19 = r6
            r21 = r7
            com.whatsapp.voipcalling.Voip.rejectCallWithoutCallContext(r16, r17, r18, r19, r20, r21, r22)
            r5 = 4
            if (r7 <= r5) goto L_0x008d
            boolean r5 = r15.A47
            if (r5 == 0) goto L_0x008e
            boolean r5 = X.AnonymousClass8BT.A1Y(r14)
            if (r5 == 0) goto L_0x008e
            com.whatsapp.voipcalling.Voip.endCall(r0, r0)
            r34 = 0
        L_0x006c:
            java.lang.Integer r19 = java.lang.Integer.valueOf(r8)
            r16 = 0
            r26 = 0
            r23 = 16
            r32 = r0
            r29 = r0
            r30 = r10
            r24 = r3
            r28 = r11
            r21 = r13
            r22 = r12
            r20 = r14
            r18 = r2
            r17 = r1
            r15.A0t(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r29, r30, r31, r32, r33, r34)
        L_0x008d:
            return
        L_0x008e:
            r34 = 1
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21125Aet.accept(java.lang.Object):void");
    }

    public /* synthetic */ C21125Aet(C19994A2h a2h, DeviceJid deviceJid, AnonymousClass97K r3, CallOfferInfo callOfferInfo, String str, int i, int i2) {
        this.A02 = a2h;
        this.A06 = str;
        this.A04 = r3;
        this.A00 = i;
        this.A05 = callOfferInfo;
        this.A03 = deviceJid;
        this.A01 = i2;
    }
}
