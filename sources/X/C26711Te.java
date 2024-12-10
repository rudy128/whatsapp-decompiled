package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Te  reason: invalid class name and case insensitive filesystem */
public final class C26711Te implements AnonymousClass1O5, C26701Td {
    public Runnable A00;
    public final AnonymousClass11S A01;
    public final C26691Tc A02;
    public final C25851Pw A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass1RK A05;
    public final C18030ve A06;
    public final AnonymousClass10I A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass18O A09;
    public final C26371Rw A0A;

    public C26711Te(AnonymousClass11S r2, AnonymousClass18O r3, C26691Tc r4, C26371Rw r5, C25851Pw r6, AnonymousClass11P r7, AnonymousClass1RK r8, C18030ve r9, AnonymousClass10I r10, AnonymousClass00H r11) {
        C18070vi.A0d(r7, 1);
        C18070vi.A0d(r9, 2);
        C18070vi.A0d(r2, 3);
        C18070vi.A0d(r10, 4);
        C18070vi.A0d(r3, 5);
        C18070vi.A0d(r11, 6);
        C18070vi.A0d(r5, 7);
        C18070vi.A0d(r8, 8);
        C18070vi.A0d(r6, 9);
        C18070vi.A0d(r4, 10);
        this.A04 = r7;
        this.A06 = r9;
        this.A01 = r2;
        this.A07 = r10;
        this.A09 = r3;
        this.A08 = r11;
        this.A0A = r5;
        this.A05 = r8;
        this.A03 = r6;
        this.A02 = r4;
    }

    public final synchronized void A02(Pair pair) {
        boolean A042 = A04();
        StringBuilder sb = new StringBuilder();
        sb.append("SyncdDeleteAllDataHandler/schedule isSyncdDirtyAndShouldRetry = ");
        sb.append(A042);
        Log.i(sb.toString());
        if (A042) {
            this.A00 = this.A07.CGv(new C98764rg((Object) this, 39), 1000);
        } else {
            this.A07.CGF(new C70623Bv(this, pair, 2));
        }
    }

    public final void A03(boolean z) {
        Integer num;
        String str;
        String obj;
        AnonymousClass11S r4 = this.A01;
        C17960vV.A0H(!r4.A0N(), "Companion device should not call SyncdDeleteAllDataHandler.handleDirtyState");
        synchronized (this) {
            Runnable runnable = this.A00;
            if (runnable != null) {
                this.A07.CEz(runnable);
                this.A00 = null;
                Log.i("SyncdDeleteAllDataHandler/resetSchedule removed scheduled sync");
            }
        }
        AnonymousClass00H r2 = this.A08;
        if (!((AnonymousClass1OZ) r2.get()).A0L()) {
            obj = "SyncdDeleteAllDataApiHandler/handleDirtyState disconnected";
        } else {
            C25851Pw r6 = this.A03;
            if (!r6.A08()) {
                obj = "SyncdDeleteAllDataApiHandler/handleDirtyState clean in progress";
            } else if (z || C25851Pw.A00(r6).getInt("syncd_dirty", -1) < 4) {
                r6.A05(C25851Pw.A00(r6).getInt("syncd_dirty", -1) + 1);
                AnonymousClass1RK r5 = this.A05;
                if (!r5.A07().isEmpty()) {
                    int i = C25851Pw.A00(r6).getInt("syncd_dirty_reason", 0);
                    if (i != 0) {
                        num = Integer.valueOf(i);
                    } else {
                        num = null;
                    }
                    if (num == null || num.intValue() != 8) {
                        str = "syncd_failure";
                    } else {
                        str = "hosted_device_pairing";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("SyncdDeleteAllDataApiHandler/handleDirtyState: logoutAllCompanionDevices reason=");
                    sb.append(str);
                    Log.i(sb.toString());
                    r5.A0A(str, false, str.equals("hosted_device_pairing"));
                    return;
                }
                Log.i("SyncdDeleteAllDataApiHandler/handleDirtyState: sendDeleteAllDataIq");
                r4.A0I();
                if (r4.A02 != null) {
                    String A0B = ((AnonymousClass1OZ) r2.get()).A0B();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SyncdDeleteAllDataApiHandler/sendIqWithCallback ");
                    sb2.append(A0B);
                    Log.i(sb2.toString());
                    ((AnonymousClass1OZ) r2.get()).A0N(this, (C29621ca) new AnonymousClass9F7(A0B, 19).A00, A0B, 250, 32000);
                    return;
                }
                return;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("SyncdDeleteAllDataApiHandler/handleDirtyState shouldn't retry force=");
                sb3.append(z);
                obj = sb3.toString();
            }
        }
        Log.w(obj);
    }

    public /* synthetic */ void BqZ(C59312m6 r1, boolean z) {
    }

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("SyncdDeleteAllDataApiHandler/onDeliveryFailure ");
        sb.append(str);
        Log.e(sb.toString());
        A02((Pair) null);
    }

    public /* synthetic */ void BrL(C59312m6 r1) {
    }

    public /* synthetic */ void BrS(C59312m6 r1) {
    }

    public /* synthetic */ void BrU() {
    }

    public void Bt9(C29621ca r4, String str) {
        C18070vi.A0d(r4, 1);
        Pair A012 = C60482o6.A01(r4);
        StringBuilder sb = new StringBuilder();
        sb.append("SyncdDeleteAllDataApiHandler/onError ");
        sb.append(A012);
        Log.e(sb.toString());
        A02(A012);
    }

    public void C7Z(C29621ca r9, String str) {
        Integer num;
        C18070vi.A0d(str, 0);
        C18070vi.A0d(r9, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("SyncdDeleteAllDataApiHandler/onSuccess ");
        sb.append(str);
        sb.append(" response: ");
        sb.append(r9);
        Log.i(sb.toString());
        C26371Rw r7 = this.A0A;
        C25851Pw r4 = this.A03;
        int i = C25851Pw.A00(r4).getInt("syncd_dirty_reason", 0);
        if (i != 0) {
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        AnonymousClass2F4 r1 = new AnonymousClass2F4();
        r1.A00 = num;
        r1.A01 = Long.valueOf((long) (C25851Pw.A00(r4).getInt("syncd_dirty", -1) - 1));
        r7.A08.CC7(r1);
        this.A02.notifyAllObservers(new AnonymousClass7KX(8));
        C25851Pw.A00(r4).edit().remove("syncd_dirty_reason").apply();
        r4.A05(-1);
    }

    public static final boolean A00(C26711Te r8) {
        long j = C25851Pw.A00(r8.A03).getLong("syncd_last_companion_dereg_time", 0);
        boolean z = false;
        if (j != 0) {
            if (j + TimeUnit.MINUTES.toMillis((long) r8.A09.A04(AnonymousClass18O.A0y)) >= AnonymousClass11P.A01(r8.A04)) {
                z = true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("SyncdDeleteAllDataApiHandler/isInKeepAliveMode: isInKeepAliveMode = ");
            sb.append(z);
            Log.i(sb.toString());
        }
        return z;
    }

    public final void A01(int i) {
        C17960vV.A0H(!this.A01.A0N(), "Companion device should not call SyncdDeleteAllDataHandler.markSyncdDirty");
        Log.i("SyncdDeleteAllDataApiHandler/markSyncdDirty");
        C25851Pw r1 = this.A03;
        r1.A03(i);
        if (i == 1) {
            C25851Pw.A00(r1).edit().putLong("syncd_last_fatal_error_time", AnonymousClass11P.A01(this.A04)).apply();
        }
    }

    public final boolean A04() {
        int i = C25851Pw.A00(this.A03).getInt("syncd_dirty", -1);
        if (i == -1 || i >= 4) {
            return false;
        }
        return true;
    }

    public void BrO(C59312m6 r3) {
        if (!this.A01.A0N()) {
            C25851Pw r1 = this.A03;
            if (r1.A08()) {
                Log.e("SyncdDeleteAllDataApiHandler/onDeviceRegistered: This should be rare and suggested to check more logs.");
                return;
            }
            Log.i("SyncdDeleteAllDataApiHandler/onDeviceRegistered removeLastCompanionDeregTime");
            C25851Pw.A00(r1).edit().remove("syncd_last_companion_dereg_time").apply();
        }
    }

    public void BrP(C199410f r3, String str, int i) {
        if (!this.A01.A0N() && this.A03.A08()) {
            StringBuilder sb = new StringBuilder();
            sb.append("SyncdDeleteAllDataApiHandler/onDeviceLogoutError: ");
            sb.append(i);
            sb.append(' ');
            sb.append(str);
            sb.append(", scheduling again");
            Log.i(sb.toString());
            A02((Pair) null);
        }
    }

    public void BrT(C199410f r7) {
        if (!this.A01.A0N()) {
            C25851Pw r4 = this.A03;
            if (r4.A08()) {
                Log.i("SyncdDeleteAllDataApiHandler/onDeviceRemoved");
                if (!(!this.A05.A07().isEmpty())) {
                    this.A02.notifyAllObservers(new AnonymousClass7KX(7));
                    C26371Rw r5 = this.A0A;
                    C46392Ej r1 = new C46392Ej();
                    r1.A00 = Long.valueOf((long) (C25851Pw.A00(r4).getInt("syncd_dirty", -1) - 1));
                    r5.A08.CC7(r1);
                }
                r4.A05(0);
                A03(false);
            } else if (this.A09.A04(AnonymousClass18O.A0y) > 0 && !(!this.A05.A07().isEmpty())) {
                Log.i("SyncdDeleteAllDataApiHandler/onDeviceRemoved setLastCompanionDeregTime");
                C25851Pw.A00(r4).edit().putLong("syncd_last_companion_dereg_time", AnonymousClass11P.A01(this.A04)).apply();
            }
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
