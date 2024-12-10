package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.BcS  reason: case insensitive filesystem */
public final class C23172BcS extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final DSS A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (obj instanceof C23172BcS) {
            C23172BcS bcS = (C23172BcS) obj;
            if (this.A01 != bcS.A01 || !C25332Cdd.A01(this.A00, bcS.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.A01;
        int A002 = C26293Cx2.A00(parcel);
        C26293Cx2.A08(parcel, 1, z);
        C26293Cx2.A0D(parcel, DJ0.A0N(this.A00), 2, false);
        C26293Cx2.A05(parcel, A002);
    }

    public C23172BcS(DSS dss, boolean z) {
        this.A01 = z;
        this.A00 = dss;
    }

    public final JSONObject A00() {
        byte[] bArr;
        try {
            JSONObject A15 = C17880vN.A15();
            if (this.A01) {
                A15.put("enabled", true);
            }
            DSS dss = this.A00;
            if (dss == null) {
                bArr = null;
            } else {
                bArr = dss.A04();
            }
            if (bArr != null) {
                JSONObject A152 = C17880vN.A15();
                A152.put("first", Base64.encodeToString(Arrays.copyOf(bArr, 32), 11));
                if (bArr.length == 64) {
                    A152.put("second", Base64.encodeToString(Arrays.copyOfRange(bArr, 32, 64), 11));
                }
                A15.put("results", A152);
            }
            return A15;
        } catch (JSONException e) {
            throw BE6.A0o("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1N(A1b, this.A01);
        return AnonymousClass000.A0P(this.A00, A1b, 1);
    }

    public final String toString() {
        String obj = A00().toString();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AuthenticationExtensionsPrfOutputs{");
        return BEA.A0n(obj, A10);
    }
}
