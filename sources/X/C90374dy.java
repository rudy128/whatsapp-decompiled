package X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.4dy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C90374dy implements ViewStub.OnInflateListener {
    public final /* synthetic */ AnonymousClass1F9 A00;
    public final /* synthetic */ C56252hA A01;
    public final /* synthetic */ AnonymousClass4aY A02;

    public final void onInflate(ViewStub viewStub, View view) {
        AnonymousClass4aY r4 = this.A02;
        AnonymousClass1F9 r2 = this.A00;
        C86234Qv r3 = new C86234Qv(view, C19890zB.A00, r4.A1f);
        C91594fw.A00(r2, ((AnonymousClass6nA) r4.A1f.A03.get()).A00(), r3, 42);
        r4.A1M.addOnLayoutChangeListener(new C90204dh(r3, r4, 5));
    }

    public /* synthetic */ C90374dy(AnonymousClass1F9 r1, C56252hA r2, AnonymousClass4aY r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
