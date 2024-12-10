package X;

import android.app.NotificationManager;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3A2  reason: invalid class name */
public final class AnonymousClass3A2 implements C72413Lv {
    public final AnonymousClass11C A00;
    public final AnonymousClass1Nb A01;

    public /* synthetic */ void Bi5(String str) {
    }

    public /* synthetic */ void BiC(C186289dx r1) {
    }

    public void BiY(String str) {
        NotificationManager A07;
        Cursor A002;
        C18070vi.A0d(str, 0);
        AnonymousClass1Nb r5 = this.A01;
        ArrayList A13 = AnonymousClass000.A13();
        try {
            C28781at A05 = r5.A0U().get();
            try {
                A002 = C23141Ev.A00(((C28801av) A05).A02, C43481zs.A00, "getSettings/QUERY_CHAT_SETTINGS");
                while (A002.moveToNext()) {
                    A13.add(AnonymousClass1Nb.A00(A002, r5));
                }
                A002.close();
                A05.close();
            } catch (Throwable th) {
                A05.close();
                throw th;
            }
        } catch (Exception e) {
            Log.e("getSettings/QUERY_CHAT_SETTINGS/settings/exception", e);
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            C17900vP.A0Y((C42551yM) it.next(), " /settings/", AnonymousClass000.A11(str));
        }
        if (C43541zy.A00 && (A07 = this.A00.A07()) != null) {
            List<Object> A03 = C39581tJ.A03(A07);
            C18070vi.A0X(A03);
            for (Object A0Y : A03) {
                C17900vP.A0Y(A0Y, "/setting/channel:", AnonymousClass000.A11(str));
            }
            return;
        }
        return;
        throw th;
    }

    public AnonymousClass3A2(AnonymousClass11C r1, AnonymousClass1Nb r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
