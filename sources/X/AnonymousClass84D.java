package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.84D  reason: invalid class name */
public final class AnonymousClass84D extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Integer $inviteSource;
    public final /* synthetic */ String $phoneNumber;
    public final /* synthetic */ ProgressDialog $progressDialog;
    public final /* synthetic */ String $uriPrefix;
    public final /* synthetic */ AnonymousClass733 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass84D(ProgressDialog progressDialog, Context context, AnonymousClass733 r4, Integer num, String str, String str2) {
        super(2);
        this.this$0 = r4;
        this.$context = context;
        this.$phoneNumber = str;
        this.$uriPrefix = str2;
        this.$inviteSource = num;
        this.$progressDialog = progressDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        List A0v;
        String str = (String) obj;
        C135686sb r4 = (C135686sb) obj2;
        C18070vi.A0d(str, 0);
        C108965cb.A19(this.this$0.A01, this.$progressDialog, 22);
        String A1H = AnonymousClass001.A1H("https://whatsapp.com/dl/code=", str, AnonymousClass000.A10());
        if (r4 != null) {
            C132306mZ r0 = (C132306mZ) this.this$0.A06.get();
            r0.A00();
            C18100vl r2 = r0.A01;
            if (C17880vN.A0C(r2).getAll().size() < 1000 && r4.A01 != null) {
                JSONObject A15 = C17880vN.A15();
                A15.put("source_type", r4.A03);
                Integer num = r4.A01;
                if (num != null) {
                    A15.put("expiration_time", num.intValue());
                }
                C29681ch r02 = r4.A00;
                if (r02 != null) {
                    A15.put("channel_jid", r02.getRawString());
                }
                List list = r4.A02;
                if (!(list == null || (A0v = C29431cG.A0v(list, 15)) == null)) {
                    A15.put("message_row_ids", C108995ce.A0X(",", A0v));
                }
                String obj3 = A15.toString();
                if (obj3 != null) {
                    SharedPreferences.Editor A0A = C17890vO.A0A(r2);
                    C18070vi.A0X(A0A);
                    C17880vN.A1E(A0A, str, obj3);
                }
            }
        }
        AnonymousClass733 r3 = this.this$0;
        AnonymousClass733.A02(this.$context, r3, r4, this.$inviteSource, this.$phoneNumber, A1H, this.$uriPrefix);
        return C27621Wu.A00;
    }
}
