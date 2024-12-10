package X;

import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.screenshare.ScreenShareViewModel", f = "ScreenShareViewModel.kt", i = {0, 0}, l = {311}, m = "stopScreenSharing", n = {"this", "stopReason"}, s = {"L$0", "L$1"})
/* renamed from: X.7UK  reason: invalid class name */
public final class AnonymousClass7UK extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ScreenShareViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UK(ScreenShareViewModel screenShareViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = screenShareViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScreenShareViewModel.A03((AnonymousClass6RY) null, this.this$0, this);
    }
}
