package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* renamed from: X.1ZS  reason: invalid class name */
public final class AnonymousClass1ZS implements AnonymousClass1ZR {
    public static final AnonymousClass1ZS A00 = new Object();
    public static final ArrayList A01 = AnonymousClass1ZU.A05(1, 2, 4, 8, 16, 32, 64, 128);

    /* JADX WARNING: Removed duplicated region for block: B:40:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Rect A02(android.app.Activity r11) {
        /*
            r10 = this;
            r5 = 0
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.content.res.Resources r0 = r11.getResources()
            android.content.res.Configuration r3 = r0.getConfiguration()
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            java.lang.String r0 = "windowConfiguration"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            java.lang.Object r6 = r1.get(r3)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            boolean r0 = X.AnonymousClass2ST.A00(r11)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            java.lang.String r4 = "null cannot be cast to non-null type android.graphics.Rect"
            if (r0 == 0) goto L_0x0042
            java.lang.Class r3 = r6.getClass()     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            java.lang.String r1 = "getBounds"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r1, r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            java.lang.Object r0 = r1.invoke(r6, r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            X.C18070vi.A0z(r0, r4)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            r2.set(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            goto L_0x006e
        L_0x0042:
            java.lang.Class r3 = r6.getClass()     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            java.lang.String r1 = "getAppBounds"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r1, r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            java.lang.Object r0 = r1.invoke(r6, r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            X.C18070vi.A0z(r0, r4)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            r2.set(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x005d }
            goto L_0x006e
        L_0x005d:
            r1 = move-exception
            java.lang.String r0 = "WindowMetricsCalculatorCompat"
            android.util.Log.w(r0, r1)
            android.view.WindowManager r0 = r11.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getRectSize(r2)
        L_0x006e:
            android.view.WindowManager r0 = r11.getWindowManager()
            android.view.Display r9 = r0.getDefaultDisplay()
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            X.C18070vi.A0X(r9)
            r9.getRealSize(r4)
            boolean r0 = X.AnonymousClass2ST.A00(r11)
            if (r0 != 0) goto L_0x00a4
            android.content.res.Resources r6 = r11.getResources()
            java.lang.String r3 = "dimen"
            java.lang.String r1 = "android"
            java.lang.String r0 = "navigation_bar_height"
            int r0 = r6.getIdentifier(r0, r3, r1)
            if (r0 <= 0) goto L_0x00cc
            int r3 = r6.getDimensionPixelSize(r0)
        L_0x009b:
            int r1 = r2.bottom
            int r1 = r1 + r3
            int r0 = r4.y
            if (r1 != r0) goto L_0x00bb
            r2.bottom = r1
        L_0x00a4:
            int r1 = r2.width()
            int r0 = r4.x
            if (r1 < r0) goto L_0x00b4
            int r1 = r2.height()
            int r0 = r4.y
            if (r1 >= r0) goto L_0x0159
        L_0x00b4:
            boolean r0 = X.AnonymousClass2ST.A00(r11)
            if (r0 != 0) goto L_0x0159
            goto L_0x00ce
        L_0x00bb:
            int r1 = r2.right
            int r1 = r1 + r3
            int r0 = r4.x
            if (r1 != r0) goto L_0x00c5
            r2.right = r1
            goto L_0x00a4
        L_0x00c5:
            int r0 = r2.left
            if (r0 != r3) goto L_0x00a4
            r2.left = r5
            goto L_0x00a4
        L_0x00cc:
            r3 = 0
            goto L_0x009b
        L_0x00ce:
            java.lang.String r0 = "android.view.DisplayInfo"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            r8 = 1
            r1.setAccessible(r8)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            java.lang.Object r7 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            java.lang.Class r6 = r9.getClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            java.lang.String r1 = "getDisplayInfo"
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            java.lang.Class r3 = r7.getClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            r0[r5] = r3     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            java.lang.reflect.Method r1 = r6.getDeclaredMethod(r1, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            r1.setAccessible(r8)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            r0[r5] = r7     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            r1.invoke(r9, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            java.lang.String r0 = "displayCutout"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            r0.setAccessible(r8)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            java.lang.Object r3 = r0.get(r7)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            boolean r0 = r3 instanceof android.view.DisplayCutout     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            if (r0 == 0) goto L_0x011a
            android.view.DisplayCutout r3 = (android.view.DisplayCutout) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0114 }
            goto L_0x011b
        L_0x0114:
            r1 = move-exception
            java.lang.String r0 = "WindowMetricsCalculatorCompat"
            android.util.Log.w(r0, r1)
        L_0x011a:
            r3 = 0
        L_0x011b:
            if (r3 == 0) goto L_0x0159
            int r1 = r2.left
            int r0 = X.C63392sz.A01(r3)
            if (r1 != r0) goto L_0x0127
            r2.left = r5
        L_0x0127:
            int r1 = r4.x
            int r0 = r2.right
            int r1 = r1 - r0
            int r0 = X.C63392sz.A02(r3)
            if (r1 != r0) goto L_0x013b
            int r1 = r2.right
            int r0 = X.C63392sz.A02(r3)
            int r1 = r1 + r0
            r2.right = r1
        L_0x013b:
            int r1 = r2.top
            int r0 = X.C63392sz.A03(r3)
            if (r1 != r0) goto L_0x0145
            r2.top = r5
        L_0x0145:
            int r1 = r4.y
            int r0 = r2.bottom
            int r1 = r1 - r0
            int r0 = X.C63392sz.A00(r3)
            if (r1 != r0) goto L_0x0159
            int r1 = r2.bottom
            int r0 = X.C63392sz.A00(r3)
            int r1 = r1 + r0
            r2.bottom = r1
        L_0x0159:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZS.A02(android.app.Activity):android.graphics.Rect");
    }

    public final Rect A03(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            C18070vi.A0z(invoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) invoke);
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            Log.w("WindowMetricsCalculatorCompat", e);
            return A02(activity);
        }
    }

    public C28211Zi A04(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return AnonymousClass1ZW.A02(context);
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if (!(context2 instanceof Activity) && !(context2 instanceof InputMethodService) && ((ContextWrapper) context2).getBaseContext() != null) {
                context2 = ((ContextWrapper) context2).getBaseContext();
                C18070vi.A0X(context2);
            } else if (context2 instanceof Activity) {
                return BFR((Activity) context);
            } else {
                if (context2 instanceof InputMethodService) {
                    Object systemService = context.getSystemService("window");
                    C18070vi.A0z(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    C18070vi.A0X(defaultDisplay);
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    return new C28211Zi(new C28171Zd().A00.A00(), new AnonymousClass1Zh(new Rect(0, 0, point.x, point.y)));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(context);
                sb.append(" is not a UiContext");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Context ");
        sb2.append(context);
        sb2.append(" is not a UiContext");
        throw new IllegalArgumentException(sb2.toString());
    }

    public C28211Zi BFR(Activity activity) {
        Rect rect;
        int i;
        AnonymousClass1HO A002;
        C18070vi.A0d(activity, 0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            rect = AnonymousClass1ZW.A00(activity);
            A002 = A00(activity);
        } else {
            if (i2 >= 29) {
                rect = A03(activity);
            } else if (i2 >= 28) {
                rect = A02(activity);
            } else if (i2 >= 24) {
                rect = A01(activity);
            } else {
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                C18070vi.A0X(defaultDisplay);
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect();
                int i3 = point.x;
                if (i3 == 0 || (i = point.y) == 0) {
                    defaultDisplay.getRectSize(rect);
                } else {
                    rect.right = i3;
                    rect.bottom = i;
                }
            }
            A002 = new C28171Zd().A00.A00();
        }
        return new C28211Zi(A002, new AnonymousClass1Zh(rect));
    }

    public static final AnonymousClass1HO A00(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return AnonymousClass1ZW.A01(context);
        }
        throw new Exception("Incompatible SDK version");
    }

    public final Rect A01(Activity activity) {
        int i;
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!AnonymousClass2ST.A00(activity)) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            int i2 = rect.bottom + i;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + i;
                if (i3 == point.x) {
                    rect.right = i3;
                    return rect;
                }
            }
        }
        return rect;
    }
}
