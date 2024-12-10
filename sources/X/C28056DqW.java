package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.DqW  reason: case insensitive filesystem */
public final class C28056DqW extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C23736Boh $environment;
    public final /* synthetic */ E8A $onSuccessExpression;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28056DqW(C23736Boh boh, E8A e8a) {
        super(1);
        this.$environment = boh;
        this.$onSuccessExpression = e8a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18070vi.A0d(obj, 0);
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass8BS.A1B(this.$environment.A00, obj, A1b);
        List asList = Arrays.asList(A1b);
        C18070vi.A0X(asList);
        C25974Cph.A00(this.$environment, new C199029zJ(asList), this.$onSuccessExpression);
        return C27621Wu.A00;
    }
}
