package X;

import java.util.Map;

/* renamed from: X.1h1  reason: invalid class name and case insensitive filesystem */
public class C32331h1 {
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1CJ A02;
    public final AnonymousClass1Cd A03;
    public final C32321h0 A04;
    public final AnonymousClass1WX A05;
    public final AnonymousClass1N5 A06;
    public final AnonymousClass1N9 A07;
    public final C25011Mn A08;
    public final AnonymousClass00H A09;
    public final Map A0A;
    public final AnonymousClass11P A0B;
    public final C22621Co A0C;
    public final AnonymousClass122 A0D;
    public final AnonymousClass1Q2 A0E;
    public final C26111Qw A0F;
    public final AnonymousClass1WN A0G;
    public final AnonymousClass1PT A0H;
    public final C32291gx A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;

    public void A01(AnonymousClass3KP r9, AnonymousClass205 r10, int i) {
        ((C31931gM) this.A09.get()).A01(new C21365Aiu(this, r10, r9, i, 20), 36);
    }

    public static boolean A00(AnonymousClass205 r0, int i) {
        if (r0.A02) {
            return false;
        }
        if (i == 13 || i == 16 || i == 17) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009a, code lost:
        if (r7.A0y > r3.A02()) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.util.List r21) {
        /*
            r20 = this;
            r10 = r20
            X.00H r0 = r10.A09
            java.lang.Object r0 = r0.get()
            X.1gM r0 = (X.C31931gM) r0
            r0.A00()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.Iterator r9 = r21.iterator()
        L_0x0016:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r2 = r9.next()
            X.205 r2 = (X.AnonymousClass205) r2
            X.1BI r1 = r2.A00
            X.C17960vV.A07(r1)
            X.00H r0 = r10.A0K
            java.lang.Object r0 = r0.get()
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            X.1W2 r0 = r0.A01
            X.206 r7 = r0.A05(r2)
            if (r7 == 0) goto L_0x0016
            boolean r0 = X.C22971Dz.A0a(r1)
            if (r0 == 0) goto L_0x00d0
            X.00H r0 = r10.A0L
            java.lang.Object r8 = r0.get()
            X.2lE r8 = (X.C58772lE) r8
            X.1TG r2 = r8.A01
            X.1BI r1 = r7.A0H()
            X.C17960vV.A07(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r1, r0)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = -1
            java.util.ArrayList r6 = r2.A04(r1, r0)
            X.00H r1 = r8.A06
            java.lang.Object r0 = r1.get()
            X.1Lc r0 = (X.C24641Lc) r0
            boolean r0 = r0.A07()
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x00a2
            com.whatsapp.jid.UserJid r0 = r7.A0I()
            if (r0 == 0) goto L_0x00a2
            X.1Le r1 = r8.A02
            com.whatsapp.jid.UserJid r0 = r7.A0I()
            X.2sx r3 = r1.A08(r0)
            if (r3 == 0) goto L_0x009d
            X.36j r0 = X.C63672tV.A02(r7)
            if (r0 == 0) goto L_0x009d
            boolean r0 = r0.A02()
            if (r0 != r5) goto L_0x009d
            long r12 = r3.A02()
            r1 = -9223372036854775808
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
            long r0 = r7.A0y
            long r12 = r3.A02()
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x009d
        L_0x009c:
            r4 = 1
        L_0x009d:
            r8.A01(r7, r6, r4, r5)
            goto L_0x0016
        L_0x00a2:
            java.lang.Object r0 = r1.get()
            X.1Lc r0 = (X.C24641Lc) r0
            X.0ve r2 = r0.A01
            r1 = 8880(0x22b0, float:1.2444E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x009d
            int r3 = r6.indexOf(r7)
            int r0 = r3 + -1
            if (r0 < 0) goto L_0x009d
            r2 = 0
        L_0x00bd:
            if (r2 >= r3) goto L_0x009d
            X.1Le r1 = r8.A02
            java.lang.Object r0 = r6.get(r2)
            X.206 r0 = (X.AnonymousClass206) r0
            boolean r0 = r1.A0K(r0, r5)
            if (r0 != 0) goto L_0x009c
            int r2 = r2 + 1
            goto L_0x00bd
        L_0x00d0:
            java.lang.Object r0 = r11.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x00e0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.put(r1, r0)
        L_0x00e0:
            r0.add(r7)
            goto L_0x0016
        L_0x00e5:
            java.util.Set r0 = r11.entrySet()
            java.util.Iterator r18 = r0.iterator()
        L_0x00ed:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0236
            java.lang.Object r0 = r18.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r9 = r0.getKey()
            X.1BI r9 = (X.AnonymousClass1BI) r9
            java.lang.Object r2 = r0.getValue()
            java.util.List r2 = (java.util.List) r2
            r1 = 7
            X.4rw r0 = new X.4rw
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
            int r0 = r2.size()
            int r0 = r0 + -1
            java.lang.Object r8 = r2.get(r0)
            X.206 r8 = (X.AnonymousClass206) r8
            X.1Co r12 = r10.A0C
            long r6 = r8.A0x
            long r4 = r8.A0y
            X.00H r0 = r12.A01
            r19 = r0
            java.lang.Object r0 = r19.get()
            X.1as r0 = (X.C28771as) r0
            X.00H r0 = r0.A0L
            java.lang.Object r0 = r0.get()
            X.1gM r0 = (X.C31931gM) r0
            r0.A00()
            X.1CJ r0 = r12.A00
            X.1ci r13 = r0.A0A(r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r13 != 0) goto L_0x015a
            r1.<init>()
            java.lang.String r0 = "msgstore/setchatseenonasynccommitthread/nochat/"
            r1.append(r0)
            r1.append(r9)
        L_0x014a:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0151:
            X.1gx r0 = r10.A0I
            r0.A0A(r9, r8)
            r0.A09(r9)
            goto L_0x00ed
        L_0x015a:
            r1.<init>()
            java.lang.String r14 = "msgstore/setchatseenonasynccommitthread/"
            r1.append(r14)
            r1.append(r9)
            java.lang.String r0 = "/"
            r1.append(r0)
            java.lang.String r0 = r13.A0B()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = r13.A0S
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x018f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r9)
            java.lang.String r0 = "/message already read"
            r1.append(r0)
            goto L_0x014a
        L_0x018f:
            java.lang.Object r0 = r19.get()
            X.1as r0 = (X.C28771as) r0
            X.0ve r3 = r0.A0G
            r1 = 7004(0x1b5c, float:9.815E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x01d3
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r17 = r2.iterator()
        L_0x01aa:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01c2
            java.lang.Object r15 = r17.next()
            X.206 r15 = (X.AnonymousClass206) r15
            long r2 = r15.A0y
            long r0 = r13.A0S
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 <= 0) goto L_0x01aa
            r14.add(r15)
            goto L_0x01aa
        L_0x01c2:
            java.lang.Object r0 = r19.get()
            X.1as r0 = (X.C28771as) r0
            X.10I r2 = r0.A0K
            r1 = 6
            X.3C4 r0 = new X.3C4
            r0.<init>(r12, r9, r14, r1)
            r2.CGF(r0)
        L_0x01d3:
            java.lang.Object r0 = r19.get()
            X.1as r0 = (X.C28771as) r0
            X.1NJ r0 = r0.A0C
            int r12 = r0.A02(r9, r4)
            java.lang.Object r0 = r19.get()
            X.1as r0 = (X.C28771as) r0
            X.1NJ r0 = r0.A0C
            int r3 = r0.A03(r9, r4)
            java.lang.Object r0 = r19.get()
            X.1as r0 = (X.C28771as) r0
            X.1ar r0 = r0.A09
            int r2 = r0.A00(r9, r4)
            int r1 = r12 - r3
            int r0 = r13.A0A
            if (r1 >= r0) goto L_0x0151
            r13.A0K(r1, r3, r12, r2)
            r13.A0R = r6
            r13.A0S = r4
            java.lang.Object r0 = r19.get()
            X.1as r0 = (X.C28771as) r0
            X.1N5 r0 = r0.A0H
            boolean r0 = r0.A04(r9)
            if (r0 == 0) goto L_0x0216
            r13.A0T = r6
            r13.A0U = r4
        L_0x0216:
            java.lang.Object r0 = r19.get()
            X.1as r0 = (X.C28771as) r0
            X.1LW r0 = r0.A07
            r0.A0H(r13)
            java.lang.Object r0 = r19.get()
            X.1as r0 = (X.C28771as) r0
            X.00H r0 = r0.A0N
            java.lang.Object r2 = r0.get()
            X.1Q1 r2 = (X.AnonymousClass1Q1) r2
            r1 = 0
            r0 = 0
            r2.A02(r9, r1, r0, r0)
            goto L_0x0151
        L_0x0236:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0241
            X.1gx r0 = r10.A0I
            r0.A08()
        L_0x0241:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32331h1.A02(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        if (r9 == 8) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.AnonymousClass3KP r7, X.AnonymousClass205 r8, int r9) {
        /*
            r6 = this;
            X.00H r0 = r6.A09
            java.lang.Object r0 = r0.get()
            X.1gM r0 = (X.C31931gM) r0
            r0.A00()
            X.00H r2 = r6.A0K
            java.lang.Object r0 = r2.get()
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            X.1W2 r0 = r0.A01
            X.206 r3 = r0.A05(r8)
            r4 = 0
            if (r3 != 0) goto L_0x0031
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStatusStore/update/nosuchmessage: "
            r1.append(r0)
            r1.append(r8)
        L_0x0029:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r4
        L_0x0031:
            int r0 = r3.A0D()
            boolean r0 = X.C446824j.A02(r0, r9)
            if (r0 == 0) goto L_0x005d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStatusStore/update/statusdowngrade: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " current:"
            r1.append(r0)
            int r0 = r3.A0D()
            r1.append(r0)
            java.lang.String r0 = " new:"
            r1.append(r0)
            r1.append(r9)
            goto L_0x0029
        L_0x005d:
            r0 = 9
            if (r9 == r0) goto L_0x006a
            r0 = 10
            if (r9 == r0) goto L_0x006a
            r0 = 8
            r1 = 0
            if (r9 != r0) goto L_0x008d
        L_0x006a:
            r1 = 1
            boolean r0 = X.AnonymousClass25A.A0Z(r3)
            if (r0 != 0) goto L_0x008d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStatusStore/update/status-played-non-ptt or view-once: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " type="
            r1.append(r0)
            int r0 = r3.A0u
            java.lang.String r0 = X.AnonymousClass25A.A0B(r0)
            r1.append(r0)
            goto L_0x0029
        L_0x008d:
            r3.A0a(r9)
            if (r1 == 0) goto L_0x0097
            X.1WN r0 = r6.A0G
            r0.A03(r3)
        L_0x0097:
            long r4 = r3.A0I
            r0 = 4
            if (r9 != r0) goto L_0x00b5
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = "MessageStatusStore/update/receipt/server/delay "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00b5:
            r0 = 11
            r1 = -1
            if (r9 == r0) goto L_0x00cb
            r0 = 12
            if (r9 == r0) goto L_0x00cb
            r0 = 16
            if (r9 == r0) goto L_0x00cb
            r0 = 17
            if (r9 == r0) goto L_0x00cb
            X.1Q2 r0 = r6.A0E
            r0.A01(r3, r1)
        L_0x00cb:
            java.lang.Object r0 = r2.get()
            X.1W6 r0 = (X.AnonymousClass1W6) r0
            r0.A05(r3, r1)
            if (r7 == 0) goto L_0x00ee
            X.30j r7 = (X.C676630j) r7
            int r0 = r7.A00
            if (r0 == 0) goto L_0x00f0
            java.lang.Object r1 = r7.A01
            X.8ur r1 = (X.C173308ur) r1
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x00ee
            X.1Mn r2 = r1.A03
        L_0x00e6:
            r1 = 0
            java.util.Set r0 = java.util.Collections.singleton(r3)
            r2.A03(r0, r1)
        L_0x00ee:
            r0 = 1
            return r0
        L_0x00f0:
            boolean r1 = r7.A02
            java.lang.Object r0 = r7.A01
            X.30t r0 = (X.C677630t) r0
            if (r1 == 0) goto L_0x00ee
            X.1Mn r2 = r0.A01
            X.C17960vV.A07(r3)
            goto L_0x00e6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32331h1.A03(X.3KP, X.205, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0285, code lost:
        if (X.C22971Dz.A0a(r6) != false) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02a3, code lost:
        if (X.C22971Dz.A0d(r6) == false) goto L_0x02a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x034d, code lost:
        if (r21 == false) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        if (r0.A07(r6) < r11.A0x) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        if (X.C22971Dz.A0d(r9) == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016f, code lost:
        if (r21 == false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e0, code lost:
        if (r10 == 13) goto L_0x01e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x022a A[Catch:{ all -> 0x0467, all -> 0x046c, all -> 0x0471 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(com.whatsapp.jid.DeviceJid r34, X.AnonymousClass206 r35, int r36, long r37) {
        /*
            r33 = this;
            r10 = r36
            boolean r0 = X.C446824j.A01(r10)
            X.C17960vV.A0C(r0)
            r13 = r34
            com.whatsapp.jid.UserJid r9 = r13.userJid
            r11 = r35
            X.205 r8 = r11.A0v
            r1 = 0
            r12 = 0
            r3 = r37
            int r0 = (r37 > r1 ? 1 : (r37 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0037
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStatusStore/updatetargetstatus invalidtimestamp: key="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", timestamp="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0036:
            return r12
        L_0x0037:
            r7 = r33
            X.1N5 r0 = r7.A06
            X.1BI r6 = r8.A00
            boolean r0 = r0.A04(r6)
            if (r0 != 0) goto L_0x0050
            r0 = 13
            if (r10 == r0) goto L_0x004f
            r0 = 8
            if (r10 != r0) goto L_0x0050
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0050
        L_0x004f:
            r10 = 5
        L_0x0050:
            boolean r15 = r8.A02
            r5 = 0
            if (r15 != 0) goto L_0x0088
            X.11S r0 = r7.A01
            boolean r0 = X.AnonymousClass25A.A0R(r0, r11)
            if (r0 != 0) goto L_0x0088
            r0 = 8
            if (r10 == r0) goto L_0x006c
            r0 = 13
            r9 = 16
            if (r10 == r0) goto L_0x006e
            r9 = 17
            if (r10 == r9) goto L_0x006e
            return r12
        L_0x006c:
            r9 = 10
        L_0x006e:
            boolean r0 = A00(r8, r9)
            if (r0 == 0) goto L_0x0083
            X.1CJ r0 = r7.A02
            X.C17960vV.A07(r6)
            long r3 = r0.A07(r6)
            long r1 = r11.A0x
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0036
        L_0x0083:
            boolean r0 = r7.A03(r5, r8, r9)
            return r0
        L_0x0088:
            int r1 = r11.A0D()
            r0 = 6
            if (r1 != r0) goto L_0x00a4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStatusStore/updatetargetstatus invalidmessage: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r12
        L_0x00a4:
            r0 = 15
            if (r10 == r0) goto L_0x00b5
            r0 = 5
            if (r10 != r0) goto L_0x00bb
            X.11S r1 = r7.A01
            com.whatsapp.jid.UserJid r0 = r13.userJid
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x00bb
        L_0x00b5:
            X.1Qw r0 = r7.A0F
            r0.A04(r13, r11, r3)
            return r12
        L_0x00bb:
            boolean r25 = X.C22971Dz.A0e(r6)
            boolean r24 = X.C22971Dz.A0a(r6)
            boolean r23 = X.C22971Dz.A0N(r6)
            boolean r22 = X.C22971Dz.A0O(r6)
            X.00H r0 = r7.A0J
            java.lang.Object r1 = r0.get()
            X.1PW r1 = (X.AnonymousClass1PW) r1
            r0 = 1
            X.C18070vi.A0d(r9, r0)
            boolean r0 = r1.A0B(r11)
            if (r0 == 0) goto L_0x00e5
            boolean r0 = X.C22971Dz.A0d(r9)
            r21 = 1
            if (r0 != 0) goto L_0x00e7
        L_0x00e5:
            r21 = 0
        L_0x00e7:
            java.lang.String r5 = " new:"
            java.lang.String r2 = " current:"
            java.lang.String r1 = "MessageStatusStore/updatetargetstatus statusdowngrade: "
            if (r24 != 0) goto L_0x016b
            if (r23 == 0) goto L_0x0129
            X.00H r0 = r7.A0K
            java.lang.Object r14 = r0.get()
            X.1W6 r14 = (X.AnonymousClass1W6) r14
            X.C17960vV.A07(r9)
            java.lang.String r0 = r8.A01
            X.205 r12 = new X.205
            r12.<init>(r9, r0, r15)
            X.1W2 r0 = r14.A01
            X.206 r14 = r0.A05(r12)
            if (r14 != 0) goto L_0x01a2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "MessageStatusStore/updatetargetstatus nosuchmessage for broadcast: "
            r3.append(r0)
            r3.append(r8)
            java.lang.String r0 = " "
            r3.append(r0)
            r3.append(r13)
        L_0x0120:
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0127:
            r0 = 0
            return r0
        L_0x0129:
            if (r25 != 0) goto L_0x0171
            if (r21 != 0) goto L_0x0171
            int r12 = r11.A0D()
            boolean r0 = X.C446824j.A02(r12, r10)
            if (r0 == 0) goto L_0x01c9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r8)
            r6.append(r2)
            int r0 = r11.A0D()
            r6.append(r0)
            r6.append(r5)
            r6.append(r10)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1Qw r0 = r7.A0F
            X.C17960vV.A07(r13)
            r0.A04(r13, r11, r3)
            goto L_0x0127
        L_0x0162:
            r14.A0a(r10)
            X.1Q2 r12 = r7.A0E
            r0 = -1
            r12.A01(r14, r0)
        L_0x016b:
            if (r25 != 0) goto L_0x0171
            if (r24 != 0) goto L_0x0171
            if (r21 == 0) goto L_0x021c
        L_0x0171:
            X.1WX r0 = r7.A05
            X.2i9 r0 = r0.A00(r11)
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r9)
            X.2rQ r0 = (X.C62452rQ) r0
            if (r0 == 0) goto L_0x021c
            int r12 = r0.A00()
            boolean r0 = X.C446824j.A02(r12, r10)
            if (r0 == 0) goto L_0x021c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r8)
            java.lang.String r0 = " remoteUser:"
            r3.append(r0)
            r3.append(r9)
            r3.append(r2)
            goto L_0x01be
        L_0x01a2:
            int r0 = r14.A0D()
            boolean r0 = X.C446824j.A02(r0, r10)
            if (r0 == 0) goto L_0x0162
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r8)
            r3.append(r2)
            int r12 = r14.A0D()
        L_0x01be:
            r3.append(r12)
            r3.append(r5)
            r3.append(r10)
            goto L_0x0120
        L_0x01c9:
            r11.A0a(r10)
            X.1Q2 r1 = r7.A0E
            r0 = -1
            r1.A01(r11, r0)
            X.11S r0 = r7.A01
            boolean r0 = r0.A0P(r13)
            if (r0 != 0) goto L_0x021c
            r0 = 5
            if (r10 == r0) goto L_0x01e2
            r0 = 13
            r1 = 0
            if (r10 != r0) goto L_0x01e3
        L_0x01e2:
            r1 = 1
        L_0x01e3:
            r0 = 4
            if (r12 != r0) goto L_0x021c
            if (r1 == 0) goto L_0x021c
            X.11P r0 = r7.A0B
            long r15 = X.AnonymousClass11P.A01(r0)
            long r0 = r11.A0I
            long r15 = r15 - r0
            X.1PT r12 = r7.A0H
            r14 = 1
            X.2FQ r1 = new X.2FQ
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            r1.A02 = r0
            X.00H r0 = r12.A0S
            java.lang.Object r0 = r0.get()
            X.2r5 r0 = (X.C62242r5) r0
            int r0 = r0.A01(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r1.A01 = r0
            X.18K r0 = r12.A0C
            r0.CC7(r1)
        L_0x021c:
            X.1Cd r0 = r7.A03
            X.1au r20 = r0.A05()
            X.1xA r19 = r20.BD0()     // Catch:{ all -> 0x0471 }
            boolean r0 = r11.A0z     // Catch:{ all -> 0x0467 }
            if (r0 != 0) goto L_0x026b
            X.1WX r12 = r7.A05     // Catch:{ all -> 0x0467 }
            java.util.Set r0 = r12.A06     // Catch:{ all -> 0x0467 }
            boolean r0 = r0.contains(r8)     // Catch:{ all -> 0x0467 }
            if (r0 != 0) goto L_0x026b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0467 }
            r14.<init>()     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = "receiptmanager/addMessageReceipt: key="
            r14.append(r0)     // Catch:{ all -> 0x0467 }
            r14.append(r8)     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = ", remoteDevice="
            r14.append(r0)     // Catch:{ all -> 0x0467 }
            r14.append(r13)     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = ", status="
            r14.append(r0)     // Catch:{ all -> 0x0467 }
            r14.append(r10)     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = ", ts="
            r14.append(r0)     // Catch:{ all -> 0x0467 }
            r14.append(r3)     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = ", rowId="
            r14.append(r0)     // Catch:{ all -> 0x0467 }
            long r0 = r11.A0x     // Catch:{ all -> 0x0467 }
            r14.append(r0)     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x0467 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0467 }
            goto L_0x0276
        L_0x026b:
            r19.A00()     // Catch:{ all -> 0x0467 }
            r19.close()     // Catch:{ all -> 0x0471 }
            r20.close()
            goto L_0x0127
        L_0x0276:
            if (r6 == 0) goto L_0x02f0
            boolean r0 = X.C22971Dz.A0e(r6)     // Catch:{ all -> 0x0467 }
            r14 = 1
            if (r0 != 0) goto L_0x0287
            boolean r0 = X.C22971Dz.A0a(r6)     // Catch:{ all -> 0x0467 }
            r18 = 0
            if (r0 == 0) goto L_0x0289
        L_0x0287:
            r18 = 1
        L_0x0289:
            X.0zA r1 = r12.A01     // Catch:{ all -> 0x0467 }
            boolean r0 = r1.A07()     // Catch:{ all -> 0x0467 }
            if (r0 == 0) goto L_0x02a5
            java.lang.Object r0 = r1.A03()     // Catch:{ all -> 0x0467 }
            X.1PW r0 = (X.AnonymousClass1PW) r0     // Catch:{ all -> 0x0467 }
            boolean r0 = r0.A0B(r11)     // Catch:{ all -> 0x0467 }
            if (r0 == 0) goto L_0x02a5
            boolean r0 = X.C22971Dz.A0d(r6)     // Catch:{ all -> 0x0467 }
            r17 = 1
            if (r0 != 0) goto L_0x02a7
        L_0x02a5:
            r17 = 0
        L_0x02a7:
            boolean r16 = X.C22971Dz.A0N(r6)     // Catch:{ all -> 0x0467 }
            X.1Qw r0 = r12.A03     // Catch:{ all -> 0x0467 }
            r0.A04(r13, r11, r3)     // Catch:{ all -> 0x0467 }
            com.whatsapp.jid.UserJid r13 = r13.userJid     // Catch:{ all -> 0x0467 }
            X.1WW r0 = r12.A04     // Catch:{ all -> 0x0467 }
            r26 = r0
            long r0 = r11.A0x     // Catch:{ all -> 0x0467 }
            r27 = r13
            r28 = r10
            r29 = r0
            r31 = r3
            r26.A01(r27, r28, r29, r31)     // Catch:{ all -> 0x0467 }
            boolean r0 = X.C22971Dz.A0N(r6)     // Catch:{ all -> 0x0467 }
            if (r0 == 0) goto L_0x02ea
            X.00H r0 = r12.A05     // Catch:{ all -> 0x0467 }
            java.lang.Object r15 = r0.get()     // Catch:{ all -> 0x0467 }
            X.1W6 r15 = (X.AnonymousClass1W6) r15     // Catch:{ all -> 0x0467 }
            X.C17960vV.A07(r13)     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x0467 }
            X.205 r1 = new X.205     // Catch:{ all -> 0x0467 }
            r1.<init>(r13, r0, r14)     // Catch:{ all -> 0x0467 }
            X.1W2 r0 = r15.A01     // Catch:{ all -> 0x0467 }
            X.206 r0 = r0.A05(r1)     // Catch:{ all -> 0x0467 }
            if (r0 == 0) goto L_0x02ea
            long r0 = r0.A0x     // Catch:{ all -> 0x0467 }
            r29 = r0
            r26.A01(r27, r28, r29, r31)     // Catch:{ all -> 0x0467 }
        L_0x02ea:
            if (r18 != 0) goto L_0x02f2
            if (r16 != 0) goto L_0x02f2
            if (r17 != 0) goto L_0x02f2
        L_0x02f0:
            r1 = 0
            goto L_0x02f3
        L_0x02f2:
            r1 = 1
        L_0x02f3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0467 }
            r3.<init>()     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = "MessageStatusStore/updatetargetstatus added="
            r3.append(r0)     // Catch:{ all -> 0x0467 }
            r3.append(r1)     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = "; remoteChatJid="
            r3.append(r0)     // Catch:{ all -> 0x0467 }
            r3.append(r6)     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = "; status="
            r3.append(r0)     // Catch:{ all -> 0x0467 }
            r3.append(r10)     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = "; key.id="
            r3.append(r0)     // Catch:{ all -> 0x0467 }
            java.lang.String r4 = r8.A01     // Catch:{ all -> 0x0467 }
            r3.append(r4)     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0467 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0467 }
            if (r1 == 0) goto L_0x0331
            if (r22 == 0) goto L_0x0331
            X.122 r1 = r7.A0D     // Catch:{ all -> 0x0467 }
            r3 = 1
            X.205 r0 = new X.205     // Catch:{ all -> 0x0467 }
            r0.<init>(r9, r4, r3)     // Catch:{ all -> 0x0467 }
            r1.A0S(r0, r10)     // Catch:{ all -> 0x0467 }
            goto L_0x0332
        L_0x0331:
            r3 = 1
        L_0x0332:
            if (r25 != 0) goto L_0x033a
            if (r24 != 0) goto L_0x033a
            if (r23 != 0) goto L_0x033a
            if (r21 == 0) goto L_0x042e
        L_0x033a:
            boolean r0 = X.C22971Dz.A0e(r6)     // Catch:{ all -> 0x0467 }
            if (r0 != 0) goto L_0x034f
            boolean r0 = X.C22971Dz.A0a(r6)     // Catch:{ all -> 0x0467 }
            if (r0 != 0) goto L_0x034f
            boolean r0 = X.C22971Dz.A0N(r6)     // Catch:{ all -> 0x0467 }
            if (r0 != 0) goto L_0x034f
            r0 = 0
            if (r21 == 0) goto L_0x0350
        L_0x034f:
            r0 = 1
        L_0x0350:
            X.C17960vV.A0C(r0)     // Catch:{ all -> 0x0467 }
            X.2i9 r0 = r12.A00(r11)     // Catch:{ all -> 0x0467 }
            int r14 = r11.A0A     // Catch:{ all -> 0x0467 }
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00     // Catch:{ all -> 0x0467 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0467 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x0467 }
            r13 = 0
            r6 = 0
            r4 = 0
        L_0x0366:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0467 }
            r10 = 13
            if (r0 == 0) goto L_0x0389
            java.lang.Object r0 = r15.next()     // Catch:{ all -> 0x0467 }
            X.2rQ r0 = (X.C62452rQ) r0     // Catch:{ all -> 0x0467 }
            int r1 = r0.A00()     // Catch:{ all -> 0x0467 }
            r0 = 5
            if (r1 == r0) goto L_0x0386
            r0 = 8
            if (r1 == r0) goto L_0x0382
            if (r1 == r10) goto L_0x0384
            goto L_0x0366
        L_0x0382:
            int r13 = r13 + 1
        L_0x0384:
            int r6 = r6 + 1
        L_0x0386:
            int r4 = r4 + 1
            goto L_0x0366
        L_0x0389:
            if (r13 < r14) goto L_0x038e
            r10 = 8
            goto L_0x0394
        L_0x038e:
            if (r6 >= r14) goto L_0x0394
            r10 = 4
            if (r4 < r14) goto L_0x0394
            r10 = 5
        L_0x0394:
            int r0 = r11.A0D()     // Catch:{ all -> 0x0467 }
            if (r10 == r0) goto L_0x03d2
            int r0 = X.C446824j.A00(r0, r10)     // Catch:{ all -> 0x0467 }
            if (r0 <= 0) goto L_0x042b
            X.2i9 r0 = r12.A00(r11)     // Catch:{ all -> 0x0467 }
            java.util.concurrent.ConcurrentHashMap r1 = r0.A00     // Catch:{ all -> 0x0467 }
            int r0 = r1.size()     // Catch:{ all -> 0x0467 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0467 }
            r4.<init>(r0)     // Catch:{ all -> 0x0467 }
            java.util.Collection r0 = r1.values()     // Catch:{ all -> 0x0467 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0467 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0467 }
        L_0x03ba:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0467 }
            if (r0 == 0) goto L_0x03d4
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0467 }
            X.2rQ r0 = (X.C62452rQ) r0     // Catch:{ all -> 0x0467 }
            int r0 = r0.A00()     // Catch:{ all -> 0x0467 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0467 }
            r4.add(r0)     // Catch:{ all -> 0x0467 }
            goto L_0x03ba
        L_0x03d2:
            r3 = 0
            goto L_0x0444
        L_0x03d4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0467 }
            r1.<init>()     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = "MessageStatusStore/statusDowngrade: "
            r1.append(r0)     // Catch:{ all -> 0x0467 }
            r1.append(r8)     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = " fMessage:"
            r1.append(r0)     // Catch:{ all -> 0x0467 }
            int r0 = java.lang.System.identityHashCode(r11)     // Catch:{ all -> 0x0467 }
            r1.append(r0)     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = " remoteUser:"
            r1.append(r0)     // Catch:{ all -> 0x0467 }
            r1.append(r9)     // Catch:{ all -> 0x0467 }
            r1.append(r2)     // Catch:{ all -> 0x0467 }
            int r0 = r11.A0D()     // Catch:{ all -> 0x0467 }
            r1.append(r0)     // Catch:{ all -> 0x0467 }
            r1.append(r5)     // Catch:{ all -> 0x0467 }
            r1.append(r10)     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = " recipientCount:"
            r1.append(r0)     // Catch:{ all -> 0x0467 }
            int r0 = r11.A0A     // Catch:{ all -> 0x0467 }
            r1.append(r0)     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = " statuses:"
            r1.append(r0)     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)     // Catch:{ all -> 0x0467 }
            r1.append(r0)     // Catch:{ all -> 0x0467 }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0467 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0467 }
            X.190 r1 = r7.A00     // Catch:{ all -> 0x0467 }
            java.lang.String r0 = "MessageStatusStore/statusDowngrade"
            r1.A0G(r0, r2, r3)     // Catch:{ all -> 0x0467 }
        L_0x042b:
            r11.A0a(r10)     // Catch:{ all -> 0x0467 }
        L_0x042e:
            X.122 r0 = r7.A0D     // Catch:{ all -> 0x0467 }
            r0.A0S(r8, r10)     // Catch:{ all -> 0x0467 }
            X.1WN r0 = r7.A0G     // Catch:{ all -> 0x0467 }
            r0.A03(r11)     // Catch:{ all -> 0x0467 }
            r0 = 40
            X.3Bx r1 = new X.3Bx     // Catch:{ all -> 0x0467 }
            r1.<init>(r7, r11, r0)     // Catch:{ all -> 0x0467 }
            r0 = r20
            r0.BJ7(r1)     // Catch:{ all -> 0x0467 }
        L_0x0444:
            r19.A00()     // Catch:{ all -> 0x0467 }
            r19.close()     // Catch:{ all -> 0x0471 }
            r20.close()
            if (r3 == 0) goto L_0x045e
            X.1Q2 r0 = r7.A0E
            android.os.Handler r4 = r0.A02
            r0 = 2
            r2 = -1
            r1 = 0
        L_0x0456:
            android.os.Message r0 = android.os.Message.obtain(r4, r0, r2, r1, r11)
            r0.sendToTarget()
            return r3
        L_0x045e:
            r2 = -1
            r1 = 0
            X.1Q2 r0 = r7.A0E
            android.os.Handler r4 = r0.A02
            r0 = 10
            goto L_0x0456
        L_0x0467:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x046c }
            goto L_0x0470
        L_0x046c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0471 }
        L_0x0470:
            throw r1     // Catch:{ all -> 0x0471 }
        L_0x0471:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x0476 }
            throw r1
        L_0x0476:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32331h1.A04(com.whatsapp.jid.DeviceJid, X.206, int, long):boolean");
    }

    public C32331h1(AnonymousClass190 r2, AnonymousClass11S r3, AnonymousClass11P r4, C22621Co r5, AnonymousClass1CJ r6, AnonymousClass122 r7, AnonymousClass1Q2 r8, AnonymousClass1Q6 r9, AnonymousClass1Cd r10, C32321h0 r11, C26111Qw r12, AnonymousClass1WX r13, AnonymousClass1WN r14, AnonymousClass1N5 r15, AnonymousClass1N9 r16, C25011Mn r17, AnonymousClass1PT r18, C32291gx r19, AnonymousClass00H r20, AnonymousClass00H r21, AnonymousClass00H r22, AnonymousClass00H r23) {
        this.A0B = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r6;
        this.A0C = r5;
        this.A08 = r17;
        this.A07 = r16;
        this.A0L = r20;
        this.A0J = r21;
        this.A0E = r8;
        this.A0H = r18;
        this.A05 = r13;
        this.A0D = r7;
        this.A0K = r22;
        this.A06 = r15;
        this.A09 = r23;
        this.A0I = r19;
        this.A03 = r10;
        this.A04 = r11;
        this.A0F = r12;
        this.A0G = r14;
        this.A0A = r9.A02;
        r7.A01 = this;
    }
}
