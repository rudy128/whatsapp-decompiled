package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Mg  reason: invalid class name and case insensitive filesystem */
public abstract class C48382Mg extends C48392Mh {
    public final List A00 = AnonymousClass000.A13();

    public int A18() {
        C59632md A1A = A1A(2);
        if (A1A != null) {
            return A1A.A01;
        }
        return 0;
    }

    public C59632md A1A(int i) {
        for (C59632md r1 : this.A00) {
            if (r1.A00 == i) {
                return r1;
            }
        }
        return null;
    }

    public void A1D(List list) {
        List list2 = this.A00;
        list2.clear();
        list2.addAll(list);
    }

    public C48382Mg(AnonymousClass205 r2, C62502rV r3, int i, long j) {
        super(r2, r3, i, j);
    }

    public GroupJid A19(int i) {
        C59632md A1A = A1A(i);
        if (A1A != null) {
            return A1A.A02;
        }
        return null;
    }

    public String A1B(int i) {
        C59632md A1A = A1A(i);
        if (A1A != null) {
            return A1A.A03;
        }
        return null;
    }

    public ArrayList A1C(int i) {
        ArrayList A13 = AnonymousClass000.A13();
        for (C59632md r1 : this.A00) {
            if (r1.A00 == i) {
                A13.add(r1);
            }
        }
        return A13;
    }

    public C48382Mg(AnonymousClass205 r2, int i, long j) {
        super(r2, i, j);
    }

    public C48382Mg(C63872tp r2, C62502rV r3, int i, long j) {
        super(r2, r3, i, j);
    }
}
