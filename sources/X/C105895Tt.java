package X;

import com.whatsapp.product.newsletterenforcements.suspension.NewsletterCopyrightSuspensionInfoActivity;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.5Tt  reason: invalid class name and case insensitive filesystem */
public final class C105895Tt extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ NewsletterCopyrightSuspensionInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105895Tt(NewsletterCopyrightSuspensionInfoActivity newsletterCopyrightSuspensionInfoActivity) {
        super(1);
        this.this$0 = newsletterCopyrightSuspensionInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C86994Tw r8 = (C86994Tw) obj;
        AnonymousClass1E7 r5 = r8.A00;
        List list = r8.A01;
        AbstractCollection abstractCollection = (AbstractCollection) this.this$0.A09.getValue();
        C18070vi.A0X(abstractCollection);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(abstractCollection));
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((AnonymousClass445) next).A07, next);
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it2);
            AnonymousClass445 r1 = (AnonymousClass445) linkedHashMap.get(String.valueOf(A0Y.A0y));
            if (r1 != null) {
                A13.add(new C86984Tv(r1, A0Y));
            }
        }
        AnonymousClass3X8 r0 = (AnonymousClass3X8) this.this$0.A0B.getValue();
        r0.A00 = r5;
        r0.A01 = A13;
        r0.notifyDataSetChanged();
        return C27621Wu.A00;
    }
}
