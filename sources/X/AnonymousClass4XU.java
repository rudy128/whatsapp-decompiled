package X;

import android.view.ContextMenu;
import android.view.MenuItem;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4XU  reason: invalid class name */
public final class AnonymousClass4XU {
    public final AnonymousClass1KB A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass1KW A02;
    public final C36451nu A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass11S A05;
    public final C24921Me A06;

    public static final void A00(ContextMenu contextMenu, AnonymousClass1FY r3, UserJid userJid) {
        C18070vi.A0d(userJid, 1);
        contextMenu.add(2131899571).setOnMenuItemClickListener(new C89654co(userJid, r3, 0));
    }

    public final void A01(ContextMenu contextMenu, AnonymousClass1FY r7, AnonymousClass1E7 r8) {
        MenuItem add;
        MenuItem.OnMenuItemClickListener r1;
        AnonymousClass1BI r4 = r8.A0J;
        if (!(r4 instanceof AnonymousClass1E2) && r4 != null) {
            String A0q = AnonymousClass3MY.A0q(this.A06, r8);
            contextMenu.add(r7.getResources().getString(2131892049, AnonymousClass000.A1b(A0q, 1))).setOnMenuItemClickListener(new C89654co(r4, r7, 2));
            if (r8.A0H != null) {
                add = contextMenu.add(C43251zV.A05(r7, this.A02, r7.getResources().getString(2131897877, AnonymousClass000.A1b(A0q, 1))));
                r1 = new C89654co(r7, r8, 1);
            } else if (!this.A05.A0N()) {
                AnonymousClass1BI r3 = r8.A0J;
                C18070vi.A0z(r3, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                contextMenu.add(2131898687).setOnMenuItemClickListener(new C89674cq(this, r7, r3, 0));
                add = contextMenu.add(2131886477);
                r1 = new C89674cq(this, r7, r3, 1);
            } else {
                return;
            }
            add.setOnMenuItemClickListener(r1);
        }
    }

    public AnonymousClass4XU(AnonymousClass1KB r1, AnonymousClass11S r2, AnonymousClass1M9 r3, C24921Me r4, AnonymousClass1KW r5, C36451nu r6, AnonymousClass00H r7) {
        C18070vi.A0w(r1, r2, r5, r3, r4);
        C18070vi.A0l(r7, r6);
        this.A00 = r1;
        this.A05 = r2;
        this.A02 = r5;
        this.A01 = r3;
        this.A06 = r4;
        this.A04 = r7;
        this.A03 = r6;
    }
}
