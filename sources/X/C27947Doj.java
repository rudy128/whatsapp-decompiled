package X;

import com.facebook.wearable.airshield.stream.CipherBuilder;

/* renamed from: X.Doj  reason: case insensitive filesystem */
public final class C27947Doj extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CipherBuilder $txCipher;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27947Doj(CipherBuilder cipherBuilder) {
        super(1);
        this.$txCipher = cipherBuilder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        BTU btu = (BTU) obj;
        C18070vi.A0d(btu, 0);
        btu.A01 = this.$txCipher.buildTxChallenge();
        return C27621Wu.A00;
    }
}
