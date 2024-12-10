package X;

import java.util.Map;

/* renamed from: X.5TY  reason: invalid class name */
public final class AnonymousClass5TY extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass1BI $jid;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5TY(AnonymousClass1BI r2) {
        super(1);
        this.$jid = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ((Map) obj).get(this.$jid);
        if (obj2 != null) {
            return obj2;
        }
        throw C17880vN.A0g();
    }
}
