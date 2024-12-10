package X;

import android.os.Trace;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0Vg  reason: invalid class name and case insensitive filesystem */
public final class C05670Vg implements C15750r8 {
    public AnonymousClass071 A00;
    public final List A01 = AnonymousClass000.A13();
    public final List A02 = AnonymousClass000.A13();
    public final List A03 = AnonymousClass000.A13();
    public final Set A04;

    public final void A00() {
        Set set = this.A04;
        if (!set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    it.remove();
                    ((AnonymousClass0t3) it.next()).Bkh();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void A01() {
        List list = this.A01;
        if (AnonymousClass000.A1a(list)) {
            Trace.beginSection("Compose:onForgotten");
            try {
                AnonymousClass071 r3 = this.A00;
                int size = list.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    Object obj = list.get(size);
                    C41681wt.A00(this.A04).remove(obj);
                    if (obj instanceof AnonymousClass0t3) {
                        ((AnonymousClass0t3) obj).Bux();
                    }
                    if (obj instanceof AnonymousClass0t2) {
                        if (r3 == null || !r3.A05(obj)) {
                            ((AnonymousClass0t2) obj).Bqy();
                        } else {
                            ((AnonymousClass0t2) obj).C2t();
                        }
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        List list2 = this.A02;
        if (AnonymousClass000.A1a(list2)) {
            Trace.beginSection("Compose:onRemembered");
            int size2 = list2.size();
            for (int i = 0; i < size2; i++) {
                AnonymousClass0t3 r1 = (AnonymousClass0t3) list2.get(i);
                this.A04.remove(r1);
                r1.C2z();
            }
            Trace.endSection();
        }
    }

    public final void A02() {
        List list = this.A03;
        if (AnonymousClass000.A1a(list)) {
            Trace.beginSection("Compose:sideeffects");
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C18090vk) list.get(i)).invoke();
                }
                list.clear();
            } finally {
                Trace.endSection();
            }
        }
    }

    public C05670Vg(Set set) {
        this.A04 = set;
    }
}
