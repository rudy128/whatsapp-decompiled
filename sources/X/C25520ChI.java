package X;

import android.media.MediaCodec;

/* renamed from: X.ChI  reason: case insensitive filesystem */
public final class C25520ChI {
    public final MediaCodec.CryptoInfo.Pattern A00 = new MediaCodec.CryptoInfo.Pattern(0, 0);
    public final MediaCodec.CryptoInfo A01;

    public static /* synthetic */ void A00(C25520ChI chI, int i, int i2) {
        MediaCodec.CryptoInfo.Pattern pattern = chI.A00;
        pattern.set(i, i2);
        chI.A01.setPattern(pattern);
    }

    public /* synthetic */ C25520ChI(MediaCodec.CryptoInfo cryptoInfo) {
        this.A01 = cryptoInfo;
    }
}
