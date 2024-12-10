package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;

/* renamed from: X.Cso  reason: case insensitive filesystem */
public abstract class C26126Cso {
    public final int A00;
    public final Context A01;
    public final Looper A02;
    public final C28622EAu A03;
    public final C24924CPx A04;
    public final C25260Cbz A05;
    public final C25121CYu A06;
    public final C26377Cyd A07;
    public final String A08;
    public final C28444E1k A09;

    public C26126Cso(Context context, C28622EAu eAu, C24924CPx cPx, C25540Chd chd) {
        this((Activity) null, context, eAu, cPx, chd);
    }

    public static final zzw A02(C26126Cso cso, C25558Chw chw, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C28444E1k e1k = cso.A09;
        C26377Cyd cyd = cso.A07;
        C26377Cyd.A05(cso, cyd, taskCompletionSource, chw.A00);
        C108955ca.A1F(cyd.A06, new C24926CPz(cso, new C23002BZc(e1k, chw, taskCompletionSource, i), cyd.A0C.get()), 4);
        return taskCompletionSource.zza;
    }

    public zzw A04(CYG cyg) {
        C18210vx.A02(cyg, "Listener key cannot be null.");
        C26377Cyd cyd = this.A07;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C108955ca.A1F(cyd.A06, new C24926CPz(this, new C23000BZa(cyg, taskCompletionSource), cyd.A0C.get()), 13);
        return taskCompletionSource.zza;
    }

    public static final void A03(C26126Cso cso, BZL bzl, int i) {
        bzl.A05();
        C26377Cyd cyd = cso.A07;
        C108955ca.A1F(cyd.A06, new C24926CPz(cso, new C23005BZf(bzl, i), cyd.A0C.get()), 4);
    }

    public zzw A05(C24925CPy cPy) {
        C18210vx.A00(cPy);
        CQ1 cq1 = cPy.A00;
        C18210vx.A02(cq1.A01.A01, "Listener has already been released.");
        C24872CNq cNq = cPy.A01;
        C18210vx.A02(cNq.A00, "Listener has already been released.");
        Runnable runnable = cPy.A02;
        C26377Cyd cyd = this.A07;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C26377Cyd.A05(this, cyd, taskCompletionSource, cq1.A00);
        C108955ca.A1F(cyd.A06, new C24926CPz(this, new C23003BZd(new CQ0(cq1, cNq, runnable), taskCompletionSource), cyd.A0C.get()), 8);
        return taskCompletionSource.zza;
    }

    public C26126Cso(Activity activity, Context context, C28622EAu eAu, C24924CPx cPx, C25540Chd chd) {
        String str;
        C18210vx.A02(context, "Null context is not permitted.");
        C18210vx.A02(cPx, "Api must not be null.");
        C18210vx.A02(chd, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        C18210vx.A02(applicationContext, "The provided context did not have an application context.");
        this.A01 = applicationContext;
        if (Build.VERSION.SDK_INT >= 30) {
            str = context.getAttributionTag();
        } else {
            str = null;
        }
        this.A08 = str;
        this.A04 = cPx;
        this.A03 = eAu;
        this.A02 = chd.A00;
        C25121CYu cYu = new C25121CYu(eAu, cPx, str);
        this.A06 = cYu;
        this.A05 = new BZA(this);
        C26377Cyd A012 = C26377Cyd.A01(applicationContext);
        this.A07 = A012;
        this.A00 = A012.A0B.getAndIncrement();
        this.A09 = chd.A01;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            E9G fragment = LifecycleCallback.getFragment(activity);
            BZQ bzq = (BZQ) fragment.BO7(BZQ.class, "ConnectionlessLifecycleHelper");
            bzq = bzq == null ? new BZQ(C41381wH.A00, A012, fragment) : bzq;
            bzq.A01.add(cYu);
            A012.A07(bzq);
        }
        C108955ca.A1F(A012.A06, this, 7);
    }
}
