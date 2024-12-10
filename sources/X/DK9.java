package X;

public final class DK9 implements E81 {
    public static final DK9 A00 = new Object();

    public final boolean CT4(Class cls) {
        return C23484Bho.class.isAssignableFrom(cls);
    }

    public final E29 CTG(Class cls) {
        IllegalStateException illegalStateException;
        Class<C23484Bho> cls2 = C23484Bho.class;
        if (!cls2.isAssignableFrom(cls)) {
            String A0l = BE7.A0l(cls);
            throw AnonymousClass000.A0k(BE9.A0o("Unsupported message type: ", A0l, A0l.length()));
        }
        try {
            Class<? extends U> asSubclass = cls.asSubclass(cls2);
            C23484Bho bho = (C23484Bho) C23484Bho.zzd.get(asSubclass);
            if (bho == null) {
                try {
                    BEA.A1C(asSubclass);
                    bho = (C23484Bho) C23484Bho.zzd.get(asSubclass);
                    if (bho == null) {
                        bho = (C23484Bho) ((C23484Bho) C26277CwW.A02(asSubclass)).A06(6);
                        if (bho != null) {
                            DK6.A08(asSubclass, bho);
                        } else {
                            illegalStateException = BE6.A0k();
                            throw illegalStateException;
                        }
                    }
                } catch (ClassNotFoundException e) {
                    illegalStateException = new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            return (E29) bho.A06(3);
        } catch (Exception e2) {
            String A0l2 = BE7.A0l(cls);
            throw BE6.A0o(BE9.A0o("Unable to get message info for ", A0l2, A0l2.length()), e2);
        }
    }
}
