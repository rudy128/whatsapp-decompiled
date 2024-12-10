package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Be7  reason: case insensitive filesystem */
public final class C23257Be7 extends C23219BdV {
    public static final HashMap A06;
    public static final Parcelable.Creator CREATOR = new Object();
    public C23258Be8 A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;
    public final Set A05;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, android.os.Parcelable$Creator] */
    static {
        HashMap A11 = C17880vN.A11();
        A06 = A11;
        A11.put("authenticatorInfo", new C23196Bcq(C23258Be8.class, "authenticatorInfo", 11, 11, 2, false, false));
        A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, new C23196Bcq((Class) null, PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, 7, 7, 3, false, false));
        A11.put("package", new C23196Bcq((Class) null, "package", 7, 7, 4, false, false));
    }

    public C23257Be7(C23258Be8 be8, String str, String str2, String str3, Set set, int i) {
        this.A05 = set;
        this.A04 = i;
        this.A00 = be8;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        Set set = this.A05;
        if (C108965cb.A1b(set, 1)) {
            C26293Cx2.A06(parcel, 1, this.A04);
        }
        if (C108965cb.A1b(set, 2)) {
            C26293Cx2.A09(parcel, this.A00, 2, i, true);
        }
        if (C108965cb.A1b(set, 3)) {
            C26293Cx2.A0A(parcel, this.A01, 3, true);
        }
        if (C108965cb.A1b(set, 4)) {
            C26293Cx2.A0A(parcel, this.A02, 4, true);
        }
        if (C108965cb.A1b(set, 5)) {
            C26293Cx2.A0A(parcel, this.A03, 5, true);
        }
        C26293Cx2.A05(parcel, A002);
    }

    public C23257Be7() {
        this.A05 = new HashSet(3);
        this.A04 = 1;
    }
}
