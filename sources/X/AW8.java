package X;

import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import com.whatsapp.migration.transfer.ui.P2pTransferViewModel;

public final class AW8 implements C22561BCu, B8H, BDJ {
    public final /* synthetic */ ChatTransferViewModel A00;
    public final /* synthetic */ P2pTransferViewModel A01;

    public void Bno() {
    }

    public void Bnp() {
    }

    public void Btc() {
    }

    public void Bte() {
    }

    public AW8(ChatTransferViewModel chatTransferViewModel) {
        this.A00 = chatTransferViewModel;
        this.A01 = chatTransferViewModel;
    }

    public void Btd(int i) {
        ChatTransferViewModel chatTransferViewModel = this.A00;
        int i2 = 100;
        if (!chatTransferViewModel.A06) {
            i2 = 5;
        }
        chatTransferViewModel.A0n(2131888235, (i * i2) / 100);
        Integer num = chatTransferViewModel.A03;
        if (num == null || num.intValue() != 0) {
            chatTransferViewModel.A03 = 0;
        }
    }

    public void Bvl(int i, int i2) {
        ChatTransferViewModel chatTransferViewModel = this.A00;
        chatTransferViewModel.A0n(2131888235, 95 + ((((i * 100) / i2) * 5) / 100));
        Integer num = chatTransferViewModel.A03;
        if (num == null || num.intValue() != 2) {
            chatTransferViewModel.A03 = 2;
        }
    }

    /* JADX WARNING: type inference failed for: r0v26, types: [java.lang.Object, X.9hH] */
    public void onError(int i) {
        P2pTransferViewModel p2pTransferViewModel;
        boolean r1;
        AnonymousClass1DT r0;
        ChatTransferViewModel chatTransferViewModel = this.A00;
        if (chatTransferViewModel.A00 == 5) {
            C17900vP.A0k("p2p/fpm/ChatTransferViewModel/received error, ignoring because transfer is completed; errorCode: ", AnonymousClass000.A10(), i);
            return;
        }
        if (i == 2) {
            A7P a7p = chatTransferViewModel.A0H;
            a7p.A0B.CGF(new AnonymousClass3C2(a7p, 12, 3, (long) chatTransferViewModel.A00));
        } else if (i == 108) {
            chatTransferViewModel.A08 = true;
        } else if (i == 605 && chatTransferViewModel.A01 != null) {
            if (ChatTransferViewModel.A00(chatTransferViewModel) <= C18020vd.A00(C18040vf.A02, chatTransferViewModel.A0D, 8751)) {
                ChatTransferViewModel.A0A(chatTransferViewModel, 607);
                AnonymousClass1DT r9 = chatTransferViewModel.A0E;
                int A002 = ChatTransferViewModel.A00(chatTransferViewModel);
                long j = 100 - ((long) A002);
                String A10 = AnonymousClass3Ma.A10(chatTransferViewModel.A0I.A00, AnonymousClass8BX.A0Z(chatTransferViewModel.A0J, A002), AnonymousClass3MW.A1a(), 0, 2131888207);
                AWG awg = new AWG(chatTransferViewModel, 0, j);
                AWG awg2 = new AWG(chatTransferViewModel, 1, j);
                ? obj = new Object();
                obj.A06 = A10;
                obj.A00 = 2131888206;
                obj.A02 = 2131887451;
                obj.A01 = 2131888216;
                obj.A05 = awg;
                obj.A04 = awg2;
                obj.A07 = false;
                obj.A08 = true;
                r9.A0E(obj);
                return;
            }
        }
        ChatTransferViewModel.A0A(chatTransferViewModel, i);
        C17900vP.A0j("p2p/P2pTransferViewModel/received errorCode: ", AnonymousClass000.A10(), i);
        if (i != 501) {
            if (i == 600) {
                p2pTransferViewModel = this.A01;
                AnonymousClass3MY.A1M(p2pTransferViewModel.A0F, false);
            } else if (i != 603) {
                p2pTransferViewModel = this.A01;
                if (i != 606) {
                    r1 = p2pTransferViewModel.A0T();
                }
            } else {
                p2pTransferViewModel = this.A01;
                p2pTransferViewModel.A06 = true;
                if (p2pTransferViewModel.A04) {
                    r1 = new C188349hH(new AWF(p2pTransferViewModel, 8), (B8L) null, 2131888205, 2131888204, 2131899286, 0, false, true);
                } else {
                    r0 = p2pTransferViewModel.A0C;
                    r1 = true;
                    r0.A0E(r1);
                }
            }
            r1 = new C188349hH((B8L) null, (B8L) null, 2131888202, 2131888201, 2131899286, 0, false, false);
        } else {
            p2pTransferViewModel = this.A01;
            r1 = new C188349hH(new AWF(p2pTransferViewModel, 12), (B8L) null, 2131888234, 2131888233, 2131899286, 0, false, false);
        }
        r0 = p2pTransferViewModel.A0E;
        r0.A0E(r1);
    }
}
