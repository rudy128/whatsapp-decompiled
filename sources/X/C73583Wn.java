package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.3Wn  reason: invalid class name and case insensitive filesystem */
public final class C73583Wn extends C38391rD {
    public List A00;
    public final Context A01;
    public final LayoutInflater A02;
    public final C24921Me A03;
    public final C37451pZ A04;
    public final C18000vb A05;
    public final AnonymousClass1CJ A06;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        List list = C42011xT.A0I;
        return new AnonymousClass3Z1(AnonymousClass3MX.A0B(this.A02, viewGroup, 2131623969, false));
    }

    public int A0Q() {
        List list = this.A00;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        Context context;
        int i2;
        int i3;
        AnonymousClass3Z1 r82 = (AnonymousClass3Z1) r8;
        C18070vi.A0d(r82, 0);
        List list = this.A00;
        if (list != null) {
            AnonymousClass1E7 r6 = (AnonymousClass1E7) list.get(i);
            TextView textView = r82.A01;
            String A0K = r6.A0K();
            if (A0K != null && A0K.length() > 0) {
                textView.setText(r6.A0K());
            } else if (r6.A0O()) {
                textView.setText(this.A03.A0W(r6, false));
                textView.setSingleLine(false);
            } else {
                String A0F = this.A06.A0F(AnonymousClass1E7.A00(r6));
                if (A0F == null || A0F.length() <= 0) {
                    String str = r6.A0c;
                    if (str == null || str.length() <= 0) {
                        A0F = this.A05.A0G(AnonymousClass17K.A02(r6));
                        textView.setSingleLine(true);
                    } else {
                        A0F = AnonymousClass3MX.A17(this.A03, r6);
                        textView.setSingleLine(false);
                        context = this.A01;
                        i2 = 2130971113;
                        i3 = 2131102439;
                        C72463Mc.A0y(context, textView, i2, i3);
                        textView.setText(A0F);
                        this.A04.A0C(r82.A00, r6, false);
                    }
                } else {
                    textView.setSingleLine(false);
                }
                context = this.A01;
                i2 = 2130970831;
                i3 = 2131102246;
                C72463Mc.A0y(context, textView, i2, i3);
                textView.setText(A0F);
                this.A04.A0C(r82.A00, r6, false);
            }
            C72463Mc.A0y(this.A01, textView, 2130970831, 2131102246);
            this.A04.A0C(r82.A00, r6, false);
        }
    }

    public C73583Wn(Context context, LayoutInflater layoutInflater, C24921Me r3, C37451pZ r4, C18000vb r5, AnonymousClass1CJ r6) {
        C18070vi.A0p(r6, layoutInflater, r3);
        C72473Md.A1J(r5, r4);
        this.A01 = context;
        this.A06 = r6;
        this.A02 = layoutInflater;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
    }
}
