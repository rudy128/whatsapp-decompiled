package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Be5  reason: case insensitive filesystem */
public final class C23255Be5 extends C23219BdV {
    public static final HashMap A05;
    public static final Parcelable.Creator CREATOR = new Object();
    public C23256Be6 A00;
    public ArrayList A01;
    public int A02;
    public final int A03;
    public final Set A04;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, android.os.Parcelable$Creator] */
    static {
        HashMap A11 = C17880vN.A11();
        A05 = A11;
        A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA, new C23196Bcq(C23257Be7.class, PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA, 11, 11, 2, true, true));
        A11.put("progress", new C23196Bcq(C23256Be6.class, "progress", 11, 11, 4, false, false));
    }

    public C23255Be5(C23256Be6 be6, ArrayList arrayList, Set set, int i, int i2) {
        this.A04 = set;
        this.A03 = i;
        this.A01 = arrayList;
        this.A02 = i2;
        this.A00 = be6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        Set set = this.A04;
        if (C108965cb.A1b(set, 1)) {
            C26293Cx2.A06(parcel, 1, this.A03);
        }
        if (C108965cb.A1b(set, 2)) {
            C26293Cx2.A0C(parcel, this.A01, 2, true);
        }
        if (C108965cb.A1b(set, 3)) {
            C26293Cx2.A06(parcel, 3, this.A02);
        }
        if (C108965cb.A1b(set, 4)) {
            C26293Cx2.A09(parcel, this.A00, 4, i, true);
        }
        C26293Cx2.A05(parcel, A002);
    }

    public C23255Be5() {
        this.A04 = new HashSet(1);
        this.A03 = 1;
    }
}
