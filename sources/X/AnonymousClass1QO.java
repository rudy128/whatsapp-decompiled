package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1QO  reason: invalid class name */
public class AnonymousClass1QO extends AnonymousClass1QN {
    public static final List A03 = Arrays.asList(new String[]{"payment_composer_icon", "chat", "photo_received", "photo_received_gallery"});
    public final AnonymousClass1PM A00;
    public final C24751Ln A01;
    public final AnonymousClass1QL A02;

    public AnonymousClass1QO(AnonymousClass18O r8, AnonymousClass1PM r9, AnonymousClass11P r10, C24751Ln r11, C18030ve r12, AnonymousClass1QL r13, AnonymousClass1QD r14, AnonymousClass1QJ r15, AnonymousClass1QH r16) {
        super(r8, r10, r12, r14, r15, r16);
        this.A02 = r13;
        this.A00 = r9;
        this.A01 = r11;
    }

    public boolean A0B() {
        if (!A04(1)) {
            return false;
        }
        return C18020vd.A05(C18040vf.A02, this.A02, 1586);
    }

    public boolean A0D() {
        if (!A04(0) || C63572tK.A0E != this.A04.A02() || !A0E()) {
            return false;
        }
        return true;
    }

    public static boolean A00(String str, List list) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20251ADj aDj = (C20251ADj) it.next();
            if (aDj.A01.equals("payment_gateway")) {
                BDZ bdz = aDj.A00;
                bdz.getClass();
                List list2 = ((C20936Abq) bdz).A02;
                if (list2 != null && !list2.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String A06(AnonymousClass1BI r2) {
        if (r2 instanceof AnonymousClass1E2) {
            r2 = this.A01.A0D((AnonymousClass1E1) r2);
        }
        String A022 = C20056A5f.A02(AnonymousClass17K.A00(C42771yi.A00(), r2));
        if (A022 != null) {
            return AnonymousClass1K3.A00(A022);
        }
        return null;
    }

    public HashMap A07() {
        HashMap hashMap = new HashMap();
        String A012 = C18020vd.A01(C18040vf.A02, this.A02, 2351);
        if (!TextUtils.isEmpty(A012)) {
            try {
                JSONArray optJSONArray = new JSONObject(A012).optJSONArray("psp_list");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i);
                        String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        String optString2 = jSONObject.optString("display_name");
                        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                            hashMap.put(optString, optString2);
                        }
                    }
                }
            } catch (JSONException unused) {
                Log.e("PaymentsGatingManager/getP2mLitePspMap can't construct psp json map from abprops");
            }
        }
        return hashMap;
    }

    public boolean A08() {
        if (C63572tK.A0F != this.A04.A02()) {
            return false;
        }
        AnonymousClass1QL r1 = this.A02;
        if (r1.A0F() || r1.A0E()) {
            return true;
        }
        return false;
    }

    public boolean A0A() {
        return !C18020vd.A01(C18040vf.A02, this.A02, 3690).isEmpty();
    }

    public boolean A0C() {
        if (this.A00.A09(AnonymousClass18O.A0Q)) {
            if (!C18020vd.A05(C18040vf.A02, this.A02, 3461)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A0E() {
        if (this.A04.A03() && this.A00.A09(AnonymousClass18O.A0Q)) {
            if (!C18020vd.A05(C18040vf.A02, this.A02, 1158)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A0F() {
        C63572tK A022 = this.A04.A02();
        if (A022 != null) {
            C63572tK r0 = C63572tK.A0E;
            if (!"BR".equals(A022.A03)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A0G() {
        JSONObject A022 = C18020vd.A02(C18040vf.A02, this.A02, 4252);
        if (!A022.has("buyer_ed_order_content_update_enabled")) {
            return false;
        }
        try {
            if (A022.getInt("buyer_ed_order_content_update_enabled") == 1) {
                return true;
            }
            return false;
        } catch (JSONException e) {
            Log.e("failed to parse config for ab prop BR_BUYER_ED_CAPABILITIES_CODE#isUpdateOrderContentEnabled", e);
            return false;
        }
    }

    public boolean A0I(AnonymousClass1BI r4, String str, String str2) {
        if (!C18020vd.A05(C18040vf.A02, this.A02, 4924) || r4 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str2.equals("GALLERY_QR_CODE") || A08()) {
            return false;
        }
        AnonymousClass1PM r1 = this.A00;
        C22941Dw r0 = UserJid.Companion;
        C42741yf A012 = r1.A01(C22941Dw.A01(r4));
        if (A012 == null) {
            return false;
        }
        if (A012.A02() || A012.A03()) {
            return true;
        }
        return false;
    }

    public boolean A0J(UserJid userJid, C20279AEn aEn) {
        if (this.A00.A04(userJid)) {
            String str = aEn.A06;
            if (("payment_link".equals(str) || "boleto".equals(str)) && A0F()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r1 = r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(com.whatsapp.jid.UserJid r4, java.lang.String r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0018
            java.util.List r0 = A03
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0018
            X.1PM r1 = r3.A00
            X.1yf r0 = r1.A01(r4)
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x001a
        L_0x0018:
            r1 = 0
        L_0x0019:
            return r1
        L_0x001a:
            X.1yf r0 = r1.A01(r4)
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0027
            goto L_0x0018
        L_0x0027:
            X.0ve r2 = r3.A02
            r1 = 11295(0x2c1f, float:1.5828E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r1 = 1
            if (r0 != 0) goto L_0x0019
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QO.A0K(com.whatsapp.jid.UserJid, java.lang.String):boolean");
    }

    public boolean A0L(C20279AEn aEn) {
        if (!C18020vd.A05(C18040vf.A02, this.A02, 10765) || aEn.A0C == null) {
            return false;
        }
        return true;
    }

    public boolean A0N(String str, List list) {
        C18030ve r2 = this.A02;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 3740)) {
            String A012 = C18020vd.A01(r1, r2, 3885);
            if (!TextUtils.isEmpty(A012)) {
                List<String> asList = Arrays.asList(A012.split(","));
                for (String append : asList) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("payment_gateway:");
                    sb.append(append);
                    if (sb.toString().equals(str)) {
                        return true;
                    }
                }
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C20251ADj aDj = (C20251ADj) it.next();
                        BDZ bdz = aDj.A00;
                        if (bdz != null && aDj.A01.equals("payment_gateway")) {
                            return asList.contains(((C20936Abq) bdz).A01);
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean A0O(List list) {
        if (!C18020vd.A05(C18040vf.A02, this.A02, 4295) || list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20251ADj aDj = (C20251ADj) it.next();
            if (aDj.A00 != null && aDj.A01.equals("payment_link")) {
                return true;
            }
        }
        return false;
    }

    public boolean A0P(List list) {
        if (!C18020vd.A05(C18040vf.A02, this.A02, 9945) || list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20251ADj aDj = (C20251ADj) it.next();
            if (aDj.A00 != null) {
                String str = aDj.A01;
                if (str.equals("upi_merchant_vpa") || str.equals("upi_intent_link")) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean A0Q(List list) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20251ADj aDj = (C20251ADj) it.next();
            BDZ bdz = aDj.A00;
            if (bdz != null) {
                if (!(bdz instanceof C20926Abg)) {
                    String str = aDj.A01;
                    if (!"pix_dynamic_code".equals(str) || !(bdz instanceof C20934Abo)) {
                        C18030ve r2 = this.A02;
                        C18040vf r1 = C18040vf.A02;
                        if (!C18020vd.A05(r1, r2, 9847) || !A0O(Collections.singletonList(aDj)) || !A0F()) {
                            if ("boleto".equals(str) && C18020vd.A05(r1, r2, 11671) && A0F()) {
                                return true;
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int A05(AnonymousClass1BI r5) {
        ArrayList arrayList;
        String A06 = A06(r5);
        if (A06 == null) {
            return 2;
        }
        String A012 = C18020vd.A01(C18040vf.A02, this.A02, 3690);
        if (!TextUtils.isEmpty(A012)) {
            arrayList = new ArrayList(Arrays.asList(A012.split(",")));
        } else {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(A06)) {
                return 1;
            }
        }
        return 2;
    }

    public boolean A09() {
        if (A0B()) {
            if (!C18020vd.A05(C18040vf.A02, this.A02, 1746)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A0H() {
        if (!A02()) {
            return false;
        }
        AnonymousClass1QD r3 = this.A03;
        if (r3.A03().getBoolean("has_p2mlite_account", false) || r3.A03().getBoolean("has_p2mlite_transactions", false)) {
            return true;
        }
        return false;
    }

    public boolean A0M(String str) {
        if (!TextUtils.isEmpty(str)) {
            return A07().containsKey(str);
        }
        return false;
    }
}
