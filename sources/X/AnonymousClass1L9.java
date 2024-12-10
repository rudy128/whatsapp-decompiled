package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import com.whatsapp.util.Log;

/* renamed from: X.1L9  reason: invalid class name */
public class AnonymousClass1L9 implements AnonymousClass1L8 {
    public C18030ve A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11P A02;

    public static boolean A07(Intent intent, AnonymousClass1F9 r4, int i) {
        try {
            if (r4 instanceof Activity) {
                A5E.A00().A02().A02((Activity) r4, intent, i);
                return true;
            }
            if (r4 instanceof Fragment) {
                A5E.A00().A02().A04(intent, (Fragment) r4, i);
                return true;
            }
            return false;
        } catch (ActivityNotFoundException | SecurityException e) {
            Log.e("app/try-start-activity ", e);
        }
    }

    public void A0B(Context context, Intent intent, String str) {
        boolean z = true;
        boolean z2 = false;
        if (context != null) {
            z2 = true;
        }
        C17960vV.A0G(z2, "Context must not be null");
        boolean z3 = false;
        if (intent != null) {
            z3 = true;
        }
        C17960vV.A0G(z3, "Intent cannot be null to launch the activity");
        if (str == null) {
            z = false;
        }
        C17960vV.A0G(z, "Origin cannot be null");
        C60442o2.A00(intent, this.A02, str);
        A08(context, intent);
    }

    public void CGV(Context context, Uri uri, AnonymousClass206 r3, int i) {
    }

    public void CGW(Context context, Uri uri, AnonymousClass206 r3, int i, int i2) {
    }

    public static void A02(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void A03(View view, WindowManager windowManager) {
        int i;
        int identifier;
        if (view != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            Resources resources = view.getContext().getResources();
            if (!Build.MANUFACTURER.equalsIgnoreCase("Essential Products") || !Build.MODEL.equalsIgnoreCase("PH-1") || resources.getConfiguration().orientation != 2 || (identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) {
                i = 0;
            } else {
                i = resources.getDimensionPixelSize(identifier);
            }
            view.getLayoutParams().width = point.x - i;
        }
    }

    public static void A04(Window window) {
        if (Build.VERSION.SDK_INT >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    public void A08(Context context, Intent intent) {
        AnonymousClass1KB r2 = this.A01;
        if (!A05(context, intent)) {
            r2.A08(2131886448, 0);
        }
    }

    public void A0C(Context context, Uri uri) {
        Intent A002;
        if (!C18020vd.A05(C18040vf.A02, this.A00, 2428) || (A002 = C137576vg.A00(context, uri, true)) == null || !A05(context, A002)) {
            Intent A003 = C137576vg.A00(context, uri, false);
            C17960vV.A07(A003);
            if (!A05(context, A003)) {
                Intent intent = new Intent(A003);
                intent.addCategory("android.intent.category.BROWSABLE");
                if (!A06(context, intent)) {
                    this.A01.A08(2131886448, 0);
                }
            }
        }
    }

    @Deprecated
    public void CGU(Context context, Uri uri, AnonymousClass206 r7) {
        Intent A002;
        if (uri == null) {
            Log.e("activity-utils/start-activity/uri-is-null");
            return;
        }
        if (!C18020vd.A05(C18040vf.A02, this.A00, 2428) || (A002 = C137576vg.A00(context, uri, true)) == null || !A05(context, A002)) {
            Intent A003 = C137576vg.A00(context, uri, false);
            C17960vV.A07(A003);
            if (!A05(context, A003)) {
                Intent intent = new Intent(A003);
                intent.addCategory("android.intent.category.BROWSABLE");
                if (!A05(context, intent)) {
                    this.A01.A08(2131886448, 0);
                }
            }
        }
    }

    public AnonymousClass1L9(AnonymousClass1KB r1, AnonymousClass11P r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public static Activity A00(Context context) {
        Activity A002 = C18050vg.A00(context);
        if (A002 != null) {
            return A002;
        }
        throw new IllegalStateException("The Context is not an Activity.");
    }

    public static Activity A01(Context context, Class cls) {
        Activity A002 = A00(context);
        if (cls.isAssignableFrom(A002.getClass())) {
            return A002;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Context is not assignable from class ");
        sb.append(cls.getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if ((r6.getFlags() & 268435456) != 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(android.content.Context r5, android.content.Intent r6) {
        /*
            android.app.Activity r0 = X.C18050vg.A00(r5)
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0012
            int r2 = r6.getFlags()
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r0
            r1 = 0
            if (r2 == 0) goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            java.lang.String r0 = "Need to use activity context or FLAG_ACTIVITY_NEW_TASK flag"
            X.C17960vV.A0G(r1, r0)
            r5.startActivity(r6)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x001c }
            return r3
        L_0x001c:
            r1 = move-exception
            java.lang.String r0 = "app/try-start-activity "
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1L9.A05(android.content.Context, android.content.Intent):boolean");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.8QZ, X.8Qd] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.8Qk, X.A8B] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0047, code lost:
        com.whatsapp.util.Log.e("app/try-start-activity ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if ((r8.getFlags() & 268435456) != 0) goto L_0x0012;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(android.content.Context r7, android.content.Intent r8) {
        /*
            android.app.Activity r0 = X.C18050vg.A00(r7)
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L_0x0012
            int r2 = r8.getFlags()
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r0
            r1 = 0
            if (r2 == 0) goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            java.lang.String r0 = "Need to use activity context or FLAG_ACTIVITY_NEW_TASK flag"
            X.C17960vV.A0G(r1, r0)
            X.A5E r4 = X.A5E.A00()     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0046 }
            monitor-enter(r4)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0046 }
            X.8QZ r3 = r4.A01     // Catch:{ all -> 0x0043 }
            if (r3 != 0) goto L_0x003e
            X.8Qk r2 = r4.A03     // Catch:{ all -> 0x003c }
            if (r2 != 0) goto L_0x0030
            X.9xA r1 = X.A5E.A0I     // Catch:{ all -> 0x003c }
            X.AIv r0 = X.A5E.A0H     // Catch:{ all -> 0x003c }
            X.8Qk r2 = new X.8Qk     // Catch:{ all -> 0x003c }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x003c }
            r4.A03 = r2     // Catch:{ all -> 0x003c }
        L_0x0030:
            java.util.Set r1 = r4.A0D     // Catch:{ all -> 0x0043 }
            java.util.List r0 = r4.A0C     // Catch:{ all -> 0x0043 }
            X.8QZ r3 = new X.8QZ     // Catch:{ all -> 0x0043 }
            r3.<init>(r2, r0, r1)     // Catch:{ all -> 0x0043 }
            r4.A01 = r3     // Catch:{ all -> 0x0043 }
            goto L_0x003e
        L_0x003c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x003e:
            monitor-exit(r4)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0046 }
            r3.A05(r7, r8)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0046 }
            return r5
        L_0x0043:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0046 }
            throw r0     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0046 }
        L_0x0046:
            r1 = move-exception
            java.lang.String r0 = "app/try-start-activity "
            com.whatsapp.util.Log.e(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1L9.A06(android.content.Context, android.content.Intent):boolean");
    }

    public void A09(Context context, Intent intent) {
        A0B(context, intent, context.getClass().getSimpleName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if ((r5.getFlags() & 268435456) != 0) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            android.app.Activity r0 = X.C18050vg.A00(r4)
            if (r0 != 0) goto L_0x0010
            int r2 = r5.getFlags()
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r0
            r1 = 0
            if (r2 == 0) goto L_0x0011
        L_0x0010:
            r1 = 1
        L_0x0011:
            java.lang.String r0 = "Need to use activity context or FLAG_ACTIVITY_NEW_TASK flag"
            X.C17960vV.A0G(r1, r0)
            X.A5E r0 = X.A5E.A00()     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0022 }
            X.8Qb r0 = r0.A02()     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0022 }
            r0.A05(r4, r5)     // Catch:{ ActivityNotFoundException | SecurityException -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            java.lang.String r0 = "app/try-start-activity "
            com.whatsapp.util.Log.e(r0, r1)
            X.1KB r2 = r3.A01
            r1 = 2131886448(0x7f120170, float:1.9407475E38)
            r0 = 0
            r2.A08(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1L9.A0A(android.content.Context, android.content.Intent):void");
    }

    public boolean A0D(Activity activity, Intent intent, int i) {
        try {
            activity.startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException | SecurityException e) {
            Log.e("app/start-activity-for-result ", e);
            this.A01.A08(2131886448, 0);
            return false;
        }
    }
}
