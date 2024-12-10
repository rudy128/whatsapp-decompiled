package com.whatsapp.calling.bcall.data;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C18070vi;
import com.whatsapp.jid.UserJid;

public final class ViewerInfo {
    public final UserJid userJid;

    public ViewerInfo(UserJid userJid2) {
        C18070vi.A0d(userJid2, 1);
        this.userJid = userJid2;
    }

    public final UserJid component1() {
        return this.userJid;
    }

    public final ViewerInfo copy(UserJid userJid2) {
        C18070vi.A0d(userJid2, 0);
        return new ViewerInfo(userJid2);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ViewerInfo) && C18070vi.A18(this.userJid, ((ViewerInfo) obj).userJid));
    }

    public int hashCode() {
        return this.userJid.hashCode();
    }

    public static /* synthetic */ ViewerInfo copy$default(ViewerInfo viewerInfo, UserJid userJid2, int i, Object obj) {
        if ((i & 1) != 0) {
            userJid2 = viewerInfo.userJid;
        }
        C18070vi.A0d(userJid2, 0);
        return new ViewerInfo(userJid2);
    }

    public final UserJid getUserJid() {
        return this.userJid;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewerInfo(userJid=");
        return AnonymousClass001.A1F(this.userJid, A10);
    }
}
