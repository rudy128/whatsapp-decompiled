package X;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.CpZ  reason: case insensitive filesystem */
public final class C25967CpZ {
    public static final void A01(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            sidecarDeviceState.posture = i;
        } catch (NoSuchFieldError unused) {
            try {
                Method A0v = BE9.A0v(SidecarDeviceState.class, "setPosture");
                Object[] objArr = new Object[1];
                C17880vN.A1T(objArr, i, 0);
                A0v.invoke(sidecarDeviceState, objArr);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }

    public static final List A00(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        try {
            List list = sidecarWindowLayoutInfo.displayFeatures;
            if (list == null) {
                return C18460wS.A00;
            }
            return list;
        } catch (NoSuchFieldError unused) {
            try {
                return BE6.A13(C108995ce.A0V(SidecarWindowLayoutInfo.class, sidecarWindowLayoutInfo, "getDisplayFeatures"), "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return C18460wS.A00;
            }
        }
    }

    public final int A02(SidecarDeviceState sidecarDeviceState) {
        int i;
        try {
            i = sidecarDeviceState.posture;
        } catch (NoSuchFieldError unused) {
            try {
                Object A0V = C108995ce.A0V(SidecarDeviceState.class, sidecarDeviceState, "getPosture");
                C18070vi.A0z(A0V, "null cannot be cast to non-null type kotlin.Int");
                i = AnonymousClass000.A0M(A0V);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return 0;
            }
        }
        if (i < 0 || i > 4) {
            return 0;
        }
        return i;
    }
}
