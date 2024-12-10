package X;

import com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient", f = "NewsletterUserReportsNetworkClient.kt", i = {}, l = {33}, m = "submitAppeal", n = {}, s = {})
/* renamed from: X.4tr  reason: invalid class name and case insensitive filesystem */
public final class C100034tr extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NewsletterUserReportsNetworkClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100034tr(NewsletterUserReportsNetworkClient newsletterUserReportsNetworkClient, C30391dr r2) {
        super(r2);
        this.this$0 = newsletterUserReportsNetworkClient;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((String) null, (String) null, this);
    }
}
