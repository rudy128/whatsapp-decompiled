package X;

import android.os.SystemClock;
import com.whatsapp.fieldstats.events.WamCall;
import java.util.Set;

/* renamed from: X.1Hb  reason: invalid class name and case insensitive filesystem */
public class C23641Hb implements AnonymousClass11J {
    public long A00;
    public WamCall A01;
    public final C19880zA A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass11C A04;
    public final AnonymousClass118 A05;
    public final C19830z4 A06;
    public final AnonymousClass19F A07;
    public final AnonymousClass188 A08;
    public final C18010vc A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final Set A0C;
    public final AnonymousClass11E A0D;
    public final AnonymousClass11P A0E;
    public final AnonymousClass10I A0F;
    public volatile long A0G = -1;

    public void A00(long j) {
        if (j > 0) {
            this.A0F.CGv(new C146487Ph(this, SystemClock.uptimeMillis(), 16), j);
        } else if (-1 >= this.A0G) {
            C19830z4 r2 = this.A06;
            C19830z4.A00(r2).remove("voip_call_id").remove("session_id_for_voip_call_id").apply();
            C19830z4.A00(r2).remove("voip_call_ab_test_bucket").apply();
            C24311Jr.A01(this.A08, (String) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r6.A06 == false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass1LR r6) {
        /*
            r5 = this;
            X.188 r4 = r5.A08
            if (r6 == 0) goto L_0x0009
            boolean r1 = r6.A06
            r0 = 1
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r3 = 0
            X.C18070vi.A0d(r4, r3)
            r0 = 23
            r4.CHx(r1, r0, r3)
            r2 = 1
            r4.CHx(r1, r0, r2)
            java.lang.Integer r1 = X.AnonymousClass1LS.A00(r6)
            r0 = 105(0x69, float:1.47E-43)
            r4.CHx(r1, r0, r3)
            r4.CHx(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23641Hb.A01(X.1LR):void");
    }

    public void Bps(C59732mn r2) {
        A01(r2.A01);
    }

    public C23641Hb(C19880zA r3, AnonymousClass11S r4, AnonymousClass11E r5, AnonymousClass11C r6, AnonymousClass11P r7, AnonymousClass118 r8, C19830z4 r9, AnonymousClass19F r10, AnonymousClass188 r11, C18010vc r12, AnonymousClass10I r13, AnonymousClass00H r14, AnonymousClass00H r15, Set set) {
        this.A0E = r7;
        this.A05 = r8;
        this.A0F = r13;
        this.A03 = r4;
        this.A07 = r10;
        this.A04 = r6;
        this.A08 = r11;
        this.A06 = r9;
        this.A09 = r12;
        this.A0D = r5;
        this.A0C = set;
        this.A0A = r14;
        this.A0B = r15;
        this.A02 = r3;
    }
}
