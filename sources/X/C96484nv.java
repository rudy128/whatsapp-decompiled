package X;

import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;

/* renamed from: X.4nv  reason: invalid class name and case insensitive filesystem */
public class C96484nv implements C22510BAr {
    public final /* synthetic */ AcceptInviteLinkActivity A00;

    public C96484nv(AcceptInviteLinkActivity acceptInviteLinkActivity) {
        this.A00 = acceptInviteLinkActivity;
    }

    public void C1y(C55782gM r6, long j) {
        byte[] bArr = r6.A00;
        if (bArr != null) {
            AcceptInviteLinkActivity acceptInviteLinkActivity = this.A00;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("AcceptInviteLinkActivity/fetchGroupProfilePicture: ");
            C17900vP.A0o(A10, bArr.length);
            acceptInviteLinkActivity.A05.A0J(new AnonymousClass3C0(acceptInviteLinkActivity, C72473Md.A0E(bArr), 29));
        }
    }

    public void C1x(AnonymousClass1BI r3, String str, int i, long j) {
        C17900vP.A0k("acceptlink/failed-to-get-group-photo/", AnonymousClass000.A10(), i);
    }
}
