package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.8hr  reason: invalid class name and case insensitive filesystem */
public final class C167838hr extends C20997Acp {
    public C195119sp A00;
    public B9L A01;
    public final C190449kx A02;
    public final C19949A0g A03;
    public final AnonymousClass9ZD A04;
    public final AnonymousClass1KB A05;
    public final C20004A2u A06;
    public final AnonymousClass10I A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;

    public final void A03(C195119sp r5, B9L b9l) {
        C18070vi.A0d(b9l, 1);
        this.A01 = b9l;
        String A0T = C17890vO.A0T(this.A09);
        this.A06.A03("cart_view_tag");
        ((C195049si) this.A08.get()).A02(A0T, r5.A03, 253);
        C21459AkQ.A01(this.A07, this, r5, A0T, 25);
    }

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
        this.A06.A02("cart_view_tag");
        AnonymousClass9ZD r0 = this.A04;
        if (r0 != null) {
            r0.A00.remove(str);
        }
        ((C195049si) this.A08.get()).A00(str);
        this.A05.A0J(new C21424Ajr(this, 20));
        Log.i("RefreshCartProtocol/onDeliveryFailure");
        this.A00 = null;
    }

    public void Bre(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        C195119sp r2 = this.A00;
        if (r2 == null) {
            Log.e("RefreshCartProtocol/onDirectConnectionSucceeded/directConnectionRequestToRetry is null");
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        C17890vO.A1A(A10, AnonymousClass8BS.A0g(userJid, "RefreshCartProtocol/onDirectConnectionSucceeded/jid=", A10));
        B9L b9l = this.A01;
        if (b9l != null) {
            A03(r2, b9l);
            return;
        }
        throw C17880vN.A0g();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: X.ADp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.math.BigDecimal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v0, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v34 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7Z(X.C29621ca r44, java.lang.String r45) {
        /*
            r43 = this;
            r5 = r44
            r6 = r45
            boolean r1 = X.C18070vi.A15(r6, r5)
            r0 = r43
            X.A2u r3 = r0.A06
            java.lang.String r2 = "cart_view_tag"
            r3.A02(r2)
            X.9ZD r4 = r0.A04
            if (r4 == 0) goto L_0x031a
            java.util.concurrent.ConcurrentHashMap r2 = r4.A00
            java.lang.Object r3 = r2.get(r6)
            X.A8g r3 = (X.C20121A8g) r3
        L_0x001d:
            X.9F6 r3 = (X.AnonymousClass9F6) r3
            X.00H r2 = r0.A08
            java.lang.Object r2 = r2.get()
            X.9si r2 = (X.C195049si) r2
            r2.A01(r6)
            if (r3 == 0) goto L_0x0335
            if (r4 == 0) goto L_0x0033
            java.util.concurrent.ConcurrentHashMap r2 = r4.A00
            r2.remove(r6)
        L_0x0033:
            X.00H r2 = r0.A0A
            java.lang.Object r8 = r2.get()
            X.9cf r8 = (X.C185489cf) r8
            r7 = 1
            r11 = 2
            X.C108945cZ.A1N(r5)
            java.lang.Object r3 = r3.A00
            X.2rm r6 = X.AnonymousClass8BR.A0s()
            X.9wX r9 = X.C197339wX.A00
            r2 = 31
            X.Ahb r2 = X.C21290Ahb.A00(r3, r9, r2)
            java.lang.Object r2 = r2.BCF(r5, r6)
            if (r2 == 0) goto L_0x0330
            X.B9c[] r4 = new X.C22470B9c[r11]
            X.C21283AhU.A00(r4, r11, r1, r9)
            r3 = 3
            X.AhU r2 = new X.AhU
            r2.<init>(r9, r3)
            java.util.List r10 = X.C18070vi.A0O(r2, r4, r7)
            java.lang.String[] r4 = new java.lang.String[r11]
            java.lang.String r3 = "cart"
            r4[r1] = r3
            java.lang.String r2 = "price"
            r4[r7] = r2
            java.lang.String r2 = "PriceDetailsProvided|PriceDetailsNotProvided"
            java.lang.Object r14 = r6.A06(r5, r2, r10, r4)
            if (r14 == 0) goto L_0x032b
            X.B6E r14 = (X.B6E) r14
            java.lang.String[] r4 = new java.lang.String[r11]
            r4[r1] = r3
            java.lang.String r2 = "product"
            r4[r7] = r2
            r3 = 4
            X.AhU r2 = new X.AhU
            r2.<init>(r9, r3)
            java.util.ArrayList r15 = X.AnonymousClass8BX.A0l(r5, r6, r2, r4)
            if (r15 == 0) goto L_0x0326
            X.00H r2 = r8.A02
            java.lang.Object r2 = r2.get()
            X.9iQ r2 = (X.C189049iQ) r2
            X.A6S[] r11 = new X.A6S[r7]
            r6 = 0
            r11[r1] = r6
            java.math.BigDecimal[] r10 = new java.math.BigDecimal[r7]
            r10[r1] = r6
            java.math.BigDecimal[] r9 = new java.math.BigDecimal[r7]
            r9[r1] = r6
            X.9y4 r13 = new X.9y4
            r13.<init>(r2, r11, r10, r9)
            boolean r2 = r14 instanceof X.C178469Df
            if (r2 == 0) goto L_0x00e1
            X.9Df r14 = (X.C178469Df) r14
            X.9CY r2 = r14.A02
            if (r2 == 0) goto L_0x0317
            java.lang.String r3 = r2.A01
            boolean r2 = X.AnonymousClass1EG.A0H(r3)
            if (r2 != 0) goto L_0x0317
            X.A6S r5 = new X.A6S
            r5.<init>(r3)
        L_0x00bc:
            X.A6S[] r2 = r13.A01
            r2[r1] = r5
            X.9CX r2 = r14.A01
            java.math.BigDecimal[] r4 = r13.A03
            r12 = 0
            if (r2 == 0) goto L_0x0314
            if (r5 == 0) goto L_0x0314
            long r2 = r2.A00
            java.math.BigDecimal r2 = X.C197309wU.A00(r5, r2)
        L_0x00cf:
            r4[r1] = r2
            X.9CX r2 = r14.A00
            java.math.BigDecimal[] r4 = r13.A02
            if (r2 == 0) goto L_0x00df
            if (r5 == 0) goto L_0x00df
            long r2 = r2.A00
            java.math.BigDecimal r12 = X.C197309wU.A00(r5, r2)
        L_0x00df:
            r4[r1] = r12
        L_0x00e1:
            r4 = r11[r1]
            if (r4 == 0) goto L_0x00f2
            r3 = r10[r1]
            if (r3 == 0) goto L_0x00f2
            r2 = r9[r1]
            if (r2 == 0) goto L_0x00f2
            X.9cv r6 = new X.9cv
            r6.<init>(r4, r2, r3)
        L_0x00f2:
            X.00H r2 = r8.A00
            java.lang.Object r5 = X.C18070vi.A0E(r2)
            X.A6T r5 = (X.A6T) r5
            java.util.ArrayList r20 = X.AnonymousClass000.A13()
            java.util.Iterator r19 = r15.iterator()
        L_0x0102:
            boolean r2 = r19.hasNext()
            if (r2 == 0) goto L_0x031d
            java.lang.Object r8 = r19.next()
            X.9DL r8 = (X.AnonymousClass9DL) r8
            X.C18070vi.A0d(r8, r1)
            X.9hd r4 = new X.9hd
            r4.<init>()
            r4.A00 = r1
            r4.A0B = r7
            java.lang.Object r2 = r8.A00
            X.9CX r2 = (X.AnonymousClass9CX) r2
            if (r2 == 0) goto L_0x0310
            long r2 = r2.A00
        L_0x0122:
            r4.A01 = r2
            java.lang.Object r3 = r8.A01
            X.B9f r3 = (X.C22473B9f) r3
            X.9a9 r2 = new X.9a9
            r2.<init>(r4, r5)
            r3.BAP(r2)
            java.lang.Object r12 = r8.A03
            X.9DE r12 = (X.AnonymousClass9DE) r12
            X.A6S r11 = r4.A05
            X.00H r2 = r5.A01
            java.lang.Object r10 = r2.get()
            X.9eJ r10 = (X.C186509eJ) r10
            if (r12 != 0) goto L_0x019b
            r2 = 0
        L_0x0141:
            r4.A04 = r2
            java.lang.String r11 = r4.A06
            java.lang.String r10 = r4.A07
            if (r11 == 0) goto L_0x0102
            if (r10 == 0) goto L_0x0102
            java.math.BigDecimal r2 = r4.A08
            r16 = r2
            X.A6S r15 = r4.A05
            r22 = 0
            java.util.List r2 = r4.A09
            java.util.ArrayList r36 = X.C29431cG.A0m(r2)
            java.util.List r2 = r4.A0A
            java.util.ArrayList r37 = X.C29431cG.A0m(r2)
            X.AEJ r14 = r4.A02
            X.AE5 r13 = r4.A03
            int r9 = r4.A00
            boolean r8 = r4.A0B
            long r2 = r4.A01
            X.AE6 r12 = r4.A04
            X.AEv r4 = new X.AEv
            r30 = r22
            r31 = r22
            r32 = r22
            r33 = r22
            r34 = r22
            r21 = r4
            r23 = r22
            r24 = r14
            r25 = r13
            r26 = r12
            r27 = r15
            r28 = r11
            r29 = r10
            r35 = r16
            r38 = r9
            r39 = r2
            r41 = r8
            r42 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r42)
            r2 = r20
            r2.add(r4)
            goto L_0x0102
        L_0x019b:
            X.00H r2 = r10.A03
            java.lang.Object r14 = r2.get()
            X.9wx r14 = (X.C197599wx) r14
            java.lang.Object r2 = r12.A05
            X.9DN r2 = (X.AnonymousClass9DN) r2
            r9 = 0
            if (r2 == 0) goto L_0x0229
            java.lang.Object r2 = r2.A01
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.Iterator r18 = r2.iterator()
        L_0x01b6:
            boolean r2 = r18.hasNext()
            if (r2 == 0) goto L_0x0229
            java.lang.Object r3 = r18.next()
            X.9DH r3 = (X.AnonymousClass9DH) r3
            java.lang.String r2 = r3.A02
            r27 = r2
            java.lang.Object r2 = r3.A01
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
            java.util.Iterator r17 = r2.iterator()
        L_0x01d2:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x021d
            java.lang.Object r2 = r17.next()
            X.9DH r2 = (X.AnonymousClass9DH) r2
            java.lang.String r8 = r2.A02
            java.lang.Object r3 = r2.A01
            X.9D1 r3 = (X.AnonymousClass9D1) r3
            if (r3 != 0) goto L_0x01ef
            X.8iQ r3 = new X.8iQ
            r3.<init>(r8)
        L_0x01eb:
            r13.add(r3)
            goto L_0x01d2
        L_0x01ef:
            X.00H r2 = r14.A00
            java.lang.Object r2 = r2.get()
            X.C18070vi.A0X(r2)
            java.lang.String r2 = r3.A04
            r22 = r2
            java.lang.String r2 = r3.A05
            r23 = r2
            java.lang.String r2 = r3.A06
            r24 = r2
            long r15 = r3.A01
            int r2 = (int) r15
            r16 = r2
            long r2 = r3.A00
            int r15 = (int) r2
            X.AEI r2 = new X.AEI
            r21 = r2
            r25 = r16
            r26 = r15
            r21.<init>(r22, r23, r24, r25, r26)
            X.8iR r3 = new X.8iR
            r3.<init>(r2, r8)
            goto L_0x01eb
        L_0x021d:
            r2 = r27
            X.ADA r2 = X.C197599wx.A00(r2, r13)
            if (r2 == 0) goto L_0x01b6
            r9.add(r2)
            goto L_0x01b6
        L_0x0229:
            X.00H r2 = r10.A00
            r2.get()
            java.lang.Object r2 = r12.A01
            X.9DN r2 = (X.AnonymousClass9DN) r2
            r14 = 0
            if (r2 == 0) goto L_0x0291
            java.lang.Object r2 = r2.A00
            X.9DN r2 = (X.AnonymousClass9DN) r2
            if (r2 == 0) goto L_0x0291
            java.lang.Object r2 = r2.A01
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
            java.util.Iterator r17 = r2.iterator()
        L_0x0247:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x028c
            java.lang.Object r15 = r17.next()
            X.9DI r15 = (X.AnonymousClass9DI) r15
            java.lang.Object r2 = r15.A02
            X.9CY r2 = (X.AnonymousClass9CY) r2
            if (r2 == 0) goto L_0x0247
            java.lang.String r14 = r2.A01
            java.lang.String r3 = r15.A03
            java.lang.String r2 = "true"
            boolean r8 = X.C18070vi.A18(r3, r2)
            java.lang.Object r2 = r15.A01
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r3 = X.C29351c6.A0D(r2)
            java.util.Iterator r16 = r2.iterator()
        L_0x026f:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0283
            java.lang.Object r2 = r16.next()
            X.9Ci r2 = (X.C178239Ci) r2
            java.lang.String r15 = r2.A01
            java.lang.String r2 = r2.A02
            X.AnonymousClass8BT.A1Q(r15, r2, r3)
            goto L_0x026f
        L_0x0283:
            X.ADo r2 = new X.ADo
            r2.<init>(r14, r3, r8)
            r13.add(r2)
            goto L_0x0247
        L_0x028c:
            X.ADW r14 = new X.ADW
            r14.<init>(r13)
        L_0x0291:
            X.00H r2 = r10.A01
            r2.get()
            java.lang.Object r15 = r12.A02
            X.9DL r15 = (X.AnonymousClass9DL) r15
            r3 = 0
            if (r15 == 0) goto L_0x02dd
            java.lang.Object r2 = r15.A00
            X.9CY r2 = (X.AnonymousClass9CY) r2
            if (r2 == 0) goto L_0x02be
            java.lang.String r13 = r2.A01
        L_0x02a5:
            java.lang.Object r2 = r15.A02
            X.9CY r2 = (X.AnonymousClass9CY) r2
            r8 = 0
            if (r2 == 0) goto L_0x02b5
            java.lang.String r2 = r2.A01
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 != r7) goto L_0x02b5
            r8 = 1
        L_0x02b5:
            java.lang.Object r2 = r15.A01
            X.9CY r2 = (X.AnonymousClass9CY) r2
            if (r2 == 0) goto L_0x02d7
            java.lang.String r15 = r2.A01
            goto L_0x02c0
        L_0x02be:
            r13 = r3
            goto L_0x02a5
        L_0x02c0:
            X.1wr r2 = X.C182189Tk.A00     // Catch:{ NumberFormatException -> 0x02d7 }
            boolean r2 = r2.A03(r15)     // Catch:{ NumberFormatException -> 0x02d7 }
            if (r2 == 0) goto L_0x02d7
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x02d7 }
            r2.<init>(r15)     // Catch:{ NumberFormatException -> 0x02d7 }
            if (r11 == 0) goto L_0x02d7
            long r2 = r2.longValue()
            java.math.BigDecimal r3 = X.C197309wU.A00(r11, r2)
        L_0x02d7:
            X.ADp r2 = new X.ADp
            r2.<init>(r13, r3, r8)
            r3 = r2
        L_0x02dd:
            X.00H r2 = r10.A02
            r2.get()
            java.lang.Object r2 = r12.A04
            X.9DN r2 = (X.AnonymousClass9DN) r2
            if (r2 == 0) goto L_0x0308
            java.lang.Object r2 = r2.A01
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r11 = X.C29351c6.A0D(r2)
            java.util.Iterator r10 = r2.iterator()
        L_0x02f4:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0309
            java.lang.Object r2 = r10.next()
            X.9Ci r2 = (X.C178239Ci) r2
            java.lang.String r8 = r2.A01
            java.lang.String r2 = r2.A02
            X.AnonymousClass8BT.A1Q(r8, r2, r11)
            goto L_0x02f4
        L_0x0308:
            r11 = 0
        L_0x0309:
            X.AE6 r2 = new X.AE6
            r2.<init>(r14, r3, r9, r11)
            goto L_0x0141
        L_0x0310:
            r2 = 99
            goto L_0x0122
        L_0x0314:
            r2 = r6
            goto L_0x00cf
        L_0x0317:
            r5 = 0
            goto L_0x00bc
        L_0x031a:
            r3 = 0
            goto L_0x001d
        L_0x031d:
            X.9q4 r3 = new X.9q4
            r2 = r20
            r3.<init>(r6, r2)
            goto L_0x03e4
        L_0x0326:
            X.1UI r0 = X.AnonymousClass1O9.A00(r6)
            throw r0
        L_0x032b:
            X.1UI r0 = X.AnonymousClass1O9.A00(r6)
            throw r0
        L_0x0330:
            X.1UI r0 = X.AnonymousClass1O9.A00(r6)
            throw r0
        L_0x0335:
            X.00H r2 = r0.A0A
            java.lang.Object r2 = r2.get()
            X.9cf r2 = (X.C185489cf) r2
            java.lang.String r3 = "cart"
            X.1ca r3 = r5.A0K(r3)
            if (r3 == 0) goto L_0x03cb
            java.lang.String r4 = "product"
            java.util.List r5 = r3.A0R(r4)
            java.util.ArrayList r4 = X.C108965cb.A0t(r5)
            java.util.Iterator r8 = r5.iterator()
        L_0x0353:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x03cd
            X.1ca r7 = X.C17880vN.A0a(r8)
            X.00H r5 = r2.A00
            java.lang.Object r5 = r5.get()
            X.A6T r5 = (X.A6T) r5
            X.C18070vi.A0b(r7)
            X.AEv r9 = r5.A03(r7)
            if (r9 != 0) goto L_0x03b0
            X.00H r5 = r2.A01
            r5.get()
            java.lang.String r5 = "id"
            X.1ca r6 = r7.A0K(r5)
            java.lang.String r5 = "status"
            X.1ca r5 = r7.A0K(r5)
            r10 = 0
            if (r6 != 0) goto L_0x03c6
            r16 = r10
        L_0x0384:
            if (r5 != 0) goto L_0x03b4
            r12 = r10
        L_0x0387:
            if (r16 == 0) goto L_0x0353
            java.util.ArrayList r24 = X.AnonymousClass000.A13()
            java.util.ArrayList r25 = X.AnonymousClass000.A13()
            java.lang.String r17 = ""
            r27 = 99
            r29 = 1
            X.AEv r9 = new X.AEv
            r13 = r10
            r14 = r10
            r15 = r10
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r10
            r22 = r10
            r23 = r10
            r30 = r1
            r11 = r10
            r26 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30)
        L_0x03b0:
            r4.add(r9)
            goto L_0x0353
        L_0x03b4:
            r21 = 3
            X.AEJ r12 = new X.AEJ
            r19 = r10
            r20 = r10
            r17 = r12
            r18 = r10
            r22 = r1
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x0387
        L_0x03c6:
            java.lang.String r16 = r6.A0M()
            goto L_0x0384
        L_0x03cb:
            r3 = 0
            goto L_0x03e4
        L_0x03cd:
            X.00H r2 = r2.A02
            java.lang.Object r5 = r2.get()
            X.9iQ r5 = (X.C189049iQ) r5
            java.lang.String r2 = "price"
            X.1ca r2 = r3.A0K(r2)
            X.9cv r2 = r5.A00(r2)
            X.9q4 r3 = new X.9q4
            r3.<init>(r2, r4)
        L_0x03e4:
            r2 = 0
            r0.A00 = r2
            X.1KB r2 = r0.A05
            X.C21450AkH.A00(r2, r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167838hr.C7Z(X.1ca, java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C167838hr(AnonymousClass1KB r3, C26911Ty r4, C190449kx r5, C18030ve r6, C19949A0g a0g, C20004A2u a2u, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        super(r4);
        AnonymousClass9ZD r0;
        C18070vi.A0w(r4, r3, a2u, r10, r11);
        C18070vi.A0x(a0g, r12, r6, r9, r5);
        this.A05 = r3;
        this.A06 = a2u;
        this.A09 = r10;
        this.A0A = r11;
        this.A03 = a0g;
        this.A08 = r12;
        this.A07 = r9;
        this.A02 = r5;
        if (C18020vd.A05(C18040vf.A02, r6, 6503)) {
            r0 = new AnonymousClass9ZD();
        } else {
            r0 = null;
        }
        this.A04 = r0;
    }

    public void Brd(UserJid userJid) {
        StringBuilder A0K = C18070vi.A0K(userJid);
        C17890vO.A19(A0K, AnonymousClass8BS.A0g(userJid, "RefreshCartProtocol/onDirectConnectionError/jid=", A0K));
        this.A05.A0J(new C21424Ajr(this, 19));
        this.A00 = null;
    }

    public void Bt9(C29621ca r4, String str) {
        C18070vi.A0h(str, r4);
        this.A06.A02("cart_view_tag");
        ((C195049si) this.A08.get()).A00(str);
        AnonymousClass9ZD r0 = this.A04;
        if (r0 != null) {
            r0.A00.remove(str);
        }
        Pair A012 = C60482o6.A01(r4);
        C195119sp r02 = this.A00;
        if (!(r02 == null || A012 == null)) {
            UserJid userJid = r02.A03;
            Object obj = A012.first;
            C18070vi.A0W(obj);
            if (A02(userJid, AnonymousClass000.A0M(obj))) {
                return;
            }
        }
        this.A00 = null;
        C21453AkK.A01(this.A05, A012, this, 49);
    }
}
