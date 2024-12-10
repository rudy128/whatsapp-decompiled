package X;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: X.9JN  reason: invalid class name */
public enum AnonymousClass9JN {
    UNENCRYPTED(0),
    CRYPT12(12),
    CRYPT13(13),
    CRYPT14(14),
    CRYPT15(15);
    
    public static SparseArray A00;
    public static AnonymousClass9JN A01;
    public static AnonymousClass9JN A02;
    public final int version;

    public static synchronized AnonymousClass9JN A00() {
        AnonymousClass9JN r6;
        synchronized (AnonymousClass9JN.class) {
            r6 = A01;
            if (r6 == null) {
                r6 = CRYPT15;
                for (AnonymousClass9JN r2 : values()) {
                    if (r2.version > r6.version) {
                        r6 = r2;
                    }
                }
                A01 = r6;
            }
        }
        return r6;
    }

    public static synchronized AnonymousClass9JN A01() {
        AnonymousClass9JN r6;
        synchronized (AnonymousClass9JN.class) {
            r6 = A02;
            if (r6 == null) {
                r6 = CRYPT12;
                for (AnonymousClass9JN r2 : values()) {
                    if (r2.version < r6.version) {
                        r6 = r2;
                    }
                }
                A02 = r6;
            }
        }
        return r6;
    }

    public static synchronized AnonymousClass9JN A02(int i) {
        AnonymousClass9JN r0;
        synchronized (AnonymousClass9JN.class) {
            if (A00 == null) {
                A03();
            }
            r0 = (AnonymousClass9JN) A00.get(i);
        }
        return r0;
    }

    public static synchronized void A03() {
        synchronized (AnonymousClass9JN.class) {
            A00 = new SparseArray(values().length);
            for (AnonymousClass9JN r2 : values()) {
                A00.append(r2.version, r2);
            }
        }
    }

    public static synchronized AnonymousClass9JN[] A04(AnonymousClass9JN r6, AnonymousClass9JN r7) {
        AnonymousClass9JN[] r0;
        synchronized (AnonymousClass9JN.class) {
            if (A00 == null) {
                A03();
            }
            ArrayList A13 = AnonymousClass000.A13();
            int i = 0;
            while (true) {
                SparseArray sparseArray = A00;
                if (i < sparseArray.size()) {
                    int keyAt = sparseArray.keyAt(i);
                    if (keyAt >= r6.version && keyAt <= r7.version) {
                        A13.add((AnonymousClass9JN) A00.get(keyAt));
                    }
                    i++;
                } else {
                    C21486Akr.A01(48, A13);
                    r0 = (AnonymousClass9JN[]) A13.toArray(new AnonymousClass9JN[0]);
                }
            }
        }
        return r0;
    }

    /* access modifiers changed from: public */
    AnonymousClass9JN(int i) {
        this.version = i;
    }
}
