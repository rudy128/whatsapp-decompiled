package com.whatsapp.community.sync;

import X.AnonymousClass190;
import X.C18070vi;
import com.whatsapp.group.GetSubgroupsManager;

public final class CommunitySubGroupsSyncJob extends CommunityOneTimeSyncJob {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass190 A00;
    public transient GetSubgroupsManager A01;
    public final String parentGroupJidString;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunitySubGroupsSyncJob(String str) {
        super(str, "community-fetch-all-subgroups");
        C18070vi.A0d(str, 1);
        this.parentGroupJidString = str;
    }
}
