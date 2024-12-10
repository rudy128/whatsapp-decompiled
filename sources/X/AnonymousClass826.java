package X;

import com.whatsapp.bot.home.AiHomeFetchService;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeLayoutQueryResponseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.826  reason: invalid class name */
public final class AnonymousClass826 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ boolean $isFirstLoad;
    public final /* synthetic */ AiHomeFetchService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass826(AiHomeFetchService aiHomeFetchService, boolean z) {
        super(1);
        this.this$0 = aiHomeFetchService;
        this.$isFirstLoad = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AiHomeLayoutQueryResponseImpl.XfbFetchGenaiPersonaDiscoveryPaginatedLayout.UnionSectionsQuery.PageInfo pageInfo;
        C20125A8k A09;
        C20125A8k A092;
        C20125A8k a8k = (C20125A8k) obj;
        C18070vi.A0d(a8k, 0);
        AiHomeFetchService aiHomeFetchService = this.this$0;
        Class<AiHomeLayoutQueryResponseImpl.XfbFetchGenaiPersonaDiscoveryPaginatedLayout> cls = AiHomeLayoutQueryResponseImpl.XfbFetchGenaiPersonaDiscoveryPaginatedLayout.class;
        C20125A8k A093 = a8k.A09(cls, "xfb_fetch_genai_persona_discovery_paginated_layout");
        String str = null;
        if (A093 == null || (A092 = A093.A09(AiHomeLayoutQueryResponseImpl.XfbFetchGenaiPersonaDiscoveryPaginatedLayout.UnionSectionsQuery.class, "union_sections_query")) == null) {
            pageInfo = null;
        } else {
            pageInfo = (AiHomeLayoutQueryResponseImpl.XfbFetchGenaiPersonaDiscoveryPaginatedLayout.UnionSectionsQuery.PageInfo) A092.A09(AiHomeLayoutQueryResponseImpl.XfbFetchGenaiPersonaDiscoveryPaginatedLayout.UnionSectionsQuery.PageInfo.class, "page_info");
        }
        aiHomeFetchService.A00 = pageInfo;
        C20125A8k A094 = a8k.A09(cls, "xfb_fetch_genai_persona_discovery_paginated_layout");
        if (!(A094 == null || (A09 = A094.A09(AiHomeLayoutQueryResponseImpl.XfbFetchGenaiPersonaDiscoveryPaginatedLayout.UnionSectionsQuery.class, "union_sections_query")) == null)) {
            AnonymousClass1IX A0J = C108955ca.A0J(A09, AiHomeLayoutQueryResponseImpl.XfbFetchGenaiPersonaDiscoveryPaginatedLayout.UnionSectionsQuery.Edges.class, "edges");
            ArrayList A0t = C108965cb.A0t(A0J);
            Iterator it = A0J.iterator();
            while (it.hasNext()) {
                C20125A8k A095 = C108945cZ.A0V(it).A09(AiHomeLayoutQueryResponseImpl.XfbFetchGenaiPersonaDiscoveryPaginatedLayout.UnionSectionsQuery.Edges.Node.class, "node");
                if (A095 != null) {
                    JSONObject jSONObject = A095.A00;
                    if (jSONObject.optString("__typename").hashCode() == -1148830851) {
                        new C20125A8k(jSONObject);
                    } else if (jSONObject.optString("__typename").hashCode() == 1950049549) {
                        new C20125A8k(jSONObject);
                    } else if (jSONObject.optString("__typename").hashCode() == 1628590022) {
                        new C20125A8k(jSONObject);
                    }
                    A0t.add(A095);
                }
            }
            if (!A0t.isEmpty()) {
                C20125A8k A096 = a8k.A09(cls, "xfb_fetch_genai_persona_discovery_paginated_layout");
                if (A096 != null) {
                    str = A096.A0F("search_box_text");
                }
                C134506qh r2 = new C134506qh(A0t, str);
                AiHomeLayoutQueryResponseImpl.XfbFetchGenaiPersonaDiscoveryPaginatedLayout.UnionSectionsQuery.PageInfo pageInfo2 = this.this$0.A00;
                boolean z = false;
                if (pageInfo2 != null) {
                    z = C108975cc.A1B(pageInfo2.A0G("has_next_page") ? 1 : 0);
                }
                return new AnonymousClass7D0(r2, z);
            }
        }
        return new AnonymousClass7D1(AnonymousClass00R.A01, (Object) null, this.$isFirstLoad);
    }
}
