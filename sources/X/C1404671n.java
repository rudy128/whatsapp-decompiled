package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.71n  reason: invalid class name and case insensitive filesystem */
public final class C1404671n {
    public View A00;
    public final C24661Le A01;
    public final C18030ve A02;
    public final C24641Lc A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new C153567pj(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new C153577pk(this));
    public final C18100vl A06 = AnonymousClass1DF.A01(new C153587pl(this));
    public final C18100vl A07 = AnonymousClass1DF.A01(new C153597pm(this));
    public final C18100vl A08 = AnonymousClass1DF.A01(new C153607pn(this));
    public final C18100vl A09 = AnonymousClass1DF.A01(new C153617po(this));
    public final C18100vl A0A = AnonymousClass1DF.A01(new C153627pp(this));
    public final C18100vl A0B = AnonymousClass1DF.A01(new C153637pq(this));

    public static final AnonymousClass77K A00(C1404671n r6, int i) {
        ArrayList A0A2;
        ArrayList A0B2;
        int i2 = i;
        if (!r6.A03.A04() || i != 0) {
            C24661Le r0 = r6.A01;
            A0A2 = r0.A0A();
            A0B2 = r0.A0B();
        } else {
            A0A2 = r6.A01.A0A();
            A0B2 = AnonymousClass000.A13();
            i2 = 2;
        }
        return new AnonymousClass77K(A0A2, A0B2, i2, false, false, false, false);
    }

    public static final void A01(C1404671n r2) {
        C18100vl r0;
        if (r2.A03.A04()) {
            C108995ce.A1T(r2.A04, false);
            r0 = r2.A0B;
        } else {
            C108995ce.A1T(r2.A09, false);
            C108995ce.A1T(r2.A05, false);
            r0 = r2.A06;
        }
        C108995ce.A1T(r0, false);
    }

    public final void A02(AnonymousClass77K r7) {
        int A052;
        C18100vl r0;
        TextView A0X;
        View view;
        Resources resources;
        int i;
        if (r7 != null) {
            A052 = r7.A00;
        } else {
            A052 = this.A01.A05();
        }
        A01(this);
        C24641Lc r3 = this.A03;
        if (r3.A04()) {
            if (A052 != 0) {
                if (A052 == 1) {
                    r0 = this.A0B;
                } else if (A052 != 2) {
                    throw AnonymousClass000.A0n("unknown status distribution mode");
                }
            }
            r0 = this.A04;
        } else if (A052 == 0) {
            r0 = this.A09;
        } else if (A052 == 1) {
            r0 = this.A05;
        } else if (A052 == 2) {
            r0 = this.A06;
        } else {
            throw AnonymousClass000.A0n("unknown status distribution mode");
        }
        C108995ce.A1T(r0, true);
        if (C18020vd.A05(C18040vf.A02, this.A02, 6325)) {
            if (r7 == null) {
                r7 = A00(this, A052);
            }
            List list = r7.A01;
            List list2 = r7.A02;
            int size = list.size();
            int size2 = list2.size();
            if (r3.A04()) {
                A0X = C72453Mb.A0X(this.A0A);
                view = this.A00;
                resources = view.getResources();
                i = 2131755409;
            } else {
                A0X = C72453Mb.A0X(this.A08);
                view = this.A00;
                resources = view.getResources();
                i = 2131755407;
            }
            A0X.setText(C72473Md.A0k(resources, size, i));
            C72453Mb.A0X(this.A07).setText(C72473Md.A0k(view.getResources(), size2, 2131755408));
        }
    }

    public C1404671n(View view, C24661Le r3, C18030ve r4, C24641Lc r5) {
        C18070vi.A0o(r4, r3, r5);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = view;
    }
}
