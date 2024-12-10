package X;

import android.content.Intent;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6A9  reason: invalid class name */
public class AnonymousClass6A9 extends AnonymousClass745 {
    public final MediaViewBaseFragment A00;
    public final AnonymousClass4ZR A01;

    public void A0B() {
    }

    public void A0C(Bundle bundle) {
        PhotoView A27;
        String str;
        MediaViewBaseFragment mediaViewBaseFragment = this.A00;
        Object A2B = mediaViewBaseFragment.A2B(mediaViewBaseFragment.A09.getCurrentItem());
        if (A2B != null) {
            C108965cb.A0B(mediaViewBaseFragment).setSharedElementsUseOverlay(true);
            int childCount = mediaViewBaseFragment.A09.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = mediaViewBaseFragment.A09.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    if (viewGroup.getChildCount() > 0 && (A27 = mediaViewBaseFragment.A27(viewGroup)) != null) {
                        if (A2B.equals(viewGroup.getTag())) {
                            str = AnonymousClass001.A1H("thumb-transition-", A2B.toString(), AnonymousClass000.A10());
                        } else {
                            str = null;
                        }
                        AnonymousClass1Xr.A04(A27, str);
                    }
                }
            }
            if (mediaViewBaseFragment.A2A() != null && !A2B.equals(mediaViewBaseFragment.A2A())) {
                mediaViewBaseFragment.A1D().A2j(new C110875hQ(bundle, this));
            }
            if (mediaViewBaseFragment.A2M()) {
                mediaViewBaseFragment.A1D().A2W();
                return;
            }
        }
        mediaViewBaseFragment.A2D();
    }

    public void A0D(Bundle bundle, C1600787a r13) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A00;
        C108965cb.A0B(mediaViewBaseFragment).setSharedElementsUseOverlay(false);
        mediaViewBaseFragment.A02.setVisibility(4);
        mediaViewBaseFragment.A2K(false, 0);
        mediaViewBaseFragment.A03.setVisibility(0);
        mediaViewBaseFragment.A0I = false;
        View A0F = AnonymousClass3MZ.A0F(mediaViewBaseFragment.A1D());
        AnonymousClass79A.A00(A0F.getViewTreeObserver(), A0F, 3);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        AnonymousClass4ZR r5 = this.A01;
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setInterpolator(linearInterpolator);
        changeBounds.excludeTarget(r5.A02(2131899525), true);
        changeBounds.excludeTarget(r5.A02(2131899524), true);
        ChangeTransform changeTransform = new ChangeTransform();
        changeTransform.setInterpolator(linearInterpolator);
        ChangeImageTransform changeImageTransform = new ChangeImageTransform();
        changeImageTransform.setInterpolator(linearInterpolator);
        C22632BGs bGs = new C22632BGs(mediaViewBaseFragment.A14(), r5, true);
        bGs.setInterpolator(linearInterpolator);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setInterpolator(linearInterpolator);
        transitionSet.setDuration(220);
        transitionSet.addTransition(changeBounds);
        transitionSet.addTransition(changeTransform);
        transitionSet.addTransition(changeImageTransform);
        transitionSet.addTransition(bGs);
        C22632BGs bGs2 = new C22632BGs(mediaViewBaseFragment.A14(), r5, false);
        bGs2.setInterpolator(linearInterpolator);
        TransitionSet transitionSet2 = new TransitionSet();
        transitionSet2.setInterpolator(linearInterpolator);
        transitionSet2.setDuration(220);
        transitionSet2.addTransition(changeBounds);
        transitionSet2.addTransition(changeTransform);
        transitionSet2.addTransition(changeImageTransform);
        transitionSet2.addTransition(bGs2);
        Fade fade = new Fade();
        fade.excludeTarget(16908335, true);
        fade.excludeTarget(16908336, true);
        fade.excludeTarget(2131431658, true);
        Fade fade2 = new Fade();
        fade2.excludeTarget(16908335, true);
        fade2.excludeTarget(16908336, true);
        fade2.excludeTarget(2131431658, true);
        if (mediaViewBaseFragment.A2M()) {
            AnonymousClass1FL A1D = mediaViewBaseFragment.A1D();
            Window window = A1D.getWindow();
            A1D.A2Y();
            window.setSharedElementEnterTransition(transitionSet);
            window.setSharedElementReturnTransition(transitionSet2);
            window.setEnterTransition(fade);
            window.setReturnTransition(fade2);
            transitionSet.addListener(new C115195tY(mediaViewBaseFragment, r13));
            transitionSet2.addListener(new C115205tZ(r13, 1));
            return;
        }
        Fragment.A0K(mediaViewBaseFragment).A0A = transitionSet;
        Fragment.A0K(mediaViewBaseFragment).A0B = transitionSet2;
        Fragment.A0K(mediaViewBaseFragment).A07 = fade;
        Fragment.A0K(mediaViewBaseFragment).A09 = fade2;
        fade.addListener(new C115195tY(mediaViewBaseFragment, r13));
        fade2.addListener(new C115205tZ(r13, 1));
    }

    public AnonymousClass6A9(AnonymousClass4ZR r1, MediaViewBaseFragment mediaViewBaseFragment) {
        this.A01 = r1;
        this.A00 = mediaViewBaseFragment;
    }

    public static C34001jj A00(View view, AnonymousClass01E r3, AnonymousClass1GP r4, AnonymousClass4ZR r5, String str) {
        Object obj;
        ArrayList A012 = A01(view, r3, r5, str);
        C34001jj r52 = new C34001jj(r4);
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            C19760yx r0 = (C19760yx) it.next();
            Object obj2 = r0.A00;
            if (!(obj2 == null || (obj = r0.A01) == null)) {
                String str2 = (String) obj;
                C25842Cmw cmw = C25431Cfd.A01;
                String A02 = AnonymousClass1Xr.A02((View) obj2);
                if (A02 != null) {
                    if (r52.A0D == null) {
                        r52.A0D = AnonymousClass000.A13();
                        r52.A0E = AnonymousClass000.A13();
                    } else if (r52.A0E.contains(str2)) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("A shared element with the target name '");
                        A10.append(str2);
                        throw AnonymousClass001.A12("' has already been added to the transaction.", A10);
                    } else if (r52.A0D.contains(A02)) {
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("A shared element with the source name '");
                        A102.append(A02);
                        throw AnonymousClass001.A12("' has already been added to the transaction.", A102);
                    }
                    r52.A0D.add(A02);
                    r52.A0E.add(str2);
                } else {
                    throw AnonymousClass000.A0k("Unique transitionNames are required for all sharedElements");
                }
            }
        }
        return r52;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008c, code lost:
        if (r2 == 0) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0092, code lost:
        if (r6 != r10.getHeight()) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0094, code lost:
        r10.setClipBounds(new android.graphics.Rect(0, r2, r10.getWidth(), r6));
        r10.postDelayed(X.C108945cZ.A0X(r10, 23), (long) r11.getResources().getInteger(17694721));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b5, code lost:
        r3.addAll(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b8, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A01(android.view.View r10, X.AnonymousClass01E r11, X.AnonymousClass4ZR r12, java.lang.String r13) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            X.AnonymousClass1Xr.A04(r10, r13)
            java.lang.String r0 = r10.getTransitionName()
            X.AnonymousClass3Ma.A1P(r10, r0, r3)
            r0 = 16908335(0x102002f, float:2.387736E-38)
            android.view.View r1 = r11.findViewById(r0)
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = "statusBar"
            X.AnonymousClass1Xr.A04(r1, r0)
            X.AnonymousClass3Ma.A1P(r1, r0, r3)
        L_0x001f:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            int r6 = r10.getHeight()
            r8 = 2
            int[] r7 = new int[r8]
            r10.getLocationOnScreen(r7)
            r0 = 2131436420(0x7f0b2384, float:1.849471E38)
            android.view.View r2 = r11.findViewById(r0)
            r9 = 1
            if (r2 == 0) goto L_0x0069
            r0 = 2131899524(0x7f123484, float:1.9433996E38)
            java.lang.String r0 = r12.A02(r0)
            X.AnonymousClass1Xr.A04(r2, r0)
            X.AnonymousClass3Ma.A1P(r2, r0, r4)
            int[] r5 = new int[r8]
            r2.getLocationOnScreen(r5)
            r0 = r7[r9]
            int r1 = X.AnonymousClass3MW.A02(r10, r0)
            r0 = r5[r9]
            int r0 = X.AnonymousClass3MW.A02(r2, r0)
            if (r1 <= r0) goto L_0x0069
            r0 = r7[r9]
            int r1 = X.AnonymousClass3MW.A02(r10, r0)
            r0 = r5[r9]
            int r0 = X.AnonymousClass3MW.A02(r2, r0)
            int r1 = r1 - r0
            int r6 = r10.getHeight()
            int r6 = r6 - r1
        L_0x0069:
            r0 = 2131436421(0x7f0b2385, float:1.8494712E38)
            android.view.View r2 = r11.findViewById(r0)
            r5 = 0
            if (r2 == 0) goto L_0x00b9
            r0 = 2131899525(0x7f123485, float:1.9433998E38)
            java.lang.String r0 = r12.A02(r0)
            X.AnonymousClass1Xr.A04(r2, r0)
            X.AnonymousClass3Ma.A1P(r2, r0, r4)
            int[] r1 = new int[r8]
            r2.getLocationOnScreen(r1)
            r0 = r7[r9]
            r2 = r1[r9]
            if (r0 >= r2) goto L_0x00b9
            int r2 = r2 - r0
            if (r2 != 0) goto L_0x0094
        L_0x008e:
            int r0 = r10.getHeight()
            if (r6 == r0) goto L_0x00b5
        L_0x0094:
            int r1 = r10.getWidth()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r5, r2, r1, r6)
            r10.setClipBounds(r0)
            r0 = 23
            X.3Br r2 = X.C108945cZ.A0X(r10, r0)
            android.content.res.Resources r1 = r11.getResources()
            r0 = 17694721(0x10e0001, float:2.6081284E-38)
            int r0 = r1.getInteger(r0)
            long r0 = (long) r0
            r10.postDelayed(r2, r0)
        L_0x00b5:
            r3.addAll(r4)
            return r3
        L_0x00b9:
            r2 = 0
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6A9.A01(android.view.View, X.01E, X.4ZR, java.lang.String):java.util.ArrayList");
    }

    public static void A02(Intent intent, View view, AnonymousClass01E r4, AnonymousClass4ZR r5, String str) {
        C110865hM A012 = C1406772n.A01(r4, (C19760yx[]) A01(view, r4, r5, str).toArray(new C19760yx[0]));
        r4.setExitSharedElementCallback(new C109255d4(r4));
        r4.startActivityForResult(intent, 907, A012.A00.toBundle());
    }
}
