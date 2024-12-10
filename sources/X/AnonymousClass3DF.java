package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.3DF  reason: invalid class name */
public class AnonymousClass3DF implements Callable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public AnonymousClass3DF(Context context, C191219mD r2, String str, int i, int i2) {
        this.A00 = i2;
        this.A04 = str;
        this.A02 = context;
        this.A03 = r2;
        this.A01 = i;
    }

    public /* bridge */ /* synthetic */ Object call() {
        if (this.A00 != 0) {
            try {
                return C197519wp.A00((Context) this.A02, (C191219mD) this.A03, this.A04, this.A01);
            } catch (Throwable unused) {
                return new C61312pT(-3);
            }
        } else {
            return C197519wp.A00((Context) this.A02, (C191219mD) this.A03, this.A04, this.A01);
        }
    }
}
