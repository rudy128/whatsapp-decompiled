package X;

import android.os.Build;

/* renamed from: X.1DD  reason: invalid class name */
public final class AnonymousClass1DD implements AnonymousClass1DC {
    public final AnonymousClass11S A00;
    public final C19830z4 A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;
    public final C18100vl A04 = AnonymousClass1DF.A00(AnonymousClass00R.A01, new AnonymousClass1DE(this));
    public final C18100vl A05 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass1DH(this));

    public AnonymousClass1DD(AnonymousClass11S r3, C19830z4 r4, C18030ve r5, AnonymousClass00H r6) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r4, 4);
        this.A02 = r5;
        this.A00 = r3;
        this.A03 = r6;
        this.A01 = r4;
    }

    public boolean BcY() {
        return ((Boolean) this.A04.getValue()).booleanValue();
    }

    public boolean BeD() {
        if (C18020vd.A00(C18040vf.A02, this.A02, 6598) <= 0 || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return true;
    }

    public boolean Bfb() {
        if (C18020vd.A00(C18040vf.A02, this.A02, 3510) < 1) {
            return false;
        }
        return true;
    }

    public boolean BgK() {
        if (C18020vd.A00(C18040vf.A02, this.A02, 3171) < 1) {
            return false;
        }
        return true;
    }
}
