package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.73J  reason: invalid class name */
public abstract class AnonymousClass73J {
    public static final boolean A00 = C108975cc.A1C(Build.VERSION.SDK_INT, 23);

    public static final void A03(View view, boolean z, boolean z2) {
        C43061zB[] r3;
        C18070vi.A0d(view, 0);
        if (z) {
            r3 = new C43061zB[1];
            int i = 2131896401;
            if (z2) {
                i = 2131896402;
            }
            r3[0] = new C43061zB(16, i);
        } else {
            r3 = new C43061zB[]{new C43061zB(16, 2131896400), new C43061zB(32, 2131896421)};
        }
        AnonymousClass1Y5.A0B(view, r3);
    }

    public static final String A01(Context context, String str) {
        String string;
        if (str == null || str.length() == 0) {
            string = context.getString(2131896431);
        } else {
            string = C72473Md.A0j(context, str, 2131896432);
        }
        C18070vi.A0b(string);
        return string;
    }

    public static final List A02(List list, Set set) {
        AnonymousClass737[] r3;
        String str;
        if (set == null || list == null) {
            return C18460wS.A00;
        }
        ArrayList A13 = AnonymousClass000.A13();
        HashSet A12 = C17880vN.A12();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1418377d A0x = C108945cZ.A0x(it);
            AnonymousClass73B r0 = A0x.A04;
            if (r0 != null && (r3 = r0.A0H) != null) {
                int length = r3.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (!set.contains(r3[i]) || (str = A0x.A0F) == null || A12.contains(str)) {
                        i++;
                    } else {
                        A13.add(A0x);
                        String str2 = A0x.A0F;
                        if (str2 != null) {
                            A12.add(str2);
                        }
                    }
                }
            }
        }
        return A13;
    }

    public static final String A00(Context context, C1418377d r4) {
        String str;
        AnonymousClass737[] r0;
        AnonymousClass73B r02;
        int length;
        C18070vi.A0h(context, r4);
        String str2 = r4.A06;
        if (((str2 != null && str2.length() > 0) || ((r02 = r4.A04) != null && (str2 = r02.A05) != null && str2.length() > 0)) && (length = str2.length()) > 0 && length > 5) {
            return AnonymousClass001.A1H(" - ", str2, AnonymousClass000.A11(C18070vi.A0F(context, 2131896431)));
        }
        AnonymousClass73B r03 = r4.A04;
        if (r03 == null || (r0 = r03.A0H) == null) {
            str = r4.A09;
        } else {
            str = C137426vR.A00(r0);
        }
        return A01(context, str);
    }
}
