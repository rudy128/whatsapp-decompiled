package X;

import android.os.MessageQueue;
import com.whatsapp.AbstractAppShellDelegate;

/* renamed from: X.012  reason: invalid class name */
public final /* synthetic */ class AnonymousClass012 implements MessageQueue.IdleHandler {
    public final /* synthetic */ AnonymousClass00X A00;
    public final /* synthetic */ AbstractAppShellDelegate A01;

    public final boolean queueIdle() {
        return this.A01.m33lambda$queueAsyncInit$6$comwhatsappAbstractAppShellDelegate(this.A00);
    }

    public /* synthetic */ AnonymousClass012(AnonymousClass00X r1, AbstractAppShellDelegate abstractAppShellDelegate) {
        this.A01 = abstractAppShellDelegate;
        this.A00 = r1;
    }
}
