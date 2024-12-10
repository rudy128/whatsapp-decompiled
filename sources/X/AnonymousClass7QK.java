package X;

import com.whatsapp.newsletter.mex.NewsletterReactionSendersGraphqlJob;
import com.whatsapp.util.Log;

/* renamed from: X.7QK  reason: invalid class name */
public final class AnonymousClass7QK implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C29681ch A01;
    public final /* synthetic */ AnonymousClass7KK A02;
    public final /* synthetic */ C130126iv A03;
    public final /* synthetic */ C30391dr A04;
    public final /* synthetic */ C22811Dh A05;
    public final /* synthetic */ C98494rF A06;

    public AnonymousClass7QK(C29681ch r1, AnonymousClass7KK r2, C130126iv r3, C30391dr r4, C22811Dh r5, C98494rF r6, long j) {
        this.A06 = r6;
        this.A03 = r3;
        this.A01 = r1;
        this.A00 = j;
        this.A02 = r2;
        this.A05 = r5;
        this.A04 = r4;
    }

    public final void run() {
        C98494rF r7 = this.A06;
        C35681md r6 = this.A03.A02;
        C29681ch r5 = this.A01;
        long j = this.A00;
        AnonymousClass7KK r2 = this.A02;
        if (!C72453Mb.A1X(r6.A0P)) {
            C22811Dh r4 = this.A05;
            C30391dr r3 = this.A04;
            Log.e((Throwable) new C175068xw("Unable to start reactions senders list job", 0));
            if (!r4.element) {
                r3.resumeWith(new Object());
                r4.element = true;
                return;
            }
            return;
        }
        NewsletterReactionSendersGraphqlJob newsletterReactionSendersGraphqlJob = new NewsletterReactionSendersGraphqlJob(r5, r2, String.valueOf(j));
        ((C25001Mm) r6.A0Z.get()).A01(newsletterReactionSendersGraphqlJob);
        r7.element = newsletterReactionSendersGraphqlJob;
    }
}
