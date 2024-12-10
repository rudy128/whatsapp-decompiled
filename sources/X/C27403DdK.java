package X;

import com.whatsapp.calling.dialer.DialerRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerRepository", f = "DialerRepository.kt", i = {0, 0, 1, 1, 2, 2}, l = {38, 43, 49}, m = "onEnteredPhoneNumberChanged", n = {"this", "details", "this", "details", "this", "details"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.DdK  reason: case insensitive filesystem */
public final class C27403DdK extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DialerRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27403DdK(DialerRepository dialerRepository, C30391dr r2) {
        super(r2);
        this.this$0 = dialerRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((String) null, this);
    }
}
