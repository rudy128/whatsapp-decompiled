package X;

import android.content.Context;
import com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel", f = "UserControlMessageLevelViewModel.kt", i = {0, 0}, l = {334}, m = "updateStopActionTitle", n = {"this", "context"}, s = {"L$0", "L$1"})
/* renamed from: X.7Uc  reason: invalid class name and case insensitive filesystem */
public final class C147687Uc extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UserControlMessageLevelViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147687Uc(UserControlMessageLevelViewModel userControlMessageLevelViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = userControlMessageLevelViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0U((Context) null, this);
    }
}
