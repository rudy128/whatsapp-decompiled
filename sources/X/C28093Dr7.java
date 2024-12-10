package X;

import com.facebook.wearable.airshield.stream.CipherBuilder;
import com.facebook.wearable.datax.RemoteChannel;

/* renamed from: X.Dr7  reason: case insensitive filesystem */
public final class C28093Dr7 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $base;
    public final /* synthetic */ RemoteChannel $channel;
    public final /* synthetic */ boolean $hkdf;
    public final /* synthetic */ CipherBuilder $txCipher;
    public final /* synthetic */ C26876DHi $txTransformer;
    public final /* synthetic */ C26193CuL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28093Dr7(CipherBuilder cipherBuilder, C26876DHi dHi, C26193CuL cuL, RemoteChannel remoteChannel, int i, boolean z) {
        super(1);
        this.this$0 = cuL;
        this.$channel = remoteChannel;
        this.$txCipher = cipherBuilder;
        this.$base = i;
        this.$hkdf = z;
        this.$txTransformer = dHi;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C26193CuL cuL = this.this$0;
        RemoteChannel remoteChannel = this.$channel;
        C26193CuL.A01(cuL, new C27851Dmm(this.$txCipher, this.$txTransformer, cuL, remoteChannel, this.$base, this.$hkdf));
        return C25792Cm4.A08;
    }
}
