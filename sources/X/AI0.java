package X;

import android.os.SystemClock;

public class AI0 implements C22402B6f {
    public final /* synthetic */ A4J A00;
    public final /* synthetic */ C22402B6f A01;
    public final /* synthetic */ C20132A8s A02;

    public AI0(A4J a4j, C22402B6f b6f, C20132A8s a8s) {
        this.A00 = a4j;
        this.A01 = b6f;
        this.A02 = a8s;
    }

    public void C39(int i) {
        C20132A8s a8s;
        String str;
        C20132A8s a8s2;
        String str2;
        String str3 = "Bloks Request Error.";
        try {
            this.A01.C39(i);
            A4J a4j = this.A00;
            Object obj = a4j.A09.get();
            if (obj != null) {
                C198009xd r3 = (C198009xd) obj;
                int i2 = r3.A00;
                switch (i) {
                    case 1:
                        a8s2 = this.A02;
                        str2 = A4J.A00("initial_render_start", i2);
                        break;
                    case 2:
                        a8s2 = this.A02;
                        str2 = A4J.A00("initial_render_end", i2);
                        break;
                    case 3:
                        C20132A8s a8s3 = this.A02;
                        a8s3.A0F(A4J.A00("initial_render_data_end", i2));
                        if (a4j.A00 == null) {
                            a8s3.A0B(0, "bloks_query", true, SystemClock.elapsedRealtime());
                        }
                        C20368AHy aHy = a4j.A04;
                        if (aHy.A04 == null || aHy.A0A) {
                            a8s3.A0H("initial_content_step");
                            return;
                        }
                        return;
                    case 5:
                        C182419Uh r1 = (C182419Uh) a4j.A0A.get();
                        if (r1 instanceof C166508d0) {
                            str3 = ((C166508d0) r1).A00.getMessage();
                        }
                        this.A02.A0D(str3);
                        return;
                    case 6:
                        a8s2 = this.A02;
                        str2 = A4J.A00("render_start", i2);
                        break;
                    case 7:
                        a8s2 = this.A02;
                        str2 = A4J.A00("render_end", i2);
                        break;
                    case 9:
                        C20132A8s a8s4 = this.A02;
                        a8s4.A0F(A4J.A00("render_data_end", i2));
                        A4J.A01(r3, a8s4);
                        return;
                    default:
                        return;
                }
                a8s2.A0F(str2);
                return;
            }
            throw AnonymousClass000.A0k("Fetch summary is missing.");
        } catch (Throwable th) {
            A4J a4j2 = this.A00;
            Object obj2 = a4j2.A09.get();
            if (obj2 != null) {
                C198009xd r32 = (C198009xd) obj2;
                int i3 = r32.A00;
                switch (i) {
                    case 1:
                        a8s = this.A02;
                        str = A4J.A00("initial_render_start", i3);
                        break;
                    case 2:
                        a8s = this.A02;
                        str = A4J.A00("initial_render_end", i3);
                        break;
                    case 3:
                        C20132A8s a8s5 = this.A02;
                        a8s5.A0F(A4J.A00("initial_render_data_end", i3));
                        if (a4j2.A00 == null) {
                            a8s5.A0B(0, "bloks_query", true, SystemClock.elapsedRealtime());
                        }
                        C20368AHy aHy2 = a4j2.A04;
                        if (aHy2.A04 == null || aHy2.A0A) {
                            a8s5.A0H("initial_content_step");
                            throw th;
                        }
                        throw th;
                    case 5:
                        C182419Uh r12 = (C182419Uh) a4j2.A0A.get();
                        if (r12 instanceof C166508d0) {
                            str3 = ((C166508d0) r12).A00.getMessage();
                        }
                        this.A02.A0D(str3);
                        throw th;
                    case 6:
                        a8s = this.A02;
                        str = A4J.A00("render_start", i3);
                        break;
                    case 7:
                        a8s = this.A02;
                        str = A4J.A00("render_end", i3);
                        break;
                    case 9:
                        C20132A8s a8s6 = this.A02;
                        a8s6.A0F(A4J.A00("render_data_end", i3));
                        A4J.A01(r32, a8s6);
                        throw th;
                    default:
                        throw th;
                }
                a8s.A0F(str);
                throw th;
            }
            throw AnonymousClass000.A0k("Fetch summary is missing.");
        }
    }
}
