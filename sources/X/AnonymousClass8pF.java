package X;

import android.os.Parcelable;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8pF  reason: invalid class name */
public final class AnonymousClass8pF extends AnonymousClass8pI {
    public static final Parcelable.Creator CREATOR = new Object();
    public C1418477e A00;
    public C1418477e A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public int A06 = 1;

    public String A04() {
        JSONObject A15;
        Object obj;
        Object obj2;
        try {
            String A042 = super.A04();
            if (A042 != null) {
                A15 = C17880vN.A16(A042);
            } else {
                A15 = C17880vN.A15();
            }
            A15.put("v", this.A06);
            if (!C20061A5k.A02(this.A01)) {
                C1418477e r0 = this.A01;
                if (r0 != null) {
                    obj2 = r0.A00;
                } else {
                    obj2 = null;
                }
                A15.put("vpaHandle", obj2);
            }
            String str = this.A02;
            if (str != null) {
                A15.put("vpaId", str);
            }
            if (!C20061A5k.A02(this.A00)) {
                C1418477e r02 = this.A00;
                if (r02 != null) {
                    obj = r02.A00;
                } else {
                    obj = null;
                }
                A15.put("legalName", obj);
            }
            return A15.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiContactData toDBString threw: ", e);
            return null;
        }
    }

    public void A06(String str) {
        super.A06(str);
        if (str != null) {
            try {
                JSONObject A16 = C17880vN.A16(str);
                int optInt = A16.optInt("v", 1);
                this.A06 = optInt;
                if (optInt == 1) {
                    Class<String> cls = String.class;
                    this.A01 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls, A16.optString("vpaHandle", (String) null), "upiHandle");
                    this.A02 = A16.optString("vpaId", (String) null);
                    this.A00 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), cls, A16.optString("legalName", (String) null), "accountHolderName");
                }
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiContactData fromDBString threw: ", e);
            }
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ ver: ");
        A10.append(this.A06);
        A10.append(" jid: ");
        A10.append(this.A03);
        A10.append(" vpaHandle: ");
        A10.append(this.A01);
        A10.append(" nodal: ");
        A10.append(this.A03);
        A10.append(" nodalAllowed: ");
        A10.append(this.A04);
        A10.append(" notifAllowed: ");
        A10.append(this.A05);
        return AnonymousClass000.A0y(" ]", A10);
    }
}
