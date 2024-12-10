package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

/* renamed from: X.1KB  reason: invalid class name */
public class AnonymousClass1KB implements AnonymousClass119 {
    public AnonymousClass1FR A00;
    public C54062dX A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final AnonymousClass118 A03;
    public final AnonymousClass00H A04;
    public final Executor A05 = new AnonymousClass3DL(this, 1);
    public final AnonymousClass190 A06;
    public final AnonymousClass11E A07;
    public final AnonymousClass1KA A08;

    @Deprecated
    public Toast A03(CharSequence charSequence) {
        A01(this, "createCustomViewToast");
        Context context = this.A03.A00;
        View inflate = LayoutInflater.from(context).inflate(2131627209, (ViewGroup) null);
        ((TextView) AnonymousClass1HF.A06(inflate, 16908299)).setText(charSequence);
        Toast toast = new Toast(context);
        toast.setView(inflate);
        toast.setDuration(0);
        return toast;
    }

    public void A0D(AnonymousClass1FR r4) {
        A01(this, "showProgressSpinnerOrToast");
        if (r4 == null && (r4 = this.A00) == null) {
            C17960vV.A0F(false, "dialogToast == null");
            A08(2131895077, 0);
            return;
        }
        r4.CNB(0, 2131895077);
    }

    public static Context A00(AnonymousClass1KB r0) {
        return r0.A03.A00;
    }

    public static void A02(C33251iW r4) {
        AnonymousClass1KB r3 = r4.A03;
        C32291gx r2 = r4.A0t;
        r2.getClass();
        r3.A0J(new C70603Bt(r2, 38));
    }

    public void A04() {
        StringBuilder sb = new StringBuilder();
        sb.append("app/progress-spinner/remove dt=");
        sb.append(this.A00);
        Log.i(sb.toString());
        A01(this, "removeProgressSpinner");
        this.A01 = null;
        AnonymousClass1FR r0 = this.A00;
        if (r0 != null) {
            r0.CEx();
        } else {
            C23451Gc.A02 = false;
        }
        Log.i("app/progress-spinner/remove done");
    }

    public final void A05(int i) {
        A0J(new AnonymousClass7RP(this, i, 18));
    }

    public void A06(int i, int i2) {
        A01(this, "dialogOrToast");
        AnonymousClass1FR r0 = this.A00;
        if (r0 != null) {
            r0.BhQ(i);
        } else {
            A08(i, i2);
        }
    }

    public void A07(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("app/progress-spinner/show dt=");
        sb.append(this.A00);
        Log.i(sb.toString());
        A01(this, "showProgressSpinner");
        this.A01 = new C54062dX(i, i2);
        AnonymousClass1FR r0 = this.A00;
        if (r0 != null) {
            r0.CNB(i, i2);
        }
        Log.i("app/progress-spinner/show done");
    }

    public void A08(int i, int i2) {
        A0G(this.A03.A00.getString(i), i2);
    }

    public void A09(int i, int i2) {
        A0H(this.A03.A00.getString(i), i2);
    }

    public void A0A(AnonymousClass1FR r3) {
        StringBuilder sb = new StringBuilder();
        sb.append("app/dt/clear dt=");
        sb.append(r3);
        sb.append(" dialog_toast=");
        sb.append(this.A00);
        Log.i(sb.toString());
        A01(this, "clearDialogToast");
        AnonymousClass1FR r1 = this.A00;
        if (r1 == r3) {
            if (this.A01 != null) {
                r1.CEx();
            }
            this.A00 = null;
        }
        Log.i("app/dt/clear done");
    }

    public void A0B(AnonymousClass1FR r3) {
        A01(this, "removeProgressSpinner");
        if (r3 == null && (r3 = this.A00) == null) {
            C17960vV.A0F(false, "dialogToast == null");
            Log.w("app/removeProgressSpinner/ignore dialogToast == null");
            return;
        }
        r3.CEx();
    }

    public void A0C(AnonymousClass1FR r4) {
        StringBuilder sb = new StringBuilder();
        sb.append("app/dt/set ");
        sb.append(r4);
        Log.i(sb.toString());
        A01(this, "setDialogToast");
        this.A00 = r4;
        C54062dX r2 = this.A01;
        if (r2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("app/dt/set show_progress_data=");
            sb2.append(r2);
            sb2.append(" dialog_toast=");
            sb2.append(this.A00);
            Log.i(sb2.toString());
            AnonymousClass1FR r22 = this.A00;
            C54062dX r0 = this.A01;
            r22.CNB(r0.A02, r0.A01);
            if (this.A01.A00 != null) {
                Log.i("app/dt/set/update");
                this.A00.CRG(this.A01.A00);
            }
        }
        Log.i("app/dt/set done");
    }

    public void A0E(AnonymousClass1FR r2, int i) {
        A01(this, "dialogOrToast");
        if (r2 != null) {
            r2.BhQ(i);
        } else {
            A06(i, 0);
        }
    }

    public void A0F(AnonymousClass1FR r2, String str) {
        A01(this, "dialogOrToast");
        if (r2 != null) {
            r2.BhR(str);
        } else {
            A0L(str, 0);
        }
    }

    public void A0I(Runnable runnable) {
        this.A02.removeCallbacks(runnable);
    }

    public void A0J(Runnable runnable) {
        this.A02.post(runnable);
    }

    public void A0K(Runnable runnable, long j) {
        this.A02.postDelayed(runnable, j);
    }

    public void A0L(String str, int i) {
        A01(this, "dialogOrToast");
        AnonymousClass1FR r0 = this.A00;
        if (r0 != null) {
            r0.BhR(str);
        } else {
            A0G(str, i);
        }
    }

    public void A0M(String str, String str2, int i) {
        A01(this, "dialogOrToast");
        AnonymousClass1FR r0 = this.A00;
        if (r0 != null) {
            r0.BhS(str, str2);
        } else {
            A0G(str2, i);
        }
    }

    public boolean A0N() {
        if (this.A07.A09()) {
            return true;
        }
        int i = 2131892439;
        if (AnonymousClass11E.A02(this.A03.A00)) {
            i = 2131892440;
        }
        A08(i, 0);
        return false;
    }

    public AnonymousClass1KB(AnonymousClass190 r3, AnonymousClass11E r4, AnonymousClass118 r5, AnonymousClass1KA r6, AnonymousClass00H r7) {
        this.A06 = r3;
        this.A03 = r5;
        this.A07 = r4;
        this.A04 = r7;
        this.A08 = r6;
    }

    public static void A01(AnonymousClass1KB r2, String str) {
        if (!C22781De.A03()) {
            r2.A06.A0G("GlobalUI/not-called-on-main-thread", str, true);
        }
    }

    public void A0G(CharSequence charSequence, int i) {
        View view;
        int i2;
        A01(this, "toast");
        Context context = this.A03.A00;
        if (context != null) {
            Toast makeText = Toast.makeText(context, charSequence, i);
            String str = Build.MANUFACTURER;
            if (("Oculus".equalsIgnoreCase(str) || ((i2 = Build.VERSION.SDK_INT) >= 26 && i2 <= 28 && ("google".equalsIgnoreCase(str) || "oneplus".equalsIgnoreCase(str)))) && (view = makeText.getView()) != null) {
                Drawable background = view.getBackground();
                TextView textView = (TextView) view.findViewById(16908299);
                if (!(background == null || textView == null)) {
                    background.setColorFilter(C19740yt.A00(context, 2131102718), PorterDuff.Mode.SRC_IN);
                    textView.setTextColor(C19740yt.A00(context, AnonymousClass1YL.A00(context, 2130971610, 2131102719)));
                }
            }
            makeText.show();
        }
    }

    public void A0H(CharSequence charSequence, int i) {
        if (C22781De.A03()) {
            A0G(charSequence, i);
        } else {
            A0J(new C21470Akb((Object) this, i, 11, (Object) charSequence));
        }
    }

    public void CGP(Runnable runnable) {
        if (C22781De.A03()) {
            runnable.run();
        } else {
            A0J(runnable);
        }
    }
}
