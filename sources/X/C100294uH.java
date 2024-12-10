package X;

import com.whatsapp.calling.dialer.DialerViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerViewModel", f = "DialerViewModel.kt", i = {0}, l = {222}, m = "getContactFromPhonebook", n = {"enteredPhoneNumber"}, s = {"L$0"})
/* renamed from: X.4uH  reason: invalid class name and case insensitive filesystem */
public final class C100294uH extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DialerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100294uH(DialerViewModel dialerViewModel, C30391dr r2) {
        super(r2);
        this.this$0 = dialerViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DialerViewModel.A00(this.this$0, (String) null, this);
    }
}
