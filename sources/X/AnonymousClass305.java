package X;

import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.305  reason: invalid class name */
public final class AnonymousClass305 implements C72113Kr {
    public final C19830z4 A00;
    public final AnonymousClass122 A01;
    public final C18030ve A02;

    public void Bqf() {
        Cursor A0A;
        long j;
        C18030ve r2 = this.A02;
        C19830z4 r5 = this.A00;
        if (AnonymousClass2T9.A00(r5, r2)) {
            C18040vf r1 = C18040vf.A02;
            int A002 = C18020vd.A00(r1, r2, 5419);
            int A003 = C18020vd.A00(r1, r2, 5483);
            AnonymousClass122 r4 = this.A01;
            String[] A1Z = C17880vN.A1Z();
            C17880vN.A1V(A1Z, 0, AnonymousClass11P.A01(r4.A0A) - C17890vO.A03(A003));
            C17880vN.A1S(A1Z, A002, 1);
            C28781at A04 = r4.A0V.get();
            try {
                A0A = ((C28801av) A04).A02.A0A("SELECT COUNT(*) as count FROM (SELECT _id FROM available_message_view WHERE message_type = 81 AND from_me = 1  AND timestamp > ? LIMIT ?)", "SELECT_RECENTLY_SENT_PTV_COUNT", A1Z);
                if (A0A.moveToFirst()) {
                    j = C17890vO.A06(A0A, "count");
                } else {
                    j = -1;
                }
                A0A.close();
                A04.close();
                if (j == -1) {
                    Log.e("PushToVideoGating/maybeUpdatePushToVideoSettingDefault unable to get recently sent PTV count");
                    return;
                }
                boolean A1Q = AnonymousClass000.A1Q((j > ((long) A002) ? 1 : (j == ((long) A002) ? 0 : -1)));
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(A002);
                A10.append(',');
                A10.append(A003);
                A10.append(',');
                C17880vN.A1E(C19830z4.A00(r5), "push_to_video_sending_enabled_default_info", C17880vN.A0t(A10, A1Q ? 1 : 0));
                return;
            } catch (Throwable th) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public AnonymousClass305(C19830z4 r1, AnonymousClass122 r2, C18030ve r3) {
        C18070vi.A0o(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
