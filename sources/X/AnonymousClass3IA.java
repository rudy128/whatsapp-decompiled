package X;

import android.view.View;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.3IA  reason: invalid class name */
public final class AnonymousClass3IA extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Collection $names;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3IA(Collection collection) {
        super(1);
        this.$names = collection;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C18070vi.A0d(entry, 0);
        return Boolean.valueOf(C29431cG.A18(this.$names, AnonymousClass1Xr.A02((View) entry.getValue())));
    }
}
