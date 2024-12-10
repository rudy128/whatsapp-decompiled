package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.TypedValue;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.android.di.BaseEntryPoint;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.topbar.WDSToolbar;

/* renamed from: X.1FP  reason: invalid class name */
public abstract class AnonymousClass1FP extends AnonymousClass1FO {
    public C18000vb A00;
    public C18030ve A01;
    public AnonymousClass1Bd A02;
    public AnonymousClass19T A03;
    public AnonymousClass1DC A04;
    public AnonymousClass10I A05;
    public boolean A06 = true;
    public boolean A07 = true;
    public MessageQueue.IdleHandler A08 = null;
    public Toolbar A09;
    public C17990va A0A;
    public AnonymousClass286 A0B;
    public boolean A0C;
    public boolean A0D = true;
    public AnonymousClass1H3 A0E;
    public AnonymousClass19Y A0F;
    public AnonymousClass00H A0G;

    public void A3H() {
    }

    public void A3I() {
    }

    public void A3K() {
    }

    public void startActivityForResult(Intent intent, int i) {
        if (i != -1) {
            if (!C18050vg.A04(intent)) {
                C18070vi.A0d(intent, 1);
            }
            if (C18020vd.A05(C18040vf.A02, this.A01, 5831)) {
                C138116wY r4 = (C138116wY) this.A0G.get();
                String name = getClass().getName();
                C18070vi.A0d(name, 0);
                C18070vi.A0d(intent, 1);
                r4.A00.execute(new C146887Qz(r4, intent, name, 30));
            }
        }
        super.startActivityForResult(intent, i);
    }

    private void A00() {
        AnonymousClass286 r1 = this.A0B;
        if (r1 != null && this.A08 != null && r1.A0X()) {
            r1.A0W(false);
            Looper.myQueue().addIdleHandler(this.A08);
        }
    }

    private void A03() {
        AnonymousClass286 r1 = this.A0B;
        if (r1 != null && this.A08 != null) {
            r1.A0W(true);
            Looper.myQueue().removeIdleHandler(this.A08);
        }
    }

    public static void A0I(AnonymousClass1FP r4) {
        if (r4.A0B != null && !r4.isFinishing()) {
            AnonymousClass286 r1 = r4.A0B;
            if (r1.A0X()) {
                r1.A0U();
                new Handler(Looper.getMainLooper()).postDelayed(new C70613Bu(r4, 3), (long) r4.A0B.A0T());
            }
        }
    }

    public /* synthetic */ void A3L() {
        if (!this.A0B.A0Y() && this.A08 != null) {
            Looper.myQueue().addIdleHandler(this.A08);
        }
    }

    public void A3O(boolean z) {
        this.A0D = z;
        if (z) {
            Toolbar toolbar = this.A09;
            if ((toolbar instanceof WDSToolbar) && C22891Dp.A02) {
                C28261Zr.A00(getWindow(), toolbar);
            }
        }
    }

    public /* synthetic */ boolean A3R() {
        this.A05.CGN(new C70613Bu(this, 2));
        return false;
    }

    public /* synthetic */ boolean A3S() {
        this.A05.CGN(new C70613Bu(this, 4));
        return false;
    }

    public AnonymousClass02B COJ(AnonymousClass02H r3) {
        if ((this.A09 instanceof WDSToolbar) && C22891Dp.A02) {
            r3 = new C64822vO(r3, C19740yt.A00(this, AnonymousClass1YL.A00(this, 2130969117, AnonymousClass1YL.A00(this, 2130971957, 2131103410))));
        }
        return super.COJ(r3);
    }

    public void attachBaseContext(Context context) {
        BaseEntryPoint baseEntryPoint = (BaseEntryPoint) AnonymousClass00E.A00(context, C000100c.class);
        this.A01 = baseEntryPoint.BAL();
        this.A00 = baseEntryPoint.CS9();
        AnonymousClass10E r1 = (AnonymousClass10E) baseEntryPoint;
        AnonymousClass10G r2 = r1.Ao8.A00;
        AnonymousClass1H4 r6 = new AnonymousClass1H4((C18000vb) r2.AJU.ABz.get());
        this.A0E = r6;
        super.attachBaseContext(new AnonymousClass1H5(context, r6, this.A00, this.A01, C000200d.A00(r1.A9s)));
        this.A02 = baseEntryPoint.COS();
        this.A04 = (AnonymousClass1DC) r1.A95.get();
        C222119a r12 = this.A00.A01;
        this.A03 = r12.A07;
        this.A0F = r12.A06;
        this.A0G = C000200d.A00(r2.A5H);
    }

    public Resources getResources() {
        C17990va r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        if (this.A00 == null) {
            Log.i("wabaseappcompatactivity/get resources object/returning super resources");
            return super.getResources();
        }
        C17990va A002 = C17990va.A00(super.getBaseContext(), this.A00);
        this.A0A = A002;
        return A002;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18000vb r0 = this.A00;
        if (r0 != null) {
            r0.A0O();
        }
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        this.A00.A0O();
        if (this.A06) {
            A3J();
        }
        super.onCreate(bundle);
        if (this.A07 && C22891Dp.A02) {
            try {
                TypedValue typedValue = new TypedValue();
                TypedValue typedValue2 = new TypedValue();
                Resources.Theme theme = getTheme();
                if (theme != null) {
                    theme.resolveAttribute(16842836, typedValue, true);
                }
                Resources.Theme theme2 = getTheme();
                if (theme2 != null) {
                    theme2.resolveAttribute(2130970830, typedValue2, true);
                }
                int i = typedValue.resourceId;
                int i2 = typedValue2.resourceId;
                if (i == i2) {
                    getWindow().setBackgroundDrawableResource(i2);
                }
            } catch (Exception unused) {
                Log.w("Can't resolve windowBackground resource");
            }
            Window window = getWindow();
            C18070vi.A0d(window, 0);
            Context context = this;
            if (this instanceof ContextWrapper) {
                context = getBaseContext();
            }
            if (window.getStatusBarColor() == C19740yt.A00(context, 2131102224)) {
                C28271Zs.A00(window, C19740yt.A00(this, AnonymousClass4Z9.A01(this, false)), true);
            }
        }
        if (C18020vd.A05(C18040vf.A02, this.A01, 6581)) {
            C142597Ab r2 = (C142597Ab) ((AnonymousClass10E) ((C000100c) AnonymousClass00E.A00(this, C000100c.class))).Ao8.A00.A2W.get();
            r2.A00 = getClass();
            AnonymousClass286 r0 = (AnonymousClass286) new C24071It(r2, this).A00(AnonymousClass286.class);
            this.A0B = r0;
            if (r0 != null && r0.A0X()) {
                this.A08 = new C26403Cz3(this, 2);
            }
        }
        AnonymousClass286 r02 = this.A0B;
    }

    public AnonymousClass1FP(int i) {
        super(i);
    }

    public void A3J() {
        Resources.Theme theme = getTheme();
        AnonymousClass1DC r1 = this.A04;
        C18070vi.A0d(theme, 0);
        C18070vi.A0d(r1, 1);
        if (C22891Dp.A02) {
            theme.applyStyle(2132083508, true);
        }
        Resources.Theme theme2 = getTheme();
        C18030ve r2 = this.A01;
        AnonymousClass1DC r12 = this.A04;
        C18070vi.A0d(theme2, 0);
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r12, 2);
        if (AnonymousClass1J8.A09(r2)) {
            theme2.applyStyle(2132083514, true);
        }
    }

    public /* synthetic */ void A3M() {
        A0I(this);
    }

    public void A3N(AnonymousClass10I r1) {
        this.A05 = r1;
    }

    public void A3P(boolean z) {
        this.A06 = z;
    }

    public void A3Q(boolean z) {
        this.A07 = z;
    }

    public AnonymousClass19T getQuickPerformanceLogger() {
        return this.A03;
    }

    public AnonymousClass1Bd getStartupTracker() {
        return this.A02;
    }

    public AnonymousClass10I getWaWorkers() {
        return this.A05;
    }

    public C18000vb getWhatsAppLocale() {
        return this.A00;
    }

    public void onPause() {
        super.onPause();
        A03();
    }

    public void onResume() {
        super.onResume();
        A00();
    }

    public void onStart() {
        super.onStart();
        if (!this.A0C) {
            Looper.myQueue().addIdleHandler(new C64302uY(this, 0));
            this.A0C = true;
        }
        Looper.myQueue().addIdleHandler(new C64302uY(this, 1));
    }

    public void setSupportActionBar(Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
        if (toolbar != null) {
            toolbar.setPopupTheme(2132084381);
        }
        this.A09 = toolbar;
        A3O(this.A0D);
    }

    public void startActivity(Intent intent) {
        if (!C18050vg.A04(intent)) {
            C18070vi.A0d(intent, 1);
        }
        if (C18020vd.A05(C18040vf.A02, this.A01, 5831)) {
            C138116wY r4 = (C138116wY) this.A0G.get();
            String name = getClass().getName();
            C18070vi.A0d(name, 0);
            C18070vi.A0d(intent, 1);
            r4.A00.execute(new C146887Qz(r4, intent, name, 30));
        }
        super.startActivity(intent);
    }

    public AnonymousClass1FP() {
    }
}
