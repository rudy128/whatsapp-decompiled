package com.whatsapp.group;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass3MY;
import X.AnonymousClass7AO;
import X.C000200d;
import X.C108085b6;
import X.C108955ca;
import X.C109005cf;
import X.C114635rQ;
import X.C1423279a;
import X.C60112nP;
import android.os.Bundle;

public class GroupAddBlacklistPickerActivity extends C114635rQ implements C108085b6 {
    public AnonymousClass00H A00;
    public boolean A01;
    public boolean A02;

    public void BEW() {
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            C114635rQ.A10(this, A0K, A0A, r1);
            this.A00 = C000200d.A00(r1.ABr);
        }
    }

    public GroupAddBlacklistPickerActivity(int i) {
        this.A02 = false;
        C1423279a.A00(this, 1);
    }

    public void BFp() {
        C114635rQ.A11(this);
        AnonymousClass7AO.A00(this, ((C60112nP) this.A00.get()).A01(this.A0S), 28);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = AnonymousClass3MY.A1a(getIntent(), "was_nobody");
    }

    public GroupAddBlacklistPickerActivity() {
        this(0);
    }
}
