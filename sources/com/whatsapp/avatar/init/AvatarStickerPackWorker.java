package com.whatsapp.avatar.init;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass73Q;
import X.C000100c;
import X.C136936ue;
import X.C162168Jj;
import X.C17890vO;
import X.C180129Lg;
import X.C18070vi;
import X.C18600wl;
import X.C188759hw;
import X.C27011Uj;
import X.C27021Uk;
import X.C30391dr;
import X.C30451dy;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

public final class AvatarStickerPackWorker extends CoroutineWorker {
    public final C188759hw A00;
    public final C27021Uk A01;
    public final C136936ue A02;
    public final AnonymousClass73Q A03;
    public final C000100c A04;
    public final C18600wl A05 = C27011Uj.A00();

    /* JADX WARNING: type inference failed for: r0v6, types: [X.9Lg, java.lang.Object] */
    public static final C180129Lg A00(AvatarStickerPackWorker avatarStickerPackWorker, Throwable th) {
        String message;
        String message2;
        int i = avatarStickerPackWorker.A01.A00;
        String str = "no error message";
        StringBuilder A10 = AnonymousClass000.A10();
        if (i > 3) {
            A10.append("AvatarStickerPackWorker/too many attempts (");
            A10.append(i);
            C17890vO.A1B(A10, "), marking as failed");
            C136936ue r2 = avatarStickerPackWorker.A02;
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("too_many_retries (");
            if (!(th == null || (message2 = th.getMessage()) == null)) {
                str = message2;
            }
            A102.append(str);
            r2.A02(1, "AvatarStickerPackWorker/failure", C17890vO.A0c(A102, ')'));
            return new C162168Jj();
        }
        A10.append("AvatarStickerPackWorker/sticker download failed, scheduling retry (");
        A10.append(i);
        Log.w(C17890vO.A0c(A10, ')'));
        C136936ue r22 = avatarStickerPackWorker.A02;
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("download_failed_retry (");
        if (!(th == null || (message = th.getMessage()) == null)) {
            str = message;
        }
        A103.append(str);
        r22.A02(1, "AvatarStickerPackWorker/failure", C17890vO.A0c(A103, ')'));
        return new Object();
    }

    public Object A0A(C30391dr r4) {
        return C30451dy.A00(r4, this.A05, new AvatarStickerPackWorker$doWork$2(this, (C30391dr) null));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        Context applicationContext = context.getApplicationContext();
        C18070vi.A0X(applicationContext);
        C000100c A0H = C17890vO.A0H(applicationContext);
        this.A04 = A0H;
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A02 = (C136936ue) r1.A0V.get();
        this.A03 = (AnonymousClass73Q) r1.AAR.get();
        this.A00 = (C188759hw) r1.A0Z.get();
        this.A01 = (C27021Uk) r1.A0R.get();
    }
}
