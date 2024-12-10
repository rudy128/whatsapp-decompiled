package X;

import com.whatsapp.productinfra.avatar.data.profilephoto.AvatarAssetsFetcher$fetchAssetsInParallel$1;
import java.util.List;

/* renamed from: X.6xL  reason: invalid class name and case insensitive filesystem */
public final class C138596xL {
    public final AnonymousClass1KB A00;
    public final AnonymousClass10I A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18140vp A05;
    public final C18030ve A06;

    public static final List A00(C138596xL r6, List list, boolean z, boolean z2) {
        C1405371w r3 = (C1405371w) r6.A02.get();
        List list2 = list;
        if (!C18020vd.A05(C18040vf.A02, r6.A06, 3237)) {
            return r3.A02(list2, C1592383t.A00, AnonymousClass84M.A00, z, z2);
        }
        return (List) AnonymousClass4GT.A00(AnonymousClass1OR.A00, new AvatarAssetsFetcher$fetchAssetsInParallel$1(r3, list2, (C30391dr) null, AnonymousClass84S.A00, AnonymousClass84L.A00, z, z2));
    }

    public C138596xL(AnonymousClass1KB r1, C18030ve r2, AnonymousClass10I r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, C18140vp r7) {
        C18070vi.A0w(r2, r1, r3, r4, r5);
        C18070vi.A0l(r6, r7);
        this.A06 = r2;
        this.A00 = r1;
        this.A01 = r3;
        this.A04 = r4;
        this.A03 = r5;
        this.A02 = r6;
        this.A05 = r7;
    }
}
