package X;

import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel", f = "SearchFunStickersViewModel.kt", i = {0}, l = {699}, m = "endPreviousLoggingSession", n = {"$this$endPreviousLoggingSession_u24lambda_u2420"}, s = {"L$1"})
/* renamed from: X.7UO  reason: invalid class name */
public final class AnonymousClass7UO extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UO(SearchFunStickersViewModel searchFunStickersViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = searchFunStickersViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SearchFunStickersViewModel.A07(this.this$0, this, 0);
    }
}
