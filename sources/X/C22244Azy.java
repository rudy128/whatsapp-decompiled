package X;

import com.whatsapp.CircularProgressBar;

/* renamed from: X.Azy  reason: case insensitive filesystem */
public final class C22244Azy extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CircularProgressBar $progressBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22244Azy(CircularProgressBar circularProgressBar) {
        super(1);
        this.$progressBar = circularProgressBar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1a = AnonymousClass3MX.A1a((Boolean) obj);
        CircularProgressBar circularProgressBar = this.$progressBar;
        if (A1a) {
            circularProgressBar.setVisibility(0);
            this.$progressBar.setProgress(0);
            this.$progressBar.setIndeterminate(true);
        } else {
            circularProgressBar.setVisibility(8);
        }
        return C27621Wu.A00;
    }
}
