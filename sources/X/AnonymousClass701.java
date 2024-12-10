package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.camera.CameraBottomSheetBehavior;
import com.whatsapp.camera.DragGalleryStripIndicator;
import com.whatsapp.gallery.GalleryTabHostFragment;

/* renamed from: X.701  reason: invalid class name */
public class AnonymousClass701 {
    public AnimatorSet A00;
    public C112255lB A01;
    public C136166tN A02;
    public A34 A03;
    public final int A04;
    public final Resources A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final View A0A;
    public final RecyclerView A0B;
    public final CameraBottomSheetBehavior A0C;
    public final DragGalleryStripIndicator A0D;
    public final GalleryTabHostFragment A0E;
    public final AnonymousClass10I A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final C136596u4 A0J;

    public static void A00(AnonymousClass701 r0) {
        C112255lB r02 = r0.A01;
        if (r02 != null) {
            r02.notifyDataSetChanged();
        }
    }

    public void A01() {
        boolean A1T = AnonymousClass000.A1T(this.A0C.A0J, 4);
        RecyclerView recyclerView = this.A0B;
        if (!A1T) {
            recyclerView.setVisibility(4);
            recyclerView.setAlpha(0.0f);
            View view = this.A07;
            if (view != null) {
                view.setVisibility(4);
            }
            View view2 = this.A08;
            view2.setEnabled(true);
            GalleryTabHostFragment galleryTabHostFragment = this.A0E;
            if (galleryTabHostFragment != null) {
                galleryTabHostFragment.A29(true);
            }
            view2.setVisibility(0);
            view2.setAlpha(1.0f);
            return;
        }
        recyclerView.setVisibility(0);
        recyclerView.setAlpha(1.0f);
        View view3 = this.A07;
        if (!(view3 == null || this.A0J.A00 == 3)) {
            view3.setVisibility(C72453Mb.A07(this.A0G ? 1 : 0));
        }
        View view4 = this.A08;
        view4.setEnabled(false);
        GalleryTabHostFragment galleryTabHostFragment2 = this.A0E;
        if (galleryTabHostFragment2 != null) {
            galleryTabHostFragment2.A29(false);
        }
        view4.setAlpha(0.0f);
    }

    public void A02(boolean z) {
        View view;
        int i;
        float A002 = C108975cc.A00(z ? 1 : 0);
        float f = 1.0f - A002;
        View view2 = this.A09;
        if (view2 != null && (view = this.A07) != null && this.A0D != null) {
            int measuredHeight = view2.getMeasuredHeight();
            int i2 = -measuredHeight;
            int translationY = (int) view.getTranslationY();
            if (z) {
                i = i2 + translationY;
            } else {
                i = translationY - i2;
            }
            C109195cy r3 = new C109195cy(this, 7);
            C109195cy r2 = new C109195cy(this, 8);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{A002, f});
            C108955ca.A19(ofFloat);
            ofFloat.addUpdateListener(new C1410474b(this, measuredHeight, 0));
            if (!z) {
                r3 = r2;
            }
            ofFloat.addListener(r3);
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{translationY, i});
            C1411074h.A00(ofInt, this, 11);
            AnimatorSet A0B2 = C108945cZ.A0B();
            A0B2.setDuration(150);
            A0B2.playTogether(C108945cZ.A1Z(ofFloat, ofInt, 2, 0));
            this.A00 = A0B2;
            A0B2.start();
        }
    }

    public void A03(boolean z) {
        if (this.A0C.A0J != 4) {
            return;
        }
        if (!z || (this.A05.getConfiguration().orientation == 2 && !this.A0H)) {
            View view = this.A06;
            if (view.getVisibility() != 4) {
                view.setVisibility(4);
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(C108985cd.A0H());
                C108985cd.A11(view, animationSet);
                return;
            }
            return;
        }
        this.A06.setVisibility(0);
        A01();
    }

    public AnonymousClass701(View view, C136596u4 r5, GalleryTabHostFragment galleryTabHostFragment, AnonymousClass10I r7, int i, boolean z, boolean z2, boolean z3) {
        this.A0E = galleryTabHostFragment;
        this.A0I = z3;
        View A062 = AnonymousClass1HF.A06(view, 2131428345);
        this.A06 = A062;
        ((ViewGroup) A062).setClipChildren(true);
        this.A09 = AnonymousClass1HF.A06(view, 2131431071);
        DragGalleryStripIndicator dragGalleryStripIndicator = (DragGalleryStripIndicator) AnonymousClass1HF.A06(view, 2131430173);
        this.A0D = dragGalleryStripIndicator;
        dragGalleryStripIndicator.setVisibility(0);
        this.A07 = AnonymousClass1HF.A06(view, 2131430174);
        View A063 = AnonymousClass1HF.A06(view, 2131431783);
        this.A0A = A063;
        A063.setOnClickListener(new AnonymousClass781(2));
        this.A0B = C108945cZ.A0U(view, 2131434388);
        this.A08 = AnonymousClass1HF.A06(view, 2131431056);
        this.A05 = view.getResources();
        this.A0H = z;
        this.A0G = z2;
        this.A04 = i;
        this.A0J = r5;
        View view2 = this.A09;
        this.A0C = new C116305wv(view2 == null ? this.A0B : view2, this);
        this.A0F = r7;
        View view3 = this.A08;
        view3.setEnabled(false);
        GalleryTabHostFragment galleryTabHostFragment2 = this.A0E;
        if (galleryTabHostFragment2 != null) {
            galleryTabHostFragment2.A29(false);
        }
        view3.setAlpha(0.0f);
        this.A0C.A0V(this.A05.getDimensionPixelSize(2131165726));
        ((C37891qK) this.A06.getLayoutParams()).A00(this.A0C);
        View view4 = this.A07;
        if (view4 != null && this.A0D != null) {
            view4.measure(0, 0);
            view4.setTranslationY((float) (-view4.getMeasuredHeight()));
            view4.setVisibility(8);
        }
    }
}
