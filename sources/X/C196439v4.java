package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: X.9v4  reason: invalid class name and case insensitive filesystem */
public abstract class C196439v4 {
    public static void A00(String str, Bundle bundle) {
        String str2;
        String string;
        try {
            C18220vy.A00();
            if (bundle == null) {
                bundle = C17880vN.A0D();
            }
            Bundle A0D = C17880vN.A0D();
            String string2 = bundle.getString("google.c.a.c_id");
            if (string2 != null) {
                A0D.putString("_nmid", string2);
            }
            String string3 = bundle.getString("google.c.a.c_l");
            if (string3 != null) {
                A0D.putString("_nmn", string3);
            }
            String string4 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string4)) {
                A0D.putString("label", string4);
            }
            String string5 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string5)) {
                A0D.putString("message_channel", string5);
            }
            String string6 = bundle.getString("from");
            if (string6 != null && string6.startsWith("/topics/")) {
                A0D.putString("_nt", string6);
            }
            String string7 = bundle.getString("google.c.a.ts");
            if (string7 != null) {
                try {
                    A0D.putInt("_nmt", Integer.parseInt(string7));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            if (bundle.containsKey("google.c.a.udt") && (string = bundle.getString("google.c.a.udt")) != null) {
                try {
                    A0D.putInt("_ndt", Integer.parseInt(string));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            if (AnonymousClass72P.A01(bundle)) {
                str2 = "display";
            } else {
                str2 = "data";
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                A0D.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Logging to scion event=");
                A10.append(str);
                Log.d("FirebaseMessaging", AnonymousClass001.A1E(A0D, " scionPayload=", A10));
            }
            C18220vy A00 = C18220vy.A00();
            C18220vy.A02(A00);
            A00.A02.BMD(B4j.class);
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean A01(Intent intent) {
        Bundle extras;
        if (intent == null || C17890vO.A1S(intent, "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT") || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }
}
