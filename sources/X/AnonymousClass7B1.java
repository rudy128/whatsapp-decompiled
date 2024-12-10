package X;

import android.net.Uri;

/* renamed from: X.7B1  reason: invalid class name */
public final class AnonymousClass7B1 implements E9Q {
    public C136956ug A00;
    public boolean A01;
    public AnonymousClass7B2 A02;
    public final AnonymousClass1FU A03;
    public final AnonymousClass11J A04 = new C143407Dg(this, 2);
    public final AnonymousClass11E A05;
    public final C131776le A06;
    public final AnonymousClass1KB A07;
    public final C33251iW A08;
    public final C24921Me A09;
    public final AnonymousClass118 A0A;
    public final AnonymousClass11Z A0B;
    public final C25181Nf A0C;
    public final AnonymousClass168 A0D;
    public final C32431hB A0E;
    public final AnonymousClass21W A0F;
    public final C122026Mm A0G;
    public final C131776le A0H;

    public void BBr(C28570E8b e8b) {
    }

    public final void A00() {
        C136956ug r7;
        String A002;
        AnonymousClass21W r6 = this.A0F;
        C62572rc A0M = AnonymousClass3Ma.A0M(r6);
        AnonymousClass168 r1 = this.A0D;
        C115295ti A003 = r1.A00(A0M);
        if (A003 == null || A003.A0I()) {
            this.A08.A0M(this.A03, r6, (Runnable) null, false, false);
        }
        C115295ti A004 = r1.A00(A0M);
        if (A004 == null || (r7 = A004.A0r) == null) {
            throw AnonymousClass000.A0n("download file is null");
        }
        r7.A0H = true;
        r7.A0I = true;
        C122026Mm r3 = this.A0G;
        AnonymousClass70W r2 = A004.A0k;
        if (r3.A04 == null) {
            r3.A02 = r2.A06();
        }
        r3.A04 = r2;
        AnonymousClass118 r32 = this.A0A;
        AnonymousClass11Z r4 = this.A0B;
        C24921Me r22 = this.A09;
        C25181Nf r5 = this.A0C;
        this.A02 = new AnonymousClass7B2(r22, r32, r4, r5, r6, r7, this.A0H);
        if (r7.A08 == 4 && (A002 = AnonymousClass6Y0.A00(this.A03, r22, r5, r6, r7)) != null) {
            this.A07.CGP(new C146887Qz(this, r7, A002, 25));
        }
        C32431hB r33 = this.A0E;
        if (C22781De.A03()) {
            if (C18020vd.A05(C18040vf.A02, r33.A0A, 8633)) {
                r33.A0G.CGF(new C146807Qr(r33, r6, 36));
                this.A00 = r7;
            }
        }
        C32431hB.A03(r33, r6);
        this.A00 = r7;
    }

    public Uri Bb3() {
        AnonymousClass7B2 r0 = this.A02;
        if (r0 != null) {
            return r0.Bb3();
        }
        return null;
    }

    public long CAj(C26115Csd csd) {
        if (csd == null) {
            return 0;
        }
        AnonymousClass7RJ.A00(this.A07, this, 34);
        AnonymousClass7B2 r0 = this.A02;
        if (r0 != null) {
            return r0.CAj(csd);
        }
        return -1;
    }

    public void close() {
        AnonymousClass7RJ.A00(this.A07, this, 35);
        AnonymousClass7B2 r0 = this.A02;
        if (r0 != null) {
            r0.close();
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        AnonymousClass7B2 r0 = this.A02;
        if (r0 != null) {
            return r0.read(bArr, i, i2);
        }
        return -1;
    }

    public AnonymousClass7B1(AnonymousClass1FU r3, AnonymousClass1KB r4, C33251iW r5, AnonymousClass11E r6, C24921Me r7, AnonymousClass118 r8, AnonymousClass11Z r9, C25181Nf r10, C18030ve r11, AnonymousClass168 r12, C32431hB r13, AnonymousClass21W r14, C122026Mm r15, C131776le r16, AnonymousClass00H r17) {
        C131776le r0 = r16;
        this.A06 = r0;
        this.A07 = r4;
        this.A0A = r8;
        this.A0B = r9;
        this.A0F = r14;
        this.A09 = r7;
        this.A03 = r3;
        this.A08 = r5;
        this.A0D = r12;
        this.A0E = r13;
        this.A05 = r6;
        this.A0C = r10;
        this.A0G = r15;
        this.A0H = r0;
        if (!C22781De.A03() || !C18020vd.A05(C18040vf.A02, r11, 12703)) {
            A00();
        } else {
            AnonymousClass7RJ.A02(AnonymousClass3MX.A0x(r17), this, 36);
        }
    }
}
