package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.areffects.ArEffectsButtonHeaderFragment;
import com.whatsapp.areffects.button.ArEffectsStrengthSlider;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$onButtonClicked$1;
import com.whatsapp.areffects.viewmodel.session.ArEffectSession;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;

/* renamed from: X.3R4  reason: invalid class name */
public final class AnonymousClass3R4 extends LinearLayout implements AnonymousClass009 {
    public C18000vb A00;
    public WDSButton A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C18100vl A08;

    public AnonymousClass3R4(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A05) {
            this.A05 = true;
            this.A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
        this.A08 = C99144sL.A00(AnonymousClass00R.A0C, this, 3);
        LayoutInflater.from(context).inflate(2131624205, this, true);
    }

    public static final void setUpButtonOnClickListener$lambda$7(C106505Wc r10, View view) {
        Object obj;
        C85404Ng r0;
        C85404Ng r02;
        C18070vi.A0d(r10, 0);
        C92304h5 r102 = (C92304h5) r10;
        AnonymousClass3R4 r2 = r102.A01;
        ArEffectsButtonHeaderFragment arEffectsButtonHeaderFragment = r102.A00;
        AnonymousClass11C r03 = arEffectsButtonHeaderFragment.A00;
        if (r03 != null) {
            AnonymousClass4a5.A01(r2, r03);
            BaseArEffectsViewModel A0Y = AnonymousClass3MX.A0Y(arEffectsButtonHeaderFragment.A02);
            Context A14 = arEffectsButtonHeaderFragment.A14();
            AnonymousClass4V6 r04 = r102.A02;
            AnonymousClass4DE r8 = r04.A01;
            C107855aj r9 = r04.A02;
            Iterator it = ((C87144Ul) A0Y.A0C.getValue()).A04.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                AnonymousClass4V6 r1 = (AnonymousClass4V6) obj;
                if (r1.A01 == r8 && C18070vi.A18(r1.A02, r9)) {
                    break;
                }
            }
            AnonymousClass4V6 r4 = (AnonymousClass4V6) obj;
            if (r4 != null) {
                ArEffectSession A0V = A0Y.A0V(r8);
                if (A0V != null) {
                    C106575Wj A012 = ArEffectSession.A01(A0V);
                    if ((A012 instanceof C108335bX) && C83524Fl.A00(r8, r9, (C108335bX) A012)) {
                        if (r4.A06 && (r02 = (C85404Ng) AnonymousClass3MW.A12(A0Y.A0E).get(AnonymousClass1D6.A01(r8, r9))) != null) {
                            AnonymousClass3MY.A1Y(AnonymousClass3MW.A17(r02.A02), false);
                        }
                        AnonymousClass3MX.A1Q(new BaseArEffectsViewModel$onButtonClicked$1(r8, A0Y, (C30391dr) null), A0Y.A0N);
                        return;
                    }
                }
                if (r4.A06 && (r0 = (C85404Ng) AnonymousClass3MW.A12(A0Y.A0E).get(AnonymousClass1D6.A01(r8, r9))) != null) {
                    AnonymousClass3MY.A1Y(AnonymousClass3MW.A17(r0.A02), true);
                }
                A0Y.A0d(A14, r8, r9, C87354Vg.A00(r9, r4.A05), true);
                return;
            }
            return;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public static final void setUpSliderListener$lambda$9(C106505Wc r1, ArEffectsStrengthSlider arEffectsStrengthSlider) {
        C18070vi.A0d(r1, 0);
        arEffectsStrengthSlider.A00 = new C92314h6(r1);
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public static final void A00(AnonymousClass3R4 r1) {
        AnonymousClass3MX.A0v(r1.A08).A04(8);
    }

    private final C28931bI getSliderStub() {
        return AnonymousClass3MX.A0v(this.A08);
    }

    private final void setUpSliderListener(C106505Wc r3) {
        if (this.A04) {
            C98254qp.A00(AnonymousClass3MX.A0v(this.A08), r3, 0);
        }
    }

    public final void A01(C106505Wc r4, C107855aj r5, C107075Yh r6, int i, boolean z) {
        this.A04 = z;
        ViewGroup viewGroup = (ViewGroup) C18070vi.A05(this, 2131434744);
        if (this.A01 != null) {
            viewGroup.removeView(getButton$app_productinfra_areffects_areffects());
        }
        WDSButton BHC = r6.BHC(AnonymousClass3MY.A04(this));
        BHC.setId(i);
        BHC.setLayoutParams(AnonymousClass3Ma.A0D());
        this.A01 = BHC;
        viewGroup.addView(getButton$app_productinfra_areffects_areffects(), 0);
        setUpButtonUi(r5);
        setUpButtonOnClickListener(r4);
        setUpSliderListener(r4);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final WDSButton getButton$app_productinfra_areffects_areffects() {
        WDSButton wDSButton = this.A01;
        if (wDSButton != null) {
            return wDSButton;
        }
        C18070vi.A11("button");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setSliderStrength(int i) {
        if (this.A04) {
            ((ArEffectsStrengthSlider) AnonymousClass3MX.A0v(this.A08).A02()).setStrength(i);
        }
    }

    private final void setUpButtonOnClickListener(C106505Wc r3) {
        AnonymousClass3MZ.A1N(getButton$app_productinfra_areffects_areffects(), r3, 46);
    }

    private final void setUpButtonUi(C107855aj r4) {
        AnonymousClass4E4 BaM = r4.BaM();
        if (BaM instanceof C75563hj) {
            getButton$app_productinfra_areffects_areffects().setIcon(((C75563hj) BaM).A00);
        }
    }

    public final int getButtonWidth() {
        if (getButton$app_productinfra_areffects_areffects().getMeasuredWidth() <= 0) {
            getButton$app_productinfra_areffects_areffects().measure(0, 0);
        }
        return getButton$app_productinfra_areffects_areffects().getMeasuredWidth();
    }

    public final void setButtonIsSelected(boolean z) {
        getButton$app_productinfra_areffects_areffects().setSelected(z);
    }
}
