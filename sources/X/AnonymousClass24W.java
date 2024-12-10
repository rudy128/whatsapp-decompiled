package X;

import java.util.Iterator;

/* renamed from: X.24W  reason: invalid class name */
public final class AnonymousClass24W extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass24T this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass24W(AnonymousClass24T r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass24T r3 = this.this$0;
        int i = r3.A00 + 1;
        Object[] objArr = new AnonymousClass20E[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        Iterator it = r3.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass1D6 r2 = (AnonymousClass1D6) it.next();
            objArr[((Number) r2.first).intValue()] = r2.second;
        }
        return objArr;
    }
}
