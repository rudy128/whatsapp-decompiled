package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.CdD  reason: case insensitive filesystem */
public final class C25308CdD {
    public static final BTI A00(List list, double d) {
        Object obj;
        Object obj2;
        Map map;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Object obj3 = ((Map) obj).get("min_bandwidth_in_mbps");
            C18070vi.A0z(obj3, "null cannot be cast to non-null type kotlin.Int");
            if (d >= ((double) AnonymousClass000.A0M(obj3)) * 1000.0d) {
                break;
            }
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            obj2 = map2.get("bucket");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof Map) {
            map = (Map) obj2;
        } else {
            map = null;
        }
        if (map != null) {
            C26294Cx6.A04("CdlQualityBucketParser", "LOD/texture derived");
            Object obj4 = map.get("lod");
            if (obj4 != null) {
                int A0M = AnonymousClass000.A0M(obj4);
                Object obj5 = map.get("texture_size");
                if (obj5 != null) {
                    return new BTI(A0M, AnonymousClass000.A0M(obj5));
                }
                throw AnonymousClass000.A0n("Required value was null.");
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        C26294Cx6.A04("CdlQualityBucketParser", "No bucket could be derived");
        return null;
    }
}
