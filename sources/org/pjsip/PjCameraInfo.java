package org.pjsip;

import X.AnonymousClass1F8;
import X.AnonymousClass1XO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C193689qV;
import X.C199410f;
import X.C21486Akr;
import android.os.Build;
import android.util.Pair;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class PjCameraInfo {
    public static final Comparator CAMERA_SIZE_COMPARATOR = new C21486Akr(49);
    public static final Pair PAIR_1280_720 = new Pair(Integer.valueOf(VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH), Integer.valueOf(VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT));
    public static final C199410f ZOOMING_OPPO_MODELS;
    public static final C199410f ZOOMING_VIVO_MODELS;
    public final int deviceType;
    public final int facing;
    public final int orient;
    public final int[] supportedFormat;
    public final int[] supportedSize;

    public PjCameraInfo(int i, int i2, int[] iArr, int[] iArr2) {
        this(i, i2, 0, iArr, iArr2);
    }

    public static PjCameraInfo createHammerheadCameraInfo() {
        return new PjCameraInfo(0, 90, 2, new int[]{VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH, VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT}, new int[]{1});
    }

    public static PjCameraInfo createScreenSharingInfo(int i) {
        return new PjCameraInfo(0, i, 1, new int[]{640, 480}, new int[]{1});
    }

    static {
        AnonymousClass1F8 r1 = new AnonymousClass1F8();
        r1.add((Object) "CPH2023");
        r1.add((Object) "CPH2025");
        r1.add((Object) "CPH2363");
        ZOOMING_OPPO_MODELS = r1.build();
        AnonymousClass1F8 r12 = new AnonymousClass1F8();
        r12.add((Object) "V2027");
        r12.add((Object) "V2029");
        r12.add((Object) "V2130");
        ZOOMING_VIVO_MODELS = r12.build();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: X.9qV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: X.9qV} */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0234, code lost:
        if (r12 >= 0) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0236, code lost:
        r5.addAll(r6);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0253  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.pjsip.PjCameraInfo createFromRawInfo(X.A0D r17, X.C18030ve r18, X.AnonymousClass1VE r19) {
        /*
            r9 = r17
            int[] r1 = r9.A06
            int r0 = r1.length
            int[] r7 = java.util.Arrays.copyOf(r1, r0)
            int[] r5 = getEncoderSupportedColorFormats(r19)
            r8 = 0
            r3 = 0
            r4 = 0
        L_0x0010:
            r2 = r5[r3]
            r1 = 0
        L_0x0013:
            int r0 = r7.length
            if (r1 >= r0) goto L_0x0047
            r0 = r7[r1]
            if (r0 != r2) goto L_0x004f
            r0 = r7[r8]
            r7[r1] = r0
            r7[r8] = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "voip/video/PJCameraInfo preferred formats "
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r5)
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " is available ."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = 1
        L_0x0047:
            int r3 = r3 + 1
            r0 = 3
            if (r3 >= r0) goto L_0x0052
            if (r4 != 0) goto L_0x0052
            goto L_0x0010
        L_0x004f:
            int r1 = r1 + 1
            goto L_0x0013
        L_0x0052:
            boolean r15 = r9.A05
            java.util.List r0 = r9.A03
            if (r0 == 0) goto L_0x023f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x023f
            boolean r0 = X.C50602Vb.A00
            r5 = 640(0x280, float:8.97E-43)
            r14 = 480(0x1e0, float:6.73E-43)
            if (r0 == 0) goto L_0x006f
            r5 = 320(0x140, float:4.48E-43)
            r14 = 240(0xf0, float:3.36E-43)
        L_0x006f:
            X.9qV r10 = preferredCaptureSize(r18)
            java.lang.String r2 = "x"
            if (r10 == 0) goto L_0x01ad
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto L_0x01ad
            int r3 = r10.A01
            int r11 = r10.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "voip/video/PJCameraInfo preferred capture size set: "
            r1.append(r0)
            r1.append(r3)
            r1.append(r2)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x009d:
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r19)
            java.lang.String r0 = "disable_device_specific_camera_size"
            boolean r0 = r1.getBoolean(r0, r8)
            if (r0 == 0) goto L_0x017a
            r4 = 0
        L_0x00aa:
            java.lang.String r12 = "voip/video/PJCameraInfo capture size set from pref: "
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r19)
            if (r15 == 0) goto L_0x0153
            java.lang.String r1 = "video_call_front_camera_width"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x00c9
            android.content.SharedPreferences r13 = X.AnonymousClass1VE.A00(r19)
            java.lang.String r0 = "video_call_front_camera_height"
            boolean r0 = r13.contains(r0)
            if (r0 == 0) goto L_0x00f4
        L_0x00c9:
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r19)
            int r3 = r0.getInt(r1, r3)
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r19)
            java.lang.String r0 = "video_call_front_camera_height"
        L_0x00d8:
            int r11 = r1.getInt(r0, r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r3)
            r0.append(r2)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00f4:
            X.9qV r0 = new X.9qV
            r0.<init>(r3, r11)
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L_0x0150
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "voip/video/PJCameraInfo camera does not support requested resolution: "
            r1.append(r0)
            r1.append(r3)
            r1.append(r2)
            r1.append(r11)
            java.lang.String r0 = ". Using default resolution instead."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x011f:
            X.9qV r11 = r9.A02
            if (r11 == 0) goto L_0x0131
            int r1 = r11.A00
            int r0 = r11.A01
            int r1 = r1 * r0
            r0 = 307200(0x4b000, float:4.30479E-40)
            if (r1 > r0) goto L_0x0131
            java.lang.Object r11 = r6.get(r8)
        L_0x0131:
            java.util.Comparator r0 = CAMERA_SIZE_COMPARATOR
            java.util.Collections.sort(r6, r0)
            java.util.Iterator r2 = r6.iterator()
        L_0x013a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01b1
            java.lang.Object r0 = r2.next()
            X.9qV r0 = (X.C193689qV) r0
            int r1 = r0.A01
            r0 = 720(0x2d0, float:1.009E-42)
            if (r1 != r0) goto L_0x013a
            r2.remove()
            goto L_0x013a
        L_0x0150:
            r5 = r3
            r14 = r11
            goto L_0x011f
        L_0x0153:
            java.lang.String r1 = "video_call_back_camera_width"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0169
            android.content.SharedPreferences r13 = X.AnonymousClass1VE.A00(r19)
            java.lang.String r0 = "video_call_back_camera_height"
            boolean r0 = r13.contains(r0)
            if (r0 == 0) goto L_0x00f4
        L_0x0169:
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r19)
            int r3 = r0.getInt(r1, r3)
            android.content.SharedPreferences r1 = X.AnonymousClass1VE.A00(r19)
            java.lang.String r0 = "video_call_back_camera_height"
            goto L_0x00d8
        L_0x017a:
            android.util.Pair r4 = deviceSpecificSize(r15)
            if (r4 == 0) goto L_0x00aa
            java.lang.Object r0 = r4.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Object r0 = r4.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r11 = r0.intValue()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "voip/video/PJCameraInfo device specific size set: "
            r1.append(r0)
            r1.append(r3)
            r1.append(r2)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00aa
        L_0x01ad:
            r3 = r5
            r11 = r14
            goto L_0x009d
        L_0x01b1:
            r3 = -1
            r12 = -1
            r2 = 0
        L_0x01b4:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x01e7
            java.lang.Object r1 = r6.get(r2)
            X.9qV r1 = (X.C193689qV) r1
            boolean r0 = r1.equals(r11)
            if (r0 == 0) goto L_0x01c7
            r12 = r2
        L_0x01c7:
            int r0 = r1.A01
            if (r0 != r5) goto L_0x01e4
            if (r3 < 0) goto L_0x01e3
            int r0 = r1.A00
            int r0 = r0 - r14
            int r1 = java.lang.Math.abs(r0)
            java.lang.Object r0 = r6.get(r3)
            X.9qV r0 = (X.C193689qV) r0
            int r0 = r0.A00
            int r0 = r0 - r14
            int r0 = java.lang.Math.abs(r0)
            if (r1 >= r0) goto L_0x01e4
        L_0x01e3:
            r3 = r2
        L_0x01e4:
            int r2 = r2 + 1
            goto L_0x01b4
        L_0x01e7:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r3 < 0) goto L_0x0234
            java.lang.Object r11 = r6.get(r3)
        L_0x01f2:
            r5.add(r11)
        L_0x01f5:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x023a
            if (r4 != 0) goto L_0x023a
            if (r10 != 0) goto L_0x023a
            r4 = 0
        L_0x0200:
            int r0 = r6.size()
            if (r4 >= r0) goto L_0x023a
            java.lang.Object r3 = r6.get(r4)
            X.9qV r3 = (X.C193689qV) r3
            java.lang.Object r0 = r5.get(r8)
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0231
            int r2 = r3.A01
            java.lang.Object r0 = r5.get(r8)
            X.9qV r0 = (X.C193689qV) r0
            int r0 = r0.A00
            int r2 = r2 * r0
            int r1 = r3.A00
            java.lang.Object r0 = r5.get(r8)
            X.9qV r0 = (X.C193689qV) r0
            int r0 = r0.A01
            int r1 = r1 * r0
            if (r2 != r1) goto L_0x0231
            r5.add(r3)
        L_0x0231:
            int r4 = r4 + 1
            goto L_0x0200
        L_0x0234:
            if (r12 >= 0) goto L_0x01f2
            r5.addAll(r6)
            goto L_0x01f5
        L_0x023a:
            int[] r2 = SizeListToIntArray(r5)
            goto L_0x024b
        L_0x023f:
            java.lang.String r0 = "voip/video/PJCameraInfo previewSizes is null, use 640x480 by default."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            int[] r2 = new int[r0]
            r2 = {640, 480} // fill-array
        L_0x024b:
            int r1 = r9.A01
            int r0 = r9.A00
            r17 = 0
            if (r0 != 0) goto L_0x0255
            r17 = 3
        L_0x0255:
            org.pjsip.PjCameraInfo r14 = new org.pjsip.PjCameraInfo
            r18 = r2
            r19 = r7
            r16 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCameraInfo.createFromRawInfo(X.A0D, X.0ve, X.1VE):org.pjsip.PjCameraInfo");
    }

    public static Pair deviceSpecificSize(boolean z) {
        String str = Build.MANUFACTURER;
        if (!"samsung".equalsIgnoreCase(str)) {
            if (!z) {
                return null;
            }
            if (!isHighEndPixelModel() && !isMotorolaRazrModel() && ((!"OPPO".equals(str) || !ZOOMING_OPPO_MODELS.contains(Build.MODEL)) && (!"vivo".equals(str) || !ZOOMING_VIVO_MODELS.contains(Build.MODEL)))) {
                return null;
            }
        }
        return PAIR_1280_720;
    }

    public static Integer getNumeralFrom(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str.replaceAll("[^0-9]", "")));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static boolean isHighEndPixelModel() {
        String str = Build.MODEL;
        if (!str.contains("Pixel")) {
            return false;
        }
        String str2 = Build.MODEL;
        Integer numeralFrom = getNumeralFrom(str);
        if (numeralFrom == null || numeralFrom.intValue() < 6) {
            return false;
        }
        return true;
    }

    public static boolean isMotorolaRazrModel() {
        return Build.MODEL.contains("motorola razr");
    }

    public static /* synthetic */ int lambda$static$0(C193689qV r2, C193689qV r3) {
        int i = r2.A01;
        int i2 = r3.A01;
        if (i > i2) {
            return -1;
        }
        if (i == i2) {
            return AnonymousClass1XO.A00(r3.A00, r2.A00);
        }
        return 1;
    }

    public static C193689qV preferredCaptureSize(C18030ve r4) {
        String A01 = C18020vd.A01(C18040vf.A02, r4, 3266);
        if (!A01.isEmpty()) {
            String[] split = A01.split(",[ ]*");
            if (split.length == 2) {
                try {
                    return new C193689qV(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } catch (NumberFormatException e) {
                    Log.e("voip/video/PJCameraInfo/preferredCaptureSize invalid capture size", e);
                }
            }
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("facing ");
        if (this.facing == 0) {
            str = "back";
        } else {
            str = "front";
        }
        sb.append(str);
        sb.append(", orientation: ");
        sb.append(this.orient);
        sb.append(", returned preview formats: ");
        sb.append(Arrays.toString(this.supportedFormat));
        sb.append(", returned preview size: ");
        sb.append(Arrays.toString(this.supportedSize));
        return sb.toString();
    }

    public static int[] SizeListToIntArray(List list) {
        int[] iArr = new int[(list.size() * 2)];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C193689qV r2 = (C193689qV) it.next();
            int i2 = i + 1;
            iArr[i] = r2.A01;
            i = i2 + 1;
            iArr[i2] = r2.A00;
        }
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r1.startsWith("hwG") != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (r1.equalsIgnoreCase("ks01lte") == false) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] getEncoderSupportedColorFormats(X.AnonymousClass1VE r3) {
        /*
            android.content.SharedPreferences r2 = X.AnonymousClass1VE.A00(r3)
            java.lang.String r1 = "video_encoder_frame_convertor_color_id"
            r0 = -1
            int r3 = r2.getInt(r1, r0)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0046
            java.lang.String r1 = android.os.Build.BOARD
            java.lang.String r0 = "MSM8960"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "universal7580"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x003c
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "xcover3lte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "ks01lte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0046
        L_0x003c:
            r2 = 1
        L_0x003d:
            r1 = 3
            if (r2 == 0) goto L_0x0064
            int[] r0 = new int[r1]
            r0 = {17, 35, 842094169} // fill-array
            return r0
        L_0x0046:
            java.lang.String r1 = android.os.Build.BOARD
            java.lang.String r0 = "7x27"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x003c
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "hwY"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "hwG"
            boolean r0 = r1.startsWith(r0)
            r2 = 0
            if (r0 == 0) goto L_0x003d
            goto L_0x003c
        L_0x0064:
            r0 = 1
            if (r3 != r0) goto L_0x006d
            int[] r0 = new int[r1]
            r0 = {35, 842094169, 17} // fill-array
            return r0
        L_0x006d:
            r0 = 2
            if (r3 != r0) goto L_0x0076
            int[] r0 = new int[r1]
            r0 = {842094169, 35, 17} // fill-array
            return r0
        L_0x0076:
            if (r3 == r1) goto L_0x0081
            r0 = 4
            if (r3 == r0) goto L_0x0081
            int[] r0 = new int[r1]
            r0 = {35, 842094169, 17} // fill-array
            return r0
        L_0x0081:
            int[] r0 = new int[r1]
            r0 = {17, 35, 842094169} // fill-array
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCameraInfo.getEncoderSupportedColorFormats(X.1VE):int[]");
    }

    public PjCameraInfo(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        this.facing = i;
        this.orient = i2;
        this.supportedSize = iArr;
        this.supportedFormat = iArr2;
        this.deviceType = i3;
    }
}
