package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import java.util.List;

/* renamed from: X.8Ht  reason: invalid class name and case insensitive filesystem */
public final class C161788Ht extends C38391rD {
    public C51232Xm A00;
    public C22553BCk A01;
    public List A02;

    public C161788Ht(C51232Xm r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 2) {
            Chip A002 = A00(AnonymousClass3MY.A05(viewGroup));
            C22553BCk bCk = this.A01;
            if (bCk != null) {
                return new C169408kz(A002, bCk);
            }
        } else if (i == 3) {
            Chip A003 = A00(AnonymousClass3MY.A05(viewGroup));
            C22553BCk bCk2 = this.A01;
            if (bCk2 != null) {
                return new C169408kz(A003, bCk2);
            }
        } else if (i == 4) {
            Chip A004 = A00(AnonymousClass3MY.A05(viewGroup));
            C22553BCk bCk3 = this.A01;
            if (bCk3 != null) {
                return new C169408kz(A004, bCk3);
            }
        } else if (i == 6) {
            View A0D = AnonymousClass3MY.A0D(LayoutInflater.from(AnonymousClass3MY.A05(viewGroup)), 2131624268);
            C18070vi.A0X(A0D);
            C22553BCk bCk4 = this.A01;
            if (bCk4 != null) {
                return new AnonymousClass8l0(A0D, bCk4);
            }
        } else if (i == 7) {
            C51232Xm r1 = this.A00;
            Chip A005 = A00(AnonymousClass3MY.A04(viewGroup));
            C22553BCk bCk5 = this.A01;
            if (bCk5 != null) {
                List list = C42011xT.A0I;
                return new C169398ky(A005, bCk5, AnonymousClass10E.A6Q(r1.A00.A01));
            }
        } else {
            throw AnonymousClass8BX.A0W("FilterBarAdapter /onCreateViewHolder unhandled view type: ", AnonymousClass000.A10(), i);
        }
        C18070vi.A11("onItemClickListener");
        throw null;
    }

    public static final Chip A00(Context context) {
        Chip chip = new Chip(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131168352);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = dimensionPixelSize;
        marginLayoutParams.rightMargin = dimensionPixelSize;
        chip.setLayoutParams(marginLayoutParams);
        chip.setChipEndPadding(context.getResources().getDimension(2131166480));
        chip.setChipStartPadding(context.getResources().getDimension(2131166480));
        chip.setCloseIconResource(2131232029);
        return chip;
    }

    public int A0Q() {
        List list = this.A02;
        if (list != null) {
            return list.size();
        }
        C18070vi.A11("filterListItems");
        throw null;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r2, int i) {
        AnonymousClass8J2 r22 = (AnonymousClass8J2) r2;
        C18070vi.A0d(r22, 0);
        List list = this.A02;
        if (list == null) {
            C18070vi.A11("filterListItems");
            throw null;
        } else {
            r22.A0B((C180589Nd) list.get(i));
        }
    }

    public int getItemViewType(int i) {
        List list = this.A02;
        if (list == null) {
            C18070vi.A11("filterListItems");
            throw null;
        }
        Object obj = list.get(i);
        if (obj instanceof C169298ko) {
            return 2;
        }
        if (obj instanceof C169308kp) {
            return 7;
        }
        if (obj instanceof C169328kr) {
            return 3;
        }
        if (obj instanceof C169318kq) {
            return 4;
        }
        if (obj instanceof C169288kn) {
            return 6;
        }
        throw AnonymousClass3MW.A14();
    }
}
