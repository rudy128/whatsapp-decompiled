package X;

import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.A5j  reason: case insensitive filesystem */
public abstract class C20060A5j {
    public static void A01(C29621ca r1, String str, List list) {
        Iterator A03 = C29621ca.A03(r1, "participant");
        while (A03.hasNext()) {
            list.add(C29621ca.A02(C17880vN.A0a(A03), str));
        }
    }

    public static void A03(C29621ca r5, List list) {
        Class<UserJid> cls = UserJid.class;
        Iterator A03 = C29621ca.A03(r5, "participant");
        while (A03.hasNext()) {
            C29621ca A0a = C17880vN.A0a(A03);
            list.add(C108945cZ.A0N(A0a.A0F(cls, "jid"), A0a.A0F(cls, "phone_number")));
        }
    }

    public static void A00(AnonymousClass4OX r13, C29621ca r14, String str) {
        Object obj;
        int i;
        C29621ca A0K = r14.A0K(str);
        C17960vV.A07(A0K);
        List A0R = A0K.A0R("participant");
        ArrayList A13 = AnonymousClass000.A13();
        A03(A0K, A13);
        ArrayList A132 = AnonymousClass000.A13();
        A01(A0K, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A132);
        ArrayList A133 = AnonymousClass000.A13();
        A01(A0K, "error", A133);
        ArrayList A134 = AnonymousClass000.A13();
        Iterator A03 = C29621ca.A03(A0K, "participant");
        while (A03.hasNext()) {
            boolean z = true;
            if ("false".equals(C29621ca.A02(C17880vN.A0a(A03), "addressable"))) {
                z = false;
            }
            A134.add(Boolean.valueOf(z));
        }
        ArrayList A135 = AnonymousClass000.A13();
        ArrayList A136 = AnonymousClass000.A13();
        Iterator it = A0R.iterator();
        while (it.hasNext()) {
            C29621ca A0a = C17880vN.A0a(it);
            C29621ca A0K2 = A0a.A0K("add_request");
            if (A0K2 == null) {
                A135.add((Object) null);
            } else {
                C108965cb.A1Q(A0K2.A0Q("code", (String) null), A0K2.A0Q("expiration", (String) null), A135);
            }
            C29621ca A0K3 = A0a.A0K("membership_approval_request");
            if (A0K3 == null) {
                A136.add((Object) null);
            } else {
                A136.add(A0K3.A0Q("error", (String) null));
            }
        }
        for (int i2 = 0; i2 < A13.size(); i2++) {
            Object obj2 = ((Pair) A13.get(i2)).second;
            Pair pair = (Pair) A13.get(i2);
            if (obj2 != null) {
                obj = pair.second;
            } else {
                obj = pair.first;
            }
            Jid jid = (Jid) obj;
            String A1H = C108945cZ.A1H(A133, i2);
            if (A1H != null) {
                try {
                    i = Integer.valueOf(A1H).intValue();
                    if (i == 421 && !TextUtils.isEmpty((CharSequence) A136.get(i2)) && TextUtils.isDigitsOnly((CharSequence) A136.get(i2))) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append(i);
                        i = Integer.valueOf(AnonymousClass000.A0y(C108945cZ.A1H(A136, i2), A10)).intValue();
                    }
                } catch (Exception unused) {
                    i = 499;
                }
                C17880vN.A1P(jid, r13.A02, i);
                if (i == 403) {
                    boolean A1Y = AnonymousClass000.A1Y(A134.get(i2));
                    Pair pair2 = (Pair) A135.get(i2);
                    if (pair2 != null && A1Y) {
                        try {
                            r13.A03.put(jid, new C85114Md((String) pair2.first, Long.valueOf((String) pair2.second).longValue()));
                        } catch (Exception unused2) {
                        }
                    }
                    if (AnonymousClass000.A1Y(A134.get(i2))) {
                    }
                } else if (i != 451) {
                }
                r13.A01.add(jid.getRawString());
            } else {
                Object obj3 = A132.get(i2);
                if (obj3 == null) {
                    obj3 = "";
                }
                r13.A04.put(jid, obj3);
            }
        }
    }

    public static void A02(C29621ca r4, String str, Map map, Map map2) {
        Object obj;
        int i;
        C29621ca A0K = r4.A0K(str);
        C17960vV.A07(A0K);
        ArrayList A13 = AnonymousClass000.A13();
        A03(A0K, A13);
        ArrayList A132 = AnonymousClass000.A13();
        A01(A0K, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A132);
        ArrayList A133 = AnonymousClass000.A13();
        A01(A0K, "error", A133);
        for (int i2 = 0; i2 < A13.size(); i2++) {
            Object obj2 = ((Pair) A13.get(i2)).second;
            Pair pair = (Pair) A13.get(i2);
            if (obj2 != null) {
                obj = pair.second;
            } else {
                obj = pair.first;
            }
            String A1H = C108945cZ.A1H(A133, i2);
            if (A1H != null) {
                try {
                    i = Integer.valueOf(A1H);
                } catch (Exception unused) {
                    i = 499;
                }
                map2.put(obj, i);
            } else {
                Object obj3 = A132.get(i2);
                if (obj3 == null) {
                    obj3 = "";
                }
                map.put(obj, obj3);
            }
        }
    }
}
