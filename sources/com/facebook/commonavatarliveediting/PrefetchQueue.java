package com.facebook.commonavatarliveediting;

import X.AnonymousClass000;
import X.AnonymousClass1CQ;
import X.AnonymousClass1D7;
import X.BE6;
import X.C18460wS;
import X.C24551C8w;
import X.C25799CmB;
import X.C35911n2;
import X.C35921n3;
import X.E7V;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class PrefetchQueue {
    public static PrefetchQueue A07;
    public static final C24551C8w A08 = new Object();
    public C25799CmB A00;
    public final E7V A01;
    public final List A02 = AnonymousClass000.A13();
    public final AtomicBoolean A03;
    public final AtomicInteger A04;
    public final C35911n2 A05 = new C35921n3();
    public final C35911n2 A06 = new C35921n3();

    public PrefetchQueue(E7V e7v) {
        this.A01 = e7v;
        AnonymousClass1CQ A0I = AnonymousClass1D7.A0I();
        C18460wS r3 = C18460wS.A00;
        this.A00 = new C25799CmB(r3, r3, r3, r3, A0I);
        this.A03 = BE6.A16(false);
        this.A04 = new AtomicInteger(0);
    }
}
