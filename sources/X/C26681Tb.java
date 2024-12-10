package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Tb  reason: invalid class name and case insensitive filesystem */
public class C26681Tb {
    public String A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass18K A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass11S A04;
    public final C26371Rw A05;
    public final AnonymousClass1P3 A06;

    public static String A00(C26681Tb r3) {
        String str = r3.A00;
        if (str != null) {
            return str;
        }
        AnonymousClass11S r0 = r3.A04;
        r0.A0I();
        PhoneUserJid phoneUserJid = r0.A0E;
        C17960vV.A07(phoneUserJid);
        DeviceJid primaryDevice = phoneUserJid.getPrimaryDevice();
        C26371Rw r2 = r3.A05;
        String A052 = C26371Rw.A05(r2.A05.A01.A03().A01, r3.A06.A0D(C63962tz.A02(primaryDevice)));
        r3.A00 = A052;
        if (A052 == null) {
            Log.w("CompanionSyncStatsLogger/getBootstrapSessionId MD session ID is null");
        }
        return r3.A00;
    }

    public void A01(C165718be r7, AnonymousClass2BT r8, String str, long j, boolean z) {
        C46892Gh r4 = new C46892Gh();
        int i = 1;
        int i2 = 2;
        if (z) {
            i2 = 1;
        }
        r4.A01 = Integer.valueOf(i2);
        r4.A07 = A00(this);
        long j2 = 0;
        if (r7 != null) {
            j2 = 0 + r7.fileSizeBytes_;
        }
        if (r8 != null) {
            j2 += (long) r8.A0J((EAO) null);
            if ((r8.bitField0_ & 2) != 0) {
                C165718be r0 = r8.externalMutations_;
                if (r0 == null) {
                    r0 = C165718be.DEFAULT_INSTANCE;
                }
                j2 += r0.fileSizeBytes_;
            }
        }
        r4.A02 = Long.valueOf(j2);
        if (!C20126A8l.A09.contains(str)) {
            i = 2;
        }
        r4.A00 = Integer.valueOf(i);
        long A012 = AnonymousClass11P.A01(this.A01);
        r4.A06 = Long.valueOf(A012);
        r4.A03 = Long.valueOf(A012 - j);
        AnonymousClass00H r1 = this.A03;
        long A042 = ((AnonymousClass11Z) r1.get()).A04();
        r4.A04 = Long.valueOf(A042);
        r4.A05 = Long.valueOf(A042 - ((AnonymousClass11Z) r1.get()).A02());
        this.A02.CC7(r4);
    }

    public C26681Tb(AnonymousClass11S r1, C26371Rw r2, AnonymousClass11P r3, AnonymousClass1P3 r4, AnonymousClass18K r5, AnonymousClass00H r6) {
        this.A01 = r3;
        this.A04 = r1;
        this.A02 = r5;
        this.A03 = r6;
        this.A05 = r2;
        this.A06 = r4;
    }
}
