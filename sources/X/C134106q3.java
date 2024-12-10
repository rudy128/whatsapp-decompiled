package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.6q3  reason: invalid class name and case insensitive filesystem */
public final class C134106q3 {
    public ObjectAnimator A00;
    public AnonymousClass6h3 A01;
    public AnonymousClass870 A02;
    public AnonymousClass88B A03;
    public AnonymousClass6CG A04;
    public final AnonymousClass7MW A05 = new AnonymousClass7MW(this, 0);
    public final C131146ka A06;
    public final C26631Sw A07;
    public final AnonymousClass1SB A08;
    public final AnonymousClass6pA A09;
    public final C111185ii A0A;
    public final C136766uM A0B;
    public final C38471rL A0C = new C825048f(this, 40);

    public final void A00() {
        AnonymousClass6h3 r3 = this.A01;
        if (r3 != null && r3.A00.getVisibility() == 0) {
            C17880vN.A1F(C17890vO.A0A(C108945cZ.A0o(this.A06.A0C).A01), "pref_avatar_sticker_onboarding_shown", true);
            View view = r3.A00;
            view.setVisibility(8);
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
        }
    }

    public final void A01(int i) {
        View view;
        AnonymousClass6h3 r0 = this.A01;
        if (r0 != null) {
            r0.A01.setVisibility(i);
        }
        if (i == 0) {
            AnonymousClass6h3 r02 = this.A01;
            if (r02 == null || r02.A00.getVisibility() != 0) {
                AnonymousClass00H r2 = this.A06.A0C;
                if (!C17880vN.A1W(C108995ce.A0F(r2), "pref_avatar_sticker_onboarding_shown")) {
                    C17880vN.A1F(C108995ce.A0F(r2).edit(), "pref_avatar_sticker_onboarding_shown", true);
                    AnonymousClass6h3 r03 = this.A01;
                    if (r03 != null) {
                        r03.A00.setVisibility(0);
                    }
                    if (this.A00 == null) {
                        AnonymousClass6h3 r04 = this.A01;
                        if (r04 != null) {
                            view = r04.A00;
                        } else {
                            view = null;
                        }
                        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[3];
                        C109005cf.A0r(new float[1], propertyValuesHolderArr, 1.4f);
                        C108945cZ.A1R("alpha", new float[]{0.4f, 0.0f}, propertyValuesHolderArr, 2);
                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
                        ofPropertyValuesHolder.setDuration(1500);
                        ofPropertyValuesHolder.setRepeatCount(-1);
                        ofPropertyValuesHolder.setRepeatMode(1);
                        ofPropertyValuesHolder.start();
                        this.A00 = ofPropertyValuesHolder;
                        return;
                    }
                    return;
                }
                AnonymousClass6h3 r05 = this.A01;
                if (r05 != null) {
                    r05.A00.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        A00();
    }

    public C134106q3(C131146ka r3, C26631Sw r4, AnonymousClass1SB r5, AnonymousClass6pA r6, C111185ii r7, C136766uM r8) {
        C108985cd.A1D(r8, r3);
        C18070vi.A0d(r6, 6);
        this.A08 = r5;
        this.A07 = r4;
        this.A0B = r8;
        this.A06 = r3;
        this.A0A = r7;
        this.A09 = r6;
    }
}
