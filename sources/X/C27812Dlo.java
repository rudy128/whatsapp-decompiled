package X;

import com.facebook.wearable.datax.LocalChannel;

/* renamed from: X.Dlo  reason: case insensitive filesystem */
public final class C27812Dlo extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24426C3b $obj;
    public final /* synthetic */ BXO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27812Dlo(BXO bxo, C24426C3b c3b) {
        super(0);
        this.$obj = c3b;
        this.this$0 = bxo;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BQm bQm;
        C25522ChK chK;
        EEE[] eeeArr;
        int i;
        C6B A08;
        C24426C3b c3b = this.$obj;
        boolean z = false;
        if (c3b instanceof BXR) {
            if (C18070vi.A18(((BXR) c3b).A00, this.this$0.A00.A07())) {
                bQm = this.this$0.A00;
                if (bQm.A00.A06.intValue() == 0) {
                    chK = bQm.A03;
                    eeeArr = BQm.A0R;
                    i = 7;
                } else {
                    chK = bQm.A02;
                    eeeArr = BQm.A0R;
                    i = 6;
                }
            }
            return Boolean.valueOf(z);
        } else if (c3b instanceof BXQ) {
            boolean A18 = C18070vi.A18(((BXQ) c3b).A00.A00(), "SOCKET_CONNECTION_DEVICE_LINKAGE_ERROR");
            bQm = this.this$0.A00;
            if (A18) {
                A08 = BQm.A01(bQm);
            } else {
                A08 = bQm.A08();
            }
            bQm.A00.A03 = A08;
            z = true;
            return Boolean.valueOf(z);
        } else if (c3b instanceof BXT) {
            BXO bxo = this.this$0;
            BXT bxt = (BXT) c3b;
            C18070vi.A0d(bxt, 0);
            LocalChannel localChannel = bxo.A00.A00.A02;
            if (localChannel != null) {
                C23624Bmt A0N = C23645BnE.DEFAULT_INSTANCE.A0N();
                C24378C0x[] values = C24378C0x.values();
                BTC btc = bxt.A00;
                ((C23645BnE) C17880vN.A0G(A0N)).type_ = values[btc.A01].BVW();
                ((C23645BnE) C17880vN.A0G(A0N)).status_ = C24380C0z.values()[btc.A00].BVW();
                ((C23645BnE) C17880vN.A0G(A0N)).level_ = btc.A02;
                DND.A08(localChannel, A0N, 21);
            }
            z = true;
            return Boolean.valueOf(z);
        } else {
            if (c3b instanceof BXX) {
                bQm = this.this$0.A00;
                chK = bQm.A04;
                eeeArr = BQm.A0R;
                i = 1;
            }
            return Boolean.valueOf(z);
        }
        A08 = C25522ChK.A00(chK, bQm, eeeArr, i);
        bQm.A00.A03 = A08;
        z = true;
        return Boolean.valueOf(z);
    }
}
