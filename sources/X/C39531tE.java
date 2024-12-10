package X;

import com.whatsapp.infra.graphql.generated.usermetadata.enums.GraphQLXWA2BrigadingState;

/* renamed from: X.1tE  reason: invalid class name and case insensitive filesystem */
public final class C39531tE extends AnonymousClass11D {
    public final C19830z4 A00;
    public final C18030ve A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39531tE(C19830z4 r3, C18030ve r4, AnonymousClass00H r5) {
        super(r5, C18150vq.A00(), false);
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r5, 3);
        this.A01 = r4;
        this.A00 = r3;
    }

    public final void A00(GraphQLXWA2BrigadingState graphQLXWA2BrigadingState) {
        String obj = graphQLXWA2BrigadingState.toString();
        C19830z4 r3 = this.A00;
        if (!C18070vi.A18(obj, r3.A0c())) {
            if (C18020vd.A05(C18040vf.A02, this.A01, 9876)) {
                C19830z4.A00(r3).putString("brigading_banner_state", obj).apply();
                notifyAllObservers(new C96994ok(25));
            }
        }
    }
}
