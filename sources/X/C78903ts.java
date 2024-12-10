package X;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.3ts  reason: invalid class name and case insensitive filesystem */
public final class C78903ts extends C78743tZ {
    public ViewGroup A00;

    public static final void A02(C78903ts r6, String str) {
        r6.A0T.CGW(AnonymousClass3MY.A04(r6), Uri.parse(str), (AnonymousClass206) null, ((AnonymousClass210) r6.A0I).A00, C72453Mb.A05(C22971Dz.A0f(r6.A0I) ? 1 : 0));
    }

    public boolean A1V() {
        return this.A0l.CMI();
    }

    public ViewGroup getDateWrapper() {
        View A02;
        ViewGroup viewGroup = this.A00;
        if (viewGroup == null) {
            C28931bI r0 = this.A1U;
            if (r0 == null || (A02 = r0.A02()) == null || (viewGroup = AnonymousClass3MW.A0D(A02, 2131429812)) == null) {
                viewGroup = null;
            } else {
                C72453Mb.A1D(this.A06);
            }
            this.A00 = viewGroup;
        }
        return viewGroup;
    }

    public void A2i() {
        AnonymousClass4T6 r4;
        int i;
        C90074dU r5;
        super.A2i();
        AnonymousClass210 r2 = (AnonymousClass210) this.A0I;
        C18070vi.A0X(r2);
        if (this.A0E.A0I(r2.A07)) {
            String str = r2.A07;
            if (str != null) {
                r4 = new AnonymousClass4T6(str, this.A0E.A0L(str));
            } else {
                throw C17890vO.A0K();
            }
        } else {
            r4 = null;
        }
        if (r4 == null) {
            C28931bI r1 = this.A1U;
            if (r1 != null) {
                r1.A04(8);
                r5 = null;
                ViewGroup viewGroup = this.A02;
                if (viewGroup != null) {
                    A2C(viewGroup, new C98814rl((Object) null, this, 1), 2131887655, false);
                }
            } else {
                throw AnonymousClass000.A0k("Required value was null.");
            }
        } else {
            C28931bI r3 = this.A1U;
            if (r3 != null) {
                ImageView A0H = AnonymousClass3MW.A0H(AnonymousClass3MY.A0I(r3, 0), 2131428749);
                TextView A0E = C17880vN.A0E(r3.A02(), 2131428700);
                if (r4.A01) {
                    A0H.setImageResource(2131231645);
                    i = 2131887667;
                } else {
                    A0H.setImageResource(2131231622);
                    i = 2131887668;
                }
                A0E.setText(i);
                ViewGroup viewGroup2 = this.A02;
                if (viewGroup2 != null) {
                    A2C(viewGroup2, new C98814rl(r4, this, 1), 2131887655, true);
                }
                r5 = new C90074dU(this, r4, 8);
            } else {
                throw AnonymousClass000.A0k("Required value was null.");
            }
        }
        setOnClickListener(r5);
    }

    public TextView getDateView() {
        ViewGroup dateWrapper = getDateWrapper();
        if (dateWrapper != null) {
            return C17880vN.A0E(dateWrapper, 2131429789);
        }
        return null;
    }

    public ImageView getStatusView() {
        ViewGroup dateWrapper = getDateWrapper();
        if (dateWrapper != null) {
            return AnonymousClass3MW.A0H(dateWrapper, 2131435610);
        }
        return null;
    }
}
