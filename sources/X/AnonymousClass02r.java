package X;

import android.content.Context;

/* renamed from: X.02r  reason: invalid class name */
public final class AnonymousClass02r implements AnonymousClass009 {
    public final Object A00 = new Object();
    public final Context A01;
    public final AnonymousClass1FD A02;
    public volatile C006102s A03;

    private C24071It A00(Context context, AnonymousClass1FD r4) {
        return new C24071It(new AnonymousClass04G(context, this, 1), r4);
    }

    private C006102s A01() {
        return ((C006202t) A00(this.A01, this.A02).A00(C006202t.class)).A0T();
    }

    public C006302u A02() {
        return ((C006202t) A00(this.A01, this.A02).A00(C006202t.class)).A0U();
    }

    public /* bridge */ /* synthetic */ Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A00) {
                if (this.A03 == null) {
                    this.A03 = A01();
                }
            }
        }
        return this.A03;
    }

    public AnonymousClass02r(AnonymousClass01C r2) {
        this.A02 = r2;
        this.A01 = r2;
    }
}
