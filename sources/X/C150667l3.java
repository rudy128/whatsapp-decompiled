package X;

import java.util.Iterator;

/* renamed from: X.7l3  reason: invalid class name and case insensitive filesystem */
public final class C150667l3 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C129696iD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C150667l3(C129696iD r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C129696iD r4 = this.this$0;
        int i = r4.A00 + 1;
        Object[] objArr = new AnonymousClass20E[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        Iterator it = r4.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass1D6 r0 = (AnonymousClass1D6) it.next();
            objArr[AnonymousClass3MZ.A04(r0)] = r0.second;
        }
        return objArr;
    }
}
