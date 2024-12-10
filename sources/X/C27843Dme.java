package X;

import com.facebook.wearable.airshield.stream.CipherBuilder;
import com.facebook.wearable.datax.RemoteChannel;
import java.nio.ByteBuffer;

/* renamed from: X.Dme  reason: case insensitive filesystem */
public final class C27843Dme extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C25527ChP $buffer;
    public final /* synthetic */ RemoteChannel $channel;
    public final /* synthetic */ C26193CuL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27843Dme(C26193CuL cuL, RemoteChannel remoteChannel, C25527ChP chP) {
        super(0);
        this.this$0 = cuL;
        this.$buffer = chP;
        this.$channel = remoteChannel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C28668EDk eDk;
        C25118CYr cYr = this.this$0.A04;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Receiving message on service: ");
        cYr.A01(new CVm(AnonymousClass000.A0y(CCT.A00(CCS.A00(this.$buffer.A01)), A10)));
        C25527ChP chP = this.$buffer;
        C18070vi.A0d(chP, 0);
        ByteBuffer byteBuffer = chP.A00;
        if (byteBuffer != null) {
            C24217BxV bxV = new C24217BxV(byteBuffer);
            int i = chP.A01;
            if (i == 1) {
                eDk = (C23654BnN) C23577Bm6.A05(C23654BnN.DEFAULT_INSTANCE, bxV);
            } else if (i == 4096) {
                eDk = (C23652BnL) C23577Bm6.A05(C23652BnL.DEFAULT_INSTANCE, bxV);
            } else {
                throw C17880vN.A0f("Unsupported message type");
            }
            C18070vi.A0X(eDk);
            C28668EDk eDk2 = eDk;
            if (eDk2 instanceof C23654BnN) {
                CipherBuilder A00 = C26193CuL.A00(this.this$0);
                int A04 = C28851b7.A04(AnonymousClass1JU.A00, new C25411Oc(0, Integer.MAX_VALUE));
                boolean A1T = AnonymousClass000.A1T(((C23654BnN) eDk2).supportedParameters_ & 1, 1);
                C28048DqN dqN = new C28048DqN(A00, eDk2);
                CipherBuilder cipherBuilder = new CipherBuilder();
                dqN.invoke(cipherBuilder);
                C26876DHi dHi = new C26876DHi(cipherBuilder.buildEncryptionFraming(A04, A1T));
                C26193CuL cuL = this.this$0;
                cuL.A05.A08(new C28093Dr7(cipherBuilder, dHi, cuL, this.$channel, A04, A1T));
            } else if (eDk2 instanceof C23652BnL) {
                C26294Cx6.A06("LinkSetup", AnonymousClass001.A1E(eDk2, "Received EndLinkSetup: ", AnonymousClass000.A10()));
                this.this$0.A09.interruptWithError(C24708CGu.A00);
                C26193CuL.A03(this.this$0, new C27948Dok(eDk2));
            } else {
                throw C17880vN.A0f("Unsupported message");
            }
            return C27621Wu.A00;
        }
        throw C17880vN.A0f("buffer is disposed");
    }
}
