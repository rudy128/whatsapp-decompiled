package X;

import com.whatsapp.newsletter.insights.NewsletterInsightsActivity;

/* renamed from: X.4gN  reason: invalid class name and case insensitive filesystem */
public final class C91864gN implements AnonymousClass8B5 {
    public int A00;
    public final /* synthetic */ NewsletterInsightsActivity A01;

    public void C8J(C136836uU r1) {
    }

    public void C8K(C136836uU r15) {
        int i;
        int i2;
        C18070vi.A0d(r15, 0);
        NewsletterInsightsActivity newsletterInsightsActivity = this.A01;
        C18100vl r6 = newsletterInsightsActivity.A0A;
        AnonymousClass4VW r3 = (AnonymousClass4VW) AnonymousClass000.A0w(AnonymousClass3MW.A12(r6), r15.A00);
        if (r3 != null) {
            AnonymousClass00H r0 = newsletterInsightsActivity.A08;
            if (r0 != null) {
                C30361do r4 = (C30361do) C18070vi.A0E(r0);
                boolean z = r3 instanceof AnonymousClass43Z;
                if (z) {
                    i = 102;
                } else if (r3 instanceof AnonymousClass43a) {
                    i = 103;
                } else {
                    i = 104;
                }
                C18100vl r02 = C30361do.A0C;
                r4.A02((AnonymousClass1BI) null, i);
                AnonymousClass4VW r1 = (AnonymousClass4VW) AnonymousClass000.A0w(AnonymousClass3MW.A12(r6), this.A00);
                if (r1 != null) {
                    AnonymousClass74D r62 = newsletterInsightsActivity.A07;
                    if (r62 != null) {
                        C29681ch A0o = AnonymousClass3MX.A0o(newsletterInsightsActivity.A0B);
                        long A0K = C72453Mb.A0K(newsletterInsightsActivity.A0E);
                        int A002 = r1.A00();
                        if (z) {
                            i2 = 0;
                        } else if (r3 instanceof AnonymousClass43a) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        r62.A0E(A0o, Integer.valueOf(i2), (Integer) null, A002, 3, A0K);
                        return;
                    }
                    C18070vi.A11("newsletterLogging");
                    throw null;
                }
                return;
            }
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public void C8N(C136836uU r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2.A00;
    }

    public C91864gN(NewsletterInsightsActivity newsletterInsightsActivity) {
        this.A01 = newsletterInsightsActivity;
    }
}
