package X;

import com.whatsapp.newsletter.iq.BaseNewslettersJob;

/* renamed from: X.80e  reason: invalid class name and case insensitive filesystem */
public final class C1583080e extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C98494rF $runningJob;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1583080e(C98494rF r2) {
        super(1);
        this.$runningJob = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = this.$runningJob.element;
        if (obj2 == null) {
            C18070vi.A11("runningJob");
            throw null;
        }
        ((BaseNewslettersJob) obj2).cancel();
        return C27621Wu.A00;
    }
}
