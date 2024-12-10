package X;

import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: X.8GH  reason: invalid class name */
public abstract class AnonymousClass8GH extends AnonymousClass1J2 {
    public AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public List A02;
    public List A03;
    public List A04;
    public final AnonymousClass11P A05;
    public final C18030ve A06;
    public final AnonymousClass1QD A07;
    public final AnonymousClass1QS A08;
    public final BD4 A09;
    public final C18000vb A0A;
    public final C32981i4 A0B;

    public static A5K A00(int i) {
        Object[] objArr = new Object[0];
        int i2 = 0;
        if (i == 0) {
            i2 = 8;
        }
        return new A5K((String) null, objArr, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        if (r6 == 0) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.A5C A0T() {
        /*
            r24 = this;
            r0 = r24
            boolean r1 = r0 instanceof X.AnonymousClass96A
            if (r1 == 0) goto L_0x003e
            java.util.List r1 = r0.A04
            boolean r1 = r1.isEmpty()
            r13 = 0
            int r10 = X.C72453Mb.A07(r1)
            r9 = 2131433608(0x7f0b1888, float:1.8489006E38)
            X.A5K r6 = X.A5K.A05
            r3 = 2131893471(0x7f121cdf, float:1.942172E38)
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r1 = 0
            X.A5K r8 = new X.A5K
            r8.<init>(r1, r2, r3, r13)
            r1 = 2131232769(0x7f080801, float:1.8081657E38)
            X.A13 r4 = new X.A13
            r4.<init>(r1)
            boolean r1 = r0 instanceof X.AnonymousClass96B
            if (r1 == 0) goto L_0x003c
            X.Aaf r5 = new X.Aaf
            r5.<init>(r0, r13)
        L_0x0032:
            r11 = 8
            X.A5C r3 = new X.A5C
            r7 = r6
            r12 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        L_0x003c:
            r5 = 0
            goto L_0x0032
        L_0x003e:
            X.96B r0 = (X.AnonymousClass96B) r0
            r12 = 0
            int r6 = r0.A0c(r12)
            r5 = 1
            r4 = 0
            if (r6 == r5) goto L_0x00be
            r1 = 2
            if (r6 == r1) goto L_0x00b7
            r1 = 3
            if (r6 == r1) goto L_0x00a4
            r1 = 4
            if (r6 == r1) goto L_0x010d
            r1 = 5
            if (r6 == r1) goto L_0x00c5
            java.lang.String r1 = "PAY: BrazilPaymentSettingsViewModel/generateDefaultBannerConfiguration/ default NUX stage = NONE"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r3 = 0
            r5 = 0
        L_0x005c:
            r19 = 2131433608(0x7f0b1888, float:1.8489006E38)
            X.1QD r1 = r0.A07
            android.content.SharedPreferences r2 = r1.A03()
            java.lang.String r1 = "payment_brazil_nux_dismissed"
            boolean r1 = r2.getBoolean(r1, r12)
            if (r1 != 0) goto L_0x0071
            r20 = 0
            if (r6 != 0) goto L_0x0073
        L_0x0071:
            r20 = 8
        L_0x0073:
            X.A5K r16 = A00(r5)
            X.A5K r17 = X.A5K.A05
            java.lang.Object[] r1 = new java.lang.Object[r12]
            X.A5K r5 = new X.A5K
            r5.<init>(r4, r1, r3, r12)
            r4 = 2131102004(0x7f060934, float:1.7816434E38)
            r3 = 2131231038(0x7f08013e, float:1.8078146E38)
            r1 = 2131168100(0x7f070b64, float:1.7950492E38)
            X.A13 r2 = new X.A13
            r2.<init>(r4, r3, r1, r1)
            X.Aaf r1 = new X.Aaf
            r1.<init>(r0, r12)
            X.A5C r3 = new X.A5C
            r23 = r12
            r13 = r3
            r14 = r2
            r15 = r1
            r18 = r5
            r21 = r12
            r22 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r3
        L_0x00a4:
            r3 = 2131893109(0x7f121b75, float:1.9420985E38)
            r5 = 2131893103(0x7f121b6f, float:1.9420973E38)
            X.1LC r2 = r0.A02
            java.lang.String r1 = "https://faq.whatsapp.com/1085240205511877"
            android.net.Uri r1 = r2.A00(r1)
            java.lang.String r4 = r1.toString()
            goto L_0x005c
        L_0x00b7:
            r3 = 2131893110(0x7f121b76, float:1.9420987E38)
            r5 = 2131893104(0x7f121b70, float:1.9420975E38)
            goto L_0x005c
        L_0x00be:
            r3 = 2131893108(0x7f121b74, float:1.9420983E38)
            r5 = 2131893102(0x7f121b6e, float:1.9420971E38)
            goto L_0x005c
        L_0x00c5:
            X.1QD r1 = r0.A07
            android.content.SharedPreferences r2 = r1.A03()
            java.lang.String r1 = "payment_brazil_p2p_banner_deprecation_dismissed"
            boolean r1 = r2.getBoolean(r1, r12)
            if (r1 == 0) goto L_0x00d9
            X.A5C r3 = new X.A5C
            r3.<init>(r12)
            return r3
        L_0x00d9:
            X.A5K r8 = X.A5K.A05
            r3 = 2131886950(0x7f120366, float:1.9408493E38)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r1 = "learn-more"
            r2[r12] = r1
            java.lang.String r1 = "https://faq.whatsapp.com/1166944170910926/"
            X.A5K r10 = new X.A5K
            r10.<init>(r1, r2, r3, r12)
            r3 = 2131103398(0x7f060ea6, float:1.7819261E38)
            r2 = 2131232438(0x7f0806b6, float:1.8080985E38)
            r1 = 2131169315(0x7f071023, float:1.7952957E38)
            X.A13 r6 = new X.A13
            r6.<init>(r3, r2, r1, r1)
            X.Aaf r7 = new X.Aaf
            r7.<init>(r0, r5)
            r13 = 8
            r15 = 3
            r11 = 2131433608(0x7f0b1888, float:1.8489006E38)
            X.A5C r3 = new X.A5C
            r14 = r12
            r5 = r3
            r9 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r3
        L_0x010d:
            r5 = 2
            X.Aaf r7 = new X.Aaf
            r7.<init>(r0, r5)
            X.0ve r2 = r0.A06
            X.C18070vi.A0d(r2, r12)
            r1 = 4248(0x1098, float:5.953E-42)
            X.0vf r0 = X.C18040vf.A02
            int r3 = X.C18020vd.A00(r0, r2, r1)
            if (r3 == r5) goto L_0x0153
            r2 = 3
            r0 = 2131893101(0x7f121b6d, float:1.942097E38)
            r1 = 2131893107(0x7f121b73, float:1.9420981E38)
            if (r3 == r2) goto L_0x0131
            r0 = 2131893099(0x7f121b6b, float:1.9420965E38)
            r1 = 2131893105(0x7f121b71, float:1.9420977E38)
        L_0x0131:
            X.A5K r8 = A00(r0)
            X.A5K r9 = X.A5K.A05
            java.lang.Object[] r0 = new java.lang.Object[r12]
            X.A5K r10 = new X.A5K
            r10.<init>(r4, r0, r1, r12)
            r0 = 2131232762(0x7f0807fa, float:1.8081642E38)
            X.A13 r6 = new X.A13
            r6.<init>(r0)
            r11 = 2131433608(0x7f0b1888, float:1.8489006E38)
            X.A5C r3 = new X.A5C
            r13 = r12
            r15 = r12
            r5 = r3
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r3
        L_0x0153:
            r0 = 2131893100(0x7f121b6c, float:1.9420967E38)
            r1 = 2131893106(0x7f121b72, float:1.942098E38)
            goto L_0x0131
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8GH.A0T():X.A5C");
    }

    public A5C A0U(C19962A0v a0v, int i) {
        int i2;
        A5K a5k;
        int i3;
        int i4;
        C198769ys r5 = a0v.A01;
        if (r5 == null) {
            Log.e("PAY: PaymentSettingsViewModel/getIncentiveBannerConfig/offerInfo is NULL");
            return null;
        }
        C196079uQ A0O = AnonymousClass8BU.A0O(this.A08);
        A5K a5k2 = A5K.A05;
        A5K a5k3 = a5k2;
        if (i == 2) {
            C17960vV.A07(r5);
            C22565BDa bDa = r5.A07;
            int value = bDa.getValue();
            ARR arr = (ARR) bDa;
            int i5 = value / arr.A00;
            if (A0O != null) {
                boolean z = A0O instanceof C175398ye;
                if (z) {
                    i3 = 2131891297;
                } else {
                    i3 = 2131891296;
                }
                a5k = A00(i3);
                if (z) {
                    i4 = 2131891295;
                } else {
                    i4 = 2131891294;
                }
                Object[] objArr = new Object[2];
                long j = r5.A05;
                AnonymousClass3MX.A1S(objArr, 0, j);
                objArr[1] = arr.A01.BLd(this.A0A, new BigDecimal(((long) i5) * j));
                a5k2 = new A5K((String) null, objArr, i4, 0);
            } else {
                a5k = a5k2;
            }
            return new A5C(new A13(-1, 2131232004, 2131167056, 2131167057), new C20861Aad(this, r5.A08.A01), a5k3, a5k, a5k2, 2131433548, 0, 8, 0, 1);
        }
        if (A0O != null) {
            boolean z2 = A0O instanceof C175398ye;
            if (!A0b()) {
                if (z2) {
                    i2 = 2131891317;
                } else {
                    i2 = 2131891313;
                }
            } else if (z2) {
                i2 = 2131891293;
            } else {
                i2 = 2131891292;
            }
            a5k2 = A00(i2);
        }
        C17960vV.A07(r5);
        return new A5C(new A13(-1, 2131232004, 2131167056, 2131167057), new C20861Aad(this, r5.A08.A01), a5k2, new A5K(r5.A0F), new A5K(r5.A0C, new Object[]{r5.A0B, "learn-more"}, 2131891314, 0), 2131433548, 0, 0, 8, 1);
    }

    public void A0V(int i, int i2) {
        boolean z;
        BD4 bd4 = this.A09;
        C171858sO A0D = AnonymousClass8BV.A0D(bd4, i);
        if (i2 >= 0) {
            A0D.A07 = Integer.valueOf(i2);
        }
        A0D.A0b = "payment_home";
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = "payment_home";
        A1b[1] = "notify_verification_banner";
        A0D.A0a = String.format("%s.%s", A1b);
        C20112A7u A012 = C20112A7u.A01();
        A012.A07("section", "notify_verification_banner");
        if (this instanceof AnonymousClass96B) {
            z = AnonymousClass8BR.A1S(((AnonymousClass96B) this).A01);
        } else {
            z = false;
        }
        A012.A08("isPushProvisioning", z);
        AnonymousClass8BR.A1H(A0D, A012);
        bd4.BiH(A0D);
    }

    public void A0W(int i, String str) {
        boolean z;
        BD4 bd4 = this.A09;
        C171858sO A0D = AnonymousClass8BV.A0D(bd4, i);
        A0D.A0b = "payment_home";
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass8BS.A1B("payment_home", str, A1b);
        A0D.A0a = String.format("%s.%s", A1b);
        C20112A7u A012 = C20112A7u.A01();
        A012.A07("section", str);
        if (this instanceof AnonymousClass96B) {
            z = AnonymousClass8BR.A1S(((AnonymousClass96B) this).A01);
        } else {
            z = false;
        }
        A012.A08("isPushProvisioning", z);
        AnonymousClass8BR.A1H(A0D, A012);
        bd4.BiH(A0D);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (r0.A08.A01 == X.C17890vO.A04(r6.A07.A03(), "payment_incentive_offer_dismissed")) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        if (((long) (r2.A01 + r2.A00)) < r7.A01.A05) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0X(X.C19962A0v r7, X.A5C r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x001f
            if (r7 == 0) goto L_0x001f
            int r1 = r8.A01
            r0 = 1
            if (r1 != r0) goto L_0x005a
            X.11P r0 = r6.A05
            long r0 = X.AnonymousClass11P.A00(r0)
            int r0 = r7.A00(r0)
            X.A5C r1 = r6.A0U(r7, r0)
        L_0x0017:
            if (r1 == 0) goto L_0x001e
            X.1DT r0 = r6.A01
            r0.A0E(r1)
        L_0x001e:
            return
        L_0x001f:
            X.1QS r0 = r6.A08
            X.9uQ r0 = X.AnonymousClass8BU.A0O(r0)
            if (r7 == 0) goto L_0x005a
            if (r0 == 0) goto L_0x005a
            X.0ve r0 = r0.A07
            boolean r0 = X.AnonymousClass8BS.A1M(r0)
            if (r0 == 0) goto L_0x005a
            X.11P r0 = r6.A05
            long r0 = X.AnonymousClass11P.A00(r0)
            int r5 = r7.A00(r0)
            r0 = 1
            if (r5 == r0) goto L_0x005f
            r0 = 2
            if (r5 != r0) goto L_0x005a
            X.9ys r0 = r7.A01
            X.C17960vV.A07(r0)
            X.2r1 r0 = r0.A08
            long r3 = r0.A01
            X.1QD r0 = r6.A07
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payment_incentive_offer_dismissed"
            long r1 = X.C17890vO.A04(r1, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0075
        L_0x005a:
            X.A5C r1 = r6.A0T()
            goto L_0x0017
        L_0x005f:
            X.A03 r2 = r7.A02
            if (r2 == 0) goto L_0x0075
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0075
            int r1 = r2.A01
            int r0 = r2.A00
            int r1 = r1 + r0
            long r3 = (long) r1
            X.9ys r0 = r7.A01
            long r1 = r0.A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x005a
        L_0x0075:
            X.A5C r1 = r6.A0U(r7, r5)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8GH.A0X(X.A0v, X.A5C):void");
    }

    public void A0Y(C19962A0v a0v, Integer num, String str) {
        C20087A6p.A02(C20087A6p.A00(this.A05, (AnonymousClass1KN) null, a0v, str, false), this.A09, num, "payment_home", (String) null, 1);
    }

    public void A0Z(C19962A0v a0v, Integer num, String str) {
        C20087A6p.A02(C20087A6p.A00(this.A05, (AnonymousClass1KN) null, a0v, str, false), this.A09, num, "payment_home", (String) null, 1);
    }

    public boolean A0b() {
        if (this instanceof IndiaPaymentSettingsViewModel) {
            return ((IndiaPaymentSettingsViewModel) this).A05.A0D();
        }
        if (!(this instanceof AnonymousClass96B)) {
            return false;
        }
        AnonymousClass96B r1 = (AnonymousClass96B) this;
        if (!r1.A03.A03.A03() || AnonymousClass8BU.A0t(r1.A08).isEmpty()) {
            return false;
        }
        return true;
    }

    public AnonymousClass8GH(AnonymousClass11P r2, C18000vb r3, C32981i4 r4, C18030ve r5, AnonymousClass1QD r6, AnonymousClass1QS r7, BD4 bd4) {
        this.A05 = r2;
        this.A06 = r5;
        this.A0A = r3;
        this.A0B = r4;
        this.A08 = r7;
        this.A07 = r6;
        this.A09 = bd4;
        this.A04 = AnonymousClass000.A13();
        this.A02 = AnonymousClass000.A13();
        this.A03 = AnonymousClass000.A13();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if ("api.whatsapp.com".equals(r1) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0a(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0032
            android.net.Uri r1 = android.net.Uri.parse(r4)
            java.util.List r0 = r1.getPathSegments()
            int r2 = r0.size()
            java.lang.String r0 = r1.getScheme()
            java.lang.String r1 = r1.getHost()
            boolean r0 = X.C32981i4.A0D(r0, r1)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "api.whatsapp.com"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            if (r2 <= r0) goto L_0x0032
            X.1DT r1 = r3.A00
            r0 = 1
            X.AnonymousClass3MX.A1K(r1, r0)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8GH.A0a(java.lang.String):void");
    }
}
