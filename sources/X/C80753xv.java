package X;

import android.app.Activity;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.gifsearch.GifSearchContainer;

/* renamed from: X.3xv  reason: invalid class name and case insensitive filesystem */
public final class C80753xv extends AnonymousClass4UI {
    public C107435Zr A00;
    public final AnonymousClass18K A01;
    public final GifSearchContainer A02;
    public final C140126zz A03;
    public final C28931bI A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80753xv(Activity activity, EmojiSearchContainer emojiSearchContainer, AnonymousClass18K r5, C117015z4 r6, C140126zz r7, C28931bI r8) {
        super(activity, r6, emojiSearchContainer);
        C18070vi.A0j(r5, r7);
        C18070vi.A0g(emojiSearchContainer, 4, r6);
        C18070vi.A0d(activity, 6);
        this.A01 = r5;
        this.A03 = r7;
        this.A04 = r8;
        this.A02 = null;
        AnonymousClass4NM r1 = new AnonymousClass4NM(activity, r6, this);
        C144547Hs r0 = r6.A09;
        if (r0 != null) {
            r0.A02 = r1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80753xv(Activity activity, EmojiSearchContainer emojiSearchContainer, AnonymousClass18K r5, C117015z4 r6, GifSearchContainer gifSearchContainer, C140126zz r8) {
        super(activity, r6, emojiSearchContainer);
        C18070vi.A0w(r5, r8, gifSearchContainer, emojiSearchContainer, r6);
        this.A01 = r5;
        this.A03 = r8;
        this.A02 = gifSearchContainer;
        this.A04 = null;
        AnonymousClass4NM r1 = new AnonymousClass4NM(activity, r6, this);
        C144547Hs r0 = r6.A09;
        if (r0 != null) {
            r0.A02 = r1;
        }
    }
}
