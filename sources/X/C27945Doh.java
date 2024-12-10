package X;

import com.facebook.wearable.airshield.stream.CipherBuilder;

/* renamed from: X.Doh  reason: case insensitive filesystem */
public final class C27945Doh extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CipherBuilder $rxCipher;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27945Doh(CipherBuilder cipherBuilder) {
        super(1);
        this.$rxCipher = cipherBuilder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        BTU btu = (BTU) obj;
        C18070vi.A0d(btu, 0);
        btu.A00 = this.$rxCipher.buildRxChallenge();
        return C27621Wu.A00;
    }
}
