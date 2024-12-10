package X;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

public final class BZQ extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public final Handler A00 = new BG6(Looper.getMainLooper());
    public final AnonymousClass016 A01;
    public final C41381wH A02;
    public final C26377Cyd A03;
    public final AtomicReference A04 = new AtomicReference((Object) null);
    public volatile boolean A05;

    public final void onStart() {
        this.A05 = true;
        if (!this.A01.isEmpty()) {
            this.A03.A07(this);
        }
    }

    public final void onStop() {
        this.A05 = false;
        C26377Cyd cyd = this.A03;
        synchronized (C26377Cyd.A0I) {
            if (cyd.A01 == this) {
                cyd.A01 = null;
                cyd.A0A.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReference r4 = r7.A04
            java.lang.Object r5 = r4.get()
            X.CNr r5 = (X.C24873CNr) r5
            r0 = 1
            if (r8 == r0) goto L_0x002a
            r0 = 2
            if (r8 != r0) goto L_0x0054
            X.1wH r2 = r7.A02
            android.app.Activity r1 = r7.getActivity()
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.A02(r1, r0)
            if (r2 == 0) goto L_0x0059
            if (r5 == 0) goto L_0x0029
            X.Bcx r0 = r5.A01
            int r1 = r0.A01
            r0 = 18
            if (r1 != r0) goto L_0x0056
            if (r2 != r0) goto L_0x0056
        L_0x0029:
            return
        L_0x002a:
            r0 = -1
            if (r9 == r0) goto L_0x0059
            if (r9 != 0) goto L_0x0054
            if (r5 == 0) goto L_0x0029
            r3 = 13
            if (r10 == 0) goto L_0x003b
            java.lang.String r0 = "<<ResolutionFailureErrorDetail>>"
            int r3 = r10.getIntExtra(r0, r3)
        L_0x003b:
            X.Bcx r0 = r5.A01
            java.lang.String r2 = r0.toString()
            r1 = 0
            r0 = 1
            X.Bcx r6 = new X.Bcx
            r6.<init>(r1, r2, r0, r3)
        L_0x0048:
            int r1 = r5.A00
            r0 = 0
            r4.set(r0)
            X.Cyd r0 = r7.A03
            r0.A06(r6, r1)
            return
        L_0x0054:
            if (r5 == 0) goto L_0x0029
        L_0x0056:
            X.Bcx r6 = r5.A01
            goto L_0x0048
        L_0x0059:
            r0 = 0
            r4.set(r0)
            X.Cyd r0 = r7.A03
            android.os.Handler r1 = r0.A06
            r0 = 3
            android.os.Message r0 = r1.obtainMessage(r0)
            r1.sendMessage(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BZQ.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onCancel(DialogInterface dialogInterface) {
        int i;
        C23203Bcx bcx = new C23203Bcx(13, (PendingIntent) null);
        AtomicReference atomicReference = this.A04;
        C24873CNr cNr = (C24873CNr) atomicReference.get();
        if (cNr == null) {
            i = -1;
        } else {
            i = cNr.A00;
        }
        atomicReference.set((Object) null);
        this.A03.A06(bcx, i);
    }

    public final void onCreate(Bundle bundle) {
        C24873CNr cNr;
        if (bundle != null) {
            AtomicReference atomicReference = this.A04;
            if (bundle.getBoolean("resolving_error", false)) {
                cNr = new C24873CNr(new C23203Bcx(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                cNr = null;
            }
            atomicReference.set(cNr);
        }
    }

    public final void onResume() {
        if (!this.A01.isEmpty()) {
            this.A03.A07(this);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C24873CNr cNr = (C24873CNr) this.A04.get();
        if (cNr != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", cNr.A00);
            C23203Bcx bcx = cNr.A01;
            bundle.putInt("failed_status", bcx.A01);
            bundle.putParcelable("failed_resolution", bcx.A02);
        }
    }

    public BZQ(C41381wH r3, C26377Cyd cyd, E9G e9g) {
        super(e9g);
        this.A02 = r3;
        this.A01 = new AnonymousClass016(0);
        this.A03 = cyd;
        this.mLifecycleFragment.BB1(this, "ConnectionlessLifecycleHelper");
    }
}
