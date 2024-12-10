package X;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.profile.ProfilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1;

/* renamed from: X.Cry  reason: case insensitive filesystem */
public abstract class C26083Cry {
    public static final boolean A00 = C108975cc.A1C(Build.VERSION.SDK_INT, 22);

    public static final Cb1 A00(Intent intent) {
        C18070vi.A0d(intent, 0);
        int intExtra = intent.getIntExtra("start_transition_status_bar_color", 0);
        int intExtra2 = intent.getIntExtra("return_transition_status_bar_color", intExtra);
        int intExtra3 = intent.getIntExtra("start_transition_navigation_bar_color", 0);
        return new Cb1(intExtra, intExtra3, intExtra2, intent.getIntExtra("return_transition_navigation_bar_color", intExtra3));
    }

    public static final void A02(AnonymousClass1FU r7, Cb1 cb1, CZW czw) {
        C22633BGt bGt;
        String stringExtra;
        Window window = r7.getWindow();
        Intent intent = r7.getIntent();
        if (A00) {
            window.addFlags(Integer.MIN_VALUE);
            window.requestFeature(12);
            window.requestFeature(13);
            C22630BGq bGq = new C22630BGq(window, cb1, intent.getFloatExtra("start_transition_alpha", 0.0f));
            C22629BGp bGp = new C22629BGp(window, cb1);
            bGq.excludeTarget(16908335, true);
            bGq.excludeTarget(16908336, true);
            window.setEnterTransition(bGq);
            window.setReturnTransition(bGp);
            bGq.addListener(new C23802Bpr(window, r7, czw));
            bGp.addListener(new C23801Bpq(r7, czw));
            if (intent.getBooleanExtra("circular_transition", false)) {
                AnonymousClass4ZR r3 = new AnonymousClass4ZR(r7);
                C22633BGt bGt2 = new C22633BGt(true, false);
                bGt2.addTarget(r3.A02(2131899529));
                window.setSharedElementEnterTransition(bGt2);
                bGt = new C22633BGt(false, true);
                stringExtra = r3.A02(2131899529);
            } else if (intent.hasExtra("circular_return_name")) {
                C22633BGt bGt3 = new C22633BGt(false, false);
                bGt3.addTarget(intent.getStringExtra("circular_return_name"));
                window.setSharedElementEnterTransition(bGt3);
                bGt = new C22633BGt(false, true);
                stringExtra = intent.getStringExtra("circular_return_name");
            } else {
                return;
            }
            bGt.addTarget(stringExtra);
            window.setSharedElementReturnTransition(bGt);
        }
    }

    public static final void A01(View view, View view2, Toolbar toolbar, AnonymousClass1FU r12, PhotoView photoView, Cb1 cb1, boolean z) {
        C18070vi.A0j(view, view2);
        Toolbar toolbar2 = toolbar;
        PhotoView photoView2 = photoView;
        C18070vi.A0g(toolbar, 4, photoView);
        AnonymousClass1FU r6 = r12;
        ProfilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1 profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1 = new ProfilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1(r12, photoView);
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        view.setBackground(colorDrawable);
        Drawable background = photoView.getBackground();
        if (background != null) {
            background.setAlpha(255);
        }
        profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1.A00 = 0.5f;
        profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1.A06 = true;
        profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1.A05 = z;
        profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1.A04 = new DPD(colorDrawable, toolbar2, r6, photoView2, cb1, z);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        C18070vi.A0z(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((C37891qK) layoutParams).A00(profilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1);
    }
}
