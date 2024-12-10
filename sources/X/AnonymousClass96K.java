package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;

/* renamed from: X.96K  reason: invalid class name */
public class AnonymousClass96K extends C161588Gc {
    public String A00;
    public boolean A01;
    public final AnonymousClass11P A02;
    public final C18030ve A03;
    public final C20752AXh A04;
    public final A7U A05;
    public final C20080A6g A06;
    public final AnonymousClass2L2 A07;
    public final C175668z5 A08;
    public final AQF A09;
    public final A8C A0A;
    public final AnonymousClass18O A0B;
    public final C196199uc A0C;
    public final AXS A0D;
    public final C175788zH A0E;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9Yd, X.95L] */
    public void A0h(List list) {
        UserJid userJid;
        C183409Yd r2;
        C196219ue r0;
        AnonymousClass9NU r02 = this.A06;
        AW0 aw0 = r02.A01;
        C170318pf A0C2 = AnonymousClass8BS.A0C(aw0);
        C17960vV.A07(r02);
        C20284AEs aEs = r02.A00;
        List list2 = list;
        if (aw0.A03 == 40 && (r0 = A0C2.A0H) != null && r0.A0M) {
            A0y(aw0, A0C2, list, false);
            A0v(aw0, A0C2, list);
            A0z(aw0, list);
            A0w(aw0, A0C2, list);
            C1767195h r1 = new C1767195h();
            r1.A02 = this.A06;
            r1.A01 = this;
            r1.A00 = AnonymousClass8BU.A0U(this.A0c).BQ8();
            list.add(r1);
            A0x(aw0, A0C2, list);
            A0j(list);
            C161588Gc.A05(list);
            A0u(aEs, aw0, A0C2, list2, true);
            C161588Gc.A05(list);
            A0p(list);
            C161588Gc.A05(list);
        } else if (!TextUtils.isEmpty(A0C2.A0N)) {
            if (aw0.A02 == 12) {
                AnonymousClass95P r4 = new AnonymousClass95P();
                Context context = this.A0P.A00;
                r4.A02 = context.getString(2131897574);
                r4.A01 = C17880vN.A0q(context, AnonymousClass1EG.A03(context, 2131099833), C17890vO.A1a(AnonymousClass1KL.A0B.BLd(this.A0Q, new BigDecimal(C18020vd.A00(C18040vf.A02, this.A03, 1650)))), 1, 2131897573);
                r4.A00 = new AFT(this, aw0, 38);
                list.add(r4);
            }
            A0f(list);
            if (!"mandate_payment_screen".equals(this.A00)) {
                C161588Gc.A05(list);
                AnonymousClass8pG r3 = aw0.A0A;
                C17960vV.A07(r3);
                C1766695c r22 = new C1766695c();
                r22.A01 = this.A0P.A00.getString(2131897464);
                r22.A00 = new AnonymousClass78A(this, aw0, r3, 31);
                list.add(r22);
            }
            A0o(list);
            C161588Gc.A05(list);
            A0p(list);
            A0n(list);
        } else {
            super.A0h(list);
            AnonymousClass8pG r03 = aw0.A0A;
            if (!(r03 == null || !r03.A0X() || (userJid = aw0.A0D) == null)) {
                list.add(new AnonymousClass95Q(userJid));
            }
            boolean A022 = C20063A5m.A02(this.A06.A00);
            ? r23 = new C183409Yd(1000);
            r23.A00 = A022;
            r2 = r23;
            list.add(r2);
        }
        r2 = new C183409Yd(1007);
        list.add(r2);
    }

    public static void A06(C170318pf r3, AnonymousClass96K r4, List list, int i) {
        C196219ue r0;
        if (i != 401 && i != 20 && (r0 = r3.A0H) != null && !C20061A5k.A02(r0.A08)) {
            C1767495k r2 = new C1767495k();
            C161588Gc.A00(r4.A0P.A00, r2, 2131897549);
            r2.A03 = (String) AnonymousClass8BT.A0q(r3.A0H.A08);
            r2.A02 = new C1421578j(r3, r4, 11);
            list.add(r2);
        }
    }

    public static void A07(AnonymousClass96K r4, List list) {
        C170318pf r3 = (C170318pf) r4.A06.A01.A0A;
        if (r4.A0B.A09(AnonymousClass18O.A0Z) && !TextUtils.isEmpty(r3.A0Y)) {
            C1767495k r2 = new C1767495k();
            Context context = r4.A0P.A00;
            C161588Gc.A00(context, r2, 2131897653);
            r2.A03 = context.getString(2131897652);
            r2.A01 = new AFT(r4, r3, 35);
            list.add(r2);
        }
    }

    public C183409Yd A0U() {
        C1767495k r3;
        String A0f;
        AW0 aw0;
        AnonymousClass8pG r2;
        ADP adp;
        AnonymousClass9NU r32 = this.A06;
        if (r32 == null || (aw0 = r32.A01) == null || (r2 = aw0.A0A) == null || !r2.A0X()) {
            AnonymousClass1R2 r1 = this.A0k;
            if (r1.A0j(r32.A01)) {
                if (C18020vd.A05(C18040vf.A02, r1.A07, 11295)) {
                    C170318pf A0C2 = AnonymousClass8BS.A0C(this.A06.A01);
                    r3 = new C1767495k();
                    AnonymousClass118 r5 = this.A0P;
                    r3.A04 = r5.A01(2131897009);
                    Object[] A1b = AnonymousClass3MW.A1b();
                    A1b[0] = A0C2.A0R;
                    A0f = AnonymousClass8BS.A0f(r5, A0C2.A0Q, A1b, 1, 2131897007);
                }
            }
            return super.A0U();
        }
        C17960vV.A07(r2);
        C170318pf r22 = (C170318pf) r2;
        if (r22.A0F != null) {
            r3 = new C1767495k();
            r3.A04 = this.A0P.A01(2131893468);
            adp = r22.A0F;
        } else {
            C1418477e r0 = r22.A09;
            if (r0 == null || !"upi".equalsIgnoreCase((String) r0.A00)) {
                return null;
            }
            r3 = new C1767495k();
            AnonymousClass118 r12 = this.A0P;
            r3.A04 = r12.A01(2131893468);
            adp = r22.A0F;
            if (adp == null) {
                A0f = r12.A01(2131893469);
            }
        }
        A0f = adp.A00;
        r3.A03 = A0f;
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (android.text.TextUtils.isEmpty(r2.A0T) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0Y(X.AW0 r4) {
        /*
            r3 = this;
            X.8pG r2 = r4.A0A
            X.8pf r2 = (X.C170318pf) r2
            com.whatsapp.jid.UserJid r0 = r4.A0E
            if (r0 != 0) goto L_0x0013
            if (r2 == 0) goto L_0x0013
            java.lang.String r0 = r2.A0T
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            boolean r0 = r4.A0K()
            if (r0 == 0) goto L_0x002a
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = r4.A0F
            boolean r0 = X.C20128A8n.A08(r0)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r4.A0F
            return r0
        L_0x0027:
            java.lang.String r0 = r4.A0K
            return r0
        L_0x002a:
            X.8pG r0 = r4.A0A
            if (r0 == 0) goto L_0x0045
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x0045
            if (r2 == 0) goto L_0x0045
            X.77e r0 = r2.A0A
            boolean r0 = X.C20061A5k.A02(r0)
            if (r0 != 0) goto L_0x0045
            X.77e r0 = r2.A0A
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0045:
            java.lang.String r0 = super.A0Y(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96K.A0Y(X.AW0):java.lang.String");
    }

    public void A0Z() {
        String A0r;
        AW0 aw0;
        String str;
        AnonymousClass1QE r4 = this.A0g;
        r4.A06("IN- HANDLE_SEND_AGAIN start");
        AnonymousClass9NU r0 = this.A06;
        if (r0 == null || (aw0 = r0.A01) == null || (!aw0.A0P && !TextUtils.isEmpty(aw0.A0L))) {
            AnonymousClass9NU r02 = this.A06;
            if (r02 == null) {
                A0r = "IN- HANDLE_SEND_AGAIN transactionDetailData is null?";
            } else {
                AW0 aw02 = r02.A01;
                if (aw02 == null) {
                    A0r = "IN- HANDLE_SEND_AGAIN transactionInfo is null?";
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("IN- HANDLE_SEND_AGAIN isInterop is ");
                    A0r = AnonymousClass3MY.A0r(A10, aw02.A0P);
                }
            }
            r4.A06(A0r);
            r4.A06("IN- HANDLE_SEND_AGAIN calling super");
            super.A0Z();
            return;
        }
        r4.A06("IN- HANDLE_SEND_AGAIN transaction is not null and it's interop");
        AnonymousClass8pG r1 = this.A06.A01.A0A;
        if (r1 instanceof C170318pf) {
            str = ((C170318pf) r1).A0R;
        } else {
            str = "";
        }
        if (C197929xV.A00(str)) {
            C1418477e A0L = AnonymousClass8BT.A0L(AnonymousClass8BR.A0Z(), str);
            if (!this.A0C.A04(A0L)) {
                A0q(true);
                this.A0E.A01(A0L, (C1418477e) null, new AXY(A0L, this, str, 0));
                return;
            }
            r4.A06("IN- HANDLE_SEND_AGAIN user blocked checked locally");
            C198789yu A002 = C198789yu.A00(13);
            A002.A0I = str;
            this.A08.A0F(A002);
            return;
        }
        r4.A06("IN- HANDLE_SEND_AGAIN vpa valid check locally, incorrect vpa");
        C198789yu A003 = C198789yu.A00(8);
        A003.A0E = this.A0P.A00.getString(2131893643);
        this.A08.A0F(A003);
    }

    public void A0b() {
        AW0 aw0;
        C170318pf r0;
        AnonymousClass9NU r02 = this.A06;
        if (!(r02 == null || (aw0 = r02.A01) == null || (r0 = (C170318pf) aw0.A0A) == null || r0.A0H == null)) {
            int i = 2131897572;
            if (aw0.A02 == 115) {
                i = 2131895261;
            }
            this.A0E = i;
        }
        super.A0b();
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [X.9yu, X.96D] */
    public void A0e(AnonymousClass9N6 r3) {
        AnonymousClass9NU r0;
        AW0 aw0;
        C198789yu r1;
        int i = r3.A00;
        if (i == 300) {
            A0r(false);
        } else if (i != 301) {
            super.A0e(r3);
        } else {
            if (this.A01) {
                ? r12 = new C198789yu(101);
                r12.A03 = this.A07.A01;
                r12.A06 = this.A0C;
                r12.A05 = "SUBMITTED";
                r12.A04 = "00";
                r1 = r12;
            } else {
                String str = this.A00;
                if (("chat".equals(str) || "payment_composer_icon".equals(str)) && (r0 = this.A06) != null && (aw0 = r0.A01) != null && aw0.A0P) {
                    r1 = new C198789yu(106);
                } else {
                    r1 = C198789yu.A00(19);
                }
            }
            this.A08.A0F(r1);
        }
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [X.9gL, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        r4.A00 = 2131232258;
        r8 = r2.A0P;
        r4.A04 = r8.A01(2131897624);
        r0 = 2131897623;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        r4.A02 = r8.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        r4.A03 = X.C17880vN.A0q(r8.A00, X.AnonymousClass11X.A00.A07(r2.A0Q, r2.A02.A09(r7.A01)), new java.lang.Object[1], 0, 2131889186);
        r4.A05 = true;
        r4.A07 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0f(java.util.List r18) {
        /*
            r17 = this;
            r2 = r17
            r3 = r18
            r2.A0g(r3)
            r2.A0l(r3)
            r2.A0i(r3)
            r2.A0k(r3)
            r2.A0m(r3)
            X.9NU r0 = r2.A06
            X.AW0 r7 = r0.A01
            boolean r0 = r2.A10()
            if (r0 == 0) goto L_0x0029
            if (r7 == 0) goto L_0x0141
            X.8pG r0 = r7.A0A
            if (r0 == 0) goto L_0x0141
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x0141
        L_0x0029:
            boolean r0 = r2.A10()
            if (r0 == 0) goto L_0x0092
            X.9NU r0 = r2.A06
            X.AW0 r9 = r0.A01
            X.8pG r0 = r9.A0A
            X.8pf r0 = (X.C170318pf) r0
            X.ADS r7 = r0.A0I
            if (r7 == 0) goto L_0x0092
            long r0 = r7.A00
            boolean r12 = r7.A03
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00d1
            X.95l r4 = new X.95l
            r4.<init>()
            java.lang.String r1 = r7.A02
            int r0 = r1.hashCode()
            r6 = 0
            r5 = 1
            switch(r0) {
                case -828048883: goto L_0x00b8;
                case 441297912: goto L_0x0096;
                default: goto L_0x0055;
            }
        L_0x0055:
            r0 = 2131232258(0x7f080602, float:1.808062E38)
            r4.A00 = r0
            X.118 r8 = r2.A0P
            r0 = 2131897624(0x7f122d18, float:1.9430143E38)
            java.lang.String r0 = r8.A01(r0)
            r4.A04 = r0
            r0 = 2131897623(0x7f122d17, float:1.943014E38)
        L_0x0068:
            java.lang.String r0 = r8.A01(r0)
            r4.A02 = r0
        L_0x006e:
            android.content.Context r11 = r8.A00
            r10 = 2131889186(0x7f120c22, float:1.9413028E38)
            java.lang.Object[] r9 = new java.lang.Object[r5]
            X.0vb r12 = r2.A0Q
            X.11P r8 = r2.A02
            long r0 = r7.A01
            long r0 = r8.A09(r0)
            X.11Y r7 = X.AnonymousClass11X.A00
            java.lang.String r0 = r7.A07(r12, r0)
            java.lang.String r0 = X.C17880vN.A0q(r11, r0, r9, r6, r10)
            r4.A03 = r0
            r4.A05 = r5
            r4.A07 = r5
        L_0x008f:
            r3.add(r4)
        L_0x0092:
            r2.A0j(r3)
            return
        L_0x0096:
            java.lang.String r0 = "RESOLVED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            r0 = 2131231799(0x7f080437, float:1.807969E38)
            r4.A00 = r0
            X.118 r8 = r2.A0P
            r0 = 2131897626(0x7f122d1a, float:1.9430147E38)
            java.lang.String r0 = r8.A01(r0)
            r4.A04 = r0
            int r1 = r9.A02
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x006e
            r0 = 2131897625(0x7f122d19, float:1.9430145E38)
            goto L_0x0068
        L_0x00b8:
            java.lang.String r0 = "TRANSACTION_CLOSED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            r0 = 2131231799(0x7f080437, float:1.807969E38)
            r4.A00 = r0
            X.118 r8 = r2.A0P
            r0 = 2131897626(0x7f122d1a, float:1.9430147E38)
            java.lang.String r0 = r8.A01(r0)
            r4.A04 = r0
            goto L_0x006e
        L_0x00d1:
            long r4 = r9.A05
            X.1QO r0 = r2.A0b
            X.0ve r6 = r0.A02
            r0 = 1422(0x58e, float:1.993E-42)
            long r0 = X.AnonymousClass8BR.A05(r6, r0)
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS
            X.11P r7 = r2.A02
            long r10 = X.AnonymousClass11P.A01(r7)
            long r0 = r8.toMillis(r0)
            long r4 = r4 + r0
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0127
            if (r12 == 0) goto L_0x0092
            X.95l r4 = new X.95l
            r4.<init>()
            r11 = 0
            r4.A07 = r11
            r0 = 1421(0x58d, float:1.991E-42)
            long r0 = X.AnonymousClass8BR.A05(r6, r0)
            long r5 = r9.A05
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MINUTES
            long r7 = X.AnonymousClass11P.A01(r7)
            long r0 = r10.toMillis(r0)
            long r5 = r5 + r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x011d
            r0 = 1
            r4.A06 = r0
            r0 = 37
            X.AFT r1 = new X.AFT
            r1.<init>(r2, r9, r0)
        L_0x0119:
            r4.A01 = r1
            goto L_0x008f
        L_0x011d:
            r4.A06 = r11
            r0 = 29
            X.AFR r1 = new X.AFR
            r1.<init>(r2, r0)
            goto L_0x0119
        L_0x0127:
            if (r12 == 0) goto L_0x0092
            X.95l r4 = new X.95l
            r4.<init>()
            X.118 r1 = r2.A0P
            r0 = 2131897627(0x7f122d1b, float:1.9430149E38)
            java.lang.String r0 = r1.A01(r0)
            r4.A02 = r0
            r0 = 0
            r4.A05 = r0
            r0 = 1
            r4.A07 = r0
            goto L_0x008f
        L_0x0141:
            int r8 = r7.A02
            X.95b r6 = new X.95b
            r6.<init>()
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r6.A00 = r0
            r5 = 0
            r4 = 0
        L_0x0150:
            java.util.List r0 = r6.A00
            r16 = r0
            X.A4C r13 = r2.A0j
            X.11P r10 = r2.A02
            X.9gL r9 = new X.9gL
            r9.<init>()
            X.1R2 r0 = r13.A04
            java.lang.String r14 = r0.A0V(r7)
            long r0 = r7.A05
            java.lang.String r11 = X.A4C.A00(r10, r13, r0)
            r0 = 403(0x193, float:5.65E-43)
            r12 = 0
            r15 = 2
            r1 = 1
            if (r8 == r0) goto L_0x0282
            r0 = 408(0x198, float:5.72E-43)
            if (r8 == r0) goto L_0x0230
            r0 = 405(0x195, float:5.68E-43)
            if (r8 == r0) goto L_0x0211
            r0 = 406(0x196, float:5.69E-43)
            if (r8 == r0) goto L_0x025c
            switch(r8) {
                case 422: goto L_0x0230;
                case 423: goto L_0x01e1;
                case 424: goto L_0x01fb;
                default: goto L_0x017f;
            }
        L_0x017f:
            if (r4 == 0) goto L_0x02b6
            if (r4 == r1) goto L_0x01d2
            if (r4 != r15) goto L_0x01ac
            r11 = 2131232355(0x7f080663, float:1.8080817E38)
            X.118 r0 = r13.A01
            android.content.Context r10 = r0.A00
            r0 = 2131897013(0x7f122ab5, float:1.9428903E38)
        L_0x018f:
            java.lang.String r12 = X.C17890vO.A0R(r10, r14, r1, r5, r0)
        L_0x0193:
            r10 = 0
        L_0x0194:
            r1 = 2131102107(0x7f06099b, float:1.7816643E38)
        L_0x0197:
            r0 = 2131102246(0x7f060a26, float:1.7816925E38)
            r9.A03 = r0
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            r9.A02 = r0
            r9.A01 = r11
            r9.A05 = r12
            if (r10 != 0) goto L_0x01a8
            r10 = 0
        L_0x01a8:
            r9.A04 = r10
            r9.A00 = r1
        L_0x01ac:
            r0 = r16
            r0.add(r9)
            int r4 = r4 + 1
            r0 = 3
            if (r4 < r0) goto L_0x0150
            r0 = 422(0x1a6, float:5.91E-43)
            if (r8 == r0) goto L_0x01cb
            r0 = 423(0x1a7, float:5.93E-43)
            if (r8 == r0) goto L_0x01cb
            r0 = 406(0x196, float:5.69E-43)
            if (r8 == r0) goto L_0x01cb
            r0 = 408(0x198, float:5.72E-43)
            if (r8 == r0) goto L_0x01cb
            r0 = 424(0x1a8, float:5.94E-43)
            if (r8 == r0) goto L_0x01cb
            r5 = 1
        L_0x01cb:
            r6.A01 = r5
            r3.add(r6)
            goto L_0x0029
        L_0x01d2:
            r11 = 2131232356(0x7f080664, float:1.8080819E38)
            X.118 r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897012(0x7f122ab4, float:1.9428901E38)
            java.lang.String r12 = r1.getString(r0)
            goto L_0x0193
        L_0x01e1:
            if (r4 == 0) goto L_0x02b6
            if (r4 != r1) goto L_0x0274
            r11 = 2131231819(0x7f08044b, float:1.807973E38)
            X.118 r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897018(0x7f122aba, float:1.9428914E38)
            java.lang.String r12 = r1.getString(r0)
            r0 = 2131897017(0x7f122ab9, float:1.9428912E38)
            java.lang.String r10 = r1.getString(r0)
            goto L_0x026f
        L_0x01fb:
            if (r4 == 0) goto L_0x02b6
            if (r4 != r1) goto L_0x024b
            r11 = 2131232356(0x7f080664, float:1.8080819E38)
            X.118 r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897020(0x7f122abc, float:1.9428918E38)
            java.lang.String r12 = r1.getString(r0)
            r0 = 2131897016(0x7f122ab8, float:1.942891E38)
            goto L_0x0245
        L_0x0211:
            if (r4 == 0) goto L_0x02b6
            if (r4 == r1) goto L_0x0294
            if (r4 != r15) goto L_0x01ac
            r11 = 2131232354(0x7f080662, float:1.8080815E38)
            X.118 r0 = r13.A01
            android.content.Context r12 = r0.A00
            r0 = 2131897021(0x7f122abd, float:1.942892E38)
            java.lang.String r12 = X.C17890vO.A0R(r12, r14, r1, r5, r0)
            long r0 = r7.A06
            java.lang.String r10 = X.A4C.A00(r10, r13, r0)
            r1 = 2131102146(0x7f0609c2, float:1.7816722E38)
            goto L_0x0197
        L_0x0230:
            if (r4 == 0) goto L_0x02b6
            if (r4 != r1) goto L_0x024b
            r11 = 2131232354(0x7f080662, float:1.8080815E38)
            X.118 r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897020(0x7f122abc, float:1.9428918E38)
            java.lang.String r12 = r1.getString(r0)
            r0 = 2131897015(0x7f122ab7, float:1.9428908E38)
        L_0x0245:
            java.lang.String r10 = r1.getString(r0)
            goto L_0x0194
        L_0x024b:
            if (r4 != r15) goto L_0x01ac
            r11 = 2131231819(0x7f08044b, float:1.807973E38)
            X.118 r0 = r13.A01
            android.content.Context r10 = r0.A00
            r0 = 2131897011(0x7f122ab3, float:1.94289E38)
            java.lang.String r12 = X.C17890vO.A0R(r10, r14, r1, r5, r0)
            goto L_0x026e
        L_0x025c:
            if (r4 == 0) goto L_0x02b6
            if (r4 != r1) goto L_0x0274
            r11 = 2131231819(0x7f08044b, float:1.807973E38)
            X.118 r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897010(0x7f122ab2, float:1.9428897E38)
            java.lang.String r12 = r1.getString(r0)
        L_0x026e:
            r10 = 0
        L_0x026f:
            r1 = 2131102147(0x7f0609c3, float:1.7816724E38)
            goto L_0x0197
        L_0x0274:
            if (r4 != r15) goto L_0x01ac
            r11 = 2131231819(0x7f08044b, float:1.807973E38)
            X.118 r0 = r13.A01
            android.content.Context r10 = r0.A00
            r0 = 2131897011(0x7f122ab3, float:1.94289E38)
            goto L_0x018f
        L_0x0282:
            if (r4 == 0) goto L_0x02b6
            if (r4 == r1) goto L_0x0294
            if (r4 != r15) goto L_0x01ac
            r11 = 2131232356(0x7f080664, float:1.8080819E38)
            X.118 r0 = r13.A01
            android.content.Context r10 = r0.A00
            r0 = 2131897014(0x7f122ab6, float:1.9428906E38)
            goto L_0x018f
        L_0x0294:
            X.118 r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897020(0x7f122abc, float:1.9428918E38)
            java.lang.String r10 = r1.getString(r0)
            r1 = 2131232354(0x7f080662, float:1.8080815E38)
            r0 = 2131101215(0x7f06061f, float:1.7814833E38)
            r9.A00 = r0
            r0 = 2131102145(0x7f0609c1, float:1.781672E38)
            r9.A03 = r0
            r9.A02 = r0
            r9.A01 = r1
            r9.A05 = r10
            r9.A04 = r12
            goto L_0x01ac
        L_0x02b6:
            X.118 r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897019(0x7f122abb, float:1.9428916E38)
            java.lang.String r10 = r1.getString(r0)
            r1 = 2131232354(0x7f080662, float:1.8080815E38)
            r0 = 2131101215(0x7f06061f, float:1.7814833E38)
            r9.A00 = r0
            r0 = 2131102145(0x7f0609c1, float:1.781672E38)
            r9.A03 = r0
            r9.A02 = r0
            r9.A01 = r1
            r9.A05 = r10
            if (r11 != 0) goto L_0x02d7
            r11 = 0
        L_0x02d7:
            r9.A04 = r11
            goto L_0x01ac
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96K.A0f(java.util.List):void");
    }

    public void A0g(List list) {
        AW0 aw0;
        AnonymousClass8pG r1;
        C190159kT r0;
        AnonymousClass9NQ r02;
        BigDecimal bigDecimal;
        AnonymousClass9NU r03 = this.A06;
        List list2 = list;
        if (r03 == null || (aw0 = r03.A01) == null || (r1 = aw0.A0A) == null || !(r1 instanceof C170318pf) || (r0 = ((C170318pf) r1).A0G) == null || (r02 = r0.A00) == null) {
            super.A0g(list2);
            return;
        }
        AnonymousClass1KJ A012 = this.A0n.A01(r02.A01);
        AnonymousClass1KN A0H = AnonymousClass8BU.A0H(A012, new BigDecimal((String) r02.A00.A00));
        AnonymousClass118 r3 = this.A0P;
        Context context = r3.A00;
        C18000vb r8 = this.A0Q;
        SpannableStringBuilder A013 = A3U.A01(context, r8, A012, A0H, 2, false);
        AEX A042 = this.A06.A01.A04();
        C189109iW BWT = A0T().BWT();
        AW0 aw02 = this.A06.A01;
        boolean A002 = BWT.A00(aw02);
        AnonymousClass1R2 r12 = this.A0k;
        int A0G = r12.A0G(aw02);
        Context context2 = r12.A04.A00;
        if (A0G == 0) {
            A0G = 2131896972;
        }
        String A0q = C17880vN.A0q(context2, context2.getString(A0G), C17890vO.A1a(A013), 1, 2131896967);
        Object[] objArr = new Object[1];
        Locale A0N = r8.A0N();
        Object[] objArr2 = new Object[1];
        BigDecimal bigDecimal2 = A0H.A00;
        BigDecimal bigDecimal3 = C20092A6u.A00;
        BigDecimal bigDecimal4 = r02.A03;
        if (bigDecimal4 != null) {
            bigDecimal = bigDecimal4.divide(bigDecimal3);
        } else {
            bigDecimal = null;
        }
        BigDecimal bigDecimal5 = r02.A02;
        BigDecimal add = bigDecimal2.multiply(bigDecimal5).add(bigDecimal2.multiply(bigDecimal5).multiply(bigDecimal));
        C18070vi.A0X(add);
        objArr2[0] = add;
        list2.add(new C1767395j(A042, A013, A0q, AnonymousClass8BS.A0f(r3, String.format(A0N, "%.2f", objArr2), objArr, 0, 2131886653), A002));
    }

    public void A0p(List list) {
        AnonymousClass8pG r0;
        AnonymousClass9NU r02 = this.A06;
        if (r02 != null) {
            AW0 aw0 = r02.A01;
            if (aw0 == null || (r0 = aw0.A0A) == null || !r0.A0X()) {
                AnonymousClass1R2 r1 = this.A0k;
                if (r1.A0j(aw0)) {
                    if (C18020vd.A05(C18040vf.A02, r1.A07, 11295)) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        super.A0p(list);
    }

    public boolean A0s() {
        AW0 aw0;
        AnonymousClass9NU r0 = this.A06;
        if (!(r0 == null || (aw0 = r0.A01) == null)) {
            C170318pf r2 = (C170318pf) aw0.A0A;
            if (!(aw0.A02 == 415 || r2 == null || r2.A0H == null)) {
                return true;
            }
        }
        return super.A0s();
    }

    public boolean A0t(AW0 aw0) {
        C170318pf r2 = (C170318pf) aw0.A0A;
        if (r2 != null && (!TextUtils.isEmpty(r2.A0N) || r2.A0H != null)) {
            return false;
        }
        AnonymousClass8pG r0 = aw0.A0A;
        if (r0 == null || !r0.A0X()) {
            return super.A0t(aw0);
        }
        return false;
    }

    public void A0v(AW0 aw0, C170318pf r7, List list) {
        SpannableStringBuilder spannableStringBuilder;
        boolean A002 = AnonymousClass8BU.A0U(this.A0c).BWT().A00(aw0);
        AnonymousClass1KN r3 = aw0.A09;
        if (r3 != null) {
            spannableStringBuilder = A3U.A00(this.A0P.A00, this.A0Q, aw0.A01(), r3);
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
        }
        AnonymousClass95O r2 = new AnonymousClass95O(spannableStringBuilder, A002);
        if ("MAX".equals(r7.A0H.A0G)) {
            r2.A00 = this.A0P.A00.getString(2131897544);
        }
        list.add(r2);
    }

    public void A0w(AW0 aw0, C170318pf r6, List list) {
        AnonymousClass10I r1;
        int i;
        Context context;
        int i2;
        if (TextUtils.isEmpty(r6.A0H.A0H) || aw0.A02 != 417) {
            AnonymousClass9O4 r2 = r6.A0H.A0C;
            if (r2 != null && "ACCEPT".equals(r2.A08)) {
                String str = r2.A09;
                if (str.equals("PENDING")) {
                    C1767095g r22 = new C1767095g();
                    r22.A02 = false;
                    r22.A01 = this.A0P.A00.getString(2131897553);
                    r22.A00 = new AFT(this, aw0, 34);
                    list.add(r22);
                    return;
                } else if (str.equals("FAILURE") && !TextUtils.isEmpty(r2.A05)) {
                    C1767095g r23 = new C1767095g();
                    r23.A02 = true;
                    r23.A01 = this.A0P.A00.getString(2131897488);
                    list.add(r23);
                    r1 = this.A0l;
                    i = 48;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            C1767095g r24 = new C1767095g();
            r24.A02 = true;
            C191059lx r0 = r6.A0H.A0B;
            if (r0 != null) {
                String str2 = r0.A02;
                if ("PAUSE".equals(str2)) {
                    context = this.A0P.A00;
                    i2 = 2131897551;
                } else {
                    if ("RESUME".equals(str2)) {
                        context = this.A0P.A00;
                        i2 = 2131897552;
                    }
                    list.add(r24);
                    r1 = this.A0l;
                    i = 49;
                }
            } else {
                context = this.A0P.A00;
                i2 = 2131897550;
            }
            r24.A01 = context.getString(i2);
            list.add(r24);
            r1 = this.A0l;
            i = 49;
        }
        C21435Ak2.A00(r1, this, r6, aw0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r1 == 418) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0x(X.AW0 r10, X.C170318pf r11, java.util.List r12) {
        /*
            r9 = this;
            X.95n r3 = new X.95n
            r3.<init>()
            int r0 = X.AnonymousClass1R2.A01(r10)
            r3.A03 = r0
            int r1 = r10.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x001e
            r0 = 415(0x19f, float:5.82E-43)
            if (r1 == r0) goto L_0x001e
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x001e
            r0 = 418(0x1a2, float:5.86E-43)
            r2 = 1
            if (r1 != r0) goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            X.1KJ r1 = r10.A01()
            X.118 r0 = r9.A0P
            android.content.Context r6 = r0.A00
            android.text.SpannableStringBuilder r0 = r1.BPn(r6, r2)
            r3.A05 = r0
            boolean r1 = r10.A0K()
            r0 = 2131893596(0x7f121d5c, float:1.9421973E38)
            if (r1 == 0) goto L_0x0039
            r0 = 2131893707(0x7f121dcb, float:1.9422198E38)
        L_0x0039:
            java.lang.String r0 = r6.getString(r0)
            r3.A06 = r0
            X.1R2 r5 = r9.A0k
            int r0 = r5.A0G(r10)
            r3.A02 = r0
            int r7 = r10.A02
            r1 = 15
            r0 = 2131897538(0x7f122cc2, float:1.9429968E38)
            if (r7 == r1) goto L_0x011a
            r0 = 16
            if (r7 == r0) goto L_0x00ef
            r0 = 20
            r4 = 0
            r2 = 1
            if (r7 == r0) goto L_0x00cb
            r0 = 115(0x73, float:1.61E-43)
            if (r7 == r0) goto L_0x00af
            r0 = 401(0x191, float:5.62E-43)
            if (r7 == r0) goto L_0x0090
            r0 = 415(0x19f, float:5.82E-43)
            r1 = 418(0x1a2, float:5.86E-43)
            if (r7 == r0) goto L_0x007b
            r0 = 417(0x1a1, float:5.84E-43)
            if (r7 == r0) goto L_0x00f3
            if (r7 == r1) goto L_0x0076
            java.lang.String r0 = ""
        L_0x0070:
            r3.A0B = r0
            r12.add(r3)
            return
        L_0x0076:
            r0 = 2131897030(0x7f122ac6, float:1.9428938E38)
            goto L_0x011a
        L_0x007b:
            int r0 = r11.A01
            if (r0 != r1) goto L_0x0084
            r0 = 2131897535(0x7f122cbf, float:1.9429962E38)
            goto L_0x011a
        L_0x0084:
            r5 = 2131897536(0x7f122cc0, float:1.9429964E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = r11.A0R
            java.lang.String r0 = X.C17880vN.A0q(r6, r0, r1, r4, r5)
            goto L_0x0070
        L_0x0090:
            long r0 = r11.A04
            X.11P r7 = r5.A03
            long r7 = X.AnonymousClass11P.A01(r7)
            long r0 = r0 - r7
            android.util.Pair r0 = r5.A0K(r0)
            if (r0 == 0) goto L_0x00ab
            r5 = 2131897543(0x7f122cc7, float:1.9429978E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.second
            java.lang.String r0 = X.C17880vN.A0q(r6, r0, r1, r4, r5)
            goto L_0x0070
        L_0x00ab:
            r0 = 2131897037(0x7f122acd, float:1.9428952E38)
            goto L_0x011a
        L_0x00af:
            r0 = 1800000(0x1b7740, double:8.89318E-318)
            android.util.Pair r8 = r5.A0K(r0)
            X.0vb r7 = r9.A0Q
            r6 = 2131755475(0x7f1001d3, float:1.914183E38)
            int r0 = X.C108965cb.A01(r8)
            long r0 = (long) r0
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Object r2 = r8.second
            r5[r4] = r2
            java.lang.String r0 = r7.A0K(r5, r6, r0)
            goto L_0x0070
        L_0x00cb:
            long r0 = r11.A04
            X.11P r7 = r5.A03
            long r7 = X.AnonymousClass11P.A01(r7)
            long r0 = r0 - r7
            android.util.Pair r8 = r5.A0K(r0)
            if (r8 == 0) goto L_0x00ef
            X.0vb r7 = r9.A0Q
            r6 = 2131755475(0x7f1001d3, float:1.914183E38)
            int r0 = X.C108965cb.A01(r8)
            long r0 = (long) r0
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Object r2 = r8.second
            r5[r4] = r2
            java.lang.String r0 = r7.A0K(r5, r6, r0)
            goto L_0x0070
        L_0x00ef:
            r0 = 2131897539(0x7f122cc3, float:1.942997E38)
            goto L_0x011a
        L_0x00f3:
            X.9ue r8 = r11.A0H
            X.C17960vV.A07(r8)
            X.0vb r7 = r9.A0Q
            X.11P r5 = r9.A02
            long r0 = r8.A01
            java.lang.String r5 = X.A8C.A01(r5, r7, r0)
            int r1 = r8.A00()
            r0 = 2
            if (r1 == r0) goto L_0x0120
            r0 = 4
            if (r1 == r0) goto L_0x0120
            r0 = 6
            if (r1 == r0) goto L_0x0120
            java.lang.String r0 = r8.A0E
            boolean r0 = X.A8C.A05(r0)
            if (r0 == 0) goto L_0x0124
            r0 = 2131897541(0x7f122cc5, float:1.9429974E38)
        L_0x011a:
            java.lang.String r0 = r6.getString(r0)
            goto L_0x0070
        L_0x0120:
            r0 = 2131897540(0x7f122cc4, float:1.9429972E38)
            goto L_0x011a
        L_0x0124:
            r0 = 2131897542(0x7f122cc6, float:1.9429976E38)
            java.lang.String r0 = X.C17890vO.A0R(r6, r5, r2, r4, r0)
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96K.A0x(X.AW0, X.8pf, java.util.List):void");
    }

    public void A0y(AW0 aw0, C170318pf r10, List list, boolean z) {
        AnonymousClass9O4 r2;
        int i;
        Object[] A1b;
        C196219ue r0 = r10.A0H;
        if (r0 != null && (r2 = r0.A0C) != null && "UNKNOWN".equals(r2.A08) && "INIT".equals(r2.A09)) {
            String str = r10.A0R;
            AnonymousClass95P r4 = new AnonymousClass95P();
            Context context = this.A0P.A00;
            String A032 = AnonymousClass1EG.A03(context, 2131099833);
            if (z) {
                r4.A02 = context.getString(2131897577);
                i = 2131897576;
                A1b = new Object[]{A032};
            } else {
                r4.A02 = context.getString(2131897579);
                i = 2131897569;
                A1b = AnonymousClass3MX.A1b(str, 0);
                A1b[1] = A032;
            }
            r4.A01 = context.getString(i, A1b);
            r4.A00 = new AnonymousClass789(this, aw0, 2, z);
            list.add(r4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
        r0 = X.C18020vd.A05(X.C18040vf.A02, r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A10() {
        /*
            r4 = this;
            X.1QO r2 = r4.A0b
            X.AXS r0 = r4.A0D
            java.lang.String r0 = r0.A0G()
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = r0.toLowerCase()
            int r0 = r1.hashCode()
            switch(r0) {
                case 113658: goto L_0x0066;
                case 3008417: goto L_0x0059;
                case 3197625: goto L_0x004c;
                case 100023093: goto L_0x003f;
                default: goto L_0x0015;
            }
        L_0x0015:
            r0 = 0
        L_0x0016:
            r3 = 0
            if (r0 == 0) goto L_0x0033
            X.9NU r0 = r4.A06
            if (r0 == 0) goto L_0x0033
            X.AW0 r2 = r0.A01
            if (r2 == 0) goto L_0x0033
            X.8pG r1 = r2.A0A
            if (r1 == 0) goto L_0x0033
            boolean r0 = r1 instanceof X.C170318pf
            if (r0 == 0) goto L_0x0033
            X.8pf r1 = (X.C170318pf) r1
            X.9ue r0 = r1.A0H
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x0034
        L_0x0033:
            return r3
        L_0x0034:
            int r1 = r2.A03
            r0 = 1
            if (r1 == r0) goto L_0x003d
            r0 = 100
            if (r1 != r0) goto L_0x0033
        L_0x003d:
            r3 = 1
            return r3
        L_0x003f:
            java.lang.String r0 = "icici"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.0ve r2 = r2.A02
            r1 = 2327(0x917, float:3.261E-42)
            goto L_0x0072
        L_0x004c:
            java.lang.String r0 = "hdfc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.0ve r2 = r2.A02
            r1 = 2328(0x918, float:3.262E-42)
            goto L_0x0072
        L_0x0059:
            java.lang.String r0 = "axis"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.0ve r2 = r2.A02
            r1 = 2330(0x91a, float:3.265E-42)
            goto L_0x0072
        L_0x0066:
            java.lang.String r0 = "sbi"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.0ve r2 = r2.A02
            r1 = 2329(0x919, float:3.264E-42)
        L_0x0072:
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96K.A10():boolean");
    }

    public void A0d(C1767795n r6) {
        String str;
        if (!A10()) {
            super.A0d(r6);
            return;
        }
        AW0 aw0 = this.A06.A01;
        Integer A052 = AnonymousClass1R2.A05(aw0);
        int i = -1;
        if (aw0.A02 == 405) {
            i = 2131233547;
        }
        r6.A01 = i;
        AnonymousClass118 r2 = this.A0P;
        switch (A052.intValue()) {
            case 0:
                str = "1";
                break;
            case 1:
                str = "2";
                break;
            default:
                str = "3";
                break;
        }
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(str);
        Typeface A002 = C50802Vv.A00(r2.A00);
        if (A002 != null) {
            A092.setSpan(new C22622BGi(A002), 0, str.length(), 0);
        }
        r6.A05 = A092;
        r6.A03 = AnonymousClass1R2.A01(aw0);
        r6.A00 = 30.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r1 != 418) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0u(X.C20284AEs r20, X.AW0 r21, X.C170318pf r22, java.util.List r23, boolean r24) {
        /*
            r19 = this;
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r18 = 401(0x191, float:5.62E-43)
            r3 = r19
            r5 = r20
            r15 = r21
            if (r20 == 0) goto L_0x0020
            int r1 = r15.A02
            r0 = r18
            if (r1 == r0) goto L_0x01ca
            r0 = 415(0x19f, float:5.82E-43)
            if (r1 == r0) goto L_0x01bd
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x01ca
            r0 = 418(0x1a2, float:5.86E-43)
            if (r1 == r0) goto L_0x01ca
        L_0x0020:
            r5 = r22
            X.9ue r8 = r5.A0H
            X.C17960vV.A07(r8)
            X.A8C r7 = r3.A0A
            long r0 = r8.A01
            X.9lx r6 = r8.A0B
            r10 = 1
            r2 = 0
            boolean r13 = X.AnonymousClass000.A1W(r6)
            java.lang.String r6 = r8.A0E
            boolean r6 = X.A8C.A05(r6)
            if (r6 == 0) goto L_0x01b7
            X.11P r11 = r7.A00
            long r0 = X.A8C.A00(r11, r0)
            X.0vb r9 = r7.A02
            X.11Y r6 = X.AnonymousClass11X.A00
            java.lang.String r12 = r6.A0B(r9, r0)
            java.lang.String r1 = r8.A0E
            java.lang.String r0 = "DAILY"
            boolean r0 = r1.equals(r0)
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r0 != 0) goto L_0x0185
            java.lang.String r0 = "ASPRESENTED"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x018f
            long r0 = r8.A04
            long r12 = r8.A03
            r16 = 0
            int r14 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x016f
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x016f
            X.118 r14 = r7.A01
            android.content.Context r14 = r14.A00
            r16 = r14
            java.lang.Object[] r14 = X.AnonymousClass3MW.A1b()
            long r0 = X.A8C.A00(r11, r0)
            java.lang.String r0 = r6.A0B(r9, r0)
            r14[r2] = r0
            long r0 = X.A8C.A00(r11, r12)
            java.lang.String r0 = r6.A0B(r9, r0)
            r14[r10] = r0
            r1 = 2131897534(0x7f122cbe, float:1.942996E38)
            r0 = r16
            java.lang.String r9 = r0.getString(r1, r14)
        L_0x0092:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x00ac
            X.95k r6 = new X.95k
            r6.<init>()
            X.118 r0 = r3.A0P
            android.content.Context r1 = r0.A00
            r0 = 2131897546(0x7f122cca, float:1.9429985E38)
            X.C161588Gc.A00(r1, r6, r0)
            r6.A03 = r9
            r4.add(r6)
        L_0x00ac:
            java.util.HashSet r6 = X.C17880vN.A12()
            r0 = 5
            java.lang.Integer[] r11 = new java.lang.Integer[r0]
            r0 = 115(0x73, float:1.61E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9 = 0
            r11[r2] = r0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r18)
            r11[r10] = r14
            r1 = 2
            r0 = 417(0x1a1, float:5.84E-43)
            X.C17880vN.A1T(r11, r0, r1)
            r0 = 20
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r0 = 3
            r11[r0] = r13
            r1 = 4
            r0 = 418(0x1a2, float:5.86E-43)
            X.C17880vN.A1T(r11, r0, r1)
            java.util.Collections.addAll(r6, r11)
            int r0 = r15.A02
            boolean r0 = X.C108965cb.A1Z(r6, r0)
            if (r0 == 0) goto L_0x00fc
            X.95k r6 = new X.95k
            r6.<init>()
            X.118 r0 = r3.A0P
            android.content.Context r1 = r0.A00
            r0 = 2131897492(0x7f122c94, float:1.9429875E38)
            X.C161588Gc.A00(r1, r6, r0)
            java.lang.String r0 = r8.A0E
            java.lang.String r0 = r7.A09(r0)
            r6.A03 = r0
            r4.add(r6)
        L_0x00fc:
            int r1 = r15.A02
            r0 = r18
            if (r1 == r0) goto L_0x014c
            r0 = 20
            if (r1 == r0) goto L_0x014c
            java.lang.String r0 = r8.A0E
            boolean r0 = X.A8C.A05(r0)
            if (r0 == 0) goto L_0x014c
            X.95k r12 = new X.95k
            r12.<init>()
            X.118 r0 = r3.A0P
            android.content.Context r11 = r0.A00
            r0 = 2131897565(0x7f122cdd, float:1.9430023E38)
            X.C161588Gc.A00(r11, r12, r0)
            X.11P r10 = r3.A02
            long r0 = r8.A02
            long r0 = X.A8C.A00(r10, r0)
            X.0vb r7 = r7.A02
            X.11Y r6 = X.AnonymousClass11X.A00
            java.lang.String r0 = r6.A0B(r7, r0)
            r12.A03 = r0
            r4.add(r12)
            X.95k r12 = new X.95k
            r12.<init>()
            r0 = 2131897564(0x7f122cdc, float:1.9430021E38)
            X.C161588Gc.A00(r11, r12, r0)
            long r0 = r8.A01
            long r0 = X.A8C.A00(r10, r0)
            java.lang.String r0 = r6.A0B(r7, r0)
            r12.A03 = r0
            r4.add(r12)
        L_0x014c:
            int r0 = r15.A02
            A06(r5, r3, r4, r0)
            A07(r3, r4)
            X.95k r0 = r3.A0W()
            if (r0 == 0) goto L_0x015d
            r4.add(r0)
        L_0x015d:
            int r0 = r4.size()
            r6 = r23
            if (r9 >= r0) goto L_0x01e7
            java.lang.Object r0 = r4.get(r9)
            r6.add(r0)
            int r9 = r9 + 1
            goto L_0x015d
        L_0x016f:
            int r12 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r12 <= 0) goto L_0x017d
            long r0 = X.A8C.A00(r11, r0)
            java.lang.String r9 = r6.A0B(r9, r0)
            goto L_0x0092
        L_0x017d:
            java.lang.String r0 = "[PAY]IndiaMandateUtils/getPayeeMetadataDueDateDesc next payment date info is unavailable"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r9 = 0
            goto L_0x0092
        L_0x0185:
            if (r13 != 0) goto L_0x019e
            X.118 r0 = r7.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897532(0x7f122cbc, float:1.9429956E38)
            goto L_0x0198
        L_0x018f:
            if (r13 != 0) goto L_0x019e
            X.118 r0 = r7.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897531(0x7f122cbb, float:1.9429954E38)
        L_0x0198:
            java.lang.String r9 = X.C17890vO.A0R(r1, r12, r10, r2, r0)
            goto L_0x0092
        L_0x019e:
            X.118 r0 = r7.A01
            android.content.Context r13 = r0.A00
            r12 = 2131897533(0x7f122cbd, float:1.9429958E38)
            java.lang.Object[] r11 = new java.lang.Object[r10]
            X.9lx r0 = r8.A0B
            long r0 = r0.A00
            long r0 = r0 / r16
            java.lang.String r0 = r6.A0B(r9, r0)
            java.lang.String r9 = X.C17880vN.A0q(r13, r0, r11, r2, r12)
            goto L_0x0092
        L_0x01b7:
            java.lang.String r9 = r7.A07(r0)
            goto L_0x0092
        L_0x01bd:
            X.95k r2 = new X.95k
            r2.<init>()
            X.118 r0 = r3.A0P
            android.content.Context r1 = r0.A00
            r0 = 2131897024(0x7f122ac0, float:1.9428926E38)
            goto L_0x01d6
        L_0x01ca:
            X.95k r2 = new X.95k
            r2.<init>()
            X.118 r0 = r3.A0P
            android.content.Context r1 = r0.A00
            r0 = 2131897025(0x7f122ac1, float:1.9428928E38)
        L_0x01d6:
            X.C161588Gc.A00(r1, r2, r0)
            X.A56 r1 = r3.A0o
            r0 = 1
            java.lang.String r0 = r1.A03(r5, r0)
            r2.A03 = r0
            r4.add(r2)
            goto L_0x0020
        L_0x01e7:
            if (r24 == 0) goto L_0x024d
            int r4 = r15.A02
            X.9ue r0 = r5.A0H
            if (r0 == 0) goto L_0x024d
            java.lang.String r0 = r0.A0E
            boolean r0 = X.A8C.A05(r0)
            if (r0 == 0) goto L_0x024d
            java.util.HashSet r1 = X.C17880vN.A12()
            r0 = 2
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            X.AnonymousClass8BS.A1B(r14, r13, r0)
            java.util.Collections.addAll(r1, r0)
            boolean r0 = X.C108965cb.A1Z(r1, r4)
            if (r0 != 0) goto L_0x024d
            X.C161588Gc.A05(r6)
            X.95N r7 = new X.95N
            r7.<init>()
            X.9ue r0 = r5.A0H
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x022b
            X.0vb r0 = r3.A0Q
            java.util.Locale r4 = r0.A0N()
            X.9ue r0 = r5.A0H
            int r0 = r0.A00
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String.format(r4, r1, r0)
        L_0x022b:
            X.0vb r0 = r3.A0Q
            java.util.Locale r4 = r0.A0N()
            X.9ue r0 = r5.A0H
            X.9Nk[] r0 = r0.A0P
            if (r0 != 0) goto L_0x024e
            r0 = 0
        L_0x0238:
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String.format(r4, r1, r0)
            r1 = 36
            X.AFT r0 = new X.AFT
            r0.<init>(r3, r5, r1)
            r7.A00 = r0
            r6.add(r7)
        L_0x024d:
            return
        L_0x024e:
            int r0 = r0.length
            goto L_0x0238
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96K.A0u(X.AEs, X.AW0, X.8pf, java.util.List, boolean):void");
    }

    public void A0z(AW0 aw0, List list) {
        Context context;
        int i;
        String A0R;
        int A002;
        C170318pf A0C2 = AnonymousClass8BS.A0C(aw0);
        C1766495a r7 = new C1766495a();
        C196219ue r8 = A0C2.A0H;
        C17960vV.A07(r8);
        A8C a8c = this.A0A;
        int i2 = aw0.A02;
        String str = A0C2.A0R;
        long j = r8.A01;
        String str2 = r8.A0E;
        if (i2 == 20 || i2 == 115) {
            boolean A052 = A8C.A05(str2);
            context = a8c.A01.A00;
            if (A052) {
                i = 2131897633;
                A0R = C17890vO.A0R(context, str, 1, 0, i);
            } else {
                Object[] objArr = new Object[2];
                objArr[0] = str;
                A0R = C17880vN.A0q(context, A8C.A01(a8c.A00, a8c.A02, j), objArr, 1, 2131897547);
            }
        } else if (i2 != 401 && i2 != 417 && i2 != 418) {
            A0R = null;
        } else if (!A8C.A05(str2) || !((A002 = r8.A00()) == 2 || A002 == 4 || A002 == 6)) {
            context = a8c.A01.A00;
            i = 2131897548;
            A0R = C17890vO.A0R(context, str, 1, 0, i);
        } else {
            C191059lx r11 = r8.A0B;
            C17960vV.A07(r11);
            C18000vb r10 = a8c.A02;
            AnonymousClass11P r9 = a8c.A00;
            long A003 = A8C.A00(r9, r11.A01);
            AnonymousClass11Y r82 = AnonymousClass11X.A00;
            String A0B2 = r82.A0B(r10, A003);
            A0R = C17880vN.A0q(a8c.A01.A00, r82.A0B(r10, A8C.A00(r9, r11.A00)), C108945cZ.A1a(str, A0B2, 3, 1), 2, 2131897632);
        }
        r7.A01 = A0R;
        if (!TextUtils.isEmpty(A0R)) {
            r7.A00 = 0;
            list.add(r7);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass96K(android.os.Bundle r38, X.AnonymousClass1KB r39, X.AnonymousClass11S r40, X.AnonymousClass18O r41, X.C26911Ty r42, X.C37551pj r43, X.AnonymousClass1M9 r44, X.AnonymousClass11C r45, X.AnonymousClass11P r46, X.AnonymousClass118 r47, X.C18000vb r48, X.AnonymousClass122 r49, X.C26021Qn r50, X.C58842lL r51, X.AnonymousClass1QR r52, X.AnonymousClass1KI r53, X.AnonymousClass1KH r54, X.C18030ve r55, X.AnonymousClass1OZ r56, X.C196199uc r57, X.C20752AXh r58, X.A7U r59, X.AXS r60, X.C20080A6g r61, X.C33301ib r62, X.AnonymousClass1QL r63, X.C33711jG r64, X.AnonymousClass1QD r65, X.AnonymousClass2L2 r66, X.C31061ex r67, X.AnonymousClass1QO r68, X.AnonymousClass1QS r69, X.C33651jA r70, X.A27 r71, X.BD4 r72, X.AQF r73, X.C33351ig r74, X.C85754Op r75, X.A56 r76, X.AnonymousClass90Z r77, X.A4C r78, X.A8C r79, X.C30931ek r80, X.AnonymousClass1R2 r81, X.C30951em r82, X.AnonymousClass10I r83) {
        /*
            r37 = this;
            r4 = r37
            r1 = r66
            r24 = r65
            r23 = r63
            r22 = r62
            r0 = r55
            r20 = r54
            r19 = r53
            r18 = r52
            r17 = r51
            r5 = r38
            r29 = r71
            r8 = r42
            r30 = r72
            r9 = r43
            r10 = r44
            r31 = r74
            r11 = r45
            r32 = r75
            r12 = r46
            r33 = r76
            r13 = r47
            r14 = r48
            r34 = r78
            r15 = r49
            r16 = r50
            r35 = r81
            r36 = r83
            r28 = r70
            r27 = r69
            r7 = r40
            r26 = r68
            r6 = r39
            r21 = r0
            r25 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r4.A02 = r12
            r2 = r41
            r4.A0B = r2
            r4.A03 = r0
            r0 = r79
            r4.A0A = r0
            r0 = r58
            r4.A04 = r0
            r2 = r59
            r4.A05 = r2
            r0 = r61
            r4.A06 = r0
            r3 = r57
            r4.A0C = r3
            r0 = r60
            r4.A0D = r0
            r4.A07 = r1
            r0 = r73
            r4.A09 = r0
            android.content.Context r1 = r13.A00
            X.8zH r0 = new X.8zH
            r21 = r64
            r18 = r56
            r23 = r77
            r24 = r80
            r22 = r67
            r14 = r0
            r15 = r1
            r16 = r6
            r17 = r19
            r19 = r3
            r20 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r4.A0E = r0
            X.8z5 r0 = new X.8z5
            r14 = r82
            r7 = r0
            r8 = r6
            r9 = r13
            r10 = r2
            r11 = r21
            r12 = r22
            r13 = r27
            r15 = r36
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r4.A08 = r0
            if (r38 == 0) goto L_0x00b9
            java.lang.String r0 = "extra_return_after_completion"
            boolean r0 = r5.getBoolean(r0)
            r4.A01 = r0
            java.lang.String r1 = "referral_screen"
            r0 = 0
            java.lang.String r0 = r5.getString(r1, r0)
            r4.A00 = r0
            java.lang.String r0 = "extra_new_mandate_initiation_mode"
            r5.getString(r0)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96K.<init>(android.os.Bundle, X.1KB, X.11S, X.18O, X.1Ty, X.1pj, X.1M9, X.11C, X.11P, X.118, X.0vb, X.122, X.1Qn, X.2lL, X.1QR, X.1KI, X.1KH, X.0ve, X.1OZ, X.9uc, X.AXh, X.A7U, X.AXS, X.A6g, X.1ib, X.1QL, X.1jG, X.1QD, X.2L2, X.1ex, X.1QO, X.1QS, X.1jA, X.A27, X.BD4, X.AQF, X.1ig, X.4Op, X.A56, X.90Z, X.A4C, X.A8C, X.1ek, X.1R2, X.1em, X.10I):void");
    }
}
