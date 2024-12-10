package X;

import org.json.JSONObject;

/* renamed from: X.6Ev  reason: invalid class name and case insensitive filesystem */
public final class C120676Ev extends C143877Fd {
    public boolean A00;
    public final C218617r A01;
    public final AnonymousClass1KB A02;
    public final C24921Me A03;
    public final AnonymousClass1NM A04;
    public final AnonymousClass11Z A05;
    public final AnonymousClass18K A06;
    public final C36181nT A07;
    public final AnonymousClass10I A08;
    public final C53952dM A09;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C120676Ev(X.C218617r r34, X.AnonymousClass1KB r35, X.C24921Me r36, X.AnonymousClass1NM r37, X.AnonymousClass11P r38, X.AnonymousClass118 r39, X.C27301Vn r40, X.AnonymousClass11Z r41, X.AnonymousClass121 r42, X.C24681Lg r43, X.C18030ve r44, X.AnonymousClass18K r45, X.AnonymousClass12N r46, X.C36181nT r47, X.C32431hB r48, X.AnonymousClass10I r49, X.C53952dM r50) {
        /*
            r33 = this;
            r7 = r44
            r2 = r49
            r13 = r35
            r17 = r38
            r16 = r39
            r1 = r16
            r0 = r17
            X.C18070vi.A0w(r1, r0, r7, r13, r2)
            r6 = r45
            r1 = r50
            r12 = r36
            r14 = r34
            r10 = r41
            X.C18070vi.A0x(r14, r6, r10, r1, r12)
            r8 = r43
            r11 = r37
            r3 = r48
            r4 = r47
            r9 = r42
            X.C18070vi.A0y(r9, r8, r11, r4, r3)
            r5 = r46
            r15 = r40
            X.C18070vi.A0m(r15, r5)
            java.lang.Integer r32 = X.AnonymousClass00R.A0N
            r0 = r33
            r31 = r2
            r29 = r4
            r30 = r3
            r27 = r6
            r28 = r5
            r25 = r8
            r26 = r7
            r23 = r10
            r24 = r9
            r21 = r16
            r22 = r15
            r19 = r11
            r20 = r17
            r17 = r13
            r18 = r12
            r15 = r0
            r16 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r0.A02 = r13
            r0.A08 = r2
            r0.A01 = r14
            r0.A06 = r6
            r0.A05 = r10
            r0.A09 = r1
            r0.A03 = r12
            r0.A04 = r11
            r0.A07 = r4
            java.lang.Boolean r0 = X.C17960vV.A01
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120676Ev.<init>(X.17r, X.1KB, X.1Me, X.1NM, X.11P, X.118, X.1Vn, X.11Z, X.121, X.1Lg, X.0ve, X.18K, X.12N, X.1nT, X.1hB, X.10I, X.2dM):void");
    }

    public static final C136466tr A00(C120676Ev r11) {
        byte[] A0K = C17970vW.A0K(r11.A06());
        if (A0K == null) {
            return null;
        }
        JSONObject A16 = C17880vN.A16(C108955ca.A13(A0K));
        long j = A16.getLong("creationTime");
        return new C136466tr(C18070vi.A0J("mediaUrl", A16), C18070vi.A0J("mediaHash", A16), C18070vi.A0J("mediaKey", A16), C18070vi.A0J("mediaName", A16), C18070vi.A0J("mediaEncHash", A16), C18070vi.A0J("directPath", A16), j, A16.getLong("mediaSize"));
    }
}
