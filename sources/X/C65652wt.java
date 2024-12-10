package X;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.2wt  reason: invalid class name and case insensitive filesystem */
public class C65652wt implements AnonymousClass3LZ {
    public final TaskCompletionSource A00;
    public final C18820xD A01;

    public boolean C6V(C24686CFk cFk) {
        C23572Bm0 bm0 = (C23572Bm0) cFk;
        if (bm0.A02 != AnonymousClass00R.A0N || this.A01.A00(cFk)) {
            return false;
        }
        TaskCompletionSource taskCompletionSource = this.A00;
        String str = bm0.A03;
        if (str != null) {
            long j = bm0.A00;
            Long valueOf = Long.valueOf(j);
            long j2 = bm0.A01;
            Long valueOf2 = Long.valueOf(j2);
            String str2 = "";
            if (valueOf == null) {
                str2 = AnonymousClass000.A0y(" tokenExpirationTimestamp", AnonymousClass000.A11(str2));
            }
            if (valueOf2 == null) {
                str2 = AnonymousClass000.A0y(" tokenCreationTimestamp", AnonymousClass000.A11(str2));
            }
            if (str2.isEmpty()) {
                taskCompletionSource.setResult(new AnonymousClass2AR(j, str, j2));
                return true;
            }
            throw AnonymousClass000.A0n(AnonymousClass001.A1H("Missing required properties:", str2, AnonymousClass000.A10()));
        }
        throw AnonymousClass000.A0s("Null token");
    }

    public boolean BtW(Exception exc) {
        this.A00.trySetException(exc);
        return true;
    }

    public C65652wt(TaskCompletionSource taskCompletionSource, C18820xD r2) {
        this.A01 = r2;
        this.A00 = taskCompletionSource;
    }
}
