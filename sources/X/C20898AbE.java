package X;

import com.whatsapp.util.Log;

/* renamed from: X.AbE  reason: case insensitive filesystem */
public class C20898AbE implements AnonymousClass89J {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20898AbE(C133856pc r1, AnonymousClass89J r2, int i) {
        this.A00 = i;
        this.A02 = r1;
        this.A01 = r2;
    }

    public void onFailure(Exception exc) {
        AnonymousClass1KB r3;
        Object obj;
        int i;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(exc, 0);
                Log.e("AvatarBackup/restore failed", exc);
                ((C136936ue) ((C170158op) this.A02).A02.get()).A02(0, "generate_token_after_backup_failed", exc.getMessage());
                ((C26981Ug) this.A01).BrC(exc);
                return;
            case 1:
                C18070vi.A0d(exc, 0);
                r3 = ((C133856pc) this.A02).A00;
                obj = this.A01;
                i = 41;
                break;
            default:
                C18070vi.A0d(exc, 0);
                r3 = ((C133856pc) this.A02).A00;
                obj = this.A01;
                i = 42;
                break;
        }
        r3.A0J(new C21433Ak0(obj, exc, i));
    }

    public void onSuccess() {
        AnonymousClass1KB r3;
        Runnable r2;
        switch (this.A00) {
            case 0:
                ((C26981Ug) this.A01).BrF(AnonymousClass000.A0i());
                return;
            case 1:
                r3 = ((C133856pc) this.A02).A00;
                r2 = new C146757Qm(this.A01, 15);
                break;
            default:
                C133856pc r4 = (C133856pc) this.A02;
                r3 = r4.A00;
                r2 = new C146887Qz(r4, (AnonymousClass89J) this.A01, 11);
                break;
        }
        r3.A0J(r2);
    }

    public C20898AbE(C170158op r2, C26981Ug r3) {
        this.A00 = 0;
        this.A01 = r3;
        this.A02 = r2;
    }
}
