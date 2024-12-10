package X;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.wds.components.search.WDSSearchBar;
import com.whatsapp.wds.components.search.WDSSearchView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Zm  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C88384Zm {
    public static void A01(AnonymousClass3gf r1, AnonymousClass1E7 r2, boolean z) {
        C18070vi.A0d(r2, 2);
        if (!r2.A0y) {
            r1.A53(r2, z);
        } else if (r1.A0i.add(r2)) {
            r1.A52(r2, z);
            if (r1.A0U.contains(r2)) {
                List list = r1.A0V;
                if (!list.contains(r2)) {
                    list.add(r2);
                }
            }
        }
    }

    public static void A02(AnonymousClass3gf r3, List list) {
        C18070vi.A0d(list, 2);
        if (list.isEmpty()) {
            View findViewById = r3.findViewById(2131432620);
            if (findViewById != null) {
                findViewById.performAccessibilityAction(64, (Bundle) null);
            }
            if (r3.A0Z) {
                r3.CRZ();
            }
        }
    }

    public static boolean A03(AnonymousClass3gf r4, AnonymousClass1E7 r5) {
        C18070vi.A0d(r5, 2);
        Iterator it = r4.A0T.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AnonymousClass1E7 A0O = C17880vN.A0O(it);
            if (A0O != r5 && C42171xk.A00(r5.A0J, A0O.A0J)) {
                A0O.A0y = r5.A0y;
                z = true;
            }
        }
        return z;
    }

    public static void A00(AnonymousClass3gf r2) {
        WDSSearchView wDSSearchView;
        TextView textView;
        View findViewById = r2.findViewById(2131434898);
        if (findViewById != null) {
            textView = C17880vN.A0E(findViewById, 2131434969);
            if (textView == null) {
                return;
            }
        } else {
            WDSSearchBar wDSSearchBar = r2.A0H;
            if (wDSSearchBar != null && (wDSSearchView = wDSSearchBar.A08) != null) {
                textView = wDSSearchView.A09;
            } else {
                return;
            }
        }
        AnonymousClass3MW.A1S(textView);
    }
}
