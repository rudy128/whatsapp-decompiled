package X;

import java.util.ArrayList;

/* renamed from: X.Dqc  reason: case insensitive filesystem */
public final class C28062Dqc extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ArrayList $destination;
    public final /* synthetic */ C22821Di $transform;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28062Dqc(ArrayList arrayList, C22821Di r3) {
        super(1);
        this.$transform = r3;
        this.$destination = arrayList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18070vi.A0d(obj, 0);
        Object invoke = this.$transform.invoke(obj);
        if (invoke != null) {
            this.$destination.add(invoke);
        }
        return C27621Wu.A00;
    }
}
