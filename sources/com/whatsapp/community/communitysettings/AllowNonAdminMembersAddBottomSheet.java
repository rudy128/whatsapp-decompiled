package com.whatsapp.community.communitysettings;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass5FD;
import X.C104125My;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C90904ep;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.whatsapp.WaTextView;
import com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel;
import com.whatsapp.radio.RadioButtonWithSubtitle;

public final class AllowNonAdminMembersAddBottomSheet extends Hilt_AllowNonAdminMembersAddBottomSheet {
    public RadioGroup A00;
    public C18030ve A01;
    public RadioButtonWithSubtitle A02;
    public RadioButtonWithSubtitle A03;
    public boolean A04;
    public WaTextView A05;
    public final C18100vl A06 = AnonymousClass1DF.A01(new AnonymousClass5FD(this));
    public final C18100vl A07 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C104125My(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131624187, viewGroup, false);
        WaTextView A0U = AnonymousClass3MW.A0U(inflate, 2131433173);
        C18030ve abProps = A0U.getAbProps();
        C18040vf r2 = C18040vf.A02;
        boolean A052 = C18020vd.A05(r2, abProps, 7608);
        int i2 = 2131888589;
        if (A052) {
            i2 = 2131888597;
        }
        A0U.setText(i2);
        this.A05 = A0U;
        RadioButtonWithSubtitle radioButtonWithSubtitle = (RadioButtonWithSubtitle) inflate.findViewById(2131433171);
        C18030ve r0 = this.A01;
        if (r0 != null) {
            if (C18020vd.A05(r2, r0, 7608)) {
                radioButtonWithSubtitle.setTitle(A1H(2131888595));
                i = 2131888596;
            } else {
                radioButtonWithSubtitle.setTitle(A1H(2131888585));
                i = 2131888586;
            }
            radioButtonWithSubtitle.setSubTitle(A1H(i));
            this.A02 = radioButtonWithSubtitle;
            RadioButtonWithSubtitle radioButtonWithSubtitle2 = (RadioButtonWithSubtitle) inflate.findViewById(2131433172);
            radioButtonWithSubtitle2.setTitle(A1H(2131888587));
            radioButtonWithSubtitle2.setSubTitle(A1H(2131888588));
            this.A03 = radioButtonWithSubtitle2;
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131427778);
            radioGroup.setOnCheckedChangeListener(new C90904ep(radioGroup, this, 0));
            this.A00 = radioGroup;
            return inflate;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass3MY.A1K(A1G(), ((CommunitySettingsViewModel) this.A06.getValue()).A04, AnonymousClass3MW.A16(this, 23), 48);
    }

    public void A1r() {
        super.A1r();
        RadioGroup radioGroup = this.A00;
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        }
        this.A00 = null;
        this.A02 = null;
        this.A03 = null;
    }
}
