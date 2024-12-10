package X;

import android.app.Service;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AZG implements C22544BCb {
    public final A7U A00;
    public final AnonymousClass1QE A01 = AnonymousClass1QE.A00("IndiaUpiPinManagerClLatest", "payment-settings", "IN");
    public final AnonymousClass00H A02;
    public final String A03;
    public final Map A04;
    public final AnonymousClass190 A05;
    public final AnonymousClass11S A06;
    public final C18000vb A07;
    public final C18030ve A08;
    public final AnonymousClass18K A09;
    public final AXS A0A;
    public final AnonymousClass1QD A0B;
    public final AZ6 A0C;
    public final C30931ek A0D;
    public final AnonymousClass19T A0E;

    public AZG(AnonymousClass190 r18, AnonymousClass11S r19, C18000vb r20, C18030ve r21, AnonymousClass18K r22, A7U a7u, AXS axs, AnonymousClass1QD r25, AZ6 az6, C30931ek r27, AnonymousClass19T r28, AnonymousClass00H r29) {
        C18030ve r13 = r21;
        C18070vi.A0d(r13, 1);
        AnonymousClass00H r0 = r29;
        AnonymousClass11S r15 = r19;
        AnonymousClass3Ma.A1O(r0, 2, r15);
        AnonymousClass18K r12 = r22;
        AnonymousClass190 r16 = r18;
        C18070vi.A0g(r16, 4, r12);
        C30931ek r7 = r27;
        C18000vb r14 = r20;
        C18070vi.A0l(r14, r7);
        AnonymousClass1QD r9 = r25;
        C18070vi.A0d(r9, 8);
        AnonymousClass19T r6 = r28;
        A7U a7u2 = a7u;
        C72473Md.A1K(a7u2, r6);
        AZ6 az62 = az6;
        AXS axs2 = axs;
        C72473Md.A1L(az62, axs2);
        this.A08 = r13;
        this.A02 = r0;
        this.A06 = r15;
        this.A05 = r16;
        this.A09 = r12;
        this.A07 = r14;
        this.A0D = r7;
        this.A0B = r9;
        this.A00 = a7u2;
        this.A0E = r6;
        this.A0C = az62;
        this.A0A = axs2;
        this.A03 = r7.A01();
        AnonymousClass1D6[] r4 = new AnonymousClass1D6[2];
        C72463Mc.A1H("karur vysya bank", 8, r4);
        AnonymousClass1D6.A03("dena bank", 4, r4, 1);
        this.A04 = AnonymousClass1D7.A0C(r4);
    }

    public String BPg(AnonymousClass8pS r15, int i, boolean z) {
        Number number;
        Object obj;
        Object obj2;
        Object obj3;
        Number number2;
        Number number3;
        int i2;
        Number number4;
        int i3 = 0;
        switch (i) {
            case 1:
                C1418477e r11 = r15.A06;
                C1418477e r10 = r15.A07;
                C1418477e r9 = r15.A03;
                try {
                    JSONObject A15 = C17880vN.A15();
                    JSONArray A1A = AnonymousClass8BR.A1A();
                    C1418477e r0 = r15.A06;
                    if (!(r0 == null || (number2 = (Number) r0.A00) == null || number2.intValue() != 0)) {
                        String optString = C17880vN.A16((String) C20061A5k.A01(r15.A05)).optString("bank_name");
                        if (optString != null) {
                            number3 = C108945cZ.A1E(C108975cc.A0d(optString), this.A04);
                        } else {
                            number3 = null;
                        }
                        C144717Ik A0Z = AnonymousClass8BR.A0Z();
                        Class cls = Integer.TYPE;
                        if (number3 != null) {
                            i2 = number3.intValue();
                        } else {
                            i2 = 6;
                        }
                        r11 = AnonymousClass8BR.A0Y(A0Z, cls, Integer.valueOf(i2), "otpLength");
                        AnonymousClass8BX.A1D(this.A01, r11, "createCredRequired otpLength override: ", AnonymousClass000.A10());
                    }
                    if (AnonymousClass000.A0M(C20061A5k.A01(r11)) > 0) {
                        JSONObject A12 = AnonymousClass8BU.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "OTP");
                        A12.put("subtype", "SMS");
                        A12.put("dType", "NUM");
                        if (r11 != null) {
                            obj3 = r11.A00;
                        } else {
                            obj3 = null;
                        }
                        A12.put("dLength", obj3);
                        A1A.put(A12);
                        if (z) {
                            JSONObject A122 = AnonymousClass8BU.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "OTP");
                            A122.put("subtype", "AADHAAR");
                            A122.put("dType", "NUM");
                            A122.put("dLength", 6);
                            A1A.put(A122);
                        }
                    }
                    C144717Ik A0Z2 = AnonymousClass8BR.A0Z();
                    Class cls2 = Integer.TYPE;
                    if (AnonymousClass000.A0M(C20061A5k.A01(r10)) <= 0) {
                        obj = C17880vN.A0k();
                    } else if (r10 != null) {
                        obj = r10.A00;
                    } else {
                        obj = null;
                    }
                    Object obj4 = AnonymousClass8BR.A0Y(A0Z2, cls2, obj, "pinLength").A00;
                    C17960vV.A07(obj4);
                    if (AnonymousClass000.A0M(obj4) > 0) {
                        JSONObject A123 = AnonymousClass8BU.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "PIN");
                        A123.put("subtype", "MPIN");
                        A123.put("dType", "NUM");
                        A123.put("dLength", obj4);
                        A1A.put(A123);
                    }
                    if (r15.A01 == 2 && AnonymousClass000.A0M(C20061A5k.A01(r9)) > 0 && !z) {
                        JSONObject A124 = AnonymousClass8BU.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "PIN");
                        A124.put("subtype", "ATMPIN");
                        A124.put("dType", "NUM");
                        if (r9 != null) {
                            obj2 = r9.A00;
                        } else {
                            obj2 = null;
                        }
                        A124.put("dLength", obj2);
                        A1A.put(A124);
                    }
                    AnonymousClass1QE r2 = this.A01;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("createCredRequired credRequired length: ");
                    AnonymousClass8BV.A1F(r2, A10, A1A.length());
                    return AnonymousClass8BS.A0k(A1A, "CredAllowed", A15);
                } catch (JSONException e) {
                    this.A01.A0A("createCredRequired threw: ", e);
                    return null;
                }
            case 2:
                C1418477e r02 = r15.A07;
                if (!(r02 == null || (number = (Number) r02.A00) == null)) {
                    i3 = number.intValue();
                }
                JSONObject A152 = C17880vN.A15();
                JSONArray A1A2 = AnonymousClass8BR.A1A();
                if (i3 <= 0) {
                    i3 = 4;
                }
                JSONObject A125 = AnonymousClass8BU.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "PIN");
                A125.put("subtype", "MPIN");
                A125.put("dType", "NUM");
                A125.put("dLength", i3);
                A1A2.put(A125);
                JSONObject A126 = AnonymousClass8BU.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "PIN");
                A126.put("subtype", "NMPIN");
                A126.put("dType", "NUM");
                A126.put("dLength", i3);
                A1A2.put(A126);
                return AnonymousClass8BS.A0k(A1A2, "CredAllowed", A152);
            default:
                C1418477e r03 = r15.A07;
                if (!(r03 == null || (number4 = (Number) r03.A00) == null)) {
                    i3 = number4.intValue();
                }
                return BHG(i3);
        }
        this.A01.A0A("createCredRequired threw: ", e);
        return null;
    }

    public void CNz(C1418477e r16, C22458B8q b8q, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, WeakReference weakReference, int i) {
        String str9 = str8;
        ((A0F) this.A02.get()).A01(new C20800AZd(r16, b8q, this, str2, str3, str9, str4, str6, str7, str, str5, weakReference, i));
    }

    public static final String A00(int i) {
        switch (i) {
            case 1:
                return "setMpin";
            case 2:
                return "changeMpin";
            case 3:
            case 6:
                return "pay";
            case 4:
                return "reqBalChk";
            case 5:
                return "collect";
            default:
                return "mandate";
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.app.Service, X.8Bg] */
    public static final void A03(AnonymousClass1FU r11, C22458B8q b8q, AZG azg, String str, String str2, String str3, JSONArray jSONArray, JSONObject jSONObject, JSONObject jSONObject2) {
        int i;
        int i2;
        if (azg.A0B.A03().getBoolean("payment_account_recovered", false)) {
            AXS axs = azg.A0A;
            if (!axs.A0U(axs.A0G())) {
                r11.A3q(AnonymousClass8BS.A04(r11), true);
                A7U a7u = azg.A00;
                a7u.A04.A07.add("done");
                AnonymousClass1QE r2 = azg.A01;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("clearStates: ");
                AnonymousClass8BV.A1D(r2, a7u.A04, A10);
                a7u.A0A();
                return;
            }
        }
        if (C137346vJ.A00(azg.A08, azg.A09, azg.A0E, "pinEntry")) {
            i = 2131895369;
            i2 = 2131895368;
        } else if (AnonymousClass9R8.A00()) {
            azg.A0C.BiL((Integer) null, "upi_payments_unavailable_on_legacy_android_dialog", "new_payment", 0);
            i = 2131897417;
            i2 = 2131897416;
        } else {
            C161318Cr r1 = new C161318Cr(new Handler(), b8q, azg);
            ? service = new Service();
            service.A00 = new AnonymousClass8CY(service);
            service.A01 = r1;
            String valueOf = String.valueOf(jSONObject);
            String A0H = C18070vi.A0H(jSONObject2);
            String A0H2 = C18070vi.A0H(jSONArray);
            String A0H3 = C18070vi.A0H(azg.A07.A0N());
            C187079fE r22 = ((A0F) azg.A02.get()).A00;
            if (r22 != null) {
                Log.d(C187079fE.class.getName(), "Get Credential called");
                try {
                    r22.A03.BPh("NPCI", str, str2, valueOf, A0H, A0H2, str3, A0H3, AnonymousClass8CY.A01(service.A00));
                    return;
                } catch (RemoteException unused) {
                    Log.e("CLServices", "Remote Exception in getCredential");
                    return;
                }
            } else {
                return;
            }
        }
        r11.BhU(new Object[0], i, i2);
    }

    public static void A04(StringBuilder sb, String str) {
        if (str.length() > 0) {
            sb.append(str);
            sb.append("|");
        }
    }

    public void CO0(AnonymousClass1KN r23, C1418477e r24, C175758zE r25, C22458B8q b8q, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, WeakReference weakReference, int i, boolean z) {
        String str13 = str5;
        String str14 = str4;
        String str15 = str3;
        String str16 = str2;
        String str17 = str;
        WeakReference weakReference2 = weakReference;
        C22458B8q b8q2 = b8q;
        String str18 = str12;
        C175758zE r4 = r25;
        String str19 = str11;
        C1418477e r3 = r24;
        String str20 = str10;
        AnonymousClass1KN r2 = r23;
        String str21 = str9;
        ((A0F) this.A02.get()).A01(new C20801AZe(r2, r3, r4, b8q2, this, str16, str13, str15, str14, str21, str7, str6, str8, str19, str18, str17, str20, weakReference2, i, z));
    }

    public static final String A01(C1418477e r13, String str) {
        byte[] bArr;
        JSONObject A16 = C17880vN.A16(str);
        JSONArray jSONArray = A16.getJSONArray("txnId");
        C18070vi.A0X(jSONArray);
        String optString = jSONArray.optString(0);
        JSONArray jSONArray2 = A16.getJSONArray("credType");
        C18070vi.A0X(jSONArray2);
        String optString2 = jSONArray2.optString(0);
        String optString3 = A16.optString("txnAmount");
        String optString4 = A16.optString("appId");
        String optString5 = A16.optString("deviceId");
        String optString6 = A16.optString("mobileNumber");
        String optString7 = A16.optString("payerAddr");
        String optString8 = A16.optString("payeeAddr");
        String A11 = C108955ca.A11("random", A16);
        try {
            StringBuilder sb = new StringBuilder(150);
            if (optString2 != null) {
                A04(sb, optString2);
            }
            if (optString != null) {
                A04(sb, optString);
            }
            if (optString4 != null) {
                A04(sb, optString4);
            }
            if (optString6 != null) {
                A04(sb, optString6);
            }
            if (optString5 != null) {
                A04(sb, optString5);
            }
            if (optString7 != null) {
                A04(sb, optString7);
            }
            if (optString8 != null) {
                A04(sb, optString8);
            }
            if (optString3 != null) {
                A04(sb, optString3);
            }
            int lastIndexOf = sb.lastIndexOf("|");
            if (lastIndexOf != -1 && lastIndexOf == sb.length() - 1) {
                sb.deleteCharAt(lastIndexOf);
            }
            byte[] bArr2 = (byte[]) r13.A00;
            if (bArr2 != null) {
                byte[] A002 = AnonymousClass9RQ.A00(C18070vi.A0H(sb), A11);
                SecretKeySpec A0v = AnonymousClass8BS.A0v(bArr2);
                IvParameterSpec A19 = AnonymousClass8BR.A19(Base64.decode(A11, 2));
                Cipher A18 = AnonymousClass8BR.A18();
                C18070vi.A0X(A18);
                bArr = AnonymousClass8BS.A1Q(A0v, A19, A18, A002, 1);
                C18070vi.A0X(bArr);
            } else {
                bArr = null;
            }
            return Base64.encodeToString(bArr, 0);
        } catch (Exception e) {
            com.whatsapp.util.Log.e("CryptoUtils exception on CreateTrust Base64.encodeToString");
            throw e;
        } catch (Exception unused) {
            com.whatsapp.util.Log.e("CryptoUtils exception on CreateTrust");
            return null;
        }
    }

    public static final JSONArray A02(Context context, AnonymousClass1KN r7, String str, String str2, String str3, String str4, String str5, int i) {
        String str6;
        JSONArray A1A = AnonymousClass8BR.A1A();
        if (str != null) {
            try {
                if (str.length() != 0) {
                    A1A.put(C17880vN.A15().putOpt(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "payeeName").putOpt("value", str));
                }
            } catch (JSONException e) {
                throw AnonymousClass8BR.A0x(e);
            }
        }
        if (str2.length() > 0) {
            A1A.put(C17880vN.A15().putOpt(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "account").putOpt("value", str2));
        }
        if (!(str4 == null || str4.length() == 0)) {
            A1A.put(C17880vN.A15().putOpt(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "refId").putOpt("value", str4));
        }
        if (r7 != null) {
            A1A.put(C17880vN.A15().putOpt(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "txnAmount").putOpt("value", r7.toString()));
        }
        if (!(str3 == null || str3.length() == 0)) {
            A1A.put(C17880vN.A15().putOpt(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, context.getString(2131899311)).putOpt("value", str3));
        }
        if (!(str5 == null || str5.length() == 0)) {
            A1A.put(C17880vN.A15().putOpt(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, context.getString(2131893595)).putOpt("value", str5));
        }
        switch (i) {
            case 7:
                str6 = "register";
                break;
            case 8:
                str6 = "create";
                break;
            case 9:
                str6 = "modify";
                break;
            case 10:
                str6 = "revoke";
                break;
            case 11:
                str6 = "pause";
                break;
            case 12:
                str6 = "unpause";
                break;
            default:
                str6 = null;
                break;
        }
        if (!(str6 == null || str6.length() == 0)) {
            A1A.put(C17880vN.A15().putOpt(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "mandateSubType").putOpt("value", str6));
        }
        return A1A;
    }

    public String BHG(int i) {
        try {
            JSONObject A15 = C17880vN.A15();
            JSONArray A1A = AnonymousClass8BR.A1A();
            if (i <= 0) {
                i = 4;
            }
            JSONObject A152 = C17880vN.A15();
            A152.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "PIN");
            A152.put("subtype", "MPIN");
            A152.put("dType", "NUM");
            A152.put("dLength", i);
            A1A.put(A152);
            return AnonymousClass8BS.A0k(A1A, "CredAllowed", A15);
        } catch (JSONException e) {
            this.A01.A0A("createCredRequired threw: ", e);
            return null;
        }
    }
}
