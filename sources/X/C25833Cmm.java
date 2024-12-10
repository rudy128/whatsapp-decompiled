package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Cmm  reason: case insensitive filesystem */
public class C25833Cmm {
    public final long A00;
    public final C24322BzJ A01;
    public final String A02;
    public final HashMap A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25833Cmm cmm = (C25833Cmm) obj;
            if (!this.A02.equals(cmm.A02) || this.A00 != cmm.A00 || !this.A04.equals(cmm.A04) || this.A01 != cmm.A01 || !this.A07.equals(cmm.A07) || !this.A05.equals(cmm.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A02;
        objArr[1] = this.A04;
        objArr[2] = this.A01;
        objArr[3] = this.A07;
        objArr[4] = this.A05;
        C17890vO.A1Q(objArr, this.A00);
        return Arrays.hashCode(objArr);
    }

    public static void A00(C25186Cac cac, C26010CqR cqR, Object obj) {
        cqR.A04.add(obj);
        cac.A02(new C25833Cmm(cqR));
    }

    public C25833Cmm(C26010CqR cqR) {
        this.A02 = cqR.A02;
        this.A01 = cqR.A01;
        this.A04 = cqR.A04;
        this.A00 = cqR.A00;
        this.A05 = cqR.A05;
        this.A03 = cqR.A03;
        List list = cqR.A06;
        Collections.sort(list, DUM.A00);
        this.A06 = list;
        List list2 = cqR.A07;
        Collections.sort(list2, DUN.A00);
        this.A07 = list2;
    }

    public JSONObject A01() {
        JSONObject A15 = C17880vN.A15();
        A15.put("mName", this.A02);
        A15.put("mStartAtTimeUs", this.A00);
        A15.put("mTrackType", this.A01.mValue);
        List<C25271CcJ> list = this.A04;
        JSONArray A1A = AnonymousClass8BR.A1A();
        for (C25271CcJ A012 : list) {
            A1A.put(A012.A01());
        }
        A15.put("mSegments", A1A);
        List<C25774Cll> list2 = this.A07;
        JSONArray A1A2 = AnonymousClass8BR.A1A();
        for (C25774Cll cll : list2) {
            JSONObject A152 = C17880vN.A15();
            A152.put("mTargetTimeRange", cll.A01.A04());
            A152.put("mSpeed", (double) cll.A00);
            A1A2.put(A152);
        }
        A15.put("mTimelineSpeedList", A1A2);
        List list3 = this.A06;
        JSONArray A1A3 = AnonymousClass8BR.A1A();
        Iterator it = list3.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass000.A0s("toJSON");
        }
        A15.put("mTimelinePtsMutatorList", A1A3);
        List list4 = this.A05;
        JSONArray A1A4 = AnonymousClass8BR.A1A();
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            MediaEffect.A00(it2, A1A4);
        }
        A15.put("mTimelineEffects", A1A4);
        return A15;
    }

    public String toString() {
        try {
            return A01().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
