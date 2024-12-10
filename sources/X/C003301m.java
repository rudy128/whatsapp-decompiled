package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.01m  reason: invalid class name and case insensitive filesystem */
public class C003301m implements AnonymousClass1HG {
    public static final int[] A0P = {1, 4, 5, 3, 2, 0};
    public Drawable A00;
    public View A01;
    public CharSequence A02;
    public ArrayList A03;
    public ArrayList A04;
    public CopyOnWriteArrayList A05 = new CopyOnWriteArrayList();
    public boolean A06 = false;
    public int A07 = 0;
    public AnonymousClass01U A08;
    public AnonymousClass03G A09;
    public ArrayList A0A;
    public ArrayList A0B = new ArrayList();
    public ArrayList A0C;
    public boolean A0D = false;
    public boolean A0E;
    public boolean A0F = false;
    public boolean A0G;
    public boolean A0H = false;
    public boolean A0I;
    public boolean A0J = false;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M = false;
    public final Context A0N;
    public final Resources A0O;

    public C003301m A06() {
        return this;
    }

    public void A0G() {
        this.A0E = true;
        A0Y(true);
    }

    public void A0H() {
        this.A0G = true;
        A0Y(true);
    }

    public void A0I() {
        this.A07 = 1;
    }

    public void A0J() {
        this.A0J = false;
        if (this.A0H) {
            this.A0H = false;
            A0Y(this.A0M);
        }
    }

    public void A0L(int i) {
        A01((Drawable) null, (View) null, (CharSequence) null, 0, i);
    }

    public void A0M(int i) {
        A01((Drawable) null, (View) null, (CharSequence) null, i, 0);
    }

    public void A0O(Drawable drawable) {
        A01(drawable, (View) null, (CharSequence) null, 0, 0);
    }

    public void A0T(View view) {
        A01((Drawable) null, view, (CharSequence) null, 0, 0);
    }

    public void A0X(CharSequence charSequence) {
        A01((Drawable) null, (View) null, charSequence, 0, 0);
    }

    public boolean A0f(int i, MenuItem menuItem) {
        return A0h(menuItem, (C004001t) null, i);
    }

    public void clearHeader() {
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        A0Y(false);
    }

    public void close() {
        A0a(true);
    }

    public void removeGroup(int i) {
        int i2 = 0;
        int size = size();
        while (i2 < size) {
            ArrayList arrayList = this.A04;
            if (((AnonymousClass03G) arrayList.get(i2)).getGroupId() != i) {
                i2++;
            } else if (i2 >= 0) {
                int size2 = arrayList.size() - i2;
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    if (i3 >= size2 || ((AnonymousClass03G) arrayList.get(i2)).getGroupId() != i) {
                        A0Y(true);
                    } else {
                        if (i2 < arrayList.size()) {
                            arrayList.remove(i2);
                        }
                        i3 = i4;
                    }
                }
                A0Y(true);
                return;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (X.C28971bN.A06(r1, android.view.ViewConfiguration.get(r1)) != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.A0O
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.keyboard
            r2 = 1
            if (r0 == r2) goto L_0x001a
            android.content.Context r1 = r3.A0N
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r1)
            boolean r0 = X.C28971bN.A06(r1, r0)
            if (r0 == 0) goto L_0x001a
        L_0x0017:
            r3.A0L = r2
            return
        L_0x001a:
            r2 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C003301m.A00():void");
    }

    private void A01(Drawable drawable, View view, CharSequence charSequence, int i, int i2) {
        Resources resources = this.A0O;
        if (view != null) {
            this.A01 = view;
            this.A02 = null;
            this.A00 = null;
        } else {
            if (i > 0) {
                this.A02 = resources.getText(i);
            } else if (charSequence != null) {
                this.A02 = charSequence;
            }
            if (i2 > 0) {
                this.A00 = C19740yt.A04(this.A0N, i2);
            } else if (drawable != null) {
                this.A00 = drawable;
            }
            this.A01 = null;
        }
        A0Y(false);
    }

    public MenuItem A04(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3;
        int i6 = (-65536 & i3) >> 16;
        if (i6 >= 0) {
            int[] iArr = A0P;
            if (i6 < 6) {
                int i7 = (i3 & 65535) | (iArr[i6] << 16);
                AnonymousClass03G r3 = new AnonymousClass03G(this, charSequence, i, i2, i5, i7, this.A07);
                ArrayList arrayList = this.A04;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (((AnonymousClass03G) arrayList.get(size)).A01() <= i7) {
                            i4 = size + 1;
                            break;
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                arrayList.add(i4, r3);
                A0Y(true);
                return r3;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public AnonymousClass03G A08(KeyEvent keyEvent, int i) {
        char numericShortcut;
        ArrayList arrayList = this.A0B;
        arrayList.clear();
        A0R(keyEvent, arrayList, i);
        if (!arrayList.isEmpty()) {
            int metaState = keyEvent.getMetaState();
            KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
            keyEvent.getKeyData(keyData);
            int size = arrayList.size();
            if (size == 1) {
                return (AnonymousClass03G) arrayList.get(0);
            }
            boolean A0d = A0d();
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass03G r2 = (AnonymousClass03G) arrayList.get(i2);
                if (A0d) {
                    numericShortcut = r2.getAlphabeticShortcut();
                } else {
                    numericShortcut = r2.getNumericShortcut();
                }
                char[] cArr = keyData.meta;
                if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (A0d && numericShortcut == 8 && i == 67))) {
                    return r2;
                }
            }
        }
        return null;
    }

    public ArrayList A0D() {
        if (this.A0G) {
            ArrayList arrayList = this.A0C;
            arrayList.clear();
            ArrayList arrayList2 = this.A04;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass03G r1 = (AnonymousClass03G) arrayList2.get(i);
                if (r1.isVisible()) {
                    arrayList.add(r1);
                }
            }
            this.A0G = false;
            this.A0E = true;
        }
        return this.A0C;
    }

    public void A0E() {
        AnonymousClass01U r0 = this.A08;
        if (r0 != null) {
            r0.ByF(this);
        }
    }

    public void A0K() {
        if (!this.A0J) {
            this.A0J = true;
            this.A0H = false;
            this.A0M = false;
        }
    }

    public void A0N(Context context, C004001t r4) {
        this.A05.add(new WeakReference(r4));
        r4.BdO(context, this);
        this.A0E = true;
    }

    public void A0R(KeyEvent keyEvent, List list, int i) {
        char numericShortcut;
        int numericModifiers;
        boolean A0d = A0d();
        KeyEvent keyEvent2 = keyEvent;
        int modifiers = keyEvent2.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        int i2 = i;
        if (keyEvent2.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList = this.A04;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnonymousClass03G r2 = (AnonymousClass03G) arrayList.get(i3);
                List list2 = list;
                if (r2.hasSubMenu()) {
                    ((C003301m) r2.getSubMenu()).A0R(keyEvent2, list2, i2);
                }
                if (A0d) {
                    numericShortcut = r2.getAlphabeticShortcut();
                    numericModifiers = r2.getAlphabeticModifiers();
                } else {
                    numericShortcut = r2.getNumericShortcut();
                    numericModifiers = r2.getNumericModifiers();
                }
                if ((modifiers & 69647) == (numericModifiers & 69647) && numericShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (A0d && numericShortcut == 8 && i2 == 67)) && r2.isEnabled()) {
                        list2.add(r2);
                    }
                }
            }
        }
    }

    public void A0V(C004001t r2) {
        A0N(this.A0N, r2);
    }

    public void A0W(C004001t r5) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A05;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            Object obj = reference.get();
            if (obj == null || obj == r5) {
                copyOnWriteArrayList.remove(reference);
            }
        }
    }

    public void A0Y(boolean z) {
        if (!this.A0J) {
            if (z) {
                this.A0G = true;
                this.A0E = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.A05;
            if (!copyOnWriteArrayList.isEmpty()) {
                A0K();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    Reference reference = (Reference) it.next();
                    C004001t r0 = (C004001t) reference.get();
                    if (r0 == null) {
                        copyOnWriteArrayList.remove(reference);
                    } else {
                        r0.CQu(z);
                    }
                }
                A0J();
                return;
            }
            return;
        }
        this.A0H = true;
        if (z) {
            this.A0M = true;
        }
    }

    public final void A0a(boolean z) {
        if (!this.A0F) {
            this.A0F = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.A05;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C004001t r0 = (C004001t) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    r0.Bp9(this, z);
                }
            }
            this.A0F = false;
        }
    }

    public boolean A0g(MenuItem menuItem, C003301m r4) {
        AnonymousClass01U r0 = this.A08;
        if (r0 == null || !r0.ByE(menuItem, r4)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r7 != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        if ((r11 & 1) == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0091, code lost:
        if (r7 == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r3.A05() == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0h(android.view.MenuItem r9, X.C004001t r10, int r11) {
        /*
            r8 = this;
            X.03G r9 = (X.AnonymousClass03G) r9
            r1 = 0
            if (r9 == 0) goto L_0x0094
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x0094
            boolean r7 = r9.A0C()
            X.2nV r3 = r9.BZt()
            r6 = 1
            if (r3 == 0) goto L_0x001d
            boolean r0 = r3.A05()
            r2 = 1
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            boolean r0 = r9.A0B()
            if (r0 == 0) goto L_0x002f
            boolean r0 = r9.expandActionView()
            r7 = r7 | r0
            if (r7 == 0) goto L_0x002e
        L_0x002b:
            r8.A0a(r6)
        L_0x002e:
            return r7
        L_0x002f:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L_0x003c
            if (r2 != 0) goto L_0x003c
            r0 = r11 & 1
            if (r0 != 0) goto L_0x002e
            goto L_0x002b
        L_0x003c:
            r0 = r11 & 4
            if (r0 != 0) goto L_0x0043
            r8.A0a(r1)
        L_0x0043:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L_0x0053
            android.content.Context r1 = r8.A0N
            X.068 r0 = new X.068
            r0.<init>(r1, r8, r9)
            r9.A06(r0)
        L_0x0053:
            android.view.SubMenu r5 = r9.getSubMenu()
            X.068 r5 = (X.AnonymousClass068) r5
            if (r2 == 0) goto L_0x005e
            r3.A02(r5)
        L_0x005e:
            java.util.concurrent.CopyOnWriteArrayList r4 = r8.A05
            boolean r0 = r4.isEmpty()
            r3 = 0
            if (r0 != 0) goto L_0x0090
            if (r10 == 0) goto L_0x006d
            boolean r3 = r10.C7B(r5)
        L_0x006d:
            java.util.Iterator r2 = r4.iterator()
        L_0x0071:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r1 = r2.next()
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r0 = r1.get()
            X.01t r0 = (X.C004001t) r0
            if (r0 != 0) goto L_0x0089
            r4.remove(r1)
            goto L_0x0071
        L_0x0089:
            if (r3 != 0) goto L_0x0071
            boolean r3 = r0.C7B(r5)
            goto L_0x0071
        L_0x0090:
            r7 = r7 | r3
            if (r7 != 0) goto L_0x002e
            goto L_0x002b
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C003301m.A0h(android.view.MenuItem, X.01t, int):boolean");
    }

    public boolean A0i(AnonymousClass03G r6) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A05;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.A09 == r6) {
            A0K();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C004001t r0 = (C004001t) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    z = r0.BFB(r6);
                    if (z) {
                        break;
                    }
                }
            }
            A0J();
            if (z) {
                this.A09 = null;
            }
        }
        return z;
    }

    public boolean A0j(AnonymousClass03G r6) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A05;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty()) {
            A0K();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C004001t r0 = (C004001t) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    z = r0.BKu(r6);
                    if (z) {
                        break;
                    }
                }
            }
            A0J();
            if (z) {
                this.A09 = r6;
            }
        }
        return z;
    }

    public MenuItem add(int i) {
        return A04(0, 0, 0, this.A0O.getString(i));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        PackageManager packageManager = this.A0N.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[resolveInfo.specificIndex];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
        }
        return i5;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.A0O.getString(i));
    }

    public void clear() {
        AnonymousClass03G r0 = this.A09;
        if (r0 != null) {
            A0i(r0);
        }
        this.A04.clear();
        A0Y(true);
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.A04.get(i);
    }

    public boolean hasVisibleItems() {
        if (!this.A0I) {
            int size = size();
            int i = 0;
            while (i < size) {
                if (!((AnonymousClass03G) this.A04.get(i)).isVisible()) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.A04;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass03G r1 = (AnonymousClass03G) arrayList.get(i2);
            if (r1.getGroupId() == i) {
                r1.A09(z2);
                r1.setCheckable(z);
            }
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.A04;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass03G r1 = (AnonymousClass03G) arrayList.get(i2);
            if (r1.getGroupId() == i) {
                r1.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.A04;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass03G r1 = (AnonymousClass03G) arrayList.get(i2);
            if (r1.getGroupId() == i && r1.A0K(z)) {
                z2 = true;
            }
        }
        if (z2) {
            A0Y(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.A0K = z;
        A0Y(false);
    }

    public int size() {
        return this.A04.size();
    }

    public C003301m(Context context) {
        this.A0N = context;
        this.A0O = context.getResources();
        this.A04 = new ArrayList();
        this.A0C = new ArrayList();
        this.A0G = true;
        this.A03 = new ArrayList();
        this.A0A = new ArrayList();
        this.A0E = true;
        A00();
    }

    public Context A02() {
        return this.A0N;
    }

    public Drawable A03() {
        return this.A00;
    }

    public View A05() {
        return this.A01;
    }

    public AnonymousClass03G A07() {
        return this.A09;
    }

    public CharSequence A09() {
        return this.A02;
    }

    public String A0A() {
        return "android:menu:actionviewstates";
    }

    public ArrayList A0B() {
        A0F();
        return this.A03;
    }

    public ArrayList A0C() {
        A0F();
        return this.A0A;
    }

    public void A0F() {
        ArrayList A0D2 = A0D();
        if (this.A0E) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.A05;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C004001t r0 = (C004001t) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    z |= r0.BLO();
                }
            }
            if (z) {
                ArrayList arrayList = this.A03;
                arrayList.clear();
                ArrayList arrayList2 = this.A0A;
                arrayList2.clear();
                int size = A0D2.size();
                for (int i = 0; i < size; i++) {
                    AnonymousClass03G r2 = (AnonymousClass03G) A0D2.get(i);
                    ArrayList arrayList3 = arrayList2;
                    if (r2.A0D()) {
                        arrayList3 = arrayList;
                    }
                    arrayList3.add(r2);
                }
            } else {
                this.A03.clear();
                ArrayList arrayList4 = this.A0A;
                arrayList4.clear();
                arrayList4.addAll(A0D());
            }
            this.A0E = false;
        }
    }

    public void A0P(Bundle bundle) {
        MenuItem findItem;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(A0A());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((C003301m) item.getSubMenu()).A0P(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    public void A0Q(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C003301m) item.getSubMenu()).A0Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(A0A(), sparseArray);
        }
    }

    public void A0S(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        ArrayList arrayList = this.A04;
        int size = arrayList.size();
        A0K();
        for (int i = 0; i < size; i++) {
            AnonymousClass03G r1 = (AnonymousClass03G) arrayList.get(i);
            if (r1.getGroupId() == groupId && r1.A0E() && r1.isCheckable()) {
                boolean z = false;
                if (r1 == menuItem) {
                    z = true;
                }
                r1.A08(z);
            }
        }
        A0J();
    }

    public boolean A0b() {
        return this.A06;
    }

    public boolean A0c() {
        return this.A0D;
    }

    public boolean A0d() {
        return this.A0K;
    }

    public boolean A0e() {
        return this.A0L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r1 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.MenuItem findItem(int r5) {
        /*
            r4 = this;
            int r3 = r4.size()
            r2 = 0
        L_0x0005:
            if (r2 >= r3) goto L_0x0029
            java.util.ArrayList r0 = r4.A04
            java.lang.Object r1 = r0.get(r2)
            X.03G r1 = (X.AnonymousClass03G) r1
            int r0 = r1.getItemId()
            if (r0 == r5) goto L_0x0025
            boolean r0 = r1.hasSubMenu()
            if (r0 == 0) goto L_0x0026
            android.view.SubMenu r0 = r1.getSubMenu()
            android.view.MenuItem r1 = r0.findItem(r5)
            if (r1 == 0) goto L_0x0026
        L_0x0025:
            return r1
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0005
        L_0x0029:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C003301m.findItem(int):android.view.MenuItem");
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (A08(keyEvent, i) != null) {
            return true;
        }
        return false;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return A0h(findItem(i), (C004001t) null, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        AnonymousClass03G A082 = A08(keyEvent, i);
        if (A082 != null) {
            z = A0h(A082, (C004001t) null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            A0a(true);
        }
        return z;
    }

    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            ArrayList arrayList = this.A04;
            if (((AnonymousClass03G) arrayList.get(i2)).getItemId() != i) {
                i2++;
            } else if (i2 >= 0 && i2 < arrayList.size()) {
                arrayList.remove(i2);
                A0Y(true);
                return;
            } else {
                return;
            }
        }
    }

    public void A0U(AnonymousClass01U r1) {
        this.A08 = r1;
    }

    public void A0Z(boolean z) {
        this.A0I = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        this.A0D = z;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return A04(i, i2, i3, this.A0O.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        AnonymousClass03G r2 = (AnonymousClass03G) A04(i, i2, i3, charSequence);
        AnonymousClass068 r0 = new AnonymousClass068(this.A0N, this, r2);
        r2.A06(r0);
        return r0;
    }

    public MenuItem add(CharSequence charSequence) {
        return A04(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return A04(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.A0O.getString(i4));
    }
}
