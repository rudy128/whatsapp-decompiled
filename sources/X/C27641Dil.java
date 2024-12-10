package X;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.Dil  reason: case insensitive filesystem */
public final class C27641Dil extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C25013CTn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27641Dil(C25013CTn cTn) {
        super(0);
        this.this$0 = cTn;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Context context = ((AnonymousClass118) this.this$0.A00.get()).A00;
        C18070vi.A0X(context);
        Locale locale = Locale.US;
        Object[] A1a = AnonymousClass3MW.A1a();
        C17880vN.A1T(A1a, C19740yt.A00(context, 2131103150) & 16777215, 0);
        return C108955ca.A12(locale, "%06X", Arrays.copyOf(A1a, 1));
    }
}
