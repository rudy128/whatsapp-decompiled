package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Cw4  reason: case insensitive filesystem */
public class C26259Cw4 {
    public static final List A01;
    public static final Map A02;
    public static final Set A03;
    public static final Set A04;
    public C25396Cex A00 = C25396Cex.A00;

    public static C25265Cc6 A00(MediaCodec mediaCodec, MediaFormat mediaFormat, Surface surface, CZT czt) {
        String str;
        boolean z;
        C18030ve r2;
        MediaCodec mediaCodec2 = mediaCodec;
        if (mediaCodec.getName().equals("OMX.Exynos.avc.dec") && Build.VERSION.SDK_INT >= 31) {
            mediaFormat.removeKey("color-range");
        }
        Class<C26259Cw4> cls = C26259Cw4.class;
        try {
            String name = mediaCodec.getName();
            if (C26294Cx6.A01.BfN(3)) {
                C26294Cx6.A00(cls, StringFormatUtil.formatStrLocaleSafe("config video decoder (%s) with format: %s", name, mediaFormat));
            }
            mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, 0);
            try {
                Locale locale = Locale.US;
                Object[] A1b = AnonymousClass3MW.A1b();
                A1b[0] = A04(mediaCodec, mediaFormat);
                A1b[1] = mediaFormat;
                str = String.format(locale, "media codec:%s, format:%s", A1b);
            } catch (Throwable unused) {
                str = "";
            }
            boolean A1W = AnonymousClass000.A1W(surface);
            if (czt instanceof BWA) {
                z = true;
            } else if (!(czt instanceof BWB) || (r2 = ((BWB) czt).A00) == null) {
                z = false;
            } else {
                z = C18020vd.A05(C18040vf.A02, r2, 10154);
            }
            return new C25265Cc6(mediaCodec2, (Surface) null, AnonymousClass00R.A00, str, A1W, z);
        } catch (IllegalStateException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("codec name:");
            throw new IllegalStateException(AnonymousClass000.A0y(mediaCodec.getName(), A10), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C25265Cc6 A02(android.media.MediaFormat r13, X.C24251By9 r14, X.CZT r15, java.lang.String r16, java.lang.String r17) {
        /*
            r4 = r15
            X.Bzp r0 = X.C24354Bzp.CODEC_VIDEO_H264
            java.lang.String r0 = r0.value
            r5 = r16
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x004f
            X.Bzp r0 = X.C24354Bzp.CODEC_VIDEO_HEVC
            java.lang.String r0 = r0.value
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x004f
            X.Bzp r0 = X.C24354Bzp.CODEC_VIDEO_AV1
            java.lang.String r0 = r0.value
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x004f
            X.Bzp r0 = X.C24354Bzp.CODEC_VIDEO_H263
            java.lang.String r0 = r0.value
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x004f
            X.Bzp r0 = X.C24354Bzp.CODEC_AUDIO_AAC
            java.lang.String r0 = r0.value
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x004f
            X.Bzp r0 = X.C24354Bzp.CODEC_ANDROID_AUDIO_AAC
            java.lang.String r0 = r0.value
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x004f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unsupported codec for "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r5, r1)
            X.BW1 r1 = new X.BW1
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x004f:
            r6 = r14
            r7 = r13
            android.media.MediaCodec r11 = android.media.MediaCodec.createEncoderByType(r5)     // Catch:{ Exception -> 0x00cd }
            X.By9 r8 = X.C24251By9.SURFACE     // Catch:{ Exception -> 0x00d0 }
            r16 = 0
            r9 = 1
            r12 = 0
            java.lang.String r1 = "c2.google.av1.encoder"
            java.lang.String r0 = r11.getName()     // Catch:{ Exception -> 0x00d0 }
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x00d0 }
            if (r0 == 0) goto L_0x006f
            X.C28111Yx.A02(r15)     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r0 = "bitrate"
            r13.getInteger(r0)     // Catch:{ Exception -> 0x00d0 }
        L_0x006f:
            java.lang.Class<X.Cw4> r10 = X.C26259Cw4.class
            java.lang.String r3 = "config video encoder (%s) with format: %s"
            java.lang.String r2 = r11.getName()     // Catch:{ Exception -> 0x00d0 }
            X.EAY r0 = X.C26294Cx6.A01     // Catch:{ Exception -> 0x00d0 }
            r1 = 3
            boolean r0 = r0.BfN(r1)     // Catch:{ Exception -> 0x00d0 }
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r3, r2, r13)     // Catch:{ Exception -> 0x00d0 }
            X.C26294Cx6.A00(r10, r0)     // Catch:{ Exception -> 0x00d0 }
        L_0x0087:
            r11.configure(r13, r12, r12, r9)     // Catch:{ Exception -> 0x00d0 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = "media codec:%s, format:%s, input type:%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = A04(r11, r13)     // Catch:{ all -> 0x00a0 }
            r1[r16] = r0     // Catch:{ all -> 0x00a0 }
            r1[r9] = r13     // Catch:{ all -> 0x00a0 }
            r0 = 2
            r1[r0] = r14     // Catch:{ all -> 0x00a0 }
            java.lang.String r14 = java.lang.String.format(r3, r2, r1)     // Catch:{ all -> 0x00a0 }
            goto L_0x00a2
        L_0x00a0:
            java.lang.String r14 = ""
        L_0x00a2:
            if (r6 != r8) goto L_0x00a8
            android.view.Surface r12 = r11.createInputSurface()     // Catch:{ Exception -> 0x00d0 }
        L_0x00a8:
            if (r15 == 0) goto L_0x00c4
            boolean r0 = r15 instanceof X.BWA     // Catch:{ Exception -> 0x00d0 }
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r15 instanceof X.BWB     // Catch:{ Exception -> 0x00d0 }
            if (r0 == 0) goto L_0x00c4
            X.BWB r4 = (X.BWB) r4     // Catch:{ Exception -> 0x00d0 }
            X.0ve r2 = r4.A00     // Catch:{ Exception -> 0x00d0 }
            if (r2 == 0) goto L_0x00c4
            r1 = 10154(0x27aa, float:1.4229E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x00d0 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ Exception -> 0x00d0 }
            if (r0 == 0) goto L_0x00c4
        L_0x00c2:
            r16 = 1
        L_0x00c4:
            java.lang.Integer r13 = X.AnonymousClass00R.A01     // Catch:{ Exception -> 0x00d0 }
            r15 = 0
            X.Cc6 r10 = new X.Cc6     // Catch:{ Exception -> 0x00d0 }
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00d0 }
            return r10
        L_0x00cd:
            r4 = move-exception
            r11 = 0
            goto L_0x00d1
        L_0x00d0:
            r4 = move-exception
        L_0x00d1:
            java.util.Locale r3 = java.util.Locale.US
            r0 = 6
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r1 = "null"
            if (r11 == 0) goto L_0x00fd
            java.lang.String r0 = A04(r11, r7)
        L_0x00de:
            X.C17900vP.A0O(r0, r7, r6, r5, r2)
            boolean r0 = r4 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L_0x00ec
            r0 = r4
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            java.lang.String r1 = X.C26171Ctn.A00(r0)
        L_0x00ec:
            r0 = r17
            X.C72453Mb.A1T(r1, r0, r2)
            java.lang.String r0 = "media codec:%s, format:%s, input type:%s, mimeType:%s, mediaCodecException:%s, debugInfo:"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            X.BW2 r1 = new X.BW2
            r1.<init>(r0, r4)
            throw r1
        L_0x00fd:
            r0 = r1
            goto L_0x00de
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26259Cw4.A02(android.media.MediaFormat, X.By9, X.CZT, java.lang.String, java.lang.String):X.Cc6");
    }

    public static boolean A05(String str) {
        if (str.equals(C24354Bzp.CODEC_VIDEO_H264.value) || str.equals(C24354Bzp.CODEC_VIDEO_HEVC.value) || str.equals(C24354Bzp.CODEC_VIDEO_AV1.value) || str.equals(C24354Bzp.CODEC_VIDEO_H263.value) || str.equals(C24354Bzp.CODEC_VIDEO_MPEG4.value) || str.equals(C24354Bzp.CODEC_VIDEO_VP8.value) || str.equals(C24354Bzp.CODEC_FFMPEG_VIDEO_MPEG4.value)) {
            return true;
        }
        return false;
    }

    public C25265Cc6 A06(MediaFormat mediaFormat, Surface surface, CZT czt, List list, boolean z) {
        String string = mediaFormat.getString("mime");
        C28111Yx.A02(string);
        C24804CKx A032 = A03(string, list, z);
        if (A032 == null) {
            C26171Ctn.A03(false, (String) null);
            if (!(czt instanceof BWB)) {
                C26171Ctn.A03(A05(string), (String) null);
            }
            A032 = A03(string, (List) null, z);
            if (A032 == null) {
                throw new BW1(AnonymousClass001.A1H("Unsupported codec for ", string, AnonymousClass000.A10()));
            }
        }
        MediaCodec createByCodecName = MediaCodec.createByCodecName(A032.A00);
        mediaFormat.setInteger("max-input-size", 0);
        return A00(createByCodecName, mediaFormat, surface, czt);
    }

    static {
        HashSet A12 = C17880vN.A12();
        A03 = A12;
        A12.add("OMX.ittiam.video.encoder.avc");
        A12.add("OMX.Exynos.avc.enc");
        HashMap A11 = C17880vN.A11();
        A02 = A11;
        A11.put("OMX.qcom.video.encoder.avc", 21);
        HashSet A122 = C17880vN.A12();
        A04 = A122;
        A122.add("GT-S6812i");
        A122.add("GT-I8552");
        A122.add("GT-I8552B");
        ArrayList A0n = BE8.A0n("GT-I8262B", A122);
        A01 = A0n;
        A0n.add("OMX.SEC.AVC.Encoder");
        A0n.add("OMX.SEC.avc.enc");
    }

    public static C25265Cc6 A01(MediaFormat mediaFormat, Surface surface, CZT czt, String str) {
        if (A05(str) || (czt instanceof BWB)) {
            try {
                return A00(MediaCodec.createDecoderByType(str), mediaFormat, surface, czt);
            } catch (IOException e) {
                throw new BW1((Throwable) e);
            }
        } else {
            throw new BW1(AnonymousClass001.A1H("Unsupported codec for ", str, AnonymousClass000.A10()));
        }
    }

    public static C24804CKx A03(String str, List list, boolean z) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder() && Arrays.asList(codecInfoAt.getSupportedTypes()).contains(str)) {
                String name = codecInfoAt.getName();
                if ((list == null || list.isEmpty() || !list.contains(name)) && (!z || Build.VERSION.SDK_INT < 29 || codecInfoAt.isSoftwareOnly())) {
                    return new C24804CKx(name);
                }
            }
        }
        return null;
    }

    public static String A04(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        boolean z;
        int[] iArr;
        boolean z2;
        MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
        StringBuilder A10 = AnonymousClass000.A10();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("name=");
        C108985cd.A1L(codecInfo.getName(), A102, A10);
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append(" is encoder=");
        A103.append(codecInfo.isEncoder());
        StringBuilder A0q = C108985cd.A0q(A103, A10);
        A0q.append(" supported types=");
        C108985cd.A1L(Arrays.toString(codecInfo.getSupportedTypes()), A0q, A10);
        if (Build.VERSION.SDK_INT >= 29) {
            StringBuilder A104 = AnonymousClass000.A10();
            A104.append(" is vendor=");
            A104.append(codecInfo.isVendor());
            StringBuilder A0q2 = C108985cd.A0q(A104, A10);
            A0q2.append(" is alias=");
            A0q2.append(codecInfo.isAlias());
            StringBuilder A0q3 = C108985cd.A0q(A0q2, A10);
            A0q3.append(" is software only=");
            A0q3.append(codecInfo.isSoftwareOnly());
            AnonymousClass8BS.A1D(A0q3, A10);
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfo.getCapabilitiesForType(mediaFormat.getString("mime"));
        try {
            i = mediaFormat.getInteger("color-format");
        } catch (Exception unused) {
            i = -1;
        }
        if (i > 0 && (iArr = capabilitiesForType.colorFormats) != null) {
            int length = iArr.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    z2 = false;
                    break;
                } else if (iArr[i8] == i) {
                    z2 = true;
                    break;
                } else {
                    i8++;
                }
            }
            A10.append(C17900vP.A0D(" color format supported=", AnonymousClass000.A10(), z2));
        }
        int i9 = -1;
        try {
            i2 = mediaFormat.getInteger("profile");
        } catch (Exception unused2) {
            i2 = -1;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                i9 = mediaFormat.getInteger("level");
            } catch (Exception unused3) {
                i9 = -1;
            }
        }
        StringBuilder A105 = AnonymousClass000.A10();
        A105.append(" Checking for profile=");
        A105.append(i2);
        A10.append(AnonymousClass001.A1I(" level=", A105, i9));
        if (i2 > 0 && i9 > 0 && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null) {
            int length2 = codecProfileLevelArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    z = false;
                    break;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i10];
                StringBuilder A106 = AnonymousClass000.A10();
                A106.append(" codecProfileLevel.profile=");
                int i11 = codecProfileLevel.profile;
                A106.append(i11);
                A106.append(" codecProfileLevel.level=");
                A106.append(codecProfileLevel.level);
                AnonymousClass8BS.A1D(A106, A10);
                if (i11 == i2 && codecProfileLevel.level == i9) {
                    z = true;
                    break;
                }
                i10++;
            }
            A10.append(C17900vP.A0D(" profile level supported=", AnonymousClass000.A10(), z));
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
        try {
            i3 = mediaFormat.getInteger("width");
        } catch (Exception unused4) {
            i3 = -1;
        }
        try {
            i4 = mediaFormat.getInteger("height");
        } catch (Exception unused5) {
            i4 = -1;
        }
        boolean isSizeSupported = videoCapabilities.isSizeSupported(i3, i4);
        A10.append(C17900vP.A0D(" size supported=", AnonymousClass000.A10(), isSizeSupported));
        if (isSizeSupported) {
            try {
                i7 = mediaFormat.getInteger("frame-rate");
            } catch (Exception unused6) {
                i7 = -1;
            }
            double d = (double) i7;
            if (d > 0.0d) {
                StringBuilder A107 = AnonymousClass000.A10();
                A107.append(" frame-rate supported=");
                A107.append(videoCapabilities.getSupportedFrameRatesFor(i3, i4).contains(Double.valueOf(d)));
                AnonymousClass8BS.A1D(A107, A10);
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[4];
            BEA.A1V(objArr, i3, 0, i4, 1);
            objArr[2] = videoCapabilities.getSupportedFrameRatesFor(i3, i4).getLower();
            objArr[3] = videoCapabilities.getSupportedFrameRatesFor(i3, i4).getUpper();
            A10.append(String.format(locale, " supported frame-rates for %d x %d = [%.2f, %.2f]", objArr));
        }
        StringBuilder A108 = AnonymousClass000.A10();
        A108.append(" width alignment=");
        A108.append(videoCapabilities.getWidthAlignment());
        StringBuilder A0q4 = C108985cd.A0q(A108, A10);
        A0q4.append(" height alignment=");
        A0q4.append(videoCapabilities.getHeightAlignment());
        AnonymousClass8BS.A1D(A0q4, A10);
        try {
            i5 = mediaFormat.getInteger("bitrate");
        } catch (Exception unused7) {
            i5 = -1;
        }
        if (i5 > 0) {
            StringBuilder A109 = AnonymousClass000.A10();
            A109.append(" bitrate supported=");
            A109.append(videoCapabilities.getBitrateRange().contains(Integer.valueOf(i5)));
            AnonymousClass8BS.A1D(A109, A10);
        }
        try {
            i6 = mediaFormat.getInteger("bitrate-mode");
        } catch (Exception unused8) {
            i6 = -1;
        }
        if (i6 > 0) {
            StringBuilder A1010 = AnonymousClass000.A10();
            A1010.append(" bitrate mode supported=");
            C28111Yx.A02(encoderCapabilities);
            A1010.append(encoderCapabilities.isBitrateModeSupported(i6));
            AnonymousClass8BS.A1D(A1010, A10);
        }
        return AnonymousClass000.A0y(String.format(Locale.US, " supported widths=[%d, %d] supported heights=[%d, %d] supported bitrate=[%d, %d]", new Object[]{videoCapabilities.getSupportedWidths().getLower(), videoCapabilities.getSupportedWidths().getUpper(), videoCapabilities.getSupportedHeights().getLower(), videoCapabilities.getSupportedHeights().getUpper(), videoCapabilities.getBitrateRange().getLower(), videoCapabilities.getBitrateRange().getUpper()}), A10);
    }
}
