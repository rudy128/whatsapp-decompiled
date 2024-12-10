package X;

import java.math.BigInteger;

/* renamed from: X.Dfx  reason: case insensitive filesystem */
public final class C27468Dfx extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ DSG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27468Dfx(DSG dsg) {
        super(0);
        this.this$0 = dsg;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return BigInteger.valueOf((long) this.this$0.A00).shiftLeft(32).or(BigInteger.valueOf((long) this.this$0.A01)).shiftLeft(32).or(BigInteger.valueOf((long) this.this$0.A02));
    }
}
