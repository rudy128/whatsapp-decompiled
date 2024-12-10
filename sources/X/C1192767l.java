package X;

/* renamed from: X.67l  reason: invalid class name and case insensitive filesystem */
public final class C1192767l extends C139596z7 {
    public final AnonymousClass7IR A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1192767l(X.AnonymousClass11E r14, X.AnonymousClass11P r15, X.C18000vb r16, X.AnonymousClass18K r17, X.C19960A0r r18, X.AnonymousClass7IP r19, X.AnonymousClass7IR r20, X.AnonymousClass7IS r21, X.AnonymousClass10I r22, X.AnonymousClass00H r23, X.AnonymousClass00H r24) {
        /*
            r13 = this;
            r5 = r15
            r6 = r16
            r7 = r17
            r10 = r21
            r12 = r22
            X.C18070vi.A0w(r15, r12, r7, r6, r10)
            r4 = r14
            r11 = r18
            X.C18070vi.A0l(r14, r11)
            r9 = r20
            r2 = r23
            X.C72473Md.A1K(r9, r2)
            r0 = 11
            r1 = r24
            X.C18070vi.A0d(r1, r0)
            r3 = r13
            r8 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A00 = r9
            r13.A02 = r2
            r13.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1192767l.<init>(X.11E, X.11P, X.0vb, X.18K, X.A0r, X.7IP, X.7IR, X.7IS, X.10I, X.00H, X.00H):void");
    }

    public C138516xD A01() {
        String A002 = C138886xr.A00(this.A01);
        AnonymousClass00H r6 = this.A00.A00;
        boolean A18 = C18070vi.A18(A002, C108995ce.A0F(r6).getString("pref_avatar_sticker_search_dictionary_revision", (String) null));
        AnonymousClass00H r4 = this.A02;
        boolean A182 = C18070vi.A18(((C133716pN) r4.get()).A01(), C108995ce.A0F(r6).getString("pref_avatar_sticker_search_dictionary_filters", (String) null));
        boolean A183 = C18070vi.A18(((C133716pN) r4.get()).A00(), C108995ce.A0F(r6).getString("pref_avatar_sticker_search_dictionary_country_code", (String) null));
        if (!A18 || !A182 || !A183) {
            return new C138516xD((Integer) null, (String) null, (String) null, (String) null, 0, 0);
        }
        return super.A01();
    }
}
