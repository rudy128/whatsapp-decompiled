package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: X.067  reason: invalid class name */
public class AnonymousClass067 extends AnonymousClass0I5 implements MenuItem {
    public Method A00;
    public final C27721Xh A01;

    public void A01() {
        try {
            Method method = this.A00;
            if (method == null) {
                method = this.A01.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                this.A00 = method;
            }
            method.invoke(this.A01, new Object[]{true});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return this.A01.collapseActionView();
    }

    public boolean expandActionView() {
        return this.A01.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C60172nV BZt = this.A01.BZt();
        if (BZt instanceof AnonymousClass0Bh) {
            return ((AnonymousClass0Bh) BZt).A00;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.A01.getActionView();
        if (actionView instanceof AnonymousClass05W) {
            return (View) ((AnonymousClass05W) actionView).A00;
        }
        return actionView;
    }

    public int getAlphabeticModifiers() {
        return this.A01.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.A01.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.A01.getContentDescription();
    }

    public int getGroupId() {
        return this.A01.getGroupId();
    }

    public Drawable getIcon() {
        return this.A01.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.A01.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A01.getIconTintMode();
    }

    public Intent getIntent() {
        return this.A01.getIntent();
    }

    public int getItemId() {
        return this.A01.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.A01.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.A01.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.A01.getNumericShortcut();
    }

    public int getOrder() {
        return this.A01.getOrder();
    }

    public SubMenu getSubMenu() {
        return this.A01.getSubMenu();
    }

    public CharSequence getTitle() {
        return this.A01.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.A01.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.A01.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.A01.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.A01.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.A01.isCheckable();
    }

    public boolean isChecked() {
        return this.A01.isChecked();
    }

    public boolean isEnabled() {
        return this.A01.isEnabled();
    }

    public boolean isVisible() {
        return this.A01.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        AnonymousClass069 r1 = new AnonymousClass069(this.A01, actionProvider, this);
        C27721Xh r0 = this.A01;
        if (actionProvider == null) {
            r1 = null;
        }
        r0.CL0(r1);
        return this;
    }

    public MenuItem setActionView(int i) {
        C27721Xh r2 = this.A01;
        r2.setActionView(i);
        View actionView = r2.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            r2.setActionView((View) new AnonymousClass05W(actionView));
        }
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.A01.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.A01.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.A01.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.A01.CIU(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.A01.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.A01.setIcon(i);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A01.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A01.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.A01.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.A01.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        AnonymousClass0RV r0;
        C27721Xh r1 = this.A01;
        if (onActionExpandListener != null) {
            r0 = new AnonymousClass0RV(onActionExpandListener, this);
        } else {
            r0 = null;
        }
        r1.setOnActionExpandListener(r0);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        AnonymousClass0RW r0;
        C27721Xh r1 = this.A01;
        if (onMenuItemClickListener != null) {
            r0 = new AnonymousClass0RW(onMenuItemClickListener, this);
        } else {
            r0 = null;
        }
        r1.setOnMenuItemClickListener(r0);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.A01.setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.A01.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.A01.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.A01.setTitle(i);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A01.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.A01.CL8(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.A01.setVisible(z);
    }

    public AnonymousClass067(Context context, C27721Xh r3) {
        super(context);
        if (r3 != null) {
            this.A01 = r3;
            return;
        }
        throw AnonymousClass000.A0k("Wrapped Object can not be null.");
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new AnonymousClass05W(view);
        }
        this.A01.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.A01.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.A01.setIcon(drawable);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.A01.setNumericShortcut(c);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A01.setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.A01.setTitle(charSequence);
        return this;
    }
}
