package X;

import android.content.Intent;
import com.whatsapp.blockinguserinteraction.BlockingUserInteractionActivity;

/* renamed from: X.2vk  reason: invalid class name and case insensitive filesystem */
public class C65042vk implements C22851Dl, C22841Dk {
    public final int A00;
    public final Object A01;

    public C65042vk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final C18080vj BS6() {
        if (8 - this.A00 != 0) {
            return (C18080vj) this.A01;
        }
        return new AnonymousClass1JI(1, this.A01, BlockingUserInteractionActivity.class, "updateUi", "updateUi(I)V", 0);
    }

    public final /* synthetic */ void Bo9(Object obj) {
        if (8 - this.A00 != 0) {
            ((C22821Di) this.A01).invoke(obj);
            return;
        }
        int A0M = AnonymousClass000.A0M(obj);
        BlockingUserInteractionActivity blockingUserInteractionActivity = (BlockingUserInteractionActivity) this.A01;
        if (!(A0M == 0 || A0M == 2)) {
            if (A0M == 3) {
                blockingUserInteractionActivity.setContentView(2131624049);
                AnonymousClass00H r0 = blockingUserInteractionActivity.A02;
                if (r0 != null) {
                    r0.get();
                    Intent flags = AnonymousClass1LU.A0K(blockingUserInteractionActivity, 10485760).setFlags(268435456);
                    C18070vi.A0X(flags);
                    blockingUserInteractionActivity.startActivity(flags);
                    return;
                }
                C18070vi.A11("waIntents");
                throw null;
            } else if (A0M == 4) {
                blockingUserInteractionActivity.setContentView(2131624049);
                return;
            } else if (A0M != 5) {
                return;
            }
        }
        BlockingUserInteractionActivity.A03(blockingUserInteractionActivity);
    }

    public final boolean equals(Object obj) {
        Object BS6;
        boolean z = obj instanceof C22851Dl;
        if (8 - this.A00 != 0) {
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
        if (8 - this.A00 != 0) {
            BS6 = this.A01;
        } else {
            BS6 = BS6();
        }
        return BS6.hashCode();
    }
}
