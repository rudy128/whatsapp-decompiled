package X;

import com.whatsapp.TextData;

/* renamed from: X.32J  reason: invalid class name */
public class AnonymousClass32J implements AnonymousClass20p {
    public boolean Bes(AnonymousClass206 r2) {
        return true;
    }

    public final AnonymousClass206 BHO(C59652mf r6, AnonymousClass206 r7) {
        boolean A15 = C18070vi.A15(r7, r6);
        if (r7 instanceof AnonymousClass210) {
            AnonymousClass210 r72 = (AnonymousClass210) r7;
            C18070vi.A0d(r72, A15 ? 1 : 0);
            AnonymousClass210 r4 = new AnonymousClass210(r6.A01, r6.A00);
            C194599rz r0 = r72.A0L().A00;
            if (r0 != null) {
                r4.A0g(new C194599rz(r0.A00, r0.A01, AnonymousClass000.A13()));
            }
            AnonymousClass210.A0A(r72, r4);
            r4.A02 = null;
            TextData textData = r72.A02;
            if (textData != null) {
                r4.A19(textData.thumbnail);
            }
            return r4;
        }
        throw AnonymousClass000.A0k("Failed requirement.");
    }
}
