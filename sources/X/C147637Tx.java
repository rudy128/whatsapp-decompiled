package X;

import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel", f = "SearchFunStickersViewModel.kt", i = {}, l = {625}, m = "startNewLoggingSession", n = {}, s = {})
/* renamed from: X.7Tx  reason: invalid class name and case insensitive filesystem */
public final class C147637Tx extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147637Tx(SearchFunStickersViewModel searchFunStickersViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = searchFunStickersViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SearchFunStickersViewModel.A06(this.this$0, this);
    }
}
