package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaAudience;

/* renamed from: X.4bP  reason: invalid class name */
public final class AnonymousClass4bP implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C89474cW(GraphQLXFBGenAIPersonaAudience.valueOf(parcel.readString()), C72453Mb.A0y(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C89474cW[i];
    }
}
