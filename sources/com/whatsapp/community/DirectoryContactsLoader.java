package com.whatsapp.community;

import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1CJ;
import X.AnonymousClass1EC;
import X.AnonymousClass1M9;
import X.C107975av;
import X.C18070vi;
import X.C18600wl;
import X.C25511Om;
import X.C30391dr;
import X.C30451dy;
import X.C32101gd;

public final class DirectoryContactsLoader implements C107975av {
    public final AnonymousClass11S A00;
    public final C32101gd A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass1CJ A03;
    public final AnonymousClass00H A04;

    public String BTj() {
        return "com.whatsapp.community.DirectoryContactsLoader";
    }

    public Object Bhk(AnonymousClass1EC r3, C30391dr r4, C18600wl r5) {
        if (r3 == null) {
            return C25511Om.A00;
        }
        return C30451dy.A00(r4, r5, new DirectoryContactsLoader$loadContacts$2(this, r3, (C30391dr) null));
    }

    public DirectoryContactsLoader(AnonymousClass11S r1, C32101gd r2, AnonymousClass1M9 r3, AnonymousClass1CJ r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r4, r3, r2, r5);
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
    }
}
