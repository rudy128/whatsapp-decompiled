package X;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: X.AtH  reason: case insensitive filesystem */
public final class C21829AtH extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AHV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21829AtH(AHV ahv) {
        super(0);
        this.this$0 = ahv;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.9Mz] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, X.9Mz] */
    public /* bridge */ /* synthetic */ Object invoke() {
        AHV ahv;
        Context context;
        String str;
        C180549Mz r5;
        if (Build.VERSION.SDK_INT >= 23) {
            AHV ahv2 = this.this$0;
            if (ahv2.A03 != null && ahv2.A06) {
                File noBackupFilesDir = ahv2.A01.getNoBackupFilesDir();
                C18070vi.A0X(noBackupFilesDir);
                File A0e = C17880vN.A0e(noBackupFilesDir, this.this$0.A03);
                context = this.this$0.A01;
                str = A0e.getAbsolutePath();
                ? obj = new Object();
                obj.A00 = null;
                ahv = this.this$0;
                r5 = obj;
                AnonymousClass8CH r2 = new AnonymousClass8CH(context, ahv.A02, r5, str, ahv.A05);
                r2.setWriteAheadLoggingEnabled(this.this$0.A00);
                return r2;
            }
        }
        ahv = this.this$0;
        context = ahv.A01;
        str = ahv.A03;
        ? obj2 = new Object();
        obj2.A00 = null;
        r5 = obj2;
        AnonymousClass8CH r22 = new AnonymousClass8CH(context, ahv.A02, r5, str, ahv.A05);
        r22.setWriteAheadLoggingEnabled(this.this$0.A00);
        return r22;
    }
}
