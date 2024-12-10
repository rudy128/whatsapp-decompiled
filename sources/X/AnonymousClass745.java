package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.745  reason: invalid class name */
public abstract class AnonymousClass745 {
    public static final boolean A00 = AnonymousClass112.A00();

    public void A0B() {
        MediaViewBaseFragment mediaViewBaseFragment = ((AnonymousClass6A8) this).A06;
        if (mediaViewBaseFragment.A29() != null) {
            mediaViewBaseFragment.A1D().overridePendingTransition(0, 0);
        }
    }

    public void A0C(Bundle bundle) {
        AnonymousClass6A8 r5 = (AnonymousClass6A8) this;
        MediaViewBaseFragment mediaViewBaseFragment = r5.A06;
        if (mediaViewBaseFragment.A29() == null) {
            mediaViewBaseFragment.A2D();
            return;
        }
        AnonymousClass65h r3 = mediaViewBaseFragment.A09;
        Object A2B = mediaViewBaseFragment.A2B(r3.getCurrentItem());
        if (C72453Mb.A08(mediaViewBaseFragment.A14()) != r5.A03 || A2B == null || !A2B.equals(mediaViewBaseFragment.A2A())) {
            r3.setPivotX(C108945cZ.A03(r3) / 2.0f);
            r3.setPivotY(C108945cZ.A04(r3) / 2.0f);
            r5.A02 = 0;
            r5.A04 = 0;
        }
        r3.animate().setDuration(240).scaleX(r5.A01).scaleY(r5.A00).translationX((float) r5.A02).translationY((float) r5.A04).alpha(0.0f).setListener(new C109195cy(r5, 25));
        Drawable drawable = r5.A05;
        int[] A1W = C108945cZ.A1W();
        // fill-array-data instruction
        A1W[0] = 255;
        A1W[1] = 0;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(drawable, "alpha", A1W);
        ofInt.setDuration(240);
        C108955ca.A1A(ofInt);
        ofInt.start();
    }

    public void A0D(Bundle bundle, C1600787a r12) {
        AnonymousClass6A8 r5 = (AnonymousClass6A8) this;
        MediaViewBaseFragment mediaViewBaseFragment = r5.A06;
        AnonymousClass65h r3 = mediaViewBaseFragment.A09;
        int i = bundle.getInt("x", 0);
        int i2 = bundle.getInt("y", 0);
        int i3 = bundle.getInt("width", 0);
        int i4 = bundle.getInt("height", 0);
        mediaViewBaseFragment.A03.setVisibility(8);
        mediaViewBaseFragment.A0I = false;
        View findViewById = mediaViewBaseFragment.A17().findViewById(2131428018);
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        r5.A05 = colorDrawable;
        findViewById.setBackground(colorDrawable);
        r3.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass799(r3, r12, r5, i, i2, i3, i4));
    }

    public static Bundle A04(Activity activity, View view) {
        if (!A00 || view == null) {
            return null;
        }
        ArrayList A13 = AnonymousClass000.A13();
        A0A(AnonymousClass3MZ.A0F(activity), A13);
        int[] A1W = C108945cZ.A1W();
        view.getLocationOnScreen(A1W);
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("x", A1W[0]);
        A0D.putInt("y", A1W[1]);
        A0D.putInt("width", view.getWidth());
        A0D.putInt("height", view.getHeight());
        A0D.putStringArrayList("visible_shared_elements", A13);
        return A0D;
    }

    public static Bundle A05(Activity activity, View view, String str) {
        if (!A00 || view == null) {
            return null;
        }
        return new C110865hM(C123546Uw.A00(activity, view, str)).A00.toBundle();
    }

    public static void A07(Activity activity) {
        StringBuilder sb;
        String str;
        if (A00) {
            Class<C29191bl> cls = C29191bl.class;
            try {
                Field declaredField = cls.getDeclaredField("sRunningTransitions");
                declaredField.setAccessible(true);
                ThreadLocal threadLocal = (ThreadLocal) declaredField.get(cls);
                if (threadLocal.get() != null && ((Reference) threadLocal.get()).get() != null) {
                    AnonymousClass00O r2 = (AnonymousClass00O) ((Reference) threadLocal.get()).get();
                    View A0F = AnonymousClass3MZ.A0F(activity);
                    if (r2.containsKey(A0F)) {
                        r2.remove(A0F);
                    }
                }
            } catch (NoSuchFieldException e) {
                e = e;
                sb = AnonymousClass000.A10();
                str = "MediaViewTransitionHelper/removeActivityFromTransitionManager/NoSuchFieldException ";
                C108995ce.A1M(str, sb, e);
            } catch (IllegalAccessException e2) {
                e = e2;
                sb = AnonymousClass000.A10();
                str = "MediaViewTransitionHelper/removeActivityFromTransitionManager/IllegalAccessException ";
                C108995ce.A1M(str, sb, e);
            } catch (NullPointerException e3) {
                e = e3;
                sb = AnonymousClass000.A10();
                str = "MediaViewTransitionHelper/removeActivityFromTransitionManager/NullPointerException ";
                C108995ce.A1M(str, sb, e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r1 != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A08(android.content.Context r2, android.content.Intent r3, android.view.View r4, X.AnonymousClass4ZR r5, java.lang.String r6) {
        /*
            java.lang.Class<X.01E> r0 = X.AnonymousClass01E.class
            android.app.Activity r1 = X.C18050vg.A01(r2, r0)
            X.01E r1 = (X.AnonymousClass01E) r1
            boolean r0 = A00
            if (r0 == 0) goto L_0x001a
            if (r1 == 0) goto L_0x0026
            java.lang.String r0 = "animation_bundle"
            boolean r0 = r3.hasExtra(r0)
            if (r0 == 0) goto L_0x001c
            X.AnonymousClass6A9.A02(r3, r4, r1, r5, r6)
            return
        L_0x001a:
            if (r1 == 0) goto L_0x0026
        L_0x001c:
            r0 = 907(0x38b, float:1.271E-42)
            r1.startActivityForResult(r3, r0)
            r0 = 0
            r1.overridePendingTransition(r0, r0)
            return
        L_0x0026:
            r2.startActivity(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass745.A08(android.content.Context, android.content.Intent, android.view.View, X.4ZR, java.lang.String):void");
    }

    public static void A09(Context context, Intent intent, View view, C18030ve r5) {
        Activity A01 = C18050vg.A01(context, AnonymousClass01E.class);
        if (A01 != null && !C1402270m.A01(r5)) {
            intent.putExtra("animation_bundle", A04(A01, view));
        }
    }

    public static View A06(View view, String str) {
        if (str.equals(AnonymousClass1Xr.A02(view))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View A06 = A06(viewGroup.getChildAt(i), str);
                if (A06 != null) {
                    return A06;
                }
            }
        }
        return null;
    }

    public static void A0A(View view, Collection collection) {
        if (!TextUtils.isEmpty(AnonymousClass1Xr.A02(view))) {
            collection.add(AnonymousClass1Xr.A02(view));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                A0A(viewGroup.getChildAt(i), collection);
            }
        }
    }
}
