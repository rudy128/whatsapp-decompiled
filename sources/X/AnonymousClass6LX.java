package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6LX  reason: invalid class name */
public class AnonymousClass6LX extends A34 {
    public final AnonymousClass6UX A00;
    public final AnonymousClass1SB A01;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, java.util.Comparator] */
    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        AnonymousClass1SB r6 = this.A01;
        List A0E = r6.A0E();
        ArrayList A0B = r6.A0B();
        ? obj = new Object();
        ArrayList A0z = C17880vN.A0z(A0E.size() + A0B.size());
        A0z.addAll(A0E);
        A0z.addAll(A0B);
        Collections.sort(A0z, obj);
        A0C(A0z);
        ArrayList A0C = r6.A0C();
        ArrayList A10 = C17880vN.A10(A0E);
        A10.addAll(A0C);
        Collections.sort(A10, obj);
        return A10;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        List list = (List) obj;
        C17960vV.A07(list);
        this.A00.A00(list);
    }

    public AnonymousClass6LX(AnonymousClass6UX r1, AnonymousClass1SB r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
