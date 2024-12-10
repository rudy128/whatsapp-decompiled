package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.03G  reason: invalid class name */
public final class AnonymousClass03G implements C27721Xh {
    public char A00;
    public char A01;
    public C003301m A02;
    public int A03 = 16;
    public int A04 = 0;
    public int A05 = ZipDecompressor.UNZIP_BUFFER_SIZE;
    public int A06 = ZipDecompressor.UNZIP_BUFFER_SIZE;
    public int A07;
    public Intent A08;
    public ColorStateList A09 = null;
    public PorterDuff.Mode A0A = null;
    public Drawable A0B;
    public MenuItem.OnActionExpandListener A0C;
    public MenuItem.OnMenuItemClickListener A0D;
    public View A0E;
    public AnonymousClass068 A0F;
    public C60172nV A0G;
    public CharSequence A0H;
    public CharSequence A0I;
    public CharSequence A0J;
    public CharSequence A0K;
    public boolean A0L = false;
    public boolean A0M = false;
    public boolean A0N = false;
    public boolean A0O = false;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;

    public MenuItem setIcon(int i) {
        this.A0B = null;
        this.A04 = i;
        this.A0O = true;
        this.A02.A0Y(false);
        return this;
    }

    private Drawable A00(Drawable drawable) {
        if (drawable != null && this.A0O && (this.A0L || this.A0M)) {
            drawable = C27831Xu.A02(drawable).mutate();
            if (this.A0L) {
                C27831Xu.A03(this.A09, drawable);
            }
            if (this.A0M) {
                C27831Xu.A07(this.A0A, drawable);
            }
            this.A0O = false;
        }
        return drawable;
    }

    public String A03() {
        char c;
        int i;
        C003301m r1 = this.A02;
        if (r1.A0d()) {
            c = this.A00;
        } else {
            c = this.A01;
        }
        if (c == 0) {
            return "";
        }
        Context A022 = r1.A02();
        Resources resources = A022.getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(A022).hasPermanentMenuKey()) {
            sb.append(resources.getString(2131898659));
        }
        if (r1.A0d()) {
            i = this.A05;
        } else {
            i = this.A06;
        }
        String string = resources.getString(2131898655);
        if ((i & 65536) == 65536) {
            sb.append(string);
        }
        String string2 = resources.getString(2131898651);
        if ((i & ZipDecompressor.UNZIP_BUFFER_SIZE) == 4096) {
            sb.append(string2);
        }
        String string3 = resources.getString(2131898650);
        if ((i & 2) == 2) {
            sb.append(string3);
        }
        String string4 = resources.getString(2131898656);
        if ((i & 1) == 1) {
            sb.append(string4);
        }
        String string5 = resources.getString(2131898658);
        if ((i & 4) == 4) {
            sb.append(string5);
        }
        String string6 = resources.getString(2131898654);
        if ((i & 8) == 8) {
            sb.append(string6);
        }
        int i2 = 2131898652;
        if (c != 8) {
            i2 = 2131898653;
            if (c != 10) {
                if (c != ' ') {
                    sb.append(c);
                    return sb.toString();
                }
                i2 = 2131898657;
            }
        }
        sb.append(resources.getString(i2));
        return sb.toString();
    }

    public void A04() {
        this.A02.A0G();
    }

    public void A05(View view) {
        int i;
        this.A0E = view;
        this.A0G = null;
        if (view != null && view.getId() == -1 && (i = this.A0R) > 0) {
            view.setId(i);
        }
        this.A02.A0G();
    }

    public void A06(AnonymousClass068 r2) {
        this.A0F = r2;
        r2.setHeaderTitle(getTitle());
    }

    public void A07(boolean z) {
        this.A0N = z;
        this.A02.A0Y(false);
    }

    public void A08(boolean z) {
        int i = this.A03;
        int i2 = i & -3;
        int i3 = 0;
        if (z) {
            i3 = 2;
        }
        int i4 = i3 | i2;
        this.A03 = i4;
        if (i != i4) {
            this.A02.A0Y(false);
        }
    }

    public void A09(boolean z) {
        int i = this.A03 & -5;
        int i2 = 0;
        if (z) {
            i2 = 4;
        }
        this.A03 = i2 | i;
    }

    public void A0A(boolean z) {
        int i;
        int i2 = this.A03;
        if (z) {
            i = i2 | 32;
        } else {
            i = i2 & -33;
        }
        this.A03 = i;
    }

    public boolean A0B() {
        if ((this.A07 & 8) == 0) {
            return false;
        }
        if (this.A0E == null) {
            C60172nV r0 = this.A0G;
            if (r0 == null) {
                return false;
            }
            View A002 = r0.A00(this);
            this.A0E = A002;
            if (A002 != null) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean A0C() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.A0D;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            C003301m r2 = this.A02;
            if (!r2.A0g(this, r2)) {
                Intent intent = this.A08;
                if (intent != null) {
                    try {
                        r2.A02().startActivity(intent);
                        return true;
                    } catch (ActivityNotFoundException e) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    }
                }
                C60172nV r0 = this.A0G;
                if (r0 == null || !r0.A07()) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public boolean A0D() {
        if ((this.A03 & 32) == 32) {
            return true;
        }
        return false;
    }

    public boolean A0E() {
        if ((this.A03 & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean A0F() {
        if ((this.A07 & 1) != 1) {
            return false;
        }
        return true;
    }

    public boolean A0G() {
        if ((this.A07 & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean A0H() {
        return this.A02.A0b();
    }

    public boolean A0I() {
        char c;
        C003301m r1 = this.A02;
        if (r1.A0e()) {
            if (r1.A0d()) {
                c = this.A00;
            } else {
                c = this.A01;
            }
            if (c == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A0J() {
        if ((this.A07 & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean A0K(boolean z) {
        int i = this.A03;
        int i2 = i & -9;
        int i3 = 8;
        if (z) {
            i3 = 0;
        }
        int i4 = i3 | i2;
        this.A03 = i4;
        if (i != i4) {
            return true;
        }
        return false;
    }

    public void CIU(CharSequence charSequence) {
        this.A0H = charSequence;
        this.A02.A0Y(false);
    }

    public void CL0(C60172nV r3) {
        C60172nV r0 = this.A0G;
        if (r0 != null) {
            r0.A01();
        }
        this.A0E = null;
        this.A0G = r3;
        this.A02.A0Y(true);
        C60172nV r1 = this.A0G;
        if (r1 != null) {
            r1.A04(new C06340Xy(this));
        }
    }

    public void CL8(CharSequence charSequence) {
        this.A0K = charSequence;
        this.A02.A0Y(false);
    }

    public boolean collapseActionView() {
        if ((this.A07 & 8) != 0) {
            if (this.A0E == null) {
                return true;
            }
            MenuItem.OnActionExpandListener onActionExpandListener = this.A0C;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
                return this.A02.A0i(this);
            }
        }
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.A0E;
        if (view != null) {
            return view;
        }
        C60172nV r0 = this.A0G;
        if (r0 == null) {
            return null;
        }
        View A002 = r0.A00(this);
        this.A0E = A002;
        return A002;
    }

    public Drawable getIcon() {
        Drawable drawable = this.A0B;
        if (drawable == null) {
            int i = this.A04;
            if (i == 0) {
                return null;
            }
            drawable = AnonymousClass02D.A03().A09(this.A02.A02(), i);
            this.A04 = 0;
            this.A0B = drawable;
        }
        return A00(drawable);
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.A0J;
        if (charSequence == null) {
            return this.A0I;
        }
        return charSequence;
    }

    public boolean hasSubMenu() {
        if (this.A0F != null) {
            return true;
        }
        return false;
    }

    public boolean isCheckable() {
        if ((this.A03 & 1) != 1) {
            return false;
        }
        return true;
    }

    public boolean isChecked() {
        if ((this.A03 & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean isEnabled() {
        if ((this.A03 & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        C60172nV r0 = this.A0G;
        if (r0 == null || !r0.A08()) {
            if ((this.A03 & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.A03 & 8) != 0 || !this.A0G.A06()) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        Context A022 = this.A02.A02();
        A05(LayoutInflater.from(A022).inflate(i, new LinearLayout(A022), false));
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.A00 == c && this.A05 == i) {
            return this;
        }
        this.A00 = Character.toLowerCase(c);
        this.A05 = KeyEvent.normalizeMetaState(i);
        this.A02.A0Y(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.A03;
        boolean z2 = z | (i & true);
        this.A03 = z2 ? 1 : 0;
        if (i != z2) {
            this.A02.A0Y(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.A03 & 4) != 0) {
            this.A02.A0S(this);
            return this;
        }
        A08(z);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        int i;
        int i2 = this.A03;
        if (z) {
            i = i2 | 16;
        } else {
            i = i2 & -17;
        }
        this.A03 = i;
        this.A02.A0Y(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A09 = colorStateList;
        this.A0L = true;
        this.A0O = true;
        this.A02.A0Y(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A0A = mode;
        this.A0M = true;
        this.A0O = true;
        this.A02.A0Y(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.A01 == c && this.A06 == i) {
            return this;
        }
        this.A01 = c;
        this.A06 = KeyEvent.normalizeMetaState(i);
        this.A02.A0Y(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.A01 = c;
        this.A00 = Character.toLowerCase(c2);
        this.A02.A0Y(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.A07 = i;
            this.A02.A0G();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.A0I = charSequence;
        this.A02.A0Y(false);
        AnonymousClass068 r0 = this.A0F;
        if (r0 != null) {
            r0.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A0J = charSequence;
        this.A02.A0Y(false);
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.A0I;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public AnonymousClass03G(C003301m r3, CharSequence charSequence, int i, int i2, int i3, int i4, int i5) {
        this.A02 = r3;
        this.A0R = i2;
        this.A0Q = i;
        this.A0P = i3;
        this.A0S = i4;
        this.A0I = charSequence;
        this.A07 = i5;
    }

    public int A01() {
        return this.A0S;
    }

    public CharSequence A02(C008003p r2) {
        if (r2.CCE()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    public C60172nV BZt() {
        return this.A0G;
    }

    public boolean expandActionView() {
        MenuItem.OnActionExpandListener onActionExpandListener;
        if (!A0B() || ((onActionExpandListener = this.A0C) != null && !onActionExpandListener.onMenuItemActionExpand(this))) {
            return false;
        }
        return this.A02.A0j(this);
    }

    public int getAlphabeticModifiers() {
        return this.A05;
    }

    public char getAlphabeticShortcut() {
        return this.A00;
    }

    public CharSequence getContentDescription() {
        return this.A0H;
    }

    public int getGroupId() {
        return this.A0Q;
    }

    public ColorStateList getIconTintList() {
        return this.A09;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A0A;
    }

    public Intent getIntent() {
        return this.A08;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.A0R;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.A06;
    }

    public char getNumericShortcut() {
        return this.A01;
    }

    public int getOrder() {
        return this.A0P;
    }

    public SubMenu getSubMenu() {
        return this.A0F;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.A0I;
    }

    public CharSequence getTooltipText() {
        return this.A0K;
    }

    public boolean isActionViewExpanded() {
        return this.A0N;
    }

    public MenuItem setVisible(boolean z) {
        if (A0K(z)) {
            this.A02.A0H();
        }
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        CIU(charSequence);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.A08 = intent;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A0C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A0D = onMenuItemClickListener;
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        CL8(charSequence);
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        A05(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.A00 != c) {
            this.A00 = Character.toLowerCase(c);
            this.A02.A0Y(false);
        }
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.A04 = 0;
        this.A0B = drawable;
        this.A0O = true;
        this.A02.A0Y(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.A01 != c) {
            this.A01 = c;
            this.A02.A0Y(false);
        }
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A01 = c;
        this.A06 = KeyEvent.normalizeMetaState(i);
        this.A00 = Character.toLowerCase(c2);
        this.A05 = KeyEvent.normalizeMetaState(i2);
        this.A02.A0Y(false);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.A02.A02().getString(i));
        return this;
    }
}
