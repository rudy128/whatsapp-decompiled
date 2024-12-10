package com.whatsapp.backup.encryptedbackup;

import X.AMQ;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass18K;
import X.AnonymousClass1DT;
import X.AnonymousClass1EG;
import X.AnonymousClass1J2;
import X.AnonymousClass1NO;
import X.AnonymousClass1NP;
import X.AnonymousClass1NT;
import X.AnonymousClass3EB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass8g4;
import X.AnonymousClass9WV;
import X.C108945cZ;
import X.C108965cb;
import X.C170778qe;
import X.C170848ql;
import X.C17890vO;
import X.C179379Hs;
import X.C17960vV;
import X.C18070vi;
import X.C190849lc;
import X.C193399q2;
import X.C19830z4;
import X.C21452AkJ;
import X.C21453AkK;
import X.C21457AkO;
import X.C21462AkT;
import X.C25001Mm;
import X.C33841jT;
import X.C49532Qv;
import X.C72463Mc;
import X.C72473Md;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import org.whispersystems.jobqueue.Job;

public final class EncBackupViewModel extends AnonymousClass1J2 {
    public C193399q2 A00;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0M(C179379Hs.PASSWORD);
    public final AnonymousClass1DT A03 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A04 = C108965cb.A0D(1);
    public final AnonymousClass1DT A05 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A06 = C108965cb.A0D(0);
    public final AnonymousClass1DT A07 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A08 = AnonymousClass3MW.A0M(C17890vO.A0L());
    public final AnonymousClass1DT A09 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A0A = AnonymousClass3MW.A0M(false);
    public final AnonymousClass1DT A0B = AnonymousClass3MW.A0M((Object) null);
    public final AnonymousClass1DT A0C = AnonymousClass3MW.A0M((Object) null);
    public final AnonymousClass1NP A0D;
    public final AnonymousClass1NO A0E;
    public final AnonymousClass1NT A0F;
    public final PasskeyBackupEnabler A0G;
    public final AnonymousClass11C A0H;
    public final C19830z4 A0I;
    public final C33841jT A0J;
    public final AnonymousClass10I A0K;
    public final AnonymousClass00H A0L;
    public final Runnable A0M = new C21457AkO(this, 14);
    public final AnonymousClass18K A0N;

    public EncBackupViewModel(AnonymousClass1NP r3, AnonymousClass1NO r4, AnonymousClass1NT r5, PasskeyBackupEnabler passkeyBackupEnabler, AnonymousClass11C r7, C19830z4 r8, AnonymousClass18K r9, C33841jT r10, AnonymousClass10I r11, AnonymousClass00H r12) {
        C18070vi.A0d(r11, 1);
        C18070vi.A0p(r9, r12, r7);
        C18070vi.A0d(r5, 5);
        C18070vi.A0l(r10, r8);
        C72473Md.A1K(r4, r3);
        this.A0K = r11;
        this.A0N = r9;
        this.A0L = r12;
        this.A0H = r7;
        this.A0F = r5;
        this.A0J = r10;
        this.A0I = r8;
        this.A0G = passkeyBackupEnabler;
        this.A0E = r4;
        this.A0D = r3;
    }

    public static final void A00(EncBackupViewModel encBackupViewModel, int i) {
        AnonymousClass1DT r1;
        int i2;
        if (i == 0) {
            AnonymousClass3MX.A1K(encBackupViewModel.A04, 3);
            if (encBackupViewModel.A0T() == 1) {
                Log.i("encb/EncBackupViewModel/enabled encrypted backup");
                encBackupViewModel.A0X(5);
                r1 = encBackupViewModel.A07;
                i2 = -1;
            } else {
                Log.i("encb/EncBackupViewModel/successfully re-registered with the hsm");
                r1 = encBackupViewModel.A03;
                i2 = 502;
            }
        } else if (i != 3) {
            Log.e("encb/EncBackupViewModel/failed to enable encrypted backup due to a server error");
            r1 = encBackupViewModel.A04;
            i2 = 4;
        } else {
            Log.e("encb/EncBackupViewModel/failed to enable encrypted backup due to a connection error");
            r1 = encBackupViewModel.A04;
            i2 = 8;
        }
        AnonymousClass3MX.A1K(r1, i2);
    }

    public final int A0T() {
        return AnonymousClass8BU.A03(AnonymousClass8BS.A0W(this.A09));
    }

    public final void A0U() {
        AnonymousClass1NT r3 = this.A0F;
        boolean A1Z = AnonymousClass000.A1Z(r3.A01.A08(), C49532Qv.PASSWORD_ENCRYPTED);
        C21457AkO.A01(r3.A07, r3, 10);
        if (A1Z) {
            C25001Mm r2 = r3.A00;
            C190849lc r1 = new C190849lc();
            AnonymousClass3EB.A00("DeleteAccountFromHsmServerJob", r1);
            r2.A01(new Job(r1.A00()));
        }
        Log.i("encb/EncBackupViewModel//encrypted backup disabled");
        AnonymousClass3MX.A1J(this.A03, 402);
    }

    public final void A0V() {
        C179379Hs r0 = (C179379Hs) this.A02.A06();
        if (r0 != null) {
            int ordinal = r0.ordinal();
            if (ordinal == 1) {
                this.A0F.A01.A0J(C49532Qv.ENCRYPTION_KEY_ENCRYPTED);
                A0X(5);
                AnonymousClass3MX.A1K(this.A07, -1);
            } else if (ordinal == 0) {
                AnonymousClass3MX.A1K(this.A04, 2);
                AnonymousClass1NT r2 = this.A0F;
                AnonymousClass9WV r3 = new AnonymousClass9WV(this);
                JniBridge jniBridge = r2.A08;
                AnonymousClass10I r6 = r2.A07;
                new AnonymousClass8g4(r2.A01, r2, r3, r2.A03, r2.A06, r6, jniBridge, (String) AnonymousClass8BS.A0W(this.A05)).A00();
            } else if (ordinal == 2) {
                C193399q2 r32 = this.A00;
                if (r32 != null) {
                    this.A0K.CGN(new C21453AkK(r32, this, 11));
                    return;
                }
                throw AnonymousClass000.A0n("Check failed.");
            }
        } else {
            throw AnonymousClass000.A0n("Check failed.");
        }
    }

    public final void A0W() {
        String A1F = C108945cZ.A1F(this.A01);
        if (A1F == null) {
            return;
        }
        if (A0T() == 2) {
            AnonymousClass1NT r3 = this.A0F;
            AMQ amq = new AMQ(this, 1);
            C17960vV.A0C(AnonymousClass000.A1T(A1F.length(), 64));
            r3.A07.CGF(new C21462AkT(r3, AnonymousClass1EG.A0J(A1F), C49532Qv.ENCRYPTION_KEY_ENCRYPTED, amq, (String) null, 2));
            return;
        }
        AnonymousClass3MX.A1J(this.A04, 2);
        C21452AkJ.A00(this.A0K, this, A1F, 17);
    }

    public final void A0X(int i) {
        C170848ql r1 = new C170848ql();
        r1.A00 = Integer.valueOf(i);
        this.A0N.CC7(r1);
    }

    public final void A0Y(int i) {
        C170848ql r1 = new C170848ql();
        r1.A01 = Integer.valueOf(i);
        this.A0N.CC7(r1);
    }

    public final void A0Z(int i) {
        C170778qe r1 = new C170778qe();
        r1.A00 = Integer.valueOf(i);
        this.A0N.CC7(r1);
    }

    public final void A0a(int i) {
        AnonymousClass3MX.A1J(this.A03, i);
    }

    public final void A0b(boolean z) {
        AnonymousClass1DT r1;
        int i;
        if (z) {
            Log.i("encb/EncBackupViewModel/successfully verified encryption key");
            C72463Mc.A1B(this.A0A);
            AnonymousClass3MX.A1K(this.A04, 3);
            A0Y(4);
            if (A0T() == 4) {
                r1 = this.A03;
                i = 302;
            } else if (A0T() == 6) {
                r1 = this.A03;
                i = 300;
            } else {
                return;
            }
        } else {
            Log.i("encb/EncBackupViewModel/invalid encryption key");
            r1 = this.A04;
            i = 5;
        }
        AnonymousClass3MX.A1K(r1, i);
    }

    public final boolean A0c() {
        Object A0W = AnonymousClass8BS.A0W(this.A0A);
        C18070vi.A0X(A0W);
        return AnonymousClass000.A1Y(A0W);
    }
}
