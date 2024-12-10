package X;

import android.graphics.Point;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;

/* renamed from: X.73H  reason: invalid class name */
public abstract class AnonymousClass73H {
    public static final int A00(C134216qE r2) {
        C18070vi.A0d(r2, 0);
        if (r2.A0F) {
            return 2;
        }
        if (r2.A0J) {
            return 3;
        }
        int i = r2.A08;
        if (i == 2) {
            return 9;
        }
        if (r2.A0I) {
            return 5;
        }
        if (AnonymousClass000.A1T(i, 6)) {
            return 7;
        }
        return 0;
    }

    public static final boolean A03(C134216qE r1, C18030ve r2, VoipCameraManager voipCameraManager) {
        C18070vi.A0d(voipCameraManager, 3);
        if (!r1.A0M) {
            return r1.A0R;
        }
        if ((C18020vd.A00(C18040vf.A01, r2, 8526) & 2) > 0) {
            return voipCameraManager.hasLastCachedFrame();
        }
        return AnonymousClass000.A1W(voipCameraManager.getLastCachedFrame());
    }

    public static final boolean A04(C134216qE r2, C18030ve r3, VoipCameraManager voipCameraManager, boolean z) {
        AnonymousClass3Ma.A1O(r2, 0, voipCameraManager);
        if (!A03(r2, r3, voipCameraManager) || z) {
            return false;
        }
        int i = r2.A08;
        if (AnonymousClass000.A1T(i, 6) || i == 2) {
            return true;
        }
        if ((!r2.A0M || (!r2.A0F && voipCameraManager.isCameraOpen())) && !r2.A0P && !r2.A0E) {
            return false;
        }
        return true;
    }

    public static final Point A01(Point point, C134216qE r4, VoipCameraManager voipCameraManager, int i, boolean z) {
        int i2;
        int i3;
        VoipPhysicalCamera voipPhysicalCamera;
        Point adjustedPreviewSize;
        if (r4.A0M) {
            VoipPhysicalCamera voipPhysicalCamera2 = voipCameraManager.currentCamera;
            if (voipPhysicalCamera2 != null && (adjustedPreviewSize = voipPhysicalCamera2.getAdjustedPreviewSize()) != null) {
                return adjustedPreviewSize;
            }
            if (AnonymousClass000.A1T(r4.A08, 6) || z) {
                return voipCameraManager.lastAdjustedCameraPreviewSize;
            }
            return null;
        }
        Point point2 = new Point(r4.A09, r4.A06);
        if (z && !(point == null && ((voipPhysicalCamera = voipCameraManager.currentCamera) == null || (point = voipPhysicalCamera.getAdjustedPreviewSize()) == null))) {
            int i4 = point.x;
            int i5 = point.y;
            point2.x = Math.max(i4, i5);
            point2.y = Math.min(point.x, i5);
        }
        int i6 = 0;
        if (r4.A0N && i >= 0) {
            i6 = i * 90;
        }
        if (((((r4.A07 * 90) - i6) + 360) % 360) % 180 != 0) {
            i2 = point2.y;
            i3 = point2.x;
        } else {
            i2 = point2.x;
            i3 = point2.y;
        }
        return new Point(i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (X.AnonymousClass000.A1T(r4.A08, 6) != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Point A02(X.C134216qE r4, X.C143867Fc r5, com.whatsapp.voipcalling.camera.VoipCameraManager r6, int r7) {
        /*
            X.C72473Md.A1I(r5, r6)
            boolean r0 = r4.A0M
            if (r0 == 0) goto L_0x0014
            int r1 = r4.A08
            r0 = 6
            boolean r2 = X.AnonymousClass000.A1T(r1, r0)
            r1 = 9
            r0 = 16
            if (r2 == 0) goto L_0x0016
        L_0x0014:
            r1 = 5
            r0 = 7
        L_0x0016:
            android.graphics.Point r5 = new android.graphics.Point
            r5.<init>(r1, r0)
            int r1 = r4.A08
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4.A0L
            if (r0 != 0) goto L_0x0046
            r1 = 0
            r0 = 0
            android.graphics.Point r0 = A01(r1, r4, r6, r7, r0)
            if (r0 == 0) goto L_0x0046
            int r4 = r0.x
            float r3 = (float) r4
            int r2 = r0.y
            float r0 = (float) r2
            float r3 = r3 / r0
            int r0 = r5.x
            float r1 = (float) r0
            int r0 = r5.y
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0046
            r5.x = r4
            r5.y = r2
        L_0x0046:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73H.A02(X.6qE, X.7Fc, com.whatsapp.voipcalling.camera.VoipCameraManager, int):android.graphics.Point");
    }
}
