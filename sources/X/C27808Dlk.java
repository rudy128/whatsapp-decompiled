package X;

import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.security.InitializationVector;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.airshield.stream.CipherBuilder;
import java.nio.ByteBuffer;

/* renamed from: X.Dlk  reason: case insensitive filesystem */
public final class C27808Dlk extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C25527ChP $buffer;
    public final /* synthetic */ C26193CuL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27808Dlk(C26193CuL cuL, C25527ChP chP) {
        super(0);
        this.this$0 = cuL;
        this.$buffer = chP;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        try {
            C25118CYr cYr = this.this$0.A04;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Receiving message on service: ");
            cYr.A01(new CVm(AnonymousClass000.A0y(CCT.A00(CCS.A00(this.$buffer.A01)), A10)));
        } catch (IllegalStateException unused) {
        }
        C25527ChP chP = this.$buffer;
        C18070vi.A0d(chP, 0);
        ByteBuffer byteBuffer = chP.A00;
        if (byteBuffer != null) {
            C24217BxV bxV = new C24217BxV(byteBuffer);
            if (chP.A01 == 2) {
                C23653BnM bnM = (C23653BnM) C23577Bm6.A05(C23653BnM.DEFAULT_INSTANCE, bxV);
                C18070vi.A0X(bnM);
                CipherBuilder A00 = C26193CuL.A00(this.this$0);
                C24580CAb cAb = PublicKey.Companion;
                byte[] A1P = AnonymousClass8BS.A1P(bnM.publicKey_);
                PublicKey publicKey = new PublicKey((HybridData) null);
                publicKey.setRaw(A1P);
                A00.setRemotePublicKey(publicKey);
                CAZ caz = InitializationVector.Companion;
                byte[] A1P2 = AnonymousClass8BS.A1P(bnM.iv_);
                InitializationVector initializationVector = new InitializationVector();
                initializationVector.setRaw(A1P2);
                A00.setInitializationVector(initializationVector);
                A00.setSeed(AnonymousClass8BS.A1P(bnM.seed_));
                boolean A1Q = BE9.A1Q(bnM.parameters_);
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("----------------------------------------------");
                A102.append(10);
                A102.append("Enable decryption:");
                StringBuilder A0j = BE8.A0j(A102);
                A0j.append("base: ");
                BEA.A1L(String.valueOf(BE7.A0C(bnM.base_)), A0j, A102);
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("seed: ");
                byte[] bArr = A00.seed;
                C28140Dry dry = C28140Dry.A00;
                C108985cd.A1L(C200410p.A0J(dry, bArr), A103, A102);
                StringBuilder A0j2 = BE8.A0j(A102);
                A0j2.append("initialization vector: ");
                C108985cd.A1L(C200410p.A0J(dry, A00.initializationVector.toByteArray()), A0j2, A102);
                StringBuilder A0j3 = BE8.A0j(A102);
                A0j3.append("challenge: ");
                C108985cd.A1L(C200410p.A0J(dry, A00.challenge), A0j3, A102);
                A102.append(C17900vP.A0D("hkdf: ", BE8.A0j(A102), A1Q));
                StringBuilder A0j4 = BE8.A0j(A102);
                A0j4.append("public key: ");
                PublicKey publicKey2 = A00.remotePublicKey;
                if (publicKey2 != null) {
                    C108985cd.A1L(C200410p.A0J(dry, publicKey2.serialize()), A0j4, A102);
                    StringBuilder A0j5 = BE8.A0j(A102);
                    A0j5.append("RX generated challenge: ");
                    C108985cd.A1L(C200410p.A0J(dry, A00.buildRxChallenge().toByteArray()), A0j5, A102);
                    A102.append(10);
                    C26294Cx6.A06("LinkSetup", C18070vi.A0H(A102));
                    C26875DHh dHh = new C26875DHh(A00.buildDecryptionFraming(bnM.base_, A1Q));
                    this.this$0.A09.interruptWithError(C24708CGu.A01);
                    C26149CtE ctE = this.this$0.A05;
                    synchronized (ctE.A09) {
                        CSY csy = ctE.A00;
                        if (csy != null) {
                            csy.A00 = dHh;
                        }
                    }
                    C26193CuL.A03(this.this$0, new C27944Dog(dHh));
                    C26193CuL.A02(this.this$0, new C27945Doh(A00));
                    return C27621Wu.A00;
                }
                throw C17880vN.A0g();
            }
            throw C17880vN.A0f("Unsupported message type");
        }
        throw C17880vN.A0f("buffer is disposed");
    }
}
