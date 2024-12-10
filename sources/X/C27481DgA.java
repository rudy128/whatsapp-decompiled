package X;

import java.util.ArrayList;

/* renamed from: X.DgA  reason: case insensitive filesystem */
public final class C27481DgA extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ D8J this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27481DgA(D8J d8j) {
        super(0);
        this.this$0 = d8j;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String str2;
        C24948CQy cQy = this.this$0.A00;
        if (cQy == null) {
            return null;
        }
        ArrayList A13 = AnonymousClass000.A13();
        C24948CQy cQy2 = cQy;
        do {
            A13.addAll(0, cQy2.A03);
            cQy2 = cQy2.A02;
        } while (cQy2 != null);
        C24948CQy cQy3 = cQy;
        while (true) {
            str = cQy3.A01;
            if (str == null) {
                cQy3 = cQy3.A02;
                if (cQy3 == null) {
                    str = null;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            str2 = cQy.A00;
            if (str2 == null) {
                cQy = cQy.A02;
                if (cQy == null) {
                    str2 = null;
                    break;
                }
            } else {
                break;
            }
        }
        return new CP0(str, str2, A13);
    }
}
