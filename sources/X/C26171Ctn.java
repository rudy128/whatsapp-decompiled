package X;

import android.media.MediaCodec;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Ctn  reason: case insensitive filesystem */
public abstract class C26171Ctn {
    public static final int A00 = Build.VERSION.SDK_INT;

    public static final String A00(MediaCodec.CodecException codecException) {
        Object obj;
        C18070vi.A0d(codecException, 0);
        Locale locale = Locale.US;
        Object[] A1a = BE6.A1a();
        if (Build.VERSION.SDK_INT >= 23) {
            obj = Integer.valueOf(codecException.getErrorCode());
        } else {
            obj = "null";
        }
        A1a[0] = obj;
        A1a[1] = codecException.getDiagnosticInfo();
        AnonymousClass8BU.A1Q(A1a, codecException.isRecoverable());
        BE8.A1P(A1a, codecException.isTransient());
        return C108955ca.A12(locale, "mediaCodecErrorCode: %s, mediaCodecErrorDiagnosticInfo: %s, isRecoverable: %s, isTransient: %s", Arrays.copyOf(A1a, 4));
    }

    public static final String A01(Class cls, Map map) {
        StringBuilder A0t = BE6.A0t(32);
        A0t.append(cls.getSimpleName());
        A0t.append('{');
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            String A0x = C17880vN.A0x(A16);
            Object value = A16.getValue();
            BE8.A1E(A0t, A0x);
            A0t.append(value);
            A0t.append(", ");
        }
        if (A0t.charAt(A0t.length() - 2) == ',') {
            A0t.delete(A0t.length() - 2, A0t.length());
        }
        String A0b = C17890vO.A0b(A0t);
        C18070vi.A0X(A0b);
        return A0b;
    }

    public static final void A02(Object obj) {
        if (obj == null) {
            throw AnonymousClass000.A0k("argument cannot be null");
        }
    }

    public static final void A03(boolean z, String str) {
        if (!z) {
            if (str == null) {
                str = "";
            }
            throw AnonymousClass000.A0k(str);
        }
    }
}
