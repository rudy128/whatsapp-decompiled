package X;

import com.whatsapp.registration.upsell.RegistrationUpsellGraphQLHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.upsell.RegistrationUpsellGraphQLHelper", f = "RegistrationUpsellGraphQLHelper.kt", i = {}, l = {26}, m = "getRegistrationUpsells", n = {}, s = {})
/* renamed from: X.AnN  reason: case insensitive filesystem */
public final class C21632AnN extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RegistrationUpsellGraphQLHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21632AnN(RegistrationUpsellGraphQLHelper registrationUpsellGraphQLHelper, C30391dr r2) {
        super(r2);
        this.this$0 = registrationUpsellGraphQLHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01(this);
    }
}
