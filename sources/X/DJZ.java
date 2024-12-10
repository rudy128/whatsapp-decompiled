package X;

public final class DJZ implements E80 {
    public static final DJZ A00 = new Object();

    public final boolean CT4(Class cls) {
        return C23293Beh.class.isAssignableFrom(cls);
    }

    public final E1z CTF(Class cls) {
        IllegalStateException illegalStateException;
        String str;
        Class<C23293Beh> cls2 = C23293Beh.class;
        if (!cls2.isAssignableFrom(cls)) {
            String A0l = BE7.A0l(cls);
            throw AnonymousClass000.A0k(BE9.A0o("Unsupported message type: ", A0l, A0l.length()));
        }
        try {
            Class<? extends U> asSubclass = cls.asSubclass(cls2);
            C23293Beh beh = (C23293Beh) C23293Beh.zzjr.get(asSubclass);
            if (beh == null) {
                try {
                    String name = asSubclass.getName();
                    Class.forName(name, true, asSubclass.getClassLoader());
                    beh = (C23293Beh) C23293Beh.zzjr.get(asSubclass);
                    if (beh == null) {
                        String valueOf = String.valueOf(name);
                        if (valueOf.length() != 0) {
                            str = "Unable to get default instance for: ".concat(valueOf);
                        } else {
                            str = new String("Unable to get default instance for: ");
                        }
                        illegalStateException = AnonymousClass000.A0n(str);
                        throw illegalStateException;
                    }
                } catch (ClassNotFoundException e) {
                    illegalStateException = new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            return (E1z) beh.A04(3);
        } catch (Exception e2) {
            String A0l2 = BE7.A0l(cls);
            throw BE6.A0o(BE9.A0o("Unable to get message info for ", A0l2, A0l2.length()), e2);
        }
    }
}
