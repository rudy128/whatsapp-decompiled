package com.whatsapp.payments.ui;

import X.A27;
import X.A4C;
import X.A56;
import X.A6R;
import X.ALX;
import X.AW0;
import X.AZ9;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass122;
import X.AnonymousClass129;
import X.AnonymousClass181;
import X.AnonymousClass1D9;
import X.AnonymousClass1KB;
import X.AnonymousClass1KH;
import X.AnonymousClass1KI;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass1QD;
import X.AnonymousClass1QE;
import X.AnonymousClass1QJ;
import X.AnonymousClass1QL;
import X.AnonymousClass1QO;
import X.AnonymousClass1QR;
import X.AnonymousClass1QS;
import X.AnonymousClass1R2;
import X.AnonymousClass1VW;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass25A;
import X.AnonymousClass25B;
import X.AnonymousClass2L2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4RR;
import X.AnonymousClass4aU;
import X.AnonymousClass70H;
import X.AnonymousClass72F;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass8Gg;
import X.AnonymousClass8pG;
import X.AnonymousClass93Q;
import X.AnonymousClass955;
import X.AnonymousClass956;
import X.AnonymousClass957;
import X.AnonymousClass958;
import X.AnonymousClass959;
import X.AnonymousClass95A;
import X.AnonymousClass95B;
import X.AnonymousClass95C;
import X.AnonymousClass95D;
import X.AnonymousClass95E;
import X.AnonymousClass95F;
import X.AnonymousClass95G;
import X.AnonymousClass95H;
import X.AnonymousClass95I;
import X.AnonymousClass95J;
import X.AnonymousClass95K;
import X.AnonymousClass96H;
import X.AnonymousClass96I;
import X.AnonymousClass9NU;
import X.B5S;
import X.BD1;
import X.BD4;
import X.C108955ca;
import X.C132216mP;
import X.C1407773a;
import X.C161588Gc;
import X.C161598Gh;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C188879i9;
import X.C188889iA;
import X.C188909iC;
import X.C188919iD;
import X.C189759jn;
import X.C191339mR;
import X.C192479oS;
import X.C19830z4;
import X.C198789yu;
import X.C20112A7u;
import X.C219217x;
import X.C24071It;
import X.C24751Ln;
import X.C26021Qn;
import X.C26631Sw;
import X.C26911Ty;
import X.C27201Vd;
import X.C32021gV;
import X.C32091gc;
import X.C32431hB;
import X.C32861hs;
import X.C33251iW;
import X.C33301ib;
import X.C33351ig;
import X.C33651jA;
import X.C34531kd;
import X.C36361nl;
import X.C36401np;
import X.C37551pj;
import X.C42011xT;
import X.C50522Ut;
import X.C58842lL;
import X.C72453Mb;
import X.C72463Mc;
import X.C827249m;
import X.C85754Op;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.payments.GlobalPaymentTransactionDetailActivity;
import java.util.List;

public class PaymentTransactionDetailsListActivity extends AnonymousClass93Q {
    public C36361nl A00;
    public C132216mP A01;
    public C34531kd A02;
    public AnonymousClass181 A03;
    public C33251iW A04;
    public AnonymousClass1VW A05;
    public AnonymousClass1M9 A06;
    public AnonymousClass1PM A07;
    public C27201Vd A08;
    public C219217x A09;
    public C18000vb A0A;
    public C24751Ln A0B;
    public AnonymousClass1KH A0C;
    public AnonymousClass1D9 A0D;
    public AnonymousClass1LU A0E;
    public C32861hs A0F;
    public C32431hB A0G;
    public C32091gc A0H;
    public ALX A0I;
    public A6R A0J;
    public C191339mR A0K;
    public AnonymousClass1QJ A0L;
    public AnonymousClass1QO A0M;
    public AnonymousClass1QS A0N;
    public AnonymousClass72F A0O;
    public C85754Op A0P;
    public C161588Gc A0Q;
    public C188889iA A0R;
    public C192479oS A0S;
    public AnonymousClass1R2 A0T;
    public C18010vc A0U;
    public C26631Sw A0V;
    public C50522Ut A0W;
    public AnonymousClass129 A0X;
    public C36401np A0Y;
    public C32021gV A0Z;
    public C189759jn A0a;
    public AnonymousClass00H A0b;
    public AnonymousClass00H A0c;
    public AnonymousClass00H A0d;
    public AnonymousClass00H A0e;
    public String A0f;
    public final AnonymousClass1QE A0g = AnonymousClass1QE.A00("PaymentTransactionDetailsListActivity", "payment-settings", "COMMON");

    /* JADX WARNING: type inference failed for: r1v0, types: [X.9mV, java.lang.Object] */
    public static void A03(PaymentTransactionDetailsListActivity paymentTransactionDetailsListActivity, C198789yu r4, String str) {
        AW0 aw0 = r4.A05;
        C17960vV.A07(aw0);
        ? obj = new Object();
        obj.A04 = str;
        obj.A01 = paymentTransactionDetailsListActivity.A0A;
        obj.A02 = aw0;
        obj.A03 = paymentTransactionDetailsListActivity.A0T;
        obj.A00 = paymentTransactionDetailsListActivity.A06;
        obj.A00(paymentTransactionDetailsListActivity);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.94y, X.1xT] */
    /* JADX WARNING: type inference failed for: r2v42, types: [X.950, X.1xT] */
    /* JADX WARNING: type inference failed for: r2v44, types: [X.1xT, X.952] */
    public C42011xT A4b(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (i2 == 218) {
            List list = C42011xT.A0I;
            View A0B2 = AnonymousClass3MX.A0B(C72463Mc.A0K(viewGroup2, 0), viewGroup2, 2131626415, false);
            ? r2 = new C42011xT(A0B2);
            r2.A00 = (ListItemWithLeftIcon) C18070vi.A05(A0B2, 2131435383);
            return r2;
        } else if (i2 != 219) {
            if (i2 != 306) {
                switch (i) {
                    case 200:
                        return new AnonymousClass95F(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131626405), this.A0E, this.A0O);
                    case 201:
                        return new AnonymousClass95D(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131626404), this.A0J);
                    case 202:
                        C18030ve r4 = this.A0E;
                        return new AnonymousClass95I(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131626420), this.A08, r4);
                    case 203:
                        C18030ve r8 = this.A0E;
                        C36401np r9 = this.A0Y;
                        C27201Vd r6 = this.A08;
                        return new AnonymousClass95J(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131626411), this.A03, this.A05, r6, this.A08, r8, r9);
                    case 204:
                        View A092 = AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131626409);
                        ? r22 = new C42011xT(A092);
                        r22.A01 = AnonymousClass8BR.A0A(A092, 2131433673);
                        r22.A00 = AnonymousClass3MW.A0H(A092, 2131433674);
                        r22.A02 = C17880vN.A0E(A092, 2131433677);
                        return r22;
                    case 205:
                        AnonymousClass1KB r42 = this.A05;
                        C32091gc r82 = this.A0H;
                        AnonymousClass11C r7 = this.A08;
                        return new AnonymousClass95K(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131626410), r42, this.A00, (AnonymousClass4RR) this.A0b.get(), r7, r82);
                    case 206:
                        View A093 = AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131626414);
                        ? r23 = new C42011xT(A093);
                        r23.A01 = AnonymousClass3MW.A0J(A093, 2131436208);
                        r23.A00 = AnonymousClass3MW.A0J(A093, 2131429927);
                        return r23;
                    case 207:
                        List list2 = C42011xT.A0I;
                        View inflate = C72463Mc.A0K(viewGroup2, 0).inflate(2131626403, viewGroup2, false);
                        C72453Mb.A1S(inflate);
                        return new C42011xT(inflate);
                    case 208:
                        List list3 = C42011xT.A0I;
                        return new AnonymousClass957(C108955ca.A0G(C72463Mc.A0K(viewGroup2, 0), viewGroup2, 2131626426, false));
                    case 209:
                        C18030ve r16 = this.A0E;
                        AnonymousClass1KB r26 = this.A05;
                        AnonymousClass00H r14 = this.A0c;
                        AnonymousClass10I r12 = this.A05;
                        C34531kd r11 = this.A02;
                        C33251iW r10 = this.A04;
                        C18000vb r83 = this.A0A;
                        C32021gV r72 = this.A0Z;
                        C219217x r62 = this.A09;
                        C19830z4 r5 = this.A0A;
                        C32431hB r43 = this.A0G;
                        C26631Sw r3 = this.A0V;
                        C32861hs r24 = this.A0F;
                        C50522Ut r13 = this.A0W;
                        View A094 = AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131626421);
                        AnonymousClass00H r242 = r14;
                        AnonymousClass10I r232 = r12;
                        C33251iW r122 = r10;
                        return new AnonymousClass958(A094, new C1407773a(A094, r26, r11, r122, r62, r5, r83, r16, r24, r43, (AnonymousClass70H) this.A0e.get(), r3, r13, r72, r232, r242, (Runnable) null));
                    case 210:
                        return new AnonymousClass956(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131626416));
                    case 211:
                        return new AnonymousClass959(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131626417));
                    case 212:
                        return new AnonymousClass95E(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131626418), A4d().BRb());
                    case 213:
                        return new AnonymousClass95A(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131626413));
                    case 214:
                        return new AnonymousClass95H(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131626406));
                    case 215:
                        return new AnonymousClass95B(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131626407));
                    case 216:
                        C18030ve r73 = this.A0E;
                        AnonymousClass1KB r52 = this.A05;
                        return new AnonymousClass95G(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131626408), this.A01, r52, this.A08, r73, this.A0X);
                    default:
                        return super.A4b(viewGroup2, i2);
                }
            } else {
                return new AnonymousClass95C(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup2), viewGroup2, 2131626296), this.A0E);
            }
        } else {
            List list4 = C42011xT.A0I;
            return new AnonymousClass955(AnonymousClass3MX.A0B(C72463Mc.A0K(viewGroup2, 0), viewGroup2, 2131626412, false));
        }
    }

    public C20112A7u A4c(C20112A7u a7u, AnonymousClass9NU r5) {
        AW0 aw0;
        String A0H2;
        if (!(r5 == null || (aw0 = r5.A01) == null)) {
            AnonymousClass1R2 r1 = this.A0T;
            AnonymousClass8pG r0 = aw0.A0A;
            if (r0 == null) {
                A0H2 = null;
            } else {
                A0H2 = r0.A0H();
            }
            if ((!TextUtils.isEmpty(A0H2) && aw0.A0L != null && r1.A00.A0O(aw0.A0E)) || this.A0T.A0j(aw0)) {
                if (a7u == null) {
                    a7u = C20112A7u.A02();
                }
                a7u.A08("interop_chat_bubble_eligible", true);
            }
        }
        return a7u;
    }

    public BD1 A4d() {
        AnonymousClass1QS r1;
        String str;
        if (this instanceof P2mLitePaymentTransactionDetailActivity) {
            r1 = this.A0N;
            str = "P2M_LITE";
        } else if (!(this instanceof GlobalPaymentTransactionDetailActivity)) {
            return this.A0N.A06();
        } else {
            r1 = this.A0N;
            str = "GLOBAL_ORDER";
        }
        AZ9 A052 = r1.A05(str);
        C17960vV.A07(A052);
        C18070vi.A0X(A052);
        return A052;
    }

    public C161588Gc A4e(Bundle bundle) {
        C24071It A0C2;
        Class cls;
        Bundle bundle2 = bundle;
        if (this instanceof P2mLitePaymentTransactionDetailActivity) {
            P2mLitePaymentTransactionDetailActivity p2mLitePaymentTransactionDetailActivity = (P2mLitePaymentTransactionDetailActivity) this;
            AnonymousClass00H r0 = p2mLitePaymentTransactionDetailActivity.A02;
            if (r0 != null) {
                C188909iC r02 = (C188909iC) r0.get();
                if (bundle == null) {
                    bundle2 = AnonymousClass3MY.A09(p2mLitePaymentTransactionDetailActivity);
                }
                AnonymousClass11P r50 = r02.A05;
                C18030ve r31 = r02.A0E;
                AnonymousClass1KB r49 = r02.A00;
                AnonymousClass11S r48 = r02.A01;
                AnonymousClass118 r47 = r02.A06;
                AnonymousClass10I r46 = r02.A0R;
                AnonymousClass1KH r30 = r02.A0C;
                AnonymousClass1R2 r23 = r02.A0Q;
                AnonymousClass1M9 r22 = r02.A03;
                AnonymousClass11C r21 = r02.A04;
                C18000vb r24 = r02.A07;
                AnonymousClass1QS r20 = r02.A0J;
                C37551pj A0V2 = AnonymousClass3MW.A0V(r02.A0S);
                AnonymousClass122 r25 = r02.A08;
                C85754Op r14 = r02.A0O;
                AnonymousClass1QD r18 = r02.A0H;
                A4C a4c = r02.A0P;
                C58842lL r11 = (C58842lL) C18070vi.A0E(r02.A0T);
                AnonymousClass1QL r16 = r02.A0G;
                C26021Qn r26 = r02.A09;
                AnonymousClass1QO r15 = r02.A0I;
                AnonymousClass1KI r10 = r02.A0B;
                A56 a56 = (A56) C18070vi.A0E(r02.A0U);
                C26911Ty r8 = r02.A02;
                A27 a27 = r02.A0L;
                BD4 bd4 = r02.A0M;
                C33351ig r5 = r02.A0N;
                AnonymousClass1QR r4 = r02.A0A;
                C33651jA r3 = r02.A0K;
                C33301ib r1 = r02.A0F;
                AnonymousClass8BU.A1I(r14, 15, r11);
                C18070vi.A0d(a56, 23);
                A4C a4c2 = a4c;
                AnonymousClass1R2 r45 = r23;
                C161588Gc r142 = new C161588Gc(bundle2, r49, r48, r8, A0V2, r22, r21, r50, r47, r24, r25, r26, r11, r4, r10, r30, r31, r1, r16, r18, (AnonymousClass2L2) r02.A0V.get(), r15, r20, r3, a27, bd4, r5, r14, a56, a4c2, r45, r46);
                p2mLitePaymentTransactionDetailActivity.A0Q = r142;
                return r142;
            }
        } else {
            if (this instanceof BrazilPaymentTransactionDetailActivity) {
                BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity = (BrazilPaymentTransactionDetailActivity) this;
                if (bundle == null) {
                    bundle2 = AnonymousClass3MY.A09(brazilPaymentTransactionDetailActivity);
                }
                boolean A012 = brazilPaymentTransactionDetailActivity.A0M.A01();
                C188919iD r2 = brazilPaymentTransactionDetailActivity.A03;
                if (A012) {
                    A0C2 = AnonymousClass8BR.A0C(new AnonymousClass8Gg(bundle2, r2, 2), brazilPaymentTransactionDetailActivity);
                    cls = AnonymousClass96I.class;
                } else {
                    A0C2 = AnonymousClass8BR.A0C(new AnonymousClass8Gg(bundle2, r2, 1), brazilPaymentTransactionDetailActivity);
                    cls = AnonymousClass96H.class;
                }
            } else if (this instanceof GlobalPaymentTransactionDetailActivity) {
                GlobalPaymentTransactionDetailActivity globalPaymentTransactionDetailActivity = (GlobalPaymentTransactionDetailActivity) this;
                AnonymousClass00H r03 = globalPaymentTransactionDetailActivity.A00;
                if (r03 != null) {
                    C188879i9 r04 = (C188879i9) r03.get();
                    if (bundle == null) {
                        bundle2 = AnonymousClass3MY.A09(globalPaymentTransactionDetailActivity);
                    }
                    AnonymousClass11P r502 = r04.A05;
                    C18030ve r312 = r04.A0D;
                    AnonymousClass1KB r492 = r04.A00;
                    AnonymousClass11S r482 = r04.A01;
                    AnonymousClass118 r472 = r04.A06;
                    AnonymousClass10I r462 = r04.A0Q;
                    AnonymousClass1KH r302 = r04.A0C;
                    AnonymousClass1R2 r232 = r04.A0P;
                    AnonymousClass1M9 r222 = r04.A03;
                    AnonymousClass11C r212 = r04.A04;
                    C18000vb r242 = r04.A07;
                    AnonymousClass1QS r202 = r04.A0I;
                    C37551pj A0V3 = AnonymousClass3MW.A0V(r04.A0R);
                    AnonymousClass122 r252 = r04.A08;
                    C85754Op r143 = r04.A0N;
                    AnonymousClass1QD r182 = r04.A0G;
                    A4C a4c3 = r04.A0O;
                    AnonymousClass1QL r162 = r04.A0F;
                    C58842lL r112 = (C58842lL) C18070vi.A0E(r04.A0S);
                    C26021Qn r262 = r04.A09;
                    AnonymousClass1QO r152 = r04.A0H;
                    AnonymousClass1KI r102 = r04.A0B;
                    A56 a562 = (A56) C18070vi.A0E(r04.A0T);
                    C26911Ty r82 = r04.A02;
                    A27 a272 = r04.A0K;
                    BD4 bd42 = r04.A0L;
                    C33351ig r52 = r04.A0M;
                    AnonymousClass1QR r42 = r04.A0A;
                    C33651jA r32 = r04.A0J;
                    C33301ib r12 = r04.A0E;
                    C18070vi.A0d(r143, 15);
                    C18070vi.A0d(r112, 19);
                    C18070vi.A0d(a562, 23);
                    A4C a4c4 = a4c3;
                    AnonymousClass1R2 r452 = r232;
                    C161588Gc r144 = new C161588Gc(bundle2, r492, r482, r82, A0V3, r222, r212, r502, r472, r242, r252, r262, r112, r42, r102, r302, r312, r12, r162, r182, (AnonymousClass2L2) r04.A0U.get(), r152, r202, r32, a272, bd42, r52, r143, a562, a4c4, r452, r462);
                    globalPaymentTransactionDetailActivity.A0Q = r144;
                    return r144;
                }
            } else {
                C188889iA r27 = this.A0R;
                BD4 BRb = A4d().BRb();
                if (bundle == null) {
                    bundle2 = AnonymousClass3MY.A09(this);
                }
                A0C2 = AnonymousClass8BR.A0C(new C161598Gh(bundle2, BRb, r27), this);
                cls = C161588Gc.class;
            }
            return (C161588Gc) A0C2.A00(cls);
        }
        C18070vi.A11("viewModelCreationDelegate");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0355, code lost:
        r3.putExtra("extra_bank_account", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0358, code lost:
        startActivity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x035b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0408, code lost:
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x040b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0526, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0529, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0198, code lost:
        A03(r9, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x019b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4f(X.C198789yu r28) {
        /*
            r27 = this;
            r2 = r28
            int r8 = r2.A00
            java.lang.String r3 = "extra_merchant_code"
            java.lang.String r6 = "paymentHandle"
            java.lang.String r5 = "payment_transaction_details"
            java.lang.String r7 = "extra_bank_account"
            r4 = 1
            r1 = 0
            r0 = 0
            r9 = r27
            switch(r8) {
                case 0: goto L_0x015d;
                case 1: goto L_0x0410;
                case 2: goto L_0x0526;
                case 3: goto L_0x040c;
                case 4: goto L_0x03e9;
                case 5: goto L_0x03ad;
                case 6: goto L_0x0396;
                case 7: goto L_0x0324;
                case 8: goto L_0x031e;
                case 9: goto L_0x030c;
                case 10: goto L_0x01fd;
                case 11: goto L_0x03fb;
                case 12: goto L_0x045d;
                case 13: goto L_0x01de;
                case 14: goto L_0x0014;
                case 15: goto L_0x0014;
                case 16: goto L_0x033a;
                case 17: goto L_0x014f;
                case 18: goto L_0x012b;
                case 19: goto L_0x01da;
                case 20: goto L_0x01ae;
                case 21: goto L_0x008d;
                case 22: goto L_0x019c;
                case 23: goto L_0x0193;
                case 24: goto L_0x0014;
                case 25: goto L_0x0062;
                case 26: goto L_0x0015;
                case 27: goto L_0x0014;
                case 28: goto L_0x0196;
                default: goto L_0x0014;
            }
        L_0x0014:
            return
        L_0x0015:
            X.8Gc r7 = r9.A0Q
            java.lang.String r6 = r9.A0f
            r3 = 143(0x8f, float:2.0E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            X.BD4 r10 = r7.A0f
            r15 = r1
            r16 = r1
            r19 = r4
            r20 = r0
            r13 = r5
            r14 = r6
            r17 = r4
            r18 = r0
            r11 = r1
            r10.BiJ(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.4Op r4 = r9.A0P
            X.11S r3 = r9.A02
            X.AW0 r0 = r2.A05
            X.C17960vV.A07(r0)
            com.whatsapp.jid.UserJid r0 = r0.A0E
            boolean r1 = r3.A0O(r0)
            X.AW0 r0 = r2.A05
            if (r1 != 0) goto L_0x005f
            com.whatsapp.jid.UserJid r0 = r0.A0E
        L_0x0047:
            X.C17960vV.A07(r0)
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r3)
            if (r0 == 0) goto L_0x0014
            X.0zA r0 = r4.A00
            r0.A03()
            r3.A0I()
            java.lang.String r0 = "getCreateOrderActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x005f:
            com.whatsapp.jid.UserJid r0 = r0.A0D
            goto L_0x0047
        L_0x0062:
            X.8Gc r3 = r9.A0Q
            java.lang.String r2 = r9.A0f
            r0 = 142(0x8e, float:1.99E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r18 = 0
            X.BD4 r10 = r3.A0f
            r15 = r1
            r16 = r1
            r19 = r4
            r13 = r5
            r14 = r2
            r17 = r4
            r20 = r18
            r11 = r1
            r10.BiJ(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.BD1 r0 = r9.A4d()
            X.A5D r0 = r0.BUf()
            if (r0 == 0) goto L_0x0014
            r0.A01(r9, r5)
            return
        L_0x008d:
            X.8Gc r7 = r9.A0Q
            java.lang.String r6 = r9.A0f
            r3 = 87
            java.lang.Integer r18 = java.lang.Integer.valueOf(r3)
            X.BD4 r3 = r7.A0f
            r15 = r1
            r21 = r1
            r22 = r1
            r25 = r4
            r26 = r0
            r16 = r3
            r17 = r1
            r19 = r5
            r20 = r6
            r23 = r4
            r24 = r0
            r16.BiJ(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.21K r3 = r2.A09
            if (r3 != 0) goto L_0x00fd
            java.lang.String r3 = "PAY : PaymentTransactionDetailsListActivity/EVENT_OPEN_ORDER_DETAILS_PAGE : orderMessageKey is null"
            com.whatsapp.util.Log.e((java.lang.String) r3)
            X.AW0 r5 = r2.A05
            if (r5 == 0) goto L_0x00fb
            com.whatsapp.jid.UserJid r3 = r5.A0D
            if (r3 == 0) goto L_0x00fb
            java.lang.Boolean r6 = r5.A05()
            if (r6 == 0) goto L_0x00fb
            X.1M9 r5 = r9.A06
            X.AW0 r3 = r2.A05
            com.whatsapp.jid.UserJid r3 = r3.A0D
            X.1E7 r5 = r5.A0H(r3)
            boolean r3 = r6.booleanValue()
            if (r3 == 0) goto L_0x00f8
            java.lang.String r7 = r5.A0K()
        L_0x00dc:
            r3 = 2131893200(0x7f121bd0, float:1.942117E38)
            java.lang.String r6 = r9.getString(r3)
            r5 = 2131893199(0x7f121bcf, float:1.9421168E38)
            java.lang.Object[] r3 = X.AnonymousClass3MX.A1b(r7, r0)
            java.lang.String r0 = r2.A0F
            java.lang.String r0 = X.C17880vN.A0q(r9, r0, r3, r4, r5)
            X.05w r0 = X.C20110A7s.A01(r9, r1, r6, r0)
            r0.show()
            return
        L_0x00f8:
            java.lang.String r7 = r5.A0c
            goto L_0x00dc
        L_0x00fb:
            r7 = r1
            goto L_0x00dc
        L_0x00fd:
            X.C17960vV.A07(r3)
            X.206 r3 = (X.AnonymousClass206) r3
            X.205 r14 = r3.A0v
            boolean r3 = r14.A02
            if (r3 == 0) goto L_0x041f
            X.4Op r0 = r9.A0P
            X.0ve r0 = r0.A01
            r2 = 1107(0x453, float:1.551E-42)
            r0.A0N(r2)
            X.4Op r0 = r9.A0P
            X.0ve r1 = r0.A01
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r1, r2)
            if (r0 == 0) goto L_0x0014
            X.4Op r0 = r9.A0P
            X.0zA r0 = r0.A00
            r0.A03()
            java.lang.String r0 = "getOrderDetailsActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x012b:
            boolean r1 = r9 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity
            if (r1 == 0) goto L_0x013d
            X.1KB r2 = r9.A05
            r1 = 2131893758(0x7f121dfe, float:1.9422302E38)
            java.lang.String r1 = r9.getString(r1)
            r2.A0G(r1, r0)
            goto L_0x0526
        L_0x013d:
            boolean r0 = r9 instanceof com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity
            if (r0 == 0) goto L_0x0526
            X.8Gc r2 = r9.A0Q
            boolean r0 = r2 instanceof X.AnonymousClass96H
            if (r0 == 0) goto L_0x0014
            X.10I r1 = r2.A0l
            r0 = 34
            X.C21427Aju.A00(r1, r2, r0)
            return
        L_0x014f:
            X.AW0 r1 = r2.A05
            if (r1 == 0) goto L_0x0014
            X.BD1 r3 = r9.A4d()
            X.AW0 r1 = r2.A05
            X.AnonymousClass9RS.A00(r9, r1, r3, r5, r0)
            return
        L_0x015d:
            android.os.Bundle r3 = r2.A02
            java.lang.String r2 = "action_bar_on_configuration_change"
            boolean r2 = r3.getBoolean(r2, r0)
            if (r2 != 0) goto L_0x016e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r9.A4g(r2, r1)
        L_0x016e:
            java.lang.String r1 = "action_bar_title_res_id"
            int r1 = r3.getInt(r1)
            X.01n r3 = r9.getSupportActionBar()
            if (r3 == 0) goto L_0x0014
            r3.A0W(r4)
            r3.A0M(r1)
            android.content.Intent r2 = r9.getIntent()
            java.lang.String r1 = "extra_action_bar_display_close"
            boolean r0 = r2.getBooleanExtra(r1, r0)
            if (r0 == 0) goto L_0x0014
            r0 = 2131231815(0x7f080447, float:1.8079722E38)
            r3.A0K(r0)
            return
        L_0x0193:
            java.lang.String r0 = "wa_p2m_receipt_report_transaction"
            goto L_0x0198
        L_0x0196:
            java.lang.String r0 = "wa_p2m_lite_receipt_support"
        L_0x0198:
            A03(r9, r2, r0)
            return
        L_0x019c:
            X.Af0 r3 = new X.Af0
            r3.<init>()
            X.10I r1 = r9.A05
            r0 = 42
            X.C21435Ak2.A00(r1, r9, r2, r3, r0)
            r0 = 19
            X.C21133Af1.A00(r3, r2, r9, r0)
            return
        L_0x01ae:
            X.8Gc r6 = r9.A0Q
            java.lang.String r3 = r9.A0f
            r2 = 141(0x8d, float:1.98E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            X.BD4 r2 = r6.A0f
            r15 = r1
            r16 = r1
            r19 = r4
            r20 = r0
            r13 = r5
            r14 = r3
            r17 = r4
            r18 = r0
            r10 = r2
            r11 = r1
            r10.BiJ(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.1L9 r2 = r9.A01
            X.9jn r1 = r9.A0a
            java.lang.String r0 = "smb_transaction_details"
            android.content.Intent r0 = r1.A00(r0)
            r2.A08(r9, r0)
            return
        L_0x01da:
            super.onBackPressed()
            return
        L_0x01de:
            X.9mR r7 = r9.A0K
            com.whatsapp.jid.UserJid r5 = r2.A06
            X.7Ik r4 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r1 = r2.A0I
            X.77e r6 = X.AnonymousClass8BR.A0Y(r4, r3, r1, r6)
            r3 = 4
            X.AOI r1 = new X.AOI
            r1.<init>(r9, r2, r3)
            r8 = r0
            r2 = r7
            r3 = r9
            r4 = r1
            r7 = r0
            r2.A00(r3, r4, r5, r6, r7, r8)
            return
        L_0x01fd:
            X.AW0 r15 = r2.A05
            X.C17960vV.A07(r15)
            X.AEs r14 = r2.A04
            boolean r1 = r15.A0K()
            if (r1 == 0) goto L_0x020d
            java.lang.String r3 = "payments:request"
            goto L_0x020f
        L_0x020d:
            java.lang.String r3 = "payments:transaction"
        L_0x020f:
            org.json.JSONObject r4 = X.C17880vN.A15()     // Catch:{ Exception -> 0x025c }
            java.lang.String r2 = "lg"
            X.0vb r1 = r9.A0A     // Catch:{ Exception -> 0x025c }
            java.lang.String r1 = r1.A05()     // Catch:{ Exception -> 0x025c }
            org.json.JSONObject r4 = r4.put(r2, r1)     // Catch:{ Exception -> 0x025c }
            java.lang.String r2 = "lc"
            X.0vb r1 = r9.A0A     // Catch:{ Exception -> 0x025c }
            java.lang.String r1 = r1.A04()     // Catch:{ Exception -> 0x025c }
            org.json.JSONObject r4 = r4.put(r2, r1)     // Catch:{ Exception -> 0x025c }
            java.lang.String r2 = "platform"
            java.lang.String r1 = "android"
            org.json.JSONObject r2 = r4.put(r2, r1)     // Catch:{ Exception -> 0x025c }
            java.lang.String r1 = "context"
            org.json.JSONObject r4 = r2.put(r1, r3)     // Catch:{ Exception -> 0x025c }
            java.lang.String r2 = "type"
            java.lang.String r1 = "p2p"
            org.json.JSONObject r4 = r4.put(r2, r1)     // Catch:{ Exception -> 0x025c }
            java.lang.String r2 = r15.A0J     // Catch:{ Exception -> 0x025c }
            if (r2 == 0) goto L_0x024a
            java.lang.String r1 = "error_code"
            r4.put(r1, r2)     // Catch:{ Exception -> 0x025c }
        L_0x024a:
            if (r14 == 0) goto L_0x0264
            java.lang.String r1 = r14.A0B     // Catch:{ Exception -> 0x025c }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x025c }
            if (r1 != 0) goto L_0x0264
            java.lang.String r2 = "bank_name"
            java.lang.String r1 = r14.A0B     // Catch:{ Exception -> 0x025c }
            r4.put(r2, r1)     // Catch:{ Exception -> 0x025c }
            goto L_0x0264
        L_0x025c:
            r4 = move-exception
            X.1QE r2 = r9.A0g
            java.lang.String r1 = "debugInfoData fields"
            r2.A0A(r1, r4)
        L_0x0264:
            android.os.Bundle r8 = X.C17880vN.A0D()
            boolean r1 = r15.A0K()
            if (r1 != 0) goto L_0x0275
            java.lang.String r2 = "com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId"
            java.lang.String r1 = r15.A0K
            r8.putString(r2, r1)
        L_0x0275:
            java.lang.String r2 = r15.A0F
            if (r2 == 0) goto L_0x027e
            java.lang.String r1 = "com.whatsapp.support.DescribeProblemActivity.paymentBankTxnId"
            r8.putString(r1, r2)
        L_0x027e:
            if (r14 == 0) goto L_0x029e
            java.lang.String r1 = "com.whatsapp.support.DescribeProblemActivity.paymentMethod"
            r8.putParcelable(r1, r14)
            X.8pb r2 = r14.A08
            if (r2 == 0) goto L_0x0304
            boolean r1 = r2 instanceof X.AnonymousClass8pJ
            if (r1 != 0) goto L_0x0302
            boolean r1 = r2 instanceof X.AnonymousClass8pX
            if (r1 != 0) goto L_0x0302
            boolean r1 = r2 instanceof X.AnonymousClass8pY
            if (r1 == 0) goto L_0x02fd
            X.8pY r2 = (X.AnonymousClass8pY) r2
            java.lang.String r2 = r2.A0B
        L_0x0299:
            java.lang.String r1 = "com.whatsapp.support.DescribeProblemActivity.paymentBankPhone"
            r8.putString(r1, r2)
        L_0x029e:
            java.lang.String r2 = r15.A0J
            if (r2 == 0) goto L_0x02a7
            java.lang.String r1 = "com.whatsapp.support.DescribeProblemActivity.paymentErrorCode"
            r8.putString(r1, r2)
        L_0x02a7:
            int r2 = r15.A02
            r1 = 409(0x199, float:5.73E-43)
            if (r2 != r1) goto L_0x02ba
            java.lang.String r2 = "com.whatsapp.support.DescribeProblemActivity.type"
            r1 = 2
            r8.putInt(r2, r1)
            java.lang.String r2 = "com.whatsapp.support.DescribeProblemActivity.paymentStatus"
            java.lang.String r1 = "RF"
            r8.putString(r2, r1)
        L_0x02ba:
            X.BD1 r1 = r9.A4d()
            X.6Ug r1 = r1.BWd()
            if (r1 == 0) goto L_0x02d7
            boolean r1 = r1 instanceof X.C120076Bo
            if (r1 != 0) goto L_0x02d7
            android.net.Uri r1 = r9.A3T()
            if (r1 == 0) goto L_0x02d7
            java.lang.String r2 = "com.whatsapp.support.DescribeProblemActivity.uri"
            java.lang.String r1 = r1.toString()
            r8.putString(r2, r1)
        L_0x02d7:
            java.lang.String r1 = "com.whatsapp.support.DescribeProblemActivity.from"
            r8.putString(r1, r3)
            X.10I r5 = r9.A05
            X.1LU r4 = r9.A0E
            X.181 r12 = r9.A03
            X.18O r11 = r9.A06
            X.6mP r10 = r9.A01
            X.0vb r13 = r9.A0A
            X.1D9 r2 = r9.A0D
            X.1QJ r1 = r9.A0L
            X.6MW r7 = new X.6MW
            r18 = r1
            r19 = r3
            r16 = r2
            r17 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.AnonymousClass3MW.A1T(r7, r5, r0)
            return
        L_0x02fd:
            X.8pW r2 = (X.AnonymousClass8pW) r2
            java.lang.String r2 = r2.A04
            goto L_0x0299
        L_0x0302:
            r2 = 0
            goto L_0x0299
        L_0x0304:
            X.1QE r2 = r9.A0g
            java.lang.String r1 = "payment method missing country fields"
            r2.A05(r1)
            goto L_0x029e
        L_0x030c:
            X.BD1 r0 = r9.A4d()
            java.lang.Class r0 = r0.BMK()
            android.content.Intent r3 = X.AnonymousClass8BR.A07(r9, r0)
            X.AEs r0 = r2.A04
            X.C17960vV.A07(r0)
            goto L_0x0355
        L_0x031e:
            java.lang.String r0 = r2.A0E
            r9.BhS(r1, r0)
            return
        L_0x0324:
            java.lang.Class r0 = r2.A0B
            android.content.Intent r3 = X.AnonymousClass8BR.A07(r9, r0)
            X.AEs r0 = r2.A04
            X.C17960vV.A07(r0)
            r3.putExtra(r7, r0)
            java.lang.String r1 = "event_screen"
            java.lang.String r0 = "forgot_pin"
            r3.putExtra(r1, r0)
            goto L_0x0358
        L_0x033a:
            X.AEs r3 = r2.A04
            X.C17960vV.A07(r3)
            X.1QO r3 = r9.A0M
            X.0ve r6 = r3.A02
            r4 = 10405(0x28a5, float:1.458E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r6, r4)
            if (r3 == 0) goto L_0x035c
            java.lang.Class r0 = r2.A0A
            android.content.Intent r3 = X.AnonymousClass8BR.A07(r9, r0)
            X.AEs r0 = r2.A04
        L_0x0355:
            r3.putExtra(r7, r0)
        L_0x0358:
            r9.startActivity(r3)
            return
        L_0x035c:
            java.lang.String r3 = r2.A0C
            X.C17960vV.A07(r3)
            X.9rx r4 = new X.9rx
            r4.<init>(r3, r1, r1)
            java.util.HashMap r6 = X.C17880vN.A11()
            X.AEs r1 = r2.A04
            java.lang.String r2 = r1.A0A
            java.lang.String r1 = "credential_id"
            r6.put(r1, r2)
            X.1KB r2 = r9.A05
            r1 = 2131895077(0x7f122325, float:1.9424977E38)
            r2.A07(r0, r1)
            X.00H r0 = r9.A0d
            java.lang.Object r3 = r0.get()
            X.9m4 r3 = (X.C191129m4) r3
            r0 = 10
            X.AbG r2 = new X.AbG
            r2.<init>(r9, r0)
            r1 = 6
            X.AbJ r0 = new X.AbJ
            r0.<init>(r9, r1)
            r1 = r3
            r3 = r0
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x0396:
            r3 = 2131893635(0x7f121d83, float:1.9422052E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            X.BD1 r1 = r9.A4d()
            int r1 = r1.BWg()
            java.lang.String r1 = r9.getString(r1)
            r2[r0] = r1
            r9.BhU(r2, r0, r3)
            return
        L_0x03ad:
            X.BD1 r0 = r9.A4d()
            java.lang.Class r0 = r0.BWo()
            android.content.Intent r4 = X.AnonymousClass8BR.A07(r9, r0)
            X.7Ik r5 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = r2.A0I
            X.77e r1 = X.AnonymousClass8BR.A0Y(r5, r1, r0, r6)
            java.lang.String r0 = "extra_payment_handle"
            r4.putExtra(r0, r1)
            java.lang.String r1 = "extra_referral_screen"
            java.lang.String r0 = "payment_transaction_history"
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_payment_handle_id"
            java.lang.String r0 = r2.A0H
            r4.putExtra(r1, r0)
            java.lang.String r1 = "extra_payee_name"
            X.77e r0 = r2.A07
            r4.putExtra(r1, r0)
            java.lang.String r0 = r2.A0D
            r4.putExtra(r3, r0)
            r0 = 0
            r9.A3q(r4, r0)
            return
        L_0x03e9:
            X.1E7 r2 = r2.A03
            X.C17960vV.A07(r2)
            X.1LU r1 = r9.A0E
            r0 = 18
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.content.Intent r0 = r1.A1v(r9, r2, r0)
            goto L_0x0408
        L_0x03fb:
            android.content.Context r3 = r9.getApplicationContext()
            java.lang.String r2 = r2.A0J
            X.C17960vV.A07(r2)
            android.content.Intent r0 = X.AnonymousClass1LU.A1g(r3, r2, r1, r0, r0)
        L_0x0408:
            r9.startActivity(r0)
            return
        L_0x040c:
            r9.invalidateOptionsMenu()
            return
        L_0x0410:
            boolean r0 = r2.A0K
            if (r0 == 0) goto L_0x041b
            r0 = 2131893912(0x7f121e98, float:1.9422614E38)
            r9.CNA(r0)
            return
        L_0x041b:
            r9.CEx()
            return
        L_0x041f:
            X.1QO r12 = r9.A0M
            X.ALX r11 = r9.A0I
            java.lang.String r3 = r2.A0G
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x044b
            X.AEn r13 = r2.A08
            if (r13 == 0) goto L_0x044b
            X.1BI r10 = r14.A00
            X.C17960vV.A07(r10)
            java.lang.String r1 = r2.A0G
            r20 = -1
            java.lang.String r18 = "order_details"
            r2 = 0
            java.lang.String r15 = r13.A0I
            java.lang.String r3 = r13.A0K
        L_0x043f:
            r19 = r2
            r21 = r0
            r16 = r1
            r17 = r3
            X.AnonymousClass9R5.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x044b:
            X.1BI r10 = r14.A00
            X.C17960vV.A07(r10)
            java.lang.String r3 = r2.A0F
            X.C17960vV.A07(r3)
            int r2 = r2.A01
            r20 = -1
            java.lang.String r18 = "order_details"
            r13 = r1
            goto L_0x043f
        L_0x045d:
            X.8Gc r1 = r9.A0Q
            X.9NU r1 = r1.A06
            if (r1 == 0) goto L_0x0531
            X.206 r6 = r1.A02
        L_0x0465:
            X.ALX r1 = r9.A0I
            android.content.Intent r5 = r1.A00(r9, r4, r0)
            X.1QJ r0 = r9.A0L
            X.1KJ r8 = r0.A01()
            X.AW0 r7 = X.AnonymousClass25B.A00(r6)
            X.0vb r1 = r9.A0A
            X.1KN r0 = r7.A09
            java.lang.String r1 = r8.BLa(r1, r0)
            java.lang.String r0 = "extra_payment_preset_amount"
            r5.putExtra(r0, r1)
            X.1R2 r8 = r9.A0T
            int r1 = r7.A02
            r0 = 405(0x195, float:5.68E-43)
            if (r1 != r0) goto L_0x04a1
            int r0 = r7.A03
            if (r0 != r4) goto L_0x04a1
            X.1QO r0 = r8.A09
            X.0ve r8 = r0.A02
            r1 = 2381(0x94d, float:3.336E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x04a1
            X.9oS r0 = r9.A0S
            r0.A01(r5)
        L_0x04a1:
            X.205 r0 = r6.A0v
            X.1BI r8 = r0.A00
            boolean r0 = r8 instanceof com.whatsapp.jid.GroupJid
            java.lang.String r1 = "extra_jid"
            if (r0 == 0) goto L_0x052a
            X.AnonymousClass3MY.A12(r5, r8, r1)
            com.whatsapp.jid.UserJid r0 = r7.A0D
            java.lang.String r0 = X.C22971Dz.A06(r0)
            java.lang.String r1 = "extra_receiver_jid"
        L_0x04b6:
            r5.putExtra(r1, r0)
            java.lang.String r1 = "extra_payment_note"
            java.lang.String r0 = r6.A0P()
            r5.putExtra(r1, r0)
            java.lang.String r0 = "extra_conversation_message_type"
            r5.putExtra(r0, r4)
            boolean r0 = r6.A0s()
            if (r0 == 0) goto L_0x04d8
            java.util.List r0 = r6.A0h
            java.lang.String r1 = X.AnonymousClass4aJ.A01(r0)
            java.lang.String r0 = "extra_mentioned_jids"
            r5.putExtra(r0, r1)
        L_0x04d8:
            X.AEX r1 = r7.A04()
            if (r1 == 0) goto L_0x04e3
            java.lang.String r0 = "extra_payment_background"
            r5.putExtra(r0, r1)
        L_0x04e3:
            X.0ve r1 = r9.A0E
            r0 = 812(0x32c, float:1.138E-42)
            X.0vf r4 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r4, r1, r0)
            if (r0 != 0) goto L_0x04f9
            X.0ve r1 = r9.A0E
            r0 = 811(0x32b, float:1.136E-42)
            boolean r0 = X.C18020vd.A05(r4, r1, r0)
            if (r0 == 0) goto L_0x0517
        L_0x04f9:
            boolean r0 = r6 instanceof X.C441322g
            if (r0 == 0) goto L_0x0517
            X.22g r6 = (X.C441322g) r6
            X.00H r0 = r9.A0e
            java.lang.Object r0 = r0.get()
            X.70H r0 = (X.AnonymousClass70H) r0
            X.77d r1 = r0.A01(r6)
            java.lang.String r0 = "extra_payment_sticker"
            r5.putExtra(r0, r1)
            java.lang.String r1 = "extra_payment_sticker_send_origin"
            java.lang.Integer r0 = r6.A06
            r5.putExtra(r1, r0)
        L_0x0517:
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "send_again_button"
            r5.putExtra(r1, r0)
            java.lang.String r0 = r2.A0D
            r5.putExtra(r3, r0)
            r9.startActivity(r5)
        L_0x0526:
            r9.finish()
            return
        L_0x052a:
            com.whatsapp.jid.UserJid r0 = r7.A0D
            java.lang.String r0 = X.C22971Dz.A06(r0)
            goto L_0x04b6
        L_0x0531:
            r6 = 0
            goto L_0x0465
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity.A4f(X.9yu):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cb, code lost:
        if (r0.A0v.A02 == false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e5, code lost:
        if (r2.A03 != 40) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e8, code lost:
        if (r2 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ea, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f0, code lost:
        if (X.A4C.A01(r2) != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f2, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f4, code lost:
        r7.BiJ(r8, r20, "payment_transaction_details", r11, (java.lang.String) null, (java.lang.String) null, r14, r15, r16, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4g(java.lang.Integer r19, java.lang.Integer r20) {
        /*
            r18 = this;
            r3 = r18
            X.8Gc r0 = r3.A0Q
            X.9NU r0 = r0.A06
            r4 = 0
            if (r0 != 0) goto L_0x0143
            r2 = r4
        L_0x000a:
            X.BD1 r0 = r3.A4d()
            X.BD4 r7 = r0.BRb()
            if (r7 == 0) goto L_0x00fd
            if (r2 == 0) goto L_0x0080
            X.1R2 r5 = r3.A0T
            int r1 = r2.A03
            r0 = 9
            if (r1 != r0) goto L_0x0119
            java.lang.String r1 = "cashback"
        L_0x0020:
            java.lang.String r0 = "cashback"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0112
            java.lang.String r0 = "incentive"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0112
            java.lang.String r0 = "purchase"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            X.A7u r4 = X.C20112A7u.A02()
        L_0x003c:
            java.lang.String r0 = "transaction_type"
            r4.A07(r0, r1)
            X.8Gc r0 = r3.A0Q
            X.9NU r0 = r0.A06
            if (r0 == 0) goto L_0x006b
            X.AEs r6 = r0.A00
            if (r6 == 0) goto L_0x006b
            boolean r0 = r6 instanceof X.AnonymousClass8pM
            if (r0 == 0) goto L_0x0103
            r0 = r6
            X.8pM r0 = (X.AnonymousClass8pM) r0
            java.lang.String r5 = r0.A00
            java.lang.String r1 = "confirm"
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "payment_instruction"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0103
            java.lang.String r1 = "cpi"
        L_0x0066:
            java.lang.String r0 = "payment_type"
            r4.A07(r0, r1)
        L_0x006b:
            boolean r0 = r3 instanceof com.whatsapp.payments.ui.P2mLitePaymentTransactionDetailActivity
            if (r0 == 0) goto L_0x0080
            X.0vb r1 = r3.A0A
            X.1R2 r0 = r3.A0T
            int r0 = r0.A0G(r2)
            java.lang.String r1 = r1.A0A(r0)
            java.lang.String r0 = "transaction_status_name"
            r4.A07(r0, r1)
        L_0x0080:
            boolean r0 = r3 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity
            if (r0 == 0) goto L_0x00b2
            android.content.Intent r5 = r3.getIntent()
            java.lang.String r1 = "extra_mapper_alias_resolved"
            r0 = 0
            boolean r0 = r5.getBooleanExtra(r1, r0)
            if (r0 == 0) goto L_0x00b2
            if (r4 != 0) goto L_0x0097
            X.A7u r4 = X.C20112A7u.A01()
        L_0x0097:
            java.lang.String r1 = "is_alias_resolved"
            r0 = 1
            r4.A06(r1, r0)
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "extra_receiver_platform"
            java.lang.String r1 = r1.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "receiver_platform"
            r4.A07(r0, r1)
        L_0x00b2:
            X.8Gc r0 = r3.A0Q
            X.9NU r0 = r0.A06
            X.A7u r8 = r3.A4c(r4, r0)
            X.8Gc r0 = r3.A0Q
            X.9NU r0 = r0.A06
            if (r0 == 0) goto L_0x0101
            X.206 r0 = r0.A02
        L_0x00c2:
            r17 = 0
            if (r0 == 0) goto L_0x00cd
            X.205 r0 = r0.A0v
            boolean r0 = r0.A02
            r1 = 1
            if (r0 != 0) goto L_0x00ce
        L_0x00cd:
            r1 = 0
        L_0x00ce:
            if (r2 == 0) goto L_0x00fe
            X.1R2 r0 = r3.A0T
            boolean r0 = r0.A0j(r2)
            if (r0 == 0) goto L_0x00fe
        L_0x00d8:
            int r14 = r19.intValue()
            java.lang.String r11 = r3.A0f
            if (r2 == 0) goto L_0x00e7
            int r1 = r2.A03
            r0 = 40
            r15 = 1
            if (r1 == r0) goto L_0x00ea
        L_0x00e7:
            r15 = 0
            if (r2 == 0) goto L_0x00f2
        L_0x00ea:
            boolean r0 = X.A4C.A01(r2)
            r16 = 1
            if (r0 != 0) goto L_0x00f4
        L_0x00f2:
            r16 = 0
        L_0x00f4:
            r12 = 0
            java.lang.String r10 = "payment_transaction_details"
            r9 = r20
            r13 = r12
            r7.BiJ(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x00fd:
            return
        L_0x00fe:
            r17 = r1
            goto L_0x00d8
        L_0x0101:
            r0 = 0
            goto L_0x00c2
        L_0x0103:
            boolean r0 = r6 instanceof X.AnonymousClass8pO
            if (r0 != 0) goto L_0x010e
            boolean r0 = r6 instanceof X.AnonymousClass8pK
            if (r0 != 0) goto L_0x010e
            r1 = 0
            goto L_0x0066
        L_0x010e:
            java.lang.String r1 = "native"
            goto L_0x0066
        L_0x0112:
            X.8zi r4 = new X.8zi
            r4.<init>()
            goto L_0x003c
        L_0x0119:
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0121
            r0 = 100
            if (r1 != r0) goto L_0x0133
        L_0x0121:
            X.1QO r1 = r5.A09
            boolean r0 = r1.A0B()
            if (r0 != 0) goto L_0x012f
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0133
        L_0x012f:
            java.lang.String r1 = "purchase"
            goto L_0x0020
        L_0x0133:
            X.8pG r0 = r2.A0A
            if (r0 == 0) goto L_0x013f
            X.ADR r0 = r0.A01
            if (r0 == 0) goto L_0x013f
            java.lang.String r1 = "incentive"
            goto L_0x0020
        L_0x013f:
            java.lang.String r1 = "none"
            goto L_0x0020
        L_0x0143:
            X.AW0 r2 = r0.A01
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity.A4g(java.lang.Integer, java.lang.Integer):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass9NU r0 = this.A0Q.A06;
        if (!(r0 == null || r0.A02 == null)) {
            menu.add(0, 2131432649, 0, 2131893772);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        AnonymousClass206 r4;
        Intent A0A2;
        Class cls;
        AnonymousClass9NU r0 = this.A0Q.A06;
        if (r0 != null) {
            r4 = r0.A02;
        } else {
            r4 = null;
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
            if (isTaskRoot()) {
                if (this instanceof IndiaUpiPaymentTransactionDetailsActivity) {
                    cls = IndiaPaymentTransactionHistoryActivity.class;
                } else {
                    cls = PaymentTransactionHistoryActivity.class;
                }
                A0A2 = AnonymousClass8BR.A07(this, cls);
                A0A2.putExtra("extra_show_requests", this.A0Q.A09);
                finishAndRemoveTask();
            }
            return true;
        }
        if (r4 != null) {
            if (menuItem.getItemId() == 2131432649) {
                long A022 = AnonymousClass25A.A02(r4);
                long A032 = AnonymousClass25A.A03(r4);
                AnonymousClass1L9 r7 = this.A01;
                AnonymousClass1LU r1 = this.A0E;
                C17960vV.A07(r4);
                AnonymousClass205 r42 = r4.A0v;
                r7.A09(this, AnonymousClass4aU.A00(AnonymousClass3MY.A06(this, r1, r42.A00).putExtra("row_id", A022).putExtra("sort_id", A032), r42));
                return true;
            } else if (menuItem.getItemId() == 2131432578) {
                C17960vV.A0D(this.A0M.A04(0));
                A0A2 = C17880vN.A0A();
                String BWX = A4d().BWX();
                if (TextUtils.isEmpty(BWX)) {
                    return false;
                }
                A0A2.setClassName(this, BWX);
                A0A2.putExtra("extra_transaction_id", AnonymousClass25B.A01(r4));
                AnonymousClass205 r02 = r4.A0v;
                if (r02 != null) {
                    AnonymousClass4aU.A00(A0A2, r02);
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
        startActivity(A0A2);
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [X.9N6, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (X.AnonymousClass3MY.A09(r4) != null) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.P2mLitePaymentTransactionDetailActivity
            if (r0 == 0) goto L_0x0040
            X.1QO r0 = r4.A0M
            boolean r0 = r0.A02()
        L_0x000d:
            X.C17960vV.A0D(r0)
            java.lang.String r0 = X.AnonymousClass8BV.A0o(r4)
            r4.A0f = r0
            X.1KH r0 = r4.A0C
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0024
            if (r5 != 0) goto L_0x004e
            android.os.Bundle r0 = X.AnonymousClass3MY.A09(r4)
            if (r0 != 0) goto L_0x004e
        L_0x0024:
            X.1QE r3 = r4.A0g
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PaymentStore uninitialized or no valid bundle: "
            r2.append(r0)
            if (r5 != 0) goto L_0x0038
            android.os.Bundle r1 = X.AnonymousClass3MY.A09(r4)
            r0 = 1
            if (r1 == 0) goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            X.AnonymousClass8BW.A1D(r3, r2, r0)
            r4.finish()
            return
        L_0x0040:
            boolean r0 = r4 instanceof com.whatsapp.payments.GlobalPaymentTransactionDetailActivity
            if (r0 == 0) goto L_0x0046
            r0 = 1
            goto L_0x000d
        L_0x0046:
            X.1QO r1 = r4.A0M
            r0 = 0
            boolean r0 = r1.A04(r0)
            goto L_0x000d
        L_0x004e:
            X.8Gc r2 = r4.A4e(r5)
            r4.A0Q = r2
            r0 = 0
            X.AGu r1 = new X.AGu
            r1.<init>(r4, r0)
            X.1DT r0 = r2.A01
            r0.A0A(r4, r1)
            r0 = 1
            X.AGu r1 = new X.AGu
            r1.<init>(r4, r0)
            X.1wy r0 = r2.A08
            r0.A0A(r4, r1)
            X.8Gc r2 = r4.A0Q
            r1 = 2
            X.9N6 r0 = new X.9N6
            r0.<init>()
            r0.A00 = r1
            r2.A0e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        AnonymousClass2L2 r1;
        B5S b5s;
        super.onDestroy();
        C161588Gc r0 = this.A0Q;
        if (!(r0 == null || (r1 = r0.A0a) == null || (b5s = r0.A0Z) == null)) {
            r1.unregisterObserver(b5s);
        }
        AnonymousClass4RR r2 = (AnonymousClass4RR) this.A0b.get();
        C827249m r12 = r2.A00;
        if (r12 != null) {
            r12.A02 = true;
            r12.interrupt();
            r2.A00 = null;
        }
    }
}
