package X;

import com.whatsapp.util.Log;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.4tb  reason: invalid class name and case insensitive filesystem */
public final class C99874tb extends C18580wj implements CoroutineExceptionHandler {
    public final /* synthetic */ AnonymousClass4CR A00;
    public final /* synthetic */ C41111vp A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99874tb(AnonymousClass4CR r1, C41111vp r2, C99304sb r3) {
        super(r3);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void handleException(C18560wh r4, Throwable th) {
        Log.e("AllowNonAdminGroupCreationManager/updateAllowNonAdminSubgroupCreationValue/", th);
        C88274Za.A01(this.A01, this.A00, AnonymousClass00R.A0N);
    }
}
