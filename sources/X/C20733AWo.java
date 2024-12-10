package X;

import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.AWo  reason: case insensitive filesystem */
public final /* synthetic */ class C20733AWo implements C23691Hg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public final void CGE(Object obj) {
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        int i = this.A00;
        BDJ bdj = (BDJ) obj;
        C18070vi.A0d(bdj, 4);
        ChatTransferViewModel chatTransferViewModel = ((AW8) bdj).A00;
        C20276AEj aEj = chatTransferViewModel.A01;
        if (aEj != null) {
            aEj.A03 = str;
            aEj.A04 = str2;
            aEj.A01 = str3;
            aEj.A00 = i;
            if (!chatTransferViewModel.A0m(aEj)) {
                Log.e("p2p/fpm/ChatTransferViewModel//onGroupCreated/QRCode posting failed");
                if (chatTransferViewModel.A0l()) {
                    chatTransferViewModel.A0Z();
                }
            } else if (chatTransferViewModel.A0l()) {
                chatTransferViewModel.A0a();
            }
        }
    }

    public /* synthetic */ C20733AWo(String str, String str2, String str3, int i) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = i;
    }
}
