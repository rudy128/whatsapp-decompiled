package X;

import java.lang.ref.WeakReference;
import java.security.NoSuchAlgorithmException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AZe  reason: case insensitive filesystem */
public final class C20801AZe implements C22462B8u {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1KN A01;
    public final /* synthetic */ C1418477e A02;
    public final /* synthetic */ C175758zE A03;
    public final /* synthetic */ C22458B8q A04;
    public final /* synthetic */ AZG A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ WeakReference A0I;
    public final /* synthetic */ boolean A0J;

    public C20801AZe(AnonymousClass1KN r2, C1418477e r3, C175758zE r4, C22458B8q b8q, AZG azg, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, WeakReference weakReference, int i, boolean z) {
        this.A0I = weakReference;
        this.A05 = azg;
        this.A08 = str;
        this.A0J = z;
        this.A0G = str2;
        this.A01 = r2;
        this.A0F = str3;
        this.A0D = str4;
        this.A0C = str5;
        this.A00 = i;
        this.A02 = r3;
        this.A03 = r4;
        this.A0A = str6;
        this.A06 = str7;
        this.A0B = str8;
        this.A0H = str9;
        this.A0E = str10;
        this.A09 = str11;
        this.A07 = str12;
        this.A04 = b8q;
    }

    public void Bof() {
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A0I);
        if (A0Z != null && !A0Z.Bed()) {
            AZG azg = this.A05;
            String str = this.A08;
            boolean z = this.A0J;
            String str2 = this.A0G;
            AnonymousClass1KN r23 = this.A01;
            String str3 = this.A0F;
            String str4 = this.A0D;
            String str5 = this.A0C;
            int i = this.A00;
            C1418477e r6 = this.A02;
            C175758zE r5 = this.A03;
            String str6 = this.A0A;
            String str7 = this.A06;
            String str8 = this.A0B;
            String str9 = this.A0H;
            String str10 = this.A0E;
            String str11 = this.A09;
            String str12 = this.A07;
            C22458B8q b8q = this.A04;
            JSONObject A15 = C17880vN.A15();
            try {
                A15.put("payerBankName", str);
                A15.put("backgroundColor", "#FFFFFF");
                A15.put("color", "#00FF00");
                if (z) {
                    A15.put("verifiedMerchant", "true");
                }
            } catch (JSONException e) {
                azg.A01.A0A("getKeyConfig threw: ", e);
            }
            String obj = r23.toString();
            JSONObject A152 = C17880vN.A15();
            try {
                JSONArray A1A = AnonymousClass8BR.A1A();
                A1A.put(str2);
                A152.put("txnId", A1A);
                A152.put("txnAmount", obj);
                A152.put("deviceId", azg.A03);
                A152.put("appId", "com.whatsapp");
                JSONArray A12 = AnonymousClass8BT.A12(str5, "mobileNumber", A152);
                A12.put(AZG.A00(i));
                A152.put("credType", A12);
                A152.put("payerAddr", str3);
                A152.put("payeeAddr", str4);
                String A14 = C108955ca.A14(AnonymousClass8BX.A1Y());
                C18070vi.A0X(A14);
                A152.put("random", A14);
                azg.A01.A04("getKeySaltWithTransactionDetails");
                String A012 = AZG.A01(r6, C18070vi.A0H(A152));
                r5.A01 = A152;
                JSONArray A022 = AZG.A02(A0Z, r23, str6, str7, str8, str9, str10, i);
                if (A012 != null) {
                    AZG.A03(A0Z, b8q, azg, str11, str12, A012, A022, A15, A152);
                }
            } catch (JSONException e2) {
                throw AnonymousClass8BR.A0x(e2);
            } catch (NoSuchAlgorithmException e3) {
                throw AnonymousClass8BR.A0x(e3);
            }
        }
    }
}
