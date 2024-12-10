package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.48r  reason: invalid class name */
public class AnonymousClass48r extends A34 {
    public final String A00;
    public final ArrayList A01;
    public final List A02;
    public final boolean A03;
    public final /* synthetic */ AnonymousClass4aY A04;

    public AnonymousClass48r(AnonymousClass4aY r1, String str, ArrayList arrayList, List list, boolean z) {
        this.A04 = r1;
        this.A02 = list;
        this.A01 = arrayList;
        this.A03 = z;
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        AnonymousClass4aY r5 = this.A04;
        AnonymousClass122 r4 = r5.A2z;
        List<AnonymousClass205> list = this.A02;
        ArrayList A13 = AnonymousClass000.A13();
        for (AnonymousClass205 A012 : list) {
            AnonymousClass206 A013 = AnonymousClass1W2.A01(A012, r4.A1E);
            if (A013 != null) {
                A13.add(A013);
            }
        }
        ArrayList A10 = C17880vN.A10(A13);
        C33251iW A0X = AnonymousClass3MX.A0X(r5);
        C34531kd r3 = r5.A1R;
        ArrayList A102 = C17880vN.A10(A10);
        Collections.sort(A102, new C98924rw(15));
        A0X.A0N(r3, (C692236j) null, this.A00, A102, this.A01, this.A03);
        return null;
    }
}
