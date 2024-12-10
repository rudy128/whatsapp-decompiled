package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;

/* renamed from: X.01E  reason: invalid class name */
public class AnonymousClass01E extends AnonymousClass1FL implements AnonymousClass01D, AnonymousClass1FM {
    public static final String A02 = "androidx:appcompat";
    public Resources A00;
    public AnonymousClass013 A01;

    public static void A04() {
    }

    public static void A05() {
    }

    public static void A0B() {
    }

    @Deprecated
    public static void A0D() {
    }

    @Deprecated
    public static void A0E() {
    }

    @Deprecated
    public static void A0H() {
    }

    @Deprecated
    public void A2p() {
    }

    public void A2q() {
    }

    @Deprecated
    public void A2v(boolean z) {
    }

    public void C81(AnonymousClass02B r1) {
    }

    public void C82(AnonymousClass02B r1) {
    }

    private boolean A0I(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public AnonymousClass013 A2n() {
        AnonymousClass013 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        boolean z = AnonymousClass013.A02;
        AnonymousClass01V r02 = new AnonymousClass01V(this, (Window) null, this, this);
        this.A01 = r02;
        return r02;
    }

    public Resources getResources() {
        Resources resources = this.A00;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public AnonymousClass01E(int i) {
        super(i);
        A00();
    }

    private void A00() {
        BYX().A03(new AnonymousClass0YD(this, 1), A02);
        A2L(new AnonymousClass0S4(this, 1));
    }

    private void A03() {
        AnonymousClass1ZG.A01(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.A01(getWindow().getDecorView(), this);
        AnonymousClass1ZI.A01(getWindow().getDecorView(), this);
        AnonymousClass03X.A00(getWindow().getDecorView(), this);
    }

    public void A2X() {
        A2n().A0Z();
    }

    public Intent A2m() {
        return AnonymousClass1HK.A00(this);
    }

    public void A2o() {
        new C03170Gw((AnonymousClass01V) A2n());
    }

    public void A2r(int i) {
        A2n().A0d(i);
    }

    public boolean A2w() {
        Intent A2m = A2m();
        if (A2m == null) {
            return false;
        }
        if (shouldUpRecreateTask(A2m)) {
            C70533Bl A002 = C70533Bl.A00(this);
            A2u(A002);
            A002.A01();
            try {
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            navigateUpTo(A2m);
            return true;
        }
    }

    public AnonymousClass02B COJ(AnonymousClass02H r2) {
        return A2n().A0X(r2);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A03();
        A2n().A0g(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(A2n().A0V(context));
    }

    public void closeOptionsMenu() {
        C003401n supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.A03()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C003401n supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.A06(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public View findViewById(int i) {
        AnonymousClass01V r0 = (AnonymousClass01V) A2n();
        AnonymousClass01V.A0O(r0);
        return r0.A06.findViewById(i);
    }

    public MenuInflater getMenuInflater() {
        Context context;
        AnonymousClass01V r2 = (AnonymousClass01V) A2n();
        MenuInflater menuInflater = r2.A04;
        if (menuInflater != null) {
            return menuInflater;
        }
        AnonymousClass01V.A0P(r2);
        C003401n r0 = r2.A09;
        if (r0 != null) {
            context = r0.A0A();
        } else {
            context = r2.A0k;
        }
        AnonymousClass02C r1 = new AnonymousClass02C(context);
        r2.A04 = r1;
        return r1;
    }

    public C003401n getSupportActionBar() {
        AnonymousClass01V r0 = (AnonymousClass01V) A2n();
        AnonymousClass01V.A0P(r0);
        return r0.A09;
    }

    public void invalidateOptionsMenu() {
        A2n().A0Z();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A2n().A0a();
        if (this.A00 != null) {
            this.A00.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        A2p();
    }

    public void onDestroy() {
        super.onDestroy();
        A2n().A0c();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (A0I(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C003401n supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.A08() & 4) == 0) {
            return false;
        }
        return A2w();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        AnonymousClass01V.A0O((AnonymousClass01V) A2n());
    }

    public void onPostResume() {
        super.onPostResume();
        AnonymousClass01V r0 = (AnonymousClass01V) A2n();
        AnonymousClass01V.A0P(r0);
        C003401n r1 = r0.A09;
        if (r1 != null) {
            r1.A0Z(true);
        }
    }

    public void onStart() {
        super.onStart();
        AnonymousClass01V.A0Q((AnonymousClass01V) A2n(), true, false);
    }

    public void onStop() {
        super.onStop();
        AnonymousClass01V r0 = (AnonymousClass01V) A2n();
        AnonymousClass01V.A0P(r0);
        C003401n r1 = r0.A09;
        if (r1 != null) {
            r1.A0Z(false);
        }
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        A2n().A0j(charSequence);
    }

    public void openOptionsMenu() {
        C003401n supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.A05()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A03();
        A2n().A0h(view, layoutParams);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        A2n().A0i(toolbar);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        ((AnonymousClass01V) A2n()).A03 = i;
    }

    public void A2s(Intent intent) {
        navigateUpTo(intent);
    }

    public void A2t(Intent intent) {
        shouldUpRecreateTask(intent);
    }

    public void A2u(C70533Bl r1) {
        r1.A02(this);
    }

    public AnonymousClass01E() {
        A00();
    }

    public void setContentView(int i) {
        A03();
        A2n().A0e(i);
    }

    public void setContentView(View view) {
        A03();
        A2n().A0f(view);
    }
}
