package X;

import android.content.pm.PackageManager;
import android.hardware.Camera;
import java.util.concurrent.ExecutionException;

/* renamed from: X.CuP  reason: case insensitive filesystem */
public class C26194CuP {
    public static int A03 = -1;
    public static volatile boolean A04;
    public static volatile boolean A05;
    public static volatile Camera.CameraInfo[] A06;
    public static volatile boolean A07;
    public final C25850CnB A00;
    public final PackageManager A01;
    public final C26035Cqv A02;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        if (r3 == -1) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r3 == -1) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C26194CuP r7, int r8) {
        /*
            android.hardware.Camera$CameraInfo[] r0 = A06
            r4 = -1
            if (r0 == 0) goto L_0x002b
            android.hardware.Camera$CameraInfo[] r2 = A06
            if (r2 == 0) goto L_0x0029
            boolean r1 = X.C17890vO.A1R(r8)
            r3 = 0
        L_0x000e:
            int r0 = r2.length
            if (r3 >= r0) goto L_0x0029
            r0 = r2[r3]
            int r0 = r0.facing
            if (r0 != r1) goto L_0x0026
            if (r3 != r4) goto L_0x0022
        L_0x0019:
            if (r8 == 0) goto L_0x0023
            r0 = 1
            if (r8 != r0) goto L_0x0022
            boolean r0 = A05
        L_0x0020:
            if (r0 != 0) goto L_0x002b
        L_0x0022:
            return r3
        L_0x0023:
            boolean r0 = A04
            goto L_0x0020
        L_0x0026:
            int r3 = r3 + 1
            goto L_0x000e
        L_0x0029:
            r3 = -1
            goto L_0x0019
        L_0x002b:
            r6 = 0
            A06 = r6
            r7.A01()
            android.hardware.Camera$CameraInfo[] r2 = A06
            if (r2 == 0) goto L_0x00c7
            boolean r1 = X.C17890vO.A1R(r8)
            r3 = 0
        L_0x003a:
            int r0 = r2.length
            if (r3 >= r0) goto L_0x00c7
            r0 = r2[r3]
            int r0 = r0.facing
            if (r0 != r1) goto L_0x00c3
            if (r3 != r4) goto L_0x0022
        L_0x0045:
            if (r8 == 0) goto L_0x00c0
            r0 = 1
            if (r8 != r0) goto L_0x0022
            boolean r0 = A05
        L_0x004c:
            if (r0 == 0) goto L_0x0022
            android.content.pm.PackageManager r3 = r7.A01
            if (r3 == 0) goto L_0x00bd
            java.lang.String r0 = "android.hardware.camera.any"
            boolean r0 = r3.hasSystemFeature(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "android.hardware.camera"
            boolean r0 = r3.hasSystemFeature(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "android.hardware.camera.front"
            boolean r0 = r3.hasSystemFeature(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L_0x0070:
            java.lang.String r0 = "Camera 1 API - Could not get CameraInfo for CameraFacing id: "
            java.lang.StringBuilder r5 = X.BE6.A0u(r0)
            r5.append(r8)
            java.lang.String r0 = " Number Of Cameras: "
            r5.append(r0)
            int r0 = A03
            r5.append(r0)
            java.lang.String r0 = " ANY: "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " BACK: "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = " FRONT: "
            r5.append(r0)
            r5.append(r6)
            android.hardware.Camera$CameraInfo[] r3 = A06
            if (r3 == 0) goto L_0x00ca
            java.lang.String r0 = " Camera Info size: "
            r5.append(r0)
            int r2 = r3.length
            r5.append(r2)
            java.lang.String r0 = " Camera ids: "
            r5.append(r0)
            r1 = 0
        L_0x00ae:
            if (r1 >= r2) goto L_0x00cf
            r0 = r3[r1]
            int r0 = r0.facing
            r5.append(r0)
            X.BE6.A1J(r5)
            int r1 = r1 + 1
            goto L_0x00ae
        L_0x00bd:
            r2 = r6
            r1 = r6
            goto L_0x0070
        L_0x00c0:
            boolean r0 = A04
            goto L_0x004c
        L_0x00c3:
            int r3 = r3 + 1
            goto L_0x003a
        L_0x00c7:
            r3 = -1
            goto L_0x0045
        L_0x00ca:
            java.lang.String r0 = " Camera Info NULL"
            r5.append(r0)
        L_0x00cf:
            java.lang.String r1 = "CameraInventory"
            java.lang.String r0 = r5.toString()
            X.C26175Cts.A02(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26194CuP.A00(X.CuP, int):int");
    }

    private void A01() {
        if (A06 == null) {
            C25850CnB cnB = this.A00;
            if (cnB.A09()) {
                A02();
                return;
            }
            try {
                cnB.A01(new C22896BUh(), new C27132DVt((Object) this, 6)).get();
            } catch (InterruptedException | ExecutionException e) {
                C26175Cts.A02("CameraInventory", C17900vP.A0C("failed to load camera infos: ", AnonymousClass000.A10(), e));
            }
        }
    }

    public static void A02() {
        if (A06 == null) {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo[] cameraInfoArr = new Camera.CameraInfo[numberOfCameras];
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                cameraInfoArr[i] = cameraInfo;
                int i2 = cameraInfo.facing;
                if (i2 == 0) {
                    z2 = true;
                } else if (i2 == 1) {
                    z = true;
                }
            }
            A06 = cameraInfoArr;
            A05 = z;
            A04 = z2;
            A03 = 0;
            if (A04) {
                A03++;
            }
            if (A05) {
                A03++;
            }
            A07 = true;
        }
    }

    public static boolean A03(C26194CuP cuP) {
        if (!A07) {
            PackageManager packageManager = cuP.A01;
            if (packageManager == null) {
                C26175Cts.A02("CameraInventory", "failed to load camera feature. PackageManager is null");
                return false;
            }
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                A04 = true;
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                A05 = true;
            }
            A03 = 0;
            if (A04) {
                A03++;
            }
            if (A05) {
                A03++;
            }
            A07 = true;
        }
        return true;
    }

    public int A05(int i, int i2) {
        int i3;
        if (A06 == null) {
            if (!AnonymousClass000.A1Z(BE8.A0k(), Thread.currentThread())) {
                C26175Cts.A02("CameraInventory", "Loading camera info on the UI thread");
            }
            A01();
        }
        if (i2 != -1) {
            int A002 = A00(this, i);
            Camera.CameraInfo[] cameraInfoArr = A06;
            C28111Yx.A02(cameraInfoArr);
            if (A002 >= cameraInfoArr.length) {
                C26175Cts.A02("CameraInventory", AnonymousClass001.A1I("No CameraInfo found for camera id: ", AnonymousClass000.A10(), A002));
            } else {
                Camera.CameraInfo cameraInfo = A06[A002];
                int i4 = ((i2 + 45) / 90) * 90;
                int i5 = cameraInfo.facing;
                int i6 = cameraInfo.orientation;
                if (i5 == 1) {
                    i3 = (i6 - i4) + 360;
                } else {
                    i3 = i6 + i4;
                }
                return i3 % 360;
            }
        }
        return 0;
    }

    public C26194CuP(PackageManager packageManager, C26035Cqv cqv, C25850CnB cnB) {
        this.A00 = cnB;
        this.A02 = cqv;
        this.A01 = packageManager;
    }

    public int A04(int i) {
        int A002 = A00(this, i);
        if (A002 != -1) {
            Camera.CameraInfo[] cameraInfoArr = A06;
            C28111Yx.A02(cameraInfoArr);
            Camera.CameraInfo cameraInfo = cameraInfoArr[A002];
            if (cameraInfo != null) {
                return cameraInfo.orientation;
            }
            return 0;
        }
        throw BEA.A0h("Could not load CameraInfo for CameraFacing: ", AnonymousClass000.A10(), i);
    }

    public boolean A06(int i) {
        if (!A03(this)) {
            return AnonymousClass000.A1S(A00(this, i), -1);
        }
        if (i != 0) {
            return A05;
        }
        return A04;
    }
}
