package X;

import com.whatsapp.migration.transfer.ui.P2pTransferViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.migration.transfer.ui.P2pTransferViewModel", f = "P2pTransferViewModel.kt", i = {0, 0, 0, 0}, l = {349}, m = "startServerWhenReady", n = {"this", "authToken", "sessionId", "certificatePrivateKeyPair"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* renamed from: X.AoV  reason: case insensitive filesystem */
public final class C21702AoV extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ P2pTransferViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21702AoV(P2pTransferViewModel p2pTransferViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = p2pTransferViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0V((String) null, (String) null, (AnonymousClass1D6) null, this);
    }
}
