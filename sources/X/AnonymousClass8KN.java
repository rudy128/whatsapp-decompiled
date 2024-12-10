package X;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: X.8KN  reason: invalid class name */
public final class AnonymousClass8KN extends AnonymousClass8KO {
    public final ConnectivityManager A00;

    public AnonymousClass8KN(Context context, C71973Kb r4) {
        super(context, r4);
        Object systemService = this.A01.getSystemService("connectivity");
        C18070vi.A0z(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.A00 = (ConnectivityManager) systemService;
    }
}
