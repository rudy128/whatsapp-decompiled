package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.BQn  reason: case insensitive filesystem */
public class C22812BQn extends C6V {
    public final BQm A00;
    public final AtomicBoolean A01 = new AtomicBoolean();

    public void A07() {
        this.A01.set(true);
    }

    public void A08() {
        this.A01.set(false);
    }

    public String A09() {
        if (this instanceof BXI) {
            return "sup:WiFiDirectStateDelegate";
        }
        if (this instanceof BXM) {
            return "sup:StreamingStateDelegate";
        }
        if (this instanceof BXG) {
            return "sup:SocketConnectionStateDelegate";
        }
        if (this instanceof BXH) {
            return "sup:SocketConnectionStateDelegateV2";
        }
        if (this instanceof BXN) {
            return "sup:SNAppManagerStateDelegate";
        }
        if (this instanceof BXO) {
            return "sup:MediaStreamServiceAtcStateDelegate";
        }
        if (this instanceof BXJ) {
            return "sup:InitialStateDelegate";
        }
        if (this instanceof BXE) {
            return "sup:IdleStateDelegate";
        }
        if (this instanceof BXK) {
            return "sup:DiscoveredStateDelegate";
        }
        if (this instanceof BXF) {
            return "sup:ConnectedStateDelegate";
        }
        return "sup:BaseStateDelegate";
    }

    public final void A0A(C18090vk r4) {
        if (!this.A01.get() || !this.A00.A01.getThread().isAlive()) {
            C24712CGy.A01.A01(A09(), "call back executed outside of scope");
        } else {
            r4.invoke();
        }
    }

    public C22812BQn(BQm bQm) {
        this.A00 = bQm;
    }
}
