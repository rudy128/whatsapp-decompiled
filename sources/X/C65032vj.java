package X;

import com.whatsapp.community.CommunityFragment;

/* renamed from: X.2vj  reason: invalid class name and case insensitive filesystem */
public class C65032vj implements C22851Dl, C22841Dk {
    public final int A00;
    public final Object A01;

    public C65032vj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final C18080vj BS6() {
        if (1 - this.A00 != 0) {
            return (C18080vj) this.A01;
        }
        return new AnonymousClass1JI(1, this.A01, CommunityFragment.class, "setAdapterItems", "setAdapterItems(Ljava/util/List;)V", 0);
    }

    public final /* synthetic */ void Bo9(Object obj) {
        if (1 - this.A00 != 0) {
            ((C22821Di) this.A01).invoke(obj);
            return;
        }
        C18070vi.A0d(obj, 0);
        CommunityFragment communityFragment = (CommunityFragment) this.A01;
        AnonymousClass1KB r2 = communityFragment.A04;
        if (r2 != null) {
            r2.A0J(new AnonymousClass7RL(communityFragment, obj, 48));
        } else {
            C18070vi.A11("globalUI");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        Object BS6;
        boolean z = obj instanceof C22851Dl;
        if (1 - this.A00 != 0) {
            if (!z || !(obj instanceof C22841Dk)) {
                return false;
            }
            BS6 = this.A01;
        } else if (!z || !(obj instanceof C22841Dk)) {
            return false;
        } else {
            BS6 = BS6();
        }
        return C18070vi.A18(BS6, ((C22841Dk) obj).BS6());
    }

    public final int hashCode() {
        Object BS6;
        if (1 - this.A00 != 0) {
            BS6 = this.A01;
        } else {
            BS6 = BS6();
        }
        return BS6.hashCode();
    }
}
