package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.dialogs.ProgressDialogFragment;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1FY  reason: invalid class name */
public class AnonymousClass1FY extends AnonymousClass1FV implements AnonymousClass1FW, AnonymousClass1FX {
    public int A00 = 0;
    public AnonymousClass1L9 A01;
    public AnonymousClass11S A02;
    public AnonymousClass1LC A03;
    public AnonymousClass1L7 A04;
    public AnonymousClass11P A05;
    public AnonymousClass1DQ A06;
    public AnonymousClass1CM A07;
    public AnonymousClass1LD A08;
    public AnonymousClass1L4 A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public boolean A0D = false;
    public boolean A0E = true;
    public boolean A0F;
    public final C23461Gj A0G = new Object();
    public final Set A0H = new CopyOnWriteArraySet();

    private void A03() {
        AnonymousClass1LU.A0B(this, 1);
    }

    public static boolean A0W(KeyEvent keyEvent, AnonymousClass1FY r2, int i) {
        if (i == 4) {
            r2.A0F = false;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void A49() {
    }

    public void A4U(List list) {
        CPW(list, 1);
    }

    public boolean A4X() {
        return false;
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.A0F = true;
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    public void A3K() {
        ((C30361do) ((AnonymousClass2ZQ) this.A0B.get()).A00.get()).A01();
    }

    public void A4H() {
        if (Build.VERSION.SDK_INT >= 35) {
            getTheme().applyStyle(2132083496, false);
        }
    }

    public void A4J() {
        int A002 = this.A07.A00(false);
        AnonymousClass11S r0 = this.A02;
        r0.A0I();
        if (r0.A00 == null && A002 == 11 && !isFinishing()) {
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), "com.whatsapp.migration.export.ui.ExportMigrationDataExportedActivity");
            intent.setFlags(33554432);
            startActivity(intent);
            finish();
        }
    }

    public void A4K() {
        if (this.A06.BRw() == 1 || this.A06.BRw() == 4 || this.A06.BRw() == 3) {
            Intent A0B2 = AnonymousClass1LU.A0B(this, 1);
            finish();
            startActivity(A0B2);
        } else if (this.A06.BRw() == 0) {
            AnonymousClass1DQ r2 = this.A06;
            ((AnonymousClass1DP) r2).A00.A0A(this, new C65022vi(this, 1));
        }
    }

    public /* synthetic */ void A4M() {
        C19830z4.A00(this.A0A).putBoolean("smb_client_viewed_eu_tos_update", true).apply();
        this.A01.A08(this, new Intent("android.intent.action.VIEW", this.A03.A00(((SharedPreferences) this.A0A.A00.get()).getString("smb_eu_tos_update_url", (String) null))));
    }

    public void A4P(C107045Ye r3) {
        synchronized (this.A0H) {
            this.A0H.add(r3);
        }
    }

    public void A4Q(C107045Ye r3) {
        synchronized (this.A0H) {
            this.A0H.remove(r3);
        }
    }

    public void A4S(Object obj) {
        C23461Gj r1 = this.A0G;
        synchronized (r1) {
            C18070vi.A0d(obj, 0);
            IdentityHashMap identityHashMap = r1.A00;
            if (identityHashMap != null) {
                identityHashMap.get(obj);
            }
        }
    }

    public void A4T(Object obj, Object obj2) {
        C23461Gj r1 = this.A0G;
        synchronized (r1) {
            C18070vi.A0d(obj, 0);
            C18070vi.A0d(obj2, 1);
            IdentityHashMap identityHashMap = r1.A00;
            if (identityHashMap == null) {
                identityHashMap = new IdentityHashMap();
                r1.A00 = identityHashMap;
            }
            identityHashMap.put(obj, obj2);
        }
    }

    public boolean A4W() {
        return ((AnonymousClass1XL) this.A0A.get()).A04();
    }

    public boolean A4Y(int i, KeyEvent keyEvent) {
        if (i != 82 || !this.A0F) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public void CPW(List list, int i) {
        int i2;
        boolean contains = list.contains(C29671cg.A00);
        if (list.size() == 1) {
            i2 = 2131895752;
            if (contains) {
                i2 = 2131895760;
            }
        } else {
            i2 = 2131895756;
            if (contains) {
                i2 = 2131895757;
            }
        }
        this.A05.A08(i2, i);
    }

    public AnonymousClass11Z getStorageUtils() {
        return (AnonymousClass11Z) this.A0C.get();
    }

    public void onDestroy() {
        this.A0H.clear();
        super.onDestroy();
    }

    public void setTheme(int i) {
        this.A00 = i;
        super.setTheme(i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1Gj, java.lang.Object] */
    @Deprecated
    public AnonymousClass1FY(int i) {
        super(i);
    }

    private void A0Q() {
        getResources().getConfiguration().fontScale = getApplicationContext().getResources().getConfiguration().fontScale;
        getResources().updateConfiguration(getResources().getConfiguration(), getResources().getDisplayMetrics());
    }

    private boolean A0V() {
        if (getApplicationContext().getResources().getConfiguration().fontScale == getResources().getConfiguration().fontScale) {
            return true;
        }
        return false;
    }

    public void A3I() {
        if (!A4X()) {
            A3K();
        }
    }

    public Dialog A48(int i) {
        return super.onCreateDialog(i);
    }

    public void A4A() {
    }

    public void A4B() {
    }

    public void A4C() {
    }

    public void A4D() {
        super.onBackPressed();
    }

    public void A4E() {
        super.onResume();
    }

    public void A4F() {
        super.onStart();
    }

    @Deprecated
    public void A4G() {
    }

    public void A4I() {
    }

    public void A4L() {
    }

    public /* synthetic */ void A4R(Integer num) {
        if (num.intValue() == 1) {
            Intent A0B2 = AnonymousClass1LU.A0B(this, 1);
            finish();
            startActivity(A0B2);
        }
    }

    public void A4V(boolean z) {
        this.A0E = z;
    }

    public boolean A4Z(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean A4a(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    public /* synthetic */ C18180vt BYS() {
        return C19620yd.A03;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addContentView(view, layoutParams);
        this.A0D = true;
    }

    public AnonymousClass1L9 getActivityUtils() {
        return this.A01;
    }

    public AnonymousClass1L4 getImeUtils() {
        return this.A09;
    }

    public AnonymousClass11S getMeManager() {
        return this.A02;
    }

    public AnonymousClass1CM getRegistrationStateManager() {
        return this.A07;
    }

    public AnonymousClass1LD getScreenLockStateProvider() {
        return this.A08;
    }

    public AnonymousClass11P getTime() {
        return this.A05;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        synchronized (this.A0H) {
            for (C107045Ye r0 : this.A0H) {
                if (r0 != null) {
                    r0.Bky(intent, i, i2);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (!A0V()) {
            A0Q();
        }
        A4H();
        super.onCreate(bundle);
        C23451Gc r2 = this.A0T;
        if (C23451Gc.A02) {
            r2.A00 = (ProgressDialogFragment) r2.A01.A03.A00.A03.A0Q(C23451Gc.A03);
        }
        ((AnonymousClass1XL) this.A0A.get()).A01(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return A4Y(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return A0W(keyEvent, this, i);
    }

    public void onResume() {
        super.onResume();
        if (!A4W()) {
            return;
        }
        if (((AnonymousClass1XL) this.A0A.get()).A06()) {
            Intent className = new Intent().setClassName(getPackageName(), "com.whatsapp.authentication.AppAuthenticationActivity");
            className.setFlags(A7Y.A0F);
            CNh(className, 202);
            overridePendingTransition(0, 0);
            return;
        }
        ((AnonymousClass1XL) this.A0A.get()).A02(false);
    }

    public void onStart() {
        super.onStart();
        A4K();
        A4J();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        this.A0D = true;
    }

    public void A4N(KeyEvent keyEvent, int i) {
        A4Y(i, keyEvent);
    }

    public void A4O(KeyEvent keyEvent, int i) {
        A0W(keyEvent, this, i);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1Gj, java.lang.Object] */
    public AnonymousClass1FY() {
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        this.A0D = true;
    }

    public void setContentView(View view) {
        super.setContentView(view);
        this.A0D = true;
    }
}
