package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3u4  reason: invalid class name */
public final class AnonymousClass3u4 extends C78633tF {
    public List A00;

    public void A2O(AnonymousClass206 r4) {
        C108875cR r2;
        C18070vi.A0d(r4, 0);
        if (A2Z() && (r2 = this.A0k) != null) {
            boolean Bfa = r2.Bfa(r4);
            List list = this.A00;
            if (list == null) {
                list = C18460wS.A00;
            }
            boolean z = !Bfa;
            r2.CKg(list, z);
            this.A0o.setRowSelected(z);
        }
    }

    public boolean A2h(AnonymousClass205 r4) {
        C18070vi.A0d(r4, 0);
        List list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C18070vi.A18(AnonymousClass3MZ.A10(it), r4)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setAlbumMessages(List list) {
        C18070vi.A0d(list, 0);
        this.A00 = list;
    }

    public List getAlbumMessages() {
        List list = this.A00;
        if (list == null) {
            return C18460wS.A00;
        }
        return list;
    }

    public List getAllMessages() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.2Ly, java.lang.Object, X.36k] */
    public C692336k getMessageCommentInfo() {
        int i;
        List list = this.A00;
        if (list == null) {
            list = C18460wS.A00;
        }
        if (list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A0g.BKN(C17880vN.A0Y(it));
        }
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            C692336k A002 = C60472o5.A00(C17880vN.A0Y(it2));
            if (A002 != null) {
                i = A002.A00();
            } else {
                i = 0;
            }
            i2 += i;
        }
        ? obj = new Object();
        obj.A00 = i2;
        obj.A01 = null;
        obj.A02 = null;
        return obj;
    }

    public int getMessageCount() {
        return this.A00.size();
    }

    public List getRevokedAlbumMessages() {
        return C18460wS.A00;
    }

    public void A1r() {
        C108875cR r2;
        if (A2Z() && (r2 = this.A0k) != null) {
            r2.COH(getFMessage());
            List list = this.A00;
            if (list == null) {
                list = C18460wS.A00;
            }
            r2.CKg(list, true);
        }
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        super.A2V(getFMessage(), z);
        if (z) {
            A2l(false);
        }
    }

    public int getCenteredLayoutId() {
        return 2131624763;
    }

    public int getIncomingLayoutId() {
        return 2131624763;
    }

    public int getOutgoingLayoutId() {
        return 2131624766;
    }
}
