package X;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: X.Dlj  reason: case insensitive filesystem */
public final class C27807Dlj extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C25527ChP $buffer;
    public final /* synthetic */ C26256Cw0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27807Dlj(C26256Cw0 cw0, C25527ChP chP) {
        super(0);
        this.$buffer = chP;
        this.this$0 = cw0;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C28668EDk eDk;
        int i;
        DSQ dsq;
        C25527ChP chP = this.$buffer;
        C18070vi.A0d(chP, 0);
        ByteBuffer byteBuffer = chP.A00;
        if (byteBuffer != null) {
            C24217BxV bxV = new C24217BxV(byteBuffer);
            int i2 = chP.A01;
            if (i2 == 4117) {
                eDk = (C23627Bmw) C23577Bm6.A05(C23627Bmw.DEFAULT_INSTANCE, bxV);
            } else if (i2 == 4118) {
                eDk = (C23625Bmu) C23577Bm6.A05(C23625Bmu.DEFAULT_INSTANCE, bxV);
            } else if (i2 == 4128) {
                eDk = (C23628Bmx) C23577Bm6.A05(C23628Bmx.DEFAULT_INSTANCE, bxV);
            } else {
                throw C17880vN.A0f("Unsupported message type");
            }
            C18070vi.A0X(eDk);
            C28668EDk eDk2 = eDk;
            if (eDk2 instanceof C23627Bmw) {
                C23627Bmw bmw = (C23627Bmw) eDk2;
                i = 0;
                C18070vi.A0d(bmw, 0);
                dsq = bmw.target_;
            } else if (eDk2 instanceof C23628Bmx) {
                C23628Bmx bmx = (C23628Bmx) eDk2;
                i = 0;
                C18070vi.A0d(bmx, 0);
                dsq = bmx.target_;
            } else {
                if (eDk2 instanceof C23625Bmu) {
                    C25330Cdb.A01("End wifi session", new Object[0]);
                    C22821Di r1 = this.this$0.A03;
                    if (r1 != null) {
                        r1.invoke(new BWF());
                    }
                } else {
                    String A1E = AnonymousClass001.A1E(eDk2, "Unsupported message: ", AnonymousClass000.A10());
                    C18070vi.A0d(A1E, 1);
                    C26294Cx6.A0G("LinkManagerImpl", A1E, Arrays.copyOf(new Object[0], 0));
                }
                return C27621Wu.A00;
            }
            UUID A0v = BEA.A0v(AnonymousClass8BS.A1P(dsq));
            C26256Cw0 cw0 = this.this$0;
            C25330Cdb.A00(AnonymousClass001.A1E(A0v, "Received link switch message to: ", AnonymousClass000.A10()), new Object[i]);
            C24496C6o c6o = (C24496C6o) cw0.A07.get(A0v);
            if (c6o == null) {
                C25330Cdb.A01(AnonymousClass001.A1E(A0v, "Received input link message before link was set to READY: ", AnonymousClass000.A10()), new Object[i]);
                cw0.A05.A09.set(true);
                cw0.A00 = cw0.A04.A03();
            } else {
                C26256Cw0.A06(cw0, new C28046DqL(c6o, cw0));
            }
            return C27621Wu.A00;
        }
        throw C17880vN.A0f("buffer is disposed");
    }
}
