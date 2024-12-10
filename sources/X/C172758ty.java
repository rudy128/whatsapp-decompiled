package X;

import com.whatsapp.infra.graphql.BaseMexCallback;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.8ty  reason: invalid class name and case insensitive filesystem */
public final class C172758ty extends BaseMexCallback implements Future {
    public C1193567u A00;
    public C30671eK A01;
    public boolean A02;
    public final C191799nC A03;
    public final CountDownLatch A04 = new CountDownLatch(1);

    public C172758ty(C22821Di r3) {
        this.A03 = (C191799nC) r3.invoke(this);
    }

    public void A02(C20125A8k a8k) {
        C18070vi.A0d(a8k, 0);
        C1193567u r0 = this.A00;
        if (r0 != null) {
            r0.A02(a8k);
        }
    }

    public boolean A05(A6Z a6z) {
        C18070vi.A0d(a6z, 0);
        C1193567u r0 = this.A00;
        if (r0 != null) {
            return r0.A05(a6z);
        }
        return false;
    }

    public Object A06(long j, TimeUnit timeUnit) {
        C18070vi.A0d(timeUnit, 1);
        if (!isDone()) {
            this.A03.A00();
            if (!this.A04.await(j, timeUnit)) {
                A04(new TimeoutException());
            }
        }
        C30671eK r0 = this.A01;
        if (r0 != null) {
            return r0.value;
        }
        return C30691eM.A00(new C172838u6("Expected a result but it was null", (Throwable) null));
    }

    private final void A00(Object obj) {
        if (this.A01 == null) {
            this.A01 = new C30671eK(obj);
            this.A04.countDown();
        }
    }

    public boolean isDone() {
        return AnonymousClass000.A1P((this.A04.getCount() > 0 ? 1 : (this.A04.getCount() == 0 ? 0 : -1)));
    }

    public void A03(C172768tz r1) {
        A00(r1);
        super.A03(r1);
    }

    public void A04(Throwable th) {
        A00(C30691eM.A00(th));
        super.A04(th);
    }

    public boolean cancel(boolean z) {
        if (isDone()) {
            return false;
        }
        this.A02 = z;
        A00(C30691eM.A00(C172888uB.A00));
        return true;
    }

    public /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        return new C30671eK(A06(j, timeUnit));
    }

    public boolean isCancelled() {
        return this.A02;
    }

    public /* bridge */ /* synthetic */ Object get() {
        return new C30671eK(A06(32000, TimeUnit.MILLISECONDS));
    }
}
