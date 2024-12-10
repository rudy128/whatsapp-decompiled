package X;

import android.os.Handler;
import android.os.Message;
import java.util.List;

/* renamed from: X.35g  reason: invalid class name and case insensitive filesystem */
public class C689335g implements C23571Gu {
    public final int A00;
    public final Object A01;

    public C689335g(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean BlE() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            AnonymousClass4NU r1 = (AnonymousClass4NU) obj;
            C17960vV.A02();
            if (r1.A00) {
                return true;
            }
            r1.A00 = true;
            List<C53712cy> list = r1.A02;
            for (C53712cy r0 : list) {
                Handler A0D = C17890vO.A0D();
                Message obtain = Message.obtain(A0D, new C21448AkF(r0.A01, 15));
                AnonymousClass25R.A00(obtain);
                A0D.sendMessageAtFrontOfQueue(obtain);
            }
            list.clear();
            return true;
        }
        AnonymousClass3KJ r12 = (AnonymousClass3KJ) obj;
        C18070vi.A0d(r12, 0);
        ((C78843tk) r12).A04.A2Y();
        return true;
    }

    public /* synthetic */ void BmV() {
    }
}
