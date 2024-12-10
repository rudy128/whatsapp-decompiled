package com.whatsapp.conversation.conversationrow.messagerating;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass122;
import X.AnonymousClass1BI;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1W6;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass9XF;
import X.AnonymousClass9j9;

public class MessageRatingViewModel extends AnonymousClass1J2 {
    public boolean A00 = false;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass9XF A02;
    public final AnonymousClass122 A03;
    public final AnonymousClass9j9 A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;

    public static AnonymousClass206 A00(MessageRatingViewModel messageRatingViewModel, AnonymousClass1BI r3, String str) {
        return ((AnonymousClass1W6) messageRatingViewModel.A06.get()).A01.A05(new AnonymousClass205(r3, str, false));
    }

    public MessageRatingViewModel(AnonymousClass9XF r2, AnonymousClass122 r3, AnonymousClass9j9 r4, AnonymousClass10I r5, AnonymousClass00H r6) {
        this.A05 = r5;
        this.A03 = r3;
        this.A06 = r6;
        this.A04 = r4;
        this.A02 = r2;
    }
}
