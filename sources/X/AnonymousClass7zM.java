package X;

import android.content.SharedPreferences;
import java.util.Date;

/* renamed from: X.7zM  reason: invalid class name */
public final class AnonymousClass7zM extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C129686iC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7zM(C129686iC r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SharedPreferences.Editor putLong;
        if (AnonymousClass000.A1Y(obj)) {
            C196109uT r0 = this.this$0.A03;
            r0.A01();
            int A00 = r0.A00();
            C129686iC r02 = this.this$0;
            if (A00 == 0) {
                C18100vl r2 = r02.A03.A01;
                C17880vN.A1B(C17890vO.A0A(r2), "flows_target_cleanup_date");
                putLong = C17890vO.A0A(r2).remove("flows_need_cleanup_after_target_date");
            } else {
                Date date = new Date(System.currentTimeMillis() + ((long) (r02.A00 * 1000)));
                C196109uT r4 = this.this$0.A03;
                C17880vN.A1C(C17890vO.A0A(r4.A01), "flows_need_cleanup_after_target_date", 0);
                putLong = C17890vO.A0A(r4.A01).putLong("flows_target_cleanup_date", date.getTime());
            }
            putLong.apply();
        }
        return C27621Wu.A00;
    }
}
