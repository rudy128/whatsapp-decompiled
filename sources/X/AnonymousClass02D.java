package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.02D  reason: invalid class name */
public final class AnonymousClass02D {
    public static AnonymousClass02D A07;
    public static final PorterDuff.Mode A08 = PorterDuff.Mode.SRC_IN;
    public static final AnonymousClass02O A09 = new C002100z(6);
    public TypedValue A00;
    public AnonymousClass02P A01;
    public AnonymousClass00O A02;
    public AnonymousClass04B A03;
    public WeakHashMap A04;
    public boolean A05;
    public final WeakHashMap A06 = new WeakHashMap(0);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable A01(android.content.Context r5, long r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.WeakHashMap r0 = r4.A06     // Catch:{ all -> 0x002b }
            java.lang.Object r3 = r0.get(r5)     // Catch:{ all -> 0x002b }
            X.00p r3 = (X.C001100p) r3     // Catch:{ all -> 0x002b }
            r2 = 0
            if (r3 == 0) goto L_0x0029
            java.lang.Object r0 = r3.A05(r6)     // Catch:{ all -> 0x002b }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0029
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x002b }
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0026
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ all -> 0x002b }
            android.graphics.drawable.Drawable r0 = r1.newDrawable(r0)     // Catch:{ all -> 0x002b }
            monitor-exit(r4)
            return r0
        L_0x0026:
            r3.A08(r6)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r4)
            return r2
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02D.A01(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    private synchronized void A04(Context context, Drawable drawable, long j) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            WeakHashMap weakHashMap = this.A06;
            C001100p r1 = (C001100p) weakHashMap.get(context);
            if (r1 == null) {
                r1 = new C001100p();
                weakHashMap.put(context, r1);
            }
            r1.A0A(j, new WeakReference(constantState));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.res.ColorStateList A08(android.content.Context r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.WeakHashMap r0 = r6.A04     // Catch:{ all -> 0x0121 }
            r4 = 0
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0121 }
            X.04B r0 = (X.AnonymousClass04B) r0     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0014
            java.lang.Object r4 = X.AnonymousClass0LW.A00(r0, r8)     // Catch:{ all -> 0x0121 }
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4     // Catch:{ all -> 0x0121 }
        L_0x0014:
            if (r4 != 0) goto L_0x011f
            X.02P r2 = r6.A01     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x00fc
            X.02Q r2 = (X.AnonymousClass02Q) r2     // Catch:{ all -> 0x0121 }
            r0 = 2131230920(0x7f0800c8, float:1.8077906E38)
            r1 = 2131099669(0x7f060015, float:1.7811698E38)
            if (r8 == r0) goto L_0x00f7
            r0 = 2131230966(0x7f0800f6, float:1.8078E38)
            r1 = 2131099672(0x7f060018, float:1.7811704E38)
            if (r8 == r0) goto L_0x00f7
            r0 = 2131230965(0x7f0800f5, float:1.8077998E38)
            if (r8 != r0) goto L_0x0095
            r0 = 3
            int[][] r3 = new int[r0][]     // Catch:{ all -> 0x0121 }
            int[] r2 = new int[r0]     // Catch:{ all -> 0x0121 }
            r0 = 2130969154(0x7f040242, float:1.7546982E38)
            r5 = 2130969154(0x7f040242, float:1.7546982E38)
            android.content.res.ColorStateList r4 = X.AnonymousClass03T.A03(r7, r0)     // Catch:{ all -> 0x0121 }
            r1 = 0
            if (r4 == 0) goto L_0x0073
            boolean r0 = r4.isStateful()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0073
            int[] r0 = X.AnonymousClass03T.A02     // Catch:{ all -> 0x0121 }
            r3[r1] = r0     // Catch:{ all -> 0x0121 }
            int r0 = r4.getColorForState(r0, r1)     // Catch:{ all -> 0x0121 }
            r2[r1] = r0     // Catch:{ all -> 0x0121 }
            r1 = 1
            int[] r0 = X.AnonymousClass03T.A01     // Catch:{ all -> 0x0121 }
            r3[r1] = r0     // Catch:{ all -> 0x0121 }
            r0 = 2130969111(0x7f040217, float:1.7546895E38)
            int r0 = X.AnonymousClass03T.A02(r7, r0)     // Catch:{ all -> 0x0121 }
            r2[r1] = r0     // Catch:{ all -> 0x0121 }
            r1 = 2
            int[] r0 = X.AnonymousClass03T.A03     // Catch:{ all -> 0x0121 }
            r3[r1] = r0     // Catch:{ all -> 0x0121 }
            int r0 = r4.getDefaultColor()     // Catch:{ all -> 0x0121 }
        L_0x006a:
            r2[r1] = r0     // Catch:{ all -> 0x0121 }
            android.content.res.ColorStateList r4 = new android.content.res.ColorStateList     // Catch:{ all -> 0x0121 }
            r4.<init>(r3, r2)     // Catch:{ all -> 0x0121 }
            goto L_0x00fd
        L_0x0073:
            int[] r0 = X.AnonymousClass03T.A02     // Catch:{ all -> 0x0121 }
            r3[r1] = r0     // Catch:{ all -> 0x0121 }
            int r0 = X.AnonymousClass03T.A01(r7, r5)     // Catch:{ all -> 0x0121 }
            r2[r1] = r0     // Catch:{ all -> 0x0121 }
            r1 = 1
            int[] r0 = X.AnonymousClass03T.A01     // Catch:{ all -> 0x0121 }
            r3[r1] = r0     // Catch:{ all -> 0x0121 }
            r0 = 2130969111(0x7f040217, float:1.7546895E38)
            int r0 = X.AnonymousClass03T.A02(r7, r0)     // Catch:{ all -> 0x0121 }
            r2[r1] = r0     // Catch:{ all -> 0x0121 }
            r1 = 2
            int[] r0 = X.AnonymousClass03T.A03     // Catch:{ all -> 0x0121 }
            r3[r1] = r0     // Catch:{ all -> 0x0121 }
            int r0 = X.AnonymousClass03T.A02(r7, r5)     // Catch:{ all -> 0x0121 }
            goto L_0x006a
        L_0x0095:
            r0 = 2131230908(0x7f0800bc, float:1.8077882E38)
            r1 = 2130969108(0x7f040214, float:1.7546889E38)
            if (r8 == r0) goto L_0x00ee
            r0 = 2131230902(0x7f0800b6, float:1.807787E38)
            if (r8 != r0) goto L_0x00a8
            r0 = 0
            android.content.res.ColorStateList r4 = X.AnonymousClass02Q.A00(r7, r0)     // Catch:{ all -> 0x0121 }
            goto L_0x00fd
        L_0x00a8:
            r0 = 2131230907(0x7f0800bb, float:1.807788E38)
            r1 = 2130969106(0x7f040212, float:1.7546885E38)
            if (r8 == r0) goto L_0x00ee
            r0 = 2131230961(0x7f0800f1, float:1.807799E38)
            if (r8 == r0) goto L_0x00ea
            r0 = 2131230962(0x7f0800f2, float:1.8077992E38)
            if (r8 == r0) goto L_0x00ea
            int[] r0 = r2.A04     // Catch:{ all -> 0x0121 }
            boolean r0 = X.AnonymousClass02Q.A01(r0, r8)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00ca
            r0 = 2130969113(0x7f040219, float:1.7546899E38)
            android.content.res.ColorStateList r4 = X.AnonymousClass03T.A03(r7, r0)     // Catch:{ all -> 0x0121 }
            goto L_0x00fd
        L_0x00ca:
            int[] r0 = r2.A05     // Catch:{ all -> 0x0121 }
            boolean r0 = X.AnonymousClass02Q.A01(r0, r8)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00d6
            r1 = 2131099668(0x7f060014, float:1.7811696E38)
            goto L_0x00f7
        L_0x00d6:
            int[] r0 = r2.A03     // Catch:{ all -> 0x0121 }
            boolean r0 = X.AnonymousClass02Q.A01(r0, r8)     // Catch:{ all -> 0x0121 }
            r1 = 2131099667(0x7f060013, float:1.7811694E38)
            if (r0 != 0) goto L_0x00f7
            r0 = 2131230958(0x7f0800ee, float:1.8077983E38)
            if (r8 != r0) goto L_0x00fc
            r1 = 2131099670(0x7f060016, float:1.78117E38)
            goto L_0x00f7
        L_0x00ea:
            r1 = 2131099671(0x7f060017, float:1.7811702E38)
            goto L_0x00f7
        L_0x00ee:
            int r0 = X.AnonymousClass03T.A02(r7, r1)     // Catch:{ all -> 0x0121 }
            android.content.res.ColorStateList r4 = X.AnonymousClass02Q.A00(r7, r0)     // Catch:{ all -> 0x0121 }
            goto L_0x00fd
        L_0x00f7:
            android.content.res.ColorStateList r4 = X.AnonymousClass03S.A00(r7, r1)     // Catch:{ all -> 0x0121 }
            goto L_0x00fd
        L_0x00fc:
            r4 = 0
        L_0x00fd:
            if (r4 == 0) goto L_0x011f
            java.util.WeakHashMap r0 = r6.A04     // Catch:{ all -> 0x0121 }
            if (r0 != 0) goto L_0x010a
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0121 }
            r0.<init>()     // Catch:{ all -> 0x0121 }
            r6.A04 = r0     // Catch:{ all -> 0x0121 }
        L_0x010a:
            java.lang.Object r1 = r0.get(r7)     // Catch:{ all -> 0x0121 }
            X.04B r1 = (X.AnonymousClass04B) r1     // Catch:{ all -> 0x0121 }
            if (r1 != 0) goto L_0x011c
            X.04B r1 = new X.04B     // Catch:{ all -> 0x0121 }
            r1.<init>()     // Catch:{ all -> 0x0121 }
            java.util.WeakHashMap r0 = r6.A04     // Catch:{ all -> 0x0121 }
            r0.put(r7, r1)     // Catch:{ all -> 0x0121 }
        L_0x011c:
            r1.A01(r8, r4)     // Catch:{ all -> 0x0121 }
        L_0x011f:
            monitor-exit(r6)
            return r4
        L_0x0121:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02D.A08(android.content.Context, int):android.content.res.ColorStateList");
    }

    public synchronized Drawable A09(Context context, int i) {
        return A0A(context, i, false);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008c A[Catch:{ Exception -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2 A[Catch:{ Exception -> 0x00ba }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.drawable.Drawable A0A(android.content.Context r11, int r12, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.A05     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x0017
            r0 = 1
            r10.A05 = r0     // Catch:{ all -> 0x01f3 }
            r0 = 2131230978(0x7f080102, float:1.8078024E38)
            android.graphics.drawable.Drawable r0 = r10.A09(r11, r0)     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x01e8
            boolean r0 = A07(r0)     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x01e8
        L_0x0017:
            X.00O r0 = r10.A02     // Catch:{ all -> 0x01f3 }
            r6 = 0
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x00c9
            X.04B r0 = r10.A03     // Catch:{ all -> 0x01f3 }
            java.lang.String r4 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = X.AnonymousClass0LW.A00(r0, r12)     // Catch:{ all -> 0x01f3 }
            boolean r0 = r4.equals(r1)     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x00c9
            if (r1 == 0) goto L_0x0045
            X.00O r0 = r10.A02     // Catch:{ all -> 0x01f3 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x0045
            goto L_0x00c9
        L_0x003e:
            X.04B r0 = new X.04B     // Catch:{ all -> 0x01f3 }
            r0.<init>()     // Catch:{ all -> 0x01f3 }
            r10.A03 = r0     // Catch:{ all -> 0x01f3 }
        L_0x0045:
            android.util.TypedValue r5 = r10.A00     // Catch:{ all -> 0x01f3 }
            if (r5 != 0) goto L_0x0050
            android.util.TypedValue r5 = new android.util.TypedValue     // Catch:{ all -> 0x01f3 }
            r5.<init>()     // Catch:{ all -> 0x01f3 }
            r10.A00 = r5     // Catch:{ all -> 0x01f3 }
        L_0x0050:
            android.content.res.Resources r7 = r11.getResources()     // Catch:{ all -> 0x01f3 }
            r9 = 1
            r7.getValue(r12, r5, r9)     // Catch:{ all -> 0x01f3 }
            int r0 = r5.assetCookie     // Catch:{ all -> 0x01f3 }
            long r0 = (long) r0     // Catch:{ all -> 0x01f3 }
            r2 = 32
            long r0 = r0 << r2
            int r2 = r5.data     // Catch:{ all -> 0x01f3 }
            long r2 = (long) r2     // Catch:{ all -> 0x01f3 }
            long r0 = r0 | r2
            android.graphics.drawable.Drawable r6 = r10.A01(r11, r0)     // Catch:{ all -> 0x01f3 }
            if (r6 != 0) goto L_0x00c9
            java.lang.CharSequence r2 = r5.string     // Catch:{ all -> 0x01f3 }
            if (r2 == 0) goto L_0x00c2
            java.lang.String r3 = r2.toString()     // Catch:{ all -> 0x01f3 }
            java.lang.String r2 = ".xml"
            boolean r2 = r3.endsWith(r2)     // Catch:{ all -> 0x01f3 }
            if (r2 == 0) goto L_0x00c2
            android.content.res.XmlResourceParser r8 = r7.getXml(r12)     // Catch:{ Exception -> 0x00ba }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r8)     // Catch:{ Exception -> 0x00ba }
        L_0x0080:
            int r3 = r8.next()     // Catch:{ Exception -> 0x00ba }
            r2 = 2
            if (r3 == r2) goto L_0x008a
            if (r3 == r9) goto L_0x008a
            goto L_0x0080
        L_0x008a:
            if (r3 != r2) goto L_0x00b2
            java.lang.String r3 = r8.getName()     // Catch:{ Exception -> 0x00ba }
            X.04B r2 = r10.A03     // Catch:{ Exception -> 0x00ba }
            r2.A01(r12, r3)     // Catch:{ Exception -> 0x00ba }
            X.00O r2 = r10.A02     // Catch:{ Exception -> 0x00ba }
            java.lang.Object r3 = r2.get(r3)     // Catch:{ Exception -> 0x00ba }
            X.0rS r3 = (X.C15940rS) r3     // Catch:{ Exception -> 0x00ba }
            if (r3 == 0) goto L_0x00a7
            android.content.res.Resources$Theme r2 = r11.getTheme()     // Catch:{ Exception -> 0x00ba }
            android.graphics.drawable.Drawable r6 = r3.BHQ(r11, r2, r7, r8)     // Catch:{ Exception -> 0x00ba }
        L_0x00a7:
            if (r6 == 0) goto L_0x00c2
            int r2 = r5.changingConfigurations     // Catch:{ Exception -> 0x00ba }
            r6.setChangingConfigurations(r2)     // Catch:{ Exception -> 0x00ba }
            r10.A04(r11, r6, r0)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00c2
        L_0x00b2:
            java.lang.String r1 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00ba }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00ba }
            throw r0     // Catch:{ Exception -> 0x00ba }
        L_0x00ba:
            r2 = move-exception
            java.lang.String r1 = "ResourceManagerInternal"
            java.lang.String r0 = "Exception while inflating drawable"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x01f3 }
        L_0x00c2:
            if (r6 != 0) goto L_0x00c9
            X.04B r0 = r10.A03     // Catch:{ all -> 0x01f3 }
            r0.A01(r12, r4)     // Catch:{ all -> 0x01f3 }
        L_0x00c9:
            if (r6 != 0) goto L_0x01d5
            android.util.TypedValue r4 = r10.A00     // Catch:{ all -> 0x01f3 }
            if (r4 != 0) goto L_0x00d6
            android.util.TypedValue r4 = new android.util.TypedValue     // Catch:{ all -> 0x01f3 }
            r4.<init>()     // Catch:{ all -> 0x01f3 }
            r10.A00 = r4     // Catch:{ all -> 0x01f3 }
        L_0x00d6:
            android.content.res.Resources r1 = r11.getResources()     // Catch:{ all -> 0x01f3 }
            r0 = 1
            r1.getValue(r12, r4, r0)     // Catch:{ all -> 0x01f3 }
            int r0 = r4.assetCookie     // Catch:{ all -> 0x01f3 }
            long r0 = (long) r0     // Catch:{ all -> 0x01f3 }
            r2 = 32
            long r0 = r0 << r2
            int r2 = r4.data     // Catch:{ all -> 0x01f3 }
            long r2 = (long) r2     // Catch:{ all -> 0x01f3 }
            long r0 = r0 | r2
            android.graphics.drawable.Drawable r6 = r10.A01(r11, r0)     // Catch:{ all -> 0x01f3 }
            if (r6 != 0) goto L_0x01d5
            X.02P r2 = r10.A01     // Catch:{ all -> 0x01f3 }
            if (r2 != 0) goto L_0x00f4
            goto L_0x01d4
        L_0x00f4:
            r2 = 2131230916(0x7f0800c4, float:1.8077898E38)
            if (r12 != r2) goto L_0x0117
            r2 = 2
            android.graphics.drawable.Drawable[] r5 = new android.graphics.drawable.Drawable[r2]     // Catch:{ all -> 0x01f3 }
            r2 = 2131230915(0x7f0800c3, float:1.8077896E38)
            android.graphics.drawable.Drawable r3 = r10.A09(r11, r2)     // Catch:{ all -> 0x01f3 }
            r2 = 0
            r5[r2] = r3     // Catch:{ all -> 0x01f3 }
            r2 = 2131230917(0x7f0800c5, float:1.80779E38)
            android.graphics.drawable.Drawable r3 = r10.A09(r11, r2)     // Catch:{ all -> 0x01f3 }
            r2 = 1
            r5[r2] = r3     // Catch:{ all -> 0x01f3 }
            android.graphics.drawable.LayerDrawable r6 = new android.graphics.drawable.LayerDrawable     // Catch:{ all -> 0x01f3 }
            r6.<init>(r5)     // Catch:{ all -> 0x01f3 }
            goto L_0x01c9
        L_0x0117:
            r2 = 2131230951(0x7f0800e7, float:1.807797E38)
            if (r12 != r2) goto L_0x0120
            r3 = 2131165243(0x7f07003b, float:1.7944698E38)
            goto L_0x0131
        L_0x0120:
            r2 = 2131230950(0x7f0800e6, float:1.8077967E38)
            if (r12 != r2) goto L_0x0129
            r3 = 2131165244(0x7f07003c, float:1.79447E38)
            goto L_0x0131
        L_0x0129:
            r2 = 2131230952(0x7f0800e8, float:1.8077971E38)
            if (r12 != r2) goto L_0x01c8
            r3 = 2131165245(0x7f07003d, float:1.7944702E38)
        L_0x0131:
            android.content.res.Resources r2 = r11.getResources()     // Catch:{ all -> 0x01f3 }
            int r8 = r2.getDimensionPixelSize(r3)     // Catch:{ all -> 0x01f3 }
            r2 = 2131230963(0x7f0800f3, float:1.8077994E38)
            android.graphics.drawable.Drawable r7 = r10.A09(r11, r2)     // Catch:{ all -> 0x01f3 }
            r2 = 2131230964(0x7f0800f4, float:1.8077996E38)
            android.graphics.drawable.Drawable r6 = r10.A09(r11, r2)     // Catch:{ all -> 0x01f3 }
            boolean r2 = r7 instanceof android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x01f3 }
            r5 = 0
            if (r2 == 0) goto L_0x01b1
            int r2 = r7.getIntrinsicWidth()     // Catch:{ all -> 0x01f3 }
            if (r2 != r8) goto L_0x01b1
            int r2 = r7.getIntrinsicHeight()     // Catch:{ all -> 0x01f3 }
            if (r2 != r8) goto L_0x01b1
            android.graphics.drawable.BitmapDrawable r7 = (android.graphics.drawable.BitmapDrawable) r7     // Catch:{ all -> 0x01f3 }
            android.graphics.Bitmap r3 = r7.getBitmap()     // Catch:{ all -> 0x01f3 }
        L_0x015e:
            android.graphics.drawable.BitmapDrawable r9 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x01f3 }
            r9.<init>(r3)     // Catch:{ all -> 0x01f3 }
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT     // Catch:{ all -> 0x01f3 }
            r9.setTileModeX(r2)     // Catch:{ all -> 0x01f3 }
            boolean r2 = r6 instanceof android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x01f3 }
            if (r2 == 0) goto L_0x019a
            int r2 = r6.getIntrinsicWidth()     // Catch:{ all -> 0x01f3 }
            if (r2 != r8) goto L_0x019a
            int r2 = r6.getIntrinsicHeight()     // Catch:{ all -> 0x01f3 }
            if (r2 != r8) goto L_0x019a
        L_0x0178:
            r2 = 3
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]     // Catch:{ all -> 0x01f3 }
            r2[r5] = r7     // Catch:{ all -> 0x01f3 }
            r7 = 1
            r2[r7] = r6     // Catch:{ all -> 0x01f3 }
            r3 = 2
            r2[r3] = r9     // Catch:{ all -> 0x01f3 }
            android.graphics.drawable.LayerDrawable r6 = new android.graphics.drawable.LayerDrawable     // Catch:{ all -> 0x01f3 }
            r6.<init>(r2)     // Catch:{ all -> 0x01f3 }
            r2 = 16908288(0x1020000, float:2.387723E-38)
            r6.setId(r5, r2)     // Catch:{ all -> 0x01f3 }
            r2 = 16908303(0x102000f, float:2.387727E-38)
            r6.setId(r7, r2)     // Catch:{ all -> 0x01f3 }
            r2 = 16908301(0x102000d, float:2.3877265E-38)
            r6.setId(r3, r2)     // Catch:{ all -> 0x01f3 }
            goto L_0x01c9
        L_0x019a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x01f3 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r8, r8, r2)     // Catch:{ all -> 0x01f3 }
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch:{ all -> 0x01f3 }
            r2.<init>(r3)     // Catch:{ all -> 0x01f3 }
            r6.setBounds(r5, r5, r8, r8)     // Catch:{ all -> 0x01f3 }
            r6.draw(r2)     // Catch:{ all -> 0x01f3 }
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x01f3 }
            r6.<init>(r3)     // Catch:{ all -> 0x01f3 }
            goto L_0x0178
        L_0x01b1:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x01f3 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r8, r8, r2)     // Catch:{ all -> 0x01f3 }
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch:{ all -> 0x01f3 }
            r2.<init>(r3)     // Catch:{ all -> 0x01f3 }
            r7.setBounds(r5, r5, r8, r8)     // Catch:{ all -> 0x01f3 }
            r7.draw(r2)     // Catch:{ all -> 0x01f3 }
            android.graphics.drawable.BitmapDrawable r7 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x01f3 }
            r7.<init>(r3)     // Catch:{ all -> 0x01f3 }
            goto L_0x015e
        L_0x01c8:
            r6 = 0
        L_0x01c9:
            if (r6 == 0) goto L_0x01d5
            int r2 = r4.changingConfigurations     // Catch:{ all -> 0x01f3 }
            r6.setChangingConfigurations(r2)     // Catch:{ all -> 0x01f3 }
            r10.A04(r11, r6, r0)     // Catch:{ all -> 0x01f3 }
            goto L_0x01d5
        L_0x01d4:
            r6 = 0
        L_0x01d5:
            if (r6 != 0) goto L_0x01db
            android.graphics.drawable.Drawable r6 = X.C19740yt.A04(r11, r12)     // Catch:{ all -> 0x01f3 }
        L_0x01db:
            if (r6 == 0) goto L_0x01e1
            android.graphics.drawable.Drawable r6 = r10.A02(r11, r6, r12, r13)     // Catch:{ all -> 0x01f3 }
        L_0x01e1:
            if (r6 == 0) goto L_0x01e6
            X.C005902p.A02(r6)     // Catch:{ all -> 0x01f3 }
        L_0x01e6:
            monitor-exit(r10)
            return r6
        L_0x01e8:
            r0 = 0
            r10.A05 = r0     // Catch:{ all -> 0x01f3 }
            java.lang.String r1 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01f3 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f3 }
            throw r0     // Catch:{ all -> 0x01f3 }
        L_0x01f3:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02D.A0A(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter A00(PorterDuff.Mode mode, int i) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (AnonymousClass02D.class) {
            AnonymousClass02O r3 = A09;
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) r3.A04(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                r3.A08(Integer.valueOf(i2 + mode.hashCode()), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.0rS, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.0rS, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.0rS, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.0rS, java.lang.Object] */
    public static synchronized AnonymousClass02D A03() {
        AnonymousClass02D r0;
        synchronized (AnonymousClass02D.class) {
            if (A07 == null) {
                AnonymousClass02D r2 = new AnonymousClass02D();
                A07 = r2;
                if (Build.VERSION.SDK_INT < 24) {
                    r2.A06(new Object(), "vector");
                    r2.A06(new Object(), "animated-vector");
                    r2.A06(new Object(), "animated-selector");
                    r2.A06(new Object(), "drawable");
                }
            }
            r0 = A07;
        }
        return r0;
    }

    private void A06(C15940rS r3, String str) {
        AnonymousClass00O r1 = this.A02;
        if (r1 == null) {
            r1 = new AnonymousClass00O(0);
            this.A02 = r1;
        }
        r1.put(str, r3);
    }

    public static boolean A07(Drawable drawable) {
        if ((drawable instanceof C24291Jp) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00db, code lost:
        if (r10 == 2131230919) goto L_0x00c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable A02(android.content.Context r8, android.graphics.drawable.Drawable r9, int r10, boolean r11) {
        /*
            r7 = this;
            android.content.res.ColorStateList r1 = r7.A08(r8, r10)
            if (r1 == 0) goto L_0x0020
            android.graphics.drawable.Drawable r0 = r9.mutate()
            android.graphics.drawable.Drawable r9 = X.C27831Xu.A02(r0)
            X.C27831Xu.A03(r1, r9)
            X.02P r0 = r7.A01
            if (r0 == 0) goto L_0x001f
            r0 = 2131230965(0x7f0800f5, float:1.8077998E38)
            if (r10 != r0) goto L_0x001f
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            X.C27831Xu.A07(r0, r9)
        L_0x001f:
            return r9
        L_0x0020:
            X.02P r1 = r7.A01
            if (r1 == 0) goto L_0x011c
            r0 = 2131230960(0x7f0800f0, float:1.8077988E38)
            r3 = 16908301(0x102000d, float:2.3877265E-38)
            r2 = 16908303(0x102000f, float:2.387727E-38)
            r5 = 16908288(0x1020000, float:2.387723E-38)
            if (r10 != r0) goto L_0x0079
            r6 = r9
            android.graphics.drawable.LayerDrawable r6 = (android.graphics.drawable.LayerDrawable) r6
            android.graphics.drawable.Drawable r1 = r6.findDrawableByLayerId(r5)
            r0 = 2130969113(0x7f040219, float:1.7546899E38)
            r4 = 2130969113(0x7f040219, float:1.7546899E38)
            int r0 = X.AnonymousClass03T.A02(r8, r0)
            android.graphics.PorterDuff$Mode r5 = X.AnonymousClass01X.A02
            android.graphics.drawable.Drawable r1 = r1.mutate()
            android.graphics.PorterDuffColorFilter r0 = X.AnonymousClass01X.A00(r5, r0)
            r1.setColorFilter(r0)
            android.graphics.drawable.Drawable r1 = r6.findDrawableByLayerId(r2)
            int r0 = X.AnonymousClass03T.A02(r8, r4)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            android.graphics.PorterDuffColorFilter r0 = X.AnonymousClass01X.A00(r5, r0)
            r1.setColorFilter(r0)
            android.graphics.drawable.Drawable r1 = r6.findDrawableByLayerId(r3)
            r0 = 2130969111(0x7f040217, float:1.7546895E38)
            int r0 = X.AnonymousClass03T.A02(r8, r0)
        L_0x006d:
            android.graphics.drawable.Drawable r1 = r1.mutate()
            android.graphics.PorterDuffColorFilter r0 = X.AnonymousClass01X.A00(r5, r0)
            r1.setColorFilter(r0)
            return r9
        L_0x0079:
            r0 = 2131230951(0x7f0800e7, float:1.807797E38)
            if (r10 == r0) goto L_0x00de
            r0 = 2131230950(0x7f0800e6, float:1.8077967E38)
            if (r10 == r0) goto L_0x00de
            r0 = 2131230952(0x7f0800e8, float:1.8077971E38)
            if (r10 == r0) goto L_0x00de
            X.02Q r1 = (X.AnonymousClass02Q) r1
            android.graphics.PorterDuff$Mode r3 = X.AnonymousClass01X.A02
            int[] r0 = r1.A02
            boolean r0 = X.AnonymousClass02Q.A01(r0, r10)
            r2 = -1
            if (r0 == 0) goto L_0x00ae
            r0 = 2130969113(0x7f040219, float:1.7546899E38)
        L_0x0098:
            r4 = -1
        L_0x0099:
            android.graphics.drawable.Drawable r1 = r9.mutate()
            int r0 = X.AnonymousClass03T.A02(r8, r0)
            android.graphics.PorterDuffColorFilter r0 = X.AnonymousClass01X.A00(r3, r0)
            r1.setColorFilter(r0)
            if (r4 == r2) goto L_0x001f
            r1.setAlpha(r4)
            return r9
        L_0x00ae:
            int[] r0 = r1.A01
            boolean r0 = X.AnonymousClass02Q.A01(r0, r10)
            if (r0 == 0) goto L_0x00ba
            r0 = 2130969111(0x7f040217, float:1.7546895E38)
            goto L_0x0098
        L_0x00ba:
            int[] r0 = r1.A00
            boolean r0 = X.AnonymousClass02Q.A01(r0, r10)
            if (r0 == 0) goto L_0x00c8
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
        L_0x00c4:
            r0 = 16842801(0x1010031, float:2.3693695E-38)
            goto L_0x0098
        L_0x00c8:
            r0 = 2131230937(0x7f0800d9, float:1.807794E38)
            if (r10 != r0) goto L_0x00d8
            r0 = 1109603123(0x42233333, float:40.8)
            int r4 = java.lang.Math.round(r0)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            goto L_0x0099
        L_0x00d8:
            r0 = 2131230919(0x7f0800c7, float:1.8077904E38)
            if (r10 != r0) goto L_0x011c
            goto L_0x00c4
        L_0x00de:
            r4 = r9
            android.graphics.drawable.LayerDrawable r4 = (android.graphics.drawable.LayerDrawable) r4
            android.graphics.drawable.Drawable r1 = r4.findDrawableByLayerId(r5)
            r0 = 2130969113(0x7f040219, float:1.7546899E38)
            int r0 = X.AnonymousClass03T.A01(r8, r0)
            android.graphics.PorterDuff$Mode r5 = X.AnonymousClass01X.A02
            android.graphics.drawable.Drawable r1 = r1.mutate()
            android.graphics.PorterDuffColorFilter r0 = X.AnonymousClass01X.A00(r5, r0)
            r1.setColorFilter(r0)
            android.graphics.drawable.Drawable r1 = r4.findDrawableByLayerId(r2)
            r0 = 2130969111(0x7f040217, float:1.7546895E38)
            r2 = 2130969111(0x7f040217, float:1.7546895E38)
            int r0 = X.AnonymousClass03T.A02(r8, r0)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            android.graphics.PorterDuffColorFilter r0 = X.AnonymousClass01X.A00(r5, r0)
            r1.setColorFilter(r0)
            android.graphics.drawable.Drawable r1 = r4.findDrawableByLayerId(r3)
            int r0 = X.AnonymousClass03T.A02(r8, r2)
            goto L_0x006d
        L_0x011c:
            if (r11 == 0) goto L_0x001f
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02D.A02(android.content.Context, android.graphics.drawable.Drawable, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(android.graphics.drawable.Drawable r3, X.C007903o r4, int[] r5) {
        /*
            int[] r1 = r3.getState()
            android.graphics.drawable.Drawable r0 = r3.mutate()
            if (r0 != r3) goto L_0x0052
            boolean r0 = r3 instanceof android.graphics.drawable.LayerDrawable
            if (r0 == 0) goto L_0x001d
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L_0x001d
            r0 = 0
            int[] r0 = new int[r0]
            r3.setState(r0)
            r3.setState(r1)
        L_0x001d:
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x004f
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x004b
            r2 = 0
        L_0x0026:
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0048
            android.graphics.PorterDuff$Mode r1 = r4.A01
        L_0x002c:
            if (r2 == 0) goto L_0x0046
            if (r1 == 0) goto L_0x0046
            r0 = 0
            int r0 = r2.getColorForState(r5, r0)
            android.graphics.PorterDuffColorFilter r0 = A00(r1, r0)
        L_0x0039:
            r3.setColorFilter(r0)
        L_0x003c:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 > r0) goto L_0x0045
            r3.invalidateSelf()
        L_0x0045:
            return
        L_0x0046:
            r0 = 0
            goto L_0x0039
        L_0x0048:
            android.graphics.PorterDuff$Mode r1 = A08
            goto L_0x002c
        L_0x004b:
            r3.clearColorFilter()
            goto L_0x003c
        L_0x004f:
            android.content.res.ColorStateList r2 = r4.A00
            goto L_0x0026
        L_0x0052:
            java.lang.String r1 = "ResourceManagerInternal"
            java.lang.String r0 = "Mutated drawable is not the same instance as the input."
            android.util.Log.d(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02D.A05(android.graphics.drawable.Drawable, X.03o, int[]):void");
    }
}
