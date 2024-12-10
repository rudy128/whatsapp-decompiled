package X;

import java.util.ArrayList;

/* renamed from: X.AhY  reason: case insensitive filesystem */
public class C21287AhY implements C22470B9c {
    public final int A00;

    public C21287AhY(int i) {
        this.A00 = i;
    }

    public static Object A00(C29621ca r1, C62672rm r2, String[] strArr, int i) {
        return r2.A02(r1, new C21287AhY(i), strArr);
    }

    public static ArrayList A01(C29621ca r8, C62672rm r9, String[] strArr, int i) {
        return r9.A08(r8, new C21287AhY(i), strArr, 1, 1000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0442, code lost:
        if (r0.A09(r9, r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0449, code lost:
        return new X.AnonymousClass9CQ(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0567, code lost:
        if (r2 != null) goto L_0x0569;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0579, code lost:
        return new X.AnonymousClass9DF(r4, r9, X.A97.A0A(r9, r0), r2.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0960, code lost:
        return X.AnonymousClass8BX.A0S(r9, r0.A05(r9, r10, r11, java.lang.Long.valueOf(r2), r1, r4, r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x09e6, code lost:
        r2 = r0.A09(r9, r1);
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x09eb, code lost:
        if (r2 == false) goto L_0x0a70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x09ed, code lost:
        r8 = X.AnonymousClass8BS.A1V(r3 ? 1 : 0);
        r4 = java.lang.String.class;
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x09f5, code lost:
        r0 = (java.lang.String) r0.A04(r9, r4, java.lang.Long.valueOf(r2), X.AnonymousClass8BU.A0j(), r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0a06, code lost:
        if (r0 != null) goto L_0x0a6a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0a08, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0a6f, code lost:
        return new X.C178169Cb(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0a70, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0289, code lost:
        if (r2 != null) goto L_0x0569;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object BCF(X.C29621ca r34, X.C62672rm r35) {
        /*
            r33 = this;
            r0 = r33
            int r1 = r0.A00
            r9 = r34
            r0 = r35
            switch(r1) {
                case 2: goto L_0x0010;
                case 3: goto L_0x0042;
                case 4: goto L_0x0074;
                case 5: goto L_0x00d5;
                case 6: goto L_0x0115;
                case 7: goto L_0x0148;
                case 8: goto L_0x0183;
                case 9: goto L_0x01c4;
                case 10: goto L_0x01f5;
                case 11: goto L_0x000b;
                case 12: goto L_0x0222;
                case 13: goto L_0x024f;
                case 14: goto L_0x028d;
                case 15: goto L_0x02ad;
                case 16: goto L_0x02cd;
                case 17: goto L_0x035d;
                case 18: goto L_0x03b7;
                case 19: goto L_0x03be;
                case 20: goto L_0x03c4;
                case 21: goto L_0x03ca;
                case 22: goto L_0x03d0;
                case 23: goto L_0x03d6;
                case 24: goto L_0x03dc;
                case 25: goto L_0x0409;
                case 26: goto L_0x040f;
                case 27: goto L_0x0415;
                case 28: goto L_0x041b;
                case 29: goto L_0x0439;
                case 30: goto L_0x044c;
                case 31: goto L_0x04ad;
                case 32: goto L_0x04e8;
                case 33: goto L_0x052d;
                case 34: goto L_0x057a;
                case 35: goto L_0x0726;
                case 36: goto L_0x000b;
                case 37: goto L_0x0824;
                case 38: goto L_0x086d;
                case 39: goto L_0x08b3;
                case 40: goto L_0x000b;
                case 41: goto L_0x08dd;
                case 42: goto L_0x08fb;
                case 43: goto L_0x0932;
                case 44: goto L_0x0961;
                case 45: goto L_0x09c3;
                case 46: goto L_0x09d9;
                case 47: goto L_0x09e0;
                case 48: goto L_0x0a09;
                case 49: goto L_0x0a4e;
                default: goto L_0x000b;
            }
        L_0x000b:
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            return r9
        L_0x0010:
            r6 = 0
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "data"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r2 = X.AnonymousClass8BS.A1a(r3, r6)
            java.lang.Object r5 = X.AnonymousClass8BY.A0W(r9, r0, r1, r2, r6)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0a70
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r2 = "pay"
            r4[r6] = r2
            r3 = 3
            X.AhY r2 = new X.AhY
            r2.<init>(r3)
            java.util.ArrayList r0 = X.AnonymousClass8BX.A0k(r9, r0, r2, r4)
            if (r0 == 0) goto L_0x0a70
            X.9DH r1 = new X.9DH
            r1.<init>((X.C29621ca) r9, (java.lang.String) r5, (java.util.List) r0)
            return r1
        L_0x0042:
            r5 = 0
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "pay"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            r2 = 3
            X.B9c[] r4 = new X.C22470B9c[r2]
            X.Afm r2 = X.C21177Afm.A00
            r4[r5] = r2
            X.Afn r2 = X.C21178Afn.A00
            r4[r3] = r2
            r3 = 2
            X.Afo r2 = X.C21179Afo.A00
            java.util.List r4 = X.C18070vi.A0O(r2, r4, r3)
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.String r2 = "BRMerchantData|BRCardData|BRKYCData"
            java.lang.Object r0 = r0.A06(r9, r2, r4, r3)
            if (r0 == 0) goto L_0x0a70
            X.B6H r0 = (X.B6H) r0
            X.9DO r1 = new X.9DO
            r1.<init>((X.C29621ca) r9, (X.B6H) r0)
            return r1
        L_0x0074:
            r15 = 0
            boolean r6 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "screen"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            java.util.List r4 = X.AnonymousClass8BX.A0n(r6)
            java.lang.String[] r3 = new java.lang.String[r6]
            java.lang.String r2 = "is_entry_screen"
            r3[r15] = r2
            java.lang.String r16 = r0.A07(r9, r4, r3)
            java.lang.String[] r3 = new java.lang.String[r6]
            java.lang.String r2 = "app_id"
            r3[r15] = r2
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            r8 = r0
            r13 = r1
            r14 = r3
            java.lang.Object r5 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0a70
            java.lang.String[] r3 = new java.lang.String[r6]
            java.lang.String r2 = "bloks_server_params"
            r3[r15] = r2
            r14 = r3
            java.lang.Object r4 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String[] r3 = new java.lang.String[r6]
            java.lang.String r2 = "sources"
            r3[r15] = r2
            r14 = r3
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = (java.lang.String) r0
            r20 = 3
            X.9Cv r1 = new X.9Cv
            r14 = r1
            r15 = r9
            r17 = r5
            r18 = r4
            r19 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            return r1
        L_0x00d5:
            r6 = 0
            boolean r4 = X.C18070vi.A17(r9, r0)
            java.lang.String r3 = "states"
            boolean r2 = r0.A09(r9, r3)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            boolean r2 = r0.A09(r9, r3)
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.String r2 = "start_at"
            r3[r6] = r2
            java.lang.Object r5 = X.AnonymousClass8BY.A0W(r9, r0, r1, r3, r6)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0a70
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r2 = "state"
            r4[r6] = r2
            r3 = 8
            X.AhY r2 = new X.AhY
            r2.<init>(r3)
            java.util.ArrayList r2 = X.AnonymousClass8BX.A0l(r9, r0, r2, r4)
            if (r2 == 0) goto L_0x0a70
            X.9DH r0 = new X.9DH
            r0.<init>((X.C29621ca) r9, (java.lang.String) r5, (java.util.List) r2)
            X.9DO r1 = new X.9DO
            r1.<init>((X.C29621ca) r9, (X.AnonymousClass9DH) r0)
            return r1
        L_0x0115:
            r5 = 0
            boolean r4 = X.C18070vi.A17(r9, r0)
            java.lang.String r3 = "next_screens"
            boolean r2 = r0.A09(r9, r3)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            boolean r2 = r0.A09(r9, r3)
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r2 = "screen"
            r4[r5] = r2
            r3 = 4
            X.AhY r2 = new X.AhY
            r2.<init>(r3)
            java.util.ArrayList r2 = X.AnonymousClass8BX.A0k(r9, r0, r2, r4)
            if (r2 == 0) goto L_0x0a70
            r1 = 29
            X.9DN r0 = new X.9DN
            r0.<init>((X.C29621ca) r9, (java.util.List) r2, (int) r1)
            X.9DO r1 = new X.9DO
            r1.<init>((X.C29621ca) r9, (X.AnonymousClass9DN) r0)
            return r1
        L_0x0148:
            r15 = 0
            boolean r4 = X.C18070vi.A17(r9, r0)
            java.lang.String r2 = "screen_data"
            boolean r1 = r0.A09(r9, r2)
            if (r1 == 0) goto L_0x044a
            boolean r1 = r0.A09(r9, r2)
            r3 = 0
            if (r1 == 0) goto L_0x017c
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r1 = "parameters"
            r2[r15] = r1
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.C17890vO.A0L()
            java.lang.Long r12 = X.AnonymousClass8BV.A0l()
            r8 = r0
            r13 = r3
            r14 = r2
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x017c
            X.9CY r3 = new X.9CY
            r3.<init>(r9, r0)
        L_0x017c:
            r0 = 4
            X.9DO r1 = new X.9DO
            r1.<init>((X.C29621ca) r9, (X.AnonymousClass9CY) r3, (int) r0)
            return r1
        L_0x0183:
            r5 = 0
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "state"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            r2 = 6
            X.B9c[] r4 = new X.C22470B9c[r2]
            X.Afp r2 = X.C21180Afp.A00
            r4[r5] = r2
            X.Afq r2 = X.C21181Afq.A00
            r4[r3] = r2
            r3 = 2
            X.Afr r2 = X.C21182Afr.A00
            r4[r3] = r2
            r3 = 3
            X.Afs r2 = X.C21183Afs.A00
            r4[r3] = r2
            r3 = 4
            X.Aft r2 = X.C21184Aft.A00
            r4[r3] = r2
            r3 = 5
            X.Afu r2 = X.C21185Afu.A00
            java.util.List r4 = X.C18070vi.A0O(r2, r4, r3)
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.String r2 = "FDSResourceState|FDSChoiceState|FDSSucceedState|FDSPassState|FDSSubflowState|FDSVersionCheckState"
            java.lang.Object r0 = r0.A06(r9, r2, r4, r3)
            if (r0 == 0) goto L_0x0a70
            X.B6I r0 = (X.B6I) r0
            X.9DO r1 = new X.9DO
            r1.<init>((X.C29621ca) r9, (X.B6I) r0)
            return r1
        L_0x01c4:
            r5 = 0
            boolean r4 = X.C18070vi.A17(r9, r0)
            java.lang.String r3 = "persist_data"
            boolean r2 = r0.A09(r9, r3)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            boolean r2 = r0.A09(r9, r3)
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r2 = "data"
            r4[r5] = r2
            r3 = 2
            X.AhY r2 = new X.AhY
            r2.<init>(r3)
            java.util.ArrayList r2 = X.AnonymousClass8BX.A0l(r9, r0, r2, r4)
            if (r2 == 0) goto L_0x0a70
            X.9DO r0 = new X.9DO
            r0.<init>((X.C29621ca) r9, (java.util.List) r2, (int) r5)
            X.9DO r1 = new X.9DO
            r1.<init>((X.C29621ca) r9, (X.AnonymousClass9DO) r0)
            return r1
        L_0x01f5:
            r5 = 0
            boolean r4 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "payout"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            r2 = 2
            X.B9c[] r3 = new X.C22470B9c[r2]
            X.Afh r2 = X.C21172Afh.A00
            r3[r5] = r2
            X.Afi r2 = X.C21173Afi.A00
            java.util.List r4 = X.C18070vi.A0O(r2, r3, r4)
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.String r2 = "PayoutBank|PayoutPrepaidCard"
            java.lang.Object r0 = r0.A06(r9, r2, r4, r3)
            if (r0 == 0) goto L_0x0a70
            X.B6F r0 = (X.B6F) r0
            X.9DN r1 = new X.9DN
            r1.<init>((X.C29621ca) r9, (X.B6F) r0)
            return r1
        L_0x0222:
            X.C18070vi.A0h(r9, r0)
            java.lang.String r5 = "choice"
            boolean r2 = r0.A09(r9, r5)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            r4 = 0
            r3 = 1
            boolean r2 = r0.A09(r9, r5)
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r2 = new java.lang.String[r3]
            r2[r4] = r5
            java.lang.Object r0 = X.AnonymousClass8BY.A0W(r9, r0, r1, r2, r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0a70
            X.9CY r2 = new X.9CY
            r2.<init>(r9, r0)
            r0 = 28
            X.9DN r1 = new X.9DN
            r1.<init>((X.C29621ca) r9, (X.AnonymousClass9CY) r2, (int) r0)
            return r1
        L_0x024f:
            r5 = 0
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "reporter"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r14 = X.AnonymousClass8BS.A1Y(r3, r5)
            java.lang.Class<com.whatsapp.jid.UserJid> r10 = com.whatsapp.jid.UserJid.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            r8 = r0
            r13 = r1
            r15 = r5
            java.lang.Object r4 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            if (r4 == 0) goto L_0x0a70
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r2 = "timestamp"
            r3[r5] = r2
            java.lang.Class r10 = java.lang.Long.TYPE
            java.lang.Long r11 = X.C17890vO.A0L()
            r14 = r3
            java.lang.Object r2 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0a70
            goto L_0x0569
        L_0x028d:
            X.C18070vi.A0h(r9, r0)
            java.lang.String r1 = "sub_group_suggestion"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            X.9DO r3 = X.A97.A0B(r9, r0)
            if (r3 == 0) goto L_0x0a70
            X.9CS r2 = X.A97.A0E(r9, r0)
            X.9DO r0 = X.A97.A0A(r9, r0)
            X.9DL r1 = new X.9DL
            r1.<init>((X.C29621ca) r9, (X.AnonymousClass9DO) r3, (X.AnonymousClass9DO) r0, (X.AnonymousClass9CS) r2)
            return r1
        L_0x02ad:
            X.C18070vi.A0h(r9, r0)
            java.lang.String r1 = "sub_group_suggestion"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            X.9DP r3 = X.A97.A01(r9, r0)
            if (r3 == 0) goto L_0x0a70
            X.9CS r2 = X.A97.A0E(r9, r0)
            X.9DO r0 = X.A97.A0A(r9, r0)
            X.9DL r1 = new X.9DL
            r1.<init>((X.C29621ca) r9, (X.AnonymousClass9DP) r3, (X.AnonymousClass9DO) r0, (X.AnonymousClass9CS) r2)
            return r1
        L_0x02cd:
            r4 = 0
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r2 = "description"
            boolean r1 = r0.A09(r9, r2)
            if (r1 == 0) goto L_0x044a
            boolean r1 = r0.A09(r9, r2)
            r2 = 0
            if (r1 == 0) goto L_0x0357
            java.lang.String[] r14 = X.AnonymousClass8BS.A1W(r3, r4)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.C108975cc.A0X()
            r5 = 256(0x100, double:1.265E-321)
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            r8 = r0
            r13 = r2
            r15 = r4
            java.lang.Object r1 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r1 == 0) goto L_0x0357
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.String r1 = "participant"
            r5[r4] = r1
            java.lang.Class<com.whatsapp.jid.UserJid> r14 = com.whatsapp.jid.UserJid.class
            java.lang.Long r15 = X.AnonymousClass8BU.A0i()
            java.lang.Long r16 = X.AnonymousClass8BU.A0j()
            r12 = r0
            r13 = r9
            r17 = r2
            r18 = r5
            r19 = r4
            java.lang.Object r5 = r12.A05(r13, r14, r15, r16, r17, r18, r19)
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.String[] r6 = new java.lang.String[r3]
            java.lang.String r1 = "participant_pn"
            r6[r4] = r1
            r18 = r6
            java.lang.Object r1 = r12.A05(r13, r14, r15, r16, r17, r18, r19)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.String r6 = "t"
            r7[r4] = r6
            java.lang.Class r14 = java.lang.Long.TYPE
            java.lang.Long r15 = X.C17890vO.A0L()
            r18 = r7
            java.lang.Object r6 = r12.A05(r13, r14, r15, r16, r17, r18, r19)
            if (r6 == 0) goto L_0x0357
            java.lang.String[] r7 = X.C17880vN.A1Z()
            java.lang.String r6 = "body"
            X.AnonymousClass8BR.A1K(r7, r4, r3, r6)
            r3 = 65536(0x10000, double:3.2379E-319)
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            r13 = r2
            r14 = r7
            java.lang.Object r0 = r8.A04(r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto L_0x0357
            X.9Cs r2 = new X.9Cs
            r2.<init>(r5, r1, r9)
        L_0x0357:
            X.9DO r1 = new X.9DO
            r1.<init>((X.C29621ca) r9, (X.C178339Cs) r2)
            return r1
        L_0x035d:
            r5 = 0
            boolean r6 = X.C18070vi.A17(r9, r0)
            java.lang.String r2 = "membership_approval_mode"
            boolean r1 = r0.A09(r9, r2)
            if (r1 == 0) goto L_0x044a
            boolean r1 = r0.A09(r9, r2)
            r4 = 0
            if (r1 == 0) goto L_0x037e
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.String r1 = "group_join"
            X.1ca r3 = X.AnonymousClass8BT.A0Z(r9, r1, r2)
            if (r3 != 0) goto L_0x0384
            X.AnonymousClass8BY.A11(r9, r0, r2, r5)
        L_0x037e:
            X.9DO r1 = new X.9DO
            r1.<init>((X.C29621ca) r9, (X.AnonymousClass9DO) r4)
            return r1
        L_0x0384:
            boolean r1 = r0.A09(r3, r1)
            if (r1 == 0) goto L_0x037e
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.String r1 = "state"
            r2[r5] = r1
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "on"
            r10 = r0
            r11 = r3
            r16 = r2
            r17 = r5
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x037e
            X.9CY r1 = new X.9CY
            r1.<init>(r3, r0)
            r0 = 20
            X.9DO r4 = new X.9DO
            r4.<init>((X.C29621ca) r9, (X.AnonymousClass9CY) r1, (int) r0)
            goto L_0x037e
        L_0x03b7:
            X.C18070vi.A0h(r9, r0)
            java.lang.String r1 = "incognito"
            goto L_0x043e
        L_0x03be:
            X.C18070vi.A0h(r9, r0)
            java.lang.String r1 = "allow_admin_reports"
            goto L_0x043e
        L_0x03c4:
            X.C18070vi.A0h(r9, r0)
            java.lang.String r1 = "allow_non_admin_sub_group_creation"
            goto L_0x043e
        L_0x03ca:
            X.C18070vi.A0h(r9, r0)
            java.lang.String r1 = "general_chat"
            goto L_0x043e
        L_0x03d0:
            X.C18070vi.A0h(r9, r0)
            java.lang.String r1 = "auto_add_disabled"
            goto L_0x043e
        L_0x03d6:
            X.C18070vi.A0h(r9, r0)
            java.lang.String r1 = "group_history"
            goto L_0x043e
        L_0x03dc:
            r4 = 0
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "linked_parent"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r14 = X.AnonymousClass8BS.A1Y(r3, r4)
            java.lang.Class<X.1EC> r10 = X.AnonymousClass1EC.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            r8 = r0
            r13 = r1
            r15 = r4
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            X.1EC r0 = (X.AnonymousClass1EC) r0
            if (r0 == 0) goto L_0x0a70
            X.9DO r1 = new X.9DO
            r1.<init>((X.AnonymousClass1EC) r0, (X.C29621ca) r9)
            return r1
        L_0x0409:
            X.C18070vi.A0h(r9, r0)
            java.lang.String r1 = "hidden_group"
            goto L_0x043e
        L_0x040f:
            X.C18070vi.A0h(r9, r0)
            java.lang.String r1 = "capi"
            goto L_0x043e
        L_0x0415:
            X.C18070vi.A0h(r9, r0)
            java.lang.String r1 = "locked"
            goto L_0x043e
        L_0x041b:
            r15 = 0
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "evolution_version"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r2 = "value"
            r4[r15] = r2
            java.lang.Class r10 = java.lang.Long.TYPE
            java.lang.Long r11 = X.C17890vO.A0L()
            r2 = 100
            goto L_0x0951
        L_0x0439:
            X.C18070vi.A0h(r9, r0)
            java.lang.String r1 = "group_safety_check"
        L_0x043e:
            boolean r0 = r0.A09(r9, r1)
            if (r0 == 0) goto L_0x044a
            X.9CQ r1 = new X.9CQ
            r1.<init>(r9)
            return r1
        L_0x044a:
            r1 = 0
            return r1
        L_0x044c:
            r5 = 0
            boolean r6 = X.C18070vi.A17(r9, r0)
            java.lang.String r7 = "participant"
            boolean r2 = r0.A09(r9, r7)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            boolean r2 = r0.A09(r9, r7)
            if (r2 == 0) goto L_0x0a70
            r2 = 2
            X.B9c[] r3 = new X.C22470B9c[r2]
            X.AgW r2 = X.C21223AgW.A00
            r3[r5] = r2
            X.AgX r2 = X.C21224AgX.A00
            java.util.List r4 = X.C18070vi.A0O(r2, r3, r6)
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.String r2 = "GroupInfoParticipantAdmin|GroupInfoParticipantNonAdmin"
            java.lang.Object r2 = r0.A06(r9, r2, r4, r3)
            if (r2 == 0) goto L_0x0a70
            X.B6M r2 = (X.B6M) r2
            X.9DO r4 = new X.9DO
            r4.<init>((X.C29621ca) r9, (X.B6M) r2)
            boolean r1 = r0.A09(r9, r7)
            r3 = 0
            if (r1 == 0) goto L_0x04a7
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.String r1 = "addressable"
            r2[r5] = r1
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            java.lang.String r13 = "false"
            r8 = r0
            r14 = r2
            r15 = r5
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x04a7
            X.9CY r3 = new X.9CY
            r3.<init>(r9, r0)
        L_0x04a7:
            X.9DP r1 = new X.9DP
            r1.<init>((X.C29621ca) r9, (X.AnonymousClass9CY) r3, (X.AnonymousClass9DO) r4)
            return r1
        L_0x04ad:
            r5 = 0
            boolean r6 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "sub_group_suggestion"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            r2 = 2
            X.9DP r4 = X.A97.A01(r9, r0)
            if (r4 == 0) goto L_0x0a70
            r1 = 4
            X.B9c[] r3 = new X.C22470B9c[r1]
            X.Agp r1 = X.C21242Agp.A00
            r3[r5] = r1
            X.Agq r1 = X.C21243Agq.A00
            r3[r6] = r1
            X.Agr r1 = X.C21244Agr.A00
            r3[r2] = r1
            r2 = 3
            X.Ags r1 = X.C21245Ags.A00
            java.util.List r3 = X.C18070vi.A0O(r1, r3, r2)
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.String r1 = "SubGroupSuggestionNotFound|SubGroupSuggestionConflict|SubGroupResourceConstraint|SubGroupCreationInternalServerError"
            java.lang.Object r0 = r0.A06(r9, r1, r3, r2)
            X.9CS r0 = (X.AnonymousClass9CS) r0
            X.9DP r1 = new X.9DP
            r1.<init>((X.C29621ca) r9, (X.AnonymousClass9DP) r4, (X.AnonymousClass9CS) r0)
            return r1
        L_0x04e8:
            r7 = 0
            boolean r8 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "picture"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            r6 = 2
            X.B9c[] r3 = new X.C22470B9c[r6]
            X.AgK r2 = X.C21211AgK.A00
            r3[r7] = r2
            X.AgL r2 = X.C21212AgL.A00
            java.util.List r4 = X.C18070vi.A0O(r2, r3, r8)
            java.lang.String[] r3 = new java.lang.String[r7]
            java.lang.String r2 = "ParentGroup|SubGroup"
            java.lang.Object r5 = r0.A06(r9, r2, r4, r3)
            if (r5 == 0) goto L_0x0a70
            X.9Co r5 = (X.C178299Co) r5
            X.B9c[] r3 = new X.C22470B9c[r6]
            X.AgM r2 = X.C21213AgM.A00
            r3[r7] = r2
            X.AgN r2 = X.C21214AgN.A00
            java.util.List r4 = X.C18070vi.A0O(r2, r3, r8)
            java.lang.String[] r3 = new java.lang.String[r7]
            java.lang.String r2 = "SuccessProfilePictureResponse|PartialProfilePictureResponse"
            java.lang.Object r0 = r0.A06(r9, r2, r4, r3)
            if (r0 == 0) goto L_0x0a70
            X.B6O r0 = (X.B6O) r0
            X.9DP r1 = new X.9DP
            r1.<init>((X.C29621ca) r9, (X.C178299Co) r5, (X.B6O) r0)
            return r1
        L_0x052d:
            r5 = 0
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "reporter"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r14 = X.AnonymousClass8BS.A1Y(r3, r5)
            java.lang.Class<com.whatsapp.jid.UserJid> r10 = com.whatsapp.jid.UserJid.class
            java.lang.Long r11 = X.AnonymousClass8BU.A0i()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            r8 = r0
            r13 = r1
            r15 = r5
            java.lang.Object r4 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            if (r4 == 0) goto L_0x0a70
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r2 = "timestamp"
            r3[r5] = r2
            java.lang.Class r10 = java.lang.Long.TYPE
            java.lang.Long r11 = X.C17890vO.A0L()
            r14 = r3
            java.lang.Object r2 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0a70
        L_0x0569:
            long r6 = r2.longValue()
            X.9DO r5 = X.A97.A0A(r9, r0)
            X.9DF r1 = new X.9DF
            r2 = r1
            r3 = r4
            r4 = r9
            r2.<init>((com.whatsapp.jid.UserJid) r3, (X.C29621ca) r4, (X.AnonymousClass9DO) r5, (long) r6)
            return r1
        L_0x057a:
            r2 = 0
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r5 = "message"
            boolean r4 = r0.A09(r9, r5)
            r1 = 0
            if (r4 == 0) goto L_0x0a70
            boolean r4 = r0.A09(r9, r5)
            if (r4 == 0) goto L_0x0a70
            boolean r4 = r0.A09(r9, r5)
            if (r4 == 0) goto L_0x0a70
            java.lang.String[] r22 = X.AnonymousClass8BS.A1W(r3, r2)
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            java.lang.Long r19 = X.AnonymousClass8BU.A0i()
            java.lang.Long r20 = X.AnonymousClass8BU.A0j()
            r16 = r0
            r17 = r9
            r21 = r1
            r23 = r2
            java.lang.Object r14 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r6 = "server_id"
            r4[r2] = r6
            java.lang.Class r23 = java.lang.Long.TYPE
            r6 = 99
            java.lang.Long r24 = java.lang.Long.valueOf(r6)
            r6 = 2147476647(0x7fffe4a7, double:1.0609944365E-314)
            java.lang.Long r25 = java.lang.Long.valueOf(r6)
            r21 = r0
            r22 = r9
            r26 = r1
            r27 = r4
            r28 = r2
            java.lang.Object r4 = r21.A05(r22, r23, r24, r25, r26, r27, r28)
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 == 0) goto L_0x0a70
            long r16 = r4.longValue()
            java.lang.String[] r6 = new java.lang.String[r3]
            java.lang.String r4 = "t"
            r6[r2] = r4
            java.lang.Long r24 = X.C17890vO.A0L()
            r25 = r20
            r27 = r6
            java.lang.Object r13 = r21.A05(r22, r23, r24, r25, r26, r27, r28)
            java.lang.Long r13 = (java.lang.Long) r13
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r6 = "is_sender"
            r4[r2] = r6
            java.lang.String r30 = "true"
            r25 = r0
            r26 = r9
            r31 = r4
            r32 = r2
            r27 = r18
            r28 = r19
            r29 = r20
            java.lang.Object r15 = r25.A05(r26, r27, r28, r29, r30, r31, r32)
            java.lang.String r15 = (java.lang.String) r15
            r6 = 2
            boolean r4 = r0.A09(r9, r5)
            r10 = 0
            if (r4 == 0) goto L_0x063b
            java.lang.String[] r4 = new java.lang.String[r6]
            java.lang.String r7 = "meta"
            r4[r2] = r7
            java.lang.String r7 = "original_msg_t"
            r4[r3] = r7
            r7 = 1577865600(0x5e0c5180, double:7.795691867E-315)
            java.lang.Long r28 = java.lang.Long.valueOf(r7)
            r7 = 4102473600(0xf486c780, double:2.0268912687E-314)
            java.lang.Long r29 = java.lang.Long.valueOf(r7)
            r30 = r1
            r31 = r4
            r27 = r23
            java.lang.Object r4 = r25.A05(r26, r27, r28, r29, r30, r31, r32)
            X.9CX r10 = X.AnonymousClass8BX.A0S(r9, r4)
        L_0x063b:
            boolean r4 = r0.A09(r9, r5)
            r11 = 0
            if (r4 == 0) goto L_0x066c
            java.lang.String[] r4 = new java.lang.String[r6]
            java.lang.String r7 = "meta"
            r4[r2] = r7
            java.lang.String r7 = "msg_edit_t"
            r4[r3] = r7
            r7 = 1577865600000(0x16f601e5c00, double:7.795691867147E-312)
            java.lang.Long r28 = java.lang.Long.valueOf(r7)
            r7 = 4102473600000(0x3bb2e7b4c00, double:2.0268912687307E-311)
            java.lang.Long r29 = java.lang.Long.valueOf(r7)
            r30 = r1
            r31 = r4
            r27 = r23
            java.lang.Object r4 = r25.A05(r26, r27, r28, r29, r30, r31, r32)
            X.9CX r11 = X.AnonymousClass8BX.A0S(r9, r4)
        L_0x066c:
            r4 = 6
            X.B9c[] r4 = new X.C22470B9c[r4]
            X.AhB r7 = X.C21264AhB.A00
            r4[r2] = r7
            X.AhC r7 = X.C21265AhC.A00
            r4[r3] = r7
            X.AhD r7 = X.C21266AhD.A00
            r4[r6] = r7
            r7 = 3
            X.AhE r6 = X.C21267AhE.A00
            r4[r7] = r6
            r7 = 4
            X.AhF r6 = X.C21268AhF.A00
            r4[r7] = r6
            r7 = 5
            X.AhG r6 = X.C21269AhG.A00
            java.util.List r7 = X.C18070vi.A0O(r6, r4, r7)
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.String r4 = "NewsletterEdit|NewsletterText|NewsletterMedia|NewsletterRevoke|NewsletterPollCreation|NewsletterWAMOEmpty"
            java.lang.Object r12 = r0.A06(r9, r4, r7, r6)
            X.3LR r12 = (X.AnonymousClass3LR) r12
            X.2Q8 r8 = new X.2Q8
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r6 = r0.A09(r9, r5)
            r4 = 0
            if (r6 == 0) goto L_0x06c8
            java.lang.String[] r13 = X.C17880vN.A1Z()
            java.lang.String r6 = "reactions"
            r13[r2] = r6
            java.lang.String r6 = "reaction"
            r13[r3] = r6
            r7 = 37
            X.AhY r6 = new X.AhY
            r6.<init>(r7)
            r14 = 0
            r16 = 1000(0x3e8, double:4.94E-321)
            r10 = r0
            r11 = r9
            r12 = r6
            java.util.ArrayList r7 = r10.A08(r11, r12, r13, r14, r16)
            if (r7 == 0) goto L_0x06c8
            r6 = 5
            X.9DM r4 = new X.9DM
            r4.<init>((X.C29621ca) r9, (java.util.List) r7, (int) r6)
        L_0x06c8:
            boolean r6 = r0.A09(r9, r5)
            r12 = 0
            if (r6 == 0) goto L_0x06e9
            java.lang.String[] r27 = X.C17880vN.A1Z()
            java.lang.String r6 = "views_count"
            r27[r2] = r6
            java.lang.String r6 = "count"
            r27[r3] = r6
            r25 = r20
            r26 = r1
            r28 = r2
            java.lang.Object r1 = r21.A05(r22, r23, r24, r25, r26, r27, r28)
            X.9CX r12 = X.AnonymousClass8BX.A0S(r9, r1)
        L_0x06e9:
            boolean r1 = r0.A09(r9, r5)
            r5 = 0
            if (r1 == 0) goto L_0x0716
            java.lang.String[] r16 = X.C17880vN.A1Z()
            java.lang.String r1 = "votes"
            r16[r2] = r1
            java.lang.String r1 = "vote"
            r16[r3] = r1
            r2 = 38
            X.AhY r1 = new X.AhY
            r1.<init>(r2)
            r17 = 0
            r19 = 1000(0x3e8, double:4.94E-321)
            r13 = r0
            r14 = r9
            r15 = r1
            java.util.ArrayList r1 = r13.A08(r14, r15, r16, r17, r19)
            if (r1 == 0) goto L_0x0716
            r0 = 4
            X.9DM r5 = new X.9DM
            r5.<init>((X.C29621ca) r9, (java.util.List) r1, (int) r0)
        L_0x0716:
            X.2Q7 r0 = new X.2Q7
            r10 = r0
            r11 = r9
            r13 = r4
            r14 = r5
            r15 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            X.9DM r1 = new X.9DM
            r1.<init>((X.C29621ca) r9, (X.AnonymousClass2Q7) r0)
            return r1
        L_0x0726:
            r2 = 0
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r4 = "message"
            boolean r5 = r0.A09(r9, r4)
            r1 = 0
            if (r5 == 0) goto L_0x0a70
            boolean r5 = r0.A09(r9, r4)
            if (r5 == 0) goto L_0x0a70
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.String r5 = "server_id"
            r7[r2] = r5
            java.lang.Class r10 = java.lang.Long.TYPE
            r5 = 99
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            r5 = 2147476647(0x7fffe4a7, double:1.0609944365E-314)
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            r8 = r0
            r13 = r1
            r14 = r7
            r15 = r2
            java.lang.Object r5 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 == 0) goto L_0x0a70
            long r19 = r5.longValue()
            boolean r5 = r0.A09(r9, r4)
            r18 = 0
            if (r5 == 0) goto L_0x07bd
            r6 = 2
            java.lang.String[] r7 = new java.lang.String[r6]
            java.lang.String r8 = "reaction"
            r7[r2] = r8
            java.lang.String r5 = "code"
            r7[r3] = r5
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.C108975cc.A0X()
            java.lang.Long r14 = X.AnonymousClass8BV.A0f()
            r10 = r0
            r11 = r9
            r15 = r1
            r16 = r7
            r17 = r2
            java.lang.Object r7 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x07bd
            java.lang.String[] r5 = new java.lang.String[r6]
            r5[r2] = r8
            java.lang.String r1 = "t"
            r5[r3] = r1
            java.lang.Number r1 = X.AnonymousClass8BY.A0T(r9, r0, r5)
            if (r1 == 0) goto L_0x07bd
            long r14 = r1.longValue()
            java.lang.String[] r6 = new java.lang.String[r3]
            r6[r2] = r8
            r5 = 36
            X.AhY r1 = new X.AhY
            r1.<init>(r5)
            java.util.ArrayList r1 = X.AnonymousClass8BU.A0u(r9, r0, r1, r6)
            if (r1 == 0) goto L_0x07bd
            X.1ca r11 = X.AnonymousClass8BR.A0m(r1, r2)
            if (r11 == 0) goto L_0x07bd
            X.9DC r18 = new X.9DC
            r10 = r18
            r12 = r9
            r13 = r7
            r10.<init>((X.C29621ca) r11, (X.C29621ca) r12, (java.lang.String) r13, (long) r14)
        L_0x07bd:
            boolean r1 = r0.A09(r9, r4)
            r17 = 0
            if (r1 == 0) goto L_0x0816
            r5 = 2
            java.lang.String[] r4 = new java.lang.String[r5]
            java.lang.String r6 = "votes"
            r4[r2] = r6
            java.lang.String r1 = "t"
            r4[r3] = r1
            java.lang.Number r1 = X.AnonymousClass8BY.A0T(r9, r0, r4)
            if (r1 == 0) goto L_0x0816
            long r25 = r1.longValue()
            java.lang.String[] r4 = new java.lang.String[r5]
            r4[r2] = r6
            java.lang.String r1 = "vote"
            r4[r3] = r1
            r5 = 39
            X.AhY r1 = new X.AhY
            r1.<init>(r5)
            r12 = 0
            r14 = 1000(0x3e8, double:4.94E-321)
            r8 = r0
            r10 = r1
            r11 = r4
            java.util.ArrayList r24 = r8.A08(r9, r10, r11, r12, r14)
            if (r24 == 0) goto L_0x0816
            java.lang.String[] r4 = new java.lang.String[r3]
            r4[r2] = r6
            r3 = 40
            X.AhY r1 = new X.AhY
            r1.<init>(r3)
            java.util.ArrayList r0 = X.AnonymousClass8BU.A0u(r9, r0, r1, r4)
            if (r0 == 0) goto L_0x0816
            X.1ca r22 = X.AnonymousClass8BR.A0m(r0, r2)
            if (r22 == 0) goto L_0x0816
            X.9DF r17 = new X.9DF
            r21 = r17
            r23 = r9
            r21.<init>((X.C29621ca) r22, (X.C29621ca) r23, (java.util.List) r24, (long) r25)
        L_0x0816:
            X.9DF r0 = new X.9DF
            r15 = r0
            r16 = r9
            r15.<init>((X.C29621ca) r16, (X.AnonymousClass9DF) r17, (X.AnonymousClass9DC) r18, (long) r19)
            X.9DM r1 = new X.9DM
            r1.<init>((X.C29621ca) r9, (X.AnonymousClass9DF) r0)
            return r1
        L_0x0824:
            r15 = 0
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "reaction"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r14 = X.AnonymousClass8BS.A1S(r3)
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Long r11 = X.C108975cc.A0X()
            java.lang.Long r12 = X.AnonymousClass8BV.A0f()
            r8 = r0
            r13 = r1
            java.lang.Object r4 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0a70
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r2 = "count"
            r3[r15] = r2
            java.lang.Class r10 = java.lang.Long.TYPE
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            r14 = r3
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0a70
            long r6 = r0.longValue()
            r5 = 16
            X.9D6 r1 = new X.9D6
            r2 = r1
            r3 = r9
            r2.<init>(r3, r4, r5, r6)
            return r1
        L_0x086d:
            r15 = 0
            boolean r4 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "vote"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.String r2 = "count"
            r3[r15] = r2
            java.lang.Class r10 = java.lang.Long.TYPE
            java.lang.Long r11 = X.C108975cc.A0X()
            java.lang.Long r12 = X.AnonymousClass8BU.A0j()
            r8 = r0
            r13 = r1
            r14 = r3
            java.lang.Object r2 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0a70
            long r2 = r2.longValue()
            java.lang.String[] r14 = X.AnonymousClass8BS.A1V(r4)
            java.lang.Long r11 = X.AnonymousClass8BV.A0d()
            java.lang.Class<byte[]> r10 = byte[].class
            r12 = r11
            java.lang.Object r0 = r8.A04(r9, r10, r11, r12, r13, r14)
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x0a70
            X.9DK r1 = new X.9DK
            r1.<init>((X.C29621ca) r9, (byte[]) r0, (long) r2)
            return r1
        L_0x08b3:
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "vote"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r8 = X.AnonymousClass8BS.A1V(r3)
            java.lang.Long r5 = X.AnonymousClass8BV.A0d()
            java.lang.Class<byte[]> r4 = byte[].class
            r2 = r0
            r3 = r9
            r6 = r5
            r7 = r1
            java.lang.Object r2 = r2.A04(r3, r4, r5, r6, r7, r8)
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L_0x0a70
            r0 = 3
            X.9DM r1 = new X.9DM
            r1.<init>((X.C29621ca) r9, (byte[]) r2, (int) r0)
            return r1
        L_0x08dd:
            r4 = 0
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "item"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r2 = X.AnonymousClass8BS.A1Z(r3, r4)
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass8BY.A0L(r9, r0, r2)
            if (r0 == 0) goto L_0x0a70
            X.9DM r1 = new X.9DM
            r1.<init>((com.whatsapp.jid.UserJid) r0, (X.C29621ca) r9)
            return r1
        L_0x08fb:
            r5 = 0
            boolean r4 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "status_msgs"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.String r2 = "count"
            r3[r5] = r2
            java.lang.Number r2 = X.AnonymousClass8BY.A0T(r9, r0, r3)
            if (r2 == 0) goto L_0x0a70
            long r2 = r2.longValue()
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.String r4 = "item"
            r6[r5] = r4
            r5 = 41
            X.AhY r4 = new X.AhY
            r4.<init>(r5)
            java.util.ArrayList r0 = X.AnonymousClass8BX.A0l(r9, r0, r4, r6)
            if (r0 == 0) goto L_0x0a70
            X.9DK r1 = new X.9DK
            r1.<init>((X.C29621ca) r9, (java.util.List) r0, (long) r2)
            return r1
        L_0x0932:
            r15 = 0
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "notifications"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r2 = "count"
            r4[r15] = r2
            java.lang.Class r10 = java.lang.Long.TYPE
            java.lang.Long r11 = X.C17890vO.A0L()
            r2 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
        L_0x0951:
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            r8 = r0
            r13 = r1
            r14 = r4
            java.lang.Object r0 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            X.9CX r1 = X.AnonymousClass8BX.A0S(r9, r0)
            return r1
        L_0x0961:
            r5 = 0
            boolean r4 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "status_info"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            r2 = 5
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.String r2 = "APPROVED"
            r6[r5] = r2
            java.lang.String r2 = "NO_REVIEW"
            r6[r4] = r2
            java.lang.String r2 = "OUTDATED"
            r7 = 2
            r6[r7] = r2
            r3 = 3
            java.lang.String r2 = "PENDING"
            r6[r3] = r2
            r3 = 4
            java.lang.String r2 = "REJECTED"
            java.util.List r6 = X.C18070vi.A0O(r2, r6, r3)
            java.lang.String[] r3 = new java.lang.String[r7]
            java.lang.String r2 = "status"
            X.AnonymousClass8BR.A1K(r3, r5, r4, r2)
            java.lang.String r12 = r0.A07(r9, r6, r3)
            if (r12 == 0) goto L_0x0a70
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r1 = "can_appeal"
            r2[r5] = r1
            r1 = 49
            java.lang.Object r3 = A00(r9, r0, r2, r1)
            X.9Cb r3 = (X.C178169Cb) r3
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r1 = "reject_reason"
            r2[r5] = r1
            X.9Cb r10 = X.C21288AhZ.A00(r9, r0, r2, r5)
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r1 = "commerce_url"
            r2[r5] = r1
            X.9Cb r11 = X.C21288AhZ.A00(r9, r0, r2, r4)
            X.9D8 r1 = new X.9D8
            r7 = r1
            r8 = r9
            r9 = r3
            r7.<init>((X.C29621ca) r8, (X.C178169Cb) r9, (X.C178169Cb) r10, (X.C178169Cb) r11, (java.lang.String) r12)
            return r1
        L_0x09c3:
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "description"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r8 = X.AnonymousClass8BS.A1V(r3)
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2 = 0
            goto L_0x09f5
        L_0x09d9:
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "url"
            goto L_0x09e6
        L_0x09e0:
            boolean r3 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "shimmed_url"
        L_0x09e6:
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r8 = X.AnonymousClass8BS.A1V(r3)
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2 = 1
        L_0x09f5:
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            java.lang.Long r6 = X.AnonymousClass8BU.A0j()
            r2 = r0
            r3 = r9
            r7 = r1
            java.lang.Object r0 = r2.A04(r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0a6a
            return r1
        L_0x0a09:
            r6 = 0
            boolean r5 = X.C18070vi.A17(r9, r0)
            java.lang.String r3 = "sale_price"
            boolean r2 = r0.A09(r9, r3)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            boolean r2 = r0.A09(r9, r3)
            if (r2 == 0) goto L_0x0a70
            java.lang.String[] r3 = X.C17880vN.A1Z()
            java.lang.String r2 = "price"
            r3[r6] = r2
            java.lang.String r4 = X.AnonymousClass8BY.A0X(r9, r0, r3, r5)
            if (r4 == 0) goto L_0x0a70
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.String r1 = "start_date"
            r2[r6] = r1
            r1 = 24
            X.9Cb r3 = X.C21288AhZ.A00(r9, r0, r2, r1)
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.String r1 = "end_date"
            r2[r6] = r1
            r1 = 25
            X.9Cb r1 = X.C21288AhZ.A00(r9, r0, r2, r1)
            X.9DI r0 = new X.9DI
            r0.<init>((X.C29621ca) r9, (X.C178169Cb) r3, (X.C178169Cb) r1, (java.lang.String) r4)
            X.9DM r1 = new X.9DM
            r1.<init>((X.C29621ca) r9, (X.AnonymousClass9DI) r0)
            return r1
        L_0x0a4e:
            boolean r4 = X.C18070vi.A17(r9, r0)
            java.lang.String r1 = "can_appeal"
            boolean r2 = r0.A09(r9, r1)
            r1 = 0
            if (r2 == 0) goto L_0x0a70
            java.util.List r3 = X.AnonymousClass8BX.A0n(r4)
            java.lang.String[] r2 = X.AnonymousClass8BS.A1V(r4)
            java.lang.String r0 = r0.A07(r9, r3, r2)
            if (r0 != 0) goto L_0x0a6a
            return r1
        L_0x0a6a:
            X.9Cb r1 = new X.9Cb
            r1.<init>(r9, r0)
            return r1
        L_0x0a70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21287AhY.BCF(X.1ca, X.2rm):java.lang.Object");
    }
}
