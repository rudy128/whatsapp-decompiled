package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.CrL  reason: case insensitive filesystem */
public final class C26051CrL {
    public MediaCodec A00;
    public Surface A01;
    public C26196CuR A02;
    public BT9 A03;
    public C22821Di A04;
    public boolean A05;
    public boolean A06 = true;
    public boolean A07;
    public ByteBuffer A08;
    public final MediaFormat A09;
    public final BTZ A0A;
    public final boolean A0B;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.BT9] */
    public C26051CrL(BTZ btz, boolean z) {
        this.A0A = btz;
        this.A0B = z;
        C27551DhI dhI = new C27551DhI(this);
        ? obj = new Object();
        obj.A02 = false;
        obj.A03 = false;
        obj.A00 = null;
        obj.A01 = dhI;
        this.A03 = obj;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(C25331Cdc.A00(btz.A06), btz.A05, btz.A03);
        C18070vi.A0X(createVideoFormat);
        createVideoFormat.setInteger("frame-rate", btz.A02);
        createVideoFormat.setInteger("i-frame-interval", btz.A04);
        createVideoFormat.setInteger("bitrate", btz.A00);
        createVideoFormat.setInteger("color-format", 2135033992);
        this.A09 = createVideoFormat;
    }

    public final void A03() {
        A09(false);
        MediaCodec mediaCodec = this.A00;
        if (mediaCodec != null) {
            mediaCodec.release();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0099, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r20 = this;
            r3 = r20
            android.media.MediaCodec r0 = r3.A00
            if (r0 != 0) goto L_0x0172
            boolean r10 = r3.A0B
            android.media.MediaFormat r9 = r3.A09
            X.BTZ r8 = r3.A0A
            r7 = 1
            X.C18070vi.A0d(r9, r7)
            X.Cn1 r5 = X.C24712CGy.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Creating codec [preferSoftwareCodec = "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " , videoFormat = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " , mediaFormat = "
            r1.append(r0)
            r1.append(r9)
            r0 = 93
            java.lang.String r0 = X.C17890vO.A0c(r1, r0)
            java.lang.String r4 = "sup:CodecFactory"
            r5.A01(r4, r0)
            android.media.MediaCodecList r11 = new android.media.MediaCodecList
            r11.<init>(r7)
            android.media.MediaCodecInfo[] r2 = r11.getCodecInfos()
            X.C18070vi.A0X(r2)
            java.util.ArrayList r17 = X.C24710CGw.A01
            java.util.Set r1 = X.C29431cG.A12(r17)
            int r0 = r2.length
            int r0 = X.C200610r.A03(r0)
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>(r0)
            X.C200410p.A0T(r6, r2)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 != 0) goto L_0x0060
            java.util.List r1 = X.C29431cG.A0t(r1)
        L_0x0060:
            java.util.Collection r1 = (java.util.Collection) r1
            r6.retainAll(r1)
            android.media.MediaCodecInfo[] r2 = r11.getCodecInfos()
            X.C18070vi.A0X(r2)
            int r0 = r2.length
            r19 = r0
            r11 = 0
        L_0x0070:
            java.lang.String r1 = "mime"
            r0 = r19
            if (r11 >= r0) goto L_0x0130
            r16 = r2[r11]
            boolean r12 = r16.isEncoder()
            r0 = 0
            if (r12 != r0) goto L_0x0099
            java.util.ArrayList r12 = X.C24710CGw.A00
            java.lang.String r0 = r16.getName()
            boolean r0 = r12.contains(r0)
            if (r0 != 0) goto L_0x0099
            if (r10 == 0) goto L_0x00ad
            int r12 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r12 < r0) goto L_0x009c
            boolean r0 = r16.isSoftwareOnly()
        L_0x0097:
            if (r0 != 0) goto L_0x00ad
        L_0x0099:
            int r11 = r11 + 1
            goto L_0x0070
        L_0x009c:
            boolean r0 = X.C108945cZ.A1U(r6)
            if (r0 == 0) goto L_0x00ad
            java.lang.String r12 = r16.getName()
            r0 = r17
            boolean r0 = r0.contains(r12)
            goto L_0x0097
        L_0x00ad:
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Found codec: "
            r12.append(r0)
            java.lang.String r0 = r16.getName()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r12)
            r5.A01(r4, r0)
            java.lang.String[] r13 = r16.getSupportedTypes()
            X.C18070vi.A0X(r13)
            int r0 = r13.length
            r18 = r0
            r14 = 0
        L_0x00cc:
            r0 = r18
            if (r14 >= r0) goto L_0x0099
            r12 = r13[r14]
            java.lang.String r0 = r9.getString(r1)
            boolean r0 = X.AnonymousClass1YE.A09(r12, r0, r7)
            if (r0 == 0) goto L_0x012d
            java.lang.String r0 = r16.getName()     // Catch:{ IllegalArgumentException -> 0x00f9, IOException -> 0x0110, Exception -> 0x00e6 }
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ IllegalArgumentException -> 0x00f9, IOException -> 0x0110, Exception -> 0x00e6 }
            goto L_0x016b
        L_0x00e6:
            r15 = move-exception
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to initialize codec "
            r12.append(r0)
            java.lang.String r0 = r16.getName()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r12)
            goto L_0x012a
        L_0x00f9:
            r15 = move-exception
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Codec name "
            r12.append(r0)
            java.lang.String r0 = r16.getName()
            r12.append(r0)
            java.lang.String r0 = " is invalid."
            r12.append(r0)
            goto L_0x0126
        L_0x0110:
            r15 = move-exception
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unable to create codec based on codec name "
            r12.append(r0)
            java.lang.String r0 = r16.getName()
            r12.append(r0)
            r0 = 46
            r12.append(r0)
        L_0x0126:
            java.lang.String r0 = r12.toString()
        L_0x012a:
            r5.A07(r4, r0, r15)
        L_0x012d:
            int r14 = r14 + 1
            goto L_0x00cc
        L_0x0130:
            java.lang.String r6 = "decoder"
            java.lang.String r0 = r9.getString(r1)     // Catch:{ IllegalArgumentException -> 0x0156, IOException -> 0x0143 }
            if (r0 != 0) goto L_0x013e
            java.lang.Integer r0 = r8.A06     // Catch:{ IllegalArgumentException -> 0x0156, IOException -> 0x0143 }
            java.lang.String r0 = X.C25331Cdc.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0156, IOException -> 0x0143 }
        L_0x013e:
            android.media.MediaCodec r2 = android.media.MediaCodec.createDecoderByType(r0)     // Catch:{ IllegalArgumentException -> 0x0156, IOException -> 0x0143 }
            goto L_0x016b
        L_0x0143:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error creating "
            r1.append(r0)
            r1.append(r6)
            r0 = 33
            r1.append(r0)
            goto L_0x0163
        L_0x0156:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Mime type invalid! unable to create "
            r1.append(r0)
            r1.append(r6)
        L_0x0163:
            java.lang.String r0 = r1.toString()
            r5.A07(r4, r0, r2)
            r2 = 0
        L_0x016b:
            r3.A00 = r2
            if (r2 != 0) goto L_0x0173
            r1 = 0
        L_0x0170:
            r3.A02 = r1
        L_0x0172:
            return
        L_0x0173:
            X.BT9 r0 = r3.A03
            X.CuR r1 = new X.CuR
            r1.<init>(r2, r0)
            goto L_0x0170
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26051CrL.A02():void");
    }

    public final void A04() {
        this.A03.A03 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e0, code lost:
        if (r13[r2 - 2] == 0) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01e2, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e5, code lost:
        if (r13[r5] == 1) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01f5, code lost:
        if (r13[r5] != 0) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x020c, code lost:
        if (r3[2] != false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0211, code lost:
        if (r3[1] != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r1 == r0) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01da, code lost:
        if (r13[r2 - 3] == 0) goto L_0x01dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0150 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.nio.ByteBuffer r26, long r27) {
        /*
            r25 = this;
            r4 = r26
            int r9 = r4.position()
            r0 = 3
            boolean[] r3 = new boolean[r0]
            int r0 = r4.capacity()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r4.rewind()
            r0.put(r4)
            r0.flip()
            r4.rewind()
            byte[] r13 = r0.array()
        L_0x0021:
            int r2 = r4.limit()
            int r8 = r2 - r9
            if (r8 == 0) goto L_0x0038
            r10 = 0
            boolean r0 = r3[r10]
            if (r0 == 0) goto L_0x0184
            r3[r10] = r10
            r0 = 1
            r3[r0] = r10
            r0 = 2
            r3[r0] = r10
            int r2 = r9 + -3
        L_0x0038:
            int r0 = r4.limit()
            if (r2 >= r0) goto L_0x0214
            r5 = r25
            X.BTZ r0 = r5.A0A
            java.lang.Integer r6 = r0.A06
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            r7 = 1
            int r0 = r2 + 3
            byte r0 = r13[r0]
            if (r6 != r1) goto L_0x0158
            r0 = r0 & 126(0x7e, float:1.77E-43)
            int r1 = r0 >> 1
            r0 = 19
            if (r1 == r0) goto L_0x0166
            r0 = 20
            if (r1 == r0) goto L_0x0166
            r21 = 0
            r0 = 33
            if (r1 == r0) goto L_0x0067
            r0 = 34
            if (r1 == r0) goto L_0x0067
            r0 = 32
        L_0x0065:
            if (r1 != r0) goto L_0x0168
        L_0x0067:
            r22 = 1
            java.nio.ByteBuffer r0 = A00(r4)
            r5.A08 = r0
        L_0x006f:
            java.nio.ByteBuffer r16 = A00(r4)
            r15 = 0
            int r18 = r16.remaining()
            r6 = 0
            X.CTc r14 = new X.CTc
            r19 = r27
            r17 = r2
            r14.<init>(r15, r16, r17, r18, r19, r21, r22)
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0150
            boolean r0 = r14.A06
            if (r0 != 0) goto L_0x00b8
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0150
            X.1Di r12 = r5.A04
            if (r12 == 0) goto L_0x00b8
            java.nio.ByteBuffer r0 = r14.A05
            java.nio.ByteBuffer r18 = A00(r0)
            int r11 = r14.A01
            int r10 = r14.A02
            boolean r9 = r14.A07
            long r0 = r14.A03
            android.media.MediaCodec$BufferInfo r8 = r14.A04
            X.CTc r7 = new X.CTc
            r16 = r7
            r17 = r8
            r19 = r11
            r20 = r10
            r21 = r0
            r23 = r9
            r24 = r6
            r16.<init>(r17, r18, r19, r20, r21, r23, r24)
            r12.invoke(r7)
        L_0x00b8:
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x0134
            r5.A06 = r6
            java.lang.String r7 = "sup:MediaCodecDecoder"
            r5.A02()     // Catch:{ CodecException -> 0x00f6, all -> 0x012c }
            android.media.MediaCodec r8 = r5.A00     // Catch:{ CodecException -> 0x00f6, all -> 0x012c }
            if (r8 == 0) goto L_0x0134
            r8.reset()     // Catch:{ CodecException -> 0x00f6, all -> 0x012c }
            android.media.MediaFormat r1 = r5.A09     // Catch:{ CodecException -> 0x00f6, all -> 0x012c }
            android.view.Surface r0 = r5.A01     // Catch:{ CodecException -> 0x00f6, all -> 0x012c }
            r8.configure(r1, r0, r15, r6)     // Catch:{ CodecException -> 0x00f6, all -> 0x012c }
            X.CuR r0 = r5.A02     // Catch:{ CodecException -> 0x00f6, all -> 0x012c }
            if (r0 == 0) goto L_0x00d8
            r0.A05()     // Catch:{ CodecException -> 0x00f6, all -> 0x012c }
        L_0x00d8:
            X.Cn1 r6 = X.C24712CGy.A01     // Catch:{ CodecException -> 0x00f6, all -> 0x012c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ CodecException -> 0x00f6, all -> 0x012c }
            java.lang.String r0 = "Using codec: "
            r1.append(r0)     // Catch:{ CodecException -> 0x00f6, all -> 0x012c }
            android.media.MediaCodecInfo r0 = r8.getCodecInfo()     // Catch:{ CodecException -> 0x00f6, all -> 0x012c }
            java.lang.String r0 = r0.getName()     // Catch:{ CodecException -> 0x00f6, all -> 0x012c }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ CodecException -> 0x00f6, all -> 0x012c }
            r6.A01(r7, r0)     // Catch:{ CodecException -> 0x00f6, all -> 0x012c }
            r8.start()     // Catch:{ CodecException -> 0x00f6, all -> 0x012c }
            goto L_0x0134
        L_0x00f6:
            r8 = move-exception
            int r9 = r8.getErrorCode()
            r0 = -19
            X.Cn1 r6 = X.C24712CGy.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r9 != r0) goto L_0x011b
            java.lang.String r0 = "Resource was not available. Likely caused by invalid surface. Diagnostics: "
            r1.append(r0)
            java.lang.String r0 = r8.getDiagnosticInfo()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r6.A07(r7, r0, r8)
        L_0x0115:
            java.lang.String r0 = " Attempt to invoke on invalid surface callback."
            r6.A01(r7, r0)
            goto L_0x0134
        L_0x011b:
            java.lang.String r0 = "Video decoder activation MediaCodec Exception! Diagnostics: "
            r1.append(r0)
            java.lang.String r0 = r8.getDiagnosticInfo()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r6.A05(r7, r0, r8)
            goto L_0x0115
        L_0x012c:
            r6 = move-exception
            X.Cn1 r1 = X.C24712CGy.A01
            java.lang.String r0 = "Video Decoder activation exception!"
            r1.A05(r7, r0, r6)
        L_0x0134:
            X.CuR r6 = r5.A02
            if (r6 == 0) goto L_0x0150
            java.util.concurrent.LinkedBlockingQueue r1 = r6.A04
            int r0 = r1.remainingCapacity()
            if (r0 != 0) goto L_0x0154
            X.Cn1 r5 = X.C24712CGy.A01
            java.lang.String r1 = "sup:AsyncFrameHandler"
            java.lang.String r0 = "data queue is at capacity.  This usually means we are not receiving input buffers from the decoder.  Attempting restart"
            r5.A06(r1, r0, r15)
            X.BT9 r0 = r6.A03
            X.0vk r0 = r0.A01
            r0.invoke()
        L_0x0150:
            int r9 = r2 + 1
            goto L_0x0021
        L_0x0154:
            r1.offer(r14)
            goto L_0x0150
        L_0x0158:
            r1 = r0 & 31
            r0 = 5
            if (r1 == r0) goto L_0x0166
            r21 = 0
            r0 = 7
            if (r1 == r0) goto L_0x0067
            r0 = 8
            goto L_0x0065
        L_0x0166:
            r21 = 1
        L_0x0168:
            r22 = 0
            if (r21 == 0) goto L_0x006f
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x017c
            r5.A09(r7)
            java.nio.ByteBuffer r6 = r5.A08
            if (r6 == 0) goto L_0x017c
            r0 = 0
            r5.A06(r6, r0)
        L_0x017c:
            boolean r0 = r5.A07
            if (r0 != 0) goto L_0x006f
            r5.A07 = r7
            goto L_0x006f
        L_0x0184:
            r6 = 2
            r7 = 1
            if (r8 <= r7) goto L_0x01b4
            boolean r0 = r3[r7]
            if (r0 == 0) goto L_0x019a
            byte r0 = r13[r9]
            if (r0 != r7) goto L_0x019a
        L_0x0190:
            r3[r10] = r10
            r3[r7] = r10
            r3[r6] = r10
            int r2 = r9 - r6
            goto L_0x0038
        L_0x019a:
            if (r8 <= r6) goto L_0x01b4
            boolean r0 = r3[r6]
            if (r0 == 0) goto L_0x01b4
            byte r0 = r13[r9]
            if (r0 != 0) goto L_0x01b4
            int r0 = r9 + 1
            byte r0 = r13[r0]
            if (r0 != r7) goto L_0x01b4
            r3[r10] = r10
            r3[r7] = r10
            r3[r6] = r10
            int r2 = r9 - r7
            goto L_0x0038
        L_0x01b4:
            int r5 = r2 + -1
            int r9 = r9 + 2
        L_0x01b8:
            if (r9 >= r5) goto L_0x01d4
            byte r1 = r13[r9]
            r0 = r1 & 254(0xfe, float:3.56E-43)
            if (r0 != 0) goto L_0x01d1
            int r0 = r9 + -2
            byte r0 = r13[r0]
            if (r0 != 0) goto L_0x01cf
            int r0 = r9 + -1
            byte r0 = r13[r0]
            if (r0 != 0) goto L_0x01cf
            if (r1 != r7) goto L_0x01cf
            goto L_0x0190
        L_0x01cf:
            int r9 = r9 + -2
        L_0x01d1:
            int r9 = r9 + 3
            goto L_0x01b8
        L_0x01d4:
            if (r8 <= r6) goto L_0x0208
            int r0 = r2 + -3
            byte r0 = r13[r0]
            if (r0 != 0) goto L_0x01e7
        L_0x01dc:
            int r0 = r2 + -2
            byte r0 = r13[r0]
            if (r0 != 0) goto L_0x01e7
        L_0x01e2:
            byte r1 = r13[r5]
            r0 = 1
            if (r1 == r7) goto L_0x01e8
        L_0x01e7:
            r0 = 0
        L_0x01e8:
            r3[r10] = r0
            if (r8 <= r7) goto L_0x0203
            int r0 = r2 + -2
            byte r0 = r13[r0]
            if (r0 != 0) goto L_0x01f7
        L_0x01f2:
            byte r1 = r13[r5]
            r0 = 1
            if (r1 == 0) goto L_0x01f8
        L_0x01f7:
            r0 = 0
        L_0x01f8:
            r3[r7] = r0
            byte r0 = r13[r5]
            if (r0 != 0) goto L_0x01ff
            r10 = 1
        L_0x01ff:
            r3[r6] = r10
            goto L_0x0038
        L_0x0203:
            boolean r0 = r3[r6]
            if (r0 == 0) goto L_0x01f7
            goto L_0x01f2
        L_0x0208:
            if (r8 != r6) goto L_0x020f
            boolean r0 = r3[r6]
            if (r0 == 0) goto L_0x01e7
            goto L_0x01dc
        L_0x020f:
            boolean r0 = r3[r7]
            if (r0 == 0) goto L_0x01e7
            goto L_0x01e2
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26051CrL.A06(java.nio.ByteBuffer, long):void");
    }

    public final void A07(C18090vk r2) {
        this.A03.A00 = r2;
    }

    public final void A09(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            this.A03.A02 = z;
            C25845Cn1 cn1 = C24712CGy.A01;
            if (z) {
                cn1.A01("sup:MediaCodecDecoder", "decoder starting up.");
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Activating Video decoder with max jitter queue size: ");
                cn1.A01("sup:MediaCodecDecoder", C17880vN.A0t(A10, 10));
                this.A06 = true;
                this.A07 = false;
                C26196CuR cuR = this.A02;
                if (cuR != null) {
                    try {
                        HandlerThread handlerThread = cuR.A01;
                        if (handlerThread != null) {
                            if (handlerThread.isAlive()) {
                                HandlerThread handlerThread2 = cuR.A01;
                                if (handlerThread2 == null) {
                                    C18070vi.A11("decoderThread");
                                    throw null;
                                }
                                handlerThread2.quit();
                            }
                        }
                        HandlerThread handlerThread3 = new HandlerThread("AsyncFrameHandlerThread", 0);
                        cuR.A01 = handlerThread3;
                        handlerThread3.start();
                        return;
                    } catch (Throwable th) {
                        cn1.A05("sup:AsyncFrameHandler", "Video decoder activation exception! Deactivate decoder", th);
                    }
                }
                A09(false);
                return;
            }
            cn1.A01("sup:MediaCodecDecoder", "decoder shutting down.");
            cn1.A01("sup:MediaCodecDecoder", "Deactivating Video decoder");
            this.A06 = true;
            this.A07 = false;
            C26196CuR cuR2 = this.A02;
            if (cuR2 != null) {
                HandlerThread handlerThread4 = cuR2.A01;
                if (handlerThread4 != null && handlerThread4.isAlive()) {
                    HandlerThread handlerThread5 = cuR2.A01;
                    if (handlerThread5 == null) {
                        C18070vi.A11("decoderThread");
                        throw null;
                    }
                    handlerThread5.quit();
                }
                cuR2.A04.clear();
            }
        }
    }

    public final boolean A0A() {
        return this.A05;
    }

    public static final ByteBuffer A00(ByteBuffer byteBuffer) {
        ByteBuffer allocate;
        boolean isDirect = byteBuffer.isDirect();
        int capacity = byteBuffer.capacity();
        if (isDirect) {
            allocate = ByteBuffer.allocateDirect(capacity);
        } else {
            allocate = ByteBuffer.allocate(capacity);
        }
        C18070vi.A0X(allocate);
        byteBuffer.rewind();
        allocate.put(byteBuffer);
        byteBuffer.rewind();
        allocate.flip();
        return allocate;
    }

    public final void A05(Surface surface) {
        this.A01 = surface;
    }

    public final void A08(C22821Di r1) {
        this.A04 = r1;
    }
}
