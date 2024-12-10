package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.3c6  reason: invalid class name and case insensitive filesystem */
public class C74623c6 extends C74653c9 {
    public final /* synthetic */ AnonymousClass3uP A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74623c6(Context context, AnonymousClass3uP r4) {
        super(context, AnonymousClass1YL.A00(context, 2130971977, 2131103150));
        this.A00 = r4;
        C18070vi.A0d(context, 1);
    }

    public void onClick(View view) {
        AnonymousClass3uP r3 = this.A00;
        AnonymousClass206 fMessage = r3.getFMessage();
        C108875cR r1 = r3.A0k;
        if (r1 != null) {
            r1.CJr(fMessage, r1.BW6(fMessage) + 1);
            r3.A1u();
        }
    }
}
