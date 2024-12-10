package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;
import java.util.Set;

/* renamed from: X.8DA  reason: invalid class name */
public final class AnonymousClass8DA extends ArrayAdapter {
    public final Context A00;
    public final LayoutInflater A01;
    public final AnonymousClass9V3 A02;
    public final AnonymousClass9VC A03;
    public final C72043Kk A04;
    public final AnonymousClass1VW A05;
    public final C37451pZ A06;
    public final C18030ve A07;
    public final Set A08;

    public View getView(int i, View view, ViewGroup viewGroup) {
        B7T b7t;
        B7T b7t2;
        View view2 = view;
        C18070vi.A0d(viewGroup, 2);
        B7U b7u = (B7U) getItem(i);
        if (b7u != null) {
            if (view == null) {
                int itemViewType = getItemViewType(i);
                if (itemViewType == 0) {
                    view2 = this.A01.inflate(2131624676, viewGroup, false);
                    AnonymousClass3MY.A1B(view2, 2131429478, 8);
                    AnonymousClass9V3 r1 = this.A02;
                    C37451pZ r6 = this.A06;
                    AnonymousClass10E r2 = r1.A00.A01;
                    b7t2 = new AOM(view2, AnonymousClass3MZ.A0T(r2.A00), r6, AnonymousClass10E.A6Q(r2), AnonymousClass3MZ.A0u(r2), (C33971jg) r2.A5V.get());
                } else if (itemViewType == 1) {
                    view2 = this.A01.inflate(2131624676, viewGroup, false);
                    AnonymousClass3MY.A1B(view2, 2131429478, 8);
                    b7t2 = new AOK(view2, this.A04, this.A05);
                } else if (itemViewType == 2) {
                    boolean A052 = AnonymousClass1J8.A05(this.A07);
                    LayoutInflater layoutInflater = this.A01;
                    int i2 = 2131625857;
                    if (A052) {
                        i2 = 2131625858;
                    }
                    view2 = layoutInflater.inflate(i2, viewGroup, false);
                    b7t2 = new AOJ(view2);
                } else if (itemViewType != 3) {
                    view2 = null;
                } else {
                    boolean A053 = AnonymousClass1J8.A05(this.A07);
                    LayoutInflater layoutInflater2 = this.A01;
                    int i3 = 2131624289;
                    if (A053) {
                        i3 = 2131624290;
                    }
                    view2 = layoutInflater2.inflate(i3, viewGroup, false);
                    AnonymousClass9VC r12 = this.A03;
                    Set set = this.A08;
                    AnonymousClass10E r3 = r12.A00.A01;
                    AnonymousClass10G r22 = r3.A00;
                    C36401np A0e = AnonymousClass3MY.A0e(r22);
                    AnonymousClass1LU A0Z = AnonymousClass3MY.A0Z(r3);
                    b7t2 = new AOL(view2, AnonymousClass10E.A8r(r3), A0Z, (C41461wR) r22.A2r.get(), A0e, set);
                }
                b7t = b7t2;
                view2.setTag(b7t);
            } else {
                Object tag = view.getTag();
                C18070vi.A0z(tag, "null cannot be cast to non-null type com.whatsapp.blocklist.BlockListViewHolder");
                b7t = (B7T) tag;
            }
            b7t.Bmb(b7u);
            return view2;
        }
        View view3 = super.getView(i, view2, viewGroup);
        C18070vi.A0X(view3);
        return view3;
    }

    public int getViewTypeCount() {
        return 4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8DA(Context context, AnonymousClass9V3 r4, AnonymousClass9VC r5, C72043Kk r6, AnonymousClass1VW r7, C37451pZ r8, C18030ve r9, List list, Set set) {
        super(context, 2131624676, list);
        C18070vi.A0k(list, set);
        C18070vi.A0d(r8, 5);
        C18070vi.A0x(r4, r5, r7, r6, r9);
        this.A08 = set;
        this.A00 = context;
        this.A06 = r8;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r7;
        this.A04 = r6;
        this.A07 = r9;
        LayoutInflater from = LayoutInflater.from(context);
        C18070vi.A0X(from);
        this.A01 = from;
    }

    public int getItemViewType(int i) {
        B7U b7u = (B7U) getItem(i);
        if (b7u == null) {
            return super.getItemViewType(i);
        }
        return b7u.BTX();
    }
}
