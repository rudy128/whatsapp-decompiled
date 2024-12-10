package X;

import java.util.AbstractCollection;

/* renamed from: X.5RA  reason: invalid class name */
public final class AnonymousClass5RA extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass206 $message;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5RA(AnonymousClass206 r2) {
        super(1);
        this.$message = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        C18070vi.A0d(abstractCollection, 0);
        abstractCollection.add(this.$message);
        return abstractCollection;
    }
}
