package com.whatsapp.mediacomposer.doodle.universaltoolpicker;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1DF;
import X.AnonymousClass1F9;
import X.AnonymousClass1IX;
import X.AnonymousClass1OB;
import X.AnonymousClass1ZU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass71Q;
import X.AnonymousClass78K;
import X.AnonymousClass89A;
import X.C108965cb;
import X.C112165l2;
import X.C1197569s;
import X.C1197669t;
import X.C123936Wk;
import X.C133706pM;
import X.C152087nL;
import X.C152097nM;
import X.C152107nN;
import X.C152117nO;
import X.C18070vi;
import X.C18100vl;
import X.C27691Xc;
import X.C29431cG;
import X.C30391dr;
import X.C30511e4;
import X.C39351sv;
import X.C43531zx;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

public final class UniversalToolPickerView extends LinearLayout implements AnonymousClass009 {
    public C112165l2 A00;
    public AnonymousClass71Q A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public AnonymousClass1OB A04;
    public final C18100vl A05;
    public final AnonymousClass1F9 A06;
    public final C18100vl A07;
    public final C18100vl A08;
    public final C18100vl A09;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r0 != 2) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.whatsapp.mediacomposer.doodle.universaltoolpicker.UniversalToolPickerView r4, int r5) {
        /*
            r3 = 2
            r2 = 1
            if (r5 == 0) goto L_0x0048
            if (r5 == r2) goto L_0x0044
            if (r5 != r3) goto L_0x0048
            int r0 = r4.getPenDrawable()
        L_0x000c:
            android.widget.ImageView r1 = r4.A00(r0)
        L_0x0010:
            android.widget.FrameLayout r0 = r4.getSwitchButtonContainer()
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r4.getSwitchButtonContainer()
            r0.addView(r1)
            X.71Q r0 = r4.getViewModel()
            int r0 = r0.A04
            if (r0 == 0) goto L_0x002d
            if (r0 == r2) goto L_0x0040
            r2 = 2131894263(0x7f121ff7, float:1.9423326E38)
            if (r0 == r3) goto L_0x0030
        L_0x002d:
            r2 = 2131896823(0x7f1229f7, float:1.9428518E38)
        L_0x0030:
            android.widget.FrameLayout r1 = r4.getSwitchButtonContainer()
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r0 = r0.getString(r2)
            X.AnonymousClass1HF.A0o(r1, r0)
            return
        L_0x0040:
            r2 = 2131888370(0x7f1208f2, float:1.9411373E38)
            goto L_0x0030
        L_0x0044:
            r0 = 2131231827(0x7f080453, float:1.8079746E38)
            goto L_0x000c
        L_0x0048:
            android.view.View r1 = r4.getTextView()
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.universaltoolpicker.UniversalToolPickerView.A02(com.whatsapp.mediacomposer.doodle.universaltoolpicker.UniversalToolPickerView, int):void");
    }

    public final void setViewModel(AnonymousClass71Q r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    private final View getDivider() {
        return AnonymousClass3MW.A0A(this.A05);
    }

    private final LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.A07.getValue();
    }

    /* access modifiers changed from: private */
    public final RecyclerView getRecyclerView() {
        return (RecyclerView) this.A08.getValue();
    }

    private final FrameLayout getSwitchButtonContainer() {
        return (FrameLayout) this.A09.getValue();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass71Q getViewModel() {
        AnonymousClass71Q r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }

    public void onDetachedFromWindow() {
        AnonymousClass3Ma.A1R(this.A04);
        super.onDetachedFromWindow();
    }

    public UniversalToolPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            this.A01 = C27691Xc.A0Y((C27691Xc) ((AnonymousClass033) generatedComponent()));
        }
    }

    private final ImageView A00(int i) {
        ImageView imageView = new ImageView(getContext(), (AttributeSet) null);
        imageView.setImageResource(i);
        C108965cb.A12(imageView, -1);
        Resources resources = imageView.getResources();
        if (resources != null) {
            AnonymousClass3MY.A14(resources, imageView, 2131168774);
        }
        AnonymousClass3MY.A0v(imageView.getContext(), imageView, 2131231507);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        return imageView;
    }

    private final View getColorView() {
        return A00(2131231827);
    }

    private final int getPenDrawable() {
        int i = getViewModel().A00;
        if (i == 1) {
            return 2131232811;
        }
        if (i == 2) {
            return 2131232808;
        }
        if (i == 3) {
            return 2131232810;
        }
        if (i != 4) {
            return 2131231734;
        }
        return 2131232807;
    }

    private final View getPenView() {
        return A00(getPenDrawable());
    }

    private final View getTextView() {
        int i;
        int i2 = getViewModel().A02;
        View inflate = AnonymousClass3MZ.A0D(this).inflate(2131625340, getSwitchButtonContainer(), false);
        TextView A0W = C72453Mb.A0W(inflate, 2131430944);
        if (i2 == 2) {
            i = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131169009);
        } else {
            i = 0;
        }
        A0W.setTypeface(C123936Wk.A00(AnonymousClass3MY.A04(A0W), i2));
        A0W.setPadding(0, i, i, 0);
        C43531zx.A03(inflate, new C39351sv(0, 0, 0, 0));
        return inflate;
    }

    public final void A03(int i) {
        C1197669t r1;
        int i2;
        getViewModel().A01 = i;
        C112165l2 r3 = this.A00;
        if (r3 == null) {
            AnonymousClass3MW.A1B();
        } else {
            AnonymousClass1IX r4 = r3.A01;
            Iterator it = r4.iterator();
            int i3 = 0;
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    AnonymousClass1ZU.A0B();
                } else {
                    C133706pM r12 = (C133706pM) next;
                    if ((r12 instanceof C1197569s) && ((C1197569s) r12).A00 == i) {
                        int i5 = r3.A00;
                        if (i3 != i5) {
                            if (i5 != -1) {
                                ((C133706pM) r4.get(i5)).A01 = false;
                                r3.A0G(r3.A00);
                            }
                            r3.A00 = i3;
                            ((C133706pM) r4.get(i3)).A01 = true;
                            r3.A0G(i3);
                        }
                        z = true;
                    }
                    i3 = i4;
                }
            }
            Iterator it2 = r4.iterator();
            int i6 = 0;
            while (it2.hasNext()) {
                if (!(it2.next() instanceof C1197669t)) {
                    i6++;
                } else if (i6 != -1) {
                    if (!(z || (i2 = r3.A00) == -1 || i2 == i6)) {
                        ((C133706pM) r4.get(i2)).A01 = false;
                        r3.A0G(r3.A00);
                    }
                    Object obj = r4.get(i6);
                    if ((obj instanceof C1197669t) && (r1 = (C1197669t) obj) != null) {
                        if (z) {
                            r1.A00 = -1;
                        } else {
                            r3.A00 = i6;
                            r1.A00 = i;
                        }
                        r3.A0G(i6);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        throw null;
    }

    public final void A04(int i) {
        C1197669t r1;
        getViewModel().A01 = i;
        C112165l2 r2 = this.A00;
        if (r2 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        }
        C133706pM r12 = (C133706pM) C29431cG.A0f(r2.A01, r2.A00);
        if (r12 != null && (r12 instanceof C1197669t) && (r1 = (C1197669t) r12) != null) {
            r1.A00 = i;
            r2.A0G(r2.A00);
        }
    }

    public final void A05(AnonymousClass89A r5, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        getRecyclerView().setLayoutManager(getLayoutManager());
        AnonymousClass71Q viewModel = getViewModel();
        viewModel.A04 = i;
        viewModel.A03 = i2;
        viewModel.A02 = i3;
        viewModel.A01 = i4;
        viewModel.A00 = i5;
        viewModel.A05 = z;
        viewModel.A06 = z2;
        viewModel.A08.setValue(Integer.valueOf(AnonymousClass71Q.A00(viewModel)));
        viewModel.A07.setValue((Object) null);
        AnonymousClass71Q.A01(viewModel);
        if (i2 == 2) {
            getSwitchButtonContainer().setVisibility(8);
            AnonymousClass3MW.A0A(this.A05).setVisibility(8);
        }
        AnonymousClass1F9 r1 = this.A06;
        C30511e4 r0 = null;
        if (r1 != null) {
            r0 = AnonymousClass3MY.A0s(new UniversalToolPickerView$initialize$1(r5, this, (C30391dr) null), AnonymousClass3MZ.A0H(r1));
        }
        this.A04 = r0;
        AnonymousClass78K.A00(getSwitchButtonContainer(), this, 42);
        AnonymousClass3MX.A1D(getResources(), getSwitchButtonContainer(), 2131896813);
    }

    public final int getColor() {
        return getViewModel().A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UniversalToolPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass1F9 r1;
        C18070vi.A0d(context, 1);
        if (!this.A03) {
            this.A03 = true;
            this.A01 = C27691Xc.A0Y((C27691Xc) ((AnonymousClass033) generatedComponent()));
        }
        this.A09 = AnonymousClass1DF.A01(new C152117nO(this));
        this.A08 = AnonymousClass1DF.A01(new C152107nN(this));
        this.A05 = AnonymousClass1DF.A01(new C152087nL(this));
        this.A07 = AnonymousClass1DF.A01(new C152097nM(context));
        Context context2 = getContext();
        while (true) {
            r1 = null;
            if (context2 != null && !(context2 instanceof AnonymousClass1F9)) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        if (context2 instanceof AnonymousClass1F9) {
            r1 = (AnonymousClass1F9) context2;
        }
        this.A06 = r1;
        View.inflate(context, 2131627249, this);
    }
}
