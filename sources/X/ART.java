package X;

import java.util.Iterator;
import java.util.List;

public class ART implements C22499BAg {
    public final AnonymousClass1QD A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass181 A02;
    public final AnonymousClass11P A03;
    public final C48052Kz A04;
    public final AnonymousClass1QL A05;
    public final C31051ew A06;
    public final AnonymousClass1QS A07;
    public final C20037A4g A08;

    public ART(AnonymousClass1KB r1, AnonymousClass181 r2, AnonymousClass11P r3, C48052Kz r4, AnonymousClass1QL r5, C31051ew r6, AnonymousClass1QD r7, AnonymousClass1QS r8, C20037A4g a4g) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
        this.A07 = r8;
        this.A00 = r7;
        this.A05 = r5;
        this.A08 = a4g;
        this.A04 = r4;
        this.A06 = r6;
    }

    public void BBx(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20284AEs A0P = AnonymousClass8BR.A0P(it);
            int A052 = A0P.A05();
            if (!(A052 == 1 || A052 == 4)) {
                if (A052 == 5) {
                    AnonymousClass1QK A022 = this.A07.A02("merchant_account_linking_context");
                    A022.A0A(A022.A04("add_business"));
                } else if (!(A052 == 6 || A052 == 7)) {
                    C17900vP.A0Z(A0P, "PAY: Not supported method type for Brazil: ", AnonymousClass000.A10());
                }
            }
            AnonymousClass1QS r2 = this.A07;
            r2.A02("p2p_context").A0B("add_card");
            r2.A02("p2m_context").A0B("add_card");
        }
        AnonymousClass1KB r3 = this.A01;
        C48052Kz r22 = this.A04;
        r22.getClass();
        r3.CGP(new C21425Ajs((Object) r22, 24));
    }

    /* JADX WARNING: type inference failed for: r0v45, types: [X.8pD, X.9b0] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BCx(X.C20284AEs r7) {
        /*
            r6 = this;
            int r2 = r7.A05()
            r0 = 1
            if (r2 == r0) goto L_0x0134
            r0 = 4
            if (r2 == r0) goto L_0x0134
            r0 = 5
            if (r2 == r0) goto L_0x0021
            r0 = 6
            if (r2 == r0) goto L_0x0134
            r0 = 7
            if (r2 == r0) goto L_0x0134
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: method type not expected: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r2)
        L_0x001d:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0020:
            return
        L_0x0021:
            X.8pb r3 = r7.A08
            X.8pZ r3 = (X.AnonymousClass8pZ) r3
            if (r3 == 0) goto L_0x0130
            X.1QS r0 = r6.A07
            X.1KH r1 = X.AnonymousClass8BR.A0R(r0)
            java.lang.String r0 = r7.A0A
            X.AEs r4 = r1.A08(r0)
            if (r4 == 0) goto L_0x0020
            X.8pb r0 = r4.A08
            if (r0 == 0) goto L_0x0020
            X.8pD r0 = new X.8pD
            r0.<init>(r4)
            java.lang.String r2 = r0.A00()
            X.1QD r0 = r6.A00
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "payment_merchant_previous_display_state"
            X.C17880vN.A1E(r1, r0, r2)
            X.8pb r4 = r4.A08
            X.8pZ r4 = (X.AnonymousClass8pZ) r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            java.lang.String r0 = r3.A09
            if (r0 == 0) goto L_0x005f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0063
        L_0x005f:
            java.lang.String r0 = r4.A09
            r3.A09 = r0
        L_0x0063:
            java.lang.String r0 = r3.A0C
            if (r0 == 0) goto L_0x006d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0071
        L_0x006d:
            java.lang.String r0 = r4.A0C
            r3.A0C = r0
        L_0x0071:
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x007b
            int r0 = r0.length()
            if (r0 != 0) goto L_0x007f
        L_0x007b:
            java.lang.String r0 = r4.A03
            r3.A03 = r0
        L_0x007f:
            java.lang.String r0 = r3.A06
            if (r0 == 0) goto L_0x0089
            int r0 = r0.length()
            if (r0 != 0) goto L_0x008d
        L_0x0089:
            java.lang.String r0 = r4.A06
            r3.A06 = r0
        L_0x008d:
            java.lang.String r5 = r3.A07
            if (r5 == 0) goto L_0x0097
            int r0 = r5.length()
            if (r0 != 0) goto L_0x009b
        L_0x0097:
            java.lang.String r5 = r4.A07
            r3.A07 = r5
        L_0x009b:
            java.lang.String r0 = r3.A0B
            if (r0 == 0) goto L_0x00a5
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00a9
        L_0x00a5:
            java.lang.String r0 = r4.A0B
            r3.A0B = r0
        L_0x00a9:
            boolean r0 = r4.A0E
            r3.A0E = r0
            boolean r0 = r4.A0F
            r3.A0F = r0
            int r0 = r4.A00
            r3.A00 = r0
            java.lang.String r2 = "ACTIVE"
            boolean r0 = r2.equals(r5)
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = "INITED"
            java.lang.String r1 = r4.A07
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = "MERCHANT_LINKED"
        L_0x00c9:
            r3.A04 = r0
        L_0x00cb:
            java.lang.String r0 = r3.A08
            if (r0 == 0) goto L_0x00d5
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00d9
        L_0x00d5:
            java.lang.String r0 = r4.A08
            r3.A08 = r0
        L_0x00d9:
            java.lang.String r0 = r3.A05
            if (r0 == 0) goto L_0x00e3
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00e7
        L_0x00e3:
            java.lang.String r0 = r4.A05
            r3.A05 = r0
        L_0x00e7:
            int r1 = r3.A01
            r0 = -1
            if (r1 != r0) goto L_0x0020
            int r0 = r4.A01
            r3.A01 = r0
            return
        L_0x00f1:
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x00fa
            java.lang.String r0 = "MERCHANT_VERIFIED"
            goto L_0x00c9
        L_0x00fa:
            java.lang.String r2 = "PENDING"
            boolean r0 = r2.equals(r5)
            if (r0 != 0) goto L_0x010a
            java.lang.String r0 = "INITED"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x011d
        L_0x010a:
            java.lang.String r1 = r4.A07
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x011d
            java.lang.String r0 = "INITED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x011d
            java.lang.String r0 = "MERCHANT_VERIFICATION_FAILURE"
            goto L_0x00c9
        L_0x011d:
            java.lang.String r1 = "EXTERNALLY_DISABLED"
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = r4.A07
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00cb
            java.lang.String r0 = "MERCHANT_DISABLED"
            goto L_0x00c9
        L_0x0130:
            java.lang.String r0 = "PAY:BrazilPaymentStorageObserver/beforeMethodAdded: methodData is null"
            goto L_0x001d
        L_0x0134:
            X.8pb r2 = r7.A08
            X.8pT r2 = (X.AnonymousClass8pT) r2
            if (r2 == 0) goto L_0x0020
            java.lang.String r1 = r2.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x014e
            byte[] r0 = r7.A0D
            if (r0 == 0) goto L_0x014e
            X.181 r0 = r6.A02
            byte[] r0 = X.A8e.A09(r0, r1)
            r7.A0D = r0
        L_0x014e:
            X.1QS r0 = r6.A07
            X.1KH r1 = X.AnonymousClass8BR.A0R(r0)
            java.lang.String r0 = r7.A0A
            X.AEs r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0020
            X.8pb r3 = r0.A08
            if (r3 == 0) goto L_0x0020
            X.8pT r3 = (X.AnonymousClass8pT) r3
            X.11P r4 = r6.A03
            X.C18070vi.A0h(r3, r4)
            boolean r0 = r2.A0a
            if (r0 != 0) goto L_0x0173
            boolean r0 = r3.A0Q
            r2.A0Q = r0
            int r0 = r3.A02
            r2.A02 = r0
        L_0x0173:
            java.lang.String r0 = r2.A05
            if (r0 == 0) goto L_0x017d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0181
        L_0x017d:
            java.lang.String r0 = r3.A05
            r2.A05 = r0
        L_0x0181:
            java.lang.String r0 = r2.A02
            if (r0 == 0) goto L_0x018b
            int r0 = r0.length()
            if (r0 != 0) goto L_0x018f
        L_0x018b:
            java.lang.String r0 = r3.A02
            r2.A02 = r0
        L_0x018f:
            java.lang.String r1 = r2.A0C
            if (r1 == 0) goto L_0x01d9
            int r0 = r1.length()
            if (r0 == 0) goto L_0x01d9
            java.lang.String r0 = r3.A0C
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01d9
            r0 = 0
            r2.A0E = r0
        L_0x01a4:
            r2.A0D = r0
        L_0x01a6:
            java.lang.String r1 = r2.A0J
            if (r1 == 0) goto L_0x01be
            int r0 = r1.length()
            if (r0 == 0) goto L_0x01be
            java.lang.String r0 = r3.A0J
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01be
            java.lang.Long r0 = X.AnonymousClass8BU.A0l(r4)
            r2.A09 = r0
        L_0x01be:
            boolean r0 = r3.A0a
            if (r0 != 0) goto L_0x01ca
            boolean r0 = r2.A0a
            if (r0 == 0) goto L_0x01ca
            java.lang.String r0 = "PAYMENT_METHOD_VERIFIED"
            r2.A04 = r0
        L_0x01ca:
            java.lang.String r0 = r2.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0020
            X.A4g r1 = r6.A08
            r0 = 0
            X.C20037A4g.A01(r0, r7, r1)
            return
        L_0x01d9:
            java.lang.String r0 = r3.A0C
            r2.A0C = r0
            java.lang.String r0 = r2.A0E
            if (r0 == 0) goto L_0x01e7
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01eb
        L_0x01e7:
            java.lang.String r0 = r3.A0E
            r2.A0E = r0
        L_0x01eb:
            java.lang.String r0 = r2.A0D
            if (r0 == 0) goto L_0x01f5
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01a6
        L_0x01f5:
            java.lang.String r0 = r3.A0D
            goto L_0x01a4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ART.BCx(X.AEs):void");
    }
}
