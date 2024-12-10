package com.whatsapp.calling.bcall.data;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C17880vN;
import X.C18070vi;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public final class AudienceInfo {
    public final int publisherCount;
    public final ArrayList publishers = AnonymousClass000.A13();
    public final String sessionId;
    public final int viewerCount;
    public final ArrayList viewers = AnonymousClass000.A13();

    public AudienceInfo(String str, int i, int i2) {
        C18070vi.A0d(str, 1);
        this.sessionId = str;
        this.viewerCount = i;
        this.publisherCount = i2;
    }

    public static /* synthetic */ AudienceInfo copy$default(AudienceInfo audienceInfo, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = audienceInfo.sessionId;
        }
        if ((i3 & 2) != 0) {
            i = audienceInfo.viewerCount;
        }
        if ((i3 & 4) != 0) {
            i2 = audienceInfo.publisherCount;
        }
        return audienceInfo.copy(str, i, i2);
    }

    public final void addPublisherInfo(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        this.publishers.add(new ViewerInfo(userJid));
    }

    public final void addViewerInfo(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        this.viewers.add(new ViewerInfo(userJid));
    }

    public final String component1() {
        return this.sessionId;
    }

    public final int component2() {
        return this.viewerCount;
    }

    public final int component3() {
        return this.publisherCount;
    }

    public final AudienceInfo copy(String str, int i, int i2) {
        C18070vi.A0d(str, 0);
        return new AudienceInfo(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudienceInfo) {
                AudienceInfo audienceInfo = (AudienceInfo) obj;
                if (!(C18070vi.A18(this.sessionId, audienceInfo.sessionId) && this.viewerCount == audienceInfo.viewerCount && this.publisherCount == audienceInfo.publisherCount)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C17880vN.A03(this.sessionId) + this.viewerCount) * 31) + this.publisherCount;
    }

    public final int getPublisherCount() {
        return this.publisherCount;
    }

    public final ArrayList getPublishers() {
        return this.publishers;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getViewerCount() {
        return this.viewerCount;
    }

    public final ArrayList getViewers() {
        return this.viewers;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AudienceInfo(sessionId='");
        A10.append(this.sessionId);
        A10.append("', viewerCount=");
        A10.append(this.viewerCount);
        A10.append(", viewers=");
        A10.append(this.viewers);
        A10.append(" broadcasterCount=");
        A10.append(this.publisherCount);
        A10.append(", broadcasters=");
        return AnonymousClass001.A1F(this.publishers, A10);
    }
}
