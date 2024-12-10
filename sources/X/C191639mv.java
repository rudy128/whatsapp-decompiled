package X;

import java.io.File;

/* renamed from: X.9mv  reason: invalid class name and case insensitive filesystem */
public final class C191639mv {
    public final AnonymousClass11S A00;
    public final AnonymousClass1NT A01;
    public final AnonymousClass1NM A02;
    public final C27351Vt A03;
    public final C219317y A04;
    public final C195939uB A05;
    public final C57372iy A06;
    public final C20036A4f A07;

    public final A5N A00(C19947A0e a0e, AnonymousClass9JN r23, File file, boolean z) {
        AnonymousClass9JN r3 = r23;
        int i = r3.version;
        File file2 = file;
        if (i == AnonymousClass9JN.UNENCRYPTED.version) {
            return new A5N((C19947A0e) null, this.A02, this.A04, this.A07, file2);
        }
        C19947A0e a0e2 = a0e;
        if (i == AnonymousClass9JN.CRYPT12.version) {
            C20036A4f a4f = this.A07;
            AnonymousClass11S r12 = this.A00;
            C27351Vt r4 = this.A03;
            AnonymousClass1NT r32 = this.A01;
            File file3 = file2;
            return new C167348fs(r12, a0e2, r32, this.A02, r4, this.A04, this.A06, a4f, file3);
        } else if (i == AnonymousClass9JN.CRYPT13.version) {
            C20036A4f a4f2 = this.A07;
            AnonymousClass11S r122 = this.A00;
            C27351Vt r42 = this.A03;
            AnonymousClass1NT r33 = this.A01;
            File file4 = file2;
            return new C167348fs(r122, a0e2, r33, this.A02, r42, this.A04, this.A06, a4f2, file4);
        } else {
            boolean z2 = z;
            if (i == AnonymousClass9JN.CRYPT14.version) {
                C20036A4f a4f3 = this.A07;
                AnonymousClass11S r5 = this.A00;
                C27351Vt r9 = this.A03;
                return new C167338fr(r5, a0e2, this.A01, this.A02, r9, this.A04, this.A05, this.A06, a4f3, file2, z2);
            } else if (i == AnonymousClass9JN.CRYPT15.version) {
                C20036A4f a4f4 = this.A07;
                AnonymousClass11S r52 = this.A00;
                C27351Vt r92 = this.A03;
                return new C167338fr(r52, a0e2, this.A01, this.A02, r92, this.A04, this.A05, this.A06, a4f4, file2, z2);
            } else {
                C57372iy r2 = this.A06;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("BackupFile/verify-integrity/unknown-version: ");
                A10.append(r3);
                A10.append(' ');
                r2.A00(C17890vO.A0V(file2, A10), 4);
                throw C17880vN.A0f("BackupFile/verify-integrity/unknown-version");
            }
        }
    }

    public C191639mv(AnonymousClass11S r1, AnonymousClass1NT r2, AnonymousClass1NM r3, C27351Vt r4, C219317y r5, C195939uB r6, C57372iy r7, C20036A4f a4f) {
        C18070vi.A0w(a4f, r1, r4, r2, r3);
        C18070vi.A0q(r6, r7, r5);
        this.A07 = a4f;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r5;
    }
}
