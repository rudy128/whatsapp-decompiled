package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.android.di.BaseEntryPoint;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.1FO  reason: invalid class name */
public abstract class AnonymousClass1FO extends AnonymousClass1FN {
    public static final int A04 = -1;
    public AnonymousClass1HB A00;
    public AnonymousClass1K9 A01;
    public ViewTreeObserver.OnDrawListener A02;
    public BaseEntryPoint A03;

    public int A31() {
        return -1;
    }

    /* renamed from: A35 */
    public void A36() {
    }

    public boolean A3G() {
        return false;
    }

    private C18030ve A03() {
        BaseEntryPoint baseEntryPoint = this.A03;
        if (baseEntryPoint == null) {
            return null;
        }
        return baseEntryPoint.BAL();
    }

    private void A0I(View view, AnonymousClass1KB r4) {
        r4.A02.post(new AnonymousClass3C0(this, view, 22));
    }

    public AnonymousClass2H8 A32() {
        return this.A00.A01.A01;
    }

    /* renamed from: A38 */
    public void A3A(View view, AnonymousClass1KB r3) {
        A3C("onRendered");
        Biu(2);
        A0I(view, r3);
    }

    public void A39(View view, AnonymousClass1KB r4) {
        AnonymousClass1HB r0 = this.A00;
        if (r0.A01.A07.BfT(A31())) {
            this.A02 = new C64742vG(view, r4, this);
            view.getViewTreeObserver().addOnDrawListener(this.A02);
        }
    }

    public void A3C(String str) {
        this.A00.A01.A06(str);
    }

    public void A3D(String str) {
        this.A00.A01.A07(str);
    }

    public final void A3E(String str, boolean z, boolean z2) {
        this.A00.A00(str, z, z2);
    }

    public void A3F(short s) {
        A3C("onRendered");
        Biu(s);
    }

    public void Biu(short s) {
        this.A00.A01.A0C(s);
    }

    public void Biz(String str) {
        this.A00.A01.A08(str);
    }

    public void BmU() {
        this.A00.A01.A07("data_load");
    }

    public void Bqk() {
        this.A00.A01.A06("data_load");
    }

    public void C3A() {
        this.A00.A01.A0C(230);
    }

    public void attachBaseContext(Context context) {
        this.A03 = (BaseEntryPoint) AnonymousClass00E.A00(context, BaseEntryPoint.class);
        String simpleName = getClass().getSimpleName();
        this.A00 = new AnonymousClass1HB((AnonymousClass1HA) ((AnonymousClass2Z9) ((AnonymousClass10E) ((C000100c) AnonymousClass00E.A00(context, C000100c.class))).Ao8.A00.A2p.get()).A00.A00.A5O.get(), A33(), simpleName);
        super.attachBaseContext(context);
    }

    public AnonymousClass4NU getFirstDrawMonitor() {
        return this.A00.A00;
    }

    private View A00() {
        if (A33().A02) {
            return getWindow().getDecorView();
        }
        return null;
    }

    public C222219b A33() {
        return new C222219b(A03(), A31());
    }

    public void A34() {
    }

    public /* synthetic */ void A37(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this.A02);
    }

    public void A3B(AnonymousClass1HB r1) {
        this.A00 = r1;
    }

    public AnonymousClass1HB getInteractionPerfTracker() {
        return this.A00;
    }

    public void onCreate(Bundle bundle) {
        String stringExtra;
        boolean booleanExtra = getIntent().getBooleanExtra("key_perf_tracked", false);
        AnonymousClass1GP r0 = this.A03.A00.A03;
        C18070vi.A0d(r0, 0);
        r0.A0E.add(new AnonymousClass1JA(r0));
        if (!booleanExtra) {
            AnonymousClass1HB r02 = this.A00;
            int A31 = A31();
            if (!r02.A01.A07.BfT(A31) && A31 != 78318969) {
                long j = -1;
                if (bundle != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onCreate:Recreated:");
                    sb.append(getClass().getSimpleName());
                    stringExtra = sb.toString();
                } else {
                    j = getIntent().getLongExtra("perf_start_time_ns", -1);
                    stringExtra = getIntent().getStringExtra("perf_origin");
                }
                if (stringExtra == null) {
                    stringExtra = getClass().getSimpleName();
                }
                if (this.A00.A01(A00(), new C689235f(this, 1), stringExtra, j)) {
                    getIntent().putExtra("key_perf_tracked", true);
                }
            }
        }
        super.onCreate(bundle);
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        ViewTreeObserver viewTreeObserver;
        super.onStart();
        if (A3G()) {
            AnonymousClass1K9 r2 = this.A01;
            String obj = toString();
            C18070vi.A0d(obj, 1);
            r2.A01 = new C64762vI(r2, obj);
            View findViewById = findViewById(16908290);
            if (!(findViewById == null || (viewTreeObserver = findViewById.getViewTreeObserver()) == null)) {
                C64762vI r0 = r2.A01;
                if (r0 == null) {
                    C18070vi.A11("onGlobalLayoutListener");
                    throw null;
                }
                viewTreeObserver.addOnGlobalLayoutListener(r0);
            }
            AnonymousClass1K5 r3 = r2.A02;
            if (!r3.A01) {
                r3.A01 = true;
                ((AnonymousClass10I) r3.A05.get()).CGF(new C21448AkF(r3, 17));
            }
        }
    }

    public void onStop() {
        ViewTreeObserver viewTreeObserver;
        super.onStop();
        if (A3G()) {
            AnonymousClass1K9 r2 = this.A01;
            if (r2.A01 != null) {
                View findViewById = findViewById(16908290);
                if (findViewById != null && (viewTreeObserver = findViewById.getViewTreeObserver()) != null) {
                    C64762vI r0 = r2.A01;
                    if (r0 == null) {
                        C18070vi.A11("onGlobalLayoutListener");
                        throw null;
                    } else {
                        viewTreeObserver.removeOnGlobalLayoutListener(r0);
                    }
                }
            } else {
                C17960vV.A0F(false, "LayoutMonitor/Global Layout Listener is not initialized");
            }
        }
    }

    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
    }
}
