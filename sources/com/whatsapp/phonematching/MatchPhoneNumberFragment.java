package com.whatsapp.phonematching;

import X.AnonymousClass11S;
import X.AnonymousClass1FY;
import X.AnonymousClass1L9;
import X.AnonymousClass3NT;
import X.C108755cF;
import X.C17960vV;
import X.C18070vi;
import X.C85034Lv;
import android.content.Context;
import android.os.Bundle;

public final class MatchPhoneNumberFragment extends Hilt_MatchPhoneNumberFragment {
    public AnonymousClass11S A00;
    public AnonymousClass1FY A01;
    public AnonymousClass3NT A02;
    public final C85034Lv A03 = new C85034Lv(this);

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        AnonymousClass1FY r0 = (AnonymousClass1FY) AnonymousClass1L9.A01(context, AnonymousClass1FY.class);
        this.A01 = r0;
        if (r0 != null) {
            C17960vV.A0F(r0 instanceof C108755cF, "activity needs to implement PhoneNumberMatchingCallback");
            AnonymousClass1FY r2 = this.A01;
            if (r2 != null) {
                this.A02 = new AnonymousClass3NT(r2, (C108755cF) r2);
                return;
            }
        }
        C18070vi.A11("activity");
        throw null;
    }

    public void A1r() {
        AnonymousClass3NT r4 = this.A02;
        if (r4 != null) {
            C18070vi.A0d(this.A03, 0);
            r4.A00.CQE();
            AnonymousClass3NT r1 = this.A02;
            if (r1 != null) {
                r1.removeMessages(4);
                this.A0B = null;
                super.A1r();
                return;
            }
        }
        C18070vi.A11("handler");
        throw null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        AnonymousClass3NT r2 = this.A02;
        if (r2 == null) {
            C18070vi.A11("handler");
            throw null;
        }
        C85034Lv r1 = this.A03;
        C18070vi.A0d(r1, 0);
        r2.A00.CE1(r1);
        this.A0B = this;
    }
}
