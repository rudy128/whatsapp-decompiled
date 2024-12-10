package X;

import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.832  reason: invalid class name */
public final class AnonymousClass832 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass1FL $activity;
    public final /* synthetic */ C18090vk $callback;
    public final /* synthetic */ int $noticeId;
    public final /* synthetic */ C138276wo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass832(AnonymousClass1FL r2, C138276wo r3, C18090vk r4, int i) {
        super(1);
        this.$callback = r4;
        this.this$0 = r3;
        this.$activity = r2;
        this.$noticeId = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C122586Qy r0;
        WeakReference A0z;
        AnonymousClass1FU r1;
        int A04 = C108955ca.A04((C122586Qy) obj, 0);
        if (A04 == 0) {
            this.$callback.invoke();
        } else if (A04 != 1) {
            if (A04 == 2) {
                C138276wo r5 = this.this$0;
                AnonymousClass1FL r4 = this.$activity;
                int i = this.$noticeId;
                C18090vk r2 = this.$callback;
                try {
                    if (r5.A01.A08(i)) {
                        r0 = C122586Qy.TRUE;
                    } else {
                        r0 = C122586Qy.FALSE;
                    }
                } catch (IllegalArgumentException unused) {
                    Log.i("GenAiPrivacyLauncher/isAccepted, Error getting disclosure state");
                    r0 = C122586Qy.ERROR;
                }
                int ordinal = r0.ordinal();
                if (ordinal == 0) {
                    r2.invoke();
                } else if (ordinal == 1) {
                    C138276wo.A00(r4, r5, r2, i);
                } else if (ordinal != 2) {
                    A0z = AnonymousClass3MW.A0z(r4);
                } else {
                    Log.i("GenAiPrivacyLauncher/handleDownload invalid state");
                }
            } else if (A04 == 3) {
                A0z = AnonymousClass3MW.A0z(this.$activity);
            }
            Object obj2 = A0z.get();
            if ((obj2 instanceof AnonymousClass1FU) && (r1 = (AnonymousClass1FU) obj2) != null) {
                r1.BhQ(2131890745);
            }
        } else {
            C138276wo r3 = this.this$0;
            C138276wo.A00(this.$activity, r3, this.$callback, this.$noticeId);
        }
        return C27621Wu.A00;
    }
}
