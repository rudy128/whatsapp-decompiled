package X;

import com.whatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.7Ns  reason: invalid class name and case insensitive filesystem */
public class C146077Ns implements AnonymousClass88P {
    public final int A00;
    public final Object A01;

    public C146077Ns(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BpQ(AnonymousClass70X r10) {
        String str;
        int i;
        switch (this.A00) {
            case 0:
                C129046hA r2 = (C129046hA) this.A01;
                C18070vi.A0d(r2, 0);
                C132976nx r3 = r2.A02;
                AnonymousClass70X r1 = r2.A03;
                int A05 = r1.A05();
                int A06 = r1.A06();
                if (r1.A0d()) {
                    str = "on";
                } else {
                    str = "off";
                }
                r3.A00(Integer.valueOf(r1.A05() - r2.A00), str, 5, A05, A06);
                return;
            case 1:
                ((VideoComposerFragment) this.A01).A2Z(r10);
                return;
            default:
                AnonymousClass6GZ r32 = (AnonymousClass6GZ) this.A01;
                if (r10.A05() != 0) {
                    r32.A04++;
                }
                r32.A01++;
                if (r32.A03 == 0) {
                    AnonymousClass70X r0 = r32.A04;
                    if (r0 != null) {
                        i = r0.A06();
                    } else {
                        i = 0;
                    }
                    r32.A03 = i;
                    if (i > 1) {
                        r32.A02 = AnonymousClass6GZ.A00(r32, (long) i);
                    } else {
                        r32.A03 = 0;
                    }
                }
                int i2 = r32.A04;
                int i3 = r32.A02;
                if (i2 >= i3 || r32.A01 >= i3 * 4) {
                    r32.A05.A00();
                    return;
                }
                r32.A00 = 0.0f;
                r10.A0M(0);
                r10.A0E();
                return;
        }
    }
}
