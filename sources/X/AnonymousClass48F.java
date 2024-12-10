package X;

import android.content.Context;
import android.view.View;
import java.util.Map;

/* renamed from: X.48F  reason: invalid class name */
public final class AnonymousClass48F extends C72843Ns {
    public final C107725aU A00;
    public final String A01;
    public final Map A02;

    public void onClick(View view) {
        this.A00.Bwe(this.A01, this.A02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass48F(Context context, C107725aU r2, String str, String str2, Map map) {
        super(context, str);
        C18070vi.A0j(context, str);
        this.A01 = str2;
        this.A02 = map;
        this.A00 = r2;
    }
}
