package X;

/* renamed from: X.DAw  reason: case insensitive filesystem */
public final class C26722DAw implements E94 {
    public final C18100vl A00;
    public final C25761ClW A01;
    public final C26721DAv A02;

    public C26722DAw(C25761ClW clW, C26721DAv dAv) {
        C18070vi.A0d(clW, 2);
        this.A02 = dAv;
        this.A01 = clW;
        this.A00 = AnonymousClass1DF.A01(new C28237Dtx(clW, 1));
    }

    public double BQo(Integer num, double d) {
        return this.A02.BQo(num, d);
    }

    public void BZm(String str) {
        C18070vi.A0b(str);
    }

    public boolean BNa(C24326BzN bzN, boolean z) {
        if (bzN != null) {
            switch (bzN.ordinal()) {
                case 62:
                case 151:
                case 152:
                case 153:
                case 159:
                    if (C72453Mb.A1a(this.A00)) {
                        return true;
                    }
                    return z;
                case 145:
                case 149:
                    if (C72453Mb.A1a(this.A00)) {
                        return false;
                    }
                    return z;
            }
        }
        return this.A02.BNa(bzN, z);
    }

    public boolean BNb(C24326BzN bzN, boolean z) {
        if (bzN != null) {
            int ordinal = bzN.ordinal();
            if (ordinal == 62 || ordinal == 151 || ordinal == 153 || ordinal == 152 || ordinal == 159) {
                if (C72453Mb.A1a(this.A00)) {
                    return true;
                }
                return z;
            } else if (ordinal == 145) {
                if (C72453Mb.A1a(this.A00)) {
                    return false;
                }
                return z;
            }
        }
        return this.A02.BNa(bzN, z);
    }
}
