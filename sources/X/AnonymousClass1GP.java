package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1GP  reason: invalid class name */
public abstract class AnonymousClass1GP {
    public int A00 = -1;
    public AnonymousClass02V A01;
    public AnonymousClass02n A02;
    public AnonymousClass02n A03;
    public AnonymousClass02n A04;
    public C34001jj A05 = null;
    public Fragment A06;
    public Fragment A07;
    public AnonymousClass1GO A08;
    public AnonymousClass1GM A09;
    public AnonymousClass1JL A0A;
    public Runnable A0B = new C449025f((Object) this, 3);
    public ArrayDeque A0C = new ArrayDeque();
    public ArrayList A0D = new ArrayList();
    public ArrayList A0E = new ArrayList();
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public AnonymousClass1GY A0L = new AnonymousClass1GY(this);
    public AnonymousClass1GZ A0M = new C23431Ga(this);
    public ArrayList A0N;
    public ArrayList A0O;
    public ArrayList A0P;
    public ArrayList A0Q;
    public final AnonymousClass01T A0R = new AnonymousClass1GT(this);
    public final AnonymousClass1GS A0S = new AnonymousClass1GS(this);
    public final AnonymousClass1GU A0T = new AnonymousClass1GU(this);
    public final AnonymousClass1GR A0U = new AnonymousClass1GR();
    public final ArrayList A0V = new ArrayList();
    public final Map A0W = Collections.synchronizedMap(new HashMap());
    public final Map A0X = Collections.synchronizedMap(new HashMap());
    public final Map A0Y = Collections.synchronizedMap(new HashMap());
    public final CopyOnWriteArrayList A0Z = new CopyOnWriteArrayList();
    public final AtomicInteger A0a = new AtomicInteger();
    public final AnonymousClass1GV A0b = new C64892vV(this, 2);
    public final AnonymousClass1GV A0c = new C64892vV(this, 4);
    public final AnonymousClass1GV A0d = new C64892vV(this, 5);
    public final AnonymousClass1GV A0e = new C64892vV(this, 3);
    public final AnonymousClass1GW A0f = new AnonymousClass1GX(this);

    private void A03() {
        this.A0G = false;
        this.A0P.clear();
        this.A0Q.clear();
    }

    public static void A07(Fragment fragment) {
        if (A0G(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.A0c) {
            fragment.A0c = false;
            fragment.A0d = !fragment.A0d;
        }
    }

    /* JADX INFO: finally extract failed */
    public static void A0B(AnonymousClass1GP r4, int i) {
        try {
            r4.A0G = true;
            for (C35821mr r0 : r4.A0U.A02.values()) {
                if (r0 != null) {
                    r0.A00 = i;
                }
            }
            r4.A0d(i, false);
            Iterator it = r4.A01().iterator();
            while (it.hasNext()) {
                ((C39461t7) it.next()).A08();
            }
            r4.A0G = false;
            r4.A0y(true);
        } catch (Throwable th) {
            r4.A0G = false;
            throw th;
        }
    }

    public static boolean A0J(AnonymousClass1GP r8, String str) {
        AnonymousClass1GP r4 = r8;
        r8.A0y(false);
        r8.A0F(true);
        Fragment fragment = r8.A07;
        String str2 = str;
        if (fragment != null && str == null && A0J(fragment.A1E(), (String) null)) {
            return true;
        }
        ArrayList arrayList = r4.A0Q;
        ArrayList arrayList2 = r4.A0P;
        boolean A15 = r4.A15(str2, arrayList, arrayList2, -1, 0);
        if (A15) {
            r4.A0G = true;
            try {
                r4.A0D(arrayList, arrayList2);
            } finally {
                r4.A03();
            }
        }
        A0A(r4);
        if (r4.A0H) {
            r4.A0H = false;
            r4.A05();
        }
        r4.A0U.A02.values().removeAll(Collections.singleton((Object) null));
        return A15;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0X() {
        /*
            r5 = this;
            r0 = 1
            r5.A0F = r0
            r5.A0y(r0)
            A09(r5)
            X.1GO r1 = r5.A08
            boolean r0 = r1 instanceof X.AnonymousClass1FD
            if (r0 == 0) goto L_0x0048
            X.1GR r0 = r5.A0U
            X.1JL r0 = r0.A00
            boolean r0 = r0.A00
        L_0x0015:
            if (r0 == 0) goto L_0x0057
        L_0x0017:
            java.util.Map r0 = r5.A0W
            java.util.Collection r0 = r0.values()
            java.util.Iterator r4 = r0.iterator()
        L_0x0021:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r4.next()
            X.D3M r0 = (X.D3M) r0
            java.util.List r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x0033:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            X.1GR r0 = r5.A0U
            X.1JL r1 = r0.A00
            r0 = 0
            r1.A0V(r2, r0)
            goto L_0x0033
        L_0x0048:
            android.content.Context r1 = r1.A01
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0017
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isChangingConfigurations()
            r0 = r0 ^ 1
            goto L_0x0015
        L_0x0057:
            r0 = -1
            A0B(r5, r0)
            X.1GO r1 = r5.A08
            boolean r0 = r1 instanceof X.AnonymousClass1FJ
            if (r0 == 0) goto L_0x0066
            X.1GV r0 = r5.A0e
            r1.CEu(r0)
        L_0x0066:
            X.1GO r1 = r5.A08
            boolean r0 = r1 instanceof X.AnonymousClass1FF
            if (r0 == 0) goto L_0x0071
            X.1GV r0 = r5.A0b
            r1.CEp(r0)
        L_0x0071:
            X.1GO r1 = r5.A08
            boolean r0 = r1 instanceof X.AnonymousClass1FH
            if (r0 == 0) goto L_0x007c
            X.1GV r0 = r5.A0c
            r1.CEq(r0)
        L_0x007c:
            X.1GO r1 = r5.A08
            boolean r0 = r1 instanceof X.AnonymousClass1FI
            if (r0 == 0) goto L_0x0087
            X.1GV r0 = r5.A0d
            r1.CEr(r0)
        L_0x0087:
            X.1GO r1 = r5.A08
            boolean r0 = r1 instanceof X.AnonymousClass1FG
            if (r0 == 0) goto L_0x0096
            androidx.fragment.app.Fragment r0 = r5.A06
            if (r0 != 0) goto L_0x0096
            X.1GW r0 = r5.A0f
            r1.CEn(r0)
        L_0x0096:
            r2 = 0
            r5.A08 = r2
            r5.A09 = r2
            r5.A06 = r2
            X.02V r0 = r5.A01
            if (r0 == 0) goto L_0x00bb
            X.01T r0 = r5.A0R
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x00a9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r0 = r1.next()
            X.02e r0 = (X.C005102e) r0
            r0.cancel()
            goto L_0x00a9
        L_0x00b9:
            r5.A01 = r2
        L_0x00bb:
            X.02n r0 = r5.A03
            if (r0 == 0) goto L_0x00cc
            r0.A01()
            X.02n r0 = r5.A04
            r0.A01()
            X.02n r0 = r5.A02
            r0.A01()
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GP.A0X():void");
    }

    public void A0Z() {
        A0y(true);
        A04();
    }

    public void A0b() {
        A0r(new C64932vZ(this, (String) null, -1, 0), false);
    }

    public void A0c() {
        A0J(this, (String) null);
    }

    public void A0h(Fragment fragment) {
        if (A0G(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.A0Z) {
            fragment.A0Z = false;
            if (!fragment.A0W) {
                this.A0U.A05(fragment);
                if (A0G(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                if (A0H(fragment)) {
                    this.A0I = true;
                }
            }
        }
    }

    public void A0i(Fragment fragment) {
        if (A0G(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.A0Z) {
            fragment.A0Z = true;
            if (fragment.A0W) {
                if (A0G(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                ArrayList arrayList = this.A0U.A01;
                synchronized (arrayList) {
                    arrayList.remove(fragment);
                }
                fragment.A0W = false;
                if (A0H(fragment)) {
                    this.A0I = true;
                }
                A06(fragment);
            }
        }
    }

    public void A0j(Fragment fragment) {
        if (A0G(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.A0c) {
            fragment.A0c = true;
            fragment.A0d = true ^ fragment.A0d;
            A06(fragment);
        }
    }

    public void A0k(Fragment fragment) {
        if (A0G(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.A00);
            Log.v("FragmentManager", sb.toString());
        }
        boolean z = false;
        if (fragment.A00 > 0) {
            z = true;
        }
        boolean z2 = !z;
        if (!fragment.A0Z || z2) {
            ArrayList arrayList = this.A0U.A01;
            synchronized (arrayList) {
                arrayList.remove(fragment);
            }
            fragment.A0W = false;
            if (A0H(fragment)) {
                this.A0I = true;
            }
            fragment.A0j = true;
            A06(fragment);
        }
    }

    public void A0v(String str, int i) {
        A0r(new C64932vZ(this, str, -1, i), false);
    }

    public boolean A14(Fragment fragment) {
        if (fragment != null) {
            AnonymousClass1GP r1 = fragment.A0I;
            if (!fragment.equals(r1.A07) || !A14(r1.A06)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A15(java.lang.String r8, java.util.ArrayList r9, java.util.ArrayList r10, int r11, int r12) {
        /*
            r7 = this;
            r6 = 1
            r0 = r12 & 1
            r5 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0008
            r2 = 1
        L_0x0008:
            java.util.ArrayList r4 = r7.A0D
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0083
            if (r8 != 0) goto L_0x0031
            if (r11 >= 0) goto L_0x0031
            if (r2 == 0) goto L_0x0079
            r3 = 0
        L_0x0017:
            java.util.ArrayList r2 = r7.A0D
            int r1 = r2.size()
            int r1 = r1 - r6
        L_0x001e:
            if (r1 < r3) goto L_0x0082
            java.lang.Object r0 = r2.remove(r1)
            r9.add(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r10.add(r0)
            int r1 = r1 + -1
            goto L_0x001e
        L_0x0031:
            int r3 = r4.size()
        L_0x0035:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0083
            java.lang.Object r1 = r4.get(r3)
            X.1jj r1 = (X.C34001jj) r1
            if (r8 == 0) goto L_0x0056
            java.lang.String r0 = r1.A0A
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0056
        L_0x0049:
            if (r2 != 0) goto L_0x005d
            int r0 = r4.size()
            int r0 = r0 + -1
            if (r3 == r0) goto L_0x0083
            int r3 = r3 + 1
            goto L_0x007f
        L_0x0056:
            if (r11 < 0) goto L_0x0035
            int r0 = r1.A07
            if (r11 != r0) goto L_0x0035
            goto L_0x0049
        L_0x005d:
            if (r3 <= 0) goto L_0x007f
            int r2 = r3 + -1
            java.lang.Object r1 = r4.get(r2)
            X.1jj r1 = (X.C34001jj) r1
            if (r8 == 0) goto L_0x0071
            java.lang.String r0 = r1.A0A
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0077
        L_0x0071:
            if (r11 < 0) goto L_0x0017
            int r0 = r1.A07
            if (r11 != r0) goto L_0x0017
        L_0x0077:
            r3 = r2
            goto L_0x005d
        L_0x0079:
            int r0 = r4.size()
            int r3 = r0 + -1
        L_0x007f:
            if (r3 >= 0) goto L_0x0017
            return r5
        L_0x0082:
            return r6
        L_0x0083:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GP.A15(java.lang.String, java.util.ArrayList, java.util.ArrayList, int, int):boolean");
    }

    private ViewGroup A00(Fragment fragment) {
        ViewGroup viewGroup = fragment.A0C;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.A01 > 0 && this.A09.A01()) {
            View A002 = this.A09.A00(fragment.A01);
            if (A002 instanceof ViewGroup) {
                return (ViewGroup) A002;
            }
        }
        return null;
    }

    private HashSet A01() {
        HashSet hashSet = new HashSet();
        Iterator it = this.A0U.A02().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C35821mr) it.next()).A02.A0C;
            if (viewGroup != null) {
                C18070vi.A0d(A0V(), 1);
                Object tag = viewGroup.getTag(2131435544);
                if (!(tag instanceof C39461t7)) {
                    tag = new C39461t7(viewGroup);
                    viewGroup.setTag(2131435544, tag);
                }
                hashSet.add(tag);
            }
        }
        return hashSet;
    }

    public static HashSet A02(C34001jj r4) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList = r4.A0C;
            if (i >= arrayList.size()) {
                return hashSet;
            }
            Fragment fragment = ((C34271kD) arrayList.get(i)).A05;
            if (fragment != null && r4.A0F) {
                hashSet.add(fragment);
            }
            i++;
        }
    }

    private void A05() {
        Iterator it = this.A0U.A02().iterator();
        while (it.hasNext()) {
            C35821mr r2 = (C35821mr) it.next();
            Fragment fragment = r2.A02;
            if (fragment.A0Y) {
                if (this.A0G) {
                    this.A0H = true;
                } else {
                    fragment.A0Y = false;
                    r2.A03();
                }
            }
        }
    }

    public static void A08(Fragment fragment, AnonymousClass1GP r3) {
        if (fragment != null) {
            if (fragment.equals(r3.A0U.A00(fragment.A0V))) {
                boolean A14 = fragment.A0I.A14(fragment);
                Boolean bool = fragment.A0P;
                if (bool == null || bool.booleanValue() != A14) {
                    fragment.A0P = Boolean.valueOf(A14);
                    AnonymousClass1GP r1 = fragment.A0H;
                    A0A(r1);
                    A08(r1.A07, r1);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r5.A0K() <= 0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r5.A14(r5.A06) == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (A0G(3) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("OnBackPressedCallback for FragmentManager ");
        r1.append(r5);
        r1.append(" enabled state is ");
        r1.append(r3);
        android.util.Log.d("FragmentManager", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        r5.A0R.A06(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.AnonymousClass1GP r5) {
        /*
            java.util.ArrayList r4 = r5.A0V
            monitor-enter(r4)
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x006e }
            r1 = 3
            r3 = 1
            if (r0 != 0) goto L_0x0033
            X.01T r0 = r5.A0R     // Catch:{ all -> 0x006e }
            r0.A06(r3)     // Catch:{ all -> 0x006e }
            boolean r0 = A0G(r1)     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0031
            java.lang.String r2 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r1.<init>()     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "FragmentManager "
            r1.append(r0)     // Catch:{ all -> 0x006e }
            r1.append(r5)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = " enabling OnBackPressedCallback, caused by non-empty pending actions"
            r1.append(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x006e }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x006e }
        L_0x0031:
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            return
        L_0x0033:
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            int r0 = r5.A0K()
            if (r0 <= 0) goto L_0x006c
            androidx.fragment.app.Fragment r0 = r5.A06
            boolean r0 = r5.A14(r0)
            if (r0 == 0) goto L_0x006c
        L_0x0042:
            boolean r0 = A0G(r1)
            if (r0 == 0) goto L_0x0066
            java.lang.String r2 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "OnBackPressedCallback for FragmentManager "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " enabled state is "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r2, r0)
        L_0x0066:
            X.01T r0 = r5.A0R
            r0.A06(r3)
            return
        L_0x006c:
            r3 = 0
            goto L_0x0042
        L_0x006e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GP.A0A(X.1GP):void");
    }

    /* JADX WARNING: type inference failed for: r15v14, types: [X.1kD, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v25, types: [X.1kD, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v40, types: [X.1kD, java.lang.Object] */
    private void A0E(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        AnonymousClass1GP r0;
        AnonymousClass1GP r02;
        ArrayList arrayList3 = arrayList;
        int i3 = i;
        boolean z = ((C34001jj) arrayList3.get(i3)).A0G;
        ArrayList arrayList4 = this.A0O;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            this.A0O = arrayList4;
        } else {
            arrayList4.clear();
        }
        AnonymousClass1GR r21 = this.A0U;
        arrayList4.addAll(r21.A04());
        Fragment fragment = this.A07;
        int i4 = i3;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList5 = arrayList2;
            int i5 = i2;
            if (i4 < i5) {
                C34001jj r10 = (C34001jj) arrayList3.get(i4);
                boolean booleanValue = ((Boolean) arrayList5.get(i4)).booleanValue();
                ArrayList arrayList6 = this.A0O;
                if (!booleanValue) {
                    int i6 = 0;
                    while (true) {
                        ArrayList arrayList7 = r10.A0C;
                        if (i6 < arrayList7.size()) {
                            C34271kD r11 = (C34271kD) arrayList7.get(i6);
                            int i7 = r11.A00;
                            if (i7 != 1) {
                                if (i7 == 2) {
                                    Fragment fragment2 = r11.A05;
                                    int i8 = fragment2.A01;
                                    boolean z3 = false;
                                    for (int size = arrayList6.size() - 1; size >= 0; size--) {
                                        Fragment fragment3 = (Fragment) arrayList6.get(size);
                                        if (fragment3.A01 == i8) {
                                            if (fragment3 == fragment2) {
                                                z3 = true;
                                            } else {
                                                if (fragment3 == fragment) {
                                                    ? obj = new Object();
                                                    obj.A00 = 9;
                                                    obj.A05 = fragment3;
                                                    obj.A08 = true;
                                                    C23401Fx r03 = C23401Fx.RESUMED;
                                                    obj.A07 = r03;
                                                    obj.A06 = r03;
                                                    arrayList7.add(i6, obj);
                                                    i6++;
                                                    fragment = null;
                                                }
                                                ? obj2 = new Object();
                                                obj2.A00 = 3;
                                                obj2.A05 = fragment3;
                                                obj2.A08 = true;
                                                C23401Fx r04 = C23401Fx.RESUMED;
                                                obj2.A07 = r04;
                                                obj2.A06 = r04;
                                                obj2.A01 = r11.A01;
                                                obj2.A03 = r11.A03;
                                                obj2.A02 = r11.A02;
                                                obj2.A04 = r11.A04;
                                                arrayList7.add(i6, obj2);
                                                arrayList6.remove(fragment3);
                                                i6++;
                                            }
                                        }
                                    }
                                    if (z3) {
                                        arrayList7.remove(i6);
                                        i6--;
                                    } else {
                                        r11.A00 = 1;
                                        r11.A08 = true;
                                        arrayList6.add(fragment2);
                                    }
                                } else if (i7 == 3 || i7 == 6) {
                                    arrayList6.remove(r11.A05);
                                    Fragment fragment4 = r11.A05;
                                    if (fragment4 == fragment) {
                                        arrayList7.add(i6, new C34271kD(fragment4, 9));
                                        i6++;
                                        fragment = null;
                                    }
                                } else if (i7 != 7) {
                                    if (i7 == 8) {
                                        ? obj3 = new Object();
                                        obj3.A00 = 9;
                                        obj3.A05 = fragment;
                                        obj3.A08 = true;
                                        C23401Fx r05 = C23401Fx.RESUMED;
                                        obj3.A07 = r05;
                                        obj3.A06 = r05;
                                        arrayList7.add(i6, obj3);
                                        r11.A08 = true;
                                        i6++;
                                        fragment = r11.A05;
                                    }
                                }
                                i6++;
                            }
                            arrayList6.add(r11.A05);
                            i6++;
                        }
                    }
                } else {
                    ArrayList arrayList8 = r10.A0C;
                    for (int size2 = arrayList8.size() - 1; size2 >= 0; size2--) {
                        C34271kD r6 = (C34271kD) arrayList8.get(size2);
                        int i9 = r6.A00;
                        if (i9 != 1) {
                            if (i9 != 3) {
                                switch (i9) {
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = r6.A05;
                                        break;
                                    case 10:
                                        r6.A06 = r6.A07;
                                        break;
                                }
                            }
                            arrayList6.add(r6.A05);
                        }
                        arrayList6.remove(r6.A05);
                    }
                }
                if (!z2) {
                    z2 = false;
                    if (!r10.A0F) {
                        i4++;
                    }
                }
                z2 = true;
                i4++;
            } else {
                this.A0O.clear();
                if (!z && this.A00 >= 1) {
                    for (int i10 = i3; i10 < i5; i10++) {
                        Iterator it = ((C34001jj) arrayList3.get(i10)).A0C.iterator();
                        while (it.hasNext()) {
                            Fragment fragment5 = ((C34271kD) it.next()).A05;
                            if (!(fragment5 == null || fragment5.A0I == null)) {
                                r21.A06(A0U(fragment5));
                            }
                        }
                    }
                }
                for (int i11 = i3; i11 < i5; i11++) {
                    C34001jj r102 = (C34001jj) arrayList3.get(i11);
                    if (((Boolean) arrayList5.get(i11)).booleanValue()) {
                        r102.A05(-1);
                        ArrayList arrayList9 = r102.A0C;
                        for (int size3 = arrayList9.size() - 1; size3 >= 0; size3--) {
                            C34271kD r13 = (C34271kD) arrayList9.get(size3);
                            Fragment fragment6 = r13.A05;
                            if (fragment6 != null) {
                                if (fragment6.A0D != null) {
                                    Fragment.A0K(fragment6).A0F = true;
                                }
                                int i12 = r102.A06;
                                int i13 = 8194;
                                if (i12 != 4097) {
                                    i13 = 4097;
                                    if (i12 != 8194) {
                                        i13 = 4100;
                                        if (i12 != 8197) {
                                            if (i12 != 4099) {
                                                i13 = 8197;
                                                if (i12 != 4100) {
                                                    i13 = 0;
                                                }
                                            } else {
                                                i13 = 4099;
                                            }
                                        }
                                    }
                                }
                                if (!(fragment6.A0D == null && i13 == 0)) {
                                    Fragment.A0K(fragment6);
                                    fragment6.A0D.A03 = i13;
                                }
                                ArrayList arrayList10 = r102.A0E;
                                ArrayList arrayList11 = r102.A0D;
                                Fragment.A0K(fragment6);
                                C35841mt r06 = fragment6.A0D;
                                r06.A0C = arrayList10;
                                r06.A0D = arrayList11;
                            }
                            int i14 = r13.A00;
                            switch (i14) {
                                case 1:
                                    fragment6.A1N(r13.A01, r13.A02, r13.A03, r13.A04);
                                    AnonymousClass1GP r07 = r102.A0K;
                                    r07.A0o(fragment6, true);
                                    r07.A0k(fragment6);
                                    break;
                                case 3:
                                    fragment6.A1N(r13.A01, r13.A02, r13.A03, r13.A04);
                                    r102.A0K.A0T(fragment6);
                                    break;
                                case 4:
                                    fragment6.A1N(r13.A01, r13.A02, r13.A03, r13.A04);
                                    A07(fragment6);
                                    break;
                                case 5:
                                    fragment6.A1N(r13.A01, r13.A02, r13.A03, r13.A04);
                                    AnonymousClass1GP r08 = r102.A0K;
                                    r08.A0o(fragment6, true);
                                    r08.A0j(fragment6);
                                    break;
                                case 6:
                                    fragment6.A1N(r13.A01, r13.A02, r13.A03, r13.A04);
                                    r102.A0K.A0h(fragment6);
                                    break;
                                case 7:
                                    fragment6.A1N(r13.A01, r13.A02, r13.A03, r13.A04);
                                    AnonymousClass1GP r09 = r102.A0K;
                                    r09.A0o(fragment6, true);
                                    r09.A0i(fragment6);
                                    break;
                                case 8:
                                    r02 = r102.A0K;
                                    fragment6 = null;
                                    break;
                                case 9:
                                    r02 = r102.A0K;
                                    break;
                                case 10:
                                    r102.A0K.A0n(fragment6, r13.A07);
                                    break;
                                default:
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Unknown cmd: ");
                                    sb.append(i14);
                                    throw new IllegalArgumentException(sb.toString());
                            }
                            r02.A0l(fragment6);
                        }
                        continue;
                    } else {
                        r102.A05(1);
                        ArrayList arrayList12 = r102.A0C;
                        int size4 = arrayList12.size();
                        for (int i15 = 0; i15 < size4; i15++) {
                            C34271kD r14 = (C34271kD) arrayList12.get(i15);
                            Fragment fragment7 = r14.A05;
                            if (fragment7 != null) {
                                if (fragment7.A0D != null) {
                                    Fragment.A0K(fragment7).A0F = false;
                                }
                                int i16 = r102.A06;
                                if (!(fragment7.A0D == null && i16 == 0)) {
                                    Fragment.A0K(fragment7);
                                    fragment7.A0D.A03 = i16;
                                }
                                ArrayList arrayList13 = r102.A0D;
                                ArrayList arrayList14 = r102.A0E;
                                Fragment.A0K(fragment7);
                                C35841mt r010 = fragment7.A0D;
                                r010.A0C = arrayList13;
                                r010.A0D = arrayList14;
                            }
                            int i17 = r14.A00;
                            switch (i17) {
                                case 1:
                                    fragment7.A1N(r14.A01, r14.A02, r14.A03, r14.A04);
                                    AnonymousClass1GP r011 = r102.A0K;
                                    r011.A0o(fragment7, false);
                                    r011.A0T(fragment7);
                                    break;
                                case 3:
                                    fragment7.A1N(r14.A01, r14.A02, r14.A03, r14.A04);
                                    r102.A0K.A0k(fragment7);
                                    break;
                                case 4:
                                    fragment7.A1N(r14.A01, r14.A02, r14.A03, r14.A04);
                                    r102.A0K.A0j(fragment7);
                                    break;
                                case 5:
                                    fragment7.A1N(r14.A01, r14.A02, r14.A03, r14.A04);
                                    r102.A0K.A0o(fragment7, false);
                                    A07(fragment7);
                                    break;
                                case 6:
                                    fragment7.A1N(r14.A01, r14.A02, r14.A03, r14.A04);
                                    r102.A0K.A0i(fragment7);
                                    break;
                                case 7:
                                    fragment7.A1N(r14.A01, r14.A02, r14.A03, r14.A04);
                                    AnonymousClass1GP r012 = r102.A0K;
                                    r012.A0o(fragment7, false);
                                    r012.A0h(fragment7);
                                    break;
                                case 8:
                                    r0 = r102.A0K;
                                    break;
                                case 9:
                                    r0 = r102.A0K;
                                    fragment7 = null;
                                    break;
                                case 10:
                                    r102.A0K.A0n(fragment7, r14.A06);
                                    break;
                                default:
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Unknown cmd: ");
                                    sb2.append(i17);
                                    throw new IllegalArgumentException(sb2.toString());
                            }
                            r0.A0l(fragment7);
                        }
                        continue;
                    }
                }
                boolean booleanValue2 = ((Boolean) arrayList5.get(i2 - 1)).booleanValue();
                if (z2) {
                    ArrayList arrayList15 = this.A0E;
                    if (!arrayList15.isEmpty()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            linkedHashSet.addAll(A02((C34001jj) it2.next()));
                        }
                        if (this.A05 == null) {
                            Iterator it3 = arrayList15.iterator();
                            while (it3.hasNext()) {
                                it3.next();
                                Iterator it4 = linkedHashSet.iterator();
                                while (it4.hasNext()) {
                                    it4.next();
                                }
                            }
                            Iterator it5 = arrayList15.iterator();
                            while (it5.hasNext()) {
                                it5.next();
                                Iterator it6 = linkedHashSet.iterator();
                                while (it6.hasNext()) {
                                    it6.next();
                                }
                            }
                        }
                    }
                }
                for (int i18 = i3; i18 < i5; i18++) {
                    C34001jj r103 = (C34001jj) arrayList3.get(i18);
                    ArrayList arrayList16 = r103.A0C;
                    if (booleanValue2) {
                        for (int size5 = arrayList16.size() - 1; size5 >= 0; size5--) {
                            Fragment fragment8 = ((C34271kD) r103.A0C.get(size5)).A05;
                            if (fragment8 != null) {
                                A0U(fragment8).A03();
                            }
                        }
                    } else {
                        Iterator it7 = arrayList16.iterator();
                        while (it7.hasNext()) {
                            Fragment fragment9 = ((C34271kD) it7.next()).A05;
                            if (fragment9 != null) {
                                A0U(fragment9).A03();
                            }
                        }
                    }
                }
                A0d(this.A00, true);
                Iterator it8 = A0W(arrayList3, i3, i5).iterator();
                while (it8.hasNext()) {
                    C39461t7 r013 = (C39461t7) it8.next();
                    r013.A01 = booleanValue2;
                    r013.A09();
                    r013.A07();
                }
                while (i3 < i5) {
                    C34001jj r8 = (C34001jj) arrayList3.get(i3);
                    if (((Boolean) arrayList5.get(i3)).booleanValue() && r8.A07 >= 0) {
                        r8.A07 = -1;
                    }
                    if (r8.A0B != null) {
                        int i19 = 0;
                        while (true) {
                            ArrayList arrayList17 = r8.A0B;
                            if (i19 < arrayList17.size()) {
                                ((Runnable) arrayList17.get(i19)).run();
                                i19++;
                            } else {
                                r8.A0B = null;
                            }
                        }
                    }
                    i3++;
                }
                if (z2) {
                    int i20 = 0;
                    while (true) {
                        ArrayList arrayList18 = this.A0E;
                        if (i20 < arrayList18.size()) {
                            ((AnonymousClass1J9) arrayList18.get(i20)).onBackStackChanged();
                            i20++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    private void A0F(boolean z) {
        if (this.A0G) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.A08 == null) {
            if (this.A0F) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.A08.A02.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (!z && A0z()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.A0Q == null) {
            this.A0Q = new ArrayList();
            this.A0P = new ArrayList();
        }
    }

    public static boolean A0G(int i) {
        if (Log.isLoggable("FragmentManager", i)) {
            return true;
        }
        return false;
    }

    public static boolean A0H(Fragment fragment) {
        if (fragment.A0b && fragment.A0h) {
            return true;
        }
        Iterator it = fragment.A0H.A0U.A03().iterator();
        while (it.hasNext()) {
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null && A0H(fragment2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0I(AnonymousClass1GP r2) {
        Fragment fragment = r2.A06;
        if (fragment == null || (fragment.A1b() && A0I(fragment.A1F()))) {
            return true;
        }
        return false;
    }

    public int A0K() {
        int size = this.A0D.size();
        int i = 0;
        if (this.A05 != null) {
            i = 1;
        }
        return size + i;
    }

    public Bundle A0L() {
        ArrayList arrayList;
        C64602v2[] r6;
        Bundle bundle = new Bundle();
        A04();
        A09(this);
        A0y(true);
        this.A0J = true;
        this.A0A.A01 = true;
        AnonymousClass1GR r2 = this.A0U;
        HashMap hashMap = r2.A02;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (C35821mr r0 : hashMap.values()) {
            if (r0 != null) {
                Fragment fragment = r0.A02;
                r2.A03.put(fragment.A0V, r0.A00());
                arrayList2.add(fragment.A0V);
                if (A0G(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(fragment);
                    sb.append(": ");
                    sb.append(fragment.A07);
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        HashMap hashMap2 = r2.A03;
        if (!hashMap2.isEmpty()) {
            ArrayList arrayList3 = r2.A01;
            synchronized (arrayList3) {
                if (arrayList3.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(arrayList3.size());
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        Fragment fragment2 = (Fragment) it.next();
                        arrayList.add(fragment2.A0V);
                        if (A0G(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("saveAllState: adding fragment (");
                            sb2.append(fragment2.A0V);
                            sb2.append("): ");
                            sb2.append(fragment2);
                            Log.v("FragmentManager", sb2.toString());
                        }
                    }
                }
            }
            int size = this.A0D.size();
            if (size > 0) {
                r6 = new C64602v2[size];
                int i = 0;
                do {
                    r6[i] = new C64602v2((C34001jj) this.A0D.get(i));
                    if (A0G(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("saveAllState: adding back stack #");
                        sb3.append(i);
                        sb3.append(": ");
                        sb3.append(this.A0D.get(i));
                        Log.v("FragmentManager", sb3.toString());
                    }
                    i++;
                } while (i < size);
            } else {
                r6 = null;
            }
            D3S d3s = new D3S();
            d3s.A02 = arrayList2;
            d3s.A03 = arrayList;
            d3s.A07 = r6;
            d3s.A00 = this.A0a.get();
            Fragment fragment3 = this.A07;
            if (fragment3 != null) {
                d3s.A01 = fragment3.A0V;
            }
            ArrayList arrayList4 = d3s.A04;
            Map map = this.A0W;
            arrayList4.addAll(map.keySet());
            d3s.A05.addAll(map.values());
            d3s.A06 = new ArrayList(this.A0C);
            bundle.putParcelable("state", d3s);
            Map map2 = this.A0Y;
            for (String str : map2.keySet()) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("result_");
                sb4.append(str);
                bundle.putBundle(sb4.toString(), (Bundle) map2.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("fragment_");
                sb5.append(str2);
                bundle.putBundle(sb5.toString(), (Bundle) hashMap2.get(str2));
            }
        } else if (A0G(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public C34001jj A0M() {
        return new C34001jj(this);
    }

    public C26550D3n A0N(Fragment fragment) {
        AnonymousClass1GR r0 = this.A0U;
        C35821mr r2 = (C35821mr) r0.A02.get(fragment.A0V);
        if (r2 != null) {
            Fragment fragment2 = r2.A02;
            if (fragment2.equals(fragment)) {
                if (fragment2.A04 > -1) {
                    return new C26550D3n(r2.A00());
                }
                return null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not currently in the FragmentManager");
        A0C(new IllegalStateException(sb.toString()));
        throw null;
    }

    public Fragment A0O(int i) {
        AnonymousClass1GR r4 = this.A0U;
        ArrayList arrayList = r4.A01;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && fragment.A03 == i) {
                    return fragment;
                }
            } else {
                for (C35821mr r0 : r4.A02.values()) {
                    if (r0 != null) {
                        Fragment fragment2 = r0.A02;
                        if (fragment2.A03 == i) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public Fragment A0Q(String str) {
        AnonymousClass1GR r4 = this.A0U;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = r4.A01;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.A0T)) {
                    return fragment;
                }
            } else {
                for (C35821mr r0 : r4.A02.values()) {
                    if (r0 != null) {
                        Fragment fragment2 = r0.A02;
                        if (str.equals(fragment2.A0T)) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public AnonymousClass1GY A0R() {
        Fragment fragment = this.A06;
        if (fragment != null) {
            return fragment.A0I.A0R();
        }
        return this.A0L;
    }

    public C33991ji A0S(int i) {
        ArrayList arrayList = this.A0D;
        if (i != arrayList.size()) {
            return (C33991ji) arrayList.get(i);
        }
        C34001jj r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw new IndexOutOfBoundsException();
    }

    public C35821mr A0T(Fragment fragment) {
        String str = fragment.A0S;
        if (str != null) {
            C34281kE.A01(fragment, str);
        }
        if (A0G(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        C35821mr A0U2 = A0U(fragment);
        fragment.A0I = this;
        AnonymousClass1GR r1 = this.A0U;
        r1.A06(A0U2);
        if (!fragment.A0Z) {
            r1.A05(fragment);
            fragment.A0j = false;
            if (fragment.A0B == null) {
                fragment.A0d = false;
            }
            if (A0H(fragment)) {
                this.A0I = true;
            }
        }
        return A0U2;
    }

    public C35821mr A0U(Fragment fragment) {
        AnonymousClass1GR r2 = this.A0U;
        C35821mr r1 = (C35821mr) r2.A02.get(fragment.A0V);
        if (r1 != null) {
            return r1;
        }
        C35821mr r12 = new C35821mr(fragment, this.A0T, r2);
        r12.A05(this.A08.A01.getClassLoader());
        r12.A00 = this.A00;
        return r12;
    }

    public AnonymousClass1GZ A0V() {
        Fragment fragment = this.A06;
        if (fragment != null) {
            return fragment.A0I.A0V();
        }
        return this.A0M;
    }

    public HashSet A0W(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((C34001jj) arrayList.get(i)).A0C.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((C34271kD) it.next()).A05;
                if (!(fragment == null || (viewGroup = fragment.A0C) == null)) {
                    hashSet.add(C39461t7.A02(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public void A0Y() {
        Iterator it = this.A0U.A03().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.A1Y(fragment.A1c());
                fragment.A0H.A0Y();
            }
        }
    }

    public void A0a() {
        if (this.A08 != null) {
            this.A0J = false;
            this.A0K = false;
            this.A0A.A01 = false;
            for (Fragment fragment : this.A0U.A04()) {
                if (fragment != null) {
                    fragment.A0H.A0a();
                }
            }
        }
    }

    public void A0d(int i, boolean z) {
        AnonymousClass1GO r2;
        if (this.A08 == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.A00) {
            this.A00 = i;
            AnonymousClass1GR r4 = this.A0U;
            Iterator it = r4.A01.iterator();
            while (it.hasNext()) {
                C35821mr r0 = (C35821mr) r4.A02.get(((Fragment) it.next()).A0V);
                if (r0 != null) {
                    r0.A03();
                }
            }
            for (C35821mr r22 : r4.A02.values()) {
                if (r22 != null) {
                    r22.A03();
                    Fragment fragment = r22.A02;
                    if (fragment.A0j && fragment.A00 <= 0) {
                        r4.A07(r22);
                    }
                }
            }
            A05();
            if (this.A0I && (r2 = this.A08) != null && this.A00 == 7) {
                r2.A04.invalidateOptionsMenu();
                this.A0I = false;
            }
        }
    }

    public void A0e(Bundle bundle, Fragment fragment, String str) {
        if (fragment.A0I != this) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            A0C(new IllegalStateException(sb.toString()));
            throw null;
        }
        bundle.putString(str, fragment.A0V);
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [X.1kD, java.lang.Object] */
    public void A0f(Parcelable parcelable) {
        C35821mr r18;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        Iterator<String> it = bundle3.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (next.startsWith("result_") && (bundle2 = bundle3.getBundle(next)) != null) {
                bundle2.setClassLoader(this.A08.A01.getClassLoader());
                this.A0Y.put(next.substring(7), bundle2);
            }
        }
        HashMap hashMap = new HashMap();
        for (String next2 : bundle3.keySet()) {
            if (next2.startsWith("fragment_") && (bundle = bundle3.getBundle(next2)) != null) {
                bundle.setClassLoader(this.A08.A01.getClassLoader());
                hashMap.put(next2.substring(9), bundle);
            }
        }
        AnonymousClass1GR r2 = this.A0U;
        HashMap hashMap2 = r2.A03;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        D3S d3s = (D3S) bundle3.getParcelable("state");
        if (d3s != null) {
            HashMap hashMap3 = r2.A02;
            hashMap3.clear();
            Iterator it2 = d3s.A02.iterator();
            while (it2.hasNext()) {
                Bundle bundle4 = (Bundle) hashMap2.remove(it2.next());
                if (bundle4 != null) {
                    AnonymousClass1JL r0 = this.A0A;
                    Fragment fragment = (Fragment) r0.A03.get(((C64612v3) bundle4.getParcelable("state")).A07);
                    if (fragment != null) {
                        if (A0G(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("restoreSaveState: re-attaching retained ");
                            sb.append(fragment);
                            Log.v("FragmentManager", sb.toString());
                        }
                        r18 = new C35821mr(bundle4, fragment, this.A0T, r2);
                    } else {
                        AnonymousClass1GU r1 = this.A0T;
                        Bundle bundle5 = bundle4;
                        AnonymousClass1GU r20 = r1;
                        r18 = new C35821mr(bundle5, r20, A0R(), r2, this.A08.A01.getClassLoader());
                    }
                    Fragment fragment2 = r18.A02;
                    fragment2.A07 = bundle4;
                    fragment2.A0I = this;
                    if (A0G(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("restoreSaveState: active (");
                        sb2.append(fragment2.A0V);
                        sb2.append("): ");
                        sb2.append(fragment2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    r18.A05(this.A08.A01.getClassLoader());
                    r2.A06(r18);
                    r18.A00 = this.A00;
                }
            }
            Iterator it3 = new ArrayList(this.A0A.A03.values()).iterator();
            while (it3.hasNext()) {
                Fragment fragment3 = (Fragment) it3.next();
                if (hashMap3.get(fragment3.A0V) == null) {
                    if (A0G(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Discarding retained Fragment ");
                        sb3.append(fragment3);
                        sb3.append(" that was not found in the set of active Fragments ");
                        sb3.append(d3s.A02);
                        Log.v("FragmentManager", sb3.toString());
                    }
                    this.A0A.A0T(fragment3);
                    fragment3.A0I = this;
                    C35821mr r12 = new C35821mr(fragment3, this.A0T, r2);
                    r12.A00 = 1;
                    r12.A03();
                    fragment3.A0j = true;
                    r12.A03();
                }
            }
            ArrayList arrayList = d3s.A03;
            r2.A01.clear();
            if (arrayList != null) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    String str = (String) it4.next();
                    Fragment A002 = r2.A00(str);
                    if (A002 != null) {
                        if (A0G(2)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("restoreSaveState: added (");
                            sb4.append(str);
                            sb4.append("): ");
                            sb4.append(A002);
                            Log.v("FragmentManager", sb4.toString());
                        }
                        r2.A05(A002);
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("No instantiated fragment for (");
                        sb5.append(str);
                        sb5.append(")");
                        throw new IllegalStateException(sb5.toString());
                    }
                }
            }
            C64602v2[] r02 = d3s.A07;
            if (r02 != null) {
                this.A0D = new ArrayList(r02.length);
                int i = 0;
                while (true) {
                    C64602v2[] r13 = d3s.A07;
                    if (i >= r13.length) {
                        break;
                    }
                    C64602v2 r122 = r13[i];
                    C34001jj r8 = new C34001jj(this);
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        int[] iArr = r122.A0D;
                        boolean z = true;
                        if (i2 >= iArr.length) {
                            break;
                        }
                        ? obj = new Object();
                        int i4 = i2 + 1;
                        obj.A00 = iArr[i2];
                        if (A0G(2)) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Instantiate ");
                            sb6.append(r8);
                            sb6.append(" op #");
                            sb6.append(i3);
                            sb6.append(" base fragment #");
                            sb6.append(iArr[i4]);
                            Log.v("FragmentManager", sb6.toString());
                        }
                        obj.A07 = C23401Fx.values()[r122.A0C[i3]];
                        obj.A06 = C23401Fx.values()[r122.A0B[i3]];
                        int i5 = i4 + 1;
                        if (iArr[i4] == 0) {
                            z = false;
                        }
                        obj.A08 = z;
                        int i6 = i5 + 1;
                        int i7 = iArr[i5];
                        obj.A01 = i7;
                        int i8 = i6 + 1;
                        int i9 = iArr[i6];
                        obj.A02 = i9;
                        int i10 = i8 + 1;
                        int i11 = iArr[i8];
                        obj.A03 = i11;
                        i2 = i10 + 1;
                        int i12 = iArr[i10];
                        obj.A04 = i12;
                        r8.A02 = i7;
                        r8.A03 = i9;
                        r8.A04 = i11;
                        r8.A05 = i12;
                        r8.A0F(obj);
                        i3++;
                    }
                    r8.A06 = r122.A03;
                    r8.A0A = r122.A06;
                    r8.A0F = true;
                    r8.A01 = r122.A01;
                    r8.A09 = r122.A05;
                    r8.A00 = r122.A00;
                    r8.A08 = r122.A04;
                    r8.A0D = r122.A08;
                    r8.A0E = r122.A09;
                    r8.A0G = r122.A0A;
                    r8.A07 = r122.A02;
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = r122.A07;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        String str2 = (String) arrayList2.get(i13);
                        if (str2 != null) {
                            ((C34271kD) r8.A0C.get(i13)).A05 = r2.A00(str2);
                        }
                        i13++;
                    }
                    r8.A05(1);
                    if (A0G(2)) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("restoreAllState: back stack #");
                        sb7.append(i);
                        sb7.append(" (index ");
                        sb7.append(r8.A07);
                        sb7.append("): ");
                        sb7.append(r8);
                        Log.v("FragmentManager", sb7.toString());
                        PrintWriter printWriter = new PrintWriter(new AnonymousClass2QX());
                        r8.A0G(printWriter, "  ", false);
                        printWriter.close();
                    }
                    this.A0D.add(r8);
                    i++;
                }
            } else {
                this.A0D = new ArrayList();
            }
            this.A0a.set(d3s.A00);
            String str3 = d3s.A01;
            if (str3 != null) {
                Fragment A003 = r2.A00(str3);
                this.A07 = A003;
                A08(A003, this);
            }
            ArrayList arrayList3 = d3s.A04;
            if (arrayList3 != null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    this.A0W.put(arrayList3.get(i14), d3s.A05.get(i14));
                }
            }
            this.A0C = new ArrayDeque(d3s.A06);
        }
    }

    public void A0g(Menu menu) {
        if (this.A00 >= 1) {
            for (Fragment fragment : this.A0U.A04()) {
                if (fragment != null) {
                    fragment.A1T(menu);
                }
            }
        }
    }

    public void A0l(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.A0U.A00(fragment.A0V)) || !(fragment.A0G == null || fragment.A0I == this)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragment);
                sb.append(" is not an active fragment of FragmentManager ");
                sb.append(this);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        Fragment fragment2 = this.A07;
        this.A07 = fragment;
        A08(fragment2, this);
        A08(this.A07, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.1nH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: X.1nH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: X.1nH} */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0m(androidx.fragment.app.Fragment r7, X.AnonymousClass1GO r8, X.AnonymousClass1GM r9) {
        /*
            r6 = this;
            X.1GO r0 = r6.A08
            if (r0 != 0) goto L_0x017c
            r6.A08 = r8
            r6.A09 = r9
            r6.A06 = r7
            if (r7 == 0) goto L_0x0175
            X.1nH r1 = new X.1nH
            r1.<init>(r7, r6)
        L_0x0011:
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.A0Z
            r0.add(r1)
        L_0x0016:
            androidx.fragment.app.Fragment r0 = r6.A06
            if (r0 == 0) goto L_0x001d
            A0A(r6)
        L_0x001d:
            boolean r0 = r8 instanceof X.AnonymousClass01B
            if (r0 == 0) goto L_0x0030
            r2 = r8
            X.02V r1 = r8.BVe()
            r6.A01 = r1
            if (r7 == 0) goto L_0x002b
            r2 = r7
        L_0x002b:
            X.01T r0 = r6.A0R
            r1.A09(r0, r2)
        L_0x0030:
            if (r7 == 0) goto L_0x014e
            X.1GP r0 = r7.A0I
            X.1JL r3 = r0.A0A
            java.util.HashMap r2 = r3.A02
            java.lang.String r0 = r7.A0V
            java.lang.Object r1 = r2.get(r0)
            X.1JL r1 = (X.AnonymousClass1JL) r1
            if (r1 != 0) goto L_0x004e
            boolean r0 = r3.A05
            X.1JL r1 = new X.1JL
            r1.<init>(r0)
            java.lang.String r0 = r7.A0V
            r2.put(r0, r1)
        L_0x004e:
            r6.A0A = r1
            boolean r0 = r6.A0z()
            r1.A01 = r0
            X.1GR r0 = r6.A0U
            r0.A00 = r1
            X.1GO r1 = r6.A08
            boolean r0 = r1 instanceof X.AnonymousClass1FE
            if (r0 == 0) goto L_0x007a
            if (r7 != 0) goto L_0x007a
            X.1GB r2 = r1.BYX()
            r0 = 1
            X.2vt r1 = new X.2vt
            r1.<init>(r6, r0)
            java.lang.String r0 = "android:support:fragments"
            r2.A03(r1, r0)
            android.os.Bundle r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x007a
            r6.A0f(r0)
        L_0x007a:
            X.1GO r1 = r6.A08
            boolean r0 = r1 instanceof X.AnonymousClass01A
            if (r0 == 0) goto L_0x0110
            X.01M r4 = r1.BMV()
            if (r7 == 0) goto L_0x014a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r7.A0V
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            java.lang.String r2 = r1.toString()
        L_0x0099:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FragmentManager:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r5 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = "StartActivityForResult"
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            X.02i r2 = new X.02i
            r2.<init>()
            r1 = 1
            X.2vN r0 = new X.2vN
            r0.<init>(r6, r1)
            X.05q r0 = r4.A04(r0, r2, r3)
            r6.A03 = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = "StartIntentSenderForResult"
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            X.1Jb r2 = new X.1Jb
            r2.<init>()
            r1 = 2
            X.2vN r0 = new X.2vN
            r0.<init>(r6, r1)
            X.05q r0 = r4.A04(r0, r2, r3)
            r6.A04 = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = "RequestPermissions"
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            X.02o r2 = new X.02o
            r2.<init>()
            r1 = 0
            X.2vN r0 = new X.2vN
            r0.<init>(r6, r1)
            X.05q r0 = r4.A04(r0, r2, r3)
            r6.A02 = r0
        L_0x0110:
            X.1GO r1 = r6.A08
            boolean r0 = r1 instanceof X.AnonymousClass1FF
            if (r0 == 0) goto L_0x011b
            X.1GV r0 = r6.A0b
            r1.BBQ(r0)
        L_0x011b:
            X.1GO r1 = r6.A08
            boolean r0 = r1 instanceof X.AnonymousClass1FJ
            if (r0 == 0) goto L_0x0126
            X.1GV r0 = r6.A0e
            r1.BBW(r0)
        L_0x0126:
            X.1GO r1 = r6.A08
            boolean r0 = r1 instanceof X.AnonymousClass1FH
            if (r0 == 0) goto L_0x0131
            X.1GV r0 = r6.A0c
            r1.BBS(r0)
        L_0x0131:
            X.1GO r1 = r6.A08
            boolean r0 = r1 instanceof X.AnonymousClass1FI
            if (r0 == 0) goto L_0x013c
            X.1GV r0 = r6.A0d
            r1.BBT(r0)
        L_0x013c:
            X.1GO r1 = r6.A08
            boolean r0 = r1 instanceof X.AnonymousClass1FG
            if (r0 == 0) goto L_0x0149
            if (r7 != 0) goto L_0x0149
            X.1GW r0 = r6.A0f
            r1.BBL(r0)
        L_0x0149:
            return
        L_0x014a:
            java.lang.String r2 = ""
            goto L_0x0099
        L_0x014e:
            boolean r0 = r8 instanceof X.AnonymousClass1FD
            if (r0 == 0) goto L_0x016d
            X.1Iu r3 = r8.Bba()
            X.1Ir r2 = X.AnonymousClass1JL.A06
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.1Ix r0 = X.C24111Ix.A00
            X.1It r1 = new X.1It
            r1.<init>(r2, r3, r0)
            java.lang.Class<X.1JL> r0 = X.AnonymousClass1JL.class
            X.1J2 r1 = r1.A00(r0)
            X.1JL r1 = (X.AnonymousClass1JL) r1
            goto L_0x004e
        L_0x016d:
            r0 = 0
            X.1JL r1 = new X.1JL
            r1.<init>(r0)
            goto L_0x004e
        L_0x0175:
            boolean r0 = r8 instanceof X.AnonymousClass1GN
            if (r0 == 0) goto L_0x0016
            r1 = r8
            goto L_0x0011
        L_0x017c:
            java.lang.String r1 = "Already attached"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GP.A0m(androidx.fragment.app.Fragment, X.1GO, X.1GM):void");
    }

    public void A0n(Fragment fragment, C23401Fx r4) {
        if (!fragment.equals(this.A0U.A00(fragment.A0V)) || !(fragment.A0G == null || fragment.A0I == this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        fragment.A0K = r4;
    }

    public void A0p(C27461We r5) {
        AnonymousClass1GU r1 = this.A0T;
        C18070vi.A0d(r5, 0);
        CopyOnWriteArrayList copyOnWriteArrayList = r1.A00;
        synchronized (copyOnWriteArrayList) {
            int size = copyOnWriteArrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (((C27481Wg) copyOnWriteArrayList.get(i)).A00 == r5) {
                    copyOnWriteArrayList.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    public void A0q(C27461We r3, boolean z) {
        AnonymousClass1GU r1 = this.A0T;
        C18070vi.A0d(r3, 0);
        r1.A00.add(new C27481Wg(r3, z));
    }

    public void A0r(C33981jh r4, boolean z) {
        if (!z) {
            if (this.A08 == null) {
                if (this.A0F) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (A0z()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        ArrayList arrayList = this.A0V;
        synchronized (arrayList) {
            if (this.A08 != null) {
                arrayList.add(r4);
                try {
                    if (arrayList.size() == 1) {
                        Handler handler = this.A08.A02;
                        Runnable runnable = this.A0B;
                        handler.removeCallbacks(runnable);
                        this.A08.A02.post(runnable);
                        A0A(this);
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } else if (!z) {
                th = new IllegalStateException("Activity has been destroyed");
                throw th;
            }
        }
    }

    public void A0s(C33981jh r3, boolean z) {
        if (!z || (this.A08 != null && !this.A0F)) {
            A0F(z);
            if (r3.BLr(this.A0Q, this.A0P)) {
                this.A0G = true;
                try {
                    A0D(this.A0Q, this.A0P);
                } finally {
                    A03();
                }
            }
            A0A(this);
            if (this.A0H) {
                this.A0H = false;
                A05();
            }
            this.A0U.A02.values().removeAll(Collections.singleton((Object) null));
        }
    }

    public final void A0u(String str) {
        AnonymousClass1XK r0 = (AnonymousClass1XK) this.A0X.remove(str);
        if (r0 != null) {
            r0.A00.A06(r0.A01);
        }
        if (A0G(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing FragmentResultListener for key ");
            sb.append(str);
            Log.v("FragmentManager", sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0w(java.lang.String r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.util.Map r0 = r3.A0X
            java.lang.Object r2 = r0.get(r4)
            X.1XK r2 = (X.AnonymousClass1XK) r2
            if (r2 == 0) goto L_0x0041
            X.1Fx r1 = X.C23401Fx.STARTED
            X.1Fv r0 = r2.A00
            X.1Fw r0 = (X.C23391Fw) r0
            X.1Fx r0 = r0.A02
            boolean r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x0041
            r2.Bv0(r4, r5)
        L_0x001b:
            r0 = 2
            boolean r0 = A0G(r0)
            if (r0 == 0) goto L_0x0040
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Setting fragment result with key "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " and result "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r1)
        L_0x0040:
            return
        L_0x0041:
            java.util.Map r0 = r3.A0Y
            r0.put(r4, r5)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GP.A0w(java.lang.String, android.os.Bundle):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c9  */
    public void A0x(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r1 = "    "
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            X.1GR r3 = r6.A0U
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            java.util.HashMap r1 = r3.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x005a
            r9.print(r7)
            java.lang.String r0 = "Active Fragments:"
            r9.println(r0)
            java.util.Collection r0 = r1.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r1.next()
            X.1mr r0 = (X.C35821mr) r0
            r9.print(r7)
            if (r0 == 0) goto L_0x0054
            androidx.fragment.app.Fragment r0 = r0.A02
            r9.println(r0)
            r0.A1W(r2, r8, r9, r10)
            goto L_0x003a
        L_0x0054:
            java.lang.String r0 = "null"
            r9.println(r0)
            goto L_0x003a
        L_0x005a:
            java.util.ArrayList r4 = r3.A01
            int r3 = r4.size()
            if (r3 <= 0) goto L_0x008b
            r9.print(r7)
            java.lang.String r0 = "Added Fragments:"
            r9.println(r0)
            r2 = 0
        L_0x006b:
            java.lang.Object r1 = r4.get(r2)
            r9.print(r7)
            java.lang.String r0 = "  #"
            r9.print(r0)
            r9.print(r2)
            java.lang.String r0 = ": "
            r9.print(r0)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x008b
            goto L_0x006b
        L_0x008b:
            java.util.ArrayList r0 = r6.A0N
            r4 = 0
            if (r0 == 0) goto L_0x00c1
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x00c1
            r9.print(r7)
            java.lang.String r0 = "Fragments Created Menus:"
            r9.println(r0)
            r2 = 0
        L_0x009f:
            java.util.ArrayList r0 = r6.A0N
            java.lang.Object r1 = r0.get(r2)
            r9.print(r7)
            java.lang.String r0 = "  #"
            r9.print(r0)
            r9.print(r2)
            java.lang.String r0 = ": "
            r9.print(r0)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x00c1
            goto L_0x009f
        L_0x00c1:
            java.util.ArrayList r0 = r6.A0D
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x00fa
            r9.print(r7)
            java.lang.String r0 = "Back Stack:"
            r9.println(r0)
            r2 = 0
        L_0x00d2:
            java.util.ArrayList r0 = r6.A0D
            java.lang.Object r1 = r0.get(r2)
            X.1jj r1 = (X.C34001jj) r1
            r9.print(r7)
            java.lang.String r0 = "  #"
            r9.print(r0)
            r9.print(r2)
            java.lang.String r0 = ": "
            r9.print(r0)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            r0 = 1
            r1.A0G(r9, r5, r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x00fa
            goto L_0x00d2
        L_0x00fa:
            r9.print(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Back Stack Index: "
            r1.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0a
            int r0 = r0.get()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            java.util.ArrayList r3 = r6.A0V
            monitor-enter(r3)
            int r2 = r3.size()     // Catch:{ all -> 0x01b7 }
            if (r2 <= 0) goto L_0x0146
            r9.print(r7)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "Pending Actions:"
            r9.println(r0)     // Catch:{ all -> 0x01b7 }
        L_0x0128:
            java.lang.Object r1 = r3.get(r4)     // Catch:{ all -> 0x01b7 }
            X.1jh r1 = (X.C33981jh) r1     // Catch:{ all -> 0x01b7 }
            r9.print(r7)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "  #"
            r9.print(r0)     // Catch:{ all -> 0x01b7 }
            r9.print(r4)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = ": "
            r9.print(r0)     // Catch:{ all -> 0x01b7 }
            r9.println(r1)     // Catch:{ all -> 0x01b7 }
            int r4 = r4 + 1
            if (r4 >= r2) goto L_0x0146
            goto L_0x0128
        L_0x0146:
            monitor-exit(r3)     // Catch:{ all -> 0x01b7 }
            r9.print(r7)
            java.lang.String r0 = "FragmentManager misc state:"
            r9.println(r0)
            r9.print(r7)
            java.lang.String r0 = "  mHost="
            r9.print(r0)
            X.1GO r0 = r6.A08
            r9.println(r0)
            r9.print(r7)
            java.lang.String r0 = "  mContainer="
            r9.print(r0)
            X.1GM r0 = r6.A09
            r9.println(r0)
            androidx.fragment.app.Fragment r0 = r6.A06
            if (r0 == 0) goto L_0x017a
            r9.print(r7)
            java.lang.String r0 = "  mParent="
            r9.print(r0)
            androidx.fragment.app.Fragment r0 = r6.A06
            r9.println(r0)
        L_0x017a:
            r9.print(r7)
            java.lang.String r0 = "  mCurState="
            r9.print(r0)
            int r0 = r6.A00
            r9.print(r0)
            java.lang.String r0 = " mStateSaved="
            r9.print(r0)
            boolean r0 = r6.A0J
            r9.print(r0)
            java.lang.String r0 = " mStopped="
            r9.print(r0)
            boolean r0 = r6.A0K
            r9.print(r0)
            java.lang.String r0 = " mDestroyed="
            r9.print(r0)
            boolean r0 = r6.A0F
            r9.println(r0)
            boolean r0 = r6.A0I
            if (r0 == 0) goto L_0x01b6
            r9.print(r7)
            java.lang.String r0 = "  mNeedMenuInvalidate="
            r9.print(r0)
            boolean r0 = r6.A0I
            r9.println(r0)
        L_0x01b6:
            return
        L_0x01b7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01b7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GP.A0x(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public boolean A0z() {
        if (this.A0J || this.A0K) {
            return true;
        }
        return false;
    }

    public boolean A10(Menu menu) {
        boolean z = false;
        if (this.A00 >= 1) {
            for (Fragment fragment : this.A0U.A04()) {
                if (fragment != null && fragment.A1d() && fragment.A1f(menu)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        r5 = (com.whatsapp.ConversationFragment) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A11(android.view.Menu r8, android.view.MenuInflater r9) {
        /*
            r7 = this;
            int r1 = r7.A00
            r4 = 0
            r0 = 1
            if (r1 >= r0) goto L_0x0007
            return r4
        L_0x0007:
            X.1GR r0 = r7.A0U
            java.util.List r0 = r0.A04()
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
            r6 = 0
        L_0x0013:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r1 = r2.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L_0x0013
            boolean r0 = r1.A1d()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r1.A1g(r8, r9)
            if (r0 == 0) goto L_0x0013
            if (r3 != 0) goto L_0x0034
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0034:
            r3.add(r1)
            r6 = 1
            goto L_0x0013
        L_0x0039:
            java.util.ArrayList r0 = r7.A0N
            if (r0 == 0) goto L_0x0089
        L_0x003d:
            java.util.ArrayList r1 = r7.A0N
            int r0 = r1.size()
            if (r4 >= r0) goto L_0x0089
            java.lang.Object r5 = r1.get(r4)
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            if (r3 == 0) goto L_0x0053
            boolean r0 = r3.contains(r5)
            if (r0 != 0) goto L_0x0062
        L_0x0053:
            boolean r0 = r5 instanceof com.whatsapp.conversationslist.ConversationsFragment
            if (r0 == 0) goto L_0x0065
            com.whatsapp.conversationslist.ConversationsFragment r5 = (com.whatsapp.conversationslist.ConversationsFragment) r5
            androidx.appcompat.widget.Toolbar r1 = r5.A0N
            if (r1 == 0) goto L_0x0062
            android.graphics.drawable.Drawable r0 = r5.A06
            r1.setOverflowIcon(r0)
        L_0x0062:
            int r4 = r4 + 1
            goto L_0x003d
        L_0x0065:
            boolean r0 = r5 instanceof com.whatsapp.ConversationFragment
            if (r0 == 0) goto L_0x0062
            com.whatsapp.ConversationFragment r5 = (com.whatsapp.ConversationFragment) r5
            X.3tk r0 = r5.A02
            if (r0 == 0) goto L_0x0062
            X.4aY r0 = r0.A04
            androidx.appcompat.widget.Toolbar r0 = r0.A0f
            if (r0 == 0) goto L_0x0062
            android.view.Menu r2 = r0.getMenu()
            r1 = 0
            if (r2 == 0) goto L_0x007f
            com.whatsapp.ConversationFragment.A00(r2, r1, r5)
        L_0x007f:
            boolean r0 = r2 instanceof X.C003301m
            if (r0 == 0) goto L_0x0062
            X.01m r2 = (X.C003301m) r2
            r2.A0U(r1)
            goto L_0x0062
        L_0x0089:
            r7.A0N = r3
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GP.A11(android.view.Menu, android.view.MenuInflater):boolean");
    }

    public boolean A12(MenuItem menuItem) {
        if (this.A00 >= 1) {
            for (Fragment fragment : this.A0U.A04()) {
                if (fragment != null && fragment.A1h(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean A13(MenuItem menuItem) {
        if (this.A00 >= 1) {
            for (Fragment fragment : this.A0U.A04()) {
                if (fragment != null && fragment.A1i(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.A06;
        if (obj == null && (obj = this.A08) == null) {
            sb.append("null");
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            sb.append("}");
        }
        sb.append("}}");
        return sb.toString();
    }

    private void A04() {
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            C39461t7 r2 = (C39461t7) it.next();
            if (r2.A00) {
                if (A0G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                r2.A00 = false;
                r2.A07();
            }
        }
    }

    private void A06(Fragment fragment) {
        C35841mt r2;
        boolean z;
        ViewGroup A002 = A00(fragment);
        if (A002 != null && (r2 = fragment.A0D) != null && r2.A01 + r2.A02 + r2.A04 + r2.A05 > 0) {
            if (A002.getTag(2131436848) == null) {
                A002.setTag(2131436848, fragment);
            }
            Fragment fragment2 = (Fragment) A002.getTag(2131436848);
            C35841mt r0 = fragment.A0D;
            if (r0 == null) {
                z = false;
            } else {
                z = r0.A0F;
            }
            if (fragment2.A0D != null) {
                Fragment.A0K(fragment2).A0F = z;
            }
        }
    }

    public static void A09(AnonymousClass1GP r1) {
        Iterator it = r1.A01().iterator();
        while (it.hasNext()) {
            ((C39461t7) it.next()).A08();
        }
    }

    private void A0C(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new AnonymousClass2QX());
        AnonymousClass1GO r5 = this.A08;
        if (r5 != null) {
            try {
                r5.A04.dump("  ", (FileDescriptor) null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        } else {
            A0x("  ", (FileDescriptor) null, printWriter, new String[0]);
            throw runtimeException;
        }
    }

    private void A0D(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((C34001jj) arrayList.get(i)).A0G) {
                    if (i2 != i) {
                        A0E(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C34001jj) arrayList.get(i2)).A0G) {
                            i2++;
                        }
                    }
                    A0E(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                A0E(arrayList, arrayList2, i2, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public Fragment A0P(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment A002 = this.A0U.A00(string);
        if (A002 != null) {
            return A002;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment no longer exists for key ");
        sb.append(str);
        sb.append(": unique id ");
        sb.append(string);
        A0C(new IllegalStateException(sb.toString()));
        throw null;
    }

    public void A0o(Fragment fragment, boolean z) {
        ViewGroup A002 = A00(fragment);
        if (A002 != null && (A002 instanceof FragmentContainerView)) {
            ((FragmentContainerView) A002).A00 = !z;
        }
    }

    public final void A0t(AnonymousClass1XI r5, AnonymousClass1F9 r6, String str) {
        C23381Fv lifecycle = r6.getLifecycle();
        if (((C23391Fw) lifecycle).A02 != C23401Fx.DESTROYED) {
            AnonymousClass1XJ r2 = new AnonymousClass1XJ(this, r5, lifecycle, str);
            AnonymousClass1XK r0 = (AnonymousClass1XK) this.A0X.put(str, new AnonymousClass1XK(r5, lifecycle, r2));
            if (r0 != null) {
                r0.A00.A06(r0.A01);
            }
            if (A0G(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Setting FragmentResultListener with key ");
                sb.append(str);
                sb.append(" lifecycleOwner ");
                sb.append(lifecycle);
                sb.append(" and listener ");
                sb.append(r5);
                Log.v("FragmentManager", sb.toString());
            }
            lifecycle.A05(r2);
        }
    }

    public void A0y(boolean z) {
        A0F(z);
        while (true) {
            ArrayList arrayList = this.A0Q;
            ArrayList arrayList2 = this.A0P;
            ArrayList arrayList3 = this.A0V;
            synchronized (arrayList3) {
                if (arrayList3.isEmpty()) {
                    break;
                }
                try {
                    int size = arrayList3.size();
                    boolean z2 = false;
                    for (int i = 0; i < size; i++) {
                        z2 |= ((C33981jh) arrayList3.get(i)).BLr(arrayList, arrayList2);
                    }
                    if (!z2) {
                        break;
                    }
                    this.A0G = true;
                    try {
                        A0D(this.A0Q, this.A0P);
                    } finally {
                        A03();
                    }
                } finally {
                    arrayList3.clear();
                    this.A08.A02.removeCallbacks(this.A0B);
                }
            }
        }
        A0A(this);
        if (this.A0H) {
            this.A0H = false;
            A05();
        }
        this.A0U.A02.values().removeAll(Collections.singleton((Object) null));
    }
}
