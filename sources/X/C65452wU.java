package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.messaging.FirebaseMessaging;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2wU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C65452wU implements SuccessContinuation {
    public final /* synthetic */ FirebaseMessaging A00;
    public final /* synthetic */ C61512po A01;
    public final /* synthetic */ String A02;

    public final Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = this.A00;
        String str = this.A02;
        C61512po r6 = this.A01;
        String str2 = (String) obj;
        Context context = firebaseMessaging.A02;
        C19840z6 A002 = FirebaseMessaging.A00(context);
        String A012 = FirebaseMessaging.A01(firebaseMessaging);
        String A03 = firebaseMessaging.A08.A03();
        synchronized (A002) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject A15 = C17880vN.A15();
                A15.put("token", str2);
                A15.put("appVersion", A03);
                A15.put("timestamp", currentTimeMillis);
                String obj2 = A15.toString();
                if (obj2 != null) {
                    SharedPreferences.Editor edit = A002.A00.edit();
                    edit.putString(C19840z6.A01(A012, str), obj2);
                    edit.commit();
                }
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", AnonymousClass001.A1E(e, "Failed to encode token: ", AnonymousClass000.A10()));
            }
        }
        if (r6 == null || !str2.equals(r6.A02)) {
            C18220vy r4 = firebaseMessaging.A04;
            C18220vy.A02(r4);
            String str3 = r4.A05;
            if ("[DEFAULT]".equals(str3)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Invoking onNewToken for app: ");
                    C18220vy.A02(r4);
                    Log.d("FirebaseMessaging", AnonymousClass000.A0y(str3, A10));
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                C27134DVv dVv = new C27134DVv(0);
                String stringExtra = intent.getStringExtra("gcm.rawData64");
                if (stringExtra != null) {
                    intent.putExtra("rawData", Base64.decode(stringExtra, 0));
                    intent.removeExtra("gcm.rawData64");
                }
                C25924Con.A00(context, intent, dVv);
            }
        }
        zzw zzw = new zzw();
        zzw.zzb(str2);
        return zzw;
    }

    public /* synthetic */ C65452wU(FirebaseMessaging firebaseMessaging, C61512po r2, String str) {
        this.A00 = firebaseMessaging;
        this.A02 = str;
        this.A01 = r2;
    }
}
