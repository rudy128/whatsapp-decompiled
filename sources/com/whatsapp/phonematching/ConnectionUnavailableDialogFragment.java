package com.whatsapp.phonematching;

import X.A98;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11E;
import X.AnonymousClass1FL;
import X.AnonymousClass1GP;
import X.AnonymousClass1LU;
import X.AnonymousClass1MB;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass8BV;
import X.C132216mP;
import X.C17880vN;
import X.C18070vi;
import X.C20153A9p;
import X.C20155A9r;
import X.C219217x;
import X.C34001jj;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;

public final class ConnectionUnavailableDialogFragment extends Hilt_ConnectionUnavailableDialogFragment {
    public C132216mP A00;
    public AnonymousClass11E A01;
    public AnonymousClass11C A02;
    public C219217x A03;
    public AnonymousClass1MB A04;
    public AnonymousClass1LU A05;
    public A98 A06;
    public AnonymousClass10I A07;

    public void A2C(AnonymousClass1GP r2, String str) {
        C18070vi.A0d(r2, 0);
        AnonymousClass8BV.A18(new C34001jj(r2), this, str);
    }

    public Dialog A27(Bundle bundle) {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            C73203Rj A002 = AnonymousClass4a6.A00(A1B);
            A002.A0D(2131895032);
            C20153A9p.A00(A002, A1B, this, 22, 2131888273);
            C20155A9r.A00(A002, this, 42, 2131898766);
            return AnonymousClass3MY.A0L(A002);
        }
        throw C17880vN.A0g();
    }
}
