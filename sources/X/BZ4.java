package X;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class BZ4 extends C26126Cso {
    public static final C22993BYp A01;
    public static final C24599CAv A02;
    public static final C24924CPx A03;
    public static final C25122CYv A04;
    public final Context A00;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.CAv] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.BYp] */
    static {
        ? obj = new Object();
        A02 = obj;
        ? obj2 = new Object();
        A01 = obj2;
        A03 = new C24924CPx(obj2, obj, "GoogleAuthService.API");
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "GoogleAuthServiceClient";
        A04 = new C25122CYv("Auth", A1Y);
    }

    public BZ4(Context context) {
        super(context, C28622EAu.A00, A03, C25540Chd.A02);
        this.A00 = context;
    }

    public static /* bridge */ /* synthetic */ void A00(Status status, TaskCompletionSource taskCompletionSource, Object obj) {
        boolean zzd;
        if (status.A00 <= 0) {
            zzd = taskCompletionSource.zza.zze(obj);
        } else {
            zzd = taskCompletionSource.zza.zzd(C24602CAy.A00(status));
        }
        if (!zzd) {
            A04.A01("The task is already complete.", BE6.A1Z());
        }
    }
}
