package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;

/* renamed from: X.3QQ  reason: invalid class name */
public final class AnonymousClass3QQ extends LinearLayout implements AnonymousClass5ZC {
    public final AnonymousClass5ZQ A00;
    public final AnonymousClass5ZS A01;
    public final AnonymousClass5XS A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;

    public static final void A00(AnonymousClass3QQ r9, AnonymousClass4U9 r10) {
        View groupDescriptionAddUpsell;
        r9.setVisibility(8);
        int intValue = r10.A01.intValue();
        if (intValue == 0) {
            r9.setVisibility(0);
            AnonymousClass485 groupDescriptionText = r9.getGroupDescriptionText();
            if (groupDescriptionText.getParent() == null) {
                LinearLayout.LayoutParams A0R = C72463Mc.A0R();
                A0R.gravity = 17;
                r9.addView(groupDescriptionText, A0R);
            }
            AnonymousClass485 groupDescriptionText2 = r9.getGroupDescriptionText();
            CharSequence charSequence = r10.A00;
            groupDescriptionText2.setVisibility(0);
            groupDescriptionText2.A0S(AnonymousClass3MW.A09(C26302CxJ.A0C(groupDescriptionText2.getSystemServices(), groupDescriptionText2.getSharedPreferencesFactory(), C43251zV.A03(groupDescriptionText2.A00, groupDescriptionText2.getPaint(), groupDescriptionText2.getEmojiLoader(), charSequence))), (List) null, 0, false);
            groupDescriptionText2.A03 = new C97964qL(0);
            groupDescriptionText2.setOnClickListener(new C89914dE(groupDescriptionText2, 16));
            groupDescriptionAddUpsell = r9.getGroupDescriptionAddUpsell();
            if (groupDescriptionAddUpsell == null) {
                return;
            }
        } else if (intValue == 1) {
            C23797Bpg groupDescriptionAddUpsell2 = r9.getGroupDescriptionAddUpsell();
            if (groupDescriptionAddUpsell2 != null) {
                r9.setVisibility(0);
                if (groupDescriptionAddUpsell2.getParent() == null) {
                    LinearLayout.LayoutParams A0R2 = C72463Mc.A0R();
                    A0R2.gravity = 17;
                    r9.addView(groupDescriptionAddUpsell2, A0R2);
                }
                groupDescriptionAddUpsell2.setVisibility(0);
            }
            groupDescriptionAddUpsell = r9.getGroupDescriptionText();
        } else {
            return;
        }
        groupDescriptionAddUpsell.setVisibility(8);
    }

    private final C23797Bpg getGroupDescriptionAddUpsell() {
        return (C23797Bpg) this.A03.getValue();
    }

    private final AnonymousClass485 getGroupDescriptionText() {
        return (AnonymousClass485) this.A04.getValue();
    }

    private final AnonymousClass3UI getViewModel() {
        return (AnonymousClass3UI) this.A05.getValue();
    }

    public View getBodyView() {
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3QQ(Context context, AnonymousClass5ZQ r6, AnonymousClass4CV r7, AnonymousClass5ZS r8, AnonymousClass5XS r9, AnonymousClass1EC r10) {
        super(context, (AttributeSet) null);
        C18070vi.A0o(r6, r9, r8);
        this.A00 = r6;
        this.A02 = r9;
        this.A01 = r8;
        this.A05 = AnonymousClass1DF.A01(new AnonymousClass5NJ(this, r10));
        this.A03 = AnonymousClass1DF.A01(new C104665Pa(context, r7, this, r10));
        this.A04 = AnonymousClass1DF.A01(new AnonymousClass5PK(context, this, r10));
        C91644g1.A00((AnonymousClass1FB) AnonymousClass1L9.A01(context, AnonymousClass1FY.class), getViewModel().A00, new AnonymousClass5S2(this), 13);
    }

    public LinearLayout.LayoutParams getBodyViewLayoutParams() {
        LinearLayout.LayoutParams A0R = C72463Mc.A0R();
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166125);
        A0R.setMargins(dimensionPixelSize, getResources().getDimensionPixelSize(2131166126), dimensionPixelSize, A0R.bottomMargin);
        return A0R;
    }
}
