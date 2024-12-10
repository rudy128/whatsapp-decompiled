package X;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Xv  reason: invalid class name and case insensitive filesystem */
public abstract class C124306Xv {
    public static String A00(AnonymousClass118 r10, C442022n r11) {
        C128926gu A00;
        List A17 = r11.A17();
        int size = A17.size() - 1;
        int i = 0;
        while (i < A17.size() && i < 100) {
            String A0w = C17880vN.A0w(A17, i);
            if (A0w != null && (A00 = AnonymousClass73C.A00(A0w)) != null) {
                AnonymousClass73C r7 = new AnonymousClass73C();
                Iterator it = A00.A02.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        continue;
                        break;
                    }
                    C136406tl r8 = (C136406tl) it.next();
                    String str = r8.A01;
                    if (!TextUtils.isEmpty(r8.A02)) {
                        if (str.equals("N")) {
                            AnonymousClass73C.A01(r8.A03, r7.A0A);
                        }
                        C133136oE r1 = r7.A0A;
                        if (!TextUtils.isEmpty(r1.A02)) {
                            String str2 = r1.A02;
                            if (str2 != null) {
                                Resources A05 = AnonymousClass3MW.A05(r10);
                                Object[] A1b = AnonymousClass3MX.A1b(str2, 0);
                                C17880vN.A1T(A1b, size, 1);
                                return A05.getQuantityString(2131755076, size, A1b);
                            }
                        }
                    }
                }
            }
            i++;
        }
        return C72473Md.A0k(AnonymousClass3MW.A05(r10), A17.size(), 2131755251);
    }
}
