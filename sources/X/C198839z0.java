package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.util.Log;

/* renamed from: X.9z0  reason: invalid class name and case insensitive filesystem */
public final class C198839z0 {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r7, X.AnonymousClass1L9 r8, java.lang.Integer r9, int r10, int r11) {
        /*
            r6 = this;
            r5 = 1
            X.C18070vi.A0d(r8, r5)
            java.lang.String r0 = "https://one.google.com/storage/whatsapp?utm_source=whatsapp&utm_medium=android"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r0 = "whatsapp"
            if (r11 != r5) goto L_0x00cf
            if (r10 == r5) goto L_0x001e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "_settings"
        L_0x001a:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
        L_0x001e:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r0)
            switch(r10) {
                case 1: goto L_0x0048;
                case 2: goto L_0x004b;
                case 3: goto L_0x004e;
                case 4: goto L_0x0051;
                case 5: goto L_0x00c3;
                case 6: goto L_0x00c7;
                case 7: goto L_0x00cb;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.String r0 = "_fifty_percent_banner"
        L_0x0027:
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r3)
            java.lang.String r0 = "utm_campaign"
            r2.appendQueryParameter(r0, r1)
            android.net.Uri r2 = r2.build()
            X.C18070vi.A0X(r2)
            java.lang.String r1 = "android.intent.action.MAIN"
            java.lang.String r0 = "android.intent.category.APP_BROWSER"
            android.content.Intent r0 = android.content.Intent.makeMainSelectorActivity(r1, r0)
            android.content.Intent r0 = r0.setData(r2)
            X.C18070vi.A0X(r0)
            goto L_0x00d7
        L_0x0048:
            java.lang.String r0 = "_oos_banner"
            goto L_0x0027
        L_0x004b:
            java.lang.String r0 = "_ninety_percent_banner"
            goto L_0x0027
        L_0x004e:
            java.lang.String r0 = "_eighty_percent_banner"
            goto L_0x0027
        L_0x0051:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            r0 = 95
            r4.append(r0)
            if (r9 == 0) goto L_0x00e8
            int r1 = r9.intValue()
            if (r1 != r5) goto L_0x006e
            java.lang.String r0 = "one"
        L_0x0064:
            r4.append(r0)
            java.lang.String r0 = "_gb_banner"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r4)
            goto L_0x0027
        L_0x006e:
            r0 = 2
            if (r1 != r0) goto L_0x0074
            java.lang.String r0 = "two"
            goto L_0x0064
        L_0x0074:
            r0 = 3
            if (r1 != r0) goto L_0x007a
            java.lang.String r0 = "three"
            goto L_0x0064
        L_0x007a:
            r0 = 4
            if (r1 != r0) goto L_0x0080
            java.lang.String r0 = "four"
            goto L_0x0064
        L_0x0080:
            r0 = 5
            if (r1 != r0) goto L_0x0086
            java.lang.String r0 = "five"
            goto L_0x0064
        L_0x0086:
            r0 = 6
            if (r1 != r0) goto L_0x008c
            java.lang.String r0 = "six"
            goto L_0x0064
        L_0x008c:
            r0 = 7
            if (r1 != r0) goto L_0x0092
            java.lang.String r0 = "seven"
            goto L_0x0064
        L_0x0092:
            r0 = 8
            if (r1 != r0) goto L_0x0099
            java.lang.String r0 = "eight"
            goto L_0x0064
        L_0x0099:
            r0 = 9
            if (r1 != r0) goto L_0x00a0
            java.lang.String r0 = "nine"
            goto L_0x0064
        L_0x00a0:
            r0 = 10
            if (r1 != r0) goto L_0x00a7
            java.lang.String r0 = "ten"
            goto L_0x0064
        L_0x00a7:
            r0 = 11
            if (r1 != r0) goto L_0x00ae
            java.lang.String r0 = "eleven"
            goto L_0x0064
        L_0x00ae:
            r0 = 12
            if (r1 != r0) goto L_0x00b5
            java.lang.String r0 = "twelve"
            goto L_0x0064
        L_0x00b5:
            r0 = 13
            if (r1 != r0) goto L_0x00bc
            java.lang.String r0 = "thirteen"
            goto L_0x0064
        L_0x00bc:
            r0 = 14
            if (r1 != r0) goto L_0x00e8
            java.lang.String r0 = "fourteen"
            goto L_0x0064
        L_0x00c3:
            java.lang.String r0 = "_manage_storage"
            goto L_0x0027
        L_0x00c7:
            java.lang.String r0 = "_seventy_percent_banner"
            goto L_0x0027
        L_0x00cb:
            java.lang.String r0 = "_sixty_percent_banner"
            goto L_0x0027
        L_0x00cf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "_home"
            goto L_0x001a
        L_0x00d7:
            r7.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x00e4, SecurityException -> 0x00db }
            return
        L_0x00db:
            java.lang.String r0 = "BackupStorageBanner/openGoogleManageStorageOnWeb/SecurityException"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r6.A00(r7, r2, r8)
            return
        L_0x00e4:
            r6.A00(r7, r2, r8)
            return
        L_0x00e8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid number: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass8BX.A0V(r9, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198839z0.A01(android.content.Context, X.1L9, java.lang.Integer, int, int):void");
    }

    private final void A00(Context context, Uri uri, AnonymousClass1L9 r9) {
        String str;
        Intent data = C17880vN.A0A().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", (String) null));
        C18070vi.A0X(data);
        Intent A0G = C108945cZ.A0G("android.intent.action.VIEW");
        A0G.addCategory("android.intent.category.BROWSABLE");
        A0G.setData(uri);
        A0G.setSelector(data);
        try {
            context.startActivity(A0G);
        } catch (ActivityNotFoundException unused) {
            str = "BackupStorageBanner/handleException/ActivityNotFoundException";
            Log.e(str);
            r9.A08(context, new Intent("android.intent.action.VIEW", uri));
        } catch (SecurityException unused2) {
            str = "BackupStorageBanner/handleException/SecurityException";
            Log.e(str);
            r9.A08(context, new Intent("android.intent.action.VIEW", uri));
        }
    }
}
