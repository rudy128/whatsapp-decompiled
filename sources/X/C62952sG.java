package X;

import android.content.ContentUris;
import android.net.Uri;

/* renamed from: X.2sG  reason: invalid class name and case insensitive filesystem */
public abstract class C62952sG {
    public static final Uri A00;
    public static final String A01;

    public static final Uri A00(AnonymousClass1E7 r3) {
        Uri withAppendedId = ContentUris.withAppendedId(A00, r3.A0J());
        C18070vi.A0X(withAppendedId);
        return withAppendedId;
    }

    public static final boolean A01(Uri uri) {
        if (uri == null || !C18070vi.A18(uri.getScheme(), "content") || !C18070vi.A18(uri.getAuthority(), A01)) {
            return false;
        }
        return true;
    }

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("com.whatsapp");
        String A0y = AnonymousClass000.A0y(".provider.contact", A10);
        A01 = A0y;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("content://");
        A102.append(A0y);
        Uri parse = Uri.parse(AnonymousClass000.A0y("/contacts", A102));
        C18070vi.A0X(parse);
        A00 = parse;
    }
}
