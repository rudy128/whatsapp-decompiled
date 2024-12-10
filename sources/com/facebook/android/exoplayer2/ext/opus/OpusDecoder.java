package com.facebook.android.exoplayer2.ext.opus;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.BOQ;
import X.BOY;
import X.C22765BOc;
import X.C24392C1n;
import X.C26056CrS;
import X.C26667D8q;
import X.C2C;
import com.facebook.android.exoplayer2.decoder.SimpleOutputBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

public final class OpusDecoder extends C26667D8q {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;

    private native void opusClose(long j);

    private native int opusDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleOutputBuffer simpleOutputBuffer);

    private native int opusGetErrorCode(long j);

    private native String opusGetErrorMessage(long j);

    private native long opusInit(int i, int i2, int i3, int i4, int i5, byte[] bArr);

    private native void opusReset(long j);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpusDecoder(List list, int i) {
        super(new C22765BOc[16], new SimpleOutputBuffer[16]);
        byte b;
        boolean z;
        int i2;
        List list2 = list;
        byte[] bArr = (byte[]) list2.get(0);
        int length = bArr.length;
        if (length >= 19) {
            byte b2 = bArr[9] & 255;
            this.A01 = b2;
            if (b2 <= 8) {
                byte b3 = ((bArr[11] & 255) << 8) | (bArr[10] & 255);
                byte b4 = ((bArr[17] & 255) << 8) | (bArr[16] & 255);
                byte[] bArr2 = new byte[8];
                if (bArr[18] == 0) {
                    if (b2 <= 2) {
                        z = AnonymousClass000.A1T(b2, 2);
                        bArr2[0] = 0;
                        bArr2[1] = 1;
                        b = 1;
                    } else {
                        throw new BOQ("Invalid Header, missing stream map.");
                    }
                } else if (length >= b2 + 21) {
                    b = bArr[19] & 255;
                    z = bArr[20] & true;
                    System.arraycopy(bArr, 21, bArr2, 0, b2);
                } else {
                    throw new BOQ("Header size is too small.");
                }
                if (list2.size() != 3) {
                    this.A03 = b3;
                    i2 = 3840;
                } else if (((byte[]) list2.get(1)).length == 8 && ((byte[]) list2.get(2)).length == 8) {
                    long j = ByteBuffer.wrap((byte[]) list2.get(1)).order(ByteOrder.nativeOrder()).getLong();
                    long j2 = ByteBuffer.wrap((byte[]) list2.get(2)).order(ByteOrder.nativeOrder()).getLong();
                    this.A03 = (int) ((j * 48000) / 1000000000);
                    i2 = (int) ((j2 * 48000) / 1000000000);
                } else {
                    throw new BOQ("Invalid Codec Delay or Seek Preroll");
                }
                this.A02 = i2;
                long opusInit = opusInit(48000, b2, b, z ? 1 : 0, b4, bArr2);
                this.A04 = opusInit;
                if (opusInit != 0) {
                    int i3 = this.A00;
                    C26056CrS.A03(AnonymousClass000.A1T(i3, r2));
                    for (C22765BOc A002 : this.A0A) {
                        A002.A00(i);
                    }
                    return;
                }
                throw new BOQ("Failed to initialize decoder");
            }
            throw new BOQ(AnonymousClass001.A1I("Invalid channel count: ", AnonymousClass000.A10(), b2));
        }
        throw new BOQ("Header size is too small.");
    }

    public /* bridge */ /* synthetic */ C2C A01(C22765BOc bOc, BOY boy, boolean z) {
        int i;
        SimpleOutputBuffer simpleOutputBuffer = (SimpleOutputBuffer) boy;
        if (z) {
            opusReset(this.A04);
            if (bOc.A00 == 0) {
                i = this.A03;
            } else {
                i = this.A02;
            }
            this.A00 = i;
        }
        ByteBuffer byteBuffer = bOc.A01;
        if (!AnonymousClass000.A1T(bOc.A00 & 1073741824, 1073741824)) {
            int opusDecode = opusDecode(this.A04, bOc.A00, byteBuffer, byteBuffer.limit(), simpleOutputBuffer);
            if (opusDecode >= 0) {
                ByteBuffer byteBuffer2 = simpleOutputBuffer.data;
                byteBuffer2.position(0);
                byteBuffer2.limit(opusDecode);
                int i2 = this.A00;
                if (i2 <= 0) {
                    return null;
                }
                int i3 = this.A01 * 2;
                int i4 = i2 * i3;
                if (opusDecode <= i4) {
                    this.A00 = i2 - (opusDecode / i3);
                    simpleOutputBuffer.A00 = Integer.MIN_VALUE | simpleOutputBuffer.A00;
                    byteBuffer2.position(opusDecode);
                    return null;
                }
                this.A00 = 0;
                byteBuffer2.position(i4);
                return null;
            } else if (opusDecode != -2) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Decode error: ");
                return new BOQ(AnonymousClass000.A0y(opusGetErrorMessage((long) opusDecode), A10));
            }
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("Drm error: ");
        long j = this.A04;
        String A0y = AnonymousClass000.A0y(opusGetErrorMessage(j), A102);
        return new BOQ(A0y, new C24392C1n(opusGetErrorCode(j), A0y));
    }

    public String getName() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("libopus");
        return AnonymousClass000.A0y(OpusLibrary.opusGetVersion(), A10);
    }

    public void release() {
        super.release();
        opusClose(this.A04);
    }
}
