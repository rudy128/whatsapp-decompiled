package X;

import java.util.List;

/* renamed from: X.0if  reason: invalid class name and case insensitive filesystem */
public final class C10640if extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C04940Pp $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10640if(C04940Pp r2) {
        super(1);
        this.$state = r2;
    }

    /* renamed from: A00 */
    public final Boolean invoke(List list) {
        boolean z;
        if (this.$state.A0A.getValue() != null) {
            AnonymousClass0NM A02 = C04940Pp.A02(this.$state);
            C18070vi.A0b(A02);
            list.add(A02.A03());
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
