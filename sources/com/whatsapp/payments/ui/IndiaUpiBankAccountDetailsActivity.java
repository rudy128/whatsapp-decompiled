package com.whatsapp.payments.ui;

import X.A0B;
import X.A0u;
import X.A12;
import X.A43;
import X.A56;
import X.A7U;
import X.A9Q;
import X.AFO;
import X.AGC;
import X.AX3;
import X.AXG;
import X.AXO;
import X.AXS;
import X.AYB;
import X.AYE;
import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass18O;
import X.AnonymousClass1HF;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1KI;
import X.AnonymousClass1OZ;
import X.AnonymousClass1QE;
import X.AnonymousClass1QO;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass4aX;
import X.AnonymousClass705;
import X.AnonymousClass788;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass8Dm;
import X.AnonymousClass8pN;
import X.AnonymousClass8pS;
import X.AnonymousClass91y;
import X.AnonymousClass93C;
import X.AnonymousClass9BC;
import X.AnonymousClass9F7;
import X.AnonymousClass9YN;
import X.C000200d;
import X.C003401n;
import X.C108965cb;
import X.C137116uw;
import X.C1418477e;
import X.C175608yz;
import X.C175818zK;
import X.C177929Bd;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C189689je;
import X.C191129m4;
import X.C195029sg;
import X.C195859u1;
import X.C196259ui;
import X.C20061A5k;
import X.C20063A5m;
import X.C20080A6g;
import X.C20087A6p;
import X.C20092A6u;
import X.C20112A7u;
import X.C20151A9n;
import X.C20154A9q;
import X.C20270AEd;
import X.C20284AEs;
import X.C20615ARz;
import X.C20752AXh;
import X.C20979AcX;
import X.C21426Ajt;
import X.C22377B5g;
import X.C29621ca;
import X.C30931ek;
import X.C31061ex;
import X.C34991lS;
import X.C35021lW;
import X.C43251zV;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.CopyableTextView;
import com.whatsapp.util.Log;

public class IndiaUpiBankAccountDetailsActivity extends AnonymousClass91y implements C22377B5g {
    public AnonymousClass8pN A00;
    public AnonymousClass1KI A01;
    public A12 A02;
    public C20752AXh A03;
    public A7U A04;
    public AXS A05;
    public C20080A6g A06;
    public C31061ex A07;
    public AnonymousClass1QO A08;
    public C195859u1 A09;
    public C175818zK A0A;
    public AZ6 A0B;
    public A0B A0C;
    public C191129m4 A0D;
    public AnonymousClass8Dm A0E;
    public A43 A0F;
    public C30931ek A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public boolean A0M;
    public C189689je A0N;
    public boolean A0O;
    public final AnonymousClass1QE A0P;

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (i4 == -1) {
            if (i == 0) {
                this.A0N.A00(this);
            } else if (i3 == 1012) {
                this.A0E.A00();
            } else {
                if (i3 == 1016) {
                    this.A0E.A00();
                    AnonymousClass8pN r2 = (AnonymousClass8pN) intent2.getParcelableExtra("extra_bank_account");
                    if (r2 != null) {
                        this.A00 = r2;
                    }
                } else if (i3 != 1017) {
                    if (i3 == 1019) {
                        if (intent != null) {
                            this.A0E.setInternationalActivationView((C20270AEd) intent2.getParcelableExtra("INTERNATIONAL_ACTIVATION_RESULT_STATE"));
                        }
                    } else if (i3 == 1020 && intent != null) {
                        AnonymousClass8pS A0N2 = AnonymousClass8BU.A0N(this.A0P, this.A00.A08, "IndiaUpiBankAccountDetailsActivity onDeactivate Unable to get IndiaUpiMethodData");
                        this.A0E.setInternationalActivationView(new C20270AEd("", "", true));
                        String stringExtra = intent2.getStringExtra("extra_referral_screen");
                        C20112A7u A032 = C20112A7u.A03(new C20112A7u[0]);
                        A032.A07("payments_request_name", "deactivate_international_payments");
                        C20087A6p.A02(A032, this.A0B, (Integer) null, "international_payment_prompt", stringExtra, 3);
                        C1418477e r10 = A0N2.A08;
                        C1418477e r9 = (C1418477e) intent2.getParcelableExtra("DEACTIVATION_MPIN_BLOB");
                        C1418477e r8 = (C1418477e) intent2.getParcelableExtra("DEACTIVATION_SEQ_NUMBER");
                        C175608yz r22 = (C175608yz) this.A0J.get();
                        String str = A0N2.A0E;
                        C1418477e r7 = A0N2.A05;
                        String str2 = this.A00.A0A;
                        AnonymousClass9YN r4 = new AnonymousClass9YN(this);
                        C18070vi.A0n(r10, str, r9);
                        C72473Md.A1M(r8, r7, str2, 3);
                        Log.i("PAY: deactivateInternationalPayments called");
                        AnonymousClass00H r6 = r22.A02;
                        String A0T = C17890vO.A0T(r6);
                        String A0h = AnonymousClass8BS.A0h(r10);
                        String A012 = r22.A00.A01();
                        C18070vi.A0X(A012);
                        AnonymousClass9F7 r102 = new AnonymousClass9F7(A0T, A0h, str, str2, A012, AnonymousClass8BS.A0h(r9), AnonymousClass8BS.A0h(r8), AnonymousClass8BS.A0h(r7));
                        String str3 = str2;
                        C17880vN.A0U(r6).A0I(new C20979AcX(r4, r102, r22, str3, 1), (C29621ca) r102.A00, A0T, 204, 0);
                    }
                }
                Intent A092 = AnonymousClass8BW.A09(this, this.A00, IndiaUpiPinSetUpCompletedActivity.class);
                A092.putExtra("on_settings_page", true);
                startActivity(A092);
            }
        }
        super.onActivityResult(i3, i4, intent2);
    }

    public static C20270AEd A03(C20284AEs aEs, IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity) {
        String string;
        AnonymousClass8pS r0 = (AnonymousClass8pS) aEs.A08;
        if ((r0 != null && !r0.A0J) || !C20092A6u.A02(indiaUpiBankAccountDetailsActivity.A0E, indiaUpiBankAccountDetailsActivity.A05.A0G())) {
            return null;
        }
        C195029sg A012 = ((A0u) indiaUpiBankAccountDetailsActivity.A0I.get()).A01(aEs.A0A);
        if (A012 == null || !A012.A02.equals("activated")) {
            string = indiaUpiBankAccountDetailsActivity.getString(2131894203);
        } else {
            string = C17880vN.A0q(indiaUpiBankAccountDetailsActivity, C20092A6u.A00(indiaUpiBankAccountDetailsActivity.A03, A012.A00), AnonymousClass3MW.A1a(), 0, 2131894199);
        }
        return new C20270AEd(string, "", false);
    }

    public void A2y() {
        if (!this.A0O) {
            this.A0O = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r1 = A002.AAQ;
            C63932tv.A02(r1, this);
            AnonymousClass10G r3 = r1.A00;
            C63932tv.A01(r1, r3, this);
            C63662tU.A00(r1, r3, this, r3.A5A);
            this.A00 = AnonymousClass10E.A12(r1);
            this.A06 = AnonymousClass3MY.A0Z(r1);
            this.A0E = AnonymousClass10E.AL1(r1);
            this.A05 = AnonymousClass8BT.A0J(r1);
            this.A02 = C108965cb.A0H(r1);
            this.A01 = AnonymousClass8BT.A0A(r3);
            this.A03 = AnonymousClass10E.A6Q(r1);
            this.A0A = AnonymousClass3MZ.A0z(r1);
            this.A09 = AnonymousClass3Ma.A0q(r1);
            this.A0G = C000200d.A00(r1.A87);
            this.A07 = AnonymousClass8BT.A0R(r1);
            this.A08 = AnonymousClass8BV.A0G(r1);
            this.A0F = C000200d.A00(r1.Ach);
            this.A0K = C000200d.A00(r1.A6N);
            this.A0G = AnonymousClass8BT.A0V(r1);
            this.A0F = (A43) r1.AW8.get();
            this.A0C = r1.AGY();
            this.A03 = AnonymousClass8BU.A0M(r3);
            this.A06 = (C20080A6g) r1.A5G.get();
            this.A04 = (A7U) r1.A5E.get();
            this.A02 = (A12) r3.A6g.get();
            this.A07 = AnonymousClass8BU.A0R(r1);
            this.A08 = AnonymousClass3Ma.A0q(r1);
            this.A09 = AnonymousClass1K1.A1N(A002);
            this.A0D = (C191129m4) r3.AEf.get();
            this.A01 = AnonymousClass8BT.A0I(r1);
            this.A0B = AnonymousClass8BU.A0T(r1);
            this.A0L = C000200d.A00(r1.A84);
            this.A05 = AnonymousClass8BT.A0Q(r1);
            this.A0I = C000200d.A00(r3.ACL);
            this.A0J = C000200d.A00(A002.A4O);
            this.A0H = C000200d.A00(r1.A3v);
        }
    }

    public void A4b() {
        C21426Ajt ajt = new C21426Ajt(this, 48);
        C17890vO.A0u(new AnonymousClass9BC(this, 103, 1, ajt), this.A0E);
    }

    public void A4f(boolean z) {
        if (z) {
            if (C18020vd.A05(C18040vf.A02, this.A0E, 12214)) {
                ((C34991lS) this.A0H.get()).A05(new C20615ARz(this, 0), C35021lW.A06, (AnonymousClass705) null, (String) null);
                return;
            }
            this.A0P.A06("unlinking the payment account.");
            Intent A072 = AnonymousClass8BR.A07(this, PaymentDeleteAccountActivity.class);
            A072.putExtra("extra_remove_payment_account", 1);
            startActivityForResult(A072, 0);
            return;
        }
        CNA(2131895077);
        this.A0B.COK();
        AZ6 az6 = this.A0B;
        AXG axg = new AXG(new AXO(this, az6, 5), az6, this, 0);
        AnonymousClass8pS A0N2 = AnonymousClass8BU.A0N(this.A0P, this.A00.A08, "IndiaUpiBankAccountDetailsActivity onRemovePaymentMethod Unable to get IndiaUpiMethodData");
        C175818zK r6 = this.A0A;
        C1418477e r3 = A0N2.A08;
        String str = A0N2.A0E;
        C1418477e r4 = A0N2.A05;
        String str2 = this.A00.A0A;
        if (C20061A5k.A02(r3)) {
            r6.A06.A02(r6.A00, (C196259ui) null, new AYB(r4, axg, r6, str2));
        } else {
            C175818zK.A00(r3, r4, axg, r6, str, str2);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        AnonymousClass8BX.A0u(this);
        this.A02.A01(new AX3(this, 0));
        this.A0N = new C189689je(this.A07);
        AnonymousClass8pN r0 = (AnonymousClass8pN) AnonymousClass3MY.A09(this).get("extra_bank_account");
        this.A00 = r0;
        C17960vV.A07(r0);
        AnonymousClass8pS r4 = (AnonymousClass8pS) r0.A08;
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            if (C18070vi.A18(r4.A0A, "CREDIT")) {
                i = 2131897436;
            } else {
                i = 2131893801;
                if (C18070vi.A18(r4.A0A, "CREDIT_LINE")) {
                    i = 2131897441;
                }
            }
            AnonymousClass8BU.A17(supportActionBar, i);
        }
        this.A0P.A06("onCreate");
        C20080A6g.A00(getLayoutInflater(), AnonymousClass3MX.A0F(this, 2131430951), this.A00, A43.A00(this.A05.A0G(), (String) null).A00, true);
        AnonymousClass1KB r7 = this.A00;
        AnonymousClass1OZ A0U = C17880vN.A0U(this.A0K);
        C30931ek r15 = this.A0G;
        A7U a7u = this.A04;
        A0B a0b = this.A0C;
        this.A0A = new C175818zK(this, r7, this.A01, A0U, a7u, AnonymousClass8BR.A0a(this.A0L), this.A07, this.A09, a0b, r15);
        AnonymousClass3MW.A1T(new C177929Bd((Object) this, 9), this.A0E, 0);
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj r2;
        int i2;
        C20154A9q a9q;
        int i3;
        boolean z = false;
        if (i != 100) {
            if (i == 101) {
                r2 = AnonymousClass4a6.A00(this);
                AnonymousClass8BW.A19(r2);
                C20154A9q.A00(r2, this, 0, 2131899101);
                i2 = 2131899286;
                a9q = new C20154A9q(this, 1);
            } else if (i != 200) {
                switch (i) {
                    case 103:
                        r2 = AnonymousClass4a6.A00(this);
                        r2.A0D(2131897508);
                        i2 = 2131899286;
                        i3 = 2;
                        break;
                    case 104:
                        r2 = AnonymousClass4a6.A00(this);
                        r2.A0D(2131897509);
                        i2 = 2131899286;
                        i3 = 3;
                        break;
                    case 105:
                        r2 = AnonymousClass4a6.A00(this);
                        r2.A0E(2131897448);
                        r2.A0D(2131897447);
                        C20154A9q.A00(r2, this, 4, 2131887457);
                        i2 = 2131899286;
                        i3 = 5;
                        break;
                    default:
                        return super.onCreateDialog(i);
                }
                a9q = new C20154A9q(this, i3);
            } else {
                r2 = AnonymousClass4a6.A00(this);
                r2.A0E(2131897451);
                A56 A0c = AnonymousClass8BR.A0c(this.A0G);
                C20284AEs aEs = this.A04;
                C18070vi.A0d(aEs, 0);
                AnonymousClass8BT.A15(this, r2, new Object[]{A0c.A03(aEs, true)}, 2131897450);
                C20154A9q.A01(r2, this, 6, 2131898766);
                r2.A0L(new C20154A9q(this, 8), getString(2131895092));
            }
            r2.A0X(a9q, i2);
        } else {
            if (AnonymousClass8BR.A0O(this.A0A).A0V(1).size() > 0) {
                z = true;
            }
            r2 = AnonymousClass4a6.A00(this);
            int i4 = 2131896658;
            if (z) {
                i4 = 2131896659;
            }
            r2.A0S(C43251zV.A05(this, this.A0D, getString(i4)));
            r2.A0T(true);
            C20154A9q.A01(r2, this, 7, 2131898766);
            C20151A9n.A00(r2, this, 49, 2131893965);
            A9Q.A00(r2, this, 18);
        }
        return r2.create();
    }

    public IndiaUpiBankAccountDetailsActivity(int i) {
        this.A0O = false;
        AGC.A00(this, 42);
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [android.widget.LinearLayout, X.8Dm, android.view.View, android.view.ViewGroup] */
    public void A4c(C20284AEs aEs, boolean z) {
        super.A4c(aEs, z);
        AnonymousClass8pN r2 = (AnonymousClass8pN) aEs;
        this.A00 = r2;
        this.A0J.setText(this.A06.A05(r2));
        if (z) {
            this.A0J.setText(this.A06.A05(this.A00));
            CopyableTextView copyableTextView = this.A0K;
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = this.A05.A0D().A00;
            AnonymousClass3MY.A0y(this, copyableTextView, A1a, 2131898300);
            this.A0K.A02 = AXS.A00(this.A05);
            this.A0K.A03 = getString(2131898299);
            AnonymousClass8pS r22 = (AnonymousClass8pS) this.A00.A08;
            this.A0I.setText(r22.A0C());
            if (C18070vi.A18(r22.A0A, "CREDIT")) {
                AnonymousClass3MX.A0F(this, 2131433593).addView(AnonymousClass3MY.A0D(LayoutInflater.from(this), 2131625663));
                findViewById(2131434440).setOnClickListener(new AnonymousClass788(new AFO(this, 41), this.A05));
                C72463Mc.A19(this, 2131429858);
            }
            AnonymousClass3MX.A0F(this, 2131433576).addView(AnonymousClass3MY.A0D(LayoutInflater.from(this), 2131625664));
            findViewById(2131429073).setOnClickListener(new AnonymousClass788(new AFO(this, 40), this.A05));
            AnonymousClass4aX.A0D(AnonymousClass3MX.A0I(this, 2131429075), AnonymousClass3Ma.A00(this, 2130971195, 2131102531));
            C72463Mc.A19(this, 2131429858);
            ? linearLayout = new LinearLayout(this);
            if (!linearLayout.A08) {
                linearLayout.A08 = true;
                linearLayout.generatedComponent();
            }
            LayoutInflater.from(this).inflate(2131625678, linearLayout);
            int A002 = AnonymousClass3Ma.A00(this, 2130971195, 2131102531);
            AnonymousClass8BU.A15(linearLayout, 2131428963, A002);
            AnonymousClass8BU.A15(linearLayout, 2131434627, A002);
            AnonymousClass8BU.A15(linearLayout, 2131435961, A002);
            this.A0E = linearLayout;
            AnonymousClass3MX.A0F(this, 2131437078).addView(this.A0E);
            AnonymousClass8Dm r23 = this.A0E;
            C20270AEd A032 = A03(aEs, this);
            r23.A06 = this;
            AnonymousClass8pS r1 = (AnonymousClass8pS) aEs.A08;
            C17960vV.A07(r1);
            r23.findViewById(2131434632).setOnClickListener(r23);
            r23.A04 = AnonymousClass3MW.A0J(r23, 2131434631);
            r23.A00 = AnonymousClass1HF.A06(r23, 2131429015);
            r23.A03 = AnonymousClass1HF.A06(r23, 2131435960);
            r23.A02 = r23.findViewById(2131436567);
            r23.A01 = r23.findViewById(2131436566);
            C1418477e r0 = r1.A04;
            r23.A05 = r0;
            if (r0 == null || !AnonymousClass8BW.A1S(r0)) {
                r23.A04.setText(2131894005);
                r23.A00.setVisibility(8);
            } else {
                r23.A00.setVisibility(0);
                if (A032 != null) {
                    r23.setInternationalActivationView(A032);
                }
            }
            r23.A00.setOnClickListener(r23);
            r23.A03.setOnClickListener(r23);
            this.A0E.A03.setVisibility(C72453Mb.A07(AnonymousClass000.A1O(this.A06.A09(AnonymousClass18O.A0D) ? 1 : 0) ^ true ? 1 : 0));
        }
    }

    public /* synthetic */ void A4e() {
        super.A4b();
    }

    public void onClick(View view) {
        if (view.getId() != 2131429860 || !C20063A5m.A01(this.A00)) {
            super.onClick(view);
            return;
        }
        AnonymousClass8pS A0N2 = AnonymousClass8BU.A0N(this.A0P, this.A00.A08, "Unable to get IndiaUpiMethodData");
        if (!A0N2.A0G || this.A0M) {
            CNA(2131895077);
            C175818zK r3 = this.A0A;
            C1418477e r4 = A0N2.A08;
            String str = A0N2.A0E;
            C1418477e r5 = A0N2.A05;
            String str2 = this.A00.A0A;
            boolean z = !A0N2.A0G;
            AnonymousClass93C r6 = new AnonymousClass93C(this.A03, this.A0B, this, this);
            if (C20061A5k.A02(r4)) {
                r3.A06.A02(r3.A00, (C196259ui) null, new AYE(r5, r6, r3, str2, false, z));
            } else {
                r3.A01(r4, r5, r6, str, str2, false, z);
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A02.A02()) {
            A12.A00(this);
        }
    }

    public IndiaUpiBankAccountDetailsActivity() {
        this(0);
        this.A0M = false;
        this.A0P = AnonymousClass1QE.A00("IndiaUpiBankAccountDetailsActivity", "payment-settings", "IN");
    }
}
