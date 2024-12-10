package X;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: X.8KP  reason: invalid class name */
public final class AnonymousClass8KP extends C196019uK {
    public final ConnectivityManager A00;
    public final AnonymousClass8CO A01 = new AnonymousClass8CO(this);

    public /* bridge */ /* synthetic */ Object A04() {
        return C20091A6t.A01(this.A00);
    }

    public void A05() {
        try {
            A5Z.A00().A03(C20091A6t.A00, "Registering network callback");
            A01(this.A01, this.A00);
        } catch (IllegalArgumentException | SecurityException e) {
            A5Z.A00().A08(C20091A6t.A00, "Received exception while registering network callback", e);
        }
    }

    public void A06() {
        try {
            A5Z.A00().A03(C20091A6t.A00, "Unregistering network callback");
            A02(this.A01, this.A00);
        } catch (IllegalArgumentException | SecurityException e) {
            A5Z.A00().A08(C20091A6t.A00, "Received exception while unregistering network callback", e);
        }
    }

    public AnonymousClass8KP(Context context, C71973Kb r4) {
        super(context, r4);
        Object systemService = this.A01.getSystemService("connectivity");
        C18070vi.A0z(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.A00 = (ConnectivityManager) systemService;
    }

    public static final void A01(ConnectivityManager.NetworkCallback networkCallback, ConnectivityManager connectivityManager) {
        C18070vi.A0h(connectivityManager, networkCallback);
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }

    public static final void A02(ConnectivityManager.NetworkCallback networkCallback, ConnectivityManager connectivityManager) {
        C18070vi.A0h(connectivityManager, networkCallback);
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
