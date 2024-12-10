package X;

import android.net.Uri;

/* renamed from: X.CHi  reason: case insensitive filesystem */
public abstract class C24721CHi {
    public static final Uri A00 = C24732CHu.A00;
    public static final Uri A01 = C24732CHu.A01;
    public static final E26 A02;

    static {
        E26 e26;
        synchronized (C24453C4s.class) {
            e26 = C24453C4s.A00;
            if (e26 == null) {
                e26 = new C26938DJt();
                if (C24453C4s.A00 == null) {
                    C24453C4s.A00 = e26;
                } else {
                    throw AnonymousClass000.A0n("init() already called");
                }
            }
        }
        A02 = e26;
    }
}
