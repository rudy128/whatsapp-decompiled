package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1jw  reason: invalid class name and case insensitive filesystem */
public class C34111jw implements C34101jv {
    public final Set A00 = new HashSet();
    public final Set A01 = new HashSet();
    public final Set A02 = new HashSet();

    public void A00(Activity activity, Menu menu) {
        int A002;
        boolean z;
        boolean z2;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < menu.size(); i4++) {
            MenuItem item = menu.getItem(i4);
            if (item.isVisible()) {
                if (this.A01.contains(Integer.valueOf(item.getItemId()))) {
                    i2++;
                    item.setShowAsAction(0);
                } else {
                    i3++;
                    item.setShowAsAction(2);
                }
            }
        }
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(2131165198);
        int min = (Math.min(activity.getWindow().getDecorView().getWidth(), activity.getWindow().getDecorView().getHeight()) - (dimensionPixelSize * 2)) - (activity.getResources().getDimensionPixelSize(2131165184) * 2);
        if (i2 > 0) {
            i = activity.getResources().getDimensionPixelSize(2131165199);
        }
        int i5 = min - i;
        if (i5 < i3 * dimensionPixelSize) {
            if (i2 == 0) {
                i5 -= activity.getResources().getDimensionPixelSize(2131165199);
            }
            int i6 = i3 - (i5 / dimensionPixelSize);
            if (i6 > 1 || i2 > 0) {
                for (int size = menu.size() - 1; size >= 0 && i6 > 0; size--) {
                    MenuItem item2 = menu.getItem(size);
                    if (item2.isVisible() && !this.A01.contains(Integer.valueOf(item2.getItemId())) && !this.A02.contains(Integer.valueOf(item2.getItemId()))) {
                        item2.setShowAsAction(1);
                        i6--;
                    }
                }
            }
        }
        if (menu instanceof C003301m) {
            C003301m r1 = (C003301m) menu;
            r1.A0F();
            if (C22891Dp.A05) {
                HashSet hashSet = new HashSet();
                r1.A0F();
                Iterator it = r1.A03.iterator();
                while (it.hasNext()) {
                    hashSet.add(Integer.valueOf(((AnonymousClass03G) it.next()).getItemId()));
                }
                for (int i7 = 0; i7 < menu.size(); i7++) {
                    MenuItem item3 = menu.getItem(i7);
                    Drawable icon = item3.getIcon();
                    if (icon != null && item3.isVisible()) {
                        if (hashSet.contains(Integer.valueOf(item3.getItemId()))) {
                            A002 = C19740yt.A00(activity, AnonymousClass1YL.A00(activity, 2130972007, 2131103383));
                            z = false;
                        } else {
                            A002 = C19740yt.A00(activity, 2131100148);
                            z = true;
                        }
                        Drawable mutate = C27831Xu.A02(icon).mutate();
                        C27831Xu.A0D(mutate, A002);
                        Set set = this.A00;
                        boolean contains = set.contains(Integer.valueOf(item3.getItemId()));
                        if (z) {
                            if (!contains) {
                                set.add(Integer.valueOf(item3.getItemId()));
                                z2 = false;
                            }
                            item3.setIcon(mutate);
                        } else {
                            if (contains) {
                                set.remove(Integer.valueOf(item3.getItemId()));
                                z2 = true;
                            }
                            item3.setIcon(mutate);
                        }
                        mutate = AnonymousClass4aX.A06(activity, mutate, z2);
                        item3.setIcon(mutate);
                    }
                }
            }
        }
    }

    public void BBi(int i) {
        this.A02.add(Integer.valueOf(i));
    }

    public void BBp(int i) {
        this.A01.add(Integer.valueOf(i));
    }
}
