package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.6Fc  reason: invalid class name */
public abstract class AnonymousClass6Fc extends C120816Fm {
    public CharSequence A05(AnonymousClass1E7 r6, AnonymousClass206 r7) {
        int i;
        Drawable A02;
        Context context;
        int i2;
        String string;
        AnonymousClass1BI r1;
        if ((r6 == null || (r1 = r6.A0J) == null || this.A01.A0O(r1)) && !r7.A0v.A02) {
            return "";
        }
        CharSequence A01 = C120816Fm.A01(r6, r7, this);
        if (this instanceof AnonymousClass6FR) {
            A02 = AnonymousClass72W.A01(getContext(), (C441822l) r7);
        } else {
            boolean z = this instanceof AnonymousClass6FQ;
            if (z) {
                C441822l r12 = (C441822l) r7;
                C18070vi.A0d(r12, 0);
                A02 = AnonymousClass72W.A01(getContext(), r12);
                C18070vi.A0X(A02);
            } else if (this instanceof AnonymousClass6FS) {
                int i3 = 2131232017;
                if (r7 instanceof AnonymousClass21B) {
                    i3 = 2131232062;
                }
                A02 = AnonymousClass4aX.A02(getContext(), i3, 2131101888);
            } else {
                boolean z2 = this instanceof AnonymousClass6FT;
                Context context2 = getContext();
                if (z2) {
                    i = 2131232184;
                } else {
                    i = 2131231962;
                }
                A02 = AnonymousClass4aX.A02(context2, i, 2131101888);
            }
            if (z) {
                C441822l r72 = (C441822l) r7;
                C18070vi.A0d(r72, 0);
                string = C26066Crg.A00(this.A06, r72);
                C18070vi.A0X(string);
            } else {
                if (this instanceof AnonymousClass6FS) {
                    string = getContext().getString(2131889028);
                    if (r7 instanceof AnonymousClass21B) {
                        context = getContext();
                        i2 = 2131889029;
                    }
                } else if (this instanceof AnonymousClass6FT) {
                    context = getContext();
                    i2 = 2131889020;
                }
                string = context.getString(i2);
            }
            return AnonymousClass25G.A04(A01, C72813Np.A03(this.A01.getPaint(), A02, string));
        }
        string = C26066Crg.A00(this.A06, (C441822l) r7);
        return AnonymousClass25G.A04(A01, C72813Np.A03(this.A01.getPaint(), A02, string));
    }
}
