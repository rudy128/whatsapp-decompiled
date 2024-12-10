package X;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.facebook.common.dextricks.StringTreeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.01C  reason: invalid class name */
public abstract class AnonymousClass01C extends AnonymousClass1FB implements AnonymousClass1FC, AnonymousClass1F9, AnonymousClass1FD, AnonymousClass1FE, AnonymousClass019, AnonymousClass1FF, AnonymousClass1FG, AnonymousClass01A, AnonymousClass1FH, AnonymousClass1FI, AnonymousClass1FJ, AnonymousClass01B {
    public static final String A0J = "android:support:activity-result";
    public static final AnonymousClass01F A0K = new Object();
    public int A00;
    public C24081Iu A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass01M A04;
    public final AnonymousClass01J A05;
    public final AnonymousClass01H A06;
    public final AnonymousClass1G8 A07;
    public final AnonymousClass1GA A08;
    public final CopyOnWriteArrayList A09;
    public final CopyOnWriteArrayList A0A;
    public final CopyOnWriteArrayList A0B;
    public final CopyOnWriteArrayList A0C;
    public final CopyOnWriteArrayList A0D;
    public final CopyOnWriteArrayList A0E;
    public final AtomicInteger A0F;
    public final C18100vl A0G;
    public final C18100vl A0H;
    public final C18100vl A0I;

    public static final Bundle A00(AnonymousClass01C r5) {
        C18070vi.A0d(r5, 0);
        Bundle bundle = new Bundle();
        AnonymousClass01M r3 = r5.A04;
        Map map = r3.A02;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(r3.A01));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(r3.A00));
        return bundle;
    }

    public static final void A04(AnonymousClass01C r2) {
        C18070vi.A0d(r2, 0);
        Bundle A002 = r2.BYX().A00(A0J);
        if (A002 != null) {
            r2.A04.A06(A002);
        }
    }

    public static final void A05(AnonymousClass01C r1) {
        C18070vi.A0d(r1, 0);
        r1.invalidateOptionsMenu();
    }

    public static final void A0B(AnonymousClass01C r1, AnonymousClass02V r2, C27581Wq r3) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(r1, 1);
        C18070vi.A0d(r3, 3);
        if (r3 == C27581Wq.ON_CREATE) {
            r2.A08(AnonymousClass0D2.A00(r1));
        }
    }

    public static final void A0D(AnonymousClass01C r1, C27581Wq r2) {
        Window window;
        View peekDecorView;
        C18070vi.A0d(r1, 0);
        C18070vi.A0d(r2, 2);
        if (r2 == C27581Wq.ON_STOP && (window = r1.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
            peekDecorView.cancelPendingInputEvents();
        }
    }

    public static final void A0E(AnonymousClass01C r2, C27581Wq r3) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(r3, 2);
        if (r3 == C27581Wq.ON_DESTROY) {
            r2.A06.A01 = null;
            if (!r2.isChangingConfigurations()) {
                r2.Bba().A00();
            }
            r2.A05.BAk();
        }
    }

    public final AnonymousClass02n A2G(AnonymousClass01M r3, AnonymousClass02j r4, C005302h r5) {
        C18070vi.A0d(r5, 0);
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        StringBuilder sb = new StringBuilder();
        sb.append("activity_rq#");
        sb.append(this.A0F.getAndIncrement());
        return r3.A03(r4, r5, this, sb.toString());
    }

    public final void A2L(AnonymousClass01Q r3) {
        C18070vi.A0d(r3, 0);
        AnonymousClass01H r1 = this.A06;
        if (r1.A01 != null) {
            r3.Bq7();
        }
        r1.A00.add(r3);
    }

    public final void A2M(AnonymousClass01Q r2) {
        C18070vi.A0d(r2, 0);
        this.A06.A00.remove(r2);
    }

    public final void A2N(AnonymousClass1GV r2) {
        C18070vi.A0d(r2, 0);
        this.A0B.add(r2);
    }

    public final void A2O(AnonymousClass1GV r2) {
        C18070vi.A0d(r2, 0);
        this.A0B.remove(r2);
    }

    public void A2P(AnonymousClass1GW r2, C23401Fx r3, AnonymousClass1F9 r4) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        this.A07.A05(r2, r3, r4);
    }

    public void A2Q(AnonymousClass1GW r2, AnonymousClass1F9 r3) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(r3, 1);
        this.A07.A06(r2, r3);
    }

    public final void A2R(Runnable runnable) {
        C18070vi.A0d(runnable, 0);
        this.A0E.add(runnable);
    }

    public final void A2S(Runnable runnable) {
        C18070vi.A0d(runnable, 0);
        this.A0E.remove(runnable);
    }

    public void BBL(AnonymousClass1GW r2) {
        C18070vi.A0d(r2, 0);
        this.A07.A03(r2);
    }

    public final void BBQ(AnonymousClass1GV r2) {
        C18070vi.A0d(r2, 0);
        this.A09.add(r2);
    }

    public final void BBS(AnonymousClass1GV r2) {
        C18070vi.A0d(r2, 0);
        this.A0A.add(r2);
    }

    public final void BBT(AnonymousClass1GV r2) {
        C18070vi.A0d(r2, 0);
        this.A0C.add(r2);
    }

    public final void BBW(AnonymousClass1GV r2) {
        C18070vi.A0d(r2, 0);
        this.A0D.add(r2);
    }

    public C24091Iv BQQ() {
        Bundle extras;
        C24101Iw r2 = new C24101Iw((C24091Iv) null, (AnonymousClass1Y1) null, 1);
        if (getApplication() != null) {
            AnonymousClass1GH r1 = C24131Iz.A02;
            Application application = getApplication();
            C18070vi.A0X(application);
            r2.A01(r1, application);
        }
        r2.A01(AnonymousClass1GG.A01, this);
        r2.A01(AnonymousClass1GG.A02, this);
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            r2.A01(AnonymousClass1GG.A00, extras);
        }
        return r2;
    }

    public final AnonymousClass02n CDw(AnonymousClass02j r2, C005302h r3) {
        C18070vi.A0d(r3, 0);
        C18070vi.A0d(r2, 1);
        return A2G(this.A04, r2, r3);
    }

    public void CEn(AnonymousClass1GW r2) {
        C18070vi.A0d(r2, 0);
        this.A07.A04(r2);
    }

    public final void CEp(AnonymousClass1GV r2) {
        C18070vi.A0d(r2, 0);
        this.A09.remove(r2);
    }

    public final void CEq(AnonymousClass1GV r2) {
        C18070vi.A0d(r2, 0);
        this.A0A.remove(r2);
    }

    public final void CEr(AnonymousClass1GV r2) {
        C18070vi.A0d(r2, 0);
        this.A0C.remove(r2);
    }

    public final void CEu(AnonymousClass1GV r2) {
        C18070vi.A0d(r2, 0);
        this.A0D.remove(r2);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1GV) it.next()).accept(configuration);
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        C18070vi.A0d(menu, 1);
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            this.A07.A02(menu, getMenuInflater());
        }
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        C18070vi.A0d(menuItem, 1);
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.A07.A07(menuItem);
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        C18070vi.A0d(configuration, 1);
        this.A02 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.A02 = false;
            Iterator it = this.A0A.iterator();
            while (it.hasNext()) {
                ((AnonymousClass1GV) it.next()).accept(new AnonymousClass4WQ(configuration));
            }
        } catch (Throwable th) {
            this.A02 = false;
            throw th;
        }
    }

    public void onNewIntent(Intent intent) {
        C18070vi.A0d(intent, 0);
        super.onNewIntent(intent);
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1GV) it.next()).accept(intent);
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        C18070vi.A0d(menu, 1);
        this.A07.A00(menu);
        super.onPanelClosed(i, menu);
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C18070vi.A0d(configuration, 1);
        this.A03 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.A03 = false;
            Iterator it = this.A0C.iterator();
            while (it.hasNext()) {
                ((AnonymousClass1GV) it.next()).accept(new AnonymousClass4WR(configuration));
            }
        } catch (Throwable th) {
            this.A03 = false;
            throw th;
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        C18070vi.A0d(menu, 2);
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.A07.A01(menu);
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C18070vi.A0d(strArr, 1);
        C18070vi.A0d(iArr, 2);
        if (!this.A04.A09(new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr), i, -1) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        if (getLifecycle() instanceof C23391Fw) {
            C23381Fv lifecycle = getLifecycle();
            C18070vi.A0z(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C23391Fw) lifecycle).A08(C23401Fx.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.A08.A03(bundle);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        C18070vi.A0d(intent, 0);
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        C18070vi.A0d(intentSender, 0);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    /* access modifiers changed from: private */
    public final void A03() {
        if (this.A01 == null) {
            AnonymousClass02T r0 = (AnonymousClass02T) getLastNonConfigurationInstance();
            if (r0 != null) {
                this.A01 = r0.A00();
            }
            if (this.A01 == null) {
                this.A01 = new C24081Iu();
            }
        }
    }

    public C04370My A2F() {
        return (C04370My) this.A0H.getValue();
    }

    public C24051Ir BQR() {
        return (C24051Ir) this.A0G.getValue();
    }

    public final AnonymousClass02V BVe() {
        return (AnonymousClass02V) this.A0I.getValue();
    }

    public final AnonymousClass1GB BYX() {
        return this.A08.A00();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.A04.A09(intent, i, i2)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        this.A08.A02(bundle);
        AnonymousClass01H r0 = this.A06;
        r0.A01 = this;
        for (AnonymousClass01Q Bq7 : r0.A00) {
            Bq7.Bq7();
        }
        super.onCreate(bundle);
        C27541Wm.A00(this);
        int i = this.A00;
        if (i != 0) {
            setContentView(i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.02T, java.lang.Object] */
    public final Object onRetainNonConfigurationInstance() {
        AnonymousClass02T r0;
        C24081Iu r1 = this.A01;
        if (r1 == null && ((r0 = (AnonymousClass02T) getLastNonConfigurationInstance()) == null || (r1 = r0.A00()) == null)) {
            return null;
        }
        ? obj = new Object();
        obj.A01(r1);
        return obj;
    }

    public AnonymousClass01C(int i) {
        this();
        this.A00 = i;
    }

    /* access modifiers changed from: private */
    public final void A0H(AnonymousClass02V r3) {
        getLifecycle().A05(new AnonymousClass0Y5(this, r3));
    }

    public void A2H() {
        getLastNonConfigurationInstance();
    }

    public void A2I() {
        View decorView = getWindow().getDecorView();
        C18070vi.A0X(decorView);
        AnonymousClass1ZG.A01(decorView, this);
        View decorView2 = getWindow().getDecorView();
        C18070vi.A0X(decorView2);
        ViewTreeViewModelStoreOwner.A01(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        C18070vi.A0X(decorView3);
        AnonymousClass1ZI.A01(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        C18070vi.A0X(decorView4);
        AnonymousClass03X.A00(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        C18070vi.A0X(decorView5);
        decorView5.setTag(2131434542, this);
    }

    public void A2J() {
        invalidateOptionsMenu();
    }

    public void A2K() {
    }

    public final AnonymousClass01M BMV() {
        return this.A04;
    }

    public C24081Iu Bba() {
        if (getApplication() != null) {
            A03();
            C24081Iu r0 = this.A01;
            C18070vi.A0b(r0);
            return r0;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A2I();
        AnonymousClass01J r1 = this.A05;
        View decorView = getWindow().getDecorView();
        C18070vi.A0X(decorView);
        r1.CRq(decorView);
        super.addContentView(view, layoutParams);
    }

    public C23381Fv getLifecycle() {
        return super.getLifecycle();
    }

    public void onBackPressed() {
        BVe().A07();
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.A0D.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1GV) it.next()).accept(Integer.valueOf(i));
        }
    }

    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public void reportFullyDrawn() {
        try {
            if (C24695CGh.A00()) {
                String str = "reportFullyDrawn() for ComponentActivity";
                if (str.length() > 127) {
                    str = str.substring(0, StringTreeSet.OFFSET_BASE_ENCODING);
                }
                Trace.beginSection(str);
            }
            super.reportFullyDrawn();
            A2F().A01();
        } finally {
            Trace.endSection();
        }
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A2I();
        AnonymousClass01J r1 = this.A05;
        View decorView = getWindow().getDecorView();
        C18070vi.A0X(decorView);
        r1.CRq(decorView);
        super.setContentView(view, layoutParams);
    }

    public void onMultiWindowModeChanged(boolean z) {
        if (!this.A02) {
            Iterator it = this.A0A.iterator();
            while (it.hasNext()) {
                ((AnonymousClass1GV) it.next()).accept(new AnonymousClass4WQ());
            }
        }
    }

    public void onPictureInPictureModeChanged(boolean z) {
        if (!this.A03) {
            Iterator it = this.A0C.iterator();
            while (it.hasNext()) {
                ((AnonymousClass1GV) it.next()).accept(new AnonymousClass4WR());
            }
        }
    }

    public void setContentView(int i) {
        A2I();
        AnonymousClass01J r1 = this.A05;
        View decorView = getWindow().getDecorView();
        C18070vi.A0X(decorView);
        r1.CRq(decorView);
        super.setContentView(i);
    }

    public void startActivityForResult(Intent intent, int i) {
        C18070vi.A0d(intent, 0);
        super.startActivityForResult(intent, i);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        C18070vi.A0d(intentSender, 0);
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public AnonymousClass01C() {
        this.A06 = new AnonymousClass01H();
        this.A07 = new AnonymousClass1G8(new AnonymousClass01I(this));
        AnonymousClass1GA A002 = AnonymousClass1G9.A00(this);
        this.A08 = A002;
        this.A05 = new AnonymousClass01K(this);
        this.A0H = AnonymousClass1DF.A01(new AnonymousClass01L(this));
        this.A0F = new AtomicInteger();
        this.A04 = new AnonymousClass01M(this);
        this.A09 = new CopyOnWriteArrayList();
        this.A0D = new CopyOnWriteArrayList();
        this.A0B = new CopyOnWriteArrayList();
        this.A0A = new CopyOnWriteArrayList();
        this.A0C = new CopyOnWriteArrayList();
        this.A0E = new CopyOnWriteArrayList();
        if (getLifecycle() != null) {
            getLifecycle().A05(new AnonymousClass0Y9(this, 0));
            getLifecycle().A05(new AnonymousClass0Y9(this, 1));
            getLifecycle().A05(new AnonymousClass0Y9(this, 2));
            A002.A01();
            AnonymousClass1GG.A01(this);
            if (Build.VERSION.SDK_INT <= 23) {
                getLifecycle().A05(new AnonymousClass0Y8(this));
            }
            BYX().A03(new AnonymousClass0YD(this, 0), A0J);
            A2L(new AnonymousClass0S4(this, 0));
            this.A0G = AnonymousClass1DF.A01(new AnonymousClass01R(this));
            this.A0I = AnonymousClass1DF.A01(new AnonymousClass01S(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public void setContentView(View view) {
        A2I();
        AnonymousClass01J r1 = this.A05;
        View decorView = getWindow().getDecorView();
        C18070vi.A0X(decorView);
        r1.CRq(decorView);
        super.setContentView(view);
    }
}
