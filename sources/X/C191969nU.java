package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.9nU  reason: invalid class name and case insensitive filesystem */
public final class C191969nU {
    public final C218617r A00;
    public final AnonymousClass1NW A01;
    public final AnonymousClass1NP A02;
    public final AnonymousClass1NT A03;
    public final C175238yN A04;
    public final AMX A05;
    public final C19948A0f A06;
    public final C36821oW A07;
    public final A0L A08;
    public final A7X A09;
    public final AnonymousClass1L7 A0A;
    public final AnonymousClass1NM A0B;
    public final AnonymousClass11P A0C;
    public final C19830z4 A0D;
    public final C18030ve A0E;
    public final AnonymousClass18K A0F;
    public final C171378rc A0G;
    public final AnonymousClass1OZ A0H;
    public final String A0I;
    public final List A0J;
    public final Map A0K = AnonymousClass8BR.A17();
    public final AtomicBoolean A0L = new AtomicBoolean(true);
    public final AtomicLong A0M = new AtomicLong(0);
    public final AtomicLong A0N = new AtomicLong(0);
    public final AtomicLong A0O = new AtomicLong(0);
    public final AtomicLong A0P = new AtomicLong(0);
    public final AtomicLong A0Q = new AtomicLong(0);
    public final AtomicLong A0R = new AtomicLong(0);

    public C191969nU(C218617r r15, AnonymousClass1NW r16, AnonymousClass1NP r17, AnonymousClass1NT r18, C175238yN r19, AMX amx, C19948A0f a0f, C36821oW r22, A0L a0l, A7X a7x, AnonymousClass1L7 r25, AnonymousClass1NM r26, AnonymousClass11P r27, C19830z4 r28, C18030ve r29, AnonymousClass18K r30, C171378rc r31, AnonymousClass1OZ r32, String str, List list) {
        AnonymousClass11P r5 = r27;
        AnonymousClass18K r4 = r30;
        List list2 = list;
        C72473Md.A1M(r5, list2, r4, 2);
        AnonymousClass1OZ r2 = r32;
        AnonymousClass1L7 r7 = r25;
        C18070vi.A0q(r15, r7, r2);
        C36821oW r9 = r22;
        C18070vi.A0d(r9, 9);
        AnonymousClass1NM r6 = r26;
        A0L a0l2 = a0l;
        C19948A0f a0f2 = a0f;
        AMX amx2 = amx;
        C72483Me.A17(amx2, r6, a0f2, a0l2, 12);
        C175238yN r12 = r19;
        C18070vi.A0d(r12, 18);
        AnonymousClass1NP r13 = r17;
        C18070vi.A0d(r13, 19);
        this.A0I = str;
        this.A0C = r5;
        this.A0E = r29;
        this.A0J = list2;
        this.A0F = r4;
        this.A00 = r15;
        this.A0A = r7;
        this.A0H = r2;
        this.A07 = r9;
        this.A09 = a7x;
        this.A03 = r18;
        this.A05 = amx2;
        this.A0B = r6;
        this.A06 = a0f2;
        this.A08 = a0l2;
        this.A01 = r16;
        this.A0D = r28;
        this.A04 = r12;
        this.A02 = r13;
        this.A0G = r31;
    }

    public final void A00() {
        if (this.A0D.A0f() != null) {
            C171378rc r4 = this.A0G;
            AtomicLong atomicLong = this.A0O;
            r4.A04 = Long.valueOf(atomicLong.get());
            Double valueOf = Double.valueOf(((double) atomicLong.get()) / ((double) this.A0Q.get()));
            r4.A00 = valueOf;
            r4.A01 = valueOf;
            r4.A06 = r4.A04;
            r4.A07 = Long.valueOf(this.A0N.get() / 1048576);
            C17900vP.A0Y(r4, "gdrive/encrypted-re-upload/", AnonymousClass000.A10());
            this.A0F.CC7(r4);
        }
        C20735AWq.A00(this.A04, 12);
    }
}
