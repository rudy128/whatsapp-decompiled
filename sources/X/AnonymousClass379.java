package X;

import android.content.SharedPreferences;
import android.util.Pair;
import com.whatsapp.privacy.usernotice.UserNoticeStageUpdateWorker;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.TreeMap;

/* renamed from: X.379  reason: invalid class name */
public final class AnonymousClass379 implements AnonymousClass1O5 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C25113CYi A03;
    public final /* synthetic */ UserNoticeStageUpdateWorker A04;

    public void Bt9(C29621ca r4, String str) {
        Object obj;
        Number number;
        C18070vi.A0d(r4, 1);
        Pair A012 = C60482o6.A01(r4);
        C17900vP.A0X(A012, "UserNoticeStageUpdateWorker/onError ", AnonymousClass000.A10());
        if (!(A012 == null || (number = (Number) A012.first) == null || number.intValue() != 400)) {
            C26106CsQ.A02(this.A04.A01, C17880vN.A0h());
        }
        int i = this.A04.A01.A00;
        C25113CYi cYi = this.A03;
        if (i > 4) {
            obj = new C162168Jj();
        } else {
            obj = new Object();
        }
        cYi.A00(obj);
    }

    public void C7Z(C29621ca r11, String str) {
        C18070vi.A0d(r11, 1);
        Log.i("UserNoticeStageUpdateWorker/success");
        C29621ca A0K = r11.A0K("notice");
        if (A0K != null) {
            UserNoticeStageUpdateWorker userNoticeStageUpdateWorker = this.A04;
            int i = this.A00;
            int i2 = this.A02;
            C33451iq r2 = userNoticeStageUpdateWorker.A02;
            C17900vP.A0j("UserNoticeManager/handleStaleClientStage/notice id: ", AnonymousClass000.A10(), i);
            r2.A03.A02(new C63592tN(i, A0K.A0B(A0K.A0P("stage"), "stage"), i2, 1000 * A0K.A0E(A0K.A0P("t"), "t"), 0));
        }
        if (this.A01 == 5) {
            C33451iq r3 = this.A04.A02;
            int i3 = this.A00;
            C17900vP.A0j("UserNoticeManager/handleCleanup/notice id: ", AnonymousClass000.A10(), i3);
            C17900vP.A0j("UserNoticeManager/deleteUserNotice/notice id: ", AnonymousClass000.A10(), i3);
            r3.A02.A05(i3);
            C33431io r22 = r3.A03;
            TreeMap treeMap = r22.A01;
            treeMap.remove(Integer.valueOf(i3));
            C63592tN A002 = r22.A00();
            if (A002 != null && A002.A01 == i3) {
                ((SharedPreferences) r22.A02.getValue()).edit().remove("current_user_notice_id").remove("current_user_notice_stage").remove("current_user_notice_stage_timestamp").remove("current_user_notice_version").remove("current_user_notice_duration_repeat_index").remove("current_user_notice_duration_repeat_timestamp").remove("current_user_notice_banner_dismiss_timestamp").apply();
            }
            Collection values = treeMap.values();
            C18070vi.A0X(values);
            r22.A03(C29431cG.A0t(values));
            C33451iq.A04(r3);
        }
        this.A03.A00(new C162178Jk());
    }

    public AnonymousClass379(C25113CYi cYi, UserNoticeStageUpdateWorker userNoticeStageUpdateWorker, int i, int i2, int i3) {
        this.A01 = i;
        this.A04 = userNoticeStageUpdateWorker;
        this.A00 = i2;
        this.A03 = cYi;
        this.A02 = i3;
    }

    public void BrD(String str) {
        Object obj;
        Log.e("UserNoticeStageUpdateWorker/onDeliveryFailure");
        int i = this.A04.A01.A00;
        C25113CYi cYi = this.A03;
        if (i > 4) {
            obj = new C162168Jj();
        } else {
            obj = new Object();
        }
        cYi.A00(obj);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
