package X;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.1XL  reason: invalid class name */
public final class AnonymousClass1XL {
    public Boolean A00;
    public final AnonymousClass118 A01;
    public final C19830z4 A02;
    public final AnonymousClass11O A03;
    public final C18100vl A04 = new C18110vm(new C71023Dm(this, 4));
    public final AnonymousClass11P A05;
    public final C18100vl A06 = new C18110vm(new C71023Dm(this, 5));

    public AnonymousClass1XL(AnonymousClass11P r3, AnonymousClass118 r4, C19830z4 r5, AnonymousClass11O r6) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r6, 4);
        this.A05 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
    }

    public final void A02(boolean z) {
        Boolean bool = this.A00;
        Boolean valueOf = Boolean.valueOf(z);
        if (!C18070vi.A18(bool, valueOf)) {
            this.A00 = valueOf;
            StringBuilder sb = new StringBuilder();
            sb.append("AppAuthManager/setIsAuthenticationNeeded: ");
            sb.append(z);
            Log.i(sb.toString());
            this.A03.A00.edit().putBoolean("app_lock_auth_needed", z).apply();
        }
    }

    public final boolean A05() {
        return ((Boolean) this.A06.getValue()).booleanValue();
    }

    public final boolean A06() {
        C19830z4 r10 = this.A02;
        boolean z = !r10.A2T();
        boolean z2 = !this.A03.A00.getBoolean("app_lock_auth_needed", true);
        boolean z3 = !A03();
        if (z3 || z || z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("AppAuthManager/shouldShowAuthPrompt: No prompt: ");
            sb.append(z3);
            sb.append(" || ");
            sb.append(z);
            sb.append(" || ");
            sb.append(z2);
            Log.i(sb.toString());
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = ((SharedPreferences) r10.A00.get()).getLong("app_background_time", 0);
        long A0Q = r10.A0Q();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AppAuthManager/shouldShowAuthPrompt: show prompt if necessary: ");
        long j2 = j + A0Q;
        boolean z4 = false;
        if (j2 < elapsedRealtime) {
            z4 = true;
        }
        sb2.append(z4);
        Log.i(sb2.toString());
        if (j2 >= elapsedRealtime) {
            return false;
        }
        return true;
    }

    public final void A00() {
        C17960vV.A0D(A05());
        this.A04.getValue();
    }

    public final void A01(Activity activity) {
        if (AnonymousClass112.A09()) {
            C61812qJ.A00.A00(activity, this.A02, new C18110vm(new C99144sL(this, 21)));
        } else if (AnonymousClass112.A03()) {
            AnonymousClass1XM.A00(activity, new C18110vm(new C71023Dm(this, 6)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (12 == r1) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03() {
        /*
            r3 = this;
            boolean r0 = r3.A05()
            if (r0 == 0) goto L_0x0020
            X.0vl r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            X.2iW r0 = (X.C57092iW) r0
            X.0PO r1 = r0.A00
            r0 = 33023(0x80ff, float:4.6275E-41)
            int r1 = r1.A03(r0)
            r0 = 11
            if (r0 == r1) goto L_0x0020
            r0 = 12
            r2 = 1
            if (r0 != r1) goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AppAuthManager/hasEnrolledAuthentication: enrolled: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XL.A03():boolean");
    }

    public final boolean A04() {
        int A032;
        if (!AnonymousClass112.A01() || !this.A02.A2T() || 11 == (A032 = ((C57092iW) this.A04.getValue()).A00.A03(33023)) || 12 == A032) {
            return false;
        }
        return true;
    }

    public final boolean A07() {
        if (!A04() || ((SharedPreferences) this.A02.A00.get()).getBoolean("privacy_fingerprint_show_notification_content", true)) {
            return true;
        }
        return false;
    }
}
