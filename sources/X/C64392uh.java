package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.fieldstats.extension.WamCallExtendedField;

/* renamed from: X.2uh  reason: invalid class name and case insensitive filesystem */
public final class C64392uh implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18070vi.A0d(parcel, 0);
        return new WamCallExtendedField(parcel.readInt(), parcel.readString(), parcel.readValue(WamCallExtendedField.class.getClassLoader()));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WamCallExtendedField[i];
    }
}
