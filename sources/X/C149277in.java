package X;

import com.whatsapp.consent.ConsentAgeBanViewModel;
import java.util.Timer;

/* renamed from: X.7in  reason: invalid class name and case insensitive filesystem */
public final class C149277in extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ConsentAgeBanViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C149277in(ConsentAgeBanViewModel consentAgeBanViewModel) {
        super(0);
        this.this$0 = consentAgeBanViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        long A03 = C21348Aid.A03(C196999vz.A01(C179589Io.SECONDS, 10));
        ConsentAgeBanViewModel consentAgeBanViewModel = this.this$0;
        Timer timer = new Timer(false);
        timer.scheduleAtFixedRate(new AnonymousClass7T3(consentAgeBanViewModel), 0, A03);
        return timer;
    }
}
