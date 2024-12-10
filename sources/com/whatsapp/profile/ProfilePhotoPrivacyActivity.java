package com.whatsapp.profile;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass3gA;
import X.C000200d;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C26261Rl;
import X.C72473Md;
import X.C72483Me;
import X.C91024f1;
import android.os.Bundle;
import android.view.View;

public class ProfilePhotoPrivacyActivity extends AnonymousClass3gA {
    public View A00;
    public SettingsRowPhotoOrInitialText A01;
    public AnonymousClass00H A02;
    public boolean A03;

    public ProfilePhotoPrivacyActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            AnonymousClass3gA.A0V(A0L, r1, this);
            this.A02 = C000200d.A00(A0L.A72);
        }
    }

    public void A4d() {
        View view;
        int i;
        super.A4d();
        C26261Rl r1 = this.A05;
        if (r1 != null) {
            int A002 = r1.A00("profile");
            if (C18020vd.A05(C18040vf.A02, this.A0E, 6149)) {
                SettingsRowPhotoOrInitialText settingsRowPhotoOrInitialText = this.A01;
                float f = 1.0f;
                if (A002 == 0) {
                    f = 0.5f;
                }
                settingsRowPhotoOrInitialText.setAlpha(f);
                view = this.A00;
                i = 0;
            } else {
                view = this.A00;
                i = 8;
            }
            view.setVisibility(i);
            return;
        }
        C18070vi.A11("privacySettingManager");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(2131427782);
        this.A00 = findViewById;
        SettingsRowPhotoOrInitialText settingsRowPhotoOrInitialText = (SettingsRowPhotoOrInitialText) findViewById.findViewById(2131427781);
        this.A01 = settingsRowPhotoOrInitialText;
        settingsRowPhotoOrInitialText.setName(this.A02.A0D());
    }

    public ProfilePhotoPrivacyActivity(int i) {
        this.A03 = false;
        C91024f1.A00(this, 34);
    }
}
