package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import java.util.List;

/* renamed from: X.3Wu  reason: invalid class name and case insensitive filesystem */
public final class C73653Wu extends C38391rD {
    public C85004Ls A00;
    public List A01 = C18460wS.A00;

    public void Bmc(C42011xT r9, int i) {
        C18070vi.A0d(r9, 0);
        boolean z = r9 instanceof C74023Yf;
        View view = r9.A0H;
        if (z) {
            C90104dX.A00(view, this, i, 22);
            C74023Yf r92 = (C74023Yf) r9;
            AnonymousClass4V4 r2 = (AnonymousClass4V4) this.A01.get(i);
            C18070vi.A0d(r2, 0);
            C18100vl r6 = r92.A00;
            ((WDSListItem) AnonymousClass3MX.A14(r6)).setText((CharSequence) r2.A03);
            ((WDSListItem) AnonymousClass3MX.A14(r6)).setSubText((CharSequence) AnonymousClass3MW.A0x(r92.A0H.getResources(), Long.valueOf(((((long) r2.A00.A00) + 1048576) - 1) / 1048576), AnonymousClass3MW.A1a(), 0, 2131899514));
            return;
        }
        view.setOnClickListener((View.OnClickListener) null);
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            return new C74023Yf(AnonymousClass3MZ.A0D(viewGroup).inflate(2131626070, viewGroup, false));
        }
        if (i == 1) {
            View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131626069, viewGroup, false);
            AnonymousClass3MX.A1P(inflate);
            return new C42011xT(inflate);
        }
        throw AnonymousClass001.A13("No match for view type: ", AnonymousClass000.A10(), i);
    }

    public int A0Q() {
        return this.A01.size() + 1;
    }

    public int getItemViewType(int i) {
        return AnonymousClass000.A1T(i, this.A01.size()) ? 1 : 0;
    }
}
