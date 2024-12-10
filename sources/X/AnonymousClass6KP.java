package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.collections.ObservableRecyclerView;
import com.whatsapp.recyclerview.NonPredictiveAnimationsLinearLayoutManager;

/* renamed from: X.6KP  reason: invalid class name */
public final class AnonymousClass6KP extends C113585nK implements C161008Az {
    public NonPredictiveAnimationsLinearLayoutManager A00;
    public C121306Jd A01;
    public final C112745ly A02 = new C112745ly(this);
    public final AnonymousClass7MI A03 = new AnonymousClass7MI(this, 0);
    public final ObservableRecyclerView A04;
    public final C24641Lc A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public void ByX(AnonymousClass206 r3, int i) {
        C112275lD r1;
        C18070vi.A0d(r3, 0);
        C38391rD r12 = this.A04.A0B;
        if ((r12 instanceof C112275lD) && (r1 = (C112275lD) r12) != null) {
            r1.A0U(r3, i);
        }
    }

    public void BIZ() {
        ObservableRecyclerView observableRecyclerView = this.A04;
        observableRecyclerView.setAdapter((C38391rD) null);
        observableRecyclerView.setLayoutManager((C38251qy) null);
        observableRecyclerView.A0u(this.A02);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.recyclerview.widget.LinearLayoutManager, com.whatsapp.recyclerview.NonPredictiveAnimationsLinearLayoutManager] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6KP(View view, C18000vb r5, C24641Lc r6, C39991ty r7, C112275lD r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        super(view);
        C18070vi.A0o(r5, r7, r8);
        C18070vi.A0d(r9, 5);
        C18070vi.A0q(r10, r6, r11);
        this.A08 = r9;
        this.A06 = r10;
        this.A05 = r6;
        this.A07 = r11;
        this.A00 = new LinearLayoutManager(AnonymousClass3MY.A04(view), 0, false);
        ObservableRecyclerView observableRecyclerView = (ObservableRecyclerView) view.findViewById(2131435657);
        this.A04 = observableRecyclerView;
        observableRecyclerView.setLayoutDirection(AnonymousClass3MW.A1Z(r5) ? 1 : 0);
        observableRecyclerView.setLayoutManager(this.A00);
        AnonymousClass7RO.A01(C108945cZ.A0a(r10), this, r8, r7, 21);
    }
}
