package com.whatsapp.settings;

import X.AGE;
import X.AnonymousClass10E;
import X.AnonymousClass3Ma;
import X.C137116uw;
import X.C166668dO;
import X.C34001jj;
import android.os.Bundle;
import com.whatsapp.WaPreferenceFragment;

public class SettingsChatHistory extends C166668dO {
    public boolean A00;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E r1 = C137116uw.A00(this).AAQ;
            this.A05 = AnonymousClass10E.AL1(r1);
            this.A01 = AnonymousClass10E.A12(r1);
        }
    }

    public SettingsChatHistory(int i) {
        this.A00 = false;
        AGE.A00(this, 34);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131626519);
        if (bundle == null) {
            this.A0A = new Hilt_SettingsChatHistoryFragment();
            C34001jj A0H = AnonymousClass3Ma.A0H(this);
            A0H.A0D(this.A0A, "preferenceFragment", 2131434018);
            A0H.A00(false);
            return;
        }
        setTitle(bundle.getCharSequence("settingsChatHistoryTitle"));
        this.A0A = (WaPreferenceFragment) getSupportFragmentManager().A0Q("preferenceFragment");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("settingsChatHistoryTitle", getTitle());
    }

    public SettingsChatHistory() {
        this(0);
    }
}
