package X;

import com.whatsapp.util.Log;

/* renamed from: X.24k  reason: invalid class name and case insensitive filesystem */
public final class C446924k {
    public final C19880zA A00;
    public final AnonymousClass1LY A01;
    public final AnonymousClass1Q6 A02;
    public final C18180vt A03 = new C18180vt(100000, 100000, 1000000, false);
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final C18100vl A0B;
    public final AnonymousClass190 A0C;
    public final AnonymousClass11P A0D;

    public C446924k(C19880zA r5, AnonymousClass190 r6, AnonymousClass11P r7, AnonymousClass1LY r8, AnonymousClass1Q6 r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17) {
        C18070vi.A0d(r10, 1);
        C18070vi.A0d(r7, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r8, 5);
        C18070vi.A0d(r9, 6);
        C18070vi.A0d(r11, 7);
        C18070vi.A0d(r12, 8);
        C18070vi.A0d(r13, 9);
        C18070vi.A0d(r14, 10);
        C18070vi.A0d(r15, 11);
        AnonymousClass00H r2 = r16;
        C18070vi.A0d(r2, 12);
        AnonymousClass00H r1 = r17;
        C18070vi.A0d(r1, 13);
        this.A0D = r7;
        this.A0C = r6;
        this.A00 = r5;
        this.A01 = r8;
        this.A02 = r9;
        this.A08 = r11;
        this.A07 = r12;
        this.A06 = r13;
        this.A0A = r14;
        this.A09 = r15;
        this.A05 = r2;
        this.A04 = r1;
        this.A0B = new C18110vm(new C447024l(r10));
    }

    public static final void A00(AnonymousClass206 r3, C446924k r4, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", message_type=");
        int i = r3.A0u;
        sb.append(i);
        String obj = sb.toString();
        C17960vV.A0F(false, obj);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FMessageDatabaseSubsystem/");
        sb2.append(str2);
        sb2.append("; ");
        sb2.append(obj);
        Log.w(sb2.toString());
        r4.A0C.A0G(str3, String.valueOf(i), false);
    }
}
