package X;

import com.facebook.wearable.datax.LocalChannel;

/* renamed from: X.Dll  reason: case insensitive filesystem */
public final class C27809Dll extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24426C3b $obj;
    public final /* synthetic */ BXE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27809Dll(BXE bxe, C24426C3b c3b) {
        super(0);
        this.$obj = c3b;
        this.this$0 = bxe;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BQm bQm;
        C6B A01;
        C24377C0w c0w;
        C24426C3b c3b = this.$obj;
        boolean z = true;
        if (c3b instanceof BXV) {
            BXE bxe = this.this$0;
            BXV bxv = (BXV) c3b;
            int i = bxv.A00;
            if (i == 0) {
                c0w = C24377C0w.APPLICATION_TYPE_FACEBOOK;
            } else if (i != 1) {
                c0w = C24377C0w.APPLICATION_TYPE_UNKNOWN;
            } else {
                c0w = C24377C0w.APPLICATION_TYPE_INSTAGRAM;
            }
            C25845Cn1 cn1 = C24712CGy.A01;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("[IDLE]: Sending Session Settings ApplicationType ");
            A10.append(c0w);
            A10.append(" Doff ");
            int i2 = bxv.A01;
            A10.append(i2);
            A10.append(" and Inactivity Timer ");
            int i3 = bxv.A02;
            A10.append(i3);
            A10.append(" and Bypass Don Check ");
            boolean z2 = bxv.A03;
            cn1.A02("sup:IdleStateDelegate", AnonymousClass3MY.A0r(A10, z2));
            C25258Cbx cbx = bxe.A00.A00;
            C23624Bmt A0N = C165748bh.DEFAULT_INSTANCE.A0N();
            C23624Bmt A0N2 = C164248Yc.DEFAULT_INSTANCE.A0N();
            ((C164248Yc) C17880vN.A0G(A0N2)).doffTimerSec_ = i2;
            ((C164248Yc) C17880vN.A0G(A0N2)).inactivityTimerSec_ = i3;
            C164248Yc r1 = (C164248Yc) A0N2.A0C();
            r1.getClass();
            ((C165748bh) C17880vN.A0G(A0N)).timerSettings_ = r1;
            ((C165748bh) C17880vN.A0G(A0N)).applicationType_ = c0w.BVW();
            C23624Bmt A0N3 = C23648BnH.DEFAULT_INSTANCE.A0N();
            ((C23648BnH) C17880vN.A0G(A0N3)).bypassDonCheck_ = z2;
            ((C23648BnH) C17880vN.A0G(A0N3)).mediaBatchingIntervalMs_ = 75;
            ((C23648BnH) C17880vN.A0G(A0N3)).allowOcrStreaming_ = false;
            C23648BnH bnH = (C23648BnH) A0N3.A0C();
            bnH.getClass();
            ((C165748bh) C17880vN.A0G(A0N)).overrideSettings_ = bnH;
            LocalChannel localChannel = cbx.A02;
            if (localChannel != null) {
                DND.A08(localChannel, A0N, 27);
            }
        } else if (c3b instanceof BXP) {
            this.this$0.A00.A0D((BXP) c3b);
        } else if (c3b instanceof C22954BXa) {
            BXE bxe2 = this.this$0;
            BQm bQm2 = bxe2.A00;
            C25838Cms cms = bQm2.A0J;
            if (cms != null) {
                cms.A03("request_media_stream_start");
            }
            C25258Cbx cbx2 = bQm2.A00;
            int A00 = cbx2.A00();
            cbx2.A0F.put(Integer.valueOf(A00), new C27951Don(bxe2));
            C24712CGy.A01.A02("sup:IdleStateDelegate", "[IDLE]: Sending ControlStreamRequest Start");
            LocalChannel localChannel2 = cbx2.A02;
            if (localChannel2 != null) {
                C23624Bmt A0N4 = C23633Bn2.DEFAULT_INSTANCE.A0N();
                ((C23633Bn2) C17880vN.A0G(A0N4)).nonce_ = A00;
                ((C23633Bn2) C17880vN.A0G(A0N4)).action_ = C0u.CONTROL_STREAM_ACTION_START.BVW();
                DND.A08(localChannel2, A0N4, 7);
            }
        } else {
            if (c3b instanceof C22956BXc) {
                bQm = this.this$0.A00;
                A01 = bQm.A0A();
            } else if (!(c3b instanceof C22955BXb)) {
                if (c3b instanceof BXU) {
                    if (!C18070vi.A18(((BXU) c3b).A00.A00(), "LIVE_STREAM_START_DOFF_ERROR")) {
                        bQm = this.this$0.A00;
                        A01 = C25522ChK.A00(bQm.A04, bQm, BQm.A0R, 1);
                    }
                } else if (c3b instanceof BXX) {
                    bQm = this.this$0.A00;
                    A01 = BQm.A01(bQm);
                } else if (c3b instanceof BXS) {
                    this.this$0.A00.A0E((BXS) c3b);
                } else {
                    z = false;
                }
            }
            bQm.A00.A03 = A01;
        }
        return Boolean.valueOf(z);
    }
}
