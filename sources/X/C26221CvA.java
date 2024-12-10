package X;

import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: X.CvA  reason: case insensitive filesystem */
public class C26221CvA {
    public static int A06;
    public static boolean A07;
    public static boolean A08;
    public static volatile boolean A09;
    public Map A00 = Collections.emptyMap();
    public final C25850CnB A01;
    public final PackageManager A02;
    public final CameraManager A03;
    public final C26035Cqv A04;
    public volatile CPY[] A05 = null;

    public int A05(int i, int i2, int i3) {
        if (i3 != -1) {
            try {
                int i4 = ((i3 + 45) / 90) * 90;
                if (A01(this, i).A01 == 0) {
                    return ((i2 - i4) + 360) % 360;
                }
                return (i2 + i4) % 360;
            } catch (CameraAccessException e) {
                C26175Cts.A02("CameraInventory", C17900vP.A0C("Failed to get info to calculate media rotation: ", AnonymousClass000.A10(), e));
            }
        }
        return 0;
    }

    private int A00(int i) {
        if (this.A05 == null) {
            A02(this);
        }
        if (!(this.A05 == null || this.A05.length == 0)) {
            for (int i2 = 0; i2 < this.A05.length; i2++) {
                if (this.A05[i2].A00 == i) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static CPY A01(C26221CvA cvA, int i) {
        if (cvA.A05 == null) {
            A02(cvA);
        }
        int A002 = cvA.A00(i);
        if (A002 != -1) {
            CPY[] cpyArr = cvA.A05;
            C28111Yx.A02(cpyArr);
            return cpyArr[A002];
        }
        throw AnonymousClass000.A0k("Camera facing did not resolve to a camera info instance");
    }

    public static void A02(C26221CvA cvA) {
        if (cvA.A05 == null) {
            C25850CnB cnB = cvA.A01;
            if (cnB.A09()) {
                A03(cvA);
                return;
            }
            try {
                cnB.A01(new C22896BUh(), new C27132DVt((Object) cvA, 13)).get();
            } catch (InterruptedException | ExecutionException e) {
                C26175Cts.A02("CameraInventory", C17900vP.A0C("failed to load camera infos: ", AnonymousClass000.A10(), e));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.CPY[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C26221CvA r14) {
        /*
            android.hardware.camera2.CameraManager r10 = r14.A03
            X.C28111Yx.A02(r10)
            java.lang.String[] r9 = r10.getCameraIdList()
            int r8 = r9.length
            java.util.HashMap r7 = X.C17880vN.A11()
            r13 = 0
            r6 = 0
            r12 = 0
            r11 = 0
        L_0x0012:
            r4 = 1
            if (r6 >= r8) goto L_0x0056
            r5 = r9[r6]
            android.hardware.camera2.CameraCharacteristics r1 = r10.getCameraCharacteristics(r5)
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            r0.getClass()
            int r3 = r0.intValue()
            boolean r2 = X.AnonymousClass000.A1S(r3, r4)
            java.util.Map r0 = r14.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0040
            boolean r0 = r7.containsKey(r1)
            if (r0 != 0) goto L_0x0051
        L_0x0040:
            java.util.Map r0 = r14.A00
            java.lang.String r0 = X.C17880vN.A0s(r1, r0)
            if (r0 == 0) goto L_0x0049
            r5 = r0
        L_0x0049:
            X.CPY r0 = new X.CPY
            r0.<init>(r2, r5, r3)
            r7.put(r1, r0)
        L_0x0051:
            if (r2 == 0) goto L_0x0070
            r11 = 1
            if (r12 == 0) goto L_0x0074
        L_0x0056:
            int r0 = r7.size()
            X.CPY[] r3 = new X.CPY[r0]
            java.util.Iterator r2 = X.C17890vO.A0i(r7)
        L_0x0060:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r1 = X.C17890vO.A0P(r2)
            int r0 = r13 + 1
            r3[r13] = r1
            r13 = r0
            goto L_0x0060
        L_0x0070:
            r12 = 1
            if (r11 == 0) goto L_0x0074
            goto L_0x0056
        L_0x0074:
            int r6 = r6 + 1
            goto L_0x0012
        L_0x0077:
            A08 = r11
            A07 = r12
            boolean r0 = X.AnonymousClass000.A1O(r12)
            if (r11 == 0) goto L_0x0083
            int r0 = r0 + 1
        L_0x0083:
            A06 = r0
            r14.A05 = r3
            A09 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26221CvA.A03(X.CvA):void");
    }

    public static boolean A04(C26221CvA cvA) {
        if (!A09) {
            PackageManager packageManager = cvA.A02;
            if (packageManager == null) {
                C26175Cts.A02("CameraInventory", "failed to load camera feature. PackageManager is null");
                return false;
            }
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                A07 = true;
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                A08 = true;
            }
            int A1O = AnonymousClass000.A1O(A07 ? 1 : 0);
            if (A08) {
                A1O++;
            }
            A06 = A1O;
            A09 = true;
        }
        return true;
    }

    public int A06(String str) {
        if (this.A05 == null) {
            A02(this);
        }
        CPY[] cpyArr = this.A05;
        C28111Yx.A02(cpyArr);
        int length = cpyArr.length;
        for (int i = 0; i < length; i++) {
            CPY cpy = this.A05[i];
            if (cpy.A02.equals(str)) {
                return cpy.A00;
            }
        }
        C26175Cts.A02("CameraInventory", AnonymousClass001.A1H("Failed to find camera facing for id: ", str, AnonymousClass000.A10()));
        return 0;
    }

    public C26221CvA(PackageManager packageManager, CameraManager cameraManager, C26035Cqv cqv, C25850CnB cnB) {
        this.A03 = cameraManager;
        this.A01 = cnB;
        this.A04 = cqv;
        this.A02 = packageManager;
    }

    public String A07(int i) {
        try {
            return A01(this, i).A02;
        } catch (CameraAccessException e) {
            throw BE6.A0o("Failed to get camera info", e);
        }
    }

    public boolean A08(int i) {
        if (!A04(this)) {
            if (this.A05 == null) {
                A02(this);
            }
            if (this.A05 == null) {
                C26175Cts.A02("CameraInventory", "Failed to detect camera, cameraInfos was null");
                return false;
            } else if (A00(AnonymousClass000.A1S(i, 1) ? 1 : 0) == -1) {
                return false;
            } else {
                return true;
            }
        } else if (i != 1) {
            return A08;
        } else {
            return A07;
        }
    }
}
