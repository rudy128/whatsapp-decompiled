package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.annotationprocessors.modelgen.iface.ModelgenUtils;

/* renamed from: X.D3z  reason: case insensitive filesystem */
public class C26559D3z implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(37);
    public final AnonymousClass1IX A00;
    public final String A01;
    public final String A02;
    public final Float A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Long A07;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26559D3z) {
                C26559D3z d3z = (C26559D3z) obj;
                if (!ModelgenUtils.equal(this.A01, d3z.A01) || !ModelgenUtils.equal(this.A00, d3z.A00) || !ModelgenUtils.equal(this.A04, d3z.A04) || !ModelgenUtils.equal(this.A03, d3z.A03) || !ModelgenUtils.equal(this.A05, d3z.A05) || !ModelgenUtils.equal(this.A02, d3z.A02) || !ModelgenUtils.equal(this.A07, d3z.A07) || !ModelgenUtils.equal(this.A06, d3z.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(1, this.A01), this.A00), this.A04), this.A03), this.A05), this.A02), this.A07), this.A06);
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = this.A01;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        AnonymousClass1IX r1 = this.A00;
        if (r1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(r1.size());
            AnonymousClass1IZ it = r1.iterator();
            while (it.hasNext()) {
                parcel.writeString(C17880vN.A0v(it));
            }
        }
        C108995ce.A0r(parcel, this.A04);
        Float f = this.A03;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        C108995ce.A0r(parcel, this.A05);
        String str2 = this.A02;
        if (str2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str2);
        }
        Long l = this.A07;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        C108995ce.A0r(parcel, this.A06);
    }

    public C26559D3z(Parcel parcel) {
        getClass().getClassLoader();
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            for (int i = 0; i < readInt; i++) {
                strArr[i] = parcel.readString();
            }
            this.A00 = AnonymousClass1IX.copyOf((Object[]) strArr);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = AnonymousClass8BT.A0i(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = Float.valueOf(parcel.readFloat());
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = AnonymousClass8BT.A0i(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = AnonymousClass8BT.A0i(parcel);
        }
    }

    public C26559D3z(CNS cns) {
        this.A01 = cns.A01;
        this.A00 = cns.A00;
        this.A04 = null;
        this.A03 = null;
        this.A05 = null;
        this.A02 = null;
        this.A07 = null;
        this.A06 = null;
    }
}
