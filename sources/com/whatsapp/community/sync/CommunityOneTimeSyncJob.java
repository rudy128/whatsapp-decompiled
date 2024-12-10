package com.whatsapp.community.sync;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass12M;
import X.AnonymousClass190;
import X.AnonymousClass8BS;
import X.C000100c;
import X.C17890vO;
import X.C18070vi;
import X.C22488B9u;
import X.C34511kb;
import android.content.Context;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsSyncJob;
import com.whatsapp.group.GetSubgroupsManager;
import org.whispersystems.jobqueue.Job;

public abstract class CommunityOneTimeSyncJob extends Job implements C22488B9u {
    public final String parentGroupRawJid;

    public void CIZ(Context context) {
        C18070vi.A0d(context, 0);
        C000100c A0H = C17890vO.A0H(AnonymousClass8BS.A02(context));
        if (this instanceof CommunitySubGroupsSyncJob) {
            CommunitySubGroupsSyncJob communitySubGroupsSyncJob = (CommunitySubGroupsSyncJob) this;
            C18070vi.A0d(A0H, 0);
            AnonymousClass190 BG6 = A0H.BG6();
            C18070vi.A0d(BG6, 0);
            communitySubGroupsSyncJob.A00 = BG6;
            GetSubgroupsManager getSubgroupsManager = (GetSubgroupsManager) ((AnonymousClass10E) A0H).A4a.get();
            C18070vi.A0d(getSubgroupsManager, 0);
            communitySubGroupsSyncJob.A01 = getSubgroupsManager;
        } else if (this instanceof CommunityGetParentGroupInfoSyncJob) {
            CommunityGetParentGroupInfoSyncJob communityGetParentGroupInfoSyncJob = (CommunityGetParentGroupInfoSyncJob) this;
            C18070vi.A0d(A0H, 0);
            AnonymousClass190 BG62 = A0H.BG6();
            C18070vi.A0d(BG62, 0);
            communityGetParentGroupInfoSyncJob.A00 = BG62;
            AnonymousClass12M BA8 = A0H.BA8();
            C18070vi.A0d(BA8, 0);
            communityGetParentGroupInfoSyncJob.A01 = BA8;
        } else {
            MemberSuggestedGroupsSyncJob memberSuggestedGroupsSyncJob = (MemberSuggestedGroupsSyncJob) this;
            C18070vi.A0d(A0H, 0);
            AnonymousClass190 BG63 = A0H.BG6();
            C18070vi.A0d(BG63, 0);
            memberSuggestedGroupsSyncJob.A00 = BG63;
            AnonymousClass10E r3 = (AnonymousClass10E) A0H;
            memberSuggestedGroupsSyncJob.A03 = AnonymousClass10G.A5g(r3.Ao8.A00);
            C34511kb r0 = (C34511kb) r3.A2L.get();
            C18070vi.A0d(r0, 0);
            memberSuggestedGroupsSyncJob.A01 = r0;
            MemberSuggestedGroupsManager memberSuggestedGroupsManager = (MemberSuggestedGroupsManager) r3.A6F.get();
            C18070vi.A0d(memberSuggestedGroupsManager, 0);
            memberSuggestedGroupsSyncJob.A02 = memberSuggestedGroupsManager;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CommunityOneTimeSyncJob(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            X.9lc r1 = new X.9lc
            r1.<init>()
            r1.A00 = r4
            r0 = 1
            r1.A02 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A00()
            r2.<init>(r0)
            r2.parentGroupRawJid = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.sync.CommunityOneTimeSyncJob.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (((1 << 0) & X.C18020vd.A00(r2, r3, 6725)) == 0) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0D() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof com.whatsapp.community.sync.CommunitySubGroupsSyncJob
            if (r0 == 0) goto L_0x0011
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.1EC r0 = X.AnonymousClass8BY.A0K(r5, r1)
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            return r0
        L_0x0011:
            boolean r0 = r5 instanceof com.whatsapp.community.sync.CommunityGetParentGroupInfoSyncJob
            if (r0 == 0) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.1EC r0 = X.AnonymousClass8BY.A0K(r5, r1)
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            return r0
        L_0x0022:
            r1 = r5
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsSyncJob r1 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsSyncJob) r1
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            X.1EC r0 = X.AnonymousClass8BY.A0K(r1, r4)
            r4.append(r0)
            java.lang.String r0 = "; useMex="
            r4.append(r0)
            X.9Xb r0 = r1.A03
            if (r0 == 0) goto L_0x0058
            X.0ve r3 = r0.A00
            r0 = 6724(0x1a44, float:9.422E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x0052
            r0 = 0
            r1 = 1
            int r1 = r1 << r0
            r0 = 6725(0x1a45, float:9.424E-42)
            int r0 = X.C18020vd.A00(r2, r3, r0)
            r1 = r1 & r0
            r0 = 1
            if (r1 != 0) goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            java.lang.String r0 = X.AnonymousClass3MY.A0r(r4, r0)
            return r0
        L_0x0058:
            java.lang.String r0 = "groupMexContext"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.sync.CommunityOneTimeSyncJob.A0D():java.lang.String");
    }
}
