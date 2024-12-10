package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;

/* renamed from: X.A6t  reason: case insensitive filesystem */
public abstract class C20091A6t {
    public static final String A00 = AnonymousClass8BS.A0m("NetworkStateTracker");

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r7.isConnected() == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C194729sC A01(android.net.ConnectivityManager r8) {
        /*
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            android.net.NetworkInfo r7 = r8.getActiveNetworkInfo()
            r6 = 1
            if (r7 == 0) goto L_0x0012
            boolean r0 = r7.isConnected()
            r5 = 1
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r5 = 0
        L_0x0013:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            r4 = 0
            if (r1 < r0) goto L_0x0035
            android.net.Network r0 = X.AnonymousClass9OO.A00(r8)     // Catch:{ SecurityException -> 0x0029 }
            android.net.NetworkCapabilities r0 = A00(r8, r0)     // Catch:{ SecurityException -> 0x0029 }
            if (r0 == 0) goto L_0x0035
            boolean r4 = A03(r0)     // Catch:{ SecurityException -> 0x0029 }
            goto L_0x0035
        L_0x0029:
            r3 = move-exception
            X.A5Z r2 = X.A5Z.A00()
            java.lang.String r1 = A00
            java.lang.String r0 = "Unable to validate active network"
            r2.A08(r1, r0, r3)
        L_0x0035:
            boolean r1 = r8.isActiveNetworkMetered()
            if (r7 == 0) goto L_0x0047
            boolean r0 = r7.isRoaming()
            if (r0 != 0) goto L_0x0047
        L_0x0041:
            X.9sC r0 = new X.9sC
            r0.<init>(r5, r4, r1, r6)
            return r0
        L_0x0047:
            r6 = 0
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20091A6t.A01(android.net.ConnectivityManager):X.9sC");
    }

    public static final C196019uK A02(Context context, C71973Kb r3) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new AnonymousClass8KP(context, r3);
        }
        return new AnonymousClass8KN(context, r3);
    }

    public static final boolean A03(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasCapability(16);
    }

    public static final NetworkCapabilities A00(ConnectivityManager connectivityManager, Network network) {
        return connectivityManager.getNetworkCapabilities(network);
    }
}
