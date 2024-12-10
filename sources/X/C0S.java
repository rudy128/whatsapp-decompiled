package X;

import com.facebook.common.stringformat.StringFormatUtil;

public enum C0S {
    A1N("UNKNOWN", false);
    
    public final int errorCode;
    public final CA1 reliabilityLabel;
    public final boolean retryable;

    public static C0S A01(String str, int i, int i2, boolean z) {
        return new C0S(i, i2, str, z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CA1, java.lang.Object] */
    /* access modifiers changed from: public */
    C0S(String str, boolean z) {
        this.errorCode = r3;
        this.reliabilityLabel = new Object();
        this.retryable = z;
    }

    public static C0S A00(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException | NullPointerException e) {
            Object[] A1b = AnonymousClass8BV.A1b(str);
            if (C26294Cx6.A01.BfN(3)) {
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Cannot convert errorCode %s", A1b);
                if (C26294Cx6.A01.BfN(3)) {
                    C26294Cx6.A01.BI0("VideoErrorCode", formatStrLocaleSafe, e);
                }
            }
            return A1N;
        }
    }
}
