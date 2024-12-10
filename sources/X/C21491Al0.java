package X;

import android.content.Context;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* renamed from: X.Al0  reason: case insensitive filesystem */
public class C21491Al0 implements Callable {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C21491Al0(int i, String str, Object obj) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public /* bridge */ /* synthetic */ Object call() {
        String str;
        switch (this.A00) {
            case 0:
                return ((ShortcutInfoCompatSaverImpl) this.A01).A04.get(this.A02);
            case 1:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.A01;
                String str2 = this.A02;
                boolean z = lottieAnimationView.A03;
                Context context = lottieAnimationView.getContext();
                if (z) {
                    str = AnonymousClass001.A1H("asset_", str2, AnonymousClass000.A10());
                } else {
                    str = null;
                }
                return C39771tc.A01(context, str2, str);
            default:
                return C39771tc.A02((Context) null, this.A02, (ZipInputStream) this.A01);
        }
    }
}
