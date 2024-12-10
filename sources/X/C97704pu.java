package X;

import android.database.Cursor;

/* renamed from: X.4pu  reason: invalid class name and case insensitive filesystem */
public class C97704pu implements AnonymousClass1Bh {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass4RS A01;

    public C97704pu(AnonymousClass4RS r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public void BJ9(C223419n r8) {
        Cursor A0A;
        long j = this.A00;
        C28781at A04 = ((C28521aN) this.A01.A08.get()).A09.get();
        try {
            boolean z = true;
            A0A = ((C28801av) A04).A02.A0A("SELECT starred FROM message WHERE _id = ?", "IS_MESSAGE_STARRED_SQL", new String[]{Long.toString(j)});
            if (A0A.moveToNext()) {
                if (C17890vO.A01(A0A, "starred") != 1) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                A0A.close();
                A04.close();
                if (valueOf != null) {
                    r8.A00(1, "is_starred", valueOf);
                    return;
                }
                return;
            }
            A0A.close();
            A04.close();
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
        throw th;
    }

    public String BU9() {
        return "is_starred";
    }
}
