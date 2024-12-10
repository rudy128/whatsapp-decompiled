package X;

import android.view.View;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.4kJ  reason: invalid class name and case insensitive filesystem */
public class C94244kJ implements AnonymousClass8AN {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass3gf A01;
    public final /* synthetic */ List A02;

    public C94244kJ(View view, AnonymousClass3gf r2, List list) {
        this.A01 = r2;
        this.A02 = list;
        this.A00 = view;
    }

    public void BuF() {
        C133146oF r3 = (C133146oF) this.A01.A0M.get();
        r3.A04.CGF(new C70563Bp(r3, 10));
        Bvd();
    }

    public void BuG(AnonymousClass1E7 r4) {
        if (r4 != null) {
            AnonymousClass3gf r1 = this.A01;
            List list = r1.A0V;
            boolean contains = list.contains(r4);
            List list2 = r1.A0U;
            Object obj = r4;
            if (contains) {
                obj = list.get(list.indexOf(r4));
            }
            list2.add(obj);
        }
        AnonymousClass3gf r2 = this.A01;
        C825548v r12 = new C825548v(r2, this.A02);
        r2.A0D = r12;
        C17890vO.A0u(r12, r2.A05);
        Bvd();
    }

    public void BuH() {
        AnonymousClass3gf r1 = this.A01;
        r1.A0X = true;
        C72463Mc.A18(r1, 2131431631);
        this.A00.setVisibility(8);
    }

    public void Bvd() {
        AnonymousClass3gf r2 = this.A01;
        r2.A0X = false;
        C72463Mc.A19(r2, 2131431631);
        this.A00.setVisibility(0);
    }

    public void C5X(int i) {
        AnonymousClass3gf r7 = this.A01;
        r7.findViewById(2131434939).setVisibility(8);
        TextView A0L = AnonymousClass3MX.A0L(r7, 2131430533);
        TextView A0L2 = AnonymousClass3MX.A0L(r7, 2131430534);
        View findViewById = r7.findViewById(2131434675);
        C90004dN.A00(findViewById, this, this.A02, 34);
        int i2 = 8;
        if (i != 2) {
            i2 = 0;
        }
        findViewById.setVisibility(i2);
        r7.A0M.get();
        int i3 = 2131888272;
        if (i != 0) {
            i3 = 2131889989;
            if (i != 2) {
                i3 = 2131896467;
            }
        }
        A0L.setText(i3);
        A0L.setVisibility(0);
        r7.A0M.get();
        int i4 = 2131892930;
        if (i != 0) {
            if (i == 2) {
                i4 = 2131894630;
            }
            A0L2.setVisibility(8);
        }
        Integer valueOf = Integer.valueOf(i4);
        if (valueOf != null) {
            A0L2.setText(valueOf.intValue());
            A0L2.setVisibility(0);
            return;
        }
        A0L2.setVisibility(8);
    }
}
