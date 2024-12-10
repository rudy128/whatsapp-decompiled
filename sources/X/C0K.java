package X;

import android.util.SparseArray;

public enum C0K {
    ;
    
    public static final SparseArray A00 = null;
    public final int mValue;

    /* access modifiers changed from: public */
    static {
        int i;
        A00 = BE6.A0Q();
        for (C0K c0k : values()) {
            A00.put(c0k.mValue, c0k);
        }
    }

    public static C0K A00(String str, int i, int i2) {
        return new C0K(str, i, i2);
    }

    /* access modifiers changed from: public */
    C0K(int i) {
        this.mValue = i;
    }
}
