package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: X.CTc  reason: case insensitive filesystem */
public final class C25002CTc {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final MediaCodec.BufferInfo A04;
    public final ByteBuffer A05;
    public final boolean A06;
    public final boolean A07;

    public C25002CTc(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer, int i, int i2, long j, boolean z, boolean z2) {
        this.A05 = byteBuffer;
        this.A01 = i;
        this.A02 = i2;
        this.A07 = z;
        this.A06 = z2;
        this.A03 = j;
        this.A04 = bufferInfo;
        boolean A1O = AnonymousClass000.A1O(z ? 1 : 0);
        this.A00 = z2 ? A1O | true : A1O ? 1 : 0;
    }
}
