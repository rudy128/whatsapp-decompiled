package X;

import com.facebook.wearable.datax.LocalChannel;

public final class BXM extends C22812BQn {
    public final BQm A00;

    public static final void A00(BXM bxm) {
        C25258Cbx cbx = bxm.A00.A00;
        LocalChannel localChannel = cbx.A02;
        if (localChannel != null) {
            C23624Bmt A0N = C23633Bn2.DEFAULT_INSTANCE.A0N();
            ((C23633Bn2) C17880vN.A0G(A0N)).nonce_ = cbx.A00();
            ((C23633Bn2) C17880vN.A0G(A0N)).action_ = C0u.CONTROL_STREAM_ACTION_STOP.BVW();
            DND.A08(localChannel, A0N, 7);
        }
    }

    public void A07() {
        this.A00.A0F(new C27547DhE(this));
    }

    public void A08() {
        this.A00.A0F(new C27548DhF(this));
    }

    public BXM(BQm bQm) {
        super(bQm);
        this.A00 = bQm;
    }
}
