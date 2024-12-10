package com.whatsapp.payments.ui;

import X.A7B;
import X.A7Z;
import X.AEP;
import X.AFQ;
import X.AFR;
import X.AOI;
import X.AQ2;
import X.AQ4;
import X.AQ9;
import X.AXS;
import X.AXW;
import X.AY9;
import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass18O;
import X.AnonymousClass1BI;
import X.AnonymousClass1DS;
import X.AnonymousClass1EG;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1KI;
import X.AnonymousClass1KJ;
import X.AnonymousClass1KL;
import X.AnonymousClass1KN;
import X.AnonymousClass1KW;
import X.AnonymousClass1OZ;
import X.AnonymousClass1QD;
import X.AnonymousClass1QE;
import X.AnonymousClass1QO;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass72F;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass8pF;
import X.AnonymousClass92t;
import X.AnonymousClass967;
import X.AnonymousClass968;
import X.AnonymousClass9MZ;
import X.B9B;
import X.BDw;
import X.C003401n;
import X.C108945cZ;
import X.C108955ca;
import X.C132646nG;
import X.C136736uJ;
import X.C1418377d;
import X.C1418477e;
import X.C171858sO;
import X.C175788zH;
import X.C1768896a;
import X.C177749Ak;
import X.C177939Be;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C181769Rt;
import X.C183449Yh;
import X.C184389as;
import X.C184789bW;
import X.C184999br;
import X.C185009bs;
import X.C185019bt;
import X.C185029bu;
import X.C186969f3;
import X.C187419fm;
import X.C188449hR;
import X.C188639hk;
import X.C188709hr;
import X.C191339mR;
import X.C193189pg;
import X.C196199uc;
import X.C199159zX;
import X.C19967A1c;
import X.C20061A5k;
import X.C20092A6u;
import X.C20155A9r;
import X.C20325AGh;
import X.C20337AGt;
import X.C20865Aah;
import X.C20866Aai;
import X.C20867Aaj;
import X.C21112Aeg;
import X.C21432Ajz;
import X.C22546BCd;
import X.C23581Gv;
import X.C24671Lf;
import X.C26631Sw;
import X.C30901eh;
import X.C30931ek;
import X.C60432o1;
import X.C72453Mb;
import X.C73203Rj;
import X.C87544Vz;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.payments.ui.bottomsheet.Hilt_IndiaUpiMapperRegisterUserNuxBottomSheet;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiSendPaymentViewModel;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.List;
import org.json.JSONException;

public class IndiaUpiSendPaymentActivity extends AnonymousClass92t implements B9B {
    public int A00 = 0;
    public C24671Lf A01;
    public C196199uc A02;
    public C199159zX A03;
    public C191339mR A04;
    public C132646nG A05;
    public AnonymousClass72F A06;
    public C184789bW A07;
    public C177939Be A08;
    public AQ2 A09 = null;
    public C1768896a A0A;
    public C20867Aaj A0B;
    public C18010vc A0C;
    public C30901eh A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public BigDecimal A0G;
    public boolean A0H;
    public boolean A0I = false;
    public boolean A0J = false;
    public BottomSheetBehavior A0K;
    public IndiaUpiSendPaymentViewModel A0L;
    public final BDw A0M = new C20865Aah(this);
    public final C22546BCd A0N = new C20866Aai(this);
    public final C23581Gv A0O = new AQ9(this, 2);

    public static void A0c(AnonymousClass8pF r3, IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        indiaUpiSendPaymentActivity.A0d = false;
        indiaUpiSendPaymentActivity.CEx();
        if (r3 != null && !indiaUpiSendPaymentActivity.A5f(r3)) {
            AnonymousClass1QE r2 = indiaUpiSendPaymentActivity.A0i;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("starting onContactVpa for jid: ");
            A10.append(indiaUpiSendPaymentActivity.A0F);
            A10.append(" vpa: ");
            A10.append(r3.A01);
            A10.append(" receiverVpaId: ");
            AnonymousClass8BV.A1E(r2, r3.A02, A10);
            indiaUpiSendPaymentActivity.A0J = r3.A01;
            indiaUpiSendPaymentActivity.A0i = r3.A02;
            if (!C20061A5k.A02(r3.A00)) {
                indiaUpiSendPaymentActivity.A0H = r3.A00;
            }
            A0v(indiaUpiSendPaymentActivity, true);
        }
    }

    public static String A03(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, String str) {
        if (indiaUpiSendPaymentActivity.A0U == null || TextUtils.isEmpty(str)) {
            return "0";
        }
        return String.format(indiaUpiSendPaymentActivity.A00.A0N(), "%.2f", AnonymousClass8BV.A1b(C20092A6u.A01(indiaUpiSendPaymentActivity.A0U, new BigDecimal(str))));
    }

    public static void A0d(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        if (indiaUpiSendPaymentActivity.A0I) {
            int i = indiaUpiSendPaymentActivity.A00;
            if (i == 0) {
                AnonymousClass4Yv.A01(indiaUpiSendPaymentActivity, 37);
                indiaUpiSendPaymentActivity.A0i.A04("Verifying VPA in background...");
                indiaUpiSendPaymentActivity.A00 = 1;
                indiaUpiSendPaymentActivity.A0w(true);
            } else if (i != 1) {
                int i2 = 36;
                if (i != 2) {
                    i2 = 22;
                    if (i != 3) {
                        i2 = 35;
                        if (i != 4) {
                            indiaUpiSendPaymentActivity.A0I = false;
                            AnonymousClass4Yv.A00(indiaUpiSendPaymentActivity, 37);
                            PaymentView paymentView = indiaUpiSendPaymentActivity.A0J;
                            if (paymentView != null) {
                                paymentView.A0B();
                                return;
                            }
                            return;
                        }
                    }
                }
                AnonymousClass4Yv.A00(indiaUpiSendPaymentActivity, 37);
                AnonymousClass4Yv.A01(indiaUpiSendPaymentActivity, i2);
                indiaUpiSendPaymentActivity.A00 = 0;
            } else {
                AnonymousClass4Yv.A01(indiaUpiSendPaymentActivity, 37);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.96a, java.lang.Object, X.BBw] */
    public static void A0q(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        ? obj = new Object();
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity2 = indiaUpiSendPaymentActivity;
        indiaUpiSendPaymentActivity.A0A = obj;
        PaymentView paymentView = indiaUpiSendPaymentActivity.A0J;
        if (paymentView != null) {
            paymentView.A0G(obj, 2131433496, 2131433497);
            indiaUpiSendPaymentActivity.A0A.A00 = new AFR(indiaUpiSendPaymentActivity.A0J, 44);
        }
        AnonymousClass1KB r5 = indiaUpiSendPaymentActivity.A05;
        AnonymousClass1OZ A0M2 = AnonymousClass8BT.A0M(indiaUpiSendPaymentActivity);
        C30931ek r13 = indiaUpiSendPaymentActivity.A0A;
        indiaUpiSendPaymentActivity2.A0E = new C175788zH(indiaUpiSendPaymentActivity2, r5, indiaUpiSendPaymentActivity2.A07, A0M2, indiaUpiSendPaymentActivity2.A02, indiaUpiSendPaymentActivity2.A0M, AnonymousClass8BT.A0S(indiaUpiSendPaymentActivity2), indiaUpiSendPaymentActivity2.A0N, indiaUpiSendPaymentActivity2.A0V, r13);
    }

    public static void A0r(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        if (indiaUpiSendPaymentActivity.A0J) {
            A0v(indiaUpiSendPaymentActivity, true);
            if (AnonymousClass8BR.A1P(indiaUpiSendPaymentActivity) && indiaUpiSendPaymentActivity.A00 != 5) {
                indiaUpiSendPaymentActivity.A0i.A04("Verifying VPA in background...");
                indiaUpiSendPaymentActivity.A00 = 1;
                indiaUpiSendPaymentActivity.A0w(true);
            }
        } else if (!C20061A5k.A02(indiaUpiSendPaymentActivity.A0H)) {
            A0v(indiaUpiSendPaymentActivity, true);
            if (indiaUpiSendPaymentActivity.A0U != null) {
                C18030ve r1 = indiaUpiSendPaymentActivity.A0E;
                BigDecimal bigDecimal = C20092A6u.A00;
                String num = Integer.toString(AnonymousClass8BX.A04(r1));
                indiaUpiSendPaymentActivity.A0p = num;
                indiaUpiSendPaymentActivity.A0B.A00 = indiaUpiSendPaymentActivity.A0O.A04(num, indiaUpiSendPaymentActivity.A0q, indiaUpiSendPaymentActivity.A0o);
            }
        } else if (indiaUpiSendPaymentActivity.A4y()) {
            String A002 = AXS.A00(indiaUpiSendPaymentActivity.A0N);
            if (A002 == null || !A002.equals(indiaUpiSendPaymentActivity.A0J.A00)) {
                indiaUpiSendPaymentActivity.CNA(2131893775);
                indiaUpiSendPaymentActivity.A0w(false);
                return;
            }
            indiaUpiSendPaymentActivity.A5a(new C19967A1c(2131893721), (String) null, new Object[0]);
        } else {
            UserJid userJid = indiaUpiSendPaymentActivity.A0F;
            if (userJid != null) {
                C177939Be r12 = new C177939Be(userJid, indiaUpiSendPaymentActivity, false);
                indiaUpiSendPaymentActivity.A08 = r12;
                AnonymousClass3MW.A1T(r12, indiaUpiSendPaymentActivity.A05, 0);
                A0v(indiaUpiSendPaymentActivity, true);
                return;
            }
            indiaUpiSendPaymentActivity.finish();
        }
    }

    public static void A0s(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, AnonymousClass9MZ r11) {
        int i;
        int i2;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity2 = indiaUpiSendPaymentActivity;
        C21432Ajz ajz = new C21432Ajz(indiaUpiSendPaymentActivity, r11, 27);
        if (r11 instanceof AnonymousClass968) {
            C188449hR r3 = ((AnonymousClass968) r11).A00;
            boolean z = r3.A08;
            indiaUpiSendPaymentActivity.A0o = z;
            String str = r3.A04;
            if (!AnonymousClass1EG.A0H(str)) {
                indiaUpiSendPaymentActivity.A0V = str;
                indiaUpiSendPaymentActivity.A0a = str;
            }
            indiaUpiSendPaymentActivity.CEx();
            indiaUpiSendPaymentActivity.A0H = r3.A01;
            indiaUpiSendPaymentActivity.A0i = r3.A05;
            UserJid userJid = r3.A00;
            indiaUpiSendPaymentActivity.A0F = userJid;
            indiaUpiSendPaymentActivity.A0x = r3.A07;
            indiaUpiSendPaymentActivity.A0z = z;
            if (r3.A06) {
                indiaUpiSendPaymentActivity.A04.A00(indiaUpiSendPaymentActivity2, new AOI(indiaUpiSendPaymentActivity, ajz, 3), userJid, indiaUpiSendPaymentActivity.A0J, true, false);
                return;
            }
            ajz.run();
        } else if (r11 instanceof AnonymousClass967) {
            AnonymousClass967 r112 = (AnonymousClass967) r11;
            indiaUpiSendPaymentActivity.CEx();
            if (indiaUpiSendPaymentActivity.A0J) {
                A7B a7b = r112.A00;
                if (a7b == null || !((i2 = a7b.A00) == -2 || i2 == 6 || i2 == 7)) {
                    i = 4;
                } else {
                    i = 2;
                }
                indiaUpiSendPaymentActivity.A00 = i;
                A0d(indiaUpiSendPaymentActivity);
                return;
            }
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = indiaUpiSendPaymentActivity.getString(2131891337);
            indiaUpiSendPaymentActivity.BhU(A1a, 0, 2131893635);
        }
    }

    public static void A0t(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, String str, String str2) {
        C171858sO A072 = indiaUpiSendPaymentActivity.A0S.A07(C17880vN.A0k(), AnonymousClass8BS.A0V(), "new_payment", indiaUpiSendPaymentActivity.A0g);
        A072.A0S = str;
        A072.A0T = str2;
        AZ6.A02(A072, indiaUpiSendPaymentActivity);
    }

    public static void A0u(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, String str, boolean z) {
        if (str != null) {
            AnonymousClass1QD r2 = indiaUpiSendPaymentActivity.A0O.A03;
            r2.A0M(AnonymousClass001.A1H(";", str, AnonymousClass8BX.A0f(r2)));
            indiaUpiSendPaymentActivity.A0Q.A01().A02(str).A09(new C21112Aeg(indiaUpiSendPaymentActivity, z));
            return;
        }
        indiaUpiSendPaymentActivity.A05.A04();
        indiaUpiSendPaymentActivity.A5a(new C19967A1c(2131893867), (String) null, new Object[0]);
    }

    public static void A0v(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, boolean z) {
        PaymentView paymentView;
        PaymentView paymentView2 = indiaUpiSendPaymentActivity.A0J;
        if (paymentView2 != null && !indiaUpiSendPaymentActivity.A0d) {
            if (indiaUpiSendPaymentActivity.A00 == null) {
                indiaUpiSendPaymentActivity.setContentView((View) paymentView2);
                if (indiaUpiSendPaymentActivity.A0H) {
                    C181769Rt.A00(indiaUpiSendPaymentActivity, AnonymousClass3MY.A0K(indiaUpiSendPaymentActivity, AnonymousClass3Ma.A0G(indiaUpiSendPaymentActivity)));
                    indiaUpiSendPaymentActivity.A0Q();
                }
            }
            indiaUpiSendPaymentActivity.A5M();
            if (z) {
                if (AnonymousClass8BS.A1M(indiaUpiSendPaymentActivity.A0E)) {
                    if (!C18020vd.A05(C18040vf.A02, indiaUpiSendPaymentActivity.A0E, 979)) {
                        indiaUpiSendPaymentActivity.A4i(indiaUpiSendPaymentActivity.A0F);
                    }
                }
                indiaUpiSendPaymentActivity.A5L();
            }
            String str = indiaUpiSendPaymentActivity.A0h;
            if (!(str == null || (paymentView = indiaUpiSendPaymentActivity.A0J) == null)) {
                paymentView.A19 = str;
            }
            List list = indiaUpiSendPaymentActivity.A0j;
            if (list != null) {
                list.clear();
            }
            if (indiaUpiSendPaymentActivity.A0H == null && (AnonymousClass8BR.A1P(indiaUpiSendPaymentActivity) || indiaUpiSendPaymentActivity.A0N.A0R())) {
                C177749Ak r1 = new C177749Ak(indiaUpiSendPaymentActivity);
                indiaUpiSendPaymentActivity.A0H = r1;
                C17890vO.A0u(r1, indiaUpiSendPaymentActivity.A05);
            }
            indiaUpiSendPaymentActivity.CEx();
        }
    }

    private void A0w(boolean z) {
        boolean A0K2;
        AnonymousClass1QO r3 = this.A0P;
        AnonymousClass1BI r2 = this.A0F;
        String str = this.A0g;
        if (r2 == null) {
            A0K2 = false;
        } else {
            A0K2 = r3.A0K(C60432o1.A00(r3.A01, r2), str);
        }
        AnonymousClass1QE r1 = this.A0i;
        if (A0K2) {
            r1.A04("verifyVpa: verifying receiver VPA and whether VPAs match");
            IndiaUpiSendPaymentViewModel indiaUpiSendPaymentViewModel = this.A0L;
            C1418477e r4 = this.A0J;
            AnonymousClass1BI r32 = this.A0F;
            C17960vV.A07(r32);
            C18070vi.A0h(r4, r32);
            C175788zH r5 = indiaUpiSendPaymentViewModel.A00;
            r5.A01(r4, (C1418477e) null, new AXW(indiaUpiSendPaymentViewModel, 1, z));
            PhoneUserJid A002 = C60432o1.A00(indiaUpiSendPaymentViewModel.A04, r32);
            if (A002 == null) {
                indiaUpiSendPaymentViewModel.A02.A0E(new AnonymousClass967((A7B) null, z));
                return;
            }
            r5.A01((C1418477e) null, AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, C108955ca.A0z(A002.user, 2), "upiAlias"), new AXW(indiaUpiSendPaymentViewModel, 0, z));
            return;
        }
        r1.A04("verifyVpa: only verifying receiver VPA");
        IndiaUpiSendPaymentViewModel indiaUpiSendPaymentViewModel2 = this.A0L;
        C1418477e r33 = this.A0J;
        C18070vi.A0d(r33, 0);
        indiaUpiSendPaymentViewModel2.A00.A01(r33, (C1418477e) null, new AXW(indiaUpiSendPaymentViewModel2, 1, z));
    }

    public /* bridge */ /* synthetic */ C188709hr CCo() {
        String str;
        AnonymousClass1KN r7;
        AQ4 aq4;
        String str2;
        C187419fm r15;
        int A032;
        C184999br r2;
        AEP aep = this.A0U;
        AnonymousClass1KI r1 = this.A07;
        if (aep == null) {
            str = "INR";
        } else {
            str = aep.A01;
        }
        AnonymousClass1KJ A012 = r1.A01(str);
        C184789bW r22 = this.A07;
        if (r22.A00) {
            r22.A00 = false;
            if (TextUtils.isEmpty(this.A0n)) {
                this.A0n = getString(2131895998);
            }
            if (TextUtils.isEmpty(this.A0q)) {
                this.A0q = ((AnonymousClass1KL) A012).A05.toString();
            }
        }
        if (!TextUtils.isEmpty(this.A0q)) {
            r7 = AnonymousClass8BU.A0H(A012, new BigDecimal(this.A0q));
        } else {
            r7 = ((AnonymousClass1KL) A012).A05;
        }
        AnonymousClass1KN A0H2 = AnonymousClass8BU.A0H(A012, new BigDecimal(this.A06.A04(AnonymousClass18O.A1H)));
        if (!A4y()) {
            C18030ve r10 = this.A0E;
            AnonymousClass1KW r9 = this.A0D;
            AnonymousClass11C r8 = this.A08;
            C18000vb r6 = this.A00;
            C26631Sw r5 = this.A0b;
            C18010vc r3 = this.A0C;
            aq4 = new AQ4(this, r8, r6, this.A0C, r9, r10, this.A0A, r3, r5);
        } else {
            aq4 = null;
        }
        C18030ve r23 = this.A0E;
        C18040vf r32 = C18040vf.A02;
        if (!C18020vd.A05(r32, r23, 1955) || !this.A0J || AnonymousClass1EG.A0H(this.A0o)) {
            str2 = this.A0p;
        } else {
            str2 = "500500";
        }
        String A002 = C199159zX.A00(this);
        if (!AnonymousClass1EG.A0H(A002)) {
            str2 = A002;
        }
        AnonymousClass1KN A042 = this.A0O.A04(str2, this.A0q, this.A0o);
        AEP aep2 = this.A0U;
        if (aep2 != null) {
            r15 = new C187419fm(this, this.A00, this.A07, aep2, this.A0q);
        } else {
            r15 = null;
        }
        this.A0B = new C20867Aaj(this, this.A00, A012, A042, r7, A0H2, r15);
        AnonymousClass1BI r45 = this.A0G;
        String str3 = this.A0n;
        C1418377d r17 = this.A0a;
        Integer num = this.A0j;
        String str4 = this.A0s;
        BDw bDw = this.A0M;
        if (this.A0y) {
            A032 = 0;
        } else {
            A032 = C72453Mb.A03(this.A0H ? 1 : 0);
        }
        C185029bu r72 = new C185029bu(A032, getIntent().getIntExtra("extra_transfer_direction", 0));
        C183449Yh r62 = new C183449Yh(!AnonymousClass8BR.A1P(this));
        C185009bs r52 = new C185009bs(NumberEntryKeyboard.A00(this.A00), this.A0u);
        C22546BCd bCd = this.A0N;
        String str5 = this.A0r;
        String str6 = this.A0o;
        String str7 = this.A0q;
        AEP aep3 = this.A0U;
        if (aep3 == null) {
            r2 = new C184999br(A012, 0);
        } else {
            r2 = new C184999br(this.A07.A01(aep3.A01), 2);
        }
        C188639hk r322 = new C188639hk(C108945cZ.A0N(2132083355, new int[]{0, 0, 0, 0}), C108945cZ.A0N(2132083355, new int[]{0, 0, 0, 0}), this.A09, r2, this.A0B, str5, str6, str7, 2132083354, false, false, false);
        C185019bt r82 = new C185019bt(this, C18020vd.A05(r32, this.A0E, 811));
        AnonymousClass72F r92 = this.A06;
        return new C188709hr(r45, aq4, bDw, bCd, r322, new C186969f3(this.A0C, this.A05, r92, C18020vd.A05(r32, this.A0E, 629)), r52, r62, r82, r72, r17, num, str3, str4, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r4 != 1018) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            r0 = 1008(0x3f0, float:1.413E-42)
            if (r4 == r0) goto L_0x0010
            r0 = 1015(0x3f7, float:1.422E-42)
            if (r4 == r0) goto L_0x0026
            r0 = 1018(0x3fa, float:1.427E-42)
            if (r4 == r0) goto L_0x0010
        L_0x000c:
            super.onActivityResult(r4, r5, r6)
            return
        L_0x0010:
            boolean r0 = A0x(r3)
            if (r0 == 0) goto L_0x000c
            X.1KN r2 = r3.A09
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r3.CNA(r0)
            X.10I r1 = r3.A05
            r0 = 26
            X.C21432Ajz.A00(r1, r3, r2, r0)
            return
        L_0x0026:
            r3.A5K()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj r6;
        int i2;
        int i3;
        C73203Rj A002;
        int i4;
        int i5;
        if (i != 29) {
            switch (i) {
                case 35:
                    A002 = AnonymousClass4a6.A00(this);
                    A002.A0E(2131897814);
                    A002.A0D(2131897813);
                    i2 = 2131899286;
                    i3 = 11;
                    break;
                case 36:
                    A002 = AnonymousClass4a6.A00(this);
                    A002.A0E(2131894220);
                    A002.A0D(2131894202);
                    i2 = 2131899286;
                    i3 = 12;
                    break;
                case 37:
                    ProgressDialog progressDialog = new ProgressDialog(this);
                    progressDialog.setMessage(getString(2131895077));
                    progressDialog.setCancelable(false);
                    progressDialog.setButton(-1, getString(2131898766), new C20155A9r(this, 13));
                    return progressDialog;
                default:
                    switch (i) {
                        case 39:
                            A0t(this, "-10021", "MAX_AMOUNT_2K_ALERT");
                            r6 = AnonymousClass4a6.A00(this);
                            AnonymousClass8BT.A15(this, r6, new Object[]{AnonymousClass1KL.A0B.BLd(this.A00, this.A0G)}, 2131893947);
                            i4 = 2131899286;
                            i5 = 14;
                            break;
                        case 40:
                            A0t(this, "-10021", "MAX_AMOUNT_2K_ALERT");
                            r6 = AnonymousClass4a6.A00(this);
                            AnonymousClass8BT.A15(this, r6, new Object[]{AnonymousClass1KL.A0B.BLd(this.A00, new BigDecimal(C199159zX.A00(this)))}, 2131893948);
                            i4 = 2131899286;
                            i5 = 15;
                            break;
                        case 41:
                            A0t(this, "-10021", "MAX_AMOUNT_2K_ALERT");
                            r6 = AnonymousClass4a6.A00(this);
                            AnonymousClass8BT.A15(this, r6, new Object[]{AnonymousClass1KL.A0B.BLd(this.A00, new BigDecimal(C199159zX.A00(this)))}, 2131893946);
                            i4 = 2131899286;
                            i5 = 16;
                            break;
                        default:
                            return super.onCreateDialog(i);
                    }
                    C20155A9r.A01(r6, this, i5, i4);
                    r6.A0T(false);
                    break;
            }
            C20155A9r.A01(r6, this, i3, i2);
            r6.A0T(true);
        } else {
            r6 = AnonymousClass4a6.A00(this);
            AnonymousClass8BW.A19(r6);
            C20155A9r.A01(r6, this, 9, 2131899101);
            C20155A9r.A00(r6, this, 10, 2131899286);
        }
        return r6.create();
    }

    private void A0Q() {
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i = 2131892489;
            if (this.A0y) {
                i = 2131894026;
            }
            AnonymousClass8BU.A17(supportActionBar, i);
            if (!this.A0y) {
                supportActionBar.A0J(0.0f);
            }
        }
    }

    public static void A0V(AnonymousClass1KN r2, AnonymousClass1KN r3, IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        if (A0x(indiaUpiSendPaymentActivity)) {
            indiaUpiSendPaymentActivity.A09 = r2;
            indiaUpiSendPaymentActivity.A0g = r3;
            indiaUpiSendPaymentActivity.CNA(2131895077);
            C21432Ajz.A00(indiaUpiSendPaymentActivity.A05, indiaUpiSendPaymentActivity, r2, 26);
            return;
        }
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        paymentBottomSheet.A02 = indiaUpiSendPaymentActivity.A5H(r2, (AnonymousClass1KN) null, r3, paymentBottomSheet);
        indiaUpiSendPaymentActivity.CMl(paymentBottomSheet);
    }

    public static boolean A0x(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        if (indiaUpiSendPaymentActivity.getIntent().getIntExtra("extra_transaction_type", 0) != 20) {
            return false;
        }
        if (!C18020vd.A05(C18040vf.A02, indiaUpiSendPaymentActivity.A0E, 1847) || !indiaUpiSendPaymentActivity.A0K.A0E()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v31, types: [X.96a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.AQ2, java.lang.Object, X.BBw] */
    public void onCreate(Bundle bundle) {
        boolean A0K2;
        AnonymousClass1DS r1;
        int i;
        boolean z;
        super.onCreate(bundle);
        this.A0H = C87544Vz.A00(this.A0E);
        this.A04.A03 = this.A0V;
        if (bundle == null) {
            String A0p = AnonymousClass8BV.A0p(this);
            if (A0p == null) {
                A0p = this.A0g;
            }
            Integer A002 = this.A0V.A00(A0p, 185472016);
            if (A002 != null) {
                this.A00 = A002.intValue();
            }
            this.A0V.A06("wa_to_wa", !A4y(), this.A00);
        }
        this.A0L = (IndiaUpiSendPaymentViewModel) AnonymousClass3MW.A0N(this).A00(IndiaUpiSendPaymentViewModel.class);
        AnonymousClass1QO r3 = this.A0P;
        AnonymousClass1BI r2 = this.A0F;
        String str = this.A0g;
        if (r2 == null) {
            A0K2 = false;
        } else {
            A0K2 = r3.A0K(C60432o1.A00(r3.A01, r2), str);
        }
        IndiaUpiSendPaymentViewModel indiaUpiSendPaymentViewModel = this.A0L;
        if (A0K2) {
            r1 = indiaUpiSendPaymentViewModel.A01;
            i = 34;
        } else {
            r1 = indiaUpiSendPaymentViewModel.A03;
            i = 35;
        }
        C20337AGt.A00(this, r1, i);
        this.A01.registerObserver(this.A0O);
        A0Q();
        PaymentView paymentView = (PaymentView) LayoutInflater.from(this).inflate(2131626885, (ViewGroup) null, false);
        this.A0J = paymentView;
        paymentView.A0k = this;
        getLifecycle().A05(new C20325AGh(paymentView, 2));
        AEP aep = (AEP) getIntent().getParcelableExtra("extra_upi_global_meta_data");
        this.A0U = aep;
        if (aep != null) {
            ? obj = new Object();
            this.A09 = obj;
            PaymentView paymentView2 = this.A0J;
            if (paymentView2 != null) {
                paymentView2.A0G(obj, 2131435183, 2131435184);
            }
            this.A09.BD6(new C184389as(2, new C193189pg(C17880vN.A0q(this, A03(this, this.A0U.A08), AnonymousClass3MW.A1a(), 0, 2131898584))));
            AQ2 aq2 = this.A09;
            AFQ afq = new AFQ(this, 1);
            TextView textView = aq2.A00;
            if (textView != null) {
                textView.setOnClickListener(afq);
            } else {
                C18070vi.A11("amountConversion");
                throw null;
            }
        }
        this.A0J = getIntent().getBooleanExtra("verify-vpa-in-background", false);
        this.A0X = getIntent().getBooleanExtra("extra_mapper_alias_resolved", false);
        this.A0S = getIntent().getStringExtra("extra_receiver_platform");
        C18030ve r12 = this.A0E;
        C18040vf r4 = C18040vf.A02;
        if (C18020vd.A05(r4, r12, 1933) && A7Z.A05(this.A0g)) {
            int A042 = this.A06.A04(AnonymousClass18O.A1F);
            if (C18020vd.A05(r4, this.A0E, 7137)) {
                A042 = this.A06.A04(AnonymousClass18O.A1G);
            }
            this.A0G = new BigDecimal(A042);
        }
        this.A0o = getIntent().getBooleanExtra("extra_transaction_is_valid_merchant", false);
        this.A0V = getIntent().getStringExtra("extra_merchant_code");
        this.A0a = C108955ca.A0r(this, "extra_merchant_code");
        String str2 = this.A0V;
        if (str2 != null && !str2.equals("0000")) {
            this.A0t = "p2m";
        }
        if (A4y()) {
            A0q(this);
        } else {
            this.A0A = new Object();
        }
        if (this.A0H) {
            View A062 = AnonymousClass1HF.A06(this.A0J, 2131435191);
            this.A0K = new BottomSheetBehavior();
            ((C136736uJ) this.A0F.get()).A01(A062, this.A0K, this, this.A09);
        }
        if (C18020vd.A05(r4, this.A0E, 8987) && this.A0X && "payment_composer_icon".equals(this.A0g)) {
            AXS axs = this.A0N;
            synchronized (axs) {
                z = false;
                try {
                    String A063 = axs.A01.A06();
                    if (!TextUtils.isEmpty(A063)) {
                        z = C17880vN.A16(A063).optBoolean("registeredMapperUserNuxSheetDismissed", false);
                    }
                } catch (JSONException e) {
                    Log.w("PAY: IndiaUpiPaymentSharedPrefs isRegisterMapperUserNuxSheetDismissed threw: ", e);
                }
            }
            if (!z && AnonymousClass8BR.A1P(this)) {
                String str3 = this.A0g;
                Hilt_IndiaUpiMapperRegisterUserNuxBottomSheet hilt_IndiaUpiMapperRegisterUserNuxBottomSheet = new Hilt_IndiaUpiMapperRegisterUserNuxBottomSheet();
                Bundle A0D2 = C17880vN.A0D();
                A0D2.putString("referral_screen", str3);
                hilt_IndiaUpiMapperRegisterUserNuxBottomSheet.A1R(A0D2);
                CMk(hilt_IndiaUpiMapperRegisterUserNuxBottomSheet, "IndiaUpiMapperRegisterUserNuxBottomSheet");
            }
        }
        if (this.A0H) {
            ((C136736uJ) this.A0F.get()).A03(this.A0K, false);
            return;
        }
        return;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0V.A02(this.A00, 4);
        this.A01.unregisterObserver(this.A0O);
        C17890vO.A0t(this.A08);
    }

    public void onPause() {
        super.onPause();
        PaymentView paymentView = this.A0J;
        if (paymentView != null) {
            paymentView.A03 = paymentView.A0o.BMU().getCurrentFocus();
        }
    }

    public void onResume() {
        super.onResume();
        if (AnonymousClass8BR.A1P(this)) {
            if (!this.A04.A07.contains("upi-get-challenge") && this.A0N.A0E().A00 == null) {
                this.A0i.A06("onResume getChallenge");
                CNA(2131895077);
                this.A04.A01("upi-get-challenge");
                A53();
                return;
            } else if (TextUtils.isEmpty((CharSequence) this.A0N.A0D().A00)) {
                this.A05.A02(this, this.A04, new AY9(this, 0));
                return;
            }
        }
        A57();
    }
}
