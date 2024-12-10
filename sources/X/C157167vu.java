package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7vu  reason: invalid class name and case insensitive filesystem */
public final class C157167vu extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Map $crosspostingInfoMap;
    public final /* synthetic */ C58612ky $xFamilyEncryptionHelper;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157167vu(C58612ky r2, Map map) {
        super(0);
        this.$crosspostingInfoMap = map;
        this.$xFamilyEncryptionHelper = r2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.87L] */
    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        HashMap A11 = C17880vN.A11();
        Map map = this.$crosspostingInfoMap;
        C58612ky r6 = this.$xFamilyEncryptionHelper;
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            long A05 = C17880vN.A05(A16.getKey());
            AnonymousClass77S r4 = ((C135936t0) A16.getValue()).A02;
            C18070vi.A0d(r6, 2);
            if (r4 == null || (str = (String) r4.A00("XFAM_CROSSPOSTING_REQUEST_MANAGER")) == null || str.length() == 0) {
                C17960vV.A0F(false, "XFamilyCrosspostRequestManager/UniqueId field is empty while iterating through crosspostingInfoMap");
            } else {
                C17880vN.A1N(r6.A00(str), A11, A05);
            }
        }
        return new AnonymousClass77S(new C1418477e(new Object(), A11.getClass(), A11, "XFamilyUniqueIdToMessageRowIdMap"), 2);
    }
}
