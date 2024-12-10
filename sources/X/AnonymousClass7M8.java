package X;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7M8  reason: invalid class name */
public final class AnonymousClass7M8 implements AnonymousClass8Ay {
    public final AnonymousClass118 A00;

    public Intent BZ8(List list, int i) {
        String str;
        Object obj;
        if (!(i == 6 || i == 7)) {
            ArrayList A13 = AnonymousClass000.A13();
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C130176j0 r8 = (C130176j0) it.next();
                Uri uri = r8.A02;
                try {
                    JSONObject A15 = C17880vN.A15();
                    A15.put("story_media_caption", r8.A03);
                    A15.put("story_media_uri", uri.toString());
                    A15.put("story_media_video_length_sec", r8.A01);
                    A15.put("story_media_aspect_ratio", r8.A00);
                    A15.put("story_media_link_url", r8.A04);
                    jSONArray.put(A15.toString());
                    A13.add(uri);
                } catch (JSONException e) {
                    Log.w("FBLiteCrossPoster/json", e);
                }
            }
            if (i == 1) {
                str = "image/png";
            } else if (i != 3) {
                str = "*/*";
            } else {
                str = "video/mp4";
            }
            String str2 = "com.facebook.lite.composer.activities.ShareIntentMultiPhotoAlphabeticalAlias";
            if (!(i == 1 || i == 4)) {
                str2 = "com.facebook.lite.composer.activities.ShareIntentVideoAlphabeticalAlias";
            }
            Intent putExtra = C17880vN.A0A().setType(str).setPackage("com.facebook.lite").setComponent(new ComponentName("com.facebook.lite", str2)).addFlags(268435456).putExtra("com.facebook.platform.extra.APPLICATION_ID", "994766073959253").putExtra("editing_disabled", true).putExtra("media_list", jSONArray.toString());
            C18070vi.A0X(putExtra);
            if (list.size() == 1) {
                putExtra.setAction("android.intent.action.SEND").putExtra("android.intent.extra.STREAM", ((C130176j0) C108955ca.A0p(list)).A02);
            } else if (list.size() > 1) {
                putExtra.setAction("android.intent.action.SEND_MULTIPLE").putParcelableArrayListExtra("android.intent.extra.STREAM", A13);
            }
            try {
                obj = this.A00.A00.getPackageManager().queryIntentActivities(putExtra, 65536);
            } catch (Throwable th) {
                obj = C108945cZ.A1J(th);
            }
            Object obj2 = C18460wS.A00;
            if (obj instanceof AnonymousClass1IU) {
                obj = obj2;
            }
            if (!((List) obj).isEmpty()) {
                return putExtra;
            }
        }
        return null;
    }

    public AnonymousClass7M8(AnonymousClass118 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        if (X.AnonymousClass000.A1Y(r0) != false) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bh1() {
        /*
            r7 = this;
            android.content.Intent r0 = X.C17880vN.A0A()
            java.lang.String r6 = "com.facebook.lite"
            android.content.Intent r1 = r0.setPackage(r6)
            java.lang.String r0 = "image/png"
            android.content.Intent r2 = r1.setType(r0)
            java.lang.String r1 = "com.facebook.lite.composer.activities.ShareIntentMultiPhotoAlphabeticalAlias"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r6, r1)
            android.content.Intent r4 = r2.setComponent(r0)
            X.C18070vi.A0X(r4)
            X.118 r0 = r7.A00
            android.content.Context r2 = r0.A00
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            r3 = 0
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r1.queryIntentActivities(r4, r0)     // Catch:{ all -> 0x00a4 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00a4 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a4 }
            r5 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0083
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch:{ all -> 0x00a4 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r6, r3)     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = r0.versionName     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x007e
            java.lang.String r0 = "\\."
            java.util.List r4 = X.C108965cb.A0v(r1, r0, r3)     // Catch:{ all -> 0x0085 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0085 }
            r2 = 1
            if (r0 != 0) goto L_0x0075
            java.util.ListIterator r1 = X.C108955ca.A18(r4)     // Catch:{ all -> 0x0085 }
        L_0x0056:
            boolean r0 = r1.hasPrevious()     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0075
            int r0 = X.C108985cd.A08(r1)     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0056
            java.util.List r0 = X.C108985cd.A0t(r4, r1)     // Catch:{ all -> 0x0085 }
        L_0x0066:
            java.lang.Object r0 = X.C29431cG.A0b(r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0085 }
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0085 }
            r0 = 91
            if (r1 >= r0) goto L_0x0079
            goto L_0x0078
        L_0x0075:
            X.0wS r0 = X.C18460wS.A00     // Catch:{ all -> 0x0085 }
            goto L_0x0066
        L_0x0078:
            r2 = 0
        L_0x0079:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0085 }
            goto L_0x008a
        L_0x007e:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x0085 }
            throw r0     // Catch:{ all -> 0x0085 }
        L_0x0083:
            r5 = 0
            goto L_0x009f
        L_0x0085:
            r0 = move-exception
            X.1IU r0 = X.C108945cZ.A1J(r0)     // Catch:{ all -> 0x00a4 }
        L_0x008a:
            java.lang.Throwable r1 = X.C30671eK.A00(r0)     // Catch:{ all -> 0x00a4 }
            if (r1 == 0) goto L_0x0099
            java.lang.String r0 = "Cannot get FBLite version number"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00a4 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00a4 }
        L_0x0099:
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0083
        L_0x009f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x00a4 }
            goto L_0x00a9
        L_0x00a4:
            r0 = move-exception
            X.1IU r2 = X.C108945cZ.A1J(r0)
        L_0x00a9:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            if (r0 == 0) goto L_0x00b2
            r2 = r1
        L_0x00b2:
            boolean r0 = X.AnonymousClass000.A1Y(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7M8.Bh1():boolean");
    }
}
