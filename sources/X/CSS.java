package X;

import android.content.ContentResolver;
import android.content.Context;

public class CSS {
    public final Context A00;
    public final CNO A01;
    public final C180729Nr A02;
    public final CNQ A03;
    public final C189119iX A04;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C5w, java.lang.Object] */
    public CSS(Context context, C180729Nr r5, C189119iX r6) {
        ContentResolver contentResolver = context.getContentResolver();
        DF2 df2 = new DF2(r6);
        ? obj = new Object();
        obj.A00 = df2;
        CNO cno = new CNO(contentResolver, obj);
        CNQ cnq = new CNQ(r6);
        this.A02 = r5;
        this.A00 = context;
        this.A03 = cnq;
        this.A01 = cno;
        this.A04 = r6;
    }
}
