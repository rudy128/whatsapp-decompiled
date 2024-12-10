package X;

/* renamed from: X.39d  reason: invalid class name and case insensitive filesystem */
public final class C699439d implements AnonymousClass3ML {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public void CCZ(AnonymousClass206 r5, C49702Rn r6) {
        AnonymousClass1BI r1;
        String A18;
        String str;
        C18070vi.A0d(r5, 0);
        AnonymousClass205 r12 = r5.A0v;
        if (r12.A02) {
            return;
        }
        if (((r5 instanceof AnonymousClass210) || !((!(r5 instanceof C438921i) || (str = ((C438921i) r5).A01) == null || str.length() == 0) && (!(r5 instanceof AnonymousClass21V) || (A18 = ((AnonymousClass21V) r5).A18()) == null || A18.length() == 0))) && (r1 = r12.A00) != null) {
            C42551yM A0a = ((AnonymousClass1Nb) this.A00.get()).A0a(r1);
            if (A0a.A0P) {
                String str2 = A0a.A0M;
                C18070vi.A0X(str2);
                String str3 = A0a.A0N;
                C18070vi.A0X(str3);
                ((AnonymousClass4RU) this.A01.get()).A00(r5, str2, str3);
            }
            if (r6 != null) {
                throw C17900vP.A07(C699439d.class);
            }
        }
    }

    public C699439d(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
