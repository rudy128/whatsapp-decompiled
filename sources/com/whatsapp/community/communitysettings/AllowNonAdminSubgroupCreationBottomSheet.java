package com.whatsapp.community.communitysettings;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11C;
import X.AnonymousClass129;
import X.AnonymousClass1DF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass5FE;
import X.C104135Mz;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C36401np;
import X.C72473Md;
import X.C90904ep;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel;
import com.whatsapp.radio.RadioButtonWithSubtitle;

public final class AllowNonAdminSubgroupCreationBottomSheet extends Hilt_AllowNonAdminSubgroupCreationBottomSheet {
    public RadioGroup A00;
    public TextEmojiLabel A01;
    public AnonymousClass11C A02;
    public C18030ve A03;
    public RadioButtonWithSubtitle A04;
    public RadioButtonWithSubtitle A05;
    public AnonymousClass129 A06;
    public C36401np A07;
    public AnonymousClass00H A08;
    public boolean A09;
    public final C18100vl A0A = AnonymousClass1DF.A01(new AnonymousClass5FE(this));
    public final C18100vl A0B = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C104135Mz(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131624188, viewGroup, false);
        this.A04 = (RadioButtonWithSubtitle) inflate.findViewById(2131433174);
        this.A05 = (RadioButtonWithSubtitle) inflate.findViewById(2131433175);
        this.A01 = AnonymousClass3MX.A0W(inflate, 2131433176);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131434314);
        radioGroup.setOnCheckedChangeListener(new C90904ep(radioGroup, this, 1));
        this.A00 = radioGroup;
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        TextEmojiLabel textEmojiLabel = this.A01;
        if (textEmojiLabel != null) {
            C36401np r5 = this.A07;
            if (r5 != null) {
                Context context = textEmojiLabel.getContext();
                Object[] A1a = AnonymousClass3MW.A1a();
                AnonymousClass129 r1 = this.A06;
                if (r1 != null) {
                    textEmojiLabel.setText(r5.A03(context, AnonymousClass3MX.A16(this, r1.A03("205306122327447"), A1a, 0, 2131888583)));
                    C72473Md.A1D(textEmojiLabel);
                    C72473Md.A1C(textEmojiLabel);
                } else {
                    str = "faqLinkFactory";
                }
            } else {
                str = "linkifier";
            }
            C18070vi.A11(str);
            throw null;
        }
        RadioButtonWithSubtitle radioButtonWithSubtitle = this.A04;
        if (radioButtonWithSubtitle != null) {
            radioButtonWithSubtitle.setSubTitle(A1H(2131888579));
        }
        AnonymousClass3MY.A1K(A1G(), ((CommunitySettingsViewModel) this.A0A.getValue()).A07, AnonymousClass3MW.A16(this, 24), 49);
    }

    public void A1r() {
        super.A1r();
        RadioGroup radioGroup = this.A00;
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        }
        this.A00 = null;
        this.A04 = null;
        this.A05 = null;
        this.A01 = null;
    }
}
