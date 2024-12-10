package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheet;

/* renamed from: X.5U0  reason: invalid class name */
public final class AnonymousClass5U0 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CoinFlipNUXBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5U0(CoinFlipNUXBottomSheet coinFlipNUXBottomSheet) {
        super(1);
        this.this$0 = coinFlipNUXBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        UserJid userJid;
        if (obj instanceof AnonymousClass97I) {
            CoinFlipNUXBottomSheet coinFlipNUXBottomSheet = this.this$0;
            AnonymousClass11S r0 = coinFlipNUXBottomSheet.A02;
            if (r0 != null) {
                r0.A0I();
                AnonymousClass1E8 r02 = r0.A0D;
                if (!(r02 == null || (userJid = (UserJid) r02.A0J) == null)) {
                    AnonymousClass00H r03 = coinFlipNUXBottomSheet.A06;
                    if (r03 != null) {
                        C18070vi.A0X(r03.get());
                        coinFlipNUXBottomSheet.A1k(AnonymousClass1LU.A1F(coinFlipNUXBottomSheet.A14(), userJid, true, false));
                    }
                    str = "waIntents";
                    C18070vi.A11(str);
                    throw null;
                }
            } else {
                str = "meManager";
                C18070vi.A11(str);
                throw null;
            }
        } else if (obj instanceof AnonymousClass97J) {
            CoinFlipNUXBottomSheet coinFlipNUXBottomSheet2 = this.this$0;
            AnonymousClass00H r04 = coinFlipNUXBottomSheet2.A06;
            if (r04 != null) {
                r04.get();
                coinFlipNUXBottomSheet2.A1k(C72473Md.A0B(coinFlipNUXBottomSheet2.A14(), "com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoActivity"));
                coinFlipNUXBottomSheet2.A28();
            }
            str = "waIntents";
            C18070vi.A11(str);
            throw null;
        } else if (obj instanceof AnonymousClass97H) {
            this.this$0.A28();
        }
        return C27621Wu.A00;
    }
}
