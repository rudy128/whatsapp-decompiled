package X;

import com.whatsapp.util.Log;

/* renamed from: X.7i1  reason: invalid class name and case insensitive filesystem */
public final class C148797i1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass86Z $onboardingCompletedCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C148797i1(AnonymousClass86Z r2) {
        super(0);
        this.$onboardingCompletedCallback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Log.e("failed to show meta ai disclosure");
        AnonymousClass86Z r1 = this.$onboardingCompletedCallback;
        if (r1 != null) {
            r1.BzU(AnonymousClass6R9.NOT_ACCEPTED);
        }
        return C27621Wu.A00;
    }
}
