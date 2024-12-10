package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;

public class C6M {
    public A5W A00;
    public MediaEffect A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C6M c6m = (C6M) obj;
            if (!this.A00.equals(c6m.A00) || !this.A01.equals(c6m.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A00;
        return AnonymousClass000.A0P(this.A01, A1b, 1);
    }
}
