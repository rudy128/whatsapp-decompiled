package X;

import com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType;
import java.util.AbstractMap;

/* renamed from: X.4qF  reason: invalid class name and case insensitive filesystem */
public final class C97904qF implements C36471nw {
    public final C18100vl A00;
    public final C18100vl A01;

    public C97904qF(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = C99164sN.A01(r2, 37);
        this.A01 = C99164sN.A01(r2, 38);
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
