package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.73g  reason: invalid class name and case insensitive filesystem */
public abstract class C1408373g {
    public static int A00(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass72T.A00(obj);
        }
        try {
            return AnonymousClass000.A0M(C108995ce.A0V(obj.getClass(), obj, "getResId"));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        }
    }

    public static int A01(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass72T.A01(obj);
        }
        try {
            return AnonymousClass000.A0M(C108995ce.A0V(obj.getClass(), obj, "getType"));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.e("IconCompat", AnonymousClass001.A1E(obj, "Unable to get icon type ", AnonymousClass000.A10()), e);
            return -1;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Icon A03(android.content.Context r4, androidx.core.graphics.drawable.IconCompat r5) {
        /*
            int r0 = r5.A02
            r3 = 0
            r2 = 26
            switch(r0) {
                case -1: goto L_0x00a6;
                case 0: goto L_0x0008;
                case 1: goto L_0x008d;
                case 2: goto L_0x0082;
                case 3: goto L_0x0075;
                case 4: goto L_0x006c;
                case 5: goto L_0x0056;
                case 6: goto L_0x000f;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.String r0 = "Unknown type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x000f:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x001e
            android.net.Uri r0 = r5.A0B()
            android.graphics.drawable.Icon r2 = X.AnonymousClass6VF.A00(r0)
            goto L_0x0095
        L_0x001e:
            if (r4 == 0) goto L_0x0040
            java.io.InputStream r0 = r5.A0D(r4)
            if (r0 == 0) goto L_0x002b
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)
            goto L_0x005c
        L_0x002b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Cannot load adaptive icon from uri: "
            r1.append(r0)
            android.net.Uri r0 = r5.A0B()
            r1.append(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0m(r1)
            throw r0
        L_0x0040:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Context is required to resolve the file uri of the icon: "
            r1.append(r0)
            android.net.Uri r0 = r5.A0B()
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0056:
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r0 = r5.A06
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
        L_0x005c:
            if (r1 < r2) goto L_0x0063
            android.graphics.drawable.Icon r2 = X.AnonymousClass6VE.A00(r0)
            goto L_0x0095
        L_0x0063:
            android.graphics.Bitmap r0 = androidx.core.graphics.drawable.IconCompat.A01(r0, r3)
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithBitmap(r0)
            goto L_0x0095
        L_0x006c:
            java.lang.Object r0 = r5.A06
            java.lang.String r0 = (java.lang.String) r0
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithContentUri(r0)
            goto L_0x0095
        L_0x0075:
            java.lang.Object r2 = r5.A06
            byte[] r2 = (byte[]) r2
            int r1 = r5.A00
            int r0 = r5.A01
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithData(r2, r1, r0)
            goto L_0x0095
        L_0x0082:
            java.lang.String r1 = r5.A0E()
            int r0 = r5.A00
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithResource(r1, r0)
            goto L_0x0095
        L_0x008d:
            java.lang.Object r0 = r5.A06
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithBitmap(r0)
        L_0x0095:
            android.content.res.ColorStateList r0 = r5.A03
            if (r0 == 0) goto L_0x009c
            r2.setTintList(r0)
        L_0x009c:
            android.graphics.PorterDuff$Mode r1 = r5.A04
            android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.A0A
            if (r1 == r0) goto L_0x00a5
            r2.setTintMode(r1)
        L_0x00a5:
            return r2
        L_0x00a6:
            java.lang.Object r0 = r5.A06
            android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1408373g.A03(android.content.Context, androidx.core.graphics.drawable.IconCompat):android.graphics.drawable.Icon");
    }

    public static Uri A04(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass72T.A02(obj);
        }
        try {
            return (Uri) C108995ce.A0V(obj.getClass(), obj, "getUri");
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        }
    }

    public static String A05(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AnonymousClass72T.A03(obj);
        }
        try {
            return (String) C108995ce.A0V(obj.getClass(), obj, "getResPackage");
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        }
    }

    public static Drawable A02(Context context, Icon icon) {
        return icon.loadDrawable(context);
    }
}
