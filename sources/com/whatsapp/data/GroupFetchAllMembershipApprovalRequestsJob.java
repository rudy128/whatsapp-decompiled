package com.whatsapp.data;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass190;
import X.AnonymousClass1EC;
import X.AnonymousClass1MD;
import X.AnonymousClass1OZ;
import X.C000100c;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import X.C195899u7;
import X.C20993Acl;
import X.C22488B9u;
import X.C24751Ln;
import X.C26981Ug;
import X.C29621ca;
import X.C42941yz;
import android.content.Context;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.whispersystems.jobqueue.Job;

public final class GroupFetchAllMembershipApprovalRequestsJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass190 A00;
    public transient C195899u7 A01;
    public transient C24751Ln A02;
    public transient AnonymousClass1OZ A03;
    public final String groupJidRawString;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GroupFetchAllMembershipApprovalRequestsJob(java.lang.String r4) {
        /*
            r3 = this;
            r2 = 1
            X.C18070vi.A0d(r4, r2)
            X.9lc r1 = new X.9lc
            r1.<init>()
            java.lang.String r0 = "group-fetch-all-membership-approval-requests"
            r1.A00 = r0
            r1.A02 = r2
            org.whispersystems.jobqueue.JobParameters r0 = r1.A00()
            r3.<init>(r0)
            r3.groupJidRawString = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.data.GroupFetchAllMembershipApprovalRequestsJob.<init>(java.lang.String):void");
    }

    public void A08() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r1 >= 500) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C(java.lang.Exception r5) {
        /*
            r4 = this;
            r1 = 0
            if (r5 == 0) goto L_0x0007
            java.lang.Throwable r1 = r5.getCause()
        L_0x0007:
            boolean r0 = r1 instanceof X.C122936Sm
            if (r0 == 0) goto L_0x001e
            X.6Sm r1 = (X.C122936Sm) r1
            X.1ca r0 = r1.node
            if (r0 == 0) goto L_0x001e
            int r1 = X.C60482o6.A00(r0)
            r0 = 400(0x190, float:5.6E-43)
            if (r0 > r1) goto L_0x001e
            r0 = 500(0x1f4, float:7.0E-43)
            r3 = 0
            if (r1 < r0) goto L_0x001f
        L_0x001e:
            r3 = 1
        L_0x001f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GroupFetchAllMembershipApprovalRequestsJob/ exception while running iq call "
            r2.append(r0)
            if (r3 == 0) goto L_0x004a
            java.lang.String r0 = ""
        L_0x002c:
            r2.append(r0)
            java.lang.String r0 = "retrying"
            r2.append(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.C17900vP.A0q(r1, r4)
            java.lang.String r0 = "; groupJid="
            r1.append(r0)
            java.lang.String r0 = r4.groupJidRawString
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.C17890vO.A13(r0, r2, r5)
            return r3
        L_0x004a:
            java.lang.String r0 = "not "
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.data.GroupFetchAllMembershipApprovalRequestsJob.A0C(java.lang.Exception):boolean");
    }

    public void CIZ(Context context) {
        C18070vi.A0d(context, 0);
        Context applicationContext = context.getApplicationContext();
        C18070vi.A0X(applicationContext);
        C000100c A0H = C17890vO.A0H(applicationContext);
        this.A03 = A0H.BAA();
        this.A00 = A0H.BG6();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A02 = (C24751Ln) r1.ABe.get();
        this.A01 = (C195899u7) r1.A4q.get();
    }

    public void A0A() {
        C195899u7 r3;
        C24751Ln r1;
        AnonymousClass1OZ r7 = this.A03;
        if (r7 != null && (r3 = this.A01) != null && (r1 = this.A02) != null) {
            Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
            AnonymousClass1EC A012 = C42941yz.A01(this.groupJidRawString);
            C26981Ug r2 = new C26981Ug();
            C20993Acl acl = new C20993Acl(r3, r2, r1, 8);
            String A0B = r7.A0B();
            C29621ca r4 = new C29621ca("membership_approval_requests", (AnonymousClass1MD[]) null);
            AnonymousClass1MD[] r32 = new AnonymousClass1MD[4];
            r32[0] = new AnonymousClass1MD("xmlns", "w:g2");
            r32[1] = new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B);
            C17890vO.A12(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r32);
            r7.A0N(acl, C29621ca.A00(A012, r4, r32), A0B, 355, 32000);
            try {
                r2.get();
            } catch (Exception e) {
                Log.e("GroupFetchAllMembershipApprovalRequestsJob/onRun Failed to fetch pending requests");
                throw e;
            }
        }
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupFetchAllMembershipApprovalRequestsJob canceled");
        StringBuilder A102 = AnonymousClass000.A10();
        C17900vP.A0q(A102, this);
        A102.append("; groupJid=");
        C17890vO.A1B(A10, AnonymousClass000.A0y(this.groupJidRawString, A102));
    }
}
