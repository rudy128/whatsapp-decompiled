package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.8tf  reason: invalid class name and case insensitive filesystem */
public abstract class C172588tf extends C172228t5 implements BAF {
    public final int A00;
    public final C185579co A01;
    public final A0W A02;
    public final C199279zj A03;
    public final C138476x9 A04;
    public final AnonymousClass10I A05;
    public final C186499eI A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C172588tf(C185579co r2, A0W a0w, C186499eI r4, C199279zj r5, C138476x9 r6, AnonymousClass10I r7, int i) {
        super(a0w);
        C72473Md.A1M(a0w, r2, r6, 1);
        this.A02 = a0w;
        this.A05 = r7;
        this.A06 = r4;
        this.A01 = r2;
        this.A04 = r6;
        this.A00 = i;
        this.A03 = r5;
    }

    public static void A02(C172588tf r6, UserJid userJid) {
        C172588tf r4 = r6;
        C185579co r2 = r6.A01;
        if (r2.A00.A0J()) {
            r2.A01.CGF(new AnonymousClass7RT(r2, userJid, r4, 6, false));
        } else {
            r6.A05();
        }
    }

    public final boolean A07(UserJid userJid, int i, boolean z) {
        C192019nc r2;
        C195539tV r1;
        int i2;
        BAQ baq;
        C195469tO r12;
        int i3;
        C138476x9 r6 = this.A04;
        int i4 = this.A00;
        UserJid userJid2 = userJid;
        C138476x9.A00(userJid, r6, i4, 2, (long) i);
        boolean z2 = true;
        C199279zj.A00(userJid, A04(), this.A03, i4, 1);
        C186499eI r13 = this.A06;
        if (!z || i != 2498054) {
            z2 = false;
        }
        if (!z2) {
            int i5 = r13.A00 + 1;
            r13.A00 = i5;
            if (i5 != 1 || !r13.A03.A01(i)) {
                return false;
            }
            if (this instanceof C168508j0) {
                C168508j0 r4 = (C168508j0) this;
                if (C18020vd.A05(C18040vf.A02, r4.A06, 2503)) {
                    Log.e("GetSingleCollectionGraphQLService/sendFallbackRequest - GraphQL request failed, calling onFailure instead of falling back on SMAX");
                    r4.A03.Btx(0);
                    return true;
                }
                r4.A04.A03();
                return true;
            } else if (this instanceof C168548j4) {
                C168548j4 r42 = (C168548j4) this;
                if (C18020vd.A05(C18040vf.A02, r42.A08, 2503)) {
                    Log.e("GetProductListGraphQLService/sendFallbackRequest - GraphQL request failed, calling onFailure instead of falling back on SMAX");
                    AN6.A00(r42.A05, 4);
                    return true;
                }
                C167868hu r14 = r42.A06;
                C20997Acp.A01(r14.A01, r14);
                return true;
            } else if (this instanceof C168538j3) {
                C168538j3 r43 = (C168538j3) this;
                if (C18020vd.A05(C18040vf.A02, r43.A08, 2503)) {
                    Log.e("GetProductGraphQLService/sendFallbackRequest - GraphQL request failed, calling onFailure instead of falling back on SMAX");
                    baq = r43.A04;
                    r12 = r43.A07;
                    i3 = 0;
                } else {
                    C167848hs r15 = r43.A05;
                    if (!r15.A01.A09()) {
                        baq = r15.A00;
                        r12 = r15.A02;
                        i3 = -1;
                    } else {
                        C20997Acp.A01(r15.A01, r15);
                        return true;
                    }
                }
                baq.Bu8(r12, i3);
                return true;
            } else if (this instanceof C168528j2) {
                C168528j2 r44 = (C168528j2) this;
                C188519hY r3 = r44.A08;
                if (r3.A00 == null) {
                    if (!C18020vd.A05(C18040vf.A02, r44.A09, 2503)) {
                        r44.A06.A07();
                        return true;
                    }
                }
                Log.e("GetProductCatalogGraphQLService/sendFallbackRequest - GraphQL request failed, calling onFailure instead of falling back on SMAX");
                r44.A05.Btn(r3, 0);
                return true;
            } else if (this instanceof C168518j1) {
                C168518j1 r45 = (C168518j1) this;
                if (C18020vd.A05(C18040vf.A02, r45.A07, 2503)) {
                    Log.e("GetCollectionsGraphQLService/sendFallbackRequest - GraphQL request failed, calling onFailure instead of falling back on SMAX");
                    r2 = r45.A02;
                    r1 = r45.A04;
                    i2 = 0;
                } else {
                    C167878hv r16 = r45.A05;
                    if (!r16.A02.A09()) {
                        r2 = r16.A00;
                        r1 = r16.A01;
                        i2 = -1;
                    } else {
                        C20997Acp.A01(r16.A01, r16);
                        return true;
                    }
                }
                r2.A01(r1, i2);
                return true;
            } else if (this instanceof C168488iy) {
                C168488iy r46 = (C168488iy) this;
                r46.A03.Btm(r46.A01, 0);
                return true;
            } else {
                C168498iz.A00((C168498iz) this, 0);
                return true;
            }
        } else if (r13.A01) {
            Brd(userJid);
            return true;
        } else {
            r13.A01 = true;
            C185579co r22 = r13.A02;
            r22.A01.CGF(new AnonymousClass7RT(r22, userJid2, this, 6, true));
            return true;
        }
    }

    public static void A01(C172588tf r2, int i) {
        r2.A05.CGF(new C21424Ajr(r2, i));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.9Ma] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.9Ma] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.9Ma] */
    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, X.9Ma] */
    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, X.9Ma] */
    public C180309Ma A04() {
        if (this instanceof C168508j0) {
            if (((C168508j0) this).A02.A08) {
                return new Object();
            }
            return new Object();
        } else if (!(this instanceof C168528j2)) {
            return new Object();
        } else {
            if (((C168528j2) this).A08.A00 != null) {
                return new Object();
            }
            return new Object();
        }
    }

    public void A05() {
        C222119a A002;
        C222119a A003;
        if (this instanceof C168508j0) {
            A01(this, 38);
        } else if (this instanceof C168548j4) {
            C168548j4 r2 = (C168548j4) this;
            AN6.A00(r2.A05, 0);
            r2.A0A.A03("plm_details_view_tag");
            A01(r2, 37);
        } else if (this instanceof C168538j3) {
            C168538j3 r22 = (C168538j3) this;
            r22.A0A.A03("view_product_tag");
            A01(r22, 36);
        } else if (this instanceof C168528j2) {
            C168528j2 r23 = (C168528j2) this;
            if (r23.A08.A09 == null && (A003 = C20004A2u.A00(r23.A0B, "catalog_collections_view_tag")) != null) {
                A003.A07("datasource_catalog");
            }
            A01(r23, 35);
        } else if (this instanceof C168518j1) {
            C168518j1 r24 = (C168518j1) this;
            if (r24.A04.A06 == null && (A002 = C20004A2u.A00(r24.A09, "catalog_collections_view_tag")) != null) {
                A002.A07("datasource_collections");
            }
            A01(r24, 34);
        } else if (this instanceof C168488iy) {
            A01(this, 33);
        } else {
            A01(this, 32);
        }
    }

    public final void A06() {
        this.A03.A01(A04(), this.A00);
    }
}
