package X;

import com.whatsapp.storage.StorageUsageActivity;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.7qa  reason: invalid class name and case insensitive filesystem */
public final class C154097qa extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ StorageUsageActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154097qa(StorageUsageActivity storageUsageActivity) {
        super(0);
        this.this$0 = storageUsageActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        boolean z;
        C46162Dk r1;
        AnonymousClass00H r0 = this.this$0.A0O;
        if (r0 != null) {
            AnonymousClass1c4 A0W = C108955ca.A0W(r0);
            if (A0W.A08()) {
                if (C18020vd.A05(C18040vf.A02, A0W.A02, 8174)) {
                    AnonymousClass1CJ r02 = this.this$0.A08;
                    if (r02 != null) {
                        Collection A0H = r02.A0H();
                        if (A0H != null && !A0H.isEmpty()) {
                            Iterator it = A0H.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C29691ci r12 = (C29691ci) it.next();
                                if ((r12 instanceof C46162Dk) && (r1 = (C46162Dk) r12) != null && !AnonymousClass000.A1Z(r1.A02, C179509Ig.GUEST)) {
                                    z = true;
                                    break;
                                }
                            }
                            return Boolean.valueOf(z);
                        }
                    } else {
                        str = "chatsCache";
                    }
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
        str = "newsletterConfig";
        C18070vi.A11(str);
        throw null;
    }
}
