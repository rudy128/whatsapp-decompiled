package X;

import java.util.Map;

/* renamed from: X.3Dn  reason: invalid class name and case insensitive filesystem */
public class C71033Dn implements C18080vj, AnonymousClass1OS {
    public final int A00;

    public C71033Dn(int i) {
        this.A00 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        if (this.A00 == 0) {
            return null;
        }
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        C18070vi.A0h(entry, entry2);
        return Integer.valueOf(Float.compare(((C59672mh) entry2.getValue()).A00, ((C59672mh) entry.getValue()).A00));
    }
}
