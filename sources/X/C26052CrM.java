package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.CrM  reason: case insensitive filesystem */
public class C26052CrM {
    public HashMap A00;
    public HashMap A01;
    public HashMap A02;
    public boolean A03;
    public HashMap A04 = C17880vN.A11();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C26052CrM crM = (C26052CrM) obj;
            HashMap hashMap = this.A02;
            HashMap hashMap2 = crM.A02;
            if (hashMap != hashMap2 && !hashMap.equals(hashMap2)) {
                return false;
            }
            HashMap hashMap3 = this.A00;
            HashMap hashMap4 = crM.A00;
            return hashMap3 == hashMap4 || hashMap3.equals(hashMap4);
        }
    }

    public static JSONObject A00(Map.Entry entry) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("TrackType", ((C24322BzJ) entry.getKey()).mValue);
        return jSONObject;
    }

    public static void A01(C26052CrM crM) {
        if (!crM.A03) {
            Iterator A0j = C17890vO.A0j(crM.A02);
            while (A0j.hasNext()) {
                HashMap A11 = C17880vN.A11();
                Iterator A0i = C17890vO.A0i((AbstractMap) A0j.next());
                while (A0i.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A0i);
                    Object key = A16.getKey();
                    C25833Cmm cmm = (C25833Cmm) A16.getValue();
                    A11.put(key, C17880vN.A10(cmm.A04));
                    crM.A04.put(cmm.A01, A11);
                }
            }
            crM.A03 = true;
        }
    }

    public C25186Cac A02() {
        C25186Cac cac = new C25186Cac();
        Iterator A0j = C17890vO.A0j(this.A02);
        while (A0j.hasNext()) {
            AbstractMap abstractMap = (AbstractMap) A0j.next();
            int i = 0;
            while (true) {
                if (i < abstractMap.size()) {
                    C25833Cmm cmm = (C25833Cmm) AnonymousClass8BT.A0r(abstractMap, i);
                    if (cmm != null) {
                        cac.A02(cmm);
                        i++;
                    } else {
                        throw AnonymousClass000.A0k("track composition is null");
                    }
                }
            }
        }
        Iterator A0i = C17890vO.A0i(this.A00);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            Iterator A13 = AnonymousClass8BR.A13(A16.getValue());
            while (A13.hasNext()) {
                C6M c6m = (C6M) A13.next();
                cac.A00(c6m.A00, (C24322BzJ) A16.getKey(), c6m.A01);
            }
        }
        return cac;
    }

    public C26052CrM(C25186Cac cac) {
        HashMap A11 = C17880vN.A11();
        this.A02 = A11;
        A11.putAll(cac.A02);
        HashMap A112 = C17880vN.A11();
        this.A00 = A112;
        A112.putAll(cac.A00);
        HashMap A113 = C17880vN.A11();
        this.A01 = A113;
        A113.putAll(cac.A01);
    }

    public C25833Cmm A03(C24322BzJ bzJ, int i) {
        A01(this);
        AbstractMap abstractMap = (AbstractMap) this.A02.get(bzJ);
        if (abstractMap != null) {
            return (C25833Cmm) AnonymousClass8BT.A0r(abstractMap, i);
        }
        return null;
    }

    public String A04() {
        try {
            JSONObject A15 = C17880vN.A15();
            HashMap hashMap = this.A02;
            JSONArray A1A = AnonymousClass8BR.A1A();
            Iterator A0i = C17890vO.A0i(hashMap);
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                JSONObject A002 = A00(A16);
                JSONArray A1A2 = AnonymousClass8BR.A1A();
                Iterator A0i2 = C17890vO.A0i((AbstractMap) A16.getValue());
                while (A0i2.hasNext()) {
                    Map.Entry A162 = AnonymousClass000.A16(A0i2);
                    JSONObject A152 = C17880vN.A15();
                    A152.put("TrackIndex", A162.getKey());
                    A152.put("MediaTrackComposition", A162.getValue().hashCode());
                    A1A2.put(A152);
                }
                A002.put("TrackMap", A1A2);
                A1A.put(A002);
            }
            A15.put("mTypeToTracksMap", A1A);
            HashMap hashMap2 = this.A00;
            JSONArray A1A3 = AnonymousClass8BR.A1A();
            Iterator A0i3 = C17890vO.A0i(hashMap2);
            while (A0i3.hasNext()) {
                Map.Entry A163 = AnonymousClass000.A16(A0i3);
                JSONObject A003 = A00(A163);
                JSONArray A1A4 = AnonymousClass8BR.A1A();
                for (Object hashCode : (List) A163.getValue()) {
                    A1A4.put(hashCode.hashCode());
                }
                A003.put("TimelineEffects", A1A4);
                A1A3.put(A003);
            }
            A15.put("mTrackTypeToTimelineEffects", A1A3);
            return A15.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public HashMap A05(C24322BzJ bzJ) {
        HashMap A11 = C17880vN.A11();
        List list = (List) this.A00.get(bzJ);
        if (list != null && !list.isEmpty()) {
            C108955ca.A1V(list, A11, -1);
        }
        HashMap A06 = A06(bzJ);
        if (A06 != null) {
            Iterator A0i = C17890vO.A0i(A06);
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                Object key = A16.getKey();
                List list2 = ((C25833Cmm) A16.getValue()).A05;
                if (!list2.isEmpty()) {
                    A11.put(key, list2);
                }
            }
        }
        return A11;
    }

    public HashMap A06(C24322BzJ bzJ) {
        A01(this);
        HashMap hashMap = this.A02;
        if (hashMap.get(bzJ) != null) {
            return (HashMap) hashMap.get(bzJ);
        }
        return null;
    }

    public List A07(C24322BzJ bzJ, int i) {
        A01(this);
        AbstractMap abstractMap = (AbstractMap) this.A04.get(bzJ);
        if (abstractMap != null) {
            return (List) AnonymousClass8BT.A0r(abstractMap, i);
        }
        return null;
    }

    public JSONObject A08() {
        JSONObject A15 = C17880vN.A15();
        HashMap hashMap = this.A02;
        JSONArray A1A = AnonymousClass8BR.A1A();
        Iterator A0i = C17890vO.A0i(hashMap);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            JSONObject A002 = A00(A16);
            JSONArray A1A2 = AnonymousClass8BR.A1A();
            Iterator A0i2 = C17890vO.A0i((AbstractMap) A16.getValue());
            while (A0i2.hasNext()) {
                Map.Entry A162 = AnonymousClass000.A16(A0i2);
                JSONObject A152 = C17880vN.A15();
                A152.put("TrackIndex", A162.getKey());
                A152.put("MediaTrackComposition", ((C25833Cmm) A162.getValue()).A01());
                A1A2.put(A152);
            }
            A002.put("TrackMap", A1A2);
            A1A.put(A002);
        }
        A15.put("mTypeToTracksMap", A1A);
        HashMap hashMap2 = this.A00;
        JSONArray A1A3 = AnonymousClass8BR.A1A();
        Iterator A0i3 = C17890vO.A0i(hashMap2);
        while (A0i3.hasNext()) {
            Map.Entry A163 = AnonymousClass000.A16(A0i3);
            JSONObject A003 = A00(A163);
            JSONArray A1A4 = AnonymousClass8BR.A1A();
            Iterator it = ((List) A163.getValue()).iterator();
            while (it.hasNext()) {
                MediaEffect.A00(it, A1A4);
            }
            A003.put("TimelineEffects", A1A4);
            A1A3.put(A003);
        }
        A15.put("mTrackTypeToTimelineEffects", A1A3);
        return A15;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A02;
        return AnonymousClass000.A0P(this.A00, A1b, 1);
    }

    public String toString() {
        try {
            return A08().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
