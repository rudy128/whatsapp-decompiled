package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.Cc6  reason: case insensitive filesystem */
public class C25265Cc6 {
    public MediaFormat A00;
    public String A01;
    public ByteBuffer[] A02;
    public ByteBuffer[] A03;
    public final MediaCodec A04;
    public final Surface A05;
    public final Integer A06;
    public final StringBuilder A07;
    public final boolean A08;
    public final boolean A09;

    public DH2 A00(long j) {
        ByteBuffer byteBuffer;
        C26171Ctn.A03(AnonymousClass000.A1X(this.A05), (String) null);
        MediaCodec mediaCodec = this.A04;
        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(j);
        if (dequeueInputBuffer < 0) {
            return null;
        }
        if (this.A08) {
            byteBuffer = mediaCodec.getInputBuffer(dequeueInputBuffer);
        } else {
            ByteBuffer[] byteBufferArr = this.A02;
            if (byteBufferArr != null) {
                byteBuffer = byteBufferArr[dequeueInputBuffer];
            } else {
                byteBuffer = null;
            }
        }
        return new DH2(dequeueInputBuffer, byteBuffer, (MediaCodec.BufferInfo) null);
    }

    public DH2 A01(long j) {
        String str;
        DH2 dh2;
        ByteBuffer byteBuffer;
        Trace.beginSection("MediaCodecWrapper.dequeueNextOutputBuffer()");
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            Trace.beginSection("MediaCodecWrapper.dequeueOutputBuffer()");
            MediaCodec mediaCodec = this.A04;
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j);
            Trace.endSection();
            if (dequeueOutputBuffer >= 0) {
                if (this.A08) {
                    byteBuffer = mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                } else {
                    ByteBuffer[] byteBufferArr = this.A03;
                    if (byteBufferArr != null) {
                        byteBuffer = byteBufferArr[dequeueOutputBuffer];
                    } else {
                        byteBuffer = null;
                    }
                }
                dh2 = new DH2(dequeueOutputBuffer, byteBuffer, bufferInfo);
            } else {
                if (dequeueOutputBuffer == -3) {
                    Trace.beginSection("MediaCodecWrapper.buffersChanged()");
                    this.A03 = mediaCodec.getOutputBuffers();
                    Trace.endSection();
                } else if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    this.A00 = outputFormat;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append(this.A01);
                    this.A01 = AnonymousClass000.A0y(String.format(Locale.US, "New output format: %s", AnonymousClass000.A1b(outputFormat, 1)), A10);
                    dh2 = new DH2(-1, (ByteBuffer) null, (MediaCodec.BufferInfo) null);
                    dh2.A01 = true;
                }
                Trace.endSection();
                return null;
            }
            Trace.endSection();
            return dh2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void A02() {
        StringBuilder sb = this.A07;
        sb.append("startB,");
        MediaCodec mediaCodec = this.A04;
        mediaCodec.start();
        if (this.A05 == null) {
            this.A02 = mediaCodec.getInputBuffers();
        }
        this.A03 = mediaCodec.getOutputBuffers();
        sb.append("startE,");
    }

    public void A03(DH2 dh2) {
        MediaCodec mediaCodec = this.A04;
        int i = dh2.A02;
        MediaCodec.BufferInfo bufferInfo = dh2.A00;
        mediaCodec.queueInputBuffer(i, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    public void A04(DH2 dh2, boolean z) {
        Trace.beginSection("MediaCodecWrapper.releaseOutputBuffer");
        int i = dh2.A02;
        if (i >= 0) {
            this.A04.releaseOutputBuffer(i, z);
        }
        Trace.endSection();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r5 == X.AnonymousClass00R.A01) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25265Cc6(android.media.MediaCodec r3, android.view.Surface r4, java.lang.Integer r5, java.lang.String r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            r2.<init>()
            if (r4 == 0) goto L_0x000a
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r1 = 0
            if (r5 != r0) goto L_0x000b
        L_0x000a:
            r1 = 1
        L_0x000b:
            r0 = 0
            X.C26171Ctn.A03(r1, r0)
            r2.A06 = r5
            r2.A04 = r3
            r2.A05 = r4
            r2.A09 = r7
            r2.A01 = r6
            r2.A08 = r8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r2.A07 = r1
            java.lang.String r0 = "MediaCodecWrapper "
            r1.append(r0)
            int r0 = r2.hashCode()
            r1.append(r0)
            java.lang.String r0 = " ctor codec="
            r1.append(r0)
            int r0 = r3.hashCode()
            r1.append(r0)
            X.BE6.A1K(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25265Cc6.<init>(android.media.MediaCodec, android.view.Surface, java.lang.Integer, java.lang.String, boolean, boolean):void");
    }
}
