package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: X.1GS  reason: invalid class name */
public class AnonymousClass1GS implements LayoutInflater.Factory2 {
    public final AnonymousClass1GP A00;

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a7, code lost:
        if (r3 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        if (r8 == null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b1, code lost:
        if (r6 == -1) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        r8 = r11.A00.A0O(r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r0 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0014
            X.1GP r1 = r11.A00
            androidx.fragment.app.FragmentContainerView r0 = new androidx.fragment.app.FragmentContainerView
            r0.<init>((android.content.Context) r14, (android.util.AttributeSet) r15, (X.AnonymousClass1GP) r1)
            return r0
        L_0x0014:
            java.lang.String r0 = "fragment"
            boolean r0 = r0.equals(r13)
            r8 = 0
            if (r0 != 0) goto L_0x001e
            return r8
        L_0x001e:
            java.lang.String r0 = "class"
            java.lang.String r2 = r15.getAttributeValue(r8, r0)
            int[] r0 = X.AnonymousClass2WF.A00
            android.content.res.TypedArray r1 = r14.obtainStyledAttributes(r15, r0)
            if (r2 != 0) goto L_0x0031
            r0 = 0
            java.lang.String r2 = r1.getString(r0)
        L_0x0031:
            r0 = 1
            r5 = -1
            int r4 = r1.getResourceId(r0, r5)
            r0 = 2
            java.lang.String r3 = r1.getString(r0)
            r1.recycle()
            if (r2 == 0) goto L_0x01f4
            java.lang.ClassLoader r7 = r14.getClassLoader()
            X.00O r1 = X.AnonymousClass1GY.A01     // Catch:{ ClassNotFoundException -> 0x006f }
            java.lang.Object r6 = r1.get(r7)     // Catch:{ ClassNotFoundException -> 0x006f }
            X.00O r6 = (X.AnonymousClass00O) r6     // Catch:{ ClassNotFoundException -> 0x006f }
            if (r6 != 0) goto L_0x0058
            r0 = 0
            X.00O r6 = new X.00O     // Catch:{ ClassNotFoundException -> 0x006f }
            r6.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x006f }
            r1.put(r7, r6)     // Catch:{ ClassNotFoundException -> 0x006f }
        L_0x0058:
            java.lang.Object r1 = r6.get(r2)     // Catch:{ ClassNotFoundException -> 0x006f }
            java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ ClassNotFoundException -> 0x006f }
            if (r1 != 0) goto L_0x0068
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r0, r7)     // Catch:{ ClassNotFoundException -> 0x006f }
            r6.put(r2, r1)     // Catch:{ ClassNotFoundException -> 0x006f }
        L_0x0068:
            java.lang.Class<androidx.fragment.app.Fragment> r0 = androidx.fragment.app.Fragment.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ ClassNotFoundException -> 0x006f }
            goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            if (r0 == 0) goto L_0x01f4
            if (r12 == 0) goto L_0x009c
            int r6 = r12.getId()
            if (r6 != r5) goto L_0x009d
            if (r4 != r5) goto L_0x009d
            if (r3 != 0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r15.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x009c:
            r6 = 0
        L_0x009d:
            if (r4 == r5) goto L_0x00a7
            X.1GP r0 = r11.A00
            androidx.fragment.app.Fragment r8 = r0.A0O(r4)
            if (r8 != 0) goto L_0x00b9
        L_0x00a7:
            if (r3 == 0) goto L_0x00b1
        L_0x00a9:
            X.1GP r0 = r11.A00
            androidx.fragment.app.Fragment r8 = r0.A0Q(r3)
            if (r8 != 0) goto L_0x00b9
        L_0x00b1:
            if (r6 == r5) goto L_0x00b9
            X.1GP r0 = r11.A00
            androidx.fragment.app.Fragment r8 = r0.A0O(r6)
        L_0x00b9:
            java.lang.String r7 = "Fragment "
            java.lang.String r5 = "FragmentManager"
            r10 = 2
            r9 = 1
            if (r8 != 0) goto L_0x016a
            X.1GP r1 = r11.A00
            X.1GY r0 = r1.A0R()
            r14.getClassLoader()
            androidx.fragment.app.Fragment r8 = r0.A00(r2)
            r8.A0a = r9
            r0 = r6
            if (r4 == 0) goto L_0x00d4
            r0 = r4
        L_0x00d4:
            r8.A03 = r0
            r8.A01 = r6
            r8.A0T = r3
            r8.A0f = r9
            r8.A0I = r1
            X.1GO r0 = r1.A08
            r8.A0G = r0
            r8.A0X = r9
            if (r0 == 0) goto L_0x00eb
            r0 = 0
            r8.A0X = r0
            r8.A0X = r9
        L_0x00eb:
            X.1mr r6 = r1.A0T(r8)
            boolean r0 = X.AnonymousClass1GP.A0G(r10)
            if (r0 == 0) goto L_0x0113
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r8)
            java.lang.String r0 = " has been inflated via the <fragment> tag: id=0x"
        L_0x0102:
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r5, r0)
        L_0x0113:
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            X.1kE r0 = X.C34281kE.A01
            X.27q r9 = new X.27q
            r9.<init>(r12, r8)
            X.C34281kE.A03(r9)
            X.1kF r5 = X.C34281kE.A00(r8)
            java.util.Set r1 = r5.A01
            X.1kP r0 = X.C34391kP.DETECT_FRAGMENT_TAG_USAGE
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x013e
            java.lang.Class r1 = r8.getClass()
            java.lang.Class r0 = r9.getClass()
            boolean r0 = X.C34281kE.A04(r5, r1, r0)
            if (r0 == 0) goto L_0x013e
            X.C34281kE.A02(r5, r9)
        L_0x013e:
            r8.A0C = r12
            r6.A03()
            r6.A02()
            android.view.View r0 = r8.A0B
            if (r0 == 0) goto L_0x019c
            if (r4 == 0) goto L_0x014f
            r0.setId(r4)
        L_0x014f:
            android.view.View r0 = r8.A0B
            java.lang.Object r0 = r0.getTag()
            if (r0 != 0) goto L_0x015c
            android.view.View r0 = r8.A0B
            r0.setTag(r3)
        L_0x015c:
            android.view.View r2 = r8.A0B
            r1 = 0
            X.2v9 r0 = new X.2v9
            r0.<init>(r6, r11, r1)
            r2.addOnAttachStateChangeListener(r0)
            android.view.View r0 = r8.A0B
            return r0
        L_0x016a:
            boolean r0 = r8.A0f
            if (r0 != 0) goto L_0x01b6
            r8.A0f = r9
            X.1GP r1 = r11.A00
            r8.A0I = r1
            X.1GO r0 = r1.A08
            r8.A0G = r0
            r8.A0X = r9
            if (r0 == 0) goto L_0x0181
            r0 = 0
            r8.A0X = r0
            r8.A0X = r9
        L_0x0181:
            X.1mr r6 = r1.A0U(r8)
            boolean r0 = X.AnonymousClass1GP.A0G(r10)
            if (r0 == 0) goto L_0x0113
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Retained Fragment "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " has been re-attached via the <fragment> tag: id=0x"
            goto L_0x0102
        L_0x019c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r2)
            java.lang.String r0 = " did not create a view."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01b6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r15.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": Duplicate id 0x"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r4)
            r1.append(r0)
            java.lang.String r0 = ", tag "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", or parent id 0x"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r6)
            r1.append(r0)
            java.lang.String r0 = " with another fragment for "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01f4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GS.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public AnonymousClass1GS(AnonymousClass1GP r1) {
        this.A00 = r1;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
