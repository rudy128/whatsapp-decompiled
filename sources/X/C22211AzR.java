package X;

import com.whatsapp.CircularProgressBar;
import com.whatsapp.WaTextView;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.migration.transfer.ui.ChatTransferActivity;

/* renamed from: X.AzR  reason: case insensitive filesystem */
public final class C22211AzR extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C173628vP this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22211AzR(C173628vP r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1D6 r9 = (AnonymousClass1D6) obj;
        C173628vP r7 = this.this$0;
        C18070vi.A0b(r9);
        int A04 = AnonymousClass3MZ.A04(r9);
        int A09 = C108955ca.A09(r9);
        ChatTransferActivity chatTransferActivity = (ChatTransferActivity) r7;
        WaTextView waTextView = chatTransferActivity.A03;
        if (waTextView != null) {
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = AnonymousClass8BX.A0Z(chatTransferActivity.A00, A09);
            AnonymousClass3MY.A0y(chatTransferActivity, waTextView, A1a, A04);
            WaTextView waTextView2 = chatTransferActivity.A03;
            if (waTextView2 != null) {
                waTextView2.setVisibility(0);
                RoundCornerProgressBar roundCornerProgressBar = chatTransferActivity.A04;
                if (roundCornerProgressBar != null) {
                    roundCornerProgressBar.setProgress(A09);
                    RoundCornerProgressBar roundCornerProgressBar2 = chatTransferActivity.A04;
                    if (roundCornerProgressBar2 != null) {
                        roundCornerProgressBar2.setVisibility(0);
                        CircularProgressBar circularProgressBar = chatTransferActivity.A01;
                        if (circularProgressBar == null) {
                            C18070vi.A11("progressSpinner");
                            throw null;
                        }
                        circularProgressBar.setVisibility(8);
                        return C27621Wu.A00;
                    }
                }
                C18070vi.A11("progressBar");
                throw null;
            }
        }
        C18070vi.A11("progressDescription");
        throw null;
    }
}
