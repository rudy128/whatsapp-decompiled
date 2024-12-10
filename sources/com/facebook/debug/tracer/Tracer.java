package com.facebook.debug.tracer;

import X.C18070vi;
import X.C26294Cx6;
import X.C27243DaN;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.systrace.Systrace;
import java.util.IllegalFormatException;

public abstract class Tracer {
    public static final ThreadLocal A00 = new C27243DaN();

    public static final void A00(String str) {
        if (Systrace.A04(32)) {
            try {
                str = StringFormatUtil.formatStrLocaleSafe(str);
            } catch (IllegalFormatException e) {
                C26294Cx6.A0C("Tracer", "Bad format string", e);
            }
            C18070vi.A0b(str);
            Systrace.A02(str);
        }
    }
}
