package X;

import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;

public class AWG implements B8L {
    public final int A00;
    public final long A01;
    public final Object A02;

    public AWG(ChatTransferViewModel chatTransferViewModel, int i, long j) {
        this.A00 = i;
        this.A02 = chatTransferViewModel;
        this.A01 = j;
    }

    public final void CPr() {
        int i = this.A00;
        ChatTransferViewModel chatTransferViewModel = (ChatTransferViewModel) this.A02;
        long j = this.A01;
        C18070vi.A0d(chatTransferViewModel, 0);
        A7P a7p = chatTransferViewModel.A0H;
        if (i != 0) {
            a7p.A0B.CGF(new AnonymousClass3C7(a7p, 18, 28, 1, j));
        } else {
            a7p.A0B.CGF(new AnonymousClass3C7(a7p, 17, 28, 1, j));
            AWI awi = chatTransferViewModel.A01;
            if (awi != null) {
                chatTransferViewModel.A0M.CGF(new C70593Bs(awi, 49));
                return;
            }
        }
        chatTransferViewModel.A0c();
    }
}
