package com.whatsapp.contact.picker;

import X.AnonymousClass1EC;
import X.AnonymousClass1M9;
import X.C107975av;
import X.C18070vi;
import X.C18600wl;
import X.C30391dr;
import X.C30451dy;

public final class DeviceContactsLoader implements C107975av {
    public final AnonymousClass1M9 A00;

    public DeviceContactsLoader(AnonymousClass1M9 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public Object Bhk(AnonymousClass1EC r3, C30391dr r4, C18600wl r5) {
        return C30451dy.A00(r4, r5, new DeviceContactsLoader$loadContacts$2(this, (C30391dr) null));
    }

    public String BTj() {
        return "com.whatsapp.contact.picker.DeviceContactsLoader";
    }
}
