package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.7wf  reason: invalid class name and case insensitive filesystem */
public final class C157277wf extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $crosspostingEntryPoint;
    public final /* synthetic */ C122646Re $destinationApp;
    public final /* synthetic */ List $messages;
    public final /* synthetic */ String $snackBarHostSurface;
    public final /* synthetic */ C41801x5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157277wf(Context context, C122646Re r3, C41801x5 r4, String str, List list, int i) {
        super(0);
        this.this$0 = r4;
        this.$context = context;
        this.$messages = list;
        this.$destinationApp = r3;
        this.$snackBarHostSurface = str;
        this.$crosspostingEntryPoint = i;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C41801x5 r2 = this.this$0;
        C41801x5.A01(this.$context, this.$destinationApp, r2, this.$snackBarHostSurface, this.$messages, this.$crosspostingEntryPoint);
        return C27621Wu.A00;
    }
}
