package X;

public abstract class C6W {
    public void A00() {
        BUE bue = (BUE) this;
        bue.A01 = true;
        C26027Cql cql = bue.A02.A02.A00;
        C24307Bz4 bz4 = C24307Bz4.EFFECT_FIRST_FRAME_RENDERED;
        cql.A01 = bz4;
        C26027Cql.A00(bz4, cql);
    }

    public void A01() {
        C26027Cql cql = ((BUE) this).A02.A02.A00;
        C24307Bz4 bz4 = C24307Bz4.EFFECT_RENDER_SET;
        cql.A02 = bz4;
        cql.A01 = bz4;
        C26027Cql.A00(bz4, cql);
        C61212pJ r2 = cql.A08;
        C61212pJ.A00(r2, 2, 231941967);
        C61212pJ.A00(r2, 1, 231943291);
    }

    public void A02(Throwable th) {
        C26027Cql cql = ((BUE) this).A02.A02.A00;
        C61212pJ r2 = cql.A08;
        C61212pJ.A00(r2, 3, 231947811);
        C61212pJ.A00(r2, 3, 231944056);
        C61212pJ.A00(r2, 3, 231943291);
        C24307Bz4 bz4 = C24307Bz4.EFFECT_RENDER_FAILED;
        cql.A01 = bz4;
        C26027Cql.A00(bz4, cql);
    }
}
