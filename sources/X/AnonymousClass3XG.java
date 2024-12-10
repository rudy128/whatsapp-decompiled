package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaDynamicRoundCornerImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3XG  reason: invalid class name */
public class AnonymousClass3XG extends C38391rD {
    public final Resources A00;
    public final C18030ve A01;
    public final C85304Mw A02;
    public final AnonymousClass10I A03;
    public final List A04 = AnonymousClass000.A13();
    public final Map A05 = C17880vN.A11();

    public int A0Q() {
        return this.A04.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r5, int i) {
        C73913Xu r52 = (C73913Xu) r5;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            AnonymousClass47c r53 = (AnonymousClass47c) r52;
            C17890vO.A0t(r53.A00);
            AnonymousClass495 r1 = new AnonymousClass495(r53.A0H.getContext(), r53.A01, (File) ((C85294Mv) this.A04.get(i)).A01);
            r53.A00 = r1;
            C17890vO.A0u(r1, r53.A02);
            this.A05.put(Integer.valueOf(i), r53.A00);
        } else if (itemViewType == 1) {
            AnonymousClass47c r54 = (AnonymousClass47c) r52;
            int A0M = AnonymousClass000.A0M(((C85294Mv) this.A04.get(i)).A01);
            Resources resources = this.A00;
            C17960vV.A07(resources);
            Drawable drawable = resources.getDrawable(A0M);
            AnonymousClass495 r12 = r54.A00;
            if (r12 != null) {
                r12.A0B(true);
                r54.A00 = null;
            }
            r54.A01.setImageDrawable(drawable);
        } else if (itemViewType == 2) {
            AnonymousClass47b r55 = (AnonymousClass47b) r52;
            int A06 = C72453Mb.A06(AnonymousClass000.A1Y(((C85294Mv) this.A04.get(i)).A01) ? 1 : 0);
            r55.A00.setVisibility(A06);
            r55.A01.setVisibility(A06);
        }
    }

    public int getItemViewType(int i) {
        return ((C85294Mv) this.A04.get(i)).A00;
    }

    public AnonymousClass3XG(Resources resources, C18030ve r3, C85304Mw r4, AnonymousClass10I r5) {
        this.A03 = r5;
        this.A00 = resources;
        this.A02 = r4;
        this.A01 = r3;
    }

    public void A0U(C19760yx r6, List list, int i) {
        ArrayList A13 = AnonymousClass000.A13();
        for (Object r2 : list) {
            A13.add(new C85294Mv(r2, 0));
        }
        if (i != 0) {
            if (i == 1) {
                A13.add(new C85294Mv(true, 2));
                A13.add(new AnonymousClass47g());
            } else {
                A13.add(new C85294Mv(AnonymousClass000.A0h(), 2));
                Object obj = r6.A00;
                C17960vV.A07(obj);
                for (Object r22 : (List) obj) {
                    A13.add(new C85294Mv(r22, 1));
                }
            }
        }
        List list2 = this.A04;
        C72473Md.A1B(new C73423Vt(list2, A13), this, A13, list2);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.3gh, android.widget.ImageView, android.view.View, com.whatsapp.WaDynamicRoundCornerImageView, X.1cJ] */
    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C42011xT r3;
        View view;
        View.OnClickListener onClickListener;
        Context context = viewGroup.getContext();
        if (i == 0 || i == 1) {
            AnonymousClass10I r5 = this.A03;
            C18030ve r1 = this.A01;
            List list = C42011xT.A0I;
            ? waDynamicRoundCornerImageView = new WaDynamicRoundCornerImageView(context);
            waDynamicRoundCornerImageView.A05();
            if (AnonymousClass1J8.A01(r1)) {
                waDynamicRoundCornerImageView.setRadius(context.getResources().getDimension(2131169405));
                int round = Math.round(context.getResources().getDimension(2131169544));
                C38491rN r0 = new C38491rN(-1, -1);
                r0.setMargins(round, round, round, round);
                waDynamicRoundCornerImageView.setLayoutParams(r0);
            }
            AnonymousClass3MW.A1R(waDynamicRoundCornerImageView);
            r3 = new AnonymousClass47c(waDynamicRoundCornerImageView, r5);
            view = r3.A0H;
            onClickListener = new AnonymousClass6LF(this, r3, 25);
        } else {
            AnonymousClass3MX.A1O(context);
            LayoutInflater from = LayoutInflater.from(context);
            if (i == 3) {
                View A0D = AnonymousClass3MY.A0D(from, 2131625147);
                C18070vi.A0X(A0D);
                return new C42011xT(A0D);
            }
            View A0D2 = AnonymousClass3MY.A0D(from, 2131625148);
            C18070vi.A0b(A0D2);
            r3 = new AnonymousClass47b(A0D2);
            view = r3.A0H;
            onClickListener = new C89974dK(this, 27);
        }
        view.setOnClickListener(onClickListener);
        return r3;
    }
}
