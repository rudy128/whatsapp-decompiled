package X;

import android.os.Bundle;
import com.whatsapp.bizintegrity.callpermission.BizCallbackActivity;
import com.whatsapp.bizintegrity.callpermission.CallPermissionRequestBottomSheet;
import com.whatsapp.jid.Jid;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.Ati  reason: case insensitive filesystem */
public final class C21856Ati extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BizCallbackActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21856Ati(BizCallbackActivity bizCallbackActivity) {
        super(0);
        this.this$0 = bizCallbackActivity;
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [X.9Wq, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object invoke() {
        Jid jid = (Jid) this.this$0.A04.getValue();
        String A0y = AnonymousClass3MW.A0y(this.this$0.A05);
        BizCallbackActivity bizCallbackActivity = this.this$0;
        C183989aE r1 = bizCallbackActivity.A00;
        if (r1 != null) {
            String A0y2 = AnonymousClass3MW.A0y(bizCallbackActivity.A02);
            Bundle A0J = C72463Mc.A0J(jid);
            A2Y[] a2yArr = new A2Y[2];
            AnonymousClass9IT r7 = AnonymousClass9IT.YES;
            Long valueOf = Long.valueOf(r1.A00);
            a2yArr[0] = new A2Y(r7, valueOf);
            List A0O = C18070vi.A0O(new A2Y(AnonymousClass9IT.NO, valueOf), a2yArr, 1);
            ? obj = new Object();
            obj.A00 = A0O;
            JSONArray A1A = AnonymousClass8BR.A1A();
            for (A2Y A00 : obj.A00) {
                A1A.put(A00.A00());
            }
            A0J.putString("reply_options_params", C18070vi.A0H(C17880vN.A15().put("actions", A1A)));
            AnonymousClass3MY.A15(A0J, jid, "chatjid_raw_params");
            A0J.putBoolean("is_outgoing_call_missed_params", true);
            A0J.putString("user_selected_reply_option_params", A0y);
            A0J.putString("call_id", A0y2);
            CallPermissionRequestBottomSheet callPermissionRequestBottomSheet = new CallPermissionRequestBottomSheet();
            callPermissionRequestBottomSheet.A1R(A0J);
            return callPermissionRequestBottomSheet;
        }
        C18070vi.A11("callPermissionConfig");
        throw null;
    }
}
