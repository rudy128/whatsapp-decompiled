package com.whatsapp.payments.ui.viewmodel;

import X.A28;
import X.A7B;
import X.AEC;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1OZ;
import X.AnonymousClass3MW;
import X.AnonymousClass8BS;
import X.AnonymousClass8BW;
import X.AnonymousClass9F2;
import X.C1418477e;
import X.C175648z3;
import X.C175978za;
import X.C18070vi;
import X.C183439Yg;
import X.C196259ui;
import X.C20008A2y;
import X.C29621ca;
import com.whatsapp.util.Log;

public final class IndiaUpiNumberSettingsViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00;
    public final C20008A2y A01;

    public IndiaUpiNumberSettingsViewModel(C20008A2y a2y) {
        C18070vi.A0d(a2y, 1);
        this.A01 = a2y;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A00 = A0L;
        A0L.A0F(new A28((A7B) null, (A7B) null, false, false, false, false));
    }

    public final void A0T(C1418477e r16, C1418477e r17, AEC aec, C175648z3 r19, String str, String str2) {
        C175648z3 r0 = r19;
        C18070vi.A0d(r0, 0);
        AEC aec2 = aec;
        C1418477e r2 = r17;
        C18070vi.A0f(aec2, 1, r2);
        this.A00.A0F(new A28((A7B) null, (A7B) null, true, false, false, false));
        String A0h = AnonymousClass8BS.A0h(r2);
        C183439Yg r13 = new C183439Yg(this);
        C18070vi.A0d(A0h, 3);
        Log.i("PAY: updateAlias called");
        AnonymousClass1OZ r1 = r0.A02;
        String A0B = r1.A0B();
        AnonymousClass9F2 r3 = new AnonymousClass9F2(A0B, r0.A04.A01(), AnonymousClass8BS.A0h(aec2.A00), aec2.A01, AnonymousClass8BS.A0h(r16), str, A0h, aec2.A03, str2);
        C196259ui r12 = r0.A00;
        if (r12 != null) {
            r12.A02("update-alias");
        }
        AnonymousClass8BW.A1B(r1, new C175978za(r0.A00, r0.A01, r0.A03, r12, r13, r3), (C29621ca) r3.A02, A0B);
    }
}
