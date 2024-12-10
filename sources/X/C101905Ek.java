package X;

import com.whatsapp.community.LinkExistingGroups;

/* renamed from: X.5Ek  reason: invalid class name and case insensitive filesystem */
public final class C101905Ek extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ LinkExistingGroups this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101905Ek(LinkExistingGroups linkExistingGroups) {
        super(0);
        this.this$0 = linkExistingGroups;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        LinkExistingGroups linkExistingGroups = this.this$0;
        AnonymousClass1EC r1 = linkExistingGroups.A07;
        if (r1 != null) {
            AnonymousClass1MZ r0 = linkExistingGroups.A04;
            if (r0 != null) {
                z = !r0.A0K(r1);
            } else {
                C18070vi.A11("groupParticipantsManager");
                throw null;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
