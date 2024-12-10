package X;

import androidx.window.extensions.layout.WindowLayoutComponent;

/* renamed from: X.Dms  reason: case insensitive filesystem */
public final class C27855Dms extends AnonymousClass11G implements C18090vk {
    public static final C27855Dms A00 = new C27855Dms();

    public C27855Dms() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        WindowLayoutComponent A002;
        Object obj;
        try {
            ClassLoader classLoader = EBP.class.getClassLoader();
            if (!(classLoader == null || (A002 = new CW5(new C24745CIh(classLoader), classLoader).A00()) == null)) {
                C24745CIh cIh = new C24745CIh(classLoader);
                int A003 = C25864CnX.A00();
                if (A003 >= 2) {
                    obj = new D7P(A002);
                } else if (A003 == 1) {
                    obj = new D7Q(cIh, A002);
                } else {
                    obj = new Object();
                }
                return (E7E) obj;
            }
        } catch (Throwable unused) {
            C25447Cfy cfy = C25447Cfy.A02;
        }
        return null;
    }
}
