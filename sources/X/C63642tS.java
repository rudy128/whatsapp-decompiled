package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2tS  reason: invalid class name and case insensitive filesystem */
public final class C63642tS {
    public int A00;
    public boolean A01;
    public AnonymousClass21V A02;
    public final CopyOnWriteArrayList A03;

    public C63642tS(List list) {
        C18070vi.A0d(list, 1);
        this.A03 = new CopyOnWriteArrayList(list);
        this.A02 = (AnonymousClass21V) list.get(0);
        A00();
    }

    public synchronized AnonymousClass21V A01() {
        return this.A02;
    }

    public synchronized void A03(AnonymousClass205 r6) {
        Object obj;
        C18070vi.A0d(r6, 0);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("messagelist/remove ");
        A10.append(r6);
        A10.append(" from ");
        C17890vO.A1A(A10, A02());
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03;
        Iterator it = copyOnWriteArrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (r6.equals(((AnonymousClass206) obj).A0v)) {
                break;
            }
        }
        copyOnWriteArrayList.remove((AnonymousClass21V) obj);
        if (!copyOnWriteArrayList.isEmpty()) {
            this.A02 = (AnonymousClass21V) copyOnWriteArrayList.get(0);
        }
    }

    public synchronized boolean A06() {
        return AnonymousClass000.A1P(this.A03.size());
    }

    private final void A00() {
        C62572rc r2 = this.A02.A02;
        C17960vV.A0F(AnonymousClass000.A1W(r2), "First media data is null");
        Iterator it = this.A03.iterator();
        C18070vi.A0X(it);
        while (it.hasNext()) {
            AnonymousClass21V A0b = C17880vN.A0b(it);
            C18070vi.A0b(A0b);
            C62572rc r3 = A0b.A02;
            C17960vV.A0F(AnonymousClass000.A1W(r3), "Media data is null");
            C17960vV.A0F(AnonymousClass000.A1T(this.A02.A0u, A0b.A0u), "Media type mismatch");
            C17960vV.A0F(AnonymousClass000.A1T(this.A02.A09, A0b.A09), "Origin mismatch");
            C17960vV.A0F(C42171xk.A00(this.A02.A18(), A0b.A18()), "Caption mismatch");
            C17960vV.A0F(C42171xk.A00(this.A02.A05, A0b.A05), "Hash mismatch");
            C17960vV.A0F(C42171xk.A00(this.A02.A08, A0b.A08), "Encrypted hash mismatch");
            C17960vV.A0F(AnonymousClass000.A1T(this.A02.A0D, A0b.A0D), "Duration mismatch");
            C17960vV.A0F(C42171xk.A00(this.A02.A06, A0b.A06), "Mime mismatch");
            C17960vV.A0F(C42171xk.A00(this.A02.A19(), A0b.A19()), "Name mismatch");
            C17960vV.A0F(C42171xk.A00(this.A02.A0A, A0b.A0A), "Multicast id mismatch");
            C17960vV.A07(r2);
            String str = r2.A0L;
            C17960vV.A07(r3);
            C17960vV.A0F(C42171xk.A00(str, r3.A0L), "Media Job Id mismatch");
        }
    }

    public boolean A04() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (!C22971Dz.A0g(C17880vN.A0Y(it))) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean A05() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (C22971Dz.A0g(C17880vN.A0Y(it))) {
                    return true;
                }
            }
        }
        return false;
    }

    public String A02() {
        StringBuilder A10 = AnonymousClass000.A10();
        Iterator it = this.A03.iterator();
        C18070vi.A0X(it);
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if (A10.length() > 0) {
                A10.append(',');
            }
            A10.append(A0Y.A0v);
        }
        return C18070vi.A0H(A10);
    }

    public C63642tS(int i, List list, boolean z) {
        this.A03 = new CopyOnWriteArrayList(list);
        this.A02 = (AnonymousClass21V) list.get(0);
        A00();
        this.A00 = i;
        this.A01 = z;
    }

    public C63642tS(List list, int i) {
        C18070vi.A0d(list, 1);
        this.A03 = new CopyOnWriteArrayList(list);
        this.A02 = (AnonymousClass21V) list.get(0);
        A00();
        this.A00 = i;
    }
}
