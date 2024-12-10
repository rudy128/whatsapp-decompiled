package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealReason;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2EnforcementSource;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory;

/* renamed from: X.4br  reason: invalid class name and case insensitive filesystem */
public final class C89094br implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        GraphQLXWA2AppealReason valueOf;
        GraphQLXWA2AppealState valueOf2 = GraphQLXWA2AppealState.valueOf(C72453Mb.A0y(parcel));
        GraphQLXWA2EnforcementSource graphQLXWA2EnforcementSource = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = GraphQLXWA2AppealReason.valueOf(parcel.readString());
        }
        GraphQLXWA2ViolationCategory valueOf3 = GraphQLXWA2ViolationCategory.valueOf(parcel.readString());
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        C89424cR r5 = (C89424cR) C72473Md.A0e(parcel);
        if (parcel.readInt() != 0) {
            graphQLXWA2EnforcementSource = GraphQLXWA2EnforcementSource.valueOf(parcel.readString());
        }
        return new AnonymousClass443(valueOf, valueOf2, graphQLXWA2EnforcementSource, valueOf3, r5, readString, readString2);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass443[i];
    }
}
