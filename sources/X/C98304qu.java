package X;

import android.widget.ImageView;
import java.util.List;

/* renamed from: X.4qu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98304qu implements AnonymousClass1TI {
    public final /* synthetic */ AnonymousClass206 A00;
    public final /* synthetic */ AnonymousClass46l A01;
    public final /* synthetic */ List A02;

    public final void accept(Object obj) {
        String A022;
        AnonymousClass46l r10 = this.A01;
        AnonymousClass206 r0 = this.A00;
        List list = this.A02;
        AnonymousClass4OY r12 = (AnonymousClass4OY) obj;
        if (r0 instanceof C442222p) {
            AnonymousClass73C r3 = r12.A04;
            if (r3 != null) {
                r10.A0E.A0D(r10.A01, r3);
                r10.A04.setTitleAndDescription(AnonymousClass1EG.A0E(r3.A02(), 128), (String) null, list);
                List list2 = r3.A06;
                if (list2 != null && !list2.isEmpty()) {
                    r10.A04.setSubText(((C129926ib) r3.A06.get(0)).A02, list);
                    return;
                }
                return;
            }
            return;
        }
        List list3 = r12.A03;
        for (int i = 0; i < r10.A05.size(); i++) {
            if (i < list3.size()) {
                r10.A0E.A0D((ImageView) r10.A05.get(i), (AnonymousClass73C) list3.get(i));
            }
        }
        int i2 = r12.A00;
        AnonymousClass73C r02 = r12.A04;
        if (r02 == null) {
            A022 = null;
        } else {
            A022 = r02.A02();
        }
        if (A022 != null) {
            int i3 = i2 - 1;
            Object[] A1b = AnonymousClass3MX.A1b(AnonymousClass1EG.A0E(A022, 128), 0);
            C17880vN.A1T(A1b, i3, 1);
            r10.A04.setTitleAndDescription(r10.A03.A0K(A1b, 2131755076, (long) i3), (String) null, list);
            return;
        }
        C73163Qi r5 = r10.A04;
        Object[] objArr = new Object[1];
        C17880vN.A1T(objArr, i2, 0);
        r5.setTitleAndDescription(r10.A03.A0K(objArr, 2131755251, (long) i2), (String) null, (List) null);
    }

    public /* synthetic */ C98304qu(AnonymousClass206 r1, AnonymousClass46l r2, List list) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = list;
    }
}
