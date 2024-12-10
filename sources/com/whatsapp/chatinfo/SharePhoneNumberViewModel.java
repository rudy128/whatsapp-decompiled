package com.whatsapp.chatinfo;

import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass129;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass4TD;
import X.C18070vi;
import X.C33251iW;
import android.net.Uri;

public final class SharePhoneNumberViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00;
    public final C33251iW A01;
    public final AnonymousClass00H A02;

    public SharePhoneNumberViewModel(AnonymousClass11S r5, C33251iW r6, AnonymousClass129 r7, AnonymousClass00H r8) {
        C18070vi.A0s(r5, r7, r6, r8);
        this.A01 = r6;
        this.A02 = r8;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A00 = A0L;
        String A0E = r5.A0E();
        Uri A03 = r7.A03("626403979060997");
        C18070vi.A0X(A03);
        A0L.A0E(new AnonymousClass4TD(A0E, C18070vi.A0H(A03)));
    }
}
