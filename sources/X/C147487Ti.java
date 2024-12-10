package X;

import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.screenshare.ScreenShareViewModel", f = "ScreenShareViewModel.kt", i = {0}, l = {296}, m = "startScreenSharing", n = {"this"}, s = {"L$0"})
/* renamed from: X.7Ti  reason: invalid class name and case insensitive filesystem */
public final class C147487Ti extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ScreenShareViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147487Ti(ScreenShareViewModel screenShareViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = screenShareViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScreenShareViewModel.A04(this.this$0, this);
    }
}
