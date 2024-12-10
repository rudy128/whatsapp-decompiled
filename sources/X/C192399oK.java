package X;

/* renamed from: X.9oK  reason: invalid class name and case insensitive filesystem */
public final class C192399oK {
    public boolean A00;
    public final C192709oq A01;
    public final /* synthetic */ AiK A02;

    public C192399oK(C192709oq r1, AiK aiK) {
        this.A02 = aiK;
        this.A01 = r1;
    }

    public AnonymousClass9HU A00() {
        AnonymousClass9HU r0;
        synchronized (this.A02) {
            C192709oq r1 = this.A01;
            if (r1.A01 == this) {
                r0 = new AnonymousClass9HU(this, C108945cZ.A19(r1.A01()));
            } else {
                throw new IllegalStateException();
            }
        }
        return r0;
    }

    public void A01() {
        boolean z = this.A00;
        AiK aiK = this.A02;
        if (z) {
            AiK.A03(this, aiK, false);
            aiK.A0C(this.A01.A03);
            return;
        }
        AiK.A03(this, aiK, true);
    }
}
