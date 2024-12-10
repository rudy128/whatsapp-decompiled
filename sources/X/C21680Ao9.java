package X;

import com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.postcode.viewmodel.PostcodeViewModel", f = "PostcodeViewModel.kt", i = {0, 0}, l = {128}, m = "checkUserPostcodeWithSharedPref", n = {"this", "viewModelPostcode"}, s = {"L$0", "L$1"})
/* renamed from: X.Ao9  reason: case insensitive filesystem */
public final class C21680Ao9 extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PostcodeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21680Ao9(PostcodeViewModel postcodeViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = postcodeViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0T(this);
    }
}
