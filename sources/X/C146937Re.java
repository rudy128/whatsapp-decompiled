package X;

import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.7Re  reason: invalid class name and case insensitive filesystem */
public final class C146937Re implements Comparator {
    public final C18100vl A00;
    public final C18100vl A01;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        C53922dJ r7 = (C53922dJ) obj;
        C53922dJ r8 = (C53922dJ) obj2;
        C18070vi.A0h(r7, r8);
        C18100vl r4 = this.A01;
        List A11 = AnonymousClass3MW.A11(r4);
        if (A11 != null) {
            i = A11.indexOf(r7.A00);
        } else {
            i = -1;
        }
        List A112 = AnonymousClass3MW.A11(r4);
        if (A112 != null) {
            i2 = A112.indexOf(r8.A00);
        } else {
            i2 = -1;
        }
        if (i == -1) {
            if (i2 != -1) {
                return 1;
            }
            Collator collator = (Collator) AnonymousClass3MX.A14(this.A00);
            String str = r7.A01;
            C18070vi.A0W(str);
            if (C108975cc.A1N("ال", str)) {
                str = C108955ca.A0z(str, 2);
            }
            String str2 = r8.A01;
            C18070vi.A0W(str2);
            if (C108975cc.A1N("ال", str2)) {
                str2 = C108955ca.A0z(str2, 2);
            }
            return collator.compare(str, str2);
        } else if (i2 != -1) {
            return i - i2;
        } else {
            return -1;
        }
    }

    public C146937Re(Locale locale) {
        this.A00 = AnonymousClass1DF.A01(new AnonymousClass7S3(locale, 11));
        this.A01 = AnonymousClass1DF.A01(new AnonymousClass7S3(locale, 12));
    }
}
