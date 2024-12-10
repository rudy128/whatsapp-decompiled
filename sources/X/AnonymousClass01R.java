package X;

import android.app.Application;
import android.os.Bundle;

/* renamed from: X.01R  reason: invalid class name */
public final class AnonymousClass01R extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass01C this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass01R(AnonymousClass01C r2) {
        super(0);
        this.this$0 = r2;
    }

    /* renamed from: A00 */
    public final C37341pM invoke() {
        Bundle bundle;
        Application application = this.this$0.getApplication();
        AnonymousClass01C r2 = this.this$0;
        if (r2.getIntent() != null) {
            bundle = this.this$0.getIntent().getExtras();
        } else {
            bundle = null;
        }
        return new C37341pM(application, bundle, r2);
    }
}
