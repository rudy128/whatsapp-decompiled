package com.whatsapp.payments.ui;

import X.AFO;
import X.AGC;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FY;
import X.AnonymousClass1QO;
import X.AnonymousClass1QS;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aX;
import X.AnonymousClass8BU;
import X.C000200d;
import X.C003401n;
import X.C108945cZ;
import X.C137116uw;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C19740yt;
import X.C20336AGs;
import X.C20339AGv;
import X.C21965AvT;
import X.C22237Azr;
import X.C24261Jm;
import X.C63662tU;
import X.C63932tv;
import X.C70813Cp;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;

public final class BusinessHubActivity extends AnonymousClass1FY {
    public ViewGroup A00;
    public ViewGroup A01;
    public ImageView A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public AnonymousClass1QO A0A;
    public AnonymousClass1QS A0B;
    public AnonymousClass00H A0C;
    public boolean A0D;
    public final C18100vl A0E;

    public void A2y() {
        if (!this.A0D) {
            this.A0D = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A0C = C000200d.A00(r2.Acf);
            this.A0A = AnonymousClass3Ma.A0q(r2);
            this.A0B = AnonymousClass3MZ.A0z(r2);
        }
    }

    public BusinessHubActivity(int i) {
        this.A0D = false;
        AGC.A00(this, 31);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131624368);
        C003401n A0K = AnonymousClass3MY.A0K(this, (Toolbar) findViewById(2131433485));
        if (A0K != null) {
            A0K.A0S((CharSequence) null);
            A0K.A0W(true);
            int A002 = C19740yt.A00(this, 2131100602);
            Drawable A003 = C24261Jm.A00(this, 2131231814);
            if (A003 != null) {
                A0K.A0O(AnonymousClass4aX.A08(A003, A002));
            }
        }
        View findViewById = findViewById(2131433620);
        ImageView A0C2 = AnonymousClass3Ma.A0C(findViewById, 2131433502);
        C18070vi.A0d(A0C2, 0);
        this.A02 = A0C2;
        TextView A0E2 = AnonymousClass3Ma.A0E(findViewById, 2131428489);
        C18070vi.A0d(A0E2, 0);
        this.A04 = A0E2;
        TextView A0E3 = AnonymousClass3Ma.A0E(findViewById, 2131428490);
        C18070vi.A0d(A0E3, 0);
        this.A05 = A0E3;
        ViewGroup viewGroup = (ViewGroup) C18070vi.A05(findViewById, 2131436784);
        C18070vi.A0d(viewGroup, 0);
        this.A01 = viewGroup;
        TextView A0E4 = AnonymousClass3Ma.A0E(findViewById, 2131433621);
        C18070vi.A0d(A0E4, 0);
        this.A06 = A0E4;
        View findViewById2 = findViewById(2131433720);
        ImageView A0C3 = AnonymousClass3Ma.A0C(findViewById2, 2131433717);
        C18070vi.A0d(A0C3, 0);
        this.A03 = A0C3;
        TextView A0E5 = AnonymousClass3Ma.A0E(findViewById2, 2131433718);
        C18070vi.A0d(A0E5, 0);
        this.A07 = A0E5;
        TextView A0E6 = AnonymousClass3Ma.A0E(findViewById2, 2131433719);
        C18070vi.A0d(A0E6, 0);
        this.A08 = A0E6;
        int i = 8;
        C18070vi.A05(findViewById2, 2131437010).setVisibility(8);
        View A052 = C18070vi.A05(findViewById(2131433453), 2131434583);
        AnonymousClass3MX.A0L(this, 2131434599).setText(2131889566);
        AFO.A00(A052, this, 9);
        int A004 = C19740yt.A00(this, 2131101222);
        AnonymousClass4aX.A0D(AnonymousClass3MX.A0I(this, 2131434598), A004);
        AnonymousClass1QO r0 = this.A0A;
        if (r0 != null) {
            if (!C18020vd.A05(C18040vf.A02, r0.A02, 4781)) {
                i = 0;
            }
            A052.setVisibility(i);
            ViewGroup viewGroup2 = (ViewGroup) AnonymousClass3MY.A0H(this, 2131429895);
            C18070vi.A0d(viewGroup2, 0);
            this.A00 = viewGroup2;
            AnonymousClass8BU.A15(viewGroup2, 2131429897, A004);
            ViewGroup viewGroup3 = this.A00;
            if (viewGroup3 != null) {
                TextView A0E7 = AnonymousClass3Ma.A0E(viewGroup3, 2131429899);
                C18070vi.A0d(A0E7, 0);
                this.A09 = A0E7;
                C20336AGs aGs = new C20336AGs(this, 49);
                C18100vl r3 = this.A0E;
                C108945cZ.A0Q(((PaymentMerchantAccountViewModel) r3.getValue()).A06).A0A(this, aGs);
                C20339AGv.A00(this, C108945cZ.A0Q(((PaymentMerchantAccountViewModel) r3.getValue()).A08), new C22237Azr(this), 40);
                PaymentMerchantAccountViewModel paymentMerchantAccountViewModel = (PaymentMerchantAccountViewModel) r3.getValue();
                paymentMerchantAccountViewModel.A04.CGN(new C70813Cp(27, (Object) paymentMerchantAccountViewModel, true));
                return;
            }
            str = "removeAccountRow";
        } else {
            str = "paymentsGatingManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public BusinessHubActivity() {
        this(0);
        this.A0E = AnonymousClass1DF.A01(new C21965AvT(this));
    }
}
