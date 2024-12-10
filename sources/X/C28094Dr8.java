package X;

import com.facebook.wearable.datax.LocalChannel;
import com.meta.common.monad.railway.Result;
import java.util.Arrays;

/* renamed from: X.Dr8  reason: case insensitive filesystem */
public final class C28094Dr8 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $callback;
    public final /* synthetic */ LocalChannel $channel;
    public final /* synthetic */ int $currentAttempt;
    public final /* synthetic */ C25527ChP $linkMessage;
    public final /* synthetic */ int $maxAttempts;
    public final /* synthetic */ C22821Di $retryBlock;
    public final /* synthetic */ C26256Cw0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28094Dr8(C26256Cw0 cw0, LocalChannel localChannel, C25527ChP chP, C22821Di r5, C22821Di r6, int i, int i2) {
        super(1);
        this.this$0 = cw0;
        this.$callback = r5;
        this.$currentAttempt = i;
        this.$maxAttempts = i2;
        this.$retryBlock = r6;
        this.$channel = localChannel;
        this.$linkMessage = chP;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        C25792Cm4 cm4;
        this.this$0.A04.A05 = C28219Dtb.A00;
        try {
            this.$channel.send(this.$linkMessage);
            obj2 = C27621Wu.A00;
        } catch (Throwable th) {
            obj2 = C108945cZ.A1J(th);
        }
        C26256Cw0 cw0 = this.this$0;
        Throwable A00 = C30671eK.A00(obj2);
        if (A00 == null) {
            C25330Cdb.A00("Successfully sent setLink message", new Object[0]);
            cw0.A04.A05 = null;
            cm4 = C25792Cm4.A08;
        } else {
            C26294Cx6.A0D("LinkManagerImpl", "Error occurred while sending setLink message", A00, Arrays.copyOf(new Object[0], 0));
            LocalChannel localChannel = cw0.A01;
            if (localChannel != null) {
                try {
                    localChannel.close();
                } catch (Throwable unused) {
                }
            }
            cw0.A01 = null;
            cw0.A04.A05 = null;
            if (A00 instanceof C24202BxE) {
                cm4 = ((C24202BxE) A00).error;
            } else {
                cm4 = C25792Cm4.A07;
            }
        }
        if (C18070vi.A18(cm4, C25792Cm4.A08)) {
            this.$callback.invoke(new Result(true, C27621Wu.A00));
            return cm4;
        } else if (C18070vi.A18(cm4, C25792Cm4.A0B) || C18070vi.A18(cm4, C25792Cm4.A0C)) {
            int i = this.$currentAttempt;
            int i2 = this.$maxAttempts;
            if (i < i2) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Retrying linkSwitch: ");
                A10.append(i + 1);
                A10.append('/');
                C25330Cdb.A01(C17880vN.A0t(A10, i2), new Object[0]);
                this.$retryBlock.invoke(Integer.valueOf(this.$currentAttempt + 1));
                return cm4;
            }
            C25330Cdb.A01("Max attempts reached, failing", new Object[0]);
            this.$callback.invoke(new Result(false, new C24202BxE(cm4)));
            return cm4;
        } else {
            C26294Cx6.A0F("LinkManagerImpl", "Received fatal error, failing immediately", Arrays.copyOf(new Object[0], 0));
            this.$callback.invoke(new Result(false, new C24202BxE(cm4)));
            return cm4;
        }
    }
}
