package X;

import android.content.Context;
import com.whatsapp.TextData;

/* renamed from: X.6XY  reason: invalid class name */
public abstract class AnonymousClass6XY {
    public static final C110485fs A00(Context context, C36381nn r7, AnonymousClass210 r8) {
        String str;
        boolean A1Z = C72453Mb.A1Z(r8);
        String A17 = r8.A17();
        if (A17 != null) {
            str = AnonymousClass74F.A06(A17, A1Z ? 1 : 0, A17.length(), 10, 700);
        } else {
            str = "";
        }
        C110485fs r1 = new C110485fs(context);
        TextData textData = r8.A02;
        if (textData != null) {
            r1.setTextContentProperties(textData);
        }
        r1.A09 = r8;
        r1.A06 = r7;
        r1.A01 = null;
        r1.setTextContent(str.toString());
        return r1;
    }
}
