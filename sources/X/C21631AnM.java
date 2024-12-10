package X;

import com.whatsapp.registration.RegistrationUpsellProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.RegistrationUpsellProtocolHelper", f = "RegistrationUpsellProtocolHelper.kt", i = {}, l = {108}, m = "canShowPasskeyUpsell", n = {}, s = {})
/* renamed from: X.AnM  reason: case insensitive filesystem */
public final class C21631AnM extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RegistrationUpsellProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21631AnM(RegistrationUpsellProtocolHelper registrationUpsellProtocolHelper, C30391dr r2) {
        super(r2);
        this.this$0 = registrationUpsellProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RegistrationUpsellProtocolHelper.A02(this.this$0, this);
    }
}
