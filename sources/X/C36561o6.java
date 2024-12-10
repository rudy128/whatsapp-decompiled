package X;

import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1o6  reason: invalid class name and case insensitive filesystem */
public final class C36561o6 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18100vl A05 = new C18110vm(new C36601oA(this));
    public final C18100vl A06 = new C18110vm(new C36571o7(this));
    public final C18100vl A07 = new C18110vm(new C36581o8(this));
    public final C18100vl A08 = new C18110vm(new C36611oB(this));
    public final C18100vl A09 = new C18110vm(new C36591o9(this));

    public C36561o6(AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r7, 5);
        this.A04 = r3;
        this.A00 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = r7;
    }

    public final AnonymousClass9ZI A00(C179549Ik r12, AnonymousClass5YR r13, int i) {
        String str;
        String str2;
        C18070vi.A0d(r13, 1);
        C191629mu r4 = (C191629mu) this.A06.getValue();
        C21319Ai4 ai4 = (C21319Ai4) r13;
        String str3 = ai4.A0F;
        int i2 = ai4.A00;
        AnonymousClass9ZF r0 = ai4.A06;
        if (r0 != null) {
            Map map = r0.A00;
            str2 = (String) map.get("instance_log_data");
            String str4 = (String) map.get("wa_smb_biz_home_recunit_info");
            if (str4 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str4);
                    str = jSONObject.getString("product_team_name");
                    if (!(str == null || str.length() == 0)) {
                        A6n.A01("product_level_cooldown_seconds", jSONObject);
                        A6n.A00("ignore_product_dedup", jSONObject);
                        A6n.A00("ignore_product_level_cooldown", jSONObject);
                        return r4.A00(r12, str3, str2, str, i, i2);
                    }
                } catch (JSONException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("RecommendationUnitInfo/parseRecommendationInfo/failed to parse json: ");
                    sb.append(e);
                    Log.e(sb.toString());
                }
            }
        } else {
            str2 = null;
        }
        str = null;
        return r4.A00(r12, str3, str2, str, i, i2);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.3Ax, X.B9q, java.lang.Object] */
    public final C21319Ai4 A01(String str, int i) {
        ? obj = new Object();
        obj.A00 = null;
        return ((C61942qX) this.A05.getValue()).A00(obj, str, i);
    }
}
