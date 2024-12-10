package X;

/* renamed from: X.9oH  reason: invalid class name and case insensitive filesystem */
public final class C192369oH {
    public final C19830z4 A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;

    public final int A00() {
        AnonymousClass1NP A0A = AnonymousClass8BS.A0A(this.A02);
        int i = A0A.A07().getInt("backup_current_banner_type", 0);
        if (i == 0) {
            return 0;
        }
        if (!A0A.A07().getBoolean("backup_current_banner_shown", false) || !A0A.A0R(AnonymousClass001.A1I("backup_storage_banner_shown_timestamp:", AnonymousClass000.A10(), i), 259200000)) {
            return i;
        }
        return 0;
    }

    public final void A01(int i) {
        AnonymousClass1NP A0A = AnonymousClass8BS.A0A(this.A02);
        if (i != 0) {
            if (i != 1) {
                if (i != 4) {
                    if (!C18020vd.A05(C18040vf.A02, this.A01, 9539)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            int i2 = 60;
            if (i != 1) {
                if (i == 2) {
                    i2 = 30;
                } else if (i != 3) {
                    i2 = C18020vd.A00(C18040vf.A02, this.A01, 9001);
                }
            }
            if (A0A.A0R(AnonymousClass001.A1I("backup_storage_banner_shown_timestamp:", AnonymousClass000.A10(), i), ((long) i2) * 86400000)) {
                A0A.A0C(i);
            }
        }
    }

    public C192369oH(C19830z4 r1, C18030ve r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
