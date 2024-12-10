package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealReason;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2EnforcementSource;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory;
import java.util.ArrayList;

/* renamed from: X.4bn  reason: invalid class name and case insensitive filesystem */
public final class C89054bn implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        GraphQLXWA2AppealReason valueOf;
        GraphQLXWA2EnforcementSource valueOf2;
        GraphQLXWA2AppealState valueOf3 = GraphQLXWA2AppealState.valueOf(C72453Mb.A0y(parcel));
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = GraphQLXWA2AppealReason.valueOf(parcel.readString());
        }
        GraphQLXWA2ViolationCategory valueOf4 = GraphQLXWA2ViolationCategory.valueOf(parcel.readString());
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        C89424cR r7 = (C89424cR) C72473Md.A0e(parcel);
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = GraphQLXWA2EnforcementSource.valueOf(parcel.readString());
        }
        String readString3 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = C17880vN.A0z(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(AnonymousClass445.CREATOR.createFromParcel(parcel));
            }
        }
        return new AnonymousClass445(valueOf, valueOf3, valueOf2, valueOf4, r7, readString, readString2, readString3, arrayList);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass445[i];
    }
}
