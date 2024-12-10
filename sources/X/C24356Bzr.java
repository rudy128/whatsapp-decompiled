package X;

import android.util.SparseArray;

/* renamed from: X.Bzr  reason: case insensitive filesystem */
public enum C24356Bzr {
    NOT_CACHED(0, "NOT_CACHED"),
    CACHED(1, "CACHED"),
    SEMI_CACHED(2, "SEMI_CACHED");
    
    public static final SparseArray A00 = null;
    public final String mName;
    public final int mValue;

    /* access modifiers changed from: public */
    static {
        int i;
        A00 = BE6.A0Q();
        for (C24356Bzr bzr : values()) {
            A00.put(bzr.mValue, bzr);
        }
    }

    /* access modifiers changed from: public */
    C24356Bzr(int i, String str) {
        this.mValue = i;
        this.mName = str;
    }
}
