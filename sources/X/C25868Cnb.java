package X;

import android.os.StrictMode;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.Cnb  reason: case insensitive filesystem */
public abstract class C25868Cnb {
    public static long A00(Map map, boolean z) {
        String A0w;
        if (map == null) {
            return -1;
        }
        List A01 = A01("Content-Range", map, z);
        if (A01 == null || A01.isEmpty()) {
            List A012 = A01("Content-Length", map, z);
            if (A012 == null || A012.isEmpty()) {
                return -1;
            }
            A0w = C17880vN.A0w(A012, 0);
        } else {
            String A0w2 = C17880vN.A0w(A01, 0);
            A0w = BE6.A0p(A0w2.lastIndexOf(47), A0w2).trim();
        }
        return Long.parseLong(A0w);
    }

    public static List A01(String str, Map map, boolean z) {
        if (!map.containsKey(str)) {
            if (!z || !map.containsKey(AnonymousClass8BS.A0n(str))) {
                return null;
            }
            str = AnonymousClass8BS.A0n(str);
        }
        return AnonymousClass8BS.A0t(str, map);
    }

    /* JADX INFO: finally extract failed */
    public static void A02(C26115Csd csd) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("video_uid=");
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID randomUUID = UUID.randomUUID();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            String A0V = C17890vO.A0V(randomUUID, A10);
            if (A0V != null) {
                csd.A05.A0N.put("x-fb-qpl-ec", A0V);
            }
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
