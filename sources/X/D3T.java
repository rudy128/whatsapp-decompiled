package X;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.camera.PhotoCameraFragment;
import java.util.ArrayList;

public final class D3T implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(36);
    public int A00 = 224;
    public long A01 = 200000;
    public RectF A02;
    public PhotoCameraFragment A03;
    public Integer A04 = AnonymousClass00R.A00;
    public String A05;
    public String A06;
    public final ArrayList A07 = AnonymousClass000.A13();

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A06);
        parcel.writeStringList(this.A07);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04.intValue());
        parcel.writeParcelable(this.A02, i);
    }
}
