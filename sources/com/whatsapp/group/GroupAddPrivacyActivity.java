package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass3gA;
import X.C000200d;
import X.C108085b6;
import X.C18070vi;
import X.C26261Rl;
import X.C63682tW;
import X.C72473Md;
import X.C72483Me;
import X.C91014f0;
import android.os.Bundle;
import android.widget.RadioButton;

public class GroupAddPrivacyActivity extends AnonymousClass3gA implements C108085b6 {
    public int A00;
    public AnonymousClass00H A01;
    public boolean A02;
    public boolean A03;

    public GroupAddPrivacyActivity() {
        this(0);
        this.A02 = false;
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
            this.A01 = C000200d.A00(A0L.A72);
        }
    }

    public void BFp() {
        this.A05.A02("groupadd", C63682tW.A02("groupadd", this.A00));
        this.A02 = false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C26261Rl r1 = this.A05;
        if (r1 != null) {
            this.A02 = AnonymousClass000.A1T(r1.A00("groupadd"), 2);
            this.A03.setEnabled(false);
            boolean z = this.A02;
            RadioButton radioButton = this.A03;
            if (z) {
                radioButton.setVisibility(0);
            } else {
                radioButton.setVisibility(8);
            }
        } else {
            C18070vi.A11("privacySettingManager");
            throw null;
        }
    }

    public void BEW() {
        A4d();
    }

    public GroupAddPrivacyActivity(int i) {
        this.A03 = false;
        C91014f0.A00(this, 14);
    }
}
