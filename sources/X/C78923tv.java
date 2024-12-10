package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3tv  reason: invalid class name and case insensitive filesystem */
public final class C78923tv extends AnonymousClass3sI {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public List A04;
    public final AnonymousClass5ZC A05;
    public final AnonymousClass5ZD A06;
    public final AnonymousClass5ZE A07;
    public final AnonymousClass5ZF A08;
    public final AnonymousClass5ZH A09;
    public final Drawable A0A;

    public Drawable A1Q(int i, int i2, boolean z) {
        if (i == 1) {
            return this.A0A;
        }
        Drawable A1Q = super.A1Q(i, i2, z);
        C18070vi.A0X(A1Q);
        return A1Q;
    }

    public void A1u() {
        AnonymousClass3uP.A0h(this, false);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass3MX.A0C(this, 2131429521);
        List list = this.A04;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                viewGroup.removeView(AnonymousClass3MX.A0E(it));
            }
        }
        this.A04 = null;
        A00();
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    public C78923tv(Context context, AnonymousClass5ZC r4, AnonymousClass5ZD r5, AnonymousClass5ZE r6, AnonymousClass5ZF r7, AnonymousClass5ZH r8, C108875cR r9, C436420i r10) {
        super(context, r9, r10);
        A1M();
        this.A07 = r6;
        this.A09 = r8;
        this.A08 = r7;
        this.A05 = r4;
        this.A06 = r5;
        Drawable A062 = AnonymousClass3MX.A06(context, 2131231078);
        C18070vi.A0X(A062);
        this.A0A = A062;
        setClickable(false);
        this.A2e = true;
        this.A2i = false;
        setOnClickListener((View.OnClickListener) null);
        A00();
    }

    private final void A00() {
        List list;
        View view;
        AnonymousClass5ZF r0;
        View view2;
        View view3;
        ViewGroup A0D = AnonymousClass3MW.A0D(this, 2131429521);
        C18070vi.A0b(A0D);
        if (this.A01 == null) {
            AnonymousClass5ZE r2 = this.A07;
            LinearLayout.LayoutParams layoutParams = null;
            if (r2 != null) {
                view3 = (View) r2;
            } else {
                view3 = null;
            }
            this.A01 = view3;
            if (r2 != null) {
                layoutParams = r2.getHeaderLayoutParams();
            }
            A0D.addView(view3, layoutParams);
        }
        if (this.A03 == null) {
            AnonymousClass5ZH r22 = this.A09;
            LinearLayout.LayoutParams layoutParams2 = null;
            if (r22 != null) {
                view2 = (View) r22;
            } else {
                view2 = null;
            }
            this.A03 = view2;
            if (r22 != null) {
                layoutParams2 = r22.getTitleViewLayoutParams();
            }
            A0D.addView(view2, layoutParams2);
        }
        if (this.A02 == null && (r0 = this.A08) != null) {
            View view4 = (View) r0;
            this.A02 = view4;
            A0D.addView(view4, r0.getSubtitleViewLayoutParams());
        }
        if (this.A00 == null) {
            AnonymousClass5ZC r23 = this.A05;
            LinearLayout.LayoutParams layoutParams3 = null;
            if (r23 != null) {
                view = (View) r23;
            } else {
                view = null;
            }
            this.A00 = view;
            if (r23 != null) {
                layoutParams3 = r23.getBodyViewLayoutParams();
            }
            View view5 = this.A00;
            if (!(view5 == null || layoutParams3 == null)) {
                A0D.addView(view5, layoutParams3);
            }
        }
        if (this.A04 == null) {
            AnonymousClass5ZD r02 = this.A06;
            if (r02 != null) {
                list = r02.getCTAViews();
            } else {
                list = null;
            }
            this.A04 = list;
            if (list != null) {
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AnonymousClass1ZU.A0B();
                        throw null;
                    }
                    View view6 = (View) next;
                    if (view6 instanceof WDSButton) {
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, A0D.getResources().getDimensionPixelSize(2131166122));
                        layoutParams4.gravity = 17;
                        if (i == 0) {
                            layoutParams4.topMargin = A0D.getResources().getDimensionPixelSize(2131166123);
                        }
                        A0D.addView(view6, layoutParams4);
                    } else {
                        A0D.addView(view6);
                    }
                    i = i2;
                }
            }
        }
    }

    public int getCenteredLayoutId() {
        return 2131624803;
    }

    public int getIncomingLayoutId() {
        return 2131624803;
    }

    public int getOutgoingLayoutId() {
        return 2131624803;
    }
}
