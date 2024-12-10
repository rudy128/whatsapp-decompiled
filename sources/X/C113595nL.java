package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

/* renamed from: X.5nL  reason: invalid class name and case insensitive filesystem */
public class C113595nL extends C42011xT {
    public final C35441mF A00;
    public final C18100vl A01;
    public final C18100vl A02;
    public final C18100vl A03;

    public static final void A00(Resources resources, View view, C18030ve r6) {
        if (C18020vd.A05(C18040vf.A02, r6, 4574)) {
            view.setPadding(view.getPaddingLeft(), resources.getDimensionPixelSize(2131165714), view.getPaddingRight(), resources.getDimensionPixelSize(2131165713));
        } else {
            C108985cd.A0z(view, resources.getDimensionPixelSize(2131168589));
        }
    }

    public void A0B(C41131vr r9, C18030ve r10) {
        WDSButton A07;
        View.OnClickListener r0;
        int i;
        if (this instanceof AnonymousClass2CX) {
            AnonymousClass2CX r4 = (AnonymousClass2CX) this;
            C18070vi.A0d(r9, 0);
            WDSSectionHeader wDSSectionHeader = r4.A01;
            wDSSectionHeader.setHeaderText(r9.A01);
            if (r9.A03) {
                wDSSectionHeader.setAddOnVisibility(0);
                wDSSectionHeader.setAddOnType(new AnonymousClass6Pk(C27881Xz.TONAL, AnonymousClass3MW.A0x(wDSSectionHeader.getResources(), r9.A02, new Object[1], 0, 2131895585)));
                A07 = wDSSectionHeader.A07(false);
                if (A07 != null) {
                    AnonymousClass3MW.A1Q(A07);
                    i = 33;
                } else {
                    return;
                }
            } else {
                int i2 = r9.A00;
                if (i2 != 0) {
                    wDSSectionHeader.setAddOnVisibility(0);
                    wDSSectionHeader.setAddOnType(new AnonymousClass6Pk(C27881Xz.BORDERLESS, wDSSectionHeader.getResources().getString(i2)));
                    A07 = wDSSectionHeader.A07(false);
                    if (A07 != null) {
                        i = 34;
                    } else {
                        return;
                    }
                } else {
                    wDSSectionHeader.setAddOnVisibility(8);
                    A07 = wDSSectionHeader.A07(false);
                    if (A07 != null) {
                        r0 = new AnonymousClass781(0);
                        A07.setOnClickListener(r0);
                        return;
                    }
                    return;
                }
            }
            r0 = new C89874dA(r4, i);
            A07.setOnClickListener(r0);
            return;
        }
        boolean A15 = C18070vi.A15(r9, r10);
        C18100vl r6 = this.A03;
        Resources resources = AnonymousClass3MW.A0A(r6).getResources();
        C18070vi.A0b(resources);
        boolean A05 = C18020vd.A05(C18040vf.A02, r10, 4574);
        TextView textView = (TextView) r6.getValue();
        if (A05) {
            C29261bv.A08(textView, 2132083062);
            AnonymousClass3MW.A0A(r6).setPadding(AnonymousClass3MW.A0A(r6).getPaddingLeft(), resources.getDimensionPixelSize(2131165714), AnonymousClass3MW.A0A(r6).getPaddingRight(), resources.getDimensionPixelSize(2131165713));
        } else {
            C29261bv.A08(textView, 2132083063);
            int dimensionPixelSize = resources.getDimensionPixelSize(2131168589);
            AnonymousClass3MW.A0A(r6).setPadding(AnonymousClass3MW.A0A(r6).getPaddingLeft(), dimensionPixelSize, AnonymousClass3MW.A0A(r6).getPaddingRight(), dimensionPixelSize);
        }
        C43421zm.A04((TextView) r6.getValue());
        ((TextView) r6.getValue()).setText(r9.A01);
        boolean z = r9.A03;
        C18100vl r2 = this.A01;
        C28931bI A0v = AnonymousClass3MX.A0v(r2);
        if (z) {
            A0v.A04(A15);
            if (AnonymousClass3MX.A0v(r2).A00 != null) {
                AnonymousClass3MW.A0J(C72463Mc.A0O(r2), 2131431830).setText(r9.A02);
                C89874dA.A00(C72463Mc.A0O(r2), this, 32);
            }
            View A0O = C72463Mc.A0O(r2);
            C18070vi.A0X(A0O);
            A00(resources, A0O, r10);
        } else if (A0v.A01() == 0) {
            AnonymousClass3MX.A0v(r2).A04(8);
        }
        int i3 = r9.A00;
        C18100vl r1 = this.A02;
        C28931bI A0v2 = AnonymousClass3MX.A0v(r1);
        if (i3 != 0) {
            A0v2.A04(A15 ? 1 : 0);
            ((TextView) C72463Mc.A0O(r1)).setText(i3);
            View A0O2 = C72463Mc.A0O(r1);
            C18070vi.A0X(A0O2);
            A00(resources, A0O2, r10);
            C89874dA.A00(C72463Mc.A0O(r1), this, 31);
        } else if (A0v2.A01() == 0) {
            AnonymousClass3MX.A0v(r1).A04(8);
        }
    }

    public C113595nL(View view, C35441mF r4) {
        super(view);
        this.A00 = r4;
        Integer num = AnonymousClass00R.A0C;
        this.A03 = AnonymousClass1DF.A00(num, new C148857i7(view));
        this.A01 = AnonymousClass1DF.A00(num, new C148837i5(view));
        this.A02 = AnonymousClass1DF.A00(num, new C148847i6(view));
    }
}
