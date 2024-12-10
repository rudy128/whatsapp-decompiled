package X;

import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4nt  reason: invalid class name and case insensitive filesystem */
public class C96464nt implements C22509BAq {
    public final /* synthetic */ AcceptInviteLinkActivity A00;
    public final /* synthetic */ AnonymousClass1EC A01;

    public C96464nt(AcceptInviteLinkActivity acceptInviteLinkActivity, AnonymousClass1EC r2) {
        this.A00 = acceptInviteLinkActivity;
        this.A01 = r2;
    }

    public void C7D(AnonymousClass1EC r23, UserJid userJid, C42661yX r25, String str, Map map, int i, int i2, int i3, long j, boolean z, boolean z2) {
        int i4;
        AcceptInviteLinkActivity acceptInviteLinkActivity = this.A00;
        Map map2 = map;
        ArrayList A0M = acceptInviteLinkActivity.A0B.A0M(map2);
        AnonymousClass1EC r10 = r23;
        C63872tp r7 = new C63872tp(r10, 0);
        Iterator A15 = AnonymousClass000.A15(map2);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            String str2 = ((C60052nJ) A16.getValue()).A04;
            boolean equals = "admin".equals(str2);
            boolean equals2 = "superadmin".equals(str2);
            if (equals) {
                i4 = 1;
            } else if (equals2) {
                i4 = 2;
            }
            r7.A0P((UserJid) A16.getKey(), acceptInviteLinkActivity.A08.A0A((UserJid) A16.getKey()), i4, false);
        }
        Object obj = acceptInviteLinkActivity.A0O.get();
        if (obj != null) {
            acceptInviteLinkActivity.A07.A00.put(obj, r7);
        }
        acceptInviteLinkActivity.A05.A0J(new C21455AkM(this, new AnonymousClass4PG(r10, userJid, r25, str, (String) null, A0M, i, 0, 0, j, false), this.A01, 6));
    }

    public void onError(int i) {
        this.A00.A05.A0J(new AnonymousClass7RP(this, i, 20));
    }
}
