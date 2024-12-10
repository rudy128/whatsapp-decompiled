package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.Jid;

/* renamed from: X.1MD  reason: invalid class name */
public final class AnonymousClass1MD implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final byte A00;
    public final Jid A01;
    public final String A02;
    public final String A03;

    public AnonymousClass1MD(Jid jid, String str, String str2, byte b) {
        boolean z;
        C18070vi.A0d(str, 1);
        C18070vi.A0d(str2, 2);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = jid;
        this.A00 = b;
        if (jid != null) {
            if (jid.isProtocolCompliant() || (!C22971Dz.A00 ? (jid instanceof C173458v6) : jid.getType() == 8)) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Jid: ");
            sb.append(jid.getRawString());
            sb.append(" is not protocol compliant");
            C17960vV.A0G(z, sb.toString());
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A18(getClass(), obj.getClass())) {
                return false;
            }
            AnonymousClass1MD r5 = (AnonymousClass1MD) obj;
            if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeByte(this.A00);
    }

    public int hashCode() {
        return ((31 + this.A02.hashCode()) * 31) + this.A03.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyValue{key='");
        sb.append(this.A02);
        sb.append("', value='");
        sb.append(this.A03);
        sb.append("', type='");
        sb.append(this.A00);
        sb.append("'}");
        return sb.toString();
    }

    public AnonymousClass1MD(String str, long j) {
        this(str, String.valueOf(j));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass1MD(String str, String str2) {
        this((Jid) null, str, str2, (byte) 0);
        C18070vi.A0d(str, 1);
        C18070vi.A0d(str2, 2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass1MD(Jid jid, String str) {
        this(jid, str, jid.getRawString(), (byte) 1);
        C18070vi.A0d(str, 1);
        C18070vi.A0d(jid, 2);
    }

    public AnonymousClass1MD(String str, int i) {
        this(str, String.valueOf(i));
    }
}
