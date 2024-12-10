package X;

import com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType;
import java.util.List;

/* renamed from: X.2lt  reason: invalid class name and case insensitive filesystem */
public final class C59182lt {
    public final GraphQLXWA2SuggestedContactsSignalType A00;
    public final List A01;

    public C59182lt(GraphQLXWA2SuggestedContactsSignalType graphQLXWA2SuggestedContactsSignalType, List list) {
        C18070vi.A0d(graphQLXWA2SuggestedContactsSignalType, 1);
        this.A00 = graphQLXWA2SuggestedContactsSignalType;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59182lt) {
                C59182lt r5 = (C59182lt) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ServerSignal(signalType=");
        A10.append(this.A00);
        A10.append(", contactInfoList=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
