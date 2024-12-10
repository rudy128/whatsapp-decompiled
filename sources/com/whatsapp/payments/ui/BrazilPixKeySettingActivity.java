package com.whatsapp.payments.ui;

import X.AGC;
import X.AGI;
import X.AnonymousClass000;
import X.AnonymousClass02n;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4aX;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BV;
import X.BD4;
import X.C003401n;
import X.C137116uw;
import X.C171858sO;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C194929sW;
import X.C19740yt;
import X.C20112A7u;
import X.C20339AGv;
import X.C22234Azo;
import X.C24261Jm;
import X.C30921ej;
import X.C63662tU;
import X.C63932tv;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

public final class BrazilPixKeySettingActivity extends AnonymousClass1FY {
    public int A00;
    public AnonymousClass02n A01;
    public C194929sW A02;
    public AnonymousClass1LU A03;
    public C30921ej A04;
    public BD4 A05;
    public BrazilPixKeySettingViewModel A06;
    public PaymentMethodRow A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;

    public static final void A03(BrazilPixKeySettingActivity brazilPixKeySettingActivity, Integer num, String str, String str2, int i) {
        BD4 bd4 = brazilPixKeySettingActivity.A05;
        if (bd4 != null) {
            C171858sO A0D2 = AnonymousClass8BV.A0D(bd4, i);
            A0D2.A07 = num;
            A0D2.A0b = str;
            A0D2.A0Y = str2;
            A0D2.A0a = brazilPixKeySettingActivity.A0B;
            C20112A7u A022 = C20112A7u.A02();
            A022.A07("payment_method", "pix");
            AnonymousClass8BR.A1H(A0D2, A022);
            BD4 bd42 = brazilPixKeySettingActivity.A05;
            if (bd42 != null) {
                bd42.BiH(A0D2);
                return;
            }
        }
        C18070vi.A11("paymentFieldStatsLogger");
        throw null;
    }

    public static final boolean A0Q(BrazilPixKeySettingActivity brazilPixKeySettingActivity) {
        String str;
        String str2;
        BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = brazilPixKeySettingActivity.A06;
        if (brazilPixKeySettingViewModel == null) {
            C18070vi.A11("brazilPixKeySettingViewModel");
            throw null;
        }
        if (!C18020vd.A05(C18040vf.A02, brazilPixKeySettingViewModel.A06.A06.A02, 5861) || 1 != brazilPixKeySettingActivity.A00 || (str = brazilPixKeySettingActivity.A0A) == null || str.length() == 0 || (str2 = brazilPixKeySettingActivity.A09) == null || str2.length() == 0) {
            return false;
        }
        return true;
    }

    public void A2y() {
        if (!this.A0D) {
            this.A0D = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A05 = AnonymousClass8BT.A0T(r1);
            this.A04 = (C30921ej) r2.A8H.get();
            this.A03 = AnonymousClass3MY.A0Z(r2);
        }
    }

    public BrazilPixKeySettingActivity(int i) {
        this.A0D = false;
        AGC.A00(this, 28);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object, X.02h] */
    public void onCreate(Bundle bundle) {
        String string;
        String str;
        String str2;
        int i;
        String str3;
        super.onCreate(bundle);
        setContentView(2131625045);
        C003401n A0K = AnonymousClass3MY.A0K(this, (Toolbar) findViewById(2131433485));
        Context baseContext = getBaseContext();
        if (A0K != null) {
            A0K.A0W(true);
            A0K.A0M(2131887388);
            int A002 = C19740yt.A00(baseContext, 2131100602);
            Drawable A003 = C24261Jm.A00(baseContext, 2131231814);
            if (A003 != null) {
                A0K.A0O(AnonymousClass4aX.A08(A003, A002));
            }
        }
        PaymentMethodRow paymentMethodRow = (PaymentMethodRow) AnonymousClass3MY.A0H(this, 2131433594);
        this.A07 = paymentMethodRow;
        if (paymentMethodRow == null) {
            C18070vi.A11("paymentMethodRow");
            throw null;
        }
        paymentMethodRow.A00.setImageResource(2131232822);
        PaymentMethodRow paymentMethodRow2 = this.A07;
        if (paymentMethodRow2 == null) {
            C18070vi.A11("paymentMethodRow");
            throw null;
        }
        paymentMethodRow2.A03.setText((CharSequence) null);
        PaymentMethodRow paymentMethodRow3 = this.A07;
        if (paymentMethodRow3 == null) {
            C18070vi.A11("paymentMethodRow");
            throw null;
        }
        paymentMethodRow3.A04.A02();
        Bundle A092 = AnonymousClass3MY.A09(this);
        if (A092 == null || (string = A092.getString("credential_id")) == null) {
            throw AnonymousClass000.A0k("Missing credential_id on intent extra param!");
        }
        this.A08 = string;
        Bundle A093 = AnonymousClass3MY.A09(this);
        if (A093 != null) {
            str = A093.getString("extra_provider");
        } else {
            str = null;
        }
        this.A09 = str;
        Bundle A094 = AnonymousClass3MY.A09(this);
        if (A094 != null) {
            str2 = A094.getString("extra_provider_type");
        } else {
            str2 = null;
        }
        this.A0A = str2;
        Bundle A095 = AnonymousClass3MY.A09(this);
        if (A095 != null) {
            i = A095.getInt("extra_onboarding_provider");
        } else {
            i = 0;
        }
        this.A00 = i;
        BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = (BrazilPixKeySettingViewModel) AnonymousClass3MW.A0N(this).A00(BrazilPixKeySettingViewModel.class);
        this.A06 = brazilPixKeySettingViewModel;
        if (brazilPixKeySettingViewModel == null) {
            C18070vi.A11("brazilPixKeySettingViewModel");
            throw null;
        }
        C20339AGv.A00(this, brazilPixKeySettingViewModel.A00, new C22234Azo(this), 37);
        BrazilPixKeySettingViewModel brazilPixKeySettingViewModel2 = this.A06;
        if (brazilPixKeySettingViewModel2 == null) {
            C18070vi.A11("brazilPixKeySettingViewModel");
            throw null;
        }
        brazilPixKeySettingViewModel2.A05.registerObserver(brazilPixKeySettingViewModel2.A04);
        BrazilPixKeySettingViewModel brazilPixKeySettingViewModel3 = this.A06;
        if (brazilPixKeySettingViewModel3 == null) {
            C18070vi.A11("brazilPixKeySettingViewModel");
            throw null;
        }
        String str4 = this.A08;
        if (str4 == null) {
            C18070vi.A11("credentialId");
            throw null;
        }
        AnonymousClass8BT.A1K(brazilPixKeySettingViewModel3.A09, brazilPixKeySettingViewModel3, str4, 46);
        this.A01 = CDw(new AGI((Object) this, 13), new Object());
        Bundle A096 = AnonymousClass3MY.A09(this);
        if (A096 != null) {
            str3 = AnonymousClass8BR.A0y(A096);
        } else {
            str3 = null;
        }
        this.A0B = str3;
        A03(this, (Integer) null, "custom_payment_method_settings", (String) null, 0);
    }

    public BrazilPixKeySettingActivity() {
        this(0);
    }
}
