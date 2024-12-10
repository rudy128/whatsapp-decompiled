package X;

import java.util.Collection;
import java.util.Locale;

/* renamed from: X.66R  reason: invalid class name */
public class AnonymousClass66R extends AnonymousClass6LK {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass66R(AnonymousClass66W r2, AnonymousClass66S r3, CharSequence charSequence, String str) {
        super(r3, charSequence, str);
        this.A02 = r3;
        this.A01 = r2;
    }

    public static final String A00(C18000vb r3, Locale locale) {
        String language;
        if (locale != null) {
            String country = locale.getCountry();
            if (country == null || country.length() == 0) {
                language = locale.getLanguage();
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(locale.getLanguage());
                A10.append('_');
                language = AnonymousClass000.A0y(locale.getCountry(), A10);
            }
            C18070vi.A0b(language);
            return language;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append(r3.A05());
        A102.append('_');
        return AnonymousClass000.A0y(r3.A04(), A102);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C19760yx r5 = (C19760yx) obj;
        if (r5 == null) {
            ((C133816pX) this.A01).A01((String) null, (Collection) null, true);
        } else {
            ((C133816pX) this.A01).A01((String) r5.A00, (Collection) r5.A01, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass66R(AnonymousClass66W r2, AnonymousClass66T r3, CharSequence charSequence, String str) {
        super(r3, charSequence, str);
        this.A02 = r3;
        this.A01 = r2;
    }
}
