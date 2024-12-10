package X;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.1FL  reason: invalid class name */
public class AnonymousClass1FL extends AnonymousClass01C implements AnonymousClass1FK {
    public static final String A05 = "android:support:lifecycle";
    public boolean A00;
    public boolean A01;
    public boolean A02 = true;
    public final C23441Gb A03 = new C23441Gb(new AnonymousClass1GO(this));
    public final C23391Fw A04 = new C23391Fw(this);

    @Deprecated
    public final void A2b() {
    }

    public void A2h(Intent intent, Bundle bundle, Fragment fragment, int i) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.A1P(intent, i, bundle);
        }
    }

    public void A2i(Intent intent, Fragment fragment, int i) {
        A2h(intent, (Bundle) null, fragment, i);
    }

    @Deprecated
    public void A2l(Fragment fragment) {
    }

    public static boolean A0V(AnonymousClass1GP r4, C23401Fx r5) {
        boolean z = false;
        for (Fragment fragment : r4.A0U.A04()) {
            if (fragment != null) {
                if (fragment.A1C() != null) {
                    z |= A0V(fragment.A1E(), r5);
                }
                C37801q9 r0 = fragment.A0J;
                if (r0 != null) {
                    r0.A00();
                    if (r0.A00.A02.A00(C23401Fx.STARTED)) {
                        fragment.A0J.A00.A08(r5);
                        z = true;
                    }
                }
                if (fragment.A0L.A02.A00(C23401Fx.STARTED)) {
                    fragment.A0L.A08(r5);
                    z = true;
                }
            }
        }
        return z;
    }

    public void A2V() {
        do {
        } while (A0V(this.A03.A00.A03, C23401Fx.CREATED));
    }

    public void A2a() {
        this.A04.A07(C27581Wq.ON_RESUME);
        AnonymousClass1GP r2 = this.A03.A00.A03;
        r2.A0J = false;
        r2.A0K = false;
        r2.A0A.A01 = false;
        AnonymousClass1GP.A0B(r2, 7);
    }

    public /* synthetic */ void A2c() {
        this.A03.A00.A03.A0a();
    }

    public /* synthetic */ void A2d() {
        this.A03.A00.A03.A0a();
    }

    public /* synthetic */ void A2e() {
        AnonymousClass1GO r1 = this.A03.A00;
        r1.A03.A0m((Fragment) null, r1, r1);
    }

    public final void A2f(Context context, AttributeSet attributeSet, View view, String str) {
        this.A03.A00.A03.A0S.onCreateView(view, str, context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.76m, java.lang.Object] */
    @Deprecated
    public void A2g(Intent intent, IntentSender intentSender, Bundle bundle, Fragment fragment, int i, int i2, int i3, int i4) {
        Intent intent2 = intent;
        IntentSender intentSender2 = intentSender;
        Bundle bundle2 = bundle;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        if (i5 == -1) {
            startIntentSenderForResult(intentSender2, -1, intent2, i6, i7, i4, bundle2);
            return;
        }
        Fragment fragment2 = fragment;
        if (fragment2.A0G != null) {
            if (AnonymousClass1GP.A0G(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragment2);
                sb.append(" received the following in startIntentSenderForResult() requestCode: ");
                sb.append(i5);
                sb.append(" IntentSender: ");
                sb.append(intentSender2);
                sb.append(" fillInIntent: ");
                sb.append(intent2);
                sb.append(" options: ");
                sb.append(bundle2);
                Log.v("FragmentManager", sb.toString());
            }
            AnonymousClass1GP A1F = fragment2.A1F();
            if (A1F.A04 != null) {
                if (bundle != null) {
                    if (intent == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    }
                    if (AnonymousClass1GP.A0G(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("ActivityOptions ");
                        sb2.append(bundle2);
                        sb2.append(" were added to fillInIntent ");
                        sb2.append(intent2);
                        sb2.append(" for fragment ");
                        sb2.append(fragment2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
                }
                C18070vi.A0d(intentSender2, 1);
                AnonymousClass0RL r2 = new AnonymousClass0RL(intent2, intentSender2, i6, i7);
                String str = fragment2.A0V;
                ? obj = new Object();
                obj.A01 = str;
                obj.A00 = i5;
                A1F.A0C.addLast(obj);
                if (AnonymousClass1GP.A0G(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Fragment ");
                    sb3.append(fragment2);
                    sb3.append("is launching an IntentSender for result ");
                    Log.v("FragmentManager", sb3.toString());
                }
                A1F.A04.A02((C1406772n) null, r2);
                return;
            }
            C18070vi.A0d(intentSender2, 1);
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Fragment ");
        sb4.append(fragment2);
        sb4.append(" not attached to Activity");
        throw new IllegalStateException(sb4.toString());
    }

    public void A2j(C123426Uk r2) {
        C109265d5 r0;
        if (r2 != null) {
            r0 = new C109265d5(r2);
        } else {
            r0 = null;
        }
        A0T(this, r0);
    }

    public void A2k(C123426Uk r2) {
        C109265d5 r0;
        if (r2 != null) {
            r0 = new C109265d5(r2);
        } else {
            r0 = null;
        }
        A0U(this, r0);
    }

    public AnonymousClass1GP getSupportFragmentManager() {
        return this.A03.A00.A03;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.A03.A00.A03.A0a();
        super.onActivityResult(i, i2, intent);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.A03.A00.A03.A0S.onCreateView(view, str, context, attributeSet);
        if (onCreateView == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return onCreateView;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.A03.A00.A03.A0a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        this.A03.A00.A03.A0a();
        super.onResume();
        this.A01 = true;
        this.A03.A00.A03.A0y(true);
    }

    public void onStart() {
        this.A03.A00.A03.A0a();
        super.onStart();
        this.A02 = false;
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass1GP r2 = this.A03.A00.A03;
            r2.A0J = false;
            r2.A0K = false;
            r2.A0A.A01 = false;
            AnonymousClass1GP.A0B(r2, 4);
        }
        this.A03.A00.A03.A0y(true);
        this.A04.A07(C27581Wq.ON_START);
        AnonymousClass1GP r22 = this.A03.A00.A03;
        r22.A0J = false;
        r22.A0K = false;
        r22.A0A.A01 = false;
        AnonymousClass1GP.A0B(r22, 5);
    }

    public void onStateNotSaved() {
        this.A03.A00.A03.A0a();
    }

    public AnonymousClass1FL(int i) {
        super(i);
        A0Q();
    }

    private void A0Q() {
        BYX().A03(new C65132vt(this, 0), A05);
        BBQ(new C64892vV(this, 0));
        A2N(new C64892vV(this, 1));
        A2L(new C64802vM(this, 0));
    }

    public static void A0R(Activity activity) {
        activity.postponeEnterTransition();
    }

    public static void A0S(Activity activity) {
        activity.startPostponedEnterTransition();
    }

    public /* synthetic */ Bundle A2T() {
        A2V();
        this.A04.A07(C27581Wq.ON_STOP);
        return new Bundle();
    }

    @Deprecated
    public void A2U() {
        C26144Ct7.A00(this);
    }

    public void A2W() {
        AnonymousClass4FQ.A00(this);
    }

    @Deprecated
    public void A2X() {
        invalidateOptionsMenu();
    }

    public void A2Y() {
        A0R(this);
    }

    public void A2Z() {
        A0S(this);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!AnonymousClass1FB.A0P(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            String obj = sb.toString();
            printWriter.print(obj);
            printWriter.print("mCreated=");
            printWriter.print(this.A00);
            printWriter.print(" mResumed=");
            printWriter.print(this.A01);
            printWriter.print(" mStopped=");
            printWriter.print(this.A02);
            if (getApplication() != null) {
                C26144Ct7.A00(this).A04(obj, fileDescriptor, printWriter, strArr);
            }
            this.A03.A00.A03.A0x(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A04.A07(C27581Wq.ON_CREATE);
        AnonymousClass1GP r2 = this.A03.A00.A03;
        r2.A0J = false;
        r2.A0K = false;
        r2.A0A.A01 = false;
        AnonymousClass1GP.A0B(r2, 1);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A03.A00.A03.A0X();
        this.A04.A07(C27581Wq.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.A03.A00.A03.A12(menuItem);
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.A01 = false;
        AnonymousClass1GP.A0B(this.A03.A00.A03, 5);
        this.A04.A07(C27581Wq.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        A2a();
    }

    public void onStop() {
        super.onStop();
        this.A02 = true;
        A2V();
        AnonymousClass1GP r2 = this.A03.A00.A03;
        r2.A0K = true;
        r2.A0A.A01 = true;
        AnonymousClass1GP.A0B(r2, 4);
        this.A04.A07(C27581Wq.ON_STOP);
    }

    public static void A0T(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setEnterSharedElementCallback(sharedElementCallback);
    }

    public static void A0U(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setExitSharedElementCallback(sharedElementCallback);
    }

    public AnonymousClass1FL() {
        A0Q();
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.A03.A00.A03.A0S.onCreateView((View) null, str, context, attributeSet);
        if (onCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return onCreateView;
    }
}
