package X;

import android.view.ContextMenu;
import android.view.MenuItem;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Qy  reason: invalid class name and case insensitive filesystem */
public final class C86264Qy {
    public final AnonymousClass1FY A00;
    public final C28401aA A01;
    public final AnonymousClass4XU A02;
    public final AnonymousClass11S A03;
    public final C24921Me A04;

    public C86264Qy(AnonymousClass4XU r1, AnonymousClass11S r2, AnonymousClass1FY r3, C24921Me r4, C28401aA r5) {
        C18070vi.A0w(r2, r5, r4, r1, r3);
        this.A03 = r2;
        this.A01 = r5;
        this.A04 = r4;
        this.A02 = r1;
        this.A00 = r3;
    }

    public final void A00(ContextMenu contextMenu, C179509Ig r10, AnonymousClass4NS r11) {
        MenuItem add;
        int i;
        MenuItem.OnMenuItemClickListener r1;
        C18070vi.A0i(r10, contextMenu);
        AnonymousClass1BI r4 = r11.A00.A0J;
        C18070vi.A0z(r4, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
        UserJid userJid = (UserJid) r4;
        AnonymousClass11S r12 = this.A03;
        if (!r12.A0O(userJid)) {
            AnonymousClass1E7 r13 = r11.A00;
            AnonymousClass4XU r0 = this.A02;
            AnonymousClass1FY r3 = this.A00;
            r0.A01(contextMenu, r3, r13);
            if (r10 == C179509Ig.OWNER) {
                C179509Ig r7 = r11.A02;
                boolean z = r11.A01;
                String str = this.A04.A0D(r11.A00, -1).A01;
                if (z) {
                    add = contextMenu.add(2131892796);
                    r1 = new C89664cp(userJid, this, str, 0);
                } else {
                    if (r7 == C179509Ig.ADMIN) {
                        contextMenu.add(2131897127).setOnMenuItemClickListener(new C89664cp(userJid, this, str, 1));
                        add = contextMenu.add(2131892560);
                        i = 7;
                    } else if (r7 == C179509Ig.SUBSCRIBED) {
                        add = contextMenu.add(2131892715);
                        i = 8;
                    }
                    r1 = new C89654co(userJid, this, i);
                }
                add.setOnMenuItemClickListener(r1);
            }
            AnonymousClass4XU.A00(contextMenu, r3, userJid);
        } else if (r10 == C179509Ig.ADMIN) {
            AnonymousClass1E2 A09 = r12.A09();
            if (A09 != null) {
                userJid = A09;
            }
            contextMenu.add(2131889499).setOnMenuItemClickListener(new C89654co(userJid, this, 9));
        }
    }
}
