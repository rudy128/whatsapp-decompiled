package X;

import android.os.Handler;
import java.util.concurrent.CancellationException;

/* renamed from: X.1IT  reason: invalid class name */
public final class AnonymousClass1IT extends AnonymousClass1IS implements C23781Hp {
    public final Handler A00;
    public final AnonymousClass1IT A01;
    public final boolean A02;
    public final String A03;

    public void CGy(C31761g5 r6, long j) {
        C21357Aim aim = new C21357Aim(this, r6, 7);
        Handler handler = this.A00;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(aim, j)) {
            r6.Bdu(new C71713Ib(aim, this));
        } else {
            A00(aim, r6.getContext(), this);
        }
    }

    public static final void A00(Runnable runnable, C18560wh r3, AnonymousClass1IT r4) {
        StringBuilder sb = new StringBuilder();
        sb.append("The task was rejected, the handler underlying the dispatcher '");
        sb.append(r4);
        sb.append("' was closed");
        C30551e8.A03(new CancellationException(sb.toString()), r3);
        C23871Hy.A01.A0D(runnable, r3);
    }

    public AnonymousClass1OI Bdz(Runnable runnable, C18560wh r6, long j) {
        Handler handler = this.A00;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            return new AnonymousClass3E3(runnable, this);
        }
        A00(runnable, r6, this);
        return AnonymousClass1OK.A00;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass1IT) {
            AnonymousClass1IT r4 = (AnonymousClass1IT) obj;
            if (r4.A00 == this.A00 && r4.A02 == this.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int identityHashCode = System.identityHashCode(this.A00);
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return identityHashCode ^ i;
    }

    public String toString() {
        String str;
        AnonymousClass1IT r0;
        C18600wl r02 = C23871Hy.A00;
        AnonymousClass1IR r03 = AnonymousClass1IN.A00;
        if (this == r03) {
            str = "Dispatchers.Main";
        } else {
            str = null;
            try {
                r0 = ((AnonymousClass1IT) r03).A01;
            } catch (UnsupportedOperationException unused) {
                r0 = null;
            }
            if (this == r0) {
                str = "Dispatchers.Main.immediate";
            }
        }
        if (str != null) {
            return str;
        }
        String str2 = this.A03;
        if (str2 == null) {
            str2 = this.A00.toString();
        }
        if (!this.A02) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(".immediate");
        return sb.toString();
    }

    public AnonymousClass1IT(Handler handler, String str, boolean z) {
        AnonymousClass1IT r1;
        this.A00 = handler;
        this.A03 = str;
        this.A02 = z;
        if (z) {
            r1 = this;
        } else {
            r1 = new AnonymousClass1IT(handler, str, true);
        }
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ AnonymousClass1IS A0F() {
        return this.A01;
    }
}
