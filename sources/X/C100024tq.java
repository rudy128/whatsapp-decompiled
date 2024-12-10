package X;

import com.whatsapp.newsletterenforcements.client.NewsletterEnforcementsClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.client.NewsletterEnforcementsClient", f = "NewsletterEnforcementsClient.kt", i = {}, l = {34}, m = "fetchEnforcements", n = {}, s = {})
/* renamed from: X.4tq  reason: invalid class name and case insensitive filesystem */
public final class C100024tq extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NewsletterEnforcementsClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100024tq(NewsletterEnforcementsClient newsletterEnforcementsClient, C30391dr r2) {
        super(r2);
        this.this$0 = newsletterEnforcementsClient;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A09((C29681ch) null, this);
    }
}
