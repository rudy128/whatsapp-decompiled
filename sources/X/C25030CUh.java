package X;

import android.os.Build;
import java.util.ArrayList;

/* renamed from: X.CUh  reason: case insensitive filesystem */
public final class C25030CUh {
    public final String[] A00() {
        String str;
        ArrayList A13 = AnonymousClass000.A13();
        int i = Build.VERSION.SDK_INT;
        if (29 <= i) {
            if (i < 31) {
                str = "android.permission.BLUETOOTH";
            } else if (i < 10001) {
                str = "android.permission.BLUETOOTH_CONNECT";
            }
            A13.add(str);
            if (i == 34 && C24709CGv.A00 != 4) {
                A13.add("android.permission.FOREGROUND_SERVICE_CONNECTED_DEVICE");
            }
            return C17890vO.A1b(A13, 0);
        }
        C25845Cn1 cn1 = C24712CGy.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Build version ");
        A10.append(i);
        cn1.A04("sup:PermissionsProvider", AnonymousClass000.A0y(" not supported!", A10), (Throwable) null);
        A13.add("android.permission.FOREGROUND_SERVICE_CONNECTED_DEVICE");
        return C17890vO.A1b(A13, 0);
    }
}
