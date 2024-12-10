package X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: X.9zw  reason: invalid class name and case insensitive filesystem */
public final class C199399zw {
    public C179629Is A00;
    public String A01;
    public String A02;
    public Throwable A03;
    public Map A04;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.9zw] */
    public static C199399zw A00() {
        ? obj = new Object();
        obj.A00 = C179629Is.DOWNLOAD_ERROR;
        return obj;
    }

    public AnonymousClass9LV A01() {
        String str;
        if (this.A00 != null) {
            if (TextUtils.isEmpty(this.A01)) {
                str = this.A00.mMessage;
            } else {
                str = this.A01;
            }
            Throwable th = this.A03;
            if (th != null) {
                String[] A1Z = C17880vN.A1Z();
                A1Z[0] = str;
                A1Z[1] = th.getMessage();
                str = TextUtils.join(";", A1Z);
            }
            return new AnonymousClass9LV(this.A00, str, this.A02, this.A03, this.A04);
        }
        throw AnonymousClass000.A0k("Must set load exception type");
    }
}
