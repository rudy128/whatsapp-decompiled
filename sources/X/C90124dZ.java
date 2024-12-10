package X;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.community.CommunityHomeActivity;
import com.whatsapp.jid.PhoneUserJid;
import java.util.List;

/* renamed from: X.4dZ  reason: invalid class name and case insensitive filesystem */
public class C90124dZ implements View.OnCreateContextMenuListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C90124dZ(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        MenuItem menuItem;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        MenuItem menuItem2;
        int i;
        switch (this.A00) {
            case 0:
                AnonymousClass4P7 r9 = (AnonymousClass4P7) this.A01;
                AnonymousClass4SF r8 = (AnonymousClass4SF) this.A02;
                List list = C42011xT.A0I;
                int A0G = C72453Mb.A0G(r9, contextMenu, 0);
                PhoneUserJid phoneUserJid = r8.A03;
                C18070vi.A0X(phoneUserJid);
                int i2 = r8.A00;
                AnonymousClass11S r3 = r9.A03;
                if (!r3.A0O(phoneUserJid)) {
                    AnonymousClass1E7 A0H = r9.A07.A0H(phoneUserJid);
                    AnonymousClass4XU r1 = r9.A02;
                    AnonymousClass1FY r0 = r9.A04;
                    r1.A01(contextMenu, r0, A0H);
                    AnonymousClass4XU.A00(contextMenu, r0, phoneUserJid);
                }
                if (r9.A01) {
                    if (i2 == 0) {
                        menuItem = contextMenu.add(2131894809);
                        onMenuItemClickListener = new C89654co(phoneUserJid, r9, 3);
                        menuItem.setOnMenuItemClickListener(onMenuItemClickListener);
                    } else if (i2 == 1) {
                        contextMenu.add(2131889348).setOnMenuItemClickListener(new C89654co(phoneUserJid, r9, 4));
                        if (r9.A00 == A0G && (r9.A04 instanceof CommunityHomeActivity)) {
                            menuItem = contextMenu.add(2131897118);
                            onMenuItemClickListener = new C89674cq(r8, r9, phoneUserJid, A0G);
                            menuItem.setOnMenuItemClickListener(onMenuItemClickListener);
                        }
                    } else if (i2 != A0G) {
                        C17900vP.A0i("admin-context-menu/Unsupported community participant rank: ", AnonymousClass000.A10(), i2);
                    } else if (r3.A0O(phoneUserJid)) {
                        menuItem2 = contextMenu.add(2131889348);
                        i = 5;
                        menuItem2.setOnMenuItemClickListener(new C89654co(phoneUserJid, r9, i));
                        return;
                    } else {
                        return;
                    }
                    if (!r3.A0O(phoneUserJid)) {
                        String A0q = AnonymousClass3MY.A0q(r9.A08, r9.A07.A0H(phoneUserJid));
                        AnonymousClass1FY r32 = r9.A04;
                        menuItem2 = contextMenu.add(C43251zV.A05(r32, r9.A09, AnonymousClass3MW.A0x(r32.getResources(), A0q, new Object[1], 0, 2131895152)));
                        i = 6;
                        menuItem2.setOnMenuItemClickListener(new C89654co(phoneUserJid, r9, i));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AnonymousClass3R9.setUpContextMenu$lambda$2$lambda$0((AnonymousClass3R9) this.A01, (C80893yG) this.A02, contextMenu, view, contextMenuInfo);
                return;
            case 2:
                C73073Ow r33 = (C73073Ow) this.A01;
                AnonymousClass4NS r2 = (AnonymousClass4NS) this.A02;
                C86264Qy r12 = (C86264Qy) r33.A0F.getValue();
                if (r12 != null) {
                    C179509Ig r02 = r33.A00;
                    C18070vi.A0b(contextMenu);
                    r12.A00(contextMenu, r02, r2);
                    return;
                }
                return;
            default:
                AnonymousClass1E7 r5 = (AnonymousClass1E7) this.A02;
                List list2 = C42011xT.A0I;
                C86264Qy r34 = (C86264Qy) ((AnonymousClass3XK) this.A01).A06.getValue();
                if (r34 != null) {
                    C179509Ig r22 = C179509Ig.OWNER;
                    AnonymousClass4NS r03 = new AnonymousClass4NS(C179509Ig.GUEST, r5, true);
                    C18070vi.A0b(contextMenu);
                    r34.A00(contextMenu, r22, r03);
                    return;
                }
                return;
        }
    }
}
