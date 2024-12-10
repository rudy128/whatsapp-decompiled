package X;

import com.facebook.ale.p000native.CancellationToken;

/* renamed from: X.DXg  reason: case insensitive filesystem */
public final /* synthetic */ class C27171DXg implements C22841Dk, CancellationToken {
    public final /* synthetic */ C27170DXf A00;

    public C27171DXg(C27170DXf dXf) {
        this.A00 = dXf;
    }

    public final C18080vj BS6() {
        return new AnonymousClass1JJ(0, this.A00, C27170DXf.class, "cancel", "cancel()V", 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CancellationToken) || !(obj instanceof C22841Dk)) {
            return false;
        }
        return C18070vi.A18(BS6(), ((C22841Dk) obj).BS6());
    }

    public final int hashCode() {
        return BS6().hashCode();
    }

    public final void cancel() {
        this.A00.A00.invoke();
    }
}
