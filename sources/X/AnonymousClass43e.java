package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterLogExposureResponseImpl;
import com.whatsapp.util.Log;

/* renamed from: X.43e  reason: invalid class name */
public final class AnonymousClass43e extends AMB {
    public final C29681ch A00;

    public AnonymousClass5WY A00() {
        C189819ju r2 = GraphQlCallInput.A02;
        String rawString = this.A00.getRawString();
        C162478Kx A002 = r2.A00();
        C162478Kx.A01(A002, rawString, "newsletter_id");
        C162478Kx.A01(A002, "INSIGHTS", "capability");
        A7K a7k = new A7K();
        a7k.A00.A02().A06(A002, "input");
        return new AIj(a7k, NewsletterLogExposureResponseImpl.class, "NewsletterLogExposure");
    }

    public boolean A04(A6Z a6z) {
        Log.e("NewsletterLogExposureHandler/error");
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass43e(AnonymousClass1PY r1, C29681ch r2, AnonymousClass5Y9 r3, AnonymousClass10I r4) {
        super(r1, r3, r4);
        C18070vi.A0o(r4, r1, r3);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void A02(C20125A8k a8k) {
    }
}
