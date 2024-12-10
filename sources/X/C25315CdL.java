package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;

/* renamed from: X.CdL  reason: case insensitive filesystem */
public abstract class C25315CdL {
    public static int A00(CameraManager cameraManager, CaptureRequest.Builder builder, C22907BUs bUs, C25632CjI cjI, String str, int i) {
        CaptureRequest.Key key;
        if (bUs == null || cjI == null) {
            throw AnonymousClass000.A0n("Trying to update builder after camera closed.");
        }
        int i2 = 0;
        if (i != 0) {
            int A09 = BEA.A09(C25971Cpe.A0z, bUs);
            if (A09 == -1) {
                return A09;
            }
            if (A09 == 1 && BE9.A1T(C25632CjI.A0E, cjI)) {
                i2 = 1;
            }
            key = CaptureRequest.CONTROL_AWB_MODE;
        } else {
            int A092 = BEA.A09(C25971Cpe.A0D, bUs);
            if (A092 == 4) {
                if (BE9.A1T(C25632CjI.A0C, cjI)) {
                    i2 = 4;
                }
            } else if (A092 == 3) {
                if (BE9.A1T(C25632CjI.A0D, cjI)) {
                    i2 = 3;
                }
            } else if (A092 == 1) {
                if (BE9.A1T(C25632CjI.A0B, cjI)) {
                    i2 = 1;
                }
            } else if (A092 == 0 && BE9.A1T(C25632CjI.A0M, cjI)) {
                Number number = (Number) BE7.A0b(C25971Cpe.A0d, bUs);
                float floatValue = number.floatValue();
                CameraCharacteristics.Key key2 = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
                if (str != null) {
                    Object obj = C25388Cep.A00(cameraManager, str).get(key2);
                    C28111Yx.A02(obj);
                    if (floatValue >= AnonymousClass000.A04(obj)) {
                        builder.set(CaptureRequest.LENS_FOCUS_DISTANCE, number);
                    }
                } else {
                    throw new C27223Da2("Camera ID must be provided to check supported modes.");
                }
            }
            key = CaptureRequest.CONTROL_AF_MODE;
        }
        BE7.A14(builder, key, i2);
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0248, code lost:
        if (X.BEA.A09(r1, r9) != 3) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0258, code lost:
        r2 = r9.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0278, code lost:
        if (X.BEA.A09(r1, r9) != 3) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x028c, code lost:
        r8.set(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x028f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0296, code lost:
        X.C26175Cts.A03(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0299, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (r1 != 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0169, code lost:
        if (r0 != false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016b, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        r8.set(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c5, code lost:
        r6 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01cf, code lost:
        r2 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.hardware.camera2.CaptureRequest.Builder r8, X.C22907BUs r9, X.C25632CjI r10, int r11) {
        /*
            if (r9 == 0) goto L_0x029a
            if (r10 == 0) goto L_0x029a
            r4 = 3
            r2 = 2
            r3 = 1
            r5 = 0
            switch(r11) {
                case 0: goto L_0x01d5;
                case 1: goto L_0x00c6;
                case 2: goto L_0x0264;
                case 3: goto L_0x0040;
                case 4: goto L_0x00b2;
                case 5: goto L_0x019c;
                case 6: goto L_0x0159;
                case 7: goto L_0x0234;
                case 8: goto L_0x0143;
                case 9: goto L_0x0032;
                case 10: goto L_0x012c;
                case 11: goto L_0x0103;
                case 12: goto L_0x00f5;
                case 13: goto L_0x00d4;
                case 14: goto L_0x008d;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.CKJ r0 = X.C25971Cpe.A0n
            java.lang.Object r1 = r9.A04(r0)
            int[] r1 = (int[]) r1
            X.CKI r0 = X.C25632CjI.A0x
            java.util.List r0 = X.BE6.A11(r0, r10)
            boolean r0 = X.C26225CvG.A03(r0, r1)
            if (r0 == 0) goto L_0x0031
            X.C28111Yx.A02(r1)
            X.CKI r0 = X.C25632CjI.A0l
            boolean r0 = X.BE9.A1T(r0, r10)
            android.util.Range r2 = X.BEB.A0M(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
        L_0x002e:
            r8.set(r0, r2)
        L_0x0031:
            return
        L_0x0032:
            java.util.HashSet r0 = X.C25449Cg0.A00
            boolean r0 = X.C25870Cne.A02(r0)
            if (r0 != 0) goto L_0x0031
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            X.CKJ r0 = X.C25971Cpe.A08
            goto L_0x0258
        L_0x0040:
            java.util.HashSet r0 = X.C25449Cg0.A00
            boolean r0 = X.C25870Cne.A02(r0)
            r4 = 22
            if (r0 != 0) goto L_0x0171
            X.CKJ r0 = X.C25971Cpe.A0s
            java.lang.Object r2 = X.BE7.A0b(r0, r9)
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            r0 = 17
            if (r1 != r0) goto L_0x0078
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x007a
            X.CKJ r0 = X.C25971Cpe.A0W
            boolean r0 = X.BEA.A1X(r0, r9)
            if (r0 == 0) goto L_0x007a
            X.CKI r0 = X.C25632CjI.A0K
            boolean r0 = X.BE9.A1T(r0, r10)
            if (r0 == 0) goto L_0x007a
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            r0 = 18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x028c
        L_0x0078:
            if (r1 == 0) goto L_0x0089
        L_0x007a:
            X.CKI r0 = X.C25632CjI.A12
            java.util.List r0 = X.BE6.A11(r0, r10)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0089
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            goto L_0x002e
        L_0x0089:
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            goto L_0x016b
        L_0x008d:
            X.CKI r0 = X.C25632CjI.A03
            boolean r0 = X.BE9.A1T(r0, r10)
            if (r0 == 0) goto L_0x00a0
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK
            X.CKJ r0 = X.C25971Cpe.A0P
            java.lang.Object r0 = r9.A04(r0)
            r8.set(r1, r0)
        L_0x00a0:
            X.CKI r0 = X.C25632CjI.A06
            boolean r0 = X.BE9.A1T(r0, r10)
            if (r0 == 0) goto L_0x0031
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_LOCK
            X.CKJ r0 = X.C25971Cpe.A0R
            java.lang.Object r2 = r9.A04(r0)
            goto L_0x028c
        L_0x00b2:
            X.CKI r0 = X.C25632CjI.A0a
            boolean r0 = X.BE9.A1T(r0, r10)
            if (r0 == 0) goto L_0x0031
            X.CKJ r0 = X.C25971Cpe.A0Z
            boolean r0 = X.BEA.A1X(r0, r9)
            if (r0 == 0) goto L_0x01c5
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            goto L_0x016b
        L_0x00c6:
            X.CKI r0 = X.C25632CjI.A0G
            boolean r0 = X.BE9.A1T(r0, r10)
            if (r0 == 0) goto L_0x0031
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION
            X.CKJ r0 = X.C25971Cpe.A09
            goto L_0x0258
        L_0x00d4:
            X.CKI r0 = X.C25632CjI.A0A
            boolean r0 = X.BE9.A1T(r0, r10)
            if (r0 == 0) goto L_0x0031
            X.CKJ r0 = X.C25971Cpe.A05
            int r0 = X.BEA.A09(r0, r9)
            if (r0 != 0) goto L_0x0031
            X.CKJ r0 = X.C25971Cpe.A06
            java.lang.Object r0 = X.BE7.A0b(r0, r9)
            int[] r0 = (int[]) r0
            android.hardware.camera2.params.ColorSpaceTransform r2 = new android.hardware.camera2.params.ColorSpaceTransform
            r2.<init>(r0)
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_TRANSFORM
            goto L_0x028c
        L_0x00f5:
            X.CKI r0 = X.C25632CjI.A0A
            boolean r0 = X.BE9.A1T(r0, r10)
            if (r0 == 0) goto L_0x0031
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_MODE
            X.CKJ r0 = X.C25971Cpe.A05
            goto L_0x0258
        L_0x0103:
            X.CKI r0 = X.C25632CjI.A0A
            boolean r0 = X.BE9.A1T(r0, r10)
            if (r0 == 0) goto L_0x0031
            X.CKJ r0 = X.C25971Cpe.A05
            int r0 = X.BEA.A09(r0, r9)
            if (r0 != 0) goto L_0x0031
            X.CKJ r0 = X.C25971Cpe.A04
            java.lang.Object r0 = X.BE7.A0b(r0, r9)
            float[] r0 = (float[]) r0
            r5 = r0[r5]
            r3 = r0[r3]
            r1 = r0[r2]
            r0 = r0[r4]
            android.hardware.camera2.params.RggbChannelVector r2 = new android.hardware.camera2.params.RggbChannelVector
            r2.<init>(r5, r3, r1, r0)
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_GAINS
            goto L_0x028c
        L_0x012c:
            X.CKI r0 = X.C25632CjI.A0Y
            boolean r0 = X.BE9.A1T(r0, r10)
            if (r0 == 0) goto L_0x0031
            X.CKJ r1 = X.C25971Cpe.A08
            int r0 = X.BEA.A09(r1, r9)
            if (r0 == 0) goto L_0x0192
            int r0 = X.BEA.A09(r1, r9)
            if (r0 == r4) goto L_0x0192
            return
        L_0x0143:
            X.CKJ r0 = X.C25971Cpe.A00
            java.lang.Object r2 = X.BE7.A0b(r0, r9)
            X.CKI r0 = X.C25632CjI.A0m
            java.util.List r0 = X.BE6.A11(r0, r10)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0031
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_ANTIBANDING_MODE
            goto L_0x002e
        L_0x0159:
            X.CKI r0 = X.C25632CjI.A0P
            boolean r0 = X.BE9.A1T(r0, r10)
            if (r0 == 0) goto L_0x0031
            X.CKJ r0 = X.C25971Cpe.A0X
            boolean r0 = X.BEA.A1X(r0, r9)
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
            if (r0 == 0) goto L_0x01cf
        L_0x016b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L_0x028c
        L_0x0171:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x01c8
            X.CKJ r1 = X.C25971Cpe.A0s
            int r0 = X.BEA.A09(r1, r9)
            if (r0 == 0) goto L_0x01c8
            X.CKI r0 = X.C25632CjI.A0K
            boolean r0 = X.BE9.A1T(r0, r10)
            if (r0 == 0) goto L_0x01c8
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            X.BE7.A14(r8, r0, r2)
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            java.lang.Object r2 = r9.A04(r1)
            goto L_0x028c
        L_0x0192:
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.LENS_APERTURE
            X.CKJ r0 = X.C25971Cpe.A01
            java.lang.Object r2 = r9.A04(r0)
            goto L_0x028c
        L_0x019c:
            X.CKJ r0 = X.C25971Cpe.A0Y
            boolean r0 = X.BEA.A1X(r0, r9)
            if (r0 == 0) goto L_0x01c5
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x01ba
            X.CKI r0 = X.C25632CjI.A0Q
            boolean r0 = X.BE9.A1T(r0, r10)
            if (r0 == 0) goto L_0x01ba
        L_0x01b2:
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x028c
        L_0x01ba:
            X.CKI r0 = X.C25632CjI.A0R
            boolean r0 = X.BE9.A1T(r0, r10)
            boolean r2 = X.AnonymousClass000.A1O(r0)
            goto L_0x01b2
        L_0x01c5:
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            goto L_0x01cf
        L_0x01c8:
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            X.BE7.A14(r8, r0, r3)
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
        L_0x01cf:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x028c
        L_0x01d5:
            X.CKJ r0 = X.C25971Cpe.A0O
            boolean r7 = X.BEA.A1X(r0, r9)
            X.CKJ r0 = X.C25971Cpe.A0B
            java.lang.Object r6 = X.BE7.A0b(r0, r9)
            java.lang.Number r6 = (java.lang.Number) r6
            int r1 = r6.intValue()
            X.CKI r0 = X.C25632CjI.A0r
            java.util.List r0 = X.BE6.A11(r0, r10)
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x0204
            if (r1 == 0) goto L_0x022d
            if (r1 == r3) goto L_0x021a
            if (r1 == r2) goto L_0x0210
            if (r1 != r4) goto L_0x0204
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0201:
            r8.set(r1, r0)
        L_0x0204:
            r4 = r7
        L_0x0205:
            if (r7 != 0) goto L_0x0221
            X.CKI r0 = X.C25632CjI.A02
            boolean r0 = X.BE9.A1T(r0, r10)
            if (r0 != 0) goto L_0x0221
            return
        L_0x0210:
            int r4 = X.AnonymousClass8BU.A00(r7)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            X.BE7.A14(r8, r0, r5)
            goto L_0x0205
        L_0x021a:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            if (r7 == 0) goto L_0x0228
            X.BE7.A14(r8, r1, r5)
        L_0x0221:
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            goto L_0x028c
        L_0x0228:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x0201
        L_0x022d:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x0201
        L_0x0234:
            X.CKJ r0 = X.C25971Cpe.A0O
            boolean r0 = X.BEA.A1X(r0, r9)
            if (r0 == 0) goto L_0x025d
            X.CKJ r1 = X.C25971Cpe.A08
            int r0 = X.BEA.A09(r1, r9)
            if (r0 == 0) goto L_0x025d
            int r0 = X.BEA.A09(r1, r9)
            if (r0 == r4) goto L_0x025d
        L_0x024a:
            X.CKI r0 = X.C25632CjI.A0L
            boolean r0 = X.BE9.A1T(r0, r10)
            if (r0 == 0) goto L_0x025f
            if (r3 != 0) goto L_0x025f
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.SENSOR_SENSITIVITY
            X.CKJ r0 = X.C25971Cpe.A0L
        L_0x0258:
            java.lang.Object r2 = r9.A04(r0)
            goto L_0x028c
        L_0x025d:
            r3 = 0
            goto L_0x024a
        L_0x025f:
            java.lang.String r1 = "CaptureRequestHelper"
            java.lang.String r0 = "ISO_RANGE not supported or AE on"
            goto L_0x0296
        L_0x0264:
            X.CKJ r0 = X.C25971Cpe.A0O
            boolean r0 = X.BEA.A1X(r0, r9)
            if (r0 == 0) goto L_0x0290
            X.CKJ r1 = X.C25971Cpe.A08
            int r0 = X.BEA.A09(r1, r9)
            if (r0 == 0) goto L_0x0290
            int r0 = X.BEA.A09(r1, r9)
            if (r0 == r4) goto L_0x0290
        L_0x027a:
            X.CKI r0 = X.C25632CjI.A0H
            boolean r0 = X.BE9.A1T(r0, r10)
            if (r0 == 0) goto L_0x0292
            if (r3 != 0) goto L_0x0292
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.SENSOR_EXPOSURE_TIME
            X.CKJ r0 = X.C25971Cpe.A0A
            java.lang.Object r2 = r9.A04(r0)
        L_0x028c:
            r8.set(r6, r2)
            return
        L_0x0290:
            r3 = 0
            goto L_0x027a
        L_0x0292:
            java.lang.String r1 = "CaptureRequestHelper"
            java.lang.String r0 = "EXPOSURE_TIME not supported or AE on"
        L_0x0296:
            X.C26175Cts.A03(r1, r0)
            return
        L_0x029a:
            java.lang.String r0 = "Trying to update builder after camera closed."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25315CdL.A01(android.hardware.camera2.CaptureRequest$Builder, X.BUs, X.CjI, int):void");
    }
}
