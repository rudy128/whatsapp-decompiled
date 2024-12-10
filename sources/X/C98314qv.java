package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4qv  reason: invalid class name and case insensitive filesystem */
public class C98314qv implements AnonymousClass1TI {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C98314qv(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A04 = str;
    }

    public final void accept(Object obj) {
        int i = this.A00;
        Object obj2 = this.A01;
        if (i != 0) {
            AnonymousClass1FU r5 = (AnonymousClass1FU) obj2;
            AnonymousClass4VE r1 = (AnonymousClass4VE) this.A02;
            AnonymousClass1BI r4 = (AnonymousClass1BI) this.A03;
            String str = this.A04;
            boolean A1Y = AnonymousClass000.A1Y(obj);
            if (!r5.Bed()) {
                r5.CMl(new C134136q6(r1.A01, r4, str, A1Y).A00());
                return;
            }
            return;
        }
        C33251iW r52 = (C33251iW) obj2;
        C692236j r42 = (C692236j) this.A03;
        String str2 = this.A04;
        ArrayList A14 = AnonymousClass000.A14((List) this.A02);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            A14.add(AnonymousClass3MZ.A10(it).A00);
        }
        r52.A0k(r42, str2, A14);
    }
}
