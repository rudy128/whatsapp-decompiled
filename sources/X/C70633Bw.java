package X;

/* renamed from: X.3Bw  reason: invalid class name and case insensitive filesystem */
public class C70633Bw implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70633Bw(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0380, code lost:
        r0 = new X.C70633Bw(r4, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0385, code lost:
        r2.post(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0388, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0834, code lost:
        if (r6.A2R.A0y(r1) == false) goto L_0x0836;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x088a, code lost:
        r4.A0J(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x088d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r41 = this;
            r5 = r41
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0242;
                case 1: goto L_0x07df;
                case 2: goto L_0x0221;
                case 3: goto L_0x0796;
                case 4: goto L_0x0780;
                case 5: goto L_0x086e;
                case 6: goto L_0x0763;
                case 7: goto L_0x0205;
                case 8: goto L_0x074c;
                case 9: goto L_0x01da;
                case 10: goto L_0x07f6;
                case 11: goto L_0x0672;
                case 12: goto L_0x0666;
                case 13: goto L_0x0658;
                case 14: goto L_0x0628;
                case 15: goto L_0x01a6;
                case 16: goto L_0x05f4;
                case 17: goto L_0x05d3;
                case 18: goto L_0x0175;
                case 19: goto L_0x0158;
                case 20: goto L_0x0158;
                case 21: goto L_0x05c5;
                case 22: goto L_0x05b7;
                case 23: goto L_0x056f;
                case 24: goto L_0x053e;
                case 25: goto L_0x04d9;
                case 26: goto L_0x013a;
                case 27: goto L_0x04be;
                case 28: goto L_0x0468;
                case 29: goto L_0x045c;
                case 30: goto L_0x0450;
                case 31: goto L_0x00d8;
                case 32: goto L_0x0435;
                case 33: goto L_0x00bc;
                case 34: goto L_0x0423;
                case 35: goto L_0x040d;
                case 36: goto L_0x040d;
                case 37: goto L_0x03f0;
                case 38: goto L_0x03e2;
                case 39: goto L_0x0019;
                case 40: goto L_0x03a1;
                case 41: goto L_0x0007;
                case 42: goto L_0x0395;
                case 43: goto L_0x0389;
                case 44: goto L_0x0007;
                case 45: goto L_0x0374;
                case 46: goto L_0x0007;
                case 47: goto L_0x0007;
                case 48: goto L_0x026c;
                case 49: goto L_0x025e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r5.A01
            X.1TD r0 = (X.AnonymousClass1TD) r0
            java.lang.Object r2 = r5.A02
            X.00H r0 = r0.A0F
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 34
            X.C17890vO.A0r(r1, r2, r0)
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r7 = r5.A01
            X.4pj r7 = (X.C97594pj) r7
            java.lang.Object r3 = r5.A02
            X.4Ox r3 = (X.C85834Ox) r3
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x0018
            X.1OZ r6 = r7.A08
            java.lang.String r9 = r6.A0B()
            java.util.concurrent.ConcurrentMap r0 = r7.A01
            r0.put(r9, r3)
            java.lang.String r0 = "iq"
            X.1cX r5 = new X.1cX
            r5.<init>((java.lang.String) r0)
            java.lang.String r0 = "id"
            X.C29591cX.A01(r5, r0, r9)
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C29591cX.A01(r5, r1, r0)
            java.lang.String r2 = "to"
            X.8v4 r1 = X.C173438v4.A00
            X.1MD r0 = new X.1MD
            r0.<init>((com.whatsapp.jid.Jid) r1, (java.lang.String) r2)
            r5.A04(r0)
            java.lang.String r1 = "smax_id"
            java.lang.String r0 = "4"
            X.C29591cX.A01(r5, r1, r0)
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "fb:thrift_iq"
            X.C29591cX.A01(r5, r1, r0)
            java.lang.String r2 = r3.A02
            java.lang.String r1 = "account_number"
            r4 = 0
            X.1ca r0 = new X.1ca
            r0.<init>((java.lang.String) r1, (java.lang.String) r2, (X.AnonymousClass1MD[]) r4)
            r5.A05(r0)
            java.lang.String r2 = "code"
            java.lang.String r1 = r3.A01
            X.1ca r0 = new X.1ca
            r0.<init>((java.lang.String) r2, (java.lang.String) r1, (X.AnonymousClass1MD[]) r4)
            r5.A05(r0)
            java.lang.String r2 = "expected_source_url"
            java.lang.String r1 = r3.A03
            X.1ca r0 = new X.1ca
            r0.<init>((java.lang.String) r2, (java.lang.String) r1, (X.AnonymousClass1MD[]) r4)
            r5.A05(r0)
            r0 = 1
            X.1MD[] r4 = new X.AnonymousClass1MD[r0]
            java.lang.String r1 = "support_icebreakers"
            java.lang.String r0 = "true"
            boolean r2 = X.C17890vO.A1W(r1, r0, r4)
            java.lang.String r1 = "feature"
            X.1ca r0 = new X.1ca
            r0.<init>(r1, r4)
            r5.A05(r0)
            X.1ca r8 = r5.A03()
            r11 = 0
            r10 = 246(0xf6, float:3.45E-43)
            boolean r0 = r6.A0N(r7, r8, r9, r10, r11)
            if (r0 != 0) goto L_0x0018
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x07eb
            r7.A03 = r2
            X.1KB r4 = r7.A04
            r0 = 37
            X.3Bw r2 = new X.3Bw
            r2.<init>(r7, r3, r0)
            goto L_0x088a
        L_0x00bc:
            java.lang.Object r1 = r5.A01
            X.3An r1 = (X.C70303An) r1
            java.lang.Object r0 = r5.A02
            X.9Bw r0 = (X.C178119Bw) r0
            X.4cT r2 = r0.A04
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0018
            X.00H r0 = r1.A01
            java.lang.Object r1 = r0.get()
            X.1KF r1 = (X.AnonymousClass1KF) r1
            com.whatsapp.jid.UserJid r0 = r2.A01
            r1.A04(r0)
            return
        L_0x00d8:
            java.lang.Object r2 = r5.A01
            X.4Zz r2 = (X.C88504Zz) r2
            java.lang.Object r4 = r5.A02
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.00H r0 = r2.A08
            java.lang.Object r0 = r0.get()
            X.1eS r0 = (X.C30751eS) r0
            X.8oR r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x0018
            X.0vl r0 = r2.A09
            java.lang.Object r0 = r0.getValue()
            X.9mb r0 = (X.C191439mb) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x010c
            X.4aI r3 = r2.A00
            boolean r0 = X.C18020vd.A04(r3)
            if (r0 == 0) goto L_0x0018
            r2 = 0
            r1 = 30
        L_0x0107:
            r0 = 1
            X.C88654aI.A03(r3, r4, r2, r1, r0)
            return
        L_0x010c:
            X.6pP r1 = r2.A04
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0122
            X.4aI r3 = r2.A00
            boolean r0 = X.C18020vd.A04(r3)
            if (r0 == 0) goto L_0x0018
            r2 = 0
            r1 = 31
            goto L_0x0107
        L_0x0122:
            boolean r1 = X.C88504Zz.A01(r2, r4)
            X.4aI r3 = r2.A00
            boolean r0 = X.C18020vd.A04(r3)
            if (r1 == 0) goto L_0x0134
            if (r0 == 0) goto L_0x0018
            r2 = 0
            r1 = 40
            goto L_0x0107
        L_0x0134:
            if (r0 == 0) goto L_0x0018
            r2 = 0
            r1 = 32
            goto L_0x0107
        L_0x013a:
            java.lang.Object r3 = r5.A01
            X.Aiu r3 = (X.C21365Aiu) r3
            java.lang.Object r2 = r3.A02
            X.2fS r2 = (X.C55242fS) r2
            int r1 = r2.A00
            int r0 = r3.A01
            if (r1 != r0) goto L_0x0018
            java.lang.Object r0 = r3.A03
            X.1IX r0 = (X.AnonymousClass1IX) r0
            java.lang.Object r1 = r5.A02
            X.Cl4 r1 = (X.C25734Cl4) r1
            r2.A01 = r0
            X.1uj r0 = r2.A03
            r1.A01(r0)
            return
        L_0x0158:
            java.lang.Object r1 = r5.A01
            X.2Bu r1 = (X.C45822Bu) r1
            java.lang.Object r0 = r5.A02
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0018
            com.whatsapp.conversationslist.ConversationsFragment r2 = r1.A04
            X.1qw r1 = r2.A1m
            if (r1 == 0) goto L_0x0171
            android.view.View r0 = r2.A09
            r1.CEk(r0)
        L_0x0171:
            r0 = 0
            r2.A09 = r0
            return
        L_0x0175:
            java.lang.Object r8 = r5.A01
            X.1ju r8 = (X.C34091ju) r8
            java.lang.Object r7 = r5.A02
            java.util.List r7 = (java.util.List) r7
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0018
            java.util.Iterator r6 = r7.iterator()
        L_0x0187:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0018
            X.1BI r5 = X.C17880vN.A0Q(r6)
            com.whatsapp.conversationslist.ConversationsFragment r0 = r8.A0Q
            X.1Co r4 = r0.A1u
            r3 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            int r1 = r7.size()
            r0 = 1
            if (r1 > r0) goto L_0x01a2
            r0 = 0
        L_0x01a2:
            r4.A08(r5, r2, r3, r0)
            goto L_0x0187
        L_0x01a6:
            java.lang.Object r7 = r5.A01
            X.1ju r7 = (X.C34091ju) r7
            java.lang.Object r6 = r5.A02
            java.util.AbstractCollection r6 = (java.util.AbstractCollection) r6
            java.util.Iterator r5 = r6.iterator()
        L_0x01b2:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0018
            X.1BI r4 = X.C17880vN.A0Q(r5)
            boolean r0 = X.C22971Dz.A0c(r4)
            if (r0 != 0) goto L_0x01b2
            com.whatsapp.conversationslist.ConversationsFragment r0 = r7.A0Q
            X.00H r0 = r0.A3a
            java.lang.Object r3 = r0.get()
            X.1pz r3 = (X.C37701pz) r3
            X.1i2 r2 = X.C32961i2.CHAT_LIST_SCREEN
            int r1 = r6.size()
            r0 = 1
            if (r1 > r0) goto L_0x01d6
            r0 = 0
        L_0x01d6:
            r3.A01(r4, r2, r0)
            goto L_0x01b2
        L_0x01da:
            java.lang.Object r2 = r5.A01
            com.whatsapp.conversationslist.ConversationsFragment r2 = (com.whatsapp.conversationslist.ConversationsFragment) r2
            java.lang.Object r1 = r5.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1M9 r0 = r2.A18
            X.1E7 r1 = r0.A0E(r1)
            if (r1 == 0) goto L_0x0018
            boolean r0 = r1.A0D()
            if (r0 != 0) goto L_0x01f6
            boolean r0 = r1.A0E()
            if (r0 == 0) goto L_0x0018
        L_0x01f6:
            X.00H r0 = r2.A2l
            java.lang.Object r1 = r0.get()
            X.6mK r1 = (X.C132176mK) r1
            java.lang.Integer r0 = X.C17880vN.A0j()
            r1.A00 = r0
            return
        L_0x0205:
            java.lang.Object r0 = r5.A01
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r3 = r5.A02
            X.1py r3 = (X.C37691py) r3
            java.util.Iterator r2 = r0.iterator()
        L_0x0211:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0018
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.1Co r0 = r3.A04
            r0.A03(r1)
            goto L_0x0211
        L_0x0221:
            java.lang.Object r3 = r5.A01
            X.3TA r3 = (X.AnonymousClass3TA) r3
            java.lang.Object r0 = r5.A02
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            X.7Fe r2 = r3.A00
            if (r2 == 0) goto L_0x0018
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            byte[] r0 = r2.A0M(r0, r1)
            X.C18070vi.A0d(r0, r1)
            r2.A0J = r0
            X.7Fe r1 = r3.A00
            X.4DX r0 = X.AnonymousClass4DX.SMALL_THUMBNAIL_LOADED
            X.AnonymousClass3TA.A03(r1, r3, r0)
            return
        L_0x0242:
            java.lang.Object r4 = r5.A01
            X.3TA r4 = (X.AnonymousClass3TA) r4
            java.lang.Object r3 = r5.A02
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.7Fe r0 = r4.A00
            if (r0 == 0) goto L_0x0018
            X.1Ty r2 = r4.A0S
            java.lang.String r1 = r2.A09(r3)
            if (r1 == 0) goto L_0x07ef
            X.7Fe r0 = r4.A00
            r0.A0A = r1
            X.AnonymousClass3TA.A05(r4, r3)
            return
        L_0x025e:
            java.lang.Object r4 = r5.A01
            X.1TD r4 = (X.AnonymousClass1TD) r4
            java.lang.Object r3 = r5.A02
            X.1Q2 r0 = r4.A07
            android.os.Handler r2 = r0.A02
            r1 = 41
            goto L_0x0380
        L_0x026c:
            java.lang.Object r7 = r5.A01
            X.1TD r7 = (X.AnonymousClass1TD) r7
            java.lang.Object r6 = r5.A02
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r16 = r6.iterator()
        L_0x027c:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0369
            java.lang.Object r4 = r16.next()
            X.9Bw r4 = (X.C178119Bw) r4
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x0323
            X.22J r1 = r4.A03
            boolean r0 = r1 instanceof X.AnonymousClass22K
            X.1TB r3 = r7.A04
            if (r0 == 0) goto L_0x0320
            boolean r1 = X.AnonymousClass000.A1W(r1)
            java.lang.String r0 = "not a legacy/v1 call log"
            X.C17960vV.A0G(r1, r0)
            java.util.ArrayList r0 = r4.A0B()
            int r0 = r0.size()
            java.util.ArrayList r2 = X.C17880vN.A0z(r0)
            java.util.ArrayList r0 = r4.A0B()
            java.util.Iterator r11 = r0.iterator()
        L_0x02b1:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x02cc
            java.lang.Object r0 = r11.next()
            X.9Bv r0 = (X.C178109Bv) r0
            com.whatsapp.jid.UserJid r10 = r0.A00
            int r9 = r0.A01
            r0 = -1
            X.9Bv r8 = new X.9Bv
            r8.<init>(r10, r9, r0)
            r2.add(r8)
            goto L_0x02b1
        L_0x02cc:
            X.4cT r0 = r4.A04
            r22 = r0
            long r8 = r4.A01
            boolean r0 = r4.A0J
            r20 = r0
            int r0 = r4.A08
            r19 = r0
            int r0 = r4.A06
            r17 = r0
            X.9Il r23 = r4.A0A()
            long r0 = r4.A0A
            com.whatsapp.jid.GroupJid r15 = r4.A0C
            boolean r14 = r4.A0I
            com.whatsapp.jid.DeviceJid r13 = r4.A02
            java.lang.String r12 = r4.A0G
            X.C178119Bw.A00(r4)
            int r11 = r4.A09
            r18 = 0
            r32 = -1
            r31 = 0
            X.9Bw r10 = new X.9Bw
            r24 = r18
            r25 = r18
            r21 = r18
            r26 = r12
            r27 = r2
            r28 = r19
            r29 = r17
            r30 = r11
            r34 = r8
            r36 = r0
            r38 = r20
            r39 = r31
            r40 = r14
            r17 = r10
            r19 = r13
            r20 = r15
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r38, r39, r40)
            r3.A07(r10)
            goto L_0x0323
        L_0x0320:
            r3.A07(r4)
        L_0x0323:
            X.1TE r0 = r7.A00
            r0.A01(r4)
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            X.4cT r8 = r4.A04
            com.whatsapp.jid.UserJid r0 = r8.A01
            r1.add(r0)
            java.util.HashSet r0 = r4.A0C()
            r1.addAll(r0)
            com.whatsapp.jid.GroupJid r0 = r4.A0C
            if (r0 == 0) goto L_0x0343
            com.whatsapp.jid.GroupJid r0 = r4.A0C
            r1.add(r0)
        L_0x0343:
            java.util.Iterator r4 = r1.iterator()
        L_0x0347:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x027c
            X.1BI r1 = X.C17880vN.A0Q(r4)
            X.1NG r0 = r7.A0B
            X.1BI r3 = r0.A01(r1)
            X.1Q6 r2 = r7.A08
            boolean r1 = r8.A03
            java.lang.String r0 = r8.A02
            java.lang.String r0 = X.C40811vJ.A09(r0)
            X.205 r0 = X.AnonymousClass205.A01(r3, r0, r1)
            r2.A0C(r0)
            goto L_0x0347
        L_0x0369:
            X.1Q2 r0 = r7.A07
            android.os.Handler r2 = r0.A01
            r1 = 3
            X.3C4 r0 = new X.3C4
            r0.<init>(r7, r5, r6, r1)
            goto L_0x0385
        L_0x0374:
            java.lang.Object r4 = r5.A01
            X.1TD r4 = (X.AnonymousClass1TD) r4
            java.lang.Object r3 = r5.A02
            X.1Q2 r0 = r4.A07
            android.os.Handler r2 = r0.A02
            r1 = 44
        L_0x0380:
            X.3Bw r0 = new X.3Bw
            r0.<init>(r4, r3, r1)
        L_0x0385:
            r2.post(r0)
            return
        L_0x0389:
            java.lang.Object r1 = r5.A01
            X.1TD r1 = (X.AnonymousClass1TD) r1
            java.lang.Object r0 = r5.A02
            X.9Bw r0 = (X.C178119Bw) r0
            X.AnonymousClass1TD.A00(r1, r0)
            return
        L_0x0395:
            java.lang.Object r1 = r5.A01
            X.1TD r1 = (X.AnonymousClass1TD) r1
            java.lang.Object r0 = r5.A02
            X.4cT r0 = (X.C89444cT) r0
            X.AnonymousClass1TD.A03(r1, r0)
            return
        L_0x03a1:
            java.lang.Object r0 = r5.A01
            X.1Vt r0 = (X.C27351Vt) r0
            java.lang.Object r3 = r5.A02
            X.1Ug r3 = (X.C26981Ug) r3
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.9j8 r0 = (X.AnonymousClass9j8) r0
            java.util.Map r1 = r0.A00
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.util.Iterator r1 = X.C17890vO.A0j(r0)
        L_0x03bc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03e0
            java.lang.Object r0 = r1.next()
            X.9lA r0 = (X.C190569lA) r0
            int r2 = r0.A00
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 < r0) goto L_0x03bc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "getKeyForEncryptedBackupWithFuture/received/received/error "
            X.C17900vP.A0k(r0, r1, r2)
            r0 = 0
        L_0x03d8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.BrF(r0)
            return
        L_0x03e0:
            r0 = 1
            goto L_0x03d8
        L_0x03e2:
            java.lang.Object r0 = r5.A01
            X.4pj r0 = (X.C97594pj) r0
            java.lang.Object r1 = r5.A02
            X.4VG r1 = (X.AnonymousClass4VG) r1
            X.3Lq r0 = r0.A07
            r0.C7H(r1)
            return
        L_0x03f0:
            java.lang.Object r3 = r5.A01
            X.4pj r3 = (X.C97594pj) r3
            java.lang.Object r2 = r5.A02
            X.1Rd r1 = r3.A00
            if (r1 == 0) goto L_0x03ff
            X.1Hc r0 = r3.A05
            r0.unregisterObserver(r1)
        L_0x03ff:
            r0 = 1
            X.2xD r1 = new X.2xD
            r1.<init>(r2, r3, r0)
            r3.A00 = r1
            X.1Hc r0 = r3.A05
            r0.A00(r1)
            return
        L_0x040d:
            java.lang.Object r0 = r5.A01
            X.1eS r0 = (X.C30751eS) r0
            java.lang.Object r2 = r5.A02
            X.8oT r2 = (X.AnonymousClass8oT) r2
            X.00H r0 = r0.A04
            java.lang.Object r1 = r0.get()
            X.A5S r1 = (X.A5S) r1
            com.whatsapp.jid.UserJid r0 = r2.A00
            r1.A06(r0)
            return
        L_0x0423:
            java.lang.Object r0 = r5.A01
            X.2dn r0 = (X.C54222dn) r0
            java.lang.Object r1 = r5.A02
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.A5S r0 = (X.A5S) r0
            r0.A08(r1)
            return
        L_0x0435:
            java.lang.Object r0 = r5.A01
            X.3An r0 = (X.C70303An) r0
            java.lang.Object r1 = r5.A02
            X.9Bw r1 = (X.C178119Bw) r1
            X.00H r0 = r0.A01
            java.lang.Object r3 = r0.get()
            X.1KF r3 = (X.AnonymousClass1KF) r3
            X.4cT r0 = r1.A04
            com.whatsapp.jid.UserJid r2 = r0.A01
            int r0 = r1.A08
            long r0 = (long) r0
            r3.A05(r2, r0)
            return
        L_0x0450:
            java.lang.Object r1 = r5.A01
            com.whatsapp.crop.CropImageView r1 = (com.whatsapp.crop.CropImageView) r1
            java.lang.Object r0 = r5.A02
            X.4Yn r0 = (X.C88154Yn) r0
            r1.A08(r0)
            return
        L_0x045c:
            java.lang.Object r1 = r5.A01
            com.whatsapp.crop.CropImage r1 = (com.whatsapp.crop.CropImage) r1
            java.lang.Object r0 = r5.A02
            X.4MX r0 = (X.AnonymousClass4MX) r0
            r1.A3T(r0)
            return
        L_0x0468:
            java.lang.Object r3 = r5.A01
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r4 = r5.A02
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.String r0 = r4.getMessage()
            r5 = 0
            if (r0 == 0) goto L_0x04a8
            java.lang.String r1 = r4.getMessage()
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x04a8
            java.lang.String r0 = "CropImage/activityRes/no-space"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "no-space"
            r0 = 1
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "error_message_id"
            r0 = 2131889993(0x7f120f49, float:1.9414665E38)
        L_0x0498:
            android.content.Intent r0 = r2.putExtra(r1, r0)
            r3.setResult(r5, r0)
            java.lang.String r0 = "CropImage/CropImage"
            com.whatsapp.util.Log.e(r0, r4)
            r3.finish()
            return
        L_0x04a8:
            java.lang.String r0 = "CropImage/activityRes/fail/load-image"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = "io-error"
            r0 = 1
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "error_message_id"
            r0 = 2131889981(0x7f120f3d, float:1.941464E38)
            goto L_0x0498
        L_0x04be:
            java.lang.Object r1 = r5.A01
            X.190 r1 = (X.AnonymousClass190) r1
            java.lang.Object r3 = r5.A02
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r0 = "log_files_upload"
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r0)
            r4 = 0
            r5 = 1
            r7 = r5
            r6 = r5
            r1.A0I(r2, r3, r4, r5, r6, r7)
            return
        L_0x04d9:
            java.lang.Object r6 = r5.A01
            X.1tv r6 = (X.C39961tv) r6
            java.lang.Object r1 = r5.A02
            boolean r0 = r6 instanceof X.C39981tx
            if (r0 == 0) goto L_0x0518
            X.1tx r6 = (X.C39981tx) r6
            X.1tf r1 = (X.C39801tf) r1
            X.1tg r0 = r6.A03
            r0.A03(r6)
            X.1rd r4 = r6.A00
            r4.A0K(r1)
            com.whatsapp.conversationslist.ConversationsFragment r3 = r6.A04
            X.00H r0 = r3.A3J
            java.lang.Object r0 = r0.get()
            X.1rX r0 = (X.C38581rX) r0
            X.0ve r2 = r0.A01
            r1 = 8600(0x2198, float:1.2051E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x050f
            X.1tg r1 = r6.A02
            X.1rZ r0 = r6.A01
            r1.A02(r0)
            return
        L_0x050f:
            com.airbnb.lottie.LottieAnimationView r0 = r3.A0P
            r0.setImageDrawable(r4)
            r4.start()
            return
        L_0x0518:
            X.1tw r6 = (X.C39971tw) r6
            X.1tf r1 = (X.C39801tf) r1
            X.1tg r0 = r6.A02
            r0.A03(r6)
            X.1rd r5 = r6.A00
            r5.A0K(r1)
            com.whatsapp.conversationslist.ConversationsFragment r4 = r6.A03
            com.airbnb.lottie.LottieAnimationView r3 = r4.A0P
            X.1rd r2 = r6.A01
            r3.setImageDrawable(r2)
            r0 = 1
            X.5cv r1 = new X.5cv
            r1.<init>(r4, r5, r3, r0)
            X.1rf r0 = r2.A0d
            r0.addListener(r1)
            r2.A07()
            return
        L_0x053e:
            java.lang.Object r1 = r5.A01
            X.1wa r1 = (X.C41531wa) r1
            java.lang.Object r2 = r5.A02
            X.1rT r2 = (X.C38551rT) r2
            java.lang.String r0 = "ConversationListsFooterViewHolder/setLinkifyTitle: manage clicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.conversationslist.filter.ConversationFilter.LabelFilter"
            X.C18070vi.A0z(r1, r0)
            X.1wc r1 = (X.C41551wc) r1
            X.1x1 r1 = r1.A01
            android.content.Context r3 = r2.A00
            X.C18070vi.A0W(r3)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r0 = "LABELINFO"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.lists.ListsConversationManagementActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x056f:
            java.lang.Object r4 = r5.A01
            com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler r4 = (com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler) r4
            java.lang.Object r1 = r5.A02
            X.1wa r1 = (X.C41531wa) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.1NA r5 = r4.A04
            X.1wc r1 = (X.C41551wc) r1
            X.1x1 r6 = r1.A01
            long r2 = r6.A03
            long[] r1 = new long[r0]
            r0 = 0
            r1[r0] = r2
            boolean r0 = r5.A0C(r1)
            if (r0 == 0) goto L_0x05b1
            X.00H r0 = r4.A0A
            java.lang.Object r5 = X.C18070vi.A0E(r0)
            X.4Pp r5 = (X.C85964Pp) r5
            java.lang.Integer r7 = X.C17880vN.A0i()
            r2 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r9 = 0
            r11 = r9
            r12 = r9
            r10 = r9
            r5.A00(r6, r7, r8, r9, r10, r11, r12)
            X.1KB r1 = r4.A03
            X.3Bq r0 = new X.3Bq
            r0.<init>(r4, r2)
            r1.A0J(r0)
            return
        L_0x05b1:
            java.lang.String r0 = "ConversationFilterMenuHandler/setupContextMenuForLists/Error list not deleted"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x05b7:
            java.lang.Object r0 = r5.A01
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            java.lang.Object r1 = r5.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1Nb r0 = r0.A2R
            r0.A0b(r1)
            return
        L_0x05c5:
            java.lang.Object r1 = r5.A02
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 9
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r0 = com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A00(r0)
            r1.CMl(r0)
            return
        L_0x05d3:
            java.lang.Object r2 = r5.A01
            X.1ju r2 = (X.C34091ju) r2
            java.lang.Object r4 = r5.A02
            java.util.List r4 = (java.util.List) r4
            com.whatsapp.conversationslist.ConversationsFragment r1 = r2.A0Q
            X.1Co r0 = r1.A1u
            java.util.HashMap r3 = r0.A04(r4)
            int r5 = r4.size()
            X.1KB r0 = r1.A0r
            r6 = 16
            X.Aiu r1 = new X.Aiu
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A0J(r1)
            return
        L_0x05f4:
            java.lang.Object r4 = r5.A01
            X.1ju r4 = (X.C34091ju) r4
            java.lang.Object r0 = r5.A02
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            int r3 = r0.size()
            java.util.Iterator r2 = r0.iterator()
        L_0x0604:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0616
            X.1BI r1 = X.C17880vN.A0Q(r2)
            com.whatsapp.conversationslist.ConversationsFragment r0 = r4.A0Q
            X.1Co r0 = r0.A1u
            r0.A03(r1)
            goto L_0x0604
        L_0x0616:
            r0 = 1
            r2 = 2131897337(0x7f122bf9, float:1.942956E38)
            if (r3 != r0) goto L_0x061f
            r2 = 2131897338(0x7f122bfa, float:1.9429563E38)
        L_0x061f:
            com.whatsapp.conversationslist.ConversationsFragment r0 = r4.A0Q
            X.1KB r1 = r0.A0r
            r0 = 0
            r1.A09(r2, r0)
            return
        L_0x0628:
            java.lang.Object r0 = r5.A01
            X.30Z r0 = (X.AnonymousClass30Z) r0
            java.lang.Object r3 = r5.A02
            java.lang.Object r2 = r0.A01
            com.whatsapp.conversationslist.ConversationsFragment r2 = (com.whatsapp.conversationslist.ConversationsFragment) r2
            java.lang.String r1 = "UNREAD_FILTER"
            X.1rA r0 = r2.A1V
            if (r0 == 0) goto L_0x0650
            X.1Gk r0 = r0.BRg()
            java.util.List r0 = r0.A04
            if (r0 != 0) goto L_0x0642
            X.0wS r0 = X.C18460wS.A00
        L_0x0642:
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0650
            X.1Gk r0 = r2.A27()
            r2.BCQ(r0)
            return
        L_0x0650:
            java.util.List r0 = java.util.Collections.singletonList(r3)
            com.whatsapp.conversationslist.ConversationsFragment.A0m(r2, r0)
            return
        L_0x0658:
            java.lang.Object r0 = r5.A01
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            java.lang.Object r1 = r5.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1Nf r0 = r0.A1w
            r0.A01(r1)
            return
        L_0x0666:
            java.lang.Object r1 = r5.A01
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            java.lang.Object r0 = r5.A02
            android.text.SpannableStringBuilder r0 = (android.text.SpannableStringBuilder) r0
            r1.setTitle(r0)
            return
        L_0x0672:
            java.lang.Object r0 = r5.A01
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            java.lang.Object r7 = r5.A02
            com.whatsapp.jid.GroupJid r7 = (com.whatsapp.jid.GroupJid) r7
            X.126 r6 = r0.A28
            X.11E r1 = r6.A07
            boolean r1 = r1.A09()
            if (r1 == 0) goto L_0x073c
            X.1R3 r1 = r6.A0Q
            X.206 r8 = r1.A05(r7)
            boolean r1 = r8 instanceof X.C436420i
            r3 = 1
            if (r1 == 0) goto L_0x073a
            java.util.Set r4 = r6.A1F
            boolean r1 = r4.contains(r7)
            if (r1 != 0) goto L_0x073a
            r1 = r8
            X.20i r1 = (X.C436420i) r1
            int r2 = r1.A00
            r1 = 3
            if (r2 != r1) goto L_0x073a
            r4.add(r7)
            boolean r1 = r8 instanceof X.AnonymousClass2MR
            if (r1 == 0) goto L_0x06f5
            r1 = r8
            X.2MR r1 = (X.AnonymousClass2MR) r1
            int r12 = r1.A00
        L_0x06ab:
            X.122 r2 = r6.A0K
            X.1PQ r13 = r6.A0h
            X.11P r1 = r6.A0F
            long r19 = X.AnonymousClass11P.A01(r1)
            java.lang.String r15 = r8.A0P()
            r1 = r8
            X.2Mh r1 = (X.C48392Mh) r1
            java.util.List r1 = r1.A01
            r17 = 2
            r14 = r7
            r16 = r1
            r18 = r12
            X.2Mh r1 = r13.A07(r14, r15, r16, r17, r18, r19)
            r2.BBM(r1)
            X.1M9 r1 = r6.A08
            X.1E7 r2 = r1.A0H(r7)
            X.1Lr r1 = r6.A0B
            java.io.File r9 = r1.A00(r2)
            X.C17960vV.A07(r9)
            java.io.File r10 = r1.A01(r2)
            X.C17960vV.A07(r10)
            X.00H r1 = r6.A0q
            java.lang.Object r2 = r1.get()
            X.1Ly r2 = (X.C24861Ly) r2
            java.lang.String[] r5 = new java.lang.String[r3]
            r1 = 0
            X.C17880vN.A1J(r7, r5, r1)
            X.1at r4 = X.C24801Ls.A00(r2)
            goto L_0x06f7
        L_0x06f5:
            r12 = 0
            goto L_0x06ab
        L_0x06f7:
            r1 = r4
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x0722 }
            X.1Ev r3 = r1.A02     // Catch:{ all -> 0x0722 }
            java.lang.String r2 = "\n      SELECT description FROM wa_group_descriptions WHERE jid = ?\n    "
            java.lang.String r1 = "SELECT_GROUP_DESCRIPTION_BY_GROUP_JID"
            android.database.Cursor r2 = r3.A0A(r2, r1, r5)     // Catch:{ all -> 0x0722 }
            boolean r1 = r2.moveToNext()     // Catch:{ all -> 0x0716 }
            if (r1 == 0) goto L_0x0711
            java.lang.String r1 = "description"
            java.lang.String r11 = X.C17890vO.A0S(r2, r1)     // Catch:{ all -> 0x0716 }
            goto L_0x0712
        L_0x0711:
            r11 = 0
        L_0x0712:
            r2.close()     // Catch:{ all -> 0x0722 }
            goto L_0x072c
        L_0x0716:
            r1 = move-exception
            if (r2 == 0) goto L_0x0721
            r2.close()     // Catch:{ all -> 0x071d }
            goto L_0x0721
        L_0x071d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0722 }
        L_0x0721:
            throw r1     // Catch:{ all -> 0x0722 }
        L_0x0722:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0727 }
            throw r1
        L_0x0727:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x072c:
            r4.close()
            X.10I r1 = r6.A0k
            r13 = 0
            X.7R6 r5 = new X.7R6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.CGF(r5)
        L_0x073a:
            r1 = 1
            goto L_0x073d
        L_0x073c:
            r1 = 0
        L_0x073d:
            r4 = r1 ^ 1
            X.1KB r3 = r0.A0r
            r2 = 47
            X.7RK r1 = new X.7RK
            r1.<init>((int) r2, (java.lang.Object) r0, (boolean) r4)
            r3.A0J(r1)
            return
        L_0x074c:
            java.lang.Object r3 = r5.A01
            X.1py r3 = (X.C37691py) r3
            java.lang.Object r1 = r5.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            r2 = 0
            X.1Co r0 = r3.A04
            r0.A03(r1)
            X.1KB r1 = r3.A00
            r0 = 2131897338(0x7f122bfa, float:1.9429563E38)
            r1.A09(r0, r2)
            return
        L_0x0763:
            java.lang.Object r6 = r5.A01
            X.1py r6 = (X.C37691py) r6
            java.lang.Object r4 = r5.A02
            X.1BI r4 = (X.AnonymousClass1BI) r4
            r3 = 0
            X.1px r2 = r6.A02
            X.11P r0 = r6.A03
            long r0 = X.AnonymousClass11P.A01(r0)
            r2.A01(r4, r0)
            X.1KB r1 = r6.A00
            r0 = 2131894564(0x7f122124, float:1.9423936E38)
            r1.A09(r0, r3)
            return
        L_0x0780:
            java.lang.Object r1 = r5.A01
            X.0z4 r1 = (X.C19830z4) r1
            java.lang.Object r0 = r5.A02
            X.1NK r0 = (X.AnonymousClass1NK) r0
            long r2 = r0.A01()
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r1)
            java.lang.String r0 = "last_message_row_id_since_archive_open"
            X.C17880vN.A1D(r1, r0, r2)
            return
        L_0x0796:
            java.lang.Object r0 = r5.A01
            X.4mA r0 = (X.C95394mA) r0
            java.lang.Object r4 = r5.A02
            X.4VG r4 = (X.AnonymousClass4VG) r4
            X.3TA r2 = r0.A03     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x07d8 }
            X.0ve r3 = r2.A0e     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x07d8 }
            r1 = 10299(0x283b, float:1.4432E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x07d8 }
            boolean r0 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x07d8 }
            if (r0 == 0) goto L_0x07cb
            X.4TY r0 = r4.A02     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x07d8 }
            if (r0 == 0) goto L_0x07cb
            byte[] r5 = r0.A01     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x07d8 }
            if (r5 == 0) goto L_0x07cb
            X.7Fe r4 = r2.A00     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x07d8 }
            r10 = 0
            r6 = 25
            r8 = 140(0x8c, float:1.96E-43)
            r7 = r6
            r9 = r8
            r11 = r10
            byte[] r0 = r4.A0N(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x07d8 }
            if (r0 == 0) goto L_0x07cb
            X.7Fe r1 = r2.A00     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x07d8 }
            X.4DX r0 = X.AnonymousClass4DX.SMALL_THUMBNAIL_LOADED     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x07d8 }
            X.AnonymousClass3TA.A00(r1, r2, r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x07d8 }
        L_0x07cb:
            X.7Fe r0 = r2.A00     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x07d8 }
            r0.A0I(r3)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x07d8 }
            X.7Fe r1 = r2.A00     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x07d8 }
            X.4DX r0 = X.AnonymousClass4DX.SMALL_THUMBNAIL_LOADED     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x07d8 }
            X.AnonymousClass3TA.A00(r1, r2, r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x07d8 }
            return
        L_0x07d8:
            r1 = move-exception
            java.lang.String r0 = "CTWAListener/onSuccess/failed to load thumb"
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x07df:
            java.lang.Object r1 = r5.A01
            X.4mA r1 = (X.C95394mA) r1
            java.lang.Object r0 = r5.A02
            X.4VG r0 = (X.AnonymousClass4VG) r0
            r1.C7H(r0)
            return
        L_0x07eb:
            r7.BrD(r9)
            return
        L_0x07ef:
            r1 = 0
            X.1nW r0 = r4.A0T
            r2.A0F(r0, r3, r1)
            return
        L_0x07f6:
            java.lang.Object r6 = r5.A01
            com.whatsapp.conversationslist.ConversationsFragment r6 = (com.whatsapp.conversationslist.ConversationsFragment) r6
            java.lang.Object r5 = r5.A02
            X.1EC r5 = (X.AnonymousClass1EC) r5
            X.0ve r2 = r6.A25
            r1 = 6884(0x1ae4, float:9.647E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            X.00H r0 = r6.A32
            java.lang.Object r7 = r0.get()
            X.1kb r7 = (X.C34511kb) r7
            if (r1 == 0) goto L_0x0842
            java.util.List r2 = r7.A0C(r5)
        L_0x0816:
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x0840
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            X.A2B r0 = (X.A2B) r0
            com.whatsapp.jid.GroupJid r1 = r0.A02
            X.1CJ r0 = r6.A1v
            boolean r0 = r0.A0Q(r1)
            if (r0 != 0) goto L_0x0840
            X.1Nb r0 = r6.A2R
            boolean r0 = r0.A0y(r1)
            if (r0 != 0) goto L_0x0840
        L_0x0836:
            X.1KB r4 = r6.A0r
            r0 = 36
            X.4rb r2 = new X.4rb
            r2.<init>(r6, r1, r5, r0)
            goto L_0x088a
        L_0x0840:
            r1 = 0
            goto L_0x0836
        L_0x0842:
            java.util.HashSet r0 = r7.A08(r5)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x084e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0869
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.A2B r0 = (X.A2B) r0
            X.1CJ r1 = r7.A02
            com.whatsapp.jid.GroupJid r0 = r0.A02
            int r0 = r1.A03(r0)
            if (r0 <= 0) goto L_0x084e
            r4.add(r2)
            goto L_0x084e
        L_0x0869:
            java.util.List r2 = X.C29431cG.A0t(r4)
            goto L_0x0816
        L_0x086e:
            java.lang.Object r6 = r5.A01
            X.1py r6 = (X.C37691py) r6
            java.lang.Object r5 = r5.A02
            java.util.Set r5 = (java.util.Set) r5
            boolean r0 = r5 instanceof java.util.Collection
            r3 = 0
            if (r0 == 0) goto L_0x088e
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x088e
        L_0x0881:
            X.1KB r4 = r6.A00
            r0 = 37
            X.7RF r2 = new X.7RF
            r2.<init>(r6, r5, r0, r3)
        L_0x088a:
            r4.A0J(r2)
            return
        L_0x088e:
            java.util.Iterator r2 = r5.iterator()
        L_0x0892:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0881
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.1Nd r0 = r6.A01
            boolean r0 = r0.A0G(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0892
            r3 = 1
            goto L_0x0881
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70633Bw.run():void");
    }
}
