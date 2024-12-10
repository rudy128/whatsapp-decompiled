package X;

import com.whatsapp.stickers.recent.RecentStickerFlowImpl$avatarStickerCallbackFlow$1;
import com.whatsapp.stickers.recent.RecentStickerFlowImpl$avatarStickerShapesCallbackFlow$1;
import com.whatsapp.stickers.recent.RecentStickerFlowImpl$stickerCallbackFlow$1;
import com.whatsapp.stickers.recent.RecentStickerFlowImpl$stickerShapesCallbackFlow$1;

/* renamed from: X.6kN  reason: invalid class name and case insensitive filesystem */
public final class C131016kN {
    public AnonymousClass1G3 A00 = C62922sD.A01(C25691Pg.SUSPEND, 0, 0);
    public final C1193367s A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C18600wl A04;
    public final C23421Fz A05;
    public final C23421Fz A06;
    public final C23421Fz A07;
    public final AnonymousClass1OX A08;
    public final C23421Fz A09;
    public final C23421Fz A0A;
    public final C23421Fz A0B;
    public final C23421Fz A0C;
    public final C23421Fz A0D;

    public C131016kN(C1193367s r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, C18600wl r15) {
        C18070vi.A0w(r11, r12, r13, r14, r15);
        C18070vi.A0d(r10, 6);
        this.A03 = r13;
        this.A02 = r14;
        this.A04 = r15;
        this.A01 = r10;
        AnonymousClass1OY A022 = AnonymousClass1OW.A02(new AnonymousClass1OE((AnonymousClass1OB) null).plus(C23761Hn.A00()));
        this.A08 = A022;
        AnonymousClass5WL A002 = AnonymousClass4I4.A00(new RecentStickerFlowImpl$stickerCallbackFlow$1(this, r11, (C30391dr) null));
        this.A0C = A002;
        AnonymousClass5WL A003 = AnonymousClass4I4.A00(new RecentStickerFlowImpl$avatarStickerCallbackFlow$1(this, r11, (C30391dr) null));
        this.A09 = A003;
        AnonymousClass5WL A004 = AnonymousClass4I4.A00(new RecentStickerFlowImpl$stickerShapesCallbackFlow$1(this, r12, (C30391dr) null));
        this.A0D = A004;
        AnonymousClass5WL A005 = AnonymousClass4I4.A00(new RecentStickerFlowImpl$avatarStickerShapesCallbackFlow$1(this, r12, (C30391dr) null));
        this.A0A = A005;
        C99654tF r0 = new C99654tF(0);
        AnonymousClass6I1 r3 = AnonymousClass6I1.A00;
        this.A07 = AnonymousClass4Z7.A01(r3, A022, A002, r0);
        this.A06 = AnonymousClass4Z7.A01(r3, A022, A003, new C99654tF(0));
        this.A0B = AnonymousClass4Z7.A01(r3, A022, A004, new C99654tF(0));
        this.A05 = AnonymousClass4Z7.A01(r3, A022, A005, new C99654tF(0));
    }
}
