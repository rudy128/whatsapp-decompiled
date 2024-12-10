package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Set;

/* renamed from: X.2nP  reason: invalid class name and case insensitive filesystem */
public abstract class C60112nP {
    public final AnonymousClass1OZ A00;
    public final String A01;
    public final C60452o3 A02;
    public final AnonymousClass10I A03;

    public final C41731wy A01(Set set) {
        C18070vi.A0d(set, 0);
        C41731wy r3 = new C41731wy();
        this.A03.CGF(new AnonymousClass3C5(this, set, r3, 10));
        return r3;
    }

    public final C41731wy A00() {
        int i;
        C41731wy r2 = new C41731wy();
        AnonymousClass1OZ r10 = this.A00;
        String A0B = r10.A0B();
        C29621ca r5 = new C29621ca(new C29621ca("list", C60452o3.A00(this.A01, A02())), "privacy", (AnonymousClass1MD[]) null);
        AnonymousClass1MD[] r4 = new AnonymousClass1MD[4];
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B, r4, 0);
        C17880vN.A1I(C173438v4.A00, "to", r4, 1);
        C17890vO.A12("xmlns", "privacy", r4);
        C29621ca A012 = C29621ca.A01(r5, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r4);
        if (this instanceof C48232Lr) {
            i = 442;
        } else if (this instanceof C48222Lq) {
            i = 291;
        } else {
            if (!(this instanceof C48212Lp)) {
                if (this instanceof C48202Lo) {
                    i = 288;
                } else if (this instanceof C48192Ln) {
                    i = 227;
                }
            }
            i = 293;
        }
        r10.A0J(new AnonymousClass37G(r2, this, 5), A012, A0B, i, 32000);
        return r2;
    }

    public String A02() {
        if (this instanceof C48232Lr) {
            return C17880vN.A0r(C17890vO.A0B(((C48232Lr) this).A01), "sticker_allow_list_hash");
        }
        if (this instanceof C48222Lq) {
            return C17880vN.A0r(C17890vO.A0B(((C48222Lq) this).A01), "profile_photo_block_list_hash");
        }
        if (this instanceof C48212Lp) {
            return C17880vN.A0r(C17890vO.A0B(((C48212Lp) this).A01), "about_pix_list_hash");
        }
        if (this instanceof C48202Lo) {
            return C17880vN.A0r(C17890vO.A0B(((C48202Lo) this).A01), "last_seen_block_list_hash");
        }
        if (this instanceof C48192Ln) {
            return C17880vN.A0r(C17890vO.A0B(((C48192Ln) this).A01), "group_add_blacklist_hash");
        }
        return C17880vN.A0r(C17890vO.A0B(((C48182Lm) this).A01), "about_block_list_hash");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c1, code lost:
        if (r2 != null) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashSet A03() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C48232Lr
            if (r0 == 0) goto L_0x0022
            r0 = r4
            X.2Lr r0 = (X.C48232Lr) r0
            X.1M9 r0 = r0.A00
            X.1M3 r0 = r0.A06
            X.1at r3 = X.C24801Ls.A00(r0)
            java.lang.String r2 = "SELECT jid FROM wa_stickers_allow_list"
            java.lang.String r1 = "CONTACT_STICKERS_ALLOW_LIST"
            r0 = 0
            android.database.Cursor r2 = X.C24861Ly.A03(r3, r2, r1, r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "contact-mgr-db/unable to get stickers allow list"
            java.util.HashSet r0 = X.AnonymousClass1M3.A04(r2, r0)     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x00c6
            goto L_0x00c3
        L_0x0022:
            boolean r0 = r4 instanceof X.C48222Lq
            if (r0 == 0) goto L_0x0044
            r0 = r4
            X.2Lq r0 = (X.C48222Lq) r0
            X.1M9 r0 = r0.A00
            X.1M3 r0 = r0.A06
            X.1at r3 = X.C24801Ls.A00(r0)
            java.lang.String r2 = "SELECT jid FROM wa_profile_photo_block_list"
            java.lang.String r1 = "CONTACT_PROFILE_PHOTO_BLOCK_LIST"
            r0 = 0
            android.database.Cursor r2 = X.C24861Ly.A03(r3, r2, r1, r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "contact-mgr-db/unable to get profile photo block list"
            java.util.HashSet r0 = X.AnonymousClass1M3.A04(r2, r0)     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x00c6
            goto L_0x00c3
        L_0x0044:
            boolean r0 = r4 instanceof X.C48212Lp
            if (r0 == 0) goto L_0x0065
            r0 = r4
            X.2Lp r0 = (X.C48212Lp) r0
            X.1M9 r0 = r0.A00
            X.1M3 r0 = r0.A06
            X.1at r3 = X.C24801Ls.A00(r0)
            java.lang.String r2 = "SELECT jid FROM wa_pix_block_list"
            java.lang.String r1 = "CONTACT_ABOUT_BLOCK_LIST"
            r0 = 0
            android.database.Cursor r2 = X.C24861Ly.A03(r3, r2, r1, r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "contact-mgr-db/unable to get pix block list"
            java.util.HashSet r0 = X.AnonymousClass1M3.A04(r2, r0)     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x00c6
            goto L_0x00c3
        L_0x0065:
            boolean r0 = r4 instanceof X.C48202Lo
            if (r0 == 0) goto L_0x0086
            r0 = r4
            X.2Lo r0 = (X.C48202Lo) r0
            X.1M9 r0 = r0.A00
            X.1M3 r0 = r0.A06
            X.1at r3 = X.C24801Ls.A00(r0)
            java.lang.String r2 = "SELECT jid FROM wa_last_seen_block_list"
            java.lang.String r1 = "CONTACT_LAST_SEEN_BLOCK_LIST"
            r0 = 0
            android.database.Cursor r2 = X.C24861Ly.A03(r3, r2, r1, r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "contact-mgr-db/unable to get last seen block list"
            java.util.HashSet r0 = X.AnonymousClass1M3.A04(r2, r0)     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x00c6
            goto L_0x00c3
        L_0x0086:
            boolean r0 = r4 instanceof X.C48192Ln
            if (r0 == 0) goto L_0x00a7
            r0 = r4
            X.2Ln r0 = (X.C48192Ln) r0
            X.1M9 r0 = r0.A00
            X.1M3 r0 = r0.A06
            X.1at r3 = X.C24801Ls.A00(r0)
            java.lang.String r2 = "SELECT jid FROM wa_group_add_black_list"
            java.lang.String r1 = "CONTACT_GROUP_ADD_BLACK_LIST"
            r0 = 0
            android.database.Cursor r2 = X.C24861Ly.A03(r3, r2, r1, r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "contact-mgr-db/unable to get group add block list"
            java.util.HashSet r0 = X.AnonymousClass1M3.A04(r2, r0)     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x00c6
            goto L_0x00c3
        L_0x00a7:
            r0 = r4
            X.2Lm r0 = (X.C48182Lm) r0
            X.1M9 r0 = r0.A00
            X.1M3 r0 = r0.A06
            X.1at r3 = X.C24801Ls.A00(r0)
            java.lang.String r2 = "SELECT jid FROM wa_about_block_list"
            java.lang.String r1 = "CONTACT_ABOUT_BLOCK_LIST"
            r0 = 0
            android.database.Cursor r2 = X.C24861Ly.A03(r3, r2, r1, r0)     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "contact-mgr-db/unable to get about block list"
            java.util.HashSet r0 = X.AnonymousClass1M3.A04(r2, r0)     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x00c6
        L_0x00c3:
            r2.close()     // Catch:{ all -> 0x00d6 }
        L_0x00c6:
            r3.close()
            return r0
        L_0x00ca:
            r1 = move-exception
            if (r2 == 0) goto L_0x00d5
            r2.close()     // Catch:{ all -> 0x00d1 }
            goto L_0x00d5
        L_0x00d1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00d6 }
        L_0x00d5:
            throw r1     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00db }
            throw r1
        L_0x00db:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60112nP.A03():java.util.HashSet");
    }

    public void A04(String str, Set set, boolean z) {
        if (this instanceof C48232Lr) {
            C48232Lr r3 = (C48232Lr) this;
            C18070vi.A0d(set, 0);
            AnonymousClass1M3 r2 = r3.A00.A06;
            AnonymousClass1Ez r1 = new AnonymousClass1Ez(true);
            r1.A04();
            AnonymousClass1M3.A06(r2, "wa_stickers_allow_list", set);
            r1.A01();
            C19830z4 r32 = r3.A01;
            C17880vN.A1E(C17890vO.A0B(r32).edit(), "sticker_allow_list_hash", str);
            if (z) {
                C17880vN.A1C(C19830z4.A00(r32), "privacy_stickers", 6);
            }
        } else if (this instanceof C48222Lq) {
            C48222Lq r33 = (C48222Lq) this;
            C18070vi.A0d(set, 0);
            AnonymousClass1M3 r22 = r33.A00.A06;
            AnonymousClass1Ez r12 = new AnonymousClass1Ez(true);
            r12.A04();
            AnonymousClass1M3.A06(r22, "wa_profile_photo_block_list", set);
            r12.A01();
            C19830z4 r34 = r33.A01;
            C17880vN.A1E(C17890vO.A0B(r34).edit(), "profile_photo_block_list_hash", str);
            if (z) {
                C17880vN.A1C(C19830z4.A00(r34), "privacy_profile_photo", 3);
            }
        } else if (this instanceof C48212Lp) {
            C48212Lp r35 = (C48212Lp) this;
            C18070vi.A0d(set, 0);
            AnonymousClass1M3 r23 = r35.A00.A06;
            AnonymousClass1Ez r13 = new AnonymousClass1Ez(true);
            r13.A04();
            AnonymousClass1M3.A06(r23, "wa_pix_block_list", set);
            r13.A01();
            C19830z4 r36 = r35.A01;
            C17880vN.A1E(C17890vO.A0B(r36).edit(), "about_pix_list_hash", str);
            if (z) {
                C17880vN.A1C(C19830z4.A00(r36), "privacy_pix", 3);
            }
        } else if (this instanceof C48202Lo) {
            C48202Lo r37 = (C48202Lo) this;
            C18070vi.A0d(set, 0);
            AnonymousClass1M3 r24 = r37.A00.A06;
            AnonymousClass1Ez r14 = new AnonymousClass1Ez(true);
            r14.A04();
            AnonymousClass1M3.A06(r24, "wa_last_seen_block_list", set);
            r14.A01();
            C19830z4 r38 = r37.A01;
            C17880vN.A1E(C17890vO.A0B(r38).edit(), "last_seen_block_list_hash", str);
            if (z) {
                C17880vN.A1C(C19830z4.A00(r38), "privacy_last_seen", 3);
            }
        } else if (this instanceof C48192Ln) {
            C48192Ln r39 = (C48192Ln) this;
            C18070vi.A0d(set, 0);
            AnonymousClass1M3 r25 = r39.A00.A06;
            AnonymousClass1Ez r15 = new AnonymousClass1Ez(true);
            r15.A04();
            AnonymousClass1M3.A06(r25, "wa_group_add_black_list", set);
            r15.A01();
            C19830z4 r310 = r39.A01;
            C17880vN.A1E(C17890vO.A0B(r310).edit(), "group_add_blacklist_hash", str);
            if (z) {
                C17880vN.A1C(C19830z4.A00(r310), "privacy_groupadd", 3);
            }
        } else {
            C48182Lm r311 = (C48182Lm) this;
            C18070vi.A0d(set, 0);
            AnonymousClass1M3 r26 = r311.A00.A06;
            AnonymousClass1Ez r16 = new AnonymousClass1Ez(true);
            r16.A04();
            AnonymousClass1M3.A06(r26, "wa_about_block_list", set);
            r16.A01();
            C19830z4 r312 = r311.A01;
            C17880vN.A1E(C17890vO.A0B(r312).edit(), "about_block_list_hash", str);
            if (z) {
                C17880vN.A1C(C19830z4.A00(r312), "privacy_status", 3);
            }
        }
    }

    public C60112nP(AnonymousClass1OZ r1, C60452o3 r2, AnonymousClass10I r3, String str) {
        this.A01 = str;
        this.A03 = r3;
        this.A00 = r1;
        this.A02 = r2;
    }
}
