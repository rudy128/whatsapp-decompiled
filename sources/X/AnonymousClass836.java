package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.836  reason: invalid class name */
public final class AnonymousClass836 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $onError;
    public final /* synthetic */ C22821Di $onSuccess;
    public final /* synthetic */ int $qplInstanceKey;
    public final /* synthetic */ C138596xL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass836(C138596xL r2, C22821Di r3, C22821Di r4, int i) {
        super(1);
        this.this$0 = r2;
        this.$qplInstanceKey = i;
        this.$onSuccess = r3;
        this.$onError = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1KB r5;
        Runnable ak0;
        int i;
        C1417876y r13 = (C1417876y) obj;
        C18070vi.A0d(r13, 0);
        C108945cZ.A0q(this.this$0.A03).A03(this.$qplInstanceKey, "received_pose_entity");
        C138596xL r52 = this.this$0;
        int i2 = this.$qplInstanceKey;
        C22821Di r4 = this.$onSuccess;
        C22821Di r3 = this.$onError;
        List<AnonymousClass777> list = r13.A00;
        if (list == null) {
            r5 = r52.A00;
            i = 13;
        } else {
            C27031Ul A0o = C108945cZ.A0o(r52.A04);
            JSONArray jSONArray = new JSONArray();
            for (AnonymousClass777 r9 : list) {
                JSONObject A15 = C17880vN.A15();
                A15.put("url", r9.A02);
                String str = r9.A01;
                if (str != null) {
                    A15.put("emojis", str);
                }
                String str2 = r9.A00;
                if (str2 != null) {
                    A15.put("accessibility_label", str2);
                }
                jSONArray.put(A15);
            }
            C17880vN.A1E(C17890vO.A0A(A0o.A01), "pref_avatar_profile_photo_poses", jSONArray.toString());
            List A00 = C138596xL.A00(r52, list, true, false);
            C108945cZ.A0q(r52.A03).A03(i2, "poses_downloaded");
            boolean isEmpty = A00.isEmpty();
            r5 = r52.A00;
            if (isEmpty) {
                i = 14;
            } else {
                ak0 = new C21433Ak0(r4, A00, 37);
                r5.A0J(ak0);
                return C27621Wu.A00;
            }
        }
        ak0 = new C146757Qm((Object) r3, i);
        r5.A0J(ak0);
        return C27621Wu.A00;
    }
}
