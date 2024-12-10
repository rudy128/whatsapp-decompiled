package org.wawebrtc;

import X.AnonymousClass000;
import X.AnonymousClass1DC;
import X.AnonymousClass1VE;
import X.AnonymousClass8BR;
import X.BEA;
import X.C17880vN;
import X.C24282Byf;
import X.C24445C4k;
import X.C24648CDn;
import X.C24895COo;
import X.C24941CQr;
import X.C25514ChC;
import X.C63912tt;
import X.CY8;
import X.E04;
import X.E3U;
import android.media.MediaCodec;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Surface;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MediaCodecVideoEncoder {
    public static final int DEQUEUE_TIMEOUT = 0;
    public static final String[] H264_HW_EXCEPTION_MODELS = {"SAMSUNG-SGH-I337", "Nexus 7"};
    public static final String H264_MIME_TYPE = "video/avc";
    public static final String[] H265_HW_EXCEPTION_MODELS = new String[0];
    public static final String H265_MIME_TYPE = "video/hevc";
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final int MIN_ENCODER_HEIGHT = 144;
    public static final int MIN_ENCODER_WIDTH = 176;
    public static final String TAG = "MediaCodecVideoEncoder";
    public static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    public static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    public static final String[] blacklistedHwCodecPrefixes = new String[0];
    public static final Map cachedCodecCapabilites = C17880vN.A11();
    public static int codecErrors;
    public static E3U errorCallback;
    public static final String[] h264BlacklistedBuildHardware = {"sc8830", "sc8830a", "samsungexynos7580"};
    public static final String[] h265BlacklistedBuildHardware = new String[0];
    public static final Set hwEncoderDisabledTypes = C17880vN.A12();
    public static long lastReleaseTimestamp;
    public static MediaCodecVideoEncoder runningInstance;
    public static final String[] supportedH264HwCodecPrefixes = null;
    public static final String[] supportedH265HwCodecPrefixes = null;
    public static final int[] supportedSurfaceColorList = {2130708361};
    public static final String[] supportedVp8HwCodecPrefixes = {"OMX.qcom.", "OMX.Intel."};
    public static final String[] supportedVp9HwCodecPrefixes = {"OMX.qcom."};
    public static final String[] trustedCodecPrefixes = {"OMX.qcom.", "OMX.Exynos.", "OMX.google", "OMX.IMG."};
    public final MediaCodec.BufferInfo cachedBufferInfo = new MediaCodec.BufferInfo();
    public final BufferInfo cachedInputBuffer = new Object();
    public final BufferInfo cachedOutputBuffer = new Object();
    public final Queue carryAlongInfos = AnonymousClass8BR.A14();
    public String codecName;
    public int colorFormat;
    public int colorId;
    public C25514ChC drawer;
    public E04 eglBase;
    public final List freeInfos = AnonymousClass8BR.A14();
    public int height;
    public ByteBuffer[] inputBuffers;
    public Surface inputSurface;
    public final Bundle keyFrameRequestBundle = C17880vN.A0D();
    public MediaCodec mediaCodec;
    public Thread mediaCodecThread;
    public ByteBuffer[] outputBuffers;
    public final AnonymousClass1DC systemFeatures;
    public C24282Byf type;
    public final AnonymousClass1VE voipSharedPreferences;
    public int width;

    public class BufferInfo {
        public int bitInfo;
        public ByteBuffer buffer;
        public long encodeTimeMs;
        public int index;
        public boolean isConfigData;
        public boolean isKeyFrame;
        public long timestamp;

        public void set(int i, ByteBuffer byteBuffer, boolean z, long j, long j2, int i2, boolean z2) {
            this.index = i;
            this.buffer = byteBuffer;
            this.isKeyFrame = z;
            this.timestamp = j;
            this.encodeTimeMs = j2;
            this.bitInfo = i2;
            this.isConfigData = z2;
        }
    }

    private void checkOnMediaCodecThread() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.CQr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: X.CQr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: X.CQr} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046 A[Catch:{ IllegalStateException -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e A[Catch:{ IllegalStateException -> 0x0050 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean encodeBuffer(boolean r12, int r13, int r14, long r15, long r17, int r19) {
        /*
            r11 = this;
            r3 = 1
            r6 = 0
            if (r12 == 0) goto L_0x0011
            boolean r0 = r11.supportForceKeyFrame()     // Catch:{ IllegalStateException -> 0x0050 }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "MediaCodecVideoEncoder force Keyframe"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0050 }
            r10 = 1
            goto L_0x0012
        L_0x0011:
            r10 = 0
        L_0x0012:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0050 }
            java.util.List r0 = r11.freeInfos     // Catch:{ IllegalStateException -> 0x0050 }
            boolean r0 = r0.isEmpty()     // Catch:{ IllegalStateException -> 0x0050 }
            if (r0 == 0) goto L_0x0046
            X.CQr r0 = new X.CQr     // Catch:{ IllegalStateException -> 0x0050 }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x0050 }
        L_0x0023:
            r0.A01 = r1     // Catch:{ IllegalStateException -> 0x0050 }
            r0.A02 = r15     // Catch:{ IllegalStateException -> 0x0050 }
            r1 = r19
            r0.A00 = r1     // Catch:{ IllegalStateException -> 0x0050 }
            java.util.Queue r1 = r11.carryAlongInfos     // Catch:{ IllegalStateException -> 0x0050 }
            r1.add(r0)     // Catch:{ IllegalStateException -> 0x0050 }
            android.media.MediaCodec r0 = r11.mediaCodec     // Catch:{ IllegalStateException -> 0x0050 }
            r5 = r13
            java.nio.ByteBuffer r0 = r0.getInputBuffer(r13)     // Catch:{ IllegalStateException -> 0x0050 }
            r0.position(r6)     // Catch:{ IllegalStateException -> 0x0050 }
            r7 = r14
            r0.limit(r14)     // Catch:{ IllegalStateException -> 0x0050 }
            android.media.MediaCodec r4 = r11.mediaCodec     // Catch:{ IllegalStateException -> 0x0050 }
            r8 = r17
            r4.queueInputBuffer(r5, r6, r7, r8, r10)     // Catch:{ IllegalStateException -> 0x0050 }
            goto L_0x004f
        L_0x0046:
            java.util.List r0 = r11.freeInfos     // Catch:{ IllegalStateException -> 0x0050 }
            java.lang.Object r0 = r0.remove(r6)     // Catch:{ IllegalStateException -> 0x0050 }
            X.CQr r0 = (X.C24941CQr) r0     // Catch:{ IllegalStateException -> 0x0050 }
            goto L_0x0023
        L_0x004f:
            return r3
        L_0x0050:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoEncoder encodeBuffer failed"
            com.whatsapp.util.Log.e(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.encodeBuffer(boolean, int, int, long, long, int):boolean");
    }

    public boolean releaseOutputBuffer(int i) {
        try {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } catch (IllegalStateException e) {
            Log.e("MediaCodecVideoEncoder releaseOutputBuffer failed", e);
            return false;
        }
    }

    public static void disableH264HwCodec() {
        Log.w("MediaCodecVideoEncoder H.264 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/avc");
    }

    public static void disableH265HwCodec() {
        Log.w("MediaCodecVideoEncoder H.265 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/hevc");
    }

    public static void disableVp8HwCodec() {
        Log.w("MediaCodecVideoEncoder VP8 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Log.w("MediaCodecVideoEncoder VP9 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01e7, code lost:
        if ("OMX.SEC.avc.enc".equalsIgnoreCase(r9) != false) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ef, code lost:
        if ("OMX.IMG.TOPAZ.VIDEO.Encoder".equalsIgnoreCase(r9) == false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f1, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f4, code lost:
        if (r1 != r4) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f6, code lost:
        r0 = X.AnonymousClass000.A10();
        r0.append("MediaCodecVideoEncoder Found target encoder for mime ");
        r0.append(r14);
        r0.append(" : ");
        r0.append(r9);
        X.BE9.A1J(". Color: 0x", r0, r1);
        r0.append("(");
        r0.append(r1);
        X.C17890vO.A1A(r0, ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x021c, code lost:
        if (r5 != null) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x021e, code lost:
        r5 = r8.getVideoCapabilities();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0222, code lost:
        if (r1 != r7) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0224, code lost:
        r11 = r12.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0228, code lost:
        r12.add(new X.C24974CRz(r5, r9, r8.profileLevels, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0233, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0236, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0238, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x023a, code lost:
        if (r5 == null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x023c, code lost:
        if (r26 == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x023e, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("MediaCodecVideoEncoder birtate range: ");
        r1.append(r5.getBitrateRange());
        r1.append(", frame rate: ");
        r1.append(r5.getSupportedFrameRates());
        r1.append(", height alignment: ");
        r1.append(r5.getHeightAlignment());
        r1.append(", width alignment: ");
        r1.append(r5.getWidthAlignment());
        r1.append(", height range: ");
        r1.append(r5.getSupportedHeights());
        r1.append(", width range: ");
        r1.append(r5.getSupportedWidths());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x028c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x028d, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("MediaCodecVideoEncoder failed to get capabilities for ");
        X.C108985cd.A1M(r9, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ee, code lost:
        if (r0 == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f0, code lost:
        r1 = X.AnonymousClass8BW.A0o("MediaCodecVideoEncoder ", r9);
        r1.append(" is not supported on ");
        r1.append(android.os.Build.MODEL);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010c, code lost:
        if (r14.equals("video/hevc") != false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010e, code lost:
        r2 = X.AnonymousClass001.A1H("_", r14, X.AnonymousClass000.A11(r9));
        r1 = cachedCodecCapabilites;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011e, code lost:
        if (r1.containsKey(r2) == false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0120, code lost:
        r8 = (android.media.MediaCodecInfo.CodecCapabilities) r1.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0126, code lost:
        r3 = r25;
        r5 = X.C108975cc.A19(r3);
        r4 = r8.profileLevels;
        r2 = r4.length;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0130, code lost:
        if (r1 >= r2) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0132, code lost:
        r0 = r4[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0134, code lost:
        if (r25 < 0) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0138, code lost:
        if (r0.profile != r3) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013a, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013b, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r8 = r3.getCapabilitiesForType(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0142, code lost:
        r1.put(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0146, code lost:
        if (r5 != false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0148, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("MediaCodecVideoEncoder  ");
        r1.append(r9);
        r1.append(" does not support Profile ");
        r1.append(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015e, code lost:
        if (r26 == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0160, code lost:
        r5 = r8.colorFormats;
        r4 = r5.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0164, code lost:
        if (r3 >= r4) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0166, code lost:
        r2 = r5[r3];
        r1 = X.AnonymousClass000.A10();
        r1.append("MediaCodecVideoEncoder    Supported Color: 0x");
        X.C17890vO.A1A(r1, java.lang.Integer.toHexString(r2));
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x017b, code lost:
        r2 = r8.getEncoderCapabilities();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x017f, code lost:
        if (r2 == null) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0181, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("MediaCodecVideoEncoder    CBR: ");
        r1.append(r2.isBitrateModeSupported(2));
        r1.append(", VBR: ");
        r1.append(r2.isBitrateModeSupported(1));
        r1.append(",  CQ: ");
        X.C17900vP.A0r(r1, r2.isBitrateModeSupported(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ac, code lost:
        if (r13 != null) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ae, code lost:
        r1 = com.whatsapp.voipcalling.Voip.A05("vid_driver.encoder_color_format");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ba, code lost:
        if (r9.equalsIgnoreCase(r20) == false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01bc, code lost:
        if (r1 == null) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01be, code lost:
        r7 = r1.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c2, code lost:
        r13 = X.C63912tt.A05(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c6, code lost:
        r22 = r13.length;
        r6 = 0;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01cd, code lost:
        if (r6 >= r22) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01cf, code lost:
        r4 = r13[r6];
        r3 = r8.colorFormats;
        r21 = r3.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01d9, code lost:
        if (r2 >= r21) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01db, code lost:
        r1 = r3[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01df, code lost:
        if (r4 != 19) goto L_0x01f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02cc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List findHwEncoder(java.lang.String r22, java.lang.String[] r23, int[] r24, int r25, boolean r26) {
        /*
            r13 = r24
            java.lang.String r0 = "vid_driver.encoder_name"
            java.lang.String r20 = com.whatsapp.voipcalling.Voip.A07(r0)
            java.lang.String r0 = "video/avc"
            r14 = r22
            boolean r19 = r14.equals(r0)
            java.lang.String r3 = " is not supported."
            java.lang.String r18 = "video/hevc"
            java.lang.String r17 = "MediaCodecVideoEncoder Model: "
            r2 = 0
            if (r19 == 0) goto L_0x0029
            boolean r0 = X.C39761tb.A04()
            if (r0 == 0) goto L_0x0051
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r17)
            java.lang.String r0 = android.os.Build.MODEL
            X.C17900vP.A0e(r0, r3, r1)
            return r2
        L_0x0029:
            r0 = r18
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x004e
            java.lang.String[] r4 = H265_HW_EXCEPTION_MODELS
            int r3 = r4.length
            r2 = 0
        L_0x0035:
            if (r2 >= r3) goto L_0x004b
            r1 = r4[r2]
            java.lang.String r0 = android.os.Build.MODEL
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0048
            r16 = 1
        L_0x0043:
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String[] r0 = h265BlacklistedBuildHardware
            goto L_0x0067
        L_0x0048:
            int r2 = r2 + 1
            goto L_0x0035
        L_0x004b:
            r16 = 0
            goto L_0x0043
        L_0x004e:
            r16 = 0
            goto L_0x006f
        L_0x0051:
            java.lang.String[] r4 = H264_HW_EXCEPTION_MODELS
            int r3 = r4.length
            r2 = 0
        L_0x0055:
            if (r2 >= r3) goto L_0x02a6
            r1 = r4[r2]
            java.lang.String r0 = android.os.Build.MODEL
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x02a2
            r16 = 1
        L_0x0063:
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String[] r0 = h264BlacklistedBuildHardware
        L_0x0067:
            boolean r0 = X.C63912tt.A04(r1, r0)
            if (r0 == 0) goto L_0x006f
            r16 = 1
        L_0x006f:
            java.util.LinkedList r12 = X.AnonymousClass8BR.A14()
            r11 = -1
            r10 = 0
        L_0x0075:
            int r0 = android.media.MediaCodecList.getCodecCount()
            if (r10 >= r0) goto L_0x02aa
            android.media.MediaCodecInfo r3 = android.media.MediaCodecList.getCodecInfoAt(r10)
            boolean r0 = r3.isEncoder()
            if (r0 == 0) goto L_0x00c5
            java.lang.String[] r4 = r3.getSupportedTypes()
            int r2 = r4.length
            r1 = 0
        L_0x008b:
            if (r1 >= r2) goto L_0x029f
            r0 = r4[r1]
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x029b
            java.lang.String r9 = r3.getName()
        L_0x0099:
            if (r9 == 0) goto L_0x00c5
            if (r16 == 0) goto L_0x00c8
            java.lang.String r0 = "OMX.google"
            boolean r0 = r9.startsWith(r0)
            if (r0 != 0) goto L_0x00c8
            r0 = r20
            boolean r0 = r9.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00c8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r17)
            java.lang.String r0 = android.os.Build.MODEL
            r1.append(r0)
            java.lang.String r0 = " has black listed H.264 hw encoder "
            r1.append(r0)
        L_0x00bb:
            r1.append(r9)
        L_0x00be:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00c5:
            int r10 = r10 + 1
            goto L_0x0075
        L_0x00c8:
            if (r26 == 0) goto L_0x00d3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaCodecVideoEncoder Found candidate encoder "
            X.C17900vP.A0f(r0, r9, r1)
        L_0x00d3:
            java.lang.String[] r0 = blacklistedHwCodecPrefixes
            java.lang.String r1 = "MediaCodecVideoEncoder "
            if (r0 == 0) goto L_0x00e6
            boolean r0 = X.C63912tt.A04(r9, r0)
            if (r0 == 0) goto L_0x00e6
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r1, r9)
            java.lang.String r9 = " is in the blacklist."
            goto L_0x00bb
        L_0x00e6:
            r0 = r23
            if (r23 == 0) goto L_0x00ff
            boolean r0 = X.C63912tt.A04(r9, r0)
        L_0x00ee:
            if (r0 != 0) goto L_0x010e
        L_0x00f0:
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r1, r9)
            java.lang.String r0 = " is not supported on "
            r1.append(r0)
            java.lang.String r0 = android.os.Build.MODEL
            r1.append(r0)
            goto L_0x00be
        L_0x00ff:
            if (r19 == 0) goto L_0x0106
            boolean r0 = X.C39761tb.A0F(r9)
            goto L_0x00ee
        L_0x0106:
            r0 = r18
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x00f0
        L_0x010e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r9)
            java.lang.String r0 = "_"
            java.lang.String r2 = X.AnonymousClass001.A1H(r0, r14, r1)
            java.util.Map r1 = cachedCodecCapabilites
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x013e
            java.lang.Object r8 = r1.get(r2)
            android.media.MediaCodecInfo$CodecCapabilities r8 = (android.media.MediaCodecInfo.CodecCapabilities) r8
        L_0x0126:
            r3 = r25
            boolean r5 = X.C108975cc.A19(r3)
            android.media.MediaCodecInfo$CodecProfileLevel[] r4 = r8.profileLevels
            int r2 = r4.length
            r1 = 0
        L_0x0130:
            if (r1 >= r2) goto L_0x0146
            r0 = r4[r1]
            if (r25 < 0) goto L_0x013b
            int r0 = r0.profile
            if (r0 != r3) goto L_0x013b
            r5 = 1
        L_0x013b:
            int r1 = r1 + 1
            goto L_0x0130
        L_0x013e:
            android.media.MediaCodecInfo$CodecCapabilities r8 = r3.getCapabilitiesForType(r14)     // Catch:{ all -> 0x028c }
            r1.put(r2, r8)
            goto L_0x0126
        L_0x0146:
            if (r5 != 0) goto L_0x015e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaCodecVideoEncoder  "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " does not support Profile "
            r1.append(r0)
            r1.append(r3)
            goto L_0x00be
        L_0x015e:
            if (r26 == 0) goto L_0x01ac
            int[] r5 = r8.colorFormats
            int r4 = r5.length
            r3 = 0
        L_0x0164:
            if (r3 >= r4) goto L_0x017b
            r2 = r5[r3]
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaCodecVideoEncoder    Supported Color: 0x"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r2)
            X.C17890vO.A1A(r1, r0)
            int r3 = r3 + 1
            goto L_0x0164
        L_0x017b:
            android.media.MediaCodecInfo$EncoderCapabilities r2 = r8.getEncoderCapabilities()
            if (r2 == 0) goto L_0x01ac
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaCodecVideoEncoder    CBR: "
            r1.append(r0)
            r0 = 2
            boolean r0 = r2.isBitrateModeSupported(r0)
            r1.append(r0)
            java.lang.String r0 = ", VBR: "
            r1.append(r0)
            r0 = 1
            boolean r0 = r2.isBitrateModeSupported(r0)
            r1.append(r0)
            java.lang.String r0 = ",  CQ: "
            r1.append(r0)
            r0 = 0
            boolean r0 = r2.isBitrateModeSupported(r0)
            X.C17900vP.A0r(r1, r0)
        L_0x01ac:
            if (r13 != 0) goto L_0x0238
            java.lang.String r0 = "vid_driver.encoder_color_format"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A05(r0)
            r0 = r20
            boolean r0 = r9.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0236
            if (r1 == 0) goto L_0x0236
            int r7 = r1.intValue()
        L_0x01c2:
            int[] r13 = X.C63912tt.A05(r9, r7)
        L_0x01c6:
            int r0 = r13.length
            r22 = r0
            r6 = 0
            r5 = 0
        L_0x01cb:
            r0 = r22
            if (r6 >= r0) goto L_0x023a
            r4 = r13[r6]
            int[] r3 = r8.colorFormats
            int r0 = r3.length
            r21 = r0
            r2 = 0
        L_0x01d7:
            r0 = r21
            if (r2 >= r0) goto L_0x0233
            r1 = r3[r2]
            r0 = 19
            if (r4 != r0) goto L_0x01f4
            java.lang.String r0 = "OMX.SEC.avc.enc"
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 != 0) goto L_0x01f1
            java.lang.String r0 = "OMX.IMG.TOPAZ.VIDEO.Encoder"
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x01f4
        L_0x01f1:
            int r2 = r2 + 1
            goto L_0x01d7
        L_0x01f4:
            if (r1 != r4) goto L_0x01f1
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r15 = "MediaCodecVideoEncoder Found target encoder for mime "
            r0.append(r15)
            r0.append(r14)
            java.lang.String r15 = " : "
            r0.append(r15)
            r0.append(r9)
            java.lang.String r15 = ". Color: 0x"
            X.BE9.A1J(r15, r0, r1)
            java.lang.String r15 = "("
            r0.append(r15)
            r0.append(r1)
            java.lang.String r15 = ")"
            X.C17890vO.A1A(r0, r15)
            if (r5 != 0) goto L_0x0222
            android.media.MediaCodecInfo$VideoCapabilities r5 = r8.getVideoCapabilities()
        L_0x0222:
            if (r1 != r7) goto L_0x0228
            int r11 = r12.size()
        L_0x0228:
            android.media.MediaCodecInfo$CodecProfileLevel[] r15 = r8.profileLevels
            X.CRz r0 = new X.CRz
            r0.<init>(r5, r9, r15, r1)
            r12.add(r0)
            goto L_0x01f1
        L_0x0233:
            int r6 = r6 + 1
            goto L_0x01cb
        L_0x0236:
            r7 = 0
            goto L_0x01c2
        L_0x0238:
            r7 = 0
            goto L_0x01c6
        L_0x023a:
            if (r5 == 0) goto L_0x00c5
            if (r26 == 0) goto L_0x00c5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaCodecVideoEncoder birtate range: "
            r1.append(r0)
            android.util.Range r0 = r5.getBitrateRange()
            r1.append(r0)
            java.lang.String r0 = ", frame rate: "
            r1.append(r0)
            android.util.Range r0 = r5.getSupportedFrameRates()
            r1.append(r0)
            java.lang.String r0 = ", height alignment: "
            r1.append(r0)
            int r0 = r5.getHeightAlignment()
            r1.append(r0)
            java.lang.String r0 = ", width alignment: "
            r1.append(r0)
            int r0 = r5.getWidthAlignment()
            r1.append(r0)
            java.lang.String r0 = ", height range: "
            r1.append(r0)
            android.util.Range r0 = r5.getSupportedHeights()
            r1.append(r0)
            java.lang.String r0 = ", width range: "
            r1.append(r0)
            android.util.Range r0 = r5.getSupportedWidths()
            r1.append(r0)
            goto L_0x00be
        L_0x028c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaCodecVideoEncoder failed to get capabilities for "
            r1.append(r0)
            X.C108985cd.A1M(r9, r1, r2)
            goto L_0x00c5
        L_0x029b:
            int r1 = r1 + 1
            goto L_0x008b
        L_0x029f:
            r9 = 0
            goto L_0x0099
        L_0x02a2:
            int r2 = r2 + 1
            goto L_0x0055
        L_0x02a6:
            r16 = 0
            goto L_0x0063
        L_0x02aa:
            if (r11 < 0) goto L_0x02bb
            java.lang.Object r2 = r12.get(r11)
            r1 = 0
            java.lang.Object r0 = r12.get(r1)
            r12.set(r11, r0)
            r12.set(r1, r2)
        L_0x02bb:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x02cc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaCodecVideoEncoder No HW encoder found for mime "
            X.C17900vP.A0f(r0, r14, r1)
            r0 = 0
            return r0
        L_0x02cc:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.findHwEncoder(java.lang.String, java.lang.String[], int[], int, boolean):java.util.List");
    }

    private int getCodecKeyFrameInterval() {
        return AnonymousClass000.A09(C63912tt.A04(this.codecName, trustedCodecPrefixes) ? 1 : 0);
    }

    private int getDequeueOutputTimeout() {
        String str = this.codecName;
        boolean A04 = C63912tt.A04(str, trustedCodecPrefixes);
        if ("OMX.google.h264.encoder".equalsIgnoreCase(str)) {
            return 100;
        }
        if (A04) {
            return 30;
        }
        return 1000;
    }

    private ByteBuffer getInputBuffer(int i) {
        return this.mediaCodec.getInputBuffer(i);
    }

    private ByteBuffer getOutputBuffer(int i) {
        return this.mediaCodec.getOutputBuffer(i);
    }

    public static boolean isH264HwSupported() {
        if (!hwEncoderDisabledTypes.contains("video/avc")) {
            return BEA.A1a("video/avc", (int[]) null, supportedH264HwCodecPrefixes);
        }
        return false;
    }

    public static boolean isH264HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/avc")) {
            return false;
        }
        return BEA.A1a("video/avc", supportedSurfaceColorList, supportedH264HwCodecPrefixes);
    }

    public static boolean isH265HwSupported() {
        if (hwEncoderDisabledTypes.contains("video/hevc") || findHwEncoder("video/hevc", supportedH265HwCodecPrefixes, (int[]) null, -1, true) == null) {
            return false;
        }
        return true;
    }

    public static boolean isH265HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/hevc")) {
            return false;
        }
        return BEA.A1a("video/hevc", supportedSurfaceColorList, supportedH265HwCodecPrefixes);
    }

    public static boolean isVp8HwSupported() {
        if (!hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8")) {
            return BEA.A1a("video/x-vnd.on2.vp8", (int[]) null, supportedVp8HwCodecPrefixes);
        }
        return false;
    }

    public static boolean isVp8HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8")) {
            return false;
        }
        return BEA.A1a("video/x-vnd.on2.vp8", supportedSurfaceColorList, supportedVp8HwCodecPrefixes);
    }

    public static boolean isVp9HwSupported() {
        if (!hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9")) {
            return BEA.A1a("video/x-vnd.on2.vp9", (int[]) null, supportedVp9HwCodecPrefixes);
        }
        return false;
    }

    public static boolean isVp9HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9")) {
            return false;
        }
        return BEA.A1a("video/x-vnd.on2.vp9", supportedSurfaceColorList, supportedVp9HwCodecPrefixes);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r3 = r0.getStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void printStackTrace() {
        /*
            org.wawebrtc.MediaCodecVideoEncoder r0 = runningInstance
            if (r0 == 0) goto L_0x0023
            java.lang.Thread r0 = r0.mediaCodecThread
            if (r0 == 0) goto L_0x0023
            java.lang.StackTraceElement[] r3 = r0.getStackTrace()
            int r2 = r3.length
            if (r2 <= 0) goto L_0x0023
            java.lang.String r0 = "MediaCodecVideoEncoder  stacks trace:"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
        L_0x0015:
            r0 = r3[r1]
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x0023
            goto L_0x0015
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.printStackTrace():void");
    }

    public static void setErrorCallback(E3U e3u) {
        Log.i("MediaCodecVideoEncoder Set error callback");
        errorCallback = e3u;
    }

    public BufferInfo dequeueInputBuffer() {
        try {
            int dequeueInputBuffer = this.mediaCodec.dequeueInputBuffer(0);
            if (dequeueInputBuffer < 0) {
                return null;
            }
            this.cachedInputBuffer.set(dequeueInputBuffer, this.mediaCodec.getInputBuffer(dequeueInputBuffer), false, 0, 0, 0, false);
            return this.cachedInputBuffer;
        } catch (Throwable th) {
            Log.e(th);
            throw th;
        }
    }

    public BufferInfo dequeueOutputBuffer(int i) {
        try {
            MediaCodec.BufferInfo bufferInfo = this.cachedBufferInfo;
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, (long) i);
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer outputBuffer = this.mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                BEA.A15(bufferInfo, outputBuffer);
                int i2 = bufferInfo.flags;
                if ((i2 & 2) != 0) {
                    this.cachedOutputBuffer.set(dequeueOutputBuffer, outputBuffer.slice(), false, 0, 0, 0, true);
                    return this.cachedOutputBuffer;
                }
                boolean A1O = AnonymousClass000.A1O(i2 & 1);
                C24941CQr cQr = (C24941CQr) this.carryAlongInfos.remove();
                int i3 = cQr.A00;
                this.cachedOutputBuffer.set(dequeueOutputBuffer, outputBuffer.slice(), A1O, cQr.A02, SystemClock.elapsedRealtime() - cQr.A01, i3, false);
                this.freeInfos.add(cQr);
                return this.cachedOutputBuffer;
            } else if (dequeueOutputBuffer == -3) {
                return dequeueOutputBuffer(i);
            } else {
                if (dequeueOutputBuffer == -2) {
                    return dequeueOutputBuffer(i);
                }
                if (dequeueOutputBuffer == -1) {
                    return null;
                }
                throw BEA.A0h("dequeueOutputBuffer: ", AnonymousClass000.A10(), dequeueOutputBuffer);
            }
        } catch (IllegalStateException e) {
            Log.e("MediaCodecVideoEncoder dequeueOutputBuffer failed", e);
            BufferInfo bufferInfo2 = this.cachedOutputBuffer;
            bufferInfo2.set(-1, (ByteBuffer) null, false, -1, -1, 0, false);
            return bufferInfo2;
        }
    }

    public boolean encodeTexture(boolean z, int i, float[] fArr, long j) {
        RuntimeException runtimeException;
        C24895COo cOo;
        if (z) {
            try {
                Log.i("MediaCodecVideoEncoder Sync frame request");
                this.mediaCodec.setParameters(this.keyFrameRequestBundle);
            } catch (RuntimeException e) {
                Log.e("MediaCodecVideoEncoder encodeTexture failed", e);
                return false;
            }
        }
        this.eglBase.A04();
        GLES20.glClear(16384);
        C25514ChC chC = this.drawer;
        int i2 = this.width;
        int i3 = this.height;
        Map map = chC.A00;
        if (map.containsKey("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n")) {
            cOo = (C24895COo) map.get("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n");
        } else {
            cOo = new C24895COo();
            map.put("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n", cOo);
            CY8 cy8 = cOo.A01;
            int i4 = cy8.A00;
            if (i4 != -1) {
                GLES20.glUseProgram(i4);
                C24648CDn.A00("glUseProgram");
                GLES20.glUniform1i(cy8.A01("oes_tex"), 0);
                C24648CDn.A00("Initialize fragment shader uniform values.");
                cy8.A02("in_pos", C25514ChC.A01);
                cy8.A02("in_tc", C25514ChC.A02);
            } else {
                runtimeException = AnonymousClass8BR.A0w("The program has been released");
                throw runtimeException;
            }
        }
        int i5 = cOo.A01.A00;
        if (i5 != -1) {
            GLES20.glUseProgram(i5);
            C24648CDn.A00("glUseProgram");
            GLES20.glUniformMatrix4fv(cOo.A00, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glViewport(0, 0, i2, i3);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(36197, 0);
            E04 e04 = this.eglBase;
            long nanos = TimeUnit.MICROSECONDS.toNanos(j);
            E04.A02(e04);
            EGLSurface eGLSurface = e04.A03;
            if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                EGLExt.eglPresentationTimeANDROID(e04.A02, eGLSurface, nanos);
                EGL14.eglSwapBuffers(e04.A02, e04.A03);
                return true;
            }
            runtimeException = AnonymousClass8BR.A0w("No EGLSurface - can't swap buffers");
        } else {
            runtimeException = AnonymousClass8BR.A0w("The program has been released");
        }
        throw runtimeException;
    }

    public boolean initH264Encoder(int i, int i2, int i3, int i4, int i5) {
        return initEncode(C24282Byf.VIDEO_CODEC_H264, i, i2, i3, i4, i5, (C24445C4k) null);
    }

    public boolean initH265Encoder(int i, int i2, int i3, int i4, int i5) {
        return initEncode(C24282Byf.VIDEO_CODEC_H265, i, i2, i3, i4, i5, (C24445C4k) null);
    }

    /* renamed from: lambda$release$0$org-wawebrtc-MediaCodecVideoEncoder  reason: not valid java name */
    public /* synthetic */ void m85lambda$release$0$orgwawebrtcMediaCodecVideoEncoder(CountDownLatch countDownLatch) {
        try {
            Log.i("MediaCodecVideoEncoder Java releaseEncoder on release thread");
            this.mediaCodec.stop();
            this.mediaCodec.release();
            Log.i("MediaCodecVideoEncoder Java releaseEncoder on release thread done");
        } catch (Exception e) {
            Log.e("MediaCodecVideoEncoder Media encoder release failed", e);
        }
        countDownLatch.countDown();
    }

    public boolean resetEncoderOnFPSChanges() {
        return "OMX.Exynos.AVC.Encoder".equalsIgnoreCase(this.codecName);
    }

    public boolean supportForceKeyFrame() {
        return AnonymousClass000.A1P("OMX.google.h264.encoder".equalsIgnoreCase(this.codecName) ? 1 : 0);
    }

    public boolean supportUpdateBitrate() {
        return !"OMX.google.h264.encoder".equalsIgnoreCase(this.codecName);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [org.wawebrtc.MediaCodecVideoEncoder$BufferInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [org.wawebrtc.MediaCodecVideoEncoder$BufferInfo, java.lang.Object] */
    public MediaCodecVideoEncoder(AnonymousClass1VE r5, AnonymousClass1DC r6) {
        this.voipSharedPreferences = r5;
        this.systemFeatures = r6;
        int i = 0;
        do {
            this.freeInfos.add(new Object());
            i++;
        } while (i < 10);
        this.keyFrameRequestBundle.putInt("request-sync", 0);
    }

    public static MediaCodec createByCodecName(String str) {
        try {
            return MediaCodec.createByCodecName(str);
        } catch (Exception e) {
            Log.e((Throwable) e);
            return null;
        }
    }

    private boolean setRates(int i, int i2) {
        if (!supportUpdateBitrate()) {
            return false;
        }
        try {
            Bundle A0D = C17880vN.A0D();
            A0D.putInt("video-bitrate", i * 1000);
            this.mediaCodec.setParameters(A0D);
            return true;
        } catch (IllegalStateException e) {
            Log.e("MediaCodecVideoEncoder setRates failed", e);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        X.AnonymousClass8BS.A0x();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r11 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaCodecVideoEncoder Java releaseEncoder "
            r1.append(r0)
            java.lang.String r0 = r11.codecName
            X.C17890vO.A1A(r1, r0)
            java.util.concurrent.CountDownLatch r10 = X.BE7.A0u()
            r0 = 14
            X.Aim r2 = new X.Aim
            r2.<init>(r10, r11, r0)
            java.lang.String r1 = "MediaCodecVideoEncoder"
            X.10v r0 = new X.10v
            r0.<init>(r2, r1)
            r0.start()
            r8 = 5000(0x1388, double:2.4703E-320)
            long r6 = android.os.SystemClock.elapsedRealtime()
            r5 = 0
            r3 = 5000(0x1388, double:2.4703E-320)
            r1 = 0
        L_0x002d:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0036 }
            boolean r5 = r10.await(r3, r0)     // Catch:{ InterruptedException -> 0x0036 }
            if (r1 == 0) goto L_0x0047
            goto L_0x0044
        L_0x0036:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r6
            long r3 = r8 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 > 0) goto L_0x002d
        L_0x0044:
            X.AnonymousClass8BS.A0x()
        L_0x0047:
            if (r5 != 0) goto L_0x0054
            java.lang.String r0 = "MediaCodecVideoEncoder Media encoder release timeout"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            int r0 = codecErrors
            int r0 = r0 + 1
            codecErrors = r0
        L_0x0054:
            r5 = 0
            r11.codecName = r5
            r11.mediaCodec = r5
            r11.mediaCodecThread = r5
            X.ChC r0 = r11.drawer
            if (r0 == 0) goto L_0x0088
            java.util.Map r4 = r0.A00
            java.util.Iterator r3 = X.C17890vO.A0l(r4)
        L_0x0065:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r3.next()
            X.COo r0 = (X.C24895COo) r0
            X.CY8 r2 = r0.A01
            java.lang.String r0 = "GlShader Deleting shader."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = r2.A00
            r0 = -1
            if (r1 == r0) goto L_0x0065
            android.opengl.GLES20.glDeleteProgram(r1)
            r2.A00 = r0
            goto L_0x0065
        L_0x0083:
            r4.clear()
            r11.drawer = r5
        L_0x0088:
            X.E04 r0 = r11.eglBase
            if (r0 == 0) goto L_0x0091
            r0.A05()
            r11.eglBase = r5
        L_0x0091:
            android.view.Surface r0 = r11.inputSurface
            if (r0 == 0) goto L_0x009a
            r0.release()
            r11.inputSurface = r5
        L_0x009a:
            runningInstance = r5
            long r0 = android.os.SystemClock.uptimeMillis()
            lastReleaseTimestamp = r0
            java.lang.String r0 = "MediaCodecVideoEncoder Java releaseEncoder done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.release():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f0 A[Catch:{ all -> 0x03de }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean initEncode(X.C24282Byf r34, int r35, int r36, int r37, int r38, int r39, X.C24445C4k r40) {
        /*
            r33 = this;
            java.lang.String r8 = "video/hevc"
            java.lang.String r9 = "video/avc"
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            java.lang.String r10 = "video/x-vnd.on2.vp8"
            r30 = r40
            boolean r2 = X.AnonymousClass000.A1W(r30)
            r1 = r33
            r0 = r35
            r1.width = r0
            r0 = r36
            r1.height = r0
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaCodecVideoEncoder Java initEncode: "
            r5.append(r0)
            r4 = r34
            r5.append(r4)
            java.lang.String r0 = " : "
            r5.append(r0)
            int r0 = r1.width
            r5.append(r0)
            java.lang.String r0 = " x "
            r5.append(r0)
            int r0 = r1.height
            r5.append(r0)
            java.lang.String r0 = ". @ "
            r5.append(r0)
            r32 = r37
            r0 = r32
            r5.append(r0)
            java.lang.String r0 = " kbps. Fps: "
            r5.append(r0)
            r31 = r38
            r0 = r31
            r5.append(r0)
            java.lang.String r0 = ". Key frame interval: "
            r5.append(r0)
            r7 = r39
            r5.append(r7)
            java.lang.String r0 = " seconds. Encode from texture : "
            X.C17900vP.A0n(r0, r5, r2)
            java.lang.Thread r0 = r1.mediaCodecThread
            if (r0 != 0) goto L_0x03e6
            java.lang.String r25 = "vid_driver.encoder_name"
            java.lang.String r13 = com.whatsapp.voipcalling.Voip.A07(r25)
            long r11 = android.os.SystemClock.uptimeMillis()
            long r5 = lastReleaseTimestamp
            long r11 = r11 - r5
            r5 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            boolean r6 = X.AnonymousClass000.A1R(r0)
            X.Byf r0 = X.C24282Byf.VIDEO_CODEC_VP8     // Catch:{ all -> 0x03de }
            if (r4 != r0) goto L_0x0095
            if (r13 == 0) goto L_0x0085
            java.lang.String[] r5 = X.C108975cc.A1b(r13)     // Catch:{ all -> 0x03de }
            goto L_0x0087
        L_0x0085:
            java.lang.String[] r5 = supportedVp8HwCodecPrefixes     // Catch:{ all -> 0x03de }
        L_0x0087:
            if (r2 == 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r3 = 0
            goto L_0x008e
        L_0x008c:
            int[] r3 = supportedSurfaceColorList     // Catch:{ all -> 0x03de }
        L_0x008e:
            r0 = -1
            java.util.List r6 = findHwEncoder(r10, r5, r3, r0, r6)     // Catch:{ all -> 0x03de }
            r3 = r10
            goto L_0x00ec
        L_0x0095:
            X.Byf r0 = X.C24282Byf.VIDEO_CODEC_VP9     // Catch:{ all -> 0x03de }
            if (r4 != r0) goto L_0x00af
            if (r13 == 0) goto L_0x00a0
            java.lang.String[] r8 = X.C108975cc.A1b(r13)     // Catch:{ all -> 0x03de }
            goto L_0x00a2
        L_0x00a0:
            java.lang.String[] r8 = supportedVp9HwCodecPrefixes     // Catch:{ all -> 0x03de }
        L_0x00a2:
            if (r2 == 0) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            r5 = 0
            goto L_0x00a9
        L_0x00a7:
            int[] r5 = supportedSurfaceColorList     // Catch:{ all -> 0x03de }
        L_0x00a9:
            r0 = -1
            java.util.List r6 = findHwEncoder(r3, r8, r5, r0, r6)     // Catch:{ all -> 0x03de }
            goto L_0x00ec
        L_0x00af:
            X.Byf r0 = X.C24282Byf.VIDEO_CODEC_H264     // Catch:{ all -> 0x03de }
            r24 = 20
            if (r4 != r0) goto L_0x00cc
            if (r13 == 0) goto L_0x00bc
            java.lang.String[] r5 = X.C108975cc.A1b(r13)     // Catch:{ all -> 0x03de }
            goto L_0x00be
        L_0x00bc:
            java.lang.String[] r5 = supportedH264HwCodecPrefixes     // Catch:{ all -> 0x03de }
        L_0x00be:
            if (r2 == 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r3 = 0
            goto L_0x00c5
        L_0x00c3:
            int[] r3 = supportedSurfaceColorList     // Catch:{ all -> 0x03de }
        L_0x00c5:
            r0 = -1
            java.util.List r6 = findHwEncoder(r9, r5, r3, r0, r6)     // Catch:{ all -> 0x03de }
            r3 = r9
            goto L_0x00ee
        L_0x00cc:
            X.Byf r0 = X.C24282Byf.VIDEO_CODEC_H265     // Catch:{ all -> 0x03de }
            if (r4 != r0) goto L_0x00e7
            if (r13 == 0) goto L_0x00d7
            java.lang.String[] r5 = X.C108975cc.A1b(r13)     // Catch:{ all -> 0x03de }
            goto L_0x00d9
        L_0x00d7:
            java.lang.String[] r5 = supportedH265HwCodecPrefixes     // Catch:{ all -> 0x03de }
        L_0x00d9:
            if (r2 == 0) goto L_0x00dc
            goto L_0x00de
        L_0x00dc:
            r3 = 0
            goto L_0x00e0
        L_0x00de:
            int[] r3 = supportedSurfaceColorList     // Catch:{ all -> 0x03de }
        L_0x00e0:
            r0 = -1
            java.util.List r6 = findHwEncoder(r8, r5, r3, r0, r6)     // Catch:{ all -> 0x03de }
            r3 = r8
            goto L_0x00ee
        L_0x00e7:
            r6 = 0
            r3 = 0
            r24 = 0
            goto L_0x00ee
        L_0x00ec:
            r24 = 100
        L_0x00ee:
            if (r39 < 0) goto L_0x00f2
            r24 = r7
        L_0x00f2:
            if (r6 == 0) goto L_0x03d3
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x03d3
            runningInstance = r33
            java.util.List r5 = r1.freeInfos
            java.util.Queue r0 = r1.carryAlongInfos
            r5.addAll(r0)
            java.util.Queue r0 = r1.carryAlongInfos
            r0.clear()
            java.util.Iterator r23 = r6.iterator()
        L_0x010c:
            boolean r0 = r23.hasNext()
            if (r0 == 0) goto L_0x03d1
            java.lang.Object r6 = r23.next()
            X.CRz r6 = (X.C24974CRz) r6
            java.lang.String r0 = r6.A02
            r29 = r0
            r1.codecName = r0
            int r0 = r6.A00
            r28 = r0
            r1.colorFormat = r0
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r5 = "MediaCodecVideoEncoder Java initEncode: format: 0x"
            X.BE9.A1J(r5, r7, r0)
            java.lang.String r5 = " for Encoder: "
            r0 = r29
            X.C17900vP.A0f(r5, r0, r7)
            java.lang.String r5 = "OMX.google.h264.encoder"
            java.lang.String r0 = r1.codecName
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0146
            r0 = 320(0x140, float:4.48E-43)
            r1.width = r0
            r0 = 192(0xc0, float:2.69E-43)
            r1.height = r0
        L_0x0146:
            android.media.MediaCodecInfo$VideoCapabilities r5 = r6.A01
            java.lang.String r7 = "samsung"
            if (r5 == 0) goto L_0x03bb
            android.util.Range r0 = r5.getSupportedWidths()
            java.lang.Comparable r0 = r0.getLower()
            int r16 = X.AnonymousClass000.A0M(r0)
            android.util.Range r0 = r5.getSupportedHeights()
            java.lang.Comparable r0 = r0.getLower()
            int r15 = X.AnonymousClass000.A0M(r0)
        L_0x0164:
            java.lang.String r5 = r1.codecName
            java.lang.String r0 = "OMX.qcom.video.encoder.avc"
            boolean r5 = r5.equals(r0)
            int r22 = X.AnonymousClass000.A0A(r5)
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x017c
            if (r5 == 0) goto L_0x017c
            r22 = 16
        L_0x017c:
            java.lang.String r0 = "vid_driver.encoder_min_width"
            java.lang.Integer r10 = com.whatsapp.voipcalling.Voip.A05(r0)
            java.lang.String r0 = "vid_driver.encoder_min_height"
            java.lang.Integer r9 = com.whatsapp.voipcalling.Voip.A05(r0)
            java.lang.String r0 = "vid_driver.encoder_alignment"
            java.lang.Integer r8 = com.whatsapp.voipcalling.Voip.A05(r0)
            java.lang.String r0 = "vid_driver.encoder_h264_profile"
            java.lang.Integer r7 = com.whatsapp.voipcalling.Voip.A05(r0)
            java.lang.String r0 = "vid_driver.encoder_h264_level"
            java.lang.Integer r5 = com.whatsapp.voipcalling.Voip.A05(r0)
            java.lang.String r0 = "vid_driver.encoder_hw_h264_maxqp"
            java.lang.Integer r0 = com.whatsapp.voipcalling.Voip.A05(r0)
            if (r10 == 0) goto L_0x01a6
            int r16 = r10.intValue()
        L_0x01a6:
            if (r9 == 0) goto L_0x01ac
            int r15 = r9.intValue()
        L_0x01ac:
            if (r8 == 0) goto L_0x01b2
            int r22 = r8.intValue()
        L_0x01b2:
            int r21 = X.BE9.A0C(r7)
            int r5 = X.BE9.A0C(r5)
            int r20 = X.BE9.A0C(r0)
            java.lang.String r0 = r1.codecName
            r27 = r0
            int r0 = r1.colorFormat
            r26 = r0
            int r14 = r1.width
            int r13 = r1.height
            r19 = 0
            r12 = r14
            r11 = r13
            int r15 = r15 + r22
            int r10 = r15 + -1
            int r0 = r22 + -1
            r18 = r0 ^ -1
            r10 = r10 & r18
            int r16 = r16 + r22
            int r9 = r16 + -1
            r9 = r9 & r18
            float r8 = (float) r14
            float r7 = (float) r13
            r17 = 0
            float r0 = r7 + r17
            float r16 = r8 / r0
            if (r14 < r9) goto L_0x03a1
            if (r13 < r10) goto L_0x03a1
            java.lang.Integer r15 = X.AnonymousClass00R.A00
        L_0x01ec:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r15 == r0) goto L_0x0237
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r15 != r0) goto L_0x038c
            int r0 = r10 - r13
            r11 = r10
            float r0 = (float) r0
            float r0 = r0 * r16
            float r8 = r8 + r0
            int r7 = (int) r8
            int r0 = r22 / 2
            int r7 = r7 + r0
            int r0 = r7 + -1
            r0 = r0 & r18
            int r12 = java.lang.Math.max(r0, r9)
        L_0x0207:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r0 = "videotranscoder/transcode/encoder parseEncoderFormat expand direction is "
            r8.append(r0)
            int r0 = r15.intValue()
            switch(r0) {
                case 0: goto L_0x0388;
                case 1: goto L_0x0384;
                default: goto L_0x0217;
            }
        L_0x0217:
            java.lang.String r0 = "Vertical"
        L_0x0219:
            r8.append(r0)
            java.lang.String r0 = ", input size: "
            r8.append(r0)
            r8.append(r14)
            java.lang.String r7 = "x"
            r8.append(r7)
            r8.append(r13)
            java.lang.String r0 = ", after expansion: "
            r8.append(r0)
            r8.append(r12)
            X.C17900vP.A0j(r7, r8, r11)
        L_0x0237:
            int r0 = r22 / 2
            int r11 = r11 + r0
            int r11 = r11 + -1
            r11 = r11 & r18
            int r12 = r12 + r0
            int r12 = r12 + -1
            r12 = r12 & r18
            r9 = r12
            r8 = r11
            java.lang.String r7 = "OMX.Nvidia."
            r0 = r27
            boolean r0 = r0.startsWith(r7)
            if (r0 == 0) goto L_0x025b
            int r0 = r12 + 15
            int r0 = r0 / 16
            int r9 = r0 * 16
            int r0 = r11 + 15
            int r0 = r0 / 16
            int r8 = r0 * 16
        L_0x025b:
            X.C63912tt.A03(r27)
            int r10 = X.C63912tt.A00(r26)
            java.lang.String r0 = X.C63912tt.A01()
            if (r0 == 0) goto L_0x027e
            java.lang.String r0 = X.C63912tt.A01()
            java.lang.String r7 = X.AnonymousClass8BS.A0n(r0)
            java.lang.String r0 = "mt6572"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x027e
            r10 = 2
            java.lang.String r0 = "workaround wrong color format for mt6572 to FRAMECONV_COLOR_FORMAT_YV12"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x027e:
            r1.width = r12
            r1.height = r11
            r0 = r26
            r1.colorFormat = r0
            r1.colorId = r10
            java.lang.String r0 = "vid_driver.encoder_frame_converter_color_format"
            java.lang.Integer r11 = com.whatsapp.voipcalling.Voip.A05(r0)
            java.lang.String r7 = com.whatsapp.voipcalling.Voip.A07(r25)
            java.lang.String r0 = "vid_driver.encoder_color_format"
            java.lang.Integer r10 = com.whatsapp.voipcalling.Voip.A05(r0)
            if (r11 == 0) goto L_0x02b2
            if (r10 == 0) goto L_0x02b2
            java.lang.String r0 = r1.codecName
            boolean r0 = r0.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x02b2
            int r7 = r1.colorFormat
            int r0 = r10.intValue()
            if (r7 != r0) goto L_0x02b2
            int r0 = r11.intValue()
            r1.colorId = r0
        L_0x02b2:
            X.1VE r0 = r1.voipSharedPreferences
            int r10 = r1.colorId
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r0)
            android.content.SharedPreferences$Editor r7 = r0.edit()
            java.lang.String r0 = "video_encoder_frame_convertor_color_id"
            X.C17880vN.A1C(r7, r0, r10)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1.mediaCodecThread = r0
            int r7 = r1.width     // Catch:{ all -> 0x037c }
            int r0 = r1.height     // Catch:{ all -> 0x037c }
            android.media.MediaFormat r7 = android.media.MediaFormat.createVideoFormat(r3, r7, r0)     // Catch:{ all -> 0x037c }
            java.lang.String r10 = "bitrate"
            r0 = r32
            int r0 = r0 * 1000
            r7.setInteger(r10, r0)     // Catch:{ all -> 0x037c }
            java.lang.String r10 = "color-format"
            r0 = r28
            r7.setInteger(r10, r0)     // Catch:{ all -> 0x037c }
            java.lang.String r10 = "frame-rate"
            r0 = r31
            r7.setInteger(r10, r0)     // Catch:{ all -> 0x037c }
            java.lang.String r10 = "i-frame-interval"
            r0 = r24
            r7.setInteger(r10, r0)     // Catch:{ all -> 0x037c }
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x037c }
            r0 = 31
            if (r10 < r0) goto L_0x02fe
            if (r20 <= 0) goto L_0x02fe
            java.lang.String r10 = "video-qp-max"
            r0 = r20
            r7.setInteger(r10, r0)     // Catch:{ all -> 0x037c }
        L_0x02fe:
            java.lang.String r0 = "stride"
            r7.setInteger(r0, r9)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = "slice-height"
            r7.setInteger(r0, r8)     // Catch:{ all -> 0x037c }
            if (r21 < 0) goto L_0x0336
            android.media.MediaCodecInfo$CodecProfileLevel[] r11 = r6.A03     // Catch:{ all -> 0x037c }
            if (r11 == 0) goto L_0x0336
            int r10 = r11.length     // Catch:{ all -> 0x037c }
            r9 = 0
        L_0x0310:
            if (r9 >= r10) goto L_0x0336
            r8 = r11[r9]     // Catch:{ all -> 0x037c }
            int r6 = r8.profile     // Catch:{ all -> 0x037c }
            r0 = r21
            if (r6 != r0) goto L_0x032c
            int r0 = r8.level     // Catch:{ all -> 0x037c }
            if (r0 == r5) goto L_0x0324
            int r6 = r8.level     // Catch:{ all -> 0x037c }
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r6 != r0) goto L_0x032c
        L_0x0324:
            java.lang.String r6 = "profile"
            r0 = r21
            r7.setInteger(r6, r0)     // Catch:{ all -> 0x037c }
            goto L_0x032f
        L_0x032c:
            int r9 = r9 + 1
            goto L_0x0310
        L_0x032f:
            if (r5 < 0) goto L_0x0336
            java.lang.String r0 = "level"
            r7.setInteger(r0, r5)     // Catch:{ all -> 0x037c }
        L_0x0336:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x037c }
            java.lang.String r0 = "MediaCodecVideoEncoder   Format: "
            X.C17900vP.A0Y(r7, r0, r5)     // Catch:{ all -> 0x037c }
            android.media.MediaCodec r8 = createByCodecName(r29)     // Catch:{ all -> 0x037c }
            r1.mediaCodec = r8     // Catch:{ all -> 0x037c }
            r1.type = r4     // Catch:{ all -> 0x037c }
            if (r8 != 0) goto L_0x034f
            java.lang.String r0 = "MediaCodecVideoEncoder Can not create media encoder"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x037c }
            goto L_0x03cd
        L_0x034f:
            r6 = 1
            r5 = r19
            r8.configure(r7, r5, r5, r6)     // Catch:{ all -> 0x037c }
            if (r2 == 0) goto L_0x0376
            int[] r6 = X.C25244Cbg.A01     // Catch:{ all -> 0x037c }
            X.E04 r5 = new X.E04     // Catch:{ all -> 0x037c }
            r0 = r30
            r5.<init>(r0, r6)     // Catch:{ all -> 0x037c }
            r1.eglBase = r5     // Catch:{ all -> 0x037c }
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ all -> 0x037c }
            android.view.Surface r5 = r0.createInputSurface()     // Catch:{ all -> 0x037c }
            r1.inputSurface = r5     // Catch:{ all -> 0x037c }
            X.E04 r0 = r1.eglBase     // Catch:{ all -> 0x037c }
            X.E04.A00(r5, r0)     // Catch:{ all -> 0x037c }
            X.ChC r0 = new X.ChC     // Catch:{ all -> 0x037c }
            r0.<init>()     // Catch:{ all -> 0x037c }
            r1.drawer = r0     // Catch:{ all -> 0x037c }
        L_0x0376:
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ all -> 0x037c }
            r0.start()     // Catch:{ all -> 0x037c }
            goto L_0x03cf
        L_0x037c:
            r5 = move-exception
            java.lang.String r0 = "MediaCodecVideoEncoder initEncode failed"
            com.whatsapp.util.Log.e(r0, r5)
            goto L_0x010c
        L_0x0384:
            java.lang.String r0 = "Horizontal"
            goto L_0x0219
        L_0x0388:
            java.lang.String r0 = "None"
            goto L_0x0219
        L_0x038c:
            int r0 = r9 - r14
            r12 = r9
            float r0 = (float) r0
            float r0 = r0 / r16
            float r7 = r7 + r0
            int r7 = (int) r7
            int r0 = r22 / 2
            int r7 = r7 + r0
            int r0 = r7 + -1
            r0 = r0 & r18
            int r11 = java.lang.Math.max(r0, r10)
            goto L_0x0207
        L_0x03a1:
            if (r14 >= r9) goto L_0x03a9
            if (r13 < r10) goto L_0x03a9
        L_0x03a5:
            java.lang.Integer r15 = X.AnonymousClass00R.A01
            goto L_0x01ec
        L_0x03a9:
            if (r14 < r9) goto L_0x03b1
            if (r13 >= r10) goto L_0x03b1
        L_0x03ad:
            java.lang.Integer r15 = X.AnonymousClass00R.A0C
            goto L_0x01ec
        L_0x03b1:
            float r15 = (float) r9
            float r0 = (float) r10
            float r0 = r0 + r17
            float r15 = r15 / r0
            int r0 = (r16 > r15 ? 1 : (r16 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x03a5
            goto L_0x03ad
        L_0x03bb:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r7)
            r16 = 176(0xb0, float:2.47E-43)
            r15 = 144(0x90, float:2.02E-43)
            if (r0 == 0) goto L_0x0164
            r16 = 160(0xa0, float:2.24E-43)
            r15 = 128(0x80, float:1.794E-43)
            goto L_0x0164
        L_0x03cd:
            r0 = 0
            return r0
        L_0x03cf:
            r0 = 1
            return r0
        L_0x03d1:
            r2 = 0
            return r2
        L_0x03d3:
            r2 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaCodecVideoEncoder Can not find HW encoder for "
            X.C17900vP.A0e(r0, r3, r1)
            return r2
        L_0x03de:
            r2 = move-exception
            r1 = 0
            java.lang.String r0 = "MediaCodecVideoEncoder Exception in findHwEncoder"
            com.whatsapp.util.Log.e(r0, r2)
            return r1
        L_0x03e6:
            java.lang.String r0 = "Forgot to release()?"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.initEncode(X.Byf, int, int, int, int, int, X.C4k):boolean");
    }
}
