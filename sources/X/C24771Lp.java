package X;

/* renamed from: X.1Lp  reason: invalid class name and case insensitive filesystem */
public class C24771Lp {
    public static final int A0J = ((int) (C19620yd.A00 / 8192));
    public final C24781Lq A00;
    public final Object A01 = new Object();
    public final Object A02 = new Object();
    public final Object A03 = new Object();
    public final Object A04 = new Object();
    public final Object A05 = new Object();
    public final Object A06 = new Object();
    public final Object A07 = new Object();
    public final Object A08 = new Object();
    public final Object A09 = new Object();
    public volatile C32071ga A0A;
    public volatile C32071ga A0B;
    public volatile C32071ga A0C;
    public volatile C32071ga A0D;
    public volatile C32071ga A0E;
    public volatile C32071ga A0F;
    public volatile C32071ga A0G;
    public volatile C32071ga A0H;
    public volatile C32071ga A0I;

    public C32071ga A00() {
        if (this.A0B == null) {
            synchronized (this.A02) {
                if (this.A0B == null) {
                    this.A0B = this.A00.A00("avatarPoseCache", A0J);
                }
            }
        }
        return this.A0B;
    }

    public C32071ga A01() {
        if (this.A0C == null) {
            synchronized (this.A03) {
                if (this.A0C == null) {
                    this.A0C = this.A00.A00("botsThumbCache", A0J);
                }
            }
        }
        return this.A0C;
    }

    public C32071ga A02() {
        if (this.A0D == null) {
            synchronized (this.A04) {
                if (this.A0D == null) {
                    this.A0D = this.A00.A00("composerThumbCache", A0J);
                }
            }
        }
        return this.A0D;
    }

    public C32071ga A03() {
        if (this.A0E == null) {
            synchronized (this.A05) {
                if (this.A0E == null) {
                    this.A0E = this.A00.A00("contactsCoinFlipAvatarCache", A0J);
                }
            }
        }
        return this.A0E;
    }

    public C32071ga A04() {
        if (this.A0F == null) {
            synchronized (this.A06) {
                if (this.A0F == null) {
                    this.A0F = this.A00.A00("contactsThumbCache", A0J);
                }
            }
        }
        return this.A0F;
    }

    public C32071ga A05() {
        if (this.A0G == null) {
            synchronized (this.A07) {
                if (this.A0G == null) {
                    this.A0G = this.A00.A00("mediaThumbCache", A0J);
                }
            }
        }
        return this.A0G;
    }

    public C32071ga A06() {
        if (this.A0H == null) {
            synchronized (this.A08) {
                if (this.A0H == null) {
                    this.A0H = this.A00.A00("stickerFrameCache", A0J / 2);
                }
            }
        }
        return this.A0H;
    }

    public C32071ga A07() {
        if (this.A0I == null) {
            synchronized (this.A09) {
                if (this.A0I == null) {
                    this.A0I = this.A00.A00("stickerTrayIconCache", A0J / 2);
                }
            }
        }
        return this.A0I;
    }

    public C24771Lp(C24781Lq r2) {
        this.A00 = r2;
    }
}
