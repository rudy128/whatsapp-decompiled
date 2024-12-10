package X;

import com.facebook.common.stringformat.StringFormatUtil;

public enum C0Q {
    ;
    
    public final String value;

    public static C0Q A01(String str, int i) {
        return new C0Q(str, i, str);
    }

    /* access modifiers changed from: public */
    C0Q(String str) {
        this.value = str;
    }

    public static C0Q A00(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException | NullPointerException e) {
            Object[] A1b = AnonymousClass8BV.A1b(str);
            if (C26294Cx6.A01.BfN(3)) {
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Cannot convert errorDomain %s", A1b);
                if (C26294Cx6.A01.BfN(3)) {
                    C26294Cx6.A01.BI0("VideoErrorDomain", formatStrLocaleSafe, e);
                }
            }
            return A0W;
        }
    }
}
