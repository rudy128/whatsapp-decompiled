package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Tu  reason: invalid class name */
public class AnonymousClass0Tu implements C16010rZ {
    public final int A00 = 1;
    public final Object A01;

    public AnonymousClass0Tu(AnonymousClass0D0 r5, float f) {
        C25411Oc A08 = C28851b7.A08(0, r5.A01());
        ArrayList arrayList = new ArrayList(C29351c6.A0C(A08, 10));
        Iterator it = A08.iterator();
        while (it.hasNext()) {
            arrayList.add(new AnonymousClass0U1(f, r5.A00(((AnonymousClass20T) it).A00())));
        }
        this.A01 = arrayList;
    }

    public /* bridge */ /* synthetic */ C17170uE BLz(int i) {
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                obj = ((List) obj).get(i);
                break;
            case 1:
                break;
            default:
                return (C17170uE) obj;
        }
        return (AnonymousClass0U1) obj;
    }

    public AnonymousClass0Tu(float f) {
        this.A01 = new AnonymousClass0U1(f, 0.01f);
    }

    public AnonymousClass0Tu(C17170uE r2) {
        this.A01 = r2;
    }
}
