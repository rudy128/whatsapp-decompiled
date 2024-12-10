package X;

import com.whatsapp.messaging.ViewOnceViewerActivity;

/* renamed from: X.4si  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C99374si implements C22841Dk, C1602987x {
    public final /* synthetic */ ViewOnceViewerActivity A00;

    public C99374si(ViewOnceViewerActivity viewOnceViewerActivity) {
        this.A00 = viewOnceViewerActivity;
    }

    public final C18080vj BS6() {
        return new AnonymousClass1JJ(0, this.A00, ViewOnceViewerActivity.class, "finish", "finish()V", 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1602987x) || !(obj instanceof C22841Dk)) {
            return false;
        }
        return C18070vi.A18(BS6(), ((C22841Dk) obj).BS6());
    }

    public final int hashCode() {
        return BS6().hashCode();
    }

    public final void C3E() {
        this.A00.finish();
    }
}
