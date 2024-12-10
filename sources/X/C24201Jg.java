package X;

import android.content.Context;
import android.content.pm.Signature;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.1Jg  reason: invalid class name and case insensitive filesystem */
public abstract class C24201Jg {
    public static Long A00;

    public static long A00(Context context) {
        long j;
        int length;
        Long l = A00;
        if (l == null) {
            if ("com.whatsapp".equals(context.getPackageName())) {
                long A002 = C24211Jh.A00(context, context.getPackageName());
                if (A002 >= 242478021 && A002 <= 242478025) {
                    Signature[] A04 = C24211Jh.A04(context);
                    String str = null;
                    if (!(A04 == null || (length = A04.length) == 0)) {
                        try {
                            MessageDigest instance = MessageDigest.getInstance("SHA-1");
                            instance.reset();
                            int i = 0;
                            do {
                                instance.update(A04[i].toByteArray());
                                i++;
                            } while (i < length);
                            str = Base64.encodeToString(instance.digest(), 11);
                        } catch (NoSuchAlgorithmException e) {
                            Log.e((Throwable) e);
                        }
                    }
                    if ("OKD31QX-GP7GT780Psqq8xDb15k".equals(str)) {
                        j = 1;
                        l = Long.valueOf(j);
                        A00 = l;
                    }
                }
            }
            j = 0;
            l = Long.valueOf(j);
            A00 = l;
        }
        return l.longValue();
    }
}
