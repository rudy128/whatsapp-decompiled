package X;

import android.app.Activity;
import android.os.SystemClock;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4qU  reason: invalid class name and case insensitive filesystem */
public class C98044qU implements C108165bE {
    public final int A00;
    public final Object A01;

    public C98044qU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Byx() {
        Activity activity;
        int i;
        if (this.A00 != 0) {
            activity = ((C75403hR) this.A01).A02;
            i = 20;
        } else {
            activity = (Activity) this.A01;
            i = 2;
        }
        AnonymousClass4Yv.A00(activity, i);
    }

    public void C11(boolean z) {
        boolean z2 = z;
        if (this.A00 != 0) {
            C75403hR r2 = (C75403hR) this.A01;
            AnonymousClass4Yv.A00(r2.A02, 20);
            r2.A03.CNB(0, 2131895077);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C95704mf r1 = (C95704mf) r2.A0A;
            if (r1.A00 != 0) {
                AnonymousClass3VQ r0 = ((AnonymousClass4aY) r1.A01).A2b;
                AnonymousClass3VQ.A07(r0);
                AnonymousClass3VQ.A06(r0);
            }
            C49082Pc r12 = r2.A00;
            if (r12 != null) {
                r12.A01 = null;
                r12.A00 = null;
                r12.A0B(true);
            }
            C49082Pc r3 = new C49082Pc(r2.A05, r2.A0C, r2.A0F, r2.A01, elapsedRealtime, false, z2);
            r2.A00 = r3;
            r2.A0D.CGD(r3, new Object[0]);
            return;
        }
        Log.i("list_chat_info/onclick_leaveGroup");
        ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A01;
        C17890vO.A0u(new AnonymousClass49Y(listChatInfoActivity, listChatInfoActivity.A04, listChatInfoActivity.A4l(), z), listChatInfoActivity.A05);
    }
}
