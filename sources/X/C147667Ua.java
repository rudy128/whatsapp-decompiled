package X;

import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.UpdatesViewModel", f = "UpdatesViewModel.kt", i = {0, 0}, l = {484}, m = "reportUpdatesTabOpenedWithDelay", n = {"this", "token"}, s = {"L$0", "L$1"})
/* renamed from: X.7Ua  reason: invalid class name and case insensitive filesystem */
public final class C147667Ua extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147667Ua(UpdatesViewModel updatesViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = updatesViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UpdatesViewModel.A04(this.this$0, (String) null, this, 0);
    }
}
