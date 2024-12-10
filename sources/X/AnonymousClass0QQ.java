package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: X.0QQ  reason: invalid class name */
public class AnonymousClass0QQ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ColorStateList A06 = null;
    public PorterDuff.Mode A07 = null;
    public Menu A08;
    public C60172nV A09;
    public CharSequence A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public char A0E;
    public char A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public CharSequence A0M;
    public CharSequence A0N;
    public CharSequence A0O;
    public String A0P;
    public String A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final /* synthetic */ AnonymousClass02C A0U;

    public AnonymousClass0QQ(Menu menu, AnonymousClass02C r3) {
        this.A0U = r3;
        this.A08 = menu;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A0C = true;
        this.A0B = true;
    }

    private Object A00(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.A0U.A00.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", AnonymousClass001.A1H("Cannot instantiate class: ", str, AnonymousClass000.A10()), e);
            return null;
        }
    }

    public static void A01(PorterDuff.Mode mode, MenuItem menuItem) {
        if (menuItem instanceof C27721Xh) {
            ((C27721Xh) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C20116A7z.A02(mode, menuItem);
        }
    }

    public static void A02(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C27721Xh) {
            ((C27721Xh) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C20116A7z.A03(menuItem, c, i);
        }
    }

    public static void A03(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C27721Xh) {
            ((C27721Xh) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C20116A7z.A04(menuItem, c, i);
        }
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [android.view.MenuItem$OnMenuItemClickListener, java.lang.Object, X.0RX] */
    public static void A04(MenuItem menuItem, AnonymousClass0QQ r8) {
        MenuItem enabled = menuItem.setChecked(r8.A0R).setVisible(r8.A0T).setEnabled(r8.A0S);
        boolean z = false;
        boolean z2 = false;
        if (r8.A0I >= 1) {
            z2 = true;
        }
        enabled.setCheckable(z2).setTitleCondensed(r8.A0N).setIcon(r8.A0J);
        int i = r8.A0L;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (r8.A0Q != null) {
            AnonymousClass02C r2 = r8.A0U;
            Context context = r2.A00;
            if (!context.isRestricted()) {
                Object obj = r2.A01;
                if (obj == null) {
                    obj = AnonymousClass02C.A00(r2, context);
                    r2.A01 = obj;
                }
                String str = r8.A0Q;
                ? obj2 = new Object();
                obj2.A00 = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.A01 = cls.getMethod(str, AnonymousClass0RX.A02);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Couldn't resolve menu item onClick handler ");
                    A10.append(str);
                    A10.append(" in class ");
                    InflateException inflateException = new InflateException(AnonymousClass000.A0y(cls.getName(), A10));
                    inflateException.initCause(e);
                    throw inflateException;
                }
            } else {
                throw AnonymousClass000.A0n("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (r8.A0I >= 2) {
            if (menuItem instanceof AnonymousClass03G) {
                ((AnonymousClass03G) menuItem).A09(true);
            } else if (menuItem instanceof AnonymousClass067) {
                ((AnonymousClass067) menuItem).A01();
            }
        }
        String str2 = r8.A0P;
        if (str2 != null) {
            menuItem.setActionView((View) r8.A00(str2, AnonymousClass02C.A05, r8.A0U.A03));
            z = true;
        }
        int i2 = r8.A0G;
        if (i2 > 0) {
            if (!z) {
                menuItem.setActionView(i2);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        C60172nV r0 = r8.A09;
        if (r0 != null) {
            A05(menuItem, r0);
        }
        A3C.A02(menuItem, r8.A0M);
        A06(menuItem, r8.A0O);
        A02(menuItem, r8.A0E, r8.A0H);
        A03(menuItem, r8.A0F, r8.A0K);
        PorterDuff.Mode mode = r8.A07;
        if (mode != null) {
            A01(mode, menuItem);
        }
        ColorStateList colorStateList = r8.A06;
        if (colorStateList != null) {
            A3C.A01(colorStateList, menuItem);
        }
    }

    public static void A05(MenuItem menuItem, C60172nV r2) {
        if (menuItem instanceof C27721Xh) {
            ((C27721Xh) menuItem).CL0(r2);
        } else {
            Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        }
    }

    public static void A06(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C27721Xh) {
            ((C27721Xh) menuItem).CL8(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C20116A7z.A06(menuItem, charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.util.AttributeSet r9) {
        /*
            r8 = this;
            X.02C r7 = r8.A0U
            android.content.Context r1 = r7.A00
            int[] r0 = X.C002501d.A0G
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r9, r0)
            X.01c r5 = new X.01c
            r5.<init>(r1, r0)
            r4 = 0
            r0 = 2
            android.content.res.TypedArray r3 = r5.A02
            int r0 = r3.getResourceId(r0, r4)
            r8.A05 = r0
            int r1 = r8.A00
            r0 = 5
            int r2 = r3.getInt(r0, r1)
            int r1 = r8.A03
            r0 = 6
            int r1 = r3.getInt(r0, r1)
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r0
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r2 = r2 | r1
            r8.A04 = r2
            r0 = 7
            java.lang.CharSequence r0 = r3.getText(r0)
            r8.A0A = r0
            r0 = 8
            java.lang.CharSequence r0 = r3.getText(r0)
            r8.A0N = r0
            int r0 = r3.getResourceId(r4, r4)
            r8.A0J = r0
            r0 = 9
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L_0x012e
            r0 = 0
        L_0x004f:
            r8.A0E = r0
            r0 = 16
            r1 = 4096(0x1000, float:5.74E-42)
            int r0 = r3.getInt(r0, r1)
            r8.A0H = r0
            r0 = 10
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L_0x0128
            r0 = 0
        L_0x0064:
            r8.A0F = r0
            r0 = 20
            int r0 = r3.getInt(r0, r1)
            r8.A0K = r0
            r0 = 11
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x0124
            r0 = 11
            boolean r0 = r3.getBoolean(r0, r4)
        L_0x007c:
            r8.A0I = r0
            r0 = 3
            boolean r0 = r3.getBoolean(r0, r4)
            r8.A0R = r0
            boolean r1 = r8.A0C
            r0 = 4
            boolean r0 = r3.getBoolean(r0, r1)
            r8.A0T = r0
            boolean r1 = r8.A0B
            r0 = 1
            boolean r0 = r3.getBoolean(r0, r1)
            r8.A0S = r0
            r1 = 21
            r0 = -1
            int r0 = r3.getInt(r1, r0)
            r8.A0L = r0
            r0 = 12
            java.lang.String r0 = r3.getString(r0)
            r8.A0Q = r0
            r0 = 13
            int r0 = r3.getResourceId(r0, r4)
            r8.A0G = r0
            r0 = 15
            java.lang.String r0 = r3.getString(r0)
            r8.A0P = r0
            r0 = 14
            java.lang.String r6 = r3.getString(r0)
            boolean r0 = X.AnonymousClass000.A1W(r6)
            r2 = 0
            if (r0 == 0) goto L_0x0121
            int r0 = r8.A0G
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = r8.A0P
            if (r0 != 0) goto L_0x011a
            java.lang.Class[] r1 = X.AnonymousClass02C.A04
            java.lang.Object[] r0 = r7.A02
            java.lang.Object r0 = r8.A00(r6, r1, r0)
            X.2nV r0 = (X.C60172nV) r0
            r8.A09 = r0
        L_0x00d9:
            r0 = 17
            java.lang.CharSequence r0 = r3.getText(r0)
            r8.A0M = r0
            r0 = 22
            java.lang.CharSequence r0 = r3.getText(r0)
            r8.A0O = r0
            r0 = 19
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x0117
            r1 = 19
            r0 = -1
            int r1 = r3.getInt(r1, r0)
            android.graphics.PorterDuff$Mode r0 = r8.A07
            android.graphics.PorterDuff$Mode r0 = X.C005902p.A00(r0, r1)
            r8.A07 = r0
        L_0x0100:
            r1 = 18
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x0114
            android.content.res.ColorStateList r0 = r5.A01(r1)
            r8.A06 = r0
        L_0x010e:
            r3.recycle()
            r8.A0D = r4
            return
        L_0x0114:
            r8.A06 = r2
            goto L_0x010e
        L_0x0117:
            r8.A07 = r2
            goto L_0x0100
        L_0x011a:
            java.lang.String r1 = "SupportMenuInflater"
            java.lang.String r0 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
            android.util.Log.w(r1, r0)
        L_0x0121:
            r8.A09 = r2
            goto L_0x00d9
        L_0x0124:
            int r0 = r8.A01
            goto L_0x007c
        L_0x0128:
            char r0 = r0.charAt(r4)
            goto L_0x0064
        L_0x012e:
            char r0 = r0.charAt(r4)
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QQ.A07(android.util.AttributeSet):void");
    }
}
