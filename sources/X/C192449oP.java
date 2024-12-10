package X;

import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;

/* renamed from: X.9oP  reason: invalid class name and case insensitive filesystem */
public final class C192449oP {
    public final C29681ch A00;
    public final C35681md A01;
    public final C32991i5 A02;

    public final void A00(int i) {
        C35681md r2;
        C29681ch r1;
        C179459Ia r0;
        if (i != 404) {
            if (i == 423) {
                r2 = this.A01;
                r1 = this.A00;
                r0 = C179459Ia.SUSPENDED;
            } else if (i == 451) {
                r2 = this.A01;
                r1 = this.A00;
                r0 = C179459Ia.GEOSUSPENDED;
            } else {
                return;
            }
            r2.A04(r0, r1);
            return;
        }
        this.A01.A08(this.A00);
    }

    public final void A01(GraphQLXWA2NewsletterStateType graphQLXWA2NewsletterStateType) {
        if (graphQLXWA2NewsletterStateType != null) {
            int ordinal = graphQLXWA2NewsletterStateType.ordinal();
            int i = 423;
            if (ordinal != 2) {
                i = 451;
                if (ordinal != 3) {
                    if (ordinal == 5) {
                        i = 404;
                    } else {
                        return;
                    }
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                A00(valueOf.intValue());
            }
        }
    }

    public C192449oP(C32991i5 r1, C29681ch r2, C35681md r3) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A02 = r1;
        this.A01 = r3;
    }
}
