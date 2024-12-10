package X;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7M9  reason: invalid class name */
public final class AnonymousClass7M9 implements AnonymousClass8Ay {
    public final AnonymousClass118 A00;

    public Intent BZ8(List list, int i) {
        String str;
        Object obj;
        if (i == 1 || i == 4) {
            str = "image/png";
        } else {
            str = "video/mp4";
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C130176j0 r7 = (C130176j0) it.next();
            Bundle A0D = C17880vN.A0D();
            A0D.putString("story_media_caption", r7.A03);
            A0D.putParcelable("story_media_uri", r7.A02);
            A0D.putInt("story_media_video_length_sec", r7.A01);
            A0D.putDouble("story_media_aspect_ratio", r7.A00);
            String str2 = r7.A04;
            if (str2 != null) {
                A0D.putString("story_media_link_url", str2);
            }
            A13.add(A0D);
        }
        Intent putParcelableArrayListExtra = C17880vN.A0A().setAction("com.facebook.stories.ADD_TO_STORY").setPackage("com.facebook.katana").putExtra("com.facebook.platform.extra.APPLICATION_ID", "994766073959253").putExtra("editing_disabled", true).setType(str).putParcelableArrayListExtra("media_list", A13);
        C18070vi.A0X(putParcelableArrayListExtra);
        try {
            obj = this.A00.A00.getPackageManager().queryIntentActivities(putParcelableArrayListExtra, 65536);
        } catch (Throwable th) {
            obj = C108945cZ.A1J(th);
        }
        Object obj2 = C18460wS.A00;
        if (obj instanceof AnonymousClass1IU) {
            obj = obj2;
        }
        if (((List) obj).isEmpty()) {
            return null;
        }
        return putParcelableArrayListExtra;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        if (X.AnonymousClass000.A1Y(r0) == false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bh1() {
        /*
            r6 = this;
            java.lang.String r0 = "com.facebook.stories.ADD_TO_STORY"
            android.content.Intent r4 = X.C108945cZ.A0G(r0)
            java.lang.String r5 = "com.facebook.katana"
            r4.setPackage(r5)
            java.lang.String r0 = "image/png"
            r4.setType(r0)
            X.118 r0 = r6.A00
            android.content.Context r2 = r0.A00
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            r3 = 0
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r1.queryIntentActivities(r4, r0)     // Catch:{ all -> 0x008d }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x008d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x008d }
            r4 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x006e
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch:{ all -> 0x008d }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r5, r3)     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = r0.versionName     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x0069
            java.lang.String r0 = "\\."
            java.util.List r2 = X.C108965cb.A0v(r1, r0, r3)     // Catch:{ all -> 0x0070 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x0066
            java.util.ListIterator r1 = X.C108955ca.A18(r2)     // Catch:{ all -> 0x0070 }
        L_0x0047:
            boolean r0 = r1.hasPrevious()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0066
            int r0 = X.C108985cd.A08(r1)     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0047
            java.util.List r0 = X.C108985cd.A0t(r2, r1)     // Catch:{ all -> 0x0070 }
        L_0x0057:
            java.lang.Object r0 = X.C29431cG.A0b(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0070 }
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0070 }
            r0 = 227(0xe3, float:3.18E-43)
            if (r1 < r0) goto L_0x006e
            goto L_0x0088
        L_0x0066:
            X.0wS r0 = X.C18460wS.A00     // Catch:{ all -> 0x0070 }
            goto L_0x0057
        L_0x0069:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x006e:
            r4 = 0
            goto L_0x0088
        L_0x0070:
            r0 = move-exception
            X.1IU r0 = X.C108945cZ.A1J(r0)     // Catch:{ all -> 0x008d }
            java.lang.Throwable r1 = r0.exception     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x0082
            java.lang.String r0 = "Cannot get FB version number"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x008d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x008d }
        L_0x0082:
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x006e
        L_0x0088:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x008d }
            goto L_0x0092
        L_0x008d:
            r0 = move-exception
            X.1IU r2 = X.C108945cZ.A1J(r0)
        L_0x0092:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            if (r0 == 0) goto L_0x009b
            r2 = r1
        L_0x009b:
            boolean r0 = X.AnonymousClass000.A1Y(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7M9.Bh1():boolean");
    }

    public AnonymousClass7M9(AnonymousClass118 r1) {
        this.A00 = r1;
    }
}
