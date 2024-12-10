package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.whatsapp.wabloks.commerce.ui.viewmodel.WaBkFlowsLayoutViewModel;
import java.util.Map;

/* renamed from: X.AfH  reason: case insensitive filesystem */
public final class C21146AfH implements B9Y {
    public void CBS(Activity activity, A45 a45, Map map) {
        Fragment fragment;
        C18070vi.A0z(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        Fragment A0Q = ((AnonymousClass1FL) activity).getSupportFragmentManager().A0Q("extensions_bottom_sheet_container");
        String str = null;
        if (A0Q != null) {
            fragment = A0Q.A1E().A0Q("BK_FRAGMENT");
        } else {
            fragment = null;
        }
        boolean z = false;
        if (map != null) {
            if (map.containsKey("show_full_screen_error")) {
                z = AnonymousClass8BX.A1X(map, "show_full_screen_error");
            }
            if (map.containsKey("custom_error_message")) {
                str = C17880vN.A0s("custom_error_message", map);
            }
        }
        if (fragment != null) {
            ((WaBkFlowsLayoutViewModel) AnonymousClass3MW.A0N(fragment).A00(WaBkFlowsLayoutViewModel.class)).A0W((C172408tN) null, (String) null, str, "extensions-error-from-layout", z);
        }
    }
}
