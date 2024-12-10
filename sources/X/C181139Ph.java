package X;

import java.text.Collator;

/* renamed from: X.9Ph  reason: invalid class name and case insensitive filesystem */
public abstract class C181139Ph {
    public static final boolean A00(C18000vb r5, String str, String str2) {
        Collator instance = Collator.getInstance(r5.A0N());
        C18070vi.A0X(instance);
        instance.setStrength(0);
        int length = str2.length();
        if (length > str.length() || instance.compare(str2, C108955ca.A0q(0, length, str)) != 0) {
            return false;
        }
        return true;
    }
}
