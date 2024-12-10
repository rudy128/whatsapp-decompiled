package X;

import com.whatsapp.infra.graphql.generated.registration.enums.GraphQLXWA2RegUpsell;
import com.whatsapp.registration.RegistrationUpsellProtocolHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.RegistrationUpsellProtocolHelper", f = "RegistrationUpsellProtocolHelper.kt", i = {1}, l = {85, 87}, m = "canShowUpsell", n = {"this"}, s = {"L$0"})
/* renamed from: X.Ant  reason: case insensitive filesystem */
public final class C21664Ant extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RegistrationUpsellProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21664Ant(RegistrationUpsellProtocolHelper registrationUpsellProtocolHelper, C30391dr r2) {
        super(r2);
        this.this$0 = registrationUpsellProtocolHelper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RegistrationUpsellProtocolHelper.A00((GraphQLXWA2RegUpsell) null, this.this$0, this);
    }
}
