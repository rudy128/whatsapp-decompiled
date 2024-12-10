package X;

import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel;
import com.whatsapp.jid.UserJid;

public class AH2 implements C24051Ir {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AH2(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r17v5, types: [X.9na] */
    /* JADX WARNING: type inference failed for: r17v8 */
    /* JADX WARNING: type inference failed for: r17v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ X.AnonymousClass1J2 BG9(java.lang.Class r68) {
        /*
            r67 = this;
            r1 = r67
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0030;
                case 1: goto L_0x03bf;
                case 2: goto L_0x039b;
                case 3: goto L_0x023a;
                case 4: goto L_0x00e0;
                case 5: goto L_0x00ac;
                case 6: goto L_0x0061;
                case 7: goto L_0x0035;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.9VB r0 = (X.AnonymousClass9VB) r0
            java.lang.Object r3 = r1.A02
            X.A2j r3 = (X.C19996A2j) r3
            X.1K2 r0 = r0.A00
            X.10E r2 = r0.A01
            X.1W6 r9 = X.AnonymousClass3Ma.A0s(r2)
            X.1Lg r6 = X.AnonymousClass3MZ.A0o(r2)
            X.00S r0 = r2.A3z
            java.lang.Object r1 = r0.get()
            X.1Qe r1 = (X.C25931Qe) r1
            X.2sn r5 = X.AnonymousClass10E.A1U(r2)
            X.8GV r0 = new X.8GV
            r4 = r0
            r7 = r1
            r8 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        L_0x0030:
            X.C60282nh.A01()
            r0 = 0
            throw r0
        L_0x0035:
            java.lang.Object r0 = r1.A01
            X.9iD r0 = (X.C188919iD) r0
            X.11P r9 = r0.A07
            X.0ve r8 = r0.A0G
            X.0vb r7 = r0.A09
            X.1LC r6 = r0.A03
            X.1i4 r5 = r0.A0F
            X.1QS r4 = r0.A0P
            X.1QD r3 = r0.A0L
            java.lang.Object r2 = r1.A02
            X.BD4 r2 = (X.BD4) r2
            X.A5Y r1 = r0.A0W
            X.96B r0 = new X.96B
            r10 = r0
            r11 = r6
            r12 = r9
            r13 = r7
            r14 = r5
            r15 = r8
            r16 = r3
            r17 = r4
            r18 = r2
            r19 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x0061:
            java.lang.Class<X.8GX> r0 = X.AnonymousClass8GX.class
            r2 = r68
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r8 = r1.A02
            android.net.Uri r8 = (android.net.Uri) r8
            java.lang.Object r1 = r1.A01
            com.whatsapp.payments.ui.ViralityLinkVerifierActivity r1 = (com.whatsapp.payments.ui.ViralityLinkVerifierActivity) r1
            X.11P r7 = r1.A05
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.BrazilViralityLinkVerifierActivity
            if (r0 == 0) goto L_0x009b
            X.96N r17 = new X.96N
            r17.<init>()
        L_0x007e:
            X.0zA r6 = r1.A05
            X.1ek r5 = r1.A0E
            X.1QS r4 = r1.A0C
            X.1QD r3 = r1.A09
            X.1QO r2 = r1.A0B
            X.1ex r1 = r1.A0A
            X.8GX r0 = new X.8GX
            r9 = r0
            r10 = r8
            r11 = r6
            r12 = r7
            r13 = r3
            r14 = r1
            r15 = r2
            r16 = r4
            r18 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x009b:
            X.9na r17 = new X.9na
            r17.<init>()
            goto L_0x007e
        L_0x00a1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Not aware about view model :"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass8BX.A0V(r2, r0, r1)
            throw r0
        L_0x00ac:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiStepUpActivity r2 = (com.whatsapp.payments.ui.IndiaUpiStepUpActivity) r2
            X.9V4 r0 = r2.A00
            java.lang.String r5 = r2.A06
            X.8zM r4 = r2.A04
            X.8pN r3 = r2.A01
            java.lang.Object r2 = r1.A02
            X.9mT r2 = (X.C191359mT) r2
            X.1K2 r0 = r0.A00
            X.10E r0 = r0.A01
            X.118 r7 = X.AnonymousClass3MZ.A0l(r0)
            X.1ek r13 = X.AnonymousClass8BT.A0V(r0)
            X.1QD r10 = X.AnonymousClass8BU.A0Q(r0)
            X.00S r0 = r0.A5E
            java.lang.Object r1 = r0.get()
            X.A7U r1 = (X.A7U) r1
            X.8Fe r0 = new X.8Fe
            r6 = r0
            r8 = r3
            r9 = r1
            r11 = r4
            r12 = r2
            r14 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x00e0:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity) r0
            X.9V2 r2 = r0.A01
            java.lang.Object r0 = r1.A02
            r21 = r0
            r0 = r21
            android.os.Bundle r0 = (android.os.Bundle) r0
            r21 = r0
            X.1K2 r3 = r2.A00
            X.10E r1 = r3.A01
            X.11P r29 = X.AnonymousClass10E.A6O(r1)
            X.1KB r22 = X.AnonymousClass10E.A12(r1)
            X.11S r23 = X.AnonymousClass10E.A17(r1)
            X.118 r30 = X.AnonymousClass3MZ.A0l(r1)
            X.10I r66 = X.AnonymousClass10E.AL1(r1)
            X.18O r24 = X.AnonymousClass3MZ.A0S(r1)
            X.0ve r38 = X.AnonymousClass10E.A8r(r1)
            X.00S r0 = r1.A94
            java.lang.Object r20 = r0.get()
            r0 = r20
            X.1KH r0 = (X.AnonymousClass1KH) r0
            r20 = r0
            X.1OZ r39 = X.AnonymousClass8BU.A0K(r1)
            X.1R2 r64 = X.AnonymousClass8BU.A0V(r1)
            X.1M9 r27 = X.AnonymousClass10E.A4z(r1)
            X.11C r28 = X.AnonymousClass3Ma.A0a(r1)
            X.0vb r31 = X.AnonymousClass10E.A6Q(r1)
            X.1ek r63 = X.AnonymousClass8BT.A0V(r1)
            X.1QS r52 = X.AnonymousClass3MZ.A0z(r1)
            X.00S r0 = r1.A0x
            java.lang.Object r19 = r0.get()
            r0 = r19
            X.1pj r0 = (X.C37551pj) r0
            r19 = r0
            X.122 r32 = X.AnonymousClass3MZ.A0n(r1)
            X.10G r2 = r1.A00
            X.00S r0 = r2.A2k
            java.lang.Object r18 = r0.get()
            r0 = r18
            X.A8C r0 = (X.A8C) r0
            r18 = r0
            X.1K1 r0 = r3.A00
            X.4Op r58 = X.AnonymousClass1K1.A1R(r0)
            X.1QD r48 = X.AnonymousClass8BU.A0Q(r1)
            X.00S r0 = r2.A3m
            java.lang.Object r17 = r0.get()
            r0 = r17
            X.A4C r0 = (X.A4C) r0
            r17 = r0
            X.00S r0 = r1.A7o
            java.lang.Object r16 = r0.get()
            r0 = r16
            X.1Qn r0 = (X.C26021Qn) r0
            r16 = r0
            X.AXh r41 = X.AnonymousClass8BU.A0M(r2)
            X.00S r0 = r1.A8K
            java.lang.Object r15 = r0.get()
            X.1em r15 = (X.C30951em) r15
            X.1QL r46 = X.AnonymousClass8BT.A0R(r1)
            X.00S r0 = r1.A86
            java.lang.Object r14 = r0.get()
            X.2lL r14 = (X.C58842lL) r14
            X.00S r0 = r1.A5E
            java.lang.Object r13 = r0.get()
            X.A7U r13 = (X.A7U) r13
            X.00S r0 = r1.A5G
            java.lang.Object r12 = r0.get()
            X.A6g r12 = (X.C20080A6g) r12
            X.1ex r50 = X.AnonymousClass8BU.A0R(r1)
            X.1QO r51 = X.AnonymousClass3Ma.A0q(r1)
            X.1KI r36 = X.AnonymousClass8BT.A0I(r1)
            X.00S r0 = r1.A87
            java.lang.Object r11 = r0.get()
            X.A56 r11 = (X.A56) r11
            X.1Ty r25 = X.AnonymousClass8BT.A0D(r1)
            X.A27 r54 = X.AnonymousClass8BU.A0S(r1)
            X.00S r0 = r1.A83
            java.lang.Object r10 = r0.get()
            X.1ig r10 = (X.C33351ig) r10
            X.00S r0 = r1.A8D
            java.lang.Object r9 = r0.get()
            X.1QR r9 = (X.AnonymousClass1QR) r9
            X.BD4 r55 = X.AnonymousClass8BT.A0T(r2)
            X.00S r0 = r2.A2l
            java.lang.Object r8 = r0.get()
            X.9uc r8 = (X.C196199uc) r8
            X.AXS r43 = X.AnonymousClass8BT.A0Q(r1)
            X.00S r0 = r1.A84
            java.lang.Object r7 = r0.get()
            X.1jG r7 = (X.C33711jG) r7
            X.00S r0 = r1.A8B
            java.lang.Object r6 = r0.get()
            X.1jA r6 = (X.C33651jA) r6
            X.00S r0 = r1.A8C
            java.lang.Object r5 = r0.get()
            X.2L2 r5 = (X.AnonymousClass2L2) r5
            X.00S r0 = r1.A6m
            java.lang.Object r4 = r0.get()
            X.1ib r4 = (X.C33301ib) r4
            X.00S r0 = r2.A2n
            java.lang.Object r3 = r0.get()
            X.90Z r3 = (X.AnonymousClass90Z) r3
            X.00S r0 = r2.A3k
            java.lang.Object r1 = r0.get()
            X.AQF r1 = (X.AQF) r1
            X.96K r0 = new X.96K
            r33 = r16
            r34 = r14
            r35 = r9
            r37 = r20
            r40 = r8
            r42 = r13
            r44 = r12
            r45 = r4
            r47 = r7
            r49 = r5
            r53 = r6
            r56 = r1
            r57 = r10
            r59 = r11
            r60 = r3
            r61 = r17
            r62 = r18
            r65 = r15
            r20 = r0
            r26 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            return r0
        L_0x023a:
            java.lang.Object r0 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity) r0
            X.9V1 r2 = r0.A00
            java.lang.Object r0 = r1.A02
            r21 = r0
            r0 = r21
            android.os.Bundle r0 = (android.os.Bundle) r0
            r21 = r0
            X.1KJ r0 = X.AnonymousClass966.A0K
            X.1K2 r3 = r2.A00
            X.10E r1 = r3.A01
            X.11P r29 = X.AnonymousClass10E.A6O(r1)
            X.1KB r22 = X.AnonymousClass10E.A12(r1)
            X.00S r0 = r1.A31
            r0.get()
            X.11S r23 = X.AnonymousClass10E.A17(r1)
            X.118 r30 = X.AnonymousClass3MZ.A0l(r1)
            X.10I r66 = X.AnonymousClass10E.AL1(r1)
            X.18O r24 = X.AnonymousClass3MZ.A0S(r1)
            X.0ve r38 = X.AnonymousClass10E.A8r(r1)
            X.00S r0 = r1.A94
            java.lang.Object r20 = r0.get()
            r0 = r20
            X.1KH r0 = (X.AnonymousClass1KH) r0
            r20 = r0
            X.1OZ r39 = X.AnonymousClass8BU.A0K(r1)
            X.1R2 r64 = X.AnonymousClass8BU.A0V(r1)
            X.1M9 r27 = X.AnonymousClass10E.A4z(r1)
            X.11C r28 = X.AnonymousClass3Ma.A0a(r1)
            X.0vb r31 = X.AnonymousClass10E.A6Q(r1)
            X.1ek r63 = X.AnonymousClass8BT.A0V(r1)
            X.1QS r52 = X.AnonymousClass3MZ.A0z(r1)
            X.00S r0 = r1.A0x
            java.lang.Object r19 = r0.get()
            r0 = r19
            X.1pj r0 = (X.C37551pj) r0
            r19 = r0
            X.122 r32 = X.AnonymousClass3MZ.A0n(r1)
            X.10G r2 = r1.A00
            X.00S r0 = r2.A2k
            java.lang.Object r18 = r0.get()
            r0 = r18
            X.A8C r0 = (X.A8C) r0
            r18 = r0
            X.1K1 r0 = r3.A00
            X.4Op r58 = X.AnonymousClass1K1.A1R(r0)
            X.1QD r48 = X.AnonymousClass8BU.A0Q(r1)
            X.00S r0 = r2.A3m
            java.lang.Object r17 = r0.get()
            r0 = r17
            X.A4C r0 = (X.A4C) r0
            r17 = r0
            X.00S r0 = r1.A7o
            java.lang.Object r16 = r0.get()
            r0 = r16
            X.1Qn r0 = (X.C26021Qn) r0
            r16 = r0
            X.AXh r41 = X.AnonymousClass8BU.A0M(r2)
            X.00S r0 = r1.A8K
            java.lang.Object r15 = r0.get()
            X.1em r15 = (X.C30951em) r15
            X.1QL r46 = X.AnonymousClass8BT.A0R(r1)
            X.00S r0 = r1.A86
            java.lang.Object r14 = r0.get()
            X.2lL r14 = (X.C58842lL) r14
            X.00S r0 = r1.A5E
            java.lang.Object r13 = r0.get()
            X.A7U r13 = (X.A7U) r13
            X.00S r0 = r1.A5G
            java.lang.Object r12 = r0.get()
            X.A6g r12 = (X.C20080A6g) r12
            X.1ex r50 = X.AnonymousClass8BU.A0R(r1)
            X.1QO r51 = X.AnonymousClass3Ma.A0q(r1)
            X.1KI r36 = X.AnonymousClass8BT.A0I(r1)
            X.00S r0 = r1.A87
            java.lang.Object r11 = r0.get()
            X.A56 r11 = (X.A56) r11
            X.1Ty r25 = X.AnonymousClass8BT.A0D(r1)
            X.A27 r54 = X.AnonymousClass8BU.A0S(r1)
            X.00S r0 = r1.A83
            java.lang.Object r10 = r0.get()
            X.1ig r10 = (X.C33351ig) r10
            X.00S r0 = r1.A8D
            java.lang.Object r9 = r0.get()
            X.1QR r9 = (X.AnonymousClass1QR) r9
            X.BD4 r55 = X.AnonymousClass8BT.A0T(r2)
            X.00S r0 = r2.A2l
            java.lang.Object r8 = r0.get()
            X.9uc r8 = (X.C196199uc) r8
            X.AXS r43 = X.AnonymousClass8BT.A0Q(r1)
            X.00S r0 = r1.A84
            java.lang.Object r7 = r0.get()
            X.1jG r7 = (X.C33711jG) r7
            X.00S r0 = r1.A8B
            java.lang.Object r6 = r0.get()
            X.1jA r6 = (X.C33651jA) r6
            X.00S r0 = r1.A8C
            java.lang.Object r5 = r0.get()
            X.2L2 r5 = (X.AnonymousClass2L2) r5
            X.00S r0 = r1.A6m
            java.lang.Object r4 = r0.get()
            X.1ib r4 = (X.C33301ib) r4
            X.00S r0 = r2.A2n
            java.lang.Object r3 = r0.get()
            X.90Z r3 = (X.AnonymousClass90Z) r3
            X.00S r0 = r2.A3k
            java.lang.Object r1 = r0.get()
            X.AQF r1 = (X.AQF) r1
            X.966 r0 = new X.966
            r33 = r16
            r34 = r14
            r35 = r9
            r37 = r20
            r40 = r8
            r42 = r13
            r44 = r12
            r45 = r4
            r47 = r7
            r49 = r5
            r53 = r6
            r56 = r1
            r57 = r10
            r59 = r11
            r60 = r3
            r61 = r17
            r62 = r18
            r65 = r15
            r20 = r0
            r26 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            return r0
        L_0x039b:
            java.lang.Object r2 = r1.A01
            com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity r2 = (com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity) r2
            X.9Uy r0 = r2.A00
            X.77e r3 = r2.A03
            X.8pN r2 = r2.A01
            java.lang.Object r1 = r1.A02
            X.8zK r1 = (X.C175818zK) r1
            X.1K2 r0 = r0.A00
            X.10E r0 = r0.A01
            X.118 r5 = X.AnonymousClass3MZ.A0l(r0)
            X.0vb r6 = X.AnonymousClass10E.A6Q(r0)
            X.8FZ r0 = new X.8FZ
            r4 = r0
            r7 = r2
            r8 = r3
            r9 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        L_0x03bf:
            java.lang.Object r0 = r1.A01
            X.2Wx r0 = (X.C51082Wx) r0
            java.lang.Object r2 = r1.A02
            X.1EC r2 = (X.AnonymousClass1EC) r2
            X.1K2 r0 = r0.A00
            X.1K1 r0 = r0.A00
            X.10E r1 = r0.AAQ
            X.00S r0 = r1.ABA
            X.00H r5 = X.C000200d.A00(r0)
            X.00S r0 = r1.A6N
            X.00H r6 = X.C000200d.A00(r0)
            X.00S r0 = r1.A2f
            java.lang.Object r4 = r0.get()
            X.1M9 r4 = (X.AnonymousClass1M9) r4
            X.00S r0 = r1.A2L
            X.00H r7 = X.C000200d.A00(r0)
            X.00S r0 = r1.A3B
            X.00H r8 = X.C000200d.A00(r0)
            X.9fV r3 = new X.9fV
            r3.<init>(r4, r5, r6, r7, r8)
            X.8GM r0 = new X.8GM
            r0.<init>(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AH2.BG9(java.lang.Class):X.1J2");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.9iO, java.lang.Object] */
    public AnonymousClass1J2 BGl(C24091Iv r12, Class cls) {
        if (this.A00 != 0) {
            return C60282nh.A00(this, cls);
        }
        AnonymousClass10E r1 = ((C182499Up) this.A02).A00.A01;
        C19830z4 A0c = AnonymousClass3Ma.A0c(r1);
        CatalogManager catalogManager = (CatalogManager) r1.A1s.get();
        C19973A1i a1i = (C19973A1i) r1.A1r.get();
        return new PostcodeViewModel((C192179nw) r1.A1L.get(), catalogManager, new Object(), a1i, A0c, (UserJid) this.A01, (AnonymousClass4S5) r1.ABW.get(), AnonymousClass10E.AL1(r1), AnonymousClass3MZ.A1B(r1));
    }
}
