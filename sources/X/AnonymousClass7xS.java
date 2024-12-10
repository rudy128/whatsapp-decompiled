package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.whatsapp.util.Log;

/* renamed from: X.7xS  reason: invalid class name */
public final class AnonymousClass7xS extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C128016fJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7xS(C128016fJ r2) {
        super(0);
        this.this$0 = r2;
    }

    public static final boolean A00(Context context, String str) {
        try {
            if (context.getPackageManager() == null) {
                return false;
            }
            try {
                return context.getPackageManager().getPackageInfo(str, 64).signatures != null;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        } catch (Exception e) {
            Log.e("FoaPresenceOnDeviceChecker/isPackageAvailable", e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (A00(r1, "com.facebook.stella_debug") != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r2 = this;
            X.6fJ r0 = r2.this$0
            X.118 r0 = r0.A00
            android.content.Context r1 = X.C108945cZ.A0E(r0)
            java.lang.String r0 = "com.facebook.stella"
            boolean r0 = A00(r1, r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "com.facebook.stella_debug"
            boolean r1 = A00(r1, r0)
            r0 = 0
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7xS.invoke():java.lang.Object");
    }
}
