package X;

import com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType;
import java.util.AbstractMap;

/* renamed from: X.1oQ  reason: invalid class name and case insensitive filesystem */
public final class C36761oQ implements C36471nw {
    public final C18100vl A00;
    public final C18100vl A01;

    public C36761oQ(C18030ve r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = new C18110vm(new C71013Dl(r3, 12));
        this.A01 = new C18110vm(new C71013Dl(r3, 13));
    }

    public float BOl(AnonymousClass4D0 r2) {
        C18070vi.A0d(r2, 0);
        Number number = (Number) ((AbstractMap) this.A00.getValue()).get(r2);
        if (number != null) {
            return number.floatValue();
        }
        return 0.0f;
    }

    public float BZ2(GraphQLXWA2SuggestedContactsSignalType graphQLXWA2SuggestedContactsSignalType) {
        Number number = (Number) ((AbstractMap) this.A01.getValue()).get(graphQLXWA2SuggestedContactsSignalType);
        if (number != null) {
            return number.floatValue();
        }
        return 0.0f;
    }
}
