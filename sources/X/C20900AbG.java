package X;

import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;

/* renamed from: X.AbG  reason: case insensitive filesystem */
public class C20900AbG implements B9G {
    public final int A00;
    public final Object A01;

    public C20900AbG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bul(String str) {
        AnonymousClass1KB r0;
        switch (this.A00) {
            case 0:
                A5D a5d = (A5D) this.A01;
                A2X.A00(C108985cd.A0c(a5d.A0A, str), C21104AeY.class, a5d, 3);
                r0 = a5d.A01;
                break;
            case 1:
                r0 = ((C188069gp) this.A01).A01;
                break;
            case 2:
            case 3:
            case 4:
                ((AnonymousClass1FU) this.A01).CEx();
                return;
            case 5:
                r0 = ((AnonymousClass91y) this.A01).A00;
                break;
            case 9:
                C18070vi.A0d(str, 0);
                P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = (P2mLiteOrderDetailsActivity) this.A01;
                p2mLiteOrderDetailsActivity.CEx();
                A2X a2x = p2mLiteOrderDetailsActivity.A0P;
                if (a2x != null) {
                    a2x.A04(p2mLiteOrderDetailsActivity);
                }
                p2mLiteOrderDetailsActivity.A0P = null;
                AnonymousClass00H r02 = p2mLiteOrderDetailsActivity.A0V;
                if (r02 != null) {
                    A2X A0c = C108985cd.A0c(r02, str);
                    p2mLiteOrderDetailsActivity.A0P = A0c;
                    A2X.A00(A0c, C21107Aeb.class, p2mLiteOrderDetailsActivity, 13);
                    A2X a2x2 = p2mLiteOrderDetailsActivity.A0P;
                    if (a2x2 != null) {
                        A2X.A00(a2x2, C21105AeZ.class, p2mLiteOrderDetailsActivity, 14);
                    }
                    A2X a2x3 = p2mLiteOrderDetailsActivity.A0P;
                    if (a2x3 != null) {
                        A2X.A00(a2x3, C21109Aed.class, p2mLiteOrderDetailsActivity, 15);
                        return;
                    }
                    return;
                }
                C18070vi.A11("uiObserversFactory");
                throw null;
            default:
                r0 = ((AnonymousClass1FU) this.A01).A05;
                break;
        }
        r0.A04();
    }
}
