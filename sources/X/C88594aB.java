package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.4aB  reason: invalid class name and case insensitive filesystem */
public abstract class C88594aB {
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable A02(android.content.Context r2, android.content.res.Resources r3, X.C18030ve r4) {
        /*
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0013
            java.lang.Class<X.02x> r0 = X.C006602x.class
            java.lang.Object r0 = X.C000400h.A00(r0, r2)
            X.02x r0 = (X.C006602x) r0
            r0.AHr()
        L_0x0013:
            if (r4 == 0) goto L_0x002b
            r1 = 11925(0x2e95, float:1.671E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x002b
            X.3N2 r1 = X.C83944Hg.A00(r2)
            if (r1 != 0) goto L_0x002a
        L_0x0025:
            java.lang.String r0 = "wallpaper/cannot decode default wallpaper"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x002a:
            return r1
        L_0x002b:
            android.graphics.Bitmap r0 = A00(r2, r3)
            if (r0 == 0) goto L_0x0037
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            r1.<init>(r3, r0)
            return r1
        L_0x0037:
            r1 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88594aB.A02(android.content.Context, android.content.res.Resources, X.0ve):android.graphics.drawable.Drawable");
    }

    public static AnonymousClass1BI A04(Intent intent) {
        return AnonymousClass3MX.A0l(intent.getStringExtra("chat_jid"));
    }

    public static Bitmap A00(Context context, Resources resources) {
        InputStream openRawResource;
        Point A00 = AnonymousClass4aW.A00(context);
        try {
            openRawResource = resources.openRawResource(2131231317);
            Bitmap A0O = C72453Mb.A0O(A00, openRawResource, true);
            if (openRawResource != null) {
                openRawResource.close();
            }
            if (A0O != null) {
                A0O.setDensity(0);
            }
            return A0O;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public static Drawable A01(Context context, int i) {
        return AnonymousClass4aX.A08(AnonymousClass3MX.A06(context, 2131233686), context.getResources().getIntArray(2130903082)[i]);
    }

    public static AnonymousClass1BI A03(Activity activity) {
        return A04(activity.getIntent());
    }
}
