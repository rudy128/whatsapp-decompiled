package X;

import android.content.SharedPreferences;

/* renamed from: X.2TA  reason: invalid class name */
public abstract class AnonymousClass2TA {
    public static int A00(C19830z4 r1, int i) {
        SharedPreferences A0B;
        String str;
        int i2;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            A0B = C17890vO.A0B(r1);
            str = "autodownload_wifi_mask";
            i2 = 15;
        } else if (i == 2) {
            return r1.A04();
        } else {
            if (i == 3) {
                A0B = C17890vO.A0B(r1);
                str = "autodownload_roaming_mask";
                i2 = 0;
            } else {
                throw AnonymousClass000.A0k("network_type not valid");
            }
        }
        return A0B.getInt(str, i2);
    }
}
