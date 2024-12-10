package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.8Gc  reason: invalid class name and case insensitive filesystem */
public class C161588Gc extends AnonymousClass1J2 implements B8b {
    public int A00;
    public AnonymousClass1DT A01 = AnonymousClass3MW.A0M(AnonymousClass000.A13());
    public AEW A02;
    public AW0 A03;
    public AnonymousClass9BU A04;
    public AnonymousClass9BY A05;
    public AnonymousClass9NU A06;
    public AnonymousClass205 A07;
    public C41731wy A08 = AnonymousClass3MW.A0o();
    public Boolean A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D = false;
    public int A0E = 2131896974;
    public String A0F;
    public boolean A0G = false;
    public final Bundle A0H;
    public final AnonymousClass1KB A0I;
    public final AnonymousClass11S A0J;
    public final C26911Ty A0K;
    public final C37551pj A0L;
    public final AnonymousClass1M9 A0M;
    public final AnonymousClass11C A0N;
    public final AnonymousClass11P A0O;
    public final AnonymousClass118 A0P;
    public final C18000vb A0Q;
    public final C26021Qn A0R;
    public final C58842lL A0S;
    public final AnonymousClass1QR A0T;
    public final AnonymousClass1KH A0U;
    public final C18030ve A0V;
    public final C33301ib A0W;
    public final AnonymousClass1QL A0X;
    public final AnonymousClass1QD A0Y;
    public final B5S A0Z;
    public final AnonymousClass2L2 A0a;
    public final AnonymousClass1QO A0b;
    public final AnonymousClass1QS A0c;
    public final C33651jA A0d;
    public final A27 A0e;
    public final BD4 A0f;
    public final AnonymousClass1QE A0g = AnonymousClass1QE.A00("PaymentTransactionDetailsViewModel", "payment-settings", "COMMON");
    public final C33351ig A0h;
    public final C85754Op A0i;
    public final A4C A0j;
    public final AnonymousClass1R2 A0k;
    public final AnonymousClass10I A0l;
    public final AnonymousClass122 A0m;
    public final AnonymousClass1KI A0n;
    public final A56 A0o;

    public static void A03(C20274AEh aEh, C161588Gc r6, Integer num, Integer num2) {
        C20112A7u A012 = C20112A7u.A01();
        A012.A06("num_installments", aEh.A01);
        A012.A08("has_installments_fees", false);
        Integer num3 = num2;
        r6.A0f.BiM(A012, num3, "payment_transaction_details", r6.A0F, num.intValue());
    }

    public void A0b() {
        AW0 aw0;
        C198789yu A002 = C198789yu.A00(0);
        AnonymousClass9NU r0 = this.A06;
        if (!(r0 == null || (aw0 = r0.A01) == null || !aw0.A0J())) {
            this.A0E = 2131895261;
        }
        Bundle bundle = A002.A02;
        bundle.putInt("action_bar_title_res_id", this.A0E);
        bundle.putBoolean("action_bar_on_configuration_change", this.A0G);
        this.A08.A0F(A002);
        this.A0G = true;
    }

    public void A0q(boolean z) {
        C198789yu A002 = C198789yu.A00(1);
        A002.A0K = z;
        this.A08.A0F(A002);
    }

    public void C0N() {
        A0r(false);
    }

    public static void A04(C161588Gc r3) {
        if ("native".equals(r3.A0A)) {
            r3.A0a();
        }
        AnonymousClass1DT r2 = r3.A01;
        List A10 = AnonymousClass3MW.A10(r2);
        A10.clear();
        r3.A0q(false);
        AnonymousClass9NU r0 = r3.A06;
        if (r0 != null && r0.A01 != null) {
            r3.A0h(A10);
            r2.A0F(A10);
        }
    }

    public static void A05(List list) {
        list.add(new AnonymousClass95T());
    }

    public BD1 A0T() {
        if (this instanceof AnonymousClass96J) {
            AZ9 A052 = this.A0c.A05("P2M_LITE");
            C18070vi.A0b(A052);
            return A052;
        } else if (!(this instanceof AnonymousClass96G)) {
            return this.A0c.A06();
        } else {
            AZ9 A053 = this.A0c.A05("GLOBAL_ORDER");
            C17960vV.A07(A053);
            C18070vi.A0X(A053);
            return A053;
        }
    }

    public C183409Yd A0U() {
        boolean z;
        Context context;
        int i;
        int i2;
        AnonymousClass9NU r0 = this.A06;
        C1767495k r2 = null;
        if (r0 != null) {
            AW0 aw0 = r0.A01;
            C20284AEs aEs = r0.A00;
            if (aEs != null) {
                synchronized (aw0) {
                    if (!aw0.A0K() || !((i2 = aw0.A02) == 13 || i2 == 14 || i2 == 15 || i2 == 16)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    boolean z2 = true;
                    if ("non_native".equals(this.A0A)) {
                        context = this.A0P.A00;
                        i = 2131897022;
                    } else {
                        int i3 = aw0.A03;
                        if (i3 != 1) {
                            context = this.A0P.A00;
                            i = 2131897023;
                            if (i3 != 100) {
                                i = 2131897009;
                            }
                        } else {
                            context = this.A0P.A00;
                            i = 2131897024;
                        }
                    }
                    String string = context.getString(i);
                    r2 = new C1767495k();
                    r2.A04 = string;
                    r2.A03 = this.A0o.A03(aEs, true);
                    if (aw0.A03 == 200 || (aEs instanceof AnonymousClass8pM)) {
                        z2 = false;
                    }
                    if (this.A06.A04 && z2) {
                        r2.A01 = new AFT(this, aEs, 40);
                        return r2;
                    }
                }
            }
        }
        return r2;
    }

    public C1767495k A0V() {
        int i;
        AW0 aw0;
        AnonymousClass8pG r1;
        String str;
        if (this instanceof AnonymousClass96J) {
            C1767495k r2 = new C1767495k();
            A00(this.A0P.A00, r2, 2131897005);
            AnonymousClass9NU r0 = this.A06;
            if (r0 == null || (aw0 = r0.A01) == null || (r1 = aw0.A0A) == null) {
                return null;
            }
            if (r1 instanceof C170308pe) {
                str = ((C170308pe) r1).A06;
            } else if (!(r1 instanceof C170298pd)) {
                return null;
            } else {
                str = ((C170298pd) r1).A04;
            }
            if (str == null) {
                return null;
            }
            r2.A03 = str;
            return r2;
        }
        AnonymousClass9NU r02 = this.A06;
        if (r02 != null) {
            AW0 aw02 = r02.A01;
            C1767495k r3 = new C1767495k();
            String A0Y2 = A0Y(aw02);
            if (C20128A8n.A08(A0Y2)) {
                Context context = this.A0P.A00;
                if (this instanceof AnonymousClass96K) {
                    i = 2131897005;
                } else {
                    i = 2131892224;
                }
                A00(context, r3, i);
                r3.A03 = A0Y2;
                r3.A02 = new AFZ(1, A0Y2, this);
                return r3;
            }
        }
        return null;
    }

    public C1767495k A0W() {
        AW0 aw0;
        AnonymousClass8pG r1;
        C1418477e r12;
        AnonymousClass9NU r0 = this.A06;
        if (r0 == null || (aw0 = r0.A01) == null || (r1 = aw0.A0A) == null || !(r1 instanceof C170318pf) || (r12 = ((C170318pf) r1).A08) == null || C20061A5k.A02(r12)) {
            return null;
        }
        C1767495k r2 = new C1767495k();
        r2.A03 = AnonymousClass8BS.A0h(r12);
        A00(this.A0P.A00, r2, 2131896964);
        return r2;
    }

    public String A0X() {
        AnonymousClass9NU r0 = this.A06;
        if (r0 != null) {
            Boolean A052 = r0.A01.A05();
            AnonymousClass8pG r1 = this.A06.A01.A0A;
            C17960vV.A07(r1);
            if (A052 != null) {
                if (A052.booleanValue()) {
                    return r1.A0G();
                }
                return r1.A0I();
            }
        }
        return null;
    }

    public void A0Z() {
        AnonymousClass206 r0;
        String str;
        C198789yu A002;
        AW0 aw0;
        C20279AEn aEn;
        C20279AEn aEn2;
        AnonymousClass21K r02;
        C20285AEt BPK;
        C20285AEt BPK2;
        AnonymousClass1QE r6 = this.A0g;
        r6.A06("Parent- HANDLE_SEND_AGAIN child did not handle");
        AnonymousClass9NU r1 = this.A06;
        if (r1 != null) {
            r0 = r1.A02;
        } else {
            r0 = null;
        }
        if (r0 != null) {
            AW0 A003 = AnonymousClass25B.A00(r0);
            if (A003 != null) {
                UserJid userJid = A003.A0D;
                if (userJid == null) {
                    str = "Parent- HANDLE_SEND_AGAIN pmtTxnInfo.receiverJid is null";
                } else if (!this.A0L.A0P(userJid)) {
                    AnonymousClass8pG r03 = A003.A0A;
                    if (r03 == null || r03.A02 == null) {
                        A002 = C198789yu.A00(12);
                    } else {
                        A002 = C198789yu.A00(21);
                        A002.A0F = A003.A0A.A02.A01;
                        AnonymousClass9NU r04 = this.A06;
                        C17960vV.A07(r04);
                        A002.A09 = r04.A03;
                        A002.A01 = this.A00;
                    }
                } else {
                    A002 = C198789yu.A00(13);
                    A002.A06 = A003.A0D;
                }
            } else {
                str = "Parent- HANDLE_SEND_AGAIN pmtTxnInfo is null";
            }
            r6.A06(str);
            A002 = C198789yu.A00(8);
            A002.A0E = this.A0P.A00.getString(2131893867);
        } else {
            if (!(r1 == null || (aw0 = r1.A01) == null)) {
                AnonymousClass21K r05 = r1.A03;
                if (r05 == null || (BPK2 = r05.BPK()) == null) {
                    aEn = null;
                } else {
                    aEn = BPK2.A02;
                }
                if (aw0.A0G() && aEn != null && !TextUtils.isEmpty(aEn.A0K) && !TextUtils.isEmpty(aEn.A04())) {
                    AnonymousClass9NU r06 = this.A06;
                    C17960vV.A07(r06);
                    if (r06 == null || (r02 = r06.A03) == null || (BPK = r02.BPK()) == null) {
                        aEn2 = null;
                    } else {
                        aEn2 = BPK.A02;
                    }
                    C17960vV.A07(aEn2);
                    A002 = C198789yu.A00(21);
                    A002.A0F = aEn2.A0K;
                    A002.A0G = aEn2.A04();
                    A002.A09 = this.A06.A03;
                    A002.A01 = this.A00;
                    A002.A08 = aEn2;
                }
            }
            str = "Parent- HANDLE_SEND_AGAIN FMessage is null";
            r6.A06(str);
            A002 = C198789yu.A00(8);
            A002.A0E = this.A0P.A00.getString(2131893867);
        }
        this.A08.A0F(A002);
    }

    public void A0a() {
        AW0 aw0;
        AnonymousClass9NU r1 = this.A06;
        if (r1 != null && !this.A0D && (aw0 = r1.A01) != null) {
            this.A0D = true;
            if (this.A0X.A0F() && A0s()) {
                AnonymousClass1QE r2 = this.A0g;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("syncing pending transaction: ");
                A10.append(aw0.A0K);
                A10.append(" status: ");
                AnonymousClass8BV.A1F(r2, A10, aw0.A02);
                BD4 BRb = A0T().BRb();
                if (BRb != null) {
                    BRb.COK();
                }
                this.A0d.A00(new AXO(this, BRb, 7), A0T(), aw0.A0K, aw0.A0N(), aw0.A0G());
            }
        }
    }

    public void A0c(AW0 aw0) {
        if (TextUtils.isEmpty(aw0.A0K) || !aw0.A0K.equals(this.A0B)) {
            AnonymousClass205 r2 = this.A07;
            if (r2 == null) {
                return;
            }
            if ((TextUtils.isEmpty(aw0.A0L) || !aw0.A0L.equals(r2.A01)) && (TextUtils.isEmpty(aw0.A0M) || !aw0.A0M.equals(r2.A01))) {
                return;
            }
        }
        A0r(false);
    }

    public void A0d(C1767795n r4) {
        AW0 aw0 = this.A06.A01;
        r4.A05 = AnonymousClass1R2.A04(this.A0P.A00, aw0);
        r4.A03 = AnonymousClass1R2.A01(aw0);
        int i = -1;
        if (aw0.A02 == 405) {
            i = 2131233547;
        }
        r4.A01 = i;
    }

    public void A0e(AnonymousClass9N6 r3) {
        if (r3.A00 == 2) {
            A0r(true);
        }
    }

    public void A0f(List list) {
        AnonymousClass9NU r0;
        AnonymousClass95U r2;
        int i;
        AnonymousClass9NU r02;
        if (this instanceof AnonymousClass96I) {
            A0g(list);
            A0l(list);
            A0i(list);
            A0k(list);
            if (C18020vd.A05(C18040vf.A02, this.A0b.A02, 1905) && (r02 = this.A06) != null && this.A0k.A0k(r02.A01)) {
                r2 = new AnonymousClass95U();
                i = 23;
            }
            A0m(list);
            A0j(list);
        }
        boolean z = this instanceof AnonymousClass96H;
        A0g(list);
        A0l(list);
        A0i(list);
        if (z) {
            A0k(list);
            if (C18020vd.A05(C18040vf.A02, this.A0b.A02, 1905) && (r0 = this.A06) != null && this.A0k.A0k(r0.A01)) {
                r2 = new AnonymousClass95U();
                i = 18;
            }
        } else {
            A0k(list);
        }
        A0m(list);
        A0j(list);
        r2.A00 = new AFR(this, i);
        list.add(r2);
        A0m(list);
        A0j(list);
    }

    public void A0g(List list) {
        SpannableStringBuilder spannableStringBuilder;
        AnonymousClass9NU r0 = this.A06;
        if (r0 != null) {
            AW0 aw0 = r0.A01;
            AnonymousClass1KN r5 = aw0.A09;
            if (r5 != null) {
                spannableStringBuilder = A3U.A01(this.A0P.A00, this.A0Q, aw0.A01(), r5, 0, false);
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            AEX A042 = aw0.A04();
            boolean A002 = A0T().BWT().A00(aw0);
            AnonymousClass1R2 r02 = this.A0k;
            int A0G2 = r02.A0G(aw0);
            Context context = r02.A04.A00;
            if (A0G2 == 0) {
                A0G2 = 2131896972;
            }
            String string = context.getString(A0G2);
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass001.A1Q(spannableStringBuilder, string, A1b);
            list.add(new C1767395j(A042, spannableStringBuilder, context.getString(2131896967, A1b), (CharSequence) null, A002));
        }
    }

    public void A0i(List list) {
        C1767195h r1 = new C1767195h();
        r1.A02 = this.A06;
        r1.A01 = this;
        r1.A00 = A0T().BQ8();
        list.add(r1);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
        if (((X.C170318pf) r1).A0a == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0130, code lost:
        if (r11.A0X.A0E() == false) goto L_0x0132;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0j(java.util.List r12) {
        /*
            r11 = this;
            X.95m r5 = new X.95m
            r5.<init>()
            X.9NU r0 = r11.A06
            X.AW0 r4 = r0.A01
            X.118 r0 = r11.A0P
            android.content.Context r3 = r0.A00
            int r6 = r4.A03
            r2 = 1
            r1 = 2131896968(0x7f122a88, float:1.9428812E38)
            if (r6 == r2) goto L_0x0053
            r0 = 2
            if (r6 == r0) goto L_0x0050
            r0 = 9
            if (r6 == r0) goto L_0x0050
            r0 = 10
            r1 = 2131896970(0x7f122a8a, float:1.9428816E38)
            if (r6 == r0) goto L_0x0053
            r0 = 20
            if (r6 == r0) goto L_0x004c
            r0 = 40
            if (r6 == r0) goto L_0x004c
            r0 = 100
            r1 = 2131896965(0x7f122a85, float:1.9428806E38)
            if (r6 == r0) goto L_0x0053
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 == r0) goto L_0x0050
            java.lang.String r0 = ""
        L_0x0038:
            r5.A09 = r0
            X.1R2 r0 = r11.A0k
            java.lang.String r0 = r0.A0U(r4)
            r5.A08 = r0
            long r0 = r4.A05
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0098
            monitor-enter(r4)
            goto L_0x0058
        L_0x004c:
            r1 = 2131896969(0x7f122a89, float:1.9428814E38)
            goto L_0x0053
        L_0x0050:
            r1 = 2131896971(0x7f122a8b, float:1.9428818E38)
        L_0x0053:
            java.lang.String r0 = r3.getString(r1)
            goto L_0x0038
        L_0x0058:
            X.8pG r1 = r4.A0A     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x006b
            boolean r0 = r1 instanceof X.C170318pf     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x006b
            X.8pf r1 = (X.C170318pf) r1     // Catch:{ all -> 0x0065 }
            boolean r1 = r1.A0a     // Catch:{ all -> 0x0065 }
            goto L_0x0068
        L_0x0065:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0068:
            r0 = 1
            if (r1 != 0) goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            monitor-exit(r4)
            if (r0 != 0) goto L_0x0098
            r8 = 2131896920(0x7f122a58, float:1.9428715E38)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            X.0vb r6 = r11.A0Q
            X.11P r9 = r11.A0O
            long r0 = r4.A05
            long r0 = r9.A09(r0)
            X.11Y r10 = X.AnonymousClass11X.A00
            java.lang.String r10 = r10.A07(r6, r0)
            long r0 = r4.A05
            long r0 = r9.A09(r0)
            java.lang.String r0 = X.A8I.A00(r6, r0)
            java.lang.String r0 = X.A87.A03(r6, r10, r0)
            java.lang.String r0 = X.C108975cc.A0b(r3, r0, r7, r8)
            r5.A0A = r0
        L_0x0098:
            X.BD1 r0 = r11.A0T()
            X.9uQ r7 = r0.BWi()
            if (r7 == 0) goto L_0x00e8
            X.0ve r0 = r7.A07
            boolean r0 = X.AnonymousClass8BS.A1M(r0)
            if (r0 == 0) goto L_0x00e8
            int r1 = r4.A03
            r0 = 9
            if (r1 != r0) goto L_0x013b
            int r6 = r4.A01
            r1 = 2131232006(0x7f080506, float:1.808011E38)
            if (r6 == r2) goto L_0x00c0
            r0 = 2
            r1 = 2131232005(0x7f080505, float:1.8080107E38)
            if (r6 == r0) goto L_0x00c0
            r1 = 2131231047(0x7f080147, float:1.8078164E38)
        L_0x00c0:
            r5.A00 = r1
            X.AW0 r8 = r11.A03
            if (r8 == 0) goto L_0x00e8
            boolean r0 = r7 instanceof X.C175398ye
            if (r0 == 0) goto L_0x0137
            r6 = 2131891301(0x7f121465, float:1.9417318E38)
        L_0x00cd:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            X.1R2 r0 = r7.A08
            java.lang.String r0 = r0.A0U(r8)
            java.lang.String r0 = android.text.Html.escapeHtml(r0)
            java.lang.String r0 = X.C108975cc.A0b(r3, r0, r1, r6)
            r5.A07 = r0
            r1 = 33
            X.AFR r0 = new X.AFR
            r0.<init>(r11, r1)
            r5.A03 = r0
        L_0x00e8:
            java.lang.Boolean r0 = r4.A05()
            if (r0 == 0) goto L_0x0100
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0134
            com.whatsapp.jid.UserJid r1 = r4.A0D
        L_0x00f6:
            if (r1 == 0) goto L_0x0100
            X.1M9 r0 = r11.A0M
            X.1E7 r0 = r0.A0H(r1)
            r5.A05 = r0
        L_0x0100:
            X.1E7 r0 = r5.A05
            if (r0 == 0) goto L_0x0118
            r1 = 9
        L_0x0106:
            X.Ak0 r2 = new X.Ak0
            r2.<init>(r11, r5, r1)
            r1 = 34
            X.AFR r0 = new X.AFR
            r0.<init>(r2, r1)
        L_0x0112:
            r5.A04 = r0
            r12.add(r5)
            return
        L_0x0118:
            X.BD1 r0 = r11.A0T()
            X.BB4 r0 = r0.BWW()
            if (r0 == 0) goto L_0x0132
            java.lang.String r0 = r11.A0X()
            if (r0 == 0) goto L_0x0132
            X.1QL r0 = r11.A0X
            boolean r0 = r0.A0E()
            r1 = 8
            if (r0 != 0) goto L_0x0106
        L_0x0132:
            r0 = 0
            goto L_0x0112
        L_0x0134:
            com.whatsapp.jid.UserJid r1 = r4.A0E
            goto L_0x00f6
        L_0x0137:
            r6 = 2131891300(0x7f121464, float:1.9417316E38)
            goto L_0x00cd
        L_0x013b:
            X.1ig r6 = r11.A0h
            X.8pG r0 = r4.A0A
            if (r0 == 0) goto L_0x0170
            X.ADR r8 = r0.A01
            if (r8 == 0) goto L_0x0170
            java.lang.String r0 = r8.A02
            long r0 = java.lang.Long.parseLong(r0)
            X.1ih r6 = r6.A06
            X.9ys r6 = r6.A01(r0)
            if (r6 == 0) goto L_0x0170
            java.lang.String r0 = r8.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0170
            int r1 = r4.A02
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x0180
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x0180
            r0 = 419(0x1a3, float:5.87E-43)
            if (r1 == r0) goto L_0x0180
            r0 = 420(0x1a4, float:5.89E-43)
            if (r1 == r0) goto L_0x0180
            switch(r1) {
                case 401: goto L_0x0180;
                case 402: goto L_0x0180;
                case 403: goto L_0x0180;
                default: goto L_0x0170;
            }
        L_0x0170:
            r0 = 0
        L_0x0171:
            r5.A07 = r0
            boolean r0 = r7 instanceof X.C175398ye
            if (r0 == 0) goto L_0x017d
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/cant-see-cashback-in-bank-account/"
        L_0x0179:
            r5.A06 = r0
            goto L_0x00e8
        L_0x017d:
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/cant-see-cashback-in-bank-account-br-p2p/"
            goto L_0x0179
        L_0x0180:
            X.BDa r0 = r6.A07
            if (r0 == 0) goto L_0x0170
            X.0vb r6 = r7.A06
            X.ARR r0 = (X.ARR) r0
            X.1KN r1 = r0.A02
            X.1KJ r0 = r0.A01
            android.text.SpannableStringBuilder r0 = X.A3U.A00(r3, r6, r0, r1)
            java.lang.String r6 = r0.toString()
            boolean r0 = r7 instanceof X.C175398ye
            if (r0 == 0) goto L_0x01a2
            r1 = 2131891299(0x7f121463, float:1.9417314E38)
        L_0x019b:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r0 = X.C108975cc.A0b(r3, r6, r0, r1)
            goto L_0x0171
        L_0x01a2:
            r1 = 2131891298(0x7f121462, float:1.9417312E38)
            goto L_0x019b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161588Gc.A0j(java.util.List):void");
    }

    public void A0k(List list) {
        if (this.A0b.A04(0) && A0t(this.A06.A01)) {
            list.add(new C1767895o(new AFR(this, 32)));
        }
    }

    public void A0l(List list) {
        String str;
        Context context;
        int i;
        Object[] objArr;
        C1766495a r6 = new C1766495a();
        AW0 aw0 = this.A06.A01;
        if (aw0.A0K()) {
            int i2 = aw0.A02;
            if (i2 == 12 || i2 == 11) {
                str = (String) this.A0k.A0L(aw0).second;
            }
            str = null;
        } else {
            AnonymousClass1R2 r0 = this.A0k;
            String A0V2 = r0.A0V(aw0);
            String A0Y2 = r0.A0Y(aw0);
            int i3 = aw0.A02;
            if (i3 == 406 || i3 == 407) {
                context = this.A0P.A00;
                i = 2131897026;
                objArr = new Object[]{A0V2};
            } else {
                if (i3 == 102 && this.A0J.A0O(aw0.A0D)) {
                    context = this.A0P.A00;
                    i = 2131897027;
                    objArr = new Object[]{A0Y2};
                }
                str = null;
            }
            str = context.getString(i, objArr);
        }
        if (!AW0.A00(aw0) && !TextUtils.isEmpty(str)) {
            r6.A01 = str;
            r6.A00 = 0;
            list.add(r6);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0246, code lost:
        r5 = r5.A01.A00;
        r1 = 2131897056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0074, code lost:
        if (r3.A08 == null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03aa, code lost:
        r5 = r5.A01.A00;
        r1 = 2131897037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03c6, code lost:
        r5 = r5.A01.A00;
        r1 = 2131897058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x043f, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x044c, code lost:
        r5 = r5.A01.A00;
        r1 = 2131894106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0530, code lost:
        r10 = X.C17890vO.A0R(r5, r12, 1, 0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0185, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b0, code lost:
        r5 = r5.A01.A00;
        r1 = 2131894119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e3, code lost:
        r5 = r5.A01.A00;
        r1 = 2131894113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01eb, code lost:
        r5 = r5.A01.A00;
        r1 = 2131894116;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0m(java.util.List r15) {
        /*
            r14 = this;
            X.9NU r0 = r14.A06
            X.AW0 r8 = r0.A01
            X.AEs r3 = r0.A00
            X.95n r7 = new X.95n
            r7.<init>()
            r14.A0d(r7)
            X.118 r0 = r14.A0P
            android.content.Context r5 = r0.A00
            boolean r1 = r8.A0K()
            r0 = 2131893596(0x7f121d5c, float:1.9421973E38)
            if (r1 == 0) goto L_0x001e
            r0 = 2131893707(0x7f121dcb, float:1.9422198E38)
        L_0x001e:
            java.lang.String r0 = r5.getString(r0)
            r7.A06 = r0
            X.1R2 r0 = r14.A0k
            int r0 = r0.A0G(r8)
            r7.A02 = r0
            if (r0 == 0) goto L_0x0670
            long r0 = r8.A06
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x005f
            r6 = 2131896920(0x7f122a58, float:1.9428715E38)
            java.lang.Object[] r4 = X.AnonymousClass3MW.A1a()
            X.0vb r2 = r14.A0Q
            X.11P r9 = r14.A0O
            long r0 = r9.A09(r0)
            X.11Y r10 = X.AnonymousClass11X.A00
            java.lang.String r10 = r10.A07(r2, r0)
            long r0 = r8.A06
            long r0 = r9.A09(r0)
            java.lang.String r0 = X.A8I.A00(r2, r0)
            java.lang.String r0 = X.A87.A03(r2, r10, r0)
            java.lang.String r0 = X.C108975cc.A0b(r5, r0, r4, r6)
            r7.A08 = r0
        L_0x005f:
            X.BD1 r0 = r14.A0T()
            X.BDG r6 = r0.BPY()
            X.A4C r5 = r14.A0j
            if (r6 == 0) goto L_0x0651
            java.lang.String r1 = r8.A0J
            if (r1 == 0) goto L_0x0651
            if (r3 == 0) goto L_0x0076
            X.8pb r0 = r3.A08
            r4 = 1
            if (r0 != 0) goto L_0x0077
        L_0x0076:
            r4 = 0
        L_0x0077:
            r0 = -1
            int r1 = X.C20099A7c.A01(r1, r0)
            int r2 = r8.A02
            r0 = 105(0x69, float:1.47E-43)
            if (r2 == r0) goto L_0x0642
            r0 = 108(0x6c, float:1.51E-43)
            if (r2 == r0) goto L_0x0642
            r0 = 406(0x196, float:5.69E-43)
            if (r2 != r0) goto L_0x0651
            boolean r0 = r6.BfC(r1)
            if (r0 == 0) goto L_0x05ff
            X.118 r0 = r5.A01
            android.content.Context r1 = r0.A00
            r0 = 2131896979(0x7f122a93, float:1.9428835E38)
            if (r4 != 0) goto L_0x009c
            r0 = 2131896981(0x7f122a95, float:1.9428839E38)
        L_0x009c:
            java.lang.String r0 = r1.getString(r0)
        L_0x00a0:
            r7.A0C = r0
            if (r0 == 0) goto L_0x0147
            java.util.HashMap r2 = X.C17880vN.A11()
            r7.A0D = r2
            r0 = 1
            X.3C5 r4 = new X.3C5
            r4.<init>(r14, r3, r8, r0)
            r0 = 6
            X.Ak0 r1 = new X.Ak0
            r1.<init>(r14, r3, r0)
            java.lang.String r0 = "forgot-pin"
            r2.put(r0, r1)
            java.util.Map r2 = r7.A0D
            r0 = 7
            X.Ak0 r1 = new X.Ak0
            r1.<init>(r14, r3, r0)
            java.lang.String r0 = "view-balance"
            r2.put(r0, r1)
            java.util.Map r1 = r7.A0D
            java.lang.String r0 = "learn-more"
            r1.put(r0, r4)
            java.util.Map r1 = r7.A0D
            java.lang.String r0 = "refund_failed_learn_more"
            r1.put(r0, r4)
            java.util.Map r2 = r7.A0D
            boolean r0 = r14 instanceof X.AnonymousClass96K
            if (r0 == 0) goto L_0x00e7
            r0 = 1
            X.Ak0 r1 = new X.Ak0
            r1.<init>(r14, r3, r0)
            java.lang.String r0 = "verify-now"
            r2.put(r0, r1)
        L_0x00e7:
            java.util.Map r2 = r7.A0D
            boolean r0 = r14 instanceof X.AnonymousClass96I
            if (r0 == 0) goto L_0x0140
            r0 = 38
        L_0x00ef:
            X.Aju r1 = new X.Aju
            r1.<init>(r14, r0)
            java.lang.String r0 = "incoming_payment_limit_learn_more"
            r2.put(r0, r1)
        L_0x00f9:
            if (r6 == 0) goto L_0x013e
            java.lang.String r1 = r8.A0J
            if (r1 == 0) goto L_0x013e
            r0 = -1
            int r2 = X.C20099A7c.A01(r1, r0)
            int r1 = r8.A02
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L_0x010e
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 != r0) goto L_0x013e
        L_0x010e:
            java.lang.String r0 = r6.BPc(r2)
        L_0x0112:
            r7.A0A = r0
            if (r6 == 0) goto L_0x013c
            java.lang.String r1 = r8.A0J
            if (r1 == 0) goto L_0x013c
            r0 = -1
            int r2 = X.C20099A7c.A01(r1, r0)
            int r1 = r8.A02
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L_0x0129
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 != r0) goto L_0x013c
        L_0x0129:
            java.lang.String r0 = r6.BPa(r2)
        L_0x012d:
            r7.A09 = r0
            r1 = 32
            X.78A r0 = new X.78A
            r0.<init>(r14, r8, r6, r1)
            r7.A04 = r0
            r15.add(r7)
            return
        L_0x013c:
            r0 = 0
            goto L_0x012d
        L_0x013e:
            r0 = 0
            goto L_0x0112
        L_0x0140:
            boolean r0 = r14 instanceof X.AnonymousClass96H
            if (r0 == 0) goto L_0x00f9
            r0 = 33
            goto L_0x00ef
        L_0x0147:
            X.1R2 r4 = r5.A04
            java.lang.String r12 = r4.A0U(r8)
            boolean r0 = r8.A0K()
            r3 = 0
            if (r0 == 0) goto L_0x05fa
            java.lang.String r9 = r4.A0W(r8)
            java.lang.String r11 = r4.A0X(r8)
            X.118 r0 = r5.A01
            android.content.Context r1 = r0.A00
            r0 = 2131898595(0x7f1230e3, float:1.9432112E38)
            java.lang.String r0 = r1.getString(r0)
            boolean r13 = r11.equals(r0)
        L_0x016b:
            X.1QS r0 = r5.A03
            X.BD1 r0 = r0.A06()
            X.BCo r1 = r0.BPe()
            if (r1 == 0) goto L_0x018b
            X.118 r0 = r5.A01
            android.content.res.Resources r0 = X.AnonymousClass3MW.A05(r0)
            java.lang.String r10 = r1.Bai(r0, r8, r12)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x018b
        L_0x0187:
            r7.A0B = r10
            goto L_0x00f9
        L_0x018b:
            int r1 = r8.A02
            if (r1 == 0) goto L_0x05d3
            r0 = 418(0x1a2, float:5.86E-43)
            if (r1 == r0) goto L_0x0455
            r0 = -1
            java.lang.String r10 = ""
            r2 = 1
            switch(r1) {
                case 11: goto L_0x01b0;
                case 12: goto L_0x0536;
                case 13: goto L_0x042f;
                case 14: goto L_0x0187;
                case 15: goto L_0x041b;
                case 16: goto L_0x0407;
                case 17: goto L_0x044c;
                case 18: goto L_0x03fc;
                default: goto L_0x019a;
            }
        L_0x019a:
            r11 = 3
            r9 = 2
            switch(r1) {
                case 101: goto L_0x01b0;
                case 102: goto L_0x04fa;
                case 103: goto L_0x04e5;
                case 104: goto L_0x04e5;
                case 105: goto L_0x03f3;
                case 106: goto L_0x04d3;
                case 107: goto L_0x03ea;
                case 108: goto L_0x0187;
                case 109: goto L_0x03e1;
                case 110: goto L_0x03d8;
                case 111: goto L_0x03cf;
                case 112: goto L_0x0521;
                default: goto L_0x019f;
            }
        L_0x019f:
            r13 = 402(0x192, float:5.63E-43)
            switch(r1) {
                case 401: goto L_0x01b0;
                case 402: goto L_0x045e;
                case 403: goto L_0x0529;
                case 404: goto L_0x03b3;
                case 405: goto L_0x04c2;
                case 406: goto L_0x0276;
                case 407: goto L_0x0276;
                case 408: goto L_0x0233;
                case 409: goto L_0x0187;
                case 410: goto L_0x0261;
                case 411: goto L_0x03b3;
                case 412: goto L_0x04a1;
                case 413: goto L_0x0258;
                case 414: goto L_0x024f;
                case 415: goto L_0x03aa;
                case 416: goto L_0x04ba;
                default: goto L_0x01a4;
            }
        L_0x01a4:
            switch(r1) {
                case 420: goto L_0x022b;
                case 421: goto L_0x0223;
                case 422: goto L_0x0246;
                case 423: goto L_0x03aa;
                case 424: goto L_0x03c6;
                default: goto L_0x01a7;
            }
        L_0x01a7:
            switch(r1) {
                case 601: goto L_0x021b;
                case 602: goto L_0x021b;
                case 603: goto L_0x0213;
                case 604: goto L_0x044c;
                case 605: goto L_0x020b;
                case 606: goto L_0x0203;
                case 607: goto L_0x01fb;
                case 608: goto L_0x01f3;
                default: goto L_0x01aa;
            }
        L_0x01aa:
            switch(r1) {
                case 801: goto L_0x01eb;
                case 802: goto L_0x01e3;
                case 803: goto L_0x01eb;
                case 804: goto L_0x01e3;
                default: goto L_0x01ad;
            }
        L_0x01ad:
            switch(r1) {
                case 901: goto L_0x01db;
                case 902: goto L_0x01db;
                case 903: goto L_0x01c4;
                case 904: goto L_0x01bc;
                case 905: goto L_0x01db;
                case 906: goto L_0x01db;
                case 907: goto L_0x01eb;
                case 908: goto L_0x01e3;
                default: goto L_0x01b0;
            }
        L_0x01b0:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131894119(0x7f121f67, float:1.9423034E38)
        L_0x01b7:
            java.lang.String r10 = r5.getString(r1)
            goto L_0x0187
        L_0x01bc:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131894114(0x7f121f62, float:1.9423024E38)
            goto L_0x01b7
        L_0x01c4:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            X.0ve r0 = r4.A07
            int r0 = X.AnonymousClass8BX.A03(r0)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r1 = 2131894111(0x7f121f5f, float:1.9423018E38)
            if (r0 == 0) goto L_0x01b7
            r1 = 2131894105(0x7f121f59, float:1.9423005E38)
            goto L_0x01b7
        L_0x01db:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131894115(0x7f121f63, float:1.9423026E38)
            goto L_0x01b7
        L_0x01e3:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131894113(0x7f121f61, float:1.9423022E38)
            goto L_0x01b7
        L_0x01eb:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131894116(0x7f121f64, float:1.9423028E38)
            goto L_0x01b7
        L_0x01f3:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131894244(0x7f121fe4, float:1.9423287E38)
            goto L_0x01b7
        L_0x01fb:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131894245(0x7f121fe5, float:1.942329E38)
            goto L_0x01b7
        L_0x0203:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131894248(0x7f121fe8, float:1.9423295E38)
            goto L_0x01b7
        L_0x020b:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131894107(0x7f121f5b, float:1.942301E38)
            goto L_0x01b7
        L_0x0213:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131894246(0x7f121fe6, float:1.9423291E38)
            goto L_0x01b7
        L_0x021b:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131894247(0x7f121fe7, float:1.9423293E38)
            goto L_0x01b7
        L_0x0223:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131897060(0x7f122ae4, float:1.9428999E38)
            goto L_0x01b7
        L_0x022b:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131897049(0x7f122ad9, float:1.9428977E38)
            goto L_0x01b7
        L_0x0233:
            X.8pG r0 = r8.A0A
            if (r0 == 0) goto L_0x0246
            int r0 = r0.A09()
            if (r0 != r13) goto L_0x0246
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131897057(0x7f122ae1, float:1.9428993E38)
            goto L_0x0530
        L_0x0246:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131897056(0x7f122ae0, float:1.942899E38)
            goto L_0x01b7
        L_0x024f:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131897028(0x7f122ac4, float:1.9428934E38)
            goto L_0x01b7
        L_0x0258:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131897029(0x7f122ac5, float:1.9428936E38)
            goto L_0x01b7
        L_0x0261:
            java.lang.String r1 = r8.A0G
            X.2tK r0 = X.C63572tK.A0E
            java.lang.String r0 = "BR"
            boolean r1 = r1.equals(r0)
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            if (r1 == 0) goto L_0x04b6
            r1 = 2131897039(0x7f122acf, float:1.9428956E38)
            goto L_0x01b7
        L_0x0276:
            java.lang.String r1 = r8.A0J
            if (r1 == 0) goto L_0x03aa
            if (r6 == 0) goto L_0x03aa
            int r1 = X.C20099A7c.A01(r1, r0)
            boolean r0 = r6.Bgk(r1)
            if (r0 == 0) goto L_0x02af
            X.118 r0 = r5.A01
            android.content.Context r11 = r0.A00
            r10 = 2131897043(0x7f122ad3, float:1.9428964E38)
            java.lang.Object[] r9 = new java.lang.Object[r9]
            int r0 = r6.BjJ()
            X.C17880vN.A1T(r9, r0, r3)
            X.1KJ r4 = r8.A01()
            X.0vb r3 = r5.A02
            int r1 = r6.BjI()
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            java.lang.String r0 = r4.BLd(r3, r0)
            java.lang.String r10 = X.C17880vN.A0q(r11, r0, r9, r2, r10)
            goto L_0x0187
        L_0x02af:
            boolean r0 = r6.Bf9(r1)
            if (r0 == 0) goto L_0x02c6
            X.118 r0 = r5.A01
            android.content.Context r2 = r0.A00
            r0 = 2131896983(0x7f122a97, float:1.9428843E38)
        L_0x02bc:
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r10 = r6.BRN(r0, r1)
            goto L_0x0187
        L_0x02c6:
            boolean r0 = r6.BfD(r1)
            if (r0 == 0) goto L_0x02d4
            X.118 r0 = r5.A01
            android.content.Context r2 = r0.A00
            r0 = 2131896987(0x7f122a9b, float:1.942885E38)
            goto L_0x02bc
        L_0x02d4:
            boolean r0 = r6.BfH(r1)
            if (r0 == 0) goto L_0x02e2
            X.118 r0 = r5.A01
            android.content.Context r2 = r0.A00
            r0 = 2131896985(0x7f122a99, float:1.9428847E38)
            goto L_0x02bc
        L_0x02e2:
            boolean r0 = r6.BeQ(r1)
            if (r0 == 0) goto L_0x02f0
            X.118 r0 = r5.A01
            android.content.Context r2 = r0.A00
            r0 = 2131897058(0x7f122ae2, float:1.9428995E38)
            goto L_0x02bc
        L_0x02f0:
            boolean r0 = r6.BfG(r1)
            if (r0 == 0) goto L_0x02ff
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131896990(0x7f122a9e, float:1.9428857E38)
            goto L_0x01b7
        L_0x02ff:
            boolean r0 = r6.BfF(r1)
            if (r0 == 0) goto L_0x030e
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131896989(0x7f122a9d, float:1.9428855E38)
            goto L_0x01b7
        L_0x030e:
            boolean r0 = r6.BfE(r1)
            if (r0 == 0) goto L_0x031d
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131896988(0x7f122a9c, float:1.9428853E38)
            goto L_0x01b7
        L_0x031d:
            boolean r0 = r6.BfI(r1)
            if (r0 == 0) goto L_0x032c
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131896986(0x7f122a9a, float:1.9428849E38)
            goto L_0x01b7
        L_0x032c:
            boolean r0 = r6.Bfp(r1)
            if (r0 == 0) goto L_0x033b
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131896999(0x7f122aa7, float:1.9428875E38)
            goto L_0x01b7
        L_0x033b:
            boolean r0 = r6.Bgq(r1)
            if (r0 == 0) goto L_0x034a
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131897002(0x7f122aaa, float:1.9428881E38)
            goto L_0x01b7
        L_0x034a:
            boolean r0 = r6.BfS(r1)
            if (r0 != 0) goto L_0x03a1
            boolean r0 = r6.BfQ(r1)
            if (r0 != 0) goto L_0x03a1
            boolean r0 = r6.BfR(r1)
            if (r0 == 0) goto L_0x0365
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131896993(0x7f122aa1, float:1.9428863E38)
            goto L_0x01b7
        L_0x0365:
            boolean r0 = r6.BfW(r1)
            if (r0 == 0) goto L_0x0374
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131896991(0x7f122a9f, float:1.9428859E38)
            goto L_0x01b7
        L_0x0374:
            boolean r0 = r6.BfX(r1)
            if (r0 == 0) goto L_0x0383
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131896992(0x7f122aa0, float:1.942886E38)
            goto L_0x01b7
        L_0x0383:
            boolean r0 = r6.Bfo(r1)
            if (r0 == 0) goto L_0x0392
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131896998(0x7f122aa6, float:1.9428873E38)
            goto L_0x01b7
        L_0x0392:
            java.lang.String r10 = r6.BYH(r1)
            if (r10 != 0) goto L_0x0187
            X.118 r0 = r5.A01
            android.content.Context r2 = r0.A00
            r0 = 2131897037(0x7f122acd, float:1.9428952E38)
            goto L_0x02bc
        L_0x03a1:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131896994(0x7f122aa2, float:1.9428865E38)
            goto L_0x01b7
        L_0x03aa:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131897037(0x7f122acd, float:1.9428952E38)
            goto L_0x01b7
        L_0x03b3:
            X.8pG r0 = r8.A0A
            if (r0 == 0) goto L_0x03c6
            int r0 = r0.A09()
            if (r0 != r13) goto L_0x03c6
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131897059(0x7f122ae3, float:1.9428997E38)
            goto L_0x0530
        L_0x03c6:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131897058(0x7f122ae2, float:1.9428995E38)
            goto L_0x01b7
        L_0x03cf:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131899506(0x7f123472, float:1.943396E38)
            goto L_0x01b7
        L_0x03d8:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131899505(0x7f123471, float:1.9433958E38)
            goto L_0x01b7
        L_0x03e1:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131899507(0x7f123473, float:1.9433962E38)
            goto L_0x01b7
        L_0x03ea:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131897053(0x7f122add, float:1.9428985E38)
            goto L_0x01b7
        L_0x03f3:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131894110(0x7f121f5e, float:1.9423016E38)
            goto L_0x01b7
        L_0x03fc:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            if (r13 == 0) goto L_0x05ca
            r1 = 2131893996(0x7f121eec, float:1.9422784E38)
            goto L_0x01b7
        L_0x0407:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            if (r13 == 0) goto L_0x0416
            r0 = 2131893998(0x7f121eee, float:1.9422788E38)
            java.lang.String r10 = X.C17890vO.A0R(r5, r9, r2, r3, r0)
            goto L_0x0187
        L_0x0416:
            r1 = 2131893997(0x7f121eed, float:1.9422786E38)
            goto L_0x01b7
        L_0x041b:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            if (r13 == 0) goto L_0x042a
            r0 = 2131894000(0x7f121ef0, float:1.9422792E38)
            java.lang.String r10 = X.C17890vO.A0R(r5, r9, r2, r3, r0)
            goto L_0x0187
        L_0x042a:
            r1 = 2131893999(0x7f121eef, float:1.942279E38)
            goto L_0x01b7
        L_0x042f:
            if (r6 == 0) goto L_0x0443
            java.lang.String r1 = r8.A0J
            int r0 = X.C20099A7c.A01(r1, r0)
            java.lang.String r10 = r6.BPd(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0443
            goto L_0x0187
        L_0x0443:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131893990(0x7f121ee6, float:1.9422772E38)
            goto L_0x01b7
        L_0x044c:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131894106(0x7f121f5a, float:1.9423007E38)
            goto L_0x01b7
        L_0x0455:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131897030(0x7f122ac6, float:1.9428938E38)
            goto L_0x01b7
        L_0x045e:
            java.lang.Long r0 = r4.A0P(r8)
            if (r0 == 0) goto L_0x0187
            long r0 = r0.longValue()
            java.lang.String r4 = r4.A0Q(r0)
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            if (r10 != 0) goto L_0x0485
            X.118 r0 = r5.A01
            android.content.res.Resources r3 = X.AnonymousClass3MW.A05(r0)
            r1 = 2131755462(0x7f1001c6, float:1.9141804E38)
            java.lang.Object[] r0 = X.C108945cZ.A1a(r12, r4, r9, r2)
            java.lang.String r10 = r3.getQuantityString(r1, r2, r0)
            goto L_0x0187
        L_0x0485:
            r9 = 0
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            X.118 r0 = r5.A01
            android.content.Context r1 = r0.A00
            if (r4 <= 0) goto L_0x0498
            r0 = 2131897050(0x7f122ada, float:1.9428979E38)
            java.lang.String r10 = X.C17890vO.A0R(r1, r12, r2, r3, r0)
            goto L_0x0187
        L_0x0498:
            r0 = 2131897048(0x7f122ad8, float:1.9428974E38)
            java.lang.String r10 = r1.getString(r0)
            goto L_0x0187
        L_0x04a1:
            X.118 r0 = r5.A01
            android.content.Context r4 = r0.A00
            r1 = 2131897051(0x7f122adb, float:1.942898E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            X.C17880vN.A1T(r0, r9, r3)
            X.C17880vN.A1T(r0, r11, r2)
            java.lang.String r10 = r4.getString(r1, r0)
            goto L_0x0187
        L_0x04b6:
            r1 = 2131897038(0x7f122ace, float:1.9428954E38)
            goto L_0x0530
        L_0x04ba:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131897062(0x7f122ae6, float:1.9429003E38)
            goto L_0x0530
        L_0x04c2:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            boolean r0 = X.A4C.A01(r8)
            r1 = 2131893488(0x7f121cf0, float:1.9421754E38)
            if (r0 == 0) goto L_0x0530
            r1 = 2131893478(0x7f121ce6, float:1.9421734E38)
            goto L_0x0530
        L_0x04d3:
            X.118 r0 = r5.A01
            android.content.Context r3 = r0.A00
            boolean r0 = X.A4C.A01(r8)
            r1 = 2131893487(0x7f121cef, float:1.9421752E38)
            if (r0 == 0) goto L_0x05f4
            r1 = 2131893477(0x7f121ce5, float:1.9421732E38)
            goto L_0x05f4
        L_0x04e5:
            X.118 r0 = r5.A01
            android.content.Context r4 = r0.A00
            r1 = 2131897034(0x7f122aca, float:1.9428946E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            X.C17880vN.A1T(r0, r9, r3)
            X.C17880vN.A1T(r0, r11, r2)
            java.lang.String r10 = r4.getString(r1, r0)
            goto L_0x0187
        L_0x04fa:
            java.lang.Long r0 = r4.A0P(r8)
            if (r0 == 0) goto L_0x0187
            long r0 = r0.longValue()
            java.lang.String r9 = r4.A0Q(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 != 0) goto L_0x05e4
            X.118 r0 = r5.A01
            android.content.res.Resources r4 = X.AnonymousClass3MW.A05(r0)
            r1 = 2131755463(0x7f1001c7, float:1.9141806E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r9
            java.lang.String r10 = r4.getQuantityString(r1, r2, r0)
            goto L_0x0187
        L_0x0521:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131897054(0x7f122ade, float:1.9428987E38)
            goto L_0x0530
        L_0x0529:
            X.118 r0 = r5.A01
            android.content.Context r5 = r0.A00
            r1 = 2131897047(0x7f122ad7, float:1.9428972E38)
        L_0x0530:
            java.lang.String r10 = X.C17890vO.A0R(r5, r12, r2, r3, r1)
            goto L_0x0187
        L_0x0536:
            int r1 = r8.A03
            r0 = 20
            if (r1 != r0) goto L_0x0580
            X.11S r1 = r5.A00
            com.whatsapp.jid.UserJid r0 = r8.A0E
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x0580
            java.lang.Long r0 = r4.A0P(r8)
            if (r0 == 0) goto L_0x0187
            long r0 = r0.longValue()
            android.util.Pair r10 = r4.A0K(r0)
            if (r10 == 0) goto L_0x056f
            X.118 r0 = r5.A01
            android.content.res.Resources r9 = X.AnonymousClass3MW.A05(r0)
            r5 = 2131755460(0x7f1001c4, float:1.91418E38)
            int r4 = X.C108965cb.A01(r10)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r0 = r10.second
            r1[r3] = r0
            java.lang.String r10 = r9.getQuantityString(r5, r4, r1)
            goto L_0x0187
        L_0x056f:
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            X.118 r0 = r5.A01
            android.content.Context r3 = r0.A00
            r1 = 2131897031(0x7f122ac7, float:1.942894E38)
            if (r2 <= 0) goto L_0x05f4
            r1 = 2131897032(0x7f122ac8, float:1.9428942E38)
            goto L_0x05f4
        L_0x0580:
            X.C17960vV.A07(r9)
            java.lang.Long r0 = r4.A0P(r8)
            if (r0 == 0) goto L_0x0187
            long r0 = r0.longValue()
            android.util.Pair r11 = r4.A0K(r0)
            if (r11 == 0) goto L_0x05ae
            X.118 r0 = r5.A01
            android.content.res.Resources r10 = X.AnonymousClass3MW.A05(r0)
            r5 = 2131755461(0x7f1001c5, float:1.9141802E38)
            int r4 = X.C108965cb.A01(r11)
            java.lang.Object[] r1 = X.AnonymousClass3MX.A1b(r9, r3)
            java.lang.Object r0 = r11.second
            r1[r2] = r0
            java.lang.String r10 = r10.getQuantityString(r5, r4, r1)
            goto L_0x0187
        L_0x05ae:
            r10 = 0
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            X.118 r0 = r5.A01
            android.content.Context r1 = r0.A00
            if (r4 <= 0) goto L_0x05c1
            r0 = 2131897033(0x7f122ac9, float:1.9428944E38)
            java.lang.String r10 = X.C17890vO.A0R(r1, r9, r2, r3, r0)
            goto L_0x0187
        L_0x05c1:
            r0 = 2131897031(0x7f122ac7, float:1.942894E38)
            java.lang.String r10 = r1.getString(r0)
            goto L_0x0187
        L_0x05ca:
            r0 = 2131893995(0x7f121eeb, float:1.9422782E38)
            java.lang.String r10 = X.C17890vO.A0R(r5, r11, r2, r3, r0)
            goto L_0x0187
        L_0x05d3:
            X.118 r0 = r5.A01
            android.content.Context r3 = r0.A00
            boolean r0 = r8.A0K()
            r1 = 2131897035(0x7f122acb, float:1.9428948E38)
            if (r0 == 0) goto L_0x05f4
            r1 = 2131893989(0x7f121ee5, float:1.942277E38)
            goto L_0x05f4
        L_0x05e4:
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            X.118 r0 = r5.A01
            android.content.Context r3 = r0.A00
            r1 = 2131897048(0x7f122ad8, float:1.9428974E38)
            if (r2 <= 0) goto L_0x05f4
            r1 = 2131897052(0x7f122adc, float:1.9428983E38)
        L_0x05f4:
            java.lang.String r10 = r3.getString(r1)
            goto L_0x0187
        L_0x05fa:
            r9 = 0
            r11 = r9
            r13 = 0
            goto L_0x016b
        L_0x05ff:
            boolean r0 = r6.BfU(r1)
            if (r0 == 0) goto L_0x0613
            X.118 r0 = r5.A01
            android.content.Context r1 = r0.A00
            r0 = 2131896995(0x7f122aa3, float:1.9428867E38)
            if (r4 != 0) goto L_0x009c
            r0 = 2131896996(0x7f122aa4, float:1.942887E38)
            goto L_0x009c
        L_0x0613:
            boolean r0 = r6.Bf9(r1)
            if (r0 == 0) goto L_0x0633
            X.1QS r0 = r5.A03
            X.BD1 r0 = r0.A06()
            boolean r0 = r0.BEE()
            if (r0 == 0) goto L_0x0633
            X.118 r0 = r5.A01
            android.content.Context r1 = r0.A00
            r0 = 2131896983(0x7f122a97, float:1.9428843E38)
            if (r4 == 0) goto L_0x009c
            r0 = 2131896984(0x7f122a98, float:1.9428845E38)
            goto L_0x009c
        L_0x0633:
            boolean r0 = r6.BeU(r1)
            if (r0 == 0) goto L_0x0651
            X.118 r0 = r5.A01
            android.content.Context r1 = r0.A00
            r0 = 2131896975(0x7f122a8f, float:1.9428826E38)
            goto L_0x009c
        L_0x0642:
            boolean r0 = r6.Bg3(r1)
            if (r0 == 0) goto L_0x0651
            X.118 r0 = r5.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897042(0x7f122ad2, float:1.9428962E38)
            goto L_0x009c
        L_0x0651:
            int r1 = r8.A02
            r0 = 14
            if (r1 == r0) goto L_0x0667
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto L_0x065e
            r0 = 0
            goto L_0x00a0
        L_0x065e:
            X.118 r0 = r5.A01
            android.content.Context r1 = r0.A00
            r0 = 2131897055(0x7f122adf, float:1.9428989E38)
            goto L_0x009c
        L_0x0667:
            X.118 r0 = r5.A01
            android.content.Context r1 = r0.A00
            r0 = 2131894108(0x7f121f5c, float:1.9423011E38)
            goto L_0x009c
        L_0x0670:
            r0 = 2131896972(0x7f122a8c, float:1.942882E38)
            java.lang.String r0 = r5.getString(r0)
            r7.A07 = r0
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161588Gc.A0m(java.util.List):void");
    }

    public void A0n(List list) {
        AW0 aw0 = this.A06.A01;
        if (C18020vd.A05(C18040vf.A02, this.A0b.A02, 1359) && aw0.A03 == 100 && aw0.A0L() && !aw0.A0H()) {
            C1766895e r2 = new C1766895e();
            r2.A00 = new AFT(this, aw0, 39);
            list.add(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (X.A4C.A01(r7) == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0p(java.util.List r11) {
        /*
            r10 = this;
            java.lang.String r1 = "non_native"
            r5 = r10
            java.lang.String r0 = r10.A0A
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003d
            X.9NU r0 = r10.A06
            X.AW0 r7 = r0.A01
            X.AEs r6 = r0.A00
            X.95d r3 = new X.95d
            r3.<init>()
            X.1QO r0 = r10.A0b
            X.0ve r2 = r0.A02
            r1 = 1359(0x54f, float:1.904E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x002d
            boolean r1 = X.A4C.A01(r7)
            r0 = 1
            r8 = 22
            if (r1 != 0) goto L_0x0030
        L_0x002d:
            r0 = 0
            r8 = 10
        L_0x0030:
            r9 = 5
            X.78D r4 = new X.78D
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A00 = r4
            r3.A01 = r0
            r11.add(r3)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161588Gc.A0p(java.util.List):void");
    }

    public void A0r(boolean z) {
        AnonymousClass9BY r2;
        boolean z2 = z;
        if (this instanceof AnonymousClass966) {
            AnonymousClass966 r22 = (AnonymousClass966) this;
            if (r22.A05 == null) {
                AnonymousClass96F r1 = new AnonymousClass96F(r22, r22.A04, r22.A0A, r22.A0H, z2);
                r22.A05 = r1;
                C17890vO.A0u(r1, r22.A0l);
            }
        } else if (this.A05 == null) {
            String str = this.A0A;
            if ("native".equals(str)) {
                r2 = new AnonymousClass9BY(this, this.A07, this.A0B, z);
            } else if ("non_native".equals(str)) {
                r2 = new AnonymousClass96E(this, this.A07, this.A0B, z);
            } else {
                AnonymousClass8BS.A1F("PaymentTransactionDetailsViewModel", "unsupported payment receipt type");
                return;
            }
            this.A05 = r2;
            C17890vO.A0u(r2, this.A0l);
        }
    }

    public boolean A0s() {
        AnonymousClass9NU r0 = this.A06;
        if (r0 == null || TextUtils.isEmpty(r0.A01.A0K) || this.A06.A01.A0K()) {
            return false;
        }
        return true;
    }

    public static void A00(Context context, C1767495k r1, int i) {
        r1.A04 = context.getString(i);
    }

    public String A0Y(AW0 aw0) {
        if (aw0.A0K() || C20128A8n.A08(aw0.A0F)) {
            return aw0.A0F;
        }
        return aw0.A0K;
    }

    public void A0h(List list) {
        AnonymousClass9NU r0;
        AW0 aw0;
        C20280AEo aEo;
        A0f(list);
        A0o(list);
        A05(list);
        AnonymousClass9NU r02 = this.A06;
        C17960vV.A07(r02);
        AW0 aw02 = r02.A01;
        AnonymousClass8pG r3 = aw02.A0A;
        if (!(r3 == null || (aEo = r3.A02) == null || TextUtils.isEmpty(aEo.A02))) {
            list.add(new AnonymousClass95Z(new AnonymousClass78A(this, r3, aw02, 33), this.A06.A01));
        }
        if (this instanceof AnonymousClass96K) {
            AnonymousClass96K r32 = (AnonymousClass96K) this;
            C18030ve r4 = r32.A03;
            C18040vf r2 = C18040vf.A02;
            if (C18020vd.A05(r2, r4, 8988) && (r0 = r32.A06) != null && (aw0 = r0.A01) != null && aw0.A0F()) {
                list.add(new AnonymousClass95Y(new AFR(r32, 28)));
            }
            if (C18020vd.A05(r2, r4, 10659)) {
                list.add(new AnonymousClass95X(new AFR(r32, 27)));
            }
        }
        A0p(list);
        A0n(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0o(java.util.List r11) {
        /*
            r10 = this;
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            X.95k r1 = r10.A0W()
            if (r1 != 0) goto L_0x0021
            X.9NU r0 = r10.A06
            r1 = 0
            if (r0 == 0) goto L_0x0021
            X.206 r2 = r0.A02
            if (r2 == 0) goto L_0x0021
            boolean r0 = r2 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x01c8
            java.lang.String r0 = r2.A0P()
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            if (r0 == 0) goto L_0x01c8
        L_0x0021:
            r3.add(r1)
            X.1QO r2 = r10.A0b
            X.2tK r1 = X.C63572tK.A0E
            X.1QJ r0 = r2.A04
            X.2tK r0 = r0.A02()
            if (r1 != r0) goto L_0x0044
            boolean r0 = r2.A0E()
            if (r0 != 0) goto L_0x003c
            boolean r0 = r2.A0B()
            if (r0 == 0) goto L_0x0044
        L_0x003c:
            X.9NU r0 = r10.A06
            if (r0 != 0) goto L_0x016c
            r6 = 0
        L_0x0041:
            r3.add(r6)
        L_0x0044:
            X.9Yd r0 = r10.A0U()
            r3.add(r0)
            X.95k r0 = r10.A0V()
            r3.add(r0)
            r4 = r10
            boolean r2 = r10 instanceof X.AnonymousClass96K
            if (r2 == 0) goto L_0x0169
            X.9NU r0 = r10.A06
            r6 = 0
            if (r0 == 0) goto L_0x008b
            X.AW0 r0 = r0.A01
            if (r0 == 0) goto L_0x008b
            X.8pG r5 = r0.A0A
            if (r5 == 0) goto L_0x008b
            boolean r0 = r5 instanceof X.C170318pf
            if (r0 == 0) goto L_0x008b
            X.8pf r5 = (X.C170318pf) r5
            X.9kT r0 = r5.A0G
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008b
            X.95k r6 = new X.95k
            r6.<init>()
            X.118 r0 = r10.A0P
            android.content.Context r1 = r0.A00
            r0 = 2131893650(0x7f121d92, float:1.9422083E38)
            A00(r1, r6, r0)
            X.9kT r0 = r5.A0G
            java.lang.String r0 = r0.A01
            r6.A03 = r0
        L_0x008b:
            r3.add(r6)
            X.9NU r0 = r10.A06
            r9 = 0
            if (r0 == 0) goto L_0x00e0
            X.AW0 r0 = r0.A01
            X.8pG r0 = r0.A0A
            if (r0 == 0) goto L_0x00e0
            X.AEh r1 = r0.A0C()
            if (r1 == 0) goto L_0x00e0
            int r8 = r1.A01
            r0 = 1
            if (r8 <= r0) goto L_0x00e0
            X.ARR r6 = r1.A02
            if (r6 == 0) goto L_0x00e0
            java.lang.Integer r0 = X.AnonymousClass3MY.A0f()
            A03(r1, r10, r0, r9)
            X.0vb r5 = r10.A0Q
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.1KJ r1 = r6.A01
            X.1KN r0 = r6.A02
            java.lang.String r7 = r1.BLc(r5, r0)
            X.95k r9 = new X.95k
            r9.<init>()
            X.118 r0 = r10.A0P
            android.content.Context r6 = r0.A00
            r0 = 2131891372(0x7f1214ac, float:1.9417462E38)
            A00(r6, r9, r0)
            r5 = 2131893757(0x7f121dfd, float:1.94223E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            java.lang.String r0 = java.lang.String.valueOf(r8)
            X.AnonymousClass8BS.A1B(r0, r7, r1)
            java.lang.String r0 = r6.getString(r5, r1)
            r9.A03 = r0
        L_0x00e0:
            r3.add(r9)
            X.9NU r0 = r10.A06
            r7 = 0
            if (r0 == 0) goto L_0x0167
            X.AW0 r5 = r0.A01
            X.95k r6 = new X.95k
            r6.<init>()
            X.118 r0 = r10.A0P
            android.content.Context r1 = r0.A00
            r0 = 2131897008(0x7f122ab0, float:1.9428893E38)
            A00(r1, r6, r0)
            X.8pG r1 = r5.A0A
            if (r1 == 0) goto L_0x0167
            boolean r0 = r1 instanceof X.C170308pe
            if (r0 == 0) goto L_0x015e
            X.8pe r1 = (X.C170308pe) r1
            java.lang.String r5 = r1.A06
        L_0x0105:
            if (r5 == 0) goto L_0x0167
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0167
            r6.A03 = r5
            r1 = 2
            X.AFZ r0 = new X.AFZ
            r0.<init>(r1, r5, r10)
            r6.A02 = r0
        L_0x0117:
            r3.add(r6)
            if (r2 == 0) goto L_0x0159
            X.96K r4 = (X.AnonymousClass96K) r4
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            X.9NU r0 = r4.A06
            X.AW0 r0 = r0.A01
            X.8pG r1 = r0.A0A
            X.8pf r1 = (X.C170318pf) r1
            X.AnonymousClass96K.A07(r4, r2)
            X.9NU r0 = r4.A06
            X.AW0 r0 = r0.A01
            int r0 = r0.A02
            X.AnonymousClass96K.A06(r1, r4, r2, r0)
        L_0x0136:
            r3.addAll(r2)
        L_0x0139:
            boolean r0 = r3.remove(r7)
            if (r0 != 0) goto L_0x0139
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x01d7
            A05(r11)
            r1 = 0
        L_0x0149:
            int r0 = r3.size()
            if (r1 >= r0) goto L_0x01d7
            java.lang.Object r0 = r3.get(r1)
            r11.add(r0)
            int r1 = r1 + 1
            goto L_0x0149
        L_0x0159:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            goto L_0x0136
        L_0x015e:
            boolean r0 = r1 instanceof X.C170298pd
            if (r0 == 0) goto L_0x0167
            X.8pd r1 = (X.C170298pd) r1
            java.lang.String r5 = r1.A04
            goto L_0x0105
        L_0x0167:
            r6 = r7
            goto L_0x0117
        L_0x0169:
            r6 = 0
            goto L_0x008b
        L_0x016c:
            X.AW0 r1 = r0.A01
            X.95k r6 = new X.95k
            r6.<init>()
            X.118 r0 = r10.A0P
            android.content.Context r7 = r0.A00
            r0 = 2131893763(0x7f121e03, float:1.9422312E38)
            A00(r7, r6, r0)
            int r1 = r1.A03
            r0 = 100
            if (r1 == r0) goto L_0x01ba
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x01ba
            r2 = 2131231949(0x7f0804cd, float:1.8079993E38)
            r5 = 2131897072(0x7f122af0, float:1.9429023E38)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131168239(0x7f070bef, float:1.7950774E38)
        L_0x0194:
            int r4 = X.AnonymousClass3MW.A01(r1, r0)
            android.graphics.drawable.Drawable r2 = X.C24261Jm.A00(r7, r2)
            java.lang.String r0 = r7.getString(r5)
            r6.A03 = r0
            if (r2 == 0) goto L_0x0041
            r1 = 2130971198(0x7f040a3e, float:1.7551128E38)
            r0 = 2131102533(0x7f060b45, float:1.7817507E38)
            int r0 = X.AnonymousClass3Ma.A00(r7, r1, r0)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass4aX.A08(r2, r0)
            r6.A00 = r1
            r0 = 0
            r1.setBounds(r0, r0, r4, r4)
            goto L_0x0041
        L_0x01ba:
            r2 = 2131232303(0x7f08062f, float:1.8080711E38)
            r5 = 2131897073(0x7f122af1, float:1.9429025E38)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131168237(0x7f070bed, float:1.795077E38)
            goto L_0x0194
        L_0x01c8:
            boolean r1 = r2 instanceof X.C441322g
            r0 = 205(0xcd, float:2.87E-43)
            if (r1 == 0) goto L_0x01d0
            r0 = 209(0xd1, float:2.93E-43)
        L_0x01d0:
            X.95W r1 = new X.95W
            r1.<init>(r2, r0)
            goto L_0x0021
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161588Gc.A0o(java.util.List):void");
    }

    public boolean A0t(AW0 aw0) {
        BDG BPY = A0T().BPY();
        return this.A0k.A0l(aw0, A0T().BUf(), BPY, 1);
    }

    public C161588Gc(Bundle bundle, AnonymousClass1KB r7, AnonymousClass11S r8, C26911Ty r9, C37551pj r10, AnonymousClass1M9 r11, AnonymousClass11C r12, AnonymousClass11P r13, AnonymousClass118 r14, C18000vb r15, AnonymousClass122 r16, C26021Qn r17, C58842lL r18, AnonymousClass1QR r19, AnonymousClass1KI r20, AnonymousClass1KH r21, C18030ve r22, C33301ib r23, AnonymousClass1QL r24, AnonymousClass1QD r25, AnonymousClass2L2 r26, AnonymousClass1QO r27, AnonymousClass1QS r28, C33651jA r29, A27 a27, BD4 bd4, C33351ig r32, C85754Op r33, A56 a56, A4C a4c, AnonymousClass1R2 r36, AnonymousClass10I r37) {
        AnonymousClass205 r0;
        int i;
        this.A0O = r13;
        this.A0V = r22;
        this.A0I = r7;
        this.A0J = r8;
        this.A0P = r14;
        this.A0l = r37;
        this.A0U = r21;
        this.A0k = r36;
        this.A0M = r11;
        this.A0N = r12;
        this.A0Q = r15;
        this.A0c = r28;
        this.A0L = r10;
        this.A0m = r16;
        this.A0i = r33;
        this.A0Y = r25;
        this.A0j = a4c;
        this.A0X = r24;
        this.A0S = r18;
        this.A0R = r17;
        this.A0b = r27;
        this.A0n = r20;
        this.A0o = a56;
        this.A0K = r9;
        this.A0e = a27;
        this.A0f = bd4;
        this.A0h = r32;
        this.A0T = r19;
        this.A0d = r29;
        AnonymousClass2L2 r3 = r26;
        this.A0a = r3;
        this.A0W = r23;
        this.A0H = bundle;
        this.A0F = AnonymousClass8BR.A0y(bundle);
        AnonymousClass205 A032 = AnonymousClass4aU.A03(bundle, "");
        if (A032 == null || !bundle.containsKey("extra_payment_carousel_card_index")) {
            r0 = A032;
        } else {
            r0 = new AnonymousClass2M2(A032, bundle.getInt("extra_payment_carousel_card_index", 0));
        }
        this.A07 = r0;
        this.A0B = bundle.getString("extra_transaction_id");
        String string = bundle.getString("extra_payment_receipt_type");
        this.A0A = string == null ? "native" : string;
        this.A0C = bundle.getString("extra_transaction_ref");
        this.A09 = Boolean.valueOf(bundle.getBoolean("extra_is_pending_request_saved_instance", false));
        if (this instanceof AnonymousClass96K) {
            i = 7;
        } else if (this instanceof AnonymousClass96H) {
            i = 6;
        } else {
            i = 8;
        }
        C20759AXo aXo = new C20759AXo(this, i);
        this.A0Z = aXo;
        r3.registerObserver(aXo);
        this.A00 = bundle.getInt("extra_payment_flow_entry_point", 0);
    }
}
