package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.commonavatarliveediting.leplayer.ale.AleLiveEditingPlayer$updateBlendWeightsForConfig$1;
import com.facebook.commonavatarliveediting.leplayer.ale.AleLiveEditingPlayer$updateSliderValue$1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: X.CcM  reason: case insensitive filesystem */
public abstract class C25274CcM {
    public int A00;
    public int A01;
    public CTT A02;
    public String A03;
    public String A04;
    public Map A05;
    public Map A06;
    public Map A07 = AnonymousClass1D7.A0I();
    public Map A08 = AnonymousClass1D7.A0I();
    public Map A09 = AnonymousClass1D7.A0I();
    public final C26027Cql A0A;
    public final Object A0B = C17880vN.A0p();
    public final CopyOnWriteArrayList A0C = new CopyOnWriteArrayList();

    public void A04(String str, Map map) {
        boolean z;
        BRE bre = (BRE) this;
        C18070vi.A0d(map, 1);
        if (bre.A03) {
            Map map2 = bre.A07;
            C25243Cbe cbe = bre.A00;
            if (cbe != null) {
                z = cbe.A0I;
            } else {
                z = false;
            }
            bre.A07 = AnonymousClass1D7.A09(map2, BRE.A00(map, z));
        } else if (!C18070vi.A18(bre.A02, map) && !map.isEmpty()) {
            bre.A02 = map;
            C26294Cx6.A04("AleLiveEditingPlayer", AnonymousClass001.A1E(map, "[UpdateBlendWeights]: ", AnonymousClass000.A10()));
            C27839Dma dma = new C27839Dma(bre, str, map);
            C25243Cbe cbe2 = bre.A00;
            if (cbe2 == null || !cbe2.A0G) {
                dma.invoke();
                return;
            }
            AnonymousClass3MW.A1X(bre.A07, new AleLiveEditingPlayer$updateBlendWeightsForConfig$1((C30391dr) null, dma), bre.A08);
        }
    }

    public void A05(Map map) {
        boolean z;
        BRE bre = (BRE) this;
        C18070vi.A0d(map, 0);
        Map map2 = bre.A06;
        LinkedHashMap A13 = C17880vN.A13();
        if (map2 != null) {
            Iterator A15 = AnonymousClass000.A15(map2);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                if (map.containsKey(A16.getKey())) {
                    C108985cd.A1T(A16, A13);
                }
            }
        }
        C25243Cbe cbe = bre.A00;
        if (cbe != null) {
            z = cbe.A0I;
        } else {
            z = false;
        }
        LinkedHashMap A092 = AnonymousClass1D7.A09(A13, BRE.A00(map, z));
        C26294Cx6.A04("AleLiveEditingPlayer", AnonymousClass001.A1E(A092, "updateSliderValue, configMapWithFloatRanges: ", AnonymousClass000.A10()));
        C27842Dmd dmd = new C27842Dmd(C24315BzC.Colorization, bre, A092);
        C25243Cbe cbe2 = bre.A00;
        if (cbe2 == null || !cbe2.A0G) {
            dmd.invoke();
            return;
        }
        AnonymousClass3MW.A1X(bre.A07, new AleLiveEditingPlayer$updateSliderValue$1((C30391dr) null, dmd), bre.A08);
    }

    public final void A02() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Request with id: ");
        A10.append(this.A03);
        C26294Cx6.A04("LiveEditingPlayer", AnonymousClass000.A0y(" is completed", A10));
        synchronized (this.A0B) {
            C26294Cx6.A04("LiveEditingPlayer", "There are no ongoing requests yet");
            this.A03 = null;
        }
    }

    public final void A03(C3B c3b) {
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            ((C85064Ly) it.next()).A00.CQ0(c3b);
        }
    }

    public void A06() {
        C26027Cql cql = this.A0A;
        cql.A00 = null;
        cql.A02();
    }

    public C25274CcM(C26027Cql cql) {
        this.A0A = cql;
    }

    public final void A01() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[CheckAndFireAvatarLoadedEvent] currentAvatarLoadStatus: ");
        A10.append(this.A01);
        A10.append(" avatarLoadPrerequisite: ");
        A10.append(this.A00);
        A10.append(" currentAvatarLoadRequestId:");
        C26294Cx6.A04("LiveEditingPlayer", AnonymousClass000.A0y(this.A03, A10));
        String str = this.A03;
        if (str != null && this.A01 == this.A00) {
            C26027Cql cql = this.A0A;
            JSONObject A15 = C17880vN.A15();
            A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "avatar_edit_event");
            JSONObject A152 = C17880vN.A15();
            A152.put("event_name", "avatar_load_status");
            A152.put("status", "complete");
            A15.put("data", A152);
            cql.A09.A01.A00(A15);
            A03(new BR4(str));
            A02();
        }
    }
}
