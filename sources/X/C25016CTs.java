package X;

import android.media.MediaCodec;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.CTs  reason: case insensitive filesystem */
public final class C25016CTs {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public byte[] A04;
    public byte[] A05;
    public int[] A06;
    public int[] A07;
    public final MediaCodec.CryptoInfo A08;
    public final C25520ChI A09;

    public C25016CTs() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.A08 = cryptoInfo;
        this.A09 = Util.A00 >= 24 ? new C25520ChI(cryptoInfo) : null;
    }
}
