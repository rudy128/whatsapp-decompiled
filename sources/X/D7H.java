package X;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class D7H implements E8S {
    public static final C25628CjC A04 = new Object();
    public final C26275CwR A00;
    public final Context A01;
    public final C24745CIh A02;
    public final ActivityEmbeddingComponent A03;

    public D7H(Context context, C24745CIh cIh, C26275CwR cwR, ActivityEmbeddingComponent activityEmbeddingComponent) {
        C18070vi.A0d(activityEmbeddingComponent, 1);
        this.A03 = activityEmbeddingComponent;
        this.A00 = cwR;
        this.A02 = cIh;
        this.A01 = context;
    }

    public boolean Be4(Activity activity) {
        return this.A03.isActivityEmbedded(activity);
    }

    public void CIm(E0R e0r) {
        if (C25864CnX.A00() < 2) {
            C24745CIh cIh = this.A02;
            ActivityEmbeddingComponent activityEmbeddingComponent = this.A03;
            AnonymousClass20F A15 = AnonymousClass3MW.A15(List.class);
            C28036DqB dqB = new C28036DqB(this, e0r);
            ClassLoader classLoader = cIh.A00;
            BE6.A0x(activityEmbeddingComponent.getClass(), BE7.A0V(classLoader, "java.util.function.Consumer"), "setSplitInfoCallback", new Class[1], 0).invoke(activityEmbeddingComponent, new Object[]{BEA.A0e(classLoader, "java.util.function.Consumer", new C27093DTs(dqB, A15), new Class[1])});
            return;
        }
        this.A03.setSplitInfoCallback(new D7I(this, e0r));
    }

    public void CKW(Set set) {
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next() instanceof BMq) {
                if (!C18070vi.A18(((D7F) new C24746CIi((EAn) C25432Cfe.A00.invoke(C24507C7b.A00(this.A01))).A00).A05.getValue(), C25643CjW.A01)) {
                    return;
                }
            }
        }
        this.A03.setEmbeddingRules(this.A00.A0A(this.A01, set));
    }
}
