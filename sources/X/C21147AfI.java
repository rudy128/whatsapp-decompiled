package X;

import android.app.Activity;
import java.util.Map;

/* renamed from: X.AfI  reason: case insensitive filesystem */
public final class C21147AfI implements B9Y {
    public final C18030ve A00;
    public final AnonymousClass00H A01;

    public void CBS(Activity activity, A45 a45, Map map) {
        Boolean bool;
        if (map != null) {
            String A0g = AnonymousClass8BW.A0g("screen_id", map);
            Object obj = map.get("screen_length");
            C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.Int");
            int A0M = AnonymousClass000.A0M(obj);
            if (C18020vd.A05(C18040vf.A02, this.A00, 7077)) {
                Object obj2 = map.get("is_success_screen");
                if (obj2 instanceof Boolean) {
                    bool = (Boolean) obj2;
                    ((A2M) C18070vi.A0E(this.A01)).A02(bool, C17880vN.A0n(A0M), A0g, (String) null, (String) null, (String) null);
                }
            }
            bool = null;
            ((A2M) C18070vi.A0E(this.A01)).A02(bool, C17880vN.A0n(A0M), A0g, (String) null, (String) null, (String) null);
        }
    }

    public C21147AfI(C18030ve r1, AnonymousClass00H r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
