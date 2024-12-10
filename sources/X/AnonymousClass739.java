package X;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.739  reason: invalid class name */
public final class AnonymousClass739 {
    public static final C18180vt A0B = new C18180vt(20, 1000);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;
    public final C18030ve A05;
    public final AnonymousClass18K A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass11P A09;
    public final C19830z4 A0A;

    public final void A03(Intent intent) {
        StringBuilder A11;
        String obj;
        C18070vi.A0d(intent, 0);
        int intExtra = intent.getIntExtra("source", 0);
        this.A01 = intExtra;
        if (intExtra == 0) {
            obj = "AccountSwitchingLogger/cacheAccountSwitchingEventData/invalid source";
        } else {
            if (intent.getBooleanExtra("is_success", false)) {
                Log.i("AccountSwitchingLogger/cacheAccountSwitchingEventData/success action");
                this.A04 = true;
                this.A02 = (long) intent.getIntExtra("inactive_account_num_pending_message_notifs", 0);
                long A062 = C108975cc.A06(intent, "switching_start_time_ms");
                this.A03 = A062;
                A11 = AnonymousClass000.A11("AccountSwitchingLogger/cacheAccountSwitchingEventData/source:");
                A11.append(this.A01);
                A11.append(", numPendingMessageNotifs:");
                A11.append(this.A02);
                A11.append(", startTimeMs:");
                A11.append(A062);
            } else {
                Log.i("AccountSwitchingLogger/cacheAccountSwitchingEventData/failed action");
                this.A04 = false;
                int i = 8;
                if (intent.getIntExtra("request_type", 0) == 1) {
                    i = 5;
                }
                this.A00 = i;
                A11 = AnonymousClass000.A11("AccountSwitchingLogger/cacheAccountSwitchingEventData/source:");
                A11.append(this.A01);
                A11.append(", action:");
                A11.append(i);
            }
            obj = A11.toString();
        }
        Log.i(obj);
    }

    public static void A00(AnonymousClass739 r1, AnonymousClass63Q r2) {
        r2.A04 = Long.valueOf((long) (((C29491cN) r1.A07.get()).A0A.A0E() + 1));
    }

    public final void A02() {
        C19830z4 r3 = this.A0A;
        int A002 = C17890vO.A00(C17890vO.A0B(r3), "add_account_source");
        if (A002 != 0) {
            AnonymousClass63Q r1 = new AnonymousClass63Q();
            r1.A02 = Integer.valueOf(A002);
            r1.A01 = C17880vN.A0k();
            A00(this, r1);
            A01(r1);
            C17900vP.A0M(r3, "add_account_source", 0);
            return;
        }
        int i = this.A01;
        if (i == 12) {
            AnonymousClass63Q r12 = new AnonymousClass63Q();
            r12.A02 = Integer.valueOf(this.A01);
            r12.A01 = 19;
            A00(this, r12);
            A01(r12);
        } else if (i != 0) {
            AnonymousClass63Q r5 = new AnonymousClass63Q();
            r5.A02 = Integer.valueOf(this.A01);
            A00(this, r5);
            if (this.A04) {
                r5.A01 = C108955ca.A0e();
                r5.A05 = Long.valueOf(this.A02);
                long j = this.A03;
                if (j != 0) {
                    r5.A03 = C108945cZ.A1B(SystemClock.elapsedRealtime(), j);
                }
            } else {
                r5.A01 = Integer.valueOf(this.A00);
            }
            A01(r5);
        }
    }

    public final void A04(Boolean bool, int i, int i2) {
        if (i != 0) {
            AnonymousClass63Q r1 = new AnonymousClass63Q();
            r1.A02 = Integer.valueOf(i);
            r1.A01 = Integer.valueOf(i2);
            A00(this, r1);
            r1.A00 = bool;
            A01(r1);
            return;
        }
        Log.i("AccountSwitchingLogger/populateAndLogAccountSwitchingAction/action or source is invalid");
    }

    public AnonymousClass739(AnonymousClass11P r2, C19830z4 r3, C18030ve r4, AnonymousClass18K r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r4, r5, r6, r3);
        C18070vi.A0d(r7, 6);
        this.A09 = r2;
        this.A05 = r4;
        this.A06 = r5;
        this.A07 = r6;
        this.A0A = r3;
        this.A08 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (X.C18020vd.A05(r1, r3, 9381) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (X.C18020vd.A05(r1, r3, 9381) == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        if (X.C18020vd.A05(r1, r3, 9381) != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bd, code lost:
        if (X.C18020vd.A05(r1, r3, 9381) == false) goto L_0x00bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(X.AnonymousClass63Q r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingLogger/"
            X.C17900vP.A0Y(r8, r0, r1)
            java.lang.Integer r0 = r8.A02
            r2 = 0
            if (r0 == 0) goto L_0x00c1
            int r1 = r0.intValue()
            r0 = 3
            if (r1 != r0) goto L_0x00c1
            java.lang.Integer r0 = r8.A01
            if (r0 == 0) goto L_0x00c1
            int r1 = r0.intValue()
            r0 = 15
            if (r1 != r0) goto L_0x00c1
            X.18K r4 = r7.A06
            X.0vt r0 = A0B
            r4.CC0(r8, r0, r2)
        L_0x0028:
            java.lang.Integer r0 = r8.A01
            if (r0 == 0) goto L_0x0083
            int r1 = r0.intValue()
            r0 = 7
            if (r1 != r0) goto L_0x0090
            X.62E r5 = new X.62E
            r5.<init>()
            X.0ve r3 = r7.A05
            r0 = 8161(0x1fe1, float:1.1436E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            if (r0 == 0) goto L_0x004d
            r0 = 9381(0x24a5, float:1.3146E-41)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            r6 = 3
            if (r0 == 0) goto L_0x005f
        L_0x004d:
            r0 = 8161(0x1fe1, float:1.1436E-41)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            if (r0 == 0) goto L_0x005e
            r0 = 9381(0x24a5, float:1.3146E-41)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            r6 = 5
            if (r0 != 0) goto L_0x005f
        L_0x005e:
            r6 = 1
        L_0x005f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r5.A01 = r0
            X.00H r0 = r7.A08
            java.lang.Object r0 = r0.get()
            X.2u4 r0 = (X.C64012u4) r0
            boolean r0 = r0.A0K()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingLogger/postTestEvent/"
            X.C17900vP.A0Y(r5, r0, r1)
            r4.CC7(r5)
        L_0x0083:
            r0 = 0
            r7.A03 = r0
            r7.A04 = r2
            r7.A02 = r0
            r7.A01 = r2
            r7.A00 = r2
            return
        L_0x0090:
            r0 = 8
            if (r1 != r0) goto L_0x0083
            X.62E r5 = new X.62E
            r5.<init>()
            X.0ve r3 = r7.A05
            r0 = 8161(0x1fe1, float:1.1436E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            if (r0 == 0) goto L_0x00ae
            r0 = 9381(0x24a5, float:1.3146E-41)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            r6 = 4
            if (r0 == 0) goto L_0x005f
        L_0x00ae:
            r0 = 8161(0x1fe1, float:1.1436E-41)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            if (r0 == 0) goto L_0x00bf
            r0 = 9381(0x24a5, float:1.3146E-41)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            r6 = 6
            if (r0 != 0) goto L_0x005f
        L_0x00bf:
            r6 = 2
            goto L_0x005f
        L_0x00c1:
            X.18K r4 = r7.A06
            r4.CC7(r8)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass739.A01(X.63Q):void");
    }
}
