package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1fW  reason: invalid class name and case insensitive filesystem */
public final class C31411fW implements C26181Rd {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public C59132lo A08;
    public Long A09;
    public final AnonymousClass195 A0A;
    public final C18030ve A0B;
    public final C200710s A0C;
    public final Map A0D = new LinkedHashMap();
    public final C18100vl A0E;
    public final AnonymousClass11P A0F;
    public final AnonymousClass18K A0G;
    public final AnonymousClass1O1 A0H;

    public C31411fW(AnonymousClass195 r3, AnonymousClass11P r4, C18030ve r5, AnonymousClass18K r6, C18010vc r7, AnonymousClass10I r8, AnonymousClass1O1 r9) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r8, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r9, 5);
        C18070vi.A0d(r7, 6);
        C18070vi.A0d(r3, 7);
        this.A0F = r4;
        this.A0B = r5;
        this.A0G = r6;
        this.A0H = r9;
        this.A0A = r3;
        this.A0E = new C18110vm(new C31421fX(r7));
        this.A0C = new C200710s(r8, false);
    }

    public final void A05() {
        synchronized (this) {
            this.A09 = Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    public /* synthetic */ void BvR() {
    }

    public /* synthetic */ void BvS() {
    }

    public /* synthetic */ void BvU() {
    }

    public /* synthetic */ void BvV() {
    }

    public static final void A00(C31411fW r6) {
        SharedPreferences.Editor remove;
        AnonymousClass2B0 r0;
        if (C18020vd.A05(C18040vf.A01, r6.A0B, 8832)) {
            C23624Bmt A0N = AnonymousClass2B7.DEFAULT_INSTANCE.A0N();
            long uptimeMillis = SystemClock.uptimeMillis();
            A0N.A0E();
            AnonymousClass2B7 r1 = (AnonymousClass2B7) A0N.A00;
            r1.bitField0_ |= 1;
            r1.lastPersistedAtUptimeMillis_ = uptimeMillis;
            C59132lo r2 = r6.A08;
            if (!(r2 == null || r6.A02 + r6.A04 + r6.A03 + r6.A01 <= 0 || (r0 = (AnonymousClass2B0) r6.A0D.get(r2)) == null)) {
                A01(r6, r0);
            }
            for (C23624Bmt A0C2 : r6.A0D.values()) {
                A0N.A0E();
                AnonymousClass2B7 r3 = (AnonymousClass2B7) A0N.A00;
                C23577Bm6 A0C3 = A0C2.A0C();
                A0C3.getClass();
                EE9 ee9 = r3.attemptMetrics_;
                if (!((C27296DbR) ee9).A00) {
                    ee9 = C23577Bm6.A09(ee9);
                    r3.attemptMetrics_ = ee9;
                }
                ee9.add(A0C3);
            }
            AnonymousClass2B7 r32 = (AnonymousClass2B7) A0N.A0C();
            if (r32 == null || r32.attemptMetrics_.size() <= 0) {
                C18100vl r12 = r6.A0E;
                if (((SharedPreferences) r12.getValue()).contains("attempt_metrics_list_proto")) {
                    remove = ((SharedPreferences) r12.getValue()).edit().remove("attempt_metrics_list_proto");
                } else {
                    return;
                }
            } else {
                r32.attemptMetrics_.size();
                remove = ((SharedPreferences) r6.A0E.getValue()).edit();
                C18070vi.A0X(remove);
                AnonymousClass2UR.A00(remove, "attempt_metrics_list_proto", r32.A0M());
            }
            remove.apply();
        }
    }

    public static final void A01(C31411fW r4, AnonymousClass2B0 r5) {
        C23624Bmt A0N = AnonymousClass2BJ.DEFAULT_INSTANCE.A0N();
        int i = r4.A02;
        A0N.A0E();
        AnonymousClass2BJ r1 = (AnonymousClass2BJ) A0N.A00;
        r1.bitField0_ |= 1;
        r1.messages_ = i;
        int i2 = r4.A04;
        A0N.A0E();
        AnonymousClass2BJ r12 = (AnonymousClass2BJ) A0N.A00;
        r12.bitField0_ |= 2;
        r12.receipts_ = i2;
        int i3 = r4.A03;
        A0N.A0E();
        AnonymousClass2BJ r13 = (AnonymousClass2BJ) A0N.A00;
        r13.bitField0_ |= 4;
        r13.notifications_ = i3;
        int i4 = r4.A01;
        A0N.A0E();
        AnonymousClass2BJ r14 = (AnonymousClass2BJ) A0N.A00;
        r14.bitField0_ |= 8;
        r14.calls_ = i4;
        r5.A0E();
        AnonymousClass2BZ r2 = (AnonymousClass2BZ) r5.A00;
        AnonymousClass2BJ r15 = (AnonymousClass2BJ) A0N.A0C();
        int i5 = AnonymousClass2BZ.ACTIVE_MODE_UPTIME_MILLIS_FIELD_NUMBER;
        r15.getClass();
        r2.received_ = r15;
        r2.bitField0_ |= 8;
    }

    public static final void A02(C31411fW r13, AnonymousClass3MI r14, int i) {
        AnonymousClass18K r5 = r13.A0G;
        long uptimeMillis = SystemClock.uptimeMillis();
        AnonymousClass1O1 r1 = r13.A0H;
        String A002 = AnonymousClass1O1.A00(r1, r1.A00);
        boolean z = r13.A0A.A00;
        AnonymousClass2HS r6 = new AnonymousClass2HS();
        r6.A0N = r14.BZ4();
        r6.A06 = Long.valueOf((long) r14.BNB());
        r6.A05 = Integer.valueOf(i);
        r6.A01 = Boolean.valueOf(!r14.BTN());
        r6.A00 = Boolean.valueOf(r14.BQi());
        r6.A08 = Long.valueOf((long) r14.BRS().messages_);
        r6.A0A = Long.valueOf((long) r14.BRS().receipts_);
        r6.A09 = Long.valueOf((long) r14.BRS().notifications_);
        r6.A07 = Long.valueOf((long) r14.BRS().calls_);
        r6.A0E = Long.valueOf((long) r14.BXy().messages_);
        r6.A0I = Long.valueOf((long) r14.BXy().receipts_);
        r6.A0F = Long.valueOf((long) r14.BXy().notifications_);
        r6.A0D = Long.valueOf((long) r14.BXy().calls_);
        long BPD = r14.BPD();
        r6.A0L = Long.valueOf(BPD);
        long BVa = r14.BVa();
        long BPE = r14.BPE();
        r6.A0G = Long.valueOf(BVa - BPE);
        if (r14.Bce()) {
            r6.A0B = Long.valueOf(r14.BTs() - BPE);
        }
        if (r14.BcV()) {
            r6.A0K = Long.valueOf(r14.BMS() - BPE);
        }
        r6.A0H = Long.valueOf(uptimeMillis - BPE);
        r6.A0J = Long.valueOf(uptimeMillis - r14.BRk());
        r6.A03 = Boolean.valueOf(r14.BZZ());
        r6.A02 = Boolean.valueOf(z);
        r6.A04 = Boolean.valueOf(r14.BVl());
        r6.A0M = A002;
        long BVd = r14.BVd();
        if (BVd != Long.MAX_VALUE) {
            r6.A0C = Long.valueOf((BPD - BVd) / 86400000);
        }
        r5.CC7(r6);
    }

    public static final void A03(C31411fW r5, boolean z) {
        Map map = r5.A0D;
        if (!map.isEmpty()) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                AnonymousClass2B0 r3 = (AnonymousClass2B0) it.next();
                if (!((AnonymousClass2BZ) r3.A00).isOfflineCompleteReceived_) {
                    it.remove();
                    StringBuilder sb = new StringBuilder();
                    sb.append("OfflineResumeMetrics/logMetricsWithMissedOfflineCompleteIb ");
                    AnonymousClass2BZ r1 = (AnonymousClass2BZ) r3.A00;
                    sb.append(r1.sessionId_);
                    sb.append('/');
                    sb.append(r1.attemptNumber_);
                    sb.append(" setDisconnected=");
                    sb.append(z);
                    Log.i(sb.toString());
                    if (z) {
                        AnonymousClass2BZ A0W = C17880vN.A0W(r3);
                        A0W.bitField0_ |= 16384;
                        A0W.disconnected_ = true;
                    }
                    A02(r5, r3, 2);
                }
            }
        }
    }

    public final void A04() {
        if (C18020vd.A05(C18040vf.A01, this.A0B, 4353)) {
            synchronized (this) {
                if (this.A06 == 0) {
                    this.A0C.execute(new C70593Bs(this, 22));
                }
                if (this.A05 == 0) {
                    this.A05 = SystemClock.uptimeMillis();
                }
                this.A06 = AnonymousClass11P.A01(this.A0F);
                this.A07 = SystemClock.uptimeMillis();
                this.A09 = null;
                this.A00 = 0;
                A03(this, false);
            }
        }
    }

    public void BvT() {
        if (C18020vd.A05(C18040vf.A01, this.A0B, 4353)) {
            this.A0C.execute(new C70593Bs(this, 23));
        }
    }
}
