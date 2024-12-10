package com.whatsapp.contact.picker;

import X.AnonymousClass00H;
import X.AnonymousClass1EC;
import X.AnonymousClass1M9;
import X.C107975av;
import X.C18070vi;
import X.C18600wl;
import X.C30391dr;
import X.C30451dy;

public final class RecentlyAcceptedInviteContactsLoader implements C107975av {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass00H A01;

    public Object Bhk(AnonymousClass1EC r3, C30391dr r4, C18600wl r5) {
        return C30451dy.A00(r4, r5, new RecentlyAcceptedInviteContactsLoader$loadContacts$2(this, (C30391dr) null));
    }

    public RecentlyAcceptedInviteContactsLoader(AnonymousClass1M9 r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public String BTj() {
        return "com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader";
    }
}
