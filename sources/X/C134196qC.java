package X;

import android.app.Activity;

/* renamed from: X.6qC  reason: invalid class name and case insensitive filesystem */
public class C134196qC {
    public final AnonymousClass190 A00;
    public final AnonymousClass1KB A01;
    public final C31131f4 A02;
    public final AnonymousClass11C A03;
    public final AnonymousClass118 A04;
    public final C219217x A05;
    public final C223819r A06;
    public final C24681Lg A07;
    public final C18030ve A08;
    public final C63552tI A09;
    public final AnonymousClass1L1 A0A;
    public final AnonymousClass8CB A0B;
    public final C31111f2 A0C;
    public final C27231Vg A0D;
    public final C136776uN A0E;
    public final AnonymousClass10I A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;

    public C145777Mo A00(Activity activity, C441822l r6, boolean z) {
        C31131f4 r1 = this.A02;
        if (r1.A0D(r6)) {
            C145777Mo A002 = r1.A00();
            C17960vV.A07(A002);
            return A002;
        }
        boolean z2 = true;
        C145777Mo A012 = A01(activity, true, z);
        A012.A0K = r6;
        if (!r6.A0v.A02) {
            int A0D2 = r6.A0D();
            if (!(A0D2 == 9 || A0D2 == 10)) {
                z2 = false;
            }
            A012.A0Q = z2;
        }
        return A012;
    }

    public C145777Mo A01(Activity activity, boolean z, boolean z2) {
        int i = C145777Mo.A15;
        AnonymousClass118 r23 = this.A04;
        C18030ve r27 = this.A08;
        AnonymousClass1KB r43 = this.A01;
        AnonymousClass190 r21 = this.A00;
        AnonymousClass10I r20 = this.A0F;
        C136776uN r19 = this.A0E;
        AnonymousClass11C r18 = this.A03;
        C27231Vg r15 = this.A0D;
        C24681Lg r14 = this.A07;
        C219217x r11 = this.A05;
        AnonymousClass1L1 r10 = this.A0A;
        AnonymousClass8CB r8 = this.A0B;
        C63552tI r7 = this.A09;
        C31111f2 r6 = this.A0C;
        C31131f4 r5 = this.A02;
        C223819r r2 = this.A06;
        AnonymousClass00H r1 = this.A0J;
        AnonymousClass11C r22 = r18;
        C219217x r24 = r11;
        C223819r r25 = r2;
        C24681Lg r26 = r14;
        C88634aG r28 = (C88634aG) this.A0I.get();
        C63552tI r29 = r7;
        AnonymousClass1L1 r30 = r10;
        return new C145777Mo(activity, r21, r43, (C48012Kv) this.A0H.get(), r5, r22, r23, r24, r25, r26, r27, r28, r29, r30, r8, r6, (C139296yb) this.A0L.get(), r15, r19, r20, (C132156mI) this.A0K.get(), (AnonymousClass2LC) this.A0M.get(), r1, this.A0G, z, z2);
    }

    public C134196qC(AnonymousClass190 r2, AnonymousClass1KB r3, C31131f4 r4, AnonymousClass11C r5, AnonymousClass118 r6, C219217x r7, C223819r r8, C24681Lg r9, C18030ve r10, C63552tI r11, AnonymousClass1L1 r12, AnonymousClass8CB r13, C31111f2 r14, C27231Vg r15, C136776uN r16, AnonymousClass10I r17, AnonymousClass00H r18, AnonymousClass00H r19, AnonymousClass00H r20, AnonymousClass00H r21, AnonymousClass00H r22, AnonymousClass00H r23, AnonymousClass00H r24) {
        this.A04 = r6;
        this.A08 = r10;
        this.A01 = r3;
        this.A00 = r2;
        this.A0F = r17;
        this.A0E = r16;
        this.A03 = r5;
        this.A0D = r15;
        this.A07 = r9;
        this.A0K = r18;
        this.A0B = r13;
        this.A0C = r14;
        this.A0M = r19;
        this.A05 = r7;
        this.A0A = r12;
        this.A0H = r20;
        this.A09 = r11;
        this.A02 = r4;
        this.A0I = r21;
        this.A0L = r22;
        this.A06 = r8;
        this.A0J = r24;
        this.A0G = r23;
    }
}
