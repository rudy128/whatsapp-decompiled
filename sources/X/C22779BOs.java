package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.BOs  reason: case insensitive filesystem */
public final class C22779BOs extends D9F {
    public static final Parcelable.Creator CREATOR = D3B.A00(16);
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public C22779BOs(String str, byte[] bArr) {
        super("APIC");
        this.A02 = str;
        this.A01 = null;
        this.A00 = 3;
        this.A03 = bArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C22779BOs bOs = (C22779BOs) obj;
            if (this.A00 != bOs.A00 || !Util.A0D(this.A02, bOs.A02) || !Util.A0D(this.A01, bOs.A01) || !Arrays.equals(this.A03, bOs.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A022 = (((527 + this.A00) * 31) + AnonymousClass8BW.A02(this.A02)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return ((A022 + i) * 31) + Arrays.hashCode(this.A03);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A00);
        A10.append(": mimeType=");
        A10.append(this.A02);
        A10.append(", description=");
        return AnonymousClass000.A0y(this.A01, A10);
    }

    public C22779BOs(Parcel parcel) {
        super("APIC");
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.createByteArray();
    }
}
