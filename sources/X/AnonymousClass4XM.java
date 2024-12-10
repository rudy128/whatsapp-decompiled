package X;

import android.content.res.Resources;

/* renamed from: X.4XM  reason: invalid class name */
public final class AnonymousClass4XM {
    public final AnonymousClass118 A00;
    public final C18000vb A01;
    public final AnonymousClass4ZS A02;
    public final AnonymousClass4H9 A03 = ((AnonymousClass4H9) C221618v.A01(16485));

    public static final int A00(AnonymousClass4XM r1, int i) {
        String language = r1.A01.A0N().getLanguage();
        C18070vi.A0X(language);
        if (language.equals("") || i < 1000) {
            return i;
        }
        return (i / 1000) * 1000;
    }

    public final String A01(int i) {
        AnonymousClass4ZS r3 = this.A02;
        Integer valueOf = Integer.valueOf(i);
        Resources A05 = AnonymousClass3MW.A05(this.A00);
        C18070vi.A0X(A05);
        return r3.A02(A05, valueOf, false);
    }

    public AnonymousClass4XM(AnonymousClass118 r2, C18000vb r3, AnonymousClass4ZS r4) {
        C18070vi.A0o(r4, r3, r2);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }
}
