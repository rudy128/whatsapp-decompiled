package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.BcU  reason: case insensitive filesystem */
public class C23174BcU extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C23114BbT A00;
    public final C23117BbW A01;
    public final C23127Bbg A02;
    public final C23172BcS A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (obj instanceof C23174BcU) {
            C23174BcU bcU = (C23174BcU) obj;
            if (!C25332Cdd.A01(this.A01, bcU.A01) || !C25332Cdd.A01(this.A02, bcU.A02) || !C25332Cdd.A01(this.A00, bcU.A00) || !C25332Cdd.A01(this.A03, bcU.A03) || !C25332Cdd.A01(this.A04, bcU.A04)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A01, 5);
        A1b[1] = this.A02;
        A1b[2] = this.A00;
        A1b[3] = this.A03;
        return AnonymousClass000.A0P(this.A04, A1b, 4);
    }

    public C23174BcU(C23114BbT bbT, C23117BbW bbW, C23127Bbg bbg, C23172BcS bcS, String str) {
        this.A01 = bbW;
        this.A02 = bbg;
        this.A00 = bbT;
        this.A03 = bcS;
        this.A04 = str;
    }

    public final JSONObject A00() {
        RuntimeException runtimeException;
        try {
            JSONObject A15 = C17880vN.A15();
            C23114BbT bbT = this.A00;
            if (bbT != null) {
                try {
                    JSONObject A152 = C17880vN.A15();
                    A152.put(PublicKeyCredentialControllerUtility.JSON_KEY_RK, bbT.A00);
                    A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS, A152);
                } catch (JSONException e) {
                    runtimeException = BE6.A0o("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                    throw runtimeException;
                }
            }
            C23117BbW bbW = this.A01;
            if (bbW != null) {
                try {
                    JSONArray A1A = AnonymousClass8BR.A1A();
                    List list = bbW.A00;
                    if (list != null) {
                        for (int i = 0; i < list.size(); i++) {
                            C23132Bbl bbl = (C23132Bbl) list.get(i);
                            JSONArray A1A2 = AnonymousClass8BR.A1A();
                            A1A2.put(bbl.A02);
                            A1A2.put(bbl.A01);
                            A1A2.put(bbl.A02);
                            A1A.put(i, A1A2);
                        }
                    }
                    A15.put("uvm", A1A);
                } catch (JSONException e2) {
                    runtimeException = BE6.A0o("Error encoding UvmEntries to JSON object", e2);
                    throw runtimeException;
                }
            }
            C23172BcS bcS = this.A03;
            if (bcS != null) {
                A15.put("prf", bcS.A00());
            }
            String str = this.A04;
            if (str != null) {
                A15.put("txAuthSimple", str);
            }
            return A15;
        } catch (JSONException e3) {
            throw BE6.A0o("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e3);
        }
    }

    public final String toString() {
        String obj = A00().toString();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AuthenticationExtensionsClientOutputs{");
        return BEA.A0n(obj, A10);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0I = DJ0.A0I(parcel, this.A01, i);
        C26293Cx2.A09(parcel, this.A02, 2, i, A0I);
        C26293Cx2.A09(parcel, this.A00, 3, i, A0I);
        C26293Cx2.A09(parcel, this.A03, 4, i, A0I);
        C26293Cx2.A0A(parcel, this.A04, 5, A0I);
        C26293Cx2.A05(parcel, A002);
    }
}
