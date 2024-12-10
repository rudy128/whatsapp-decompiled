package org.wawebrtc;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.BE7;
import X.BE9;
import X.C108955ca;
import X.C108975cc;
import X.C108985cd;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C201010v;
import X.C21357Aim;
import X.C24281Bye;
import X.C24446C4l;
import X.C24447C4m;
import X.C63912tt;
import X.CRy;
import X.E3T;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MediaCodecVideoDecoder {
    public static final String DECODER_IMPL_HW_STRING = "HW";
    public static final String DECODER_IMPL_SW_STRING = "SW";
    public static final int DEQUEUE_INPUT_TIMEOUT = 500000;
    public static final String H264_MIME_TYPE = "video/avc";
    public static final String H265_MIME_TYPE = "video/hevc";
    public static final long MAX_DECODE_TIME_MS = 500;
    public static final int MAX_QUEUED_OUTPUTBUFFERS = 3;
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final String TAG = "MediaCodecVideoDecoder";
    public static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    public static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    public static final String[] blacklistedDeviceBoard = new String[0];
    public static final String[] blacklistedHwCodecPrefixes = {"OMX.TI.DUCATI1.VIDEO.DECODER"};
    public static final Map cachedCodecCapabilites = C17880vN.A11();
    public static int codecErrors;
    public static E3T errorCallback;
    public static final Set hwDecoderDisabledTypes = C17880vN.A12();
    public static long lastReleaseTimestamp;
    public static final String[] restartDecoderOnNewSpsPpsPrefixes = {"omx.mtk.", "OMX.SEC.avc.dec"};
    public static MediaCodecVideoDecoder runningInstance;
    public static final String[] spsBaselineProfileHackPrefixes = new String[0];
    public static final String[] spsBitstreamRestrictionsPrefixes = {"omx.qcom.", "omx.nvidia.", "omx.brcm.", "OMX.Exynos."};
    public static final String[] spsConstrainedHighProfilePrefixes = new String[0];
    public static final String[] supportedH264HwCodecPrefixes = null;
    public static final String[] supportedH265HwCodecPrefixes = null;
    public static final String[] supportedVp8HwCodecPrefixes = {"OMX.qcom.", "OMX.Nvidia.", "OMX.Exynos.", "OMX.Intel."};
    public static final String[] supportedVp9HwCodecPrefixes = C17880vN.A1b("OMX.qcom.", "OMX.Exynos.", 2, 1);
    public final MediaCodec.BufferInfo cachedBufferInfo = new MediaCodec.BufferInfo();
    public final BufferInfo cachedInputBuffer = new Object();
    public final BufferInfo cachedOutputBuffer = new Object();
    public final Queue carryAlongInfos = AnonymousClass8BR.A14();
    public String codecName;
    public int colorFormat;
    public int colorId;
    public int cropBottom;
    public int cropLeft;
    public int cropRight;
    public int cropTop;
    public final Queue dequeuedSurfaceOutputBuffers = AnonymousClass8BR.A14();
    public int droppedFrames;
    public final List freeInfos = AnonymousClass8BR.A14();
    public boolean hasDecodedFirstFrame;
    public int height;
    public ByteBuffer[] inputBuffers;
    public MediaCodec mediaCodec;
    public Thread mediaCodecThread;
    public boolean needsRestartDecoderOnNewSpsPps;
    public boolean needsSpsBaselineProfileHack;
    public boolean needsSpsBitstreamRestrictions;
    public boolean needsSpsConstrainedHighProfile;
    public boolean needsSpsPpsInCsd;
    public ByteBuffer[] outputBuffers;
    public int sliceHeight;
    public int stride;
    public Surface surface = null;
    public C24446C4l textureListener;
    public boolean useSurface;
    public int width;

    public class BufferInfo {
        public int bitInfo;
        public ByteBuffer buffer;
        public long decodeTimeMs;
        public long endDecodeTimeMs;
        public int index;
        public long ntpTimeStampMs;
        public long presentationTimeStampMs;
        public long timeStampMs;

        public void set(int i, ByteBuffer byteBuffer, long j, long j2, long j3, int i2, long j4, long j5) {
            this.index = i;
            this.buffer = byteBuffer;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.bitInfo = i2;
            this.decodeTimeMs = j4;
            this.endDecodeTimeMs = j5;
        }
    }

    private void checkOnMediaCodecThread() {
    }

    private int getDequeueOutputTimeout() {
        return 20;
    }

    private boolean initH264Decoder(int i, int i2, byte[] bArr, byte[] bArr2) {
        return initH264Decoder(i, i2, bArr, bArr2, false);
    }

    private boolean initH265Decoder(int i, int i2, byte[] bArr, byte[] bArr2) {
        return initH265Decoder(i, i2, bArr, bArr2, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.CRx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.CRx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.CRx} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean queueInputBuffer(int r11, int r12, long r13, long r15, int r17) {
        /*
            r10 = this;
            r5 = 0
            android.media.MediaCodec r0 = r10.mediaCodec     // Catch:{ IllegalStateException -> 0x0044 }
            r4 = r11
            java.nio.ByteBuffer r0 = r0.getInputBuffer(r11)     // Catch:{ IllegalStateException -> 0x0044 }
            r0.position(r5)     // Catch:{ IllegalStateException -> 0x0044 }
            r6 = r12
            r0.limit(r12)     // Catch:{ IllegalStateException -> 0x0044 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0044 }
            java.util.List r2 = r10.freeInfos     // Catch:{ IllegalStateException -> 0x0044 }
            boolean r2 = r2.isEmpty()     // Catch:{ IllegalStateException -> 0x0044 }
            if (r2 == 0) goto L_0x0039
            X.CRx r2 = new X.CRx     // Catch:{ IllegalStateException -> 0x0044 }
            r2.<init>()     // Catch:{ IllegalStateException -> 0x0044 }
        L_0x0020:
            r2.A01 = r0     // Catch:{ IllegalStateException -> 0x0044 }
            r2.A03 = r13     // Catch:{ IllegalStateException -> 0x0044 }
            r2.A02 = r15     // Catch:{ IllegalStateException -> 0x0044 }
            r3 = r17
            r2.A00 = r3     // Catch:{ IllegalStateException -> 0x0044 }
            java.util.Queue r3 = r10.carryAlongInfos     // Catch:{ IllegalStateException -> 0x0044 }
            r3.add(r2)     // Catch:{ IllegalStateException -> 0x0044 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r0
            android.media.MediaCodec r3 = r10.mediaCodec     // Catch:{ IllegalStateException -> 0x0044 }
            r9 = r5
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch:{ IllegalStateException -> 0x0044 }
            goto L_0x0042
        L_0x0039:
            java.util.List r2 = r10.freeInfos     // Catch:{ IllegalStateException -> 0x0044 }
            java.lang.Object r2 = r2.remove(r5)     // Catch:{ IllegalStateException -> 0x0044 }
            X.CRx r2 = (X.C24973CRx) r2     // Catch:{ IllegalStateException -> 0x0044 }
            goto L_0x0020
        L_0x0042:
            r0 = 1
            return r0
        L_0x0044:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoDecoder decode failed"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoDecoder.queueInputBuffer(int, int, long, long, int):boolean");
    }

    public class Api29Impl {
        public static boolean mediaCodecInfoIsSoftwareOnly(MediaCodecInfo mediaCodecInfo) {
            return mediaCodecInfo.isSoftwareOnly();
        }
    }

    public class DecodedTextureBuffer {
        public final long decodeTimeMs;
        public final long frameDelayMs;
        public final long ntpTimeStampMs;
        public final long presentationTimeStampMs;
        public final int textureID;
        public final long timeStampMs;
        public final float[] transformMatrix;

        public DecodedTextureBuffer(int i, float[] fArr, long j, long j2, long j3, long j4, long j5) {
            this.textureID = i;
            this.transformMatrix = fArr;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.decodeTimeMs = j4;
            this.frameDelayMs = j5;
        }
    }

    private void MaybeRenderDecodedTextureBuffer() {
        if (!this.dequeuedSurfaceOutputBuffers.isEmpty()) {
            throw AnonymousClass000.A0s("isWaitingForTexture");
        }
    }

    private BufferInfo dequeueInputBuffer() {
        MediaCodec mediaCodec2 = this.mediaCodec;
        if (mediaCodec2 != null) {
            try {
                int dequeueInputBuffer = mediaCodec2.dequeueInputBuffer(500000);
                if (dequeueInputBuffer >= 0) {
                    this.cachedInputBuffer.set(dequeueInputBuffer, this.mediaCodec.getInputBuffer(dequeueInputBuffer), 0, 0, 0, 0, 0, 0);
                    return this.cachedInputBuffer;
                }
            } catch (Throwable th) {
                Log.e(th);
                throw th;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x000d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.wawebrtc.MediaCodecVideoDecoder.BufferInfo dequeueOutputBuffer(int r20) {
        /*
            r19 = this;
            r1 = r19
            java.util.Queue r0 = r1.carryAlongInfos
            boolean r0 = r0.isEmpty()
            r15 = 0
            if (r0 != 0) goto L_0x0186
            android.media.MediaCodec$BufferInfo r8 = r1.cachedBufferInfo
        L_0x000d:
            android.media.MediaCodec r4 = r1.mediaCodec
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = r20
            long r2 = (long) r2
            long r2 = r0.toMicros(r2)
            int r6 = r4.dequeueOutputBuffer(r8, r2)
            r0 = -3
            if (r6 == r0) goto L_0x000d
            r0 = -2
            r13 = 1
            if (r6 == r0) goto L_0x0063
            r0 = -1
            if (r6 == r0) goto L_0x0186
            r1.hasDecodedFirstFrame = r13
            java.util.Queue r0 = r1.carryAlongInfos
            java.lang.Object r0 = r0.remove()
            X.CRx r0 = (X.C24973CRx) r0
            long r15 = android.os.SystemClock.elapsedRealtime()
            long r2 = r0.A01
            long r15 = r15 - r2
            android.media.MediaCodec r2 = r1.mediaCodec
            java.nio.ByteBuffer r2 = r2.getOutputBuffer(r6)
            X.BEA.A15(r8, r2)
            org.wawebrtc.MediaCodecVideoDecoder$BufferInfo r5 = r1.cachedOutputBuffer
            java.nio.ByteBuffer r7 = r2.slice()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r2 = r8.presentationTimeUs
            long r8 = r4.toMillis(r2)
            long r10 = r0.A03
            long r12 = r0.A02
            int r14 = r0.A00
            long r17 = android.os.SystemClock.elapsedRealtime()
            r5.set(r6, r7, r8, r10, r12, r14, r15, r17)
            java.util.List r2 = r1.freeInfos
            r2.add(r0)
            org.wawebrtc.MediaCodecVideoDecoder$BufferInfo r0 = r1.cachedOutputBuffer
            return r0
        L_0x0063:
            android.media.MediaCodec r0 = r1.mediaCodec
            android.media.MediaFormat r3 = r0.getOutputFormat()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaCodecVideoDecoder Decoder format changed: "
            X.C17900vP.A0Y(r3, r0, r2)
            java.lang.String r2 = r1.codecName
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r0 = "videotranscoder/transcode/getDecoderFormat output format has changed to "
            X.C17900vP.A0Y(r3, r0, r4)
            r14 = 0
            r12 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r7 = 0
            java.lang.String r0 = "color-format"
            int r6 = r3.getInteger(r0)
            java.lang.String r0 = "width"
            int r5 = r3.getInteger(r0)
            java.lang.String r0 = "height"
            int r4 = r3.getInteger(r0)
            java.lang.String r0 = "crop-left"
            int r12 = r3.getInteger(r0)     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            java.lang.String r0 = "crop-right"
            int r11 = r3.getInteger(r0)     // Catch:{ Exception -> 0x00a1 }
        L_0x00a1:
            java.lang.String r0 = "crop-top"
            int r10 = r3.getInteger(r0)     // Catch:{ Exception -> 0x00a7 }
        L_0x00a7:
            java.lang.String r0 = "crop-bottom"
            int r14 = r3.getInteger(r0)     // Catch:{ Exception -> 0x00ad }
        L_0x00ad:
            java.lang.String r0 = "slice-height"
            int r9 = r3.getInteger(r0)     // Catch:{ Exception -> 0x00b3 }
        L_0x00b3:
            java.lang.String r0 = "OMX.Nvidia."
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x00c2
            int r0 = r4 + 16
            int r0 = r0 + -1
            r9 = r0 & -16
            goto L_0x00cc
        L_0x00c2:
            java.lang.String r0 = "OMX.SEC.avc.dec"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00cc
            r9 = r4
            r7 = r5
        L_0x00cc:
            java.lang.String r0 = "stride"
            int r7 = r3.getInteger(r0)     // Catch:{ Exception -> 0x00d2 }
        L_0x00d2:
            X.C63912tt.A03(r2)
            int r3 = X.C63912tt.A00(r6)
            r0 = 25
            if (r6 != r0) goto L_0x0163
            java.lang.String r0 = "OMX.k3.video.encoder.avc"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00ed
            java.lang.String r0 = "OMX.k3.video.decoder.avc"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f3
        L_0x00ed:
            java.lang.String r0 = "videotranscoder/transcode/decoder color format for Huaiwei is VideoFrameConverter.FRAMECONV_COLOR_FORMAT_NV12"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00f2:
            r3 = 3
        L_0x00f3:
            r1.width = r5
            r1.height = r4
            int r0 = java.lang.Math.max(r5, r7)
            r1.stride = r0
            int r0 = java.lang.Math.max(r4, r9)
            r1.sliceHeight = r0
            r1.colorFormat = r6
            int r0 = r1.getFrameConverterColorId(r6, r3)
            r1.colorId = r0
            r3 = 0
            r1.cropLeft = r3
            int r2 = r1.width
            int r0 = r2 - r13
            r1.cropRight = r0
            r1.cropTop = r3
            int r0 = r1.height
            int r0 = r0 - r13
            r1.cropBottom = r0
            if (r12 < 0) goto L_0x013d
            if (r12 >= r7) goto L_0x013d
            if (r11 < 0) goto L_0x013d
            if (r11 >= r7) goto L_0x013d
            if (r12 >= r11) goto L_0x013d
            r1.cropLeft = r12
            r1.cropRight = r11
            int r11 = r11 - r12
            int r3 = r11 + 1
            if (r3 >= r2) goto L_0x013d
            r1.width = r3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaCodecVideoDecoder Decoder format changed, use cropRight and cropLeft to calculate width "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r2, r3)
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x013d:
            if (r14 < 0) goto L_0x000d
            if (r14 >= r9) goto L_0x000d
            if (r10 < 0) goto L_0x000d
            if (r10 >= r9) goto L_0x000d
            if (r10 >= r14) goto L_0x000d
            r1.cropTop = r10
            r1.cropBottom = r14
            int r14 = r14 - r10
            int r3 = r14 + 1
            int r0 = r1.height
            if (r3 >= r0) goto L_0x000d
            r1.height = r3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaCodecVideoDecoder Decoder format changed, use cropBottom and cropTop to calculate height "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r2, r3)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x000d
        L_0x0163:
            r0 = 2141391876(0x7fa30c04, float:NaN)
            if (r6 == r0) goto L_0x00f2
            r0 = 2130706433(0x7f000001, float:1.701412E38)
            if (r6 != r0) goto L_0x00f3
            java.lang.String r0 = X.C63912tt.A01()
            if (r0 == 0) goto L_0x0183
            java.lang.String r0 = X.C63912tt.A01()
            java.lang.String r2 = X.AnonymousClass8BS.A0n(r0)
            java.lang.String r0 = "mt6589"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L_0x00f3
        L_0x0183:
            r3 = 1
            goto L_0x00f3
        L_0x0186:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoDecoder.dequeueOutputBuffer(int):org.wawebrtc.MediaCodecVideoDecoder$BufferInfo");
    }

    private DecodedTextureBuffer dequeueTextureBuffer(int i) {
        if (this.useSurface) {
            BufferInfo dequeueOutputBuffer = dequeueOutputBuffer(i);
            if (dequeueOutputBuffer != null) {
                this.dequeuedSurfaceOutputBuffers.add(dequeueOutputBuffer);
            }
            MaybeRenderDecodedTextureBuffer();
            throw AnonymousClass000.A0s("dequeueTextureBuffer");
        }
        throw AnonymousClass000.A0n("dequeueTexture() called for byte buffer decoding.");
    }

    public static void disableH264HwCodec() {
        Log.w("MediaCodecVideoDecoder H.264 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/avc");
    }

    public static void disableH265HwCodec() {
        Log.w("MediaCodecVideoDecoder H.265 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/hevc");
    }

    public static void disableVp8HwCodec() {
        Log.w("MediaCodecVideoDecoder VP8 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Log.w("MediaCodecVideoDecoder VP9 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    public static int getDecoderImplFromString(String str) {
        if (DECODER_IMPL_SW_STRING.equalsIgnoreCase(str)) {
            return 1;
        }
        return AnonymousClass8BU.A00(DECODER_IMPL_HW_STRING.equalsIgnoreCase(str) ? 1 : 0);
    }

    private int getFrameConverterColorId(int i, int i2) {
        Integer A05 = Voip.A05("vid_driver.decoder_frame_converter_color_format");
        String A07 = Voip.A07("vid_driver.decoder_name");
        Integer A052 = Voip.A05("vid_driver.decoder_color_format");
        if (A05 == null || A07 == null || A052 == null || !A07.equalsIgnoreCase(this.codecName) || i != A052.intValue()) {
            return i2;
        }
        return A05.intValue();
    }

    private ByteBuffer getInputBuffer(int i) {
        return this.mediaCodec.getInputBuffer(i);
    }

    private ByteBuffer getOutputBuffer(int i) {
        return this.mediaCodec.getOutputBuffer(i);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(21:42|43|(2:44|45)|46|(2:48|49)|50|(2:52|53)|54|56|57|58|(2:60|61)|62|64|65|66|67|(4:69|(1:73)|84|87)(2:74|(4:76|(1:82)|84|87))|83|84|87) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x016c */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0177 A[Catch:{ all -> 0x01c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018d A[Catch:{ all -> 0x01c5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean initDecode(X.C24281Bye r11, int r12, int r13, X.C24447C4m r14, byte[] r15, byte[] r16, boolean r17) {
        /*
            r10 = this;
            java.lang.Thread r0 = r10.mediaCodecThread
            if (r0 != 0) goto L_0x01ee
            r9 = 1
            r2 = 0
            boolean r0 = X.AnonymousClass000.A1W(r14)
            r10.useSurface = r0
            X.Bye r0 = X.C24281Bye.VIDEO_CODEC_VP8
            if (r11 != r0) goto L_0x0025
            java.lang.String[] r6 = supportedVp8HwCodecPrefixes
            java.lang.String r3 = "video/x-vnd.on2.vp8"
        L_0x0014:
            long r7 = android.os.SystemClock.uptimeMillis()
            long r0 = lastReleaseTimestamp
            long r7 = r7 - r0
            r4 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1R(r0)
            r0 = -1
            goto L_0x0040
        L_0x0025:
            X.Bye r0 = X.C24281Bye.VIDEO_CODEC_VP9
            if (r11 != r0) goto L_0x002e
            java.lang.String[] r6 = supportedVp9HwCodecPrefixes
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            goto L_0x0014
        L_0x002e:
            X.Bye r0 = X.C24281Bye.VIDEO_CODEC_H264
            if (r11 != r0) goto L_0x0037
            java.lang.String[] r6 = supportedH264HwCodecPrefixes
            java.lang.String r3 = "video/avc"
            goto L_0x0014
        L_0x0037:
            X.Bye r0 = X.C24281Bye.VIDEO_CODEC_H265
            if (r11 != r0) goto L_0x01df
            java.lang.String[] r6 = supportedH265HwCodecPrefixes
            java.lang.String r3 = "video/hevc"
            goto L_0x0014
        L_0x0040:
            java.util.List r4 = findDecoder(r3, r6, r0, r1)     // Catch:{ all -> 0x01d8 }
            if (r4 == 0) goto L_0x01ce
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x01ce
            runningInstance = r10
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r10.mediaCodecThread = r0
            java.util.List r1 = r10.freeInfos
            java.util.Queue r0 = r10.carryAlongInfos
            r1.addAll(r0)
            java.util.Queue r0 = r10.carryAlongInfos
            r0.clear()
            java.util.Iterator r8 = r4.iterator()
        L_0x0064:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01d7
            java.lang.Object r4 = r8.next()
            X.CRy r4 = (X.CRy) r4
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaCodecVideoDecoder Java initDecode: "
            r5.append(r0)
            r5.append(r11)
            java.lang.String r0 = " : "
            r5.append(r0)
            r5.append(r12)
            java.lang.String r0 = " x "
            r5.append(r0)
            r5.append(r13)
            java.lang.String r0 = ". Color: 0x"
            r5.append(r0)
            int r1 = r4.A00
            X.BE7.A10(r1, r5)
            java.lang.String r0 = ". Use Surface: "
            r5.append(r0)
            boolean r0 = r10.useSurface
            r5.append(r0)
            java.lang.String r0 = ". Decoder: "
            r5.append(r0)
            java.lang.String r6 = r4.A02
            X.C17890vO.A1A(r5, r6)
            r10.codecName = r6     // Catch:{ all -> 0x01c5 }
            r10.width = r12     // Catch:{ all -> 0x01c5 }
            r10.height = r13     // Catch:{ all -> 0x01c5 }
            r10.stride = r12     // Catch:{ all -> 0x01c5 }
            r10.sliceHeight = r13     // Catch:{ all -> 0x01c5 }
            r10.cropLeft = r2     // Catch:{ all -> 0x01c5 }
            int r0 = r12 + -1
            r10.cropRight = r0     // Catch:{ all -> 0x01c5 }
            r10.cropTop = r2     // Catch:{ all -> 0x01c5 }
            int r0 = r13 + -1
            r10.cropBottom = r0     // Catch:{ all -> 0x01c5 }
            boolean r0 = r10.useSurface     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = "startListening"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)     // Catch:{ all -> 0x01c5 }
            throw r0     // Catch:{ all -> 0x01c5 }
        L_0x00cb:
            android.media.MediaFormat r5 = android.media.MediaFormat.createVideoFormat(r3, r12, r13)     // Catch:{ all -> 0x01c5 }
            if (r15 == 0) goto L_0x00ea
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = "MediaCodecVideoDecoder Java initDecode: csd-0 "
            r7.append(r0)     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = java.util.Arrays.toString(r15)     // Catch:{ all -> 0x01c5 }
            X.C17890vO.A1A(r7, r0)     // Catch:{ all -> 0x01c5 }
            java.lang.String r7 = "csd-0"
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r15)     // Catch:{ all -> 0x01c5 }
            r5.setByteBuffer(r7, r0)     // Catch:{ all -> 0x01c5 }
        L_0x00ea:
            if (r16 == 0) goto L_0x0105
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = "MediaCodecVideoDecoder Java initDecode: csd-1 "
            r7.append(r0)     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = java.util.Arrays.toString(r16)     // Catch:{ all -> 0x01c5 }
            X.C17890vO.A1A(r7, r0)     // Catch:{ all -> 0x01c5 }
            java.lang.String r7 = "csd-1"
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r16)     // Catch:{ all -> 0x01c5 }
            r5.setByteBuffer(r7, r0)     // Catch:{ all -> 0x01c5 }
        L_0x0105:
            boolean r0 = r10.useSurface     // Catch:{ all -> 0x01c5 }
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = "color-format"
            r5.setInteger(r0, r1)     // Catch:{ all -> 0x01c5 }
        L_0x010e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = "MediaCodecVideoDecoder   Format: "
            X.C17900vP.A0Y(r5, r0, r1)     // Catch:{ all -> 0x01c5 }
            android.media.MediaCodec r6 = org.wawebrtc.MediaCodecVideoEncoder.createByCodecName(r6)     // Catch:{ all -> 0x01c5 }
            r10.mediaCodec = r6     // Catch:{ all -> 0x01c5 }
            if (r6 != 0) goto L_0x0128
            java.lang.String r0 = "MediaCodecVideoDecoder Can not create media decoder"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01c5 }
            if (r17 == 0) goto L_0x01d7
            goto L_0x0064
        L_0x0128:
            android.view.Surface r1 = r10.surface     // Catch:{ all -> 0x01c5 }
            r0 = 0
            r6.configure(r5, r1, r0, r2)     // Catch:{ all -> 0x01c5 }
            android.media.MediaCodec r0 = r10.mediaCodec     // Catch:{ all -> 0x01c5 }
            r0.start()     // Catch:{ all -> 0x01c5 }
            java.lang.String r1 = r10.codecName     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = "videotranscoder/transcode/getDecoderFormat output format has changed to "
            X.C17900vP.A0Y(r5, r0, r6)     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = "color-format"
            int r6 = r5.getInteger(r0)     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = "width"
            r5.getInteger(r0)     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = "height"
            r5.getInteger(r0)     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = "crop-left"
            r5.getInteger(r0)     // Catch:{ Exception -> 0x0153 }
        L_0x0153:
            java.lang.String r0 = "crop-right"
            r5.getInteger(r0)     // Catch:{ Exception -> 0x0158 }
        L_0x0158:
            java.lang.String r0 = "crop-top"
            r5.getInteger(r0)     // Catch:{ Exception -> 0x015d }
        L_0x015d:
            java.lang.String r0 = "crop-bottom"
            r5.getInteger(r0)     // Catch:{ Exception -> 0x0162 }
        L_0x0162:
            java.lang.String r0 = "slice-height"
            r5.getInteger(r0)     // Catch:{ Exception -> 0x0167 }
        L_0x0167:
            java.lang.String r0 = "stride"
            r5.getInteger(r0)     // Catch:{ Exception -> 0x016c }
        L_0x016c:
            X.C63912tt.A03(r1)     // Catch:{ all -> 0x01c5 }
            int r5 = X.C63912tt.A00(r6)     // Catch:{ all -> 0x01c5 }
            r0 = 25
            if (r6 != r0) goto L_0x018d
            java.lang.String r0 = "OMX.k3.video.encoder.avc"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01c5 }
            if (r0 != 0) goto L_0x0187
            java.lang.String r0 = "OMX.k3.video.decoder.avc"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x01b0
        L_0x0187:
            java.lang.String r0 = "videotranscoder/transcode/decoder color format for Huaiwei is VideoFrameConverter.FRAMECONV_COLOR_FORMAT_NV12"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01c5 }
            goto L_0x01af
        L_0x018d:
            r0 = 2141391876(0x7fa30c04, float:NaN)
            if (r6 == r0) goto L_0x01af
            r0 = 2130706433(0x7f000001, float:1.701412E38)
            if (r6 != r0) goto L_0x01b0
            java.lang.String r0 = X.C63912tt.A01()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = X.C63912tt.A01()     // Catch:{ all -> 0x01c5 }
            java.lang.String r1 = X.AnonymousClass8BS.A0n(r0)     // Catch:{ all -> 0x01c5 }
            java.lang.String r0 = "mt6589"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x01c5 }
            if (r0 != 0) goto L_0x01b0
        L_0x01ad:
            r5 = 1
            goto L_0x01b0
        L_0x01af:
            r5 = 3
        L_0x01b0:
            r10.colorFormat = r6     // Catch:{ all -> 0x01c5 }
            int r0 = r10.getFrameConverterColorId(r6, r5)     // Catch:{ all -> 0x01c5 }
            r10.colorId = r0     // Catch:{ all -> 0x01c5 }
            r10.hasDecodedFirstFrame = r2     // Catch:{ all -> 0x01c5 }
            java.util.Queue r0 = r10.dequeuedSurfaceOutputBuffers     // Catch:{ all -> 0x01c5 }
            r0.clear()     // Catch:{ all -> 0x01c5 }
            r10.droppedFrames = r2     // Catch:{ all -> 0x01c5 }
            r10.setDecoderFlags(r4)     // Catch:{ all -> 0x01c5 }
            goto L_0x01cd
        L_0x01c5:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoDecoder initDecode failed with Exception"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0064
        L_0x01cd:
            return r9
        L_0x01ce:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaCodecVideoDecoder Can not find HW decoder for "
            X.C17900vP.A0e(r0, r3, r1)
        L_0x01d7:
            return r2
        L_0x01d8:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoDecoder Exception in findDecoder"
            com.whatsapp.util.Log.e(r0, r1)
            return r2
        L_0x01df:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "initDecode: Non-supported codec "
            java.lang.String r0 = X.AnonymousClass001.A1E(r11, r0, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x01ee:
            java.lang.String r0 = "initDecode: Forgot to release()?"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoDecoder.initDecode(X.Bye, int, int, X.C4m, byte[], byte[], boolean):boolean");
    }

    public static boolean isH264HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/avc") || findDecoder("video/avc", supportedH264HwCodecPrefixes, -1, false) == null) {
            return false;
        }
        return true;
    }

    public static boolean isH265HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/hevc") || findDecoder("video/hevc", supportedH265HwCodecPrefixes, -1, true) == null) {
            return false;
        }
        return true;
    }

    public static boolean isSoftwareCodec(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.mediaCodecInfoIsSoftwareOnly(mediaCodecInfo);
        }
        String name = mediaCodecInfo.getName();
        if (name.equalsIgnoreCase("OMX.google.h264.decoder") || name.equalsIgnoreCase("c2.android.avc.decoder") || AnonymousClass8BS.A0n(name).contains(".sw.")) {
            return true;
        }
        return false;
    }

    public static boolean isVp8HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findDecoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes, -1, false) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp9HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findDecoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes, -1, false) == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r3 = r0.getStackTrace();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void printStackTrace() {
        /*
            org.wawebrtc.MediaCodecVideoDecoder r0 = runningInstance
            if (r0 == 0) goto L_0x0023
            java.lang.Thread r0 = r0.mediaCodecThread
            if (r0 == 0) goto L_0x0023
            java.lang.StackTraceElement[] r3 = r0.getStackTrace()
            int r2 = r3.length
            if (r2 <= 0) goto L_0x0023
            java.lang.String r0 = "MediaCodecVideoDecoder MediaCodecVideoDecoder stacks trace:"
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
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoDecoder.printStackTrace():void");
    }

    private void reset(int i, int i2) {
        if (this.mediaCodecThread == null || this.mediaCodec == null) {
            throw AnonymousClass8BR.A0w("Incorrect reset call for non-initialized decoder.");
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaCodecVideoDecoder Java reset: ");
        A10.append(i);
        C17900vP.A0j(" x ", A10, i2);
        this.mediaCodec.flush();
        this.codecName = null;
        this.width = i;
        this.height = i2;
        this.freeInfos.addAll(this.carryAlongInfos);
        this.carryAlongInfos.clear();
        this.dequeuedSurfaceOutputBuffers.clear();
        this.hasDecodedFirstFrame = false;
        this.droppedFrames = 0;
    }

    private void returnDecodedOutputBuffer(int i) {
        if (!this.useSurface) {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return;
        }
        throw AnonymousClass000.A0n("returnDecodedOutputBuffer() called for surface decoding.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setDecoderFlags(X.CRy r9) {
        /*
            r8 = this;
            java.lang.String r0 = "vid_driver.decoder_sps_pps_in_csd"
            java.lang.Integer r7 = com.whatsapp.voipcalling.Voip.A05(r0)
            java.lang.String r0 = "vid_driver.decoder_baseline_hack"
            java.lang.Integer r1 = com.whatsapp.voipcalling.Voip.A05(r0)
            java.lang.String r0 = "vid_driver.decoder_constrained_high_hack"
            java.lang.Integer r4 = com.whatsapp.voipcalling.Voip.A05(r0)
            java.lang.String r0 = "vid_driver.decoder_restriction_hack"
            java.lang.Integer r3 = com.whatsapp.voipcalling.Voip.A05(r0)
            java.lang.String r0 = "vid_driver.decoder_restart_on_new_sps_pps"
            java.lang.Integer r6 = com.whatsapp.voipcalling.Voip.A05(r0)
            r2 = 1
            r5 = 0
            if (r7 == 0) goto L_0x0129
            int r0 = r7.intValue()
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r8.needsSpsPpsInCsd = r0
        L_0x002c:
            if (r1 == 0) goto L_0x0119
            int r0 = r1.intValue()
            boolean r0 = X.AnonymousClass000.A1R(r0)
        L_0x0036:
            r8.needsSpsBaselineProfileHack = r0
        L_0x0038:
            if (r4 == 0) goto L_0x0109
            int r0 = r4.intValue()
            boolean r0 = X.AnonymousClass000.A1R(r0)
        L_0x0042:
            r8.needsSpsConstrainedHighProfile = r0
        L_0x0044:
            if (r3 == 0) goto L_0x00a5
            int r0 = r3.intValue()
            boolean r0 = X.AnonymousClass000.A1R(r0)
        L_0x004e:
            r8.needsSpsBitstreamRestrictions = r0
        L_0x0050:
            if (r6 == 0) goto L_0x008c
            int r0 = r6.intValue()
            if (r0 <= 0) goto L_0x00a3
        L_0x0058:
            r8.needsRestartDecoderOnNewSpsPps = r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaCodecVideoDecoder needsSpsPpsInCsd: "
            r1.append(r0)
            boolean r0 = r8.needsSpsPpsInCsd
            r1.append(r0)
            java.lang.String r0 = ". needsSpsBaselineProfileHack: "
            r1.append(r0)
            boolean r0 = r8.needsSpsBaselineProfileHack
            r1.append(r0)
            java.lang.String r0 = ". needsSpsBitstreamRestrictions: "
            r1.append(r0)
            boolean r0 = r8.needsSpsBitstreamRestrictions
            r1.append(r0)
            java.lang.String r0 = ". needsSpsConstrainedHighProfile: "
            r1.append(r0)
            boolean r0 = r8.needsSpsConstrainedHighProfile
            r1.append(r0)
            java.lang.String r0 = ". needsRestartDecoderOnNewSpsPps: "
            X.C17900vP.A0n(r0, r1, r2)
            return
        L_0x008c:
            if (r9 == 0) goto L_0x0058
            java.lang.String r1 = r9.A02
            java.lang.String[] r0 = restartDecoderOnNewSpsPpsPrefixes
            boolean r0 = X.C63912tt.A04(r1, r0)
            if (r0 != 0) goto L_0x0058
            android.media.MediaCodecInfo$CodecCapabilities r1 = r9.A01
            java.lang.String r0 = "adaptive-playback"
            boolean r0 = r1.isFeatureSupported(r0)
            if (r0 != 0) goto L_0x00a3
            goto L_0x0058
        L_0x00a3:
            r2 = 0
            goto L_0x0058
        L_0x00a5:
            java.lang.String r0 = "smdk4"
            boolean r0 = X.C24171Jd.A03(r0)     // Catch:{ Exception -> 0x00c1 }
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = "Found SMDK4 in /proc/cpuinfo"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x00c1 }
            goto L_0x0105
        L_0x00b3:
            java.lang.String r0 = "exynos 4"
            boolean r0 = X.C24171Jd.A03(r0)     // Catch:{ Exception -> 0x00c1 }
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = "Found Exynos 4 in /proc/cpuinfo"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x00c1 }
            goto L_0x0105
        L_0x00c1:
            r1 = move-exception
            java.lang.String r0 = "DeviceInfo/isExynos4Device searchFileForText"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00c7:
            java.lang.String r0 = "/sys/devices/system"
            java.io.File r0 = X.C108945cZ.A17(r0)     // Catch:{ Exception -> 0x00f3 }
            java.io.File[] r4 = r0.listFiles()     // Catch:{ Exception -> 0x00f3 }
            if (r4 == 0) goto L_0x00f9
            int r3 = r4.length     // Catch:{ Exception -> 0x00f3 }
        L_0x00d4:
            if (r5 >= r3) goto L_0x00f9
            r0 = r4[r5]     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r1 = r0.getName()     // Catch:{ Exception -> 0x00f3 }
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r0 = "exynos4"
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x00f3 }
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "Found exynos4 in /sys/devices/system"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x0105
        L_0x00f0:
            int r5 = r5 + 1
            goto L_0x00d4
        L_0x00f3:
            r1 = move-exception
            java.lang.String r0 = "DeviceInfo/isExynos4Device search in /sys/devices/system"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x00f9:
            if (r9 == 0) goto L_0x0105
            java.lang.String r1 = r9.A02
            java.lang.String[] r0 = spsBitstreamRestrictionsPrefixes
            boolean r0 = X.C63912tt.A04(r1, r0)
            goto L_0x004e
        L_0x0105:
            r8.needsSpsBitstreamRestrictions = r2
            goto L_0x0050
        L_0x0109:
            if (r9 == 0) goto L_0x0115
            java.lang.String r1 = r9.A02
            java.lang.String[] r0 = spsConstrainedHighProfilePrefixes
            boolean r0 = X.C63912tt.A04(r1, r0)
            goto L_0x0042
        L_0x0115:
            r8.needsSpsConstrainedHighProfile = r5
            goto L_0x0044
        L_0x0119:
            if (r9 == 0) goto L_0x0125
            java.lang.String r1 = r9.A02
            java.lang.String[] r0 = spsBaselineProfileHackPrefixes
            boolean r0 = X.C63912tt.A04(r1, r0)
            goto L_0x0036
        L_0x0125:
            r8.needsSpsBaselineProfileHack = r5
            goto L_0x0038
        L_0x0129:
            r8.needsSpsPpsInCsd = r5
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoDecoder.setDecoderFlags(X.CRy):void");
    }

    public static void setErrorCallback(E3T e3t) {
        Log.i("MediaCodecVideoDecoder Set error callback");
        errorCallback = e3t;
    }

    /* renamed from: lambda$release$0$org-wawebrtc-MediaCodecVideoDecoder  reason: not valid java name */
    public /* synthetic */ void m84lambda$release$0$orgwawebrtcMediaCodecVideoDecoder(CountDownLatch countDownLatch) {
        try {
            Log.i("MediaCodecVideoDecoder Java releaseDecoder on release thread");
            MediaCodec mediaCodec2 = this.mediaCodec;
            if (mediaCodec2 != null) {
                mediaCodec2.stop();
            }
            MediaCodec mediaCodec3 = this.mediaCodec;
            if (mediaCodec3 != null) {
                mediaCodec3.release();
            }
            Log.i("MediaCodecVideoDecoder Java releaseDecoder on release thread done");
        } catch (Exception e) {
            Log.e("MediaCodecVideoDecoder Media decoder release failed", e);
        }
        countDownLatch.countDown();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [org.wawebrtc.MediaCodecVideoDecoder$BufferInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [org.wawebrtc.MediaCodecVideoDecoder$BufferInfo, java.lang.Object] */
    public MediaCodecVideoDecoder() {
        int i = 0;
        do {
            this.freeInfos.add(new Object());
            i++;
        } while (i < 10);
    }

    public static List findDecoder(String str, String[] strArr, int i, boolean z) {
        String str2;
        int i2;
        StringBuilder A0o;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaCodecVideoDecoder Trying to find HW decoder for mime ");
        String str3 = str;
        C17890vO.A1A(A10, str3);
        ArrayList A13 = AnonymousClass000.A13();
        String A07 = Voip.A07("vid_driver.decoder_name");
        int i3 = -1;
        for (int i4 = 0; i4 < MediaCodecList.getCodecCount(); i4++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i4);
            if (!codecInfoAt.isEncoder()) {
                boolean isSoftwareCodec = isSoftwareCodec(codecInfoAt);
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                int length = supportedTypes.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        str2 = null;
                        break;
                    } else if (supportedTypes[i5].equals(str3)) {
                        str2 = codecInfoAt.getName();
                        break;
                    } else {
                        i5++;
                    }
                }
                if (str2 != null) {
                    if (z) {
                        C17900vP.A0f("MediaCodecVideoDecoder Found candidate decoder ", str2, AnonymousClass000.A10());
                    }
                    String[] strArr2 = blacklistedHwCodecPrefixes;
                    if (strArr2 == null || !C63912tt.A04(str2, strArr2) || str2.equalsIgnoreCase(A07)) {
                        String[] strArr3 = blacklistedDeviceBoard;
                        if (strArr3 != null) {
                            String str4 = Build.BOARD;
                            if (C63912tt.A04(str4, strArr3) && !isSoftwareCodec && !str2.equalsIgnoreCase(A07)) {
                                A0o = AnonymousClass000.A10();
                                A0o.append("MediaCodecVideoDecoder Device Board ");
                                A0o.append(str4);
                                A0o.append(" is in the blacklist, do not use hardware codec ");
                            }
                        }
                        String[] strArr4 = strArr;
                        if (strArr == null || C63912tt.A04(str2, strArr4)) {
                            String A1H = AnonymousClass001.A1H("_", str3, AnonymousClass000.A11(str2));
                            Map map = cachedCodecCapabilites;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = (MediaCodecInfo.CodecCapabilities) map.get(A1H);
                            if (codecCapabilities == null) {
                                try {
                                    codecCapabilities = codecInfoAt.getCapabilitiesForType(str3);
                                    C17960vV.A07(codecCapabilities);
                                    map.put(A1H, codecCapabilities);
                                } catch (Throwable th) {
                                    StringBuilder A102 = AnonymousClass000.A10();
                                    A102.append("MediaCodecVideoDecoder failed to get capabilities for ");
                                    C108985cd.A1M(str2, A102, th);
                                }
                            }
                            int i6 = i;
                            boolean A19 = C108975cc.A19(i6);
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                                if (i >= 0 && codecProfileLevel.profile == i6) {
                                    A19 = true;
                                }
                            }
                            if (!A19) {
                                A0o = AnonymousClass8BW.A0o("MediaCodecVideoDecoder  ", str2);
                                A0o.append(" does not support Profile ");
                                A0o.append(i6);
                                Log.i(A0o.toString());
                            } else {
                                if (z) {
                                    StringBuilder A11 = AnonymousClass000.A11("MediaCodecVideoDecoder  ");
                                    A11.append(codecCapabilities.colorFormats.length);
                                    C17890vO.A1A(A11, "  colorFormats");
                                    for (int hexString : codecCapabilities.colorFormats) {
                                        StringBuilder A103 = AnonymousClass000.A10();
                                        A103.append("MediaCodecVideoDecoder    Color: 0x");
                                        C17890vO.A1A(A103, Integer.toHexString(hexString));
                                    }
                                }
                                String A072 = Voip.A07("vid_driver.decoder_name");
                                Integer A05 = Voip.A05("vid_driver.decoder_color_format");
                                if (A07 == null || !str2.equalsIgnoreCase(A072) || A05 == null) {
                                    i2 = 0;
                                } else {
                                    i2 = A05.intValue();
                                }
                                int[] A052 = C63912tt.A05(str2, i2);
                                boolean isFeatureSupported = codecCapabilities.isFeatureSupported("adaptive-playback");
                                for (int i7 = 0; i7 < 13; i7++) {
                                    int i8 = A052[i7];
                                    if (i8 != 19 || !Build.DEVICE.equals("ghost")) {
                                        for (int i9 : codecCapabilities.colorFormats) {
                                            if (i9 == i8) {
                                                StringBuilder A104 = AnonymousClass000.A10();
                                                A104.append("MediaCodecVideoDecoder Found target decoder ");
                                                A104.append(str2);
                                                BE9.A1J(". Color: 0x", A104, i9);
                                                C17900vP.A0n(". Adaptive Playback: ", A104, isFeatureSupported);
                                                if (i9 == i2) {
                                                    i3 = A13.size();
                                                }
                                                A13.add(new CRy(codecCapabilities, str2, i9, isSoftwareCodec));
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            A0o = AnonymousClass8BW.A0o("MediaCodecVideoDecoder ", str2);
                            A0o.append(" is not supported. supportedCodecPrefixes are ");
                            str2 = Arrays.toString(strArr4);
                        }
                    } else {
                        A0o = AnonymousClass8BW.A0o("MediaCodecVideoDecoder ", str2);
                        str2 = " is in the blacklist.";
                    }
                    A0o.append(str2);
                    Log.i(A0o.toString());
                }
            }
        }
        if (i3 >= 0) {
            Object obj = A13.get(i3);
            A13.set(i3, A13.get(0));
            A13.set(0, obj);
        }
        int decoderImplFromString = getDecoderImplFromString(Voip.A07("vid_rc.android_decoder_prefer_impl"));
        if (decoderImplFromString != 0) {
            ArrayList A132 = AnonymousClass000.A13();
            ArrayList A133 = AnonymousClass000.A13();
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                CRy cRy = (CRy) it.next();
                if (cRy.A03) {
                    A132.add(cRy);
                } else {
                    A133.add(cRy);
                }
            }
            A13.clear();
            if (decoderImplFromString == 1) {
                A13.addAll(A132);
                A13.addAll(A133);
            } else {
                A13.addAll(A133);
                A13.addAll(A132);
            }
        }
        if (!A13.isEmpty()) {
            return A13;
        }
        C17900vP.A0f("MediaCodecVideoDecoder No HW decoder found for mime ", str3, AnonymousClass000.A10());
        return null;
    }

    private void release() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaCodecVideoDecoder Java releaseDecoder ");
        A10.append(this.codecName);
        A10.append(". Total number of dropped frames: ");
        C17900vP.A0o(A10, this.droppedFrames);
        CountDownLatch A0u = BE7.A0u();
        new C201010v(new C21357Aim(A0u, this, 13), TAG).start();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 5000;
        boolean z2 = false;
        while (true) {
            try {
                z = A0u.await(j, TimeUnit.MILLISECONDS);
                if (z2) {
                }
            } catch (InterruptedException unused) {
                j = 5000 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z2 = true;
                if (j <= 0) {
                    break;
                }
            }
        }
        AnonymousClass8BS.A0x();
        if (!z) {
            Log.e("MediaCodecVideoDecoder Media decoder release timeout");
            codecErrors++;
        }
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        runningInstance = null;
        lastReleaseTimestamp = SystemClock.uptimeMillis();
        if (this.useSurface) {
            this.surface.release();
            this.surface = null;
            throw AnonymousClass000.A0s("dispose");
        }
        Log.i("MediaCodecVideoDecoder Java releaseDecoder done");
    }

    private boolean initH264Decoder(int i, int i2, byte[] bArr, byte[] bArr2, boolean z) {
        CRy cRy = null;
        try {
            List findDecoder = findDecoder("video/avc", supportedH264HwCodecPrefixes, -1, false);
            if (findDecoder != null && !findDecoder.isEmpty()) {
                cRy = (CRy) findDecoder.get(0);
            }
        } catch (Throwable th) {
            Log.e("MediaCodecVideoDecoder Exception in findDecoder", th);
        }
        setDecoderFlags(cRy);
        return initDecode(C24281Bye.VIDEO_CODEC_H264, i, i2, (C24447C4m) null, bArr, bArr2, z);
    }

    private boolean initH265Decoder(int i, int i2, byte[] bArr, byte[] bArr2, boolean z) {
        CRy cRy = null;
        try {
            List findDecoder = findDecoder("video/hevc", supportedH265HwCodecPrefixes, -1, true);
            if (findDecoder != null && !findDecoder.isEmpty()) {
                cRy = (CRy) C108955ca.A0p(findDecoder);
            }
        } catch (Throwable th) {
            Log.e("MediaCodecVideoDecoder Exception in findDecoder", th);
        }
        setDecoderFlags(cRy);
        return initDecode(C24281Bye.VIDEO_CODEC_H265, i, i2, (C24447C4m) null, bArr, bArr2, z);
    }
}
