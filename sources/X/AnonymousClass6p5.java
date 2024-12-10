package X;

import android.view.View;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.6p5  reason: invalid class name */
public final class AnonymousClass6p5 {
    public final AnonymousClass1M9 A00;
    public final C24921Me A01;
    public final C18140vp A02;

    public final AnonymousClass7C7 A00(List list, AnonymousClass1OS r18, int i) {
        View.OnClickListener onClickListener;
        List list2 = list;
        C18070vi.A0d(list2, 0);
        if (C72473Md.A1Z(this.A02)) {
            AnonymousClass4ZN A04 = AnonymousClass74H.A04(this.A00, this.A01, list2, 1, false, true);
            A04.getClass();
            Object[] objArr = {A04};
            AnonymousClass6IS A012 = C1402670q.A01(objArr, 2131755507, list2.size());
            Object[] objArr2 = {A04};
            AnonymousClass720 r1 = new AnonymousClass720(C122636Rd.A0E, C1402670q.A01(objArr2, 2131755508, list2.size()), (AnonymousClass4ZN) null, 0);
            r1.A03 = A012;
            List A0t = C29431cG.A0t(list2);
            r1.A06 = A0t;
            r1.A08 = AnonymousClass000.A1a(A0t);
            return r1.A02();
        }
        AnonymousClass4ZN A042 = AnonymousClass74H.A04(this.A00, this.A01, list2, 3, true, false);
        A042.getClass();
        Object[] objArr3 = {A042};
        AnonymousClass6IS A013 = C1402670q.A01(objArr3, 2131755507, list2.size());
        C122636Rd r3 = C122636Rd.A0E;
        AnonymousClass6IS A014 = C1402670q.A01(new Object[0], 2131755506, list2.size());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        List A0t2 = C29431cG.A0t(list2);
        boolean A1a = AnonymousClass000.A1a(A0t2);
        AnonymousClass1OS r0 = r18;
        if (r18 != null) {
            onClickListener = (View.OnClickListener) r0.invoke(list2, r3);
        } else {
            onClickListener = null;
        }
        return new AnonymousClass7C7(onClickListener, scaleType, r3, (C107345Zi) null, A042, A014, A013, (AnonymousClass4ZN) null, (Long) null, A0t2, i, A1a, true, true, false);
    }

    public final AnonymousClass7C7 A01(List list, AnonymousClass1OS r14, int i) {
        AnonymousClass720 r1;
        View.OnClickListener onClickListener;
        List list2 = list;
        C18070vi.A0d(list, 0);
        if (C72473Md.A1Z(this.A02)) {
            AnonymousClass4ZN A04 = AnonymousClass74H.A04(this.A00, this.A01, list2, 1, false, true);
            A04.getClass();
            Object[] objArr = {A04};
            r1 = new AnonymousClass720(C122636Rd.A0F, C1402670q.A01(objArr, 2131755505, list.size()), (AnonymousClass4ZN) null, 0);
            List A0t = C29431cG.A0t(list);
            r1.A06 = A0t;
            r1.A08 = AnonymousClass000.A1a(A0t);
        } else {
            C122636Rd r3 = C122636Rd.A0F;
            AnonymousClass4ZN A042 = AnonymousClass74H.A04(this.A00, this.A01, list, 3, true, false);
            A042.getClass();
            r1 = new AnonymousClass720(r3, A042, C1402670q.A01(new Object[0], 2131755504, list.size()), i);
            List A0t2 = C29431cG.A0t(list);
            r1.A06 = A0t2;
            r1.A08 = AnonymousClass000.A1a(A0t2);
            r1.A07 = true;
            if (r14 != null) {
                onClickListener = (View.OnClickListener) r14.invoke(list, r3);
            } else {
                onClickListener = null;
            }
            r1.A03(onClickListener);
        }
        return r1.A02();
    }

    public AnonymousClass6p5(AnonymousClass1M9 r1, C24921Me r2, C18140vp r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
