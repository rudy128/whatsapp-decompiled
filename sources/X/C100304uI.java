package X;

import android.content.Context;
import com.whatsapp.calling.dialer.DialerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerViewModel", f = "DialerViewModel.kt", i = {0}, l = {151}, m = "handleOnCallButtonClick", n = {"this"}, s = {"L$0"})
/* renamed from: X.4uI  reason: invalid class name and case insensitive filesystem */
public final class C100304uI extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DialerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100304uI(DialerViewModel dialerViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = dialerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0T((Context) null, this);
    }
}
