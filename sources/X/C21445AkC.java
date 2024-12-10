package X;

/* renamed from: X.AkC  reason: case insensitive filesystem */
public class C21445AkC implements Runnable {
    public final int A00;
    public final Object A01;

    public C21445AkC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass1KB r1, Object obj, int i) {
        r1.A0J(new C21445AkC(obj, i));
    }

    public static void A01(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new C21445AkC(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v96, resolved type: com.whatsapp.biz.education.fragment.MetaVerifiedBusinessAccountEducationBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v101, resolved type: com.whatsapp.biz.education.MetaVerifiedEducationBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v112, resolved type: com.whatsapp.biz.education.fragment.MetaVerifiedBusinessAccountEducationBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v113, resolved type: com.whatsapp.biz.education.fragment.MetaVerifiedBusinessAccountEducationBottomSheet} */
    /* JADX WARNING: type inference failed for: r1v15, types: [X.24D, X.206] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0247, code lost:
        r0 = "bizIntegrityLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x027c, code lost:
        r2.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x027f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0280, code lost:
        r0 = "contextualHelpHandler";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0396, code lost:
        r0 = "waIntents";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03e8, code lost:
        r2.A0G(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0436, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x043a, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0449, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x044c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0720, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0723, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0161, code lost:
        if (r0 == null) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0163, code lost:
        r2 = X.AnonymousClass3MW.A0a(r0);
        r1 = r1.A1D();
        r0 = "meta-verified-eligibility";
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r25 = this;
            r1 = r25
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0132;
                case 1: goto L_0x0142;
                case 2: goto L_0x0142;
                case 3: goto L_0x0154;
                case 4: goto L_0x015b;
                case 5: goto L_0x016f;
                case 6: goto L_0x0186;
                case 7: goto L_0x019f;
                case 8: goto L_0x01bd;
                case 9: goto L_0x01c5;
                case 10: goto L_0x01f0;
                case 11: goto L_0x0213;
                case 12: goto L_0x022c;
                case 13: goto L_0x024b;
                case 14: goto L_0x026a;
                case 15: goto L_0x0284;
                case 16: goto L_0x0007;
                case 17: goto L_0x0284;
                case 18: goto L_0x0007;
                case 19: goto L_0x0297;
                case 20: goto L_0x0007;
                case 21: goto L_0x029f;
                case 22: goto L_0x02e0;
                case 23: goto L_0x02e8;
                case 24: goto L_0x02f3;
                case 25: goto L_0x02f3;
                case 26: goto L_0x030d;
                case 27: goto L_0x031b;
                case 28: goto L_0x0329;
                case 29: goto L_0x0341;
                case 30: goto L_0x036d;
                case 31: goto L_0x039e;
                case 32: goto L_0x03d7;
                case 33: goto L_0x03e0;
                case 34: goto L_0x03ed;
                case 35: goto L_0x03f5;
                case 36: goto L_0x03fd;
                case 37: goto L_0x0409;
                case 38: goto L_0x0417;
                case 39: goto L_0x041f;
                case 40: goto L_0x041f;
                case 41: goto L_0x0428;
                case 42: goto L_0x043b;
                case 43: goto L_0x0684;
                case 44: goto L_0x06a4;
                case 45: goto L_0x06f1;
                case 46: goto L_0x070b;
                case 47: goto L_0x0724;
                case 48: goto L_0x072c;
                case 49: goto L_0x0734;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r1.A01
            com.whatsapp.blocklist.BlockList r3 = (com.whatsapp.blocklist.BlockList) r3
            java.util.List r2 = r3.A0S
            r2.clear()
            java.util.List r5 = r3.A0T
            r5.clear()
            java.lang.Object r6 = r3.A0R
            monitor-enter(r6)
            java.util.Set r0 = r3.A0U     // Catch:{ all -> 0x012f }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x012f }
        L_0x001e:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x003d
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x012f }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x012f }
            X.1M9 r0 = r3.A03     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x0036
            X.1E7 r0 = r0.A0H(r1)     // Catch:{ all -> 0x012f }
            r5.add(r0)     // Catch:{ all -> 0x012f }
            goto L_0x001e
        L_0x0036:
            java.lang.String r0 = "contactManager"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x012f }
            r0 = 0
            throw r0     // Catch:{ all -> 0x012f }
        L_0x003d:
            monitor-exit(r6)
            X.1Me r4 = r3.A05
            if (r4 == 0) goto L_0x012b
            X.0vb r1 = r3.A00
            X.7Rj r0 = new X.7Rj
            r0.<init>(r4, r1)
            java.util.Collections.sort(r5, r0)
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r8 = r5.iterator()
        L_0x0060:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0091
            X.1E7 r7 = X.C17880vN.A0O(r8)
            boolean r0 = r7.A0C()
            if (r0 == 0) goto L_0x0079
            X.AOO r0 = new X.AOO
            r0.<init>(r7)
            r9.add(r0)
            goto L_0x0060
        L_0x0079:
            X.1BI r0 = r7.A0J
            boolean r1 = X.C22971Dz.A0S(r0)
            X.AOO r0 = new X.AOO
            if (r1 == 0) goto L_0x008a
            r0.<init>(r7)
            r4.add(r0)
            goto L_0x0060
        L_0x008a:
            r0.<init>(r7)
            r10.add(r0)
            goto L_0x0060
        L_0x0091:
            X.9uc r0 = r3.A08
            r8 = 1
            if (r0 == 0) goto L_0x00ca
            boolean r0 = r0.A03()
            if (r0 != r8) goto L_0x00ca
            X.9uc r0 = r3.A08
            if (r0 == 0) goto L_0x00af
            java.util.HashSet r0 = r0.A00()
            java.util.List r1 = X.C29431cG.A0t(r0)
            r0 = 2
            java.util.List r0 = X.C21486Akr.A00(r1, r0)
            if (r0 != 0) goto L_0x00b1
        L_0x00af:
            X.0wS r0 = X.C18460wS.A00
        L_0x00b1:
            java.util.Iterator r7 = r0.iterator()
        L_0x00b5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.String r1 = X.C17880vN.A0v(r7)
            if (r1 == 0) goto L_0x00b5
            X.AOQ r0 = new X.AOQ
            r0.<init>(r1)
            r6.add(r0)
            goto L_0x00b5
        L_0x00ca:
            boolean r0 = X.C17880vN.A1X(r10)
            if (r0 == 0) goto L_0x00d9
            r1 = 0
            X.AOP r0 = new X.AOP
            r0.<init>(r1)
            r2.add(r0)
        L_0x00d9:
            r2.addAll(r10)
            boolean r0 = X.C17880vN.A1X(r9)
            if (r0 == 0) goto L_0x00ed
            X.AOP r0 = new X.AOP
            r0.<init>(r8)
            r2.add(r0)
            r2.addAll(r9)
        L_0x00ed:
            boolean r0 = X.C17880vN.A1X(r6)
            if (r0 == 0) goto L_0x00fc
            r1 = 2
            X.AOP r0 = new X.AOP
            r0.<init>(r1)
            r2.add(r0)
        L_0x00fc:
            r2.addAll(r6)
            boolean r0 = X.C17880vN.A1X(r4)
            if (r0 == 0) goto L_0x0111
            r1 = 3
            X.AOP r0 = new X.AOP
            r0.<init>(r1)
            r2.add(r0)
            r2.addAll(r4)
        L_0x0111:
            boolean r0 = X.AnonymousClass000.A1a(r5)
            if (r0 == 0) goto L_0x011f
            X.AON r0 = new X.AON
            r0.<init>()
            r2.add(r0)
        L_0x011f:
            X.0vl r0 = r3.A0V
            java.lang.Object r0 = r0.getValue()
            android.widget.BaseAdapter r0 = (android.widget.BaseAdapter) r0
            r0.notifyDataSetChanged()
            return
        L_0x012b:
            java.lang.String r0 = "waContactNames"
            goto L_0x0436
        L_0x012f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0132:
            java.lang.Object r3 = r1.A01
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x078c }
            r0 = 32000(0x7d00, double:1.581E-319)
            r3.get(r0, r2)     // Catch:{ Exception -> 0x078c }
            return
        L_0x0142:
            java.lang.Object r2 = r1.A01
            X.9k0 r2 = (X.C189879k0) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r1 = 0
            X.9Wk r0 = new X.9Wk
            r0.<init>(r1)
            r2.A00(r0)
            return
        L_0x0154:
            java.lang.Object r1 = r1.A01
            com.whatsapp.biz.education.MetaVerifiedEducationBottomSheet r1 = (com.whatsapp.biz.education.MetaVerifiedEducationBottomSheet) r1
            X.00H r0 = r1.A0E
            goto L_0x0161
        L_0x015b:
            java.lang.Object r1 = r1.A01
            com.whatsapp.biz.education.fragment.MetaVerifiedBusinessAccountEducationBottomSheet r1 = (com.whatsapp.biz.education.fragment.MetaVerifiedBusinessAccountEducationBottomSheet) r1
            X.00H r0 = r1.A04
        L_0x0161:
            if (r0 == 0) goto L_0x0280
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            X.1FL r1 = r1.A1D()
            java.lang.String r0 = "meta-verified-eligibility"
            goto L_0x027c
        L_0x016f:
            java.lang.Object r1 = r1.A01
            X.8hz r1 = (X.C167918hz) r1
            X.9sM r0 = r1.A00
            if (r0 != 0) goto L_0x017b
            java.lang.String r0 = "CreateOrderProtocol/onDirectConnectionSucceeded/Failed to repeat request. It is null"
            goto L_0x0449
        L_0x017b:
            java.lang.String r0 = "CreateOrderProtocol/onDirectConnectionSucceeded/retrying request"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9sM r0 = r1.A00
            X.C167918hz.A00(r0, r1)
            return
        L_0x0186:
            java.lang.Object r0 = r1.A01
            X.8hz r0 = (X.C167918hz) r0
            X.B9L r2 = r0.A01
            if (r2 == 0) goto L_0x019b
            java.lang.Integer r1 = X.C17880vN.A0h()
            java.lang.String r0 = "delivery failure"
            android.util.Pair r0 = X.C108945cZ.A0N(r1, r0)
            r2.Bso(r0)
        L_0x019b:
            java.lang.String r0 = "CreateOrderProtocol/onDeliveryFailure"
            goto L_0x0720
        L_0x019f:
            java.lang.Object r3 = r1.A01
            X.8hz r3 = (X.C167918hz) r3
            X.B9L r2 = r3.A01
            if (r2 == 0) goto L_0x01b6
            r0 = 421(0x1a5, float:5.9E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "Failed to create direct connection info"
            android.util.Pair r0 = X.C108945cZ.A0N(r1, r0)
            r2.Bso(r0)
        L_0x01b6:
            r0 = 0
            r3.A00 = r0
            java.lang.String r0 = "CreateOrderProtocol/onDirectConnectionError/Failed to create direct connection info"
            goto L_0x0449
        L_0x01bd:
            java.lang.Object r0 = r1.A01
            X.8hq r0 = (X.C167828hq) r0
            r0.A03()
            return
        L_0x01c5:
            java.lang.Object r3 = r1.A01
            X.AMw r3 = (X.C20485AMw) r3
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.1Ty r0 = r3.A01
            com.whatsapp.jid.UserJid r2 = r3.A03
            X.AEW r0 = r0.A08(r2)
            if (r0 == 0) goto L_0x01ee
            X.A4n r1 = new X.A4n
            r1.<init>(r0)
            X.00H r0 = r3.A05
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass8BV.A0F(r2, r0)
            r1.A09 = r0
            X.AEW r1 = r1.A01()
        L_0x01e8:
            X.1DT r0 = r3.A00
            r0.A0E(r1)
            return
        L_0x01ee:
            r1 = 0
            goto L_0x01e8
        L_0x01f0:
            java.lang.Object r0 = r1.A01
            X.8jP r0 = (X.C168648jP) r0
            X.1pf r4 = r0.A0V
            if (r4 == 0) goto L_0x020f
            com.whatsapp.jid.UserJid r3 = r0.A4e()
            X.AEv r0 = r0.A0K
            if (r0 == 0) goto L_0x020d
            java.lang.String r2 = r0.A0H
        L_0x0202:
            java.lang.String r1 = "product_link"
            X.2pq r0 = new X.2pq
            r0.<init>(r3, r1, r2)
            r4.A01(r0)
            return
        L_0x020d:
            r2 = 0
            goto L_0x0202
        L_0x020f:
            java.lang.String r0 = "lastChatEntryPointManager"
            goto L_0x0436
        L_0x0213:
            java.lang.Object r1 = r1.A01
            com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet r1 = (com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet) r1
            X.206 r0 = com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet.A00(r1)
            if (r0 == 0) goto L_0x078c
            X.A5M r3 = r1.A04
            if (r3 == 0) goto L_0x0247
            java.util.List r2 = X.C18070vi.A0M(r0)
            r1 = 15
            r0 = 0
            r3.A05(r0, r2, r1)
            return
        L_0x022c:
            java.lang.Object r1 = r1.A01
            com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet r1 = (com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet) r1
            X.206 r0 = com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet.A00(r1)
            if (r0 == 0) goto L_0x078c
            X.A5M r3 = r1.A04
            if (r3 == 0) goto L_0x0247
            java.util.List r2 = X.C18070vi.A0M(r0)
            java.lang.Integer r1 = X.C17880vN.A0h()
            r0 = 6
            r3.A05(r1, r2, r0)
            return
        L_0x0247:
            java.lang.String r0 = "bizIntegrityLogger"
            goto L_0x0436
        L_0x024b:
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            boolean r0 = r2.A1b()
            if (r0 == 0) goto L_0x078c
            android.content.Context r0 = r2.A14()
            android.content.Intent r1 = X.AnonymousClass1LU.A02(r0)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            android.content.Intent r0 = r1.addFlags(r0)
            X.C18070vi.A0X(r0)
            r2.A1k(r0)
            return
        L_0x026a:
            java.lang.Object r1 = r1.A01
            com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment r1 = (com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment) r1
            X.00H r0 = r1.A0G
            if (r0 == 0) goto L_0x0280
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            X.1FL r1 = r1.A1D()
            java.lang.String r0 = "about-blocking-reporting"
        L_0x027c:
            r2.A01(r1, r0)
            return
        L_0x0280:
            java.lang.String r0 = "contextualHelpHandler"
            goto L_0x0436
        L_0x0284:
            java.lang.Object r1 = r1.A01
            com.whatsapp.blocklist.BlockList r1 = (com.whatsapp.blocklist.BlockList) r1
            X.00H r0 = r1.A0M
            if (r0 == 0) goto L_0x0396
            r0.get()
            android.content.Intent r0 = X.AnonymousClass1LU.A09(r1)
            r1.startActivity(r0)
            return
        L_0x0297:
            java.lang.Object r0 = r1.A01
            com.whatsapp.blocklist.BlockList r0 = (com.whatsapp.blocklist.BlockList) r0
            com.whatsapp.blocklist.BlockList.A0z(r0)
            return
        L_0x029f:
            java.lang.Object r4 = r1.A01
            com.whatsapp.blocklist.BlockList r4 = (com.whatsapp.blocklist.BlockList) r4
            X.00H r0 = r4.A0F
            if (r0 == 0) goto L_0x02dc
            X.1pj r0 = X.AnonymousClass3MW.A0V(r0)
            java.util.Set r3 = r0.A0B()
            X.00H r0 = r4.A0J
            if (r0 == 0) goto L_0x02d8
            java.lang.Object r0 = r0.get()
            X.6na r0 = (X.C132786na) r0
            java.util.List r0 = r0.A00()
            java.util.HashSet r1 = X.AnonymousClass8BR.A12(r0)
            java.lang.Object r2 = r4.A0R
            monitor-enter(r2)
            java.util.Set r0 = r4.A0U     // Catch:{ all -> 0x02d5 }
            r0.addAll(r3)     // Catch:{ all -> 0x02d5 }
            r0.addAll(r1)     // Catch:{ all -> 0x02d5 }
            X.1KB r1 = r4.A05     // Catch:{ all -> 0x02d5 }
            r0 = 20
            A00(r1, r4, r0)     // Catch:{ all -> 0x02d5 }
            monitor-exit(r2)
            return
        L_0x02d5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x02d8:
            java.lang.String r0 = "interopBlockListManager"
            goto L_0x0436
        L_0x02dc:
            java.lang.String r0 = "blockListManager"
            goto L_0x0436
        L_0x02e0:
            java.lang.Object r0 = r1.A01
            com.whatsapp.blocklist.BlockList r0 = (com.whatsapp.blocklist.BlockList) r0
            com.whatsapp.blocklist.BlockList.A0y(r0)
            return
        L_0x02e8:
            java.lang.Object r1 = r1.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 2131893765(0x7f121e05, float:1.9422316E38)
            r1.BhQ(r0)
            return
        L_0x02f3:
            java.lang.Object r0 = r1.A01
            X.AOL r0 = (X.AOL) r0
            X.0vl r2 = r0.A01
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r2)
            android.content.Context r0 = (android.content.Context) r0
            android.content.Intent r1 = X.AnonymousClass1LU.A09(r0)
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r2)
            android.content.Context r0 = (android.content.Context) r0
            r0.startActivity(r1)
            return
        L_0x030d:
            java.lang.Object r0 = r1.A01
            X.1pj r0 = (X.C37551pj) r0
            X.1Lf r2 = r0.A04
            X.0wS r1 = X.C18460wS.A00
            r0 = 12
            X.AnonymousClass35V.A00(r2, r1, r0)
            return
        L_0x031b:
            java.lang.Object r0 = r1.A01
            X.1pj r0 = (X.C37551pj) r0
            X.1pe r1 = r0.A02
            java.util.Set r0 = r0.A0A()
            r1.A0J(r0)
            return
        L_0x0329:
            java.lang.Object r3 = r1.A01
            X.9u0 r3 = (X.C195849u0) r3
            r2 = 0
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x033b
            X.1KB r1 = r3.A02
            android.app.Activity r0 = r3.A01
            X.1FR r0 = (X.AnonymousClass1FR) r0
            r1.A0B(r0)
        L_0x033b:
            X.3Kn r0 = r3.A03
            r0.C3p(r2)
            return
        L_0x0341:
            java.lang.Object r3 = r1.A01
            X.9u0 r3 = (X.C195849u0) r3
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x0352
            X.1KB r1 = r3.A02
            android.app.Activity r0 = r3.A01
            X.1FR r0 = (X.AnonymousClass1FR) r0
            r1.A0B(r0)
        L_0x0352:
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x0365
            X.1Lf r2 = r3.A07
            X.9hX r0 = r3.A05
            com.whatsapp.jid.UserJid r0 = r0.A03
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 12
            X.AnonymousClass35V.A00(r2, r1, r0)
        L_0x0365:
            X.3Kn r1 = r3.A03
            boolean r0 = r3.A00
            r1.C3p(r0)
            return
        L_0x036d:
            java.lang.Object r3 = r1.A01
            com.whatsapp.blockui.BlockConfirmationDialogFragment r3 = (com.whatsapp.blockui.BlockConfirmationDialogFragment) r3
            X.129 r1 = r3.A07
            if (r1 == 0) goto L_0x039a
            java.lang.String r0 = "1142481766359885"
            android.net.Uri r1 = r1.A03(r0)
            X.C18070vi.A0X(r1)
            X.1LU r0 = r3.A06
            if (r0 == 0) goto L_0x0396
            android.content.Intent r2 = X.AnonymousClass3MY.A07(r1)
            X.1L9 r1 = r3.A00
            if (r1 == 0) goto L_0x0392
            android.content.Context r0 = r3.A14()
            r1.A08(r0, r2)
            return
        L_0x0392:
            java.lang.String r0 = "activityUtils"
            goto L_0x0436
        L_0x0396:
            java.lang.String r0 = "waIntents"
            goto L_0x0436
        L_0x039a:
            java.lang.String r0 = "faqLinkFactory"
            goto L_0x0436
        L_0x039e:
            java.lang.Object r3 = r1.A01
            X.8qR r3 = (X.C170648qR) r3
            X.118 r0 = r3.A07     // Catch:{ Exception -> 0x03d0 }
            android.content.res.Resources r0 = X.AnonymousClass3MW.A05(r0)     // Catch:{ Exception -> 0x03d0 }
            android.content.res.AssetManager r1 = r0.getAssets()     // Catch:{ Exception -> 0x03d0 }
            java.lang.String r0 = "bloks_payload.zip"
            java.io.InputStream r0 = r1.open(r0)     // Catch:{ Exception -> 0x03d0 }
            boolean r0 = r3.A0E(r0)     // Catch:{ Exception -> 0x03d0 }
            if (r0 == 0) goto L_0x03c5
            X.1KB r2 = r3.A04     // Catch:{ Exception -> 0x03d0 }
            r0 = 32
            X.AkC r1 = new X.AkC     // Catch:{ Exception -> 0x03d0 }
            r1.<init>(r3, r0)     // Catch:{ Exception -> 0x03d0 }
        L_0x03c1:
            r2.A0J(r1)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03cf
        L_0x03c5:
            X.1KB r2 = r3.A04     // Catch:{ Exception -> 0x03d0 }
            r0 = 33
            X.AkC r1 = new X.AkC     // Catch:{ Exception -> 0x03d0 }
            r1.<init>(r3, r0)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03c1
        L_0x03cf:
            return
        L_0x03d0:
            r1 = move-exception
            java.lang.String r0 = "PAY: Error load Debug Bloks Payload from assets"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x03d7:
            java.lang.Object r0 = r1.A01
            X.8qR r0 = (X.C170648qR) r0
            X.1KB r2 = r0.A04
            java.lang.String r1 = "Load Bloks from assets success."
            goto L_0x03e8
        L_0x03e0:
            java.lang.Object r0 = r1.A01
            X.8qR r0 = (X.C170648qR) r0
            X.1KB r2 = r0.A04
            java.lang.String r1 = "Load Bloks from assets failed."
        L_0x03e8:
            r0 = 0
            r2.A0G(r1, r0)
            return
        L_0x03ed:
            java.lang.Object r0 = r1.A01
            X.BCV r0 = (X.BCV) r0
            r0.onSuccess()
            return
        L_0x03f5:
            java.lang.Object r0 = r1.A01
            X.BCV r0 = (X.BCV) r0
            r0.Bki()
            return
        L_0x03fd:
            java.lang.Object r1 = r1.A01
            X.9sN r1 = (X.C194839sN) r1
            if (r1 == 0) goto L_0x078c
            java.lang.String r0 = "on_failure"
            r1.A00(r0)
            return
        L_0x0409:
            java.lang.Object r0 = r1.A01
            X.CsU r0 = (X.C26109CsU) r0
            X.1KB r2 = r0.A01
            r1 = 2131887876(0x7f120704, float:1.9410371E38)
            r0 = 1
            r2.A08(r1, r0)
            return
        L_0x0417:
            java.lang.Object r0 = r1.A01
            X.1z1 r0 = (X.C42961z1) r0
            r0.A02()
            return
        L_0x041f:
            java.lang.Object r1 = r1.A01
            X.5jD r1 = (X.C111225jD) r1
            r0 = 1
            X.C111225jD.A0C(r1, r0)
            return
        L_0x0428:
            java.lang.Object r0 = r1.A01
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment r0 = (com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment) r0
            X.11C r0 = r0.A0E
            if (r0 == 0) goto L_0x0434
            X.AnonymousClass4a5.A03(r0)
            return
        L_0x0434:
            java.lang.String r0 = "systemServices"
        L_0x0436:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x043b:
            java.lang.Object r2 = r1.A01
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel r2 = (com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel) r2
            X.1iT r0 = r2.A07
            com.whatsapp.bot.home.sync.discovery.DiscoveryBots r22 = r0.A00()
            if (r22 != 0) goto L_0x044d
            java.lang.String r0 = "ImagineMeOnboardingViewModel/sendOnboardingMessage couldn't load discovery bots"
        L_0x0449:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x044d:
            X.8XD r0 = X.AnonymousClass8XD.DEFAULT_INSTANCE
            X.Bmt r21 = r0.A0N()
            X.6o4 r6 = r2.A0A
            monitor-enter(r6)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0681 }
            java.util.LinkedHashMap r0 = r6.A03     // Catch:{ all -> 0x0681 }
            java.util.Iterator r4 = X.AnonymousClass000.A15(r0)     // Catch:{ all -> 0x0681 }
        L_0x0460:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0681 }
            if (r0 == 0) goto L_0x0484
            java.util.Map$Entry r3 = X.AnonymousClass000.A16(r4)     // Catch:{ all -> 0x0681 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x0681 }
            X.1D6 r0 = (X.AnonymousClass1D6) r0     // Catch:{ all -> 0x0681 }
            java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0681 }
            X.2g5 r1 = (X.C55612g5) r1     // Catch:{ all -> 0x0681 }
            if (r1 == 0) goto L_0x0460
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x0681 }
            X.1D6 r0 = (X.AnonymousClass1D6) r0     // Catch:{ all -> 0x0681 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x0681 }
            X.4Du r0 = (X.C83094Du) r0     // Catch:{ all -> 0x0681 }
            X.AnonymousClass1D6.A02(r1, r0, r5)     // Catch:{ all -> 0x0681 }
            goto L_0x0460
        L_0x0484:
            monitor-exit(r6)
            java.util.Iterator r20 = r5.iterator()
        L_0x0489:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x0650
            java.lang.Object r1 = r20.next()
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            java.lang.Object r0 = r1.first
            X.2g5 r0 = (X.C55612g5) r0
            java.lang.Object r4 = r1.second
            X.4Du r4 = (X.C83094Du) r4
            boolean r19 = X.C18070vi.A15(r0, r4)
            X.9un r1 = r0.A02
            java.lang.String r5 = r1.A06()
            if (r5 == 0) goto L_0x0489
            java.lang.String r18 = r1.A05()
            if (r18 == 0) goto L_0x0489
            java.lang.String r6 = r1.A03()
            if (r6 == 0) goto L_0x0489
            X.2pa r0 = r1.A00()
            if (r0 == 0) goto L_0x0489
            byte[] r3 = r0.A01
            if (r3 == 0) goto L_0x0489
            X.2pa r0 = r1.A00()
            if (r0 == 0) goto L_0x0489
            long r0 = r0.A00
            r23 = r0
            X.8bk r0 = X.C165778bk.DEFAULT_INSTANCE
            X.Bmt r17 = X.AnonymousClass8BS.A08(r0)
            r0 = r17
            X.Bm6 r1 = r0.A00
            X.8bk r1 = (X.C165778bk) r1
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.fileSha256_ = r5
            X.ArZ r0 = X.C198019xe.A02
            int r8 = r3.length
            X.C29761cp.A01(r8, r8)
            int r0 = r8 + 3
            int r0 = r0 + -1
            int r0 = r0 / 3
            int r11 = r0 * 4
            if (r11 < 0) goto L_0x0649
            byte[] r7 = new byte[r11]
            r5 = 0
            r10 = 1
            X.C29761cp.A01(r8, r8)
            java.lang.String r9 = ", destination size: "
            if (r11 > r11) goto L_0x062f
            byte[] r9 = X.AnonymousClass9UC.A00
            r11 = 2147483647(0x7fffffff, float:NaN)
            r16 = 0
        L_0x04ff:
            int r1 = r5 + 2
            int r0 = r8 - r5
            if (r1 >= r8) goto L_0x0558
            int r0 = r0 / 3
            int r13 = java.lang.Math.min(r0, r11)
            r12 = 0
        L_0x050c:
            if (r12 >= r13) goto L_0x0545
            int r15 = r5 + 1
            byte r0 = r3[r5]
            r14 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r15 + 1
            byte r0 = r3[r15]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r15 = r0
            int r5 = r1 + 1
            byte r0 = r3[r1]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 16
            int r0 = r15 << 8
            r14 = r14 | r0
            r14 = r14 | r1
            int r15 = r16 + 1
            int r0 = r14 >>> 18
            byte r0 = r9[r0]
            r7[r16] = r0
            int r1 = r15 + 1
            int r0 = r14 >>> 12
            X.AnonymousClass8BR.A1J(r9, r7, r0, r15)
            int r15 = r1 + 1
            int r0 = r14 >>> 6
            X.AnonymousClass8BR.A1J(r9, r7, r0, r1)
            int r16 = r15 + 1
            X.AnonymousClass8BR.A1J(r9, r7, r14, r15)
            int r12 = r12 + 1
            goto L_0x050c
        L_0x0545:
            if (r13 != r11) goto L_0x04ff
            if (r5 == r8) goto L_0x04ff
            int r12 = r16 + 1
            byte[] r1 = X.C198019xe.A03
            byte r0 = r1[r19]
            r7[r16] = r0
            int r16 = r12 + 1
            byte r0 = r1[r10]
            r7[r12] = r0
            goto L_0x04ff
        L_0x0558:
            r12 = 61
            if (r0 == r10) goto L_0x060a
            r11 = 2
            if (r0 != r11) goto L_0x0585
            int r10 = r5 + 1
            byte r0 = r3[r5]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r5 = r10 + 1
            byte r0 = r3[r10]
            r10 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r1 << 10
            int r10 = r10 << r11
            r10 = r10 | r0
            int r3 = r16 + 1
            int r0 = r10 >>> 12
            byte r0 = r9[r0]
            r7[r16] = r0
            int r1 = r3 + 1
            int r0 = r10 >>> 6
            X.AnonymousClass8BR.A1J(r9, r7, r0, r3)
            int r0 = r1 + 1
            X.AnonymousClass8BR.A1J(r9, r7, r10, r1)
            r7[r0] = r12
        L_0x0585:
            if (r5 != r8) goto L_0x0628
            java.nio.charset.Charset r0 = X.C26571Sq.A00
            java.lang.String r3 = new java.lang.String
            r3.<init>(r7, r0)
            X.Bm6 r1 = X.C17880vN.A0G(r17)
            X.8bk r1 = (X.C165778bk) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.mediaKey_ = r3
            X.Bm6 r1 = X.C17880vN.A0G(r17)
            X.8bk r1 = (X.C165778bk) r1
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r0 = r18
            r1.fileEncSha256_ = r0
            X.Bm6 r1 = X.C17880vN.A0G(r17)
            X.8bk r1 = (X.C165778bk) r1
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
            r1.directPath_ = r6
            X.Bm6 r3 = X.C17880vN.A0G(r17)
            X.8bk r3 = (X.C165778bk) r3
            int r0 = r3.bitField0_
            r0 = r0 | 16
            r3.bitField0_ = r0
            r0 = r23
            r3.mediaKeyTimestamp_ = r0
            java.lang.String r3 = "image/jpg"
            X.Bm6 r1 = X.C17880vN.A0G(r17)
            X.8bk r1 = (X.C165778bk) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.mimetype_ = r3
            X.Bm6 r1 = X.C17880vN.A0G(r17)
            X.8bk r1 = (X.C165778bk) r1
            int r0 = r4.value
            r1.orientationType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            X.Bm6 r4 = r17.A0C()
            if (r4 == 0) goto L_0x0489
            X.Bm6 r3 = X.C17880vN.A0G(r21)
            X.8XD r3 = (X.AnonymousClass8XD) r3
            X.EE9 r1 = r3.faceImages_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0605
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r3.faceImages_ = r1
        L_0x0605:
            r1.add(r4)
            goto L_0x0489
        L_0x060a:
            int r10 = r5 + 1
            byte r0 = r3[r5]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r5 = r0 << 4
            int r3 = r16 + 1
            int r0 = r5 >>> 6
            byte r0 = r9[r0]
            r7[r16] = r0
            int r1 = r3 + 1
            X.AnonymousClass8BR.A1J(r9, r7, r5, r3)
            int r0 = r1 + 1
            r7[r1] = r12
            r7[r0] = r12
            r5 = r10
            goto L_0x0585
        L_0x0628:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)
            throw r1
        L_0x062f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "The destination array does not have enough capacity, destination offset: "
            r0 = r19
            X.AnonymousClass000.A1E(r1, r9, r2, r0)
            r2.append(r11)
            java.lang.String r0 = ", capacity needed: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r2, r11)
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>(r0)
            throw r1
        L_0x0649:
            java.lang.String r0 = "Input is too big"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0650:
            r0 = r22
            X.20Q r0 = r0.A01
            com.whatsapp.jid.UserJid r3 = r0.A00
            X.9oI r6 = r2.A0B
            X.Bm6 r5 = r21.A0C()
            X.8XD r5 = (X.AnonymousClass8XD) r5
            r2 = 1
            X.C18070vi.A0d(r5, r2)
            X.11P r1 = r6.A01
            X.11S r0 = r6.A00
            java.lang.String r0 = X.AnonymousClass8BS.A0e(r0, r1)
            X.205 r4 = X.AnonymousClass205.A01(r3, r0, r2)
            long r2 = X.AnonymousClass11P.A01(r1)
            r0 = 102(0x66, float:1.43E-43)
            X.24D r1 = new X.24D
            r1.<init>(r4, r0, r2)
            r1.A00 = r5
            X.121 r0 = r6.A02
            r0.BBM(r1)
            return
        L_0x0681:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0684:
            java.lang.Object r1 = r1.A01
            X.34B r1 = (X.AnonymousClass34B) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.2kI r0 = r1.A02()
            java.io.File r0 = r0.A00()
            if (r0 == 0) goto L_0x06a1
            boolean r1 = r0.delete()
            r0 = 1
            if (r1 != r0) goto L_0x06a1
            java.lang.String r0 = "ImagineMeOnboardingViewModel/onUploadResultReceived deleted original media file"
            goto L_0x0720
        L_0x06a1:
            java.lang.String r0 = "ImagineMeOnboardingViewModel/onUploadResultReceived failed to delete original media file"
            goto L_0x0720
        L_0x06a4:
            java.lang.Object r4 = r1.A01
            X.6o4 r4 = (X.C133036o4) r4
            monitor-enter(r4)
            java.util.LinkedHashMap r3 = r4.A03     // Catch:{ all -> 0x06ee }
            java.util.Iterator r1 = X.AnonymousClass000.A15(r3)     // Catch:{ all -> 0x06ee }
            r2 = 0
        L_0x06b0:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x06ee }
            if (r0 == 0) goto L_0x06d3
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r1)     // Catch:{ all -> 0x06ee }
            java.lang.Object r0 = r0.getKey()     // Catch:{ all -> 0x06ee }
            android.net.Uri r0 = (android.net.Uri) r0     // Catch:{ all -> 0x06ee }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x06ee }
            if (r0 == 0) goto L_0x06b0
            java.io.File r0 = X.C108945cZ.A17(r0)     // Catch:{ all -> 0x06ee }
            boolean r0 = r0.delete()     // Catch:{ all -> 0x06ee }
            if (r0 == 0) goto L_0x06b0
            int r2 = r2 + 1
            goto L_0x06b0
        L_0x06d3:
            r3.clear()     // Catch:{ all -> 0x06ee }
            java.util.LinkedHashSet r0 = r4.A04     // Catch:{ all -> 0x06ee }
            r0.clear()     // Catch:{ all -> 0x06ee }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x06ee }
            java.lang.String r0 = "ImagineMeSelfieUploader/cleanup deleted "
            r1.append(r0)     // Catch:{ all -> 0x06ee }
            r1.append(r2)     // Catch:{ all -> 0x06ee }
            java.lang.String r0 = " files"
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x06ee }
            monitor-exit(r4)
            return
        L_0x06ee:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x06f1:
            java.lang.Object r1 = r1.A01
            X.34B r1 = (X.AnonymousClass34B) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.2h8 r0 = r1.A01()
            java.io.File r0 = r0.A07
            if (r0 == 0) goto L_0x078c
            boolean r1 = r0.delete()
            r0 = 1
            if (r1 != r0) goto L_0x078c
            java.lang.String r0 = "ImagineMeSelfieUploader/retryFailedJobs deleted old media job file before scheduling new one"
            goto L_0x0720
        L_0x070b:
            java.lang.Object r0 = r1.A01
            X.34B r0 = (X.AnonymousClass34B) r0
            X.2kI r0 = r0.A02()
            java.io.File r0 = r0.A08
            if (r0 == 0) goto L_0x078c
            boolean r1 = r0.delete()
            r0 = 1
            if (r1 != r0) goto L_0x078c
            java.lang.String r0 = "ImagineMeSelfieUploader/onMediaJobResponse deleted tmp file created for media job"
        L_0x0720:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0724:
            java.lang.Object r0 = r1.A01
            com.whatsapp.bot.metaai.imagineme.settings.ImagineMeSettingsViewModel r0 = (com.whatsapp.bot.metaai.imagineme.settings.ImagineMeSettingsViewModel) r0
            com.whatsapp.bot.metaai.imagineme.settings.ImagineMeSettingsViewModel.A00(r0)
            return
        L_0x072c:
            java.lang.Object r0 = r1.A01
            X.A06 r0 = (X.A06) r0
            X.A06.A00(r0)
            return
        L_0x0734:
            java.lang.Object r7 = r1.A01
            com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingActivity r7 = (com.whatsapp.bot.metaai.voice.MetaAiVoiceSettingActivity) r7
            r6 = 0
            r0 = 2131436909(0x7f0b256d, float:1.8495702E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r7, r0)
            com.whatsapp.WaTextView r3 = r7.A03
            java.lang.String r5 = "voiceOptionDescription"
            r4 = 0
            if (r3 == 0) goto L_0x078f
            int r2 = r0.getHeight()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x076c
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x076c
            int r0 = r1.topMargin
        L_0x0759:
            int r2 = r2 + r0
            X.1sv r0 = new X.1sv
            r0.<init>(r6, r2, r6, r6)
            X.C43531zx.A03(r3, r0)
            com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView r3 = r7.A07
            if (r3 != 0) goto L_0x076e
            java.lang.String r0 = "voiceSelectionRecyclerview"
            X.C18070vi.A11(r0)
            throw r4
        L_0x076c:
            r0 = 0
            goto L_0x0759
        L_0x076e:
            com.whatsapp.WaTextView r0 = r7.A03
            if (r0 == 0) goto L_0x078f
            int r2 = r0.getHeight()
            com.whatsapp.WaTextView r0 = r7.A03
            if (r0 == 0) goto L_0x078f
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x078d
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x078d
            int r0 = r1.topMargin
        L_0x0788:
            int r2 = r2 + r0
            r3.setPadding(r6, r2, r6, r6)
        L_0x078c:
            return
        L_0x078d:
            r0 = 0
            goto L_0x0788
        L_0x078f:
            X.C18070vi.A11(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21445AkC.run():void");
    }
}
