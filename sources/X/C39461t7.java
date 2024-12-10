package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: X.1t7  reason: invalid class name and case insensitive filesystem */
public abstract class C39461t7 {
    public boolean A00;
    public boolean A01;
    public final ViewGroup A02;
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();

    public static final C39461t7 A02(ViewGroup viewGroup, AnonymousClass1GP r4) {
        C18070vi.A0d(viewGroup, 0);
        C18070vi.A0X(r4.A0V());
        Object tag = viewGroup.getTag(2131435544);
        if (tag instanceof C39461t7) {
            return (C39461t7) tag;
        }
        C39461t7 r1 = new C39461t7(viewGroup);
        viewGroup.setTag(2131435544, r1);
        return r1;
    }

    public final void A08() {
        String str;
        String str2;
        if (AnonymousClass1GP.A0G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.A02;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        List list = this.A03;
        synchronized (list) {
            A03();
            A06(this, list);
            Iterator it = C29431cG.A0m(this.A04).iterator();
            while (it.hasNext()) {
                C39481t9 r4 = (C39481t9) it.next();
                if (AnonymousClass1GP.A0G(2)) {
                    if (isAttachedToWindow) {
                        str2 = "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append(viewGroup);
                        sb.append(" is not attached to window. ");
                        str2 = sb.toString();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(r4);
                    Log.v("FragmentManager", sb2.toString());
                }
                r4.A02(viewGroup);
            }
            Iterator it2 = new ArrayList(list).iterator();
            while (it2.hasNext()) {
                C39481t9 r42 = (C39481t9) it2.next();
                if (AnonymousClass1GP.A0G(2)) {
                    if (isAttachedToWindow) {
                        str = "";
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Container ");
                        sb3.append(viewGroup);
                        sb3.append(" is not attached to window. ");
                        str = sb3.toString();
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("SpecialEffectsController: ");
                    sb4.append(str);
                    sb4.append("Cancelling pending operation ");
                    sb4.append(r42);
                    Log.v("FragmentManager", sb4.toString());
                }
                r42.A02(viewGroup);
            }
        }
    }

    public final void A0A(C39481t9 r5) {
        C18070vi.A0d(r5, 0);
        if (r5.A02) {
            C41321wA.A01(r5.A07.A17(), this.A02, r5.A00);
            r5.A02 = false;
        }
    }

    public void A0B(List list) {
        C18070vi.A0d(list, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29401cD.A0J(((C39481t9) it.next()).A0B, arrayList);
        }
        List A0t = C29431cG.A0t(C29431cG.A12(arrayList));
        int size = A0t.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass2SF) A0t.get(i)).A05(this.A02);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            A0A((C39481t9) list.get(i2));
        }
        List A0t2 = C29431cG.A0t(list);
        int size3 = A0t2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C39481t9 r1 = (C39481t9) A0t2.get(i3);
            if (r1.A0B.isEmpty()) {
                r1.A01();
            }
        }
    }

    public static final C39481t9 A00(Fragment fragment, C39461t7 r5) {
        Object obj;
        Iterator it = r5.A03.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C39481t9 r1 = (C39481t9) obj;
            if (C18070vi.A18(r1.A07, fragment) && !r1.A03) {
                break;
            }
        }
        return (C39481t9) obj;
    }

    public static final C39481t9 A01(Fragment fragment, C39461t7 r5) {
        Object obj;
        Iterator it = r5.A04.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C39481t9 r1 = (C39481t9) obj;
            if (C18070vi.A18(r1.A07, fragment) && !r1.A03) {
                break;
            }
        }
        return (C39481t9) obj;
    }

    private final void A03() {
        for (C39481t9 r2 : this.A03) {
            if (r2.A01 == AnonymousClass00R.A01) {
                r2.A04(C39731tY.A00(r2.A07.A17().getVisibility()), AnonymousClass00R.A00);
            }
        }
    }

    public static final void A05(C35821mr r5, C39461t7 r6, Integer num, Integer num2) {
        List list = r6.A03;
        synchronized (list) {
            Fragment fragment = r5.A02;
            C39481t9 A002 = A00(fragment, r6);
            if (A002 != null || (fragment.A0m && (A002 = A01(fragment, r6)) != null)) {
                A002.A04(num, num2);
            } else {
                C39481t9 r3 = new C39481t9(r5, num, num2);
                list.add(r3);
                C448825d r0 = new C448825d(r6, r3, 1);
                List list2 = r3.A0A;
                list2.add(r0);
                list2.add(new C448825d(r6, r3, 2));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.1t9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: X.1t9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v62, resolved type: X.00O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: X.00P} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v87, resolved type: X.00P} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: X.1t9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: X.1t9} */
    /* JADX WARNING: type inference failed for: r7v7, types: [X.00O, X.00P, java.util.Map] */
    /* JADX WARNING: type inference failed for: r4v5, types: [X.00O, java.util.Map, X.00P] */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02be, code lost:
        if (r1 != null) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02c2, code lost:
        if (r3 == null) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c4, code lost:
        r3 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02c9, code lost:
        r16 = r3.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02d1, code lost:
        if (r2 >= r16) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02d3, code lost:
        r1 = r5.indexOf(r3.get(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02db, code lost:
        if (r1 == -1) goto L_0x02e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02dd, code lost:
        r5.set(r1, r6.get(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e4, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02e7, code lost:
        r1 = r15.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02e9, code lost:
        if (r1 == null) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02eb, code lost:
        r6 = r1.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02ed, code lost:
        if (r6 != null) goto L_0x02f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02ef, code lost:
        r6 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02f4, code lost:
        r14 = r5.size();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02f9, code lost:
        if (r3 >= r14) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02fb, code lost:
        r2 = r5.get(r3);
        X.C18070vi.A0X(r2);
        r1 = r6.get(r3);
        X.C18070vi.A0X(r1);
        r7.put(r2, r1);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0315, code lost:
        if (X.AnonymousClass1GP.A0G(2) == false) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0317, code lost:
        android.util.Log.v("FragmentManager", ">>> entering view names <<<");
        r16 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0326, code lost:
        if (r16.hasNext() == false) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0328, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Name: ");
        r1.append((java.lang.String) r16.next());
        android.util.Log.v("FragmentManager", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0341, code lost:
        android.util.Log.v("FragmentManager", ">>> exiting view names <<<");
        r16 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x034e, code lost:
        if (r16.hasNext() == false) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0350, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Name: ");
        r1.append((java.lang.String) r16.next());
        android.util.Log.v("FragmentManager", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0369, code lost:
        r2 = r24.A0B;
        X.C18070vi.A0W(r2);
        r1 = r1;
        A04(r2, r11, r1);
        r1.A0A(r5);
        r7.A0A(r1.keySet());
        r1 = r15.A0B;
        X.C18070vi.A0W(r1);
        A04(r1, r11, r4);
        r4.A0A(r6);
        r4.A0A(r7.values());
        r1 = X.C25431Cfd.A01;
        r2 = r7.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0397, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x039a, code lost:
        if (-1 >= r2) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03a4, code lost:
        if (r4.containsKey(r7.A06(r2)) != false) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03a6, code lost:
        r7.A05(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03aa, code lost:
        X.C29401cD.A0M(r1.entrySet(), new X.AnonymousClass3IA(r7.keySet()), false);
        X.C29401cD.A0M(r4.entrySet(), new X.AnonymousClass3IA(r7.values()), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03ce, code lost:
        if (r7.isEmpty() == false) goto L_0x0282;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x05b7  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x054b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
            r37 = this;
            r13 = r37
            boolean r0 = r13.A00
            if (r0 != 0) goto L_0x0014
            android.view.ViewGroup r4 = r13.A02
            boolean r0 = r4.isAttachedToWindow()
            r12 = 0
            if (r0 != 0) goto L_0x0015
            r13.A08()
            r13.A01 = r12
        L_0x0014:
            return
        L_0x0015:
            java.util.List r0 = r13.A03
            r22 = r0
            monitor-enter(r22)
            boolean r0 = r22.isEmpty()     // Catch:{ all -> 0x05e5 }
            r23 = 2
            if (r0 == 0) goto L_0x006b
            java.util.List r6 = r13.A04     // Catch:{ all -> 0x05e5 }
            java.util.ArrayList r0 = X.C29431cG.A0m(r6)     // Catch:{ all -> 0x05e5 }
            r6.clear()     // Catch:{ all -> 0x05e5 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x002f:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r0 == 0) goto L_0x05e3
            java.lang.Object r3 = r5.next()     // Catch:{ all -> 0x05e5 }
            X.1t9 r3 = (X.C39481t9) r3     // Catch:{ all -> 0x05e5 }
            boolean r0 = X.AnonymousClass1GP.A0G(r23)     // Catch:{ all -> 0x05e5 }
            if (r0 == 0) goto L_0x005c
            java.lang.String r2 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e5 }
            r1.<init>()     // Catch:{ all -> 0x05e5 }
            java.lang.String r0 = "SpecialEffectsController: Cancelling operation "
            r1.append(r0)     // Catch:{ all -> 0x05e5 }
            r1.append(r3)     // Catch:{ all -> 0x05e5 }
            java.lang.String r0 = " with no incoming pendingOperations"
            r1.append(r0)     // Catch:{ all -> 0x05e5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05e5 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x05e5 }
        L_0x005c:
            boolean r0 = r3.A03     // Catch:{ all -> 0x05e5 }
            if (r0 != 0) goto L_0x0063
            r3.A02(r4)     // Catch:{ all -> 0x05e5 }
        L_0x0063:
            boolean r0 = r3.A04     // Catch:{ all -> 0x05e5 }
            if (r0 != 0) goto L_0x002f
            r6.add(r3)     // Catch:{ all -> 0x05e5 }
            goto L_0x002f
        L_0x006b:
            java.util.List r3 = r13.A04     // Catch:{ all -> 0x05e5 }
            java.util.ArrayList r0 = X.C29431cG.A0m(r3)     // Catch:{ all -> 0x05e5 }
            r3.clear()     // Catch:{ all -> 0x05e5 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x0078:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x05e5 }
            X.1t9 r5 = (X.C39481t9) r5     // Catch:{ all -> 0x05e5 }
            boolean r0 = X.AnonymousClass1GP.A0G(r23)     // Catch:{ all -> 0x05e5 }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r2 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e5 }
            r1.<init>()     // Catch:{ all -> 0x05e5 }
            java.lang.String r0 = "SpecialEffectsController: Cancelling operation "
            r1.append(r0)     // Catch:{ all -> 0x05e5 }
            r1.append(r5)     // Catch:{ all -> 0x05e5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05e5 }
            android.util.Log.v(r2, r0)     // Catch:{ all -> 0x05e5 }
        L_0x00a0:
            androidx.fragment.app.Fragment r0 = r5.A07     // Catch:{ all -> 0x05e5 }
            boolean r1 = r0.A0m     // Catch:{ all -> 0x05e5 }
            boolean r0 = r5.A03     // Catch:{ all -> 0x05e5 }
            if (r0 != 0) goto L_0x00b0
            if (r1 == 0) goto L_0x00ad
            r0 = 1
            r5.A05 = r0     // Catch:{ all -> 0x05e5 }
        L_0x00ad:
            r5.A02(r4)     // Catch:{ all -> 0x05e5 }
        L_0x00b0:
            boolean r0 = r5.A04     // Catch:{ all -> 0x05e5 }
            if (r0 != 0) goto L_0x0078
            r3.add(r5)     // Catch:{ all -> 0x05e5 }
            goto L_0x0078
        L_0x00b8:
            r13.A03()     // Catch:{ all -> 0x05e5 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            r1 = r22
            r0.<init>(r1)     // Catch:{ all -> 0x05e5 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x05e5 }
            if (r1 != 0) goto L_0x05e3
            r22.clear()     // Catch:{ all -> 0x05e5 }
            r3.addAll(r0)     // Catch:{ all -> 0x05e5 }
            boolean r1 = X.AnonymousClass1GP.A0G(r23)     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x00db
            java.lang.String r2 = "FragmentManager"
            java.lang.String r1 = "SpecialEffectsController: Executing pending operations"
            android.util.Log.v(r2, r1)     // Catch:{ all -> 0x05e5 }
        L_0x00db:
            boolean r4 = r13.A01     // Catch:{ all -> 0x05e5 }
            r11 = r13
            X.1t8 r11 = (X.C39471t8) r11     // Catch:{ all -> 0x05e5 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x00e4:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x05e5 }
            r10 = 0
            if (r1 == 0) goto L_0x0134
            java.lang.Object r9 = r5.next()     // Catch:{ all -> 0x05e5 }
            r3 = r9
            X.1t9 r3 = (X.C39481t9) r3     // Catch:{ all -> 0x05e5 }
            X.1tY r2 = X.C41321wA.A00     // Catch:{ all -> 0x05e5 }
            androidx.fragment.app.Fragment r1 = r3.A07     // Catch:{ all -> 0x05e5 }
            android.view.View r1 = r1.A0B     // Catch:{ all -> 0x05e5 }
            X.C18070vi.A0W(r1)     // Catch:{ all -> 0x05e5 }
            java.lang.Integer r1 = r2.A01(r1)     // Catch:{ all -> 0x05e5 }
            java.lang.Integer r2 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x05e5 }
            if (r1 != r2) goto L_0x00e4
            java.lang.Integer r1 = r3.A00     // Catch:{ all -> 0x05e5 }
            if (r1 == r2) goto L_0x00e4
        L_0x0107:
            X.1t9 r9 = (X.C39481t9) r9     // Catch:{ all -> 0x05e5 }
            int r1 = r0.size()     // Catch:{ all -> 0x05e5 }
            java.util.ListIterator r6 = r0.listIterator(r1)     // Catch:{ all -> 0x05e5 }
        L_0x0111:
            boolean r1 = r6.hasPrevious()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x0137
            java.lang.Object r5 = r6.previous()     // Catch:{ all -> 0x05e5 }
            r3 = r5
            X.1t9 r3 = (X.C39481t9) r3     // Catch:{ all -> 0x05e5 }
            X.1tY r2 = X.C41321wA.A00     // Catch:{ all -> 0x05e5 }
            androidx.fragment.app.Fragment r1 = r3.A07     // Catch:{ all -> 0x05e5 }
            android.view.View r1 = r1.A0B     // Catch:{ all -> 0x05e5 }
            X.C18070vi.A0W(r1)     // Catch:{ all -> 0x05e5 }
            java.lang.Integer r1 = r2.A01(r1)     // Catch:{ all -> 0x05e5 }
            java.lang.Integer r2 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x05e5 }
            if (r1 == r2) goto L_0x0111
            java.lang.Integer r1 = r3.A00     // Catch:{ all -> 0x05e5 }
            if (r1 != r2) goto L_0x0111
            goto L_0x0136
        L_0x0134:
            r9 = r10
            goto L_0x0107
        L_0x0136:
            r10 = r5
        L_0x0137:
            X.1t9 r10 = (X.C39481t9) r10     // Catch:{ all -> 0x05e5 }
            boolean r1 = X.AnonymousClass1GP.A0G(r23)     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x015d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e5 }
            r2.<init>()     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = "Executing operations from "
            r2.append(r1)     // Catch:{ all -> 0x05e5 }
            r2.append(r9)     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = " to "
            r2.append(r1)     // Catch:{ all -> 0x05e5 }
            r2.append(r10)     // Catch:{ all -> 0x05e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r2)     // Catch:{ all -> 0x05e5 }
        L_0x015d:
            java.util.ArrayList r21 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            r21.<init>()     // Catch:{ all -> 0x05e5 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            r5.<init>()     // Catch:{ all -> 0x05e5 }
            java.lang.Object r1 = X.C29431cG.A0d(r0)     // Catch:{ all -> 0x05e5 }
            X.1t9 r1 = (X.C39481t9) r1     // Catch:{ all -> 0x05e5 }
            androidx.fragment.app.Fragment r6 = r1.A07     // Catch:{ all -> 0x05e5 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x0173:
            boolean r1 = r7.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x0196
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x05e5 }
            X.1t9 r1 = (X.C39481t9) r1     // Catch:{ all -> 0x05e5 }
            androidx.fragment.app.Fragment r1 = r1.A07     // Catch:{ all -> 0x05e5 }
            X.1mt r3 = r1.A0D     // Catch:{ all -> 0x05e5 }
            X.1mt r2 = r6.A0D     // Catch:{ all -> 0x05e5 }
            int r1 = r2.A01     // Catch:{ all -> 0x05e5 }
            r3.A01 = r1     // Catch:{ all -> 0x05e5 }
            int r1 = r2.A02     // Catch:{ all -> 0x05e5 }
            r3.A02 = r1     // Catch:{ all -> 0x05e5 }
            int r1 = r2.A04     // Catch:{ all -> 0x05e5 }
            r3.A04 = r1     // Catch:{ all -> 0x05e5 }
            int r1 = r2.A05     // Catch:{ all -> 0x05e5 }
            r3.A05 = r1     // Catch:{ all -> 0x05e5 }
            goto L_0x0173
        L_0x0196:
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x019a:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x01cd
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x05e5 }
            X.1t9 r3 = (X.C39481t9) r3     // Catch:{ all -> 0x05e5 }
            X.1wC r2 = new X.1wC     // Catch:{ all -> 0x05e5 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x05e5 }
            r1 = r21
            r1.add(r2)     // Catch:{ all -> 0x05e5 }
            r2 = 1
            if (r4 == 0) goto L_0x01b6
            if (r3 != r9) goto L_0x01b9
            goto L_0x01ba
        L_0x01b6:
            if (r3 != r10) goto L_0x01b9
            goto L_0x01ba
        L_0x01b9:
            r2 = 0
        L_0x01ba:
            X.1wD r1 = new X.1wD     // Catch:{ all -> 0x05e5 }
            r1.<init>(r3, r4, r2)     // Catch:{ all -> 0x05e5 }
            r5.add(r1)     // Catch:{ all -> 0x05e5 }
            X.25d r2 = new X.25d     // Catch:{ all -> 0x05e5 }
            r2.<init>(r11, r3, r12)     // Catch:{ all -> 0x05e5 }
            java.util.List r1 = r3.A0A     // Catch:{ all -> 0x05e5 }
            r1.add(r2)     // Catch:{ all -> 0x05e5 }
            goto L_0x019a
        L_0x01cd:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            r4.<init>()     // Catch:{ all -> 0x05e5 }
            java.util.Iterator r3 = r5.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x01d6:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x01ed
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x05e5 }
            r1 = r2
            X.1wB r1 = (X.C41331wB) r1     // Catch:{ all -> 0x05e5 }
            boolean r1 = r1.A01()     // Catch:{ all -> 0x05e5 }
            if (r1 != 0) goto L_0x01d6
            r4.add(r2)     // Catch:{ all -> 0x05e5 }
            goto L_0x01d6
        L_0x01ed:
            java.util.ArrayList r20 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            r20.<init>()     // Catch:{ all -> 0x05e5 }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x01f6:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x020f
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x05e5 }
            r1 = r2
            X.1wD r1 = (X.C41351wD) r1     // Catch:{ all -> 0x05e5 }
            X.Cmw r1 = r1.A02()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x01f6
            r1 = r20
            r1.add(r2)     // Catch:{ all -> 0x05e5 }
            goto L_0x01f6
        L_0x020f:
            java.util.Iterator r3 = r20.iterator()     // Catch:{ all -> 0x05e5 }
            r8 = 0
        L_0x0214:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x0255
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x05e5 }
            X.1wD r2 = (X.C41351wD) r2     // Catch:{ all -> 0x05e5 }
            X.Cmw r1 = r2.A02()     // Catch:{ all -> 0x05e5 }
            if (r8 == 0) goto L_0x0229
            if (r1 == r8) goto L_0x0229
            goto L_0x022b
        L_0x0229:
            r8 = r1
            goto L_0x0214
        L_0x022b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e5 }
            r1.<init>()     // Catch:{ all -> 0x05e5 }
            java.lang.String r0 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            r1.append(r0)     // Catch:{ all -> 0x05e5 }
            X.1t9 r0 = r2.A00     // Catch:{ all -> 0x05e5 }
            androidx.fragment.app.Fragment r0 = r0.A07     // Catch:{ all -> 0x05e5 }
            r1.append(r0)     // Catch:{ all -> 0x05e5 }
            java.lang.String r0 = " returned Transition "
            r1.append(r0)     // Catch:{ all -> 0x05e5 }
            java.lang.Object r0 = r2.A01     // Catch:{ all -> 0x05e5 }
            r1.append(r0)     // Catch:{ all -> 0x05e5 }
            java.lang.String r0 = " which uses a different Transition type than other Fragments."
            r1.append(r0)     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x05e5 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x05e5 }
            r0.<init>(r1)     // Catch:{ all -> 0x05e5 }
            throw r0     // Catch:{ all -> 0x05e5 }
        L_0x0255:
            if (r8 == 0) goto L_0x0411
            java.util.ArrayList r32 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            r32.<init>()     // Catch:{ all -> 0x05e5 }
            java.util.ArrayList r33 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            r33.<init>()     // Catch:{ all -> 0x05e5 }
            X.00P r7 = new X.00P     // Catch:{ all -> 0x05e5 }
            r7.<init>(r12)     // Catch:{ all -> 0x05e5 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            r6.<init>()     // Catch:{ all -> 0x05e5 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            r5.<init>()     // Catch:{ all -> 0x05e5 }
            X.00P r19 = new X.00P     // Catch:{ all -> 0x05e5 }
            r1 = r19
            r1.<init>(r12)     // Catch:{ all -> 0x05e5 }
            X.00P r4 = new X.00P     // Catch:{ all -> 0x05e5 }
            r4.<init>(r12)     // Catch:{ all -> 0x05e5 }
            java.util.Iterator r18 = r20.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x0280:
            r17 = 0
        L_0x0282:
            boolean r1 = r18.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x0403
            java.lang.Object r1 = r18.next()     // Catch:{ all -> 0x05e5 }
            X.1wD r1 = (X.C41351wD) r1     // Catch:{ all -> 0x05e5 }
            java.lang.Object r1 = r1.A00     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x0282
            if (r9 == 0) goto L_0x0282
            if (r10 == 0) goto L_0x0282
            java.lang.Object r1 = r8.A03(r1)     // Catch:{ all -> 0x05e5 }
            java.lang.Object r17 = r8.A04(r1)     // Catch:{ all -> 0x05e5 }
            androidx.fragment.app.Fragment r15 = r10.A07     // Catch:{ all -> 0x05e5 }
            X.1mt r1 = r15.A0D     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x02a8
            java.util.ArrayList r5 = r1.A0C     // Catch:{ all -> 0x05e5 }
            if (r5 != 0) goto L_0x02ad
        L_0x02a8:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            r5.<init>()     // Catch:{ all -> 0x05e5 }
        L_0x02ad:
            androidx.fragment.app.Fragment r1 = r9.A07     // Catch:{ all -> 0x05e5 }
            r24 = r1
            X.1mt r1 = r1.A0D     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x02b9
            java.util.ArrayList r6 = r1.A0C     // Catch:{ all -> 0x05e5 }
            if (r6 != 0) goto L_0x02c0
        L_0x02b9:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            r6.<init>()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x02c4
        L_0x02c0:
            java.util.ArrayList r3 = r1.A0D     // Catch:{ all -> 0x05e5 }
            if (r3 != 0) goto L_0x02c9
        L_0x02c4:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            r3.<init>()     // Catch:{ all -> 0x05e5 }
        L_0x02c9:
            int r16 = r3.size()     // Catch:{ all -> 0x05e5 }
            r2 = 0
        L_0x02ce:
            r14 = -1
            r1 = r16
            if (r2 >= r1) goto L_0x02e7
            java.lang.Object r1 = r3.get(r2)     // Catch:{ all -> 0x05e5 }
            int r1 = r5.indexOf(r1)     // Catch:{ all -> 0x05e5 }
            if (r1 == r14) goto L_0x02e4
            java.lang.Object r14 = r6.get(r2)     // Catch:{ all -> 0x05e5 }
            r5.set(r1, r14)     // Catch:{ all -> 0x05e5 }
        L_0x02e4:
            int r2 = r2 + 1
            goto L_0x02ce
        L_0x02e7:
            X.1mt r1 = r15.A0D     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x02ef
            java.util.ArrayList r6 = r1.A0D     // Catch:{ all -> 0x05e5 }
            if (r6 != 0) goto L_0x02f4
        L_0x02ef:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            r6.<init>()     // Catch:{ all -> 0x05e5 }
        L_0x02f4:
            int r14 = r5.size()     // Catch:{ all -> 0x05e5 }
            r3 = 0
        L_0x02f9:
            if (r3 >= r14) goto L_0x030f
            java.lang.Object r2 = r5.get(r3)     // Catch:{ all -> 0x05e5 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x05e5 }
            java.lang.Object r1 = r6.get(r3)     // Catch:{ all -> 0x05e5 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x05e5 }
            r7.put(r2, r1)     // Catch:{ all -> 0x05e5 }
            int r3 = r3 + 1
            goto L_0x02f9
        L_0x030f:
            boolean r1 = X.AnonymousClass1GP.A0G(r23)     // Catch:{ all -> 0x05e5 }
            java.lang.String r3 = "FragmentManager"
            if (r1 == 0) goto L_0x0369
            java.lang.String r1 = ">>> entering view names <<<"
            android.util.Log.v(r3, r1)     // Catch:{ all -> 0x05e5 }
            java.util.Iterator r16 = r6.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x0320:
            boolean r1 = r16.hasNext()     // Catch:{ all -> 0x05e5 }
            java.lang.String r14 = "Name: "
            if (r1 == 0) goto L_0x0341
            java.lang.Object r2 = r16.next()     // Catch:{ all -> 0x05e5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x05e5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e5 }
            r1.<init>()     // Catch:{ all -> 0x05e5 }
            r1.append(r14)     // Catch:{ all -> 0x05e5 }
            r1.append(r2)     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x05e5 }
            android.util.Log.v(r3, r1)     // Catch:{ all -> 0x05e5 }
            goto L_0x0320
        L_0x0341:
            java.lang.String r1 = ">>> exiting view names <<<"
            android.util.Log.v(r3, r1)     // Catch:{ all -> 0x05e5 }
            java.util.Iterator r16 = r5.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x034a:
            boolean r1 = r16.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x0369
            java.lang.Object r2 = r16.next()     // Catch:{ all -> 0x05e5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x05e5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e5 }
            r1.<init>()     // Catch:{ all -> 0x05e5 }
            r1.append(r14)     // Catch:{ all -> 0x05e5 }
            r1.append(r2)     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x05e5 }
            android.util.Log.v(r3, r1)     // Catch:{ all -> 0x05e5 }
            goto L_0x034a
        L_0x0369:
            r1 = r24
            android.view.View r2 = r1.A0B     // Catch:{ all -> 0x05e5 }
            X.C18070vi.A0W(r2)     // Catch:{ all -> 0x05e5 }
            r1 = r19
            A04(r2, r11, r1)     // Catch:{ all -> 0x05e5 }
            r1.A0A(r5)     // Catch:{ all -> 0x05e5 }
            java.util.Set r1 = r19.keySet()     // Catch:{ all -> 0x05e5 }
            r7.A0A(r1)     // Catch:{ all -> 0x05e5 }
            android.view.View r1 = r15.A0B     // Catch:{ all -> 0x05e5 }
            X.C18070vi.A0W(r1)     // Catch:{ all -> 0x05e5 }
            A04(r1, r11, r4)     // Catch:{ all -> 0x05e5 }
            r4.A0A(r6)     // Catch:{ all -> 0x05e5 }
            java.util.Collection r1 = r7.values()     // Catch:{ all -> 0x05e5 }
            r4.A0A(r1)     // Catch:{ all -> 0x05e5 }
            X.Cmw r1 = X.C25431Cfd.A01     // Catch:{ all -> 0x05e5 }
            int r2 = r7.size()     // Catch:{ all -> 0x05e5 }
        L_0x0397:
            int r2 = r2 + -1
            r1 = -1
            if (r1 >= r2) goto L_0x03aa
            java.lang.Object r1 = r7.A06(r2)     // Catch:{ all -> 0x05e5 }
            boolean r1 = r4.containsKey(r1)     // Catch:{ all -> 0x05e5 }
            if (r1 != 0) goto L_0x0397
            r7.A05(r2)     // Catch:{ all -> 0x05e5 }
            goto L_0x0397
        L_0x03aa:
            java.util.Set r14 = r7.keySet()     // Catch:{ all -> 0x05e5 }
            java.util.Set r2 = r19.entrySet()     // Catch:{ all -> 0x05e5 }
            X.3IA r1 = new X.3IA     // Catch:{ all -> 0x05e5 }
            r1.<init>(r14)     // Catch:{ all -> 0x05e5 }
            X.C29401cD.A0M(r2, r1, r12)     // Catch:{ all -> 0x05e5 }
            java.util.Collection r14 = r7.values()     // Catch:{ all -> 0x05e5 }
            java.util.Set r2 = r4.entrySet()     // Catch:{ all -> 0x05e5 }
            X.3IA r1 = new X.3IA     // Catch:{ all -> 0x05e5 }
            r1.<init>(r14)     // Catch:{ all -> 0x05e5 }
            X.C29401cD.A0M(r2, r1, r12)     // Catch:{ all -> 0x05e5 }
            boolean r1 = r7.isEmpty()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x0282
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e5 }
            r2.<init>()     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = "Ignoring shared elements transition "
            r2.append(r1)     // Catch:{ all -> 0x05e5 }
            r1 = r17
            r2.append(r1)     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = " between "
            r2.append(r1)     // Catch:{ all -> 0x05e5 }
            r2.append(r9)     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = " and "
            r2.append(r1)     // Catch:{ all -> 0x05e5 }
            r2.append(r10)     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element."
            r2.append(r1)     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x05e5 }
            android.util.Log.i(r3, r1)     // Catch:{ all -> 0x05e5 }
            r32.clear()     // Catch:{ all -> 0x05e5 }
            r33.clear()     // Catch:{ all -> 0x05e5 }
            goto L_0x0280
        L_0x0403:
            if (r17 != 0) goto L_0x0448
            r1 = r20
            boolean r1 = r1 instanceof java.util.Collection     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x0433
            boolean r1 = r20.isEmpty()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x0433
        L_0x0411:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            r3.<init>()     // Catch:{ all -> 0x05e5 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            r4.<init>()     // Catch:{ all -> 0x05e5 }
            java.util.Iterator r2 = r21.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x041f:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x047b
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x05e5 }
            X.1wB r1 = (X.C41331wB) r1     // Catch:{ all -> 0x05e5 }
            X.1t9 r1 = r1.A00     // Catch:{ all -> 0x05e5 }
            java.util.List r1 = r1.A0B     // Catch:{ all -> 0x05e5 }
            X.C29401cD.A0J(r1, r4)     // Catch:{ all -> 0x05e5 }
            goto L_0x041f
        L_0x0433:
            java.util.Iterator r2 = r20.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x0437:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x0411
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x05e5 }
            X.1wD r1 = (X.C41351wD) r1     // Catch:{ all -> 0x05e5 }
            java.lang.Object r1 = r1.A01     // Catch:{ all -> 0x05e5 }
            if (r1 != 0) goto L_0x0448
            goto L_0x0437
        L_0x0448:
            X.BLW r2 = new X.BLW     // Catch:{ all -> 0x05e5 }
            r24 = r2
            r25 = r7
            r26 = r19
            r27 = r4
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r17
            r34 = r6
            r35 = r5
            r36 = r20
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x05e5 }
            java.util.Iterator r3 = r20.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x0467:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x0411
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x05e5 }
            X.1wB r1 = (X.C41331wB) r1     // Catch:{ all -> 0x05e5 }
            X.1t9 r1 = r1.A00     // Catch:{ all -> 0x05e5 }
            java.util.List r1 = r1.A09     // Catch:{ all -> 0x05e5 }
            r1.add(r2)     // Catch:{ all -> 0x05e5 }
            goto L_0x0467
        L_0x047b:
            boolean r1 = r4.isEmpty()     // Catch:{ all -> 0x05e5 }
            r10 = r1 ^ 1
            java.util.Iterator r9 = r21.iterator()     // Catch:{ all -> 0x05e5 }
            r8 = 0
        L_0x0486:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x05e5 }
            java.lang.String r4 = "FragmentManager"
            if (r1 == 0) goto L_0x04ed
            java.lang.Object r7 = r9.next()     // Catch:{ all -> 0x05e5 }
            X.1wC r7 = (X.C41341wC) r7     // Catch:{ all -> 0x05e5 }
            android.view.ViewGroup r1 = r11.A02     // Catch:{ all -> 0x05e5 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x05e5 }
            X.1t9 r6 = r7.A00     // Catch:{ all -> 0x05e5 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x05e5 }
            X.ChG r1 = r7.A02(r1)     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x0486
            android.animation.AnimatorSet r1 = r1.A00     // Catch:{ all -> 0x05e5 }
            if (r1 != 0) goto L_0x04ad
            r3.add(r7)     // Catch:{ all -> 0x05e5 }
            goto L_0x0486
        L_0x04ad:
            androidx.fragment.app.Fragment r5 = r6.A07     // Catch:{ all -> 0x05e5 }
            java.util.List r1 = r6.A0B     // Catch:{ all -> 0x05e5 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x05e5 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x04d9
            boolean r1 = X.AnonymousClass1GP.A0G(r23)     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x0486
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e5 }
            r2.<init>()     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = "Ignoring Animator set on "
            r2.append(r1)     // Catch:{ all -> 0x05e5 }
            r2.append(r5)     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = " as this Fragment was involved in a Transition."
            r2.append(r1)     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x05e5 }
            android.util.Log.v(r4, r1)     // Catch:{ all -> 0x05e5 }
            goto L_0x0486
        L_0x04d9:
            java.lang.Integer r2 = r6.A00     // Catch:{ all -> 0x05e5 }
            java.lang.Integer r1 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x05e5 }
            if (r2 != r1) goto L_0x04e1
            r6.A02 = r12     // Catch:{ all -> 0x05e5 }
        L_0x04e1:
            X.BLV r2 = new X.BLV     // Catch:{ all -> 0x05e5 }
            r2.<init>(r7)     // Catch:{ all -> 0x05e5 }
            java.util.List r1 = r6.A09     // Catch:{ all -> 0x05e5 }
            r1.add(r2)     // Catch:{ all -> 0x05e5 }
            r8 = 1
            goto L_0x0486
        L_0x04ed:
            java.util.Iterator r7 = r3.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x04f1:
            boolean r1 = r7.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x0544
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x05e5 }
            X.1wC r6 = (X.C41341wC) r6     // Catch:{ all -> 0x05e5 }
            X.1t9 r1 = r6.A00     // Catch:{ all -> 0x05e5 }
            androidx.fragment.app.Fragment r5 = r1.A07     // Catch:{ all -> 0x05e5 }
            java.lang.String r3 = "Ignoring Animation set on "
            if (r10 == 0) goto L_0x0523
            boolean r1 = X.AnonymousClass1GP.A0G(r23)     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x04f1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e5 }
            r2.<init>()     // Catch:{ all -> 0x05e5 }
            r2.append(r3)     // Catch:{ all -> 0x05e5 }
            r2.append(r5)     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = " as Animations cannot run alongside Transitions."
        L_0x0518:
            r2.append(r1)     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x05e5 }
            android.util.Log.v(r4, r1)     // Catch:{ all -> 0x05e5 }
            goto L_0x04f1
        L_0x0523:
            if (r8 == 0) goto L_0x0539
            boolean r1 = X.AnonymousClass1GP.A0G(r23)     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x04f1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e5 }
            r2.<init>()     // Catch:{ all -> 0x05e5 }
            r2.append(r3)     // Catch:{ all -> 0x05e5 }
            r2.append(r5)     // Catch:{ all -> 0x05e5 }
            java.lang.String r1 = " as Animations cannot run alongside Animators."
            goto L_0x0518
        L_0x0539:
            X.BLU r2 = new X.BLU     // Catch:{ all -> 0x05e5 }
            r2.<init>(r6)     // Catch:{ all -> 0x05e5 }
            java.util.List r1 = r1.A09     // Catch:{ all -> 0x05e5 }
            r1.add(r2)     // Catch:{ all -> 0x05e5 }
            goto L_0x04f1
        L_0x0544:
            r7 = 1
            r2 = 1
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x05e5 }
            r5 = 1
        L_0x054b:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x058e
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x05e5 }
            X.1t9 r3 = (X.C39481t9) r3     // Catch:{ all -> 0x05e5 }
            java.util.List r2 = r3.A0B     // Catch:{ all -> 0x05e5 }
            boolean r1 = r2.isEmpty()     // Catch:{ all -> 0x05e5 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0585
            boolean r1 = r2 instanceof java.util.Collection     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x056c
            boolean r1 = r2.isEmpty()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x056c
            goto L_0x0583
        L_0x056c:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x0570:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x0583
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x05e5 }
            X.2SF r1 = (X.AnonymousClass2SF) r1     // Catch:{ all -> 0x05e5 }
            boolean r1 = r1.A06()     // Catch:{ all -> 0x05e5 }
            if (r1 != 0) goto L_0x0570
            goto L_0x0585
        L_0x0583:
            r2 = 1
            goto L_0x0586
        L_0x0585:
            r2 = 0
        L_0x0586:
            androidx.fragment.app.Fragment r1 = r3.A07     // Catch:{ all -> 0x05e5 }
            boolean r1 = r1.A0m     // Catch:{ all -> 0x05e5 }
            if (r1 != 0) goto L_0x054b
            r5 = 0
            goto L_0x054b
        L_0x058e:
            if (r2 == 0) goto L_0x05b4
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x05e5 }
            r3.<init>()     // Catch:{ all -> 0x05e5 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x05e5 }
        L_0x0599:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x05e5 }
            if (r1 == 0) goto L_0x05ab
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x05e5 }
            X.1t9 r1 = (X.C39481t9) r1     // Catch:{ all -> 0x05e5 }
            java.util.List r1 = r1.A0B     // Catch:{ all -> 0x05e5 }
            X.C29401cD.A0J(r1, r3)     // Catch:{ all -> 0x05e5 }
            goto L_0x0599
        L_0x05ab:
            boolean r1 = r3.isEmpty()     // Catch:{ all -> 0x05e5 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x05b4
            goto L_0x05b5
        L_0x05b4:
            r7 = 0
        L_0x05b5:
            if (r5 != 0) goto L_0x05b8
            goto L_0x05d0
        L_0x05b8:
            if (r7 == 0) goto L_0x05d6
            A06(r13, r0)     // Catch:{ all -> 0x05e5 }
            int r3 = r0.size()     // Catch:{ all -> 0x05e5 }
            r2 = 0
        L_0x05c2:
            if (r2 >= r3) goto L_0x05d6
            java.lang.Object r1 = r0.get(r2)     // Catch:{ all -> 0x05e5 }
            X.1t9 r1 = (X.C39481t9) r1     // Catch:{ all -> 0x05e5 }
            r13.A0A(r1)     // Catch:{ all -> 0x05e5 }
            int r2 = r2 + 1
            goto L_0x05c2
        L_0x05d0:
            A06(r13, r0)     // Catch:{ all -> 0x05e5 }
            r13.A0B(r0)     // Catch:{ all -> 0x05e5 }
        L_0x05d6:
            r13.A01 = r12     // Catch:{ all -> 0x05e5 }
            boolean r0 = X.AnonymousClass1GP.A0G(r23)     // Catch:{ all -> 0x05e5 }
            if (r0 == 0) goto L_0x05e3
            java.lang.String r0 = "SpecialEffectsController: Finished executing pending operations"
            android.util.Log.v(r4, r0)     // Catch:{ all -> 0x05e5 }
        L_0x05e3:
            monitor-exit(r22)
            return
        L_0x05e5:
            r0 = move-exception
            monitor-exit(r22)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39461t7.A07():void");
    }

    public final void A09() {
        Object obj;
        boolean z;
        C35841mt r0;
        List list = this.A03;
        synchronized (list) {
            A03();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                obj = null;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                obj = listIterator.previous();
                C39481t9 r3 = (C39481t9) obj;
                C39731tY r1 = C41321wA.A00;
                View view = r3.A07.A0B;
                C18070vi.A0W(view);
                Integer A012 = r1.A01(view);
                Integer num = r3.A00;
                Integer num2 = AnonymousClass00R.A01;
                if (num == num2 && A012 != num2) {
                    break;
                }
            }
            C39481t9 r4 = (C39481t9) obj;
            if (r4 == null || (r0 = r4.A07.A0D) == null) {
                z = false;
            } else {
                z = r0.A0E;
            }
            this.A00 = z;
        }
    }

    public C39461t7(ViewGroup viewGroup) {
        this.A02 = viewGroup;
    }

    public static final void A04(View view, C39471t8 r5, Map map) {
        String A022 = AnonymousClass1Xr.A02(view);
        if (A022 != null) {
            map.put(A022, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    A04(childAt, r5, map);
                }
            }
        }
    }

    public static final void A06(C39461t7 r11, List list) {
        float f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C39481t9 r2 = (C39481t9) list.get(i);
            if (!r2.A06) {
                r2.A06 = true;
                Integer num = r2.A01;
                if (num == AnonymousClass00R.A01) {
                    C35821mr r9 = r2.A08;
                    Fragment fragment = r9.A02;
                    View findFocus = fragment.A0B.findFocus();
                    if (findFocus != null) {
                        Fragment.A0K(fragment).A06 = findFocus;
                        if (AnonymousClass1GP.A0G(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("requestFocus: Saved focused view ");
                            sb.append(findFocus);
                            sb.append(" for Fragment ");
                            sb.append(fragment);
                            Log.v("FragmentManager", sb.toString());
                        }
                    }
                    View A17 = r2.A07.A17();
                    if (A17.getParent() == null) {
                        r9.A01();
                        A17.setAlpha(0.0f);
                    }
                    if (A17.getAlpha() == 0.0f && A17.getVisibility() == 0) {
                        A17.setVisibility(4);
                    }
                    C35841mt r0 = fragment.A0D;
                    if (r0 == null) {
                        f = 1.0f;
                    } else {
                        f = r0.A00;
                    }
                    A17.setAlpha(f);
                } else if (num == AnonymousClass00R.A0C) {
                    Fragment fragment2 = r2.A08.A02;
                    View A172 = fragment2.A17();
                    if (AnonymousClass1GP.A0G(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Clearing focus ");
                        sb2.append(A172.findFocus());
                        sb2.append(" on view ");
                        sb2.append(A172);
                        sb2.append(" for Fragment ");
                        sb2.append(fragment2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    A172.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29401cD.A0J(((C39481t9) it.next()).A0B, arrayList);
        }
        List A0t = C29431cG.A0t(C29431cG.A12(arrayList));
        int size2 = A0t.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AnonymousClass2SF r22 = (AnonymousClass2SF) A0t.get(i2);
            ViewGroup viewGroup = r11.A02;
            if (!r22.A01) {
                r22.A03(viewGroup);
            }
            r22.A01 = true;
        }
    }
}
