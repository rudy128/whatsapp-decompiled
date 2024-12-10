package X;

import com.whatsapp.migration.transfer.ui.ChatTransferActivity;

/* renamed from: X.AzN  reason: case insensitive filesystem */
public final class C22207AzN extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ChatTransferActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22207AzN(ChatTransferActivity chatTransferActivity) {
        super(1);
        this.this$0 = chatTransferActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ChatTransferActivity chatTransferActivity = this.this$0;
        if (AnonymousClass3MX.A1a((Boolean) obj)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("p2p/fpm/ChatTransferActivity/upgradeApp/user-accepted-update; playStoreEnabled: ");
            if (chatTransferActivity.A02 != null) {
                A10.append(false);
                C17890vO.A0w(A10);
                C40751vD r0 = chatTransferActivity.A02;
                if (r0 != null) {
                    chatTransferActivity.A01.A08(chatTransferActivity, AnonymousClass3MY.A07(r0.A03()));
                    chatTransferActivity.finish();
                }
            }
            C18070vi.A11("upgrade");
            throw null;
        }
        return C27621Wu.A00;
    }
}
