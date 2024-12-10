package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.3nb  reason: invalid class name and case insensitive filesystem */
public final class C76593nb extends AnonymousClass3Oj {
    public final Context A00;
    public final List A01;

    public long getItemId(int i) {
        return (long) ((C87614Wg) this.A01.get(i)).A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76593nb(Context context, List list) {
        super(context, list);
        C18070vi.A0j(context, list);
        this.A00 = context;
        this.A01 = list;
    }
}
