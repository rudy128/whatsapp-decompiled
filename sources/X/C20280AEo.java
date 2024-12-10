package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AEo  reason: case insensitive filesystem */
public final class C20280AEo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C20280AEo(long j, String str, String str2) {
        this(str, str2, (String) null, (String) null, (List) null, j);
        C18070vi.A0j(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A04);
        List list = this.A05;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A0r = C108985cd.A0r(parcel, list);
            while (A0r.hasNext()) {
                AnonymousClass8BU.A14(parcel, A0r, i);
            }
        }
        parcel.writeString(this.A03);
    }

    public C20280AEo(String str, String str2, String str3, String str4, List list, long j) {
        C18070vi.A0j(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A04 = str3;
        this.A05 = list;
        this.A03 = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C20280AEo(String str, String str2) {
        this(str, str2, (String) null, (String) null, (List) null, 0);
        C18070vi.A0d(str2, 2);
    }
}
