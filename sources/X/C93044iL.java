package X;

import android.os.SystemClock;
import com.whatsapp.bot.metaai.imagine.MetaAiImagineTypeaheadDelegate$fetchNewSuggestions$1;

/* renamed from: X.4iL  reason: invalid class name and case insensitive filesystem */
public final class C93044iL implements BE5 {
    public final int A00;
    public final C134516qi A01;
    public final C136896ua A02;
    public final /* synthetic */ C93064iN A03;

    public C93044iL(C93064iN r1, C134516qi r2, C136896ua r3, int i) {
        this.A03 = r1;
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void Br0() {
        this.A02.A00();
    }

    public void Br1() {
        C136896ua r2 = this.A02;
        synchronized (r2) {
            r2.A00 = Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    public void run() {
        C93064iN r2 = this.A03;
        int i = this.A00;
        C134516qi r3 = this.A01;
        C136896ua r4 = this.A02;
        AnonymousClass3MX.A1Q(new MetaAiImagineTypeaheadDelegate$fetchNewSuggestions$1(r2, r3, r4, (C30391dr) null, i), r2.A07);
    }
}
