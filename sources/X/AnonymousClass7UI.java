package X;

import com.whatsapp.areffects.data.graphql.ArEffectsGraphqlRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.data.graphql.ArEffectsGraphqlRepository", f = "ArEffectsGraphqlRepository.kt", i = {0, 0}, l = {27}, m = "postRequest", n = {"this", "tag"}, s = {"L$0", "L$1"})
/* renamed from: X.7UI  reason: invalid class name */
public final class AnonymousClass7UI extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ArEffectsGraphqlRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UI(ArEffectsGraphqlRepository arEffectsGraphqlRepository, C30391dr r2) {
        super(r2);
        this.this$0 = arEffectsGraphqlRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass8AB) null, (String) null, this);
    }
}
