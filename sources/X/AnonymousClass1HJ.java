package X;

import android.view.KeyEvent;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.1HJ  reason: invalid class name */
public abstract class AnonymousClass1HJ {
    public static Field A00;
    public static Method A01;
    public static boolean A02;
    public static boolean A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: android.app.Dialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: android.app.Dialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: android.app.Dialog} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.view.KeyEvent r8, android.view.View r9, android.view.Window.Callback r10, X.AnonymousClass1FA r11) {
        /*
            r7 = 0
            if (r11 == 0) goto L_0x00cf
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x000e
            boolean r0 = r11.COl(r8)
            return r0
        L_0x000e:
            boolean r0 = r10 instanceof android.app.Activity
            if (r0 == 0) goto L_0x006c
            android.app.Activity r10 = (android.app.Activity) r10
            r10.onUserInteraction()
            android.view.Window r4 = r10.getWindow()
            r0 = 8
            boolean r0 = r4.hasFeature(r0)
            r6 = 1
            if (r0 == 0) goto L_0x0061
            android.app.ActionBar r5 = r10.getActionBar()
            int r1 = r8.getKeyCode()
            r0 = 82
            if (r1 != r0) goto L_0x0061
            if (r5 == 0) goto L_0x0061
            boolean r0 = A02
            if (r0 != 0) goto L_0x004a
            java.lang.Class r3 = r5.getClass()     // Catch:{ NoSuchMethodException -> 0x0048 }
            java.lang.String r2 = "onMenuKeyEvent"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x0048 }
            java.lang.Class<android.view.KeyEvent> r0 = android.view.KeyEvent.class
            r1[r7] = r0     // Catch:{ NoSuchMethodException -> 0x0048 }
            java.lang.reflect.Method r0 = r3.getMethod(r2, r1)     // Catch:{ NoSuchMethodException -> 0x0048 }
            A01 = r0     // Catch:{ NoSuchMethodException -> 0x0048 }
        L_0x0048:
            A02 = r6
        L_0x004a:
            java.lang.reflect.Method r1 = A01
            if (r1 == 0) goto L_0x0061
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            r0[r7] = r8     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            java.lang.Object r0 = r1.invoke(r5, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            if (r0 == 0) goto L_0x0061
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            boolean r0 = r0.booleanValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            if (r0 == 0) goto L_0x0061
            goto L_0x00be
        L_0x0061:
            boolean r0 = r4.superDispatchKeyEvent(r8)
            if (r0 != 0) goto L_0x00be
            android.view.View r1 = r4.getDecorView()
            goto L_0x00a1
        L_0x006c:
            boolean r0 = r10 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x00c0
            android.app.Dialog r10 = (android.app.Dialog) r10
            boolean r0 = A03
            if (r0 != 0) goto L_0x0086
            r2 = 1
            java.lang.Class<android.app.Dialog> r1 = android.app.Dialog.class
            java.lang.String r0 = "mOnKeyListener"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0084 }
            A00 = r0     // Catch:{ NoSuchFieldException -> 0x0084 }
            r0.setAccessible(r2)     // Catch:{ NoSuchFieldException -> 0x0084 }
        L_0x0084:
            A03 = r2
        L_0x0086:
            java.lang.reflect.Field r0 = A00
            if (r0 == 0) goto L_0x0093
            java.lang.Object r1 = r0.get(r10)     // Catch:{ IllegalAccessException -> 0x0093 }
            android.content.DialogInterface$OnKeyListener r1 = (android.content.DialogInterface.OnKeyListener) r1     // Catch:{ IllegalAccessException -> 0x0093 }
            if (r1 == 0) goto L_0x0093
            goto L_0x00b4
        L_0x0093:
            android.view.Window r1 = r10.getWindow()
            boolean r0 = r1.superDispatchKeyEvent(r8)
            if (r0 != 0) goto L_0x00be
            android.view.View r1 = r1.getDecorView()
        L_0x00a1:
            boolean r0 = X.AnonymousClass1HF.A0u(r1, r8)
            if (r0 != 0) goto L_0x00be
            if (r1 == 0) goto L_0x00b2
            android.view.KeyEvent$DispatcherState r0 = r1.getKeyDispatcherState()
        L_0x00ad:
            boolean r0 = r8.dispatch(r10, r0, r10)
            return r0
        L_0x00b2:
            r0 = 0
            goto L_0x00ad
        L_0x00b4:
            int r0 = r8.getKeyCode()
            boolean r0 = r1.onKey(r10, r0, r8)
            if (r0 == 0) goto L_0x0093
        L_0x00be:
            r0 = 1
            return r0
        L_0x00c0:
            if (r9 == 0) goto L_0x00c8
            boolean r0 = X.AnonymousClass1HF.A0u(r9, r8)
            if (r0 != 0) goto L_0x00ce
        L_0x00c8:
            boolean r0 = r11.COl(r8)
            if (r0 == 0) goto L_0x00cf
        L_0x00ce:
            r7 = 1
        L_0x00cf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HJ.A00(android.view.KeyEvent, android.view.View, android.view.Window$Callback, X.1FA):boolean");
    }

    public static boolean A01(View view, KeyEvent keyEvent) {
        return AnonymousClass1HF.A0v(view, keyEvent);
    }
}
