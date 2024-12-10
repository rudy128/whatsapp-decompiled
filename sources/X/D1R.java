package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

public final class D1R implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C26300CxD.A02(parcel);
        ArrayList arrayList = null;
        C23071Bam bam = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = C26300CxD.A0G(parcel, LocationRequest.CREATOR, readInt);
            } else if (c == 2) {
                z = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
            } else if (c == 3) {
                z2 = AnonymousClass000.A1O(C26300CxD.A03(parcel, readInt));
            } else if (c != 5) {
                C26300CxD.A0I(parcel, readInt);
            } else {
                bam = (C23071Bam) C26300CxD.A0A(parcel, C23071Bam.CREATOR, readInt);
            }
        }
        C26300CxD.A0H(parcel, A02);
        return new C23083Bay(bam, arrayList, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C23083Bay[i];
    }
}
