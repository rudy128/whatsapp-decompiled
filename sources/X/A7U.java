package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class A7U {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass8pH A03;
    public C196259ui A04;
    public ArrayList A05;
    public HashMap A06;
    public final AnonymousClass190 A07;
    public final AXS A08;
    public final AnonymousClass00H A09;
    public final AZ6 A0A;

    public static AnonymousClass8pH A02(A7U a7u, String str) {
        String str2;
        String str3;
        if (str == null) {
            str2 = "PAY: IndiaUPIPaymentSetup pspName is null or empty";
        } else {
            ArrayList arrayList = a7u.A05;
            if (arrayList == null || arrayList.size() <= 0) {
                str2 = "PAY: IndiaUPIPaymentSetup pspConfig list is null or empty";
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass8pH r2 = (AnonymousClass8pH) it.next();
                    Bundle bundle = r2.A00;
                    if (bundle != null) {
                        str3 = bundle.getString("providerType");
                    } else {
                        str3 = null;
                    }
                    if (str.equals(str3)) {
                        return r2;
                    }
                }
                return null;
            }
        }
        Log.e(str2);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r2 != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r2.isEmpty() != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        r0 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return r1.getStringArrayList("pspRouting");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A08(X.AnonymousClass8pS r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L_0x004e
            java.util.ArrayList r2 = r5.A0F
        L_0x0005:
            boolean r0 = r4.A0B()
            if (r0 == 0) goto L_0x0037
            java.util.ArrayList r1 = r4.A05
            if (r1 == 0) goto L_0x0037
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0037
            if (r2 == 0) goto L_0x001d
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0039
        L_0x001d:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.lang.Object r0 = X.AnonymousClass8BS.A0Y(r1)
            X.8pH r0 = (X.AnonymousClass8pH) r0
            android.os.Bundle r1 = r0.A00
            if (r1 == 0) goto L_0x0035
            java.lang.String r0 = "providerType"
            java.lang.String r0 = r1.getString(r0)
        L_0x0031:
            r2.add(r0)
        L_0x0034:
            return r2
        L_0x0035:
            r0 = 0
            goto L_0x0031
        L_0x0037:
            if (r2 == 0) goto L_0x003f
        L_0x0039:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0034
        L_0x003f:
            X.8pH r0 = r4.A03
            if (r0 == 0) goto L_0x004d
            android.os.Bundle r1 = r0.A00
            if (r1 == 0) goto L_0x004d
            java.lang.String r0 = "pspRouting"
            java.util.ArrayList r3 = r1.getStringArrayList(r0)
        L_0x004d:
            return r3
        L_0x004e:
            r2 = r3
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7U.A08(X.8pS):java.util.ArrayList");
    }

    public static C191049lw A00(AnonymousClass91T r0) {
        return (C191049lw) r0.A0M.A09.get();
    }

    public static AnonymousClass8pH A01(AnonymousClass8pS r4, A7U a7u) {
        AXS axs = a7u.A08;
        if (axs.A0R()) {
            String A0G = axs.A0G();
            if (TextUtils.isEmpty(A0G)) {
                axs.CRC(r4);
                if (r4 != null) {
                    A0G = r4.A09;
                } else {
                    A0G = axs.A0G();
                }
            }
            if (!TextUtils.isEmpty(A0G)) {
                return A02(a7u, A0G);
            }
            return null;
        }
        ArrayList A082 = a7u.A08(r4);
        if (A082 != null && !A082.isEmpty()) {
            return A02(a7u, C108945cZ.A1H(A082, a7u.A01 % A082.size()));
        }
        Log.e("PAY: IndiaUPIPaymentSetup psps list is null or empty");
        return null;
    }

    public String A05(AnonymousClass8pS r4) {
        String str;
        String A0G = this.A08.A0G();
        if (!TextUtils.isEmpty(A0G)) {
            return A0G;
        }
        AnonymousClass8pH A012 = A01(r4, this);
        if (A012 == null) {
            return "ICICI";
        }
        Bundle bundle = A012.A00;
        if (bundle != null) {
            str = bundle.getString("providerType");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "ICICI";
        }
        Bundle bundle2 = A012.A00;
        if (bundle2 != null) {
            return bundle2.getString("providerType");
        }
        return null;
    }

    public String A07(String str, HashMap hashMap, int i) {
        Object obj = hashMap.get(str);
        String A1G = C108945cZ.A1G(str, hashMap);
        if (obj == null || A1G == null) {
            return null;
        }
        try {
            JSONObject A16 = C17880vN.A16(A1G);
            String str2 = "pay";
            switch (i) {
                case 1:
                    str2 = "setMpin";
                    break;
                case 2:
                    str2 = "changeMpin";
                    break;
                case 3:
                case 6:
                    break;
                case 4:
                    str2 = "reqBalChk";
                    break;
                case 5:
                    str2 = "collect";
                    break;
                default:
                    str2 = "mandate";
                    break;
            }
            JSONObject jSONObject = C17880vN.A16(A16.getString(str2)).getJSONObject("data");
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(jSONObject.getString("code"));
            A10.append(",");
            A10.append(jSONObject.getString("ki"));
            A10.append(",");
            return AnonymousClass000.A0y(jSONObject.getString("encryptedBase64String"), A10);
        } catch (JSONException e) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("PAY: IndiaUPIPaymentBankSetup getEncryptedBlob read: ");
            A102.append(str);
            Log.i(AnonymousClass000.A0y("  blob threw: ", A102), e);
            return null;
        }
    }

    public void A09() {
        ArrayList arrayList;
        int i = this.A02 + 1;
        if (i != this.A00 || (arrayList = this.A05) == null || arrayList.size() <= 1) {
            this.A02 = i;
            return;
        }
        this.A02 = 0;
        this.A01++;
    }

    public void A0A() {
        this.A04 = new C196259ui();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A05 = null;
        this.A03 = null;
        this.A06 = null;
        this.A0A.reset();
    }

    public boolean A0B() {
        C191049lw r3 = (C191049lw) this.A09.get();
        if (!C18020vd.A05(C18040vf.A02, r3.A02.A02, 7727) || !(!r3.A03.isEmpty())) {
            return false;
        }
        return true;
    }

    public A7U(AnonymousClass190 r1, AXS axs, AZ6 az6, AnonymousClass00H r4) {
        this.A07 = r1;
        this.A09 = r4;
        this.A0A = az6;
        this.A08 = axs;
        A0A();
    }

    public static ArrayList A03(AnonymousClass8pS r0, A7U a7u) {
        Bundle bundle;
        ArrayList<String> stringArrayList;
        AnonymousClass8pH A012 = A01(r0, a7u);
        if (A012 != null && (bundle = A012.A00) != null && (stringArrayList = bundle.getStringArrayList("smsGateways")) != null && stringArrayList.size() > 0 && !stringArrayList.isEmpty()) {
            return stringArrayList;
        }
        Log.e("PAY: IndiaUPIPaymentSetup smsGateways list is null or empty");
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.9NK] */
    public AnonymousClass9NK A04(C196259ui r8, ArrayList arrayList) {
        String str;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it = arrayList.iterator();
        AnonymousClass8pH r2 = null;
        while (it.hasNext()) {
            C64502us r5 = (C64502us) it.next();
            if (r5 instanceof AnonymousClass8pH) {
                AnonymousClass8pH r52 = (AnonymousClass8pH) r5;
                Bundle bundle = r52.A00;
                if (bundle == null || bundle.getString("keys") == null) {
                    Bundle bundle2 = r52.A00;
                    if (bundle2 == null || bundle2.getString("providerType") == null) {
                        Bundle bundle3 = r52.A00;
                        if (!(bundle3 == null || bundle3.getStringArrayList("pspRouting") == null)) {
                            r2 = r52;
                        }
                    } else {
                        A132.add(r52);
                    }
                } else {
                    r8.A03("upi-list-keys");
                    Bundle bundle4 = r52.A00;
                    if (bundle4 != null) {
                        str = bundle4.getString("keys");
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.A08.A0P(str);
                    }
                }
            } else if (r5 instanceof AnonymousClass8pS) {
                A13.add(r5);
            }
        }
        ? obj = new Object();
        obj.A00 = r2;
        obj.A02 = A132;
        obj.A01 = A13;
        return obj;
    }

    public String A06(String str) {
        String str2;
        AnonymousClass8pH A022 = A02(this, str);
        if (A022 != null) {
            Bundle bundle = A022.A00;
            if (bundle != null) {
                str2 = bundle.getString("transactionPrefix");
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                Bundle bundle2 = A022.A00;
                if (bundle2 != null) {
                    return bundle2.getString("transactionPrefix");
                }
                return null;
            }
        }
        return this.A08.A0F();
    }
}
