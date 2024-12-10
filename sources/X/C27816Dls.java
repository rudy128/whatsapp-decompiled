package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Dls  reason: case insensitive filesystem */
public final class C27816Dls extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24426C3b $obj;
    public final /* synthetic */ BXN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27816Dls(BXN bxn, C24426C3b c3b) {
        super(0);
        this.this$0 = bxn;
        this.$obj = c3b;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BQm bQm;
        C6B A01;
        BG4 bg4;
        BXN bxn = this.this$0;
        bxn.A00 = null;
        C24426C3b c3b = this.$obj;
        boolean z = true;
        if (c3b instanceof BXR) {
            if (C18070vi.A18(((BXR) c3b).A00, bxn.A01.A08())) {
                this.this$0.A03.set(0);
                bQm = this.this$0.A01;
                A01 = bQm.A07();
            }
            z = false;
            return Boolean.valueOf(z);
        } else if (c3b instanceof C22957BXd) {
            AtomicInteger atomicInteger = bxn.A03;
            if (atomicInteger.incrementAndGet() < 1) {
                bQm = bxn.A01;
                A01 = bQm.A08();
            } else {
                C25845Cn1 cn1 = C24712CGy.A01;
                cn1.A06("sup:SNAppManagerStateDelegate", "[SN_APP_MANAGER] Reached 1 connection attempts!", (Throwable) null);
                atomicInteger.set(0);
                BQm bQm2 = bxn.A01;
                CL7 cl7 = bQm2.A00.A03;
                cn1.A02("sup:DeviceStreamingStatus", AnonymousClass001.A1E(false, "Updating Streaming active state to ", AnonymousClass000.A10()));
                cl7.A00.setValue(false);
                A01 = bQm2.A09();
                bg4 = bQm2.A00;
                bg4.A03 = A01;
                return Boolean.valueOf(z);
            }
        } else if ((c3b instanceof BXQ) || (c3b instanceof BXX)) {
            bxn.A03.set(0);
            bQm = this.this$0.A01;
            A01 = BQm.A01(bQm);
        } else {
            bxn.A03.set(0);
            z = false;
            return Boolean.valueOf(z);
        }
        bg4 = bQm.A00;
        bg4.A03 = A01;
        return Boolean.valueOf(z);
    }
}
