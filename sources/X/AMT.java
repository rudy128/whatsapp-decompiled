package X;

public abstract class AMT implements B72 {
    public final AnonymousClass1NV A00;
    public final AnonymousClass10I A01;

    public AMT(AnonymousClass1NV r2, AnonymousClass10I r3) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: X.8g2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.9F7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: X.8g3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.9F4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.9F4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: X.8g2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.9F7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: X.8g2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: X.8g2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.9F7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: X.9F7} */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0102, code lost:
        if (r1 == null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0104, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0105, code lost:
        X.C17960vV.A0D(r2);
        r4 = r13.A0A;
        X.C18070vi.A0d(r1, 1);
        r5 = X.C17890vO.A0T(r4.A00);
        r3 = new X.AnonymousClass9F4(new X.C178719Ee(), r5, r1);
        X.C17900vP.A0f("encb/EncryptedBackupProtocolHelper/finishLoginOnSuccess id=", r5, X.AnonymousClass000.A10());
        r2 = (X.C29621ca) r3.A00;
        r1 = 1;
        r13 = r13;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0135, code lost:
        if (r1 != null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0137, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0138, code lost:
        X.C17960vV.A0D(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013b, code lost:
        if (r12 == null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013d, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013e, code lost:
        X.C17960vV.A0D(r2);
        r14 = r13.A0A;
        X.C18070vi.A0j(r1, r12);
        r2 = X.C17890vO.A0T(r14.A00);
        r15 = new X.AnonymousClass9F5(new X.C178719Ee(), r2, r1);
        X.C17900vP.A0f("encb/EncryptedBackupProtocolHelper/sendBeginLoginIq id=", r2, X.AnonymousClass000.A10());
        X.AnonymousClass1NU.A02(r14, new X.C20978AcW(r12, r13, r14, r15, 0), r15.BVP(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x016d, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r18 = this;
            r13 = r18
            boolean r0 = r13 instanceof X.AnonymousClass8g5
            if (r0 == 0) goto L_0x0035
            X.8g5 r13 = (X.AnonymousClass8g5) r13
            X.1NU r3 = r13.A01
            X.00H r0 = r3.A00
            java.lang.String r7 = X.C17890vO.A0T(r0)
            r9 = 1
            X.9Ee r5 = new X.9Ee
            r5.<init>()
            r6 = 0
            r8 = 4
            X.9F4 r4 = new X.9F4
            r4.<init>((X.C178719Ee) r5, (X.AnonymousClass9EY) r6, (java.lang.String) r7, (int) r8, (long) r9)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendUpdateMigrationIq id="
            X.C17900vP.A0f(r0, r7, r1)
            java.lang.Object r2 = r4.A00
            X.1ca r2 = (X.C29621ca) r2
            r1 = 5
            X.Acl r0 = new X.Acl
            r0.<init>(r4, r13, r3, r1)
            X.AnonymousClass1NU.A02(r3, r0, r2, r7)
            return
        L_0x0035:
            boolean r0 = r13 instanceof X.AnonymousClass8g4
            if (r0 == 0) goto L_0x00ec
            X.8g4 r13 = (X.AnonymousClass8g4) r13
            java.lang.Object r3 = r13.A0B
            monitor-enter(r3)
            int r2 = r13.A00     // Catch:{ all -> 0x00e9 }
            monitor-exit(r3)     // Catch:{ all -> 0x00e9 }
            if (r2 == 0) goto L_0x0081
            r1 = 0
            r0 = 1
            if (r2 == r0) goto L_0x00a5
            byte[] r10 = r13.A04
            if (r10 == 0) goto L_0x004c
            r1 = 1
        L_0x004c:
            X.C17960vV.A0D(r1)
            X.1NU r2 = r13.A0A
            r12 = 1
            X.C18070vi.A0d(r10, r0)
            X.00H r0 = r2.A00
            java.lang.String r8 = X.C17890vO.A0T(r0)
            X.9Ee r5 = new X.9Ee
            r5.<init>()
            r11 = 16
            r6 = 0
            X.9F4 r4 = new X.9F4
            r9 = r6
            r7 = r6
            r4.<init>((X.C178719Ee) r5, (X.AnonymousClass9EW) r6, (X.C178729Ef) r7, (java.lang.String) r8, (X.AnonymousClass1Y1) r9, (byte[]) r10, (int) r11, (int) r12)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendFinishRegIq id="
            X.C17900vP.A0f(r0, r8, r1)
            java.lang.Object r3 = r4.A00
            X.1ca r3 = (X.C29621ca) r3
            r1 = 2
        L_0x0078:
            X.Acl r0 = new X.Acl
            r0.<init>(r4, r13, r2, r1)
            X.AnonymousClass1NU.A02(r2, r0, r3, r8)
            return
        L_0x0081:
            X.1NU r2 = r13.A0A
            X.00H r0 = r2.A00
            java.lang.String r8 = X.C17890vO.A0T(r0)
            X.9Ee r5 = new X.9Ee
            r5.<init>()
            r6 = 0
            r9 = 3
            X.9F4 r4 = new X.9F4
            r7 = r6
            r4.<init>((X.C178719Ee) r5, (X.AnonymousClass9EX) r6, (java.lang.Long) r7, (java.lang.String) r8, (int) r9)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendInitRegIq id="
            X.C17900vP.A0f(r0, r8, r1)
            java.lang.Object r3 = r4.A00
            X.1ca r3 = (X.C29621ca) r3
            r1 = 4
            goto L_0x0078
        L_0x00a5:
            monitor-enter(r3)
            byte[] r15 = r13.A06     // Catch:{ all -> 0x00e6 }
            byte[] r12 = r13.A03     // Catch:{ all -> 0x00e6 }
            monitor-exit(r3)     // Catch:{ all -> 0x00e6 }
            if (r15 != 0) goto L_0x00ae
            r0 = 0
        L_0x00ae:
            X.C17960vV.A0D(r0)
            if (r12 == 0) goto L_0x00b4
            r1 = 1
        L_0x00b4:
            X.C17960vV.A0D(r1)
            X.1NU r14 = r13.A0A
            X.C18070vi.A0j(r15, r12)
            X.00H r0 = r14.A00
            java.lang.String r3 = X.C17890vO.A0T(r0)
            X.9Ee r0 = new X.9Ee
            r0.<init>()
            X.9F7 r2 = new X.9F7
            r2.<init>((X.C178719Ee) r0, (java.lang.String) r3, (byte[]) r15)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendBeginRegIq id="
            X.C17900vP.A0f(r0, r3, r1)
            java.lang.Object r0 = r2.A00
            X.1ca r0 = (X.C29621ca) r0
            r17 = 1
            X.Aca r11 = new X.Aca
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.AnonymousClass1NU.A02(r14, r11, r0, r3)
            return
        L_0x00e6:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00e6 }
            throw r0
        L_0x00e9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00e9 }
            throw r0
        L_0x00ec:
            boolean r0 = r13 instanceof X.C167358g3
            if (r0 == 0) goto L_0x0174
            X.8g3 r13 = (X.C167358g3) r13
            java.lang.Object r3 = r13.A0B
            monitor-enter(r3)
            int r1 = r13.A00     // Catch:{ all -> 0x0171 }
            monitor-exit(r3)     // Catch:{ all -> 0x0171 }
            if (r1 == 0) goto L_0x0197
            r2 = 0
            r0 = 1
            monitor-enter(r3)
            if (r1 == r0) goto L_0x0130
            byte[] r1 = r13.A07     // Catch:{ all -> 0x012d }
            monitor-exit(r3)     // Catch:{ all -> 0x012d }
            if (r1 == 0) goto L_0x0105
            r2 = 1
        L_0x0105:
            X.C17960vV.A0D(r2)
            X.1NU r4 = r13.A0A
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r4.A00
            java.lang.String r5 = X.C17890vO.A0T(r0)
            X.9Ee r0 = new X.9Ee
            r0.<init>()
            X.9F4 r3 = new X.9F4
            r3.<init>(r0, r5, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishLoginOnSuccess id="
            X.C17900vP.A0f(r0, r5, r1)
            java.lang.Object r2 = r3.A00
            X.1ca r2 = (X.C29621ca) r2
            r1 = 1
            goto L_0x01b7
        L_0x012d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x012d }
            throw r0
        L_0x0130:
            byte[] r1 = r13.A06     // Catch:{ all -> 0x016e }
            byte[] r12 = r13.A05     // Catch:{ all -> 0x016e }
            monitor-exit(r3)     // Catch:{ all -> 0x016e }
            if (r1 != 0) goto L_0x0138
            r0 = 0
        L_0x0138:
            X.C17960vV.A0D(r0)
            if (r12 == 0) goto L_0x013e
            r2 = 1
        L_0x013e:
            X.C17960vV.A0D(r2)
            X.1NU r14 = r13.A0A
            X.C18070vi.A0j(r1, r12)
            X.00H r0 = r14.A00
            java.lang.String r2 = X.C17890vO.A0T(r0)
            X.9Ee r0 = new X.9Ee
            r0.<init>()
            X.9F5 r15 = new X.9F5
            r15.<init>((X.C178719Ee) r0, (java.lang.String) r2, (byte[]) r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendBeginLoginIq id="
            X.C17900vP.A0f(r0, r2, r1)
            X.1ca r0 = r15.BVP()
            r16 = 0
            X.AcW r11 = new X.AcW
            r11.<init>(r12, r13, r14, r15, r16)
            X.AnonymousClass1NU.A02(r14, r11, r0, r2)
            return
        L_0x016e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x016e }
            throw r0
        L_0x0171:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0171 }
            throw r0
        L_0x0174:
            X.8g2 r13 = (X.AnonymousClass8g2) r13
            X.1NU r4 = r13.A01
            X.00H r0 = r4.A00
            java.lang.String r5 = X.C17890vO.A0T(r0)
            X.9Ee r0 = new X.9Ee
            r0.<init>()
            X.9F7 r3 = new X.9F7
            r3.<init>((X.C178719Ee) r0, (java.lang.String) r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendDeleteAccountIq id="
            X.C17900vP.A0f(r0, r5, r1)
            java.lang.Object r2 = r3.A00
            X.1ca r2 = (X.C29621ca) r2
            r1 = 0
            goto L_0x01b7
        L_0x0197:
            X.1NU r4 = r13.A0A
            X.00H r0 = r4.A00
            java.lang.String r5 = X.C17890vO.A0T(r0)
            X.9Ee r0 = new X.9Ee
            r0.<init>()
            X.9F4 r3 = new X.9F4
            r3.<init>(r0, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendInitLoginIq id="
            X.C17900vP.A0f(r0, r5, r1)
            java.lang.Object r2 = r3.A00
            X.1ca r2 = (X.C29621ca) r2
            r1 = 3
        L_0x01b7:
            X.Acl r0 = new X.Acl
            r0.<init>(r3, r13, r4, r1)
            X.AnonymousClass1NU.A02(r4, r0, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AMT.A00():void");
    }

    public void Bt2(String str, int i, int i2) {
        B72 b72;
        AnonymousClass10I r4;
        long longValue;
        C21457AkO akO;
        if (this instanceof AnonymousClass8g2) {
            AnonymousClass8g2 r5 = (AnonymousClass8g2) this;
            Long A012 = r5.A00.A01();
            if ((i == 500 || i == 3) && A012 != null) {
                r4 = r5.A01;
                longValue = A012.longValue();
                akO = new C21457AkO((Object) r5, 16);
            } else {
                r5.A00.Bt2(str, i, i2);
                return;
            }
        } else {
            C18070vi.A0d(str, 0);
            Long A013 = this.A00.A01();
            if ((i == 500 || i == 3) && A013 != null) {
                r4 = this.A01;
                longValue = A013.longValue();
                akO = new C21457AkO((Object) this, 17);
            } else {
                if (this instanceof AnonymousClass8g5) {
                    b72 = ((AnonymousClass8g5) this).A00;
                } else if (this instanceof AnonymousClass8g4) {
                    AnonymousClass8g4 r3 = (AnonymousClass8g4) this;
                    synchronized (r3.A0B) {
                        b72 = r3.A01;
                        if (b72 == null) {
                            b72 = new AMS(r3, 1);
                            r3.A01 = b72;
                        }
                    }
                } else if (this instanceof C167358g3) {
                    C167358g3 r32 = (C167358g3) this;
                    synchronized (r32.A0B) {
                        B72 b722 = r32.A02;
                        if (b722 == null) {
                            b722 = new AMS(r32, 0);
                            r32.A02 = b722;
                        }
                    }
                } else {
                    b72 = ((AnonymousClass8g2) this).A00;
                }
                b72.Bt2(str, i, i2);
                return;
            }
        }
        r4.CGv(akO, longValue);
    }
}
