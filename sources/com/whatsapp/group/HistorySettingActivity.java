package com.whatsapp.group;

import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass129;
import X.AnonymousClass1DF;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1M9;
import X.AnonymousClass1OR;
import X.AnonymousClass1OX;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C102815Hx;
import X.C104335Nt;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C30451dy;
import X.C36401np;
import X.C41561wd;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C84004Hm;
import X.C90044dR;
import X.C91014f0;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.toggle.WDSSwitch;

public final class HistorySettingActivity extends AnonymousClass1FY {
    public SwitchCompat A00;
    public AnonymousClass1M9 A01;
    public AnonymousClass129 A02;
    public C36401np A03;
    public boolean A04;
    public final C18100vl A05;
    public final C18100vl A06;

    public HistorySettingActivity() {
        this(0);
        this.A05 = AnonymousClass1DF.A00(AnonymousClass00R.A01, new C104335Nt(this));
        this.A06 = AnonymousClass1DF.A01(new C102815Hx(this));
    }

    public void onDestroy() {
        this.A00 = null;
        super.onDestroy();
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A01 = AnonymousClass10E.A4z(A0L);
            this.A02 = AnonymousClass3Ma.A0t(A0L);
            this.A03 = AnonymousClass3MY.A0e(r1);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131625546);
        Toolbar A0T = C72463Mc.A0T(this);
        C18000vb r1 = this.A00;
        C18070vi.A0W(r1);
        C84004Hm.A00(this, A0T, r1, C18070vi.A0F(this, 2131894943));
        getWindow().setNavigationBarColor(AnonymousClass3MZ.A02(this.A00.getContext(), this.A00.getContext(), 2130970830, 2131102245));
        AnonymousClass3MX.A0L(this, 2131436208).setText(2131891193);
        WaTextView waTextView = (WaTextView) findViewById(2131435405);
        C36401np r5 = this.A03;
        if (r5 != null) {
            Context context = waTextView.getContext();
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass129 r12 = this.A02;
            if (r12 != null) {
                waTextView.setText(r5.A03(context, C17880vN.A0q(this, r12.A03("330159992681779").toString(), A1a, 0, 2131891235)));
                C72473Md.A1D(waTextView);
                C72473Md.A1C(waTextView);
                ViewGroup A0F = AnonymousClass3MX.A0F(this, 2131435959);
                Property property = SwitchCompat.A0f;
                WDSSwitch wDSSwitch = new WDSSwitch(AnonymousClass3MY.A04(this.A00), (AttributeSet) null, 0, 6, (AnonymousClass1Y1) null);
                wDSSwitch.setId(2131431469);
                this.A00 = wDSSwitch;
                A0F.addView(wDSSwitch);
                HistorySettingViewModel historySettingViewModel = (HistorySettingViewModel) this.A06.getValue();
                AnonymousClass1EC A0p = AnonymousClass3MX.A0p(this.A05);
                C18070vi.A0d(A0p, 0);
                historySettingViewModel.A01 = A0p;
                AnonymousClass1OX A002 = C41561wd.A00(historySettingViewModel);
                HistorySettingViewModel$updateChecked$1 historySettingViewModel$updateChecked$1 = new HistorySettingViewModel$updateChecked$1(historySettingViewModel, (C30391dr) null);
                AnonymousClass1OR r3 = AnonymousClass1OR.A00;
                Integer A0w = AnonymousClass3MW.A0w(r3, historySettingViewModel$updateChecked$1, A002);
                AnonymousClass3MX.A1Q(new HistorySettingViewModel$updateEnabled$1(historySettingViewModel, (C30391dr) null), C41561wd.A00(historySettingViewModel));
                C30451dy.A02(A0w, r3, new HistorySettingActivity$bindSwitch$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
                SwitchCompat switchCompat = this.A00;
                if (switchCompat != null) {
                    C90044dR.A00(switchCompat, this, 13);
                }
                C30451dy.A02(A0w, r3, new HistorySettingActivity$bindError$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
                return;
            }
            str = "faqLinkFactory";
        } else {
            str = "linkifier";
        }
        C18070vi.A11(str);
        throw null;
    }

    public HistorySettingActivity(int i) {
        this.A04 = false;
        C91014f0.A00(this, 21);
    }
}
