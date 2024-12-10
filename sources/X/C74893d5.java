package X;

import android.content.Context;
import android.view.View;
import java.util.Set;

/* renamed from: X.3d5  reason: invalid class name and case insensitive filesystem */
public class C74893d5 extends C74703cE {
    public final AnonymousClass206 A00;
    public final Set A01;

    public C74893d5(Context context, AnonymousClass1L8 r8, AnonymousClass1KB r9, AnonymousClass11C r10, AnonymousClass206 r11, String str, Set set) {
        super(context, r8, r9, r10, str);
        this.A01 = set;
        this.A00 = r11;
    }

    public void onClick(View view) {
        Set set = this.A01;
        if (set != null) {
            ((AnonymousClass1FU) AnonymousClass3Ma.A05(view)).CMl(C123646Vg.A00(this.A06, this.A00.A0v.A01, set));
            return;
        }
        super.onClick(view);
    }
}
