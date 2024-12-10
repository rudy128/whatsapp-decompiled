package X;

/* renamed from: X.AjM  reason: case insensitive filesystem */
public class C21393AjM implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public C21393AjM(Object obj, Object obj2, Object obj3, String str, String str2, int i, int i2, boolean z) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A07 = z;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0117, code lost:
        if (X.C40811vJ.A0C(r6, r4.A2p) == false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0141, code lost:
        if (android.text.TextUtils.isEmpty(r0.A01) != false) goto L_0x0143;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r1 = r28
            int r0 = r1.A00
            if (r0 == 0) goto L_0x001e
            java.lang.Object r3 = r1.A02
            X.A0Q r3 = (X.A0Q) r3
            java.lang.Object r2 = r1.A03
            X.1BI r2 = (X.AnonymousClass1BI) r2
            java.lang.Object r4 = r1.A04
            X.206 r4 = (X.AnonymousClass206) r4
            java.lang.String r5 = r1.A05
            java.lang.String r6 = r1.A06
            boolean r8 = r1.A07
            int r7 = r1.A01
            X.A0Q.A00(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x001e:
            java.lang.Object r4 = r1.A02
            X.A99 r4 = (X.A99) r4
            java.lang.Object r3 = r1.A03
            X.9Bw r3 = (X.C178119Bw) r3
            java.lang.Object r8 = r1.A04
            java.util.List r8 = (java.util.List) r8
            boolean r0 = r1.A07
            r17 = r0
            java.lang.String r11 = r1.A05
            java.lang.String r0 = r1.A06
            r27 = r0
            int r10 = r1.A01
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            boolean r13 = r3.A0P()
            X.1VI r7 = r4.A2P
            X.11S r6 = r4.A23
            r12 = 0
            r2 = 0
            r0 = 1
            com.whatsapp.jid.UserJid r9 = X.C40811vJ.A01(r6, r13)
            com.whatsapp.jid.DeviceJid[] r5 = new com.whatsapp.jid.DeviceJid[r0]
            if (r13 == 0) goto L_0x00c7
            X.1yJ r0 = r6.A08()
            r5[r2] = r0
            com.whatsapp.jid.PhoneUserJid r2 = X.AnonymousClass11S.A00(r6)
            com.whatsapp.voipcalling.CallParticipantJid r0 = new com.whatsapp.voipcalling.CallParticipantJid
            r0.<init>(r9, r12, r5, r2)
        L_0x005c:
            r1.add(r0)
            X.2m4 r0 = r3.A0B
            java.lang.String r14 = "voip/actionStartFromCallLog"
            if (r0 == 0) goto L_0x006b
            int r0 = r8.size()
            if (r0 == 0) goto L_0x0082
        L_0x006b:
            X.4cT r0 = r3.A04
            com.whatsapp.jid.UserJid r2 = r0.A01
            boolean r0 = X.C40811vJ.A0K(r6, r2)
            if (r0 != 0) goto L_0x0082
            X.1MR r0 = r7.A00
            java.util.HashSet r0 = r0.A0A(r2)
            com.whatsapp.voipcalling.CallParticipantJid r0 = X.AnonymousClass1VI.A00(r7, r2, r14, r0)
            r1.add(r0)
        L_0x0082:
            com.whatsapp.jid.DeviceJid r9 = r3.A02
            r13 = 0
            if (r9 == 0) goto L_0x00c5
            com.whatsapp.jid.UserJid r5 = r9.userJid
        L_0x0089:
            java.util.HashSet r2 = X.C17880vN.A12()
            java.util.Iterator r16 = r8.iterator()
        L_0x0091:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r15 = r16.next()
            X.9Bv r15 = (X.C178109Bv) r15
            com.whatsapp.jid.UserJid r8 = r15.A00
            X.4cT r0 = r3.A04
            com.whatsapp.jid.UserJid r0 = r0.A01
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0091
            boolean r0 = X.C40811vJ.A0K(r6, r8)
            if (r0 != 0) goto L_0x0091
            boolean r0 = r3.A0W()
            if (r0 == 0) goto L_0x00c1
            int r15 = r15.A01
            r0 = 5
            if (r15 == r0) goto L_0x00c1
            boolean r0 = r8.equals(r5)
            if (r0 != 0) goto L_0x00c1
            goto L_0x0091
        L_0x00c1:
            r2.add(r8)
            goto L_0x0091
        L_0x00c5:
            r5 = r12
            goto L_0x0089
        L_0x00c7:
            r6.A0I()
            X.1E3 r0 = r6.A02
            r5[r2] = r0
            com.whatsapp.voipcalling.CallParticipantJid r0 = new com.whatsapp.voipcalling.CallParticipantJid
            r0.<init>(r9, r5, r12)
            goto L_0x005c
        L_0x00d4:
            java.util.ArrayList r0 = r7.A01(r14, r2)
            r1.addAll(r0)
            X.181 r2 = r4.A24
            X.4cT r5 = r3.A04
            boolean r0 = r5.A03
            r2.A08(r0)
            boolean r0 = r3.A0J
            if (r0 == 0) goto L_0x00eb
            X.AnonymousClass8BX.A18(r4)
        L_0x00eb:
            java.lang.Long r0 = X.AnonymousClass8BV.A0j()
            r4.A0z = r0
            r8 = 0
            r4.A1H = r8
            java.util.Set r0 = r4.A3h
            r0.clear()
            java.util.Set r0 = r4.A3f
            r0.clear()
            boolean r2 = X.AnonymousClass000.A1W(r9)
            java.lang.String r0 = "voip/actionStartFromCallLog call log call creator is null"
            X.C17960vV.A0F(r2, r0)
            if (r9 == 0) goto L_0x0187
            boolean r0 = r3.A0W()
            if (r0 == 0) goto L_0x0119
            X.0ve r0 = r4.A2p
            boolean r0 = X.C40811vJ.A0C(r6, r0)
            r25 = 1
            if (r0 != 0) goto L_0x011b
        L_0x0119:
            r25 = 0
        L_0x011b:
            int r7 = r5.A00
            if (r17 == 0) goto L_0x0181
            r4.A19 = r11
        L_0x0121:
            X.4cT r0 = r3.A09()
            com.whatsapp.jid.UserJid r6 = r0.A01
            X.4cT r0 = r3.A09()
            com.whatsapp.jid.UserJid r2 = r0.A01
            X.1M9 r0 = r4.A2T
            X.1E7 r0 = r0.A0E(r2)
            if (r0 == 0) goto L_0x0143
            X.2lf r0 = r0.A0H
            if (r0 == 0) goto L_0x0143
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r18 = 0
            if (r0 == 0) goto L_0x0145
        L_0x0143:
            r18 = 1
        L_0x0145:
            com.whatsapp.voipcalling.CallParticipantJid[] r0 = new com.whatsapp.voipcalling.CallParticipantJid[r8]
            java.lang.Object[] r5 = r1.toArray(r0)
            com.whatsapp.voipcalling.CallParticipantJid[] r5 = (com.whatsapp.voipcalling.CallParticipantJid[]) r5
            boolean r2 = r3.A0J
            com.whatsapp.jid.GroupJid r1 = r3.A0C
            X.2m4 r0 = r3.A0B
            if (r0 == 0) goto L_0x0159
            X.2m4 r0 = r3.A0B
            java.lang.String r12 = r0.A02
        L_0x0159:
            X.2kW r0 = r3.A0F
            if (r0 == 0) goto L_0x0161
            X.2kW r0 = r3.A0F
            java.lang.String r13 = r0.A00
        L_0x0161:
            r19 = r5
            r20 = r2
            r21 = r1
            r22 = r7
            r23 = r12
            r24 = r13
            r26 = r17
            r15 = r11
            r16 = r6
            r17 = r9
            int r1 = com.whatsapp.voipcalling.Voip.joinOngoingCall(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = 70004(0x11174, float:9.8096E-41)
            if (r1 == r0) goto L_0x0187
            r4.A0l(r10)
            return
        L_0x0181:
            if (r25 == 0) goto L_0x0184
            r7 = 0
        L_0x0184:
            r4.A19 = r12
            goto L_0x0121
        L_0x0187:
            java.lang.String r0 = "voip/actionStartFromCallLog join ongoing call failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.A7S r0 = r4.A0T
            r0.A09(r3, r8)
            X.0ve r2 = r4.A2p
            r1 = 12680(0x3188, float:1.7768E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01aa
            X.AlA r2 = r4.A2L
            r1 = 37
            X.Ajy r0 = new X.Ajy
            r0.<init>(r4, r3, r1)
            r2.execute(r0)
            return
        L_0x01aa:
            X.1TD r0 = r4.A2j
            r0.A0A(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21393AjM.run():void");
    }
}
