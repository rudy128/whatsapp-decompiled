package com.whatsapp;

import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.C003401n;
import X.C166668dO;
import X.C195659th;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.preference.PreferenceScreen;

public abstract class WaPreferenceFragment extends Hilt_WaPreferenceFragment {
    public C166668dO A00;

    public void A27(int i) {
        C195659th r2 = this.A01;
        if (r2 != null) {
            PreferenceScreen A02 = r2.A02(A1n(), this.A01.A06, i);
            C195659th r1 = this.A01;
            PreferenceScreen preferenceScreen = r1.A06;
            if (A02 != preferenceScreen) {
                if (preferenceScreen != null) {
                    preferenceScreen.A08();
                }
                r1.A06 = A02;
                this.A03 = true;
                if (this.A04) {
                    Handler handler = this.A00;
                    if (!handler.hasMessages(1)) {
                        AnonymousClass8BT.A17(handler, 1);
                    }
                }
            }
            C166668dO r0 = this.A00;
            if (r0 != null) {
                CharSequence title = r0.getTitle();
                C003401n supportActionBar = r0.getSupportActionBar();
                if (!TextUtils.isEmpty(title) && supportActionBar != null) {
                    supportActionBar.A0S(title);
                    return;
                }
                return;
            }
            return;
        }
        throw AnonymousClass8BR.A0w("This should be called after super.onCreate.");
    }

    public void A1K() {
        super.A1K();
        this.A00 = null;
    }

    public void A1x(Context context) {
        super.A1x(context);
        this.A00 = (C166668dO) A1B();
    }
}
