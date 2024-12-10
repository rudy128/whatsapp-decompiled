package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.D3t  reason: case insensitive filesystem */
public final class C26553D3t implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(38);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final List A03;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeList(this.A03);
        parcel.writeValue(this.A00);
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A01);
    }

    public C26553D3t(Parcel parcel) {
        ArrayList A13 = AnonymousClass000.A13();
        this.A03 = A13;
        parcel.readList(A13, C24333BzU.class.getClassLoader());
        this.A00 = (Integer) parcel.readValue(Integer.TYPE.getClassLoader());
        this.A02 = (Integer) parcel.readValue(Integer.TYPE.getClassLoader());
        this.A01 = (Integer) parcel.readValue(Integer.TYPE.getClassLoader());
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ChallengeProvider{mSteps=");
        A10.append(TextUtils.join(",", this.A03));
        A10.append(", mPhotoQuality=");
        A10.append(this.A00);
        A10.append(", mVideoQuality=");
        A10.append(this.A02);
        A10.append(", mVideoBitrate=");
        return AnonymousClass8BX.A0c(this.A01, A10);
    }

    public C26553D3t(List list) {
        this.A03 = list;
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
    }
}
