package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.msys.mci.NetworkSession;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.util.LinkedHashMap;

/* renamed from: X.1Er  reason: invalid class name and case insensitive filesystem */
public abstract class C23131Er {
    public static final void A00(Context context, NetworkSession networkSession, AnonymousClass18H r12, C18030ve r13, JniBridge jniBridge) {
        String str;
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C18040vf r7 = C18040vf.A02;
        boolean z2 = false;
        boolean z3 = false;
        if (C18020vd.A00(r7, r13, 5120) == 5) {
            z3 = true;
        }
        synchronized (r12) {
            if (AnonymousClass1Es.A00(r12) >= 2) {
                SharedPreferences sharedPreferences = (SharedPreferences) r12.A00.getValue();
                C18070vi.A0X(sharedPreferences);
                str = "wam_is_psid_migrated";
                z = sharedPreferences.getBoolean(str, false);
            } else {
                SharedPreferences sharedPreferences2 = (SharedPreferences) r12.A01.getValue();
                C18070vi.A0X(sharedPreferences2);
                str = "wam_is_psid_migrated";
                z = sharedPreferences2.getBoolean(str, false);
            }
        }
        if (!z && z3) {
            z2 = true;
        }
        linkedHashMap.put("ps_id_migration", Boolean.valueOf(z2));
        linkedHashMap.put("beacon_probability", Integer.valueOf(C18020vd.A00(r7, r13, 6977)));
        linkedHashMap.put("storage_size", Long.valueOf(((long) C18020vd.A00(r7, r13, 9822)) * 1024));
        linkedHashMap.put("buffer_timeout", Integer.valueOf(C18020vd.A00(r7, r13, 12399)));
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getAbsolutePath());
        sb.append(File.separator);
        sb.append("wam");
        JniBridge.jvidispatchIOOOO(0, sb.toString(), networkSession, jniBridge.wajContext.get(), linkedHashMap);
        if (z2) {
            synchronized (r12) {
                if (AnonymousClass1Es.A00(r12) >= 2) {
                    SharedPreferences sharedPreferences3 = (SharedPreferences) r12.A00.getValue();
                    C18070vi.A0X(sharedPreferences3);
                    sharedPreferences3.edit().putBoolean(str, true).apply();
                } else {
                    SharedPreferences sharedPreferences4 = (SharedPreferences) r12.A01.getValue();
                    C18070vi.A0X(sharedPreferences4);
                    sharedPreferences4.edit().putBoolean(str, true).apply();
                }
            }
        }
    }
}
