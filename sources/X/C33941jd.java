package X;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.tasks.zzw;
import com.whatsapp.util.Log;

/* renamed from: X.1jd  reason: invalid class name and case insensitive filesystem */
public final class C33941jd implements AnonymousClass1RJ {
    public final C33931jc A00;

    public C33941jd(C33931jc r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public int[] BSG() {
        return new int[]{179, 223};
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.E1k, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.C54, java.lang.Object] */
    public boolean BcT(Message message, int i) {
        C18070vi.A0d(message, 1);
        if (i == 179) {
            String string = message.getData().getString("nonce");
            if (string != null) {
                C33931jc r3 = this.A00;
                r3.A04.CGF(new AnonymousClass7RS(8, string, r3));
                return true;
            }
            throw new IllegalStateException("Required value was null.");
        } else if (i != 223) {
            return false;
        } else {
            int i2 = message.getData().getInt("maxAppsCount");
            C33931jc r4 = this.A00;
            Context context = r4.A01.A00;
            int A002 = C41371wF.A00(context);
            if (A002 == 0) {
                C25260Cbz cbz = new C26126Cso(context, (C28622EAu) null, C24722CHj.A02, new C25540Chd(Looper.getMainLooper(), new Object())).A05;
                C23437Bh2 bh2 = new C23437Bh2(cbz);
                cbz.A05(bh2);
                zzw A003 = C25399Cf0.A00(bh2, new C65372wI(new Object()));
                A003.addOnSuccessListener(new AJK(r4, i2));
                A003.addOnFailureListener(new AJI(r4, 7));
                return true;
            }
            C33921jb r2 = r4.A03;
            StringBuilder sb = new StringBuilder();
            sb.append("Google Play Services Unavailable. Connection result code: ");
            sb.append(A002);
            r2.A00(sb.toString(), 1001);
            Log.i("requestHarmfulApps/Google APIs unavailable");
            return true;
        }
    }
}
