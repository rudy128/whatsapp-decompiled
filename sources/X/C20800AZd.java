package X;

import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AZd  reason: case insensitive filesystem */
public final class C20800AZd implements C22462B8u {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1418477e A01;
    public final /* synthetic */ C22458B8q A02;
    public final /* synthetic */ AZG A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ WeakReference A0C;

    public C20800AZd(C1418477e r1, C22458B8q b8q, AZG azg, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, WeakReference weakReference, int i) {
        this.A0C = weakReference;
        this.A03 = azg;
        this.A06 = str;
        this.A0A = str2;
        this.A08 = str3;
        this.A00 = i;
        this.A01 = r1;
        this.A04 = str4;
        this.A0B = str5;
        this.A09 = str6;
        this.A07 = str7;
        this.A05 = str8;
        this.A02 = b8q;
    }

    public void Bof() {
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A0C);
        if (A0Z != null && !A0Z.Bed()) {
            AZG azg = this.A03;
            String str = this.A06;
            String str2 = this.A0A;
            String str3 = this.A08;
            int i = this.A00;
            C1418477e r6 = this.A01;
            String str4 = this.A04;
            String str5 = this.A0B;
            String str6 = this.A09;
            String str7 = this.A07;
            String str8 = this.A05;
            C22458B8q b8q = this.A02;
            JSONObject A15 = C17880vN.A15();
            try {
                A15.put("payerBankName", str);
                A15.put("backgroundColor", "#FFFFFF");
                A15.put("color", "#00FF00");
                A15.put("resendOTPFeature", "true");
            } catch (JSONException e) {
                azg.A01.A0A("getKeyConfig threw: ", e);
            }
            JSONObject A152 = C17880vN.A15();
            try {
                JSONArray A1A = AnonymousClass8BR.A1A();
                A1A.put(str2);
                A152.put("txnId", A1A);
                JSONArray A12 = AnonymousClass8BT.A12("com.whatsapp", "appId", A152);
                A12.put(AZG.A00(i));
                A152.put("credType", A12);
                A152.put("deviceId", azg.A03);
                A152.put("mobileNumber", str3);
                String A14 = C108955ca.A14(AnonymousClass8BX.A1Y());
                C18070vi.A0X(A14);
                A152.put("random", A14);
            } catch (Exception unused) {
                Log.e("exception thrown at getKeySaltForSetup");
            }
            String A012 = AZG.A01(r6, C18070vi.A0H(A152));
            JSONArray A022 = AZG.A02(A0Z, (AnonymousClass1KN) null, (String) null, str4, (String) null, str5, str6, i);
            if (A012 != null) {
                AZG.A03(A0Z, b8q, azg, str7, str8, A012, A022, A15, A152);
            }
        }
    }
}
