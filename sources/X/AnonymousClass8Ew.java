package X;

import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.8Ew  reason: invalid class name */
public final class AnonymousClass8Ew extends AnonymousClass287 {
    public C20272AEf A00;
    public String A01;
    public final Bundle A02;
    public final AnonymousClass9VF A03;
    public final C20079A6f A04;
    public final A5P A05;
    public final AEQ A06;
    public final ArrayList A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Ew(Bundle bundle, Bundle bundle2, AnonymousClass1FE r4, AnonymousClass9VF r5, C20272AEf aEf, C20079A6f a6f, A5P a5p, AEQ aeq, String str, ArrayList arrayList) {
        super(bundle, r4);
        AnonymousClass8BU.A1H(aEf, 5, aeq);
        this.A01 = str;
        this.A02 = bundle2;
        this.A00 = aEf;
        this.A04 = a6f;
        this.A06 = aeq;
        this.A05 = a5p;
        this.A07 = arrayList;
        this.A03 = r5;
    }

    public AnonymousClass1J2 A01(C37361pP r38) {
        AnonymousClass9VF r0 = this.A03;
        String str = this.A01;
        Bundle bundle = this.A02;
        C20272AEf aEf = this.A00;
        C20079A6f a6f = this.A04;
        AEQ aeq = this.A06;
        A5P a5p = this.A05;
        ArrayList arrayList = this.A07;
        AnonymousClass1K2 r1 = r0.A00;
        AnonymousClass10E r2 = r1.A01;
        AnonymousClass1KB A12 = AnonymousClass10E.A12(r2);
        AnonymousClass10I AL1 = AnonymousClass10E.AL1(r2);
        AnonymousClass118 A0l = AnonymousClass3MZ.A0l(r2);
        Application A002 = AnonymousClass0YX.A00(r2.Ao9);
        C18000vb A6Q = AnonymousClass10E.A6Q(r2);
        AnonymousClass1K1 r12 = r1.A00;
        C20653ATl A0L = AnonymousClass1K1.A0L(r12);
        AnonymousClass10G r02 = r2.A00;
        AnonymousClass1XN A0L2 = AnonymousClass8BU.A0L(r02);
        C219217x A0b = AnonymousClass3Ma.A0b(r2);
        AM5 A0E = AnonymousClass8BT.A0E(r02);
        AnonymousClass7CB A0O = AnonymousClass8BT.A0O(r02);
        C20272AEf aEf2 = aEf;
        C20079A6f a6f2 = a6f;
        A5L a5l = (A5L) r02.A4P.get();
        C199299zl r24 = (C199299zl) r02.A1Q.get();
        C22427B7j b7j = (C22427B7j) r12.A3m.get();
        AM7 am7 = (AM7) r02.A1W.get();
        return new AnonymousClass8FG(A002, bundle, r38, (C189329iu) r02.A1m.get(), A12, A0E, am7, aEf2, a6f2, A0L, a5l, r24, b7j, (C22433B7p) r12.A3l.get(), a5p, aeq, A0l, A0b, A6Q, A0L2, A0O, AL1, str, arrayList);
    }
}
