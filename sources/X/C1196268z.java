package X;

import android.animation.TimeInterpolator;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel;
import com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel;

/* renamed from: X.68z  reason: invalid class name and case insensitive filesystem */
public abstract class C1196268z extends C114795s0 implements C160888Ai {
    public AnonymousClass87Y A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C151667mf(this));
    public final C18100vl A02 = AnonymousClass1DF.A01(new C151677mg(this));
    public final C18100vl A03;
    public final C18100vl A04 = C99274sY.A00(new C151807mt(this), new C151797ms(this), new C156197ty(this), AnonymousClass3MW.A15(MediaQualityViewModel.class));
    public final C18100vl A05;
    public final C18100vl A06 = AnonymousClass1DF.A01(new C151707mj(this));
    public final C18100vl A07 = C99274sY.A00(new C151727ml(this), new C151717mk(this), new C156157tu(this), AnonymousClass3MW.A15(MediaViewOnceViewModel.class));
    public final C18100vl A08 = C99274sY.A00(new C151767mp(this), new C151757mo(this), new C156177tw(this), AnonymousClass3MW.A15(C111125iM.class));
    public final C18100vl A09 = C99274sY.A00(new C151787mr(this), new C151777mq(this), new C156187tx(this), AnonymousClass3MW.A15(StickerComposerViewModel.class));

    public static void A03(MediaComposerActivity mediaComposerActivity) {
        mediaComposerActivity.A0a.A0C.A26().setVisibility(4);
    }

    public C1196268z() {
        C151687mh r4 = new C151687mh(this);
        this.A03 = C99274sY.A00(new C151747mn(this), new C151737mm(this), new C156167tv(this, r4), AnonymousClass3MW.A15(MediaJidViewModel.class));
        this.A05 = AnonymousClass1DF.A01(new C151697mi(this));
    }

    public int BUd() {
        return getIntent().getIntExtra("origin", 1);
    }

    public void onCreate(Bundle bundle) {
        if (!C39761tb.A01()) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
        }
        if (AnonymousClass745.A00) {
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
            window.setAllowEnterTransitionOverlap(true);
            window.setAllowReturnTransitionOverlap(true);
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            ChangeBounds changeBounds = new ChangeBounds();
            TimeInterpolator timeInterpolator = accelerateDecelerateInterpolator;
            changeBounds.setInterpolator(timeInterpolator);
            ChangeTransform changeTransform = new ChangeTransform();
            changeTransform.setInterpolator(timeInterpolator);
            ChangeImageTransform changeImageTransform = new ChangeImageTransform();
            changeImageTransform.setInterpolator(timeInterpolator);
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setInterpolator(timeInterpolator);
            transitionSet.setDuration(300);
            transitionSet.addTransition(changeBounds);
            transitionSet.addTransition(changeTransform);
            transitionSet.addTransition(changeImageTransform);
            transitionSet.excludeTarget(2131428837, true);
            transitionSet.excludeTarget(2131427582, true);
            transitionSet.excludeTarget(2131427583, true);
            transitionSet.excludeTarget(2131428830, true);
            transitionSet.excludeTarget(2131436806, true);
            transitionSet.excludeTarget(2131435142, true);
            Window window2 = getWindow();
            window2.setSharedElementEnterTransition(transitionSet);
            window2.setSharedElementReturnTransition(transitionSet.clone());
            transitionSet.addListener(new C115205tZ(this, 0));
            Fade fade = new Fade();
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            fade.excludeTarget(2131430859, true);
            Fade fade2 = new Fade();
            fade2.excludeTarget(16908335, true);
            fade2.excludeTarget(16908336, true);
            Window window3 = getWindow();
            window3.setEnterTransition(fade);
            window3.setReturnTransition(fade2);
        }
        super.onCreate(bundle);
    }
}
