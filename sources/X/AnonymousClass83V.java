package X;

import com.whatsapp.infra.graphql.generated.aihome.AiHomeSearchQueryResponseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.83V  reason: invalid class name */
public final class AnonymousClass83V extends AnonymousClass11G implements C22821Di {
    public static final AnonymousClass83V A00 = new AnonymousClass83V();

    public AnonymousClass83V() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C20125A8k a8k = (C20125A8k) obj;
        C18070vi.A0d(a8k, 0);
        C20125A8k A09 = a8k.A09(AiHomeSearchQueryResponseImpl.XfbGenaiSearchPersona.class, "xfb_genai_search_persona");
        if (A09 == null) {
            return new AnonymousClass7D1(AnonymousClass00R.A01, (Object) null, true);
        }
        AnonymousClass1IX A0J = C108955ca.A0J(A09, AiHomeSearchQueryResponseImpl.XfbGenaiSearchPersona.Edges.class, "edges");
        ArrayList A0t = C108965cb.A0t(A0J);
        Iterator it = A0J.iterator();
        while (it.hasNext()) {
            C20125A8k A092 = C108945cZ.A0V(it).A09(AiHomeSearchQueryResponseImpl.XfbGenaiSearchPersona.Edges.Node.class, "node");
            if (A092 != null) {
                JSONObject jSONObject = A092.A00;
                C18070vi.A0W(jSONObject);
                A0t.add(new C20125A8k(jSONObject));
            }
        }
        return new AnonymousClass7D0(new C134506qh(A0t, (String) null), false);
    }
}
