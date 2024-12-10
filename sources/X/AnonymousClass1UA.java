package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1UA  reason: invalid class name */
public class AnonymousClass1UA {
    public final C26881Tv A00;
    public final AnonymousClass1U9 A01;
    public final AnonymousClass1U8 A02;
    public final AnonymousClass00H A03;

    public static void A00(AnonymousClass1UA r3, C188829i3 r4) {
        C58912lS r0;
        if (r4.A0D != null) {
            boolean equals = "image".equals(r4.A0G);
            C54562eL r02 = (C54562eL) r3.A03.get();
            UserJid userJid = r4.A0D;
            C17960vV.A07(userJid);
            if (equals) {
                r0 = r02.A01;
            } else {
                r0 = r02.A02;
            }
            r0.A01(userJid);
        }
    }

    public AnonymousClass1UA(C26881Tv r1, AnonymousClass1U9 r2, AnonymousClass1U8 r3, AnonymousClass00H r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
