package X;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.2ws  reason: invalid class name and case insensitive filesystem */
public class C65642ws implements AnonymousClass3LZ {
    public final TaskCompletionSource A00;

    public boolean BtW(Exception exc) {
        return false;
    }

    public boolean C6V(C24686CFk cFk) {
        C23572Bm0 bm0 = (C23572Bm0) cFk;
        Integer num = bm0.A02;
        if (num != AnonymousClass00R.A0C && num != AnonymousClass00R.A0N && num != AnonymousClass00R.A0Y) {
            return false;
        }
        this.A00.trySetResult(bm0.A04);
        return true;
    }

    public C65642ws(TaskCompletionSource taskCompletionSource) {
        this.A00 = taskCompletionSource;
    }
}
