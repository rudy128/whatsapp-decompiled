package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0yh  reason: invalid class name and case insensitive filesystem */
public class C19660yh {
    public final SharedPreferences A00;

    public static synchronized String A00(C19660yh r3, long j) {
        String str;
        synchronized (r3) {
            if (Build.VERSION.SDK_INT >= 26) {
                str = new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
            } else {
                str = new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
            }
        }
        return str;
    }

    public static synchronized String A01(C19660yh r4, String str) {
        synchronized (r4) {
            for (Map.Entry next : r4.A00.getAll().entrySet()) {
                if (next.getValue() instanceof Set) {
                    for (String equals : (Set) next.getValue()) {
                        if (str.equals(equals)) {
                            String str2 = (String) next.getKey();
                            return str2;
                        }
                    }
                    continue;
                }
            }
            return null;
        }
    }

    public static synchronized void A02(C19660yh r4, String str) {
        synchronized (r4) {
            String A01 = A01(r4, str);
            if (A01 != null) {
                SharedPreferences sharedPreferences = r4.A00;
                HashSet hashSet = new HashSet(sharedPreferences.getStringSet(A01, new HashSet()));
                hashSet.remove(str);
                if (hashSet.isEmpty()) {
                    sharedPreferences.edit().remove(A01).commit();
                } else {
                    sharedPreferences.edit().putStringSet(A01, hashSet).commit();
                }
            }
        }
    }

    public C19660yh(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("FirebaseHeartBeat");
        sb.append(str);
        this.A00 = context.getSharedPreferences(sb.toString(), 0);
    }
}
