package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.3WU  reason: invalid class name */
public final class AnonymousClass3WU extends C38391rD {
    public final C18030ve A00;
    public final List A01 = AnonymousClass000.A13();

    /* JADX WARNING: type inference failed for: r1v1, types: [X.3Xw, X.1xT] */
    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View A0B = AnonymousClass3MX.A0B(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131626890, false);
        ? r1 = new C42011xT(A0B);
        r1.A00 = C72453Mb.A0W(A0B, 2131435220);
        return r1;
    }

    public int A0Q() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        int i2;
        int A002;
        int i3;
        C73933Xw r82 = (C73933Xw) r8;
        C18070vi.A0d(r82, 0);
        TextView textView = r82.A00;
        List list = this.A01;
        textView.setText(((AEL) list.get(i)).A02);
        float applyDimension = TypedValue.applyDimension(1, 24.0f, AnonymousClass3Ma.A09(textView));
        if (((AEL) list.get(i)).A04) {
            i2 = 2131231806;
            if (C18020vd.A05(C18040vf.A02, this.A00, 7973)) {
                i3 = AnonymousClass1YL.A00(textView.getContext(), 2130971195, 2131102531);
            } else {
                i3 = 2131102239;
            }
            A002 = AnonymousClass1YL.A00(textView.getContext(), 2130970828, i3);
        } else {
            i2 = 2131231719;
            A002 = AnonymousClass1YL.A00(textView.getContext(), 2130971558, 2131102704);
        }
        Drawable A0B = AnonymousClass3MZ.A0B(textView, i2);
        C17960vV.A07(A0B);
        C18070vi.A0X(A0B);
        int i4 = (int) applyDimension;
        A0B.setBounds(0, 0, i4, i4);
        textView.setCompoundDrawables(A0B, (Drawable) null, (Drawable) null, (Drawable) null);
        C29261bv.A02(ColorStateList.valueOf(AnonymousClass3MY.A02(textView, A002)), textView);
    }

    public AnonymousClass3WU(C18030ve r2) {
        this.A00 = r2;
    }
}
