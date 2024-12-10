package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4aU  reason: invalid class name */
public abstract class AnonymousClass4aU {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.content.Intent[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent A01(android.content.IntentSender r6, java.lang.CharSequence r7, java.util.List r8) {
        /*
            r5 = 0
            java.lang.Object r2 = r8.get(r5)
            android.content.Intent r2 = (android.content.Intent) r2
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 < r0) goto L_0x002c
            if (r6 == 0) goto L_0x002c
            android.content.Intent r4 = android.content.Intent.createChooser(r2, r7, r6)
        L_0x0013:
            int r3 = X.AnonymousClass3MX.A01(r8)
            if (r3 <= 0) goto L_0x002b
            android.content.Intent[] r2 = new android.content.Intent[r3]
        L_0x001b:
            int r1 = r5 + 1
            java.lang.Object r0 = r8.get(r1)
            r2[r5] = r0
            r5 = r1
            if (r1 < r3) goto L_0x001b
            java.lang.String r0 = "android.intent.extra.INITIAL_INTENTS"
            r4.putExtra(r0, r2)
        L_0x002b:
            return r4
        L_0x002c:
            android.content.Intent r4 = android.content.Intent.createChooser(r2, r7)
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4aU.A01(android.content.IntentSender, java.lang.CharSequence, java.util.List):android.content.Intent");
    }

    public static Intent A00(Intent intent, AnonymousClass205 r5) {
        if (!intent.hasExtra("fMessageKeyJid") && !intent.hasExtra("fMessageKeyFromMe") && !intent.hasExtra("fMessageKeyId")) {
            return intent.putExtra("fMessageKeyId", r5.A01).putExtra("fMessageKeyFromMe", r5.A02).putExtra("fMessageKeyJid", C22971Dz.A06(r5.A00));
        }
        throw AnonymousClass000.A0k("Intent already contains key.");
    }

    public static AnonymousClass205 A02(Intent intent) {
        if (!intent.hasExtra("fMessageKeyJid") || !intent.hasExtra("fMessageKeyFromMe") || !intent.hasExtra("fMessageKeyId")) {
            return null;
        }
        return new AnonymousClass205(AnonymousClass3MX.A0l(intent.getStringExtra("fMessageKeyJid")), intent.getStringExtra("fMessageKeyId"), AnonymousClass3MY.A1a(intent, "fMessageKeyFromMe"));
    }

    public static ArrayList A04(Bundle bundle) {
        if (!bundle.containsKey("fMessageKeyJidArray") || !bundle.containsKey("fMessageKeyFromMeArray") || !bundle.containsKey("fMessageKeyIdArray")) {
            return null;
        }
        String[] stringArray = bundle.getStringArray("fMessageKeyIdArray");
        C17960vV.A07(stringArray);
        boolean[] booleanArray = bundle.getBooleanArray("fMessageKeyFromMeArray");
        C17960vV.A07(booleanArray);
        String[] stringArray2 = bundle.getStringArray("fMessageKeyJidArray");
        C17960vV.A07(stringArray2);
        int length = stringArray.length;
        ArrayList A0z = C17880vN.A0z(length);
        for (int i = 0; i < length; i++) {
            A0z.add(new AnonymousClass205(AnonymousClass3MX.A0l(stringArray2[i]), stringArray[i], booleanArray[i]));
        }
        return A0z;
    }

    public static void A05(Activity activity) {
        A07(activity, "com.whatsapp");
    }

    public static void A06(Activity activity) {
        try {
            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", "com.whatsapp");
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(new Intent("android.settings.SETTINGS"));
        }
    }

    public static void A07(Activity activity, String str) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", str, (String) null));
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(new Intent("android.settings.SETTINGS"));
        }
    }

    public static void A08(Intent intent, Collection collection) {
        Bundle bundle = new Bundle();
        A0C(bundle, collection);
        intent.putExtra("message_keys", bundle);
    }

    public static void A09(Intent intent, Collection collection) {
        if (!intent.hasExtra("fMessageKeyBundle")) {
            Bundle A0D = C17880vN.A0D();
            A0C(A0D, collection);
            intent.putExtra("fMessageKeyBundle", A0D);
            return;
        }
        throw AnonymousClass000.A0k("Intent already contains a bundle with fMessage keys");
    }

    public static void A0A(Bundle bundle, AnonymousClass205 r2) {
        A0B(bundle, r2, "");
    }

    public static void A0C(Bundle bundle, Collection collection) {
        if (bundle.containsKey("fMessageKeyJidArray") || bundle.containsKey("fMessageKeyFromMeArray") || bundle.containsKey("fMessageKeyIdArray")) {
            throw AnonymousClass000.A0k("Bundle already contains list of keys.");
        }
        String[] strArr = new String[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        String[] strArr2 = new String[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            AnonymousClass205 r1 = (AnonymousClass205) it.next();
            strArr[i] = r1.A01;
            zArr[i] = r1.A02;
            strArr2[i] = C22971Dz.A06(r1.A00);
            i++;
        }
        bundle.putStringArray("fMessageKeyIdArray", strArr);
        bundle.putBooleanArray("fMessageKeyFromMeArray", zArr);
        bundle.putStringArray("fMessageKeyJidArray", strArr2);
    }

    public static AnonymousClass205 A03(Bundle bundle, String str) {
        String A0y = AnonymousClass000.A0y("fMessageKeyJid", AnonymousClass000.A11(str));
        String A0y2 = AnonymousClass000.A0y("fMessageKeyFromMe", AnonymousClass000.A11(str));
        String A0y3 = AnonymousClass000.A0y("fMessageKeyId", AnonymousClass000.A11(str));
        if (!bundle.containsKey(A0y) || !bundle.containsKey(A0y2) || !bundle.containsKey(A0y3)) {
            return null;
        }
        return new AnonymousClass205(C72463Mc.A0f(bundle, A0y), bundle.getString(A0y3), bundle.getBoolean(A0y2, false));
    }

    public static void A0B(Bundle bundle, AnonymousClass205 r5, String str) {
        String A0y = AnonymousClass000.A0y("fMessageKeyJid", AnonymousClass000.A11(str));
        String A0y2 = AnonymousClass000.A0y("fMessageKeyFromMe", AnonymousClass000.A11(str));
        String A0y3 = AnonymousClass000.A0y("fMessageKeyId", AnonymousClass000.A11(str));
        if (bundle.containsKey(A0y3) || bundle.containsKey(A0y2) || bundle.containsKey(A0y3)) {
            throw AnonymousClass000.A0k("Bundle already contains key.");
        }
        bundle.putString(A0y3, r5.A01);
        bundle.putBoolean(A0y2, r5.A02);
        bundle.putString(A0y, C22971Dz.A06(r5.A00));
    }
}
