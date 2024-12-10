package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Aui  reason: case insensitive filesystem */
public final class C21918Aui extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass12N this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21918Aui(AnonymousClass12N r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List A00 = C21486Akr.A00(C99834tX.A0L(((AnonymousClass20Z) this.this$0.A0B.getValue()).A01()), 24);
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : A00) {
            Object obj = ((AnonymousClass1D6) next).second;
            C18070vi.A0d(obj, 0);
            if ((obj instanceof B83) && !(obj instanceof C22574BDp)) {
                A13.add(next);
            }
        }
        ArrayList A0D = C29351c6.A0D(A13);
        for (Object next2 : A13) {
            C18070vi.A0z(next2, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, com.whatsapp.fmessage.protobuf.deserialization.FMessageProtobufDeserializer>");
            A0D.add(next2);
        }
        return A0D;
    }
}
