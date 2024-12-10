package X;

import java.util.Map;

/* renamed from: X.3IK  reason: invalid class name */
public final class AnonymousClass3IK extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Map $communityAdmins;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3IK(Map map) {
        super(1);
        this.$communityAdmins = map;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18070vi.A0d(obj, 0);
        return Boolean.valueOf(!this.$communityAdmins.containsKey(obj));
    }
}
