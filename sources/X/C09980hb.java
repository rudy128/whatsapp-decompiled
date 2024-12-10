package X;

import java.util.Map;

/* renamed from: X.0hb  reason: invalid class name and case insensitive filesystem */
public final class C09980hb extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0VQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C09980hb(AnonymousClass0VQ r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        AnonymousClass0t7 r2 = (AnonymousClass0t7) entry.getValue();
        int A04 = this.this$0.A06.A04(key);
        if (A04 < 0 || A04 >= this.this$0.A01) {
            r2.dispose();
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
