package X;

import com.whatsapp.registration.AccountTransferManager;

/* renamed from: X.82a  reason: invalid class name and case insensitive filesystem */
public final class C1587882a extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C108935cY $deferredResult;
    public final /* synthetic */ AccountTransferManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1587882a(AccountTransferManager accountTransferManager, C108935cY r3) {
        super(1);
        this.this$0 = accountTransferManager;
        this.$deferredResult = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Integer A0j;
        C18070vi.A0d(obj, 0);
        C20125A8k a8k = (C20125A8k) obj;
        C108935cY r2 = this.$deferredResult;
        boolean A17 = C18070vi.A17(a8k, r2);
        if (a8k.A0G("xwa2_account_transfer_verify_token")) {
            A0j = Integer.valueOf(A17 ? 1 : 0);
        } else {
            A0j = C17880vN.A0j();
        }
        r2.BFN(A0j);
        return C27621Wu.A00;
    }
}
