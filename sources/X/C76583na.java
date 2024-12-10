package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.3na  reason: invalid class name and case insensitive filesystem */
public final class C76583na extends AnonymousClass3Oj {
    public final Context A00;
    public final List A01;

    public long getItemId(int i) {
        return (long) ((AnonymousClass4UV) this.A01.get(i)).A00;
    }

    public C76583na(Context context, List list) {
        super(context, list);
        this.A00 = context;
        this.A01 = list;
    }
}
