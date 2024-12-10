package X;

import java.util.List;

/* renamed from: X.Ccw  reason: case insensitive filesystem */
public abstract class C25294Ccw {
    public static final String A00(CharSequence charSequence, List list) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("");
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            i++;
            if (i > 1) {
                A10.append(charSequence);
            }
            if (obj != null && !(obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    A10.append(((Character) obj).charValue());
                } else {
                    obj = String.valueOf(obj);
                }
            }
            A10.append((CharSequence) obj);
        }
        A10.append("");
        return A10.toString();
    }
}
