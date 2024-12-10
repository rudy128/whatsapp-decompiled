package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.HomeActivity;
import com.whatsapp.calling.callgrid.view.FocusViewContainer;
import com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView;
import com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder;
import com.whatsapp.components.CircularRevealView;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;
import com.whatsapp.reactions.ReactionEmojiTextView;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.lang.ref.Reference;

/* renamed from: X.3Mo  reason: invalid class name */
public class AnonymousClass3Mo extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;

    public AnonymousClass3Mo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Animator animator, Object obj, int i) {
        animator.addListener(new AnonymousClass3Mo(obj, i));
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.A00) {
            case 2:
                super.onAnimationCancel(animator);
                FocusViewContainer.A00((FocusViewContainer) ((C90204dh) this.A01).A01);
                return;
            case 7:
                ((CircularRevealView) this.A01).A04 = true;
                return;
            case 10:
            case 11:
            case 12:
                C79093uR r2 = (C79093uR) this.A01;
                if (r2.A03 == 2) {
                    r2.A03 = 0;
                    return;
                }
                return;
            case 19:
                View view = ((PaymentAmountInputField) this.A01).A04;
                if (view != null) {
                    view.setTranslationX(0.0f);
                    return;
                }
                return;
            case 22:
                super.onAnimationCancel(animator);
                SolidColorWallpaperPreview solidColorWallpaperPreview = ((C90654eQ) ((AnonymousClass3Mm) this.A01).A01).A04;
                solidColorWallpaperPreview.A0A = false;
                solidColorWallpaperPreview.A09.setScrollEnabled(true);
                return;
            case 23:
                super.onAnimationCancel(animator);
                ((SolidColorWallpaperPreview) this.A01).finish();
                return;
            case 24:
                super.onAnimationCancel(animator);
                ((C826049a) this.A01).A04.setImageDrawable((Drawable) null);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public void onAnimationEnd(Animator animator) {
        View view;
        Integer num;
        switch (this.A00) {
            case 0:
                super.onAnimationEnd(animator);
                ((HomeActivity) this.A01).A07.setVisibility(0);
                return;
            case 1:
                super.onAnimationEnd(animator);
                HomeActivity homeActivity = (HomeActivity) this.A01;
                homeActivity.A0F.A0G();
                view = homeActivity.A0A;
                break;
            case 2:
                super.onAnimationEnd(animator);
                FocusViewContainer.A00((FocusViewContainer) ((C90204dh) this.A01).A01);
                return;
            case 3:
                C18070vi.A0d(animator, 0);
                super.onAnimationEnd(animator);
                ((C72573Mr) this.A01).A00.invoke();
                return;
            case 4:
                C18070vi.A0d(animator, 0);
                super.onAnimationEnd(animator);
                VCOverscrollEntryPointView vCOverscrollEntryPointView = (VCOverscrollEntryPointView) this.A01;
                VCOverscrollEntryPointView.A05(vCOverscrollEntryPointView);
                View A0D = AnonymousClass3MX.A0D(AnonymousClass3MX.A0v(vCOverscrollEntryPointView.A0L));
                A0D.setScaleX(1.0f);
                A0D.setScaleY(1.0f);
                return;
            case 5:
                VCOverscrollEntryPointView vCOverscrollEntryPointView2 = (VCOverscrollEntryPointView) this.A01;
                Vibrator A0H = ((AnonymousClass11C) vCOverscrollEntryPointView2.getSystemServices().get()).A0H();
                if (A0H != null) {
                    AnonymousClass4a5.A00(A0H, 180);
                }
                VCOverscrollEntryPointStateHolder stateHolder = vCOverscrollEntryPointView2.getStateHolder();
                if (!stateHolder.A0B) {
                    stateHolder.A0B = true;
                    if (C40811vJ.A0U((C18030ve) stateHolder.A0J.get())) {
                        num = AnonymousClass00R.A01;
                    } else {
                        num = AnonymousClass00R.A00;
                    }
                    stateHolder.A08 = num;
                    if (stateHolder.A0B) {
                        VCOverscrollEntryPointStateHolder.A00(stateHolder, 2.0f * stateHolder.A04);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                View view2 = (View) this.A01;
                view2.setVisibility(8);
                view2.animate().setListener((Animator.AnimatorListener) null);
                return;
            case 7:
                ((CircularRevealView) this.A01).A04 = false;
                return;
            case 8:
                super.onAnimationEnd(animator);
                ((View) this.A01).setVisibility(8);
                return;
            case 10:
            case 12:
                C79093uR r2 = (C79093uR) this.A01;
                if (r2.A03 == 2) {
                    r2.A03 = 0;
                    return;
                }
                return;
            case 13:
                view = (View) ((Reference) this.A01).get();
                if (view == null) {
                    return;
                }
                break;
            case 14:
                ((View) this.A01).setSelected(false);
                return;
            case 18:
                ((C80133wd) this.A01).A4d();
                return;
            case 19:
                View view3 = ((PaymentAmountInputField) this.A01).A04;
                if (view3 != null) {
                    view3.setTranslationX(0.0f);
                    return;
                }
                return;
            case 20:
                super.onAnimationEnd(animator);
                AnonymousClass4VZ r22 = (AnonymousClass4VZ) this.A01;
                r22.A00.A0H();
                r22.A05.setVisibility(4);
                r22.A01();
                return;
            case 21:
                super.onAnimationEnd(animator);
                AnonymousClass4VZ r1 = (AnonymousClass4VZ) this.A01;
                r1.A00.A0G();
                view = r1.A03;
                break;
            case 22:
                super.onAnimationEnd(animator);
                SolidColorWallpaperPreview solidColorWallpaperPreview = ((C90654eQ) ((AnonymousClass3Mm) this.A01).A01).A04;
                solidColorWallpaperPreview.A0A = false;
                solidColorWallpaperPreview.A09.setScrollEnabled(true);
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((SolidColorWallpaperPreview) this.A01).finish();
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((C826049a) this.A01).A04.setImageDrawable((Drawable) null);
                return;
            case 25:
                C18070vi.A0d(animator, 0);
                super.onAnimationEnd(animator);
                AnonymousClass4XX r4 = (AnonymousClass4XX) this.A01;
                C28931bI r12 = r4.A04;
                if (r12 == null) {
                    C18070vi.A11("stickersHintView");
                } else {
                    r12.A04(8);
                    View view4 = r4.A02;
                    if (view4 != null) {
                        view4.setVisibility(0);
                        View view5 = r4.A02;
                        if (view5 != null) {
                            String string = AnonymousClass000.A0Y(view5).getString(2131896403);
                            AnonymousClass4W7.A01(view5, 2131232271);
                            view5.setContentDescription(string);
                            AnimatorSet animatorSet = r4.A00;
                            if (animatorSet == null) {
                                View view6 = r4.A02;
                                if (view6 != null) {
                                    animatorSet = AnonymousClass4XX.A00(view6);
                                    r4.A00 = animatorSet;
                                }
                            }
                            AnimatorSet animatorSet2 = r4.A05;
                            animatorSet2.play(animatorSet);
                            animatorSet2.start();
                            return;
                        }
                    }
                    C18070vi.A11("emojiButton");
                }
                throw null;
            case 26:
                C18070vi.A0d(animator, 0);
                super.onAnimationEnd(animator);
                view = ((WDSSearchBar) this.A01).A08;
                break;
            case 27:
                C18070vi.A0d(animator, 0);
                super.onAnimationEnd(animator);
                ((C18090vk) this.A01).invoke();
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
        view.setVisibility(4);
    }

    public void onAnimationStart(Animator animator) {
        switch (this.A00) {
            case 7:
                ((CircularRevealView) this.A01).A04 = true;
                return;
            case 9:
                ((RoundCornerProgressBar) this.A01).A05 = false;
                return;
            case 15:
                ReactionEmojiTextView reactionEmojiTextView = (ReactionEmojiTextView) this.A01;
                reactionEmojiTextView.setBackgroundScale(0.0f);
                reactionEmojiTextView.setSelected(true);
                return;
            case 16:
                C80053wT r5 = (C80053wT) this.A01;
                r5.setAlpha(0.0f);
                RecyclerView recyclerView = r5.A03;
                if (recyclerView == null) {
                    C18070vi.A11("emojiRecyclerView");
                    throw null;
                }
                int childCount = recyclerView.getChildCount();
                int[] iArr = r5.A0L;
                int min = Math.min(childCount, iArr.length);
                for (int i = 0; i < min; i++) {
                    iArr[i] = recyclerView.getChildAt(i).getMeasuredWidth();
                }
                C42491yG.A0B(r5, 8);
                return;
            case 17:
                C18070vi.A0d(animator, 0);
                super.onAnimationStart(animator);
                View view = (View) this.A01;
                view.setAlpha(0.0f);
                view.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
