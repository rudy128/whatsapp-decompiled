package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.72I  reason: invalid class name */
public final class AnonymousClass72I {
    public ImageButton A00;
    public ImageButton A01;
    public C43191zP A02 = C43171zN.A00().A01();
    public WaTextView A03;
    public AnonymousClass11C A04;
    public C18000vb A05;
    public LayerDrawable A06;
    public final View A07;
    public final AnonymousClass8AJ A08;

    public final void A04(ViewGroup viewGroup) {
        C29071bZ r3 = new C29071bZ(3);
        r3.A0C(300);
        View view = this.A07;
        r3.A0E(view);
        WaTextView waTextView = this.A03;
        r3.A0E(waTextView);
        r3.A0D(new DecelerateInterpolator());
        C29191bl.A02(viewGroup, r3);
        waTextView.setVisibility(8);
        view.setVisibility(0);
    }

    public final void A05(AnonymousClass7J1 r14, boolean z) {
        String str;
        ImageButton imageButton = this.A00;
        AnonymousClass11C r0 = this.A04;
        if (r0 != null) {
            AnonymousClass4a5.A02(imageButton, r0);
            C43191zP r3 = this.A02;
            r3.A04.clear();
            r3.A01(0.0d);
            C108975cc.A0s(this.A00);
            AnimatorSet A0B = C108945cZ.A0B();
            if (z) {
                AnimatorSet A0B2 = C108945cZ.A0B();
                CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) this.A08;
                float A032 = C108945cZ.A03(creationModeBottomBar) * 0.2f;
                float f = creationModeBottomBar.A00;
                C18000vb r02 = this.A05;
                if (r02 != null) {
                    boolean A1Z = AnonymousClass3MW.A1Z(r02);
                    int i = -1;
                    if (A1Z) {
                        i = 1;
                    }
                    float[] A1V = C108945cZ.A1V();
                    A1V[0] = imageButton.getTranslationX();
                    A1V[1] = f + (A032 * ((float) i));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
                    C1411074h.A00(ofFloat, this, 31);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageButton, "alpha", new float[]{0.0f});
                    A0B2.play(ofFloat).with(ofFloat2).with(ObjectAnimator.ofFloat(this.A03, "alpha", new float[]{0.0f}));
                    A0B2.setDuration(200);
                    AnimatorSet A0B3 = C108945cZ.A0B();
                    PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[3];
                    C108945cZ.A1R("scaleX", new float[]{0.0f, 1.0f}, propertyValuesHolderArr, 0);
                    C108945cZ.A1R("scaleY", new float[]{0.0f, 1.0f}, propertyValuesHolderArr, 1);
                    C108945cZ.A1R("alpha", new float[]{0.0f, 1.0f}, propertyValuesHolderArr, 2);
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageButton, (PropertyValuesHolder[]) Arrays.copyOf(propertyValuesHolderArr, 3));
                    C18070vi.A0X(ofPropertyValuesHolder);
                    View view = this.A07;
                    view.setVisibility(0);
                    view.setAlpha(0.0f);
                    ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, (PropertyValuesHolder[]) Arrays.copyOf(propertyValuesHolderArr, 3));
                    C18070vi.A0X(ofPropertyValuesHolder2);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageButton, "translationX", new float[]{0.0f, 0.0f});
                    ofFloat3.setDuration(0);
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
                    ofInt.setDuration(0);
                    C1411074h.A00(ofInt, this, 30);
                    Animator[] A1Z2 = C108945cZ.A1Z(ofFloat3, ofInt, 4, 0);
                    A1Z2[2] = ofPropertyValuesHolder;
                    A1Z2[3] = ofPropertyValuesHolder2;
                    A0B3.playTogether(A1Z2);
                    A0B3.setDuration(200);
                    A0B.playSequentially(C108945cZ.A1Z(A0B2, A0B3, 2, 0));
                } else {
                    str = "whatsAppLocale";
                }
            }
            A0B.addListener(new C109105cp(r14, this, 5));
            A0B.start();
            return;
        }
        str = "systemServices";
        C18070vi.A11(str);
        throw null;
    }

    public static final void A00(AnonymousClass72I r6, float f) {
        r6.A00.setTranslationX(f);
        WaTextView waTextView = r6.A03;
        waTextView.setTranslationX(f);
        C18000vb r0 = r6.A05;
        if (r0 != null) {
            boolean A1b = AnonymousClass3MY.A1b(r0);
            boolean z = true;
            CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) r6.A08;
            float f2 = creationModeBottomBar.A00;
            if (!A1b ? f <= f2 : f >= f2) {
                z = false;
            }
            int i = 153;
            if (!z) {
                C18000vb r02 = r6.A05;
                if (r02 == null) {
                    AnonymousClass3MW.A1M();
                    throw null;
                } else if (!AnonymousClass3MY.A1b(r02) ? f >= 0.0f : f <= 0.0f) {
                    i = 153 + C22339B3q.A01((Math.abs(f) / Math.abs(creationModeBottomBar.A00)) * 102.0f);
                } else {
                    i = 255;
                }
            }
            int argb = Color.argb(i, 255, 255, 255);
            waTextView.setTextColor(argb);
            C29261bv.A02(ColorStateList.valueOf(argb), waTextView);
            return;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public static final void A01(AnonymousClass72I r2, int i) {
        LayerDrawable layerDrawable = r2.A06;
        layerDrawable.getDrawable(1).setAlpha(i);
        r2.A00.setBackground(layerDrawable);
    }

    public final void A02() {
        AnonymousClass11C r0 = this.A04;
        if (r0 != null) {
            C84094Hv.A00(r0);
            ImageButton imageButton = this.A01;
            imageButton.setVisibility(0);
            imageButton.setEnabled(true);
            C43191zP r3 = this.A02;
            CopyOnWriteArraySet copyOnWriteArraySet = r3.A04;
            copyOnWriteArraySet.clear();
            r3.A01(0.0d);
            copyOnWriteArraySet.add(new C121236Ir(this));
            return;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final void A03(int i) {
        C43191zP r2 = this.A02;
        r2.A04.clear();
        r2.A01(0.0d);
        C108975cc.A0s(this.A00);
        A01(this, 0);
        ImageButton imageButton = this.A01;
        imageButton.setEnabled(true);
        ImageButton imageButton2 = this.A00;
        imageButton2.setAlpha(1.0f);
        imageButton2.setTranslationX(0.0f);
        AnonymousClass71W r0 = AnonymousClass71W.A00;
        r0.A01(imageButton2, i, true, true);
        r0.A01(imageButton, i, false, true);
    }

    public AnonymousClass72I(View view, AnonymousClass8AJ r3) {
        this.A07 = view;
        this.A08 = r3;
        this.A00 = r3.getMicButton();
        this.A01 = r3.getSendButton();
        this.A03 = r3.getSlidToCancelLabel();
        this.A06 = r3.getMicButtonBackgroundDrawable();
    }
}
