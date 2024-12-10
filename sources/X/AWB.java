package X;

import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import com.whatsapp.migration.transfer.ui.P2pTransferViewModel;

public class AWB implements B8I {
    public final int A00;
    public final Object A01;

    public AWB(ChatTransferViewModel chatTransferViewModel, int i) {
        this.A00 = i;
        this.A01 = chatTransferViewModel;
    }

    public final void CPr() {
        AnonymousClass1DT r1;
        boolean A0f;
        A7P a7p;
        String str;
        String str2;
        switch (this.A00) {
            case 1:
                ChatTransferViewModel chatTransferViewModel = (ChatTransferViewModel) this.A01;
                C72463Mc.A1B(chatTransferViewModel.A0N);
                a7p = chatTransferViewModel.A0H;
                str = "wa_update_screen_click";
                str2 = "next";
                break;
            case 2:
                ChatTransferViewModel chatTransferViewModel2 = (ChatTransferViewModel) this.A01;
                AnonymousClass3MX.A1K(chatTransferViewModel2.A07, 0);
                a7p = chatTransferViewModel2.A0H;
                str = "wa_update_screen_click";
                str2 = "canceled";
                break;
            case 3:
                ChatTransferViewModel chatTransferViewModel3 = (ChatTransferViewModel) this.A01;
                chatTransferViewModel3.A0H.A07("completed_screen_click", "next");
                chatTransferViewModel3.A0k(false);
                C72463Mc.A1B(chatTransferViewModel3.A09);
                return;
            case 4:
                ChatTransferViewModel chatTransferViewModel4 = (ChatTransferViewModel) this.A01;
                chatTransferViewModel4.A0H.A07("completed_screen_click", "next");
                C198189xw A04 = ChatTransferViewModel.A04(chatTransferViewModel4);
                if (A04.A00) {
                    AnonymousClass8BR.A0q(A04.A01).A0J("chat_transfer_complete", "chat_transfer_complete_next", "next");
                }
                AnonymousClass3MX.A1K(chatTransferViewModel4.A07, -1);
                return;
            case 7:
                ChatTransferViewModel chatTransferViewModel5 = (ChatTransferViewModel) this.A01;
                ChatTransferViewModel.A07(chatTransferViewModel5);
                if (!chatTransferViewModel5.A04 || !((C22881Do) chatTransferViewModel5.A0Q.get()).A01) {
                    r1 = chatTransferViewModel5.A07;
                    A0f = AnonymousClass3MY.A0f();
                } else {
                    chatTransferViewModel5.A0k(true);
                    r1 = chatTransferViewModel5.A09;
                    A0f = true;
                }
                r1.A0E(A0f);
                return;
            case 9:
                ChatTransferViewModel chatTransferViewModel6 = (ChatTransferViewModel) this.A01;
                A7P a7p2 = chatTransferViewModel6.A0H;
                a7p2.A07("landing_screen_click", "next");
                ChatTransferViewModel.A08(chatTransferViewModel6);
                a7p2.A04(4);
                C198189xw A042 = ChatTransferViewModel.A04(chatTransferViewModel6);
                if (A042.A00) {
                    AnonymousClass00H r4 = A042.A01;
                    A8V.A04(AnonymousClass8BR.A0q(r4), r4, "chat_transfer_upsell", "chat_transfer_upsell_accept", "accept");
                }
                C27411Vz r0 = (C27411Vz) chatTransferViewModel6.A0P.get();
                if (r0 != null) {
                    AnonymousClass1W0 r12 = r0.A00;
                    double A002 = r12.A00();
                    if (!r12.A01() && !r12.A03()) {
                        if (A002 == Double.NaN || A002 < 20.0d) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("battery_percentage_range: ");
                            int i = (int) A002;
                            int i2 = i % 5;
                            if (i2 != 0) {
                                i += 5 - i2;
                            }
                            String A0y = AnonymousClass000.A0y(String.valueOf(i), A10);
                            boolean A1Z = C72453Mb.A1Z(A0y);
                            String A1H = AnonymousClass001.A1H("p2p/fpm/", "battery_charge_is_not_sufficient", AnonymousClass000.A10());
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append(a7p2.A02);
                            a7p2.A05.A0G(A1H, C17890vO.A0Z(A0y, A102, '_'), A1Z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                P2pTransferViewModel p2pTransferViewModel = (P2pTransferViewModel) this.A01;
                p2pTransferViewModel.A0E.A0E(new C188349hH(new AWF(p2pTransferViewModel, 3), (B8L) null, 2131888213, 2131888211, 2131888214, 2131898766, true, true));
                return;
        }
        a7p.A07(str, str2);
    }
}
