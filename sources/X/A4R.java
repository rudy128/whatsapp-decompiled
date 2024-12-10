package X;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class A4R {
    public final C18030ve A00;
    public final C136286tZ A01;

    public final C87194Uq A02(AnonymousClass21K r13) {
        String str;
        String str2;
        C20277AEk aEk;
        C18070vi.A0d(r13, 0);
        String str3 = null;
        if (!C18020vd.A05(C18040vf.A02, this.A00, 11134)) {
            return null;
        }
        C20285AEt BPK = r13.BPK();
        if (BPK != null) {
            str = BPK.A0D;
        } else {
            str = null;
        }
        if (!C18070vi.A18(str, "MARKETING")) {
            return null;
        }
        C20285AEt BPK2 = r13.BPK();
        if (!(BPK2 == null || (aEk = BPK2.A06) == null)) {
            str3 = aEk.A02;
        }
        if (str3 != null) {
            try {
                JSONObject optJSONObject = C17880vN.A16(str3).optJSONObject("tap_target_configuration");
                if (optJSONObject != null) {
                    String A03 = A6n.A03("title", optJSONObject, C18070vi.A15(optJSONObject, "title"));
                    String A032 = A6n.A03("description", optJSONObject, C18070vi.A15(optJSONObject, "description"));
                    String string = optJSONObject.getString("canonical_url");
                    try {
                        str2 = A6n.A03("domain", optJSONObject, C18070vi.A15(optJSONObject, "domain"));
                        if (str2 == null) {
                            str2 = new URL(string).getHost();
                        }
                    } catch (MalformedURLException e) {
                        C17900vP.A0h("TapTargetConfigurationParser/parseMessageParamsJson/invalid url=", string, AnonymousClass000.A10(), e);
                        str2 = null;
                    }
                    int i = optJSONObject.getInt("button_index");
                    C18070vi.A0b(string);
                    return new C87194Uq(string, A03, A032, str2, i);
                }
            } catch (JSONException e2) {
                C17900vP.A0h("TapTargetConfigurationParser/parseMessageParamsJson/invalid json=", str3, AnonymousClass000.A10(), e2);
            }
        }
        return null;
    }

    public A4R(C18030ve r1, C136286tZ r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final AnonymousClass1D6 A00(A4R a4r, C439421n r7) {
        Object A0f;
        List list = r7.BaE().A06;
        int i = -1;
        if (list != null) {
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C61762qD r2 = (C61762qD) it.next();
                if (r2.A07 == 2 && !a4r.A01.A02(r2)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        List list2 = r7.BaE().A06;
        if (list2 == null || (A0f = C29431cG.A0f(list2, i)) == null) {
            return null;
        }
        return AnonymousClass1D6.A00(A0f, i);
    }

    public static final AnonymousClass1D6 A01(AnonymousClass21K r5) {
        C20277AEk aEk;
        Object A0f;
        C20277AEk aEk2;
        C20285AEt BPK = r5.BPK();
        int i = -1;
        if (BPK != null && (aEk2 = BPK.A06) != null) {
            Iterator it = aEk2.A03.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (C18070vi.A18(((C20253ADl) it.next()).A01.A02, "cta_url")) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        C20285AEt BPK2 = r5.BPK();
        if (BPK2 == null || (aEk = BPK2.A06) == null || (A0f = C29431cG.A0f(aEk.A03, i)) == null) {
            return null;
        }
        return AnonymousClass1D6.A00(A0f, i);
    }
}
