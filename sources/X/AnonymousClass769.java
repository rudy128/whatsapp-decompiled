package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.769  reason: invalid class name */
public final class AnonymousClass769 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String A0y = C72453Mb.A0y(parcel);
        Parcelable.Creator creator = AnonymousClass77C.CREATOR;
        return new AnonymousClass77J((AnonymousClass77C) creator.createFromParcel(parcel), (AnonymousClass77C) creator.createFromParcel(parcel), (AnonymousClass77C) creator.createFromParcel(parcel), A0y, parcel.readString(), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass77J[i];
    }
}
