package X;

import android.view.View;
import com.whatsapp.biz.catalog.view.CatalogHeader;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8jl  reason: invalid class name and case insensitive filesystem */
public final class C168838jl extends AnonymousClass8IO {
    public View A00;
    public final View A01;
    public final AnonymousClass1GP A02;
    public final AnonymousClass11S A03;
    public final C167938i1 A04;
    public final AnonymousClass11C A05;
    public final C18030ve A06;
    public final AnonymousClass18K A07;
    public final UserJid A08;
    public final C36401np A09;

    public C168838jl(View view, AnonymousClass1GP r5, AnonymousClass1L9 r6, AnonymousClass11S r7, C167938i1 r8, AnonymousClass11C r9, C18030ve r10, AnonymousClass18K r11, UserJid userJid, C36401np r13) {
        super(view);
        this.A08 = userJid;
        this.A03 = r7;
        this.A01 = view;
        this.A04 = r8;
        this.A02 = r5;
        this.A06 = r10;
        this.A09 = r13;
        this.A07 = r11;
        this.A05 = r9;
        CatalogHeader catalogHeader = (CatalogHeader) C18070vi.A05(view, 2131428901);
        this.A00 = C18070vi.A05(view, 2131432041);
        catalogHeader.setUp(userJid);
        if (!r7.A0O(userJid)) {
            catalogHeader.setOnTextClickListener(new C825248h(r6, this, 10));
        }
    }
}
