package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButtonGroup;
import com.whatsapp.wds.components.internal.header.WDSHeader;
import java.util.List;

/* renamed from: X.3S9  reason: invalid class name */
public final class AnonymousClass3S9 extends ConstraintLayout implements C107805ac {
    public AnonymousClass4CI A00;
    public final View A01 = AnonymousClass1HF.A06(this, 2131430949);
    public final Button A02 = ((Button) AnonymousClass1HF.A06(this, 2131434059));
    public final Button A03 = ((Button) AnonymousClass1HF.A06(this, 2131435001));
    public final NestedScrollView A04 = ((NestedScrollView) AnonymousClass1HF.A06(this, 2131429518));
    public final WaTextView A05 = AnonymousClass3MW.A0T(this, 2131430969);
    public final WaTextView A06 = AnonymousClass3MW.A0T(this, 2131430970);
    public final WDSButtonGroup A07 = ((WDSButtonGroup) AnonymousClass1HF.A06(this, 2131428603));
    public final C18100vl A08;
    public final C18100vl A09;
    public final ViewGroup A0A = AnonymousClass3MW.A0C(this, 2131429513);
    public final WDSHeader A0B;

    public AnonymousClass3S9(Context context) {
        super(context, (AttributeSet) null);
        this.A08 = AnonymousClass1DF.A01(new C99074sE(context, 5));
        this.A09 = AnonymousClass1DF.A01(new C99074sE(context, 6));
        C72463Mc.A0v(getContext(), context, this, 2130971948, 2131103048);
        View.inflate(context, 2131627187, this);
        WDSHeader wDSHeader = (WDSHeader) AnonymousClass1HF.A06(this, 2131431358);
        this.A0B = wDSHeader;
        wDSHeader.setHeaderTextGravity(1);
        wDSHeader.setHeaderImageMarginEnabled(true);
    }

    public void setViewState(AnonymousClass4CI r5) {
        AnonymousClass4F6 r0;
        C18070vi.A0d(r5, 0);
        this.A0B.setViewState(r5.A02);
        AnonymousClass4F6 r1 = r5.A04;
        AnonymousClass4CI r02 = this.A00;
        if (r02 != null) {
            r0 = r02.A04;
        } else {
            r0 = null;
        }
        if (!C18070vi.A18(r1, r0)) {
            setContent(r1);
        }
        C82824Cf r12 = r5.A03;
        WaTextView waTextView = this.A06;
        waTextView.setText((CharSequence) null);
        waTextView.setVisibility(8);
        WaTextView waTextView2 = this.A05;
        waTextView2.setText((CharSequence) null);
        waTextView2.setVisibility(8);
        int ordinal = r12.ordinal();
        if (ordinal == 0) {
            waTextView = waTextView2;
        } else if (ordinal != 1) {
            throw AnonymousClass3MW.A14();
        }
        CharSequence charSequence = r5.A05;
        C43531zx.A04(waTextView, charSequence);
        waTextView.setText(charSequence);
        C87004Tx r3 = r5.A00;
        C87004Tx r2 = r5.A01;
        int i = 8;
        C84134Hz.A00(this.A02, r3, 8);
        C84134Hz.A00(this.A03, r2, 8);
        WDSButtonGroup wDSButtonGroup = this.A07;
        if (!(r3 == null && r2 == null)) {
            i = 0;
        }
        wDSButtonGroup.setVisibility(i);
        C43531zx.A06(new C99074sE(this, 4), this.A04);
        this.A00 = r5;
    }

    private final int getScrollableContentFooterColor() {
        return C72453Mb.A0I(this.A08);
    }

    private final int getUnscrollableContentFooterColor() {
        return C72453Mb.A0I(this.A09);
    }

    private final void setContent(AnonymousClass4F6 r7) {
        ViewGroup viewGroup = this.A0A;
        C43531zx.A04(viewGroup, r7);
        if (r7 instanceof AnonymousClass4CG) {
            viewGroup.removeAllViews();
            viewGroup.addView(((AnonymousClass4CG) r7).A00);
        } else if (r7 instanceof AnonymousClass4CE) {
            viewGroup.removeAllViews();
            AnonymousClass3MZ.A0D(this).inflate(((AnonymousClass4CE) r7).A00, viewGroup);
        } else if (r7 instanceof AnonymousClass4CF) {
            viewGroup.removeAllViews();
            List<C88494Zy> list = ((AnonymousClass4CF) r7).A00;
            for (C88494Zy viewState : list) {
                AnonymousClass3S6 r0 = new AnonymousClass3S6(AnonymousClass3MY.A04(this));
                r0.setViewState(viewState);
                viewGroup.addView(r0);
            }
            if (!list.isEmpty()) {
                int size = list.size();
                viewGroup.setImportantForAccessibility(1);
                Resources A0Y = AnonymousClass000.A0Y(this);
                Object[] objArr = new Object[1];
                C17880vN.A1T(objArr, size, 0);
                viewGroup.setContentDescription(A0Y.getQuantityString(2131755514, size, objArr));
            }
        } else if (r7 == null) {
            viewGroup.removeAllViews();
        } else {
            throw AnonymousClass3MW.A14();
        }
    }
}
