package X;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Csg  reason: case insensitive filesystem */
public final class C26118Csg {
    public static final C25967CpZ A01 = new Object();
    public final Integer A00;

    public final C192929pG A01(SidecarDeviceState sidecarDeviceState, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        C199069zN r3;
        C199059zM r2;
        List list;
        if (sidecarWindowLayoutInfo == null) {
            list = C18460wS.A00;
        } else {
            SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
            C25967CpZ cpZ = A01;
            C25967CpZ.A01(sidecarDeviceState2, cpZ.A02(sidecarDeviceState));
            List<SidecarDisplayFeature> A002 = C25967CpZ.A00(sidecarWindowLayoutInfo);
            C18070vi.A0d(A002, 0);
            ArrayList A13 = AnonymousClass000.A13();
            for (SidecarDisplayFeature sidecarDisplayFeature : A002) {
                C18070vi.A0d(sidecarDisplayFeature, 0);
                Integer num = this.A00;
                D7E d7e = D7E.A00;
                C18070vi.A0d(num, 2);
                C18070vi.A0d(d7e, 3);
                SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new C22724BMl(d7e, num, sidecarDisplayFeature, "SidecarAdapter").A00("Type must be either TYPE_FOLD or TYPE_HINGE", C28127Drl.A00).A00("Feature bounds must not be 0", C28128Drm.A00).A00("TYPE_FOLD must have 0 area", C28129Drn.A00).A00("Feature be pinned to either left or top", C28130Dro.A00).A01();
                if (sidecarDisplayFeature2 != null) {
                    int type = sidecarDisplayFeature2.getType();
                    if (type == 1) {
                        r3 = C199069zN.A01;
                    } else if (type == 2) {
                        r3 = C199069zN.A02;
                    }
                    int A02 = cpZ.A02(sidecarDeviceState2);
                    if (!(A02 == 0 || A02 == 1)) {
                        if (A02 == 2) {
                            r2 = C199059zM.A02;
                        } else if (A02 == 3) {
                            r2 = C199059zM.A01;
                        }
                        Rect rect = sidecarDisplayFeature.getRect();
                        C18070vi.A0X(rect);
                        A13.add(new C20344AHa(new AnonymousClass1Zh(rect), r2, r3));
                    }
                }
            }
            list = A13;
        }
        return new C192929pG(list);
    }

    public C26118Csg(Integer num) {
        this.A00 = num;
    }

    public static final boolean A00(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (C18070vi.A18(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null) {
            return false;
        }
        C25967CpZ cpZ = A01;
        if (cpZ.A02(sidecarDeviceState) != cpZ.A02(sidecarDeviceState2)) {
            return false;
        }
        return true;
    }

    public final boolean A02(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (C18070vi.A18(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        List A002 = C25967CpZ.A00(sidecarWindowLayoutInfo);
        List A003 = C25967CpZ.A00(sidecarWindowLayoutInfo2);
        if (A002 == A003) {
            return true;
        }
        if (!(A002 == null || A003 == null || A002.size() != A003.size())) {
            int size = A002.size();
            int i = 0;
            while (i < size) {
                SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) A002.get(i);
                SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) A003.get(i);
                if (C18070vi.A18(sidecarDisplayFeature, sidecarDisplayFeature2) || (sidecarDisplayFeature != null && sidecarDisplayFeature2 != null && sidecarDisplayFeature.getType() == sidecarDisplayFeature2.getType() && C18070vi.A18(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect()))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public C26118Csg() {
        this(AnonymousClass00R.A0C);
    }
}
