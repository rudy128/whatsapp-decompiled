package X;

import com.whatsapp.community.CommunitySettingsActivity;

/* renamed from: X.5Eh  reason: invalid class name and case insensitive filesystem */
public final class C101875Eh extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CommunitySettingsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101875Eh(CommunitySettingsActivity communitySettingsActivity) {
        super(0);
        this.this$0 = communitySettingsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CommunitySettingsActivity communitySettingsActivity = this.this$0;
        AnonymousClass1EC r2 = communitySettingsActivity.A01;
        if (r2 == null) {
            return null;
        }
        C56362hL r0 = communitySettingsActivity.A00;
        if (r0 != null) {
            return r0.A00(r2, (AnonymousClass1EC) null);
        }
        C18070vi.A11("existingGroupPermissionsViewModelFactory");
        throw null;
    }
}
