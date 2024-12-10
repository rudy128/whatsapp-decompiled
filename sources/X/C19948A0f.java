package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.A0f  reason: case insensitive filesystem */
public class C19948A0f {
    public SharedPreferences A00;
    public final C18010vc A01;

    public static SharedPreferences A00(C19948A0f a0f) {
        SharedPreferences sharedPreferences = a0f.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences A05 = a0f.A01.A05(C19620yd.A09);
        a0f.A00 = A05;
        return A05;
    }

    public C19948A0f(C18010vc r1) {
        this.A01 = r1;
    }

    public void A01(String str) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator A0x = AnonymousClass8BU.A0x(A00(this).getAll());
        while (A0x.hasNext()) {
            String A0v = C17880vN.A0v(A0x);
            if (A0v != null && A0v.startsWith(AnonymousClass001.A1H("gbackup-ResumableUrl-", str, AnonymousClass000.A10()))) {
                A13.add(A0v);
            }
        }
        SharedPreferences.Editor edit = A00(this).edit();
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            edit.remove(C17880vN.A0v(it));
        }
        if (!edit.commit()) {
            Log.w("gdrive-api/remove-all-resumable-uris unable to commit after cleanup to shared prefs.");
        }
    }

    public void A02(String str, String str2) {
        SharedPreferences.Editor edit = A00(this).edit();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("gbackup-ResumableUrl-");
        A10.append(str);
        edit.remove(AnonymousClass001.A1H("-", str2, A10));
        if (!edit.commit()) {
            Log.w("gdrive-api/remove-resumable-uri unable to commit resumable uri to shared prefs.");
        }
    }
}
