package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.2Ux  reason: invalid class name and case insensitive filesystem */
public abstract class C50562Ux {
    public static final String A00(AnonymousClass190 r7, AnonymousClass21V r8) {
        File file;
        C18070vi.A0d(r7, 0);
        String str = r8.A06;
        if (str != null && str.length() != 0) {
            return str;
        }
        C62572rc r0 = r8.A02;
        if (!(r0 == null || (file = r0.A0G) == null)) {
            try {
                int i = r8.A0u;
                if (i == 2) {
                    return AnonymousClass1SO.A06(AnonymousClass1SO.A03(file));
                }
                if (i == 3 || i == 13) {
                    int i2 = AnonymousClass1SO.A04(file).A01;
                    if (i2 == 7) {
                        return "video/quicktime";
                    }
                    if (i2 == 3) {
                        return "video/3gpp";
                    }
                    return "video/mp4";
                }
            } catch (AnonymousClass2RQ | IOException e) {
                Log.e("useractions/getmediamimetype exception", e);
            }
        }
        int i3 = r8.A0u;
        if (i3 == 1) {
            return "image/jpeg";
        }
        if (i3 == 2) {
            return "audio/*";
        }
        if (i3 == 3 || i3 == 13) {
            return "video/*";
        }
        if (i3 == 23 || i3 == 25 || i3 == 37 || i3 == 42) {
            return "image/jpeg";
        }
        if (i3 != 43) {
            return "*/*";
        }
        return "video/*";
    }
}
