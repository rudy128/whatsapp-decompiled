package X;

import java.util.Map;

/* renamed from: X.7wG  reason: invalid class name */
public final class AnonymousClass7wG extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass77S $enforcedDecryptedUniqueIdToMessageRowIdMap;
    public final /* synthetic */ AnonymousClass77S $enforcedEncryptedUniqueId;
    public final /* synthetic */ C58612ky $xFamilyEncryptionHelper;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wG(AnonymousClass77S r2, AnonymousClass77S r3, C58612ky r4) {
        super(0);
        this.$enforcedEncryptedUniqueId = r2;
        this.$xFamilyEncryptionHelper = r4;
        this.$enforcedDecryptedUniqueIdToMessageRowIdMap = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        AnonymousClass77S r1 = this.$enforcedEncryptedUniqueId;
        C58612ky r4 = this.$xFamilyEncryptionHelper;
        C18070vi.A0d(r4, 2);
        String str2 = null;
        if (!(r1 == null || (str = (String) r1.A00("XFAM_CROSSPOSTING_REQUEST_MANAGER")) == null || str.length() == 0)) {
            str2 = r4.A00(str);
        }
        Map map = (Map) this.$enforcedDecryptedUniqueIdToMessageRowIdMap.A00("XFAM_CROSSPOSTING_REQUEST_MANAGER");
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }
}
