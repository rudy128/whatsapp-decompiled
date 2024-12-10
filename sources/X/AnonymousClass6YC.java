package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6YC  reason: invalid class name */
public abstract class AnonymousClass6YC {
    public static final List A00(Integer num) {
        C122646Re r0;
        List singletonList;
        C18070vi.A0d(num, 0);
        int intValue = num.intValue();
        if (intValue == 0) {
            r0 = C122646Re.FACEBOOK;
            singletonList = Collections.singletonList(r0);
        } else if (intValue == 1) {
            r0 = C122646Re.INSTAGRAM;
            singletonList = Collections.singletonList(r0);
        } else if (intValue == 2) {
            singletonList = Arrays.asList(new C122646Re[]{C122646Re.FACEBOOK, C122646Re.INSTAGRAM});
        } else {
            throw AnonymousClass3MW.A14();
        }
        C18070vi.A0X(singletonList);
        return singletonList;
    }
}
