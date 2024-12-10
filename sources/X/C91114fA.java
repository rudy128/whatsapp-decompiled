package X;

import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.selection.ui.MessageSelectionBottomMenu;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.4fA  reason: invalid class name and case insensitive filesystem */
public abstract class C91114fA implements AnonymousClass02H, C108025b0 {
    public final AnonymousClass1FY A00;
    public final AnonymousClass5ZZ A01;
    public final C107265Za A02;
    public final C87564Wb A03;
    public final C18000vb A04;

    public Collection BYq() {
        AnonymousClass4S9 A05;
        C80143we r1 = (C80143we) this;
        int i = r1.A00;
        Object obj = r1.A01;
        if (i != 0) {
            AnonymousClass4aY r12 = (AnonymousClass4aY) obj;
            if (r12.A2Q.getSelectedMessages() == null) {
                return null;
            }
            A05 = r12.A2Q.getSelectedMessages();
        } else {
            AnonymousClass3uU r13 = (AnonymousClass3uU) obj;
            if (r13.A00.A05() == null) {
                return null;
            }
            A05 = r13.A00.A05();
        }
        return A05.A00();
    }

    public boolean Bks(MenuItem menuItem, AnonymousClass02B r3) {
        return false;
    }

    public boolean BqR(Menu menu, AnonymousClass02B r6) {
        MessageSelectionBottomMenu messageSelectionBottomMenu;
        C80143we r0 = (C80143we) this;
        int i = r0.A00;
        Object obj = r0.A01;
        if (i != 0) {
            messageSelectionBottomMenu = ((AnonymousClass4aY) obj).A2V;
        } else {
            messageSelectionBottomMenu = ((MediaAlbumActivity) obj).A0D;
        }
        messageSelectionBottomMenu.setUp(this, this.A01, this.A02, this.A03);
        messageSelectionBottomMenu.setVisibility(0);
        C88094Yh r02 = messageSelectionBottomMenu.A00;
        if (r02 != null) {
            r02.A01();
        }
        messageSelectionBottomMenu.A02();
        return true;
    }

    public void BrJ(AnonymousClass02B r5) {
        C80143we r3 = (C80143we) this;
        if (r3.A00 != 0) {
            Log.i("conversation/selectionended");
        } else {
            Log.i("conversation/selectionended");
            MessageSelectionBottomMenu messageSelectionBottomMenu = ((MediaAlbumActivity) r3.A01).A0D;
            messageSelectionBottomMenu.A00 = null;
            messageSelectionBottomMenu.A08.setAdapter((C38391rD) null);
            messageSelectionBottomMenu.setVisibility(8);
        }
        r3.BLL();
    }

    public boolean C1U(Menu menu, AnonymousClass02B r9) {
        int size;
        MessageSelectionBottomMenu messageSelectionBottomMenu;
        C18070vi.A0d(r9, 0);
        Collection BYq = BYq();
        if (BYq != null && (size = BYq.size()) > 0) {
            C80143we r0 = (C80143we) this;
            int i = r0.A00;
            Object obj = r0.A01;
            if (i != 0) {
                messageSelectionBottomMenu = ((AnonymousClass4aY) obj).A2V;
            } else {
                messageSelectionBottomMenu = ((MediaAlbumActivity) obj).A0D;
            }
            messageSelectionBottomMenu.A02();
            Object[] A1a = AnonymousClass3MW.A1a();
            C17880vN.A1T(A1a, size, 0);
            r9.A0B(this.A04.A0K(A1a, 2131755257, (long) size));
        }
        return false;
    }

    public C91114fA(AnonymousClass1FY r2, AnonymousClass5ZZ r3, C107265Za r4, C87564Wb r5, C18000vb r6) {
        C18070vi.A0j(r2, r6);
        C18070vi.A0g(r4, 4, r5);
        this.A00 = r2;
        this.A04 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }
}
