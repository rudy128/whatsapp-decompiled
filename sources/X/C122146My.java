package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.6My  reason: invalid class name and case insensitive filesystem */
public final class C122146My extends C142837Az {
    public final AnonymousClass1FU A00;
    public final AnonymousClass1KB A01;
    public final C33251iW A02;
    public final AnonymousClass11E A03;
    public final C24921Me A04;
    public final AnonymousClass118 A05;
    public final AnonymousClass11Z A06;
    public final C25181Nf A07;
    public final C18030ve A08;
    public final AnonymousClass168 A09;
    public final C32431hB A0A;
    public final AnonymousClass21W A0B;
    public final C122026Mm A0C;
    public final AnonymousClass00H A0D;

    public C122146My(AnonymousClass1FU r2, AnonymousClass1KB r3, C33251iW r4, AnonymousClass11E r5, C24921Me r6, AnonymousClass118 r7, AnonymousClass11Z r8, C25181Nf r9, C18030ve r10, AnonymousClass168 r11, C32431hB r12, AnonymousClass21W r13, C122026Mm r14, AnonymousClass00H r15) {
        C18070vi.A0d(r11, 9);
        this.A00 = null;
        this.A08 = r10;
        this.A01 = r3;
        this.A05 = r7;
        this.A0D = r15;
        this.A06 = r8;
        this.A0B = r13;
        this.A04 = r6;
        this.A00 = r2;
        this.A09 = r11;
        this.A02 = r4;
        this.A0A = r12;
        this.A03 = r5;
        this.A07 = r9;
        this.A0C = r14;
    }

    public E9Q BHH() {
        E9Q r2;
        File file;
        AnonymousClass21W r14 = this.A0B;
        C62572rc A0M = AnonymousClass3Ma.A0M(r14);
        if (!A0M.A0V || (file = A0M.A0G) == null || !file.exists()) {
            C18030ve r11 = this.A08;
            AnonymousClass1KB r4 = this.A01;
            AnonymousClass118 r8 = this.A05;
            AnonymousClass00H r1 = this.A0D;
            AnonymousClass11Z r9 = this.A06;
            C24921Me r7 = this.A04;
            AnonymousClass168 r12 = this.A09;
            r2 = new AnonymousClass7B1(this.A00, r4, this.A02, this.A03, r7, r8, r9, this.A07, r11, r12, this.A0A, r14, this.A0C, this.A00, r1);
        } else {
            r2 = new AnonymousClass7B0(this.A00, Uri.fromFile(A0M.A0G));
        }
        return r2;
    }
}
