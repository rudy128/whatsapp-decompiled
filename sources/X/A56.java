package X;

import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import com.whatsapp.WaImageView;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

public final class A56 {
    public final AnonymousClass118 A00;
    public final AnonymousClass1QS A01;
    public final C18000vb A02;
    public final AnonymousClass1QO A03;
    public final AnonymousClass93W A04;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A03(X.C20284AEs r10, boolean r11) {
        /*
            r9 = this;
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            boolean r0 = r10 instanceof X.AnonymousClass8pK
            if (r0 == 0) goto L_0x006d
            X.8pK r10 = (X.AnonymousClass8pK) r10
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            X.118 r5 = r9.A00
            r0 = 2131897311(0x7f122bdf, float:1.9429508E38)
            java.lang.String r2 = X.C18070vi.A0G(r5, r0)
            int r0 = r10.A01
            java.lang.String r7 = X.C20085A6m.A04(r0)
            java.lang.String r6 = ""
            if (r7 != 0) goto L_0x0022
            r7 = r6
        L_0x0022:
            android.content.Context r8 = X.C108945cZ.A0E(r5)
            int r3 = r10.A00
            r4 = 1
            r1 = 2131893615(0x7f121d6f, float:1.9422012E38)
            if (r3 == r4) goto L_0x0068
            r0 = 4
            r1 = 2131893614(0x7f121d6e, float:1.942201E38)
            if (r3 == r0) goto L_0x0068
            r0 = 6
            if (r3 == r0) goto L_0x0065
            java.lang.String r0 = X.C20284AEs.A03(r3)
        L_0x003b:
            if (r0 == 0) goto L_0x003e
            r6 = r0
        L_0x003e:
            X.77e r1 = r10.A09
            boolean r0 = X.C20061A5k.A03(r1)
            if (r0 != 0) goto L_0x0064
            X.C17960vV.A07(r1)
            java.lang.String r0 = X.AnonymousClass8BS.A0h(r1)
            java.lang.String r3 = X.A8e.A04(r0)
            X.C18070vi.A0X(r3)
            r2 = 2131893706(0x7f121dca, float:1.9422196E38)
            r0 = 3
            java.lang.Object[] r1 = X.C108945cZ.A1a(r7, r6, r0, r4)
            r0 = 2
            java.lang.String r2 = X.AnonymousClass8BS.A0f(r5, r3, r1, r0, r2)
            X.C18070vi.A0X(r2)
        L_0x0064:
            return r2
        L_0x0065:
            r1 = 2131893613(0x7f121d6d, float:1.9422007E38)
        L_0x0068:
            java.lang.String r0 = r8.getString(r1)
            goto L_0x003b
        L_0x006d:
            boolean r0 = r10 instanceof X.AnonymousClass8pP
            if (r0 == 0) goto L_0x009f
            X.8pP r10 = (X.AnonymousClass8pP) r10
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            X.118 r1 = r9.A00
            r0 = 2131897311(0x7f122bdf, float:1.9429508E38)
            java.lang.String r2 = X.C18070vi.A0G(r1, r0)
            java.lang.Object r3 = X.C20284AEs.A02(r10)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = r10.A0B
            if (r3 == 0) goto L_0x0095
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0095
            r2 = r3
        L_0x0091:
            r10.A0C()
            return r2
        L_0x0095:
            if (r1 == 0) goto L_0x0091
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0091
            r2 = r1
            goto L_0x0091
        L_0x009f:
            boolean r0 = r10 instanceof X.AnonymousClass8pO
            if (r0 == 0) goto L_0x00c6
            X.118 r1 = r9.A00
            r0 = 2131897311(0x7f122bdf, float:1.9429508E38)
            java.lang.String r2 = X.C18070vi.A0G(r1, r0)
            java.lang.Object r3 = X.C20284AEs.A02(r10)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = r10.A0B
            if (r3 == 0) goto L_0x00bd
            int r0 = r3.length()
            if (r0 == 0) goto L_0x00bd
            return r3
        L_0x00bd:
            if (r1 == 0) goto L_0x0064
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0064
            return r1
        L_0x00c6:
            boolean r0 = r10 instanceof X.AnonymousClass8pM
            if (r0 != 0) goto L_0x012c
            boolean r0 = r10 instanceof X.AnonymousClass8pQ
            if (r0 != 0) goto L_0x012c
            boolean r0 = r10 instanceof X.AnonymousClass8pL
            if (r0 != 0) goto L_0x012c
            X.118 r4 = r9.A00
            r0 = 2131897311(0x7f122bdf, float:1.9429508E38)
            java.lang.String r2 = X.C18070vi.A0G(r4, r0)
            X.1QS r0 = r9.A01
            X.BD1 r5 = r0.A06()
            X.C18070vi.A0X(r5)
            java.lang.String r1 = r5.BUO(r10)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0109
            r2 = r1
        L_0x00ef:
            if (r11 == 0) goto L_0x0064
            r3 = 2131897007(0x7f122aaf, float:1.9428891E38)
            java.lang.Object[] r2 = X.C17890vO.A1a(r2)
            int r0 = r5.BWa()
            java.lang.String r1 = r4.A01(r0)
            r0 = 1
            java.lang.String r2 = X.AnonymousClass8BS.A0f(r4, r1, r2, r0, r3)
            X.C18070vi.A0b(r2)
            return r2
        L_0x0109:
            java.lang.String r1 = r10.A0B
            if (r1 == 0) goto L_0x00ef
            X.77e r0 = r10.A09
            java.lang.String r3 = A01(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r1)
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0127
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = 32
            java.lang.String r3 = X.C17890vO.A0Z(r3, r1, r0)
        L_0x0127:
            java.lang.String r2 = X.AnonymousClass000.A0y(r3, r2)
            goto L_0x00ef
        L_0x012c:
            X.77e r0 = r10.A09
            java.lang.Object r2 = X.C20061A5k.A01(r0)
            X.C18070vi.A0X(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A56.A03(X.AEs, boolean):java.lang.String");
    }

    public final void A04(C20284AEs aEs, BDt bDt, PaymentMethodRow paymentMethodRow) {
        WaImageView waImageView;
        int i;
        int A0G = C72453Mb.A0G(paymentMethodRow, bDt, 1);
        String BUu = bDt.BUu(aEs);
        if (aEs instanceof AnonymousClass8pQ) {
            AnonymousClass8pQ r7 = (AnonymousClass8pQ) aEs;
            String str = r7.A02;
            if (str == null || str.length() == 0) {
                A8e.A07(aEs, paymentMethodRow);
            } else {
                this.A04.A01(paymentMethodRow.A00, str);
            }
            if (r7.A05 != null) {
                AnonymousClass118 r6 = this.A00;
                String str2 = r7.A06;
                String A0f = AnonymousClass8BS.A0f(r6, str2, new Object[1], 0, 2131893443);
                C18070vi.A0X(A0f);
                if ("percentage".equals(r7.A03) && str2 != null) {
                    A0f = AnonymousClass8BS.A0f(r6, this.A02.A0M().format(Float.valueOf(Float.parseFloat(str2) / 100.0f)), new Object[1], 0, 2131893463);
                    C18070vi.A0X(A0f);
                }
                Object[] objArr = new Object[A0G];
                objArr[0] = A0f;
                SpannableString spannableString = new SpannableString(AnonymousClass8BS.A0f(r6, r7.A04, objArr, 1, 2131893664));
                spannableString.setSpan(new TextAppearanceSpan(r6.A00, 2132083493), 0, A0f.length(), 33);
                paymentMethodRow.A02.setText(spannableString);
                paymentMethodRow.A02.setVisibility(0);
            }
        } else if (bDt.CMH()) {
            bDt.CMg(aEs, paymentMethodRow);
        }
        if (BUu == null || BUu.length() == 0) {
            BUu = A03(aEs, true);
        }
        paymentMethodRow.A03.setText(BUu);
        paymentMethodRow.A03(bDt.BUt(aEs), false);
        paymentMethodRow.A04(!bDt.CLr(aEs));
        int BUr = bDt.BUr(aEs);
        if (BUr == 0) {
            waImageView = paymentMethodRow.A05;
            i = 8;
        } else {
            paymentMethodRow.A05.setImageResource(BUr);
            waImageView = paymentMethodRow.A05;
            i = 0;
        }
        waImageView.setVisibility(i);
        paymentMethodRow.A05(bDt.CMD());
    }

    public A56(AnonymousClass118 r1, C18000vb r2, AnonymousClass1QO r3, AnonymousClass1QS r4, AnonymousClass93W r5) {
        C18070vi.A0w(r1, r2, r4, r3, r5);
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r4;
        this.A03 = r3;
        this.A04 = r5;
    }

    public static String A00(C20284AEs aEs, AnonymousClass00H r3) {
        return ((A56) r3.get()).A03(aEs, false);
    }

    public static final String A01(C1418477e r2) {
        if (C20061A5k.A03(r2)) {
            return "";
        }
        String A042 = A8e.A04((String) C20061A5k.A01(r2));
        return AnonymousClass001.A1H("••", A042, C108955ca.A15(A042));
    }

    public final String A02(C20284AEs aEs) {
        int i;
        C18070vi.A0d(aEs, 0);
        C170278pb r0 = aEs.A08;
        C17960vV.A07(r0);
        if (!r0.A0A()) {
            return this.A00.A01(2131893673);
        }
        AnonymousClass1QO r1 = this.A03;
        if (r1.A0E() || r1.A0B()) {
            StringBuilder A10 = AnonymousClass000.A10();
            if (!C18020vd.A05(C18040vf.A02, r1.A02, 10897) && aEs.A01 == 2) {
                A10.append(this.A00.A01(2131893480));
            }
            if (aEs.A03 == 2) {
                if (A10.length() > 0) {
                    A10.append("\n");
                }
                A10.append(this.A00.A01(2131893442));
            }
            return A10.toString();
        }
        C170278pb r02 = aEs.A08;
        if (r02 != null && !r02.A0A()) {
            i = 2131893673;
        } else if (aEs.A01 != 2) {
            return null;
        } else {
            i = 2131889245;
        }
        return this.A00.A01(i);
    }
}
