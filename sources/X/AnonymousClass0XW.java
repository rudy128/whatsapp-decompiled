package X;

/* renamed from: X.0XW  reason: invalid class name */
public abstract class AnonymousClass0XW implements C15830rH {
    public int A00 = -1;
    public int A01;
    public AnonymousClass0XW A02;
    public AnonymousClass0XW A03 = this;
    public AnonymousClass0XW A04;
    public C06130Xb A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public C01850Ad A09;
    public AnonymousClass1OX A0A;
    public boolean A0B;
    public boolean A0C;

    public void A0J() {
    }

    public boolean A0K() {
        return true;
    }

    public void A0L() {
    }

    public void A0M() {
    }

    public final AnonymousClass1OX A0B() {
        AnonymousClass1OX r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass1OY A022 = AnonymousClass1OW.A02(AnonymousClass0QV.A05(this).getCoroutineContext().plus(C62892sA.A01((AnonymousClass1OB) AnonymousClass0QV.A05(this).getCoroutineContext().get(AnonymousClass1OB.A00))));
        this.A0A = A022;
        return A022;
    }

    public void A0C() {
        if (!(!this.A07)) {
            throw AnonymousClass000.A0n("node attached multiple times");
        } else if (this.A09 != null) {
            this.A07 = true;
            this.A0B = true;
        } else {
            throw AnonymousClass000.A0n("attach invoked on a node without a coordinator");
        }
    }

    public void A0D() {
        if (!this.A07) {
            throw AnonymousClass000.A0n("Cannot detach a node that is not attached");
        } else if (!(!this.A0B)) {
            throw AnonymousClass000.A0n("Must run runAttachLifecycle() before markAsDetached()");
        } else if (!this.A0C) {
            this.A07 = false;
            AnonymousClass1OX r1 = this.A0A;
            if (r1 != null) {
                AnonymousClass1OW.A04(new C07260ae(), r1);
                this.A0A = null;
            }
        } else {
            throw AnonymousClass000.A0n("Must run runDetachLifecycle() before markAsDetached()");
        }
    }

    public void A0E() {
        if (this.A07) {
            A0J();
            return;
        }
        throw AnonymousClass000.A0n("reset() called on an unattached node");
    }

    public void A0F() {
        if (!this.A07) {
            throw AnonymousClass000.A0n("Must run markAsAttached() prior to runAttachLifecycle");
        } else if (this.A0B) {
            this.A0B = false;
            A0L();
            this.A0C = true;
        } else {
            throw AnonymousClass000.A0n("Must run runAttachLifecycle() only once after markAsAttached()");
        }
    }

    public void A0G() {
        if (!this.A07) {
            throw AnonymousClass000.A0n("node detached multiple times");
        } else if (this.A09 == null) {
            throw AnonymousClass000.A0n("detach invoked on a node without a coordinator");
        } else if (this.A0C) {
            this.A0C = false;
            A0M();
        } else {
            throw AnonymousClass000.A0n("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
    }

    public final C01850Ad A0A() {
        return this.A09;
    }

    public final void A0I(C18090vk r2) {
        AnonymousClass0QV.A05(this).CE2(r2);
    }

    public void A0H(C01850Ad r1) {
        this.A09 = r1;
    }
}
