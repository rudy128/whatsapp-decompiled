package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

public final class A0D {
    public final int A00;
    public final int A01;
    public final C193689qV A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final int[] A06;

    public A0D(C193689qV r1, List list, int[] iArr, int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A05 = z;
        this.A01 = i2;
        this.A04 = z2;
        this.A06 = iArr;
        this.A02 = r1;
        this.A03 = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (r0.intValue() == 0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        if (r5.getSensorOrientation(4) == r5.getSensorOrientation(0)) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.A0D A00(X.AnonymousClass11C r17, int r18) {
        /*
            android.hardware.camera2.CameraManager r1 = r17.A0B()
            r12 = 0
            if (r1 != 0) goto L_0x000d
            java.lang.String r0 = "voip/RawCameraInfo camera2 CameraManager is null"
        L_0x0009:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r12
        L_0x000d:
            r6 = r18
            java.lang.String r0 = java.lang.Integer.toString(r6)     // Catch:{ Exception -> 0x0109 }
            android.hardware.camera2.CameraCharacteristics r3 = r1.getCameraCharacteristics(r0)     // Catch:{ Exception -> 0x0109 }
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ IllegalArgumentException -> 0x010d }
            java.lang.Object r2 = r3.get(r0)     // Catch:{ IllegalArgumentException -> 0x010d }
            android.hardware.camera2.params.StreamConfigurationMap r2 = (android.hardware.camera2.params.StreamConfigurationMap) r2     // Catch:{ IllegalArgumentException -> 0x010d }
            if (r2 != 0) goto L_0x0034
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x010d }
            java.lang.String r0 = "voip/RawCameraInfo camera2 Camera "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x010d }
            r1.append(r6)     // Catch:{ IllegalArgumentException -> 0x010d }
            java.lang.String r0 = " has no available stream configs"
            X.C17890vO.A19(r1, r0)     // Catch:{ IllegalArgumentException -> 0x010d }
            goto L_0x00bb
        L_0x0034:
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION     // Catch:{ IllegalArgumentException -> 0x010d }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ IllegalArgumentException -> 0x010d }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IllegalArgumentException -> 0x010d }
            r11 = 0
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "voip/RawCameraInfo camera2 orientation was null! defaulting to 0"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x010d }
            r16 = 0
            goto L_0x004b
        L_0x0047:
            int r16 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x010d }
        L_0x004b:
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ IllegalArgumentException -> 0x010d }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ IllegalArgumentException -> 0x010d }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IllegalArgumentException -> 0x010d }
            r4 = 1
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "voip/RawCameraInfo camera2 lens facing is null! defaulting to lens facing back"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalArgumentException -> 0x010d }
            goto L_0x0064
        L_0x005c:
            int r0 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x010d }
            r17 = 0
            if (r0 != 0) goto L_0x0066
        L_0x0064:
            r17 = 1
        L_0x0066:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalArgumentException -> 0x010d }
            r0 = 32
            if (r1 < r0) goto L_0x0086
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP     // Catch:{ IllegalArgumentException -> 0x010d }
            java.lang.Object r5 = r3.get(r0)     // Catch:{ IllegalArgumentException -> 0x010d }
            android.hardware.camera2.params.DeviceStateSensorOrientationMap r5 = (android.hardware.camera2.params.DeviceStateSensorOrientationMap) r5     // Catch:{ IllegalArgumentException -> 0x010d }
            if (r5 == 0) goto L_0x0086
            r0 = 4
            int r3 = r5.getSensorOrientation(r0)     // Catch:{ IllegalArgumentException -> 0x010d }
            r0 = 0
            int r0 = r5.getSensorOrientation(r0)     // Catch:{ IllegalArgumentException -> 0x010d }
            r18 = 1
            if (r3 != r0) goto L_0x0088
        L_0x0086:
            r18 = 0
        L_0x0088:
            int[] r8 = r2.getOutputFormats()
            int r5 = r8.length
            r1 = 0
        L_0x008e:
            java.lang.String r10 = "voip/RawCameraInfo camera2 "
            if (r1 >= r5) goto L_0x00ad
            r0 = r8[r1]
            r3 = 35
            if (r0 != r3) goto L_0x00aa
            android.util.Size[] r5 = r2.getOutputSizes(r3)
            if (r5 != 0) goto L_0x00bc
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0n(r6, r10)
            java.lang.String r0 = " no supported output format/size combinations"
        L_0x00a4:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            goto L_0x0009
        L_0x00aa:
            int r1 = r1 + 1
            goto L_0x008e
        L_0x00ad:
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0n(r6, r10)
            java.lang.String r0 = " no supported output formats: "
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r8)
            goto L_0x00a4
        L_0x00bb:
            return r12
        L_0x00bc:
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
            int r9 = r5.length
            r7 = 0
        L_0x00c2:
            if (r7 >= r9) goto L_0x00dd
            r0 = r5[r7]
            if (r0 == 0) goto L_0x00db
            int r2 = r0.getWidth()
            int r1 = r0.getHeight()
            X.9qV r0 = new X.9qV
            r0.<init>(r2, r1)
        L_0x00d5:
            r13.add(r0)
            int r7 = r7 + 1
            goto L_0x00c2
        L_0x00db:
            r0 = r12
            goto L_0x00d5
        L_0x00dd:
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0n(r6, r10)
            java.lang.String r0 = " params, supported color formats "
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r8)
            r1.append(r0)
            java.lang.String r0 = ", supported preview sizes: {"
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r5)
            r1.append(r0)
            java.lang.String r0 = "}"
            X.C17890vO.A1A(r1, r0)
            int[] r14 = new int[r4]
            r14[r11] = r3
            r15 = 2
            X.A0D r11 = new X.A0D
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            return r11
        L_0x0109:
            r1 = move-exception
            java.lang.String r0 = "voip/RawCameraInfo camera2 unable to acquire camera info"
            goto L_0x0110
        L_0x010d:
            r1 = move-exception
            java.lang.String r0 = "voip/RawCameraInfo camera2 Illegal Argument while accessing camera characteristics"
        L_0x0110:
            com.whatsapp.util.Log.e(r0, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A0D.A00(X.11C, int):X.A0D");
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("json version: 1, api version: ");
        A10.append(this.A00);
        A10.append(", front camera: ");
        A10.append(this.A05);
        A10.append(", orientation: ");
        A10.append(this.A01);
        A10.append(", hasUnstableOrientation: ");
        A10.append(this.A04);
        A10.append(", formats: ");
        A10.append(Arrays.toString(this.A06));
        A10.append(", preferred size: ");
        A10.append(this.A02);
        A10.append(", sizes: ");
        List list = this.A03;
        if (list != null) {
            str = TextUtils.join(", ", list);
        } else {
            str = "null";
        }
        return AnonymousClass000.A0y(str, A10);
    }
}
