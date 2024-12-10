package X;

import android.util.Base64;

/* renamed from: X.6o6  reason: invalid class name and case insensitive filesystem */
public final class C133056o6 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    public C133056o6(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        C18070vi.A0q(r6, r7, r8);
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r3;
        this.A02 = r4;
        this.A07 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r8;
    }

    public final C1418377d A00(C130056io r6, String str) {
        C1418377d A0a = C108985cd.A0a();
        A0a.A0F = str;
        A0a.A0I = r6.A03;
        A0a.A0A = r6.A02;
        C62572rc r4 = r6.A01;
        A0a.A08 = r4.A0J;
        String str2 = r6.A04;
        A0a.A0E = str2;
        A0a.A0Q = "application/was".equals(str2);
        byte[] bArr = r4.A0a;
        if (bArr != null) {
            A0a.A0D = Base64.encodeToString(bArr, 3);
        }
        A0a.A00 = (int) r4.A0A;
        A0a.A02 = r4.A06;
        A0a.A03 = r4.A08;
        AnonymousClass70H.A00(A0a, this.A07);
        return A0a;
    }
}
