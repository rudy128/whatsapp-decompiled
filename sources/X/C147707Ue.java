package X;

import android.content.Context;
import com.whatsapp.usercontrol.viewmodel.UserControlStopResumeViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usercontrol.viewmodel.UserControlStopResumeViewModel", f = "UserControlStopResumeViewModel.kt", i = {0, 0}, l = {67}, m = "buildFragmentConfig", n = {"this", "context"}, s = {"L$0", "L$1"})
/* renamed from: X.7Ue  reason: invalid class name and case insensitive filesystem */
public final class C147707Ue extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UserControlStopResumeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147707Ue(UserControlStopResumeViewModel userControlStopResumeViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = userControlStopResumeViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0T((Context) null, this);
    }
}
