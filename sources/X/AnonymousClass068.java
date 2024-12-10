package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.068  reason: invalid class name */
public class AnonymousClass068 extends C003301m implements SubMenu {
    public C003301m A00;
    public AnonymousClass03G A01;

    public C003301m A06() {
        return this.A00.A06();
    }

    public String A0A() {
        int itemId;
        AnonymousClass03G r0 = this.A01;
        if (r0 == null || (itemId = r0.getItemId()) == 0) {
            return null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("android:menu:actionviewstates");
        return AnonymousClass001.A1I(":", A10, itemId);
    }

    public void A0U(AnonymousClass01U r2) {
        this.A00.A0U(r2);
    }

    public boolean A0c() {
        return this.A00.A0c();
    }

    public boolean A0d() {
        return this.A00.A0d();
    }

    public boolean A0e() {
        return this.A00.A0e();
    }

    public boolean A0i(AnonymousClass03G r2) {
        return this.A00.A0i(r2);
    }

    public boolean A0j(AnonymousClass03G r2) {
        return this.A00.A0j(r2);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.A00.setGroupDividerEnabled(z);
    }

    public SubMenu setIcon(int i) {
        this.A01.setIcon(i);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.A00.setQwertyMode(z);
    }

    public AnonymousClass068(Context context, C003301m r2, AnonymousClass03G r3) {
        super(context);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean A0g(MenuItem menuItem, C003301m r4) {
        if (super.A0g(menuItem, r4) || this.A00.A0g(menuItem, r4)) {
            return true;
        }
        return false;
    }

    public C003301m A0k() {
        return this.A00;
    }

    public MenuItem getItem() {
        return this.A01;
    }

    public SubMenu setHeaderIcon(int i) {
        super.A0L(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.A0M(i);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.A0T(view);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.A0O(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.A0X(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.A01.setIcon(drawable);
        return this;
    }
}
