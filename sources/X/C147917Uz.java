package X;

import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel", f = "SearchFunStickersViewModel.kt", i = {0, 0}, l = {543}, m = "getStickerFromUrl", n = {"this", "url"}, s = {"L$0", "L$1"})
/* renamed from: X.7Uz  reason: invalid class name and case insensitive filesystem */
public final class C147917Uz extends C30421du {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147917Uz(SearchFunStickersViewModel searchFunStickersViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = searchFunStickersViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SearchFunStickersViewModel.A05(this.this$0, (String) null, this);
    }
}
