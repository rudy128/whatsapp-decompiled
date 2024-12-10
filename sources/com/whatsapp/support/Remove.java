package com.whatsapp.support;

import X.AGE;
import X.AnonymousClass009;
import X.AnonymousClass040;
import X.AnonymousClass1FL;
import X.AnonymousClass8BT;
import X.AnonymousClass8BW;
import X.C006002q;
import X.C006302u;
import X.C17880vN;
import X.C24051Ir;
import X.C72453Mb;
import android.content.Intent;
import android.os.Bundle;

public final class Remove extends AnonymousClass1FL implements AnonymousClass009 {
    public C006302u A00;
    public boolean A01;
    public final Object A02;
    public volatile C006002q A03;

    public final C006002q A2m() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new C006002q(this);
                }
            }
        }
        return this.A03;
    }

    public Remove(int i) {
        this.A02 = C17880vN.A0p();
        this.A01 = false;
        AGE.A00(this, 38);
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A00(this, super.BQR());
    }

    public final Object generatedComponent() {
        return A2m().generatedComponent();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof AnonymousClass009) {
            C006302u A002 = A2m().A00();
            this.A00 = A002;
            AnonymousClass8BW.A14(this, A002);
        }
        setTitle(2131896933);
        Intent A0A = C17880vN.A0A();
        A0A.putExtra("is_removed", true);
        C72453Mb.A16(this, A0A);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass8BT.A1L(this.A00);
    }

    public Remove() {
        this(0);
    }
}
