package X;

import com.whatsapp.calling.CallSummary;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallParticipant;

/* renamed from: X.Ak8  reason: case insensitive filesystem */
public class C21441Ak8 implements Runnable {
    public final int A00 = 1;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final boolean A08;

    public C21441Ak8(AnonymousClass9X7 r2, AnonymousClass1BI r3, C27001Ui r4, C57732jY r5, String str, int i, int i2, boolean z) {
        this.A03 = r4;
        this.A04 = r3;
        this.A07 = str;
        this.A08 = z;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = r5;
        this.A06 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0216, code lost:
        if (r2 >= X.C18020vd.A00(r1, r11, 5254)) goto L_0x0218;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r2 = r26
            int r0 = r2.A00
            if (r0 == 0) goto L_0x0130
            java.lang.Object r7 = r2.A03
            X.1Ui r7 = (X.C27001Ui) r7
            java.lang.Object r14 = r2.A04
            X.1BI r14 = (X.AnonymousClass1BI) r14
            java.lang.String r9 = r2.A07
            boolean r6 = r2.A08
            int r1 = r2.A01
            int r8 = r2.A02
            java.lang.Object r5 = r2.A05
            X.2jY r5 = (X.C57732jY) r5
            java.lang.Object r4 = r2.A06
            X.9X7 r4 = (X.AnonymousClass9X7) r4
            r2 = 0
            X.0ve r12 = r7.A02
            r0 = 9666(0x25c2, float:1.3545E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r12, r0)
            if (r0 == 0) goto L_0x012d
            r0 = 9562(0x255a, float:1.3399E-41)
            boolean r3 = X.C18020vd.A05(r3, r12, r0)
            X.1UM r0 = r7.A03
            X.2eA r3 = r0.A00(r14, r3)
        L_0x0037:
            X.1UJ r0 = r7.A04
            r0.A00(r14, r3, r9, r6)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ProfilePhotoManager/sendGetProfilePhoto photoId:"
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = " type:"
            r6.append(r0)
            r6.append(r8)
            java.lang.String r0 = " jid:"
            X.C17900vP.A0Y(r14, r0, r6)
            X.00H r0 = r7.A07
            X.1OZ r15 = X.C17880vN.A0U(r0)
            r0 = 1
            java.lang.String r6 = "image"
            if (r8 == r0) goto L_0x0129
            r0 = 2
            if (r8 != r0) goto L_0x0129
            java.lang.String r17 = "preview"
        L_0x0065:
            if (r1 <= 0) goto L_0x0125
            java.lang.String r18 = java.lang.Integer.toString(r1)
        L_0x006b:
            X.00H r0 = r7.A06
            java.lang.Object r1 = r0.get()
            X.2eL r1 = (X.C54562eL) r1
            X.1U8 r0 = r7.A05
            X.33e r13 = new X.33e
            r22 = r7
            r19 = r13
            r20 = r4
            r21 = r7
            r23 = r0
            r24 = r5
            r25 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25)
            X.Acd r11 = new X.Acd
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            X.1OZ r4 = r11.A01
            java.lang.String r3 = r4.A0B()
            X.1BI r8 = r11.A00
            java.lang.String r5 = r11.A04
            boolean r0 = r6.equals(r5)
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r11.A05
            if (r0 != 0) goto L_0x00ad
            boolean r0 = X.C42701yb.A01(r8)
            if (r0 == 0) goto L_0x00b4
        L_0x00ad:
            java.lang.String r1 = "query"
            java.lang.String r0 = "url"
            X.C17890vO.A11(r1, r0, r10)
        L_0x00b4:
            java.lang.String r0 = r11.A03
            java.lang.String r9 = "id"
            java.lang.String r7 = "type"
            if (r0 == 0) goto L_0x00bf
            X.C17890vO.A11(r9, r0, r10)
        L_0x00bf:
            X.C17890vO.A11(r7, r5, r10)
            X.C42701yb.A01(r8)
            X.2eA r6 = r11.A02
            if (r6 == 0) goto L_0x00d2
            X.1EC r1 = r6.A01
            if (r1 == 0) goto L_0x00d2
            java.lang.String r0 = "common_gid"
            X.C17890vO.A0n(r1, r0, r10)
        L_0x00d2:
            r5 = 0
            if (r6 == 0) goto L_0x00e2
            X.2lX r0 = r6.A00
            if (r0 == 0) goto L_0x00e2
            byte[] r1 = r0.A01
            java.lang.String r0 = "tctoken"
            X.1ca r5 = new X.1ca
            r5.<init>((java.lang.String) r0, (byte[]) r1, (X.AnonymousClass1MD[]) r2)
        L_0x00e2:
            r2 = 0
            X.1MD[] r1 = X.AnonymousClass8BT.A1b(r10, r2)
            java.lang.String r0 = "picture"
            X.1ca r6 = new X.1ca
            r6.<init>((X.C29621ca) r5, (java.lang.String) r0, (X.AnonymousClass1MD[]) r1)
            r0 = 5
            X.1MD[] r5 = new X.AnonymousClass1MD[r0]
            X.C17880vN.A1Q(r9, r3, r5, r2)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:profile:picture"
            X.AnonymousClass8BV.A1N(r1, r0, r5)
            X.8v4 r2 = X.C173438v4.A00
            java.lang.String r0 = "to"
            X.1MD r1 = new X.1MD
            r1.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r0)
            r0 = 2
            r5[r0] = r1
            java.lang.String r0 = "target"
            X.1MD r1 = new X.1MD
            r1.<init>((com.whatsapp.jid.Jid) r8, (java.lang.String) r0)
            r0 = 3
            r5[r0] = r1
            java.lang.String r0 = "get"
            X.1MD r0 = X.AnonymousClass8BR.A0h(r7, r0)
            X.1ca r6 = X.AnonymousClass8BW.A0Q(r6, r0, r5)
            r9 = 0
            r8 = 26
            r5 = r11
            r7 = r3
            r4.A0J(r5, r6, r7, r8, r9)
        L_0x0124:
            return
        L_0x0125:
            r18 = r2
            goto L_0x006b
        L_0x0129:
            r17 = r6
            goto L_0x0065
        L_0x012d:
            r3 = r2
            goto L_0x0037
        L_0x0130:
            java.lang.Object r8 = r2.A03
            X.A7S r8 = (X.A7S) r8
            java.lang.String r7 = r2.A07
            java.lang.Object r4 = r2.A04
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            boolean r1 = r2.A08
            int r0 = r2.A01
            int r3 = r2.A02
            java.lang.Object r6 = r2.A05
            com.whatsapp.voipcalling.CallParticipant[] r6 = (com.whatsapp.voipcalling.CallParticipant[]) r6
            java.lang.Object r2 = r2.A06
            com.whatsapp.calling.CallSummary r2 = (com.whatsapp.calling.CallSummary) r2
            X.9Bw r5 = r8.A06(r7)
            if (r5 != 0) goto L_0x0156
            if (r4 == 0) goto L_0x0124
            X.9Bw r5 = r8.A05(r4, r7, r0, r1)
            if (r5 == 0) goto L_0x0124
        L_0x0156:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "updateJoinableCallLogOnCurrentThread updateType="
            X.C17900vP.A0j(r0, r1, r3)
            r4 = 1
            if (r3 == r4) goto L_0x01ef
            r0 = 2
            if (r3 == r0) goto L_0x0225
            r0 = 3
            if (r3 == r0) goto L_0x018b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "updateJoinableCallLogOnCurrentThread unknown type: "
            X.C17900vP.A0i(r0, r1, r3)
        L_0x0171:
            X.A99 r2 = r8.A05
            java.lang.String r0 = r2.A18
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0124
            X.4cT r0 = r5.A04
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x02aa
            int r1 = r5.A07
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 == 0) goto L_0x02aa
            return
        L_0x018b:
            X.4cT r0 = r5.A04
            java.lang.String r9 = r0.A02
            java.lang.String r3 = X.C40811vJ.A09(r9)
            if (r2 == 0) goto L_0x01ae
            java.lang.String r0 = "updateJoinableCallLogOnCurrentThread updating call summary"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r2.durationMs
            int r1 = r0 / 1000
            monitor-enter(r5)
            int r0 = r5.A08     // Catch:{ all -> 0x02d7 }
            if (r0 == r1) goto L_0x01a8
            r5.A08 = r1     // Catch:{ all -> 0x02d7 }
            r5.A02()     // Catch:{ all -> 0x02d7 }
        L_0x01a8:
            monitor-exit(r5)
            com.whatsapp.calling.CallSummaryUser[] r0 = r2.callSummaryUsers
            r8.A0A(r5, r0)
        L_0x01ae:
            r2 = 0
            r8.A09(r5, r2)
            X.A7S.A00(r8, r5)
            X.9l6 r0 = r8.A06
            r0.A00(r5)
            X.1Vn r1 = r8.A08
            java.lang.String r0 = X.C40811vJ.A09(r9)
            r1.BES(r0)
            boolean r0 = r5.A0Q()
            if (r0 == 0) goto L_0x01db
            boolean r0 = r5.A0R()
            if (r0 != 0) goto L_0x01db
            X.A99 r0 = r8.A05
            android.os.Handler r1 = r0.A0H
            r0 = 5
            android.os.Message r0 = android.os.Message.obtain(r1, r0, r4, r2, r5)
            r0.sendToTarget()
        L_0x01db:
            X.1VE r0 = r8.A03
            android.content.SharedPreferences$Editor r2 = X.AnonymousClass3MZ.A08(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ad_hoc_call_invitor_"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            X.C17880vN.A1B(r2, r0)
            goto L_0x0171
        L_0x01ef:
            com.whatsapp.jid.GroupJid r0 = r5.A0C
            if (r0 == 0) goto L_0x0222
            X.0ve r11 = r8.A0C
            com.whatsapp.jid.GroupJid r1 = r5.A0C
            int r0 = r5.A07
            r3 = 3
            boolean r0 = X.AnonymousClass000.A1T(r0, r3)
            X.1MW r10 = r8.A0B
            int r2 = r10.A09(r1)
            if (r0 != 0) goto L_0x0218
            r0 = 4907(0x132b, float:6.876E-42)
            X.0vf r1 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r1, r11, r0)
            if (r0 < r3) goto L_0x0222
            r0 = 5254(0x1486, float:7.362E-42)
            int r0 = X.C18020vd.A00(r1, r11, r0)
            if (r2 < r0) goto L_0x0222
        L_0x0218:
            com.whatsapp.jid.GroupJid r0 = r5.A0C
            if (r0 != 0) goto L_0x022f
            java.lang.String r1 = "CallLogHelper/updateInvitedParticipantsUsingGroupMembership/ Group jid cannot be null"
            r0 = 0
            X.C17960vV.A0F(r0, r1)
        L_0x0222:
            r8.A09(r5, r4)
        L_0x0225:
            r8.A0A(r5, r6)
            X.1TD r0 = r8.A09
            r0.A0B(r5)
            goto L_0x0171
        L_0x022f:
            java.util.HashSet r3 = X.C17880vN.A12()
            int r9 = r6.length
            r2 = 0
        L_0x0235:
            if (r2 >= r9) goto L_0x0247
            r1 = r6[r2]
            boolean r0 = r1.isCallConnected()
            if (r0 == 0) goto L_0x0244
            com.whatsapp.jid.UserJid r0 = r1.jid
            r3.add(r0)
        L_0x0244:
            int r2 = r2 + 1
            goto L_0x0235
        L_0x0247:
            r1 = 7635(0x1dd3, float:1.0699E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r11, r1)
            if (r0 != 0) goto L_0x0222
            com.whatsapp.jid.GroupJid r0 = r5.A0C
            X.2tp r2 = r10.A0B(r0)
            int r1 = r2.A00
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)
            if (r0 == 0) goto L_0x02a5
            java.util.Map r0 = r2.A08
            java.util.Collection r0 = r0.values()
            X.10f r0 = X.C199410f.copyOf((java.util.Collection) r0)
        L_0x026a:
            java.util.Iterator r9 = r0.iterator()
        L_0x026e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0222
            java.lang.Object r1 = r9.next()
            X.2sr r1 = (X.C63312sr) r1
            X.11S r0 = r8.A01
            com.whatsapp.jid.UserJid r2 = r1.A04
            boolean r0 = r0.A0O(r2)
            if (r0 != 0) goto L_0x026e
            X.2hy r1 = r8.A04
            boolean r0 = r5.A0P()
            com.whatsapp.jid.UserJid r2 = r1.A00(r2, r0)
            if (r2 != 0) goto L_0x0299
            X.190 r2 = r8.A00
            java.lang.String r1 = "startOutgoingCallInternal/phoneNumber_lid_mapping_missing"
            r0 = 0
            r2.A0G(r1, r0, r4)
            goto L_0x026e
        L_0x0299:
            boolean r1 = r3.contains(r2)
            r0 = 2
            if (r1 == 0) goto L_0x02a1
            r0 = 5
        L_0x02a1:
            r5.A0J(r2, r0)
            goto L_0x026e
        L_0x02a5:
            X.10f r0 = r2.A0B()
            goto L_0x026a
        L_0x02aa:
            r0 = 0
            r2.A18 = r0
            X.00H r0 = r2.A3H
            java.lang.Object r4 = r0.get()
            X.1yO r4 = (X.C42571yO) r4
            X.0vl r0 = X.C42571yO.A0I
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            int r3 = r6.length
            java.util.ArrayList r2 = X.C17880vN.A0z(r3)
            r1 = 0
        L_0x02c1:
            if (r1 >= r3) goto L_0x02cd
            r0 = r6[r1]
            com.whatsapp.jid.UserJid r0 = r0.jid
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x02c1
        L_0x02cd:
            java.util.Set r1 = X.C29431cG.A12(r2)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r4.A0G(r5, r0, r1)
            return
        L_0x02d7:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21441Ak8.run():void");
    }

    public C21441Ak8(CallSummary callSummary, A7S a7s, UserJid userJid, String str, CallParticipant[] callParticipantArr, int i, int i2, boolean z) {
        this.A03 = a7s;
        this.A07 = str;
        this.A04 = userJid;
        this.A08 = z;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = callParticipantArr;
        this.A06 = callSummary;
    }
}
