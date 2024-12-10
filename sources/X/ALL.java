package X;

import android.os.SystemClock;

public class ALL implements C22414B6w {
    public final /* synthetic */ A4J A00;
    public final /* synthetic */ C22414B6w A01;

    public ALL(A4J a4j, C22414B6w b6w) {
        this.A00 = a4j;
        this.A01 = b6w;
    }

    public void C3U(C182419Uh r4) {
        A4J a4j = this.A00;
        if (a4j.A0A.getAndSet(r4) != r4) {
            try {
                a4j.A09.set(r4.A00);
                a4j.A08.set(SystemClock.elapsedRealtime());
            } finally {
                this.A01.C3U(r4);
            }
        }
    }
}
