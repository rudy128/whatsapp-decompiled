package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.stickers.StickerView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5l4  reason: invalid class name and case insensitive filesystem */
public final class C112185l4 extends C38391rD {
    public int A00;
    public AnonymousClass1BI A01;
    public C1597385r A02;
    public List A03;
    public boolean A04;
    public long A05;
    public final int A06;
    public final LayoutInflater A07;
    public final C26631Sw A08;
    public final AnonymousClass88B A09;
    public final HashMap A0A = C17880vN.A11();

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        List list = C42011xT.A0I;
        C26631Sw r3 = this.A08;
        return new C113435n5(this.A07, viewGroup, r3, this.A09, Integer.valueOf(this.A06));
    }

    public long A0M(int i) {
        Number A1D;
        List list = this.A03;
        if (list == null || !this.A00 || (A1D = C108945cZ.A1D(((C1418377d) list.get(i)).A0F, this.A0A)) == null) {
            return -1;
        }
        return A1D.longValue();
    }

    public int A0Q() {
        return AnonymousClass001.A0m(this.A03);
    }

    public final void A0U(List list) {
        this.A03 = list;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1418377d A0x = C108945cZ.A0x(it);
                HashMap hashMap = this.A0A;
                if (hashMap.get(A0x.A0F) == null) {
                    long j = this.A05;
                    this.A05 = 1 + j;
                    hashMap.put(A0x.A0F, Long.valueOf(j));
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r22, int i) {
        View view;
        C1418377d r0;
        C113435n5 r3 = (C113435n5) r22;
        C18070vi.A0d(r3, 0);
        List list = this.A03;
        if (list != null) {
            int i2 = i;
            C1418377d r6 = (C1418377d) list.get(i2);
            boolean z = this.A04;
            if (z != r3.A03) {
                r3.A03 = z;
                if (!z) {
                    StickerView stickerView = r3.A07;
                    stickerView.A03 = false;
                    stickerView.A08();
                } else if (r3.A02) {
                    StickerView stickerView2 = r3.A07;
                    stickerView2.A03 = true;
                    stickerView2.A07();
                }
            }
            int i3 = this.A00;
            AnonymousClass1BI r5 = this.A01;
            if (r6 == null || (r0 = r3.A01) == null || !r6.A0F.equals(r0.A0F)) {
                r3.A01 = r6;
                if (r6 == null) {
                    View view2 = r3.A0H;
                    view2.setOnClickListener((View.OnClickListener) null);
                    r3.A07.setImageResource(0);
                    view2.setBackgroundResource(0);
                    view2.setClickable(false);
                } else {
                    String str = r6.A0F;
                    if (str == null || !str.equals("loading-hash")) {
                        view = r3.A0H;
                        view.setOnClickListener(new AnonymousClass6LB(r6, r5, r3, i2, 2));
                        view.setOnLongClickListener(r3.A04);
                    } else {
                        view = r3.A0H;
                        view.setOnClickListener((View.OnClickListener) null);
                        view.setClickable(false);
                    }
                    view.setBackgroundResource(2131232942);
                    C108955ca.A1B(view.getContext(), view, r6);
                    StickerView stickerView3 = r3.A07;
                    int dimensionPixelSize = AnonymousClass000.A0Y(stickerView3).getDimensionPixelSize(2131168921);
                    r3.A05.A06(new C59842my(stickerView3, r6, new AnonymousClass7MK(r3, 3), dimensionPixelSize, dimensionPixelSize, i3, i2, true, true, false));
                }
            }
            r3.A00 = new C1421578j(r6, this, 12);
        }
    }

    public C112185l4(Context context, C26631Sw r3, AnonymousClass88B r4, List list, int i) {
        C18070vi.A0p(context, r3, r4);
        this.A08 = r3;
        this.A09 = r4;
        this.A06 = i;
        LayoutInflater from = LayoutInflater.from(context);
        C18070vi.A0X(from);
        this.A07 = from;
        A0U(list);
        A0K(true);
    }
}
