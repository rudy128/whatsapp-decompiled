package X;

import java.util.Arrays;

/* renamed from: X.Cg2  reason: case insensitive filesystem */
public abstract class C25451Cg2 {
    public static final CB6 A00;
    public static final CB6 A01 = new Object();
    public static final Class A02;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.CB6] */
    static {
        Class<?> cls;
        CB6 cb6 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        A02 = cls;
        try {
            Class<?> cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
            if (cls2 != null) {
                cb6 = (CB6) BEA.A0d(cls2);
            }
        } catch (Throwable unused2) {
        }
        A00 = cb6;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, X.Csz] */
    public static void A00(Object obj, Object obj2) {
        C23267BeH beH = (C23267BeH) obj;
        C26136Csz csz = beH.zzc;
        C26136Csz csz2 = ((C23267BeH) obj2).zzc;
        C26136Csz csz3 = C26136Csz.A04;
        C26136Csz csz4 = csz;
        if (!csz3.equals(csz2)) {
            if (csz3.equals(csz)) {
                int i = csz.A00 + csz2.A00;
                int[] copyOf = Arrays.copyOf(csz.A02, i);
                System.arraycopy(csz2.A02, 0, copyOf, csz.A00, csz2.A00);
                Object[] copyOf2 = Arrays.copyOf(csz.A03, i);
                System.arraycopy(csz2.A03, 0, copyOf2, csz.A00, csz2.A00);
                ? obj3 = new Object();
                obj3.A00 = i;
                obj3.A02 = copyOf;
                obj3.A03 = copyOf2;
                obj3.A01 = true;
                csz4 = obj3;
            } else {
                csz4 = csz;
                if (!csz2.equals(csz3)) {
                    if (csz.A01) {
                        int i2 = csz.A00 + csz2.A00;
                        C26136Csz.A01(csz, i2);
                        System.arraycopy(csz2.A02, 0, csz.A02, csz.A00, csz2.A00);
                        System.arraycopy(csz2.A03, 0, csz.A03, csz.A00, csz2.A00);
                        csz.A00 = i2;
                        csz4 = csz;
                    } else {
                        throw C17880vN.A0y();
                    }
                }
            }
        }
        beH.zzc = csz4;
    }
}
