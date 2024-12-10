package X;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.AeJ  reason: case insensitive filesystem */
public final /* synthetic */ class C21089AeJ implements B9W {
    public final /* synthetic */ C194839sN A00;
    public final /* synthetic */ AnonymousClass91q A01;

    public final void BtO(Object obj) {
        Object obj2;
        Object obj3;
        C194839sN r4 = this.A00;
        AnonymousClass7NW r6 = (AnonymousClass7NW) obj;
        Map map = r6.A02;
        if (map != null && map.containsKey("error") && "onLoadingFailure".equals(r6.A00) && (obj2 = map.get("error")) != null && (obj3 = ((AbstractMap) obj2).get("code")) != null) {
            AnonymousClass91q.A0q(r4, (Map) null, AnonymousClass000.A0M(obj3));
        }
    }

    public /* synthetic */ C21089AeJ(C194839sN r1, AnonymousClass91q r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
