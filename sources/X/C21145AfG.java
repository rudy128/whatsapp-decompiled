package X;

import android.app.Activity;
import java.util.Map;

/* renamed from: X.AfG  reason: case insensitive filesystem */
public final class C21145AfG implements B9Y {
    public void CBS(Activity activity, A45 a45, Map map) {
        B9Z b9z;
        boolean z = false;
        if (map != null) {
            if (map.containsKey("is_intermediate_screen")) {
                C18070vi.A0z(map.get("is_intermediate_screen"), "null cannot be cast to non-null type kotlin.Boolean");
            }
            if (map.containsKey("show_loading")) {
                z = AnonymousClass000.A1Y(AnonymousClass8BS.A0X("show_loading", "null cannot be cast to non-null type kotlin.Boolean", map));
            }
        }
        if ((activity instanceof B9Z) && (b9z = (B9Z) activity) != null) {
            b9z.CL9(z);
        }
    }
}
