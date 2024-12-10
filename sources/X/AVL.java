package X;

import java.util.Set;

public final class AVL implements C72443Lz {
    public final C26911Ty A00;
    public final AnonymousClass1W6 A01;
    public final AnonymousClass1PV A02;
    public final AnonymousClass00H A03;

    public Set CGK() {
        return C200410p.A0S(new AnonymousClass9IM[]{AnonymousClass9IM.PARTICIPANTS, AnonymousClass9IM.COMMON_ENC, AnonymousClass9IM.ENC_NODE_CREATION});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX WARNING: type inference failed for: r2v14, types: [X.6R7] */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0339, code lost:
        if (r2 != null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0374, code lost:
        if (r2 != X.AnonymousClass00R.A01) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03e7, code lost:
        if (X.C42701yb.A01(X.C22931Dv.A00(r26)) != false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        if (r1 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        if (((X.AnonymousClass1PW) r25.get()).A0A(r26, r7.A0u) != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0107, code lost:
        if (X.C42701yb.A01(X.C22931Dv.A00(r26)) == false) goto L_0x0109;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x029b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BLq(X.C196049uN r28, X.C195829ty r29, X.A1O r30) {
        /*
            r27 = this;
            r24 = 0
            r8 = 0
            r23 = 0
            r10 = 0
            r13 = r28
            r12 = r29
            r9 = r30
            boolean r22 = X.AnonymousClass8BX.A1U(r9, r12, r13)
            X.206 r7 = r12.A03
            if (r7 == 0) goto L_0x02d8
            com.whatsapp.jid.UserJid r14 = X.AnonymousClass8BT.A0K(r7)
            com.whatsapp.jid.Jid r0 = r9.A06
            r26 = r0
            X.1BI r2 = X.C22971Dz.A00(r26)
            X.C17960vV.A07(r2)
            X.C18070vi.A0X(r2)
            com.whatsapp.jid.UserJid r1 = r7.A0I()
            com.whatsapp.jid.UserJid r6 = r9.A07
            java.lang.String r3 = r12.A04
            com.whatsapp.jid.DeviceJid r5 = r9.A05
            boolean r11 = r12.A09
            int r4 = r9.A03
            X.BC8 r0 = r13.A01
            r20 = r0
            com.whatsapp.jid.UserJid r16 = X.C22941Dw.A02(r3)
            r3 = r27
            X.00H r0 = r3.A03
            r25 = r0
            java.lang.Object r15 = r25.get()
            X.1PW r15 = (X.AnonymousClass1PW) r15
            if (r16 == 0) goto L_0x004e
            if (r11 != 0) goto L_0x004e
            if (r4 == 0) goto L_0x04ce
        L_0x004e:
            if (r4 <= 0) goto L_0x048e
            if (r6 == 0) goto L_0x0058
            boolean r0 = X.C42701yb.A01(r2)
            if (r0 != 0) goto L_0x0062
        L_0x0058:
            if (r5 == 0) goto L_0x048e
            com.whatsapp.jid.UserJid r0 = r5.userJid
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x048e
        L_0x0062:
            if (r16 != 0) goto L_0x04ce
            r25.get()
            boolean r0 = r7 instanceof X.AnonymousClass24B
            if (r0 == 0) goto L_0x0455
            X.1BI r0 = X.C22931Dv.A00(r2)
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 != 0) goto L_0x0455
            boolean r0 = X.C22971Dz.A0d(r2)
            if (r0 != 0) goto L_0x0081
            boolean r0 = X.C22971Dz.A0e(r2)
            if (r0 == 0) goto L_0x0455
        L_0x0081:
            r25.get()
            r0 = r7
            X.24B r0 = (X.AnonymousClass24B) r0
            if (r0 == 0) goto L_0x009b
            X.205 r1 = r0.A03
            if (r1 == 0) goto L_0x009b
            X.1W6 r0 = r3.A01
            X.206 r0 = X.C108945cZ.A0s(r1, r0)
            if (r0 == 0) goto L_0x009b
            com.whatsapp.jid.UserJid r1 = r0.A0I()
        L_0x0099:
            if (r1 != 0) goto L_0x04d0
        L_0x009b:
            if (r14 == 0) goto L_0x0452
            X.1Ty r0 = r3.A00
            X.0vl r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.9CB r0 = (X.AnonymousClass9CB) r0
            int r11 = r0.A0I(r14)
        L_0x00ab:
            r2 = 0
            if (r8 == 0) goto L_0x044e
            r19 = 1
            java.lang.Object r1 = r25.get()
            X.1PW r1 = (X.AnonymousClass1PW) r1
            int r0 = r7.A0u
            r15 = r26
            boolean r0 = r1.A0A(r15, r0)
            if (r0 == 0) goto L_0x044e
        L_0x00c0:
            boolean r0 = r7 instanceof X.AnonymousClass24D
            if (r0 == 0) goto L_0x0384
            java.lang.Integer r2 = X.AnonymousClass00R.A15
        L_0x00c6:
            boolean r0 = X.C22971Dz.A0M(r26)
            r1 = 0
            if (r0 == 0) goto L_0x0380
            java.lang.Object r0 = r25.get()
            X.1PW r0 = (X.AnonymousClass1PW) r0
            int r14 = r0.A01(r14)
            r0 = r22
            if (r14 == r0) goto L_0x037c
            r0 = 2
            r21 = 0
            if (r14 == r0) goto L_0x00eb
            r0 = 3
            if (r14 == r0) goto L_0x00eb
            r0 = 4
            if (r14 == r0) goto L_0x0378
            r0 = 5
            if (r14 != r0) goto L_0x00eb
            java.lang.Integer r21 = X.AnonymousClass00R.A01
        L_0x00eb:
            int r0 = r9.A02
            r17 = r0
            if (r4 <= 0) goto L_0x0362
            if (r8 == 0) goto L_0x0362
        L_0x00f3:
            r16 = 1
        L_0x00f5:
            r25.get()
            r14 = 88
            r0 = r17
            if (r0 != r14) goto L_0x0109
            X.1BI r0 = X.C22931Dv.A00(r26)
            boolean r0 = X.C42701yb.A01(r0)
            r15 = 1
            if (r0 != 0) goto L_0x010a
        L_0x0109:
            r15 = 0
        L_0x010a:
            if (r8 == 0) goto L_0x011c
            if (r24 == 0) goto L_0x011c
            r0 = r24
            int r14 = r0.A00
            r0 = r22
            if (r14 != r0) goto L_0x011c
            int r0 = r13.A00
            int r0 = r0 + 1
            r13.A00 = r0
        L_0x011c:
            if (r16 == 0) goto L_0x033d
            X.9IM r0 = X.AnonymousClass9IM.PARTICIPANTS
            r13.A00(r0, r3)
            X.9IM r0 = X.AnonymousClass9IM.COMMON_ENC
            r13.A00(r0, r3)
            X.9IM r0 = X.AnonymousClass9IM.ENC_NODE_CREATION
            r13.A00(r0, r3)
        L_0x012d:
            boolean r0 = r12.A0A
            r20 = r0
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            java.util.LinkedHashSet r14 = X.C17880vN.A14()
            java.util.ArrayList r19 = X.AnonymousClass000.A13()
            r18 = 0
            if (r8 == 0) goto L_0x0339
            X.BCY r13 = r13.A02
            r0 = r24
            X.1ca r15 = r13.BHK(r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r2 != r0) goto L_0x0319
            r12.add(r15)
        L_0x0150:
            java.lang.String r13 = "type"
            int r0 = r2.intValue()
            switch(r0) {
                case 2: goto L_0x0315;
                case 3: goto L_0x0311;
                case 4: goto L_0x030d;
                case 5: goto L_0x0309;
                case 6: goto L_0x0305;
                case 7: goto L_0x0301;
                case 8: goto L_0x02fd;
                case 9: goto L_0x02f9;
                default: goto L_0x0159;
            }
        L_0x0159:
            java.lang.String r0 = "feedback"
        L_0x015b:
            X.1MD r0 = X.AnonymousClass8BR.A0h(r13, r0)
            r14.add(r0)
        L_0x0162:
            if (r21 == 0) goto L_0x0176
            java.lang.String r2 = "persona_type"
            int r0 = r21.intValue()
            switch(r0) {
                case 1: goto L_0x02f5;
                case 2: goto L_0x02f1;
                default: goto L_0x016d;
            }
        L_0x016d:
            java.lang.String r0 = "default"
        L_0x016f:
            X.1MD r0 = X.AnonymousClass8BR.A0h(r2, r0)
            r14.add(r0)
        L_0x0176:
            r0 = 1
            if (r11 == r0) goto L_0x02ed
            r0 = 2
            if (r11 != r0) goto L_0x0187
            java.lang.String r2 = "3p_full"
        L_0x017e:
            java.lang.String r0 = "local_automated_type"
            X.1MD r0 = X.AnonymousClass8BR.A0h(r0, r2)
            r14.add(r0)
        L_0x0187:
            boolean r0 = r14.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0195
            boolean r0 = X.C17880vN.A1X(r19)
            if (r0 == 0) goto L_0x01c3
        L_0x0195:
            if (r20 == 0) goto L_0x01a2
            java.lang.String r2 = "is_lid"
            java.lang.String r0 = "true"
            X.1MD r0 = X.AnonymousClass8BR.A0h(r2, r0)
            r14.add(r0)
        L_0x01a2:
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x01b0
            X.1MD[] r0 = new X.AnonymousClass1MD[r10]
            java.lang.Object[] r1 = r14.toArray(r0)
            X.1MD[] r1 = (X.AnonymousClass1MD[]) r1
        L_0x01b0:
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x01bc
            r0 = r19
            X.1ca[] r18 = X.C17890vO.A1Y(r0, r10)
        L_0x01bc:
            java.lang.String r2 = "bot"
            r0 = r18
            X.AnonymousClass8BU.A1K(r2, r12, r1, r0)
        L_0x01c3:
            java.util.List r0 = r9.A0A
            r0.addAll(r12)
            int r2 = r7.A0u
            if (r4 <= 0) goto L_0x0211
            if (r8 == 0) goto L_0x0211
            java.lang.String r0 = "t"
            java.util.Map r1 = r9.A0B
            r1.remove(r0)
            java.lang.String r0 = "participant"
            r1.remove(r0)
            java.lang.String r0 = "recipient"
            r1.remove(r0)
            java.lang.String r0 = "recipient_pn"
            r1.remove(r0)
            java.lang.String r0 = "recipient_username"
            r1.remove(r0)
            X.205 r1 = r9.A08
            X.1BI r0 = r1.A00
            boolean r0 = X.C22971Dz.A0e(r0)
            if (r0 != 0) goto L_0x0211
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x02e9
            int r1 = r9.A01
            r0 = 8
            if (r1 == r0) goto L_0x02e9
            java.lang.String r1 = "from"
        L_0x01ff:
            X.C17960vV.A07(r6)
            X.C18070vi.A0X(r6)
            X.1MD r0 = new X.1MD
            r0.<init>((com.whatsapp.jid.Jid) r6, (java.lang.String) r1)
            java.util.List r0 = X.C18070vi.A0M(r0)
            r9.A02(r0)
        L_0x0211:
            java.lang.Object r1 = r25.get()
            X.1PW r1 = (X.AnonymousClass1PW) r1
            r0 = r26
            boolean r0 = r1.A0A(r0, r2)
            if (r0 == 0) goto L_0x0226
            java.lang.String r1 = "phash"
            java.util.Map r0 = r9.A0B
            r0.remove(r1)
        L_0x0226:
            r25.get()
            r0 = 88
            if (r2 != r0) goto L_0x0246
            X.1BI r0 = X.C22931Dv.A00(r26)
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x0246
            java.lang.String r1 = "device_fanout"
            java.lang.String r0 = "false"
            X.1MD r0 = X.AnonymousClass8BR.A0h(r1, r0)
            java.util.List r0 = X.C18070vi.A0M(r0)
            r9.A02(r0)
        L_0x0246:
            X.205 r0 = r9.A08
            X.1BI r8 = r0.A00
            X.1BI r10 = X.C22971Dz.A00(r26)
            X.C17960vV.A07(r10)
            X.C18070vi.A0X(r10)
            X.2nR r2 = r9.A00
            if (r8 == 0) goto L_0x02e7
            r25.get()
            boolean r0 = r7 instanceof X.AnonymousClass24B
            if (r0 == 0) goto L_0x02e7
            X.1BI r0 = X.C22931Dv.A00(r8)
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 != 0) goto L_0x02e7
            boolean r0 = X.C22971Dz.A0e(r8)
            if (r0 == 0) goto L_0x02e7
            if (r5 != 0) goto L_0x02e7
            r25.get()
            X.24B r7 = (X.AnonymousClass24B) r7
            if (r7 == 0) goto L_0x02e7
            X.205 r1 = r7.A03
            if (r1 == 0) goto L_0x02e7
            X.1W6 r0 = r3.A01
            X.206 r1 = X.C108945cZ.A0s(r1, r0)
            if (r1 == 0) goto L_0x02e7
            com.whatsapp.jid.UserJid r0 = r1.A0I()
            if (r0 == 0) goto L_0x02e7
            com.whatsapp.jid.UserJid r0 = r1.A0I()
            X.C17960vV.A07(r0)
            com.whatsapp.jid.DeviceJid r5 = r0.getPrimaryDevice()
            r1 = 1
        L_0x0296:
            r25.get()
            if (r4 <= 0) goto L_0x02e0
            if (r6 == 0) goto L_0x02a3
            boolean r0 = X.C42701yb.A01(r10)
            if (r0 != 0) goto L_0x02ad
        L_0x02a3:
            if (r5 == 0) goto L_0x02e0
            com.whatsapp.jid.UserJid r0 = r5.userJid
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x02e0
        L_0x02ad:
            boolean r0 = X.C22971Dz.A0e(r8)
            if (r0 == 0) goto L_0x02d9
            r6 = r26
        L_0x02b5:
            boolean r0 = X.C22971Dz.A0e(r8)
            if (r0 != 0) goto L_0x02bd
            r5 = r26
        L_0x02bd:
            X.2lD r1 = new X.2lD
            r1.<init>()
            r1.A02 = r6
            java.lang.String r0 = r2.A06
            r1.A06 = r0
            java.lang.String r0 = r2.A08
            r1.A08 = r0
            java.lang.String r0 = r2.A07
            r1.A07 = r0
        L_0x02d0:
            r1.A01 = r5
            X.2nR r0 = r1.A00()
            r9.A00 = r0
        L_0x02d8:
            return
        L_0x02d9:
            X.C17960vV.A07(r6)
            X.C18070vi.A0X(r6)
            goto L_0x02b5
        L_0x02e0:
            if (r1 == 0) goto L_0x02d8
            X.2lD r1 = r2.A00()
            goto L_0x02d0
        L_0x02e7:
            r1 = 0
            goto L_0x0296
        L_0x02e9:
            java.lang.String r1 = "to"
            goto L_0x01ff
        L_0x02ed:
            java.lang.String r2 = "1p_partial"
            goto L_0x017e
        L_0x02f1:
            java.lang.String r0 = "ugc"
            goto L_0x016f
        L_0x02f5:
            java.lang.String r0 = "1p"
            goto L_0x016f
        L_0x02f9:
            java.lang.String r0 = "voice"
            goto L_0x015b
        L_0x02fd:
            java.lang.String r0 = "memu_invoke"
            goto L_0x015b
        L_0x0301:
            java.lang.String r0 = "memu_onboarding"
            goto L_0x015b
        L_0x0305:
            java.lang.String r0 = "emu_flash_invoke"
            goto L_0x015b
        L_0x0309:
            java.lang.String r0 = "search"
            goto L_0x015b
        L_0x030d:
            java.lang.String r0 = "command"
            goto L_0x015b
        L_0x0311:
            java.lang.String r0 = "prompt"
            goto L_0x015b
        L_0x0315:
            java.lang.String r0 = "request_welcome"
            goto L_0x015b
        L_0x0319:
            com.whatsapp.jid.DeviceJid r0 = r23.getPrimaryDevice()
            com.whatsapp.jid.UserJid r0 = r0.userJid
            X.1ca r17 = r13.BHE(r0)
            com.whatsapp.jid.DeviceJid r16 = r23.getPrimaryDevice()
            r0 = 2
            X.1ca[] r13 = new X.C29621ca[r0]
            r13[r10] = r15
            r13[r22] = r17
            r0 = r16
            X.1ca r13 = X.A83.A00(r0, r1, r13)
            r0 = r19
            r0.add(r13)
        L_0x0339:
            if (r2 == 0) goto L_0x0162
            goto L_0x0150
        L_0x033d:
            if (r15 == 0) goto L_0x012d
            com.whatsapp.jid.DeviceJid r0 = X.AnonymousClass1E0.A00(r26)
            X.C17960vV.A07(r0)
            java.util.Set r14 = X.C18070vi.A0P(r0)
            r0 = r20
            java.util.Map r14 = r0.BV7(r14)
            X.9mc r0 = r13.A03
            r0.A03 = r14
            r0.A02 = r1
            X.9IM r0 = X.AnonymousClass9IM.PARTICIPANTS
            r13.A00(r0, r3)
            X.9IM r0 = X.AnonymousClass9IM.COMMON_ENC
            r13.A00(r0, r3)
            goto L_0x012d
        L_0x0362:
            java.lang.Object r15 = r25.get()
            X.1PW r15 = (X.AnonymousClass1PW) r15
            r14 = r26
            boolean r0 = r15.A0A(r14, r0)
            if (r0 != 0) goto L_0x00f3
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r16 = 0
            if (r2 != r0) goto L_0x00f5
            goto L_0x00f3
        L_0x0378:
            java.lang.Integer r21 = X.AnonymousClass00R.A0C
            goto L_0x00eb
        L_0x037c:
            java.lang.Integer r21 = X.AnonymousClass00R.A00
            goto L_0x00eb
        L_0x0380:
            r21 = r1
            goto L_0x00eb
        L_0x0384:
            java.lang.Class<X.Abt> r0 = X.C20939Abt.class
            X.25F r0 = r7.A0M(r0)
            X.229 r0 = r0.A02
            if (r0 == 0) goto L_0x0392
            java.lang.Integer r2 = X.AnonymousClass00R.A0u
            goto L_0x00c6
        L_0x0392:
            java.lang.Class<X.Abu> r0 = X.C20940Abu.class
            X.25F r0 = r7.A0M(r0)
            X.229 r0 = r0.A02
            if (r0 == 0) goto L_0x03a0
            java.lang.Integer r2 = X.AnonymousClass00R.A18
            goto L_0x00c6
        L_0x03a0:
            X.Ac3 r0 = X.AnonymousClass9RU.A00(r7)
            if (r0 == 0) goto L_0x03bd
            X.Ac3 r0 = X.AnonymousClass9RU.A00(r7)
            if (r0 == 0) goto L_0x03ae
            X.6R7 r2 = r0.A00
        L_0x03ae:
            X.6R7 r0 = X.AnonymousClass6R7.VOICE
            if (r2 != r0) goto L_0x03b6
            java.lang.Integer r2 = X.AnonymousClass00R.A19
            goto L_0x00c6
        L_0x03b6:
            X.AnonymousClass9RU.A00(r7)
            java.lang.Integer r2 = X.AnonymousClass00R.A0j
            goto L_0x00c6
        L_0x03bd:
            int r1 = r7.A0u
            r0 = 88
            if (r1 != r0) goto L_0x03d6
            long r17 = r7.A0G()
            r15 = 8388608(0x800000, double:4.144523E-317)
            long r17 = r17 & r15
            r15 = 0
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x03d6
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            goto L_0x00c6
        L_0x03d6:
            if (r19 != 0) goto L_0x03e9
            r25.get()
            r0 = 88
            if (r1 != r0) goto L_0x03ed
            X.1BI r0 = X.C22931Dv.A00(r26)
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x03f5
        L_0x03e9:
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            goto L_0x00c6
        L_0x03ed:
            r0 = 87
            if (r1 != r0) goto L_0x03f5
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            goto L_0x00c6
        L_0x03f5:
            if (r14 == 0) goto L_0x00c6
            boolean r0 = r7 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x00c6
            X.1Ty r0 = r3.A00
            X.AEW r0 = r0.A08(r14)
            if (r0 == 0) goto L_0x00c6
            java.util.List r15 = r0.A0Q
            java.util.List r2 = r0.A0T
            java.lang.String r1 = r7.A0P()
            if (r1 == 0) goto L_0x044b
            int r0 = r1.length()
            if (r0 == 0) goto L_0x044b
            java.util.Iterator r15 = r15.iterator()
        L_0x0417:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x042f
            java.lang.Object r0 = r15.next()
            X.24c r0 = (X.C446124c) r0
            java.lang.String r0 = r0.A02
            boolean r0 = X.AnonymousClass1YF.A0Y(r1, r0, r10)
            if (r0 == 0) goto L_0x0417
            java.lang.Integer r2 = X.AnonymousClass00R.A0Y
            goto L_0x00c6
        L_0x042f:
            java.util.Iterator r2 = r2.iterator()
        L_0x0433:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x044b
            java.lang.Object r0 = r2.next()
            X.24Z r0 = (X.AnonymousClass24Z) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x0433
            java.lang.Integer r2 = X.AnonymousClass00R.A0N
            goto L_0x00c6
        L_0x044b:
            r2 = 0
            goto L_0x00c6
        L_0x044e:
            r19 = 0
            goto L_0x00c0
        L_0x0452:
            r11 = 0
            goto L_0x00ab
        L_0x0455:
            java.lang.Object r0 = r25.get()
            X.1PW r0 = (X.AnonymousClass1PW) r0
            boolean r0 = r0.A09(r2, r1, r7)
            if (r0 != 0) goto L_0x0099
            r25.get()
            boolean r0 = r7 instanceof X.AnonymousClass23N
            if (r0 == 0) goto L_0x009b
            boolean r0 = r7.A0s()
            if (r0 == 0) goto L_0x009b
            boolean r0 = X.C42701yb.A01(r2)
            if (r0 != 0) goto L_0x009b
            boolean r0 = X.C22971Dz.A0d(r2)
            if (r0 != 0) goto L_0x0480
            boolean r0 = X.C22971Dz.A0e(r2)
            if (r0 == 0) goto L_0x009b
        L_0x0480:
            java.lang.Object r1 = r25.get()
            X.1PW r1 = (X.AnonymousClass1PW) r1
            java.util.List r0 = r7.A0h
            com.whatsapp.jid.UserJid r1 = r1.A03(r0)
            goto L_0x0099
        L_0x048e:
            boolean r0 = r7 instanceof X.AnonymousClass24B
            if (r0 == 0) goto L_0x04aa
            X.1BI r0 = X.C22931Dv.A00(r2)
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 != 0) goto L_0x04aa
            boolean r0 = X.C22971Dz.A0d(r2)
            if (r0 != 0) goto L_0x0062
            boolean r0 = X.C22971Dz.A0e(r2)
            if (r0 == 0) goto L_0x04aa
            goto L_0x0062
        L_0x04aa:
            boolean r0 = r15.A09(r2, r1, r7)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r7 instanceof X.AnonymousClass23N
            if (r0 == 0) goto L_0x009b
            boolean r0 = r7.A0s()
            if (r0 == 0) goto L_0x009b
            boolean r0 = X.C42701yb.A01(r2)
            if (r0 != 0) goto L_0x009b
            boolean r0 = X.C22971Dz.A0d(r2)
            if (r0 != 0) goto L_0x0062
            boolean r0 = X.C22971Dz.A0e(r2)
            if (r0 == 0) goto L_0x009b
            goto L_0x0062
        L_0x04ce:
            r1 = r16
        L_0x04d0:
            com.whatsapp.jid.DeviceJid r2 = r1.getPrimaryDevice()
            r0 = r20
            X.9r6 r0 = r0.BDW(r2, r8, r8)
            if (r0 == 0) goto L_0x009b
            r23 = r1
            r8 = 1
            r24 = r0
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVL.BLq(X.9uN, X.9ty, X.A1O):void");
    }

    public AVL(C26911Ty r1, AnonymousClass1W6 r2, AnonymousClass1PV r3, AnonymousClass00H r4) {
        C18070vi.A0s(r4, r2, r3, r1);
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public AnonymousClass9IM Ba7() {
        return AnonymousClass9IM.BONSAI;
    }

    public /* synthetic */ Set CGJ() {
        return C25511Om.A00;
    }
}
