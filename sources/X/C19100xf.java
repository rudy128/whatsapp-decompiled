package X;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: X.0xf  reason: invalid class name and case insensitive filesystem */
public final class C19100xf implements C18140vp {
    public final C18140vp A00;
    public final C18140vp A01;
    public final C18140vp A02;
    public final C18140vp A03;
    public final C18140vp A04;
    public final C18140vp A05;
    public final C18140vp A06;
    public final C18140vp A07;
    public final C18140vp A08;

    public /* bridge */ /* synthetic */ Object get() {
        C19360y5 r3 = (C19360y5) this.A08.get();
        C19270xw r6 = (C19270xw) this.A06.get();
        C19130xi r7 = (C19130xi) this.A02.get();
        C19130xi r8 = (C19130xi) this.A07.get();
        return new C19400y9((Context) this.A03.get(), (C19180xn) this.A00.get(), r3, (C19260xv) this.A01.get(), (C19250xu) this.A04.get(), r6, r7, r8, (Executor) this.A05.get());
    }

    public C19100xf(C18140vp r1, C18140vp r2, C18140vp r3, C18140vp r4, C18140vp r5, C18140vp r6, C18140vp r7, C18140vp r8, C18140vp r9) {
        this.A03 = r1;
        this.A00 = r2;
        this.A04 = r3;
        this.A08 = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A02 = r7;
        this.A07 = r8;
        this.A01 = r9;
    }
}
