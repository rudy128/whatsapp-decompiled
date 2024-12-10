package X;

import android.view.View;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.contact.photos.MultiContactThumbnail;
import java.util.ArrayList;

/* renamed from: X.5wQ  reason: invalid class name and case insensitive filesystem */
public final class C116115wQ extends C113615nN {
    public C108525bq A00;
    public final C18100vl A01;
    public final C18100vl A02;
    public final CallGridViewModel A03;

    public void A0B() {
        this.A05 = null;
    }

    public void A0E(int i) {
    }

    public void A0J(AnonymousClass70A r6) {
        C89874dA r2;
        C1421478i r1;
        C37451pZ r12;
        C18070vi.A0d(r6, 0);
        this.A05 = r6;
        ArrayList A06 = AnonymousClass1ZU.A06(r6.A0g);
        MultiContactThumbnail multiContactThumbnail = (MultiContactThumbnail) AnonymousClass3MX.A14(this.A01);
        AnonymousClass6bT r0 = this.A0A;
        if (!(r0 == null || (r12 = (C37451pZ) AnonymousClass000.A0w(r0.A00, 3)) == null)) {
            multiContactThumbnail.A00(this.A0B, r12, A06);
        }
        boolean z = r6.A0T;
        C1422678u r3 = null;
        if (z) {
            r2 = new C89874dA(this, 17);
        } else if (!z) {
            r2 = null;
        } else {
            throw AnonymousClass3MW.A14();
        }
        if (r6.A0U) {
            r1 = new C1421478i(this, 4);
        } else {
            r1 = null;
        }
        if (!(r2 == null && r1 == null)) {
            r3 = new C1422678u((Object) this, 4);
        }
        View view = this.A0H;
        view.setOnClickListener(r2);
        view.setOnLongClickListener(r1);
        view.setOnTouchListener(r3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116115wQ(View view, C24771Lp r3, AnonymousClass6bT r4, CallGridViewModel callGridViewModel, AnonymousClass1VW r6, C24921Me r7) {
        super(view, r3, r4, callGridViewModel, r6, r7);
        C18070vi.A0w(r3, view, r4, r6, r7);
        this.A03 = callGridViewModel;
        this.A01 = AnonymousClass1DF.A01(new C148817i3(view));
        this.A02 = AnonymousClass1DF.A01(new C148827i4(view));
        this.A02 = 0;
    }
}
