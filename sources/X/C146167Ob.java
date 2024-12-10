package X;

/* renamed from: X.7Ob  reason: invalid class name and case insensitive filesystem */
public final class C146167Ob implements C1603588d {
    public final C125216ai A00;
    public final AnonymousClass10I A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public static final void A00(C136526tx r6, C146167Ob r7, int i, boolean z) {
        C18070vi.A0d("BloksPreConsentFetcherHelper/performIntegrityCheck: Performing integrity check", 0);
        C130476jU r3 = (C130476jU) r7.A03.get();
        C132546mz r4 = new C132546mz(r6, r7, i);
        if (!z) {
            AnonymousClass00H r62 = r3.A03;
            if (C17890vO.A05(C35051lZ.A00((C35051lZ) r62.get()), "pre_consent_bloks_integrity_timestamp") > AnonymousClass11P.A01(r3.A00)) {
                int i2 = C35051lZ.A00((C35051lZ) r62.get()).getInt("pre_consent_bloks_integrity_disclosure_id", 0);
                String string = C35051lZ.A00((C35051lZ) r62.get()).getString("pre_consent_bloks_integrity_df_token", (String) null);
                if (string == null) {
                    string = "";
                }
                String string2 = C35051lZ.A00((C35051lZ) r62.get()).getString("pre_consent_bloks_integrity_jurisdiction", (String) null);
                if (string2 == null) {
                    string2 = "";
                }
                r4.A00(i2, string, string2);
                return;
            }
        }
        C128056fN r1 = new C128056fN(r4, r3);
        C138336wu.A00(AnonymousClass705.A00(), r1, (C138336wu) r3.A02.get());
    }

    public void BKy(C136526tx r3) {
        C18070vi.A0d("BloksPreConsentFetcherHelper/fetchAccountLinkingBloksPayload: Fetching pre-consent bloks screen", 0);
        A00(r3, this, 1, false);
    }

    public C146167Ob(C125216ai r1, AnonymousClass10I r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r3, r1, r4);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }
}
