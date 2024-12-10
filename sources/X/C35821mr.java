package X;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* renamed from: X.1mr  reason: invalid class name and case insensitive filesystem */
public class C35821mr {
    public int A00 = -1;
    public boolean A01 = false;
    public final Fragment A02;
    public final AnonymousClass1GU A03;
    public final AnonymousClass1GR A04;

    public Bundle A00() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.A02;
        if (fragment.A04 == -1 && (bundle = fragment.A07) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new C64612v3(fragment));
        if (fragment.A04 > -1) {
            Bundle bundle3 = new Bundle();
            fragment.A20(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.A03.A04(bundle3, fragment, false);
            Bundle bundle4 = new Bundle();
            fragment.A0O.A03(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle A0L = fragment.A0H.A0L();
            if (!A0L.isEmpty()) {
                bundle2.putBundle("childFragmentManager", A0L);
            }
            if (fragment.A0B != null) {
                A04();
            }
            SparseArray sparseArray = fragment.A09;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.A08;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.A06;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public void A01() {
        Fragment fragment;
        int i;
        View view;
        View view2;
        Fragment fragment2 = this.A02;
        View view3 = fragment2.A0C;
        while (true) {
            if (view3 == null) {
                fragment = null;
                break;
            }
            Object tag = view3.getTag(2131431001);
            if ((tag instanceof Fragment) && (fragment = (Fragment) tag) != null) {
                break;
            }
            ViewParent parent = view3.getParent();
            if (parent instanceof View) {
                view3 = (View) parent;
            } else {
                view3 = null;
            }
        }
        Fragment fragment3 = fragment2.A0E;
        if (fragment != null && !fragment.equals(fragment3)) {
            int i2 = fragment2.A01;
            C34281kE r0 = C34281kE.A01;
            C452127r r3 = new C452127r(fragment2, fragment, i2);
            C34281kE.A03(r3);
            C34291kF A002 = C34281kE.A00(fragment2);
            if (A002.A01.contains(C34391kP.DETECT_WRONG_NESTED_HIERARCHY) && C34281kE.A04(A002, fragment2.getClass(), r3.getClass())) {
                C34281kE.A02(A002, r3);
            }
        }
        AnonymousClass1GR r02 = this.A04;
        ViewGroup viewGroup = fragment2.A0C;
        if (viewGroup != null) {
            ArrayList arrayList = r02.A01;
            int indexOf = arrayList.indexOf(fragment2);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment4 = (Fragment) arrayList.get(indexOf);
                        if (fragment4.A0C == viewGroup && (view = fragment4.A0B) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment5 = (Fragment) arrayList.get(i3);
                    if (fragment5.A0C == viewGroup && (view2 = fragment5.A0B) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        i = -1;
        fragment2.A0C.addView(fragment2.A0B, i);
    }

    public void A02() {
        Bundle bundle;
        Bundle bundle2;
        Fragment fragment = this.A02;
        if (fragment.A0a && fragment.A0f && !fragment.A0i) {
            if (AnonymousClass1GP.A0G(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(fragment);
                Log.d("FragmentManager", sb.toString());
            }
            Bundle bundle3 = fragment.A07;
            if (bundle3 != null) {
                bundle = bundle3.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            LayoutInflater A1o = fragment.A1o(bundle);
            fragment.A0A = A1o;
            fragment.A1S(bundle, A1o, (ViewGroup) null);
            View view = fragment.A0B;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.A0B.setTag(2131431001, fragment);
                if (fragment.A0c) {
                    fragment.A0B.setVisibility(8);
                }
                Bundle bundle4 = fragment.A07;
                if (bundle4 != null) {
                    bundle2 = bundle4.getBundle("savedInstanceState");
                } else {
                    bundle2 = null;
                }
                fragment.A21(bundle2, fragment.A0B);
                AnonymousClass1GP.A0B(fragment.A0H, 2);
                this.A03.A00(bundle, fragment.A0B, fragment, false);
                fragment.A04 = 2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04da, code lost:
        r3.A04 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04df, code lost:
        r3.A04 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x055f, code lost:
        if (r3.A00 > 0) goto L_0x0561;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x003d, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x08c6 A[Catch:{ all -> 0x0b1d }, LOOP:4: B:328:0x08c0->B:330:0x08c6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x08db A[Catch:{ all -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x08fa A[Catch:{ all -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0912 A[Catch:{ all -> 0x0b1d }] */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0918 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r15 = this;
            boolean r0 = r15.A01
            r6 = 2
            java.lang.String r5 = "FragmentManager"
            if (r0 == 0) goto L_0x0024
            boolean r0 = X.AnonymousClass1GP.A0G(r6)
            if (r0 == 0) goto L_0x0023
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Ignoring re-entrant call to moveToExpectedState() for "
            r1.append(r0)
            androidx.fragment.app.Fragment r0 = r15.A02
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r5, r0)
        L_0x0023:
            return
        L_0x0024:
            r2 = 0
            r4 = 1
            r15.A01 = r4     // Catch:{ all -> 0x0b1d }
            r14 = 0
        L_0x0029:
            androidx.fragment.app.Fragment r3 = r15.A02     // Catch:{ all -> 0x0b1d }
            X.1GP r0 = r3.A0I     // Catch:{ all -> 0x0b1d }
            if (r0 != 0) goto L_0x0966
            int r8 = r3.A04     // Catch:{ all -> 0x0b1d }
        L_0x0031:
            int r1 = r3.A04     // Catch:{ all -> 0x0b1d }
            r7 = 3
            if (r8 == r1) goto L_0x0a54
            if (r8 <= r1) goto L_0x049b
            int r0 = r1 + 1
            switch(r0) {
                case 0: goto L_0x086d;
                case 1: goto L_0x01f0;
                case 2: goto L_0x0081;
                case 3: goto L_0x026b;
                case 4: goto L_0x003f;
                case 5: goto L_0x033e;
                case 6: goto L_0x007e;
                case 7: goto L_0x03b2;
                default: goto L_0x003d;
            }     // Catch:{ all -> 0x0b1d }
        L_0x003d:
            r14 = 1
            goto L_0x0029
        L_0x003f:
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x007b
            android.view.ViewGroup r1 = r3.A0C     // Catch:{ all -> 0x0b1d }
            if (r1 == 0) goto L_0x007b
            X.1GP r0 = r3.A1F()     // Catch:{ all -> 0x0b1d }
            X.1t7 r8 = X.C39461t7.A02(r1, r0)     // Catch:{ all -> 0x0b1d }
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            int r0 = r0.getVisibility()     // Catch:{ all -> 0x0b1d }
            java.lang.Integer r7 = X.C39731tY.A00(r0)     // Catch:{ all -> 0x0b1d }
            X.C18070vi.A0d(r7, r2)     // Catch:{ all -> 0x0b1d }
            boolean r0 = X.AnonymousClass1GP.A0G(r6)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0076
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "SpecialEffectsController: Enqueuing add operation for fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x0076:
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0b1d }
            X.C39461t7.A05(r15, r8, r7, r0)     // Catch:{ all -> 0x0b1d }
        L_0x007b:
            r0 = 4
            goto L_0x04df
        L_0x007e:
            r0 = 6
            goto L_0x04df
        L_0x0081:
            r15.A02()     // Catch:{ all -> 0x0b1d }
            boolean r0 = r3.A0a     // Catch:{ all -> 0x0b1d }
            if (r0 != 0) goto L_0x003d
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x00a2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "moveto CREATE_VIEW: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x00a2:
            android.os.Bundle r1 = r3.A07     // Catch:{ all -> 0x0b1d }
            r10 = 0
            if (r1 == 0) goto L_0x00b8
            java.lang.String r0 = "savedInstanceState"
            android.os.Bundle r8 = r1.getBundle(r0)     // Catch:{ all -> 0x0b1d }
        L_0x00ad:
            android.view.LayoutInflater r11 = r3.A1o(r8)     // Catch:{ all -> 0x0b1d }
            r3.A0A = r11     // Catch:{ all -> 0x0b1d }
            android.view.ViewGroup r0 = r3.A0C     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x00bd
            goto L_0x00ba
        L_0x00b8:
            r8 = r10
            goto L_0x00ad
        L_0x00ba:
            r10 = r0
            goto L_0x0162
        L_0x00bd:
            int r1 = r3.A01     // Catch:{ all -> 0x0b1d }
            if (r1 == 0) goto L_0x0162
            r0 = -1
            if (r1 == r0) goto L_0x0118
            X.1GP r0 = r3.A0I     // Catch:{ all -> 0x0b1d }
            X.1GM r0 = r0.A09     // Catch:{ all -> 0x0b1d }
            android.view.View r10 = r0.A00(r1)     // Catch:{ all -> 0x0b1d }
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10     // Catch:{ all -> 0x0b1d }
            if (r10 != 0) goto L_0x0135
            boolean r0 = r3.A0k     // Catch:{ all -> 0x0b1d }
            if (r0 != 0) goto L_0x0162
            boolean r0 = r3.A0e     // Catch:{ all -> 0x0b1d }
            if (r0 != 0) goto L_0x0162
            android.content.Context r0 = r3.A14()     // Catch:{ NotFoundException -> 0x00e7 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ NotFoundException -> 0x00e7 }
            int r0 = r3.A01     // Catch:{ NotFoundException -> 0x00e7 }
            java.lang.String r4 = r1.getResourceName(r0)     // Catch:{ NotFoundException -> 0x00e7 }
            goto L_0x00ea
        L_0x00e7:
            java.lang.String r4 = "unknown"
        L_0x00ea:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "No view found for id 0x"
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            int r0 = r3.A01     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " ("
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r4)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = ") for fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0b1d }
            r1.<init>(r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x086c
        L_0x0118:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "Cannot create fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " for a container view with no id"
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0b1d }
            r1.<init>(r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x086c
        L_0x0135:
            boolean r0 = r10 instanceof androidx.fragment.app.FragmentContainerView     // Catch:{ all -> 0x0b1d }
            if (r0 != 0) goto L_0x0162
            X.1kE r0 = X.C34281kE.A01     // Catch:{ all -> 0x0b1d }
            X.1q8 r12 = new X.1q8     // Catch:{ all -> 0x0b1d }
            r12.<init>(r10, r3)     // Catch:{ all -> 0x0b1d }
            X.C34281kE.A03(r12)     // Catch:{ all -> 0x0b1d }
            X.1kF r9 = X.C34281kE.A00(r3)     // Catch:{ all -> 0x0b1d }
            java.util.Set r1 = r9.A01     // Catch:{ all -> 0x0b1d }
            X.1kP r0 = X.C34391kP.DETECT_WRONG_FRAGMENT_CONTAINER     // Catch:{ all -> 0x0b1d }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0162
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x0b1d }
            java.lang.Class r0 = r12.getClass()     // Catch:{ all -> 0x0b1d }
            boolean r0 = X.C34281kE.A04(r9, r1, r0)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0162
            X.C34281kE.A02(r9, r12)     // Catch:{ all -> 0x0b1d }
        L_0x0162:
            r3.A0C = r10     // Catch:{ all -> 0x0b1d }
            r3.A1S(r8, r11, r10)     // Catch:{ all -> 0x0b1d }
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x04da
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0185
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "moveto VIEW_CREATED: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x0185:
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            r0.setSaveFromParentEnabled(r2)     // Catch:{ all -> 0x0b1d }
            android.view.View r1 = r3.A0B     // Catch:{ all -> 0x0b1d }
            r0 = 2131431001(0x7f0b0e59, float:1.8483719E38)
            r1.setTag(r0, r3)     // Catch:{ all -> 0x0b1d }
            if (r10 == 0) goto L_0x0197
            r15.A01()     // Catch:{ all -> 0x0b1d }
        L_0x0197:
            boolean r0 = r3.A0c     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x01a2
            android.view.View r1 = r3.A0B     // Catch:{ all -> 0x0b1d }
            r0 = 8
            r1.setVisibility(r0)     // Catch:{ all -> 0x0b1d }
        L_0x01a2:
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0b1d }
            android.view.View r1 = r3.A0B     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x01e3
            X.AnonymousClass1HF.A0U(r1)     // Catch:{ all -> 0x0b1d }
        L_0x01af:
            android.os.Bundle r1 = r3.A07     // Catch:{ all -> 0x0b1d }
            if (r1 == 0) goto L_0x01e1
            java.lang.String r0 = "savedInstanceState"
            android.os.Bundle r1 = r1.getBundle(r0)     // Catch:{ all -> 0x0b1d }
        L_0x01b9:
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            r3.A21(r1, r0)     // Catch:{ all -> 0x0b1d }
            X.1GP r0 = r3.A0H     // Catch:{ all -> 0x0b1d }
            X.AnonymousClass1GP.A0B(r0, r6)     // Catch:{ all -> 0x0b1d }
            X.1GU r1 = r15.A03     // Catch:{ all -> 0x0b1d }
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            r1.A00(r8, r0, r3, r2)     // Catch:{ all -> 0x0b1d }
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            int r7 = r0.getVisibility()     // Catch:{ all -> 0x0b1d }
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            float r1 = r0.getAlpha()     // Catch:{ all -> 0x0b1d }
            X.1mt r0 = androidx.fragment.app.Fragment.A0K(r3)     // Catch:{ all -> 0x0b1d }
            r0.A00 = r1     // Catch:{ all -> 0x0b1d }
            android.view.ViewGroup r0 = r3.A0C     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x04da
            goto L_0x01ec
        L_0x01e1:
            r1 = 0
            goto L_0x01b9
        L_0x01e3:
            X.2v9 r0 = new X.2v9     // Catch:{ all -> 0x0b1d }
            r0.<init>(r1, r15, r4)     // Catch:{ all -> 0x0b1d }
            r1.addOnAttachStateChangeListener(r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x01af
        L_0x01ec:
            if (r7 != 0) goto L_0x04da
            goto L_0x04a4
        L_0x01f0:
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x020a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "moveto CREATED: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x020a:
            android.os.Bundle r1 = r3.A07     // Catch:{ all -> 0x0b1d }
            if (r1 == 0) goto L_0x0245
            java.lang.String r0 = "savedInstanceState"
            android.os.Bundle r8 = r1.getBundle(r0)     // Catch:{ all -> 0x0b1d }
        L_0x0214:
            boolean r0 = r3.A0g     // Catch:{ all -> 0x0b1d }
            if (r0 != 0) goto L_0x0264
            X.1GU r7 = r15.A03     // Catch:{ all -> 0x0b1d }
            r7.A02(r8, r3)     // Catch:{ all -> 0x0b1d }
            X.1GP r0 = r3.A0H     // Catch:{ all -> 0x0b1d }
            r0.A0a()     // Catch:{ all -> 0x0b1d }
            r3.A04 = r4     // Catch:{ all -> 0x0b1d }
            r3.A0X = r2     // Catch:{ all -> 0x0b1d }
            X.1Fw r1 = r3.A0L     // Catch:{ all -> 0x0b1d }
            X.2vg r0 = new X.2vg     // Catch:{ all -> 0x0b1d }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x0b1d }
            r1.A05(r0)     // Catch:{ all -> 0x0b1d }
            r3.A1z(r8)     // Catch:{ all -> 0x0b1d }
            r3.A0g = r4     // Catch:{ all -> 0x0b1d }
            boolean r0 = r3.A0X     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0247
            X.1Fw r1 = r3.A0L     // Catch:{ all -> 0x0b1d }
            X.1Wq r0 = X.C27581Wq.ON_CREATE     // Catch:{ all -> 0x0b1d }
            r1.A07(r0)     // Catch:{ all -> 0x0b1d }
            r7.A03(r8, r3, r2)     // Catch:{ all -> 0x0b1d }
            goto L_0x003d
        L_0x0245:
            r8 = 0
            goto L_0x0214
        L_0x0247:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " did not call through to super.onCreate()"
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            X.BGu r1 = new X.BGu     // Catch:{ all -> 0x0b1d }
            r1.<init>(r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x086c
        L_0x0264:
            r3.A04 = r4     // Catch:{ all -> 0x0b1d }
            r3.A1L()     // Catch:{ all -> 0x0b1d }
            goto L_0x003d
        L_0x026b:
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0285
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "moveto ACTIVITY_CREATED: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x0285:
            android.os.Bundle r1 = r3.A07     // Catch:{ all -> 0x0b1d }
            if (r1 == 0) goto L_0x0302
            java.lang.String r0 = "savedInstanceState"
            android.os.Bundle r8 = r1.getBundle(r0)     // Catch:{ all -> 0x0b1d }
        L_0x028f:
            X.1GP r0 = r3.A0H     // Catch:{ all -> 0x0b1d }
            r0.A0a()     // Catch:{ all -> 0x0b1d }
            r3.A04 = r7     // Catch:{ all -> 0x0b1d }
            r3.A0X = r2     // Catch:{ all -> 0x0b1d }
            r3.A1y(r8)     // Catch:{ all -> 0x0b1d }
            boolean r0 = r3.A0X     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0321
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x02b9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "moveto RESTORE_VIEW_STATE: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x02b9:
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            r9 = 0
            if (r0 == 0) goto L_0x02e9
            android.os.Bundle r1 = r3.A07     // Catch:{ all -> 0x0b1d }
            if (r1 == 0) goto L_0x0300
            java.lang.String r0 = "savedInstanceState"
            android.os.Bundle r7 = r1.getBundle(r0)     // Catch:{ all -> 0x0b1d }
        L_0x02c8:
            android.util.SparseArray r1 = r3.A09     // Catch:{ all -> 0x0b1d }
            if (r1 == 0) goto L_0x02d3
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            r0.restoreHierarchyState(r1)     // Catch:{ all -> 0x0b1d }
            r3.A09 = r9     // Catch:{ all -> 0x0b1d }
        L_0x02d3:
            r3.A0X = r2     // Catch:{ all -> 0x0b1d }
            r3.A1Q(r7)     // Catch:{ all -> 0x0b1d }
            boolean r0 = r3.A0X     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0304
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x02e9
            X.1q9 r0 = r3.A0J     // Catch:{ all -> 0x0b1d }
            X.1Wq r1 = X.C27581Wq.ON_CREATE     // Catch:{ all -> 0x0b1d }
            X.1Fw r0 = r0.A00     // Catch:{ all -> 0x0b1d }
            r0.A07(r1)     // Catch:{ all -> 0x0b1d }
        L_0x02e9:
            r3.A07 = r9     // Catch:{ all -> 0x0b1d }
            X.1GP r1 = r3.A0H     // Catch:{ all -> 0x0b1d }
            r1.A0J = r2     // Catch:{ all -> 0x0b1d }
            r1.A0K = r2     // Catch:{ all -> 0x0b1d }
            X.1JL r0 = r1.A0A     // Catch:{ all -> 0x0b1d }
            r0.A01 = r2     // Catch:{ all -> 0x0b1d }
            r0 = 4
            X.AnonymousClass1GP.A0B(r1, r0)     // Catch:{ all -> 0x0b1d }
            X.1GU r0 = r15.A03     // Catch:{ all -> 0x0b1d }
            r0.A01(r8, r3)     // Catch:{ all -> 0x0b1d }
            goto L_0x003d
        L_0x0300:
            r7 = r9
            goto L_0x02c8
        L_0x0302:
            r8 = 0
            goto L_0x028f
        L_0x0304:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " did not call through to super.onViewStateRestored()"
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            X.BGu r1 = new X.BGu     // Catch:{ all -> 0x0b1d }
            r1.<init>(r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x086c
        L_0x0321:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " did not call through to super.onActivityCreated()"
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            X.BGu r1 = new X.BGu     // Catch:{ all -> 0x0b1d }
            r1.<init>(r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x086c
        L_0x033e:
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0358
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "moveto STARTED: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x0358:
            X.1GP r0 = r3.A0H     // Catch:{ all -> 0x0b1d }
            r0.A0a()     // Catch:{ all -> 0x0b1d }
            X.1GP r0 = r3.A0H     // Catch:{ all -> 0x0b1d }
            r0.A0y(r4)     // Catch:{ all -> 0x0b1d }
            r0 = 5
            r3.A04 = r0     // Catch:{ all -> 0x0b1d }
            r3.A0X = r2     // Catch:{ all -> 0x0b1d }
            r3.A1v()     // Catch:{ all -> 0x0b1d }
            boolean r0 = r3.A0X     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0395
            X.1Fw r0 = r3.A0L     // Catch:{ all -> 0x0b1d }
            X.1Wq r1 = X.C27581Wq.ON_START     // Catch:{ all -> 0x0b1d }
            r0.A07(r1)     // Catch:{ all -> 0x0b1d }
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0380
            X.1q9 r0 = r3.A0J     // Catch:{ all -> 0x0b1d }
            X.1Fw r0 = r0.A00     // Catch:{ all -> 0x0b1d }
            r0.A07(r1)     // Catch:{ all -> 0x0b1d }
        L_0x0380:
            X.1GP r1 = r3.A0H     // Catch:{ all -> 0x0b1d }
            r1.A0J = r2     // Catch:{ all -> 0x0b1d }
            r1.A0K = r2     // Catch:{ all -> 0x0b1d }
            X.1JL r0 = r1.A0A     // Catch:{ all -> 0x0b1d }
            r0.A01 = r2     // Catch:{ all -> 0x0b1d }
            r0 = 5
            X.AnonymousClass1GP.A0B(r1, r0)     // Catch:{ all -> 0x0b1d }
            X.1GU r0 = r15.A03     // Catch:{ all -> 0x0b1d }
            r0.A0C(r3, r2)     // Catch:{ all -> 0x0b1d }
            goto L_0x003d
        L_0x0395:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " did not call through to super.onStart()"
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            X.BGu r1 = new X.BGu     // Catch:{ all -> 0x0b1d }
            r1.<init>(r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x086c
        L_0x03b2:
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x03cc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "moveto RESUMED: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x03cc:
            X.1mt r0 = r3.A0D     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x042b
            android.view.View r8 = r0.A06     // Catch:{ all -> 0x0b1d }
            if (r8 == 0) goto L_0x042b
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            if (r8 == r0) goto L_0x03e7
            android.view.ViewParent r1 = r8.getParent()     // Catch:{ all -> 0x0b1d }
        L_0x03dc:
            if (r1 == 0) goto L_0x042b
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            if (r1 == r0) goto L_0x03e7
            android.view.ViewParent r1 = r1.getParent()     // Catch:{ all -> 0x0b1d }
            goto L_0x03dc
        L_0x03e7:
            boolean r7 = r8.requestFocus()     // Catch:{ all -> 0x0b1d }
            boolean r0 = X.AnonymousClass1GP.A0G(r6)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x042b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "requestFocus: Restoring focused view "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r8)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            if (r7 == 0) goto L_0x0409
            java.lang.String r0 = "succeeded"
            goto L_0x040b
        L_0x0409:
            java.lang.String r0 = "failed"
        L_0x040b:
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " on Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " resulting in focused view "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            android.view.View r0 = r0.findFocus()     // Catch:{ all -> 0x0b1d }
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x042b:
            r7 = 0
            X.1mt r0 = androidx.fragment.app.Fragment.A0K(r3)     // Catch:{ all -> 0x0b1d }
            r0.A06 = r7     // Catch:{ all -> 0x0b1d }
            X.1GP r0 = r3.A0H     // Catch:{ all -> 0x0b1d }
            r0.A0a()     // Catch:{ all -> 0x0b1d }
            X.1GP r0 = r3.A0H     // Catch:{ all -> 0x0b1d }
            r0.A0y(r4)     // Catch:{ all -> 0x0b1d }
            r0 = 7
            r3.A04 = r0     // Catch:{ all -> 0x0b1d }
            r3.A0X = r2     // Catch:{ all -> 0x0b1d }
            r3.A1u()     // Catch:{ all -> 0x0b1d }
            boolean r0 = r3.A0X     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x047e
            X.1Fw r0 = r3.A0L     // Catch:{ all -> 0x0b1d }
            X.1Wq r1 = X.C27581Wq.ON_RESUME     // Catch:{ all -> 0x0b1d }
            r0.A07(r1)     // Catch:{ all -> 0x0b1d }
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x045a
            X.1q9 r0 = r3.A0J     // Catch:{ all -> 0x0b1d }
            X.1Fw r0 = r0.A00     // Catch:{ all -> 0x0b1d }
            r0.A07(r1)     // Catch:{ all -> 0x0b1d }
        L_0x045a:
            X.1GP r1 = r3.A0H     // Catch:{ all -> 0x0b1d }
            r1.A0J = r2     // Catch:{ all -> 0x0b1d }
            r1.A0K = r2     // Catch:{ all -> 0x0b1d }
            X.1JL r0 = r1.A0A     // Catch:{ all -> 0x0b1d }
            r0.A01 = r2     // Catch:{ all -> 0x0b1d }
            r0 = 7
            X.AnonymousClass1GP.A0B(r1, r0)     // Catch:{ all -> 0x0b1d }
            X.1GU r0 = r15.A03     // Catch:{ all -> 0x0b1d }
            r0.A0B(r3, r2)     // Catch:{ all -> 0x0b1d }
            X.1GR r0 = r15.A04     // Catch:{ all -> 0x0b1d }
            java.lang.String r1 = r3.A0V     // Catch:{ all -> 0x0b1d }
            java.util.HashMap r0 = r0.A03     // Catch:{ all -> 0x0b1d }
            r0.remove(r1)     // Catch:{ all -> 0x0b1d }
            r3.A07 = r7     // Catch:{ all -> 0x0b1d }
            r3.A09 = r7     // Catch:{ all -> 0x0b1d }
            r3.A08 = r7     // Catch:{ all -> 0x0b1d }
            goto L_0x003d
        L_0x047e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " did not call through to super.onResume()"
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            X.BGu r1 = new X.BGu     // Catch:{ all -> 0x0b1d }
            r1.<init>(r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x086c
        L_0x049b:
            int r1 = r1 - r4
            switch(r1) {
                case -1: goto L_0x062c;
                case 0: goto L_0x053d;
                case 1: goto L_0x06ce;
                case 2: goto L_0x04a1;
                case 3: goto L_0x04e3;
                case 4: goto L_0x0770;
                case 5: goto L_0x04de;
                case 6: goto L_0x07da;
                default: goto L_0x049f;
            }     // Catch:{ all -> 0x0b1d }
        L_0x049f:
            goto L_0x003d
        L_0x04a1:
            r3.A0f = r2     // Catch:{ all -> 0x0b1d }
            goto L_0x04da
        L_0x04a4:
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            android.view.View r7 = r0.findFocus()     // Catch:{ all -> 0x0b1d }
            if (r7 == 0) goto L_0x04d4
            X.1mt r0 = androidx.fragment.app.Fragment.A0K(r3)     // Catch:{ all -> 0x0b1d }
            r0.A06 = r7     // Catch:{ all -> 0x0b1d }
            boolean r0 = X.AnonymousClass1GP.A0G(r6)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x04d4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "requestFocus: Saved focused view "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r7)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " for Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x04d4:
            android.view.View r1 = r3.A0B     // Catch:{ all -> 0x0b1d }
            r0 = 0
            r1.setAlpha(r0)     // Catch:{ all -> 0x0b1d }
        L_0x04da:
            r3.A04 = r6     // Catch:{ all -> 0x0b1d }
            goto L_0x003d
        L_0x04de:
            r0 = 5
        L_0x04df:
            r3.A04 = r0     // Catch:{ all -> 0x0b1d }
            goto L_0x003d
        L_0x04e3:
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x04fd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "movefrom ACTIVITY_CREATED: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x04fd:
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0508
            android.util.SparseArray r0 = r3.A09     // Catch:{ all -> 0x0b1d }
            if (r0 != 0) goto L_0x0508
            r15.A04()     // Catch:{ all -> 0x0b1d }
        L_0x0508:
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0539
            android.view.ViewGroup r1 = r3.A0C     // Catch:{ all -> 0x0b1d }
            if (r1 == 0) goto L_0x0539
            X.1GP r0 = r3.A1F()     // Catch:{ all -> 0x0b1d }
            X.1t7 r8 = X.C39461t7.A02(r1, r0)     // Catch:{ all -> 0x0b1d }
            boolean r0 = X.AnonymousClass1GP.A0G(r6)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0532
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "SpecialEffectsController: Enqueuing remove operation for fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x0532:
            java.lang.Integer r1 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0b1d }
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x0b1d }
            X.C39461t7.A05(r15, r8, r1, r0)     // Catch:{ all -> 0x0b1d }
        L_0x0539:
            r3.A04 = r7     // Catch:{ all -> 0x0b1d }
            goto L_0x003d
        L_0x053d:
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0557
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "movefrom CREATED: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x0557:
            boolean r0 = r3.A0j     // Catch:{ all -> 0x0b1d }
            r7 = 1
            if (r0 == 0) goto L_0x0561
            int r0 = r3.A00     // Catch:{ all -> 0x0b1d }
            r11 = 1
            if (r0 <= 0) goto L_0x0562
        L_0x0561:
            r11 = 0
        L_0x0562:
            r10 = 0
            if (r11 == 0) goto L_0x0566
            goto L_0x0590
        L_0x0566:
            X.1GR r9 = r15.A04     // Catch:{ all -> 0x0b1d }
            X.1JL r8 = r9.A00     // Catch:{ all -> 0x0b1d }
            java.util.HashMap r1 = r8.A03     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r3.A0V     // Catch:{ all -> 0x0b1d }
            boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0599
            boolean r0 = r8.A05     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0599
            boolean r0 = r8.A00     // Catch:{ all -> 0x0b1d }
            if (r0 != 0) goto L_0x0599
            java.lang.String r0 = r3.A0U     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x058c
            androidx.fragment.app.Fragment r1 = r9.A00(r0)     // Catch:{ all -> 0x0b1d }
            if (r1 == 0) goto L_0x058c
            boolean r0 = r1.A0l     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x058c
            r3.A0F = r1     // Catch:{ all -> 0x0b1d }
        L_0x058c:
            r3.A04 = r2     // Catch:{ all -> 0x0b1d }
            goto L_0x003d
        L_0x0590:
            X.1GR r9 = r15.A04     // Catch:{ all -> 0x0b1d }
            java.lang.String r1 = r3.A0V     // Catch:{ all -> 0x0b1d }
            java.util.HashMap r0 = r9.A03     // Catch:{ all -> 0x0b1d }
            r0.remove(r1)     // Catch:{ all -> 0x0b1d }
        L_0x0599:
            X.1GO r1 = r3.A0G     // Catch:{ all -> 0x0b1d }
            boolean r0 = r1 instanceof X.AnonymousClass1FD     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x05a4
            X.1JL r0 = r9.A00     // Catch:{ all -> 0x0b1d }
            boolean r7 = r0.A00     // Catch:{ all -> 0x0b1d }
            goto L_0x05b2
        L_0x05a4:
            android.content.Context r1 = r1.A01     // Catch:{ all -> 0x0b1d }
            boolean r0 = r1 instanceof android.app.Activity     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x05b2
            android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ all -> 0x0b1d }
            boolean r0 = r1.isChangingConfigurations()     // Catch:{ all -> 0x0b1d }
            r7 = r0 ^ 1
        L_0x05b2:
            if (r11 != 0) goto L_0x05b6
            if (r7 == 0) goto L_0x05bb
        L_0x05b6:
            X.1JL r0 = r9.A00     // Catch:{ all -> 0x0b1d }
            r0.A0U(r3, r2)     // Catch:{ all -> 0x0b1d }
        L_0x05bb:
            X.1GP r0 = r3.A0H     // Catch:{ all -> 0x0b1d }
            r0.A0X()     // Catch:{ all -> 0x0b1d }
            X.1Fw r1 = r3.A0L     // Catch:{ all -> 0x0b1d }
            X.1Wq r0 = X.C27581Wq.ON_DESTROY     // Catch:{ all -> 0x0b1d }
            r1.A07(r0)     // Catch:{ all -> 0x0b1d }
            r3.A04 = r2     // Catch:{ all -> 0x0b1d }
            r3.A0X = r2     // Catch:{ all -> 0x0b1d }
            r3.A0g = r2     // Catch:{ all -> 0x0b1d }
            r3.A1r()     // Catch:{ all -> 0x0b1d }
            boolean r0 = r3.A0X     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x060f
            X.1GU r0 = r15.A03     // Catch:{ all -> 0x0b1d }
            r0.A08(r3, r2)     // Catch:{ all -> 0x0b1d }
            java.util.ArrayList r0 = r9.A02()     // Catch:{ all -> 0x0b1d }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0b1d }
        L_0x05e1:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0600
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0b1d }
            X.1mr r0 = (X.C35821mr) r0     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x05e1
            androidx.fragment.app.Fragment r7 = r0.A02     // Catch:{ all -> 0x0b1d }
            java.lang.String r1 = r3.A0V     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r7.A0U     // Catch:{ all -> 0x0b1d }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x05e1
            r7.A0F = r3     // Catch:{ all -> 0x0b1d }
            r7.A0U = r10     // Catch:{ all -> 0x0b1d }
            goto L_0x05e1
        L_0x0600:
            java.lang.String r0 = r3.A0U     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x060a
            androidx.fragment.app.Fragment r0 = r9.A00(r0)     // Catch:{ all -> 0x0b1d }
            r3.A0F = r0     // Catch:{ all -> 0x0b1d }
        L_0x060a:
            r9.A07(r15)     // Catch:{ all -> 0x0b1d }
            goto L_0x003d
        L_0x060f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " did not call through to super.onDestroy()"
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            X.BGu r1 = new X.BGu     // Catch:{ all -> 0x0b1d }
            r1.<init>(r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x086c
        L_0x062c:
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0646
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "movefrom ATTACHED: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x0646:
            r0 = -1
            r3.A04 = r0     // Catch:{ all -> 0x0b1d }
            r3.A0X = r2     // Catch:{ all -> 0x0b1d }
            r3.A1K()     // Catch:{ all -> 0x0b1d }
            r0 = 0
            r3.A0A = r0     // Catch:{ all -> 0x0b1d }
            boolean r0 = r3.A0X     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x06b1
            X.1GP r1 = r3.A0H     // Catch:{ all -> 0x0b1d }
            boolean r0 = r1.A0F     // Catch:{ all -> 0x0b1d }
            if (r0 != 0) goto L_0x0665
            r1.A0X()     // Catch:{ all -> 0x0b1d }
            X.1GQ r0 = new X.1GQ     // Catch:{ all -> 0x0b1d }
            r0.<init>()     // Catch:{ all -> 0x0b1d }
            r3.A0H = r0     // Catch:{ all -> 0x0b1d }
        L_0x0665:
            X.1GU r0 = r15.A03     // Catch:{ all -> 0x0b1d }
            r0.A09(r3, r2)     // Catch:{ all -> 0x0b1d }
            r0 = -1
            r3.A04 = r0     // Catch:{ all -> 0x0b1d }
            r0 = 0
            r3.A0G = r0     // Catch:{ all -> 0x0b1d }
            r3.A0E = r0     // Catch:{ all -> 0x0b1d }
            r3.A0I = r0     // Catch:{ all -> 0x0b1d }
            boolean r0 = r3.A0j     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x067c
            int r0 = r3.A00     // Catch:{ all -> 0x0b1d }
            if (r0 <= 0) goto L_0x0692
        L_0x067c:
            X.1GR r0 = r15.A04     // Catch:{ all -> 0x0b1d }
            X.1JL r8 = r0.A00     // Catch:{ all -> 0x0b1d }
            java.util.HashMap r1 = r8.A03     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r3.A0V     // Catch:{ all -> 0x0b1d }
            boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0692
            boolean r0 = r8.A05     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0692
            boolean r0 = r8.A00     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x003d
        L_0x0692:
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x06ac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "initState called for fragment: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x06ac:
            r3.A1J()     // Catch:{ all -> 0x0b1d }
            goto L_0x003d
        L_0x06b1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " did not call through to super.onDetach()"
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            X.BGu r1 = new X.BGu     // Catch:{ all -> 0x0b1d }
            r1.<init>(r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x086c
        L_0x06ce:
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x06e8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "movefrom CREATE_VIEW: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x06e8:
            android.view.ViewGroup r1 = r3.A0C     // Catch:{ all -> 0x0b1d }
            if (r1 == 0) goto L_0x06f3
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x06f3
            r1.removeView(r0)     // Catch:{ all -> 0x0b1d }
        L_0x06f3:
            X.1GP r0 = r3.A0H     // Catch:{ all -> 0x0b1d }
            X.AnonymousClass1GP.A0B(r0, r4)     // Catch:{ all -> 0x0b1d }
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0716
            X.1q9 r0 = r3.A0J     // Catch:{ all -> 0x0b1d }
            r0.A00()     // Catch:{ all -> 0x0b1d }
            X.1Fw r0 = r0.A00     // Catch:{ all -> 0x0b1d }
            X.1Fx r1 = r0.A02     // Catch:{ all -> 0x0b1d }
            X.1Fx r0 = X.C23401Fx.CREATED     // Catch:{ all -> 0x0b1d }
            boolean r0 = r1.A00(r0)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0716
            X.1q9 r0 = r3.A0J     // Catch:{ all -> 0x0b1d }
            X.1Wq r1 = X.C27581Wq.ON_DESTROY     // Catch:{ all -> 0x0b1d }
            X.1Fw r0 = r0.A00     // Catch:{ all -> 0x0b1d }
            r0.A07(r1)     // Catch:{ all -> 0x0b1d }
        L_0x0716:
            r3.A04 = r4     // Catch:{ all -> 0x0b1d }
            r3.A0X = r2     // Catch:{ all -> 0x0b1d }
            r3.A1s()     // Catch:{ all -> 0x0b1d }
            boolean r0 = r3.A0X     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0753
            X.Ct7 r0 = X.C26144Ct7.A00(r3)     // Catch:{ all -> 0x0b1d }
            X.BLd r0 = r0.A01     // Catch:{ all -> 0x0b1d }
            X.04B r8 = r0.A00     // Catch:{ all -> 0x0b1d }
            int r7 = r8.A00     // Catch:{ all -> 0x0b1d }
            r1 = 0
        L_0x072c:
            if (r1 >= r7) goto L_0x073a
            java.lang.Object[] r0 = r8.A02     // Catch:{ all -> 0x0b1d }
            r0 = r0[r1]     // Catch:{ all -> 0x0b1d }
            X.BLY r0 = (X.BLY) r0     // Catch:{ all -> 0x0b1d }
            r0.A0H()     // Catch:{ all -> 0x0b1d }
            int r1 = r1 + 1
            goto L_0x072c
        L_0x073a:
            r3.A0i = r2     // Catch:{ all -> 0x0b1d }
            X.1GU r0 = r15.A03     // Catch:{ all -> 0x0b1d }
            r0.A07(r3)     // Catch:{ all -> 0x0b1d }
            r1 = 0
            r3.A0C = r1     // Catch:{ all -> 0x0b1d }
            r3.A0B = r1     // Catch:{ all -> 0x0b1d }
            r3.A0J = r1     // Catch:{ all -> 0x0b1d }
            X.1DT r0 = r3.A0M     // Catch:{ all -> 0x0b1d }
            r0.A0F(r1)     // Catch:{ all -> 0x0b1d }
            r3.A0f = r2     // Catch:{ all -> 0x0b1d }
            r3.A04 = r4     // Catch:{ all -> 0x0b1d }
            goto L_0x003d
        L_0x0753:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " did not call through to super.onDestroyView()"
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            X.BGu r1 = new X.BGu     // Catch:{ all -> 0x0b1d }
            r1.<init>(r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x086c
        L_0x0770:
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x078a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "movefrom STARTED: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x078a:
            X.1GP r1 = r3.A0H     // Catch:{ all -> 0x0b1d }
            r1.A0K = r4     // Catch:{ all -> 0x0b1d }
            X.1JL r0 = r1.A0A     // Catch:{ all -> 0x0b1d }
            r0.A01 = r4     // Catch:{ all -> 0x0b1d }
            r0 = 4
            X.AnonymousClass1GP.A0B(r1, r0)     // Catch:{ all -> 0x0b1d }
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x07a3
            X.1q9 r0 = r3.A0J     // Catch:{ all -> 0x0b1d }
            X.1Wq r1 = X.C27581Wq.ON_STOP     // Catch:{ all -> 0x0b1d }
            X.1Fw r0 = r0.A00     // Catch:{ all -> 0x0b1d }
            r0.A07(r1)     // Catch:{ all -> 0x0b1d }
        L_0x07a3:
            X.1Fw r1 = r3.A0L     // Catch:{ all -> 0x0b1d }
            X.1Wq r0 = X.C27581Wq.ON_STOP     // Catch:{ all -> 0x0b1d }
            r1.A07(r0)     // Catch:{ all -> 0x0b1d }
            r0 = 4
            r3.A04 = r0     // Catch:{ all -> 0x0b1d }
            r3.A0X = r2     // Catch:{ all -> 0x0b1d }
            r3.A1j()     // Catch:{ all -> 0x0b1d }
            boolean r0 = r3.A0X     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x07bd
            X.1GU r0 = r15.A03     // Catch:{ all -> 0x0b1d }
            r0.A0D(r3, r2)     // Catch:{ all -> 0x0b1d }
            goto L_0x003d
        L_0x07bd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " did not call through to super.onStop()"
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            X.BGu r1 = new X.BGu     // Catch:{ all -> 0x0b1d }
            r1.<init>(r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x086c
        L_0x07da:
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x07f4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "movefrom RESUMED: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x07f4:
            X.1GP r1 = r3.A0H     // Catch:{ all -> 0x0b1d }
            r0 = 5
            X.AnonymousClass1GP.A0B(r1, r0)     // Catch:{ all -> 0x0b1d }
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0807
            X.1q9 r0 = r3.A0J     // Catch:{ all -> 0x0b1d }
            X.1Wq r1 = X.C27581Wq.ON_PAUSE     // Catch:{ all -> 0x0b1d }
            X.1Fw r0 = r0.A00     // Catch:{ all -> 0x0b1d }
            r0.A07(r1)     // Catch:{ all -> 0x0b1d }
        L_0x0807:
            X.1Fw r1 = r3.A0L     // Catch:{ all -> 0x0b1d }
            X.1Wq r0 = X.C27581Wq.ON_PAUSE     // Catch:{ all -> 0x0b1d }
            r1.A07(r0)     // Catch:{ all -> 0x0b1d }
            r0 = 6
            r3.A04 = r0     // Catch:{ all -> 0x0b1d }
            r3.A0X = r2     // Catch:{ all -> 0x0b1d }
            r3.A1t()     // Catch:{ all -> 0x0b1d }
            boolean r0 = r3.A0X     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0821
            X.1GU r0 = r15.A03     // Catch:{ all -> 0x0b1d }
            r0.A0A(r3, r2)     // Catch:{ all -> 0x0b1d }
            goto L_0x003d
        L_0x0821:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " did not call through to super.onPause()"
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            X.BGu r1 = new X.BGu     // Catch:{ all -> 0x0b1d }
            r1.<init>(r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x086c
        L_0x083d:
            java.lang.String r1 = r3.A0U     // Catch:{ all -> 0x0b1d }
            if (r1 == 0) goto L_0x08ab
            X.1GR r0 = r15.A04     // Catch:{ all -> 0x0b1d }
            java.util.HashMap r0 = r0.A02     // Catch:{ all -> 0x0b1d }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0b1d }
            X.1mr r1 = (X.C35821mr) r1     // Catch:{ all -> 0x0b1d }
            if (r1 != 0) goto L_0x08a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            r1.append(r8)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            r1.append(r9)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r3.A0U     // Catch:{ all -> 0x0b1d }
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r7)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b1d }
            r1.<init>(r0)     // Catch:{ all -> 0x0b1d }
        L_0x086c:
            throw r1     // Catch:{ all -> 0x0b1d }
        L_0x086d:
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0887
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "moveto ATTACHED: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x0887:
            androidx.fragment.app.Fragment r1 = r3.A0F     // Catch:{ all -> 0x0b1d }
            java.lang.String r7 = " that does not belong to this FragmentManager!"
            java.lang.String r9 = " declared target fragment "
            java.lang.String r8 = "Fragment "
            r10 = 0
            if (r1 == 0) goto L_0x083d
            X.1GR r0 = r15.A04     // Catch:{ all -> 0x0b1d }
            java.lang.String r1 = r1.A0V     // Catch:{ all -> 0x0b1d }
            java.util.HashMap r0 = r0.A02     // Catch:{ all -> 0x0b1d }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0b1d }
            X.1mr r1 = (X.C35821mr) r1     // Catch:{ all -> 0x0b1d }
            if (r1 == 0) goto L_0x0933
            androidx.fragment.app.Fragment r0 = r3.A0F     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r0.A0V     // Catch:{ all -> 0x0b1d }
            r3.A0U = r0     // Catch:{ all -> 0x0b1d }
            r3.A0F = r10     // Catch:{ all -> 0x0b1d }
        L_0x08a8:
            r1.A03()     // Catch:{ all -> 0x0b1d }
        L_0x08ab:
            X.1GP r1 = r3.A0I     // Catch:{ all -> 0x0b1d }
            X.1GO r0 = r1.A08     // Catch:{ all -> 0x0b1d }
            r3.A0G = r0     // Catch:{ all -> 0x0b1d }
            androidx.fragment.app.Fragment r0 = r1.A06     // Catch:{ all -> 0x0b1d }
            r3.A0E = r0     // Catch:{ all -> 0x0b1d }
            X.1GU r7 = r15.A03     // Catch:{ all -> 0x0b1d }
            r7.A06(r3)     // Catch:{ all -> 0x0b1d }
            java.util.ArrayList r9 = r3.A0o     // Catch:{ all -> 0x0b1d }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x0b1d }
        L_0x08c0:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x08d0
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0b1d }
            X.1jq r0 = (X.C34051jq) r0     // Catch:{ all -> 0x0b1d }
            r0.A00()     // Catch:{ all -> 0x0b1d }
            goto L_0x08c0
        L_0x08d0:
            r9.clear()     // Catch:{ all -> 0x0b1d }
            X.1GP r11 = r3.A0H     // Catch:{ all -> 0x0b1d }
            X.1GO r10 = r3.A0G     // Catch:{ all -> 0x0b1d }
            boolean r0 = r3 instanceof androidx.fragment.app.DialogFragment     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0912
            r9 = r3
            androidx.fragment.app.DialogFragment r9 = (androidx.fragment.app.DialogFragment) r9     // Catch:{ all -> 0x0b1d }
            X.1nG r1 = new X.1nG     // Catch:{ all -> 0x0b1d }
            r1.<init>(r9)     // Catch:{ all -> 0x0b1d }
            X.27k r0 = new X.27k     // Catch:{ all -> 0x0b1d }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x0b1d }
        L_0x08e8:
            r11.A0m(r3, r10, r0)     // Catch:{ all -> 0x0b1d }
            r3.A04 = r2     // Catch:{ all -> 0x0b1d }
            r3.A0X = r2     // Catch:{ all -> 0x0b1d }
            X.1GO r0 = r3.A0G     // Catch:{ all -> 0x0b1d }
            android.content.Context r0 = r0.A01     // Catch:{ all -> 0x0b1d }
            r3.A1x(r0)     // Catch:{ all -> 0x0b1d }
            boolean r0 = r3.A0X     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0918
            X.1GP r0 = r3.A0I     // Catch:{ all -> 0x0b1d }
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A0Z     // Catch:{ all -> 0x0b1d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0b1d }
        L_0x0902:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0954
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0b1d }
            X.1GN r0 = (X.AnonymousClass1GN) r0     // Catch:{ all -> 0x0b1d }
            r0.Bll(r3)     // Catch:{ all -> 0x0b1d }
            goto L_0x0902
        L_0x0912:
            X.1nG r0 = new X.1nG     // Catch:{ all -> 0x0b1d }
            r0.<init>(r3)     // Catch:{ all -> 0x0b1d }
            goto L_0x08e8
        L_0x0918:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            r1.append(r8)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " did not call through to super.onAttach()"
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            X.BGu r1 = new X.BGu     // Catch:{ all -> 0x0b1d }
            r1.<init>(r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x086c
        L_0x0933:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            r1.append(r8)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            r1.append(r9)     // Catch:{ all -> 0x0b1d }
            androidx.fragment.app.Fragment r0 = r3.A0F     // Catch:{ all -> 0x0b1d }
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r7)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b1d }
            r1.<init>(r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x086c
        L_0x0954:
            X.1GP r1 = r3.A0H     // Catch:{ all -> 0x0b1d }
            r1.A0J = r2     // Catch:{ all -> 0x0b1d }
            r1.A0K = r2     // Catch:{ all -> 0x0b1d }
            X.1JL r0 = r1.A0A     // Catch:{ all -> 0x0b1d }
            r0.A01 = r2     // Catch:{ all -> 0x0b1d }
            X.AnonymousClass1GP.A0B(r1, r2)     // Catch:{ all -> 0x0b1d }
            r7.A05(r3)     // Catch:{ all -> 0x0b1d }
            goto L_0x003d
        L_0x0966:
            int r8 = r15.A00     // Catch:{ all -> 0x0b1d }
            r11 = r8
            X.1Fx r0 = r3.A0K     // Catch:{ all -> 0x0b1d }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0b1d }
            r10 = -1
            r9 = 5
            r7 = 3
            r1 = 4
            if (r0 == r1) goto L_0x098e
            if (r0 == r7) goto L_0x0985
            if (r0 == r6) goto L_0x0980
            if (r0 == r4) goto L_0x098a
            int r8 = java.lang.Math.min(r8, r10)     // Catch:{ all -> 0x0b1d }
            goto L_0x098e
        L_0x0980:
            int r8 = java.lang.Math.min(r8, r4)     // Catch:{ all -> 0x0b1d }
            goto L_0x098e
        L_0x0985:
            int r8 = java.lang.Math.min(r8, r9)     // Catch:{ all -> 0x0b1d }
            goto L_0x098e
        L_0x098a:
            int r8 = java.lang.Math.min(r8, r2)     // Catch:{ all -> 0x0b1d }
        L_0x098e:
            boolean r0 = r3.A0a     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x09a8
            boolean r0 = r3.A0f     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x09dc
            int r8 = java.lang.Math.max(r11, r6)     // Catch:{ all -> 0x0b1d }
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x09a8
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ all -> 0x0b1d }
            if (r0 != 0) goto L_0x09a8
            int r8 = java.lang.Math.min(r8, r6)     // Catch:{ all -> 0x0b1d }
        L_0x09a8:
            boolean r0 = r3.A0e     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x09b4
            android.view.ViewGroup r0 = r3.A0C     // Catch:{ all -> 0x0b1d }
            if (r0 != 0) goto L_0x09b4
            int r8 = java.lang.Math.min(r8, r1)     // Catch:{ all -> 0x0b1d }
        L_0x09b4:
            boolean r0 = r3.A0W     // Catch:{ all -> 0x0b1d }
            if (r0 != 0) goto L_0x09bc
            int r8 = java.lang.Math.min(r8, r4)     // Catch:{ all -> 0x0b1d }
        L_0x09bc:
            android.view.ViewGroup r11 = r3.A0C     // Catch:{ all -> 0x0b1d }
            if (r11 == 0) goto L_0x09f7
            X.1GP r0 = r3.A1F()     // Catch:{ all -> 0x0b1d }
            X.1t7 r13 = X.C39461t7.A02(r11, r0)     // Catch:{ all -> 0x0b1d }
            X.1t9 r0 = X.C39461t7.A00(r3, r13)     // Catch:{ all -> 0x0b1d }
            r12 = 0
            if (r0 == 0) goto L_0x09da
            java.lang.Integer r11 = r0.A01     // Catch:{ all -> 0x0b1d }
        L_0x09d1:
            X.1t9 r0 = X.C39461t7.A01(r3, r13)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x09ea
            java.lang.Integer r12 = r0.A01     // Catch:{ all -> 0x0b1d }
            goto L_0x09ea
        L_0x09da:
            r11 = r12
            goto L_0x09d1
        L_0x09dc:
            if (r11 >= r1) goto L_0x09e5
            int r0 = r3.A04     // Catch:{ all -> 0x0b1d }
            int r8 = java.lang.Math.min(r8, r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x09a8
        L_0x09e5:
            int r8 = java.lang.Math.min(r8, r4)     // Catch:{ all -> 0x0b1d }
            goto L_0x09a8
        L_0x09ea:
            if (r11 == 0) goto L_0x09f5
            int r0 = r11.intValue()     // Catch:{ all -> 0x0b1d }
            if (r0 == r10) goto L_0x09f5
            if (r0 == r2) goto L_0x09f5
            goto L_0x09f8
        L_0x09f5:
            r11 = r12
            goto L_0x09f8
        L_0x09f7:
            r11 = 0
        L_0x09f8:
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0b1d }
            if (r11 != r0) goto L_0x0a39
            r0 = 6
            int r8 = java.lang.Math.min(r8, r0)     // Catch:{ all -> 0x0b1d }
        L_0x0a01:
            boolean r0 = r3.A0Y     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0a0d
            int r0 = r3.A04     // Catch:{ all -> 0x0b1d }
            if (r0 >= r9) goto L_0x0a0d
            int r8 = java.lang.Math.min(r8, r1)     // Catch:{ all -> 0x0b1d }
        L_0x0a0d:
            boolean r0 = r3.A0m     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0a15
            int r8 = java.lang.Math.max(r8, r7)     // Catch:{ all -> 0x0b1d }
        L_0x0a15:
            boolean r0 = X.AnonymousClass1GP.A0G(r6)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0031
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "computeExpectedState() of "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r8)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = " for "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x0031
        L_0x0a39:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x0b1d }
            if (r11 != r0) goto L_0x0a42
            int r8 = java.lang.Math.max(r8, r7)     // Catch:{ all -> 0x0b1d }
            goto L_0x0a01
        L_0x0a42:
            boolean r0 = r3.A0j     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0a01
            int r0 = r3.A00     // Catch:{ all -> 0x0b1d }
            if (r0 <= 0) goto L_0x0a4f
            int r8 = java.lang.Math.min(r8, r4)     // Catch:{ all -> 0x0b1d }
            goto L_0x0a01
        L_0x0a4f:
            int r8 = java.lang.Math.min(r8, r10)     // Catch:{ all -> 0x0b1d }
            goto L_0x0a01
        L_0x0a54:
            if (r14 != 0) goto L_0x0aa2
            r0 = -1
            if (r1 != r0) goto L_0x0aa2
            boolean r0 = r3.A0j     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0aa2
            int r0 = r3.A00     // Catch:{ all -> 0x0b1d }
            if (r0 > 0) goto L_0x0aa2
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0a7b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "Cleaning up state of never attached fragment: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x0a7b:
            X.1GR r1 = r15.A04     // Catch:{ all -> 0x0b1d }
            X.1JL r0 = r1.A00     // Catch:{ all -> 0x0b1d }
            r0.A0U(r3, r4)     // Catch:{ all -> 0x0b1d }
            r1.A07(r15)     // Catch:{ all -> 0x0b1d }
            boolean r0 = X.AnonymousClass1GP.A0G(r7)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0a9f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "initState called for fragment: "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x0a9f:
            r3.A1J()     // Catch:{ all -> 0x0b1d }
        L_0x0aa2:
            boolean r0 = r3.A0d     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0b1a
            android.view.View r0 = r3.A0B     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0adb
            android.view.ViewGroup r1 = r3.A0C     // Catch:{ all -> 0x0b1d }
            if (r1 == 0) goto L_0x0adb
            X.1GP r0 = r3.A1F()     // Catch:{ all -> 0x0b1d }
            X.1t7 r7 = X.C39461t7.A02(r1, r0)     // Catch:{ all -> 0x0b1d }
            boolean r0 = r3.A0c     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0af8
            boolean r0 = X.AnonymousClass1GP.A0G(r6)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0ad4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "SpecialEffectsController: Enqueuing hide operation for fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x0ad4:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x0b1d }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0b1d }
            X.C39461t7.A05(r15, r7, r1, r0)     // Catch:{ all -> 0x0b1d }
        L_0x0adb:
            X.1GP r1 = r3.A0I     // Catch:{ all -> 0x0b1d }
            if (r1 == 0) goto L_0x0aeb
            boolean r0 = r3.A0W     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0aeb
            boolean r0 = X.AnonymousClass1GP.A0H(r3)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0aeb
            r1.A0I = r4     // Catch:{ all -> 0x0b1d }
        L_0x0aeb:
            r3.A0d = r2     // Catch:{ all -> 0x0b1d }
            boolean r0 = r3.A0c     // Catch:{ all -> 0x0b1d }
            r3.A1Y(r0)     // Catch:{ all -> 0x0b1d }
            X.1GP r0 = r3.A0H     // Catch:{ all -> 0x0b1d }
            r0.A0Y()     // Catch:{ all -> 0x0b1d }
            goto L_0x0b1a
        L_0x0af8:
            boolean r0 = X.AnonymousClass1GP.A0G(r6)     // Catch:{ all -> 0x0b1d }
            if (r0 == 0) goto L_0x0b12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b1d }
            r1.<init>()     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = "SpecialEffectsController: Enqueuing show operation for fragment "
            r1.append(r0)     // Catch:{ all -> 0x0b1d }
            r1.append(r3)     // Catch:{ all -> 0x0b1d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b1d }
            android.util.Log.v(r5, r0)     // Catch:{ all -> 0x0b1d }
        L_0x0b12:
            java.lang.Integer r1 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0b1d }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0b1d }
            X.C39461t7.A05(r15, r7, r1, r0)     // Catch:{ all -> 0x0b1d }
            goto L_0x0adb
        L_0x0b1a:
            r15.A01 = r2
            return
        L_0x0b1d:
            r0 = move-exception
            r15.A01 = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35821mr.A03():void");
    }

    public void A04() {
        Fragment fragment = this.A02;
        if (fragment.A0B != null) {
            if (AnonymousClass1GP.A0G(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Saving view state for fragment ");
                sb.append(fragment);
                sb.append(" with view ");
                sb.append(fragment.A0B);
                Log.v("FragmentManager", sb.toString());
            }
            SparseArray sparseArray = new SparseArray();
            fragment.A0B.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                fragment.A09 = sparseArray;
            }
            Bundle bundle = new Bundle();
            fragment.A0J.A01.A03(bundle);
            if (!bundle.isEmpty()) {
                fragment.A08 = bundle;
            }
        }
    }

    public void A05(ClassLoader classLoader) {
        Fragment fragment = this.A02;
        Bundle bundle = fragment.A07;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (fragment.A07.getBundle("savedInstanceState") == null) {
                fragment.A07.putBundle("savedInstanceState", new Bundle());
            }
            try {
                fragment.A09 = fragment.A07.getSparseParcelableArray("viewState");
                fragment.A08 = fragment.A07.getBundle("viewRegistryState");
                C64612v3 r1 = (C64612v3) fragment.A07.getParcelable("state");
                if (r1 != null) {
                    fragment.A0U = r1.A06;
                    fragment.A05 = r1.A03;
                    Boolean bool = fragment.A0Q;
                    if (bool != null) {
                        fragment.A0n = bool.booleanValue();
                        fragment.A0Q = null;
                    } else {
                        fragment.A0n = r1.A0E;
                    }
                }
                if (!fragment.A0n) {
                    fragment.A0Y = true;
                }
            } catch (BadParcelableException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to restore view hierarchy state for fragment ");
                sb.append(fragment);
                throw new IllegalStateException(sb.toString(), e);
            }
        }
    }

    public C35821mr(Bundle bundle, Fragment fragment, AnonymousClass1GU r6, AnonymousClass1GR r7) {
        String str;
        this.A03 = r6;
        this.A04 = r7;
        this.A02 = fragment;
        fragment.A09 = null;
        fragment.A08 = null;
        fragment.A00 = 0;
        fragment.A0f = false;
        fragment.A0W = false;
        Fragment fragment2 = fragment.A0F;
        if (fragment2 != null) {
            str = fragment2.A0V;
        } else {
            str = null;
        }
        fragment.A0U = str;
        fragment.A0F = null;
        fragment.A07 = bundle;
        fragment.A06 = bundle.getBundle("arguments");
    }

    public C35821mr(Bundle bundle, AnonymousClass1GU r6, AnonymousClass1GY r7, AnonymousClass1GR r8, ClassLoader classLoader) {
        this.A03 = r6;
        this.A04 = r8;
        C64612v3 r3 = (C64612v3) bundle.getParcelable("state");
        Fragment A002 = r7.A00(r3.A04);
        A002.A0V = r3.A07;
        A002.A0a = r3.A09;
        A002.A0e = r3.A0B;
        A002.A0k = true;
        A002.A03 = r3.A01;
        A002.A01 = r3.A00;
        A002.A0T = r3.A05;
        A002.A0l = r3.A0D;
        A002.A0j = r3.A0C;
        A002.A0Z = r3.A08;
        A002.A0c = r3.A0A;
        A002.A0K = C23401Fx.values()[r3.A02];
        A002.A0U = r3.A06;
        A002.A05 = r3.A03;
        A002.A0n = r3.A0E;
        this.A02 = A002;
        A002.A07 = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        A002.A1R(bundle2);
        if (AnonymousClass1GP.A0G(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(A002);
            Log.v("FragmentManager", sb.toString());
        }
    }

    public C35821mr(Fragment fragment, AnonymousClass1GU r3, AnonymousClass1GR r4) {
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = fragment;
    }
}
