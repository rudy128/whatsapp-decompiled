package X;

import com.google.protobuf.UnsafeUtil;

public class DNB implements E85 {
    public static final DNB A00 = new Object();

    public boolean Bgc(Class cls) {
        return C23577Bm6.class.isAssignableFrom(cls);
    }

    public C24953CRd Bjp(Class cls) {
        IllegalStateException illegalStateException;
        Class<C23577Bm6> cls2 = C23577Bm6.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                Class<? extends U> asSubclass = cls.asSubclass(cls2);
                C23577Bm6 bm6 = (C23577Bm6) C23577Bm6.defaultInstanceMap.get(asSubclass);
                if (bm6 == null) {
                    try {
                        BEA.A1C(asSubclass);
                        bm6 = (C23577Bm6) C23577Bm6.defaultInstanceMap.get(asSubclass);
                        if (bm6 == null) {
                            bm6 = (C23577Bm6) ((C23577Bm6) UnsafeUtil.A00(asSubclass)).A0P(AnonymousClass00R.A0j, (Object) null);
                            if (bm6 != null) {
                                C23577Bm6.defaultInstanceMap.put(asSubclass, bm6);
                            } else {
                                illegalStateException = BE6.A0k();
                                throw illegalStateException;
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        illegalStateException = new IllegalStateException("Class initialization cannot fail.", e);
                    }
                }
                return (C24953CRd) bm6.A0P(AnonymousClass00R.A0C, (Object) null);
            } catch (Exception e2) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Unable to get message info for ");
                throw BE6.A0o(AnonymousClass000.A0y(cls.getName(), A10), e2);
            }
        } else {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Unsupported message type: ");
            throw AnonymousClass001.A12(cls.getName(), A102);
        }
    }
}
