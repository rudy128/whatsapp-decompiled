package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7C9  reason: invalid class name */
public final class AnonymousClass7C9 implements AnonymousClass8BG {
    public final List A00;

    public void BBg(AnonymousClass212 r1) {
    }

    public void CFH(AnonymousClass212 r1, AnonymousClass212 r2, boolean z) {
    }

    public /* bridge */ /* synthetic */ AnonymousClass7PW BMg(String str) {
        Object obj;
        C115125tR r1;
        List list = this.A00;
        synchronized (list) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C18070vi.A18(((C115125tR) obj).A02, str)) {
                    break;
                }
            }
            r1 = (C115125tR) obj;
        }
        return r1;
    }

    public Iterator BMh() {
        AnonymousClass1IZ it;
        List list = this.A00;
        synchronized (list) {
            AnonymousClass1IX copyOf = AnonymousClass1IX.copyOf((Collection) list);
            C18070vi.A0X(copyOf);
            it = copyOf.iterator();
            C18070vi.A0X(it);
        }
        return it;
    }

    public int BMi() {
        int size;
        List list = this.A00;
        synchronized (list) {
            size = list.size();
        }
        return size;
    }

    public int BXt() {
        long j;
        List list = this.A00;
        synchronized (list) {
            AnonymousClass1IX copyOf = AnonymousClass1IX.copyOf((Collection) list);
            C18070vi.A0X(copyOf);
            Iterator it = copyOf.iterator();
            j = 0;
            while (it.hasNext()) {
                j += ((C115125tR) it.next()).A00;
            }
        }
        return (int) j;
    }

    public String BXu(AnonymousClass1BI r6, long j) {
        String str;
        Object obj;
        List list = this.A00;
        synchronized (list) {
            Iterator it = list.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C115125tR) obj).A01) {
                    break;
                }
            }
            C115125tR r1 = (C115125tR) obj;
            if (r1 != null) {
                str = r1.A02;
            }
        }
        return str;
    }

    public boolean isEmpty() {
        boolean isEmpty;
        List list = this.A00;
        synchronized (list) {
            isEmpty = list.isEmpty();
        }
        return isEmpty;
    }

    public AnonymousClass7C9(List list) {
        this.A00 = list;
    }

    public AnonymousClass8BG BHF() {
        return this;
    }

    public Collection BMv() {
        return AnonymousClass000.A13();
    }
}
