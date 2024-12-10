package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5rI  reason: invalid class name and case insensitive filesystem */
public final class C114585rI extends AnonymousClass290 {
    public final Context A00;
    public final AnonymousClass1F9 A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass1VW A04;
    public final AnonymousClass1M9 A05;
    public final C24921Me A06;
    public final C27191Vc A07;
    public final C18000vb A08;
    public final C18030ve A09;
    public final C111215j4 A0A;
    public final C200710s A0B;

    public /* bridge */ /* synthetic */ Object A0J(ViewGroup viewGroup, int i) {
        C133866pd r11;
        C18070vi.A0d(viewGroup, 0);
        C111215j4 r12 = this.A0A;
        if (i == 0) {
            r11 = r12.A04;
        } else {
            r11 = (C133866pd) AnonymousClass3MW.A10(r12.A06).get(i - 1);
        }
        RecyclerView recyclerView = new RecyclerView(this.A00, (AttributeSet) null);
        recyclerView.setId(2131434357);
        recyclerView.setPadding(0, AnonymousClass000.A0Y(recyclerView).getDimensionPixelSize(2131168775), 0, 0);
        recyclerView.setClipToPadding(false);
        AnonymousClass3Ma.A15(recyclerView.getContext(), recyclerView);
        C18030ve r10 = this.A09;
        AnonymousClass1KB r3 = this.A02;
        AnonymousClass11S r4 = this.A03;
        AnonymousClass1VW r5 = this.A04;
        AnonymousClass1M9 r6 = this.A05;
        C200710s r13 = this.A0B;
        C24921Me r7 = this.A06;
        C18000vb r9 = this.A08;
        recyclerView.setAdapter(new C112235l9(this.A01, r3, r4, r5, r6, r7, this.A07, r9, r10, r11, r12, r13));
        viewGroup.addView(recyclerView);
        return new C19760yx(recyclerView, r11);
    }

    public C114585rI(Context context, AnonymousClass1F9 r5, AnonymousClass1KB r6, AnonymousClass11S r7, AnonymousClass1VW r8, AnonymousClass1M9 r9, C24921Me r10, C27191Vc r11, C18000vb r12, C18030ve r13, C111215j4 r14, C200710s r15) {
        C18070vi.A0d(r14, 12);
        this.A09 = r13;
        this.A02 = r6;
        this.A03 = r7;
        this.A04 = r8;
        this.A05 = r9;
        this.A0B = r15;
        this.A06 = r10;
        this.A08 = r12;
        this.A07 = r11;
        this.A00 = context;
        this.A01 = r5;
        this.A0A = r14;
        AnonymousClass7AS.A00(r5, r14.A06, new C1584780v(this), 11);
    }

    public CharSequence A0C(int i) {
        String A0q;
        if (i == 0) {
            C18000vb r7 = this.A08;
            Context context = this.A00;
            int A022 = C108975cc.A02(this.A0A.A04.A02);
            String[] strArr = C1409073n.A04;
            C18070vi.A0d(context, 1);
            A0q = context.getResources().getQuantityString(2131755350, A022, new Object[]{C1409073n.A01(context, r7, A022)});
        } else {
            C133866pd r6 = (C133866pd) AnonymousClass3MW.A10(this.A0A.A06).get(i - 1);
            C18000vb r1 = this.A08;
            Context context2 = this.A00;
            String A012 = C1409073n.A01(context2, r1, C108975cc.A02(r6.A02));
            Object[] A1b = AnonymousClass3MW.A1b();
            A1b[0] = r6.A03;
            A0q = C17880vN.A0q(context2, A012, A1b, 1, 2131894924);
        }
        C18070vi.A0X(A0q);
        return A0q;
    }

    public int A0E() {
        return C108975cc.A02(this.A0A.A06) + 1;
    }

    public /* bridge */ /* synthetic */ int A0I(Object obj) {
        int i;
        C19760yx r5 = (C19760yx) obj;
        C18070vi.A0d(r5, 0);
        C111215j4 r3 = this.A0A;
        Object obj2 = r5.A01;
        if (obj2 != null) {
            C133866pd r2 = (C133866pd) obj2;
            C18070vi.A0d(r2, 0);
            if (C18070vi.A18(r2.A03, r3.A04.A03)) {
                return 0;
            }
            int indexOf = AnonymousClass3MW.A10(r3.A06).indexOf(r2);
            if (indexOf < 0 || (i = indexOf + 1) == -1) {
                return -2;
            }
            return i;
        }
        throw C17880vN.A0g();
    }

    public /* bridge */ /* synthetic */ void A0K(ViewGroup viewGroup, Object obj, int i) {
        C19760yx r3 = (C19760yx) obj;
        C18070vi.A0i(viewGroup, r3);
        viewGroup.removeView((View) r3.A00);
    }

    public /* bridge */ /* synthetic */ boolean A0L(View view, Object obj) {
        C19760yx r3 = (C19760yx) obj;
        C18070vi.A0h(view, r3);
        return AnonymousClass000.A1Z(view, r3.A00);
    }
}
