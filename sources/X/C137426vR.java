package X;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.6vR  reason: invalid class name and case insensitive filesystem */
public abstract class C137426vR {
    public static final String A00(AnonymousClass737[] r5) {
        C18070vi.A0d(r5, 0);
        ArrayList A0z = C17880vN.A0z(r3);
        for (AnonymousClass737 valueOf : r5) {
            A0z.add(String.valueOf(valueOf));
        }
        C18070vi.A0d(A0z, 0);
        String join = TextUtils.join(" ", A0z);
        C18070vi.A0X(join);
        return join;
    }

    public static final AnonymousClass737[] A01(String str) {
        String[] split;
        if (str == null || (split = TextUtils.split(str, " ")) == null) {
            return null;
        }
        ArrayList A0z = C17880vN.A0z(r5);
        for (String str2 : split) {
            C18070vi.A0b(str2);
            A0z.add(new AnonymousClass737(str2));
        }
        return (AnonymousClass737[]) A0z.toArray(new AnonymousClass737[0]);
    }
}
