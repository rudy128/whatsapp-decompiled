package X;

import com.facebook.wearable.airshield.security.InitializationVector;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.airshield.stream.CipherBuilder;
import com.facebook.wearable.datax.RemoteChannel;

/* renamed from: X.Dmm  reason: case insensitive filesystem */
public final class C27851Dmm extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ int $base;
    public final /* synthetic */ RemoteChannel $channel;
    public final /* synthetic */ boolean $hkdf;
    public final /* synthetic */ CipherBuilder $txCipher;
    public final /* synthetic */ C26876DHi $txTransformer;
    public final /* synthetic */ C26193CuL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27851Dmm(CipherBuilder cipherBuilder, C26876DHi dHi, C26193CuL cuL, RemoteChannel remoteChannel, int i, boolean z) {
        super(0);
        this.$channel = remoteChannel;
        this.$txCipher = cipherBuilder;
        this.$base = i;
        this.$hkdf = z;
        this.this$0 = cuL;
        this.$txTransformer = dHi;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i = this.$base;
        CipherBuilder cipherBuilder = this.$txCipher;
        boolean z = this.$hkdf;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("----------------------------------------------");
        A10.append(10);
        A10.append("Enable encryption:");
        StringBuilder A0j = BE8.A0j(A10);
        A0j.append("base: ");
        BEA.A1L(String.valueOf(BE7.A0C(i)), A0j, A10);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("seed: ");
        byte[] bArr = cipherBuilder.seed;
        C28140Dry dry = C28140Dry.A00;
        C108985cd.A1L(C200410p.A0J(dry, bArr), A102, A10);
        StringBuilder A0j2 = BE8.A0j(A10);
        A0j2.append("initialization vector: ");
        C108985cd.A1L(C200410p.A0J(dry, cipherBuilder.initializationVector.toByteArray()), A0j2, A10);
        StringBuilder A0j3 = BE8.A0j(A10);
        A0j3.append("challenge: ");
        C108985cd.A1L(C200410p.A0J(dry, cipherBuilder.challenge), A0j3, A10);
        A10.append(C17900vP.A0D("hkdf: ", BE8.A0j(A10), z));
        StringBuilder A0j4 = BE8.A0j(A10);
        A0j4.append("public key: ");
        PublicKey publicKey = cipherBuilder.remotePublicKey;
        if (publicKey != null) {
            C108985cd.A1L(C200410p.A0J(dry, publicKey.serialize()), A0j4, A10);
            StringBuilder A0j5 = BE8.A0j(A10);
            A0j5.append("TX generated challenge: ");
            C108985cd.A1L(C200410p.A0J(dry, cipherBuilder.buildTxChallenge().toByteArray()), A0j5, A10);
            A10.append(10);
            C26294Cx6.A06("LinkSetup", C18070vi.A0H(A10));
            RemoteChannel remoteChannel = this.$channel;
            byte[] serialize = this.$txCipher.privateKey.recoverPublicKey().serialize();
            CipherBuilder cipherBuilder2 = this.$txCipher;
            byte[] bArr2 = cipherBuilder2.seed;
            InitializationVector initializationVector = cipherBuilder2.initializationVector;
            int i2 = this.$base;
            boolean z2 = this.$hkdf;
            C18070vi.A0n(serialize, bArr2, initializationVector);
            C23624Bmt A0N = C23653BnM.DEFAULT_INSTANCE.A0N();
            ((C23653BnM) A0N.A00).publicKey_ = C17900vP.A03(A0N, serialize);
            ((C23653BnM) A0N.A00).seed_ = C17900vP.A03(A0N, bArr2);
            ((C23653BnM) A0N.A00).iv_ = C17900vP.A03(A0N, initializationVector.toByteArray());
            ((C23653BnM) C17880vN.A0G(A0N)).base_ = i2;
            ((C23653BnM) C17880vN.A0G(A0N)).parameters_ = z2 ? 1 : 0;
            remoteChannel.send(C24590CAl.A00(A0N.A0C(), 2));
            C26149CtE ctE = this.this$0.A05;
            C26876DHi dHi = this.$txTransformer;
            synchronized (ctE.A09) {
                CRW crw = ctE.A01;
                if (crw != null) {
                    crw.A00 = dHi;
                }
            }
            C26193CuL.A03(this.this$0, new C27946Doi(this.$txTransformer));
            C26193CuL.A02(this.this$0, new C27947Doj(this.$txCipher));
            return C27621Wu.A00;
        }
        throw C17880vN.A0g();
    }
}
