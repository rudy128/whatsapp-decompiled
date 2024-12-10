package X;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public final class D7U implements E7F {
    public D7T A00;
    public final C26118Csg A01;
    public final SidecarInterface A02;
    public final Map A03 = C17880vN.A13();
    public final Map A04 = C17880vN.A13();

    public final void A02(Activity activity, IBinder iBinder) {
        Map map = this.A04;
        map.put(iBinder, activity);
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (map.size() == 1 && sidecarInterface != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        D7T d7t = this.A00;
        if (d7t != null) {
            d7t.CAc(activity, A00(activity));
        }
        Map map2 = this.A03;
        if (map2.get(activity) == null && (activity instanceof AnonymousClass1FF)) {
            D6J d6j = new D6J(activity, this, 0);
            map2.put(activity, d6j);
            ((AnonymousClass1FF) activity).BBQ(d6j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051 A[Catch:{ NoSuchFieldError -> 0x00dd, all -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bd A[Catch:{ NoSuchFieldError -> 0x00dd, all -> 0x0121 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r8 = this;
            r2 = 0
            androidx.window.sidecar.SidecarInterface r7 = r8.A02     // Catch:{ all -> 0x0121 }
            r5 = 0
            r6 = 1
            if (r7 == 0) goto L_0x0026
            java.lang.Class r4 = r7.getClass()     // Catch:{ all -> 0x0121 }
            if (r4 == 0) goto L_0x0026
            java.lang.String r3 = "setSidecarCallback"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x0121 }
            java.lang.Class<androidx.window.sidecar.SidecarInterface$SidecarCallback> r0 = androidx.window.sidecar.SidecarInterface.SidecarCallback.class
            java.lang.reflect.Method r0 = X.BE6.A0x(r4, r0, r3, r1, r2)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0026
            java.lang.Class r3 = r0.getReturnType()     // Catch:{ all -> 0x0121 }
        L_0x001d:
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ all -> 0x0121 }
            boolean r0 = X.C18070vi.A18(r3, r0)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00cd
            goto L_0x0028
        L_0x0026:
            r3 = r5
            goto L_0x001d
        L_0x0028:
            if (r7 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r3 = r5
            goto L_0x0049
        L_0x002d:
            r7.getDeviceState()     // Catch:{ all -> 0x0121 }
            r7.onDeviceStateListenersChanged(r6)     // Catch:{ all -> 0x0121 }
            java.lang.Class r4 = r7.getClass()     // Catch:{ all -> 0x0121 }
            if (r4 == 0) goto L_0x002b
            java.lang.String r3 = "getWindowLayoutInfo"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x0121 }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.reflect.Method r0 = X.BE6.A0x(r4, r0, r3, r1, r2)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x002b
            java.lang.Class r3 = r0.getReturnType()     // Catch:{ all -> 0x0121 }
        L_0x0049:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r0 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            boolean r0 = X.C18070vi.A18(r3, r0)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00bd
            if (r7 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r3 = r5
            goto L_0x006c
        L_0x0056:
            java.lang.Class r4 = r7.getClass()     // Catch:{ all -> 0x0121 }
            if (r4 == 0) goto L_0x0054
            java.lang.String r3 = "onWindowLayoutChangeListenerAdded"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x0121 }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.reflect.Method r0 = X.BE6.A0x(r4, r0, r3, r1, r2)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0054
            java.lang.Class r3 = r0.getReturnType()     // Catch:{ all -> 0x0121 }
        L_0x006c:
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ all -> 0x0121 }
            boolean r0 = X.C18070vi.A18(r3, r0)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00ad
            if (r7 == 0) goto L_0x008c
            java.lang.Class r4 = r7.getClass()     // Catch:{ all -> 0x0121 }
            if (r4 == 0) goto L_0x008c
            java.lang.String r3 = "onWindowLayoutChangeListenerRemoved"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x0121 }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            java.lang.reflect.Method r0 = X.BE6.A0x(r4, r0, r3, r1, r2)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x008c
            java.lang.Class r5 = r0.getReturnType()     // Catch:{ all -> 0x0121 }
        L_0x008c:
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ all -> 0x0121 }
            boolean r0 = X.C18070vi.A18(r5, r0)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x009d
            androidx.window.sidecar.SidecarDeviceState r5 = new androidx.window.sidecar.SidecarDeviceState     // Catch:{ all -> 0x0121 }
            r5.<init>()     // Catch:{ all -> 0x0121 }
            r4 = 3
            r5.posture = r4     // Catch:{ NoSuchFieldError -> 0x00dd }
            goto L_0x0106
        L_0x009d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            java.lang.String r0 = X.AnonymousClass001.A1E(r5, r0, r1)     // Catch:{ all -> 0x0121 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0121 }
            r1.<init>(r0)     // Catch:{ all -> 0x0121 }
            goto L_0x0105
        L_0x00ad:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)     // Catch:{ all -> 0x0121 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0121 }
            r1.<init>(r0)     // Catch:{ all -> 0x0121 }
            goto L_0x0105
        L_0x00bd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "Illegal return type for 'getWindowLayoutInfo': "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)     // Catch:{ all -> 0x0121 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0121 }
            r1.<init>(r0)     // Catch:{ all -> 0x0121 }
            goto L_0x0105
        L_0x00cd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "Illegal return type for 'setSidecarCallback': "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)     // Catch:{ all -> 0x0121 }
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x0121 }
            r1.<init>(r0)     // Catch:{ all -> 0x0121 }
            goto L_0x0105
        L_0x00dd:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r3 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r0 = "setPosture"
            java.lang.reflect.Method r1 = X.BE9.A0v(r3, r0)     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0121 }
            X.C17880vN.A1T(r0, r4, r2)     // Catch:{ all -> 0x0121 }
            r1.invoke(r5, r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "getPosture"
            java.lang.Object r1 = X.C108995ce.A0V(r3, r5, r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x0121 }
            int r0 = X.BE6.A0F(r1)     // Catch:{ all -> 0x0121 }
            if (r0 == r4) goto L_0x0106
            java.lang.String r0 = "Invalid device posture getter/setter"
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x0121 }
            r1.<init>(r0)     // Catch:{ all -> 0x0121 }
        L_0x0105:
            throw r1     // Catch:{ all -> 0x0121 }
        L_0x0106:
            androidx.window.sidecar.SidecarDisplayFeature r1 = new androidx.window.sidecar.SidecarDisplayFeature     // Catch:{ all -> 0x0121 }
            r1.<init>()     // Catch:{ all -> 0x0121 }
            android.graphics.Rect r0 = r1.getRect()     // Catch:{ all -> 0x0121 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0121 }
            r1.setRect(r0)     // Catch:{ all -> 0x0121 }
            r1.getType()     // Catch:{ all -> 0x0121 }
            r1.setType(r6)     // Catch:{ all -> 0x0121 }
            androidx.window.sidecar.SidecarWindowLayoutInfo r0 = new androidx.window.sidecar.SidecarWindowLayoutInfo     // Catch:{ all -> 0x0121 }
            r0.<init>()     // Catch:{ all -> 0x0121 }
            r2 = 1
        L_0x0121:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D7U.A03():boolean");
    }

    public final SidecarInterface A01() {
        return this.A02;
    }

    public void CIp(E3i e3i) {
        this.A00 = new D7T(e3i);
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.A01, new SidecarCompat$TranslatingCallback(this)));
        }
    }

    public D7U(Context context) {
        SidecarInterface sidecarImpl = SidecarProvider.getSidecarImpl(context.getApplicationContext());
        C26118Csg csg = new C26118Csg(AnonymousClass00R.A0C);
        this.A02 = sidecarImpl;
        this.A01 = csg;
    }

    public final C192929pG A00(Activity activity) {
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo;
        SidecarDeviceState sidecarDeviceState;
        IBinder A002 = C24511C7f.A00(activity);
        if (A002 == null) {
            return new C192929pG(C18460wS.A00);
        }
        SidecarInterface sidecarInterface = this.A02;
        if (sidecarInterface != null) {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(A002);
        } else {
            sidecarWindowLayoutInfo = null;
        }
        C26118Csg csg = this.A01;
        if (sidecarInterface == null || (sidecarDeviceState = sidecarInterface.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return csg.A01(sidecarDeviceState, sidecarWindowLayoutInfo);
    }

    public void CAb(Activity activity) {
        IBinder A002 = C24511C7f.A00(activity);
        if (A002 != null) {
            SidecarInterface sidecarInterface = this.A02;
            if (sidecarInterface != null) {
                sidecarInterface.onWindowLayoutChangeListenerRemoved(A002);
            }
            Map map = this.A03;
            AnonymousClass1GV r1 = (AnonymousClass1GV) map.get(activity);
            if (r1 != null) {
                if (activity instanceof AnonymousClass1FF) {
                    ((AnonymousClass1FF) activity).CEp(r1);
                }
                map.remove(activity);
            }
            D7T d7t = this.A00;
            if (d7t != null) {
                ReentrantLock reentrantLock = d7t.A01;
                reentrantLock.lock();
                try {
                    d7t.A00.put(activity, (Object) null);
                } finally {
                    reentrantLock.unlock();
                }
            }
            Map map2 = this.A04;
            boolean A1T = AnonymousClass000.A1T(map2.size(), 1);
            map2.remove(A002);
            if (A1T && sidecarInterface != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }
}
