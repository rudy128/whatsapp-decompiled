package X;

import android.os.Message;
import java.util.List;
import java.util.Set;

/* renamed from: X.1m3  reason: invalid class name and case insensitive filesystem */
public final class C35321m3 {
    public final AnonymousClass121 A00;
    public final C18030ve A01;
    public final C35211lq A02;
    public final AnonymousClass1N7 A03;
    public final AnonymousClass1PT A04;
    public final C200710s A05;
    public final AnonymousClass10I A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass190 A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;

    public C35321m3(AnonymousClass190 r17, AnonymousClass121 r18, C18030ve r19, C35211lq r20, AnonymousClass1N7 r21, AnonymousClass1PT r22, AnonymousClass10I r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30) {
        C18030ve r13 = r19;
        C18070vi.A0d(r13, 1);
        AnonymousClass190 r15 = r17;
        C18070vi.A0d(r15, 2);
        AnonymousClass10I r9 = r23;
        C18070vi.A0d(r9, 3);
        AnonymousClass00H r8 = r24;
        C18070vi.A0d(r8, 4);
        AnonymousClass00H r7 = r25;
        C18070vi.A0d(r7, 5);
        AnonymousClass1N7 r11 = r21;
        C18070vi.A0d(r11, 6);
        AnonymousClass1PT r10 = r22;
        C18070vi.A0d(r10, 7);
        C35211lq r12 = r20;
        C18070vi.A0d(r12, 8);
        AnonymousClass00H r6 = r26;
        C18070vi.A0d(r6, 9);
        AnonymousClass121 r14 = r18;
        C18070vi.A0d(r14, 10);
        AnonymousClass00H r5 = r27;
        C18070vi.A0d(r5, 11);
        AnonymousClass00H r4 = r28;
        C18070vi.A0d(r4, 12);
        AnonymousClass00H r3 = r29;
        C18070vi.A0d(r3, 13);
        AnonymousClass00H r0 = r30;
        C18070vi.A0d(r0, 14);
        this.A01 = r13;
        this.A0B = r15;
        this.A06 = r9;
        this.A0C = r8;
        this.A08 = r7;
        this.A03 = r11;
        this.A04 = r10;
        this.A02 = r12;
        this.A0D = r6;
        this.A00 = r14;
        this.A09 = r5;
        this.A0A = r4;
        this.A07 = r3;
        this.A0E = r0;
        this.A05 = new C200710s(r9, true);
    }

    public final void A01(C29681ch r13, String str, long j, long j2) {
        String str2 = str;
        if (str != null) {
            AnonymousClass00H r1 = this.A0D;
            C29681ch r4 = r13;
            long j3 = j;
            AnonymousClass206 A022 = ((C32471hF) r1.get()).A02(r13, j3);
            if (A022 == null) {
                ((C199149zW) this.A0E.get()).A01(r4, Long.valueOf(j2), (Long) null, str2, (List) null, j3);
                return;
            }
            Object obj = this.A09.get();
            C18070vi.A0X(obj);
            C60152nT r2 = (C60152nT) obj;
            r2.A03(A022, (Boolean) null, (Long) null, Long.valueOf(j2), str2, AnonymousClass11P.A01(r2.A02), true, true);
            ((C32471hF) r1.get()).A05(A022);
        }
    }

    public static final void A00(C35321m3 r3, C60132nR r4) {
        Message A032 = C63902ts.A03(r3.A0B, r3.A01, r4);
        C18070vi.A0X(A032);
        ((AnonymousClass1OZ) r3.A0C.get()).A0M(A032);
    }

    public final void A02(C29681ch r13, Set set, long j, long j2) {
        if (set != null) {
            C29681ch r1 = r13;
            long j3 = j;
            AnonymousClass206 A022 = ((C32471hF) this.A0D.get()).A02(r13, j3);
            long j4 = j2;
            if (A022 == null) {
                ((C199149zW) this.A0E.get()).A01(r1, (Long) null, Long.valueOf(j4), (String) null, C29431cG.A0t(set), j3);
            } else if (A022 instanceof AnonymousClass22H) {
                ((C60152nT) this.A09.get()).A01(r13, (AnonymousClass22H) A022, C29431cG.A0t(set), j4);
            }
        }
    }
}
