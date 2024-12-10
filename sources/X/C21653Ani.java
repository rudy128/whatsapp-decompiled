package X;

import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.migration.transfer.ui.ChatTransferViewModel", f = "ChatTransferViewModel.kt", i = {0}, l = {601}, m = "verifyOtpCode", n = {"this"}, s = {"L$0"})
/* renamed from: X.Ani  reason: case insensitive filesystem */
public final class C21653Ani extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ChatTransferViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21653Ani(ChatTransferViewModel chatTransferViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = chatTransferViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChatTransferViewModel.A05(this.this$0, (C20276AEj) null, this);
    }
}
