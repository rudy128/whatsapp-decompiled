package X;

import com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.2mh  reason: invalid class name and case insensitive filesystem */
public final class C59672mh {
    public float A00;
    public GraphQLXWA2SuggestedContactsSignalType A01;
    public AnonymousClass4D0 A02;
    public final Set A03;
    public final Set A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59672mh) {
                C59672mh r5 = (C59672mh) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.A00) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A01);
    }

    public C59672mh(GraphQLXWA2SuggestedContactsSignalType graphQLXWA2SuggestedContactsSignalType, AnonymousClass4D0 r5, float f) {
        this.A00 = f;
        this.A02 = r5;
        this.A01 = graphQLXWA2SuggestedContactsSignalType;
        LinkedHashSet A14 = C17880vN.A14();
        this.A03 = A14;
        LinkedHashSet A142 = C17880vN.A14();
        this.A04 = A142;
        AnonymousClass4D0 r0 = this.A02;
        if (r0 != null) {
            A14.add(r0);
        }
        GraphQLXWA2SuggestedContactsSignalType graphQLXWA2SuggestedContactsSignalType2 = this.A01;
        if (graphQLXWA2SuggestedContactsSignalType2 != null) {
            A142.add(graphQLXWA2SuggestedContactsSignalType2);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ContactScoreAndSignal(score=");
        A10.append(this.A00);
        A10.append(", clientSignalType=");
        A10.append(this.A02);
        A10.append(", serverSignalType=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
