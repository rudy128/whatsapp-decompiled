package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import org.json.JSONObject;

public class ADO implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AD6(19);
    public final C185879dI A00;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        JSONObject A06 = C20128A8n.A06(this.A00, true);
        if (A06 != null) {
            return A06.toString();
        }
        return "<json serialization failed>";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C185879dI r2 = this.A00;
        C20284AEs aEs = r2.A01;
        parcel.writeInt(aEs.A05());
        parcel.writeString((String) null);
        parcel.writeString(aEs.A07.A03);
        parcel.writeString(aEs.A0A);
        parcel.writeString((String) C20284AEs.A02(aEs));
        if (aEs instanceof AnonymousClass8pK) {
            parcel.writeInt(((AnonymousClass8pK) aEs).A01);
        }
        BigDecimal bigDecimal = r2.A02.A00;
        parcel.writeInt(bigDecimal.scale());
        parcel.writeString(bigDecimal.toString());
        parcel.writeInt(r2.A00);
    }

    public ADO(C185879dI r1) {
        this.A00 = r1;
    }
}
