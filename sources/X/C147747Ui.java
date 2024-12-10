package X;

import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel", f = "SearchFunStickersViewModel.kt", i = {0, 0}, l = {756}, m = "fillStickerInfo", n = {"this", "$this$fillStickerInfo_u24lambda_u2425"}, s = {"L$0", "L$2"})
/* renamed from: X.7Ui  reason: invalid class name and case insensitive filesystem */
public final class C147747Ui extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147747Ui(SearchFunStickersViewModel searchFunStickersViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = searchFunStickersViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SearchFunStickersViewModel.A03(this.this$0, (C1418377d) null, this);
    }
}
