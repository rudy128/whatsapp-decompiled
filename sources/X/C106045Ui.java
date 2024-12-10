package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.5Ui  reason: invalid class name and case insensitive filesystem */
public final class C106045Ui extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Collection $messages;
    public final /* synthetic */ AnonymousClass4ZK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106045Ui(AnonymousClass4ZK r2, Collection collection) {
        super(1);
        this.this$0 = r2;
        this.$messages = collection;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        C18070vi.A0d(abstractCollection, 0);
        AnonymousClass4ZK r4 = this.this$0;
        List A0q = C29431cG.A0q(this.$messages);
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : A0q) {
            if (AnonymousClass4ZK.A00(r4, (AnonymousClass206) next)) {
                A13.add(next);
            }
        }
        abstractCollection.removeAll(C29431cG.A12(A13));
        return abstractCollection;
    }
}
