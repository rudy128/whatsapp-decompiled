package X;

import com.whatsapp.stickers.starred.StarredStickersFlow$avatarStickerCallbackFlow$1;
import com.whatsapp.stickers.starred.StarredStickersFlow$stickerCallbackFlow$1;
import com.whatsapp.stickers.starred.StarredStickersFlow$updateStickerList$1;

/* renamed from: X.6xU  reason: invalid class name and case insensitive filesystem */
public final class C138666xU {
    public AnonymousClass1G3 A00 = C62922sD.A01(C25691Pg.SUSPEND, 0, 0);
    public final C25311Ns A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C18600wl A04;
    public final C23421Fz A05;
    public final C23421Fz A06;
    public final AnonymousClass1OX A07;
    public final C23421Fz A08;
    public final C23421Fz A09;

    public static final void A00(C138666xU r3, C108475bl r4, int i) {
        AnonymousClass3MW.A1X(r3.A04, new StarredStickersFlow$updateStickerList$1(r3, (C30391dr) null, r4, i), r4);
    }

    public C138666xU(C25311Ns r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, C18600wl r12) {
        C18070vi.A0w(r9, r10, r11, r8, r12);
        this.A03 = r10;
        this.A02 = r11;
        this.A01 = r8;
        this.A04 = r12;
        AnonymousClass1OY A022 = AnonymousClass1OW.A02(new AnonymousClass1OE((AnonymousClass1OB) null).plus(C23761Hn.A00()));
        this.A07 = A022;
        AnonymousClass5WL A002 = AnonymousClass4I4.A00(new StarredStickersFlow$stickerCallbackFlow$1(this, r9, (C30391dr) null));
        this.A09 = A002;
        AnonymousClass5WL A003 = AnonymousClass4I4.A00(new StarredStickersFlow$avatarStickerCallbackFlow$1(this, r9, (C30391dr) null));
        this.A08 = A003;
        C99654tF r0 = new C99654tF(0);
        AnonymousClass6I4 r1 = AnonymousClass6I4.A00;
        this.A06 = AnonymousClass4Z7.A01(r1, A022, A002, r0);
        this.A05 = AnonymousClass4Z7.A01(r1, A022, A003, new C99654tF(0));
    }
}
