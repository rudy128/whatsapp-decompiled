package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.DHb  reason: case insensitive filesystem */
public class C26870DHb implements EAT {
    public static final ByteBuffer A0K = BEA.A0u(0);
    public int A00;
    public MediaCodec A01;
    public MediaFormat A02;
    public C28609EAd A03;
    public C25578CiI A04;
    public C24896COp A05;
    public ByteBuffer A06;
    public ByteBuffer A07 = A0K;
    public boolean A08;
    public ByteBuffer[] A09;
    public ByteBuffer[] A0A;
    public C24994CSu A0B;
    public final MediaCodec.BufferInfo A0C = new MediaCodec.BufferInfo();
    public final CUT A0D;
    public final E7q A0E;
    public final E55 A0F;
    public final CAM A0G;
    public volatile boolean A0H;
    public volatile boolean A0I;
    public volatile long A0J;

    public C25225CbM BUZ() {
        return null;
    }

    public void CHA(long j) {
        float f;
        float f2 = (float) j;
        C26052CrM crM = this.A0D.A06;
        if (crM != null) {
            C25217CbD cbD = new C25217CbD(crM);
            cbD.A01(C24322BzJ.AUDIO, this.A00);
            f = cbD.A00(TimeUnit.MICROSECONDS, j);
        } else {
            f = 1.0f;
        }
        this.A0J = (long) (f2 * f);
        MediaCodec mediaCodec = this.A01;
        C26159CtX.A01(mediaCodec);
        mediaCodec.flush();
        this.A07 = A0K;
        this.A0I = false;
        this.A08 = false;
        C28609EAd eAd = this.A03;
        C26159CtX.A01(eAd);
        eAd.CHA(this.A0J);
    }

    public void CRW(A5W a5w) {
    }

    public void CS4() {
    }

    public void cancel() {
        this.A0H = true;
    }

    public void start() {
    }

    public void BFX(int i) {
        this.A00 = i;
        ByteBuffer[] byteBufferArr = this.A0B.A04;
        ByteBuffer byteBuffer = byteBufferArr[i];
        if (byteBuffer == null) {
            byteBuffer = BEA.A0u(ZipDecompressor.UNZIP_BUFFER_SIZE);
            byteBufferArr[i] = byteBuffer;
        } else {
            byteBuffer.clear();
        }
        this.A06 = byteBuffer;
        E55 e55 = this.A0F;
        E7q e7q = this.A0E;
        CAM cam = this.A0G;
        CUT cut = this.A0D;
        C28609EAd BGD = e55.BGD(e7q, cam, cut.A08);
        this.A03 = BGD;
        C25327CdY.A01(BGD, cut);
        this.A03.CHF(C24322BzJ.AUDIO, this.A00);
        MediaFormat BYV = this.A03.BYV();
        C26159CtX.A01(BYV);
        String string = BYV.getString("mime");
        C26159CtX.A01(string);
        this.A01 = MediaCodec.createDecoderByType(string);
        if (BYV.containsKey("encoder-delay") && BYV.getInteger("encoder-delay") > 10000) {
            BYV.setInteger("encoder-delay", 0);
        }
        this.A01.configure(BYV, (Surface) null, (MediaCrypto) null, 0);
        this.A01.start();
        this.A09 = this.A01.getInputBuffers();
        this.A0A = this.A01.getOutputBuffers();
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [X.COp, java.lang.Object] */
    public void BI7(long j) {
        C26052CrM crM;
        C25833Cmm A032;
        C25578CiI ciI;
        float f;
        ByteBuffer byteBuffer;
        int i;
        C26159CtX.A01(this.A06);
        this.A06.clear();
        while (this.A06.hasRemaining() && !this.A08) {
            int min = Math.min(this.A06.remaining(), this.A07.remaining());
            if (min <= 0) {
                if (!this.A08) {
                    C26159CtX.A01(this.A01);
                    MediaCodec mediaCodec = this.A01;
                    MediaCodec.BufferInfo bufferInfo = this.A0C;
                    int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 5000);
                    if (dequeueOutputBuffer >= 0) {
                        if ((bufferInfo.flags & 4) != 0) {
                            this.A08 = true;
                            C24896COp cOp = this.A05;
                            if (cOp != null) {
                                Cv0 cv0 = cOp.A00;
                                int i2 = cv0.A00;
                                int i3 = cv0.A05 + ((int) ((((((float) i2) / (cv0.A0E / 1.0f)) + ((float) cv0.A06)) / (cv0.A0D * 1.0f)) + 0.5f));
                                short[] sArr = cv0.A0A;
                                int i4 = cv0.A0I * 2;
                                short[] A042 = Cv0.A04(cv0, sArr, i2, i4 + i2);
                                cv0.A0A = A042;
                                int i5 = 0;
                                while (true) {
                                    int i6 = cv0.A0F;
                                    if (i5 >= i4 * i6) {
                                        break;
                                    }
                                    A042[(i6 * i2) + i5] = 0;
                                    i5++;
                                }
                                cv0.A00 += i4;
                                Cv0.A01(cv0);
                                if (cv0.A05 > i3) {
                                    cv0.A05 = i3;
                                }
                                cv0.A00 = 0;
                                cv0.A09 = 0;
                                cv0.A06 = 0;
                            }
                        } else {
                            ByteBuffer[] byteBufferArr = this.A0A;
                            C26159CtX.A01(byteBufferArr);
                            ByteBuffer byteBuffer2 = byteBufferArr[dequeueOutputBuffer];
                            BEA.A15(bufferInfo, byteBuffer2);
                            C24896COp cOp2 = this.A05;
                            C26159CtX.A01(cOp2);
                            Cv0 cv02 = cOp2.A00;
                            ShortBuffer asShortBuffer = byteBuffer2.asShortBuffer();
                            int remaining = asShortBuffer.remaining();
                            int i7 = cv02.A0F;
                            int i8 = remaining / i7;
                            short[] A043 = Cv0.A04(cv02, cv02.A0A, cv02.A00, i8);
                            cv02.A0A = A043;
                            asShortBuffer.get(A043, cv02.A00 * i7, ((i7 * i8) * 2) / 2);
                            cv02.A00 += i8;
                            Cv0.A01(cv02);
                            C24896COp cOp3 = this.A05;
                            C26159CtX.A01(cOp3);
                            Cv0 cv03 = cOp3.A00;
                            int i9 = cv03.A05 * cv03.A0F * 2;
                            if (i9 > 0) {
                                if (cOp3.A01.capacity() < i9) {
                                    cOp3.A01 = BEA.A0u(i9);
                                } else {
                                    cOp3.A01.clear();
                                }
                                ShortBuffer asShortBuffer2 = cOp3.A01.asShortBuffer();
                                int remaining2 = asShortBuffer2.remaining();
                                int i10 = cv03.A0F;
                                int min2 = Math.min(remaining2 / i10, cv03.A05);
                                asShortBuffer2.put(cv03.A0B, 0, i10 * min2);
                                int i11 = cv03.A05 - min2;
                                cv03.A05 = i11;
                                short[] sArr2 = cv03.A0B;
                                System.arraycopy(sArr2, min2 * i10, sArr2, 0, i11 * i10);
                                cOp3.A01.limit(i9);
                                byteBuffer = cOp3.A01;
                            } else {
                                byteBuffer = C24896COp.A02;
                            }
                            C25578CiI ciI2 = this.A04;
                            if (ciI2 != null) {
                                int position = byteBuffer.position();
                                int limit = byteBuffer.limit();
                                int i12 = ciI2.A03;
                                int i13 = i12 * 2;
                                int i14 = ((limit - position) / i13) * 4;
                                if (ciI2.A01.capacity() < i14) {
                                    ciI2.A01 = BEA.A0u(i14);
                                } else {
                                    ciI2.A01.clear();
                                }
                                ciI2.A02 = ciI2.A01;
                                while (position < limit) {
                                    int i15 = 0;
                                    short s = 0;
                                    for (int i16 = 0; i16 < i12; i16++) {
                                        int i17 = byteBuffer.getShort((i16 * 2) + position);
                                        int i18 = C25578CiI.A04;
                                        int i19 = s + i18;
                                        int i20 = i17 + i18;
                                        if (i19 >= i18 || i20 >= i18) {
                                            i = (((i19 + i20) * 2) - ((i19 * i20) / i18)) - C25578CiI.A05;
                                        } else {
                                            i = (i19 * i20) / i18;
                                        }
                                        int i21 = C25578CiI.A05;
                                        if (i == i21) {
                                            i = i21 - 1;
                                        }
                                        s = (short) (i - i18);
                                    }
                                    do {
                                        ciI2.A02.putShort(s);
                                        i15++;
                                    } while (i15 < 2);
                                    position += i13;
                                }
                                byteBuffer.position(limit);
                                ciI2.A02.flip();
                                C25578CiI ciI3 = this.A04;
                                byteBuffer = ciI3.A02;
                                ciI3.A02 = ciI3.A00;
                            }
                            this.A07 = byteBuffer;
                            this.A01.releaseOutputBuffer(dequeueOutputBuffer, false);
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        this.A0A = this.A01.getOutputBuffers();
                    } else if (dequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.A01.getOutputFormat();
                        this.A02 = outputFormat;
                        C26159CtX.A01(outputFormat);
                        int integer = outputFormat.getInteger("channel-count");
                        if (integer != 2) {
                            ciI = new C25578CiI(integer);
                        } else {
                            ciI = null;
                        }
                        this.A04 = ciI;
                        MediaFormat mediaFormat = this.A02;
                        C26159CtX.A01(mediaFormat);
                        int integer2 = mediaFormat.getInteger("sample-rate");
                        MediaFormat mediaFormat2 = this.A02;
                        C26159CtX.A01(mediaFormat2);
                        int integer3 = mediaFormat2.getInteger("channel-count");
                        CUT cut = this.A0D;
                        ByteBuffer byteBuffer3 = C24896COp.A02;
                        C26052CrM crM2 = cut.A06;
                        if (crM2 != null) {
                            C25217CbD cbD = new C25217CbD(crM2);
                            C24322BzJ bzJ = C24322BzJ.AUDIO;
                            cbD.A01(bzJ, this.A00);
                            f = cbD.A00(TimeUnit.MICROSECONDS, 0);
                            C25833Cmm A033 = crM2.A03(bzJ, this.A00);
                            if (A033 != null) {
                                Iterator it = A033.A05.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                }
                            }
                        } else {
                            f = 1.0f;
                        }
                        ? obj = new Object();
                        obj.A01 = C24896COp.A02;
                        obj.A00 = new Cv0(integer2, integer3, f);
                        this.A05 = obj;
                    }
                }
                while (true) {
                    if (this.A0I || this.A0H) {
                        break;
                    }
                    C26159CtX.A01(this.A01);
                    C26159CtX.A01(this.A03);
                    int dequeueInputBuffer = this.A01.dequeueInputBuffer(0);
                    if (dequeueInputBuffer < 0) {
                        break;
                    }
                    ByteBuffer[] byteBufferArr2 = this.A09;
                    C26159CtX.A01(byteBufferArr2);
                    int CDT = this.A03.CDT(byteBufferArr2[dequeueInputBuffer]);
                    if (CDT <= 0) {
                        this.A01.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                        this.A0I = true;
                        break;
                    }
                    this.A01.queueInputBuffer(dequeueInputBuffer, 0, CDT, this.A03.BYW(), this.A03.BYU());
                    this.A03.BBv();
                }
            } else {
                ByteBuffer duplicate = this.A07.duplicate();
                duplicate.limit(duplicate.position() + min);
                this.A06.put(duplicate);
                BE8.A1G(this.A07, min);
            }
        }
        if (!(this.A05 == null || (crM = this.A0D.A06) == null || (A032 = crM.A03(C24322BzJ.AUDIO, this.A00)) == null)) {
            Iterator it2 = A032.A05.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        while (true) {
            int position2 = this.A06.position();
            int limit2 = this.A06.limit();
            ByteBuffer byteBuffer4 = this.A06;
            if (position2 < limit2) {
                byteBuffer4.put((byte) 0);
            } else {
                byteBuffer4.flip();
                return;
            }
        }
    }

    public boolean BeS() {
        return this.A08;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Cjg, java.lang.Object] */
    public void release() {
        ? obj = new Object();
        C25635CjM.A01(obj, this.A01, 6);
        C25635CjM.A01(obj, this.A03, 4);
        Throwable th = obj.A01;
        if (th == null) {
            this.A06 = null;
            this.A01 = null;
            return;
        }
        throw th;
    }

    public C26870DHb(C24994CSu cSu, E7q e7q, E55 e55, CAM cam, CUT cut) {
        this.A0D = cut;
        this.A0B = cSu;
        this.A0F = e55;
        this.A0E = e7q;
        this.A0G = cam;
    }

    public long BI6() {
        throw C17880vN.A0y();
    }

    public long BQJ() {
        throw C17880vN.A0y();
    }
}
