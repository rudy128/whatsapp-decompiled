package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

public class D4A implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(32);
    public final D4B A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map A05;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof D4A)) {
            return false;
        }
        D4A d4a = (D4A) obj;
        return C24545C8q.A00(this.A02, d4a.A02) && C24545C8q.A00(this.A01, d4a.A01) && C24545C8q.A00(this.A03, d4a.A03) && C24545C8q.A00(this.A04, d4a.A04) && C24545C8q.A00(this.A00, d4a.A00) && C24545C8q.A00(this.A05, d4a.A05);
    }

    public int hashCode() {
        return ((((((((((0 + AnonymousClass001.A0l(this.A02)) * 31) + AnonymousClass001.A0l(this.A01)) * 31) + AnonymousClass001.A0l(this.A03)) * 31) + AnonymousClass001.A0l(this.A04)) * 31) + AnonymousClass001.A0l(this.A00)) * 31) + AnonymousClass001.A0l(this.A05);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeMap(this.A05);
    }

    public D4A(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = (D4B) AnonymousClass3Ma.A08(parcel, D4B.class);
        this.A05 = parcel.readHashMap(HashMap.class.getClassLoader());
    }

    public String toString() {
        C26004CqL cqL = new C26004CqL(C108955ca.A0x(this));
        C26004CqL.A00(cqL, this.A02, "Calling Class Name");
        C26004CqL.A00(cqL, this.A01, "Analytics Tag");
        C26004CqL.A00(cqL, this.A03, "Feature tag");
        C26004CqL.A00(cqL, this.A04, "Module Analytics Tag");
        C26004CqL.A00(cqL, this.A00, "Context Chain");
        C26004CqL.A00(cqL, this.A05, "Request Tags");
        return cqL.toString();
    }

    public D4A(D4B d4b, String str, String str2, String str3, String str4) {
        this.A02 = "PhotoDemuxDecodeWrapper";
        this.A01 = null;
        this.A03 = null;
        this.A04 = null;
        this.A00 = null;
        this.A05 = null;
    }

    public D4A() {
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        this.A00 = null;
        this.A05 = null;
    }
}
