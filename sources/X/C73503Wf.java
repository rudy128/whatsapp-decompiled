package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.3Wf  reason: invalid class name and case insensitive filesystem */
public final class C73503Wf extends C38391rD {
    public List A00 = C18460wS.A00;
    public final AnonymousClass4SJ A01;
    public final C84984Lq A02;

    public C73503Wf(AnonymousClass4SJ r2, C84984Lq r3) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
        this.A02 = r3;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new AnonymousClass3ZI(AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131625755), this.A02);
    }

    public int A0Q() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        AnonymousClass3ZI r82 = (AnonymousClass3ZI) r8;
        C18070vi.A0d(r82, 0);
        C89514ca r5 = (C89514ca) this.A00.get(i);
        AnonymousClass4SJ r6 = this.A01;
        C18070vi.A0d(r5, 0);
        TextView textView = r82.A02;
        String str = r5.A03;
        if (str.length() == 0) {
            str = AnonymousClass3MY.A0m(r82.A00.getResources(), 2131888690);
        }
        textView.setText(str);
        String str2 = r5.A04;
        ImageView imageView = r82.A01;
        View view = r82.A00;
        r6.A00(AnonymousClass03S.A01(view.getContext(), 2131233676), imageView, str2);
        AnonymousClass3MZ.A1O(view, r82.A03, r5, 1);
    }
}
