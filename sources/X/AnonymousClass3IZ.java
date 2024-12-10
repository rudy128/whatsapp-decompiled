package X;

import com.whatsapp.community.CommunityMembersDirectory;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.3IZ  reason: invalid class name */
public final class AnonymousClass3IZ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ boolean $isLidAddressed;
    public final /* synthetic */ CommunityMembersDirectory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3IZ(CommunityMembersDirectory communityMembersDirectory, boolean z) {
        super(1);
        this.this$0 = communityMembersDirectory;
        this.$isLidAddressed = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C63312sr r4 = (C63312sr) obj;
        CommunityMembersDirectory communityMembersDirectory = this.this$0;
        Object obj2 = r4.A04;
        if (this.$isLidAddressed) {
            if (obj2 instanceof PhoneUserJid) {
                obj2 = ((C24751Ln) communityMembersDirectory.A0C.get()).A0C((PhoneUserJid) obj2);
            }
        } else if (obj2 instanceof AnonymousClass1E1) {
            obj2 = ((C24751Ln) communityMembersDirectory.A0C.get()).A0D((AnonymousClass1E1) obj2);
        }
        if (obj2 != null) {
            return AnonymousClass1D6.A01(obj2, r4);
        }
        return null;
    }
}
