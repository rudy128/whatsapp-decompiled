package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Arrays;

/* renamed from: X.Cdb  reason: case insensitive filesystem */
public abstract class C25330Cdb {
    public static final void A00(String str, Object... objArr) {
        C18070vi.A0d(str, 1);
        Object[] copyOf = Arrays.copyOf(objArr, 0);
        if (C26294Cx6.A01.BfN(3)) {
            C26294Cx6.A04("LinkManagerImpl", StringFormatUtil.formatStrLocaleSafe(str, copyOf));
        }
    }

    public static final void A01(String str, Object... objArr) {
        C18070vi.A0d(str, 1);
        Object[] copyOf = Arrays.copyOf(objArr, 0);
        if (C26294Cx6.A01.BfN(4)) {
            C26294Cx6.A06("LinkManagerImpl", StringFormatUtil.formatStrLocaleSafe(str, copyOf));
        }
    }
}
