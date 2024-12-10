package X;

import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2kU  reason: invalid class name and case insensitive filesystem */
public final class C58312kU {
    public final AnonymousClass00H A00;

    public C58312kU(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(AnonymousClass1FL r9, TextEmojiLabel textEmojiLabel, Integer num, int i) {
        String str;
        AnonymousClass1FL r3 = r9;
        C18070vi.A0d(r9, 0);
        C36721oM r2 = (C36721oM) C18070vi.A0E(this.A00);
        String A0F = C18070vi.A0F(r9, i);
        int intValue = num.intValue();
        if (intValue == 1) {
            str = "account-request-information";
        } else if (intValue == 2) {
            str = "newsletter-request-information";
        } else if (intValue != 0) {
            throw new AnonymousClass3EW();
        } else {
            throw AnonymousClass000.A0n("ContextualHelp not supported for gdpr report p2b");
        }
        r2.A00(r3, textEmojiLabel, A0F, "learn-more", str);
    }

    public final void A01(AnonymousClass1FL r5, Integer num) {
        String str;
        C18070vi.A0d(r5, 1);
        C36721oM r2 = (C36721oM) C18070vi.A0E(this.A00);
        int intValue = num.intValue();
        if (intValue == 1) {
            str = "account-request-information";
        } else if (intValue == 2) {
            str = "newsletter-request-information";
        } else if (intValue != 0) {
            throw new AnonymousClass3EW();
        } else {
            throw AnonymousClass000.A0n("ContextualHelp not supported for gdpr report p2b");
        }
        r2.A01(r5, str);
    }
}
