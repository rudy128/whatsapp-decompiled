package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.annotationprocessors.modelgen.iface.ModelgenUtils;

/* renamed from: X.D3v  reason: case insensitive filesystem */
public class C26555D3v implements Parcelable {
    public static final Parcelable.Creator CREATOR = D3B.A00(25);
    public final Boolean A00;
    public final Boolean A01;
    public final String A02;
    public final BVX A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26555D3v) {
                C26555D3v d3v = (C26555D3v) obj;
                if (!ModelgenUtils.equal(this.A00, d3v.A00) || !ModelgenUtils.equal((Object) null, (Object) null) || !ModelgenUtils.equal(this.A03, d3v.A03) || !ModelgenUtils.equal(this.A01, d3v.A01) || !ModelgenUtils.equal(this.A02, d3v.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(1, this.A00), (Object) null), this.A03), this.A01), this.A02);
    }

    public void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.A00;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(0);
        BVX bvx = this.A03;
        if (bvx == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(bvx, i);
        }
        Boolean bool2 = this.A01;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        String str = this.A02;
        if (str == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(str);
    }

    public C26555D3v(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        boolean z = false;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = Boolean.valueOf(AnonymousClass000.A1T(parcel.readInt(), 1));
        }
        if (parcel.readInt() != 0) {
            parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (BVX) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Boolean.valueOf(parcel.readInt() == 1 ? true : z);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
    }

    public C26555D3v(C24849CMs cMs) {
        this.A00 = null;
        this.A03 = null;
        this.A01 = cMs.A00;
        this.A02 = cMs.A01;
    }
}
