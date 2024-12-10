package X;

import java.util.Comparator;

/* renamed from: X.3D2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3D2 implements Comparator {
    public final /* synthetic */ boolean A00;

    public final int compare(Object obj, Object obj2) {
        boolean z = this.A00;
        int i = (((C60182nW) obj).A00.A0I > ((C60182nW) obj2).A00.A0I ? 1 : (((C60182nW) obj).A00.A0I == ((C60182nW) obj2).A00.A0I ? 0 : -1));
        if (z) {
            return -i;
        }
        return i;
    }

    public /* synthetic */ AnonymousClass3D2(boolean z) {
        this.A00 = z;
    }
}
