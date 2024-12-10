package X;

import android.provider.ContactsContract;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.73C  reason: invalid class name */
public class AnonymousClass73C {
    public static HashMap A0D = C17880vN.A11();
    public static HashMap A0E;
    public String A00;
    public String A01;
    public String A02;
    public List A03;
    public List A04 = AnonymousClass000.A13();
    public List A05;
    public List A06;
    public List A07;
    public Map A08;
    public C128186fa A09 = new Object();
    public C133136oE A0A = new Object();
    public byte[] A0B;
    public final C138486xA A0C = new Object();

    public static C128926gu A00(String str) {
        if (str != null) {
            C133926pj r3 = new C133926pj();
            try {
                Iterator it = AnonymousClass72d.A01(str).iterator();
                while (it.hasNext()) {
                    AnonymousClass72d.A02(Arrays.asList(AnonymousClass72d.A00.split(C17880vN.A0v(it))), r3);
                }
                List list = r3.A02;
                if (list.size() > 0 && ((C128926gu) list.get(0)).A01.equals("VCARD")) {
                    return (C128926gu) list.get(0);
                }
            } catch (Exception e) {
                Log.e("Error parsing vcard", new AnonymousClass2RP(e));
                return null;
            }
        }
        return null;
    }

    public String A02() {
        String str = this.A0A.A01;
        if (str != null) {
            return str;
        }
        List list = this.A05;
        if (list != null && list.size() > 0) {
            return ((C128196fb) C108955ca.A0p(this.A05)).A00;
        }
        List list2 = this.A06;
        if (list2 != null && list2.size() > 0) {
            for (C129926ib r1 : this.A06) {
                if (r1.A04) {
                    return r1.A02;
                }
            }
        }
        List list3 = this.A03;
        if (list3 == null || list3.size() <= 0) {
            return "";
        }
        for (C130276jA r2 : this.A03) {
            if (r2.A01 == ContactsContract.CommonDataKinds.Email.class && r2.A05) {
                return r2.A02;
            }
        }
        return "";
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.6ib, java.lang.Object] */
    public void A03(UserJid userJid, String str, String str2, int i, boolean z) {
        if (str == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("contactstruct/addphone/data is null; skipping (type=");
            A10.append(i);
            A10.append(" jidFromWaId=");
            A10.append(userJid);
            A10.append(" label=");
            A10.append(str2);
            A10.append(" isPrimary=");
            A10.append(z);
            C17890vO.A1B(A10, ")");
        } else if (str.length() > 30) {
            this.A0C.A01++;
        } else {
            List list = this.A06;
            if (list == null) {
                list = AnonymousClass000.A13();
                this.A06 = list;
            }
            if (list.size() >= 10) {
                this.A0C.A00++;
                return;
            }
            ? obj = new Object();
            obj.A00 = i;
            obj.A01 = userJid;
            obj.A02 = str;
            obj.A03 = str2;
            obj.A04 = z;
            this.A06.add(obj);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.6fb, java.lang.Object] */
    public void A04(String str, String str2) {
        List list = this.A05;
        if (list == null) {
            list = AnonymousClass000.A13();
            this.A05 = list;
        }
        ? obj = new Object();
        obj.A00 = str;
        obj.A01 = str2;
        list.add(obj);
    }

    public void A05(C136406tl r4) {
        List list;
        String str = r4.A02;
        if (str != null && str.length() != 0) {
            String str2 = r4.A01;
            Map map = this.A08;
            if (map == null) {
                map = C17880vN.A11();
                this.A08 = map;
            }
            if (!map.containsKey(str2)) {
                list = AnonymousClass000.A13();
                this.A08.put(str2, list);
            } else {
                list = (List) this.A08.get(str2);
            }
            list.add(r4);
        }
    }

    static {
        HashMap A11 = C17880vN.A11();
        A0E = A11;
        A11.put("X-AIM", AnonymousClass3MY.A0f());
        A0E.put("X-MSN", C17880vN.A0h());
        A0E.put("X-YAHOO", C17880vN.A0i());
        HashMap hashMap = A0E;
        Integer A0l = C17880vN.A0l();
        hashMap.put("X-GOOGLE-TALK", A0l);
        A0E.put("X-GOOGLE TAL", A0l);
        A0E.put("X-ICQ", C17880vN.A0m());
        A0E.put("X-JABBER", C108955ca.A0e());
        A0E.put("X-SKYPE-USERNAME", C17880vN.A0j());
        A0D.put("X-AIM", "AIM");
        A0D.put("X-MSN", "Windows Live");
        A0D.put("X-YAHOO", "YAHOO");
        A0D.put("X-GOOGLE-TALK", "Google Talk");
        A0D.put("X-GOOGLE TAL", "Google Talk");
        A0D.put("X-ICQ", "ICQ");
        A0D.put("X-JABBER", "Jabber");
        A0D.put("X-SKYPE-USERNAME", "Skype");
        A0D.put("NICKNAME", "Nickname");
        A0D.put("BDAY", "Birthday");
    }

    public static void A01(List list, C133136oE r4) {
        int size = list.size();
        if (size > 1) {
            r4.A00 = C17880vN.A0w(list, 0);
            r4.A02 = C17880vN.A0w(list, 1);
            if (size > 2) {
                if (C17880vN.A0w(list, 2).length() > 0) {
                    r4.A03 = C17880vN.A0w(list, 2);
                }
                if (size > 3) {
                    if (C17880vN.A0w(list, 3).length() > 0) {
                        r4.A06 = C17880vN.A0w(list, 3);
                    }
                    if (size > 4 && C17880vN.A0w(list, 4).length() > 0) {
                        r4.A07 = C17880vN.A0w(list, 4);
                    }
                }
            }
        }
    }
}
