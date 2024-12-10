package X;

import java.util.List;

/* renamed from: X.BwT  reason: case insensitive filesystem */
public class C24161BwT extends C198999zG implements AnonymousClass3LR {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C24161BwT(C29621ca r2, C178169Cb r3, C178169Cb r4, C28544E6s e6s) {
        C18070vi.A0d(e6s, 3);
        this.A01 = r3;
        this.A04 = r4;
        this.A02 = e6s;
        this.A03 = r2;
        this.A00 = r2;
    }

    public void BAY(CUF cuf) {
        String str;
        String str2;
        CUF cuf2 = cuf;
        switch (this.A00) {
            case 0:
                C62312rC r32 = cuf2.A05;
                C29681ch r31 = cuf2.A04;
                long j = cuf2.A02;
                long j2 = cuf2.A00;
                boolean z = cuf2.A0B;
                long j3 = cuf2.A01;
                List list = cuf2.A09;
                List list2 = cuf2.A0A;
                long j4 = cuf2.A03;
                boolean z2 = cuf2.A0C;
                Long l = cuf2.A07;
                long j5 = j;
                long j6 = j2;
                Long l2 = cuf2.A06;
                String str3 = cuf2.A08;
                List list3 = list;
                List list4 = list2;
                C29681ch r14 = r31;
                C62312rC r15 = r32;
                Long l3 = l;
                ((C28544E6s) this.A02).BAX(new CUE(r14, r15, l3, l2, str3, list3, list4, j5, j6, j3, j4, z, z2));
                return;
            case 1:
                C62312rC r16 = cuf2.A05;
                C29681ch r152 = cuf2.A04;
                String str4 = cuf2.A08;
                long j7 = cuf2.A02;
                long j8 = cuf2.A00;
                boolean z3 = cuf2.A0B;
                byte[] bArr = (byte[]) ((AnonymousClass9DM) this.A03).A00;
                long j9 = cuf2.A01;
                List list5 = cuf2.A09;
                List list6 = cuf2.A0A;
                long j10 = cuf2.A03;
                boolean z4 = cuf2.A0C;
                C178169Cb r8 = (C178169Cb) this.A04;
                if (r8 != null) {
                    str = r8.A01;
                } else {
                    str = null;
                }
                String str5 = str4;
                String str6 = str;
                List list7 = list5;
                List list8 = list6;
                C62312rC.A00(r152, r16, (Integer) null, (Long) null, (Long) null, str5, str6, list7, list8, bArr, j7, j8, j9, j10, z3, z4);
                return;
            default:
                C62312rC r11 = cuf2.A05;
                C29681ch r10 = cuf2.A04;
                String str7 = cuf2.A08;
                long j11 = cuf2.A02;
                long j12 = cuf2.A00;
                boolean z5 = cuf2.A0B;
                long j13 = cuf2.A01;
                boolean z6 = cuf2.A0C;
                C178169Cb r6 = (C178169Cb) this.A04;
                if (r6 != null) {
                    str2 = r6.A01;
                } else {
                    str2 = null;
                }
                long j14 = j12;
                long j15 = j11;
                String str8 = str2;
                C62312rC.A00(r10, r11, (Integer) null, (Long) null, (Long) null, str7, str8, (List) null, (List) null, (byte[]) null, j15, j14, j13, 0, z5, z6);
                return;
        }
    }

    public C24161BwT(C29621ca r2, C178169Cb r3, AnonymousClass9DM r4, AnonymousClass9EK r5) {
        this.A03 = r4;
        this.A01 = r5;
        this.A04 = r3;
        this.A02 = r2;
        this.A00 = r2;
    }

    public C24161BwT(C29621ca r2, AnonymousClass9EJ r3, C178169Cb r4, C178169Cb r5) {
        this.A01 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r2;
        this.A00 = r2;
    }
}
