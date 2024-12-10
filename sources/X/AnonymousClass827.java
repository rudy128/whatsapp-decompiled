package X;

import com.whatsapp.bot.home.AiHomeFetchService;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeSectionQueryResponseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.827  reason: invalid class name */
public final class AnonymousClass827 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ boolean $isFirstLoad;
    public final /* synthetic */ AiHomeFetchService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass827(AiHomeFetchService aiHomeFetchService, boolean z) {
        super(1);
        this.this$0 = aiHomeFetchService;
        this.$isFirstLoad = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AiHomeSectionQueryResponseImpl.XfbFetchGenaiPersonasBySection.PageInfo pageInfo;
        C20125A8k a8k = (C20125A8k) obj;
        C18070vi.A0d(a8k, 0);
        AiHomeFetchService aiHomeFetchService = this.this$0;
        Class<AiHomeSectionQueryResponseImpl.XfbFetchGenaiPersonasBySection> cls = AiHomeSectionQueryResponseImpl.XfbFetchGenaiPersonasBySection.class;
        C20125A8k A09 = a8k.A09(cls, "xfb_fetch_genai_personas_by_section");
        if (A09 != null) {
            pageInfo = (AiHomeSectionQueryResponseImpl.XfbFetchGenaiPersonasBySection.PageInfo) A09.A09(AiHomeSectionQueryResponseImpl.XfbFetchGenaiPersonasBySection.PageInfo.class, "page_info");
        } else {
            pageInfo = null;
        }
        aiHomeFetchService.A01 = pageInfo;
        C20125A8k A092 = a8k.A09(cls, "xfb_fetch_genai_personas_by_section");
        if (A092 != null) {
            AnonymousClass1IX A0J = C108955ca.A0J(A092, AiHomeSectionQueryResponseImpl.XfbFetchGenaiPersonasBySection.Edges.class, "edges");
            ArrayList A0t = C108965cb.A0t(A0J);
            Iterator it = A0J.iterator();
            while (it.hasNext()) {
                C20125A8k A093 = C108945cZ.A0V(it).A09(AiHomeSectionQueryResponseImpl.XfbFetchGenaiPersonasBySection.Edges.Node.class, "node");
                if (A093 != null) {
                    JSONObject jSONObject = A093.A00;
                    C18070vi.A0W(jSONObject);
                    A0t.add(new C20125A8k(jSONObject));
                }
            }
            AiHomeFetchService aiHomeFetchService2 = this.this$0;
            C134506qh r3 = new C134506qh(A0t, (String) null);
            AiHomeSectionQueryResponseImpl.XfbFetchGenaiPersonasBySection.PageInfo pageInfo2 = aiHomeFetchService2.A01;
            boolean z = false;
            if (pageInfo2 != null) {
                z = C108975cc.A1B(pageInfo2.A0G("has_next_page") ? 1 : 0);
            }
            return new AnonymousClass7D0(r3, z);
        }
        return new AnonymousClass7D1(AnonymousClass00R.A01, (Object) null, this.$isFirstLoad);
    }
}
