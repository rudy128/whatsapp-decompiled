package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Qr  reason: invalid class name and case insensitive filesystem */
public final class C26061Qr {
    public final C18100vl A00 = new C18110vm(new C71023Dm(this, 49));
    public final C18100vl A01 = new C18110vm(new C71023Dm(this, 46));
    public final C18100vl A02 = new C18110vm(new C71023Dm(this, 47));
    public final C18100vl A03 = new C18110vm(new C71023Dm(this, 48));
    public final AnonymousClass00H A04;

    public C26061Qr(AnonymousClass00H r3) {
        C18070vi.A0d(r3, 1);
        this.A04 = r3;
    }

    public static final void A01(C199410f r1, List list) {
        C18070vi.A0d(r1, 1);
        AnonymousClass1IZ it = r1.iterator();
        C18070vi.A0X(it);
        while (it.hasNext()) {
            list.add(String.valueOf(it.next()));
        }
    }

    public static final C199410f A00(C26061Qr r4, C22821Di r5) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AnonymousClass3M4 r1 : (Set) r4.A04.get()) {
            if (((Boolean) r5.invoke(r1)).booleanValue()) {
                linkedHashSet.add(Integer.valueOf(r1.BbZ()));
            }
        }
        C199410f copyOf = C199410f.copyOf((Collection) linkedHashSet);
        C18070vi.A0X(copyOf);
        return copyOf;
    }

    public final boolean A02(Integer num) {
        if (num == null || ((AbstractCollection) this.A01.getValue()).contains(num)) {
            return true;
        }
        return false;
    }
}
