package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

/* renamed from: X.2v3  reason: invalid class name and case insensitive filesystem */
public final class C64612v3 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new D3B(4);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.A04);
        sb.append(" (");
        sb.append(this.A07);
        sb.append(")}:");
        if (this.A09) {
            sb.append(" fromLayout");
        }
        if (this.A0B) {
            sb.append(" dynamicContainer");
        }
        int i = this.A00;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.A05;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.A0D) {
            sb.append(" retainInstance");
        }
        if (this.A0C) {
            sb.append(" removing");
        }
        if (this.A08) {
            sb.append(" detached");
        }
        if (this.A0A) {
            sb.append(" hidden");
        }
        String str2 = this.A06;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.A03);
        }
        if (this.A0E) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A0E ? 1 : 0);
    }

    public C64612v3(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A07 = parcel.readString();
        boolean z = true;
        this.A09 = AnonymousClass000.A1O(parcel.readInt());
        this.A0B = AnonymousClass000.A1O(parcel.readInt());
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A05 = parcel.readString();
        this.A0D = AnonymousClass000.A1O(parcel.readInt());
        this.A0C = AnonymousClass000.A1O(parcel.readInt());
        this.A08 = AnonymousClass000.A1O(parcel.readInt());
        this.A0A = AnonymousClass000.A1O(parcel.readInt());
        this.A02 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0E = parcel.readInt() == 0 ? false : z;
    }

    public C64612v3(Fragment fragment) {
        this.A04 = C17890vO.A0U(fragment);
        this.A07 = fragment.A0V;
        this.A09 = fragment.A0a;
        this.A0B = fragment.A0e;
        this.A01 = fragment.A03;
        this.A00 = fragment.A01;
        this.A05 = fragment.A0T;
        this.A0D = fragment.A0l;
        this.A0C = fragment.A0j;
        this.A08 = fragment.A0Z;
        this.A0A = fragment.A0c;
        this.A02 = fragment.A0K.ordinal();
        this.A06 = fragment.A0U;
        this.A03 = fragment.A05;
        this.A0E = fragment.A0n;
    }
}
