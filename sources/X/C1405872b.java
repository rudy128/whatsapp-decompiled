package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.72b  reason: invalid class name and case insensitive filesystem */
public final class C1405872b {
    public static final Uri A00 = new Uri.Builder().scheme("https").authority("play.google.com").path("store/apps/details").build();
    public static final Uri A01 = new Uri.Builder().scheme("market").authority("details").build();

    public static final Intent A00(Context context, String str, boolean z) {
        List list;
        ActivityInfo activityInfo;
        List list2;
        String str2;
        String str3;
        Uri uri = A01;
        C18070vi.A0Z(uri);
        Intent A012 = A01(uri, str);
        if (!z) {
            A012.addFlags(268435456);
        }
        A012.addFlags(67108864);
        try {
            list = context.getPackageManager().queryIntentActivities(A012, 65536);
            C18070vi.A0X(list);
        } catch (RuntimeException unused) {
            list = AnonymousClass000.A13();
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                activityInfo = null;
                break;
            }
            activityInfo = ((ResolveInfo) it.next()).activityInfo;
            if (activityInfo != null && "com.android.vending".equals(activityInfo.packageName)) {
                break;
            }
        }
        if (activityInfo == null || (str2 = activityInfo.packageName) == null || (str3 = activityInfo.name) == null) {
            try {
                list2 = context.getPackageManager().queryIntentActivities(A012, 65536);
                C18070vi.A0X(list2);
            } catch (RuntimeException unused2) {
                list2 = AnonymousClass000.A13();
            }
            if (AnonymousClass000.A1a(list2)) {
                return A012;
            }
            Uri uri2 = A00;
            C18070vi.A0Z(uri2);
            return A01(uri2, str);
        }
        Intent component = A012.setComponent(new ComponentName(str2, str3));
        C18070vi.A0X(component);
        return component;
    }

    public static final Intent A01(Uri uri, String str) {
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        if ("wa4a".length() != 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("utm_source=");
            A10.append("wa4a");
            if ("wa_bookmark".length() != 0) {
                A10.append("&");
                A10.append("utm_campaign=");
                A10.append("wa_bookmark");
            }
            appendQueryParameter.appendQueryParameter("referrer", A10.toString());
        }
        return new Intent("android.intent.action.VIEW", appendQueryParameter.build());
    }
}
