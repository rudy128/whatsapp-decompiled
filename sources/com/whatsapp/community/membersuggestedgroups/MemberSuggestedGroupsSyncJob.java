package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass190;
import X.C18070vi;
import X.C183139Xb;
import X.C34511kb;
import com.whatsapp.community.sync.CommunityOneTimeSyncJob;

public final class MemberSuggestedGroupsSyncJob extends CommunityOneTimeSyncJob {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass190 A00;
    public transient C34511kb A01;
    public transient MemberSuggestedGroupsManager A02;
    public transient C183139Xb A03;
    public final String parentGroupJidString;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsSyncJob(String str) {
        super(str, "community-fetch-all-subgroup-suggestions");
        C18070vi.A0d(str, 1);
        this.parentGroupJidString = str;
    }
}
