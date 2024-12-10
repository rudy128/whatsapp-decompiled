package X;

import java.util.Locale;

/* renamed from: X.2Cl  reason: invalid class name and case insensitive filesystem */
public class C45992Cl extends C60192nY {
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;
    public final C19830z4 A02;

    public AnonymousClass8q9 A0K() {
        C17960vV.A0D(!this.A00.A0N());
        Locale locale = Locale.getDefault();
        String[] strArr = AnonymousClass1X0.A04;
        String languageTag = locale.toLanguageTag();
        long A012 = AnonymousClass11P.A01(this.A01);
        C18070vi.A0d(languageTag, 1);
        return new AnonymousClass8q9((C19999A2n) null, (String) null, languageTag, A012);
    }

    public C45992Cl(AnonymousClass11S r1, AnonymousClass11P r2, C19830z4 r3, C26331Rs r4) {
        super(r4);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
