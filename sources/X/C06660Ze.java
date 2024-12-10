package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.0Ze  reason: invalid class name and case insensitive filesystem */
public class C06660Ze implements Comparator {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C06660Ze(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final int compare(Object obj, Object obj2) {
        if (this.A00 != 0) {
            return AnonymousClass1XO.A00(((AnonymousClass0sR) this.A01).BkQ((AnonymousClass0sU) ((List) this.A02).get(((Integer) obj).intValue())), ((AnonymousClass0sR) this.A01).BkQ((AnonymousClass0sU) ((List) this.A02).get(((Integer) obj2).intValue())));
        }
        int compare = ((Comparator) this.A02).compare(obj, obj2);
        if (compare == 0) {
            return ((Comparator) this.A01).compare(((C05060Qg) obj).A03, ((C05060Qg) obj2).A03);
        }
        return compare;
    }
}
