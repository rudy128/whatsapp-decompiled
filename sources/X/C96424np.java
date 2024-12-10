package X;

import com.whatsapp.invites.ViewGroupInviteActivity;

/* renamed from: X.4np  reason: invalid class name and case insensitive filesystem */
public class C96424np implements C108075b5 {
    public final /* synthetic */ ViewGroupInviteActivity A00;

    public C96424np(ViewGroupInviteActivity viewGroupInviteActivity) {
        this.A00 = viewGroupInviteActivity;
    }

    public void BvP(byte[] bArr) {
        this.A00.A05.A0J(new C146507Pj(this, bArr, 30));
    }

    public void onError(int i) {
        C17900vP.A0k("ViewGroupInviteActivity/failed-to-get-group-photo/", AnonymousClass000.A10(), i);
    }
}
