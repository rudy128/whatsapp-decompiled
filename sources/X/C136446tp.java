package X;

import android.content.SharedPreferences;
import com.whatsapp.audioRecording.NoiseMetrics;

/* renamed from: X.6tp  reason: invalid class name and case insensitive filesystem */
public final class C136446tp {
    public long A00;
    public long A01;
    public long A02;
    public NoiseMetrics A03;
    public boolean A04;
    public final AnonymousClass1L1 A05;
    public final C132156mI A06;
    public final C126716dB A07;

    public final void A00() {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor A0C;
        String str;
        AnonymousClass1BI r1 = this.A07.A00.A0C;
        if (r1 != null) {
            if (C22971Dz.A0N(r1)) {
                AnonymousClass1L1 r12 = this.A05;
                C19830z4 r0 = r12.A01;
                r12.A00(r0);
                sharedPreferences = r12.A00;
                A0C = C108985cd.A0C(sharedPreferences, r0, r12);
                str = "ptt_record_broadcast";
            } else if (C22971Dz.A0e(r1)) {
                AnonymousClass1L1 r13 = this.A05;
                C19830z4 r02 = r13.A01;
                r13.A00(r02);
                sharedPreferences = r13.A00;
                A0C = C108985cd.A0C(sharedPreferences, r02, r13);
                str = "ptt_record_group";
            } else {
                boolean A0S = C22971Dz.A0S(r1);
                AnonymousClass1L1 r14 = this.A05;
                C19830z4 r03 = r14.A01;
                r14.A00(r03);
                sharedPreferences = r14.A00;
                A0C = C108985cd.A0C(sharedPreferences, r03, r14);
                if (A0S) {
                    str = "ptt_record_interop";
                } else {
                    str = "ptt_record_individual";
                }
            }
            C17880vN.A1D(A0C, str, C17890vO.A05(sharedPreferences, str) + 1);
        }
        this.A04 = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = 0;
    }

    public final void A01(long j, long j2, long j3, boolean z) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor A0C;
        String str;
        C132156mI r0 = this.A06;
        long j4 = this.A01;
        long j5 = this.A02;
        boolean z2 = this.A04;
        r0.A00(this.A03, 1, j, j2, j4, j5, this.A00, z, z2);
        AnonymousClass1BI r1 = this.A07.A00.A0C;
        if (r1 != null) {
            if (C22971Dz.A0N(r1)) {
                AnonymousClass1L1 r12 = this.A05;
                C19830z4 r02 = r12.A01;
                r12.A00(r02);
                sharedPreferences = r12.A00;
                A0C = C108985cd.A0C(sharedPreferences, r02, r12);
                str = "ptt_send_broadcast";
            } else if (C22971Dz.A0e(r1)) {
                AnonymousClass1L1 r13 = this.A05;
                C19830z4 r03 = r13.A01;
                r13.A00(r03);
                sharedPreferences = r13.A00;
                A0C = C108985cd.A0C(sharedPreferences, r03, r13);
                str = "ptt_send_group";
            } else {
                boolean A0S = C22971Dz.A0S(r1);
                AnonymousClass1L1 r14 = this.A05;
                C19830z4 r04 = r14.A01;
                r14.A00(r04);
                sharedPreferences = r14.A00;
                A0C = C108985cd.A0C(sharedPreferences, r04, r14);
                if (A0S) {
                    str = "ptt_send_interop";
                } else {
                    str = "ptt_send_individual";
                }
            }
            C17880vN.A1D(A0C, str, C17890vO.A05(sharedPreferences, str) + 1);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            C18070vi.A0X(edit);
            C17880vN.A1D(edit, "ptt_last_sent_timestamp_ms", j3);
            this.A03 = null;
        }
    }

    public final void A02(long j, boolean z, long j2) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor A0C;
        String str;
        SharedPreferences.Editor putLong;
        C132156mI r0 = this.A06;
        long j3 = this.A01;
        long j4 = this.A02;
        boolean z2 = this.A04;
        long j5 = j2;
        r0.A00(this.A03, 2, j, j5, j3, j4, this.A00, z, z2);
        AnonymousClass1BI r1 = this.A07.A00.A0C;
        if (r1 != null) {
            if (C22971Dz.A0N(r1)) {
                AnonymousClass1L1 r12 = this.A05;
                C19830z4 r02 = r12.A01;
                r12.A00(r02);
                sharedPreferences = r12.A00;
                A0C = C108985cd.A0C(sharedPreferences, r02, r12);
                str = "ptt_cancel_broadcast";
            } else if (C22971Dz.A0e(r1)) {
                AnonymousClass1L1 r13 = this.A05;
                C19830z4 r03 = r13.A01;
                r13.A00(r03);
                sharedPreferences = r13.A00;
                A0C = C108985cd.A0C(sharedPreferences, r03, r13);
                str = "ptt_cancel_group";
            } else {
                boolean A0S = C22971Dz.A0S(r1);
                AnonymousClass1L1 r2 = this.A05;
                C19830z4 r04 = r2.A01;
                r2.A00(r04);
                if (A0S) {
                    SharedPreferences sharedPreferences2 = r2.A00;
                    putLong = C108985cd.A0C(sharedPreferences2, r04, r2).putLong("ptt_cancel_interop", C17890vO.A05(sharedPreferences2, "ptt_cancel_individual") + 1);
                    putLong.apply();
                    this.A03 = null;
                }
                sharedPreferences = r2.A00;
                A0C = C108985cd.A0C(sharedPreferences, r04, r2);
                str = "ptt_cancel_individual";
            }
            putLong = A0C.putLong(str, C17890vO.A05(sharedPreferences, str) + 1);
            putLong.apply();
            this.A03 = null;
        }
    }

    public C136446tp(AnonymousClass1L1 r1, C132156mI r2, C126716dB r3) {
        C18070vi.A0j(r2, r1);
        this.A06 = r2;
        this.A05 = r1;
        this.A07 = r3;
    }
}
