package X;

/* renamed from: X.7CJ  reason: invalid class name */
public final class AnonymousClass7CJ implements AnonymousClass191 {
    public final AnonymousClass1KB A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;

    public /* synthetic */ void Blf() {
    }

    private final boolean A00() {
        C18100vl r2 = C108945cZ.A0o(this.A05).A01;
        if (C17880vN.A0C(r2).contains("pref_avatar_notice_consent_accepted")) {
            boolean A1W = C17880vN.A1W(C17880vN.A0C(r2), "pref_avatar_notice_consent_accepted");
            if (Boolean.valueOf(A1W) == null || A1W || ((C136796uQ) this.A0B.get()).A00() == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0148, code lost:
        if (r2 > 0) goto L_0x0170;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Blg() {
        /*
            r8 = this;
            X.00H r6 = r8.A05
            X.1Ul r2 = X.C108945cZ.A0o(r6)
            X.1Ul r0 = X.C108945cZ.A0o(r6)
            X.0vl r1 = r0.A01
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r1)
            java.lang.String r3 = "pref_avatar_notice_consent_accepted"
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0026
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r1)
            boolean r0 = X.C17880vN.A1W(r0, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L_0x003c
        L_0x0026:
            X.00H r0 = r8.A02
            boolean r0 = X.C108975cc.A1I(r0)
            if (r0 == 0) goto L_0x003c
            X.1Ul r0 = X.C108945cZ.A0o(r6)
            r1 = 1
            X.0vl r0 = r0.A01
            android.content.SharedPreferences$Editor r0 = X.C17890vO.A0A(r0)
            X.C17880vN.A1F(r0, r3, r1)
        L_0x003c:
            X.00H r0 = r8.A06
            java.lang.Object r1 = r0.get()
            X.1O1 r1 = (X.AnonymousClass1O1) r1
            java.util.HashSet r0 = r1.A00
            java.lang.String r1 = X.AnonymousClass1O1.A00(r1, r0)
            java.lang.String r0 = "db_backup"
            r4 = 0
            boolean r0 = X.AnonymousClass1YF.A0Y(r1, r0, r4)
            if (r0 != 0) goto L_0x008d
            X.C18070vi.A0b(r2)
            X.0vl r5 = r2.A01
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r5)
            java.lang.String r2 = "pref_avatar_user_local_deletion"
            boolean r0 = r0.getBoolean(r2, r4)
            if (r0 == 0) goto L_0x008e
            X.00H r0 = r8.A0B
            java.lang.Object r1 = r0.get()
            X.6uQ r1 = (X.C136796uQ) r1
            X.00H r0 = r8.A09
            java.lang.Object r3 = r0.get()
            X.C18070vi.A0b(r3)
            X.C18070vi.A0b(r1)
            r1.A01()
            android.content.SharedPreferences$Editor r0 = X.C17890vO.A0A(r5)
            X.C17880vN.A1B(r0, r2)
            X.1KB r2 = r8.A00
            r1 = 3
            X.AkO r0 = new X.AkO
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0J(r0)
        L_0x008d:
            return
        L_0x008e:
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r5)
            java.lang.String r7 = "pref_avatar_user_remote_deletion"
            boolean r0 = r0.getBoolean(r7, r4)
            if (r0 != 0) goto L_0x017f
            boolean r0 = r8.A00()
            if (r0 != 0) goto L_0x017f
            X.0ve r2 = r8.A01
            r1 = 1396(0x574, float:1.956E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x008d
            r2 = 0
            com.whatsapp.avatar.init.AvatarAsyncInit$checkHasAvatarUser$1 r0 = new com.whatsapp.avatar.init.AvatarAsyncInit$checkHasAvatarUser$1
            r0.<init>(r8, r2)
            X.1OR r1 = X.AnonymousClass1OR.A00
            java.lang.Object r0 = X.AnonymousClass4GT.A00(r1, r0)
            if (r0 == 0) goto L_0x008d
            com.whatsapp.avatar.init.AvatarAsyncInit$checkUserHasAvatar$1 r0 = new com.whatsapp.avatar.init.AvatarAsyncInit$checkUserHasAvatar$1
            r0.<init>(r8, r2)
            java.lang.Object r0 = X.AnonymousClass4GT.A00(r1, r0)
            if (r0 == 0) goto L_0x008d
            X.00H r0 = r8.A08     // Catch:{ all -> 0x00d6 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x00d6 }
            X.1SB r1 = (X.AnonymousClass1SB) r1     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = "meta-avatar"
            X.725 r3 = r1.A07(r0)     // Catch:{ all -> 0x00d6 }
            goto L_0x00eb
        L_0x00d6:
            r5 = move-exception
            X.00H r0 = r8.A03
            X.6ue r3 = X.C108945cZ.A0p(r0)
            java.lang.String r2 = "AvatarAsyncInit/hasStickerPackInstalled/Failed to verify avatar sticker pack installed"
            java.lang.String r1 = r5.getMessage()
            r0 = 1
            r3.A02(r0, r2, r1)
            X.1IU r3 = X.C108945cZ.A1J(r5)
        L_0x00eb:
            java.lang.Throwable r0 = X.C30671eK.A00(r3)
            if (r0 != 0) goto L_0x008d
            boolean r0 = r3 instanceof X.AnonymousClass1IU
            if (r0 == 0) goto L_0x00f6
            r3 = 0
        L_0x00f6:
            X.725 r3 = (X.AnonymousClass725) r3
            if (r3 == 0) goto L_0x0170
            java.util.List r0 = r3.A07
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0170
            java.util.List r1 = r3.A07
            X.C18070vi.A0X(r1)
            boolean r0 = r1 instanceof java.util.Collection
            r2 = 0
            if (r0 == 0) goto L_0x012b
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x012b
        L_0x0112:
            X.00H r0 = r8.A07
            java.lang.Object r5 = r0.get()
            X.1Ns r5 = (X.C25311Ns) r5
            java.util.List r1 = r3.A07
            X.C18070vi.A0X(r1)
            boolean r0 = r1 instanceof java.util.Collection
            r3 = 0
            if (r0 == 0) goto L_0x014b
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x014b
            return
        L_0x012b:
            java.util.Iterator r1 = r1.iterator()
        L_0x012f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0148
            X.77d r0 = X.C108945cZ.A0x(r1)
            java.lang.String r0 = r0.A0B
            if (r0 == 0) goto L_0x0143
            int r0 = r0.length()
            if (r0 != 0) goto L_0x012f
        L_0x0143:
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x012f
            goto L_0x0169
        L_0x0148:
            if (r2 <= 0) goto L_0x0112
            goto L_0x0170
        L_0x014b:
            java.util.Iterator r2 = r1.iterator()
        L_0x014f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x016e
            X.77d r0 = X.C108945cZ.A0x(r2)
            java.lang.String r1 = r0.A0F
            if (r1 == 0) goto L_0x014f
            java.lang.String r0 = r0.A0E
            java.io.File r0 = r5.A03(r1, r0)
            if (r0 != 0) goto L_0x014f
            int r3 = r3 + 1
            if (r3 >= 0) goto L_0x014f
        L_0x0169:
            X.AnonymousClass1ZU.A0A()
            r0 = 0
            throw r0
        L_0x016e:
            if (r3 <= 0) goto L_0x008d
        L_0x0170:
            X.00H r0 = r8.A0A
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.2hr r2 = (X.C56682hr) r2
            java.lang.String r1 = "retry"
            r0 = 6
            r2.A00(r0, r1, r4)
            return
        L_0x017f:
            X.00H r0 = r8.A09
            java.lang.Object r5 = X.C18070vi.A0E(r0)
            X.2L4 r5 = (X.AnonymousClass2L4) r5
            X.00H r0 = r8.A0B
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.6uQ r3 = (X.C136796uQ) r3
            X.00H r0 = r8.A03
            X.6ue r2 = X.C108945cZ.A0p(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "consent accepted: "
            r1.append(r0)
            boolean r0 = r8.A00()
            r0 = r0 ^ 1
            r1.append(r0)
            java.lang.String r0 = " | remote deletion flag: "
            r1.append(r0)
            android.content.SharedPreferences r0 = X.C108995ce.A0F(r6)
            boolean r0 = r0.getBoolean(r7, r4)
            java.lang.String r1 = X.AnonymousClass3MY.A0r(r1, r0)
            java.lang.String r0 = "execute_remote_deletion"
            r2.A02(r4, r0, r1)
            X.7LA r1 = new X.7LA
            r1.<init>(r8, r5, r3)
            java.lang.String r0 = "event"
            r3.A03(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7CJ.Blg():void");
    }

    public AnonymousClass7CJ(AnonymousClass1KB r1, C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        C18070vi.A0w(r2, r1, r3, r4, r5);
        C18070vi.A0x(r6, r7, r8, r9, r10);
        C72473Md.A1L(r11, r12);
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r3;
        this.A04 = r4;
        this.A08 = r5;
        this.A09 = r6;
        this.A06 = r7;
        this.A02 = r8;
        this.A05 = r9;
        this.A0B = r10;
        this.A07 = r11;
        this.A0A = r12;
    }

    public void Ba9() {
    }
}
