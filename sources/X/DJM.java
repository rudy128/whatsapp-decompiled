package X;

import java.util.Map;

public final class DJM implements E7z {
    public static final DJM A00 = new Object();

    public final C28453E1t CTD(Class cls) {
        IllegalStateException illegalStateException;
        Class<C23267BeH> cls2 = C23267BeH.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                Class<? extends U> asSubclass = cls.asSubclass(cls2);
                Map map = C23267BeH.zzb;
                if (((C23267BeH) map.get(asSubclass)) == null) {
                    try {
                        BEA.A1C(asSubclass);
                        if (((C23267BeH) map.get(asSubclass)) == null) {
                            C26291Cwy.A04(asSubclass);
                            C23273BeN beN = C23273BeN.zzb;
                            if (beN != null) {
                                map.put(asSubclass, beN);
                            } else {
                                illegalStateException = BE6.A0k();
                                throw illegalStateException;
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        illegalStateException = new IllegalStateException("Class initialization cannot fail.", e);
                    }
                }
                Object[] A1a = AnonymousClass3MW.A1a();
                A1a[0] = "zzd";
                return new DJJ(C23273BeN.zzb, A1a);
            } catch (Exception e2) {
                throw BE6.A0o("Unable to get message info for ".concat(BE7.A0l(cls)), e2);
            }
        } else {
            throw AnonymousClass000.A0k("Unsupported message type: ".concat(BE7.A0l(cls)));
        }
    }

    public final boolean zzc(Class cls) {
        return C23267BeH.class.isAssignableFrom(cls);
    }
}
