package com.whatsapp.settings;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass1DF;
import X.AnonymousClass1Nb;
import X.AnonymousClass201;
import X.AnonymousClass5P8;
import X.AnonymousClass5PX;
import X.C18070vi;
import X.C18100vl;
import X.C88414Zp;
import X.C90904ep;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.radio.RadioButtonWithSubtitle;

public final class ActivityLevelNotificationSettingBottomSheet extends Hilt_ActivityLevelNotificationSettingBottomSheet {
    public RadioButtonWithSubtitle A00;
    public RadioButtonWithSubtitle A01;
    public AnonymousClass1Nb A02;
    public AnonymousClass10I A03;
    public AnonymousClass00H A04;
    public RadioGroup A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final C18100vl A08 = C88414Zp.A03(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, -1);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131624068, viewGroup, false);
        this.A00 = (RadioButtonWithSubtitle) inflate.findViewById(2131434312);
        this.A01 = (RadioButtonWithSubtitle) inflate.findViewById(2131434313);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(2131434314);
        AnonymousClass201[] r2 = new AnonymousClass201[2];
        r2[0] = AnonymousClass201.RELEVANT_MESSAGES;
        if (C18070vi.A0O(AnonymousClass201.DEFAULT_RELEVANT_MESSAGES, r2, 1).contains(this.A06.getValue())) {
            radioGroup.check(2131434313);
        } else {
            radioGroup.check(2131434312);
        }
        radioGroup.setOnCheckedChangeListener(new C90904ep(radioGroup, this, 3));
        this.A05 = radioGroup;
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        RadioButtonWithSubtitle radioButtonWithSubtitle = this.A00;
        if (radioButtonWithSubtitle != null) {
            radioButtonWithSubtitle.setTitle(A1H(2131899557));
            radioButtonWithSubtitle.setSubTitle(A1H(2131899555));
        }
        RadioButtonWithSubtitle radioButtonWithSubtitle2 = this.A01;
        if (radioButtonWithSubtitle2 != null) {
            radioButtonWithSubtitle2.setTitle(A1H(2131899558));
            radioButtonWithSubtitle2.setSubTitle(A1H(2131899556));
        }
    }

    public ActivityLevelNotificationSettingBottomSheet() {
        Integer num = AnonymousClass00R.A0C;
        this.A07 = AnonymousClass1DF.A00(num, new AnonymousClass5P8(this));
        this.A06 = AnonymousClass1DF.A00(num, new AnonymousClass5PX(this, AnonymousClass201.DEFAULT_ALL_MESSAGES));
    }

    public void A1r() {
        super.A1r();
        RadioGroup radioGroup = this.A05;
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        }
        this.A05 = null;
        this.A00 = null;
        this.A01 = null;
    }
}
