package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1Zj  reason: invalid class name */
public class AnonymousClass1Zj extends View {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ AnonymousClass1GV A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1Zj(Context context, ViewGroup viewGroup, AnonymousClass1GV r3) {
        super(context);
        this.A01 = r3;
        this.A00 = viewGroup;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A01.accept(configuration);
    }
}
