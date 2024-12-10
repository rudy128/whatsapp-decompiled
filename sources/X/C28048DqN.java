package X;

import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.airshield.stream.CipherBuilder;

/* renamed from: X.DqN  reason: case insensitive filesystem */
public final class C28048DqN extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C28668EDk $msg;
    public final /* synthetic */ CipherBuilder $rxCipher;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28048DqN(CipherBuilder cipherBuilder, C28668EDk eDk) {
        super(1);
        this.$rxCipher = cipherBuilder;
        this.$msg = eDk;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CipherBuilder cipherBuilder = (CipherBuilder) obj;
        C18070vi.A0d(cipherBuilder, 0);
        cipherBuilder.setPrivateKey(this.$rxCipher.privateKey);
        cipherBuilder.setChallenge(AnonymousClass8BS.A1P(((C23654BnN) this.$msg).challenge_));
        C24580CAb cAb = PublicKey.Companion;
        byte[] A1P = AnonymousClass8BS.A1P(((C23654BnN) this.$msg).publicKey_);
        PublicKey publicKey = new PublicKey((HybridData) null);
        publicKey.setRaw(A1P);
        cipherBuilder.setRemotePublicKey(publicKey);
        return C27621Wu.A00;
    }
}
