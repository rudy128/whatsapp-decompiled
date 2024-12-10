package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Process;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* renamed from: X.DVl  reason: case insensitive filesystem */
public class C27124DVl implements Callable {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;

    public C27124DVl(Object obj, Object obj2, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A01 = i;
        this.A04 = obj;
        this.A02 = j;
    }

    public /* bridge */ /* synthetic */ Object call() {
        C25185Cab cab;
        if (this.A00 != 0) {
            Trace.beginSection("EncodeMuxerWrapper.setup");
            Process.setThreadPriority(this.A01 - 1);
            C26873DHe dHe = (C26873DHe) this.A03;
            Trace.endSection();
            boolean z = false;
            while (!dHe.A0A && !Thread.currentThread().isInterrupted()) {
                Trace.beginSection("EncodeMuxerWrapper.loop");
                Trace.beginSection("EncodeMuxerWrapper.dequeue");
                EAb eAb = dHe.A09;
                C26159CtX.A01(eAb);
                DH2 BIS = eAb.BIS();
                Trace.endSection();
                if (BIS != null) {
                    Trace.beginSection("EncodeMuxerWrapper.mux");
                    C25674Ck5 ck5 = (C25674Ck5) this.A04;
                    long j = this.A02;
                    if (BIS.A02 >= 0) {
                        MediaCodec.BufferInfo bufferInfo = BIS.A00;
                        z = true;
                        if ((bufferInfo.flags & 4) == 0) {
                            C25820CmX cmX = dHe.A04;
                            cmX.A0Q = true;
                            long j2 = bufferInfo.presentationTimeUs;
                            long j3 = cmX.A06;
                            if (j2 <= j3) {
                                if (!cmX.A0W) {
                                    cmX.A0W = true;
                                    cmX.A0C = j2 - j3;
                                }
                                C25752ClM clM = dHe.A06.A04;
                                if (clM != null && (cab = clM.A0E) != null && 1 == cab.A01 && C24354Bzp.CODEC_VIDEO_H264.equals(cab.A02)) {
                                    long j4 = j3 + 1;
                                    bufferInfo.presentationTimeUs = j4;
                                    j2 = j4;
                                }
                            }
                            ck5.A00((Object) null, ((double) j2) / ((double) j));
                            try {
                                Trace.beginSection("EncodeMuxerWrapper.writeVideoSampleData");
                                dHe.A05.CSW(BIS);
                                Trace.endSection();
                            } catch (Exception unused) {
                                cmX.A0A++;
                            }
                            cmX.A06 = bufferInfo.presentationTimeUs;
                            cmX.A0B++;
                        }
                        Trace.endSection();
                        Trace.beginSection("EncodeMuxerWrapper.release");
                        EAb eAb2 = dHe.A09;
                        C26159CtX.A01(eAb2);
                        eAb2.CEJ(BIS);
                        Trace.endSection();
                    } else if (BIS.A01) {
                        Trace.beginSection("EncodeMuxerWrapper.initTracksAndStartMuxer");
                        if (dHe.A06.A0L) {
                            MediaFormat mediaFormat = dHe.A02;
                            if (mediaFormat != null) {
                                dHe.A05.A02 = mediaFormat;
                                dHe.A04.A0N = true;
                            }
                            C26873DHe.A00(dHe);
                        } else {
                            C26873DHe.A00(dHe);
                            MediaFormat mediaFormat2 = dHe.A02;
                            if (mediaFormat2 != null) {
                                dHe.A05.A02 = mediaFormat2;
                                dHe.A04.A0N = true;
                            }
                        }
                        DHA dha = dHe.A05;
                        dha.start();
                        dHe.A04.A0I = dha.BV9();
                        Trace.endSection();
                    }
                    z = false;
                    Trace.endSection();
                    Trace.beginSection("EncodeMuxerWrapper.release");
                    EAb eAb22 = dHe.A09;
                    C26159CtX.A01(eAb22);
                    eAb22.CEJ(BIS);
                    Trace.endSection();
                }
                Trace.endSection();
                if (z) {
                    return null;
                }
            }
            return null;
        }
        Trace.beginSection("AudioEncodeMuxerWrapper.setup");
        Process.setThreadPriority(this.A01 - 1);
        C26872DHd dHd = (C26872DHd) this.A03;
        Trace.endSection();
        boolean z2 = false;
        while (!dHd.A0C && !Thread.currentThread().isInterrupted()) {
            Trace.beginSection("AudioEncodeMuxerWrapper.loop");
            DH2 A012 = dHd.A0B.A00.A01(5000);
            if (A012 != null) {
                C25674Ck5 ck52 = (C25674Ck5) this.A04;
                long j5 = this.A02;
                MediaCodec.BufferInfo bufferInfo2 = A012.A00;
                int i = A012.A02;
                if (i >= 0) {
                    int i2 = bufferInfo2.flags;
                    if ((i2 & 2) == 0) {
                        z2 = true;
                        if ((i2 & 4) == 0) {
                            C25820CmX cmX2 = dHd.A03;
                            cmX2.A0P = true;
                            long j6 = bufferInfo2.presentationTimeUs;
                            long j7 = cmX2.A04;
                            if (j6 <= j7 && !cmX2.A0W) {
                                cmX2.A0W = true;
                                cmX2.A0C = j6 - j7;
                            }
                            if (ck52 != null) {
                                ck52.A00((Object) null, ((double) j6) / ((double) j5));
                            }
                            try {
                                if (dHd.A09) {
                                    int i3 = bufferInfo2.size;
                                    byte[] bArr = dHd.A0A;
                                    int i4 = i3 + 7;
                                    BE6.A1N(bArr, (i4 >> 11) & 3, bArr[3] & 252, 3);
                                    bArr[4] = (byte) ((i4 >> 3) & 255);
                                    bArr[5] = (byte) (((i4 & 7) << 5) | 31);
                                    ByteBuffer byteBuffer = dHd.A06;
                                    C26159CtX.A02(byteBuffer, "Temporary buffers are null");
                                    MediaCodec.BufferInfo bufferInfo3 = dHd.A01;
                                    C26159CtX.A02(bufferInfo3, "Temporary buffers are null");
                                    byteBuffer.clear();
                                    byteBuffer.limit(i4);
                                    byteBuffer.put(bArr);
                                    ByteBuffer BNu = A012.BNu();
                                    C26159CtX.A01(BNu);
                                    BEA.A15(bufferInfo2, BNu);
                                    byteBuffer.put(BNu);
                                    bufferInfo3.set(0, i4, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                                    dHd.A04.CSO(new DH2(i, byteBuffer, bufferInfo3));
                                } else {
                                    dHd.A04.CSO(A012);
                                }
                            } catch (Exception unused2) {
                                cmX2.A07++;
                            }
                            cmX2.A04 = bufferInfo2.presentationTimeUs;
                            cmX2.A08++;
                        }
                        C25265Cc6 cc6 = dHd.A0B.A00;
                        cc6.A07.append("releaseOutputBuffer,");
                        cc6.A04(A012, cc6.A09);
                    }
                } else if (A012.A01) {
                    MediaFormat mediaFormat3 = dHd.A0B.A00.A00;
                    C199610h.A04(mediaFormat3);
                    C26159CtX.A01(mediaFormat3);
                    EAM eam = dHd.A04;
                    eam.CHz(mediaFormat3);
                    eam.start();
                    ByteBuffer byteBuffer2 = mediaFormat3.getByteBuffer("csd-0");
                    C26159CtX.A02(byteBuffer2, "CSD should not be null. Verify encoder was configured properly.");
                    if (dHd.A08) {
                        ByteBuffer byteBuffer3 = dHd.A06;
                        C26159CtX.A02(byteBuffer3, "Temporary buffers are null");
                        MediaCodec.BufferInfo bufferInfo4 = dHd.A01;
                        C26159CtX.A02(bufferInfo4, "Temporary buffers are null");
                        bufferInfo4.set(0, byteBuffer2.limit(), 0, 2);
                        byteBuffer3.clear();
                        byteBuffer3.limit(byteBuffer2.limit());
                        byteBuffer2.position(0);
                        byteBuffer3.put(byteBuffer2);
                        eam.CSO(new DH2(-1, byteBuffer3, bufferInfo4));
                    }
                    if (dHd.A09) {
                        byte[] bArr2 = dHd.A0A;
                        int i5 = (byteBuffer2.get(0) >> 3) & 31;
                        int i6 = ((byteBuffer2.get(0) & 7) << 1) | ((byteBuffer2.get(1) >> 7) & 1);
                        int i7 = (byteBuffer2.get(1) >> 3) & 15;
                        bArr2[0] = -1;
                        bArr2[1] = -15;
                        byte b = (byte) (i5 << 6);
                        bArr2[2] = b;
                        byte b2 = (byte) (b | (i6 << 2));
                        bArr2[2] = b2;
                        BE6.A1N(bArr2, b2, i7 >> 2, 2);
                        bArr2[3] = (byte) ((i7 & 3) << 6);
                        bArr2[4] = 0;
                        bArr2[5] = 0;
                        bArr2[6] = -4;
                    }
                    dHd.A03.A0N = true;
                }
                z2 = false;
                C25265Cc6 cc62 = dHd.A0B.A00;
                cc62.A07.append("releaseOutputBuffer,");
                cc62.A04(A012, cc62.A09);
            }
            Trace.endSection();
            if (z2) {
                break;
            }
        }
        dHd.A04.stop();
        return null;
    }
}
