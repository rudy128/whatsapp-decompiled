package X;

import java.util.List;

/* renamed from: X.6VX  reason: invalid class name */
public abstract class AnonymousClass6VX {
    public static AnonymousClass6US A00(List list) {
        int size = list.size();
        if (size == 0) {
            return C137566vf.A00;
        }
        if (size != 1) {
            return new C114175qH((AnonymousClass6US[]) list.toArray(new AnonymousClass6US[size]));
        }
        return (AnonymousClass6US) C108955ca.A0p(list);
    }
}
