package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8od  reason: invalid class name and case insensitive filesystem */
public final class C170038od extends AnonymousClass1KF {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public void A03(C20942Abw abw, UserJid userJid) {
    }

    public void A05(UserJid userJid, long j) {
    }

    public void A02() {
        BCT bct = (BCT) C18070vi.A0E(this.A01);
        C18070vi.A0d(bct, 0);
        C147047Rp r1 = new C147047Rp(AnonymousClass1b2.A09(new C22181Ayx((C199259zh) this.A00.get()), C29431cG.A0V(bct.BMq())));
        while (r1.hasNext()) {
            bct.BIF(((C46132Da) r1.next()).A02.A00);
        }
    }

    public final void A08(UserJid userJid, String str) {
        AnonymousClass9MJ A012 = ((C199259zh) this.A00.get()).A01((BCT) C18070vi.A0E(this.A01), userJid);
        if (A012 instanceof C170088oi) {
            AnonymousClass8ob r4 = (AnonymousClass8ob) this.A02.get();
            C46132Da r3 = ((C170088oi) A012).A00;
            AnonymousClass00H r1 = r4.A00;
            if (((C194339rZ) r1.get()).A02(r3, 1) && ((C198929z9) r4.A01.get()).A01(str)) {
                AnonymousClass1D6 A002 = ((C194339rZ) r1.get()).A00(r3);
                AnonymousClass8ob.A00(r4, (String) A002.first, 1, AnonymousClass000.A1Y(A002.second));
            }
        }
    }

    public C170038od(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public void A04(UserJid userJid) {
        UserJid A002 = C22941Dw.A00(userJid);
        if (A002 != null) {
            C199259zh r6 = (C199259zh) this.A00.get();
            BCT bct = (BCT) C18070vi.A0E(this.A01);
            C18070vi.A0d(bct, 1);
            AnonymousClass9MI A003 = C199259zh.A00((AnonymousClass8oP) null, bct, A002);
            if (A003 instanceof C170078oh) {
                return;
            }
            if (A003 instanceof C170068og) {
                C170068og r1 = (C170068og) A003;
                AnonymousClass8oP r5 = r1.A01;
                r6.A00.get();
                C196189ub r12 = r1.A00;
                C18070vi.A0d(r12, 0);
                C191859nJ A004 = r12.A00();
                A004.A01 = true;
                C46132Da r2 = new C46132Da(A004.A00(), r5, System.currentTimeMillis());
                C194339rZ r13 = (C194339rZ) r6.A01.get();
                if (C198929z9.A00(r13.A00) && r13.A01(r2)) {
                    bct.CGg(r2);
                    return;
                }
                return;
            }
            throw AnonymousClass3MW.A14();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.AnonymousClass206 r13) {
        /*
            r12 = this;
            com.whatsapp.jid.UserJid r7 = X.AnonymousClass8BT.A0K(r13)
            if (r7 == 0) goto L_0x0089
            X.00H r0 = r12.A00
            java.lang.Object r2 = r0.get()
            X.9zh r2 = (X.C199259zh) r2
            X.AcA r0 = X.AnonymousClass9RV.A00(r13)
            r9 = 0
            if (r0 == 0) goto L_0x00fe
            java.lang.String r8 = r0.A00
        L_0x0017:
            X.AcA r0 = X.AnonymousClass9RV.A00(r13)
            if (r0 == 0) goto L_0x001f
            java.lang.String r9 = r0.A01
        L_0x001f:
            X.00H r0 = r12.A01
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.BCT r3 = (X.BCT) r3
            r0 = 3
            X.C18070vi.A0d(r3, r0)
            X.00H r5 = r2.A01
            java.lang.Object r0 = r5.get()
            X.9rZ r0 = (X.C194339rZ) r0
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.9z9 r0 = (X.C198929z9) r0
            X.0ve r1 = r0.A00
            r0 = 10303(0x283f, float:1.4438E-41)
            org.json.JSONObject r6 = r1.A0J(r0)
            java.lang.String r0 = "store_consented_token_enabled"
            r4 = 0
            boolean r0 = r6.optBoolean(r0, r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "store_non_consented_token_enabled"
            boolean r0 = r6.optBoolean(r0, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.1D6 r6 = X.AnonymousClass1D6.A01(r1, r0)
            java.lang.Object r0 = r6.first
            boolean r4 = X.AnonymousClass000.A1Y(r0)
            if (r4 != 0) goto L_0x008a
            java.lang.Object r0 = r6.second
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x008a
        L_0x006c:
            X.8oj r3 = X.C170098oj.A00
        L_0x006e:
            boolean r0 = r3 instanceof X.C170088oi
            if (r0 == 0) goto L_0x0089
            X.00H r0 = r12.A03
            boolean r0 = X.C198929z9.A00(r0)
            if (r0 == 0) goto L_0x0089
            X.00H r0 = r12.A02
            java.lang.Object r1 = r0.get()
            X.9j7 r1 = (X.AnonymousClass9j7) r1
            X.8oi r3 = (X.C170088oi) r3
            X.2Da r0 = r3.A00
            X.AnonymousClass8BY.A0w(r1, r0, r13)
        L_0x0089:
            return
        L_0x008a:
            r1 = 0
            if (r4 != 0) goto L_0x008e
            r8 = r1
        L_0x008e:
            java.lang.Object r0 = r6.second
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x0097
            r9 = r1
        L_0x0097:
            long r10 = java.lang.System.currentTimeMillis()
            X.8oP r6 = new X.8oP
            r6.<init>(r7, r8, r9, r10)
            X.9MI r1 = X.C199259zh.A00(r6, r3, r7)
            boolean r0 = r1 instanceof X.C170078oh
            if (r0 != 0) goto L_0x006c
            boolean r0 = r1 instanceof X.C170068og
            if (r0 == 0) goto L_0x0101
            X.8og r1 = (X.C170068og) r1
            X.8oP r6 = r1.A01
            X.00H r0 = r2.A00
            r0.get()
            X.9ub r1 = r1.A00
            boolean r0 = r1.A02
            r2 = 1
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x00f8
            int r0 = r1.A00
        L_0x00c2:
            X.9nJ r1 = r1.A00()
            r1.A00 = r0
            r1.A0A = r2
            r0 = 0
            r1.A02 = r0
            X.9ub r4 = r1.A00()
            long r0 = java.lang.System.currentTimeMillis()
            X.2Da r2 = new X.2Da
            r2.<init>(r4, r6, r0)
            java.lang.Object r1 = r5.get()
            X.9rZ r1 = (X.C194339rZ) r1
            X.00H r0 = r1.A00
            boolean r0 = X.C198929z9.A00(r0)
            if (r0 == 0) goto L_0x006c
            boolean r0 = r1.A01(r2)
            if (r0 == 0) goto L_0x006c
            r3.CGg(r2)
            X.8oi r3 = new X.8oi
            r3.<init>(r2)
            goto L_0x006e
        L_0x00f8:
            int r0 = r1.A00
            int r0 = r0 + 1
            r2 = 0
            goto L_0x00c2
        L_0x00fe:
            r8 = r9
            goto L_0x0017
        L_0x0101:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170038od.A06(X.206):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AnonymousClass206 r8) {
        /*
            r7 = this;
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass8BT.A0K(r8)
            if (r1 == 0) goto L_0x008f
            X.00H r0 = r7.A00
            java.lang.Object r6 = r0.get()
            X.9zh r6 = (X.C199259zh) r6
            X.00H r0 = r7.A01
            java.lang.Object r4 = X.C18070vi.A0E(r0)
            X.BCT r4 = (X.BCT) r4
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            r0 = 0
            X.9MI r1 = X.C199259zh.A00(r0, r4, r1)
            boolean r0 = r1 instanceof X.C170078oh
            if (r0 != 0) goto L_0x0090
            boolean r0 = r1 instanceof X.C170068og
            if (r0 == 0) goto L_0x0093
            X.8og r1 = (X.C170068og) r1
            X.8oP r5 = r1.A01
            X.00H r0 = r6.A00
            r0.get()
            X.9ub r1 = r1.A00
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            boolean r0 = r1.A02
            int r2 = r1.A00
            boolean r0 = X.AnonymousClass000.A1O(r0)
            X.9nJ r1 = r1.A00()
            r1.A00 = r2
            r1.A0A = r0
            r0 = 1
            r1.A02 = r0
            X.9ub r3 = r1.A00()
            long r0 = java.lang.System.currentTimeMillis()
            X.2Da r2 = new X.2Da
            r2.<init>(r3, r5, r0)
            X.00H r0 = r6.A01
            java.lang.Object r1 = r0.get()
            X.9rZ r1 = (X.C194339rZ) r1
            X.00H r0 = r1.A00
            boolean r0 = X.C198929z9.A00(r0)
            if (r0 == 0) goto L_0x0090
            boolean r0 = r1.A01(r2)
            if (r0 == 0) goto L_0x0090
            r4.CGg(r2)
            X.8oi r3 = new X.8oi
            r3.<init>(r2)
        L_0x0074:
            boolean r0 = r3 instanceof X.C170088oi
            if (r0 == 0) goto L_0x008f
            X.00H r0 = r7.A03
            boolean r0 = X.C198929z9.A00(r0)
            if (r0 == 0) goto L_0x008f
            X.00H r0 = r7.A02
            java.lang.Object r1 = r0.get()
            X.9j7 r1 = (X.AnonymousClass9j7) r1
            X.8oi r3 = (X.C170088oi) r3
            X.2Da r0 = r3.A00
            X.AnonymousClass8BY.A0w(r1, r0, r8)
        L_0x008f:
            return
        L_0x0090:
            X.8oj r3 = X.C170098oj.A00
            goto L_0x0074
        L_0x0093:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170038od.A07(X.206):void");
    }
}
