package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3vG  reason: invalid class name and case insensitive filesystem */
public class C79343vG extends AnonymousClass3SW {
    public final Resources A00;
    public final LayoutInflater A01;
    public final C24921Me A02;

    public C79343vG(Context context, AnonymousClass11S r12, AnonymousClass1M9 r13, C24921Me r14, C37451pZ r15, C88524a2 r16, C108875cR r17, AnonymousClass1W6 r18, AnonymousClass48j r19) {
        super(context, r12, r13, r15, r16, r17, r18, r19);
        this.A01 = LayoutInflater.from(context);
        this.A00 = context.getResources();
        this.A02 = r14;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        UserJid A0I;
        if (view != null) {
            inflate = view;
        } else {
            inflate = this.A01.inflate(2131625770, viewGroup, false);
        }
        ViewGroup A0D = AnonymousClass3MW.A0D(inflate, 2131429027);
        TextView A0E = C17880vN.A0E(inflate, 2131431903);
        if (A0D == null || A0E == null) {
            return super.getView(i, view, viewGroup);
        }
        View view2 = super.getView(i, A0D.getChildAt(0), viewGroup);
        if (view == null) {
            A0D.addView(view2);
        }
        AnonymousClass206 BTU = BTU(this.A02, i);
        C17960vV.A07(BTU);
        AnonymousClass22A A022 = C63892tr.A02(BTU);
        if (A022 != null && !A022.A0v.A02) {
            Resources resources = this.A00;
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass1M9 r4 = this.A02;
            C24921Me r3 = this.A02;
            C18070vi.A0d(BTU, 0);
            C18070vi.A0k(r4, r3);
            String str = null;
            if (!(A022.A0I() == null || (A0I = A022.A0I()) == null)) {
                str = r3.A0U(r4.A0H(A0I), C72453Mb.A04(C22971Dz.A0f(BTU) ? 1 : 0), false);
            }
            A0E.setText(AnonymousClass3MW.A0x(resources, str, A1a, 0, 2131891554));
        }
        return inflate;
    }
}
