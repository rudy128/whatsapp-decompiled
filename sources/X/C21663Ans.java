package X;

import com.whatsapp.registration.RegistrationUpsellProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.RegistrationUpsellProtocolHelper", f = "RegistrationUpsellProtocolHelper.kt", i = {0}, l = {118}, m = "canShowEmailUpsell", n = {"this"}, s = {"L$0"})
/* renamed from: X.Ans  reason: case insensitive filesystem */
public final class C21663Ans extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RegistrationUpsellProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21663Ans(RegistrationUpsellProtocolHelper registrationUpsellProtocolHelper, C30391dr r2) {
        super(r2);
        this.this$0 = registrationUpsellProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RegistrationUpsellProtocolHelper.A01(this.this$0, this);
    }
}
