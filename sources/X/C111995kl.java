package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: X.5kl  reason: invalid class name and case insensitive filesystem */
public final class C111995kl extends C38391rD {
    public int A00 = -1;
    public final AnonymousClass8BD A01;
    public final ArrayList A02;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        return new C113255mn(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625340, false), this);
    }

    public int A0Q() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r7, int i) {
        int i2;
        C113255mn r72 = (C113255mn) r7;
        C18070vi.A0d(r72, 0);
        ArrayList arrayList = this.A02;
        int i3 = ((C127496eS) arrayList.get(r72.A05())).A00;
        if (((C127496eS) arrayList.get(r72.A05())).A01 && this.A00 == -1) {
            this.A00 = r72.A05();
        }
        View view = r72.A01;
        view.setTag(Integer.valueOf(i3));
        view.setOnClickListener(new AnonymousClass78A(this, view, r72, 12));
        view.setSelected(AnonymousClass000.A1T(r72.A05(), this.A00));
        int A002 = C1402470o.A00(i3);
        if (A002 != -1) {
            AnonymousClass3MY.A0w(view.getContext(), view, A002);
        }
        Context A04 = AnonymousClass3MY.A04(view);
        TextView textView = r72.A00;
        if (i3 == 2) {
            i2 = A04.getResources().getDimensionPixelSize(2131169009);
        } else {
            i2 = 0;
        }
        textView.setTypeface(C123936Wk.A00(A04, i3));
        textView.setPadding(0, i2, i2, 0);
    }

    public C111995kl(AnonymousClass8BD r2, ArrayList arrayList) {
        this.A02 = arrayList;
        this.A01 = r2;
    }
}
