package X;

import java.util.Map;

public enum C0N {
    ;
    
    public static final Map A00 = null;
    public static final Map A01 = null;
    public final String[] otherEncodingNames;
    public final int[] values;

    /* access modifiers changed from: public */
    static {
        A01 = C17880vN.A11();
        A00 = C17880vN.A11();
        for (C0N c0n : values()) {
            for (int A1O : c0n.values) {
                C17880vN.A1O(c0n, A01, A1O);
            }
            A00.put(c0n.name(), c0n);
            for (String put : c0n.otherEncodingNames) {
                A00.put(put, c0n);
            }
        }
    }

    /* access modifiers changed from: public */
    C0N(String str, String... strArr) {
        int[] A1X = BE6.A1X();
        A1X[0] = r4;
        this.values = A1X;
        this.otherEncodingNames = strArr;
    }

    /* access modifiers changed from: public */
    C0N(String[] strArr, int i) {
        this.values = r2;
        this.otherEncodingNames = strArr;
    }
}
